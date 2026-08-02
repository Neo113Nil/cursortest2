package com.yandex.fintechsdk.adapters.flex.sdk.impl.utils;

import android.os.Bundle;
import com.yandex.div.state.db.StateEntry;
import defpackage.h73;
import defpackage.j73;
import defpackage.rbx;
import defpackage.sbx;
import defpackage.u1m;
import defpackage.wex;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlinx.serialization.json.c;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0004\u001a+\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t0\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroid/os/Bundle;", "arguments", "Lu1m;", "extractDocumentQuery", "(Landroid/os/Bundle;)Lu1m;", "bundle", "unpack", "", "", "", "unpackParams", "(Landroid/os/Bundle;)Ljava/util/Map;", "bodyString", "", "parseBody", "(Ljava/lang/String;)Ljava/util/Map;", "impl-18-1-0_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DocumentQueryExtractingKt {
    public static final u1m extractDocumentQuery(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("query");
        if (bundle2 != null) {
            return unpack(bundle2);
        }
        return null;
    }

    private static final Map<String, Object> parseBody(String str) {
        c cVar;
        if (str != null) {
            rbx rbxVar = sbx.d;
            rbxVar.getClass();
            cVar = (c) rbxVar.b(c.Companion.serializer(), str);
        } else {
            cVar = null;
        }
        if (cVar != null) {
            return b.r(kotlin.sequences.b.o(new h73(1, cVar.a.entrySet()), new wex()));
        }
        return null;
    }

    private static final u1m unpack(Bundle bundle) {
        String string = bundle.getString(StateEntry.COLUMN_PATH);
        if (string == null) {
            string = "";
        }
        return new u1m(unpackParams(bundle.getBundle("params")), string, parseBody(bundle.getString("body")));
    }

    private static final Map<String, List<String>> unpackParams(Bundle bundle) {
        if (bundle == null) {
            return b.f();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            String[] stringArray = bundle.getStringArray(str);
            linkedHashMap.put(str, stringArray != null ? j73.d0(stringArray) : EmptyList.a);
        }
        return linkedHashMap;
    }
}
