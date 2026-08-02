package xsna;

import com.vk.core.view.components.search.VkSearchView;
import com.vk.search.ui.api.SearchQuery;
import com.vkontakte.android.R;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.vrh0;
import xsna.w2o0;

/* compiled from: CommonSearchQueryViewController.kt */
/* loaded from: classes5.dex */
public final class emg implements vrh0 {
    public static final /* synthetic */ qcy<Object>[] h;
    public final VkSearchView b;
    public final h94 c;
    public vrh0.a d;
    public Boolean e;
    public Boolean f;
    public final gmg g;

    /* compiled from: CommonSearchQueryViewController.kt */
    public interface a {

        /* compiled from: CommonSearchQueryViewController.kt */
        /* renamed from: xsna.emg$a$a, reason: collision with other inner class name */
        public static final class C2821a implements a {
        }

        /* compiled from: CommonSearchQueryViewController.kt */
        public static final class b implements a {
            public static final b a = new b();
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(emg.class, "secondaryAction", "getSecondaryAction()Lcom/vk/search/ui/CommonSearchQueryViewController$SecondaryAction;", 0);
        fpf0.a.getClass();
        h = new qcy[]{mutablePropertyReference1Impl};
    }

    public emg(VkSearchView vkSearchView) {
        h94 a2 = w2o0.a.a(R.drawable.vk_icon_filter_24, R.string.talkback_ic_search_params);
        this.b = vkSearchView;
        this.c = a2;
        this.g = new gmg(this);
        vkSearchView.getEditView().addTextChangedListener(new fmg(this));
        vkSearchView.setOnActionClearListener(new dmg(0, this, emg.class, "onClearClick", "onClearClick()V", 0, 0));
        vkSearchView.setSecondaryActionListener(new dne(this, 3));
    }

    @Override // xsna.vrh0
    public final void P1(String str) {
        this.b.getEditView().setHint(str);
    }

    @Override // xsna.vrh0
    public final void a(vrh0.a aVar) {
        vrh0.a aVar2 = this.d;
        if (aVar == aVar2) {
            return;
        }
        if (aVar2 != null) {
            aVar2.f();
        }
        this.d = aVar;
    }

    @Override // xsna.vrh0
    public final boolean b() {
        if (!this.b.w.isFocused()) {
            return false;
        }
        int i = ify.a;
        return ify.e(ify.c);
    }

    @Override // xsna.vrh0
    public final void d(boolean z) {
        VkSearchView vkSearchView = this.b;
        if (z) {
            vkSearchView.g5(true);
        } else {
            vkSearchView.Y4(true);
        }
    }

    @Override // xsna.vrh0
    public final void d0() {
        VkSearchView vkSearchView = this.b;
        if (vkSearchView.w.isFocused()) {
            vkSearchView.d0();
        }
    }

    @Override // xsna.vrh0
    public final void e(boolean z) {
        this.e = Boolean.valueOf(z);
        h();
    }

    @Override // xsna.vrh0
    public final void f(boolean z) {
        this.f = Boolean.valueOf(z);
        h();
    }

    @Override // xsna.vrh0
    public final void g(SearchQuery searchQuery) {
        VkSearchView vkSearchView = this.b;
        String query = vkSearchView.getQuery();
        String str = searchQuery.b;
        if (epx.f(query, str)) {
            return;
        }
        vkSearchView.setQuery(str);
    }

    public final void h() {
        if (this.g.getValue(this, h[0]) instanceof a.C2821a) {
            throw null;
        }
        Boolean bool = this.e;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = this.f;
            if (bool2 != null) {
                boolean booleanValue2 = bool2.booleanValue();
                VkSearchView vkSearchView = this.b;
                if (booleanValue) {
                    vkSearchView.j5(this.c);
                }
                vkSearchView.h5(booleanValue, booleanValue2);
            }
        }
    }

    @Override // xsna.vrh0
    public final SearchQuery i() {
        return new SearchQuery(this.b.getQuery(), null, null, null, 14, null);
    }

    @Override // xsna.vrh0
    public final void k() {
        VkSearchView vkSearchView = this.b;
        if (vkSearchView.w.isFocused()) {
            vkSearchView.e5();
        }
        vkSearchView.a5();
    }
}
