package xsna;

import android.os.Parcelable;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentType;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.LinksParsingMetaData;
import com.vk.newsfeed.posting.impl.domain.model.LoadingState;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.impl.domain.model.NearbyPlaces;
import com.vk.newsfeed.posting.impl.domain.model.PermissionType;
import com.vk.newsfeed.posting.impl.domain.model.PhotoTag;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingHints;
import com.vk.newsfeed.posting.impl.domain.model.PostingNavigationState;
import com.vk.newsfeed.posting.impl.domain.model.PostingScreenContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.PostingStep;
import com.vk.newsfeed.posting.impl.domain.model.PostingStepScreen;
import com.vk.newsfeed.posting.impl.domain.model.PublicationState;
import com.vk.newsfeed.posting.impl.domain.model.VkMediaEntry$VkPhoto;
import com.vk.newsfeed.posting.impl.domain.model.VkMediaEntry$VkVideo;
import com.vk.newsfeed.posting.impl.domain.model.WaitingActionTrigger;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingArticleDto;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingLinkDto;
import com.vk.newsfeed.posting.impl.domain.model.e;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageIcon;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageText;
import com.vk.newsfeed.posting.impl.domain.model.music.MusicAttachDto;
import com.vk.newsfeed.posting.impl.domain.model.settings.SettingsPriority;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.domain.rules.PostingRule;
import com.vk.newsfeed.posting.impl.domain.rules.RuleAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.newsfeed.posting.impl.presentation.model.FileDto;
import com.vk.newsfeed.posting.impl.presentation.model.GroupWallPostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoDto;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoTagsData;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPlaceDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.UserWallPostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.VideoDto;
import com.vk.newsfeed.posting.mentions.PostingMentionLoadingState;
import com.vk.newsfeed.posting.mentions.PostingMentionState;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.fmc0;
import xsna.wic0;

/* compiled from: PostingReducer.kt */
/* loaded from: classes4.dex */
public final class qkc0 extends dm50<upc0, com.vk.newsfeed.posting.impl.domain.model.e, PostingState> {
    public final vpc0 d;
    public final vrg0 e;
    public final wmc0 f;
    public final wj50<fmc0> g;
    public final ibc0 h;
    public final cpc0 i;
    public final Object j;
    public final alc0 k;
    public final rmf0 l;
    public final nmf0 m;
    public final pmf0 n;
    public final d420 o;
    public final tko0 p;
    public final pol q;
    public final tmf0 r;
    public final qmf0 s;
    public final zq70 t;
    public final w5a0 u;
    public final h8c0 v;
    public final w460 w;
    public final t74 x;
    public final ju10 y;

    /* compiled from: PostingReducer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PermissionType.values().length];
            try {
                iArr[PermissionType.GalleryView.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionType.Camera.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PermissionType.Location.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LoadingState.values().length];
            try {
                iArr2[LoadingState.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[LoadingState.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public qkc0(PostingState.Loading loading, vpc0 vpc0Var, vrg0 vrg0Var, wmc0 wmc0Var, f4z f4zVar, com.vk.newsfeed.posting.impl.domain.model.upload.a aVar, ibc0 ibc0Var, evl0 evl0Var, cpc0 cpc0Var) {
        super(loading);
        this.d = vpc0Var;
        this.e = vrg0Var;
        this.f = wmc0Var;
        this.g = f4zVar;
        this.h = ibc0Var;
        this.i = cpc0Var;
        this.j = msy.a(LazyThreadSafetyMode.NONE, new zq3(29));
        this.k = new alc0(evl0Var);
        this.l = new rmf0(vpc0Var, f4zVar);
        this.m = new nmf0();
        this.n = new pmf0(f4zVar);
        this.o = new d420();
        this.p = new tko0();
        this.q = new pol();
        this.r = new tmf0(new b990(this, 6));
        this.s = new qmf0();
        this.t = new zq70();
        this.u = new w5a0();
        this.v = new h8c0();
        this.w = new w460();
        this.x = new t74();
        this.y = new ju10(f4zVar, aVar, ibc0Var);
    }

    public static PostingState k(PostingState postingState, PermissionType permissionType, boolean z) {
        int i = a.$EnumSwitchMapping$0[permissionType.ordinal()];
        if (i == 1) {
            if (postingState instanceof PostingState.Editing) {
                PostingState.Editing editing = (PostingState.Editing) postingState;
                return PostingState.Editing.a(editing, null, null, null, MediaPickerState.a(editing.f, null, null, 0, null, null, null, null, Boolean.valueOf(z), null, 383), null, null, null, null, null, null, false, null, false, null, null, null, null, null, 1048559);
            }
            if (!(postingState instanceof PostingState.Loading)) {
                throw new NoWhenBranchMatchedException();
            }
            PostingState.Loading loading = (PostingState.Loading) postingState;
            return PostingState.Loading.a(loading, null, MediaPickerState.a(loading.d, null, null, 0, null, null, null, null, Boolean.valueOf(z), null, 383), null, null, null, null, false, null, null, null, null, null, 32763);
        }
        if (i != 2) {
            if (i == 3) {
                return postingState;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (postingState instanceof PostingState.Editing) {
            PostingState.Editing editing2 = (PostingState.Editing) postingState;
            return PostingState.Editing.a(editing2, null, null, null, MediaPickerState.a(editing2.f, null, null, 0, null, null, null, null, null, Boolean.valueOf(z), 255), null, null, null, null, null, null, false, null, false, null, null, null, null, null, 1048559);
        }
        if (!(postingState instanceof PostingState.Loading)) {
            throw new NoWhenBranchMatchedException();
        }
        PostingState.Loading loading2 = (PostingState.Loading) postingState;
        return PostingState.Loading.a(loading2, null, MediaPickerState.a(loading2.d, null, null, 0, null, null, null, null, null, Boolean.valueOf(z), 255), null, null, null, null, false, null, null, null, null, null, 32763);
    }

    public static PostingState l(PostingState postingState) {
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(editing.i, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 267386879), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
    }

    public static PostingState m(PostingState postingState) {
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(editing.i, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 260046847), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
    }

    public static PostingState n(PostingState postingState, sic0 sic0Var) {
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        ActionButton actionButton = sic0Var.b;
        PostingState.Editing editing = (PostingState.Editing) postingState;
        return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(editing.i, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, actionButton, actionButton == null ? ((PostingState.Editing) postingState).i.t : null, null, null, null, false, null, 267649023), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
    }

    public static PostingState o(PostingState postingState, tic0 tic0Var) {
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(editing.i, null, null, null, null, null, null, null, null, tic0Var.b, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 268434943), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
    }

    public static PostingState p(PostingState postingState, e.j jVar) {
        if (jVar instanceof e.j.a) {
            if (postingState instanceof PostingState.Loading) {
                PostingState.Loading loading = (PostingState.Loading) postingState;
                e.j.a aVar = (e.j.a) jVar;
                return PostingState.Loading.a(loading, null, null, null, null, null, null, false, j5g.u0(Collections.singletonList(new Pair(aVar.b, aVar.c)), loading.l), null, null, null, null, 31743);
            }
            if (!(postingState instanceof PostingState.Editing)) {
                throw new NoWhenBranchMatchedException();
            }
            PostingState.Editing editing = (PostingState.Editing) postingState;
            e.j.a aVar2 = (e.j.a) jVar;
            return PostingState.Editing.a(editing, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, j5g.u0(Collections.singletonList(new Pair(aVar2.b, aVar2.c)), editing.s), null, null, 917503);
        }
        if (!(jVar instanceof e.j.b)) {
            throw new NoWhenBranchMatchedException();
        }
        if (postingState instanceof PostingState.Loading) {
            PostingState.Loading loading2 = (PostingState.Loading) postingState;
            List<Pair<PostingAction, WaitingActionTrigger>> list = loading2.l;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Pair) obj).j() != ((e.j.b) jVar).b) {
                    arrayList.add(obj);
                }
            }
            return PostingState.Loading.a(loading2, null, null, null, null, null, null, false, arrayList, null, null, null, null, 31743);
        }
        if (!(postingState instanceof PostingState.Editing)) {
            throw new NoWhenBranchMatchedException();
        }
        PostingState.Editing editing2 = (PostingState.Editing) postingState;
        List<Pair<PostingAction, WaitingActionTrigger>> list2 = editing2.s;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (((Pair) obj2).j() != ((e.j.b) jVar).b) {
                arrayList2.add(obj2);
            }
        }
        return PostingState.Editing.a(editing2, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, arrayList2, null, null, 917503);
    }

    public static PostingState.Loading q(PostingState postingState, PostingContext postingContext, boolean z) {
        return new PostingState.Loading(postingState.V4(), postingContext, MediaPickerState.k, postingState.x(), postingState.R9(), postingState.a9(), postingState.J7(), LoadingState.LOADING, z, postingState.fb(), null, postingState.D7(), postingState.p9(), postingState.q1(), null, 17408, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.dm50
    public final PostingState c(PostingState postingState, com.vk.newsfeed.posting.impl.domain.model.e eVar) {
        UUID uuid;
        PostingState.Editing editing;
        UploadDto a2;
        PostingState.Editing editing2;
        UploadDto a3;
        PostingState.Editing editing3;
        UploadDto a4;
        PostingState.Editing editing4;
        UploadDto a5;
        PostingState.Editing editing5;
        UploadDto a6;
        PostEditableData postEditableData;
        Map<Integer, List<PhotoTag>> map;
        AdditionalSettingsConfiguration additionalSettingsConfiguration;
        boolean z;
        PostEditableData a7;
        PostingState postingState2 = postingState;
        com.vk.newsfeed.posting.impl.domain.model.e eVar2 = eVar;
        if (eVar2 instanceof tjc0) {
            postingState2 = ((tjc0) eVar2).b;
        } else if (eVar2 instanceof ojc0) {
            postingState2 = q(postingState2, ((ojc0) eVar2).b, true);
        } else if (eVar2 instanceof sjc0) {
            postingState2 = q(postingState2, ((sjc0) eVar2).b, false);
        } else if (eVar2 instanceof njc0) {
            postingState2 = q(postingState2, ((njc0) eVar2).b, true);
        } else if (eVar2 instanceof mjc0) {
            if (postingState2 instanceof PostingState.Loading) {
                postingState2 = PostingState.Loading.a((PostingState.Loading) postingState2, null, null, null, null, null, LoadingState.ERROR, false, null, null, null, null, null, 32639);
            }
        } else if (eVar2 instanceof rjc0) {
            rjc0 rjc0Var = (rjc0) eVar2;
            postingState2 = new PostingState.Editing(postingState2.V4(), rjc0Var.b, postingState2.x(), postingState2.R9(), postingState2.z6(), rjc0Var.d, rjc0Var.c, rjc0Var.e, rjc0Var.f, new PostingMentionState(PostingMentionLoadingState.EMPTY, EmptyList.b), ActionsAvailabilityState.j, PublicationState.None, false, PostingHints.l, postingState2.fb(), postingState2.D7(), postingState2.p9(), postingState2.I8(), postingState2.q1(), null, 524288, null);
        } else {
            VKApiExecutionException vKApiExecutionException = null;
            if (eVar2 instanceof qjc0) {
                qjc0 qjc0Var = (qjc0) eVar2;
                PostEditableData postEditableData2 = qjc0Var.e;
                AdditionalSettingsConfiguration additionalSettingsConfiguration2 = postEditableData2.q;
                boolean z2 = postingState2.x().u;
                if (postingState2.x().e.i() == SettingsPriority.Network.i()) {
                    additionalSettingsConfiguration = additionalSettingsConfiguration2;
                    z = z2;
                    a7 = PostEditableData.a(postEditableData2, null, null, null, null, null, null, n2c0.d(postEditableData2, postingState2.x()), null, null, null, null, null, null, null, additionalSettingsConfiguration2 != null ? AdditionalSettingsConfiguration.a(additionalSettingsConfiguration2, false, false, z2, null, false, 27) : null, null, n2c0.c(postEditableData2, postingState2.x(), false), null, null, null, postingState2.x().p, false, null, 259751807);
                } else {
                    additionalSettingsConfiguration = additionalSettingsConfiguration2;
                    z = z2;
                    a7 = PostEditableData.a(postEditableData2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, additionalSettingsConfiguration != null ? AdditionalSettingsConfiguration.a(additionalSettingsConfiguration, false, false, z, null, false, 27) : null, null, null, null, null, null, postingState2.x().p, false, null, 260014079);
                }
                PostingScreenContext V4 = postingState2.V4();
                PostingContext a8 = PostingContext.a(postingState2.getContext(), qjc0Var.b, false, qjc0Var.c, qjc0Var.d, null, 32742);
                PostEditableData a9 = PostEditableData.a(postEditableData2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, additionalSettingsConfiguration != null ? AdditionalSettingsConfiguration.a(additionalSettingsConfiguration, false, false, z, null, false, 27) : null, null, null, null, null, null, null, false, null, 268402687);
                PostEditingReason J7 = postingState2.J7();
                PostingNavigationState a92 = postingState2.a9();
                PostingSettings x = postingState2.x();
                NearbyPlaces R9 = postingState2.R9();
                MediaPickerState z6 = postingState2.z6();
                PostingMentionLoadingState postingMentionLoadingState = PostingMentionLoadingState.EMPTY;
                EmptyList emptyList = EmptyList.b;
                postingState2 = new PostingState.Editing(V4, a8, x, R9, z6, a92, J7, a7, a9, new PostingMentionState(postingMentionLoadingState, emptyList), ActionsAvailabilityState.j, PublicationState.None, false, PostingHints.l, postingState2.fb(), emptyList, emptyList, null, postingState2.q1(), null, 655360, null);
            } else if (eVar2 instanceof pjc0) {
                pjc0 pjc0Var = (pjc0) eVar2;
                PostEditableData postEditableData3 = pjc0Var.b;
                List<PostingAttachment> list = postEditableData3.p;
                if (postingState2.x().e == SettingsPriority.Network) {
                    PostEditableData postEditableData4 = pjc0Var.b;
                    UserId userId = postingState2.getContext().b.b;
                    PostingSettings x2 = postingState2.x();
                    PrivacyPostType d = n2c0.d(postEditableData4, postingState2.x());
                    List<PrivacyPostType> b = qfd0.b(userId, x2, d, this.i);
                    if (!b.contains(d) && (d = (PrivacyPostType) j5g.a0(b)) == null) {
                        d = PrivacyPostType.AllUsers.b;
                    }
                    postEditableData = PostEditableData.a(postEditableData4, null, null, null, null, null, null, d, null, null, null, null, null, null, null, null, null, n2c0.c(postEditableData4, postingState2.x(), false), null, null, null, null, false, null, 268173183);
                } else {
                    postEditableData = postEditableData3;
                }
                PostingScreenContext V42 = postingState2.V4();
                PostingContext context = postingState2.getContext();
                PostEditingReason.EditLocalDraft editLocalDraft = new PostEditingReason.EditLocalDraft(postingState2.J7().Ja());
                PostingNavigationState a93 = postingState2.a9();
                PostingSettings x3 = postingState2.x();
                NearbyPlaces R92 = postingState2.R9();
                MediaPickerState z62 = postingState2.z6();
                if (!list.isEmpty()) {
                    ListBuilder e = e43.e();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        Attachment nb = ((PostingAttachment) it.next()).nb();
                        if (nb instanceof cvz) {
                            e.add(new MediaPickerSelectedItem.LocalMedia(((cvz) nb).M3()));
                        } else if (nb instanceof PhotoAttachment) {
                            MediaPickerSelectedItem.VkPhoto vkPhoto = new MediaPickerSelectedItem.VkPhoto(new VkMediaEntry$VkPhoto(((PhotoAttachment) nb).l));
                            Photo photo = vkPhoto.b.b;
                            PhotoTagsData photoTagsData = postEditableData3.r;
                            photo.r = (photoTagsData == null || (map = photoTagsData.b) == null) ? false : !map.isEmpty();
                            e.add(vkPhoto);
                        } else if (nb instanceof VideoAttachment) {
                            VideoAttachment videoAttachment = (VideoAttachment) nb;
                            if (videoAttachment.k.o0() > 0) {
                                e.add(new MediaPickerSelectedItem.VkVideo(new VkMediaEntry$VkVideo(videoAttachment.k)));
                            }
                        }
                    }
                    ListBuilder g = e.g();
                    if (!g.isEmpty()) {
                        z62 = MediaPickerState.a(z62, null, null, 0, g, null, null, null, null, null, 503);
                    }
                }
                postingState2 = new PostingState.Editing(V42, context, x3, R92, z62, a93, editLocalDraft, postEditableData, postEditableData, new PostingMentionState(PostingMentionLoadingState.EMPTY, EmptyList.b), ActionsAvailabilityState.j, PublicationState.None, false, PostingHints.l, postingState2.fb(), postingState2.D7(), postingState2.p9(), null, postingState2.q1(), null, 655360, null);
            } else if (eVar2 instanceof e.c) {
                e.c cVar = (e.c) eVar2;
                this.n.a.b(fmc0.d.a);
                if (cVar instanceof e.c.C1427c) {
                    PostingStep postingStep = ((e.c.C1427c) cVar).b;
                    if (postingState2 instanceof PostingState.Editing) {
                        PostingState.Editing editing6 = (PostingState.Editing) postingState2;
                        postingState2 = PostingState.Editing.a(editing6, null, null, null, null, new PostingNavigationState(j5g.v0(postingStep, editing6.g.b)), null, null, null, null, null, false, PostingHints.a(editing6.o, null, null, postingStep.b instanceof PostingStepScreen.AttachmentPickers, 895), false, null, null, null, null, null, 1040351);
                    }
                } else if (cVar instanceof e.c.C1428e) {
                    if (postingState2 instanceof PostingState.Editing) {
                        PostingState.Editing editing7 = (PostingState.Editing) postingState2;
                        PostingNavigationState postingNavigationState = editing7.g;
                        List<PostingStep> list2 = postingNavigationState.b;
                        List<PostingStep> list3 = postingNavigationState.b;
                        if (list2.size() > 1) {
                            if (list3.size() > 1) {
                                ArrayList arrayList = new ArrayList(list3);
                                arrayList.remove(e43.h(arrayList));
                                postingNavigationState = new PostingNavigationState(arrayList);
                            }
                            postingState2 = PostingState.Editing.a(editing7, null, null, null, null, postingNavigationState, null, null, null, null, null, false, PostingHints.a(editing7.o, null, null, false, 831), false, null, null, null, null, null, 1040351);
                        }
                    }
                } else if (cVar instanceof e.c.d) {
                    e.c.d dVar = (e.c.d) cVar;
                    if (postingState2 instanceof PostingState.Editing) {
                        PostingState.Editing editing8 = (PostingState.Editing) postingState2;
                        PostingNavigationState postingNavigationState2 = editing8.g;
                        PostingStep postingStep2 = dVar.b;
                        List<PostingStep> list4 = postingNavigationState2.b;
                        ArrayList arrayList2 = new ArrayList(list4);
                        int h = e43.h(list4);
                        PostingStep postingStep3 = (PostingStep) j5g.i0(list4);
                        ArrayList arrayList3 = new ArrayList(postingStep2.e);
                        arrayList3.add(postingStep2);
                        s3q0 s3q0Var = s3q0.a;
                        arrayList2.set(h, PostingStep.a(postingStep3, arrayList3));
                        postingState2 = PostingState.Editing.a(editing8, null, null, null, null, new PostingNavigationState(arrayList2), null, null, null, null, null, false, null, false, null, null, null, null, null, 1048543);
                    }
                } else if (!(cVar instanceof e.c.b)) {
                    if (!(cVar instanceof e.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (postingState2 instanceof PostingState.Editing) {
                        PostingState.Editing editing9 = (PostingState.Editing) postingState2;
                        postingState2 = PostingState.Editing.a(editing9, null, null, null, null, edi.l(editing9.g), null, null, null, null, null, false, null, false, null, null, null, null, null, 1048543);
                    } else {
                        if (!(postingState2 instanceof PostingState.Loading)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        PostingState.Loading loading = (PostingState.Loading) postingState2;
                        postingState2 = PostingState.Loading.a(loading, null, null, null, null, edi.l(loading.g), null, false, null, null, null, null, null, 32735);
                    }
                } else if (postingState2 instanceof PostingState.Editing) {
                    PostingState.Editing editing10 = (PostingState.Editing) postingState2;
                    List<PostingStep> list5 = editing10.g.b;
                    ArrayList arrayList4 = new ArrayList(list5);
                    PostingStep postingStep4 = (PostingStep) j5g.i0(arrayList4);
                    int h2 = e43.h(list5);
                    ArrayList arrayList5 = new ArrayList(postingStep4.e);
                    g5g.J(arrayList5);
                    s3q0 s3q0Var2 = s3q0.a;
                    arrayList4.set(h2, PostingStep.a(postingStep4, arrayList5));
                    postingState2 = PostingState.Editing.a(editing10, null, null, null, null, new PostingNavigationState(arrayList4), null, null, null, null, null, false, null, false, null, null, null, null, null, 1048543);
                }
            } else if (eVar2 instanceof wic0) {
                wic0 wic0Var = (wic0) eVar2;
                this.p.getClass();
                if (postingState2 instanceof PostingState.Editing) {
                    if (wic0Var instanceof wic0.a) {
                        PostingState.Editing editing11 = (PostingState.Editing) postingState2;
                        postingState2 = PostingState.Editing.a(editing11, null, null, null, null, null, PostEditableData.a(editing11.i, ((wic0.a) wic0Var).b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 268435453), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
                    } else if (wic0Var instanceof wic0.b) {
                        PostingState.Editing editing12 = (PostingState.Editing) postingState2;
                        PostEditableData postEditableData5 = editing12.i;
                        wic0.b bVar = (wic0.b) wic0Var;
                        ArrayList arrayList6 = bVar.b;
                        LinksParsingMetaData linksParsingMetaData = postEditableData5.w;
                        PostingArticleDto postingArticleDto = linksParsingMetaData.e;
                        PostingLinkDto postingLinkDto = linksParsingMetaData.d;
                        postingState2 = PostingState.Editing.a(editing12, null, null, null, null, null, PostEditableData.a(postEditableData5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LinksParsingMetaData.a(postEditableData5.w, bVar.b, null, ((postingLinkDto != null ? postingLinkDto.c : null) == null || arrayList6.contains(postingLinkDto.c)) ? postingLinkDto : null, ((postingArticleDto != null ? postingArticleDto.c : null) == null || arrayList6.contains(postingArticleDto.c)) ? postingArticleDto : null, 2), null, null, false, null, 266338303), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
                    } else {
                        if (!(wic0Var instanceof wic0.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        PostingState.Editing editing13 = (PostingState.Editing) postingState2;
                        PostEditableData postEditableData6 = editing13.i;
                        List<String> list6 = ((wic0.c) wic0Var).b;
                        LinksParsingMetaData linksParsingMetaData2 = postEditableData6.w;
                        PostingArticleDto postingArticleDto2 = linksParsingMetaData2.e;
                        PostingLinkDto postingLinkDto2 = linksParsingMetaData2.d;
                        PostingArticleDto postingArticleDto3 = ((postingArticleDto2 != null ? postingArticleDto2.c : null) == null || !list6.contains(postingArticleDto2.c)) ? postingArticleDto2 : null;
                        PostingLinkDto postingLinkDto3 = ((postingLinkDto2 != null ? postingLinkDto2.c : null) == null || !list6.contains(postingLinkDto2.c)) ? postingLinkDto2 : null;
                        LinksParsingMetaData linksParsingMetaData3 = postEditableData6.w;
                        List<String> list7 = linksParsingMetaData3.b;
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj : list7) {
                            if (!list6.contains((String) obj)) {
                                arrayList7.add(obj);
                            }
                        }
                        postingState2 = PostingState.Editing.a(editing13, null, null, null, null, null, PostEditableData.a(postEditableData6, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, LinksParsingMetaData.a(linksParsingMetaData3, arrayList7, null, postingLinkDto3, postingArticleDto3, 2), null, null, false, null, 266338303), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
                    }
                }
                this.v.getClass();
                postingState2 = h8c0.a(postingState2);
            } else if (eVar2 instanceof e.a) {
                postingState2 = i(postingState2, (e.a) eVar2);
            } else if (eVar2 instanceof e.h) {
                e.h hVar = (e.h) eVar2;
                rmf0 rmf0Var = this.l;
                rmf0Var.getClass();
                if (hVar instanceof e.h.C1430e) {
                    e.h.C1430e c1430e = (e.h.C1430e) hVar;
                    if ((postingState2 instanceof PostingState.Editing) && ((a6 = rmf0.a((editing5 = (PostingState.Editing) postingState2), c1430e.b)) != null || (a6 = rmf0.a(editing5, c1430e.c)) != null)) {
                        postingState2 = rmf0Var.b(editing5, a6, c1430e);
                    }
                } else if (hVar instanceof e.h.d) {
                    e.h.d dVar2 = (e.h.d) hVar;
                    if ((postingState2 instanceof PostingState.Editing) && (a5 = rmf0.a((editing4 = (PostingState.Editing) postingState2), dVar2.b)) != null) {
                        postingState2 = rmf0Var.b(editing4, a5, dVar2);
                    }
                } else if (hVar instanceof e.h.b) {
                    e.h.b bVar2 = (e.h.b) hVar;
                    if ((postingState2 instanceof PostingState.Editing) && (a4 = rmf0.a((editing3 = (PostingState.Editing) postingState2), bVar2.b)) != null) {
                        if (a4 instanceof FileDto) {
                            Parcelable parcelable = bVar2.c;
                            DocumentAttachment documentAttachment = parcelable instanceof DocumentAttachment ? (DocumentAttachment) parcelable : null;
                            FileDto a10 = documentAttachment != null ? r8r.a(documentAttachment) : null;
                            if (a10 == null) {
                                a10 = (FileDto) a4;
                            }
                            postingState2 = PostingState.Editing.a(editing3, null, null, null, null, null, PostEditableData.a(editing3.i, null, null, null, null, null, null, null, null, null, null, FileDto.a(a10, null, rmf0.c(a10.I4(), bVar2), 63), null, null, null, null, null, null, null, null, null, null, false, null, 268433407), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
                        } else if (a4 instanceof PhotoDto) {
                            postingState2 = rmf0Var.b(editing3, a4, bVar2);
                        } else if (a4 instanceof VideoDto) {
                            postingState2 = rmf0Var.b(editing3, a4, bVar2);
                        }
                    }
                } else if (hVar instanceof e.h.c) {
                    e.h.c cVar2 = (e.h.c) hVar;
                    if ((postingState2 instanceof PostingState.Editing) && (a3 = rmf0.a((editing2 = (PostingState.Editing) postingState2), cVar2.b)) != null) {
                        if (a3 instanceof VideoDto) {
                            Throwable th = cVar2.c;
                            VKApiExecutionException vKApiExecutionException2 = th instanceof VKApiExecutionException ? (VKApiExecutionException) th : null;
                            if (vKApiExecutionException2 == null) {
                                Throwable cause = th != null ? th.getCause() : null;
                                if (cause instanceof VKApiExecutionException) {
                                    vKApiExecutionException = (VKApiExecutionException) cause;
                                }
                            } else {
                                vKApiExecutionException = vKApiExecutionException2;
                            }
                            if (vKApiExecutionException != null && vKApiExecutionException.s() == 7) {
                                rmf0Var.a.b(new fmc0.p(new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_error_outline_28, R.attr.vk_ui_icon_negative), new PostingUserMessageText.ResText(R.string.uploading_error_upload_video_permission_denied), null, 4, null)));
                            }
                        }
                        postingState2 = rmf0Var.b(editing2, a3, cVar2);
                    }
                } else {
                    if (!(hVar instanceof e.h.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    e.h.a aVar = (e.h.a) hVar;
                    if ((postingState2 instanceof PostingState.Editing) && (a2 = rmf0.a((editing = (PostingState.Editing) postingState2), aVar.b)) != null) {
                        postingState2 = rmf0Var.b(editing, a2, aVar);
                    }
                }
            } else {
                boolean z3 = eVar2 instanceof xic0;
                alc0 alc0Var = this.k;
                if (z3) {
                    xic0 xic0Var = (xic0) eVar2;
                    alc0Var.getClass();
                    boolean z4 = xic0Var.c;
                    if ((postingState2 instanceof PostingState.Editing) && ((uuid = xic0Var.d) == null || ((PostingState.Editing) postingState2).b.c.equals(uuid))) {
                        PostingState.Editing editing14 = (PostingState.Editing) postingState2;
                        PostEditableData a11 = PostEditableData.a(editing14.i, null, null, null, null, null, null, null, null, null, null, null, null, null, null, xic0Var.b, null, null, null, null, null, null, false, null, 268402687);
                        PostingSettings postingSettings = editing14.d;
                        UserWallPostingSettings userWallPostingSettings = postingSettings.g;
                        UserWallPostingSettings userWallPostingSettings2 = userWallPostingSettings != null ? new UserWallPostingSettings(userWallPostingSettings.b, z4) : null;
                        GroupWallPostingSettings groupWallPostingSettings = postingSettings.h;
                        GroupWallPostingSettings a12 = groupWallPostingSettings != null ? GroupWallPostingSettings.a(groupWallPostingSettings, null, !z4, 15) : null;
                        if (userWallPostingSettings2 != null) {
                            postingSettings = PostingSettings.a(editing14.d, null, userWallPostingSettings2, null, null, 2097119);
                        } else if (a12 != null) {
                            postingSettings = PostingSettings.a(editing14.d, null, null, a12, null, 2097087);
                        }
                        postingState2 = PostingState.Editing.a(editing14, null, postingSettings, null, null, null, a11, null, null, null, null, false, null, false, null, null, null, null, null, 1048443);
                    }
                } else if (eVar2 instanceof e.b) {
                    postingState2 = this.y.a(postingState2, (e.b) eVar2);
                } else if (eVar2 instanceof e.C1429e) {
                    postingState2 = k(postingState2, ((e.C1429e) eVar2).b, true);
                } else {
                    boolean z5 = eVar2 instanceof fic0;
                    t74 t74Var = this.x;
                    if (z5) {
                        t74Var.getClass();
                        postingState2 = t74.a(postingState2, (fic0) eVar2);
                    } else if (eVar2 instanceof uic0) {
                        uic0 uic0Var = (uic0) eVar2;
                        if (postingState2 instanceof PostingState.Editing) {
                            PostingState.Editing editing15 = (PostingState.Editing) postingState2;
                            postingState2 = PostingState.Editing.a(editing15, null, null, null, null, null, PostEditableData.a(editing15.i, null, null, null, null, null, null, null, null, null, null, null, null, uic0Var.b, null, null, null, null, null, null, null, null, false, null, 268427263), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
                        }
                    } else if (eVar2 instanceof cjc0) {
                        alc0Var.getClass();
                        postingState2 = alc0.e(postingState2, (cjc0) eVar2);
                    } else if (eVar2 instanceof yic0) {
                        alc0Var.getClass();
                        postingState2 = alc0.c(postingState2, (yic0) eVar2);
                    } else if (eVar2 instanceof bjc0) {
                        alc0Var.getClass();
                        if (postingState2 instanceof PostingState.Editing) {
                            PostingState.Editing editing16 = (PostingState.Editing) postingState2;
                            postingState2 = PostingState.Editing.a(editing16, null, null, null, null, null, null, null, null, null, null, false, PostingHints.a(editing16.o, null, null, false, ApiInvocationException.ErrorCodes.IDS_BLOCKED), false, null, null, null, null, null, 1040383);
                        }
                    } else if (eVar2 instanceof zic0) {
                        alc0Var.getClass();
                        postingState2 = alc0.d(postingState2, (zic0) eVar2);
                    } else {
                        boolean z7 = eVar2 instanceof gic0;
                        nmf0 nmf0Var = this.m;
                        if (z7) {
                            nmf0Var.getClass();
                            postingState2 = nmf0.b(postingState2, (gic0) eVar2);
                        } else if (eVar2 instanceof oic0) {
                            nmf0Var.getClass();
                            postingState2 = nmf0.a(postingState2);
                        } else if (eVar2 instanceof pic0) {
                            postingState2 = m(postingState2);
                        } else if (eVar2 instanceof tic0) {
                            postingState2 = o(postingState2, (tic0) eVar2);
                        } else if (eVar2 instanceof hic0) {
                            this.u.getClass();
                            postingState2 = w5a0.a(postingState2, (hic0) eVar2);
                        } else if (eVar2 instanceof lic0) {
                            t74Var.getClass();
                            postingState2 = t74.b(postingState2, (lic0) eVar2);
                        } else {
                            boolean z8 = eVar2 instanceof vjc0;
                            d420 d420Var = this.o;
                            if (z8) {
                                d420Var.getClass();
                                postingState2 = d420.a(postingState2);
                            } else if (eVar2 instanceof wjc0) {
                                d420Var.getClass();
                                postingState2 = d420.c(postingState2);
                            } else if (eVar2 instanceof xjc0) {
                                xjc0 xjc0Var = (xjc0) eVar2;
                                boolean z9 = xjc0Var.c;
                                d420Var.getClass();
                                postingState2 = d420.d(postingState2, xjc0Var, z9);
                            } else if (eVar2 instanceof ujc0) {
                                d420Var.getClass();
                                postingState2 = d420.b(postingState2);
                            } else if (eVar2 instanceof ajc0) {
                                alc0Var.getClass();
                                postingState2 = alc0.q(postingState2, (ajc0) eVar2);
                            } else if (eVar2 instanceof qic0) {
                                alc0Var.getClass();
                                postingState2 = alc0.k(postingState2, (qic0) eVar2);
                            } else if (eVar2 instanceof ric0) {
                                alc0Var.getClass();
                                postingState2 = alc0.l(postingState2, (ric0) eVar2);
                            } else if (eVar2 instanceof eic0) {
                                alc0Var.getClass();
                                postingState2 = alc0.b(postingState2, (eic0) eVar2);
                            } else if (eVar2 instanceof e.i) {
                                postingState2 = r((e.i) eVar2, postingState2);
                            } else if (eVar2 instanceof e.g) {
                                this.s.getClass();
                                postingState2 = qmf0.a(postingState2, (e.g) eVar2);
                            } else if (eVar2 instanceof sic0) {
                                postingState2 = n(postingState2, (sic0) eVar2);
                            } else if (eVar2 instanceof nic0) {
                                postingState2 = l(postingState2);
                            } else if (eVar2 instanceof e.d) {
                                this.w.getClass();
                                postingState2 = w460.a(postingState2, (e.d) eVar2);
                            } else if (eVar2 instanceof ijc0) {
                                alc0Var.getClass();
                                postingState2 = alc0.j(postingState2);
                            } else if (eVar2 instanceof fjc0) {
                                alc0Var.getClass();
                                postingState2 = alc0.m(postingState2);
                            } else if (eVar2 instanceof gjc0) {
                                alc0Var.getClass();
                                postingState2 = alc0.n(postingState2);
                            } else if (eVar2 instanceof jjc0) {
                                alc0Var.getClass();
                                postingState2 = alc0.o(postingState2);
                            } else if (eVar2 instanceof hjc0) {
                                alc0Var.getClass();
                                postingState2 = alc0.i(postingState2);
                            } else if (eVar2 instanceof djc0) {
                                String str = ((djc0) eVar2).b;
                                alc0Var.getClass();
                                postingState2 = alc0.f(postingState2, str);
                            } else if (eVar2 instanceof kjc0) {
                                alc0Var.getClass();
                                postingState2 = alc0.f(postingState2, null);
                            } else if (eVar2 instanceof ljc0) {
                                alc0Var.getClass();
                                postingState2 = alc0.p(postingState2);
                            } else if (eVar2 instanceof yjc0) {
                                alc0Var.getClass();
                                postingState2 = alc0.h(postingState2);
                            } else if (eVar2 instanceof iic0) {
                                alc0Var.getClass();
                                postingState2 = alc0.s(postingState2, (iic0) eVar2);
                            } else if (eVar2.equals(mic0.b)) {
                                alc0Var.getClass();
                                postingState2 = alc0.w(postingState2);
                            } else if (eVar2 instanceof e.f) {
                                postingState2 = this.q.c(postingState2, (e.f) eVar2);
                            } else if (eVar2 instanceof e.j) {
                                postingState2 = p(postingState2, (e.j) eVar2);
                            } else if (eVar2 instanceof jic0) {
                                postingState2 = alc0Var.t(postingState2, (jic0) eVar2);
                            } else if (eVar2 instanceof kic0) {
                                alc0Var.getClass();
                                postingState2 = alc0.v(postingState2);
                            } else if (eVar2 instanceof ejc0) {
                                alc0Var.getClass();
                                postingState2 = alc0.g(postingState2);
                            } else {
                                if (!(eVar2 instanceof vic0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                alc0Var.getClass();
                                postingState2 = alc0.u(postingState2, (vic0) eVar2);
                            }
                        }
                    }
                }
            }
        }
        return this.e.a(this.f.a(postingState2));
    }

    @Override // xsna.dm50
    public final upc0 d() {
        return new upc0(e(new vsq(23)), e(new d410(this, 23)), e(new hs00(this, 22)));
    }

    @Override // xsna.dm50
    public final void h(PostingState postingState, upc0 upc0Var) {
        PostingState postingState2 = postingState;
        upc0 upc0Var2 = upc0Var;
        if (postingState2 instanceof PostingState.Loading) {
            f(upc0Var2.a, postingState2);
            return;
        }
        if (!(postingState2 instanceof PostingState.Editing)) {
            throw new NoWhenBranchMatchedException();
        }
        PostingState.Editing editing = (PostingState.Editing) postingState2;
        PostingStepScreen postingStepScreen = edi.t(editing.g).b;
        boolean f = epx.f(postingStepScreen, PostingStepScreen.PostTextInput.b);
        VS vs = this.b;
        if (f) {
            f(((upc0) vs).b, editing);
        } else if (epx.f(postingStepScreen, PostingStepScreen.AttachmentPickers.b)) {
            f(((upc0) vs).c, editing);
        }
    }

    public final PostingState i(PostingState postingState, e.a aVar) {
        Set<Integer> set;
        Set<Integer> set2;
        Map<Integer, List<PhotoTag>> map;
        boolean z = aVar instanceof com.vk.newsfeed.posting.impl.domain.model.g;
        alc0 alc0Var = this.k;
        if (z) {
            com.vk.newsfeed.posting.impl.domain.model.g gVar = (com.vk.newsfeed.posting.impl.domain.model.g) aVar;
            alc0Var.getClass();
            return alc0.r(postingState, NearbyPlaces.a(postingState.R9(), gVar.b, gVar.c, null, null, null, 120));
        }
        if (aVar instanceof com.vk.newsfeed.posting.impl.domain.model.i) {
            alc0Var.getClass();
            return alc0.r(postingState, NearbyPlaces.a(postingState.R9(), null, 0, null, null, ((com.vk.newsfeed.posting.impl.domain.model.i) aVar).b, 63));
        }
        if (aVar instanceof com.vk.newsfeed.posting.impl.domain.model.h) {
            alc0Var.getClass();
            return alc0.r(postingState, NearbyPlaces.a(postingState.R9(), null, 0, null, ((com.vk.newsfeed.posting.impl.domain.model.h) aVar).b, null, 111));
        }
        if (aVar instanceof com.vk.newsfeed.posting.impl.domain.model.f) {
            alc0Var.getClass();
            return alc0.r(postingState, NearbyPlaces.a(postingState.R9(), null, 0, ((com.vk.newsfeed.posting.impl.domain.model.f) aVar).b, null, null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
        }
        if (aVar instanceof e.a.f) {
            e.a.f fVar = (e.a.f) aVar;
            return k(k(postingState, PermissionType.Camera, fVar.b), PermissionType.GalleryView, fVar.c);
        }
        if (aVar instanceof e.a.g) {
            e.a.g gVar2 = (e.a.g) aVar;
            alc0Var.getClass();
            if (postingState instanceof PostingState.Editing) {
                PostingState.Editing editing = (PostingState.Editing) postingState;
                PostEditableData postEditableData = editing.i;
                PhotoTagsData photoTagsData = postEditableData.r;
                LinkedHashMap linkedHashMap = (photoTagsData == null || (map = photoTagsData.b) == null) ? new LinkedHashMap() : new LinkedHashMap(map);
                linkedHashMap.putAll(gVar2.b);
                PhotoTagsData photoTagsData2 = postEditableData.r;
                return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(editing.i, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, photoTagsData2 != null ? PhotoTagsData.a(photoTagsData2, linkedHashMap, null, 2) : new PhotoTagsData(linkedHashMap, null, true, 2, null), null, null, null, null, null, false, null, 268369919), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
            }
        } else {
            boolean z2 = aVar instanceof e.a.C1421a;
            jgp jgpVar = jgp.b;
            if (z2) {
                e.a.C1421a c1421a = (e.a.C1421a) aVar;
                alc0Var.getClass();
                if (postingState instanceof PostingState.Editing) {
                    PostingState.Editing editing2 = (PostingState.Editing) postingState;
                    PostEditableData postEditableData2 = editing2.i;
                    PhotoTagsData photoTagsData3 = postEditableData2.r;
                    Set linkedHashSet = (photoTagsData3 == null || (set2 = photoTagsData3.c) == null) ? new LinkedHashSet() : j5g.R0(set2);
                    g5g.y(c1421a.b, linkedHashSet);
                    PhotoTagsData photoTagsData4 = postEditableData2.r;
                    return PostingState.Editing.a(editing2, null, null, null, null, null, PostEditableData.a(editing2.i, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, photoTagsData4 != null ? PhotoTagsData.a(photoTagsData4, null, linkedHashSet, 5) : new PhotoTagsData(jgpVar, c1421a.b, false, 4, null), null, null, null, null, null, false, null, 268369919), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
                }
            } else if (aVar instanceof e.a.h) {
                e.a.h hVar = (e.a.h) aVar;
                alc0Var.getClass();
                if (postingState instanceof PostingState.Editing) {
                    PostingState.Editing editing3 = (PostingState.Editing) postingState;
                    PostEditableData postEditableData3 = editing3.i;
                    PhotoTagsData photoTagsData5 = postEditableData3.r;
                    Set linkedHashSet2 = (photoTagsData5 == null || (set = photoTagsData5.c) == null) ? new LinkedHashSet() : j5g.R0(set);
                    g5g.F(hVar.b, linkedHashSet2);
                    PhotoTagsData photoTagsData6 = postEditableData3.r;
                    return PostingState.Editing.a(editing3, null, null, null, null, null, PostEditableData.a(editing3.i, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, photoTagsData6 != null ? PhotoTagsData.a(photoTagsData6, null, linkedHashSet2, 5) : new PhotoTagsData(jgpVar, hVar.b, false, 4, null), null, null, null, null, null, false, null, 268369919), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
                }
            } else if (aVar instanceof e.a.i) {
                PostingState.Editing editing4 = postingState instanceof PostingState.Editing ? (PostingState.Editing) postingState : null;
                if (editing4 != null) {
                    return PostingState.Editing.a(editing4, null, null, null, null, null, null, null, null, null, null, ((e.a.i) aVar).b, null, false, null, null, null, null, null, 1044479);
                }
            } else {
                if (aVar instanceof e.a.C1422e) {
                    PostingSettings postingSettings = ((e.a.C1422e) aVar).b;
                    if (postingSettings == null) {
                        postingSettings = postingState.x();
                    }
                    return j(postingState, postingSettings, true);
                }
                if (aVar instanceof e.a.j) {
                    e.a.j jVar = (e.a.j) aVar;
                    int i = a.$EnumSwitchMapping$1[jVar.b.ordinal()];
                    if (i == 1) {
                        if (postingState instanceof PostingState.Loading) {
                            PostingState.Loading loading = (PostingState.Loading) postingState;
                            return PostingState.Loading.a(loading, null, null, PostingSettings.a(loading.e, null, null, null, jVar.b, 2096639), null, null, null, false, null, null, null, null, null, 32759);
                        }
                        if (!(postingState instanceof PostingState.Editing)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        PostingState.Editing editing5 = (PostingState.Editing) postingState;
                        return PostingState.Editing.a(editing5, null, PostingSettings.a(editing5.d, null, null, null, jVar.b, 2096639), null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, 1044475);
                    }
                    if (i == 2) {
                        PostingSettings postingSettings2 = jVar.c;
                        if (postingSettings2 == null) {
                            postingSettings2 = postingState.x();
                        }
                        return j(postingState, postingSettings2, false);
                    }
                    if (postingState instanceof PostingState.Loading) {
                        PostingState.Loading loading2 = (PostingState.Loading) postingState;
                        return PostingState.Loading.a(loading2, null, null, PostingSettings.a(loading2.e, null, null, null, jVar.b, 2096639), null, null, null, false, null, null, null, null, null, 32759);
                    }
                    if (!(postingState instanceof PostingState.Editing)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PostingState.Editing editing6 = (PostingState.Editing) postingState;
                    return PostingState.Editing.a(editing6, null, PostingSettings.a(editing6.d, null, null, null, jVar.b, 2096639), null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, 1048571);
                }
                if (aVar instanceof e.a.b) {
                    e.a.b bVar = (e.a.b) aVar;
                    if (postingState instanceof PostingState.Loading) {
                        PostingState.Loading loading3 = (PostingState.Loading) postingState;
                        return PostingState.Loading.a(loading3, null, null, null, null, null, null, false, null, j5g.v0(bVar.b, loading3.m), j5g.v0(bVar.c, loading3.n), null, null, 26623);
                    }
                    if (!(postingState instanceof PostingState.Editing)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PostingState.Editing editing7 = (PostingState.Editing) postingState;
                    return PostingState.Editing.a(editing7, null, null, null, null, null, null, null, null, null, null, false, null, false, j5g.v0(bVar.b, editing7.q), j5g.v0(bVar.c, editing7.r), null, null, null, 950271);
                }
                if (aVar instanceof e.a.d) {
                    e.a.d dVar = (e.a.d) aVar;
                    alc0Var.getClass();
                    if (postingState instanceof PostingState.Editing) {
                        return PostingState.Editing.a((PostingState.Editing) postingState, null, null, null, null, null, null, null, null, null, null, false, dVar.b, false, null, null, null, null, null, 1040383);
                    }
                } else {
                    if (!(aVar instanceof e.a.k)) {
                        if (!(aVar instanceof e.a.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        e.a.c cVar = (e.a.c) aVar;
                        if (postingState instanceof PostingState.Editing) {
                            return PostingState.Editing.a((PostingState.Editing) postingState, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, cVar.b, 524287);
                        }
                        if (postingState instanceof PostingState.Loading) {
                            return PostingState.Loading.a((PostingState.Loading) postingState, null, null, null, null, null, null, false, null, null, null, null, cVar.b, 16383);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    e.a.k kVar = (e.a.k) aVar;
                    alc0Var.getClass();
                    if (postingState instanceof PostingState.Editing) {
                        return PostingState.Editing.a((PostingState.Editing) postingState, null, null, null, null, null, null, null, null, null, null, false, kVar.b, false, null, null, null, null, null, 1040383);
                    }
                }
            }
        }
        return postingState;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PostingState j(PostingState postingState, PostingSettings postingSettings, boolean z) {
        PostingState postingState2;
        boolean z2;
        boolean z3;
        boolean z4 = postingState instanceof PostingState.Editing;
        zq70 zq70Var = this.t;
        if (z4) {
            SettingsPriority settingsPriority = postingSettings.e;
            int i = settingsPriority.i();
            PostingState.Editing editing = (PostingState.Editing) postingState;
            PostingSettings postingSettings2 = editing.d;
            PostingContext postingContext = editing.c;
            PostEditableData postEditableData = editing.i;
            postingState2 = editing;
            if (i >= postingSettings2.e.i()) {
                boolean z5 = editing.h instanceof PostEditingReason.EditLocalDraft;
                int i2 = settingsPriority.i();
                SettingsPriority settingsPriority2 = SettingsPriority.Network;
                boolean z6 = i2 == settingsPriority2.i();
                PrivacyPostType d = n2c0.d(postEditableData, postingSettings);
                if (z6 && z5) {
                    List<PrivacyPostType> b = qfd0.b(postingContext.b.b, postingSettings, d, this.i);
                    if (!b.contains(d) && (d = (PrivacyPostType) j5g.a0(b)) == null) {
                        d = PrivacyPostType.AllUsers.b;
                    }
                }
                PrivacyPostType privacyPostType = d;
                ActionButton c = n2c0.c(postEditableData, postingSettings, (z || (postingContext.m != null)) ? false : true);
                if (z5) {
                    AdditionalSettingsConfiguration additionalSettingsConfiguration = postEditableData.q;
                    if (additionalSettingsConfiguration != null) {
                        z2 = additionalSettingsConfiguration.d;
                    } else {
                        z3 = true;
                        PostingSettings a2 = PostingSettings.a(postingSettings, null, null, null, settingsPriority.i() == settingsPriority2.i() ? editing.d.k : LoadingState.FINISHED, 2096639);
                        zq70Var.getClass();
                        PostingContext j = zq70.j(postingContext, postingSettings);
                        String str = postingSettings.p;
                        AdditionalSettingsConfiguration additionalSettingsConfiguration2 = postEditableData.q;
                        boolean z7 = z3;
                        PostEditableData a3 = PostEditableData.a(postEditableData, null, null, null, null, null, null, privacyPostType, null, null, null, null, null, null, null, additionalSettingsConfiguration2 == null ? AdditionalSettingsConfiguration.a(additionalSettingsConfiguration2, false, false, z3, null, false, 27) : null, null, c, null, null, null, str, false, null, 259751807);
                        PostEditableData postEditableData2 = editing.j;
                        AdditionalSettingsConfiguration additionalSettingsConfiguration3 = postEditableData2.q;
                        PostEditableData a4 = PostEditableData.a(postEditableData2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, additionalSettingsConfiguration3 != null ? AdditionalSettingsConfiguration.a(additionalSettingsConfiguration3, false, false, z7, null, false, 27) : null, null, null, null, null, null, null, false, null, 268402687);
                        boolean z8 = !editing.n && settingsPriority.i() < settingsPriority2.i();
                        EmptyList emptyList = EmptyList.b;
                        postingState2 = PostingState.Editing.a(editing, j, a2, null, null, null, a3, a4, null, null, null, z8, null, false, emptyList, emptyList, null, null, null, 945785);
                    }
                } else {
                    z2 = postingSettings.u;
                }
                z3 = z2;
                PostingSettings a22 = PostingSettings.a(postingSettings, null, null, null, settingsPriority.i() == settingsPriority2.i() ? editing.d.k : LoadingState.FINISHED, 2096639);
                zq70Var.getClass();
                PostingContext j2 = zq70.j(postingContext, postingSettings);
                String str2 = postingSettings.p;
                AdditionalSettingsConfiguration additionalSettingsConfiguration22 = postEditableData.q;
                boolean z72 = z3;
                PostEditableData a32 = PostEditableData.a(postEditableData, null, null, null, null, null, null, privacyPostType, null, null, null, null, null, null, null, additionalSettingsConfiguration22 == null ? AdditionalSettingsConfiguration.a(additionalSettingsConfiguration22, false, false, z3, null, false, 27) : null, null, c, null, null, null, str2, false, null, 259751807);
                PostEditableData postEditableData22 = editing.j;
                AdditionalSettingsConfiguration additionalSettingsConfiguration32 = postEditableData22.q;
                PostEditableData a42 = PostEditableData.a(postEditableData22, null, null, null, null, null, null, null, null, null, null, null, null, null, null, additionalSettingsConfiguration32 != null ? AdditionalSettingsConfiguration.a(additionalSettingsConfiguration32, false, false, z72, null, false, 27) : null, null, null, null, null, null, null, false, null, 268402687);
                if (editing.n) {
                }
                EmptyList emptyList2 = EmptyList.b;
                postingState2 = PostingState.Editing.a(editing, j2, a22, null, null, null, a32, a42, null, null, null, z8, null, false, emptyList2, emptyList2, null, null, null, 945785);
            }
        } else {
            if (!(postingState instanceof PostingState.Loading)) {
                throw new NoWhenBranchMatchedException();
            }
            PostingState.Loading loading = (PostingState.Loading) postingState;
            if (postingSettings.e.i() >= loading.e.e.i()) {
                PostingSettings a5 = PostingSettings.a(postingSettings, null, null, null, postingSettings.e.i() != SettingsPriority.Network.i() ? loading.e.k : LoadingState.FINISHED, 2096639);
                PostingContext postingContext2 = loading.c;
                zq70Var.getClass();
                PostingContext j3 = zq70.j(postingContext2, postingSettings);
                EmptyList emptyList3 = EmptyList.b;
                postingState2 = PostingState.Loading.a(loading, j3, null, a5, null, null, null, false, null, emptyList3, emptyList3, null, null, 26613);
            } else {
                postingState2 = loading;
            }
        }
        this.v.getClass();
        return h8c0.a(postingState2);
    }

    public final PostingState r(e.i iVar, PostingState postingState) {
        Object obj;
        MusicAttachDto musicAttachDto;
        List<nrg0> c6;
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        if (editing.i.s) {
            this.g.b(fmc0.j.n.a);
        }
        boolean z = editing.i.s;
        List<PostingRule> list = iVar.b;
        tmf0 tmf0Var = this.r;
        tmf0Var.getClass();
        if (postingState != null) {
            xmc0 xmc0Var = new xmc0(editing);
            ArrayList u0 = j5g.u0(list, editing.d.d.b);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = u0.iterator();
            while (it.hasNext()) {
                PostingRule postingRule = (PostingRule) it.next();
                if (!epx.f(postingRule.F2(xmc0Var), PostingRule.a.C1431a.b) && (c6 = postingRule.c6(xmc0Var)) != null) {
                    linkedHashSet.addAll(c6);
                }
            }
            if (!linkedHashSet.isEmpty()) {
                b990 b990Var = tmf0Var.a;
                PostEditableData postEditableData = editing.i;
                String str = tmf0.a(linkedHashSet, RuleAttachment.Text) ? "" : postEditableData.c;
                PostingLinkDto postingLinkDto = tmf0.a(linkedHashSet, RuleAttachment.Link) ? null : postEditableData.h;
                PostingArticleDto postingArticleDto = tmf0.a(linkedHashSet, RuleAttachment.Article) ? null : postEditableData.g;
                PostingPlaceDto postingPlaceDto = tmf0.a(linkedHashSet, RuleAttachment.Place) ? null : postEditableData.f;
                MusicAttachDto musicAttachDto2 = postEditableData.l;
                Iterator it2 = linkedHashSet.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (((nrg0) obj).a == RuleAttachment.Audio) {
                        break;
                    }
                }
                nrg0 nrg0Var = (nrg0) obj;
                if (nrg0Var != null) {
                    int i = nrg0Var.b;
                    if ((musicAttachDto2 instanceof MusicAttachDto.MusicTracksDto) && i > 0) {
                        List<MusicDto> list2 = ((MusicAttachDto.MusicTracksDto) musicAttachDto2).b;
                        if (list2.size() > i) {
                            list2 = list2.subList(0, i);
                        }
                        musicAttachDto = new MusicAttachDto.MusicTracksDto(list2);
                    }
                    musicAttachDto = null;
                } else {
                    if (!tmf0.a(linkedHashSet, RuleAttachment.AudioPlaylist)) {
                        musicAttachDto = musicAttachDto2;
                    }
                    musicAttachDto = null;
                }
                PostingPollDto postingPollDto = tmf0.a(linkedHashSet, RuleAttachment.Poll) ? null : postEditableData.e;
                FileDto fileDto = tmf0.a(linkedHashSet, RuleAttachment.File) ? null : postEditableData.m;
                List<PostingAttachment> list3 = postEditableData.p;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list3) {
                    PostingAttachment postingAttachment = (PostingAttachment) obj2;
                    if ((!tmf0.a(linkedHashSet, RuleAttachment.Photo) || postingAttachment.getType() != AttachmentType.PHOTO) && ((!tmf0.a(linkedHashSet, RuleAttachment.Video) || postingAttachment.getType() != AttachmentType.VIDEO) && (!tmf0.a(linkedHashSet, RuleAttachment.Gif) || !(postingAttachment instanceof FileDto.Gif)))) {
                        arrayList.add(obj2);
                    }
                }
                PostingState.Editing a2 = PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(postEditableData, str, null, postingPollDto, postingPlaceDto, postingArticleDto, postingLinkDto, null, null, null, musicAttachDto, fileDto, null, null, arrayList, null, null, tmf0.a(linkedHashSet, RuleAttachment.ActionButton) ? null : postEditableData.t, null, null, null, null, false, null, 268153733), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
                if (!editing.equals(a2) && !z) {
                    b990Var.invoke();
                }
                return a2;
            }
        }
        return postingState;
    }
}
