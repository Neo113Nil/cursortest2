package xsna;

import java.util.List;
import xsna.asx;

/* compiled from: InviteFriendsTabExt.kt */
/* loaded from: classes14.dex */
public final class zrx {
    public static final yrx a(yrx yrxVar, List<jis> list) {
        boolean isEmpty = list.isEmpty();
        asx asxVar = asx.c.a;
        if (!isEmpty) {
            asx asxVar2 = yrxVar.c;
            if (asxVar2 instanceof asx.a) {
                asxVar = asx.a.a((asx.a) asxVar2, list);
            } else if (!list.isEmpty()) {
                asxVar = new asx.a(list, null);
            }
        }
        return yrx.a(yrxVar, 0, asxVar, 3);
    }
}
