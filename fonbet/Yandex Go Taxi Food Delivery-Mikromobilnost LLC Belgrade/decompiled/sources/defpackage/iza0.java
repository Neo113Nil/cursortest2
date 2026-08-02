package defpackage;

import java.util.ArrayList;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public final class iza0 {
    public int a = -1;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    public final hza0 a() {
        int i = this.a;
        Integer valueOf = Integer.valueOf(i);
        if (i == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            return new hza0(a.J0(this.b), a.J0(this.c), valueOf.intValue());
        }
        ny61.g("requestCode is required");
        return null;
    }
}
