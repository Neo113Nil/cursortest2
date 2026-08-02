package defpackage;

import com.yandex.messaging.ui.settings.folder.addChat.g;

/* loaded from: classes11.dex */
public final /* synthetic */ class kc0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ sls c;
    public final /* synthetic */ f530 w;

    public /* synthetic */ kc0(boolean z, sls slsVar, f530 f530Var, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = slsVar;
        this.w = f530Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        f530 f530Var = this.w;
        sls slsVar = this.c;
        boolean z = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                g.g(vng.O(1), fidVar, slsVar, f530Var, z);
                break;
            default:
                g.i(vng.O(1), fidVar, slsVar, f530Var, z);
                break;
        }
        return zy11Var;
    }
}
