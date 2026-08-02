package defpackage;

import android.view.View;
import com.yandex.div.core.view2.divs.tabs.b;
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import com.yandex.div.core.view2.divs.widgets.DivFrameLayout;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.divs.widgets.DivGridLayout;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.divs.widgets.DivLinearLayout;
import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivSelectView;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.divs.widgets.DivSwitchView;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div.core.view2.divs.widgets.DivWrapLayout;
import com.yandex.div.core.view2.f;
import com.yandex.div.internal.view.DivImageView;
import com.yandex.div.internal.widget.tabs.TabItemLayout;

/* loaded from: classes.dex */
public final /* synthetic */ class cpl implements ar31 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cpl(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ar31
    public final View a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new DivLineHeightTextView(((f) obj).a, null, 0, 6, null);
            case 1:
                return new DivGifImageView(((f) obj).a, null, 0, 6, null);
            case 2:
                return new DivFrameLayout(((f) obj).a, null, 0, 6, null);
            case 3:
                return new DivLinearLayout(((f) obj).a, null, 0, 6, null);
            case 4:
                return new DivWrapLayout(((f) obj).a);
            case 5:
                return new DivGridLayout(((f) obj).a, null, 0, 6, null);
            case 6:
                return new DivRecyclerView(((f) obj).a, null, 0, 6, null);
            case 7:
                return new DivPagerView(((f) obj).a, null, 0, 6, null);
            case 8:
                return new DivTabsLayout(((f) obj).a, null, 2, null);
            case 9:
                return new DivStateLayout(((f) obj).a, null, 0, 6, null);
            case 10:
                return new DivCustomWrapper(((f) obj).a, null, 0, 6, null);
            case 11:
                return new DivPagerIndicatorView(((f) obj).a, null, 0, 6, null);
            case 12:
                return new DivSliderView(((f) obj).a, null, 0, 6, null);
            case 13:
                return new DivInputView(((f) obj).a, null, 0, 6, null);
            case 14:
                return new DivSelectView(((f) obj).a);
            case 15:
                return new DivVideoView(((f) obj).a, null, 0, 6, null);
            case 16:
                return new DivSwitchView(((f) obj).a);
            case 17:
                return new DivImageView(((f) obj).a, null, 0, 6, null);
            default:
                return new TabItemLayout(((b) obj).E, null, 2, null);
        }
    }
}
