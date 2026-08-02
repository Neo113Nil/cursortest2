package xsna;

import android.content.Context;
import xsna.c430;
import xsna.ef6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class cf6 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cf6(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ef6 ef6Var = (ef6) this.d;
                return new i3k(ef6Var.r(), ef6Var.q(), new ef6.b(0, ef6Var, ef6.class, "isLastPlayable", "isLastPlayable()Z", 0), new ef6.c(ef6Var, ef6.class, "videoFocused", "getVideoFocused()Z", 0), new ef6.d(0, ef6Var, ef6.class, "onCoverClick", "onCoverClick()V", 0), this.c);
            default:
                new c430.a((Context) this.d, this.c).I0("ModerationOnlyForAdultDialog");
                return s3q0.a;
        }
    }
}
