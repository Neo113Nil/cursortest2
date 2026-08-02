package defpackage;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi._MoshiKotlinTypesExtensionsKt;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes8.dex */
public final class m80 implements JsonAdapter.Factory {
    @Override // com.squareup.moshi.JsonAdapter.Factory
    public final JsonAdapter create(Type type, Set set, Moshi moshi) {
        try {
            return (JsonAdapter) Class.forName(cvu0.v(_MoshiKotlinTypesExtensionsKt.getRawType(type).getName(), "$", "_", false).concat("_JsonAdapter")).getDeclaredConstructor(Moshi.class).newInstance(moshi);
        } catch (ClassNotFoundException unused) {
            try {
                return ((JsonAdapter.Factory) Class.forName(cvu0.v(_MoshiKotlinTypesExtensionsKt.getRawType(type).getName(), "$", "_", false).concat("_JsonAdapterFactory")).getDeclaredConstructor(null).newInstance(null)).create(type, set, moshi);
            } catch (ClassNotFoundException unused2) {
                return null;
            }
        }
    }
}
