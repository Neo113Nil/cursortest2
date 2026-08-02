package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: TextContextMenuData.kt */
/* loaded from: classes11.dex */
public final class vco0 {
    public static final vco0 b = new vco0(EmptyList.b);
    public final List<uco0> a;

    /* JADX WARN: Multi-variable type inference failed */
    public vco0(List<? extends uco0> list) {
        this.a = list;
    }

    public final String toString() {
        return air.b(')', "TextContextMenuData(components=", hgz.b(this.a, "\n\t", null, 56));
    }
}
