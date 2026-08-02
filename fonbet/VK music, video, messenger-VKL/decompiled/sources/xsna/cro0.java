package xsna;

import android.content.Context;
import android.view.LayoutInflater;

/* compiled from: ThreadLocalForcedThemeWrapper.kt */
/* loaded from: classes17.dex */
public final class cro0 extends lpj {

    /* compiled from: ThreadLocalForcedThemeWrapper.kt */
    public static final class a extends LayoutInflater {
        public a(cro0 cro0Var) {
            super(cro0Var);
        }

        @Override // android.view.LayoutInflater
        public final LayoutInflater cloneInContext(Context context) {
            return new a(context);
        }
    }

    public cro0(Context context, int i) {
        super(context, i);
    }

    @Override // xsna.lpj, android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        gdr0 gdr0Var = new gdr0(new a(this), this);
        gdr0Var.setFactory2(new vhr0(gdr0Var, null));
        return gdr0Var;
    }
}
