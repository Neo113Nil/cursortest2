package com.vungle.ads.internal.signals;

import com.vungle.ads.internal.model.p3;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.n9x;
import xsna.oqm0;
import xsna.ssi;
import xsna.u500;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.yk3;

/* loaded from: classes7.dex */
public final class a implements vht {
    public static final a a;
    public static final /* synthetic */ xfb0 b;

    static {
        a aVar = new a();
        a = aVar;
        xfb0 xfb0Var = new xfb0("com.vungle.ads.internal.signals.SessionData", aVar, 12);
        xfb0Var.j("103", false);
        xfb0Var.j("101", true);
        xfb0Var.j("100", true);
        xfb0Var.j("106", true);
        xfb0Var.j("102", true);
        xfb0Var.j("104", true);
        xfb0Var.j("105", true);
        xfb0Var.j("112", true);
        xfb0Var.j("113", true);
        xfb0Var.j("114", true);
        xfb0Var.j("115", true);
        xfb0Var.j("116", true);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        yk3 yk3Var = new yk3(k.a);
        yk3 yk3Var2 = new yk3(p3.a);
        n9x n9xVar = n9x.a;
        u500 u500Var = u500.a;
        return new KSerializer[]{n9xVar, oqm0.a, u500Var, yk3Var, u500Var, n9xVar, yk3Var2, n9xVar, n9xVar, n9xVar, n9xVar, n9xVar};
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        Object obj = null;
        String str = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        boolean z = true;
        Object obj2 = null;
        while (z) {
            int m = d.m(xfb0Var);
            switch (m) {
                case -1:
                    z = false;
                    break;
                case 0:
                    i2 = d.s(xfb0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    str = d.u(xfb0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    j = d.r(xfb0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    obj2 = d.y(xfb0Var, 3, new yk3(k.a), obj2);
                    i |= 8;
                    break;
                case 4:
                    j2 = d.r(xfb0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    i3 = d.s(xfb0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    obj = d.y(xfb0Var, 6, new yk3(p3.a), obj);
                    i |= 64;
                    break;
                case 7:
                    i4 = d.s(xfb0Var, 7);
                    i |= 128;
                    break;
                case 8:
                    i5 = d.s(xfb0Var, 8);
                    i |= 256;
                    break;
                case 9:
                    i6 = d.s(xfb0Var, 9);
                    i |= 512;
                    break;
                case 10:
                    i7 = d.s(xfb0Var, 10);
                    i |= 1024;
                    break;
                case 11:
                    i8 = d.s(xfb0Var, 11);
                    i |= 2048;
                    break;
                default:
                    throw new UnknownFieldException(m);
            }
        }
        d.e(xfb0Var);
        return new c(i, i2, str, j, (List) obj2, j2, i3, (List) obj, i4, i5, i6, i7, i8);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        c.a((c) obj, d, xfb0Var);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
