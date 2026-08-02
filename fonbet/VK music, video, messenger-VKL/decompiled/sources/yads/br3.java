package yads;

import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdSize;
import com.yandex.mobile.ads.common.Creative;
import java.util.ArrayList;
import java.util.List;
import xsna.c5g;

/* loaded from: classes10.dex */
public final class br3 {
    public static AdInfo a(c00 c00Var) {
        la laVar = c00Var.b;
        AdSize adSize = laVar != null ? new AdSize(laVar.a, laVar.b) : null;
        List<k00> list = c00Var.d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (k00 k00Var : list) {
            arrayList.add(new Creative(k00Var.a, k00Var.b));
        }
        return new AdInfo(c00Var.a, adSize, c00Var.c, arrayList);
    }
}
