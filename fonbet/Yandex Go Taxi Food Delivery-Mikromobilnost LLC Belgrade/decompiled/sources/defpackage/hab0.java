package defpackage;

import android.widget.CompoundButton;
import yads.ba0;
import yads.qi3;

/* loaded from: classes3.dex */
public final /* synthetic */ class hab0 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hab0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((eab0) obj2).invoke(((n70) obj).Z(), Boolean.valueOf(z));
                cg91.c(compoundButton, ok31.c);
                break;
            default:
                qi3 qi3Var = (qi3) ((q271) obj2).O;
                ((ap61) obj).getClass();
                qi3Var.invoke(ba0.b, Boolean.valueOf(z));
                break;
        }
    }
}
