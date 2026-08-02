package com.yandex.passport.internal.interaction;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.data.network.gc;
import com.yandex.passport.data.network.mc;
import com.yandex.passport.internal.network.m;
import com.yandex.passport.internal.ui.domik.BaseTrack;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ b a;
    public final /* synthetic */ BaseTrack b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean w;

    public /* synthetic */ f(b bVar, BaseTrack baseTrack, String str, boolean z) {
        this.a = bVar;
        this.b = baseTrack;
        this.c = str;
        this.w = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar = this.a;
        BaseTrack baseTrack = this.b;
        String str = this.c;
        boolean z = this.w;
        try {
            mc mcVar = (mc) bVar.f;
            com.yandex.passport.internal.network.mappers.b bVar2 = (com.yandex.passport.internal.network.mappers.b) bVar.e;
            Environment requireEnvironment = baseTrack.requireEnvironment();
            bVar2.getClass();
            m.b(mcVar, new gc(com.yandex.passport.internal.network.mappers.b.a(requireEnvironment), baseTrack.requireTrackId(), str, z));
            bVar.c.m(Boolean.FALSE);
            bVar.g.invoke(baseTrack);
        } catch (Throwable th) {
            bVar.c.m(Boolean.FALSE);
            bVar.b.m(bVar.d.a(th));
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Verify sms error:", th);
            }
        }
    }
}
