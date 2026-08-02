package androidx.media3.exoplayer.hls;

import defpackage.beh;
import defpackage.bou;
import defpackage.d6z;
import defpackage.dlh;
import defpackage.fe10;
import defpackage.gyc;
import defpackage.ipg;
import defpackage.jch;
import defpackage.kch;
import defpackage.mch;
import defpackage.o2v0;
import defpackage.qmm;
import defpackage.rah;
import defpackage.rf10;
import defpackage.rmm;
import defpackage.twy;
import defpackage.uf10;
import defpackage.vnu;
import defpackage.x8e;
import defpackage.z8h;
import defpackage.zrm;
import java.util.List;

/* loaded from: classes10.dex */
public final class HlsMediaSource$Factory implements rf10 {
    public final gyc a;
    public jch b;
    public dlh c;
    public rmm h = new rah();
    public bou e = new kch();
    public final x8e f = mch.H;
    public twy i = new beh();
    public final z8h g = new z8h();
    public final int k = 1;
    public final long l = -9223372036854775807L;
    public final boolean j = true;
    public boolean d = true;

    public HlsMediaSource$Factory(ipg ipgVar) {
        this.a = new gyc(ipgVar);
    }

    @Override // defpackage.rf10
    public final uf10 createMediaSource(fe10 fe10Var) {
        fe10Var.b.getClass();
        if (this.b == null) {
            this.b = new jch();
        }
        dlh dlhVar = this.c;
        if (dlhVar != null) {
            this.b.a = dlhVar;
        }
        jch jchVar = this.b;
        jchVar.b = this.d;
        bou bouVar = this.e;
        List list = fe10Var.b.c;
        if (!list.isEmpty()) {
            bouVar = new zrm(20, bouVar, list);
        }
        qmm a = this.h.a(fe10Var);
        twy twyVar = this.i;
        this.f.getClass();
        gyc gycVar = this.a;
        return new vnu(fe10Var, gycVar, jchVar, this.g, a, twyVar, new mch(gycVar, twyVar, bouVar), this.l, this.j, this.k);
    }

    @Override // defpackage.rf10
    public final rf10 experimentalParseSubtitlesDuringExtraction(boolean z) {
        this.d = z;
        return this;
    }

    @Override // defpackage.rf10
    public final rf10 experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        return this;
    }

    @Override // defpackage.rf10
    public final int[] getSupportedTypes() {
        return new int[]{2};
    }

    @Override // defpackage.rf10
    public final rf10 setDrmSessionManagerProvider(rmm rmmVar) {
        d6z.u(rmmVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.h = rmmVar;
        return this;
    }

    @Override // defpackage.rf10
    public final rf10 setLoadErrorHandlingPolicy(twy twyVar) {
        d6z.u(twyVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.i = twyVar;
        return this;
    }

    @Override // defpackage.rf10
    public final rf10 setSubtitleParserFactory(o2v0 o2v0Var) {
        this.c = (dlh) o2v0Var;
        return this;
    }
}
