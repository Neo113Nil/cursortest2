package androidx.appcompat.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes10.dex */
public abstract class l {
    public BroadcastReceiver a;
    public final /* synthetic */ AppCompatDelegateImpl b;

    public l(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.b = appCompatDelegateImpl;
    }

    public final void a() {
        BroadcastReceiver broadcastReceiver = this.a;
        if (broadcastReceiver != null) {
            try {
                this.b.mContext.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter b();

    public abstract int c();

    public abstract void d();

    public final void e() {
        a();
        IntentFilter b = b();
        if (b.countActions() == 0) {
            return;
        }
        if (this.a == null) {
            this.a = new BroadcastReceiver() { // from class: androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager$1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    l.this.d();
                }
            };
        }
        this.b.mContext.registerReceiver(this.a, b);
    }
}
