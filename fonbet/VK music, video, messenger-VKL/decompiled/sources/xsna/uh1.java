package xsna;

import android.content.Context;
import com.vkontakte.android.R;

/* compiled from: AlbumDetailsPopupMenuItem.kt */
/* loaded from: classes4.dex */
public abstract class uh1 {
    public final int a;
    public final int b;
    public final int c;

    /* compiled from: AlbumDetailsPopupMenuItem.kt */
    public static final class a extends uh1 {
        public static final a d = new a(R.string.album_details_delete_album, R.drawable.vk_icon_delete_outline_28, R.attr.vk_ui_icon_negative);
    }

    /* compiled from: AlbumDetailsPopupMenuItem.kt */
    public static final class b extends uh1 {
        public static final b d = new b(R.string.album_details_download_album, R.drawable.vk_icon_download_outline_28);
    }

    /* compiled from: AlbumDetailsPopupMenuItem.kt */
    public static final class c extends uh1 {
        public static final c d = new c(R.string.album_details_edit_album, R.drawable.vk_icon_edit_outline_28);
    }

    /* compiled from: AlbumDetailsPopupMenuItem.kt */
    public static final class d extends uh1 {
        public static final d d = new d(R.string.album_details_multiselect, R.drawable.vk_icon_check_circle_outline_28);
    }

    /* compiled from: AlbumDetailsPopupMenuItem.kt */
    public static final class e extends uh1 {
        public static final e d = new e(R.string.album_details_share_album, R.drawable.vk_icon_share_outline_28);
    }

    /* compiled from: AlbumDetailsPopupMenuItem.kt */
    public static final class f extends uh1 {
        public static final f d = new f(R.string.album_details_sort, R.drawable.vk_icon_sort_outline_28);
    }

    /* compiled from: AlbumDetailsPopupMenuItem.kt */
    public static abstract class g extends uh1 {
        public final int d;
        public final int e;

        /* compiled from: AlbumDetailsPopupMenuItem.kt */
        public static final class a extends g {
        }

        /* compiled from: AlbumDetailsPopupMenuItem.kt */
        public static final class b extends g {
        }

        public g(int i, int i2, int i3, int i4, int i5) {
            super(i, i3, i5);
            this.d = i2;
            this.e = i4;
        }

        @Override // xsna.uh1
        public final String a(Context context) {
            int i = this.e;
            return i == 1 ? context.getString(this.a) : enj.f(this.d, i, context);
        }
    }

    /* compiled from: AlbumDetailsPopupMenuItem.kt */
    public static final class h extends uh1 {
        public static final h d = new h(R.string.album_details_archive_photo, R.drawable.vk_icon_archive_outline_28);
    }

    /* compiled from: AlbumDetailsPopupMenuItem.kt */
    public static final class i extends uh1 {
        public static final i d = new i(R.string.album_details_delete_photo, R.drawable.vk_icon_delete_outline_28, R.attr.vk_ui_icon_negative);
    }

    /* compiled from: AlbumDetailsPopupMenuItem.kt */
    public static final class j extends uh1 {
        public static final j d = new j(R.string.album_details_download_photo, R.drawable.vk_icon_download_outline_28);
    }

    /* compiled from: AlbumDetailsPopupMenuItem.kt */
    public static final class k extends uh1 {
        public static final k d = new k(R.string.album_details_move_photo, R.drawable.vk_icon_arrow_right_square_outline_28);
    }

    /* compiled from: AlbumDetailsPopupMenuItem.kt */
    public static final class l extends uh1 {
        public static final l d = new l(R.string.album_details_share_photo, R.drawable.vk_icon_share_outline_28);
    }

    public /* synthetic */ uh1(int i2, int i3) {
        this(i2, i3, R.attr.vk_ui_icon_accent);
    }

    public String a(Context context) {
        return context.getString(this.a);
    }

    public uh1(int i2, int i3, int i4) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
    }
}
