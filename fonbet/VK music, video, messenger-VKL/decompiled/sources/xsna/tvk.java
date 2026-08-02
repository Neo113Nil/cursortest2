package xsna;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import xsna.rvk;

/* compiled from: DataStoreSynStorage.kt */
/* loaded from: classes5.dex */
public final class tvk extends Lambda implements izs<rvk.a, rvk.a> {
    final /* synthetic */ String $pushToken;
    final /* synthetic */ rvk this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tvk(rvk rvkVar, String str) {
        super(1);
        this.this$0 = rvkVar;
        this.$pushToken = str;
    }

    @Override // xsna.izs
    public final rvk.a invoke(rvk.a aVar) {
        rvk.a aVar2 = aVar;
        Map<String, Long> map = aVar2 != null ? aVar2.a : null;
        rvk rvkVar = this.this$0;
        String str = this.$pushToken;
        if (map == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        rvkVar.getClass();
        linkedHashMap.remove(rvk.d(str));
        return new rvk.a(linkedHashMap);
    }
}
