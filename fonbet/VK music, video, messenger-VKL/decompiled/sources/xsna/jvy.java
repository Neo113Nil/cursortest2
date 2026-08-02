package xsna;

import java.util.List;

/* compiled from: LazyListMeasuredItemProvider.kt */
/* loaded from: classes11.dex */
public abstract class jvy extends z46 {
    public final yuy d;
    public final qty e;
    public final long f;

    public jvy(long j, boolean z, yuy yuyVar, qty qtyVar) {
        super(3);
        this.d = yuyVar;
        this.e = qtyVar;
        this.f = s6j.b(0, z ? o6j.i(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : o6j.h(j), 5);
    }

    public static ivy L0(cvy cvyVar, int i) {
        long j = cvyVar.f;
        yuy yuyVar = cvyVar.d;
        return cvyVar.w0(i, yuyVar.h(i), yuyVar.g(i), cvyVar.F(cvyVar.e, i, j), j);
    }

    public abstract ivy w0(int i, Object obj, Object obj2, List<? extends tra0> list, long j);

    @Override // xsna.z46
    public final rty x(int i, int i2, int i3, long j) {
        yuy yuyVar = this.d;
        return w0(i, yuyVar.h(i), yuyVar.g(i), F(this.e, i, j), j);
    }
}
