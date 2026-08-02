package defpackage;

import androidx.lifecycle.Lifecycle;

/* loaded from: classes3.dex */
public final class hf8 implements te8, mig, z7g0 {
    public final /* synthetic */ bhk a;

    public /* synthetic */ hf8(bhk bhkVar) {
        this.a = bhkVar;
    }

    public void a(Lifecycle lifecycle, dmg dmgVar) {
        bhk bhkVar = this.a;
        bhkVar.a.add(dmgVar);
        lifecycle.a(new wgk(1, bhkVar, dmgVar));
    }

    public void b(Lifecycle lifecycle, sls slsVar) {
        bhk bhkVar = this.a;
        bhkVar.a.add(slsVar);
        lifecycle.a(new wgk(1, bhkVar, slsVar));
    }

    public void c(Lifecycle lifecycle, u8g0 u8g0Var) {
        bhk bhkVar = this.a;
        bhkVar.a.add(u8g0Var);
        lifecycle.a(new wgk(1, bhkVar, u8g0Var));
    }

    public void d(Lifecycle lifecycle, u8g0 u8g0Var) {
        bhk bhkVar = this.a;
        bhkVar.b.add(u8g0Var);
        lifecycle.a(new wgk(2, bhkVar, u8g0Var));
    }
}
