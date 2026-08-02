package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.l;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuz;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvb;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final /* synthetic */ class p391 implements usb1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Matrix b;

    public /* synthetic */ p391(Matrix matrix, int i) {
        this.a = i;
        this.b = matrix;
    }

    @Override // defpackage.usb1
    public final Object d(Object obj) {
        switch (this.a) {
            case 0:
                return new kjy0((zzuz) obj, this.b);
            default:
                zzvb zzvbVar = (zzvb) obj;
                String zze = zzvbVar.zze();
                Rect zzc = zzvbVar.zzc();
                List zzf = zzvbVar.zzf();
                String zzd = zzvbVar.zzd();
                Matrix matrix = this.b;
                fjy0 fjy0Var = new fjy0(zze, zzc, zzf, zzd, matrix);
                zzvbVar.zzb();
                zzvbVar.zza();
                List zzg = zzvbVar.zzg();
                if (zzg == null) {
                    zzg = new ArrayList();
                }
                l.a(zzg, new h891(matrix, 0));
                return fjy0Var;
        }
    }
}
