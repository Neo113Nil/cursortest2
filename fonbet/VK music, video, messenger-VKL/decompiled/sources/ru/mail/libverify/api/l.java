package ru.mail.libverify.api;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.concurrent.Future;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.api.m;
import ru.mail.libverify.j0.j;

/* loaded from: classes9.dex */
final class l implements j.c<ru.mail.libverify.m.j> {
    final /* synthetic */ ru.mail.libverify.requests.i a;
    final /* synthetic */ m.b b;
    final /* synthetic */ String c;
    final /* synthetic */ m d;

    public l(m mVar, ru.mail.libverify.requests.i iVar, m.b bVar, String str) {
        this.d = mVar;
        this.a = iVar;
        this.b = bVar;
        this.c = str;
    }

    @Override // ru.mail.libverify.j0.j.c
    public final void a(@NonNull Future<ru.mail.libverify.m.j> future) {
        VerificationApi.PhoneCheckResult a;
        HashMap hashMap;
        if (future.isCancelled()) {
            return;
        }
        a = this.d.a(this.a, future, this.b);
        hashMap = this.d.a;
        hashMap.remove(this.c);
        m mVar = this.d;
        m.b bVar = this.b;
        mVar.getClass();
        m.a(bVar, a);
    }
}
