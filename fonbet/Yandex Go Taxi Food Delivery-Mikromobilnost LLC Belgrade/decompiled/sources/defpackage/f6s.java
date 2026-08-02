package defpackage;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.util.Map;

/* loaded from: classes15.dex */
public final class f6s {
    public final JsonAdapter a;
    public final JsonAdapter b;

    public f6s(Moshi moshi) {
        this.a = moshi.adapter(Object.class);
        this.b = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Object.class));
    }
}
