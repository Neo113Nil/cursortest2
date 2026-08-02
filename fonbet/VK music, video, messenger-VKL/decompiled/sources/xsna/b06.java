package xsna;

import android.graphics.Bitmap;
import com.vk.api.generated.orders.dto.OrdersGetAutoBuyStatusResponseDto;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Map;
import xsna.d06;
import xsna.i2y;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class b06 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ b06(byte b, int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                OrdersGetAutoBuyStatusResponseDto ordersGetAutoBuyStatusResponseDto = (OrdersGetAutoBuyStatusResponseDto) obj2;
                return new d06.a(((Integer) obj).intValue(), ordersGetAutoBuyStatusResponseDto.d(), ordersGetAutoBuyStatusResponseDto.e());
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(927862895, intValue, -1, "com.vk.music.ui.subscription.ComposableSingletons$MusicBuySubscriptionKt.lambda$927862895.<anonymous> (MusicBuySubscription.kt:79)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2113961956, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel16> (VkSdkIcons.kt:212)");
                    }
                    lg90 a = pg90.a(R.drawable.vk_icon_cancel_16, 0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    String N = d370.N(R.string.close, 0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    pzu0.b(a, N, null, ylu0Var.getIcon().c, aVar, 8, 4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-980673320, intValue2, -1, "com.vk.music.stickyplayer.presentation.components.radio.ComposableSingletons$RadioBigPlayerControlsKt.lambda$-980673320.<anonymous> (RadioBigPlayerControls.kt:38)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 3:
                yjl yjlVar = (yjl) obj2;
                return e43.l(Integer.valueOf(yjlVar.k()), Float.valueOf(swe0.f(yjlVar.l(), -0.5f, 0.5f)), Integer.valueOf(yjlVar.o()));
            case 4:
                return new i2y.a((yfx0) obj, (ztz) obj2);
            case 5:
                l1h0 l1h0Var = (l1h0) obj2;
                Map<Object, Map<String, List<Object>>> map = l1h0Var.b;
                ph50<Object, m1h0> ph50Var = l1h0Var.c;
                Object[] objArr = ph50Var.b;
                Object[] objArr2 = ph50Var.c;
                long[] jArr = ph50Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj3 = objArr[i4];
                                    Map<String, List<Object>> d = ((m1h0) objArr2[i4]).d();
                                    if (d.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, d);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                            }
                        }
                        if (i != length) {
                            i++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 6:
                ((Integer) obj2).getClass();
                mml0.a(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 7:
                return Bitmap.createBitmap(((Integer) obj).intValue(), ((Integer) obj2).intValue(), Bitmap.Config.ARGB_8888);
            case 8:
                ((Integer) obj).intValue();
                return s3q0.a;
            case 9:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar3.K(1283661759);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1283661759, intValue3, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:178)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.P;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return frv0Var;
            default:
                ckr0 ckr0Var = (ckr0) obj;
                return ckr0Var == null ? i4y0.a : ckr0Var;
        }
    }
}
