package com.vungle.ads.internal.model;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.zip.GZIPInputStream;
import xsna.cti;
import xsna.epx;
import xsna.fpf0;
import xsna.j8y;
import xsna.m9y;
import xsna.ms9;
import xsna.n9x;
import xsna.n9y;
import xsna.oqm0;
import xsna.s1v;
import xsna.s3q0;
import xsna.xfb0;
import xsna.yk3;

/* loaded from: classes7.dex */
public final class p0 {
    public static final o0 Companion = new o0();
    public final Integer a;
    public final String b;
    public final List c;
    public final j8y d;
    public final h0 e;

    public p0(int i, Integer num, String str, List list, h0 h0Var) {
        String b;
        h0 h0Var2 = null;
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        m9y a = n9y.a(n0.a);
        this.d = a;
        if ((i & 8) != 0) {
            this.e = h0Var;
            return;
        }
        if (this.b != null && (b = b()) != null) {
            h0Var2 = (h0) a.a(s1v.p(a.b, fpf0.d(h0.class)), b);
        }
        this.e = h0Var2;
    }

    public static final void a(p0 p0Var, cti ctiVar, xfb0 xfb0Var) {
        h0 h0Var;
        String b;
        if (ctiVar.z() || p0Var.a != null) {
            ctiVar.s(xfb0Var, 0, n9x.a, p0Var.a);
        }
        if (ctiVar.z() || p0Var.b != null) {
            ctiVar.s(xfb0Var, 1, oqm0.a, p0Var.b);
        }
        if (ctiVar.z() || p0Var.c != null) {
            ctiVar.s(xfb0Var, 2, new yk3(oqm0.a), p0Var.c);
        }
        if (!ctiVar.z()) {
            h0 h0Var2 = p0Var.e;
            if (p0Var.b == null || (b = p0Var.b()) == null) {
                h0Var = null;
            } else {
                j8y j8yVar = p0Var.d;
                h0Var = (h0) j8yVar.a(s1v.p(j8yVar.b, fpf0.d(h0.class)), b);
            }
            if (epx.f(h0Var2, h0Var)) {
                return;
            }
        }
        ctiVar.s(xfb0Var, 3, c.a, p0Var.e);
    }

    public final String b() {
        byte[] decode = Base64.decode(this.b, 0);
        if (decode == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(decode);
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 1024);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = gZIPInputStream.read(bArr);
                    if (read == -1) {
                        s3q0 s3q0Var = s3q0.a;
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                        return byteArrayOutputStream.toString();
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } finally {
        }
    }

    public final Integer c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return epx.f(this.a, p0Var.a) && epx.f(this.b, p0Var.b) && epx.f(this.c, p0Var.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("BidPayload(version=");
        a.append(this.a);
        a.append(", adunit=");
        a.append(this.b);
        a.append(", impression=");
        return ms9.a(')', a, this.c);
    }

    public final h0 a() {
        return this.e;
    }
}
