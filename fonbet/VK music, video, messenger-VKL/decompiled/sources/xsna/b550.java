package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import xsna.k840;
import xsna.y050;

/* compiled from: MusicRouterImpl.kt */
/* loaded from: classes.dex */
public final class b550 implements a550 {
    public final y050 a;
    public final wk40 b;

    public b550(y050 y050Var, wk40 wk40Var) {
        this.a = y050Var;
        this.b = wk40Var;
    }

    @Override // xsna.a550
    public final void a(Context context, UserId userId, int i, String str, String str2, String str3, boolean z, String str4) {
        boolean contains = k840.b.b().contains(Integer.valueOf(i));
        if (i < 0 && !contains) {
            this.b.f(context, userId, str2, str3, z);
        } else {
            this.a.a(context, new y050.b.C4065b(userId, i, str, str2, null, str4, 48));
        }
    }
}
