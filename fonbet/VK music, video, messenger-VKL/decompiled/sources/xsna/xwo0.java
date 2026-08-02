package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import xsna.zwd;

/* compiled from: TimelineSettingsProvider.kt */
/* loaded from: classes16.dex */
public final class xwo0 {
    public static final int c = iah0.a(28);
    public final e2e a;
    public final m900<Integer, Drawable> b = new m900<>(50);

    /* compiled from: TimelineSettingsProvider.kt */
    public static final class a {
        public final Context a;
        public final ArrayList<iwo0> b = new ArrayList<>();

        public a(Context context, cxd cxdVar) {
            this.a = context;
        }

        public static void a(a aVar, zwd zwdVar, int i, int i2, t60 t60Var, e5p0 e5p0Var, int i3) {
            if ((i3 & 8) != 0) {
                t60Var = null;
            }
            e5p0 e5p0Var2 = (i3 & 32) != 0 ? null : e5p0Var;
            if (zwdVar instanceof zwd.b) {
                aVar.b.add(new iwo0(i, ((zwd.b) zwdVar).b, wlb0.s(i2, aVar.a), t60Var, e5p0Var2));
            }
        }
    }

    /* compiled from: TimelineSettingsProvider.kt */
    public static final class b {
        public final Context a;
        public final m900<Integer, Drawable> b;
        public final ArrayList<las> c = new ArrayList<>();

        public b(Context context, cxd cxdVar, m900 m900Var) {
            this.a = context;
            this.b = m900Var;
        }

        public final void a(zwd zwdVar, int i, int i2) {
            if (zwdVar instanceof zwd.b) {
                Context context = this.a;
                String s = wlb0.s(i2, context);
                int i3 = ((zwd.b) zwdVar).b;
                Integer valueOf = Integer.valueOf(i3);
                m900<Integer, Drawable> m900Var = this.b;
                Drawable drawable = m900Var.get(valueOf);
                if (drawable == null) {
                    drawable = m33.a(i3, context);
                    m900Var.put(Integer.valueOf(i3), drawable);
                }
                this.c.add(new las(i, drawable, s));
            }
        }
    }

    public xwo0(e2e e2eVar) {
        this.a = e2eVar;
    }
}
