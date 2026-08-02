package xsna;

import com.vk.api.generated.tabbar.dto.TabbarGetResponseDto;
import com.vk.api.generated.tabbar.dto.TabbarItemDto;
import com.vk.api.generated.tabbar.dto.TabbarItemSuggestDto;
import com.vk.tabbar.core.api.domain.TabbarItem;
import com.vk.tabbar.core.api.domain.TabbarState;
import com.vk.tabbar.core.api.domain.TabbarSuggest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: TabbarResponseMapper.kt */
/* loaded from: classes11.dex */
public final class gun0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    public static TabbarState a(TabbarGetResponseDto tabbarGetResponseDto) {
        ?? r1;
        List<TabbarItemDto> d = tabbarGetResponseDto.d();
        if (d != null) {
            List<TabbarItemDto> list = d;
            r1 = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r1.add(b((TabbarItemDto) it.next()));
            }
        } else {
            r1 = EmptyList.b;
        }
        return new TabbarState(r1, Boolean.valueOf(tabbarGetResponseDto.e()));
    }

    public static TabbarItem b(TabbarItemDto tabbarItemDto) {
        TabbarSuggest tabbarSuggest;
        String i = tabbarItemDto.e().i();
        TabbarItemSuggestDto g = tabbarItemDto.g();
        if (g != null) {
            String i2 = g.f().i();
            String e = g.e();
            TabbarItemDto d = g.d();
            tabbarSuggest = new TabbarSuggest(i2, e, d != null ? b(d) : null);
        } else {
            tabbarSuggest = null;
        }
        return new TabbarItem(i, tabbarSuggest, tabbarItemDto.getTitle(), tabbarItemDto.i(), tabbarItemDto.f());
    }
}
