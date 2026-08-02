package defpackage;

import android.widget.CompoundButton;

/* loaded from: classes13.dex */
public final /* synthetic */ class kbr0 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g9r0 b;
    public final /* synthetic */ wls c;
    public final /* synthetic */ zo31 d;

    public /* synthetic */ kbr0(wls wlsVar, g9r0 g9r0Var, zo31 zo31Var, int i) {
        this.a = i;
        this.c = wlsVar;
        this.b = g9r0Var;
        this.d = zo31Var;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        zo31 zo31Var = this.d;
        g9r0 g9r0Var = this.b;
        cp1 cp1Var = (cp1) this.c;
        switch (i) {
            case 0:
                v261 v261Var = (v261) zo31Var;
                if (!((Boolean) cp1Var.invoke(g9r0Var, Boolean.valueOf(z))).booleanValue()) {
                    v261Var.c.setChecked(!z);
                    break;
                }
                break;
            default:
                u261 u261Var = (u261) zo31Var;
                if (!((Boolean) cp1Var.invoke(g9r0Var, Boolean.valueOf(z))).booleanValue()) {
                    u261Var.d.setChecked(!z);
                    break;
                }
                break;
        }
    }
}
