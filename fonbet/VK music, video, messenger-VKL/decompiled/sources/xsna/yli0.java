package xsna;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: NullableSerializer.kt */
/* loaded from: classes8.dex */
public final class yli0 implements SerialDescriptor, jy8 {
    public final SerialDescriptor a;
    public final String b;
    public final Set<String> c;

    public yli0(SerialDescriptor serialDescriptor) {
        this.a = serialDescriptor;
        this.b = serialDescriptor.f() + '?';
        this.c = fvr.f(serialDescriptor);
    }

    @Override // xsna.jy8
    public final Set<String> a() {
        return this.c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c() {
        return this.a.c();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d(int i) {
        return this.a.d(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List<Annotation> e(int i) {
        return this.a.e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yli0) {
            return epx.f(this.a, ((yli0) obj).a);
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f() {
        return this.b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g(String str) {
        return this.a.g(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List<Annotation> getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final gmi0 getKind() {
        return this.a.getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i) {
        return this.a.h(i);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        return this.a.i(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.a.isInline();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
