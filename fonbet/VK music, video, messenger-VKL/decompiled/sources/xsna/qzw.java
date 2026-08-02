package xsna;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: InlineClassDescriptor.kt */
/* loaded from: classes8.dex */
public final class qzw extends xfb0 {
    public final boolean l;

    public qzw(String str, vht<?> vhtVar) {
        super(str, vhtVar, 1);
        this.l = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xfb0
    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof qzw) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (epx.f(this.a, serialDescriptor.f())) {
                qzw qzwVar = (qzw) obj;
                if (qzwVar.l && Arrays.equals((SerialDescriptor[]) this.j.getValue(), (SerialDescriptor[]) qzwVar.j.getValue())) {
                    int c = serialDescriptor.c();
                    int i2 = this.c;
                    if (i2 == c) {
                        for (0; i < i2; i + 1) {
                            i = (epx.f(h(i).f(), serialDescriptor.h(i).f()) && epx.f(h(i).getKind(), serialDescriptor.h(i).getKind())) ? i + 1 : 0;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // xsna.xfb0
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // xsna.xfb0, kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.l;
    }
}
