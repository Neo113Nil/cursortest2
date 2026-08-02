package defpackage;

import android.app.Activity;
import android.content.Context;

/* loaded from: classes15.dex */
public final class ikk implements hkk {
    public final Activity a;
    public final faj b;

    public ikk(Activity activity, faj fajVar) {
        this.a = activity;
        this.b = fajVar;
    }

    @Override // defpackage.hkk
    public final Context getContext() {
        return this.a;
    }

    @Override // defpackage.hkk
    public final tzk getViewController() {
        return (tzk) this.b.get();
    }
}
