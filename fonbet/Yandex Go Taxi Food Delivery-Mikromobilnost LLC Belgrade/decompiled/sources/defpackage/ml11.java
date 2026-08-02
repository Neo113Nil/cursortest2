package defpackage;

import com.google.gson.stream.JsonToken;

/* loaded from: classes11.dex */
public final class ml11 extends nl11 {
    public final /* synthetic */ nl11 a;

    public ml11(nl11 nl11Var) {
        this.a = nl11Var;
    }

    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        if (wdxVar.R() != JsonToken.NULL) {
            return this.a.read(wdxVar);
        }
        wdxVar.B0();
        return null;
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.a + "]";
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        if (obj == null) {
            afxVar.w();
        } else {
            this.a.write(afxVar, obj);
        }
    }
}
