package xsna;

/* compiled from: LazyGridDsl.kt */
/* loaded from: classes11.dex */
public interface rry {
    static /* synthetic */ void d(rry rryVar, int i, izs izsVar, jai jaiVar, int i2) {
        if ((i2 & 2) != 0) {
            izsVar = null;
        }
        rryVar.a(i, izsVar, qry.b, jaiVar);
    }

    static /* synthetic */ void j(rry rryVar, izs izsVar, jai jaiVar, int i) {
        String str = (i & 1) != 0 ? null : "show_more";
        if ((i & 2) != 0) {
            izsVar = null;
        }
        rryVar.f(str, izsVar, jaiVar);
    }

    void a(int i, izs izsVar, izs izsVar2, jai jaiVar);

    void f(Object obj, izs izsVar, jai jaiVar);
}
