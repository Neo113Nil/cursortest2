package xsna;

import java.util.List;

/* compiled from: SearchService.kt */
/* loaded from: classes2.dex */
public final class qyh0 implements pyh0 {
    public final tfx d(List list) {
        tfx tfxVar = new tfx("search.addRecents", new az60(4), new jr(28));
        if (list != null) {
            tfx.p(tfxVar, "owner_ids", list, 0L, 12);
        }
        return tfxVar;
    }
}
