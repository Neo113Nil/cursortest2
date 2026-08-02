package defpackage;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import kotlin.NotImplementedError;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes9.dex */
public abstract class c6x implements KSerializer {
    public final KSerializer a;
    public final SerialDescriptor b;

    public c6x() {
        KSerializer serializer = c.Companion.serializer();
        this.a = serializer;
        this.b = serializer.getDescriptor();
    }

    public abstract b6x a(String str, x4x x4xVar);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        ncx ncxVar = (ncx) decoder;
        c cVar = (c) decoder.B(this.a);
        Object obj = cVar.get("name");
        if (obj == null) {
            ny61.g("Missing required property \"name\"");
            return null;
        }
        String a = qcx.n((b) obj).a();
        Object obj2 = cVar.get(AuthSdkActivity.RESPONSE_TYPE_CODE);
        if (obj2 == null) {
            ny61.g("Missing required property \"code\"");
            return null;
        }
        return a(a, (x4x) ncxVar.d().a(a5x.a, (b) obj2));
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        throw new NotImplementedError("JasonEvaluator serialization is not supported");
    }
}
