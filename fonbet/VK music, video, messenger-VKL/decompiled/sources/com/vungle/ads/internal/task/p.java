package com.vungle.ads.internal.task;

import android.content.Context;
import com.vungle.ads.internal.util.PathProvider;

/* loaded from: classes7.dex */
public final class p implements e {
    public final Context a;
    public final PathProvider b;

    public p(Context context, PathProvider pathProvider) {
        this.a = context;
        this.b = pathProvider;
    }

    public final d a(String str) {
        if (str.length() == 0) {
            throw new o("Job tag is null");
        }
        if (str.equals("CleanupJob")) {
            return new c(this.a, this.b);
        }
        if (str.equals("ResendTpatJob")) {
            return new m(this.a, this.b);
        }
        throw new o(com.iab.omid.library.vungle.d.a("Unknown Job Type ", str));
    }
}
