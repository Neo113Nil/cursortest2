package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.dto.common.data.VKList;
import com.vk.photo.editor.features.colorgrading.a;
import com.vk.voip.ui.VoipViewModelState;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.ok.android.onelog.OneLogDirect;
import ru.ok.android.onelog.OneLogItem;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class wni implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ wni(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        s3q0 send_PCEVtD0$lambda$0;
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1166115237, intValue, -1, "com.vk.core.compose.component.ComposableSingletons$VkPictureKt.lambda$1166115237.<anonymous> (VkPicture.kt:55)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                return (u4o) obj;
            case 2:
                com.vk.photo.editor.features.colorgrading.a aVar2 = (com.vk.photo.editor.features.colorgrading.a) obj;
                return com.vk.photo.editor.features.colorgrading.a.a(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a.C1454a.a(aVar2.j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Float) obj2).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 134217695), null, 6143);
            case 3:
                dsy dsyVar = (dsy) obj2;
                return e43.l(Integer.valueOf(dsyVar.g()), Integer.valueOf(dsyVar.h()));
            case 4:
                Map<String, List<Object>> d = ((jwy) obj2).d();
                if (d.isEmpty()) {
                    return null;
                }
                return d;
            case 5:
                return null;
            case 6:
                List list = (List) obj;
                ((Long) obj2).longValue();
                return list;
            case 7:
                VoipViewModelState voipViewModelState = (VoipViewModelState) obj2;
                int i = el70.g1;
                if (!((Boolean) obj).booleanValue() && voipViewModelState.i()) {
                    r2 = false;
                }
                return Boolean.valueOf(r2);
            case 8:
                send_PCEVtD0$lambda$0 = OneLogDirect.send_PCEVtD0$lambda$0((OneLogItem) obj, (Exception) obj2);
                return send_PCEVtD0$lambda$0;
            case 9:
                yta0 yta0Var = (yta0) obj2;
                Boolean valueOf = Boolean.valueOf(yta0Var.a);
                fh9 fh9Var = i2h0.a;
                return e43.a(valueOf, i2h0.a(new ydp(yta0Var.b), k2h0.b, (f2h0) obj));
            case 10:
                EmptyList emptyList = EmptyList.b;
                return new Pair((VKList) ((Optional) obj).orElse(new VKList(emptyList)), (VKList) ((Optional) obj2).orElse(new VKList(emptyList)));
            case 11:
                Object obj3 = ((ArrayList) ((lca) obj2).y0()).get(((Integer) obj).intValue());
                UIBlockMusicTrack uIBlockMusicTrack = obj3 instanceof UIBlockMusicTrack ? (UIBlockMusicTrack) obj3 : null;
                if (uIBlockMusicTrack != null) {
                    return uIBlockMusicTrack.z;
                }
                return null;
            default:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar3.K(1273891198);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1273891198, intValue2, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:168)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.F;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return frv0Var;
        }
    }
}
