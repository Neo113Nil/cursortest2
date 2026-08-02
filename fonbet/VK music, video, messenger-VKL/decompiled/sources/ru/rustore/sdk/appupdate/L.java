package ru.rustore.sdk.appupdate;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ru.rustore.sdk.appupdate.model.InstallState;
import xsna.epx;
import xsna.s3q0;
import xsna.yh50;
import xsna.zby;

/* loaded from: classes9.dex */
public final class L extends BroadcastReceiver {
    public final zby a;

    public L(zby zbyVar) {
        this.a = zbyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Object, ru.rustore.sdk.appupdate.model.InstallState] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ?? of$sdk_public_appupdate_release;
        Bundle extras = intent.getExtras();
        if (extras == null || (of$sdk_public_appupdate_release = InstallState.Companion.of$sdk_public_appupdate_release(extras)) == 0) {
            return;
        }
        zby zbyVar = this.a;
        zbyVar.getClass();
        yh50<InstallState> yh50Var = zbyVar.a;
        synchronized (yh50Var.a) {
            try {
                if (!epx.f(of$sdk_public_appupdate_release, yh50Var.c)) {
                    yh50Var.c = of$sdk_public_appupdate_release;
                    yh50Var.b.a(of$sdk_public_appupdate_release);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
