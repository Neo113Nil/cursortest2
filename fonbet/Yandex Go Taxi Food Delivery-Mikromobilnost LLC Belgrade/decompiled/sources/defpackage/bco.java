package defpackage;

import com.yandex.go.zone.dto.response.EstimatedWaitingDto$Exact;
import com.yandex.go.zone.dto.response.EstimatedWaitingDto$Range;
import com.yandex.go.zone.dto.response.c;

/* loaded from: classes8.dex */
public final class bco {
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ybo a(c cVar) {
        int i;
        double ceil;
        String b;
        if (cVar instanceof EstimatedWaitingDto$Exact) {
            ceil = Math.ceil(((EstimatedWaitingDto$Exact) cVar).getA() / 60.0d);
        } else {
            if (!(cVar instanceof EstimatedWaitingDto$Range)) {
                if (cVar != null) {
                    w511.b();
                    return null;
                }
                i = -1;
                b = cVar != null ? cVar.getB() : null;
                if (b == null) {
                    b = "";
                }
                return new ybo(i, b, cVar instanceof EstimatedWaitingDto$Range);
            }
            ceil = Math.ceil(((EstimatedWaitingDto$Range) cVar).getA() / 60.0d);
        }
        i = (int) ceil;
        if (cVar != null) {
        }
        if (b == null) {
        }
        return new ybo(i, b, cVar instanceof EstimatedWaitingDto$Range);
    }
}
