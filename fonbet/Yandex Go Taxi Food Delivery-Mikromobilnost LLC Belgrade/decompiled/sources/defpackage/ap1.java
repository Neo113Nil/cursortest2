package defpackage;

import com.yandex.go.ai_widget.ui.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class ap1 implements wls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ ap1(jps0 jps0Var, float f, sls slsVar, boolean z, float f2, int i) {
        this.x = jps0Var;
        this.b = f;
        this.y = slsVar;
        this.c = z;
        this.w = f2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.y;
        Object obj4 = this.x;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(1);
                a.e(this.c, (String) obj4, (String) obj3, this.b, this.w, (fid) obj, O);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(49);
                yos0.c((jps0) obj4, this.b, (sls) obj3, this.c, this.w, (fid) obj, O2);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ ap1(boolean z, String str, String str2, float f, float f2, int i) {
        this.c = z;
        this.x = str;
        this.y = str2;
        this.b = f;
        this.w = f2;
    }
}
