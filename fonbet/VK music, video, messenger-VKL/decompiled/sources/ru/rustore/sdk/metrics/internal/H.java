package ru.rustore.sdk.metrics.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import xsna.c5g;
import xsna.fez0;
import xsna.gzs;
import xsna.swx;

/* loaded from: classes11.dex */
public final class H extends Lambda implements gzs<String> {
    public final /* synthetic */ List<swx> a;
    public final /* synthetic */ int b = 10;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(List list) {
        super(0);
        this.a = list;
    }

    @Override // xsna.gzs
    public final String invoke() {
        List<swx> list = this.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new fez0(((swx) it.next()).a));
        }
        return "Getting first " + this.b + " from storage: " + arrayList;
    }
}
