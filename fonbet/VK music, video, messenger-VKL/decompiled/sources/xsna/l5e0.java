package xsna;

import com.vk.dialogslist.impl.list.adapter.DialogsListAdapter;
import xsna.i5e0;

/* compiled from: PromoLinkItem.kt */
/* loaded from: classes18.dex */
public final class l5e0 implements pgm {
    public final i5e0.a b;
    public final DialogsListAdapter.ViewType c = DialogsListAdapter.ViewType.PROMO_LINK;

    public l5e0(i5e0.a aVar) {
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l5e0) && epx.f(this.b, ((l5e0) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.hashCode());
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.pgm
    public final DialogsListAdapter.ViewType l() {
        return this.c;
    }

    public final String toString() {
        return "PromoLinkItem(banner=" + this.b + ')';
    }
}
