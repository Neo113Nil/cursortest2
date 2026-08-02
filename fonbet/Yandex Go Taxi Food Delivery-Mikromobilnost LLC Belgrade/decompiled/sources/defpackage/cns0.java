package defpackage;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.ybsdk.core.common.data.network.adapters.SkipFailingElements;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes8.dex */
public final class cns0 implements JsonAdapter.Factory {
    @Override // com.squareup.moshi.JsonAdapter.Factory
    public final JsonAdapter create(Type type, Set set, Moshi moshi) {
        Set set2 = set;
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            return null;
        }
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            if (qoi0.a(((Annotation) it.next()).annotationType()).equals(qoi0.a(SkipFailingElements.class))) {
                if (!jl40.l(Types.getRawType(type), List.class)) {
                    return null;
                }
                JsonAdapter adapter = moshi.adapter(Types.collectionElementType(type, List.class));
                trp0 trp0Var = trp0.a;
                return new dex(adapter);
            }
        }
        return null;
    }
}
