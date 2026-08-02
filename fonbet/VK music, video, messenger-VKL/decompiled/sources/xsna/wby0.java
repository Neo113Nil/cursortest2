package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import com.facebook.soloader.MinElf;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import one.video.calls.sdk_private.aF;
import one.video.calls.sdk_private.ap$a;
import one.video.calls.sdk_private.bI;
import one.video.calls.sdk_private.bJ;

/* compiled from: CryptoStream.java */
/* loaded from: classes8.dex */
public final class wby0 {
    public final lgy0 a;
    public final aF b;
    public final one.video.calls.sdk_private.e c;
    public volatile xjz0 d;
    public volatile one.video.calls.sdk_private.x e;
    public final aky0 f;
    public final ArrayList g;
    public final ArrayList h;
    public final j i;
    public final ArrayList j;
    public final int k;
    public volatile int l;
    public volatile int m;
    public volatile boolean n = false;
    public volatile int o;
    public volatile byte p;
    public volatile int q;

    /* compiled from: CryptoStream.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[aF.values().length];
            a = iArr;
            try {
                iArr[aF.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[aF.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[aF.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[aF.b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public wby0(lgy0 lgy0Var, aF aFVar, bI bIVar, bjz0 bjz0Var, sp spVar, one.video.calls.sdk_private.x xVar) {
        int i = 0;
        this.a = lgy0Var;
        this.b = aFVar;
        bIVar.getClass();
        this.d = bjz0Var;
        this.e = xVar;
        this.c = aFVar == aF.c ? one.video.calls.sdk_private.e.b : aFVar == aF.d ? one.video.calls.sdk_private.e.c : one.video.calls.sdk_private.e.a;
        this.g = new ArrayList();
        this.h = new ArrayList();
        new ArrayList();
        this.i = new j(new qw80(this, 23));
        this.j = new ArrayList();
        int i2 = a.a[aFVar.ordinal()];
        if (i2 == 1) {
            i = IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;
        } else if (i2 == 2) {
            i = bIVar == bI.a ? 16384 : 100;
        } else if (i2 == 3) {
            i = bIVar == bI.a ? MinElf.PN_XNUM : 300;
        }
        this.k = i;
        this.f = new aky0();
    }

    public final String a(List<bdy0> list) {
        return "CryptoStream[" + this.b.name().charAt(0) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + ((String) list.stream().map(new vby0()).map(new xvn()).collect(Collectors.joining(StringUtils.COMMA))) + X3.j.e;
    }

    public final void b(one.video.calls.sdk_private.c cVar) throws one.video.calls.sdk_private.g, bJ {
        try {
            boolean c = this.f.c(cVar);
            aky0 aky0Var = this.f;
            long j = aky0Var.c - aky0Var.d;
            if (cVar.f() - (this.q + j) > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
                throw new bJ(ap$a.CRYPTO_BUFFER_EXCEEDED);
            }
            if (!c) {
                long j2 = this.f.d;
                cVar.toString();
                return;
            }
            while (true) {
                if ((!this.n || j < this.o) && (this.n || j < 4)) {
                    return;
                }
                if (!this.n && j >= 4) {
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    this.q += this.f.a(allocate);
                    this.p = allocate.get(0);
                    allocate.put(0, (byte) 0);
                    this.o = allocate.getInt();
                    if (this.o > this.k) {
                        throw new one.video.calls.sdk_private.o("TLS message size too large: " + this.o);
                    }
                    this.n = true;
                    j -= 4;
                }
                if (this.n && j >= this.o) {
                    ByteBuffer allocate2 = ByteBuffer.allocate(this.o + 4);
                    allocate2.putInt(this.o);
                    allocate2.put(0, this.p);
                    int a2 = this.f.a(allocate2);
                    this.q += a2;
                    j -= a2;
                    this.n = false;
                    this.g.add(this.i.a(allocate2, this.d, this.c));
                    if (allocate2.hasRemaining()) {
                        throw new RuntimeException();
                    }
                }
            }
        } catch (IOException unused) {
            throw new RuntimeException();
        }
    }

    public final void c(bdy0 bdy0Var) {
        byte[] d = bdy0Var.d();
        this.j.add(ByteBuffer.wrap(d));
        this.m += d.length;
        this.e.b(new tby0(this), 10, this.b, new uby0(this, 0));
        this.e.h();
        this.h.add(bdy0Var);
    }

    public final String toString() {
        return a(Collections.EMPTY_LIST);
    }
}
