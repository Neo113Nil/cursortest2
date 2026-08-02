package xsna;

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.internal.cast.zzff;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Arrays;
import java.util.List;

/* compiled from: CanAddReviewError.kt */
/* loaded from: classes18.dex */
public final class yo9 implements h300, ouf0 {
    public final /* synthetic */ int b;
    public Object c;
    public Object d;

    public /* synthetic */ yo9() {
        this.b = 4;
    }

    @Override // xsna.h300
    public void a(long j, q94 q94Var, wmj wmjVar) {
        if (((d4q) this.c).f(wmjVar)) {
            ((h300) this.d).a(j, q94Var, wmjVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ouf0
    public void accept(Object obj, Object obj2) {
        rm01 rm01Var = (rm01) obj;
        nc01 nc01Var = new nc01((cm01) this.c, (TaskCompletionSource) obj2);
        ixz0 ixz0Var = (ixz0) rm01Var.getService();
        ApiMetadata zza = zzff.zza(rm01Var.getContext());
        String[] strArr = (String[]) this.d;
        Parcel zza2 = ixz0Var.zza();
        com.google.android.gms.internal.cast.zzc.zze(zza2, nc01Var);
        zza2.writeStringArray(strArr);
        com.google.android.gms.internal.cast.zzc.zzc(zza2, zza);
        ixz0Var.zzd(5, zza2);
    }

    @Override // xsna.h300
    public List f(q94 q94Var) {
        return ((h300) this.d).f(q94Var);
    }

    public String toString() {
        switch (this.b) {
            case 4:
                StringBuilder sb = new StringBuilder("ScalingMatrix{ScalingList4x4=");
                e5h0[] e5h0VarArr = (e5h0[]) this.c;
                sb.append(e5h0VarArr == null ? null : Arrays.asList(e5h0VarArr));
                sb.append("\n, ScalingList8x8=");
                e5h0[] e5h0VarArr2 = (e5h0[]) this.d;
                return vp.b("\n}", sb, e5h0VarArr2 != null ? Arrays.asList(e5h0VarArr2) : null);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ yo9(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    public yo9(Bitmap bitmap) {
        this.b = 3;
        this.c = bitmap;
        this.d = null;
    }
}
