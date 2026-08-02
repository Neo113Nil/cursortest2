package xsna;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* compiled from: JsonTransformingSerializer.kt */
/* loaded from: classes8.dex */
public abstract class zay<T> implements KSerializer<T> {
    private final KSerializer<T> tSerializer;

    public zay(KSerializer<T> kSerializer) {
        this.tSerializer = kSerializer;
    }

    @Override // xsna.a3m
    public final T deserialize(Decoder decoder) {
        Decoder iayVar;
        x8y d = kn4.d(decoder);
        JsonElement l = d.l();
        j8y f = d.f();
        KSerializer<T> kSerializer = this.tSerializer;
        JsonElement transformDeserialize = transformDeserialize(l);
        f.getClass();
        String str = null;
        if (transformDeserialize instanceof JsonObject) {
            iayVar = new aby(f, (JsonObject) transformDeserialize, str, 12);
        } else if (transformDeserialize instanceof JsonArray) {
            iayVar = new cby(f, (JsonArray) transformDeserialize);
        } else {
            if (!(transformDeserialize instanceof o9y) && !transformDeserialize.equals(JsonNull.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            iayVar = new iay(f, (JsonPrimitive) transformDeserialize, null);
        }
        return (T) iayVar.h(kSerializer);
    }

    @Override // xsna.mmi0, xsna.a3m
    public SerialDescriptor getDescriptor() {
        return this.tSerializer.getDescriptor();
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, T t) {
        g9y e = kn4.e(encoder);
        j8y f = e.f();
        KSerializer<T> kSerializer = this.tSerializer;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        new bby(f, new j6l0(ref$ObjectRef, 10)).B(kSerializer, t);
        T t2 = ref$ObjectRef.element;
        e.E(transformSerialize(t2 == null ? null : (JsonElement) t2));
    }

    public JsonElement transformDeserialize(JsonElement jsonElement) {
        return jsonElement;
    }

    public JsonElement transformSerialize(JsonElement jsonElement) {
        return jsonElement;
    }
}
