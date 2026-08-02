package defpackage;

import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import com.yandex.div.internal.widget.tabs.TabView;

/* loaded from: classes11.dex */
public final /* synthetic */ class p25 implements f5x0, h5x0 {
    public final /* synthetic */ BaseIndicatorTabLayout a;

    public /* synthetic */ p25(BaseIndicatorTabLayout baseIndicatorTabLayout) {
        this.a = baseIndicatorTabLayout;
    }

    public void a(TabView tabView) {
        this.a.onTabViewUpdated(tabView);
    }

    @Override // defpackage.f5x0
    public int getMaxWidth() {
        int tabMaxWidth;
        tabMaxWidth = this.a.getTabMaxWidth();
        return tabMaxWidth;
    }
}
