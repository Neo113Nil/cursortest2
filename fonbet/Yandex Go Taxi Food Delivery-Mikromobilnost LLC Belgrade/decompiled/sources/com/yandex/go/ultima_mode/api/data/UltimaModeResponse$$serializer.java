package com.yandex.go.ultima_mode.api.data;

import com.yandex.go.ultima_mode.api.data.UltimaModeResponse;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.auu0;
import defpackage.gef;
import defpackage.ief;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/ultima_mode/api/data/UltimaModeResponse.$serializer", "Luxs;", "Lcom/yandex/go/ultima_mode/api/data/UltimaModeResponse;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/ultima_mode/api/data/UltimaModeResponse;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/ultima_mode/api/data/UltimaModeResponse;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "go-client-android.features.ultima_mode:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class UltimaModeResponse$$serializer implements uxs {
    public static final UltimaModeResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        UltimaModeResponse$$serializer ultimaModeResponse$$serializer = new UltimaModeResponse$$serializer();
        INSTANCE = ultimaModeResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.ultima_mode.api.data.UltimaModeResponse", ultimaModeResponse$$serializer, 5);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j(ClidProvider.STATE, true);
        pluginGeneratedSerialDescriptor.j("currency_rules", true);
        pluginGeneratedSerialDescriptor.j("profile", true);
        pluginGeneratedSerialDescriptor.j("menu", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UltimaModeResponse$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z96.a, qke.n(auu0.a), qke.n(gef.a), qke.n(UltimaModeResponse$Profile$$serializer.INSTANCE), qke.n(UltimaModeResponse$Menu$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final UltimaModeResponse deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        ief iefVar = null;
        UltimaModeResponse.Profile profile = null;
        UltimaModeResponse.Menu menu = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                iefVar = (ief) b.s(serialDescriptor, 2, gef.a, iefVar);
                i |= 4;
            } else if (v == 3) {
                profile = (UltimaModeResponse.Profile) b.s(serialDescriptor, 3, UltimaModeResponse$Profile$$serializer.INSTANCE, profile);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                menu = (UltimaModeResponse.Menu) b.s(serialDescriptor, 4, UltimaModeResponse$Menu$$serializer.INSTANCE, menu);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new UltimaModeResponse(i, z2, str, iefVar, profile, menu);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, UltimaModeResponse value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a) {
            b.n(serialDescriptor, 0, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, auu0.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, gef.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, UltimaModeResponse$Profile$$serializer.INSTANCE, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, UltimaModeResponse$Menu$$serializer.INSTANCE, value.e);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
