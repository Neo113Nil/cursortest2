package defpackage;

import androidx.media3.exoplayer.offline.DownloadService;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class f6z implements uxs {
    public static final f6z a;
    private static final SerialDescriptor descriptor;

    static {
        f6z f6zVar = new f6z();
        a = f6zVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.storage.LocallyPersistentRequirementsStorage.StorageEntity", f6zVar, 2);
        pluginGeneratedSerialDescriptor.j("storageKey", true);
        pluginGeneratedSerialDescriptor.j(DownloadService.KEY_REQUIREMENTS, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(auu0.a), qke.n(z480.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        b580 b580Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                b580Var = (b580) b.s(serialDescriptor, 1, z480.a, b580Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new h6z(i, str, b580Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        h6z h6zVar = (h6z) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || h6zVar.a != null) {
            b.g(serialDescriptor, 0, auu0.a, h6zVar.a);
        }
        if (b.F() || h6zVar.b != null) {
            b.g(serialDescriptor, 1, z480.a, h6zVar.b);
        }
        b.c(serialDescriptor);
    }
}
