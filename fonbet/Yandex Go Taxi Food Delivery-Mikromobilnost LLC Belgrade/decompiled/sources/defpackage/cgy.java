package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class cgy implements dw {
    public final LinkedHashMap a = new LinkedHashMap();

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        bgy bgyVar = (bgy) krVar;
        String str = bgyVar.c;
        LinkedHashMap linkedHashMap = this.a;
        Integer num = (Integer) linkedHashMap.get(str);
        int intValue = num != null ? num.intValue() : 0;
        if (intValue >= bgyVar.b) {
            return;
        }
        linkedHashMap.put(bgyVar.c, Integer.valueOf(intValue + 1));
        n6uVar.c.b(bgyVar.a, n6uVar.b, n6uVar.e);
    }
}
