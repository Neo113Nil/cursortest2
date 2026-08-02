package xsna;

import androidx.compose.runtime.a;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.ecomm.storefrontservices.impl.presentation.feature.PlaceholderState;
import com.vk.im.engine.internal.merge.messages.ChannelMsgHistoryFromServerMergeTask;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.onelog.ExperimentalOneLogDirect;
import ru.ok.android.onelog.OneLogItem;
import xsna.fa90;
import xsna.t7z;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class w4b implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ w4b(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        s3q0 send$lambda$1;
        switch (this.b) {
            case 0:
                ChannelMsgHistoryFromServerMergeTask.a aVar = ChannelMsgHistoryFromServerMergeTask.k;
                return Boolean.FALSE;
            case 1:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1848384258, intValue, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.ComposableSingletons$StorefrontServicesPlaceholderKt.lambda$-1848384258.<anonymous> (StorefrontServicesPlaceholder.kt:208)");
                    }
                    PlaceholderState placeholderState = PlaceholderState.Services;
                    Object x = aVar2.x();
                    if (x == a.C0011a.a) {
                        x = new g54(16);
                        aVar2.R(x);
                    }
                    hol0.f(placeholderState, null, null, false, null, (izs) x, aVar2, 199686, 22);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                send$lambda$1 = ExperimentalOneLogDirect.send$lambda$1((OneLogItem) obj, (Exception) obj2);
                return send$lambda$1;
            case 3:
                nsv nsvVar = (nsv) j5g.b0(((Integer) obj2).intValue(), (List) obj);
                return Boolean.valueOf((nsvVar != null ? nsvVar.c : null) instanceof fa90.a);
            case 4:
                Object obj3 = ((ArrayList) ((lca) obj2).y0()).get(((Integer) obj).intValue());
                UIBlockMusicTrack uIBlockMusicTrack = obj3 instanceof UIBlockMusicTrack ? (UIBlockMusicTrack) obj3 : null;
                if (uIBlockMusicTrack != null) {
                    return uIBlockMusicTrack.z;
                }
                return null;
            case 5:
                return Integer.valueOf(((t7z.c) obj2).a);
            default:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar3.K(1086951037);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1086951037, intValue2, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:138)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.b;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return frv0Var;
        }
    }
}
