package com.yandex.go.eboks.objects.analytics;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import defpackage.czf0;
import defpackage.dhn;
import defpackage.din;
import defpackage.fgn;
import defpackage.i3y;
import defpackage.lx4;
import defpackage.oyr;
import io.appmetrica.analytics.rtm.internal.Constants;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes12.dex */
public final class a implements din {
    public final czf0 a;
    public final lx4 b;
    public final dhn c;
    public final i3y d = kotlin.a.a(new fgn(5));
    public EboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot e;
    public EboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot f;
    public volatile long g;
    public volatile long h;

    public a(czf0 czf0Var, lx4 lx4Var, dhn dhnVar) {
        this.a = czf0Var;
        this.b = lx4Var;
        this.c = dhnVar;
    }

    @Override // defpackage.din
    public final void a() {
        if (this.f != null) {
            return;
        }
        EboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot eboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot = new EboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot(this);
        eboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot.start();
        this.f = eboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot;
    }

    @Override // defpackage.din
    public final void b() {
        this.g = System.currentTimeMillis();
    }

    @Override // defpackage.din
    public final void c(int i) {
        EboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot eboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot = this.f;
        if (eboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot == null) {
            return;
        }
        this.f = null;
        eboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot.stop();
        if (i != 0) {
            i("EboksPerf.MapMove", eboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot, i);
        }
    }

    @Override // defpackage.din
    public final void clear() {
        EboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot eboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot = this.e;
        if (eboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot != null) {
            eboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot.stop();
        }
        this.e = null;
        EboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot eboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot2 = this.f;
        if (eboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot2 != null) {
            eboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot2.stop();
        }
        this.f = null;
    }

    @Override // defpackage.din
    public final void d(int i) {
        if (i == 0) {
            return;
        }
        j(System.currentTimeMillis() - this.g, i, "EboksPerf.Preparing");
    }

    @Override // defpackage.din
    public final void e(int i, long j) {
        if (i == 0) {
            return;
        }
        j(j, i, "EboksPerf.Parsing");
    }

    @Override // defpackage.din
    public final void f() {
        EboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot eboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot = this.e;
        if (eboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot != null) {
            return;
        }
        if (eboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot != null) {
            eboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot.stop();
        }
        EboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot eboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot2 = new EboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot(this);
        eboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot2.start();
        this.e = eboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot2;
    }

    @Override // defpackage.din
    public final void g(int i, long j) {
        if (i == 0) {
            return;
        }
        j(j, i, "EboksPerf.Response");
        this.h = System.currentTimeMillis() - j;
    }

    @Override // defpackage.din
    public final void h(int i) {
        EboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot eboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot = this.e;
        if (eboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot == null) {
            return;
        }
        this.e = null;
        eboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot.stop();
        if (i != 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.h;
            i("EboksPerf.MapUpdate", eboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot, i);
            j(currentTimeMillis, i, "EboksPerf.TotalDuration");
        }
    }

    public final void i(String str, EboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot eboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot, int i) {
        if (eboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot.getFrameTimes().e == 0) {
            return;
        }
        i d = ((j) this.b).d(str);
        d.d("frame_times", eboksObjectsPerformanceAnalyticsImpl$FrameTimesSnapshot.toString());
        d.b(i, "collection_size");
        dhn dhnVar = this.c;
        d.d(MetaDataField.SCREEN_FIELD, dhnVar.b);
        d.d("mode", dhnVar.a);
        d.m();
    }

    public final void j(long j, int i, String str) {
        i d = ((j) this.b).d(str);
        d.d(Constants.KEY_SERVICE, EboksObjectsServiceType.MAP_OBJECTS.getAnalyticsName());
        d.b(i, "collection_size");
        d.c(j, "duration");
        dhn dhnVar = this.c;
        d.d(MetaDataField.SCREEN_FIELD, dhnVar.b);
        String str2 = dhnVar.a;
        d.d("mode", str2);
        d.m();
        String q = oyr.q(str, ShimmerDivHandler.NUMBER_SING, str2, Extension.DOT_CHAR, dhnVar.b);
        this.a.getClass();
        czf0.a(j, q);
    }
}
