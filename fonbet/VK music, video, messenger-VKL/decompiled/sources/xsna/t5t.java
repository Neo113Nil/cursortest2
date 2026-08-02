package xsna;

import android.graphics.Rect;
import com.vk.core.tool.view.galvitalayout.ChildSize;
import com.vk.core.tool.view.galvitalayout.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GalvitaFlexLayoutStrategy.kt */
/* loaded from: classes4.dex */
public final class t5t implements npr {
    public int e;
    public final com.vk.core.tool.view.galvitalayout.a b = new com.vk.core.tool.view.galvitalayout.a();
    public final a.C0782a c = new a.C0782a(0);
    public final a.b d = new a.b(0);
    public final lpr f = new lpr(0, 0, new ArrayList());

    @Override // xsna.npr
    public final lpr a(uor uorVar) {
        a.C0782a c0782a = this.c;
        c0782a.a();
        a.b bVar = this.d;
        bVar.a();
        lpr lprVar = this.f;
        lprVar.c.clear();
        int i = this.e;
        for (int i2 = 0; i2 < i; i2++) {
            lprVar.c.add(new u0u0(0, 0, 0, 0, 31, 0));
        }
        int i3 = this.e;
        c0782a.b = i3;
        c0782a.c = uorVar.f;
        c0782a.d = uorVar.a;
        c0782a.e = uorVar.b;
        c0782a.i = uorVar.c;
        c0782a.k = uorVar.d;
        for (int i4 = 0; i4 < i3; i4++) {
            s0u0 s0u0Var = uorVar.e.get(i4);
            ChildSize[] childSizeArr = c0782a.a;
            ChildSize.Companion.getClass();
            childSizeArr[i4] = ChildSize.a.a(s0u0Var.b / s0u0Var.c);
        }
        this.b.b(c0782a, bVar);
        int i5 = bVar.c;
        Rect[] rectArr = bVar.a;
        lprVar.a = i5;
        List<u0u0> list = lprVar.c;
        lprVar.b = bVar.d;
        int i6 = this.e;
        for (int i7 = 0; i7 < i6; i7++) {
            list.get(i7).b = rectArr[i7].left;
            list.get(i7).c = rectArr[i7].top;
            list.get(i7).d = rectArr[i7].right;
            list.get(i7).e = rectArr[i7].bottom;
        }
        int[] iArr = lprVar.d;
        ruj rujVar = bVar.b;
        rujVar.getClass();
        iArr[0] = 0;
        iArr[1] = rujVar.a;
        iArr[2] = rujVar.b;
        iArr[3] = rujVar.c;
        return lprVar.a();
    }
}
