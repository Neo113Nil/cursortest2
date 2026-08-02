package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.posting.attachments.PendingVideoAttachmentWrapper;
import com.vk.newsfeed.common.presentation.model.items.attachments.video.VideoSimpleHolderUiDto;
import com.vk.pending.PendingVideoAttachment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: VideoSimpleHolderTransformer.kt */
/* loaded from: classes4.dex */
public final class vgt0 implements gn60<mds0, wm60> {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
    
        if (r11.F == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0099, code lost:
    
        if (r11.F == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b7  */
    @Override // xsna.gn60
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List x(mds0 mds0Var, wm60 wm60Var) {
        boolean z;
        ArrayList arrayList;
        VideoFile videoFile;
        VideoFile videoFile2;
        NewsEntry newsEntry = mds0Var.a;
        NewsEntry newsEntry2 = mds0Var.b;
        VideoAttachment videoAttachment = mds0Var.c;
        int i = mds0Var.d;
        VideoFile videoFile3 = videoAttachment.k;
        PendingVideoAttachment pendingVideoAttachment = videoAttachment instanceof PendingVideoAttachmentWrapper ? ((PendingVideoAttachmentWrapper) videoAttachment).p : videoAttachment instanceof PendingVideoAttachment ? (PendingVideoAttachment) videoAttachment : null;
        boolean z2 = pendingVideoAttachment != null;
        boolean c = fxc0.B().c(videoFile3);
        boolean W9 = videoFile3.W9();
        boolean c2 = g620.f().c(videoFile3);
        boolean w8 = videoFile3.w8();
        boolean z3 = (c || c2) ? false : true;
        int i2 = (!z3 || W9) ? 8 : 0;
        int i3 = (z3 && W9) ? 0 : 8;
        int i4 = videoFile3.x0() ? R.drawable.bg_video_live : R.drawable.bg_video_duration_label_old;
        int i5 = w8 ? R.drawable.youtube_logo : R.drawable.ic_attachment_video_play;
        NewsEntry newsEntry3 = mds0Var.a;
        NewsEntry newsEntry4 = mds0Var.b;
        if (newsEntry3 instanceof Post) {
            Post post = (Post) newsEntry3;
            if (!post.dc()) {
            }
            z = true;
            List Fb = !z2 ? pendingVideoAttachment.k.getImage().Fb() : EmptyList.b;
            VideoFile videoFile4 = videoAttachment.k;
            if (!z) {
                sr10 sr10Var = dy2.a;
                if (!(sr10Var != null ? sr10Var.c() : true)) {
                    arrayList = videoFile4.getImage().b;
                    ArrayList arrayList2 = arrayList;
                    boolean z4 = videoFile3 instanceof MusicVideoFile;
                    return Collections.singletonList(new VideoSimpleHolderUiDto(newsEntry, newsEntry2, videoAttachment, videoFile3, (pendingVideoAttachment != null || (videoFile2 = pendingVideoAttachment.k) == null) ? videoFile3.getWidth() : videoFile2.getWidth(), (pendingVideoAttachment != null || (videoFile = pendingVideoAttachment.k) == null) ? videoFile3.getHeight() : videoFile.getHeight(), videoAttachment.l, z4 ? VideoSimpleHolderUiDto.TitleTextMode.MUSIC_VIDEO : videoAttachment.h == null ? VideoSimpleHolderUiDto.TitleTextMode.NONE : VideoSimpleHolderUiDto.TitleTextMode.DEFAULT, z4 ? VideoSimpleHolderUiDto.SubtitleTextMode.MUSIC_VIDEO : (c2 || videoFile3.L8() == 0) ? VideoSimpleHolderUiDto.SubtitleTextMode.NONE : VideoSimpleHolderUiDto.SubtitleTextMode.VIEWS, z2, z, c, W9, w8, i2, i3, i4, i5, Fb, arrayList2, i));
                }
            }
            Image image = videoFile4.getImage();
            arrayList = !image.Db() ? image.c : image.b;
            ArrayList arrayList22 = arrayList;
            boolean z42 = videoFile3 instanceof MusicVideoFile;
            return Collections.singletonList(new VideoSimpleHolderUiDto(newsEntry, newsEntry2, videoAttachment, videoFile3, (pendingVideoAttachment != null || (videoFile2 = pendingVideoAttachment.k) == null) ? videoFile3.getWidth() : videoFile2.getWidth(), (pendingVideoAttachment != null || (videoFile = pendingVideoAttachment.k) == null) ? videoFile3.getHeight() : videoFile.getHeight(), videoAttachment.l, z42 ? VideoSimpleHolderUiDto.TitleTextMode.MUSIC_VIDEO : videoAttachment.h == null ? VideoSimpleHolderUiDto.TitleTextMode.NONE : VideoSimpleHolderUiDto.TitleTextMode.DEFAULT, z42 ? VideoSimpleHolderUiDto.SubtitleTextMode.MUSIC_VIDEO : (c2 || videoFile3.L8() == 0) ? VideoSimpleHolderUiDto.SubtitleTextMode.NONE : VideoSimpleHolderUiDto.SubtitleTextMode.VIEWS, z2, z, c, W9, w8, i2, i3, i4, i5, Fb, arrayList22, i));
        }
        if (newsEntry4 instanceof Post) {
            Post post2 = (Post) newsEntry4;
            if (!post2.dc()) {
            }
            z = true;
            List Fb2 = !z2 ? pendingVideoAttachment.k.getImage().Fb() : EmptyList.b;
            VideoFile videoFile42 = videoAttachment.k;
            if (!z) {
            }
            Image image2 = videoFile42.getImage();
            if (!image2.Db()) {
            }
            ArrayList arrayList222 = arrayList;
            boolean z422 = videoFile3 instanceof MusicVideoFile;
            return Collections.singletonList(new VideoSimpleHolderUiDto(newsEntry, newsEntry2, videoAttachment, videoFile3, (pendingVideoAttachment != null || (videoFile2 = pendingVideoAttachment.k) == null) ? videoFile3.getWidth() : videoFile2.getWidth(), (pendingVideoAttachment != null || (videoFile = pendingVideoAttachment.k) == null) ? videoFile3.getHeight() : videoFile.getHeight(), videoAttachment.l, z422 ? VideoSimpleHolderUiDto.TitleTextMode.MUSIC_VIDEO : videoAttachment.h == null ? VideoSimpleHolderUiDto.TitleTextMode.NONE : VideoSimpleHolderUiDto.TitleTextMode.DEFAULT, z422 ? VideoSimpleHolderUiDto.SubtitleTextMode.MUSIC_VIDEO : (c2 || videoFile3.L8() == 0) ? VideoSimpleHolderUiDto.SubtitleTextMode.NONE : VideoSimpleHolderUiDto.SubtitleTextMode.VIEWS, z2, z, c, W9, w8, i2, i3, i4, i5, Fb2, arrayList222, i));
        }
        if (!(newsEntry4 instanceof ShitAttachment) && !(newsEntry3 instanceof ShitAttachment)) {
            z = false;
            List Fb22 = !z2 ? pendingVideoAttachment.k.getImage().Fb() : EmptyList.b;
            VideoFile videoFile422 = videoAttachment.k;
            if (!z) {
            }
            Image image22 = videoFile422.getImage();
            if (!image22.Db()) {
            }
            ArrayList arrayList2222 = arrayList;
            boolean z4222 = videoFile3 instanceof MusicVideoFile;
            return Collections.singletonList(new VideoSimpleHolderUiDto(newsEntry, newsEntry2, videoAttachment, videoFile3, (pendingVideoAttachment != null || (videoFile2 = pendingVideoAttachment.k) == null) ? videoFile3.getWidth() : videoFile2.getWidth(), (pendingVideoAttachment != null || (videoFile = pendingVideoAttachment.k) == null) ? videoFile3.getHeight() : videoFile.getHeight(), videoAttachment.l, z4222 ? VideoSimpleHolderUiDto.TitleTextMode.MUSIC_VIDEO : videoAttachment.h == null ? VideoSimpleHolderUiDto.TitleTextMode.NONE : VideoSimpleHolderUiDto.TitleTextMode.DEFAULT, z4222 ? VideoSimpleHolderUiDto.SubtitleTextMode.MUSIC_VIDEO : (c2 || videoFile3.L8() == 0) ? VideoSimpleHolderUiDto.SubtitleTextMode.NONE : VideoSimpleHolderUiDto.SubtitleTextMode.VIEWS, z2, z, c, W9, w8, i2, i3, i4, i5, Fb22, arrayList2222, i));
        }
        z = true;
        List Fb222 = !z2 ? pendingVideoAttachment.k.getImage().Fb() : EmptyList.b;
        VideoFile videoFile4222 = videoAttachment.k;
        if (!z) {
        }
        Image image222 = videoFile4222.getImage();
        if (!image222.Db()) {
        }
        ArrayList arrayList22222 = arrayList;
        boolean z42222 = videoFile3 instanceof MusicVideoFile;
        return Collections.singletonList(new VideoSimpleHolderUiDto(newsEntry, newsEntry2, videoAttachment, videoFile3, (pendingVideoAttachment != null || (videoFile2 = pendingVideoAttachment.k) == null) ? videoFile3.getWidth() : videoFile2.getWidth(), (pendingVideoAttachment != null || (videoFile = pendingVideoAttachment.k) == null) ? videoFile3.getHeight() : videoFile.getHeight(), videoAttachment.l, z42222 ? VideoSimpleHolderUiDto.TitleTextMode.MUSIC_VIDEO : videoAttachment.h == null ? VideoSimpleHolderUiDto.TitleTextMode.NONE : VideoSimpleHolderUiDto.TitleTextMode.DEFAULT, z42222 ? VideoSimpleHolderUiDto.SubtitleTextMode.MUSIC_VIDEO : (c2 || videoFile3.L8() == 0) ? VideoSimpleHolderUiDto.SubtitleTextMode.NONE : VideoSimpleHolderUiDto.SubtitleTextMode.VIEWS, z2, z, c, W9, w8, i2, i3, i4, i5, Fb222, arrayList22222, i));
    }
}
