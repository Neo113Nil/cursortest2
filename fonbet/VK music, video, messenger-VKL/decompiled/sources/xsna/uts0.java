package xsna;

import android.content.Context;
import java.util.HashSet;

/* compiled from: VideoMinimizableBottomSheetContentSnapStrategy.kt */
/* loaded from: classes7.dex */
public final class uts0 extends com.vk.core.ui.bottomsheet.internal.b {
    public final Context a;
    public final com.vk.core.ui.bottomsheet.internal.b b;
    public final hbj0 c;

    public uts0(Context context, com.vk.core.ui.bottomsheet.internal.b bVar, hbj0 hbj0Var) {
        this.a = context;
        this.b = bVar;
        this.c = hbj0Var;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int c(int i, int i2, int i3) {
        if (!((Boolean) this.c.invoke()).booleanValue()) {
            return this.b.c(i, i2, i3);
        }
        HashSet hashSet = iah0.a;
        return fnj.a(this.a);
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int d(int i, int i2, int i3) {
        if (!((Boolean) this.c.invoke()).booleanValue()) {
            return this.b.d(i, i2, i3);
        }
        HashSet hashSet = iah0.a;
        return i2 - fnj.a(this.a);
    }
}
