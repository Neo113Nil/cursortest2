package xsna;

import com.vk.core.tool.view.galvitalayout.ChildSize;
import java.util.ArrayList;

/* compiled from: CarouselFlexLayoutStrategyForMany.kt */
/* loaded from: classes18.dex */
public final class ru9 implements opr {
    public final gzs<s3d0> a;
    public final mpr b = new mpr(0, 0, new ArrayList());

    public ru9(gzs<s3d0> gzsVar) {
        this.a = gzsVar;
    }

    @Override // xsna.opr
    public final mpr a(vor vorVar) {
        float f;
        mpr mprVar = this.b;
        mprVar.c.clear();
        int i = vorVar.c - (vorVar.f * 4);
        int i2 = vorVar.d;
        int i3 = i - (i / 4);
        int size = vorVar.e.size() - 1;
        s3d0 invoke = this.a.invoke();
        if (vorVar.e.isEmpty()) {
            f = 1.0f;
        } else {
            t0u0 t0u0Var = vorVar.e.get(0);
            if (invoke.a > invoke.b) {
                invoke = new s3d0(0);
            }
            ChildSize.Companion.getClass();
            f = swe0.f(ChildSize.a.a(t0u0Var.b / t0u0Var.c).h(), invoke.a, invoke.b);
        }
        mprVar.a = (vorVar.f * size) + (vorVar.e.size() * i3);
        int floor = (int) Math.floor(i3 / f);
        mprVar.b = floor;
        if (floor > i2) {
            i3 = an10.b(i2 * f);
            mprVar.a = (vorVar.f * size) + (vorVar.e.size() * i3);
            mprVar.b = i2;
        }
        int i4 = 0;
        for (Object obj : vorVar.e) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                e43.t();
                throw null;
            }
            int i6 = (vorVar.f * i4) + (i4 * i3);
            mprVar.c.add(new v0u0(((t0u0) obj).a, i6, i6 + i3, mprVar.b, 4, 0));
            i4 = i5;
        }
        int size2 = vorVar.e.size();
        int[] iArr = mprVar.d;
        iArr[0] = 0;
        int i7 = size2 - 1;
        iArr[1] = i7;
        iArr[2] = i7;
        iArr[3] = 0;
        return mprVar;
    }
}
