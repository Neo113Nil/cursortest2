package xsna;

import android.widget.ImageView;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.dto.music.MusicTrack;
import com.vk.im.engine.utils.StringMatchStrategy;
import com.vkontakte.android.R;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class uni implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ uni(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-232709222, intValue, -1, "com.vk.core.compose.component.ComposableSingletons$VkHorizontalArrowKt.lambda$-232709222.<anonymous> (VkHorizontalArrow.kt:96)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                ((ImageView) obj).setColorFilter(new upj0(((kkm) obj2).f(R.attr.vk_ui_icon_accent)));
                return s3q0.a;
            case 2:
                return (MusicTrack) obj;
            case 3:
                yx4 yx4Var = (yx4) obj;
                HashMap<Integer, Integer> hashMap = yx4Var.e;
                for (Map.Entry<Integer, Integer> entry : ((yx4) obj2).e.entrySet()) {
                    int intValue2 = entry.getKey().intValue();
                    int intValue3 = entry.getValue().intValue();
                    Integer valueOf = Integer.valueOf(intValue2);
                    Integer valueOf2 = Integer.valueOf(intValue3);
                    final nhi nhiVar = new nhi(7);
                    hashMap.merge(valueOf, valueOf2, new BiFunction() { // from class: xsna.zya0
                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj3, Object obj4) {
                            return (Integer) nhi.this.invoke(obj3, obj4);
                        }
                    });
                }
                return yx4Var;
            case 4:
                f2h0 f2h0Var = (f2h0) obj;
                fh90 fh90Var = (fh90) obj2;
                Object a = i2h0.a(new obo0(fh90Var.a), i2h0.s, f2h0Var);
                Object a2 = i2h0.a(new udo0(fh90Var.b), i2h0.t, f2h0Var);
                Object a3 = i2h0.a(new fno0(fh90Var.c), i2h0.x, f2h0Var);
                iio0 iio0Var = fh90Var.d;
                iio0 iio0Var2 = iio0.c;
                Object a4 = i2h0.a(iio0Var, i2h0.m, f2h0Var);
                yta0 yta0Var = fh90Var.e;
                yta0 yta0Var2 = yta0.c;
                Object a5 = i2h0.a(yta0Var, k2h0.a, f2h0Var);
                t7z t7zVar = fh90Var.f;
                t7z t7zVar2 = t7z.d;
                return e43.a(a, a2, a3, a4, a5, i2h0.a(t7zVar, i2h0.C, f2h0Var), i2h0.a(new q7z(fh90Var.g), k2h0.c, f2h0Var), i2h0.a(new plv(fh90Var.h), i2h0.u, f2h0Var), i2h0.a(fh90Var.i, k2h0.d, f2h0Var));
            case 5:
                StringMatchStrategy stringMatchStrategy = StringMatchStrategy.STRICT;
                return Boolean.valueOf(brm0.B((String) obj, (String) obj2, true));
            case 6:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar2.K(-812513448);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-812513448, intValue4, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:163)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.A;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return frv0Var;
            default:
                ((Map) obj).putAll((Map) obj2);
                return s3q0.a;
        }
    }
}
