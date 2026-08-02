package com.vungle.ads.internal.model;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import ru.ok.android.commons.http.Http;
import xsna.epx;
import xsna.qoy;
import xsna.s3q0;
import xsna.uqi;
import xsna.urd0;

/* loaded from: classes7.dex */
public final class b {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final Integer e;
    public a f;
    public String g;
    public long h;
    public long i;
    public long j;
    public Long k;
    public final Object l;
    public final AtomicBoolean m;

    public /* synthetic */ b(String str, String str2) {
        this("vmURL", str, str2, true, null);
    }

    public final String a() {
        return this.a;
    }

    public final void b(long j) {
        this.h = j;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.g;
    }

    public final Integer e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !b.class.equals(obj.getClass())) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f == bVar.f && this.h == bVar.h && this.d == bVar.d && epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.i == bVar.i && epx.f(this.e, bVar.e)) {
            return epx.f(this.c, bVar.c);
        }
        return false;
    }

    public final Long f() {
        return this.k;
    }

    public final long g() {
        return this.j;
    }

    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        long j = this.h;
        int b = qoy.b((hashCode + ((int) (j ^ (j >>> 32)))) * 31, 31, this.d);
        long j2 = this.i;
        int i = (b + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Integer num = this.e;
        return i + (num != null ? num.hashCode() : 0);
    }

    public final boolean i() {
        return this.f == a.DOWNLOAD_SUCCESS;
    }

    public final boolean j() {
        return epx.f(this.a, "vmURL");
    }

    public final boolean k() {
        return epx.f(this.a, "MAIN_IMAGE") || epx.f(this.a, "MAIN_VIDEO");
    }

    public final boolean l() {
        return epx.f(this.a, "MAIN_VIDEO");
    }

    public final boolean m() {
        return epx.f(this.a, "VUNGLE_PRIVACY_ICON_URL");
    }

    public final boolean n() {
        return this.d;
    }

    public final boolean o() {
        return this.m.get();
    }

    public final void p() {
        if (this.m.getAndSet(false)) {
            synchronized (this.l) {
                this.l.notifyAll();
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }

    public final void q() {
        Object failure;
        this.m.set(true);
        synchronized (this.l) {
            try {
                this.l.wait();
                failure = s3q0.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                boolean z = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("AdAsset", "Interrupted while waiting for file download: " + this, a);
            }
        }
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("AdAsset(adIdentifier=");
        a.append(this.a);
        a.append(", serverPath=");
        a.append(this.b);
        a.append(", localPath=");
        a.append(this.c);
        a.append(", status=");
        a.append(this.f);
        a.append(", fileSize=");
        a.append(this.h);
        a.append(", contentLength=");
        a.append(this.i);
        a.append(", isRequired=");
        a.append(this.d);
        a.append(", percentage=");
        return uqi.b(a, this.e, ')');
    }

    public b(String str, String str2, String str3, boolean z, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = num;
        this.f = a.NEW;
        this.g = Http.ContentType.APPLICATION_OCTET_STREAM;
        this.l = new Object();
        this.m = new AtomicBoolean(false);
    }

    public final void a(a aVar) {
        this.f = aVar;
    }

    public final long b() {
        return this.i;
    }

    public final void c(long j) {
        this.j = j;
    }

    public final void a(String str) {
        this.g = str;
    }

    public final void a(long j) {
        this.i = j;
    }

    public final void a(Long l) {
        this.k = l;
    }
}
