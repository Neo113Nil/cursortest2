package defpackage;

import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.zzcr;

/* loaded from: classes11.dex */
public final class fk91 extends gp91 {
    public final /* synthetic */ int x;
    public final /* synthetic */ String y;
    public final /* synthetic */ e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fk91(e eVar, String str, int i) {
        super(eVar, true);
        this.x = i;
        this.y = str;
        this.z = eVar;
    }

    @Override // defpackage.gp91
    public final void a() {
        switch (this.x) {
            case 0:
                zzcr zzcrVar = this.z.f;
                cvw.l(zzcrVar);
                zzcrVar.beginAdUnitExposure(this.y, this.b);
                break;
            default:
                zzcr zzcrVar2 = this.z.f;
                cvw.l(zzcrVar2);
                zzcrVar2.endAdUnitExposure(this.y, this.b);
                break;
        }
    }
}
