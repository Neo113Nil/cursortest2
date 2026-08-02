package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes15.dex */
public final /* synthetic */ class m801 implements uxs {
    public static final m801 a;
    private static final SerialDescriptor descriptor;

    static {
        m801 m801Var = new m801();
        a = m801Var;
        exv exvVar = new exv("ru.yandex.taxi.widgets.data.dto.request.TrackingsScreen", m801Var);
        exvVar.j("name", false);
        descriptor = exvVar;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return new o801(decoder.w(descriptor).p());
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        String str = ((o801) obj).a;
        Encoder i = encoder.i(descriptor);
        if (i == null) {
            return;
        }
        i.t(str);
    }
}
