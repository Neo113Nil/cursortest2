package defpackage;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.util.Map;
import kotlin.collections.EmptySet;

/* loaded from: classes3.dex */
public final class nee0 {
    public final JsonReader.Options a = JsonReader.Options.of("type", "payload");
    public final JsonAdapter b;

    public nee0(Moshi moshi) {
        this.b = moshi.adapter(Types.newParameterizedType(Map.class, String.class, String.class), EmptySet.a, "payload");
    }
}
