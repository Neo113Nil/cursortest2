package defpackage;

import com.yandex.go.navigator.compose.speed_group.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class mq1 implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int w;

    public /* synthetic */ mq1(f530 f530Var, boolean z, int i) {
        this.b = f530Var;
        this.c = z;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        boolean z = this.c;
        f530 f530Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                a.a(f530Var, z, fidVar, vng.O(i2 | 1));
                break;
            default:
                e7a1.c(f530Var, z, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ mq1(boolean z, f530 f530Var, int i) {
        this.c = z;
        this.b = f530Var;
        this.w = i;
    }
}
