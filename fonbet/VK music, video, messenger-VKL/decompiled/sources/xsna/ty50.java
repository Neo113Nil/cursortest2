package xsna;

import android.net.Uri;
import android.os.Parcelable;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.dto.photo.Photo;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.Publisher;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.WallOwner;
import com.vk.newsfeed.posting.api.analytics.PostingMetricEntryPoint;
import com.vk.newsfeed.posting.api.model.PhotoVideoDisplayMode;
import com.vk.newsfeed.posting.crop_editor.domain.model.ImageLink;
import com.vk.newsfeed.posting.crop_editor.domain.model.LocalImageLink;
import com.vk.newsfeed.posting.crop_editor.domain.model.RemoteImageLink;
import com.vk.newsfeed.posting.impl.domain.model.CropFitContainerMode;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.impl.domain.model.MediaViewerOpenPoint;
import com.vk.newsfeed.posting.impl.domain.model.PhotoTag;
import com.vk.newsfeed.posting.impl.domain.model.PhotoTagRequestParam;
import com.vk.newsfeed.posting.impl.domain.model.PhotoVideoAttachmentsCropData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import com.vk.newsfeed.posting.impl.domain.model.PostPrivacyData;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$Navigation$Picker$OpenPostponeDatePicker;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$Navigation$Picker$OpenPrivacyDatePicker;
import com.vk.newsfeed.posting.impl.domain.model.PostingContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingNavigationState;
import com.vk.newsfeed.posting.impl.domain.model.PostingPreviewRatio;
import com.vk.newsfeed.posting.impl.domain.model.PostingScreenContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.PostingStep;
import com.vk.newsfeed.posting.impl.domain.model.PostingStepScreen;
import com.vk.newsfeed.posting.impl.domain.model.PublicationState;
import com.vk.newsfeed.posting.impl.domain.model.UserType;
import com.vk.newsfeed.posting.impl.domain.model.attachment.LocalPhotoAttachment;
import com.vk.newsfeed.posting.impl.domain.model.e;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageButton;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageIcon;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageText;
import com.vk.newsfeed.posting.impl.domain.model.music.MusicAttachDto;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.presentation.base.view.steps.PollEditorUiConfig;
import com.vk.newsfeed.posting.impl.presentation.model.CoauthorDto;
import com.vk.newsfeed.posting.impl.presentation.model.CurrentUser;
import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import com.vk.newsfeed.posting.impl.presentation.model.GroupAdminLevel;
import com.vk.newsfeed.posting.impl.presentation.model.GroupWallPostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoDto;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoTagsData;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollSettings;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.UserWallPostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.VideoDto;
import com.vk.newsfeed.posting.market_picker.presentation.base.view.e;
import com.vk.newsfeed.posting.poll_editor.presentation.model.PollEditorMode;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.efc0;
import xsna.fmc0;
import xsna.ibc0;
import xsna.u2u0;

/* compiled from: NavigationFeatureDelegate.kt */
/* loaded from: classes4.dex */
public final class ty50 {
    public final efc0.a a;
    public final nbq0 b;
    public final ibc0 c;
    public final lme d;
    public final w9c0 e;
    public final cpc0 f;
    public final nz50 g;
    public final Object h = msy.a(LazyThreadSafetyMode.NONE, new sy50(this, 0));

    /* compiled from: NavigationFeatureDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupAdminLevel.values().length];
            try {
                iArr[GroupAdminLevel.MODERATOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupAdminLevel.EDITOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupAdminLevel.ADMINISTRATOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ty50(efc0.a aVar, nbq0 nbq0Var, ibc0 ibc0Var, lme lmeVar, w9c0 w9c0Var, cpc0 cpc0Var) {
        this.a = aVar;
        this.b = nbq0Var;
        this.c = ibc0Var;
        this.d = lmeVar;
        this.e = w9c0Var;
        this.f = cpc0Var;
        this.g = new nz50(aVar, ibc0Var, cpc0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0080 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(PostingState.Editing editing, boolean z) {
        PublicationState publicationState;
        PostEditingReason postEditingReason = editing.h;
        if ((postEditingReason instanceof PostEditingReason.EditLocalDraft) || (postEditingReason instanceof PostEditingReason.NewPost)) {
            return z && !(PostEditableData.a(editing.i, null, null, null, null, null, null, null, PhotoVideoAttachmentsCropData.f, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 201031423).equals(PostEditableData.D) && epx.f(editing.i.t, editing.d.j)) && ((publicationState = editing.m) == PublicationState.None || publicationState == PublicationState.Failure);
        }
        if (postEditingReason instanceof PostEditingReason.EditExistingPost) {
            if (!z || !tuk0.b(editing, true)) {
            }
        } else {
            if (!(postEditingReason instanceof PostEditingReason.EditRemoteDraft)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!z || !tuk0.b(editing, false)) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0278, code lost:
    
        if (r1 == null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0359, code lost:
    
        if ((r3 != null ? r3.c : null) == com.vk.newsfeed.posting.impl.presentation.model.GroupPrivacyType.OPEN) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x035b, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0365, code lost:
    
        if (r3.b == false) goto L210;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0614 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x070c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0a13  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0a2b  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0a32  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x0a57  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0a73  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0a7a  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0a77  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0a5c  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0a2f  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0a16  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fd  */
    /* JADX WARN: Type inference failed for: r2v77, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r36v0, types: [xsna.ty50] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(PostingState postingState, PostingAction.Navigation navigation) {
        String str;
        PhotoDto photoDto;
        PhotoAttachment photoAttachment;
        ImageSize k;
        Image image;
        String str2;
        ImageLink remoteImageLink;
        boolean z;
        PhotoAttachment photoAttachment2;
        boolean z2;
        LocalMediaEntry localMediaEntry;
        Photo photo;
        int i;
        DonutLevel donutLevel;
        Integer num;
        Iterator it;
        int i2;
        int i3;
        PostingMetricEntryPoint postingMetricEntryPoint;
        Map<Integer, List<PhotoTag>> map;
        Set<Map.Entry<Integer, List<PhotoTag>>> entrySet;
        Object obj;
        e.b bVar;
        e.b bVar2;
        ArrayList arrayList;
        boolean z3;
        String str3;
        String str4;
        boolean b;
        boolean z4;
        boolean z5;
        UserType userType;
        PostingStepScreen postingStepScreen;
        boolean z6 = postingState instanceof PostingState.Loading;
        efc0.a aVar = this.a;
        if (z6) {
            if (navigation instanceof PostingAction.Navigation.Close) {
                aVar.e(new fmc0.j.c(((PostingState.Loading) postingState).h, ((PostingAction.Navigation.Close) navigation).c, false));
                return;
            }
            return;
        }
        if (!(postingState instanceof PostingState.Editing)) {
            throw new NoWhenBranchMatchedException();
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        PostingScreenContext postingScreenContext = editing.b;
        PostEditingReason postEditingReason = editing.h;
        PostingNavigationState postingNavigationState = editing.g;
        PostingSettings postingSettings = editing.d;
        PostingContext postingContext = editing.c;
        PostEditableData postEditableData = editing.i;
        lme lmeVar = this.d;
        efc0.a aVar2 = lmeVar.a;
        nz50 nz50Var = this.g;
        cpc0 cpc0Var = nz50Var.c;
        efc0.a aVar3 = nz50Var.a;
        if (navigation instanceof PostingAction.Navigation.NextStep) {
            PostingStepScreen postingStepScreen2 = edi.t(postingNavigationState).b;
            PostingStepScreen.PostTextInput postTextInput = PostingStepScreen.PostTextInput.b;
            if (epx.f(postingStepScreen2, postTextInput)) {
                PostingStepScreen.AttachmentPickers attachmentPickers = PostingStepScreen.AttachmentPickers.b;
                if (epx.f(attachmentPickers, attachmentPickers)) {
                    aVar.d(new PostingAction.Navigation.CheckRedirect(attachmentPickers));
                } else {
                    b(editing, attachmentPickers);
                }
                if (epx.f(postingStepScreen2, postTextInput)) {
                    aVar.e(fmc0.y.a.a);
                    return;
                }
                return;
            }
            return;
        }
        if (navigation instanceof PostingAction.Navigation.Back) {
            if (postingNavigationState.b.size() <= 1) {
                if (c(editing, true)) {
                    aVar.e(d(editing) ? new fmc0.j.v(postEditingReason) : new fmc0.j.u(!(postEditingReason instanceof PostEditingReason.EditExistingPost), postEditingReason));
                    return;
                } else {
                    aVar.e(new fmc0.j.c(postEditingReason, true, false));
                    return;
                }
            }
            List<PostingStep> list = postingNavigationState.b;
            PostingStep postingStep = list.size() < 2 ? null : list.get(e43.h(list) - 1);
            if (postingStep != null && (postingStepScreen = postingStep.b) != null) {
                e(postingStepScreen, false);
            }
            aVar.a(e.c.C1428e.b);
            return;
        }
        if (navigation instanceof PostingAction.Navigation.BackPressed) {
            PostingStep postingStep2 = (PostingStep) j5g.k0(postingNavigationState.b);
            List<PostingStep> list2 = postingStep2 != null ? postingStep2.e : null;
            if (list2 == null || list2.isEmpty()) {
                aVar.e(fmc0.j.a.a);
                return;
            } else {
                aVar.a(e.c.b.b);
                return;
            }
        }
        boolean z7 = navigation instanceof PostingAction.Navigation.OpenInCurrentStep;
        cpc0 cpc0Var2 = this.f;
        ibc0 ibc0Var = this.c;
        if (!z7) {
            int i4 = 0;
            if (navigation instanceof PostingAction.Navigation.CloseInCurrentStep) {
                aVar.a(e.c.b.b);
                return;
            }
            if (navigation instanceof PostingAction.Navigation.Close) {
                PostingAction.Navigation.Close close = (PostingAction.Navigation.Close) navigation;
                fmc0 vVar = c(editing, close.b) ? d(editing) ? new fmc0.j.v(postEditingReason) : new fmc0.j.u(!(postEditingReason instanceof PostEditingReason.EditExistingPost), postEditingReason) : new fmc0.j.c(postEditingReason, close.c, close.d);
                aVar.d(PostingAction.Stats.SendWaitingAnalytics.b);
                aVar.e(vVar);
                return;
            }
            if (navigation instanceof PostingAction$Navigation$Picker$OpenPostponeDatePicker) {
                ibc0Var.x().e();
                aVar.e(new mmc0(postEditableData.o));
                return;
            }
            if (navigation instanceof PostingAction.Navigation.OpenDonutTeaserModal) {
                PrivacyPostType privacyPostType = postEditableData.i;
                PrivacyPostType.SingleDonutLevel singleDonutLevel = privacyPostType instanceof PrivacyPostType.SingleDonutLevel ? (PrivacyPostType.SingleDonutLevel) privacyPostType : null;
                String str5 = (singleDonutLevel == null || (donutLevel = singleDonutLevel.b) == null) ? null : donutLevel.e;
                if (str5 == null) {
                    str5 = "";
                }
                aVar.e(new fmc0.j.h(postEditableData.y, str5));
                return;
            }
            boolean z8 = navigation instanceof PostingAction.Navigation.OpenMiniPreviewPhotoVideoViewer;
            u2u0.b bVar3 = u2u0.b.a;
            if (z8) {
                PostingAction.Navigation.OpenMiniPreviewPhotoVideoViewer openMiniPreviewPhotoVideoViewer = (PostingAction.Navigation.OpenMiniPreviewPhotoVideoViewer) navigation;
                if (cpc0Var.j()) {
                    MediaPickerSelectedItem mediaPickerSelectedItem = openMiniPreviewPhotoVideoViewer.b;
                    if (mediaPickerSelectedItem instanceof MediaPickerSelectedItem.VkVideo) {
                        aVar3.e(new fmc0.j.t(((MediaPickerSelectedItem.VkVideo) mediaPickerSelectedItem).b.b));
                        return;
                    }
                    MediaStoreEntry b2 = com.vk.newsfeed.posting.impl.domain.model.b.b(mediaPickerSelectedItem);
                    if (b2 == null) {
                        return;
                    }
                    List<MediaPickerSelectedItem> list3 = openMiniPreviewPhotoVideoViewer.d;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        MediaStoreEntry b3 = com.vk.newsfeed.posting.impl.domain.model.b.b((MediaPickerSelectedItem) it2.next());
                        if (b3 != null) {
                            arrayList2.add(b3);
                        }
                    }
                    aVar3.e(new fmc0.j.k(arrayList2, EmptyList.b, b2, arrayList2.indexOf(b2), true, false, MediaViewerOpenPoint.MINI_MEDIA_PREVIEW, bVar3));
                    return;
                }
                return;
            }
            if (navigation instanceof PostingAction.Navigation.OpenPhotoVideoViewer) {
                PostingAttachment postingAttachment = ((PostingAction.Navigation.OpenPhotoVideoViewer) navigation).b;
                Attachment nb = postingAttachment.nb();
                if (!(nb instanceof PhotoAttachment)) {
                    if (nb instanceof VideoAttachment) {
                        aVar3.e(new fmc0.j.t(((VideoAttachment) nb).k));
                        return;
                    }
                    return;
                }
                List<PostingAttachment> list4 = postEditableData.p;
                ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
                Iterator it3 = list4.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((PostingAttachment) it3.next()).nb());
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    Object next = it4.next();
                    if (next instanceof PhotoAttachment) {
                        arrayList4.add(next);
                    }
                }
                int indexOf = arrayList4.indexOf(postingAttachment.nb());
                if (indexOf < 0) {
                    return;
                }
                MediaStoreEntry i5 = w65.i((PhotoAttachment) nb);
                EmptyList emptyList = EmptyList.b;
                ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(w65.i((PhotoAttachment) it5.next()));
                }
                aVar3.e(new fmc0.j.k(arrayList5, emptyList, i5, indexOf, cpc0Var.j(), false, MediaViewerOpenPoint.MEDIA_PREVIEW, bVar3));
                return;
            }
            if (navigation instanceof PostingAction.Navigation.OpenCropPhotoEditor) {
                PhotoDto photoDto2 = ((PostingAction.Navigation.OpenCropPhotoEditor) navigation).b;
                List<PostingAttachment> list5 = postEditableData.p;
                Attachment attachment = photoDto2.c;
                Iterator it6 = list5.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        photoDto = 0;
                        break;
                    }
                    photoDto = it6.next();
                    Attachment nb2 = ((PostingAttachment) photoDto).nb();
                    if ((nb2 instanceof PhotoAttachment) && (attachment instanceof PhotoAttachment)) {
                        PhotoAttachment photoAttachment3 = (PhotoAttachment) nb2;
                        PhotoAttachment photoAttachment4 = (PhotoAttachment) attachment;
                        if (!(photoAttachment4 instanceof LocalPhotoAttachment) || !(photoAttachment3 instanceof LocalPhotoAttachment)) {
                            String Hb = photoAttachment4.Hb();
                            if (!agc0.e(Hb) && photoAttachment3.Hb().equals(Hb)) {
                                break;
                            }
                        } else {
                            LocalPhotoAttachment localPhotoAttachment = (LocalPhotoAttachment) photoAttachment4;
                            String Hb2 = localPhotoAttachment.Hb();
                            LocalPhotoAttachment localPhotoAttachment2 = (LocalPhotoAttachment) photoAttachment3;
                            if (epx.f(localPhotoAttachment.getUri(), localPhotoAttachment2.getUri())) {
                                break;
                            } else if (!agc0.e(Hb2) && localPhotoAttachment2.Hb().equals(Hb2)) {
                                break;
                            }
                        }
                    }
                }
                PhotoDto photoDto3 = photoDto instanceof PhotoDto ? photoDto : null;
                if (photoDto3 != null) {
                    photoDto2 = photoDto3;
                }
                Attachment attachment2 = photoDto2.c;
                if (attachment2 instanceof LocalPhotoAttachment) {
                    LocalPhotoAttachment localPhotoAttachment3 = (LocalPhotoAttachment) attachment2;
                    remoteImageLink = new LocalImageLink(localPhotoAttachment3.y.ba().f(), localPhotoAttachment3.z, localPhotoAttachment3.A);
                } else if (!(attachment2 instanceof PhotoAttachment) || (k = his0.k((photoAttachment = (PhotoAttachment) attachment2))) == null || (str2 = (image = k.d).d) == null) {
                    return;
                } else {
                    remoteImageLink = new RemoteImageLink(photoAttachment.Hb(), photoAttachment.l.K != null, Uri.parse(str2), image.b, image.c);
                }
                PhotoVideoDisplayMode photoVideoDisplayMode = postEditableData.k;
                PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData = postEditableData.j;
                if (photoVideoDisplayMode == PhotoVideoDisplayMode.Carousel) {
                    Iterator<PostingAttachment> it7 = postEditableData.p.iterator();
                    int i6 = 0;
                    while (true) {
                        if (!it7.hasNext()) {
                            i = -1;
                            break;
                        } else {
                            if (epx.f(it7.next().nb(), attachment2)) {
                                i = i6;
                                break;
                            }
                            i6++;
                        }
                    }
                    if (i == 0) {
                        z = true;
                        Parcelable parcelable = photoDto2.f.h;
                        PhotoAttachment photoAttachment5 = !(parcelable instanceof PhotoAttachment) ? (PhotoAttachment) parcelable : null;
                        boolean z9 = photoAttachment5 == null && (photo = photoAttachment5.l) != null && photo.r;
                        photoAttachment2 = !(attachment2 instanceof PhotoAttachment) ? (PhotoAttachment) attachment2 : null;
                        if (photoAttachment2 != null) {
                            if ((photoAttachment2 instanceof LocalPhotoAttachment) && !sdy.p(((LocalPhotoAttachment) photoAttachment2).y.ba())) {
                                z2 = true;
                                ImageCropArea b4 = com.vk.newsfeed.posting.impl.domain.model.c.b(photoVideoAttachmentsCropData, attachment2);
                                CropFitContainerMode cropFitContainerMode = z ? CropFitContainerMode.CROP_ONLY : b4 == null ? CropFitContainerMode.FIT : CropFitContainerMode.CROP;
                                ibc0Var.j().b();
                                PostingPreviewRatio postingPreviewRatio = photoVideoAttachmentsCropData.e;
                                LocalPhotoAttachment localPhotoAttachment4 = attachment2 instanceof LocalPhotoAttachment ? (LocalPhotoAttachment) attachment2 : null;
                                aVar.e(new hmc0(remoteImageLink, b4, postingPreviewRatio, (localPhotoAttachment4 != null || (localMediaEntry = localPhotoAttachment4.y) == null) ? null : localMediaEntry.ba(), z, z9, z2, cropFitContainerMode, postingScreenContext.c));
                                return;
                            }
                        }
                        z2 = false;
                        ImageCropArea b42 = com.vk.newsfeed.posting.impl.domain.model.c.b(photoVideoAttachmentsCropData, attachment2);
                        CropFitContainerMode cropFitContainerMode2 = z ? CropFitContainerMode.CROP_ONLY : b42 == null ? CropFitContainerMode.FIT : CropFitContainerMode.CROP;
                        ibc0Var.j().b();
                        PostingPreviewRatio postingPreviewRatio2 = photoVideoAttachmentsCropData.e;
                        if (attachment2 instanceof LocalPhotoAttachment) {
                        }
                        aVar.e(new hmc0(remoteImageLink, b42, postingPreviewRatio2, (localPhotoAttachment4 != null || (localMediaEntry = localPhotoAttachment4.y) == null) ? null : localMediaEntry.ba(), z, z9, z2, cropFitContainerMode2, postingScreenContext.c));
                        return;
                    }
                }
                z = false;
                Parcelable parcelable2 = photoDto2.f.h;
                if (!(parcelable2 instanceof PhotoAttachment)) {
                }
                if (photoAttachment5 == null) {
                }
                if (!(attachment2 instanceof PhotoAttachment)) {
                }
                if (photoAttachment2 != null) {
                }
                z2 = false;
                ImageCropArea b422 = com.vk.newsfeed.posting.impl.domain.model.c.b(photoVideoAttachmentsCropData, attachment2);
                CropFitContainerMode cropFitContainerMode22 = z ? CropFitContainerMode.CROP_ONLY : b422 == null ? CropFitContainerMode.FIT : CropFitContainerMode.CROP;
                ibc0Var.j().b();
                PostingPreviewRatio postingPreviewRatio22 = photoVideoAttachmentsCropData.e;
                if (attachment2 instanceof LocalPhotoAttachment) {
                }
                aVar.e(new hmc0(remoteImageLink, b422, postingPreviewRatio22, (localPhotoAttachment4 != null || (localMediaEntry = localPhotoAttachment4.y) == null) ? null : localMediaEntry.ba(), z, z9, z2, cropFitContainerMode22, postingScreenContext.c));
                return;
            }
            if (navigation instanceof PostingAction.Navigation.OpenActionButtonsList) {
                PostingAction.Navigation.OpenActionButtonsList openActionButtonsList = (PostingAction.Navigation.OpenActionButtonsList) navigation;
                ibc0Var.u().D();
                aVar.e(new fmc0.j.d(openActionButtonsList.b, openActionButtonsList.c, postingScreenContext.c, postingContext.b));
                return;
            }
            if (navigation instanceof PostingAction$Navigation$Picker$OpenPrivacyDatePicker) {
                aVar.e(new nmc0(zaq.a(editing, cpc0Var2)));
                return;
            }
            if (navigation instanceof PostingAction.Navigation.CheckRedirect) {
                PostingStepScreen postingStepScreen3 = ((PostingAction.Navigation.CheckRedirect) navigation).b;
                if (!(n2c0.b(postEditableData, lmeVar.b) && vmc0.a(editing))) {
                    aVar2.e(fmc0.e.a);
                    aVar2.d(new PostingAction.Navigation.RedirectFailed(postingStepScreen3));
                    return;
                } else {
                    aVar2.e(fmc0.r.a);
                    io.reactivex.rxjava3.disposables.b bVar4 = aVar2.a.e;
                    UserId userId = postingContext.b.b;
                    bVar4.b(hg1.i((fkq0.d(userId) ? io.reactivex.rxjava3.core.x.k(Boolean.valueOf(!lmeVar.d.d())) : fkq0.b(userId) ? lmeVar.c.N0(fkq0.a(userId)).U(new dg1(new com.vk.movika.sdk.base.observable.u(14), 12)).J(Boolean.FALSE) : io.reactivex.rxjava3.core.x.k(Boolean.FALSE)).h(new lz(new wqb(4, lmeVar, postingStepScreen3), 11)), new oh3(9, lmeVar, postingStepScreen3)));
                    return;
                }
            }
            if (navigation instanceof PostingAction.Navigation.OpenClipsPublication) {
                aVar2.e(gmc0.a);
                Object a0 = j5g.a0(postEditableData.p);
                VideoDto videoDto = a0 instanceof VideoDto ? (VideoDto) a0 : null;
                if (videoDto == null || (str = videoDto.f.c) == null) {
                    return;
                }
                aVar2.e(new fmc0.l(videoDto.h, postEditableData.c, postingContext.b.b, str));
                return;
            }
            if (navigation instanceof PostingAction.Navigation.RedirectFailed) {
                b(editing, ((PostingAction.Navigation.RedirectFailed) navigation).b);
                return;
            }
            if (navigation instanceof PostingAction.Navigation.ReturnFromClipsPublication) {
                boolean z10 = ((PostingAction.Navigation.ReturnFromClipsPublication) navigation).b;
                efc0.a aVar4 = lmeVar.a;
                if (editing instanceof PostingState.Editing) {
                    aVar4.e(fmc0.e.a);
                    if (z10) {
                        aVar4.d(new PostingAction.Navigation.Close(false, false, false, 6, null));
                        return;
                    }
                    return;
                }
                return;
            }
            if (!(navigation instanceof PostingAction.Navigation.OpenLocalPhotoVideoViewer)) {
                if (navigation instanceof PostingAction.Navigation.OpenVkPhotoViewer) {
                    PostingAction.Navigation.OpenVkPhotoViewer openVkPhotoViewer = (PostingAction.Navigation.OpenVkPhotoViewer) navigation;
                    nz50Var.b.u().i();
                    nz50Var.a.e(new fmc0.j.q(openVkPhotoViewer.d, openVkPhotoViewer.e, openVkPhotoViewer.b, openVkPhotoViewer.c, MediaViewerOpenPoint.VK_PHOTO_PICKER));
                    return;
                } else {
                    if (navigation instanceof PostingAction.Navigation.OpenVkPhotoEditor) {
                        nz50Var.a.e(new fmc0.j.o(((PostingAction.Navigation.OpenVkPhotoEditor) navigation).b));
                        return;
                    }
                    if (navigation instanceof PostingAction.Navigation.OpenVkVideoViewer) {
                        nz50Var.a.e(new fmc0.j.t(((PostingAction.Navigation.OpenVkVideoViewer) navigation).b));
                        return;
                    }
                    if (navigation instanceof PostingAction.Navigation.OpenVkVideoPrivacyPolicy) {
                        aVar.e(new fmc0.j.C2885j());
                        return;
                    } else {
                        if (!epx.f(navigation, PostingAction.Navigation.OpenDraftsList.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar.e(fmc0.g.a);
                        aVar.e(new fmc0.j.i(postingContext.b.b));
                        return;
                    }
                }
            }
            PostingAction.Navigation.OpenLocalPhotoVideoViewer openLocalPhotoVideoViewer = (PostingAction.Navigation.OpenLocalPhotoVideoViewer) navigation;
            nz50Var.getClass();
            if (!(editing instanceof PostingState.Editing)) {
                editing = null;
            }
            if (editing == null) {
                return;
            }
            MediaPickerState mediaPickerState = editing.f;
            List<LocalMediaEntry> list6 = mediaPickerState.f;
            ArrayList arrayList6 = new ArrayList(c5g.u(list6, 10));
            Iterator it8 = list6.iterator();
            while (it8.hasNext()) {
                arrayList6.add(((LocalMediaEntry) it8.next()).ba());
            }
            List<MediaPickerSelectedItem> list7 = mediaPickerState.e;
            ArrayList arrayList7 = new ArrayList();
            for (Object obj2 : list7) {
                if (obj2 instanceof MediaPickerSelectedItem.LocalMedia) {
                    arrayList7.add(obj2);
                }
            }
            ArrayList arrayList8 = new ArrayList(c5g.u(arrayList7, 10));
            Iterator it9 = arrayList7.iterator();
            while (it9.hasNext()) {
                arrayList8.add(((MediaPickerSelectedItem.LocalMedia) it9.next()).b.ba());
            }
            ArrayList arrayList9 = new ArrayList(c5g.u(arrayList6, 10));
            Iterator it10 = arrayList6.iterator();
            while (it10.hasNext()) {
                Object next2 = it10.next();
                int i7 = i4 + 1;
                if (i4 < 0) {
                    e43.t();
                    throw null;
                }
                arrayList9.add(new Pair(Integer.valueOf(i4), (MediaStoreEntry) next2));
                i4 = i7;
            }
            ArrayList arrayList10 = new ArrayList();
            Iterator it11 = arrayList9.iterator();
            while (it11.hasNext()) {
                Object next3 = it11.next();
                if (arrayList8.contains(((Pair) next3).j())) {
                    arrayList10.add(next3);
                }
            }
            nz50Var.b.u().i();
            efc0.a aVar5 = nz50Var.a;
            MediaStoreEntry mediaStoreEntry = openLocalPhotoVideoViewer.b;
            aVar5.e(new fmc0.j.k(arrayList6, arrayList10, mediaStoreEntry, arrayList6.indexOf(mediaStoreEntry), true, true, MediaViewerOpenPoint.LOCAL_MEDIA_PICKER, u2u0.b.a));
            return;
        }
        PostingAction.Navigation.OpenInCurrentStep openInCurrentStep = (PostingAction.Navigation.OpenInCurrentStep) navigation;
        PostingStepScreen postingStepScreen4 = openInCurrentStep.b;
        if (postingStepScreen4 instanceof PostingStepScreen.PollEditor) {
            ibc0Var.u().s();
            UserId userId2 = postingContext.b.b;
            PostingStepScreen.PollEditor pollEditor = (PostingStepScreen.PollEditor) postingStepScreen4;
            PostingPollDto postingPollDto = pollEditor.b;
            PostingPollDto postingPollDto2 = pollEditor.c;
            PollEditorMode pollEditorMode = pollEditor.d;
            PostingPollSettings postingPollSettings = postingSettings.b;
            aVar.e(new imc0(userId2, postingPollDto, postingPollDto2, pollEditorMode, new PollEditorUiConfig(postingPollSettings.b, 20, 1, postingPollSettings.d, postingPollSettings.c, 0, 2, 32, null)));
            return;
        }
        if (postingStepScreen4 instanceof PostingStepScreen.PlacePicker) {
            ibc0Var.u().g();
            aVar.e(new lmc0(editing.e));
            return;
        }
        if (postingStepScreen4 instanceof PostingStepScreen.AdditionalSettingsScreen) {
            ibc0Var.x().l();
            boolean z11 = postEditingReason instanceof PostEditingReason.EditExistingPost ? ((PostEditingReason.EditExistingPost) postEditingReason).b : true;
            boolean d = postingSettings.d();
            UserWallPostingSettings userWallPostingSettings = postingSettings.g;
            GroupWallPostingSettings groupWallPostingSettings = postingSettings.h;
            CurrentUser currentUser = postingSettings.q;
            boolean Ja = postEditingReason.Ja();
            if (z11) {
                if (Ja && d) {
                    Publisher publisher = postingContext.e;
                    if (publisher != null) {
                        str3 = publisher.c;
                    }
                } else {
                    str3 = currentUser.b;
                }
                if (z11) {
                    if (Ja && d) {
                        Publisher publisher2 = postingContext.e;
                        if (publisher2 != null) {
                            str4 = publisher2.d;
                        }
                    } else {
                        str4 = currentUser.c;
                    }
                    Pair pair = new Pair(str3, str4);
                    String str6 = (String) pair.d();
                    String str7 = (String) pair.g();
                    PostEditingReason postEditingReason2 = editing.h;
                    WallOwner wallOwner = postingContext.b;
                    AdditionalSettingsConfiguration additionalSettingsConfiguration = postEditableData.q;
                    b = fkq0.b(wallOwner.b);
                    z4 = groupWallPostingSettings == null && groupWallPostingSettings.b;
                    if (z4) {
                        if ((groupWallPostingSettings != null ? groupWallPostingSettings.e : null) != GroupAdminLevel.MODERATOR) {
                            z5 = true;
                            boolean z12 = !vmc0.b(editing) && (!b || z4) && (!b || z5);
                            List<CoauthorDto> list8 = postEditableData.n;
                            boolean z13 = !(list8 != null || list8.isEmpty());
                            boolean b5 = fkq0.b(postingContext.b.b);
                            Boolean valueOf = userWallPostingSettings != null ? Boolean.valueOf(userWallPostingSettings.c) : null;
                            boolean booleanValue = valueOf != null ? valueOf.booleanValue() : postingSettings.d() && epx.f(groupWallPostingSettings != null ? Boolean.valueOf(groupWallPostingSettings.f) : null, Boolean.FALSE);
                            if (userWallPostingSettings != null) {
                                userType = UserType.WALL_OWNER;
                            } else {
                                if (groupWallPostingSettings != null) {
                                    GroupAdminLevel groupAdminLevel = groupWallPostingSettings.e;
                                    int i8 = groupAdminLevel == null ? -1 : a.$EnumSwitchMapping$0[groupAdminLevel.ordinal()];
                                    if (i8 == -1) {
                                        userType = UserType.GUEST;
                                    } else if (i8 == 1) {
                                        userType = UserType.MODERATOR;
                                    } else if (i8 == 2) {
                                        userType = UserType.EDITOR;
                                    } else {
                                        if (i8 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        userType = UserType.ADMINISTRATOR;
                                    }
                                }
                                userType = UserType.GUEST;
                            }
                            aVar.e(new fmc0.j.e(postEditingReason2, wallOwner, additionalSettingsConfiguration, z12, b5, z13, booleanValue, userType, postingSettings.d(), str6, str7, postingScreenContext.c));
                            return;
                        }
                    }
                    z5 = false;
                    if (vmc0.b(editing)) {
                        List<CoauthorDto> list82 = postEditableData.n;
                        boolean z132 = !(list82 != null || list82.isEmpty());
                        boolean b52 = fkq0.b(postingContext.b.b);
                        if (userWallPostingSettings != null) {
                        }
                        if (valueOf != null) {
                        }
                        if (userWallPostingSettings != null) {
                        }
                        aVar.e(new fmc0.j.e(postEditingReason2, wallOwner, additionalSettingsConfiguration, z12, b52, z132, booleanValue, userType, postingSettings.d(), str6, str7, postingScreenContext.c));
                        return;
                    }
                    List<CoauthorDto> list822 = postEditableData.n;
                    boolean z1322 = !(list822 != null || list822.isEmpty());
                    boolean b522 = fkq0.b(postingContext.b.b);
                    if (userWallPostingSettings != null) {
                    }
                    if (valueOf != null) {
                    }
                    if (userWallPostingSettings != null) {
                    }
                    aVar.e(new fmc0.j.e(postEditingReason2, wallOwner, additionalSettingsConfiguration, z12, b522, z1322, booleanValue, userType, postingSettings.d(), str6, str7, postingScreenContext.c));
                    return;
                }
                str4 = "";
                Pair pair2 = new Pair(str3, str4);
                String str62 = (String) pair2.d();
                String str72 = (String) pair2.g();
                PostEditingReason postEditingReason22 = editing.h;
                WallOwner wallOwner2 = postingContext.b;
                AdditionalSettingsConfiguration additionalSettingsConfiguration2 = postEditableData.q;
                b = fkq0.b(wallOwner2.b);
                if (groupWallPostingSettings == null) {
                }
                if (z4) {
                }
                z5 = false;
                if (vmc0.b(editing)) {
                }
                List<CoauthorDto> list8222 = postEditableData.n;
                boolean z13222 = !(list8222 != null || list8222.isEmpty());
                boolean b5222 = fkq0.b(postingContext.b.b);
                if (userWallPostingSettings != null) {
                }
                if (valueOf != null) {
                }
                if (userWallPostingSettings != null) {
                }
                aVar.e(new fmc0.j.e(postEditingReason22, wallOwner2, additionalSettingsConfiguration2, z12, b5222, z13222, booleanValue, userType, postingSettings.d(), str62, str72, postingScreenContext.c));
                return;
            }
            str3 = "";
            if (z11) {
            }
            str4 = "";
            Pair pair22 = new Pair(str3, str4);
            String str622 = (String) pair22.d();
            String str722 = (String) pair22.g();
            PostEditingReason postEditingReason222 = editing.h;
            WallOwner wallOwner22 = postingContext.b;
            AdditionalSettingsConfiguration additionalSettingsConfiguration22 = postEditableData.q;
            b = fkq0.b(wallOwner22.b);
            if (groupWallPostingSettings == null) {
            }
            if (z4) {
            }
            z5 = false;
            if (vmc0.b(editing)) {
            }
            List<CoauthorDto> list82222 = postEditableData.n;
            boolean z132222 = !(list82222 != null || list82222.isEmpty());
            boolean b52222 = fkq0.b(postingContext.b.b);
            if (userWallPostingSettings != null) {
            }
            if (valueOf != null) {
            }
            if (userWallPostingSettings != null) {
            }
            aVar.e(new fmc0.j.e(postEditingReason222, wallOwner22, additionalSettingsConfiguration22, z12, b52222, z132222, booleanValue, userType, postingSettings.d(), str622, str722, postingScreenContext.c));
            return;
        }
        if (postingStepScreen4 instanceof PostingStepScreen.MusicPicker) {
            ibc0Var.u().j();
            UserId userId3 = postingSettings.d() ? postingContext.b.b : null;
            int i9 = postingSettings.s;
            MusicAttachDto musicAttachDto = postEditableData.l;
            List singletonList = musicAttachDto instanceof MusicAttachDto.MusicTracksDto ? ((MusicAttachDto.MusicTracksDto) musicAttachDto).b : musicAttachDto instanceof MusicAttachDto.MusicSnippetDto ? Collections.singletonList(((MusicAttachDto.MusicSnippetDto) musicAttachDto).b) : EmptyList.b;
            MusicAttachDto musicAttachDto2 = postEditableData.l;
            aVar.e(new kmc0(userId3, i9, singletonList, musicAttachDto2 instanceof MusicAttachDto.MusicPlaylistDto ? ((MusicAttachDto.MusicPlaylistDto) musicAttachDto2).b : null, postingSettings.t, (musicAttachDto2 instanceof MusicAttachDto.MusicSnippetDto) || musicAttachDto2 == null, editing.o.g));
            return;
        }
        if (postingStepScreen4 instanceof PostingStepScreen.CoAuthorsPicker) {
            ibc0.g x = ibc0Var.x();
            List<CoauthorDto> list9 = postEditableData.n;
            if (list9 != null) {
                List<CoauthorDto> list10 = list9;
                arrayList = new ArrayList(c5g.u(list10, 10));
                Iterator it12 = list10.iterator();
                while (it12.hasNext()) {
                    arrayList.add(Long.valueOf(((CoauthorDto) it12.next()).b.b.b));
                }
            } else {
                arrayList = null;
            }
            x.k(arrayList);
            boolean f = epx.f(postEditableData.i, PrivacyPostType.AllUsers.b);
            boolean b6 = fkq0.b(postingContext.b.b);
            if (b6) {
                GroupWallPostingSettings groupWallPostingSettings2 = postingSettings.h;
            } else {
                UserWallPostingSettings userWallPostingSettings2 = postingSettings.g;
                if (userWallPostingSettings2 != null) {
                }
                z3 = false;
            }
            AdditionalSettingsConfiguration additionalSettingsConfiguration3 = postEditableData.q;
            boolean z14 = additionalSettingsConfiguration3 != null ? additionalSettingsConfiguration3.c : false;
            boolean z15 = postEditableData.t == null;
            if (postingContext.j) {
                aVar.e(new fmc0.p(new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_error_outline_28, R.attr.vk_ui_icon_accent_themed), new PostingUserMessageText.ResText(R.string.coauthor_restriction_archived_post), null)));
                return;
            }
            if (!f) {
                aVar.e(new fmc0.p(new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_lock_outline_28, R.attr.vk_ui_icon_accent_themed), new PostingUserMessageText.ResText(R.string.coauthor_restriction_privacy), new PostingUserMessageButton(new PostingUserMessageText.ResText(R.string.coauthor_restriction_privacy_button), new PostingAction.Navigation.OpenInCurrentStep(PostingStepScreen.PrivacySettingsBottomSheet.b), null, false, 12, null))));
                return;
            }
            if (!z3) {
                aVar.e(new fmc0.p(new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_lock_outline_28, R.attr.vk_ui_icon_accent_themed), new PostingUserMessageText.ResText(b6 ? R.string.coauthor_restriction_profile_community : R.string.coauthor_restriction_profile), new PostingUserMessageButton(new PostingUserMessageText.ResText(R.string.coauthor_restriction_profile_button), PostingAction.Editing.MakeProfileOpen.b, null, false, 12, null))));
                return;
            }
            if (z14) {
                aVar.e(new fmc0.p(new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_signature_outline_28, R.attr.vk_ui_icon_accent_themed), new PostingUserMessageText.ResText(R.string.coauthor_restriction_sign), new PostingUserMessageButton(new PostingUserMessageText.ResText(R.string.coauthor_restriction_sign_button), new PostingAction.Editing.EnableAuthorSign(false), null, false, 12, null))));
                return;
            } else if (z15) {
                aVar.e(new fmc0.j.g(postingContext.b.b, postEditableData.n));
                return;
            } else {
                aVar.e(new fmc0.p(new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_lock_outline_28, R.attr.vk_ui_icon_accent_themed), new PostingUserMessageText.ResText(R.string.coauthor_restriction_action_button), new PostingUserMessageButton(new PostingUserMessageText.ResText(R.string.coauthor_restriction_action_button_button), new PostingAction.Editing.SetActionButton(null), null, false, 12, null))));
                return;
            }
        }
        if (postingStepScreen4.equals(PostingStepScreen.FilePicker.b)) {
            aVar.e(jmc0.a);
            return;
        }
        if (postingStepScreen4 instanceof PostingStepScreen.PrivacySettingsBottomSheet) {
            ibc0Var.x().d();
            List<CoauthorDto> list11 = postEditableData.n;
            if (list11 != null && !list11.isEmpty()) {
                aVar.e(new fmc0.p(new PostingUserMessage.AlertDialog(new PostingUserMessageText.ResText(R.string.coauthor_restriction_privacy_dialog_title), new PostingUserMessageText.ResText(R.string.coauthor_restriction_privacy_dialog_subtitle), new PostingUserMessageButton(new PostingUserMessageText.ResText(R.string.coauthor_restriction_privacy_dialog_ok), new PostingAction.ComposableAction(e43.l(PostingAction.Editing.RemoveCoauthors.b, new PostingAction.Navigation.OpenInCurrentStep(PostingStepScreen.PrivacySettingsBottomSheet.b))), null, false, 12, null), new PostingUserMessageButton(new PostingUserMessageText.ResText(R.string.coauthor_restriction_privacy_dialog_cancel), null, null, false, 14, null), null, 16, null)));
                return;
            }
            if (!cpc0Var2.k()) {
                aVar.e(new fmc0.j.p(zaq.a(editing, cpc0Var2)));
                return;
            }
            az50 az50Var = (az50) this.h.getValue();
            efc0.a aVar6 = az50Var.a;
            efc0.a aVar7 = az50Var.a;
            cpc0 cpc0Var3 = az50Var.b;
            PostPrivacyData a2 = zaq.a(editing, cpc0Var3);
            List<DonutLevel> list12 = a2.f;
            if (list12.isEmpty() || !a2.b) {
                aVar7.e(new fmc0.j.p(zaq.a(editing, cpc0Var3)));
                return;
            }
            PrivacyPostType privacyPostType2 = postEditableData.i;
            PrivacyPostType.SingleDonutLevel singleDonutLevel2 = privacyPostType2 instanceof PrivacyPostType.SingleDonutLevel ? (PrivacyPostType.SingleDonutLevel) privacyPostType2 : null;
            if ((singleDonutLevel2 != null ? singleDonutLevel2.b : null) != null) {
                aVar7.e(new fmc0.j.p(zaq.a(editing, cpc0Var3)));
                return;
            }
            if (list12.size() != 1) {
                aVar6.e(new fmc0.j.r(zaq.a(editing, cpc0Var3)));
                return;
            }
            DonutLevel donutLevel2 = (DonutLevel) j5g.a0(postingSettings.o);
            if (donutLevel2 == null) {
                return;
            }
            PostPrivacyData a3 = zaq.a(editing, cpc0Var3);
            List<PrivacyPostType> list13 = a3.e;
            ArrayList arrayList11 = new ArrayList(c5g.u(list13, 10));
            for (Parcelable parcelable3 : list13) {
                if (parcelable3 instanceof PrivacyPostType.SingleDonutLevel) {
                    parcelable3 = new PrivacyPostType.SingleDonutLevel(donutLevel2);
                }
                arrayList11.add(parcelable3);
            }
            aVar6.e(new fmc0.j.p(PostPrivacyData.a(a3, new PrivacyPostType.SingleDonutLevel(donutLevel2), arrayList11, null, null, false, 243)));
            return;
        }
        if (!(postingStepScreen4 instanceof PostingStepScreen.ProductsPicker)) {
            if (postingStepScreen4 instanceof PostingStepScreen.NotificationDataLossDialog) {
                aVar.e(fmc0.j.n.a);
                return;
            } else {
                aVar.a(new e.c.d(new PostingStep(openInCurrentStep.b, false, false, null, 14, null)));
                return;
            }
        }
        List<PostingAttachment> list14 = postEditableData.p;
        ArrayList arrayList12 = new ArrayList();
        for (Object obj3 : list14) {
            if (obj3 instanceof PhotoDto) {
                arrayList12.add(obj3);
            }
        }
        ArrayList arrayList13 = new ArrayList();
        Iterator it13 = arrayList12.iterator();
        while (it13.hasNext()) {
            PhotoDto photoDto4 = (PhotoDto) it13.next();
            Attachment attachment3 = photoDto4.c;
            UploadDto.UploadState uploadState = photoDto4.f;
            boolean z16 = attachment3 instanceof PhotoAttachment;
            PhotoAttachment photoAttachment6 = z16 ? (PhotoAttachment) attachment3 : null;
            if (photoAttachment6 != null) {
                UploadDto.b7.getClass();
                Parcelable parcelable4 = !epx.f(uploadState, UploadDto.a.b) ? uploadState.h : attachment3;
                PhotoAttachment photoAttachment7 = parcelable4 instanceof PhotoAttachment ? (PhotoAttachment) parcelable4 : null;
                Pair<Integer, Integer> e = attachment3 instanceof LocalPhotoAttachment ? com.vk.newsfeed.posting.impl.domain.model.c.e((PhotoAttachment) attachment3) : z16 ? com.vk.newsfeed.posting.impl.domain.model.c.e((PhotoAttachment) attachment3) : null;
                if (e != null) {
                    int intValue = e.d().intValue();
                    int intValue2 = e.g().intValue();
                    if (photoAttachment7 != null) {
                        ImageSize k2 = his0.k(photoAttachment7);
                        bVar = new e.b(photoAttachment6, photoAttachment7, k2 != null ? k2.d.d : null, photoAttachment7.l, com.vk.newsfeed.posting.impl.domain.model.c.b(postEditableData.j, photoAttachment6), intValue, intValue2);
                    } else {
                        bVar = null;
                    }
                    bVar2 = bVar;
                    if (bVar2 == null) {
                        arrayList13.add(bVar2);
                    }
                }
            }
            bVar2 = null;
            if (bVar2 == null) {
            }
        }
        if (arrayList13.isEmpty()) {
            return;
        }
        PhotoTagsData photoTagsData = postEditableData.r;
        if (photoTagsData != null && (map = photoTagsData.b) != null && (entrySet = map.entrySet()) != null) {
            Iterator it14 = entrySet.iterator();
            while (true) {
                if (it14.hasNext()) {
                    obj = it14.next();
                    if (!((Collection) ((Map.Entry) obj).getValue()).isEmpty()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry != null) {
                num = (Integer) entry.getKey();
                it = arrayList13.iterator();
                i2 = 0;
                while (true) {
                    if (it.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    int i10 = ((e.b) it.next()).d.c;
                    if (num != null && i10 == num.intValue()) {
                        i3 = i2;
                        break;
                    }
                    i2++;
                }
                Integer valueOf2 = Integer.valueOf(i3);
                if (i3 == -1) {
                    valueOf2 = null;
                }
                int intValue3 = valueOf2 == null ? valueOf2.intValue() : 0;
                postingMetricEntryPoint = postingContext.h;
                if (postingMetricEntryPoint == null) {
                    postingMetricEntryPoint = PostingMetricEntryPoint.Other;
                }
                aVar.e(new omc0(new ga10(postingContext.b.b, postingMetricEntryPoint, Integer.valueOf(postEditableData.b), ibc0Var.g()), arrayList13, intValue3));
            }
        }
        num = null;
        it = arrayList13.iterator();
        i2 = 0;
        while (true) {
            if (it.hasNext()) {
            }
            i2++;
        }
        Integer valueOf22 = Integer.valueOf(i3);
        if (i3 == -1) {
        }
        if (valueOf22 == null) {
        }
        postingMetricEntryPoint = postingContext.h;
        if (postingMetricEntryPoint == null) {
        }
        aVar.e(new omc0(new ga10(postingContext.b.b, postingMetricEntryPoint, Integer.valueOf(postEditableData.b), ibc0Var.g()), arrayList13, intValue3));
    }

    public final void b(PostingState postingState, PostingStepScreen postingStepScreen) {
        nbq0 nbq0Var;
        Set set;
        Object obj;
        Map<Integer, List<PhotoTag>> map;
        Set<Integer> keySet;
        if (postingState instanceof PostingState.Editing) {
            PostingStepScreen.AttachmentPickers attachmentPickers = PostingStepScreen.AttachmentPickers.b;
            boolean z = !epx.f(postingStepScreen, attachmentPickers);
            PostingAction.Stats.SendWaitingAnalytics sendWaitingAnalytics = PostingAction.Stats.SendWaitingAnalytics.b;
            efc0.a aVar = this.a;
            aVar.d(sendWaitingAnalytics);
            e(postingStepScreen, true);
            if (epx.f(postingStepScreen, attachmentPickers)) {
                PostingState.Editing editing = (PostingState.Editing) postingState;
                PostEditableData postEditableData = editing.i;
                PostEditableData postEditableData2 = editing.i;
                List<PostingAttachment> list = postEditableData.p;
                MusicAttachDto musicAttachDto = postEditableData.l;
                Iterator<T> it = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    nbq0Var = this.b;
                    if (!hasNext) {
                        break;
                    }
                    PostingAttachment postingAttachment = (PostingAttachment) it.next();
                    if (postingAttachment instanceof UploadDto) {
                        UploadDto uploadDto = (UploadDto) postingAttachment;
                        if (uploadDto.I4().e()) {
                            nbq0Var.c(uploadDto, null, true);
                        }
                    }
                }
                if (musicAttachDto instanceof MusicAttachDto.MusicPlaylistDto) {
                    if (((MusicAttachDto.MusicPlaylistDto) musicAttachDto).b.n.e()) {
                        nbq0Var.c(((MusicAttachDto.MusicPlaylistDto) musicAttachDto).b, null, true);
                    }
                } else if (musicAttachDto instanceof MusicAttachDto.MusicTracksDto) {
                    for (MusicDto musicDto : ((MusicAttachDto.MusicTracksDto) musicAttachDto).b) {
                        if (musicDto.n.e()) {
                            nbq0Var.c(musicDto, null, true);
                        }
                    }
                }
                ArrayList a2 = n2c0.a(postEditableData2);
                ArrayList arrayList = new ArrayList();
                Iterator it2 = a2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (((Photo) next).r) {
                        arrayList.add(next);
                    }
                }
                PhotoTagsData photoTagsData = postEditableData2.r;
                if (photoTagsData == null || (map = photoTagsData.b) == null || (keySet = map.keySet()) == null || (set = j5g.S0(keySet)) == null) {
                    set = EmptySet.b;
                }
                if (photoTagsData == null || (obj = photoTagsData.c) == null) {
                    obj = EmptySet.b;
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                g5g.D(arrayList2, true, new defpackage.v(16, set, obj));
                if (!arrayList2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        Photo photo = (Photo) it3.next();
                        arrayList3.add(new PhotoTagRequestParam(photo.c, photo.e, photo.v));
                    }
                    aVar.d(new PostingAction.Fetch.LoadPhotoTags(arrayList3));
                }
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(Integer.valueOf(((Photo) it4.next()).c));
                }
                Set g = izi0.g(set, j5g.S0(arrayList4));
                if (!g.isEmpty()) {
                    aVar.a(new ric0(g));
                }
            }
            aVar.e(gmc0.a);
            aVar.a(new e.c.C1427c(new PostingStep(postingStepScreen, false, z, null, 8, null)));
            aVar.a(ijc0.b);
        }
    }

    public final boolean d(PostingState.Editing editing) {
        PostEditingReason postEditingReason = editing.h;
        PostEditableData postEditableData = editing.i;
        return (!(editing.h instanceof PostEditingReason.EditExistingPost) || ((postEditingReason instanceof PostEditingReason.EditExistingPost) && editing.j.o != null && postEditableData.o == null)) && postEditableData.o == null && tuk0.a(editing) && !(n2c0.b(postEditableData, this.e) && vmc0.a(editing));
    }

    public final void e(PostingStepScreen postingStepScreen, boolean z) {
        boolean f = epx.f(postingStepScreen, PostingStepScreen.PostTextInput.b);
        efc0.a aVar = this.a;
        ibc0 ibc0Var = this.c;
        if (f) {
            ibc0Var.h().c();
            aVar.e(new fmc0.x(new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.POSTING_1), z));
        } else if (epx.f(postingStepScreen, PostingStepScreen.AttachmentPickers.b)) {
            ibc0Var.h().b();
            aVar.e(new fmc0.x(new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.POSTING_2), z));
        }
    }
}
