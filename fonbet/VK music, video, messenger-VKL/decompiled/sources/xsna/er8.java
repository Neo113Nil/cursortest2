package xsna;

import com.vk.core.tool.view.vkblur.VkBlurContentView;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.hr8;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class er8 implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ List b;
    public final /* synthetic */ hr8 c;
    public final /* synthetic */ VkBlurContentView d;
    public final /* synthetic */ rv5 e;

    public er8(ListBuilder listBuilder, hr8 hr8Var, VkBlurContentView vkBlurContentView, rv5 rv5Var) {
        this.b = listBuilder;
        this.c = hr8Var;
        this.d = vkBlurContentView;
        this.e = rv5Var;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i;
        ksy ksyVar2 = ksyVar;
        int intValue = num.intValue();
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue2 = num2.intValue();
        if ((intValue2 & 6) == 0) {
            i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= aVar2.o(intValue) ? 32 : 16;
        }
        if (aVar2.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            hkr0 hkr0Var = (hkr0) this.b.get(intValue);
            aVar2.K(1495937549);
            StringBuilder sb = new StringBuilder();
            sb.append(hkr0Var.a.h());
            if (hkr0Var.a.h().length() > 0) {
                sb.append(" ");
            }
            sb.append(hkr0Var.b);
            sb.append(" ");
            sb.append(hkr0Var.d);
            sb.append(" ");
            sb.append(hkr0Var.c);
            String sb2 = sb.toString();
            hr8 hr8Var = this.c;
            int i2 = hr8.d.$EnumSwitchMapping$0[((hr8.a) ((zak0) hr8Var.e).getValue()).ordinal()];
            if (i2 == 1) {
                aVar2.K(186816668);
                boolean l = hr8Var.l();
                int i3 = VkBlurContentView.f;
                nr8.b(hkr0Var, sb2, l, this.d, aVar2, 4096);
                aVar2.j();
            } else if (i2 == 2) {
                aVar2.K(186820497);
                int i4 = VkBlurContentView.f;
                nr8.c(hkr0Var, sb2, this.d, aVar2, 512);
                aVar2.j();
            } else {
                if (i2 != 3) {
                    throw alb0.c(186814759, aVar2);
                }
                aVar2.K(186824072);
                nr8.a(hkr0Var, sb2, hr8Var.l(), this.e, aVar2, 0);
                aVar2.j();
            }
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
