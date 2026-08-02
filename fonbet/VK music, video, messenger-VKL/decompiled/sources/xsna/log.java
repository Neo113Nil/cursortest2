package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.base.VkPaginationList;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.core.compose.generated.VkTypographyToken;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.ebt;
import xsna.riv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class log implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ log(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        String str;
        switch (this.b) {
            case 0:
                UIBlockList uIBlockList = (UIBlockList) obj;
                List b = nog.b(uIBlockList);
                if (b != null) {
                    uIBlockList.y.removeIf(new kog(new jog(b, 0), r4 ? 1 : 0));
                }
                return uIBlockList;
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1619100112, intValue, -1, "com.vk.profile.core.scheduled_clips.ComposableSingletons$CommunityScheduledClipsGridViewKt.lambda$-1619100112.<anonymous> (CommunityScheduledClipsGridView.kt:122)");
                    }
                    tth.a(null, wdi.a, aVar, 48);
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
                        androidx.compose.runtime.b.f(-1606313583, intValue2, -1, "com.vk.core.compose.component.ComposableSingletons$VkAccentTabRowKt.lambda$-1606313583.<anonymous> (VkAccentTabRow.kt:539)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 3:
                return Boolean.valueOf(((Pair) obj).i() == ((Pair) obj2).i());
            case 4:
                ((Integer) obj2).getClass();
                jeo.b(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 5:
                List<T> list = ((VkPaginationList) obj2).b;
                EmptyList emptyList = EmptyList.b;
                return new kqs(list, emptyList, emptyList, (List) obj);
            case 6:
                int intValue3 = ((Integer) obj).intValue();
                ebt ebtVar = (ebt) obj2;
                if (ebtVar instanceof ebt.a) {
                    return "activity_section_" + ((ebt.a) ebtVar).a.hashCode() + '_' + intValue3;
                }
                if (epx.f(ebtVar, ebt.b.a)) {
                    str = "activity_section_skeleton_";
                } else if (epx.f(ebtVar, ebt.c.a)) {
                    str = "base_skeleton_";
                } else {
                    if (ebtVar instanceof ebt.d) {
                        return "detail_section_" + ((ebt.d) ebtVar).a.a.hashCode() + '_' + intValue3;
                    }
                    if (ebtVar instanceof ebt.e) {
                        return "detail_section_" + ((ebt.e) ebtVar).a.hashCode() + '_' + intValue3;
                    }
                    if (ebtVar instanceof ebt.f) {
                        return "detail_section_" + ((ebt.f) ebtVar).a.hashCode() + '_' + intValue3;
                    }
                    if (epx.f(ebtVar, ebt.g.a)) {
                        str = "my_games_section_skeleton_";
                    } else {
                        if (ebtVar instanceof ebt.h) {
                            return "new_notification_section_" + ((ebt.h) ebtVar).a.hashCode() + '_' + intValue3;
                        }
                        if (ebtVar instanceof ebt.i) {
                            return "notification_section_" + ((ebt.i) ebtVar).a.hashCode() + '_' + intValue3;
                        }
                        if (!epx.f(ebtVar, ebt.j.a)) {
                            if (epx.f(ebtVar, ebt.k.a)) {
                                return String.valueOf(intValue3);
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "notification_section_skeleton_";
                    }
                }
                return lhg.a(intValue3, str);
            case 7:
                String str2 = (String) obj;
                riv.b bVar = (riv.b) obj2;
                if (bVar == null) {
                    bVar = new riv.b(str2);
                }
                bVar.b++;
                return bVar;
            case 8:
                ((Integer) obj).getClass();
                xgx0.a.getClass();
                xgx0.b((String) obj2);
                return s3q0.a;
            case 9:
                RecyclerView recyclerView = (RecyclerView) obj2;
                return Boolean.valueOf(w820.a(recyclerView, recyclerView.getChildAdapterPosition((View) obj)) instanceof b2c0);
            case 10:
                String[] strArr = (String[]) obj;
                int intValue4 = ((Integer) obj2).intValue();
                jw5.p(null, strArr);
                return strArr.length != intValue4 ? (String[]) Arrays.copyOf(strArr, intValue4) : strArr;
            case 11:
                return (ClipsPlaylist) obj2;
            case 12:
                fno0 fno0Var = (fno0) obj2;
                return fno0Var != null ? fno0.b(fno0Var.a, fno0.c) : false ? Boolean.FALSE : e43.a(Float.valueOf(fno0.d(fno0Var.a)), i2h0.a(new gno0(fno0.c(fno0Var.a)), i2h0.y, (f2h0) obj));
            case 13:
                ((sti) obj).a(new x100("StorefrontServices", f370.d, (sl50) obj2));
                return s3q0.a;
            case 14:
                ((Integer) obj2).getClass();
                vpu0.a(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            default:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar3.K(902772538);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(902772538, intValue5, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:251)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.k1;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return frv0Var;
        }
    }

    public /* synthetic */ log(int i, int i2) {
        this.b = i2;
    }

    public /* synthetic */ log(nog nogVar) {
        this.b = 0;
    }
}
