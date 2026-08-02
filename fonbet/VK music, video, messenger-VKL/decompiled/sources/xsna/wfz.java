package xsna;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import xsna.prm0;

/* compiled from: CollectionDescriptors.kt */
/* loaded from: classes8.dex */
public abstract class wfz implements SerialDescriptor {
    public final SerialDescriptor a;

    public wfz(SerialDescriptor serialDescriptor) {
        this.a = serialDescriptor;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c() {
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d(int i) {
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List<Annotation> e(int i) {
        if (i >= 0) {
            return EmptyList.b;
        }
        StringBuilder b = ji.b(i, "Illegal index ", ", ");
        b.append(f());
        b.append(" expects only non-negative indices");
        throw new IllegalArgumentException(b.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfz)) {
            return false;
        }
        wfz wfzVar = (wfz) obj;
        return epx.f(this.a, wfzVar.a) && epx.f(f(), wfzVar.f());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g(String str) {
        Integer m = arm0.m(10, str);
        if (m != null) {
            return m.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List<Annotation> getAnnotations() {
        return EmptyList.b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final gmi0 getKind() {
        return prm0.b.a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i) {
        if (i >= 0) {
            return this.a;
        }
        StringBuilder b = ji.b(i, "Illegal index ", ", ");
        b.append(f());
        b.append(" expects only non-negative indices");
        throw new IllegalArgumentException(b.toString().toString());
    }

    public final int hashCode() {
        return f().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder b = ji.b(i, "Illegal index ", ", ");
        b.append(f());
        b.append(" expects only non-negative indices");
        throw new IllegalArgumentException(b.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return f() + '(' + this.a + ')';
    }
}
