package xsna;

import android.view.View;
import xsna.pvj;

/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: classes6.dex */
public final class pwt0 extends kotlin.coroutines.a implements pvj {
    public final /* synthetic */ View b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwt0(View view) {
        super(pvj.a.b);
        this.b = view;
    }

    @Override // xsna.pvj
    public final void handleException(kotlin.coroutines.d dVar, Throwable th) {
        bdn bdnVar = bdn.a;
        myc0.h(q1u.b, ie00.a, null, new rwt0(this.b, th, null), 2);
    }
}
