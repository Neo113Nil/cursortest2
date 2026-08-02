package com.yandex.go.platform.js_api.models;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.auu0;
import defpackage.h6w;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/yandex/go/platform/js_api/models/JsError.$serializer", "Luxs;", "Lcom/yandex/go/platform/js_api/models/JsError;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/platform/js_api/models/JsError;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/platform/js_api/models/JsError;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final class JsError$$serializer implements uxs {
    public static final JsError$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        JsError$$serializer jsError$$serializer = new JsError$$serializer();
        INSTANCE = jsError$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.platform.js_api.models.JsError", jsError$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_MESSAGE, false);
        pluginGeneratedSerialDescriptor.j(AuthSdkActivity.RESPONSE_TYPE_CODE, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private JsError$$serializer() {
    }

    @Override // defpackage.uxs
    public KSerializer[] childSerializers() {
        KSerializer n = qke.n(h6w.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, n};
    }

    @Override // defpackage.myi
    public JsError deserialize(Decoder decoder) {
        SerialDescriptor descriptor2 = getDescriptor();
        sjd b = decoder.b(descriptor2);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Integer num = null;
        while (z) {
            int v = b.v(descriptor2);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(descriptor2, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(descriptor2, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                num = (Integer) b.s(descriptor2, 2, h6w.a, num);
                i |= 4;
            }
        }
        b.c(descriptor2);
        return new JsError(str, i, num, str2);
    }

    @Override // defpackage.myi
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, JsError value) {
        SerialDescriptor descriptor2 = getDescriptor();
        yjd b = encoder.b(descriptor2);
        JsError.a(value, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.uxs
    public KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
