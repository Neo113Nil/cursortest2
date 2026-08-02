package defpackage;

import android.widget.ImageView;
import java.util.HashMap;
import java.util.function.Function;

/* loaded from: classes7.dex */
public final /* synthetic */ class e1a0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ e1a0(int i, int i2, g1a0 g1a0Var, ImageView imageView, String str, Function function) {
        this.x = g1a0Var;
        this.y = imageView;
        this.b = str;
        this.z = function;
        this.c = i;
        this.w = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.z;
        Object obj2 = this.y;
        Object obj3 = this.x;
        switch (i) {
            case 0:
                int i2 = this.w;
                ((g1a0) obj3).f((ImageView) obj2, this.b, (Function) obj, this.c, i2, null);
                break;
            default:
                uio0 uio0Var = (uio0) obj3;
                ((z4m0) uio0Var.c).b(this.b, new mj31(11, uio0Var, (HashMap) obj2, (cu81) obj), this.c, this.w);
                break;
        }
    }

    public /* synthetic */ e1a0(uio0 uio0Var, String str, int i, int i2, HashMap hashMap, cu81 cu81Var) {
        this.x = uio0Var;
        this.b = str;
        this.c = i;
        this.w = i2;
        this.y = hashMap;
        this.z = cu81Var;
    }
}
