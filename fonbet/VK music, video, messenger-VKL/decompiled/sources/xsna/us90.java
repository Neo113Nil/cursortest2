package xsna;

import android.content.Context;
import xsna.nzl;

/* compiled from: ContentSnapStrategy.kt */
/* loaded from: classes17.dex */
public final class us90 extends com.vk.core.ui.bottomsheet.internal.b {
    public final Context a;
    public final nzl.a b;

    public us90(Context context, nzl.a aVar) {
        this.a = context;
        this.b = aVar;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int c(int i, int i2, int i3) {
        Context context = this.a;
        return iah0.s(context) ? fnj.a(context) : (int) ((1.0f - this.b.a(context)) * i2);
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int d(int i, int i2, int i3) {
        Context context = this.a;
        boolean s = iah0.s(context);
        nzl.a aVar = this.b;
        if (!s) {
            return (int) (aVar.a(context) * i2);
        }
        int a = iah0.a(16) + ((int) (aVar.a(context) * i2));
        return Math.max(a, a > 0 ? a : 0);
    }
}
