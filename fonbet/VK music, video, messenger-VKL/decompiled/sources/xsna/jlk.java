package xsna;

import xsna.sox;

/* compiled from: CurrentIntervalTitleViewStateExtensions.kt */
/* loaded from: classes8.dex */
public final class jlk {
    public static ilk a(ilk ilkVar, boolean z, boolean z2, sox.a aVar, int i, int i2, boolean z3, String str, Integer num, Integer num2, int i3) {
        if ((i3 & 1) != 0) {
            z = ilkVar.a;
        }
        boolean z4 = z;
        if ((i3 & 2) != 0) {
            z2 = ilkVar.b;
        }
        boolean z5 = z2;
        if ((i3 & 4) != 0) {
            aVar = ilkVar.c;
        }
        sox.a aVar2 = aVar;
        if ((i3 & 8) != 0) {
            i = ilkVar.d;
        }
        int i4 = i;
        int i5 = (i3 & 16) != 0 ? ilkVar.e : i2;
        boolean z6 = (i3 & 32) != 0 ? ilkVar.f : z3;
        String str2 = (i3 & 64) != 0 ? ilkVar.g : str;
        Integer num3 = (i3 & 128) != 0 ? ilkVar.h : num;
        Integer num4 = (i3 & 256) != 0 ? ilkVar.i : num2;
        return (z4 == ilkVar.a && z5 == ilkVar.b && epx.f(aVar2, ilkVar.c) && i4 == ilkVar.d && i5 == ilkVar.e && z6 == ilkVar.f && str2.equals(ilkVar.g) && epx.f(num3, ilkVar.h) && epx.f(num4, ilkVar.i)) ? ilkVar : new ilk(z4, z5, aVar2, i4, i5, z6, str2, num3, num4);
    }
}
