package defpackage;

import com.google.android.gms.internal.mlkit_vision_face.zzjy;
import com.google.android.gms.internal.mlkit_vision_face.zzjz;
import com.google.android.gms.internal.mlkit_vision_face.zzka;
import com.google.android.gms.internal.mlkit_vision_face.zzkb;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public abstract class aga1 {
    public static final AtomicReference a = new AtomicReference();

    public static fna1 a(r7p r7pVar) {
        pla1 pla1Var = new pla1();
        r7pVar.getClass();
        pla1Var.a = zzka.NO_LANDMARKS;
        pla1Var.b = zzjy.NO_CLASSIFICATIONS;
        pla1Var.c = zzkb.FAST;
        int i = r7pVar.a;
        pla1Var.d = i != 1 ? i != 2 ? zzjz.UNKNOWN_CONTOURS : zzjz.ALL_CONTOURS : zzjz.NO_CONTOURS;
        pla1Var.e = Boolean.FALSE;
        pla1Var.f = Float.valueOf(0.1f);
        return new fna1(pla1Var);
    }

    public static String b() {
        return true != c() ? "play-services-mlkit-face-detection" : "face-detection";
    }

    public static boolean c() {
        AtomicReference atomicReference = a;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean b = sl41.b(qk20.c().b());
        atomicReference.set(Boolean.valueOf(b));
        return b;
    }
}
