package defpackage;

import com.google.android.gms.internal.mlkit_vision_text_common.zzcw;

/* loaded from: classes11.dex */
public final class lf91 implements dg91 {
    public final int b;
    public final zzcw c;

    public lf91(int i, zzcw zzcwVar) {
        this.b = i;
        this.c = zzcwVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return dg91.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg91)) {
            return false;
        }
        dg91 dg91Var = (dg91) obj;
        return this.b == dg91Var.zza() && this.c.equals(dg91Var.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.b ^ 14552422) + (this.c.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.b + "intEncoding=" + this.c + ')';
    }

    @Override // defpackage.dg91
    public final int zza() {
        return this.b;
    }

    @Override // defpackage.dg91
    public final zzcw zzb() {
        return this.c;
    }
}
