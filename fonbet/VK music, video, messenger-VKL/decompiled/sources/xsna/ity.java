package xsna;

import xsna.aum0;

/* compiled from: LazyLayout.kt */
/* loaded from: classes11.dex */
public final class ity implements aum0 {
    public final hty a;
    public final eh50<Object> b = pp70.a();

    public ity(hty htyVar) {
        this.a = htyVar;
    }

    @Override // xsna.aum0
    public final void a(aum0.a aVar) {
        eh50<Object> eh50Var = this.b;
        eh50Var.d();
        gh50<Object> gh50Var = aVar.b;
        Object[] objArr = gh50Var.b;
        long[] jArr = gh50Var.c;
        int i = gh50Var.e;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object b = this.a.b(obj);
            int c = eh50Var.c(0, b);
            if (c == 7) {
                aVar.remove(obj);
            } else {
                eh50Var.i(b, c + 1);
            }
            i = i2;
        }
    }

    @Override // xsna.aum0
    public final boolean b(Object obj, Object obj2) {
        hty htyVar = this.a;
        return epx.f(htyVar.b(obj), htyVar.b(obj2));
    }
}
