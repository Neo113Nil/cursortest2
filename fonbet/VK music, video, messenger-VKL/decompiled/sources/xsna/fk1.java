package xsna;

import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: AlbumPopupMenuItem.kt */
/* loaded from: classes4.dex */
public abstract class fk1 {

    /* compiled from: AlbumPopupMenuItem.kt */
    public static abstract class a extends fk1 {
        public final int a;
        public final tlo0.f b;
        public final int c;

        /* compiled from: AlbumPopupMenuItem.kt */
        /* renamed from: xsna.fk1$a$a, reason: collision with other inner class name */
        public static final class C2878a extends a {
            public static final C2878a d = new C2878a(R.drawable.vk_icon_delete_outline_28, tq.h(tlo0.Companion, R.string.album_details_delete_album), R.attr.vk_ui_icon_negative);
        }

        /* compiled from: AlbumPopupMenuItem.kt */
        public static final class b extends a {
            public static final b d = new b(R.drawable.vk_icon_download_outline_28, tq.h(tlo0.Companion, R.string.album_details_download_album));
        }

        /* compiled from: AlbumPopupMenuItem.kt */
        public static final class c extends a {
            public static final c d = new c(R.drawable.vk_icon_share_outline_28, tq.h(tlo0.Companion, R.string.album_details_share_album));
        }

        /* compiled from: AlbumPopupMenuItem.kt */
        public static final class d extends a {
            public static final d d = new d(R.drawable.vk_icon_edit_outline_28, tq.h(tlo0.Companion, R.string.album_details_edit_album));
        }

        public a(int i, tlo0.f fVar, int i2) {
            this.a = i;
            this.b = fVar;
            this.c = i2;
        }

        public /* synthetic */ a(int i, tlo0.f fVar) {
            this(i, fVar, R.attr.colorAccent);
        }
    }
}
