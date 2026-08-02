package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.channels.dto.ChannelsInitializePaymentForMessagesPaidReactionsResponseDto;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.GoodAlbum;
import com.vk.music.stickyplayer.presentation.components.BigPlayerBottomSheetValue;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.utils.retry.RetryKt;
import xsna.bhb0;
import xsna.kkl0;
import xsna.q630;
import xsna.q8z;
import xsna.riv;
import xsna.s840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class f07 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ f07(byte b, int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return (BigPlayerBottomSheetValue) ((zak0) ((g07) obj2).c.g).getValue();
            case 1:
                return new Pair((Integer) obj, (ChannelsInitializePaymentForMessagesPaidReactionsResponseDto) obj2);
            case 2:
                return com.vk.photo.editor.features.colorgrading.a.a((com.vk.photo.editor.features.colorgrading.a) obj, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Float) obj2).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 8175);
            case 3:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1321369453, intValue, -1, "com.vk.biometrics.lock.impl.presentation.base.view.ComposableSingletons$PinGridKt.lambda$-1321369453.<anonymous> (PinGrid.kt:87)");
                    }
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = new ol(15);
                        aVar.R(x);
                    }
                    q630 a = egi0.a(q630.a.a, (izs) x);
                    String N = d370.N(R.string.bl_logout, 0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.X;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(N, a, ylu0Var.getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, aVar, 0, 0, 8120);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 4:
                String str = (String) obj;
                riv.b bVar = (riv.b) obj2;
                if (bVar == null) {
                    bVar = new riv.b(str);
                }
                bVar.c++;
                return bVar;
            case 5:
                return Boolean.TRUE;
            case 6:
                VkButton vkButton = (VkButton) obj;
                VkCell.f fVar = (VkCell.f) obj2;
                if (fVar instanceof s840.a) {
                    ((s840.a) fVar).getClass();
                    Integer valueOf = Integer.valueOf(R.drawable.vk_icon_add_outline_28);
                    int[] iArr = VkButton.W;
                    vkButton.a5(true, valueOf);
                    vkButton.setIconTint(R.attr.vk_ui_icon_accent);
                }
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                sc40.c(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 8:
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                qaj0.c(Preference.j(), "overlay_menu_is_enabled", bool);
                x290.a.update(true);
                return s3q0.a;
            case 9:
                View view = (View) obj;
                VkCell.f fVar2 = (VkCell.f) obj2;
                bhb0.a aVar2 = fVar2 instanceof bhb0.a ? (bhb0.a) fVar2 : null;
                if (aVar2 != null) {
                    view.setContentDescription(view.getContext().getString(aVar2.b));
                    view.setBackground(m33.a(aVar2.a, view.getContext()));
                }
                return s3q0.a;
            case 10:
                return RetryKt.b((Throwable) obj, ((Integer) obj2).intValue());
            case 11:
                q8z.a aVar3 = (q8z.a) obj2;
                return e43.a(aVar3.a, i2h0.a(aVar3.b, i2h0.j, (f2h0) obj));
            case 12:
                jkl0 jkl0Var = (jkl0) obj;
                List<GoodAlbum> list = jkl0Var.a;
                mpl0 mpl0Var = (mpl0) ((it80) obj2).a;
                List<GoodAlbum> list2 = list == null ? EmptyList.b : list;
                int size = list != null ? list.size() : 0;
                int i = jkl0Var.b;
                String str2 = jkl0Var.c;
                return new kkl0.b(mpl0Var, list2, size, i, !(str2 == null || str2.length() == 0), jkl0Var.d);
            default:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar4.K(72118904);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(72118904, intValue2, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:253)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) aVar4.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var2 = wuv0Var2.m1;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
                return frv0Var2;
        }
    }
}
