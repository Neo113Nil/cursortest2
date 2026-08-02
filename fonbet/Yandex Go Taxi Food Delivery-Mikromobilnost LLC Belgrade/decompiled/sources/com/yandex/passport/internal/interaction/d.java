package com.yandex.passport.internal.interaction;

import com.yandex.passport.internal.core.accounts.p;
import com.yandex.passport.internal.ui.social.gimap.GimapTrack;
import com.yandex.passport.legacy.lx.m;

/* loaded from: classes2.dex */
public final class d extends c {
    public final p d;

    public d(p pVar) {
        this.d = pVar;
    }

    public final void a(GimapTrack gimapTrack) {
        this.c.m(Boolean.TRUE);
        this.a.a.add(m.d(new a(1, this, gimapTrack)));
    }
}
