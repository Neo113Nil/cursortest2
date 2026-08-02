package xsna;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class jbu0 implements gzs {
    public final /* synthetic */ MutableContextWrapper b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ o23 e;

    public /* synthetic */ jbu0(MutableContextWrapper mutableContextWrapper, int i, ViewGroup viewGroup, o23 o23Var) {
        this.b = mutableContextWrapper;
        this.c = i;
        this.d = viewGroup;
        this.e = o23Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        MutableContextWrapper mutableContextWrapper = this.b;
        gdr0 gdr0Var = new gdr0(LayoutInflater.from(mutableContextWrapper.getBaseContext()), mutableContextWrapper);
        if (!(gdr0Var.getFactory2() instanceof vhr0)) {
            final o23 o23Var = this.e;
            gdr0Var.setFactory2(new vhr0(gdr0Var, new zzs() { // from class: xsna.lbu0
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    Context context = (Context) obj3;
                    return o23.this.g(context, (View) obj, (String) obj2, (AttributeSet) obj4);
                }
            }));
        }
        return gdr0Var.inflate(this.c, this.d, false);
    }
}
