package androidx.window.layout;

import android.app.Activity;
import defpackage.o400;
import defpackage.o651;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.uyj;
import defpackage.z551;
import kotlinx.coroutines.flow.b;
import kotlinx.coroutines.flow.e;

/* loaded from: classes10.dex */
public final class a implements o651 {
    public final z551 a;

    public a(z551 z551Var) {
        this.a = z551Var;
    }

    public final tpr a(Activity activity) {
        b g = e.g(new WindowInfoTrackerImpl$windowLayoutInfo$2(this, activity, null));
        sjh sjhVar = uyj.a;
        return e.F(g, o400.a);
    }
}
