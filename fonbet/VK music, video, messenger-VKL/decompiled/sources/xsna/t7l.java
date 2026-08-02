package xsna;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.util.ExceptionWithNoStacktrace;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.facebook.imagepipeline.decoder.DecodeException;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import xsna.myx;
import xsna.t7l;
import xsna.uvf;
import xsna.vvf;

/* compiled from: DecodeProducer.kt */
/* loaded from: classes12.dex */
public final class t7l implements thd0<uvf<svf>> {
    public final ut8 a;
    public final Executor b;
    public final niw c;
    public final z3e0 d;
    public final DownsampleMode e;
    public final boolean f;
    public final thd0<rip> g;
    public final int h;
    public final vvf i;

    /* compiled from: DecodeProducer.kt */
    public final class a extends c {
        @Override // xsna.t7l.c
        public final int m(rip ripVar) {
            return ripVar.r();
        }

        @Override // xsna.t7l.c
        public final cpe0 n() {
            return gpw.a(0, false, false);
        }

        @Override // xsna.t7l.c
        public final synchronized boolean s(rip ripVar, int i) {
            return ac6.e(i) ? false : this.g.f(ripVar, i);
        }
    }

    /* compiled from: DecodeProducer.kt */
    public final class b extends c {
        public final a4e0 j;
        public final z3e0 k;

        public b(t7l t7lVar, l7j l7jVar, uhd0 uhd0Var, a4e0 a4e0Var, z3e0 z3e0Var, int i) {
            super(l7jVar, uhd0Var, i);
            this.j = a4e0Var;
            this.k = z3e0Var;
            this.h = 0;
        }

        @Override // xsna.t7l.c
        public final int m(rip ripVar) {
            return this.j.f;
        }

        @Override // xsna.t7l.c
        public final cpe0 n() {
            return this.k.b(this.j.e);
        }

        @Override // xsna.t7l.c
        public final synchronized boolean s(rip ripVar, int i) {
            if (ripVar == null) {
                return false;
            }
            try {
                boolean f = this.g.f(ripVar, i);
                if (!ac6.e(i)) {
                    if (ac6.k(i, 8)) {
                    }
                    return f;
                }
                if (!ac6.k(i, 4) && rip.x(ripVar)) {
                    ripVar.y();
                    if (ripVar.c == hgl.a) {
                        if (!this.j.b(ripVar)) {
                            return false;
                        }
                        int i2 = this.j.e;
                        int i3 = this.h;
                        if (i2 <= i3) {
                            return false;
                        }
                        if (i2 < this.k.a(i3) && !this.j.g) {
                            return false;
                        }
                        this.h = i2;
                    }
                }
                return f;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* compiled from: DecodeProducer.kt */
    public abstract class c extends wtl<rip, uvf<svf>> {
        public final uhd0 c;
        public final yhd0 d;
        public final liw e;
        public boolean f;
        public final myx g;
        public int h;

        public c(l7j l7jVar, uhd0 uhd0Var, final int i) {
            super(l7jVar);
            this.c = uhd0Var;
            this.d = uhd0Var.q();
            this.e = uhd0Var.r().g;
            this.g = new myx(t7l.this.b, new myx.b() { // from class: xsna.u7l
                /* JADX WARN: Removed duplicated region for block: B:59:0x017f  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x01a0  */
                /* JADX WARN: Removed duplicated region for block: B:73:0x01a3 A[Catch: all -> 0x0160, TRY_LEAVE, TryCatch #0 {all -> 0x0160, blocks: (B:36:0x013e, B:37:0x0140, B:42:0x014b, B:43:0x014c, B:47:0x015b, B:51:0x016c, B:52:0x0173, B:54:0x0176, B:56:0x017a, B:61:0x018c, B:66:0x01c1, B:71:0x01c9, B:72:0x01cc, B:73:0x01a3, B:79:0x0220, B:86:0x01e6, B:89:0x01f2, B:92:0x0202, B:93:0x020d, B:106:0x0171, B:107:0x0163, B:111:0x0230, B:65:0x01b5, B:40:0x0143), top: B:35:0x013e, inners: #5, #8 }] */
                /* JADX WARN: Removed duplicated region for block: B:75:0x0189  */
                @Override // xsna.myx.b
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void a(rip ripVar, int i2) {
                    String str;
                    long j;
                    int r;
                    cpe0 cpe0Var;
                    String str2;
                    cpe0 cpe0Var2;
                    long j2;
                    yhd0 yhd0Var;
                    svf svfVar;
                    svf p;
                    kcl kclVar;
                    t7l.c cVar = t7l.c.this;
                    t7l t7lVar = r2;
                    int i3 = i;
                    uhd0 uhd0Var2 = cVar.c;
                    if (ripVar == null) {
                        return;
                    }
                    ImageRequest r2 = uhd0Var2.r();
                    ripVar.y();
                    uhd0Var2.h(ripVar.c.a, "image_format");
                    Uri uri = r2.b;
                    ripVar.k = uri != null ? uri.toString() : null;
                    DownsampleMode downsampleMode = t7lVar.e;
                    boolean k = ac6.k(i2, 16);
                    if ((downsampleMode == DownsampleMode.ALWAYS || (downsampleMode == DownsampleMode.AUTO && !k)) && (t7lVar.f || !meq0.e(r2.b))) {
                        ripVar.h = k15.p(r2.i, r2.h, ripVar, i3);
                    }
                    uhd0Var2.n().getExperiments().getClass();
                    int i4 = cVar.h;
                    String str3 = "unknown";
                    liw liwVar = cVar.e;
                    yhd0 yhd0Var2 = cVar.d;
                    ripVar.y();
                    if ((ripVar.c != hgl.a && ac6.e(i2)) || cVar.f || !rip.x(ripVar)) {
                        return;
                    }
                    ripVar.y();
                    if (epx.f(ripVar.c, hgl.c)) {
                        ripVar.y();
                        long j3 = ripVar.f;
                        ripVar.y();
                        if (j3 * ripVar.g * id7.b(liwVar.b) > 104857600) {
                            ripVar.y();
                            int i5 = ripVar.f;
                            ripVar.y();
                            int i6 = ripVar.g;
                            Bitmap.Config config = liwVar.b;
                            StringBuilder a = odj.a(i5, i6, "Image is too big to attempt decoding: w = ", ", h = ", ", pixel config = ");
                            a.append(config);
                            a.append(", max bitmap size = 104857600");
                            IllegalStateException illegalStateException = new IllegalStateException(a.toString());
                            yhd0Var2.b(uhd0Var2, "DecodeProducer", illegalStateException, null);
                            cVar.o(illegalStateException);
                            return;
                        }
                    }
                    ripVar.y();
                    String str4 = ripVar.c.a;
                    ripVar.y();
                    int i7 = ripVar.f;
                    ripVar.y();
                    String str5 = i7 + "x" + ripVar.g;
                    String valueOf = String.valueOf(ripVar.h);
                    boolean d = ac6.d(i2);
                    boolean z = d && !ac6.k(i2, 8);
                    boolean k2 = ac6.k(i2, 4);
                    x9g0 x9g0Var = uhd0Var2.r().h;
                    if (x9g0Var != null) {
                        str3 = x9g0Var.a + "x" + x9g0Var.b;
                    }
                    try {
                        myx myxVar = cVar.g;
                        synchronized (myxVar) {
                            str = str3;
                            j = myxVar.i - myxVar.h;
                        }
                        String uri2 = uhd0Var2.r().b.toString();
                        try {
                            try {
                                try {
                                    if (!z && !k2) {
                                        r = cVar.m(ripVar);
                                        if (!z && !k2) {
                                            cpe0Var = cVar.n();
                                            yhd0Var2.k(uhd0Var2, "DecodeProducer");
                                            p = cVar.p(ripVar, r, cpe0Var);
                                            int i8 = ripVar.h == 1 ? i2 | 16 : i2;
                                            yhd0Var2.f(uhd0Var2, "DecodeProducer", cVar.l(p, j, cpe0Var, d, str4, str5, str, valueOf));
                                            cVar.r(ripVar, p, i4);
                                            vvf.a aVar = t7l.this.i.a;
                                            if (p != null) {
                                                kclVar = null;
                                            } else {
                                                uvf.a aVar2 = uvf.f;
                                                aVar.a();
                                                kclVar = new kcl(p, aVar2, aVar, null, true);
                                            }
                                            cVar.q(ac6.d(i8));
                                            cVar.b.b(i8, kclVar);
                                            ripVar.close();
                                            return;
                                        }
                                        cpe0Var = gpw.d;
                                        yhd0Var2.k(uhd0Var2, "DecodeProducer");
                                        p = cVar.p(ripVar, r, cpe0Var);
                                        if (ripVar.h == 1) {
                                        }
                                        yhd0Var2.f(uhd0Var2, "DecodeProducer", cVar.l(p, j, cpe0Var, d, str4, str5, str, valueOf));
                                        cVar.r(ripVar, p, i4);
                                        vvf.a aVar3 = t7l.this.i.a;
                                        if (p != null) {
                                        }
                                        cVar.q(ac6.d(i8));
                                        cVar.b.b(i8, kclVar);
                                        ripVar.close();
                                        return;
                                    }
                                    if (!z) {
                                        cpe0Var = cVar.n();
                                        yhd0Var2.k(uhd0Var2, "DecodeProducer");
                                        p = cVar.p(ripVar, r, cpe0Var);
                                        if (ripVar.h == 1) {
                                        }
                                        yhd0Var2.f(uhd0Var2, "DecodeProducer", cVar.l(p, j, cpe0Var, d, str4, str5, str, valueOf));
                                        cVar.r(ripVar, p, i4);
                                        vvf.a aVar32 = t7l.this.i.a;
                                        if (p != null) {
                                        }
                                        cVar.q(ac6.d(i8));
                                        cVar.b.b(i8, kclVar);
                                        ripVar.close();
                                        return;
                                    }
                                    cVar.q(ac6.d(i8));
                                    cVar.b.b(i8, kclVar);
                                    ripVar.close();
                                    return;
                                } finally {
                                    uvf.q(kclVar);
                                }
                                if (ripVar.h == 1) {
                                }
                                yhd0Var2.f(uhd0Var2, "DecodeProducer", cVar.l(p, j, cpe0Var, d, str4, str5, str, valueOf));
                                cVar.r(ripVar, p, i4);
                                vvf.a aVar322 = t7l.this.i.a;
                                if (p != null) {
                                }
                            } catch (Exception e) {
                                e = e;
                                str2 = str;
                                cpe0Var2 = cpe0Var;
                                j2 = j;
                                svfVar = p;
                                yhd0Var = yhd0Var2;
                                yhd0Var.b(uhd0Var2, "DecodeProducer", e, cVar.l(svfVar, j2, cpe0Var2, d, str4, str5, str2, valueOf));
                                cVar.o(e);
                                ripVar.close();
                                return;
                            }
                            p = cVar.p(ripVar, r, cpe0Var);
                        } catch (DecodeException e2) {
                            yhd0Var = yhd0Var2;
                            str2 = str;
                            cpe0Var2 = cpe0Var;
                            j2 = j;
                            try {
                                rip d2 = e2.d();
                                try {
                                    try {
                                        ahq.l("ProgressiveDecoder", "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", e2.getMessage(), uri2, d2.n(), Integer.valueOf(d2.r()));
                                        throw e2;
                                    } catch (Exception e3) {
                                        e = e3;
                                        cVar = cVar;
                                        j2 = j2;
                                        svfVar = null;
                                        yhd0Var.b(uhd0Var2, "DecodeProducer", e, cVar.l(svfVar, j2, cpe0Var2, d, str4, str5, str2, valueOf));
                                        cVar.o(e);
                                        ripVar.close();
                                        return;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    cVar = cVar;
                                }
                            } catch (Exception e5) {
                                e = e5;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            str2 = str;
                            cpe0Var2 = cpe0Var;
                            j2 = j;
                            yhd0Var = yhd0Var2;
                            svfVar = null;
                            yhd0Var.b(uhd0Var2, "DecodeProducer", e, cVar.l(svfVar, j2, cpe0Var2, d, str4, str5, str2, valueOf));
                            cVar.o(e);
                            ripVar.close();
                            return;
                        }
                        r = ripVar.r();
                        cpe0Var = gpw.d;
                        yhd0Var2.k(uhd0Var2, "DecodeProducer");
                    } catch (Throwable th) {
                        ripVar.close();
                        throw th;
                    }
                }
            });
            uhd0Var.p(new v7l(this));
        }

        @Override // xsna.wtl, xsna.ac6
        public final void f() {
            q(true);
            this.b.a();
        }

        @Override // xsna.wtl, xsna.ac6
        public final void g(Throwable th) {
            o(th);
        }

        @Override // xsna.ac6
        public final void h(int i, Object obj) {
            rip ripVar = (rip) obj;
            boolean d = lhs.d();
            myx myxVar = this.g;
            uhd0 uhd0Var = this.c;
            if (!d) {
                boolean d2 = ac6.d(i);
                if (d2) {
                    if (ripVar == null) {
                        epx.f(uhd0Var.c("cached_value_found"), Boolean.TRUE);
                        uhd0Var.n().getExperiments().getClass();
                        o(new ExceptionWithNoStacktrace("Encoded image is null."));
                        return;
                    } else if (!ripVar.w()) {
                        o(new ExceptionWithNoStacktrace("Encoded image is not valid."));
                        return;
                    }
                }
                if (s(ripVar, i)) {
                    boolean k = ac6.k(i, 4);
                    if (d2 || k || uhd0Var.o()) {
                        myxVar.d();
                        return;
                    }
                    return;
                }
                return;
            }
            lhs.a("DecodeProducer#onNewResultImpl");
            try {
                boolean d3 = ac6.d(i);
                if (d3) {
                    if (ripVar == null) {
                        epx.f(uhd0Var.c("cached_value_found"), Boolean.TRUE);
                        uhd0Var.n().getExperiments().getClass();
                        o(new ExceptionWithNoStacktrace("Encoded image is null."));
                        return;
                    } else if (!ripVar.w()) {
                        o(new ExceptionWithNoStacktrace("Encoded image is not valid."));
                        return;
                    }
                }
                if (s(ripVar, i)) {
                    boolean k2 = ac6.k(i, 4);
                    if (d3 || k2 || uhd0Var.o()) {
                        myxVar.d();
                    }
                    s3q0 s3q0Var = s3q0.a;
                }
            } finally {
                lhs.b();
            }
        }

        @Override // xsna.wtl, xsna.ac6
        public final void i(float f) {
            super.i(f * 0.99f);
        }

        public final ImmutableMap l(svf svfVar, long j, cpe0 cpe0Var, boolean z, String str, String str2, String str3, String str4) {
            Map<String, Object> extras;
            Object obj;
            String str5 = null;
            if (!this.d.i(this.c, "DecodeProducer")) {
                return null;
            }
            String valueOf = String.valueOf(j);
            String valueOf2 = String.valueOf(((gpw) cpe0Var).b);
            String valueOf3 = String.valueOf(z);
            if (svfVar != null && (extras = svfVar.getExtras()) != null && (obj = extras.get("non_fatal_decode_error")) != null) {
                str5 = obj.toString();
            }
            if (!(svfVar instanceof xvf)) {
                String str6 = str5;
                HashMap hashMap = new HashMap(7);
                hashMap.put("queueTime", valueOf);
                hashMap.put("hasGoodQuality", valueOf2);
                hashMap.put("isFinal", valueOf3);
                hashMap.put("encodedImageSize", str2);
                hashMap.put("imageFormat", str);
                hashMap.put("requestedImageSize", str3);
                hashMap.put("sampleSize", str4);
                if (str6 != null) {
                    hashMap.put("non_fatal_decode_error", str6);
                }
                return new ImmutableMap(hashMap);
            }
            Bitmap W3 = ((xvf) svfVar).W3();
            String str7 = str5;
            String str8 = W3.getWidth() + "x" + W3.getHeight();
            HashMap hashMap2 = new HashMap(8);
            hashMap2.put("bitmapSize", str8);
            hashMap2.put("queueTime", valueOf);
            hashMap2.put("hasGoodQuality", valueOf2);
            hashMap2.put("isFinal", valueOf3);
            hashMap2.put("encodedImageSize", str2);
            hashMap2.put("imageFormat", str);
            hashMap2.put("requestedImageSize", str3);
            hashMap2.put("sampleSize", str4);
            int byteCount = W3.getByteCount();
            StringBuilder sb = new StringBuilder();
            sb.append(byteCount);
            hashMap2.put("byteCount", sb.toString());
            if (str7 != null) {
                hashMap2.put("non_fatal_decode_error", str7);
            }
            return new ImmutableMap(hashMap2);
        }

        public abstract int m(rip ripVar);

        public abstract cpe0 n();

        public final void o(Throwable th) {
            q(true);
            this.b.onFailure(th);
        }

        public final svf p(rip ripVar, int i, cpe0 cpe0Var) {
            t7l t7lVar = t7l.this;
            t7lVar.getClass();
            return t7lVar.c.a(ripVar, i, cpe0Var, this.e);
        }

        public final void q(boolean z) {
            synchronized (this) {
                if (z) {
                    if (!this.f) {
                        this.b.c(1.0f);
                        this.f = true;
                        s3q0 s3q0Var = s3q0.a;
                        this.g.a();
                    }
                }
            }
        }

        public final void r(rip ripVar, svf svfVar, int i) {
            ripVar.y();
            Object valueOf = Integer.valueOf(ripVar.f);
            kuu kuuVar = this.c;
            kuuVar.h(valueOf, "encoded_width");
            ripVar.y();
            kuuVar.h(Integer.valueOf(ripVar.g), "encoded_height");
            kuuVar.h(Integer.valueOf(ripVar.r()), "encoded_size");
            ripVar.y();
            kuuVar.h(ripVar.j, "image_color_space");
            if (svfVar instanceof qvf) {
                kuuVar.h(String.valueOf(((qvf) svfVar).W3().getConfig()), "bitmap_config");
            }
            if (svfVar != null) {
                svfVar.b(kuuVar.getExtras());
            }
            kuuVar.h(Integer.valueOf(i), "last_scan_num");
        }

        public abstract boolean s(rip ripVar, int i);
    }

    public t7l(ut8 ut8Var, Executor executor, niw niwVar, z3e0 z3e0Var, DownsampleMode downsampleMode, boolean z, thd0 thd0Var, int i, vvf vvfVar) {
        this.a = ut8Var;
        this.b = executor;
        this.c = niwVar;
        this.d = z3e0Var;
        this.e = downsampleMode;
        this.f = z;
        this.g = thd0Var;
        this.h = i;
        this.i = vvfVar;
    }

    @Override // xsna.thd0
    public final void b(l7j<uvf<svf>> l7jVar, uhd0 uhd0Var) {
        l7j<rip> l7jVar2;
        uhd0 uhd0Var2;
        l7j<rip> bVar;
        boolean d = lhs.d();
        int i = this.h;
        thd0<rip> thd0Var = this.g;
        ut8 ut8Var = this.a;
        if (!d) {
            ImageRequest r = uhd0Var.r();
            if (meq0.e(r.b) || ImageRequestBuilder.f(r.b)) {
                uhd0Var2 = uhd0Var;
                bVar = new b(this, l7jVar, uhd0Var2, new a4e0(ut8Var), this.d, this.h);
            } else {
                bVar = new a(l7jVar, uhd0Var, i);
                uhd0Var2 = uhd0Var;
            }
            thd0Var.b(bVar, uhd0Var2);
            return;
        }
        uhd0 uhd0Var3 = uhd0Var;
        lhs.a("DecodeProducer#produceResults");
        try {
            ImageRequest r2 = uhd0Var3.r();
            if (meq0.e(r2.b) || ImageRequestBuilder.f(r2.b)) {
                b bVar2 = new b(this, l7jVar, uhd0Var3, new a4e0(ut8Var), this.d, this.h);
                uhd0Var3 = uhd0Var3;
                l7jVar2 = bVar2;
            } else {
                l7jVar2 = new a(l7jVar, uhd0Var3, i);
            }
            thd0Var.b(l7jVar2, uhd0Var3);
            s3q0 s3q0Var = s3q0.a;
            lhs.b();
        } catch (Throwable th) {
            lhs.b();
            throw th;
        }
    }
}
