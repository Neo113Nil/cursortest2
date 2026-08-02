package ru.mail.libverify.m0;

import java.util.HashMap;
import java.util.TimerTask;

/* loaded from: classes9.dex */
public final class b extends TimerTask {
    final /* synthetic */ c a;
    final /* synthetic */ String b;
    final /* synthetic */ ru.mail.libverify.p0.b c;
    final /* synthetic */ Runnable d;

    public b(c cVar, String str, ru.mail.libverify.p0.b bVar, Runnable runnable) {
        this.a = cVar;
        this.b = str;
        this.c = bVar;
        this.d = runnable;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        HashMap hashMap;
        hashMap = this.a.a;
        hashMap.remove(this.b);
        ru.mail.libverify.p0.b bVar = this.c;
        if (bVar != null) {
            bVar.post(this.d);
        } else {
            this.d.run();
        }
    }
}
