package defpackage;

import com.yandex.messaging.core.net.entities.StickerPacksData;

/* loaded from: classes15.dex */
public final class pcu0 {
    public final r4z a;
    public final odu0 b;

    public pcu0(r4z r4zVar, odu0 odu0Var) {
        this.a = r4zVar;
        this.b = odu0Var;
    }

    public final void a(String[] strArr) {
        StickerPacksData.PackData a = this.a.b.a("recent");
        String str = a != null ? a.packId : null;
        odu0 odu0Var = this.b;
        if (str == null || j73.y(strArr, str)) {
            odu0Var.d(strArr);
            return;
        }
        int length = strArr.length + 1;
        String[] strArr2 = new String[length];
        int i = 0;
        while (i < length) {
            strArr2[i] = i == 0 ? str : strArr[i - 1];
            i++;
        }
        odu0Var.d(strArr2);
    }
}
