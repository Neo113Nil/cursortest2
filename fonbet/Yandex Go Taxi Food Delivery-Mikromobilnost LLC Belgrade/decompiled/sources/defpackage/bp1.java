package defpackage;

import com.yandex.go.ai_widget.ui.a;
import com.yandex.passport.internal.properties.u;

/* loaded from: classes12.dex */
public final /* synthetic */ class bp1 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ sls c;
    public final /* synthetic */ f530 w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ int y;

    public /* synthetic */ bp1(String str, f530 f530Var, boolean z, sls slsVar, int i, int i2) {
        this.a = 0;
        this.b = str;
        this.w = f530Var;
        this.x = z;
        this.c = slsVar;
        this.y = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                a.a(vng.O(1), this.y, (fid) obj, this.c, this.w, this.b, this.x);
                break;
            case 1:
                ((Integer) obj2).getClass();
                dda1.f(vng.O(1), this.y, (fid) obj, this.c, this.w, this.b, this.x);
                break;
            default:
                ((Integer) obj2).getClass();
                u.g(vng.O(385), this.y, (fid) obj, this.c, this.w, this.b, this.x);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ bp1(String str, sls slsVar, f530 f530Var, boolean z, int i, int i2, int i3) {
        this.a = i3;
        this.b = str;
        this.c = slsVar;
        this.w = f530Var;
        this.x = z;
        this.y = i2;
    }
}
