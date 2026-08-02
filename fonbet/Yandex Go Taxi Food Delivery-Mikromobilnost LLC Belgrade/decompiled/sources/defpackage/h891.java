package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.l;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;
import com.google.android.gms.internal.mlkit_vision_text_common.zzr;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvj;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes11.dex */
public final /* synthetic */ class h891 implements usb1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Matrix b;

    public /* synthetic */ h891(Matrix matrix, int i) {
        this.a = i;
        this.b = matrix;
    }

    @Override // defpackage.usb1
    public final Object d(Object obj) {
        switch (this.a) {
            case 0:
                zzvj zzvjVar = (zzvj) obj;
                fjy0 fjy0Var = new fjy0(zzvjVar.zzd(), zzvjVar.zzc(), zzvjVar.zze(), "", this.b);
                zzvjVar.zzb();
                zzvjVar.zza();
                return fjy0Var;
            case 1:
                zzl zzlVar = (zzl) obj;
                er91 er91Var = ema1.a;
                List e = una1.e(zzlVar.zzb);
                String str = hza1.f(zzlVar.zze) ? "" : zzlVar.zze;
                Rect d = una1.d(e);
                String str2 = hza1.f(zzlVar.zzg) ? "und" : zzlVar.zzg;
                List asList = Arrays.asList(zzlVar.zza);
                Matrix matrix = this.b;
                l.a(asList, new h891(matrix, 2));
                float f = zzlVar.zzb.zze;
                return new gjy0(str, d, e, str2, matrix);
            default:
                zzr zzrVar = (zzr) obj;
                er91 er91Var2 = ema1.a;
                List e2 = una1.e(zzrVar.zzb);
                String str3 = hza1.f(zzrVar.zzd) ? "" : zzrVar.zzd;
                Rect d2 = una1.d(e2);
                String str4 = hza1.f(zzrVar.zzf) ? "und" : zzrVar.zzf;
                float f2 = zzrVar.zzb.zze;
                zzbk.j();
                return new fjy0(str3, d2, e2, str4, this.b);
        }
    }
}
