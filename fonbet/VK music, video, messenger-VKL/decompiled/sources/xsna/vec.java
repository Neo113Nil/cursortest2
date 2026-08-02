package xsna;

import android.view.View;
import android.widget.CheckBox;
import com.vk.catalog2.common.ui.holders.search.SearchSpellcheckAnalyticsInfo;
import com.vk.catalog2.feature.search.dto.ui.UIBlockSearchSpellcheck;
import com.vk.catalog2.feature.search.holders.SearchSpellcheckVh;
import com.vk.dto.stories.model.clickable.ClickableGeo;
import com.vk.newsfeed.api.di.NewsfeedRouterComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class vec implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vec(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b5a b5aVar;
        switch (this.b) {
            case 0:
                ((wec) this.c).l.invoke((uec) this.d);
                break;
            case 1:
                qkc qkcVar = (qkc) this.c;
                ClickableGeo clickableGeo = (ClickableGeo) this.d;
                qkcVar.m(clickableGeo);
                b7u0 k = g2v.c().k();
                ((NewsfeedRouterComponent) k.b.getValue()).l0().J(clickableGeo.e, view.getContext());
                break;
            case 2:
                ((izs) this.c).invoke((vv00) this.d);
                break;
            case 3:
                SearchSpellcheckVh searchSpellcheckVh = (SearchSpellcheckVh) this.c;
                String str = (String) this.d;
                UIBlockSearchSpellcheck uIBlockSearchSpellcheck = searchSpellcheckVh.g;
                if (uIBlockSearchSpellcheck != null && (b5aVar = searchSpellcheckVh.b) != null) {
                    b5aVar.a(new cfp0(uIBlockSearchSpellcheck, new SearchSpellcheckAnalyticsInfo(SearchSpellcheckAnalyticsInfo.ClickTarget.Tap)));
                }
                m3a m3aVar = searchSpellcheckVh.c;
                if (m3aVar != null) {
                    m3aVar.j(new SearchSpellcheckVh.a.b(str));
                    break;
                }
                break;
            default:
                yads.i82.a((yads.i82) this.c, (CheckBox) this.d, view);
                break;
        }
    }
}
