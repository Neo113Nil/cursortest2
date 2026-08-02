package xsna;

import android.content.Context;
import com.vk.libdelayedjobs.WorkPolicy;

/* compiled from: PushContentVisibilityManager.kt */
/* loaded from: classes.dex */
public final class ehe0 {
    public final Context a;
    public ug5 b;

    public ehe0(Context context, ug5 ug5Var) {
        this.a = context;
        this.b = ug5Var;
    }

    public static void a(long j) {
        ((xsl) uh.b.b()).a("HidePushContentJob", new g4v(new fyx()), new usl(WorkPolicy.REPLACE, j, 252));
    }
}
