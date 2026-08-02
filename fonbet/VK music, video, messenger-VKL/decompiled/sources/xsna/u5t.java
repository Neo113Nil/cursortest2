package xsna;

import android.graphics.Rect;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.galvitalayout.ChildSize;
import com.vk.core.tool.view.galvitalayout.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GalvitaFlexLayoutStrategy.kt */
/* loaded from: classes18.dex */
public final class u5t implements opr {
    public int d;
    public final com.vk.core.tool.view.galvitalayout.a a = new com.vk.core.tool.view.galvitalayout.a();
    public final a.C0782a b = new a.C0782a(0);
    public final a.b c = new a.b(0);
    public final mpr e = new mpr(0, 0, new ArrayList());

    @Override // xsna.opr
    public final mpr a(vor vorVar) {
        a.C0782a c0782a = this.b;
        c0782a.a();
        a.b bVar = this.c;
        bVar.a();
        mpr mprVar = this.e;
        mprVar.c.clear();
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            mprVar.c.add(new v0u0(0, 0, 0, 0, 31, 0));
        }
        int i3 = this.d;
        c0782a.b = i3;
        c0782a.c = vorVar.f;
        c0782a.d = vorVar.a;
        c0782a.e = vorVar.b;
        c0782a.i = vorVar.c;
        int i4 = vorVar.d;
        c0782a.k = i4;
        c0782a.l = i4;
        for (int i5 = 0; i5 < i3; i5++) {
            t0u0 t0u0Var = vorVar.e.get(i5);
            ChildSize[] childSizeArr = c0782a.a;
            ChildSize.Companion.getClass();
            childSizeArr[i5] = ChildSize.a.a(t0u0Var.b / t0u0Var.c);
        }
        this.a.b(c0782a, bVar);
        int i6 = bVar.c;
        Rect[] rectArr = bVar.a;
        mprVar.a = i6;
        List<v0u0> list = mprVar.c;
        mprVar.b = bVar.d;
        int i7 = this.d;
        for (int i8 = 0; i8 < i7; i8++) {
            list.get(i8).b = rectArr[i8].left;
            list.get(i8).c = rectArr[i8].top;
            list.get(i8).d = rectArr[i8].right;
            list.get(i8).e = rectArr[i8].bottom;
        }
        int[] iArr = mprVar.d;
        ruj rujVar = bVar.b;
        rujVar.getClass();
        iArr[0] = 0;
        iArr[1] = rujVar.a;
        iArr[2] = rujVar.b;
        iArr[3] = rujVar.c;
        int i9 = mprVar.b;
        List<v0u0> list2 = mprVar.c;
        int i10 = c0782a.l;
        if (i9 > i10 && i10 > 0) {
            float f = i10 / i9;
            float b = (c0782a.i - an10.b(mprVar.a * f)) / 2.0f;
            if (b < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                b = 0.0f;
            }
            int i11 = this.d;
            for (int i12 = 0; i12 < i11; i12++) {
                list2.get(i12).b = an10.b((list2.get(i12).b * f) + b);
                list2.get(i12).c = an10.b((list2.get(i12).c * f) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                list2.get(i12).d = an10.b((list2.get(i12).d * f) + b);
                list2.get(i12).e = an10.b((list2.get(i12).e * f) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            mprVar.a = c0782a.i;
            mprVar.b = c0782a.l;
        }
        return mprVar.a();
    }
}
