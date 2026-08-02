package androidx.media3.exoplayer.dash;

import defpackage.beh;
import defpackage.cgg;
import defpackage.d6z;
import defpackage.fe10;
import defpackage.gg90;
import defpackage.ggg;
import defpackage.ipg;
import defpackage.o2v0;
import defpackage.o3;
import defpackage.ogg;
import defpackage.rah;
import defpackage.rf10;
import defpackage.rmm;
import defpackage.twy;
import defpackage.u1n;
import defpackage.uf10;
import defpackage.z8h;
import java.util.List;
import ru.yandex.video.m3.player.impl.source.DefaultMediaSourceFactory;

/* loaded from: classes10.dex */
public final class DashMediaSource$Factory implements rf10 {
    public final cgg a;
    public final ipg b;
    public rmm c;
    public final z8h d;
    public twy e;
    public final long f;
    public final long g;
    public DefaultMediaSourceFactory.FilteringManifestParser h;

    public DashMediaSource$Factory(cgg cggVar, ipg ipgVar) {
        this.a = cggVar;
        this.b = ipgVar;
        this.c = new rah();
        this.e = new beh();
        this.f = 30000L;
        this.g = 5000000L;
        this.d = new z8h();
        cggVar.experimentalParseSubtitlesDuringExtraction(true);
    }

    @Override // defpackage.rf10
    public final uf10 createMediaSource(fe10 fe10Var) {
        fe10Var.b.getClass();
        gg90 gg90Var = this.h;
        if (gg90Var == null) {
            gg90Var = new ggg();
        }
        List list = fe10Var.b.c;
        return new ogg(fe10Var, this.b, !list.isEmpty() ? new u1n(20, gg90Var, list) : gg90Var, this.a, this.d, this.c.a(fe10Var), this.e, this.f, this.g);
    }

    @Override // defpackage.rf10
    public final rf10 experimentalParseSubtitlesDuringExtraction(boolean z) {
        this.a.experimentalParseSubtitlesDuringExtraction(z);
        return this;
    }

    @Override // defpackage.rf10
    public final rf10 experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        this.a.experimentalSetCodecsToParseWithinGopSampleDependencies(0);
        return this;
    }

    @Override // defpackage.rf10
    public final int[] getSupportedTypes() {
        return new int[]{0};
    }

    @Override // defpackage.rf10
    public final rf10 setDrmSessionManagerProvider(rmm rmmVar) {
        d6z.u(rmmVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.c = rmmVar;
        return this;
    }

    @Override // defpackage.rf10
    public final rf10 setLoadErrorHandlingPolicy(twy twyVar) {
        d6z.u(twyVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.e = twyVar;
        return this;
    }

    @Override // defpackage.rf10
    public final rf10 setSubtitleParserFactory(o2v0 o2v0Var) {
        this.a.setSubtitleParserFactory(o2v0Var);
        return this;
    }

    public DashMediaSource$Factory(ipg ipgVar) {
        this(new o3(ipgVar), ipgVar);
    }
}
