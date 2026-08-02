package defpackage;

import android.content.Context;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes10.dex */
public final class m3x0 {
    public final r0 a;
    public final gci0 b;

    public m3x0(Context context) {
        r0 c = bvf0.c(Boolean.valueOf((context.getResources().getConfiguration().uiMode & 48) == 32));
        this.a = c;
        this.b = e.d(c);
    }
}
