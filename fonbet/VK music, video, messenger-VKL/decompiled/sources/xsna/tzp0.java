package xsna;

import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeDialogItem;
import com.vk.stat.scheme.SchemeStat$TypeMiniAppItem;
import xsna.dh6;
import xsna.y0q0;

/* compiled from: UiTrackingFactory.kt */
/* loaded from: classes17.dex */
public final class tzp0 {

    /* compiled from: UiTrackingFactory.kt */
    public static final class a extends x0q0 implements dh6.a {
        public a() {
            super(null, false);
        }
    }

    /* compiled from: UiTrackingFactory.kt */
    public static final class b extends y0q0 implements dh6.a {
        public Integer j;
        public SchemeStat$TypeMiniAppItem k;

        public b(SchemeStat$EventItem schemeStat$EventItem) {
            super(SchemeStat$TypeDialogItem.DialogItem.MINI_APPS_ACTION_MENU, schemeStat$EventItem);
        }

        @Override // xsna.xyp0, xsna.dh6.a
        public final void a() {
            Integer num = this.j;
            SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem = this.k;
            y0q0.a aVar = this.i;
            aVar.a = num;
            aVar.b = schemeStat$TypeMiniAppItem;
            d();
        }

        @Override // xsna.xyp0, xsna.dh6.a
        public final void b() {
            Integer num = this.j;
            SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem = this.k;
            y0q0.a aVar = this.i;
            aVar.a = num;
            aVar.b = schemeStat$TypeMiniAppItem;
            c();
        }

        public final void e(Integer num) {
            this.j = num;
        }

        public final void g(SchemeStat$TypeMiniAppItem schemeStat$TypeMiniAppItem) {
            this.k = schemeStat$TypeMiniAppItem;
        }
    }

    /* compiled from: UiTrackingFactory.kt */
    public static class c extends x0q0 implements dh6.a {

        /* compiled from: UiTrackingFactory.kt */
        public static final class a extends c {
            public a(m0q0 m0q0Var, boolean z) {
                super(null, z);
                this.c = m0q0Var;
            }
        }
    }

    public static c a(SchemeStat$EventItem schemeStat$EventItem, int i) {
        if ((i & 1) != 0) {
            schemeStat$EventItem = null;
        }
        return new c(schemeStat$EventItem, (i & 2) == 0);
    }
}
