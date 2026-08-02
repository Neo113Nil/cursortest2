package defpackage;

import com.google.android.gms.internal.mlkit_vision_subject_segmentation.zzcc;

/* loaded from: classes11.dex */
public final class lb91 implements nd91 {
    public final int b;
    public final zzcc c;

    public lb91(int i, zzcc zzccVar) {
        this.b = i;
        this.c = zzccVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return nd91.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nd91)) {
            return false;
        }
        nd91 nd91Var = (nd91) obj;
        return this.b == nd91Var.zza() && this.c.equals(nd91Var.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.b ^ 14552422) + (this.c.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.b + "intEncoding=" + this.c + ')';
    }

    @Override // defpackage.nd91
    public final int zza() {
        return this.b;
    }

    @Override // defpackage.nd91
    public final zzcc zzb() {
        return this.c;
    }
}
