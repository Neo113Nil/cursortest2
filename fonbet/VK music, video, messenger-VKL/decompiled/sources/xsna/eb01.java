package xsna;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzff;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class eb01 extends m900 {
    public final /* synthetic */ fb01 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb01(fb01 fb01Var) {
        super(20);
        this.a = fb01Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.m900
    public final Object create(Object obj) {
        zzff zzffVar;
        String str = (String) obj;
        exc0.f(str);
        fb01 fb01Var = this.a;
        fb01Var.l();
        zk3 zk3Var = fb01Var.k;
        exc0.f(str);
        if (TextUtils.isEmpty(str) || (zzffVar = (zzff) zk3Var.get(str)) == null || zzffVar.zza() == 0) {
            return null;
        }
        if (!zk3Var.containsKey(str) || zk3Var.get(str) == 0) {
            fb01Var.q(str);
        } else {
            fb01Var.r(str, (zzff) zk3Var.get(str));
        }
        return (com.google.android.gms.internal.measurement.zzc) fb01Var.m.snapshot().get(str);
    }
}
