package xsna;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.video.VideoAlbum;
import com.vk.video.ui.edit.fragments.VideoAlbumEditorFragment;

/* compiled from: VideoAlbumEditorFragment.kt */
/* loaded from: classes7.dex */
public final class a1s0 extends beg0 {
    public final /* synthetic */ VideoAlbumEditorFragment d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1s0(VideoAlbumEditorFragment videoAlbumEditorFragment, String str, FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.d = videoAlbumEditorFragment;
        this.e = str;
    }

    @Override // xsna.beg0
    public final void r() {
        Bundle arguments;
        VideoAlbum videoAlbum;
        VideoAlbumEditorFragment videoAlbumEditorFragment = this.d;
        com.vk.dto.common.VideoAlbum videoAlbum2 = videoAlbumEditorFragment.g0;
        String str = this.e;
        if (videoAlbum2 != null) {
            if (videoAlbum2 != null) {
                videoAlbum2.c = str;
            }
            if (videoAlbum2 != null) {
                videoAlbum2.i = videoAlbumEditorFragment.a0.e;
            }
        } else {
            VideoAlbum videoAlbum3 = videoAlbumEditorFragment.f0;
            if (videoAlbum3 != null) {
                videoAlbum3.d = str;
            }
            if (videoAlbum3 != null) {
                videoAlbum3.j = videoAlbumEditorFragment.a0.e;
            }
        }
        if (videoAlbumEditorFragment.getArguments() != null && (arguments = videoAlbumEditorFragment.getArguments()) != null && arguments.getBoolean("should_notify_video_bus") && (videoAlbum = videoAlbumEditorFragment.f0) != null && videoAlbum != null) {
            wjs0.a(new jwr0(videoAlbum, "albums_update"));
        }
        videoAlbumEditorFragment.Mf(-1, new Intent().putExtra("album", videoAlbumEditorFragment.g0));
    }
}
