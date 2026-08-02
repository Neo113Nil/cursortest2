package xsna;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Text.kt */
/* loaded from: classes4.dex */
public interface jbo0 {
    default String a(Context context) {
        if (this instanceof x8g0) {
            return context.getString(((x8g0) this).a);
        }
        if (this instanceof rqm0) {
            return ((rqm0) this).a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
