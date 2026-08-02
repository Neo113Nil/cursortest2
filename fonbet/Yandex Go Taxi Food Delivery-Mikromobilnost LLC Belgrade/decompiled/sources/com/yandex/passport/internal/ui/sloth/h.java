package com.yandex.passport.internal.ui.sloth;

import android.content.Context;
import android.net.http.SslError;
import defpackage.ql60;
import defpackage.rl60;
import defpackage.rt41;
import defpackage.st41;

/* loaded from: classes2.dex */
public final class h implements st41 {
    public final /* synthetic */ ru.domesticroots.webview.d a;

    public h(Context context) {
        this.a = new ru.domesticroots.webview.d(context, new rl60(context), new ql60());
    }

    @Override // defpackage.st41
    public final boolean b(SslError sslError, rt41 rt41Var) {
        return this.a.b(sslError, rt41Var);
    }
}
