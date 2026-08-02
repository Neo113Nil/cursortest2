package defpackage;

import android.graphics.Color;

/* loaded from: classes12.dex */
public final /* synthetic */ class ng6 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ og6 b;

    public /* synthetic */ ng6(og6 og6Var, int i) {
        this.a = i;
        this.b = og6Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        og6 og6Var = this.b;
        switch (i) {
            case 0:
                float floatValue = ((Float) obj).floatValue();
                og6Var.getClass();
                og6Var.a.getWindow().setStatusBarColor(Color.argb((int) (floatValue * 255.0f), 0, 0, 0));
                break;
            default:
                og6Var.j = ((Boolean) obj).booleanValue();
                break;
        }
        return zy11Var;
    }
}
