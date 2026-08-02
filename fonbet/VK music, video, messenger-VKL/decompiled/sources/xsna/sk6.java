package xsna;

import com.vk.api.generated.base.dto.BasePrivacyDto;
import com.vk.api.generated.privacy.dto.PrivacyCategoryDto;
import com.vk.api.generated.privacy.dto.PrivacyListsDto;
import com.vk.api.generated.privacy.dto.PrivacyOwnersDto;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: BasePrivacyDtoToPrivacyRuleMapper.kt */
/* loaded from: classes3.dex */
public final class sk6 {
    public static ArrayList a(BasePrivacyDto basePrivacyDto) {
        String str;
        List<Integer> d;
        List<Integer> e;
        List<UserId> e2;
        String i;
        PrivacyCategoryDto d2 = basePrivacyDto.d();
        String str2 = "";
        if (d2 == null || (str = d2.i()) == null) {
            str = "";
        }
        PrivacyCategoryDto e3 = basePrivacyDto.e();
        if (e3 != null && (i = e3.i()) != null) {
            str2 = i;
        }
        PrivacyOwnersDto g = basePrivacyDto.g();
        boolean z = (g == null || (e2 = g.e()) == null) ? false : !e2.isEmpty();
        PrivacyListsDto f = basePrivacyDto.f();
        boolean z2 = (f == null || (e = f.e()) == null) ? false : !e.isEmpty();
        PrivacyListsDto f2 = basePrivacyDto.f();
        PrivacySetting.PrivacyRule a = ied0.a(z, z2, (f2 == null || (d = f2.d()) == null || !d.contains(28)) ? false : true, str, str2);
        ArrayList arrayList = new ArrayList();
        PrivacyRules.Include include = new PrivacyRules.Include();
        PrivacyRules.Exclude exclude = new PrivacyRules.Exclude();
        if (!epx.f(a, PrivacyRules.c)) {
            arrayList.add(a);
        }
        PrivacyOwnersDto g2 = basePrivacyDto.g();
        if (g2 != null) {
            List<UserId> e4 = g2.e();
            if (e4 != null) {
                Iterator<T> it = e4.iterator();
                while (it.hasNext()) {
                    exclude.Fb((UserId) it.next());
                }
            }
            List<UserId> d3 = g2.d();
            if (d3 != null) {
                Iterator<T> it2 = d3.iterator();
                while (it2.hasNext()) {
                    include.Fb((UserId) it2.next());
                }
            }
        }
        PrivacyListsDto f3 = basePrivacyDto.f();
        if (f3 != null) {
            List<Integer> e5 = f3.e();
            if (e5 != null) {
                Iterator<T> it3 = e5.iterator();
                while (it3.hasNext()) {
                    exclude.Fb(new UserId(((Number) it3.next()).intValue() + 2000000000));
                }
            }
            List<Integer> d4 = f3.d();
            if (d4 != null) {
                Iterator<T> it4 = d4.iterator();
                while (it4.hasNext()) {
                    include.Fb(new UserId(((Number) it4.next()).intValue() + 2000000000));
                }
            }
        }
        if (!include.c.isEmpty()) {
            arrayList.add(include);
        }
        if (!exclude.c.isEmpty()) {
            arrayList.add(exclude);
        }
        if (arrayList.isEmpty()) {
            arrayList.add(PrivacyRules.a);
        }
        return arrayList;
    }
}
