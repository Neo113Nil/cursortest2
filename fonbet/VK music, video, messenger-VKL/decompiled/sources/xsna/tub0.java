package xsna;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: PolymorphicSerializer.kt */
/* loaded from: classes8.dex */
public final class tub0<T> extends dh<T> {
    public final dcy<T> a;
    public final List<? extends Annotation> b;
    public final Object c;

    public tub0(dcy<T> dcyVar) {
        this.a = dcyVar;
        this.b = EmptyList.b;
        this.c = msy.a(LazyThreadSafetyMode.PUBLICATION, new p6y(this, 22));
    }

    @Override // xsna.dh
    public final dcy<T> c() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.a + ')';
    }

    public tub0(rfc rfcVar, Annotation[] annotationArr) {
        this(rfcVar);
        this.b = Arrays.asList(annotationArr);
    }
}
