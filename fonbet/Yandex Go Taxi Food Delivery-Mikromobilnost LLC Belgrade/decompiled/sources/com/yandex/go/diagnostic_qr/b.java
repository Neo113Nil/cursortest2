package com.yandex.go.diagnostic_qr;

import android.net.Uri;
import defpackage.fgp0;
import defpackage.tje;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class b implements fgp0 {
    public final a a;

    public b(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.fgp0
    public final Object a(Uri uri, Continuation continuation) {
        a aVar = this.a;
        tje.N(aVar.a, null, null, new QrDiagnosticDataInteractorImpl$screenCaptured$1(aVar, "screenshot", null), 3);
        return zy11.a;
    }

    public final void b() {
        a aVar = this.a;
        tje.N(aVar.a, null, null, new QrDiagnosticDataInteractorImpl$screenCaptured$1(aVar, "screencapture", null), 3);
    }
}
