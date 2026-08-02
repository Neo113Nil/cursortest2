package androidx.media3.exoplayer;

import defpackage.a3x0;
import defpackage.m6u;

/* loaded from: classes10.dex */
public final class j {
    public final /* synthetic */ ExoPlayerImplInternal a;

    public j(ExoPlayerImplInternal exoPlayerImplInternal) {
        this.a = exoPlayerImplInternal;
    }

    public final void a() {
        this.a.requestForRendererSleep = true;
    }

    public final void b() {
        boolean z;
        m6u m6uVar;
        boolean z2;
        ExoPlayerImplInternal exoPlayerImplInternal = this.a;
        z = exoPlayerImplInternal.dynamicSchedulingEnabled;
        if (!z) {
            z2 = exoPlayerImplInternal.offloadSchedulingEnabled;
            if (!z2) {
                return;
            }
        }
        m6uVar = exoPlayerImplInternal.handler;
        ((a3x0) m6uVar).g(2);
    }
}
