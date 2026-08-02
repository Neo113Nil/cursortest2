package defpackage;

/* loaded from: classes6.dex */
public final class dbe implements bbe {
    public final tae a;
    public final gzh b;
    public final vbb c;
    public final yfa d;

    public dbe(tae taeVar, gzh gzhVar, vbb vbbVar, yfa yfaVar) {
        this.a = taeVar;
        this.b = gzhVar;
        this.c = vbbVar;
        this.d = yfaVar;
    }

    @Override // defpackage.bbe
    public final void a(nde ndeVar) {
        s9e s9eVar;
        czh create = this.b.create();
        boolean z = ndeVar.a;
        String str = ndeVar.b;
        String str2 = ndeVar.c;
        s9e s9eVar2 = ndeVar.g;
        vbb vbbVar = this.c;
        String a = ((up21) vbbVar.a).a();
        if (evu0.J(a)) {
            a = null;
        }
        int i = 0;
        if (a != null) {
            String str3 = ndeVar.d;
            if (str3 == null) {
                str3 = ((yuj0) vbbVar.b).a(oxh0.cargoform_contact_picker_me, new Object[0]);
            }
            s9eVar = new s9e(str3, a);
        } else {
            s9eVar = null;
        }
        String str4 = ndeVar.e;
        String str5 = ndeVar.f;
        if (str5 == null) {
            str5 = "";
        }
        czh.a(create, new izh(new cbe(i, this, new p1b(new qae(z, str, str2, s9eVar2, j73.A(new s9e[]{s9eVar, (str4 == null || evu0.J(str4)) ^ true ? new s9e(str4, str5) : null})), new rae(ndeVar, create, (up21) ((gxf) this.a.a.b).get()))), null, null, null, null, null, 8190));
    }
}
