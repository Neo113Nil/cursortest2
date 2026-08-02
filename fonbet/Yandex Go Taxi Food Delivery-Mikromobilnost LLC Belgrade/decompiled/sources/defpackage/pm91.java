package defpackage;

import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.zzco;
import com.google.android.gms.internal.measurement.zzcr;

/* loaded from: classes11.dex */
public final class pm91 extends gp91 {
    public final /* synthetic */ zzco A;
    public final /* synthetic */ e B;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm91(e eVar, String str, String str2, boolean z, zzco zzcoVar) {
        super(eVar, true);
        this.x = str;
        this.y = str2;
        this.z = z;
        this.A = zzcoVar;
        this.B = eVar;
    }

    @Override // defpackage.gp91
    public final void a() {
        zzcr zzcrVar = this.B.f;
        cvw.l(zzcrVar);
        zzcrVar.getUserProperties(this.x, this.y, this.z, this.A);
    }

    @Override // defpackage.gp91
    public final void b() {
        this.A.zzb(null);
    }
}
