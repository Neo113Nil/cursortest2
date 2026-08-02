package defpackage;

import com.adjust.sdk.Constants;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public final class fc80 extends d380 {
    public final Map e;

    public fc80(String str, String str2, String str3, Map map) {
        super(str, str2, str3);
        this.e = map;
    }

    @Override // defpackage.d380
    public final LinkedHashMap e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(super.e());
        Map map = this.e;
        if (map != null) {
            linkedHashMap.put(Constants.REFERRER_API_META, map);
        }
        return linkedHashMap;
    }
}
