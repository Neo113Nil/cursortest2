package defpackage;

import com.yandex.alicekit.core.widget.TabView;
import com.yandex.alicekit.core.widget.YandexCoreIndicatorTabLayout;

/* loaded from: classes11.dex */
public final class ml51 {
    public CharSequence a;
    public int b;
    public YandexCoreIndicatorTabLayout c;
    public TabView d;

    public final void a() {
        YandexCoreIndicatorTabLayout yandexCoreIndicatorTabLayout = this.c;
        if (yandexCoreIndicatorTabLayout != null) {
            yandexCoreIndicatorTabLayout.selectTab(this);
        } else {
            ny61.g("Tab not attached to a TabLayout");
        }
    }
}
