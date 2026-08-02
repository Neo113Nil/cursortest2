package xsna;

import com.vk.geo.impl.model.VisibleStyle;
import com.vk.geo.impl.model.id.StringId;
import java.util.Map;

/* compiled from: Styles.kt */
@vby
/* loaded from: classes2.dex */
public final class qqm0 implements Iterable<Map.Entry<? extends StringId, ? extends VisibleStyle>>, gcy {
    public static final VisibleStyle a(zk3<StringId, VisibleStyle> zk3Var, String str) {
        return zk3Var.get(new StringId(str));
    }

    public static final void b(zk3<StringId, VisibleStyle> zk3Var, String str, int i) {
        zk3Var.put(new StringId(str), new VisibleStyle(i));
    }
}
