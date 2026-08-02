package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.button.DropdownButton$Appearance;
import java.util.List;
import ru.ok.gl.tf.Tensorflow;
import xsna.q630;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class gr8 implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ List b;

    public gr8(List list) {
        this.b = list;
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
            DropdownButton$Appearance dropdownButton$Appearance = (DropdownButton$Appearance) this.b.get(intValue);
            aVar2.K(763954363);
            q630 D = s200.D(q630.a.a, 4);
            String str = "Dropdown " + dropdownButton$Appearance;
            Object x = aVar2.x();
            if (x == a.C0011a.a) {
                x = br8.c;
                aVar2.R(x);
            }
            bhu0.g(str, (gzs) x, D, dropdownButton$Appearance, aVar2, Tensorflow.FRAME_WIDTH);
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
