package xsna;

import android.graphics.Bitmap;
import android.os.Trace;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.model.Coordinate;
import com.vk.geo.impl.model.MutableBoundingBox;
import com.vk.geo.impl.model.VisibleStyle;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;

/* compiled from: CreateMarkerBboxUseCase.kt */
/* loaded from: classes2.dex */
public final class x7k {
    public final int a;

    public x7k() {
        this((Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BoundingBox a(x7k x7kVar, String str, rpv rpvVar, int i, float f, float f2, float f3, boolean z, boolean z2, boolean z3, CharSequence charSequence, int i2) {
        gqr gqrVar;
        int i3;
        int i4;
        MutableBoundingBox a;
        boolean z4 = (i2 & 1024) != 0 ? true : z3;
        int i5 = x7kVar.a;
        if (z4 && VisibleStyle.u(i)) {
            return BoundingBox.e;
        }
        Trace.beginSection("GeometryBuilder: iconCache.drawer.calculateSize");
        I i6 = rpvVar.f.c;
        cpv c = rpvVar.c(i, str);
        if (c != null) {
            Bitmap bitmap = c.d;
            if (VisibleStyle.j(c.c) == VisibleStyle.j(i)) {
                gqrVar = new gqr(c.e);
                i3 = bitmap.getWidth();
                i4 = bitmap.getHeight();
                Trace.endSection();
                long j = gqrVar.a;
                int i7 = (int) (j & 4294967295L);
                float f4 = i4;
                float f5 = i5;
                float e = Coordinate.e(l370.r(f, f2, ((Float.intBitsToFloat(i7) * f4) + f5) * f3, du9.a));
                int i8 = (int) (j >> 32);
                float f6 = i3;
                float f7 = Coordinate.f(l370.r(f, f2, (((1.0f - Float.intBitsToFloat(i8)) * f6) + f5) * f3, du9.b));
                float e2 = Coordinate.e(l370.r(f, f2, (((1.0f - Float.intBitsToFloat(i7)) * f4) + f5) * f3, du9.c));
                float f8 = Coordinate.f(l370.r(f, f2, ((Float.intBitsToFloat(i8) * f6) + f5) * f3, du9.d));
                a = y98.e.a();
                if (a != null) {
                    return new MutableBoundingBox(f8, e2, f7, e, null);
                }
                a.g = gqr.a(e, f8);
                a.h = gqr.a(e2, f7);
                return a;
            }
        }
        int M = (z && z2) ? VisibleStyle.M(i) : (!z || VisibleStyle.f(i)) ? i : i | 32;
        long b = i6.b(M, charSequence);
        gqrVar = new gqr(i6.a(M, charSequence));
        i3 = (int) (b >> 32);
        i4 = (int) (b & 4294967295L);
        Trace.endSection();
        long j2 = gqrVar.a;
        int i72 = (int) (j2 & 4294967295L);
        float f42 = i4;
        float f52 = i5;
        float e3 = Coordinate.e(l370.r(f, f2, ((Float.intBitsToFloat(i72) * f42) + f52) * f3, du9.a));
        int i82 = (int) (j2 >> 32);
        float f62 = i3;
        float f72 = Coordinate.f(l370.r(f, f2, (((1.0f - Float.intBitsToFloat(i82)) * f62) + f52) * f3, du9.b));
        float e22 = Coordinate.e(l370.r(f, f2, (((1.0f - Float.intBitsToFloat(i72)) * f42) + f52) * f3, du9.c));
        float f82 = Coordinate.f(l370.r(f, f2, ((Float.intBitsToFloat(i82) * f62) + f52) * f3, du9.d));
        a = y98.e.a();
        if (a != null) {
        }
    }

    public x7k(int i) {
        this.a = i;
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l, L.LogType.d, new Object[]{h5s.c((int) cn70.d(this.a), "dp", new StringBuilder("defaultPadding = "))});
    }

    public /* synthetic */ x7k(Object obj) {
        this(cn70.b(2));
    }
}
