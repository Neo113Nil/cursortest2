package xsna;

import java.io.File;
import ru.ok.gleffects.EffectRegistry;

/* compiled from: EffectInfo.kt */
/* loaded from: classes3.dex */
public final class o9p {
    public final EffectRegistry.EffectId a;
    public final File b;

    public o9p(EffectRegistry.EffectId effectId, File file) {
        this.a = effectId;
        this.b = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9p)) {
            return false;
        }
        o9p o9pVar = (o9p) obj;
        return this.a == o9pVar.a && epx.f(this.b, o9pVar.b);
    }

    public final int hashCode() {
        EffectRegistry.EffectId effectId = this.a;
        int hashCode = (effectId == null ? 0 : effectId.hashCode()) * 31;
        File file = this.b;
        return hashCode + (file != null ? file.hashCode() : 0);
    }

    public final String toString() {
        return "EffectInfo(effect=" + this.a + ", resourcesFile=" + this.b + ')';
    }
}
