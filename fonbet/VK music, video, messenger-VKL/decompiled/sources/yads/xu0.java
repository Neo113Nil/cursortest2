package yads;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import xsna.izs;

/* loaded from: classes10.dex */
public final class xu0 extends Lambda implements izs {
    public static final xu0 b = new xu0();

    public xu0() {
        super(1);
    }

    public static String a(Map.Entry entry) {
        return entry.getKey() + "=" + entry.getValue();
    }

    @Override // xsna.izs
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a((Map.Entry) obj);
    }
}
