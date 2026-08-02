package androidx.media3.exoplayer.smoothstreaming;

import androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser;
import defpackage.beh;
import defpackage.d6z;
import defpackage.dlh;
import defpackage.fe10;
import defpackage.gg90;
import defpackage.ipg;
import defpackage.o2v0;
import defpackage.rah;
import defpackage.rf10;
import defpackage.rmm;
import defpackage.tis0;
import defpackage.twy;
import defpackage.u1n;
import defpackage.uf10;
import defpackage.uxt0;
import defpackage.z8h;
import java.util.List;
import ru.yandex.video.m3.player.impl.source.DefaultMediaSourceFactory;

/* loaded from: classes10.dex */
public final class SsMediaSource$Factory implements rf10 {
    public final tis0 a;
    public final ipg b;
    public final z8h c;
    public rmm d;
    public twy e;
    public final long f;
    public DefaultMediaSourceFactory.FilteringManifestParser g;

    public SsMediaSource$Factory(tis0 tis0Var, ipg ipgVar) {
        this.a = tis0Var;
        this.b = ipgVar;
        this.d = new rah();
        this.e = new beh();
        this.f = 30000L;
        this.c = new z8h();
        tis0Var.b = true;
    }

    @Override // defpackage.rf10
    public final uf10 createMediaSource(fe10 fe10Var) {
        fe10Var.b.getClass();
        gg90 gg90Var = this.g;
        if (gg90Var == null) {
            gg90Var = new SsManifestParser();
        }
        List list = fe10Var.b.c;
        return new uxt0(fe10Var, this.b, !list.isEmpty() ? new u1n(20, gg90Var, list) : gg90Var, this.a, this.c, this.d.a(fe10Var), this.e, this.f);
    }

    @Override // defpackage.rf10
    public final rf10 experimentalParseSubtitlesDuringExtraction(boolean z) {
        this.a.b = z;
        return this;
    }

    @Override // defpackage.rf10
    public final int[] getSupportedTypes() {
        return new int[]{1};
    }

    @Override // defpackage.rf10
    public final rf10 setDrmSessionManagerProvider(rmm rmmVar) {
        d6z.u(rmmVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.d = rmmVar;
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
        this.a.w = (dlh) o2v0Var;
        return this;
    }

    public SsMediaSource$Factory(ipg ipgVar) {
        this(new tis0(ipgVar), ipgVar);
    }
}
