package xsna;

import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: FilterItems.kt */
/* loaded from: classes18.dex */
public final class xod0 extends tnd0 {
    public Boolean h;

    public xod0() {
        this(null);
    }

    @Override // xsna.tnd0, xsna.vcr
    public final Boolean b() {
        return Boolean.FALSE;
    }

    @Override // xsna.tnd0, xsna.vcr
    public final Boolean d() {
        return this.h;
    }

    @Override // xsna.tnd0, xsna.vcr
    public final void e(Boolean bool) {
        this.h = null;
    }

    @Override // xsna.tnd0
    /* renamed from: f */
    public final Boolean b() {
        return Boolean.FALSE;
    }

    @Override // xsna.tnd0
    /* renamed from: g */
    public final Boolean d() {
        return this.h;
    }

    @Override // xsna.tnd0
    public final void h(Boolean bool) {
        this.h = bool;
    }

    public xod0(Boolean bool) {
        super(tq.h(tlo0.Companion, R.string.market_filter_friends_wishlist_title), new tlo0.f(R.string.market_filter_friends_wishlist_subtitle), bool);
        this.h = bool;
    }
}
