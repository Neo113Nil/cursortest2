package androidx.work;

import defpackage.c0w;
import defpackage.mng;
import defpackage.ong;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/OverwritingInputMerger;", "Lc0w;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends c0w {
    @Override // defpackage.c0w
    public final ong a(ArrayList arrayList) {
        mng mngVar = new mng();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(Collections.unmodifiableMap(((ong) it.next()).a));
        }
        mngVar.c(linkedHashMap);
        return mngVar.a();
    }
}
