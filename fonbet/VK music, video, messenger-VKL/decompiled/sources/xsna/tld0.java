package xsna;

import android.hardware.SensorManager;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class tld0 implements ptk0, io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tld0(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.ptk0
    public void a(lm50 lm50Var) {
        ((nkd0) this.b).d.r((hnd0) this.c, (ind0) lm50Var);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        float[] fArr = (float[]) this.b;
        float[] fArr2 = (float[]) this.c;
        vkr0 vkr0Var = (vkr0) obj;
        vkr0 vkr0Var2 = (vkr0) obj2;
        SensorManager.getRotationMatrix(fArr, null, new float[]{vkr0Var.a, vkr0Var.b, vkr0Var.c}, new float[]{vkr0Var2.a, vkr0Var2.b, vkr0Var2.c});
        SensorManager.getOrientation(fArr, fArr2);
        return new vkr0(fArr2[0], fArr2[1], fArr2[2]);
    }
}
