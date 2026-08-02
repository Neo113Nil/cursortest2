package xsna;

import android.util.LruCache;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class cj01 extends LruCache {
    public final /* synthetic */ pv10 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj01(pv10 pv10Var) {
        super(20);
        this.a = pv10Var;
    }

    @Override // android.util.LruCache
    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        Integer num = (Integer) obj;
        if (z) {
            ArrayList arrayList = this.a.g;
            exc0.i(arrayList);
            arrayList.add(num);
        }
    }
}
