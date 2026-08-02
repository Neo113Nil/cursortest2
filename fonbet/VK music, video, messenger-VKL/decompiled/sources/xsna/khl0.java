package xsna;

import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: StorageNotLowTracker.kt */
/* loaded from: classes.dex */
public final class khl0 extends ei8<Boolean> {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r0.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L18;
     */
    @Override // xsna.k6j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        Intent registerReceiver = this.b.registerReceiver(null, e());
        boolean z = true;
        if (registerReceiver != null && registerReceiver.getAction() != null) {
            String action = registerReceiver.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode == -1181163412) {
                    action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                } else if (hashCode == -730838620) {
                }
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // xsna.ei8
    public final IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // xsna.ei8
    public final void f(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        m100 c = m100.c();
        int i = lhl0.a;
        intent.getAction();
        c.getClass();
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode == -1181163412) {
                if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    b(Boolean.FALSE);
                }
            } else if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                b(Boolean.TRUE);
            }
        }
    }
}
