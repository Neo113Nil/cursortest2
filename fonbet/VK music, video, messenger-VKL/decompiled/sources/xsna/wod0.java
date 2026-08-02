package xsna;

import com.vkontakte.android.R;

/* compiled from: FilterItems.kt */
/* loaded from: classes18.dex */
public final class wod0 extends tnd0 {
    public Boolean h;

    public wod0() {
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

    public wod0(Boolean bool) {
        super(tq.h(tlo0.Companion, R.string.market_filter_friends_reviews_title), null, bool);
        this.h = bool;
    }
}
