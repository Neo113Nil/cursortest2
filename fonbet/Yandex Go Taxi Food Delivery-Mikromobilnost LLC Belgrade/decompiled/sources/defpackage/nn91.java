package defpackage;

import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.zzco;
import com.google.android.gms.internal.measurement.zzcr;
import java.util.Objects;

/* loaded from: classes.dex */
public final class nn91 extends gp91 {
    public final /* synthetic */ zzco x;
    public final /* synthetic */ e y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn91(e eVar, zzco zzcoVar) {
        super(eVar, true);
        this.x = zzcoVar;
        Objects.requireNonNull(eVar);
        this.y = eVar;
    }

    @Override // defpackage.gp91
    public final void a() {
        zzcr zzcrVar = this.y.f;
        cvw.l(zzcrVar);
        zzcrVar.getAppInstanceId(this.x);
    }

    @Override // defpackage.gp91
    public final void b() {
        this.x.zzb(null);
    }
}
