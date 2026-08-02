package xsna;

import com.vk.search.ui.api.SearchInputMethod;
import kotlin.Pair;

/* compiled from: DefaultSearchHandlerStrategy.kt */
/* loaded from: classes16.dex */
public class dml implements duh0 {
    public final wzs<String, SearchInputMethod, s3q0> a;
    public final wzs<String, SearchInputMethod, s3q0> b;
    public final izs<String, s3q0> c;
    public final izs<String, s3q0> d;
    public final gzs<s3q0> e;
    public final long f;

    public dml(wzs wzsVar, p0i0 p0i0Var, izs izsVar, izs izsVar2, gzs gzsVar, long j, int i) {
        wzs akiVar = (i & 2) != 0 ? new aki((byte) 0, 2) : p0i0Var;
        izsVar = (i & 4) != 0 ? new ur0(22) : izsVar;
        izsVar2 = (i & 8) != 0 ? new vr0(29) : izsVar2;
        gzsVar = (i & 16) != 0 ? new ml7(5) : gzsVar;
        j = (i & 32) != 0 ? 500L : j;
        this.a = wzsVar;
        this.b = akiVar;
        this.c = izsVar;
        this.d = izsVar2;
        this.e = gzsVar;
        this.f = j;
    }

    @Override // xsna.duh0
    public final void E2(String str) {
        this.d.invoke(str);
    }

    @Override // xsna.duh0
    public final void a3(String str) {
        this.c.invoke(str);
    }

    @Override // xsna.duh0
    public final wzs<String, SearchInputMethod, s3q0> b3() {
        return this.b;
    }

    @Override // xsna.duh0
    public Pair<Long, wzs<String, SearchInputMethod, s3q0>> c3() {
        return new Pair<>(Long.valueOf(this.f), this.a);
    }

    @Override // xsna.duh0
    public final void n() {
        this.e.invoke();
    }
}
