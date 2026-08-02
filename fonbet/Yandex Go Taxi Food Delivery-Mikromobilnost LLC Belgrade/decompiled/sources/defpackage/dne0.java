package defpackage;

import android.content.Context;

/* loaded from: classes10.dex */
public final class dne0 {
    public final Context a;

    public dne0(Context context) {
        this.a = context;
    }

    public final cne0 a(String str) {
        return new cne0(new l2z(23, this, str));
    }

    public final cne0 b() {
        return a(this.a.getPackageName() + "_preferences");
    }
}
