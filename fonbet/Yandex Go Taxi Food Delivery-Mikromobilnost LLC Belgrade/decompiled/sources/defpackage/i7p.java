package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.gms.internal.mlkit_vision_face.zzd;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzn;
import com.google.android.gms.internal.mlkit_vision_face.zzos;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import com.google.android.gms.internal.mlkit_vision_face.zzpc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public final class i7p {
    public final Rect a;
    public int b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final SparseArray i = new SparseArray();
    public final SparseArray j = new SparseArray();

    public i7p(zzf zzfVar, Matrix matrix) {
        float f = zzfVar.zzc;
        float f2 = zzfVar.zze / 2.0f;
        float f3 = zzfVar.zzd;
        float f4 = zzfVar.zzf / 2.0f;
        Rect rect = new Rect((int) (f - f2), (int) (f3 - f4), (int) (f + f2), (int) (f3 + f4));
        this.a = rect;
        if (matrix != null) {
            qnc.d(rect, matrix);
        }
        this.b = zzfVar.zzb;
        for (zzn zznVar : zzfVar.zzj) {
            if (a(zznVar.zzd)) {
                PointF pointF = new PointF(zznVar.zzb, zznVar.zzc);
                if (matrix != null) {
                    float[] fArr = {pointF.x, pointF.y};
                    matrix.mapPoints(fArr);
                    pointF.set(fArr[0], fArr[1]);
                }
                SparseArray sparseArray = this.i;
                int i = zznVar.zzd;
                sparseArray.put(i, new s7p(i, pointF));
            }
        }
        for (zzd zzdVar : zzfVar.zzn) {
            int i2 = zzdVar.zzb;
            if (i2 <= 15 && i2 > 0) {
                PointF[] pointFArr = zzdVar.zza;
                pointFArr.getClass();
                long length = pointFArr.length + 5 + (r5 / 10);
                ArrayList arrayList = new ArrayList(length > 2147483647L ? Integer.MAX_VALUE : (int) length);
                Collections.addAll(arrayList, pointFArr);
                if (matrix != null) {
                    qnc.c(arrayList, matrix);
                }
                this.j.put(i2, new j7p(i2, arrayList));
            }
        }
        this.f = zzfVar.zzi;
        this.g = zzfVar.zzg;
        this.h = zzfVar.zzh;
        this.e = zzfVar.zzm;
        this.d = zzfVar.zzk;
        this.c = zzfVar.zzl;
    }

    public static boolean a(int i) {
        return i == 0 || i == 1 || i == 7 || i == 3 || i == 9 || i == 4 || i == 10 || i == 5 || i == 11 || i == 6;
    }

    public final String toString() {
        p891 p891Var = new p891("Face", 11);
        p891Var.j(this.a, "boundingBox");
        p891Var.f(this.b, "trackingId");
        p891Var.d(this.c, "rightEyeOpenProbability");
        p891Var.d(this.d, "leftEyeOpenProbability");
        p891Var.d(this.e, "smileProbability");
        p891Var.d(this.f, "eulerX");
        p891Var.d(this.g, "eulerY");
        p891Var.d(this.h, "eulerZ");
        p891 p891Var2 = new p891("Landmarks", 11);
        for (int i = 0; i <= 11; i++) {
            if (a(i)) {
                p891Var2.j((s7p) this.i.get(i), oyr.i(i, "landmark_"));
            }
        }
        p891Var.j(p891Var2.toString(), "landmarks");
        p891 p891Var3 = new p891("Contours", 11);
        for (int i2 = 1; i2 <= 15; i2++) {
            p891Var3.j((j7p) this.j.get(i2), oyr.i(i2, "Contour_"));
        }
        p891Var.j(p891Var3.toString(), "contours");
        return p891Var.toString();
    }

    public i7p(zzow zzowVar, Matrix matrix) {
        Rect zzh = zzowVar.zzh();
        this.a = zzh;
        if (matrix != null) {
            qnc.d(zzh, matrix);
        }
        this.b = zzowVar.zzg();
        for (zzpc zzpcVar : zzowVar.zzj()) {
            if (a(zzpcVar.zza())) {
                PointF zzb = zzpcVar.zzb();
                if (matrix != null) {
                    float[] fArr = {zzb.x, zzb.y};
                    matrix.mapPoints(fArr);
                    zzb.set(fArr[0], fArr[1]);
                }
                this.i.put(zzpcVar.zza(), new s7p(zzpcVar.zza(), zzb));
            }
        }
        for (zzos zzosVar : zzowVar.zzi()) {
            int zza = zzosVar.zza();
            if (zza <= 15 && zza > 0) {
                List zzb2 = zzosVar.zzb();
                zzb2.getClass();
                ArrayList arrayList = new ArrayList(zzb2);
                if (matrix != null) {
                    qnc.c(arrayList, matrix);
                }
                this.j.put(zza, new j7p(zza, arrayList));
            }
        }
        this.f = zzowVar.zzf();
        this.g = zzowVar.zzb();
        this.h = -zzowVar.zzd();
        this.e = zzowVar.zze();
        this.d = zzowVar.zza();
        this.c = zzowVar.zzc();
    }
}
