package ru.mail.libverify.l0;

import android.content.Context;
import androidx.annotation.NonNull;
import xsna.gs2;

/* loaded from: classes9.dex */
public abstract class a extends h {

    @NonNull
    private final ru.mail.libverify.g0.d e;
    private final int f;
    private final Runnable g;

    public a(@NonNull ru.mail.libverify.g0.d dVar, @NonNull Context context) {
        super(context);
        this.g = new gs2(this, 19);
        this.e = dVar;
        this.f = 500;
    }

    @Override // ru.mail.libverify.l0.h, ru.mail.libverify.platform.storage.KeyValueStorage
    public final synchronized void commit() {
        this.e.b().removeCallbacks(this.g);
        this.e.b().postDelayed(this.g, this.f);
    }

    @Override // ru.mail.libverify.platform.storage.KeyValueStorage
    public final void commitSync() {
        super.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        super.commit();
    }
}
