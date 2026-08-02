package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: SemanticsUtils.android.kt */
/* loaded from: classes11.dex */
public final class xfh0 implements l590 {
    public final int b;
    public final List<xfh0> c;
    public Float d = null;
    public Float e = null;
    public qeh0 f = null;
    public qeh0 g = null;

    public xfh0(int i, ArrayList arrayList) {
        this.b = i;
        this.c = arrayList;
    }

    @Override // xsna.l590
    public final boolean d1() {
        return this.c.contains(this);
    }
}
