package defpackage;

import com.google.android.gms.internal.mlkit_vision_face.zzjy;
import com.google.android.gms.internal.mlkit_vision_face.zzjz;
import com.google.android.gms.internal.mlkit_vision_face.zzka;
import com.google.android.gms.internal.mlkit_vision_face.zzkb;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class fna1 {
    public final zzka a;
    public final zzjy b;
    public final zzkb c;
    public final zzjz d;
    public final Boolean e;
    public final Float f;

    public /* synthetic */ fna1(pla1 pla1Var) {
        this.a = pla1Var.a;
        this.b = pla1Var.b;
        this.c = pla1Var.c;
        this.d = pla1Var.d;
        this.e = pla1Var.e;
        this.f = pla1Var.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fna1)) {
            return false;
        }
        fna1 fna1Var = (fna1) obj;
        return ooc.m(this.a, fna1Var.a) && ooc.m(this.b, fna1Var.b) && ooc.m(this.c, fna1Var.c) && ooc.m(this.d, fna1Var.d) && ooc.m(this.e, fna1Var.e) && ooc.m(this.f, fna1Var.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }
}
