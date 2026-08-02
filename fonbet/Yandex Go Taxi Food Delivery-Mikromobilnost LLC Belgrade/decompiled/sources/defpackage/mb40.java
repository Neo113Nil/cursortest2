package defpackage;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.qb40;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class mb40 implements uxs {
    public static final mb40 a;
    private static final SerialDescriptor descriptor;

    static {
        mb40 mb40Var = new mb40();
        a = mb40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.trains.checkout.model.MtTrainCheckoutRequest", mb40Var, 4);
        pluginGeneratedSerialDescriptor.j(AuthSdkActivity.RESPONSE_TYPE_TOKEN, true);
        pluginGeneratedSerialDescriptor.j("payment_info", true);
        pluginGeneratedSerialDescriptor.j("order_info", true);
        pluginGeneratedSerialDescriptor.j("payload", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, ob40.a, bb40.a, qb40.e[3].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = qb40.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        qb40.a aVar = null;
        db40 db40Var = null;
        Map map = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                aVar = (qb40.a) b.A(serialDescriptor, 1, ob40.a, aVar);
                i |= 2;
            } else if (v == 2) {
                db40Var = (db40) b.A(serialDescriptor, 2, bb40.a, db40Var);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                map = (Map) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), map);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new qb40(i, str, aVar, db40Var, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qb40 qb40Var = (qb40) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = qb40.e;
        int i = 0;
        if (b.F() || !jl40.l(qb40Var.a, "")) {
            b.o(serialDescriptor, 0, qb40Var.a);
        }
        if (b.F() || !jl40.l(qb40Var.b, new qb40.a(i))) {
            b.e(serialDescriptor, 1, ob40.a, qb40Var.b);
        }
        if (b.F() || !jl40.l(qb40Var.c, new db40(0))) {
            b.e(serialDescriptor, 2, bb40.a, qb40Var.c);
        }
        if (b.F() || !jl40.l(qb40Var.d, b.f())) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), qb40Var.d);
        }
        b.c(serialDescriptor);
    }
}
