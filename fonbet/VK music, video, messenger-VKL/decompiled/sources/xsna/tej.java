package xsna;

import xsna.b25;

/* compiled from: ContactsSyncPrefs.kt */
/* loaded from: classes.dex */
public final class tej implements b25.a {
    @Override // xsna.b25.a
    public final void d(tbu0 tbu0Var) {
        synchronized (com.vk.contacts.f.f) {
            try {
                paj0 paj0Var = com.vk.contacts.f.g;
                if (paj0Var != null) {
                    paj0Var.unregisterOnSharedPreferenceChangeListener(com.vk.contacts.f.i);
                }
                com.vk.contacts.f.g = null;
                com.vk.contacts.f.h = null;
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
