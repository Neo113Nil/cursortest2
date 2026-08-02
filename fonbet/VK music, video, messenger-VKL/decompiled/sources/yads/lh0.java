package yads;

import java.util.List;
import xsna.epx;
import xsna.ikn;
import xsna.zkn;

/* loaded from: classes10.dex */
public final class lh0 {
    public static zkn a(ikn iknVar, String str) {
        List<zkn> m = iknVar.m();
        if (m == null) {
            return null;
        }
        for (zkn zknVar : m) {
            if (epx.f(str, zknVar.a)) {
                return zknVar;
            }
        }
        return null;
    }
}
