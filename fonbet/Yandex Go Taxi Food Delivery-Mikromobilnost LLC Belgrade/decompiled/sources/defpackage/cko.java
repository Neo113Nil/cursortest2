package defpackage;

import com.google.gson.reflect.TypeToken;

/* loaded from: classes11.dex */
public final class cko extends nl11 {
    public volatile nl11 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ u3u d;
    public final /* synthetic */ TypeToken e;
    public final /* synthetic */ dko f;

    public cko(dko dkoVar, boolean z, boolean z2, u3u u3uVar, TypeToken typeToken) {
        this.f = dkoVar;
        this.b = z;
        this.c = z2;
        this.d = u3uVar;
        this.e = typeToken;
    }

    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        if (this.b) {
            wdxVar.skipValue();
            return null;
        }
        nl11 nl11Var = this.a;
        if (nl11Var == null) {
            nl11Var = this.d.g(this.f, this.e);
            this.a = nl11Var;
        }
        return nl11Var.read(wdxVar);
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        if (this.c) {
            afxVar.w();
            return;
        }
        nl11 nl11Var = this.a;
        if (nl11Var == null) {
            nl11Var = this.d.g(this.f, this.e);
            this.a = nl11Var;
        }
        nl11Var.write(afxVar, obj);
    }
}
