package kotlinx.serialization.json;

import kotlinx.serialization.KSerializer;
import xsna.imi0;
import xsna.kay;

/* compiled from: JsonElement.kt */
@imi0(with = kay.class)
/* loaded from: classes8.dex */
public abstract class JsonPrimitive extends JsonElement {
    public static final Companion Companion = new Companion();

    /* compiled from: JsonElement.kt */
    public static final class Companion {
        public final KSerializer<JsonPrimitive> serializer() {
            return kay.a;
        }
    }

    public abstract String c();

    public String toString() {
        return c();
    }
}
