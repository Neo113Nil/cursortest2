package xsna;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import xsna.rvk;

/* compiled from: DataStoreSynStorage.kt */
/* loaded from: classes5.dex */
public final class uvk extends Lambda implements izs<rvk.a, rvk.a> {
    final /* synthetic */ String $pushToken;
    final /* synthetic */ long $syn;
    final /* synthetic */ rvk this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uvk(rvk rvkVar, String str, long j) {
        super(1);
        this.this$0 = rvkVar;
        this.$pushToken = str;
        this.$syn = j;
    }

    @Override // xsna.izs
    public final rvk.a invoke(rvk.a aVar) {
        Map f;
        rvk.a aVar2 = aVar;
        Map<String, Long> map = aVar2 != null ? aVar2.a : null;
        rvk rvkVar = this.this$0;
        String str = this.$pushToken;
        long j = this.$syn;
        if (map != null) {
            f = new LinkedHashMap(map);
            rvkVar.getClass();
            f.put(rvk.d(str), Long.valueOf(j));
        } else {
            rvkVar.getClass();
            f = on00.f(new Pair(rvk.d(str), Long.valueOf(j)));
        }
        return new rvk.a(f);
    }
}
