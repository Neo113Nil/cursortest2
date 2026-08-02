package ru.mail.libverify.i;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import ru.mail.libverify.api.j;

/* loaded from: classes9.dex */
public final class a implements j.c {
    private final WeakReference<b> a;
    private final Handler b = new Handler(Looper.getMainLooper());

    public a(b bVar) {
        this.a = new WeakReference<>(bVar);
    }

    @Override // ru.mail.libverify.api.j.c
    public final void a(j.b bVar) {
        b bVar2 = this.a.get();
        if (bVar2 == null) {
            return;
        }
        this.b.post(new xsna.h(12, bVar2, bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(b bVar, j.b bVar2) {
        bVar.a(bVar2);
    }
}
