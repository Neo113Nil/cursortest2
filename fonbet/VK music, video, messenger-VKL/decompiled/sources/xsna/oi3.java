package xsna;

import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: ArchivePopupMenuItem.kt */
/* loaded from: classes4.dex */
public abstract class oi3 {
    public final tlo0 a;

    /* compiled from: ArchivePopupMenuItem.kt */
    public static abstract class a extends oi3 {
        public final int b;
        public final tlo0 c;
        public final int d;

        /* compiled from: ArchivePopupMenuItem.kt */
        /* renamed from: xsna.oi3$a$a, reason: collision with other inner class name */
        public static final class C3455a extends a {
        }

        /* compiled from: ArchivePopupMenuItem.kt */
        public static final class b extends a {
            public static final b e = new b(R.drawable.vk_icon_cancel_circle_outline_28, tq.h(tlo0.Companion, R.string.photo_deselect_menu));
        }

        /* compiled from: ArchivePopupMenuItem.kt */
        public static final class c extends a {
            public static final c e = new c(R.drawable.vk_icon_download_outline_28, tq.h(tlo0.Companion, R.string.photo_flow_item_dialog_download));
        }

        /* compiled from: ArchivePopupMenuItem.kt */
        public static final class d extends a {
            public static final d e = new d(R.drawable.vk_icon_unarchive_outline_28, tq.h(tlo0.Companion, R.string.photo_unarchive_menu));
        }

        public /* synthetic */ a(int i, tlo0.f fVar) {
            this(i, R.attr.colorAccent, fVar);
        }

        public a(int i, int i2, tlo0 tlo0Var) {
            super(tlo0Var);
            this.b = i;
            this.c = tlo0Var;
            this.d = i2;
        }
    }

    /* compiled from: ArchivePopupMenuItem.kt */
    public static abstract class b extends oi3 {
        public final int b;
        public final tlo0.f c;
        public final int d;

        /* compiled from: ArchivePopupMenuItem.kt */
        public static final class a extends b {
            public static final a e = new a(R.drawable.vk_icon_delete_outline_28, tq.h(tlo0.Companion, R.string.photo_flow_item_dialog_delete), R.attr.vk_ui_icon_negative);
        }

        /* compiled from: ArchivePopupMenuItem.kt */
        /* renamed from: xsna.oi3$b$b, reason: collision with other inner class name */
        public static final class C3456b extends b {
            public static final C3456b e = new C3456b(R.drawable.vk_icon_download_outline_28, tq.h(tlo0.Companion, R.string.photo_flow_item_dialog_download));
        }

        /* compiled from: ArchivePopupMenuItem.kt */
        public static final class c extends b {
            public static final c e = new c(R.drawable.vk_icon_check_circle_outline_28, tq.h(tlo0.Companion, R.string.photo_flow_item_dialog_multi_select));
        }

        /* compiled from: ArchivePopupMenuItem.kt */
        public static final class d extends b {
            public static final d e = new d(R.drawable.vk_icon_unarchive_outline_28, tq.h(tlo0.Companion, R.string.photo_unarchive_menu));
        }

        public /* synthetic */ b(int i, tlo0.f fVar) {
            this(i, fVar, R.attr.colorAccent);
        }

        public b(int i, tlo0.f fVar, int i2) {
            super(fVar);
            this.b = i;
            this.c = fVar;
            this.d = i2;
        }
    }

    public oi3(tlo0 tlo0Var) {
        this.a = tlo0Var;
    }
}
