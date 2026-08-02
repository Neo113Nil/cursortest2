package xsna;

import com.vk.core.compose.component.banner.Banner$BackgroundMode;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.d16;
import xsna.q630;

/* compiled from: ExpandableDescriptionImpl.kt */
/* loaded from: classes17.dex */
public final class e8q extends d16.c.a {
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final rg50 f;
    public final wh50 g;
    public final wh50 h;
    public final wh50 i;
    public final wh50 j;
    public final wh50 k;
    public final wh50 l;

    public e8q() {
        throw null;
    }

    public e8q(us2 us2Var, boolean z, gzs gzsVar, String str, int i, String str2, boolean z2, gzs gzsVar2, long j, long j2, SemanticsConfiguration semanticsConfiguration) {
        this.b = androidx.compose.runtime.k.b(us2Var);
        this.c = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.d = androidx.compose.runtime.k.b(gzsVar);
        this.e = androidx.compose.runtime.k.b(str);
        this.f = androidx.compose.runtime.i.a(i);
        this.g = androidx.compose.runtime.k.b(str2);
        this.h = androidx.compose.runtime.k.b(Boolean.valueOf(z2));
        this.i = androidx.compose.runtime.k.b(gzsVar2);
        this.j = zy60.d(j);
        this.k = zy60.d(j2);
        this.l = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    @Override // xsna.d16.c
    public final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1574940032);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1574940032, i2, -1, "com.vk.core.compose.component.banner.ExpandableDescriptionImpl.Content (ExpandableDescriptionImpl.kt:44)");
            }
            us2 us2Var = (us2) ((zak0) this.b).getValue();
            boolean booleanValue = ((Boolean) ((zak0) this.c).getValue()).booleanValue();
            gzs gzsVar = (gzs) ((zak0) this.d).getValue();
            q630 b = com.vk.core.compose.component.semantics.b.b(q630.a.a, (SemanticsConfiguration) ((zak0) this.l).getValue());
            String str = (String) ((zak0) this.e).getValue();
            int intValue = ((wak0) this.f).getIntValue();
            String str2 = (String) ((zak0) this.g).getValue();
            boolean booleanValue2 = ((Boolean) ((zak0) this.h).getValue()).booleanValue();
            gzs gzsVar2 = (gzs) ((zak0) this.i).getValue();
            aVar2 = M;
            psu0.e(us2Var, booleanValue, gzsVar, b, ((l5g) ((zak0) this.j).getValue()).a, tdu0.d(M), tdu0.d(M), tdu0.c((Banner$BackgroundMode) ((zak0) this.a).getValue(), M), intValue, 0, str, str2, ((l5g) ((zak0) this.k).getValue()).a, tdu0.d(aVar2), booleanValue2, gzsVar2, aVar2, 0, 0, 512);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new nx7(this, i, 4);
        }
    }
}
