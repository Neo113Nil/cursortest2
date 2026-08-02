package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class ctc0 implements b70 {
    public static final ctc0 a = new ctc0();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        wsc0 wsc0Var = (wsc0) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(wsc0Var.a);
        List list = cp11.a;
        yo11 yo11Var = wsc0Var.b;
        bfxVar.A1("__typename");
        foe foeVar2 = l80.a;
        bfxVar.r0(yo11Var.a);
        xo11 xo11Var = yo11Var.b;
        if (xo11Var != null) {
            List list2 = bp11.a;
            bfxVar.A1("verticalContentAlignment");
            bfxVar.r0(xo11Var.a.getRawValue());
        }
        wo11 wo11Var = yo11Var.c;
        if (wo11Var != null) {
            List list3 = ap11.a;
            bfxVar.A1("horizontalContentAlignment");
            bfxVar.r0(wo11Var.a.getRawValue());
        }
        vo11 vo11Var = yo11Var.d;
        if (vo11Var != null) {
            List list4 = zo11.a;
            bfxVar.A1("horizontalContentAlignment");
            bfxVar.r0(vo11Var.a.getRawValue());
            bfxVar.A1("verticalContentAlignment");
            bfxVar.r0(vo11Var.b.getRawValue());
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new wsc0(str, cp11.c(xdxVar, cVar));
    }
}
