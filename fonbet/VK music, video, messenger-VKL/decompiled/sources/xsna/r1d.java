package xsna;

import android.content.Context;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.feature.music.holders.MusicCatalogErrorRedesignedStateScrollableVh;
import com.vk.clips.sdk.shared.item.clip.subtitles.SdkSubtitlesConfigurationMode;
import com.vk.core.compose.component.modal.SheetValue;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.music.fragment.impl.MusicCatalogFragment;
import com.vk.writebar.WriteBar;
import java.util.ArrayList;
import xsna.q630;
import xsna.s1d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class r1d implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ r1d(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                int i = s1d.v;
                return s1d.a.a((y0r) obj, (SdkSubtitlesConfigurationMode) obj2);
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1603550686, intValue, -1, "com.vk.notifications.list.impl.presentation.base.view.list.ComposableSingletons$NotificationListAppBarKt.lambda$-1603550686.<anonymous> (NotificationListAppBar.kt:35)");
                    }
                    f9t.e(q630.a.a, aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                t8s.b(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 3:
                int intValue2 = ((Integer) obj2).intValue();
                bpn0 bpn0Var = uvg0.a;
                return uvg0.b((Context) obj, 4, intValue2, new ap30(rvg0.b, 14));
            case 4:
                int i2 = MusicCatalogFragment.W;
                return new MusicCatalogErrorRedesignedStateScrollableVh((CatalogStatesViewHolder) obj, (gzs) obj2, null, null, 12);
            case 5:
                ((Integer) obj2).getClass();
                n750.g(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.add(obj2);
                return arrayList;
            case 7:
                us2 us2Var = (us2) obj2;
                return e43.a(us2Var.c, i2h0.a(us2Var.b, i2h0.b, (f2h0) obj));
            case 8:
                return (SheetValue) ((zak0) ((fdj0) obj2).b.f).getValue();
            case 9:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar2.K(-574356231);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-574356231, intValue3, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:142)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.f;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return frv0Var;
            default:
                int i3 = WriteBar.h0;
                ((WriteBar) obj).Ng();
                return s3q0.a;
        }
    }
}
