package xsna;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: JsonElementSerializers.kt */
/* loaded from: classes8.dex */
public final class f9y implements SerialDescriptor {
    public final bpn0 a;

    public f9y(gzs<? extends SerialDescriptor> gzsVar) {
        this.a = new bpn0(gzsVar);
    }

    public final SerialDescriptor a() {
        return (SerialDescriptor) this.a.getValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c() {
        return a().c();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String d(int i) {
        return a().d(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List<Annotation> e(int i) {
        return a().e(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f() {
        return a().f();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int g(String str) {
        return a().g(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List<Annotation> getAnnotations() {
        return EmptyList.b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final gmi0 getKind() {
        return a().getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i) {
        return a().h(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        return a().i(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }
}
