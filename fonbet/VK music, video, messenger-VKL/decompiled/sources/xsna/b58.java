package xsna;

import com.vk.menu.presentation.entity.TabMenuItemUiData;
import com.vkontakte.android.R;
import java.util.HashMap;

/* compiled from: BottomMenuAndLeftMenuTranslator.kt */
/* loaded from: classes3.dex */
public final class b58 {
    public static final bpn0 a = new bpn0(new x84(1));
    public static final bpn0 b = new bpn0(new y84(1));

    public static int a(Integer num) {
        return num != null ? ((Number) ((HashMap) b.getValue()).getOrDefault(num, Integer.valueOf(TabMenuItemUiData.HUB.h()))).intValue() : R.id.tab_news;
    }
}
