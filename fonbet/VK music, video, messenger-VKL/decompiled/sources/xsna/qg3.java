package xsna;

import com.vk.api.generated.donut.dto.DonutGroupSettingsDto;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.music.player.PlayerTrack;
import com.vk.voip.dto.call_member.CallMemberId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class qg3 implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ qg3(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x014b, code lost:
    
        if (r9 == false) goto L57;
     */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        PlayerTrack playerTrack;
        boolean z;
        switch (this.b) {
            case 0:
                hfz hfzVar = (hfz) obj;
                hfz hfzVar2 = (hfz) obj2;
                return Boolean.valueOf(((hfzVar instanceof a7i) && (hfzVar2 instanceof a7i)) ? ((a7i) hfzVar).za((a7i) hfzVar2) : hfzVar.equals(hfzVar2));
            case 1:
                return new Pair((DonutGroupSettingsDto) obj, (Boolean) obj2);
            case 2:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1766251524, intValue, -1, "com.vk.video.ui.discovery.minimizable.doc2doc.ComposableSingletons$SimilarVideosHorizontalSkeletonDelegateKt.lambda$-1766251524.<anonymous> (SimilarVideosHorizontalSkeletonDelegate.kt:51)");
                    }
                    soj0.c(6, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 3:
                Object b0 = j5g.b0(((Integer) obj).intValue(), ((bz40) obj2).y0());
                xhp0 xhp0Var = b0 instanceof xhp0 ? (xhp0) b0 : null;
                if (xhp0Var == null || (playerTrack = xhp0Var.a) == null) {
                    return null;
                }
                return playerTrack.b;
            case 4:
                return b590.a(new b590(), null, (List) obj, (List) obj2, 3);
            case 5:
                qko0 qko0Var = (qko0) obj2;
                return e43.a(Integer.valueOf((int) (qko0Var.a >> 32)), Integer.valueOf((int) (qko0Var.a & 4294967295L)));
            case 6:
                Set set = (Set) ((it80) obj).a;
                Set set2 = (Set) ((it80) obj2).a;
                if (set != null && set2 != null) {
                    if (set.size() != set2.size()) {
                        z = true;
                        break;
                    } else {
                        ArrayList u0 = j5g.u0(j5g.O0(set2), j5g.O0(set));
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Iterator it = u0.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            CallMemberId callMemberId = (CallMemberId) next;
                            Object obj3 = linkedHashMap.get(callMemberId);
                            if (obj3 == null) {
                                obj3 = new ArrayList();
                                linkedHashMap.put(callMemberId, obj3);
                            }
                            ((List) obj3).add(next);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            if (((List) entry.getValue()).size() == 1) {
                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = linkedHashMap2.entrySet().iterator();
                        while (it2.hasNext()) {
                            g5g.y((Iterable) ((Map.Entry) it2.next()).getValue(), arrayList);
                        }
                        z = !arrayList.isEmpty();
                        break;
                    }
                }
                r2 = true;
                return Boolean.valueOf(r2);
            case 7:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar2.K(1332514564);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1332514564, intValue2, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:228)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.N0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
                return frv0Var;
            default:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken2 = VkTypographyToken.DisplayTitle1;
                aVar3.K(62348343);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(62348343, intValue3, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:243)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var2 = (wuv0) aVar3.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var2 = wuv0Var2.c1;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
                return frv0Var2;
        }
    }

    public /* synthetic */ qg3(mdh0 mdh0Var) {
        this.b = 6;
    }
}
