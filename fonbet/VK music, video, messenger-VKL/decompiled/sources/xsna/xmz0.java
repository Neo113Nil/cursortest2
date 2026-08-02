package xsna;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class xmz0 implements loz0 {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ esl b;

    public xmz0(esl eslVar, Bundle bundle) {
        this.a = bundle;
        Objects.requireNonNull(eslVar);
        this.b = eslVar;
    }

    @Override // xsna.loz0
    public final void a() {
        this.b.a.onCreate(this.a);
    }

    @Override // xsna.loz0
    public final int m() {
        return 1;
    }
}
