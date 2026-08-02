package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.coroutines.Continuation;

/* loaded from: classes10.dex */
public final class n0k implements rjs0 {
    public final Context a;

    public n0k(Context context) {
        this.a = context;
    }

    @Override // defpackage.rjs0
    public final Object a(Continuation continuation) {
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        lkj lkjVar = new lkj(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new wis0(lkjVar, lkjVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0k) {
            return jl40.l(this.a, ((n0k) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
