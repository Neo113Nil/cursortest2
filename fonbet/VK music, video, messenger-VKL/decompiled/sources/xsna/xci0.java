package xsna;

import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.im.Image;
import com.vk.dto.photo.Photo;
import com.vk.mediastore.system.MediaStoreImageEntry;
import com.vk.newsfeed.posting.api.analytics.PostingAttachmentInfo;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.impl.domain.model.PhotoVideoAttachmentsCropData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Picker$SavePickTime;
import com.vk.newsfeed.posting.impl.domain.model.PostingContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.VkMediaEntry$VkPhoto;
import com.vk.newsfeed.posting.impl.domain.model.VkMediaEntry$VkVideo;
import com.vk.newsfeed.posting.impl.domain.model.e;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.efc0;
import xsna.fmc0;
import xsna.wq10;

/* compiled from: SelectionFeatureDelegate.kt */
/* loaded from: classes4.dex */
public final class xci0 {
    public final efc0.a a;
    public final ibc0 b;

    public xci0(efc0.a aVar, ibc0 ibc0Var) {
        this.a = aVar;
        this.b = ibc0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(PostingState postingState, Attachment attachment) {
        if (attachment instanceof AlbumAttachment) {
            e(postingState, new PostingAction.MediaPicker.Selection.RemoveAttach(attachment));
            return;
        }
        if (attachment instanceof cvz) {
            d(postingState, new MediaPickerSelectedItem.LocalMedia(((cvz) attachment).M3()));
            return;
        }
        if (attachment instanceof PhotoAttachment) {
            d(postingState, new MediaPickerSelectedItem.VkPhoto(new VkMediaEntry$VkPhoto(((PhotoAttachment) attachment).l)));
        } else if (attachment instanceof VideoAttachment) {
            d(postingState, new MediaPickerSelectedItem.VkVideo(new VkMediaEntry$VkVideo(((VideoAttachment) attachment).k)));
        } else {
            e(postingState, new PostingAction.MediaPicker.Selection.RemoveAttach(attachment));
        }
    }

    public final void b(boolean z, PostingState.Editing editing, MediaPickerSelectedItem.LocalMedia localMedia, long j) {
        LocalMediaEntry localMediaEntry = localMedia.b;
        PostingContext postingContext = editing.c;
        PostingSettings postingSettings = editing.d;
        MediaPickerState mediaPickerState = editing.f;
        long j2 = postingContext.b.b.b;
        efc0.a aVar = this.a;
        if (z) {
            f(editing, j2, localMediaEntry);
        } else if (localMediaEntry instanceof LocalMediaEntry.Image) {
            LocalMediaEntry.Image image = (LocalMediaEntry.Image) localMediaEntry;
            PostingAttachmentInfo e = kbc0.e(image, j2);
            MediaStoreImageEntry mediaStoreImageEntry = image.b;
            aVar.d(new PostingAction.Stats.SendAttachPhoto(e, mediaStoreImageEntry.m, mediaStoreImageEntry.n, mediaStoreImageEntry.k));
        } else {
            if (!(localMediaEntry instanceof LocalMediaEntry.Video)) {
                throw new NoWhenBranchMatchedException();
            }
            this.b.u().C(kbc0.f((LocalMediaEntry.Video) localMediaEntry, j2));
        }
        boolean z2 = !z;
        aVar.a(new e.b.h.c(localMedia, z2));
        aVar.e(new fmc0.h.b(new wq10.a(localMediaEntry.ba()), z2));
        List<PostingAttachment> list = editing.i.p;
        int size = mediaPickerState.e.size();
        int i = postingSettings.c;
        int i2 = postingSettings.c;
        boolean z3 = size >= i || list.size() >= i2;
        if (!z && z3) {
            aVar.e(new fmc0.h.d(i2));
        } else {
            if (z || mediaPickerState.e.contains(localMedia)) {
                return;
            }
            aVar.d(new PostingAction$TechStats$Picker$SavePickTime(MobileOfficialAppsFeedStat$PickerType.PHOTO, Long.valueOf(j), null, 4, null));
        }
    }

    public final void c(boolean z, PostingState.Editing editing, MediaPickerSelectedItem.VkPhoto vkPhoto, long j) {
        VkMediaEntry$VkPhoto vkMediaEntry$VkPhoto = vkPhoto.b;
        efc0.a aVar = this.a;
        if (z) {
            g(editing, vkMediaEntry$VkPhoto);
        } else {
            Photo photo = vkMediaEntry$VkPhoto.b;
            ImageSize j2 = his0.j(photo);
            aVar.d(new PostingAction.Stats.SendAttachPhotoVk(new PostingAttachmentInfo(photo.e.b, photo.c, null, null, null, 28, null), j2 != null ? Integer.valueOf(j2.d.b) : null, j2 != null ? Integer.valueOf(j2.d.c) : null, photo));
        }
        Photo photo2 = vkMediaEntry$VkPhoto.b;
        aVar.a(new e.b.h.C1426e(vkMediaEntry$VkPhoto, !z));
        PhotoAttachment photoAttachment = new PhotoAttachment(photo2);
        if (z) {
            aVar.e(new fmc0.h.e(photo2, false));
            return;
        }
        if (z) {
            return;
        }
        if (icc0.b(editing)) {
            aVar.e(new fmc0.h.d(editing.d.c));
        } else if (icc0.a(editing, photoAttachment)) {
            aVar.d(new PostingAction$TechStats$Picker$SavePickTime(MobileOfficialAppsFeedStat$PickerType.PHOTO_VK, Long.valueOf(j), null, 4, null));
            aVar.e(new fmc0.h.e(photo2, true));
        }
    }

    public final void d(PostingState postingState, MediaPickerSelectedItem mediaPickerSelectedItem) {
        boolean z = mediaPickerSelectedItem instanceof MediaPickerSelectedItem.LocalMedia;
        efc0.a aVar = this.a;
        if (z) {
            MediaPickerSelectedItem.LocalMedia localMedia = (MediaPickerSelectedItem.LocalMedia) mediaPickerSelectedItem;
            f(postingState, postingState.getContext().b.b.b, localMedia.b);
            aVar.a(new e.b.h.c(localMedia, false));
        } else {
            if (mediaPickerSelectedItem instanceof MediaPickerSelectedItem.VkPhoto) {
                VkMediaEntry$VkPhoto vkMediaEntry$VkPhoto = ((MediaPickerSelectedItem.VkPhoto) mediaPickerSelectedItem).b;
                g(postingState, vkMediaEntry$VkPhoto);
                aVar.a(new e.b.h.C1426e(vkMediaEntry$VkPhoto, false));
                aVar.e(new fmc0.h.e(vkMediaEntry$VkPhoto.b, false));
                return;
            }
            if (!(mediaPickerSelectedItem instanceof MediaPickerSelectedItem.VkVideo)) {
                throw new NoWhenBranchMatchedException();
            }
            VkMediaEntry$VkVideo vkMediaEntry$VkVideo = ((MediaPickerSelectedItem.VkVideo) mediaPickerSelectedItem).b;
            VideoFile videoFile = vkMediaEntry$VkVideo.b;
            this.b.u().t(new PostingAttachmentInfo(videoFile.I0().b, videoFile.o0(), null, null, null, 28, null));
            aVar.a(new e.b.h.f(vkMediaEntry$VkVideo, false));
            aVar.e(new fmc0.h.f(videoFile, false));
        }
    }

    public final void e(PostingState postingState, PostingAction.MediaPicker.Selection.RemoveAttach removeAttach) {
        if (postingState instanceof PostingState.Editing) {
            Attachment attachment = removeAttach.b;
            if ((attachment instanceof ArticleAttachment) || (attachment instanceof SnippetAttachment) || (attachment instanceof AlbumAttachment)) {
                this.a.a(new e.b.h.d(attachment));
            }
        }
    }

    public final void f(PostingState postingState, long j, LocalMediaEntry localMediaEntry) {
        PostEditableData postEditableData;
        PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData;
        boolean z = localMediaEntry instanceof LocalMediaEntry.Image;
        ibc0 ibc0Var = this.b;
        if (!z) {
            if (!(localMediaEntry instanceof LocalMediaEntry.Video)) {
                throw new NoWhenBranchMatchedException();
            }
            ibc0Var.u().t(kbc0.f((LocalMediaEntry.Video) localMediaEntry, j));
        } else {
            PostingState.Editing editing = postingState instanceof PostingState.Editing ? (PostingState.Editing) postingState : null;
            ImageCropArea c = (editing == null || (postEditableData = editing.i) == null || (photoVideoAttachmentsCropData = postEditableData.j) == null) ? null : com.vk.newsfeed.posting.impl.domain.model.c.c(photoVideoAttachmentsCropData, localMediaEntry);
            LocalMediaEntry.Image image = (LocalMediaEntry.Image) localMediaEntry;
            MediaStoreImageEntry mediaStoreImageEntry = image.b;
            ibc0Var.u().l(kbc0.e(image, j), new o5a0(mediaStoreImageEntry.m, mediaStoreImageEntry.n, c != null ? Integer.valueOf(c.f) : null, c != null ? Integer.valueOf(c.g) : null));
        }
    }

    public final void g(PostingState postingState, VkMediaEntry$VkPhoto vkMediaEntry$VkPhoto) {
        PostEditableData postEditableData;
        PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData;
        Photo photo = vkMediaEntry$VkPhoto.b;
        o5a0 o5a0Var = null;
        PostingState.Editing editing = postingState instanceof PostingState.Editing ? (PostingState.Editing) postingState : null;
        ImageCropArea c = (editing == null || (postEditableData = editing.i) == null || (photoVideoAttachmentsCropData = postEditableData.j) == null) ? null : com.vk.newsfeed.posting.impl.domain.model.c.c(photoVideoAttachmentsCropData, vkMediaEntry$VkPhoto);
        ImageSize j = his0.j(photo);
        if (j != null) {
            Image image = j.d;
            o5a0Var = new o5a0(image.b, image.c, c != null ? Integer.valueOf(c.f) : null, c != null ? Integer.valueOf(c.g) : null);
        }
        this.b.u().l(new PostingAttachmentInfo(photo.e.b, photo.c, null, null, null, 28, null), o5a0Var);
    }
}
