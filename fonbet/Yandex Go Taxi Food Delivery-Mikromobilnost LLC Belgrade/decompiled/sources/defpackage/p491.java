package defpackage;

import com.google.android.gms.internal.mlkit_vision_common.zzah;

/* loaded from: classes11.dex */
public final class p491 implements t591 {
    public final int b;
    public final zzah c;

    public p491(int i, zzah zzahVar) {
        this.b = i;
        this.c = zzahVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return t591.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t591)) {
            return false;
        }
        t591 t591Var = (t591) obj;
        return this.b == t591Var.zza() && this.c.equals(t591Var.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.b ^ 14552422) + (this.c.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.b + "intEncoding=" + this.c + ')';
    }

    @Override // defpackage.t591
    public final int zza() {
        return this.b;
    }

    @Override // defpackage.t591
    public final zzah zzb() {
        return this.c;
    }
}
