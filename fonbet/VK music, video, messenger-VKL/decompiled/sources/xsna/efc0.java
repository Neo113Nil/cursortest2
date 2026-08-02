package xsna;

import android.content.Context;
import android.location.Location;
import android.net.Uri;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.wall.dto.WallAttachmentsActionButtonDto;
import com.vk.api.generated.wall.dto.WallPostingSettingsActionButtonVkTicketDto;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.creation_onboarding.GroupCreationOnboardingTooltip;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.photo.Photo;
import com.vk.location.common.LocationCommon;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.Publisher;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.Signer;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.WallOwner;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.GeoPermissionStatus;
import com.vk.newsfeed.posting.impl.domain.model.LoadingState;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import com.vk.newsfeed.posting.impl.domain.model.PermissionType;
import com.vk.newsfeed.posting.impl.domain.model.PhotoTag;
import com.vk.newsfeed.posting.impl.domain.model.PhotoTagRequestParam;
import com.vk.newsfeed.posting.impl.domain.model.PlacesLoadingState;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$MediaPicker$Album$ReloadLocalAlbums;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$ShowSnackbar$CropZoom;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$ValidationOldPostData$CheckRules;
import com.vk.newsfeed.posting.impl.domain.model.PostingContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingHints;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.WaitingActionTrigger;
import com.vk.newsfeed.posting.impl.domain.model.attachment.LocalPhotoAttachment;
import com.vk.newsfeed.posting.impl.domain.model.e;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageButton;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageIcon;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageText;
import com.vk.newsfeed.posting.impl.domain.model.music.MusicAttachDto;
import com.vk.newsfeed.posting.impl.domain.model.settings.SettingsPriority;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadUpdate;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.newsfeed.posting.impl.presentation.model.FileDto;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoDto;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoTagsData;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.RestorePostingStateMeta;
import com.vk.newsfeed.posting.mentions.data.MentionRepository;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.fmc0;
import xsna.gfc0;
import xsna.iy90;
import xsna.wqu;

/* compiled from: PostingFeature.kt */
/* loaded from: classes4.dex */
public final class efc0 extends wk50<upc0, PostingState, PostingAction, com.vk.newsfeed.posting.impl.domain.model.e> {
    public final s6p0 A;
    public final xyk0 B;
    public final lol C;
    public final qvn f;
    public final qkc0 g;
    public final wj50<fmc0> h;
    public final vq10 i;
    public final k8c0 j;
    public final sbn k;
    public final qbm0 l;
    public final io.reactivex.rxjava3.internal.operators.observable.j1 m;
    public final a n;
    public final nlc0 o;
    public final ty50 p;
    public final q1t q;
    public final o2c0 r;
    public final n320 s;
    public final m6r t;
    public final st10 u;
    public final iy90 v;
    public final hdo w;
    public final ube0 x;
    public final bbq0 y;
    public final e7v z;

    /* compiled from: PostingFeature.kt */
    public static final class a extends juq<com.vk.newsfeed.posting.impl.domain.model.e, PostingAction, fmc0> {
        public final efc0 a;

        public a(efc0 efc0Var) {
            this.a = efc0Var;
        }

        public final ActionsAvailabilityState.Availability b() {
            return efc0.g0((PostingState) this.a.g.c);
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void d(PostingAction postingAction) {
            this.a.C(postingAction);
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final void e(fmc0 fmc0Var) {
            this.a.j0(fmc0Var);
        }

        @Override // xsna.juq
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void a(com.vk.newsfeed.posting.impl.domain.model.e eVar) {
            this.a.T(eVar);
        }
    }

    /* compiled from: PostingFeature.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WaitingActionTrigger.values().length];
            try {
                iArr[WaitingActionTrigger.FINISH_LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public efc0(qvn qvnVar, qkc0 qkc0Var, PostingAction.Init init, f4z f4zVar, vq10 vq10Var, cpc0 cpc0Var, Integer num, r8c0 r8c0Var, h7v h7vVar, k8c0 k8c0Var, sbn sbnVar, h3k0 h3k0Var, qbm0 qbm0Var, Lazy lazy, evl0 evl0Var) {
        super(init, qkc0Var);
        this.f = qvnVar;
        this.g = qkc0Var;
        this.h = f4zVar;
        this.i = vq10Var;
        this.j = k8c0Var;
        this.k = sbnVar;
        this.l = qbm0Var;
        this.m = vq10Var.c;
        com.vk.movika.sdk.base.asset.b bVar = new com.vk.movika.sdk.base.asset.b(qvnVar.f);
        a aVar = new a(this);
        this.n = aVar;
        this.o = new nlc0(f4zVar);
        hce0 hce0Var = new hce0(qvnVar.g, new fee0(num));
        vd7 vd7Var = new vd7(new MentionRepository());
        sp spVar = new sp(new ssk0());
        w9c0 w9c0Var = k8c0Var.a;
        this.p = new ty50(aVar, r8c0Var.a, qvnVar.i, new lme(aVar, w9c0Var, k8c0Var.b, k8c0Var.c), w9c0Var, cpc0Var);
        wgc0 wgc0Var = new wgc0(aVar);
        q1t q1tVar = new q1t();
        this.q = q1tVar;
        this.r = new o2c0(aVar, wgc0Var, r8c0Var.a, f4zVar, qvnVar, h7vVar, h3k0Var, q1tVar);
        this.s = new n320(aVar, vd7Var);
        this.t = new m6r(aVar, qvnVar.b, qvnVar.a, bVar, qvnVar.c, h7vVar, qvnVar.k, cpc0Var);
        ibc0 ibc0Var = qvnVar.i;
        this.u = new st10(aVar, ibc0Var);
        this.v = new iy90(aVar);
        hdo hdoVar = new hdo(aVar, qvnVar.e, k8c0Var.a);
        this.w = hdoVar;
        this.x = new ube0(aVar, hce0Var, qbm0Var, spVar, hdoVar, qvnVar.i);
        this.y = new bbq0(aVar, r8c0Var, ibc0Var);
        this.z = new e7v(aVar, h7vVar, lazy, evl0Var);
        this.A = new s6p0(aVar, qvnVar.h);
        this.B = new xyk0(aVar, ibc0Var);
        this.C = new lol(aVar);
    }

    public static ActionsAvailabilityState.Availability V(PostingState postingState) {
        ActionsAvailabilityState actionsAvailabilityState;
        ActionsAvailabilityState.Attachments attachments;
        ActionsAvailabilityState.AttachmentState attachmentState;
        ActionsAvailabilityState.Availability availability;
        PostingState.Editing editing = postingState instanceof PostingState.Editing ? (PostingState.Editing) postingState : null;
        return (editing == null || (actionsAvailabilityState = editing.l) == null || (attachments = actionsAvailabilityState.c) == null || (attachmentState = attachments.d) == null || (availability = attachmentState.b) == null) ? ActionsAvailabilityState.Availability.Available.b : availability;
    }

    public static ActionsAvailabilityState.Availability W(efc0 efc0Var) {
        PostingState postingState = (PostingState) efc0Var.g.c;
        efc0Var.getClass();
        return V(postingState);
    }

    public static ActionsAvailabilityState.Availability X(Uri uri, PostingState postingState) {
        PostEditableData postEditableData;
        PhotoTagsData photoTagsData;
        Object obj;
        ActionsAvailabilityState.Availability b0;
        UploadDto.UploadState uploadState;
        Uri f;
        PostingState.Editing editing = postingState instanceof PostingState.Editing ? (PostingState.Editing) postingState : null;
        ActionsAvailabilityState.Availability Y = Y(postingState);
        if (editing != null && (postEditableData = editing.i) != null && (photoTagsData = postEditableData.r) != null) {
            Iterator<T> it = ((PostingState.Editing) postingState).i.p.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Attachment nb = ((PostingAttachment) obj).nb();
                LocalPhotoAttachment localPhotoAttachment = nb instanceof LocalPhotoAttachment ? (LocalPhotoAttachment) nb : null;
                if (localPhotoAttachment != null && (f = localPhotoAttachment.y.ba().f()) != null && f.equals(uri)) {
                    break;
                }
            }
            PhotoDto photoDto = obj instanceof PhotoDto ? (PhotoDto) obj : null;
            Parcelable parcelable = (photoDto == null || (uploadState = photoDto.f) == null) ? null : uploadState.h;
            PhotoAttachment photoAttachment = parcelable instanceof PhotoAttachment ? (PhotoAttachment) parcelable : null;
            List<PhotoTag> list = photoTagsData.b.get(photoAttachment != null ? Integer.valueOf(photoAttachment.f) : null);
            if (list != null && (b0 = b0(list, Y)) != null) {
                return b0;
            }
        }
        return Y;
    }

    public static ActionsAvailabilityState.Availability Y(PostingState postingState) {
        ActionsAvailabilityState actionsAvailabilityState;
        ActionsAvailabilityState.Attachments attachments;
        ActionsAvailabilityState.AttachmentState attachmentState;
        ActionsAvailabilityState.Availability availability;
        PostingState.Editing editing = postingState instanceof PostingState.Editing ? (PostingState.Editing) postingState : null;
        return (editing == null || (actionsAvailabilityState = editing.l) == null || (attachments = actionsAvailabilityState.c) == null || (attachmentState = attachments.d) == null || (availability = attachmentState.c) == null) ? ActionsAvailabilityState.Availability.Available.b : availability;
    }

    public static ActionsAvailabilityState.Availability Z(efc0 efc0Var, Photo photo) {
        PostingState.Editing editing;
        List<PhotoTag> list;
        PostEditableData postEditableData;
        PhotoTagsData photoTagsData;
        PostingState postingState = (PostingState) efc0Var.g.c;
        PostingUserMessage.AlertDialog alertDialog = null;
        if (postingState instanceof PostingState.Editing) {
            efc0Var.getClass();
            editing = (PostingState.Editing) postingState;
        } else {
            editing = null;
        }
        efc0Var.getClass();
        ActionsAvailabilityState.Availability Y = Y(postingState);
        if (editing == null || (postEditableData = editing.i) == null || (photoTagsData = postEditableData.r) == null) {
            list = null;
        } else {
            List<PostingAttachment> list2 = ((PostingState.Editing) postingState).i.p;
            list = photoTagsData.b.get(Integer.valueOf(photo.c));
        }
        List<PhotoTag> list3 = list;
        if (list3 != null && !list3.isEmpty()) {
            ActionsAvailabilityState.Availability b0 = b0(list, Y);
            return b0 == null ? Y : b0;
        }
        if (!photo.r) {
            return Y;
        }
        PostingUserMessage.AlertDialog b2 = prg0.b(false, true);
        if (b2 != null) {
            PostingUserMessageButton postingUserMessageButton = b2.d;
            alertDialog = PostingUserMessage.AlertDialog.a(b2, postingUserMessageButton != null ? PostingUserMessageButton.a(postingUserMessageButton, null) : null);
        }
        return Y.m5(new ActionsAvailabilityState.Availability.NotAvailable(alertDialog));
    }

    public static ActionsAvailabilityState.Availability b0(List list, ActionsAvailabilityState.Availability availability) {
        if (list.isEmpty()) {
            return availability;
        }
        PostingUserMessage.AlertDialog b2 = prg0.b(false, true);
        PostingUserMessage.AlertDialog alertDialog = null;
        if (b2 != null) {
            PostingUserMessageButton postingUserMessageButton = b2.d;
            alertDialog = PostingUserMessage.AlertDialog.a(b2, postingUserMessageButton != null ? PostingUserMessageButton.a(postingUserMessageButton, new PostingAction.Editing.RemoveTagsForPhoto(((PhotoTag) j5g.Y(list)).g)) : null);
        }
        return availability.m5(new ActionsAvailabilityState.Availability.NotAvailable(alertDialog));
    }

    public static ActionsAvailabilityState.Availability e0(PostingState postingState) {
        ActionsAvailabilityState actionsAvailabilityState;
        ActionsAvailabilityState.Attachments attachments;
        ActionsAvailabilityState.AttachmentState attachmentState;
        ActionsAvailabilityState.Availability availability;
        PostingState.Editing editing = postingState instanceof PostingState.Editing ? (PostingState.Editing) postingState : null;
        return (editing == null || (actionsAvailabilityState = editing.l) == null || (attachments = actionsAvailabilityState.c) == null || (attachmentState = attachments.b) == null || (availability = attachmentState.b) == null) ? ActionsAvailabilityState.Availability.Available.b : availability;
    }

    public static ActionsAvailabilityState.Availability f0(efc0 efc0Var) {
        PostingState postingState = (PostingState) efc0Var.g.c;
        efc0Var.getClass();
        return e0(postingState);
    }

    public static ActionsAvailabilityState.Availability g0(PostingState postingState) {
        ActionsAvailabilityState actionsAvailabilityState;
        ActionsAvailabilityState.Attachments attachments;
        ActionsAvailabilityState.AttachmentState attachmentState;
        ActionsAvailabilityState.Availability availability;
        PostingState.Editing editing = postingState instanceof PostingState.Editing ? (PostingState.Editing) postingState : null;
        return (editing == null || (actionsAvailabilityState = editing.l) == null || (attachments = actionsAvailabilityState.c) == null || (attachmentState = attachments.b) == null || (availability = attachmentState.c) == null) ? ActionsAvailabilityState.Availability.Available.b : availability;
    }

    public static UploadDto.UploadState i0(UploadDto.UploadState uploadState) {
        return uploadState.d() ? UploadDto.UploadState.a(uploadState, UploadDto.UploadStep.Idle.b, 0, 0, 0, null, epx.f(uploadState.b, UploadDto.UploadStep.Uploading.b), 102) : uploadState;
    }

    public static boolean k0(efc0 efc0Var, MediaStoreEntry mediaStoreEntry) {
        PhotoDto photoDto;
        Photo photo;
        UploadDto.UploadState uploadState;
        Object obj;
        LocalMediaEntry localMediaEntry;
        PostEditableData postEditableData;
        PostingState postingState = (PostingState) efc0Var.g.c;
        PostingState.Editing editing = postingState instanceof PostingState.Editing ? (PostingState.Editing) postingState : null;
        List<PostingAttachment> list = (editing == null || (postEditableData = editing.i) == null) ? null : postEditableData.p;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof PhotoDto) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Attachment attachment = ((PhotoDto) obj).c;
                LocalPhotoAttachment localPhotoAttachment = attachment instanceof LocalPhotoAttachment ? (LocalPhotoAttachment) attachment : null;
                if (epx.f((localPhotoAttachment == null || (localMediaEntry = localPhotoAttachment.y) == null) ? null : localMediaEntry.ba(), mediaStoreEntry)) {
                    break;
                }
            }
            photoDto = (PhotoDto) obj;
        } else {
            photoDto = null;
        }
        Object obj3 = (photoDto == null || (uploadState = photoDto.f) == null) ? null : uploadState.h;
        PhotoAttachment photoAttachment = obj3 instanceof PhotoAttachment ? (PhotoAttachment) obj3 : null;
        return (photoAttachment == null || (photo = photoAttachment.l) == null || !photo.r) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v140, types: [com.vk.newsfeed.posting.impl.domain.model.PostingState] */
    /* JADX WARN: Type inference failed for: r5v55, types: [com.vk.newsfeed.posting.impl.domain.model.PostingAction[]] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object] */
    @Override // xsna.wk50
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final void N(PostingState postingState, PostingAction postingAction) {
        int i;
        com.vk.newsfeed.posting.impl.domain.model.e aVar;
        PostingAttachment postingAttachment;
        ActionButton actionButton;
        Hint p;
        Hint p2;
        WallAttachmentsActionButtonDto wallAttachmentsActionButtonDto;
        WallPostingSettingsActionButtonVkTicketDto g;
        Hint p3;
        Hint p4;
        Hint p5;
        Hint p6;
        int i2;
        io.reactivex.rxjava3.core.q<gfc0.b> qVar;
        UploadDto.UploadState I4;
        String str;
        boolean z = postingAction instanceof PostingAction.Init;
        int i3 = 18;
        int i4 = 11;
        int i5 = 19;
        int i6 = 24;
        int i7 = 14;
        e7v e7vVar = this.z;
        hdo hdoVar = this.w;
        int i8 = 1;
        if (z) {
            PostingAction.Init init = (PostingAction.Init) postingAction;
            if (init instanceof PostingAction.Init.NewPost) {
                PostingAction.Init.NewPost newPost = (PostingAction.Init.NewPost) init;
                PostEditableData postEditableData = newPost.c;
                List<PostingAttachment> list = postEditableData.p;
                WallOwner wallOwner = newPost.b;
                UserId userId = wallOwner.b;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                ArrayList arrayList = new ArrayList();
                for (PostingAttachment postingAttachment2 : list) {
                    UploadDto uploadDto = postingAttachment2 instanceof UploadDto ? (UploadDto) postingAttachment2 : null;
                    if (uploadDto == null || (I4 = uploadDto.I4()) == null || (str = I4.c) == null) {
                        qVar = null;
                    } else {
                        qVar = this.f.j.c(str);
                        linkedHashSet.add(postingAttachment2);
                    }
                    if (qVar != null) {
                        arrayList.add(qVar);
                    }
                }
                PostingAction.Init.NewPost newPost2 = new PostingAction.Init.NewPost(wallOwner, PostEditableData.a(postEditableData, null, null, null, null, null, null, null, null, null, null, null, null, null, j5g.t0(list, linkedHashSet), null, null, null, null, null, null, null, false, null, 268419071));
                PostEditableData postEditableData2 = newPost2.c;
                AdditionalSettingsConfiguration additionalSettingsConfiguration = postEditableData2.q;
                PostEditableData a2 = PostEditableData.a(postEditableData2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, additionalSettingsConfiguration != null ? AdditionalSettingsConfiguration.a(additionalSettingsConfiguration, false, false, false, null, false, 29) : null, null, null, null, null, null, null, false, null, 268402687);
                T(new rjc0(PostingContext.a(postingState.getContext(), newPost2.b, false, null, null, null, 32766), postingState.J7(), postingState.a9(), a2, a2));
                l0(postEditableData2);
                if (!arrayList.isEmpty()) {
                    this.e.b(io.reactivex.rxjava3.core.q.O(arrayList).L(io.reactivex.rxjava3.internal.functions.a.a, true).subscribe(new le50(new il7(i7, linkedHashSet, this), 8), new o3y(new p2u(i3), 16), new va4(0)));
                }
                h0(postingState, userId, null);
            } else if (init instanceof PostingAction.Init.EditPost) {
                PostingAction.Init.EditPost editPost = (PostingAction.Init.EditPost) init;
                T(new njc0(PostingContext.a(postingState.getContext(), editPost.b, false, null, null, null, 32766)));
                WallOwner wallOwner2 = editPost.b;
                Publisher publisher = editPost.c;
                Signer signer = editPost.d;
                PostEditableData postEditableData3 = editPost.e;
                C(new PostingAction.Fetch.WaitingCheckEditPostRules(new PostingAction.Fetch.CheckEditPostRules(wallOwner2, publisher, signer, postEditableData3), new PostingAction.Fetch.ErrorCheckEditPostRules(wallOwner2, publisher, signer, postEditableData3)));
                h0(postingState, wallOwner2.b, Integer.valueOf(postEditableData3.b));
            } else if (init instanceof PostingAction.Init.EditRemoteDraft) {
                PostingAction.Init.EditRemoteDraft editRemoteDraft = (PostingAction.Init.EditRemoteDraft) init;
                T(new njc0(PostingContext.a(postingState.getContext(), editRemoteDraft.b, false, null, null, null, 32766)));
                WallOwner wallOwner3 = editRemoteDraft.b;
                Publisher publisher2 = editRemoteDraft.c;
                Signer signer2 = editRemoteDraft.d;
                PostEditableData postEditableData4 = editRemoteDraft.e;
                C(new PostingAction.Fetch.WaitingCheckEditPostRules(new PostingAction.Fetch.CheckEditPostRules(wallOwner3, publisher2, signer2, postEditableData4), new PostingAction.Fetch.ErrorCheckEditPostRules(wallOwner3, publisher2, signer2, postEditableData4)));
                h0(postingState, wallOwner3.b, Integer.valueOf(postEditableData4.b));
            } else if (init instanceof PostingAction.Init.LoadLocalDraft) {
                PostingContext context = postingState.getContext();
                PostingAction.Init.LoadLocalDraft loadLocalDraft = (PostingAction.Init.LoadLocalDraft) init;
                WallOwner wallOwner4 = loadLocalDraft.b;
                UserId userId2 = wallOwner4.b;
                T(new sjc0(PostingContext.a(context, wallOwner4, false, null, null, null, 32766)));
                hdoVar.a.a.e.b(hdoVar.b.e(loadLocalDraft.c, userId2).q(asu0.a.c()).subscribe(new x8(new qd1(12, hdoVar, loadLocalDraft), i5), new defpackage.d(new defpackage.m(i7, hdoVar, loadLocalDraft), i6)));
                h0(postingState, userId2, null);
            } else {
                boolean z2 = init instanceof PostingAction.Init.RestoreState;
                nlc0 nlc0Var = this.o;
                if (z2) {
                    PostingState postingState2 = ((PostingAction.Init.RestoreState) init).b;
                    boolean z3 = postingState2 instanceof PostingState.Editing;
                    PostingState a3 = z3 ? nlc0Var.a((PostingState.Editing) postingState2) : postingState2;
                    T(new tjc0(a3));
                    UserId userId3 = a3.getContext().b.b;
                    Integer valueOf = (!(a3 instanceof PostingState.Editing) || (i2 = ((PostingState.Editing) a3).i.b) == 0) ? null : Integer.valueOf(i2);
                    if (z3) {
                        l0(((PostingState.Editing) postingState2).i);
                    }
                    h0(a3, userId3, valueOf);
                } else {
                    boolean z4 = init instanceof PostingAction.Init.RestoreStateFromDisk;
                    a aVar2 = this.n;
                    if (z4) {
                        PostingAction.Init.RestoreStateFromDisk restoreStateFromDisk = (PostingAction.Init.RestoreStateFromDisk) init;
                        RestorePostingStateMeta restorePostingStateMeta = restoreStateFromDisk.b;
                        PostingContext postingContext = restorePostingStateMeta.b;
                        T(new ojc0(postingContext));
                        UserId userId4 = postingContext.b.b;
                        Integer num = restorePostingStateMeta.e;
                        String str2 = restorePostingStateMeta.d;
                        f9t f9tVar = this.k.a;
                        aVar2.a.e.b(io.reactivex.rxjava3.core.x.j(wmi0.a.h(str2)).subscribe(new pmu(new e810(this, i5), i7), new pd40(new defpackage.s(29, this, restoreStateFromDisk), i4)));
                        h0(postingState, userId4, num);
                    } else {
                        if (!(init instanceof PostingAction.Init.RestoreStateLoaded)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ?? r2 = ((PostingAction.Init.RestoreStateLoaded) init).b;
                        boolean z5 = r2 instanceof PostingState.Editing;
                        aVar2.a(new tjc0(z5 ? nlc0Var.a((PostingState.Editing) r2) : r2));
                        List<Pair<PostingAction, WaitingActionTrigger>> I8 = postingState.I8();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : I8) {
                            if (((Pair) obj).j() == WaitingActionTrigger.FINISH_LOADING) {
                                arrayList2.add(obj);
                            }
                        }
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            C((kj50[]) new PostingAction[]{((Pair) it.next()).i()});
                        }
                        T(new e.j.b(WaitingActionTrigger.FINISH_LOADING));
                        if (z5) {
                            l0(((PostingState.Editing) r2).i);
                        }
                    }
                }
            }
            aqw.o(e7vVar.c.getValue(), "stories:auto_repost:sum_likes", new oac(e7vVar, 6));
            return;
        }
        if (postingAction instanceof PostingAction.Navigation) {
            this.p.a(postingState, (PostingAction.Navigation) postingAction);
            return;
        }
        if (postingAction instanceof PostingAction.Editing) {
            this.r.b(postingState, (PostingAction.Editing) postingAction);
            return;
        }
        int i9 = 26;
        int i10 = 21;
        int i11 = 22;
        int i12 = 2;
        if (postingAction instanceof PostingAction.Fetch) {
            PostingAction.Fetch fetch = (PostingAction.Fetch) postingAction;
            m6r m6rVar = this.t;
            vou vouVar = m6rVar.c;
            a aVar3 = m6rVar.a;
            efc0 efc0Var = aVar3.a;
            if (fetch instanceof PostingAction.Fetch.LoadPermissions) {
                com.vk.movika.sdk.base.asset.b bVar = m6rVar.d;
                boolean a4 = bVar.a(PermissionType.Camera);
                boolean a5 = bVar.a(PermissionType.GalleryView);
                aVar3.a(new e.a.f(a4, a5));
                if (a5) {
                    aVar3.d(PostingAction.Fetch.LoadLocalMedia.b);
                    return;
                }
                return;
            }
            if (fetch instanceof PostingAction.Fetch.LoadLocalMedia) {
                if (epx.f(postingState.z6().i, Boolean.TRUE)) {
                    aVar3.d(PostingAction$MediaPicker$Album$ReloadLocalAlbums.b);
                    return;
                }
                return;
            }
            int i13 = 28;
            if (fetch instanceof PostingAction.Fetch.LoadPlaces) {
                Context context2 = (Context) ((up70) vouVar.b).b;
                AtomicReference<Location> atomicReference = oxz.a;
                LocationCommon.a.getClass();
                GeoPermissionStatus geoPermissionStatus = !LocationCommon.b(context2) ? GeoPermissionStatus.DeviceRestricted : !LocationCommon.a(context2) ? GeoPermissionStatus.ApplicationRestricted : GeoPermissionStatus.Granted;
                aVar3.a(new com.vk.newsfeed.posting.impl.domain.model.h(geoPermissionStatus));
                if (geoPermissionStatus == GeoPermissionStatus.Granted) {
                    aVar3.a(new com.vk.newsfeed.posting.impl.domain.model.f(PlacesLoadingState.Loading));
                    AtomicReference<Location> atomicReference2 = oxz.a;
                    io.reactivex.rxjava3.internal.operators.observable.z b2 = oxz.b(context2);
                    asu0 asu0Var = asu0.a;
                    int i14 = 23;
                    efc0Var.e.b(b2.r0(asu0Var.c()).subscribe(new um0(new dsc(m6rVar, i13), 25), new fu0(new oce(m6rVar, i14), i14)));
                    io.reactivex.rxjava3.internal.operators.observable.l2 r0 = oxz.e(context2).r0(asu0Var.c());
                    h60 h60Var = new h60(new nhe(m6rVar, i10), i6);
                    int i15 = kwg0.a;
                    efc0Var.e.b(r0.subscribe(h60Var, new iwg0()));
                    return;
                }
                return;
            }
            if (fetch instanceof PostingAction.Fetch.LoadPlacesByLocation) {
                Location location = ((PostingAction.Fetch.LoadPlacesByLocation) fetch).b;
                efc0Var.e.b(rsg0.T(yfb.x(po40.m(new po40(), (float) location.getLatitude(), (float) location.getLongitude(), null, null, 5, 60))).U(new qu50(new f1s(16), 5)).r0(asu0.a.c()).subscribe(new wf1(new n3i(m6rVar, i5), i11), new cz(new uoh(m6rVar, 13), i11)));
                return;
            }
            if (fetch instanceof PostingAction.Fetch.SaveLastKnownGeo) {
                aVar3.a(new com.vk.newsfeed.posting.impl.domain.model.i(((PostingAction.Fetch.SaveLastKnownGeo) fetch).b));
                return;
            }
            if (fetch instanceof PostingAction.Fetch.LoadSettings) {
                PostingAction.Fetch.LoadSettings loadSettings = (PostingAction.Fetch.LoadSettings) fetch;
                UserId userId5 = loadSettings.b;
                int i16 = 7;
                efc0Var.e.b(io.reactivex.rxjava3.core.x.j(wmi0.a.h("postingSettingsLocal" + userId5)).l(new a840(new hwi0(i8), i16)).subscribe(new bn3(new j6e(m6rVar, i6), i9), new tf1(new jr3(16), i11)));
                m6rVar.b(userId5, loadSettings.c);
                if (fkq0.b(userId5)) {
                    List singletonList = Collections.singletonList(fkq0.a(userId5));
                    List l = e43.l(GroupsFieldsDto.IS_BUSINESS, GroupsFieldsDto.IS_MARKET_ENABLED, GroupsFieldsDto.ADMIN_LEVEL, GroupsFieldsDto.IS_ADMIN);
                    if ((4 & 2) != 0) {
                        l = null;
                    }
                    efc0Var.e.b(rsg0.W(yfb.x(wqu.a.a(null, singletonList, l)), 7).l(new qa(new oqu(0), i6)).subscribe(new ez(new m1k(m6rVar, i16), i11), new iu1(new vsq(i12), 18)));
                    return;
                }
                return;
            }
            if (fetch instanceof PostingAction.Fetch.LoadSettingsRemoteOnly) {
                PostingAction.Fetch.LoadSettingsRemoteOnly loadSettingsRemoteOnly = (PostingAction.Fetch.LoadSettingsRemoteOnly) fetch;
                m6rVar.b(loadSettingsRemoteOnly.b, loadSettingsRemoteOnly.c);
                return;
            }
            if (fetch instanceof PostingAction.Fetch.LoadPhotoTags) {
                List<PhotoTagRequestParam> list2 = ((PostingAction.Fetch.LoadPhotoTags) fetch).b;
                if (postingState instanceof PostingState.Editing) {
                    List<PhotoTagRequestParam> list3 = list2;
                    ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(Integer.valueOf(((PhotoTagRequestParam) it2.next()).b));
                    }
                    Set S0 = j5g.S0(arrayList3);
                    io.reactivex.rxjava3.internal.operators.single.n0 f = m6rVar.e.f(list2);
                    qs2 qs2Var = new qs2(new hn0(11, m6rVar, S0), 15);
                    f.getClass();
                    io.reactivex.rxjava3.internal.operators.single.f0 q = new io.reactivex.rxjava3.internal.operators.single.p(new io.reactivex.rxjava3.internal.operators.single.n(f, qs2Var), new l6r(0, m6rVar, S0)).q(asu0.a.c());
                    c60 c60Var = new c60(new rm0(11, m6rVar, postingState), i13);
                    int i17 = kwg0.a;
                    aVar3.a.e.b(q.subscribe(c60Var, new iwg0()));
                    return;
                }
                return;
            }
            if (fetch instanceof PostingAction.Fetch.LoadHints) {
                PostingSettings postingSettings = ((PostingAction.Fetch.LoadHints) fetch).b;
                boolean z6 = postingSettings.m;
                boolean b3 = fkq0.b(postingState.getContext().b.b);
                HintId hintId = HintId.POSTING_NEXT_STEP_BUTTON;
                h7v h7vVar = m6rVar.f;
                String str3 = (!h7vVar.m(hintId) || (p6 = h7vVar.p(hintId.getId())) == null) ? null : p6.c;
                HintId hintId2 = HintId.POSTING_DONUT_ONBOARDING;
                String str4 = (h7vVar.m(hintId2) && postingSettings.f && z6 && (p5 = h7vVar.p(hintId2.getId())) != null) ? p5.c : null;
                HintId hintId3 = HintId.POSTING_COAUTHORS_ONBOARDING;
                String str5 = (h7vVar.m(hintId3) && str4 == null && (p4 = h7vVar.p(hintId3.getId())) != null) ? p4.c : null;
                HintId hintId4 = HintId.FEED_POSTING_AUDIO_SNIPPETS;
                String str6 = (!h7vVar.m(hintId4) || (p3 = h7vVar.p(hintId4.getId())) == null) ? null : p3.d;
                HintId hintId5 = HintId.FEED_POSTING_VK_TICKET_ACTION_BUTTON;
                Iterator it3 = postingSettings.i.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        actionButton = null;
                        break;
                    }
                    ?? next = it3.next();
                    if (((ActionButton) next).f == ActionButton.Type.VkTicket) {
                        actionButton = next;
                        break;
                    }
                }
                ActionButton actionButton2 = actionButton;
                String str7 = (h7vVar.m(hintId5) && ((actionButton2 == null || (wallAttachmentsActionButtonDto = actionButton2.b) == null || (g = wallAttachmentsActionButtonDto.g()) == null) ? false : epx.f(g.d(), Boolean.TRUE)) && (p2 = h7vVar.p(hintId5.getId())) != null) ? p2.c : null;
                HintId hintId6 = HintId.FEED_POSTING_NEW_BC_POSTING_ONBOARDING;
                aVar3.a(new e.a.d(new PostingHints(str3, str5, str4, null, str7, str6, null, false, (!h7vVar.m(hintId6) || (p = h7vVar.p(hintId6.getId())) == null) ? null : p.c, m6rVar.g.k() && z6 && h7vVar.m(b3 ? HintId.DONUT_GROUP_POSTING_ONBOARDING : HintId.DONUT_PROFILE_POSTING_ONBOARDING))));
                return;
            }
            if (fetch instanceof PostingAction.Fetch.SetIsWaitingExplicit) {
                aVar3.a(new e.a.i(((PostingAction.Fetch.SetIsWaitingExplicit) fetch).b));
                return;
            }
            if (fetch instanceof PostingAction.Fetch.LoadedLocalSettings) {
                aVar3.a(new e.a.C1422e(((PostingAction.Fetch.LoadedLocalSettings) fetch).b));
                m6rVar.c(postingState);
                return;
            }
            if (!(fetch instanceof PostingAction.Fetch.SettingsLoadingState)) {
                if (fetch instanceof PostingAction.Fetch.CheckEditPostRules) {
                    m6rVar.a((PostingAction.Fetch.CheckEditPostRules) fetch);
                    return;
                }
                if (fetch instanceof PostingAction.Fetch.ErrorCheckEditPostRules) {
                    aVar3.a(mjc0.b);
                    return;
                }
                if (!(fetch instanceof PostingAction.Fetch.WaitingCheckEditPostRules)) {
                    if (!(fetch instanceof PostingAction.Fetch.LoadedGroupsInfo)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar3.a(new e.a.c(((PostingAction.Fetch.LoadedGroupsInfo) fetch).b));
                    return;
                } else if (postingState.x().e.i() >= SettingsPriority.Cache.i()) {
                    m6rVar.a(((PostingAction.Fetch.WaitingCheckEditPostRules) fetch).b);
                    return;
                } else {
                    PostingAction.Fetch.WaitingCheckEditPostRules waitingCheckEditPostRules = (PostingAction.Fetch.WaitingCheckEditPostRules) fetch;
                    aVar3.a(new e.a.b(waitingCheckEditPostRules.b, waitingCheckEditPostRules.c));
                    return;
                }
            }
            PostingAction.Fetch.SettingsLoadingState settingsLoadingState = (PostingAction.Fetch.SettingsLoadingState) fetch;
            PostingSettings postingSettings2 = settingsLoadingState.c;
            LoadingState loadingState = settingsLoadingState.b;
            boolean z7 = postingState instanceof PostingState.Editing;
            if (z7 && ((PostingState.Editing) postingState).n && loadingState == LoadingState.ERROR) {
                aVar3.e(new fmc0.p(new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_error_outline_28, R.attr.vk_ui_icon_negative), new PostingUserMessageText.ResText(R.string.posting_common_network_error), null, 4, null)));
            }
            if (z7 && ((PostingState.Editing) postingState).n && postingSettings2 != null && postingSettings2.e.i() == SettingsPriority.Network.i() && loadingState == LoadingState.FINISHED) {
                aVar3.d(PostingAction.Navigation.NextStep.b);
            }
            aVar3.a(new e.a.j(loadingState, postingSettings2));
            if (loadingState == LoadingState.FINISHED) {
                m6rVar.c(postingState);
            }
            if (loadingState == LoadingState.ERROR) {
                Iterator<PostingAction> it4 = postingState.p9().iterator();
                while (it4.hasNext()) {
                    aVar3.d(it4.next());
                }
                return;
            }
            return;
        }
        if (postingAction instanceof PostingAction.MediaPicker) {
            this.u.a(postingState, (PostingAction.MediaPicker) postingAction);
            return;
        }
        if (postingAction instanceof PostingAction.Permissions) {
            PostingAction.Permissions permissions = (PostingAction.Permissions) postingAction;
            a aVar4 = this.v.a;
            if (permissions instanceof PostingAction.Permissions.Grant) {
                int i18 = iy90.a.$EnumSwitchMapping$0[((PostingAction.Permissions.Grant) permissions).b.ordinal()];
                if (i18 == 1) {
                    aVar4.e(fmc0.c.b.b);
                    return;
                } else if (i18 == 2) {
                    aVar4.e(new fmc0.c.a());
                    return;
                } else {
                    if (i18 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            }
            if (!(permissions instanceof PostingAction.Permissions.PermissionGranted)) {
                throw new NoWhenBranchMatchedException();
            }
            PermissionType permissionType = ((PostingAction.Permissions.PermissionGranted) permissions).b;
            aVar4.a(new e.C1429e(permissionType));
            int i19 = iy90.a.$EnumSwitchMapping$0[permissionType.ordinal()];
            if (i19 == 1 || i19 == 2) {
                aVar4.d(PostingAction$MediaPicker$Album$ReloadLocalAlbums.b);
                return;
            } else {
                if (i19 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar4.d(PostingAction.Fetch.LoadPlaces.b);
                return;
            }
        }
        if (postingAction instanceof PostingAction.Upload) {
            PostingAction.Upload upload = (PostingAction.Upload) postingAction;
            bbq0 bbq0Var = this.y;
            nbq0 nbq0Var = bbq0Var.c;
            nbq0 nbq0Var2 = bbq0Var.c;
            com.vk.newsfeed.posting.impl.domain.model.upload.a aVar5 = bbq0Var.d;
            if (upload instanceof PostingAction.Upload.UploadStart) {
                PostingAction.Upload.UploadStart uploadStart = (PostingAction.Upload.UploadStart) upload;
                if ((postingState instanceof PostingState.Editing) && aVar5.b(uploadStart.b, (PostingState.Editing) postingState)) {
                    nbq0Var2.c(uploadStart.b, null, true);
                    return;
                }
                return;
            }
            if (upload instanceof PostingAction.Upload.UploadRetry) {
                PostingAction.Upload.UploadRetry uploadRetry = (PostingAction.Upload.UploadRetry) upload;
                if (postingState instanceof PostingState.Editing) {
                    UploadDto uploadDto2 = uploadRetry.b;
                    if (aVar5.b(uploadDto2, (PostingState.Editing) postingState)) {
                        nbq0Var.b(uploadDto2.I4().d);
                    }
                    bbq0Var.a(uploadDto2);
                    return;
                }
                return;
            }
            if (!(upload instanceof PostingAction.Upload.UploadRetryAttachment)) {
                if (!(upload instanceof PostingAction.Upload.Update)) {
                    throw new NoWhenBranchMatchedException();
                }
                UploadUpdate uploadUpdate = ((PostingAction.Upload.Update) upload).b;
                if (uploadUpdate instanceof UploadUpdate.Done) {
                    UploadUpdate.Done done = (UploadUpdate.Done) uploadUpdate;
                    aVar = new e.h.b(done.b, done.c);
                } else if (uploadUpdate instanceof UploadUpdate.Failed) {
                    UploadUpdate.Failed failed = (UploadUpdate.Failed) uploadUpdate;
                    aVar = new e.h.c(failed.b, failed.c);
                } else if (uploadUpdate instanceof UploadUpdate.Start) {
                    UploadUpdate.Start start = (UploadUpdate.Start) uploadUpdate;
                    aVar = new e.h.C1430e(start.b, start.c, start.d);
                } else if (uploadUpdate instanceof UploadUpdate.Progress) {
                    UploadUpdate.Progress progress = (UploadUpdate.Progress) uploadUpdate;
                    aVar = new e.h.d(progress.b, progress.c, progress.d);
                } else {
                    if (!(uploadUpdate instanceof UploadUpdate.Cancel)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar = new e.h.a(((UploadUpdate.Cancel) uploadUpdate).b);
                }
                bbq0Var.a.a(aVar);
                return;
            }
            PostingAction.Upload.UploadRetryAttachment uploadRetryAttachment = (PostingAction.Upload.UploadRetryAttachment) upload;
            if (postingState instanceof PostingState.Editing) {
                Iterator it5 = ((PostingState.Editing) postingState).i.p.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        postingAttachment = null;
                        break;
                    }
                    ?? next2 = it5.next();
                    if (epx.f(((PostingAttachment) next2).nb(), uploadRetryAttachment.b)) {
                        postingAttachment = next2;
                        break;
                    }
                }
                PostingAttachment postingAttachment3 = postingAttachment;
                if (postingAttachment3 instanceof UploadDto) {
                    int id = postingAttachment3.getId();
                    nbq0Var.getClass();
                    if (com.vk.upload.impl.a.a(id)) {
                        nbq0Var.b(postingAttachment3.getId());
                    } else {
                        nbq0Var2.c((UploadDto) postingAttachment3, null, true);
                    }
                    bbq0Var.a((UploadDto) postingAttachment3);
                    return;
                }
                return;
            }
            return;
        }
        if (postingAction instanceof PostingAction.Publish) {
            this.x.a(postingState, (PostingAction.Publish) postingAction);
            return;
        }
        if (postingAction instanceof PostingAction.Mentions) {
            PostingAction.Mentions mentions = (PostingAction.Mentions) postingAction;
            n320 n320Var = this.s;
            vd7 vd7Var = n320Var.b;
            a aVar6 = n320Var.a;
            if (mentions instanceof PostingAction.Mentions.LoadMentions) {
                io.reactivex.rxjava3.disposables.c cVar = n320Var.c;
                if (cVar != null) {
                    cVar.dispose();
                }
                aVar6.a(wjc0.b);
                n320Var.c = rsr.r().c(((PostingAction.Mentions.LoadMentions) mentions).b).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new wnt(new cqv(n320Var, i7), 4), new c120(new kdn(n320Var, i10), i8));
                return;
            }
            if (mentions instanceof PostingAction.Mentions.MentionSelected) {
                io.reactivex.rxjava3.disposables.c cVar2 = n320Var.c;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                MentionRepository.a(((PostingAction.Mentions.MentionSelected) mentions).b);
                aVar6.a(ujc0.b);
                return;
            }
            if (mentions instanceof PostingAction.Mentions.CloseMentionBottomSheet) {
                io.reactivex.rxjava3.disposables.c cVar3 = n320Var.c;
                if (cVar3 != null) {
                    cVar3.dispose();
                }
                aVar6.a(ujc0.b);
                return;
            }
            if (!(mentions instanceof PostingAction.Mentions.LoadMentionById)) {
                throw new NoWhenBranchMatchedException();
            }
            io.reactivex.rxjava3.disposables.c cVar4 = n320Var.c;
            if (cVar4 != null) {
                cVar4.dispose();
            }
            io.reactivex.rxjava3.internal.operators.observable.m1 a0 = wmi0.a.e("postMentionProfiles").L(new y34(new com.vk.newsfeed.posting.mentions.data.a(((PostingAction.Mentions.LoadMentionById) mentions).b, (MentionRepository) vd7Var.b), i11), false).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
            jv jvVar = new jv(new o010(n320Var, i12), i9);
            int i20 = kwg0.a;
            n320Var.c = a0.subscribe(jvVar, new iwg0());
            return;
        }
        if (postingAction instanceof PostingAction.ShowMessage) {
            PostingAction.ShowMessage showMessage = (PostingAction.ShowMessage) postingAction;
            j0(new fmc0.p(showMessage.b, showMessage.c, h4x.c(showMessage.f, showMessage.d, showMessage.g, showMessage.e), showMessage.h));
            return;
        }
        if (postingAction instanceof PostingAction.ShowModalBackToStep1) {
            j0(fmc0.q.a);
            return;
        }
        if (postingAction instanceof PostingAction.LocalDraft) {
            hdoVar.a(postingState, (PostingAction.LocalDraft) postingAction);
            return;
        }
        if (postingAction instanceof PostingAction$ValidationOldPostData$CheckRules) {
            T(new e.i(((PostingAction$ValidationOldPostData$CheckRules) postingAction).b));
            return;
        }
        if (postingAction instanceof PostingAction.ComposableAction) {
            Iterator it6 = ((PostingAction.ComposableAction) postingAction).b.iterator();
            while (it6.hasNext()) {
                C((PostingAction) it6.next());
            }
            return;
        }
        if (postingAction instanceof PostingAction$ShowSnackbar$CropZoom) {
            j0(new fmc0.s(((PostingAction$ShowSnackbar$CropZoom) postingAction).b));
            return;
        }
        if (postingAction instanceof PostingAction.NetworkStateChanged) {
            boolean z8 = ((PostingAction.NetworkStateChanged) postingAction).b;
            if (z8 && postingState.x().e.i() < SettingsPriority.Network.i() && postingState.x().k != LoadingState.LOADING) {
                C(new PostingAction.Fetch.LoadSettings(postingState.getContext().b.b, (!(postingState instanceof PostingState.Editing) || (i = ((PostingState.Editing) postingState).i.b) == 0) ? null : Integer.valueOf(i)));
            }
            if (z8 && (postingState.R9().e == PlacesLoadingState.Error || postingState.R9().e == PlacesLoadingState.Idle)) {
                C(PostingAction.Fetch.LoadPlaces.b);
            }
            T(new e.d(z8));
            return;
        }
        if (postingAction instanceof PostingAction.Stats) {
            this.B.a(postingState, (PostingAction.Stats) postingAction);
            return;
        }
        if (postingAction instanceof PostingAction.Hints) {
            e7vVar.a(postingState, (PostingAction.Hints) postingAction);
            return;
        }
        if (postingAction instanceof PostingAction.Tooltips) {
            s6p0 s6p0Var = this.A;
            s6p0Var.b.f(postingState.getContext().b.b, GroupCreationOnboardingTooltip.Type.MARKET_ITEM);
            s6p0Var.a.a(yjc0.b);
            return;
        }
        if (postingAction instanceof PostingAction.TechStats) {
            this.C.a(postingState, (PostingAction.TechStats) postingAction);
            return;
        }
        if (!(postingAction instanceof PostingAction.AddWaitingAction)) {
            throw new NoWhenBranchMatchedException();
        }
        PostingAction.AddWaitingAction addWaitingAction = (PostingAction.AddWaitingAction) postingAction;
        WaitingActionTrigger waitingActionTrigger = addWaitingAction.c;
        PostingAction postingAction2 = addWaitingAction.b;
        if (b.$EnumSwitchMapping$0[waitingActionTrigger.ordinal()] != 1) {
            T(new e.j.a(postingAction2, waitingActionTrigger));
        } else if (postingState instanceof PostingState.Loading) {
            T(new e.j.a(postingAction2, waitingActionTrigger));
        } else {
            C(postingAction2);
        }
    }

    public final List<wq10> c0() {
        return this.i.b;
    }

    public final io.reactivex.rxjava3.internal.operators.observable.j1 d0() {
        return this.m;
    }

    public final void h0(PostingState postingState, UserId userId, Integer num) {
        N(postingState, new PostingAction.Fetch.LoadSettings(userId, num));
        N(postingState, PostingAction.Fetch.LoadPermissions.b);
        N(postingState, PostingAction.Fetch.LoadPlaces.b);
    }

    public final void j0(fmc0 fmc0Var) {
        this.h.b(fmc0Var);
    }

    public final void l0(PostEditableData postEditableData) {
        for (PostingAttachment postingAttachment : postEditableData.p) {
            if (postingAttachment instanceof UploadDto) {
                C(new PostingAction.Upload.UploadStart((UploadDto) postingAttachment));
            }
        }
        FileDto fileDto = postEditableData.m;
        if (fileDto != null) {
            C(new PostingAction.Upload.UploadStart(fileDto));
        }
        MusicAttachDto musicAttachDto = postEditableData.l;
        if (musicAttachDto instanceof MusicAttachDto.MusicPlaylistDto) {
            C(new PostingAction.Upload.UploadStart(((MusicAttachDto.MusicPlaylistDto) musicAttachDto).b));
        } else if (musicAttachDto instanceof MusicAttachDto.MusicTracksDto) {
            Iterator<MusicDto> it = ((MusicAttachDto.MusicTracksDto) musicAttachDto).b.iterator();
            while (it.hasNext()) {
                C(new PostingAction.Upload.UploadStart(it.next()));
            }
        }
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        this.q.getClass();
        r3y.c("tickets_posting_select");
        qbm0 qbm0Var = this.l;
        if (qbm0Var != null) {
            Lazy<l8c0> lazy = qbm0Var.c;
            if (lazy.isInitialized()) {
                lazy.getValue().a();
            }
        }
    }
}
