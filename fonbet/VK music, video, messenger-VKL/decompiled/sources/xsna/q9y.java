package xsna;

import android.util.Log;
import com.google.gson.internal.LinkedTreeMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* compiled from: JsonMapperExt.kt */
/* loaded from: classes6.dex */
public final class q9y {
    public static final MapBuilder a(b9y b9yVar) {
        x9y x9yVar;
        try {
            x9yVar = b9yVar.h();
        } catch (Exception unused) {
            Log.e("JsonElementMapper", b9yVar + " couldn't be casted to JsonObject");
            x9yVar = null;
        }
        if (x9yVar == null) {
            return null;
        }
        MapBuilder mapBuilder = new MapBuilder();
        Iterator it = ((LinkedTreeMap.b) x9yVar.b.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            try {
                mapBuilder.put(entry.getKey(), ((b9y) entry.getValue()).k());
            } catch (UnsupportedOperationException unused2) {
                Log.e("JsonElementMapper", "Field " + ((String) entry.getKey()) + " couldn't be casted to string");
            }
        }
        return mapBuilder.h();
    }
}
