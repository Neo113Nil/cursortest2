package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.zzcr;

/* loaded from: classes.dex */
public final class bp91 extends gp91 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ e B;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ Bundle z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp91(e eVar, String str, String str2, Bundle bundle, boolean z) {
        super(eVar, true);
        this.x = str;
        this.y = str2;
        this.z = bundle;
        this.A = z;
        this.B = eVar;
    }

    @Override // defpackage.gp91
    public final void a() {
        long j = this.a;
        zzcr zzcrVar = this.B.f;
        cvw.l(zzcrVar);
        zzcrVar.logEvent(this.x, this.y, this.z, this.A, true, j);
    }
}
