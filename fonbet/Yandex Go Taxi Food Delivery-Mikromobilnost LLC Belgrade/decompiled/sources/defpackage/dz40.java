package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.f;
import androidx.core.app.b;

/* loaded from: classes10.dex */
public final class dz40 {
    public final String a;
    public final Context b;
    public final Activity c;
    public final oz40 d;
    public m50 e;

    public dz40(String str, Context context, Activity activity) {
        this.a = str;
        this.b = context;
        this.c = activity;
        this.d = f.j(qke.h(context, str) == 0 ? yza0.a : new xza0(b.M(activity, str)));
    }

    public final zza0 a() {
        return (zza0) this.d.getValue();
    }
}
