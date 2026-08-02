package defpackage;

import com.yandex.go.design.compose.button.utils.ButtonSize;

/* loaded from: classes11.dex */
public final /* synthetic */ class m050 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ ButtonSize c;
    public final /* synthetic */ sls w;

    public /* synthetic */ m050(f530 f530Var, ButtonSize buttonSize, sls slsVar, int i, int i2) {
        this.a = i2;
        this.b = f530Var;
        this.c = buttonSize;
        this.w = slsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        sls slsVar = this.w;
        ButtonSize buttonSize = this.c;
        f530 f530Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                frb1.a(f530Var, buttonSize, slsVar, fidVar, vng.O(7));
                break;
            default:
                bqa1.c(f530Var, buttonSize, slsVar, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
