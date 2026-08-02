package xsna;

import com.vkontakte.android.R;
import xsna.zqe;

/* compiled from: ClipsPlaylistPopupItem.kt */
/* loaded from: classes16.dex */
public interface vqe {

    /* compiled from: ClipsPlaylistPopupItem.kt */
    public static final class a implements vqe {
        public static final a a = new a();

        @Override // xsna.vqe
        public final int getIcon() {
            return R.drawable.vk_icon_list_add_outline_20;
        }

        @Override // xsna.vqe
        public final int getTitle() {
            return R.string.clips_playlist_ui_picker_action_add_clips;
        }

        @Override // xsna.vqe
        public final zqe.i h() {
            return zqe.i.a.b;
        }

        @Override // xsna.vqe
        public final String i() {
            return "PlaylistAddClips";
        }

        @Override // xsna.vqe
        public final long j(androidx.compose.runtime.a aVar) {
            aVar.K(482460564);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(482460564, 0, -1, "com.vk.clips.playlists.playlist_ui.model.ClipsPlaylistPopupItem.AddClips.<get-tintComposeColor> (ClipsPlaylistPopupItem.kt:43)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            return j;
        }
    }

    /* compiled from: ClipsPlaylistPopupItem.kt */
    public static final class b implements vqe {
        public static final b a = new b();

        @Override // xsna.vqe
        public final int getIcon() {
            return R.drawable.vk_icon_list_delete_outline_20;
        }

        @Override // xsna.vqe
        public final int getTitle() {
            return R.string.clips_playlist_ui_picker_action_delete_clips;
        }

        @Override // xsna.vqe
        public final zqe.i h() {
            return zqe.i.d.b;
        }

        @Override // xsna.vqe
        public final String i() {
            return "PlaylistDeleteClips";
        }

        @Override // xsna.vqe
        public final long j(androidx.compose.runtime.a aVar) {
            aVar.K(-79870156);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-79870156, 0, -1, "com.vk.clips.playlists.playlist_ui.model.ClipsPlaylistPopupItem.DeleteClips.<get-tintComposeColor> (ClipsPlaylistPopupItem.kt:53)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            return j;
        }
    }

    /* compiled from: ClipsPlaylistPopupItem.kt */
    public static final class c implements vqe {
        public static final c a = new c();

        @Override // xsna.vqe
        public final int getIcon() {
            return R.drawable.vk_icon_delete_outline_20;
        }

        @Override // xsna.vqe
        public final int getTitle() {
            return R.string.clips_playlist_ui_picker_action_delete;
        }

        @Override // xsna.vqe
        public final zqe.i h() {
            return zqe.i.c.b;
        }

        @Override // xsna.vqe
        public final String i() {
            return "PlaylistDeleteButton";
        }

        @Override // xsna.vqe
        public final long j(androidx.compose.runtime.a aVar) {
            aVar.K(-324734823);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-324734823, 0, -1, "com.vk.clips.playlists.playlist_ui.model.ClipsPlaylistPopupItem.DeletePlaylist.<get-tintComposeColor> (ClipsPlaylistPopupItem.kt:33)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().h;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            return j;
        }
    }

    /* compiled from: ClipsPlaylistPopupItem.kt */
    public static final class d implements vqe {
        public static final d a = new d();

        @Override // xsna.vqe
        public final int getIcon() {
            return R.drawable.vk_icon_write_outline_20;
        }

        @Override // xsna.vqe
        public final int getTitle() {
            return R.string.clips_playlist_ui_picker_action_rename_playlist;
        }

        @Override // xsna.vqe
        public final zqe.i h() {
            return zqe.i.e.b;
        }

        @Override // xsna.vqe
        public final String i() {
            return "PlaylistRename";
        }

        @Override // xsna.vqe
        public final long j(androidx.compose.runtime.a aVar) {
            aVar.K(-750653416);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-750653416, 0, -1, "com.vk.clips.playlists.playlist_ui.model.ClipsPlaylistPopupItem.Rename.<get-tintComposeColor> (ClipsPlaylistPopupItem.kt:71)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            return j;
        }
    }

    /* compiled from: ClipsPlaylistPopupItem.kt */
    public static final class e implements vqe {
        public static final e a = new e();

        @Override // xsna.vqe
        public final int getIcon() {
            return R.drawable.vk_icon_sort_outline_20;
        }

        @Override // xsna.vqe
        public final int getTitle() {
            return R.string.clips_playlist_ui_picker_action_reorder_clips;
        }

        @Override // xsna.vqe
        public final zqe.i h() {
            return zqe.i.f.b;
        }

        @Override // xsna.vqe
        public final String i() {
            return "PlaylistReorderClips";
        }

        @Override // xsna.vqe
        public final long j(androidx.compose.runtime.a aVar) {
            aVar.K(-1527427247);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1527427247, 0, -1, "com.vk.clips.playlists.playlist_ui.model.ClipsPlaylistPopupItem.Reorder.<get-tintComposeColor> (ClipsPlaylistPopupItem.kt:62)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            return j;
        }
    }

    /* compiled from: ClipsPlaylistPopupItem.kt */
    public static final class f implements vqe {
        public static final f a = new f();

        @Override // xsna.vqe
        public final int getIcon() {
            return R.drawable.vk_icon_share_outline_20;
        }

        @Override // xsna.vqe
        public final int getTitle() {
            return R.string.clips_playlist_ui_picker_action_share_playlist;
        }

        @Override // xsna.vqe
        public final zqe.i h() {
            return zqe.i.h.b;
        }

        @Override // xsna.vqe
        public final String i() {
            return "PlaylistShare";
        }

        @Override // xsna.vqe
        public final long j(androidx.compose.runtime.a aVar) {
            aVar.K(-1689062483);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1689062483, 0, -1, "com.vk.clips.playlists.playlist_ui.model.ClipsPlaylistPopupItem.Share.<get-tintComposeColor> (ClipsPlaylistPopupItem.kt:80)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            return j;
        }
    }

    int getIcon();

    int getTitle();

    zqe.i h();

    String i();

    long j(androidx.compose.runtime.a aVar);
}
