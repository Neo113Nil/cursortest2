package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes13.dex */
public final class qi01 extends BroadcastReceiver {
    public final /* synthetic */ bk01 a;

    public /* synthetic */ qi01(bk01 bk01Var) {
        this.a = bk01Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        r501 r501Var = (r501) this.a;
        tk01 tk01Var = r501Var.a;
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            tk01Var.a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        tk01Var.a("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            tk01Var.a("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        tk01Var.a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        tk01Var.a("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
        tk01Var.a("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
        ctz0 ctz0Var = new ctz0(intent.getIntExtra("install.status", 0), intent.getStringExtra("package.name"), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0));
        tk01Var.a("ListenerRegistryBroadcastReceiver.onReceive: %s", ctz0Var);
        r501Var.c(ctz0Var);
    }
}
