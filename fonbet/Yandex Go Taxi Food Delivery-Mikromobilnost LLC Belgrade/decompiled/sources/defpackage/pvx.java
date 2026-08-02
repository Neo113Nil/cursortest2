package defpackage;

import java.util.Calendar;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes6.dex */
public final /* synthetic */ class pvx implements uxs {
    public static final pvx a;
    private static final SerialDescriptor descriptor;

    static {
        pvx pvxVar = new pvx();
        a = pvxVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.net.taxi.dto.response.LaunchOrderResponse", pvxVar, 4);
        pluginGeneratedSerialDescriptor.j("orderid", true);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, true);
        pluginGeneratedSerialDescriptor.j("due", true);
        pluginGeneratedSerialDescriptor.j("parkid", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = rvx.e;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, i3yVarArr[1].getValue(), qke.n(vmt.a), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = rvx.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        DriveState driveState = null;
        Calendar calendar = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                driveState = (DriveState) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), driveState);
                i |= 2;
            } else if (v == 2) {
                calendar = (Calendar) b.s(serialDescriptor, 2, vmt.a, calendar);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new rvx(i, str, driveState, calendar, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        rvx rvxVar = (rvx) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = rvx.e;
        if (b.F() || !jl40.l(rvxVar.a, "")) {
            b.o(serialDescriptor, 0, rvxVar.a);
        }
        if (b.F() || rvxVar.b != DriveState.SEARCH) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), rvxVar.b);
        }
        if (b.F() || rvxVar.c != null) {
            b.g(serialDescriptor, 2, vmt.a, rvxVar.c);
        }
        if (b.F() || rvxVar.d != null) {
            b.g(serialDescriptor, 3, auu0.a, rvxVar.d);
        }
        b.c(serialDescriptor);
    }
}
