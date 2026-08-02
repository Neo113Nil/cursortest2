package defpackage;

import com.google.firebase.encoders.proto.Protobuf$IntEncoding;

/* loaded from: classes.dex */
public final class mb3 implements dvf0 {
    public final int b;
    public final Protobuf$IntEncoding c;

    public mb3(int i, Protobuf$IntEncoding protobuf$IntEncoding) {
        this.b = i;
        this.c = protobuf$IntEncoding;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return dvf0.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvf0)) {
            return false;
        }
        dvf0 dvf0Var = (dvf0) obj;
        return this.b == dvf0Var.tag() && this.c.equals(dvf0Var.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.b) + (this.c.hashCode() ^ 2041407134);
    }

    @Override // defpackage.dvf0
    public final Protobuf$IntEncoding intEncoding() {
        return this.c;
    }

    @Override // defpackage.dvf0
    public final int tag() {
        return this.b;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.b + "intEncoding=" + this.c + ')';
    }
}
