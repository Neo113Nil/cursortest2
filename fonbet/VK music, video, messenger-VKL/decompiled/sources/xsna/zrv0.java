package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent;

/* compiled from: VkTile.kt */
/* loaded from: classes17.dex */
public final class zrv0 implements yzs<qa8, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ HorizontalListItem$VisualContent b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ yzs e;

    public zrv0(HorizontalListItem$VisualContent horizontalListItem$VisualContent, boolean z, boolean z2, yzs yzsVar) {
        this.b = horizontalListItem$VisualContent;
        this.c = z;
        this.d = z2;
        this.e = yzsVar;
    }

    @Override // xsna.yzs
    public final s3q0 invoke(qa8 qa8Var, androidx.compose.runtime.a aVar, Integer num) {
        qa8 qa8Var2 = qa8Var;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if ((intValue & 6) == 0) {
            intValue |= aVar2.J(qa8Var2) ? 4 : 2;
        }
        if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1470655449, intValue, -1, "com.vk.core.compose.component.tile.VkTile.<anonymous> (VkTile.kt:107)");
            }
            boolean z = (intValue & 14) == 4;
            Object x = aVar2.x();
            if (z || x == a.C0011a.a) {
                x = new eto0(qa8Var2);
                aVar2.R(x);
            }
            eto0 eto0Var = (eto0) x;
            aVar2.K(-439628202);
            this.b.a(0, 9205357640488583168L, aVar2);
            aVar2.j();
            aVar2.K(-1347566339);
            asv0.a(eto0Var, this.c, this.d, aVar2, 0);
            this.e.invoke(eto0Var, aVar2, 0);
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
