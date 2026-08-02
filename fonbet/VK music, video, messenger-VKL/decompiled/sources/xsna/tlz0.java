package xsna;

import android.app.Activity;
import android.os.Bundle;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class tlz0 implements loz0 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ esl d;

    public tlz0(esl eslVar, Activity activity, Bundle bundle, Bundle bundle2) {
        this.a = activity;
        this.b = bundle;
        this.c = bundle2;
        Objects.requireNonNull(eslVar);
        this.d = eslVar;
    }

    @Override // xsna.loz0
    public final void a() {
        this.d.a.a(this.a, this.b, this.c);
    }

    @Override // xsna.loz0
    public final int m() {
        return 0;
    }
}
