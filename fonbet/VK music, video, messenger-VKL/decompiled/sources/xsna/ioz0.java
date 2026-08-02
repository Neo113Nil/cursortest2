package xsna;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class ioz0 implements loz0 {
    public final /* synthetic */ esl a;

    public ioz0(esl eslVar) {
        Objects.requireNonNull(eslVar);
        this.a = eslVar;
    }

    @Override // xsna.loz0
    public final void a() {
        this.a.a.onResume();
    }

    @Override // xsna.loz0
    public final int m() {
        return 5;
    }
}
