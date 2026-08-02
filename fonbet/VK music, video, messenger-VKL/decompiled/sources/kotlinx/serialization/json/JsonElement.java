package kotlinx.serialization.json;

import kotlinx.serialization.KSerializer;
import xsna.e9y;
import xsna.imi0;

/* compiled from: JsonElement.kt */
@imi0(with = e9y.class)
/* loaded from: classes8.dex */
public abstract class JsonElement {
    public static final Companion Companion = new Companion();

    /* compiled from: JsonElement.kt */
    public static final class Companion {
        public final KSerializer<JsonElement> serializer() {
            return e9y.a;
        }
    }
}
