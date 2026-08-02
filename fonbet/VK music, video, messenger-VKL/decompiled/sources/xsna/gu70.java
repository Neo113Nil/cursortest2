package xsna;

import com.vk.im.engine.models.SearchMode;

/* compiled from: MsgSearchAdapterModels.kt */
/* loaded from: classes2.dex */
public final class gu70 implements com.vk.im.ui.components.msg_search.vc.a {
    public final String b;
    public final SearchMode c;

    public gu70(String str, SearchMode searchMode) {
        this.b = str;
        this.c = searchMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu70)) {
            return false;
        }
        gu70 gu70Var = (gu70) obj;
        return epx.f(this.b, gu70Var.b) && this.c == gu70Var.c;
    }

    @Override // xsna.hfz
    public final /* bridge */ /* synthetic */ Number getItemId() {
        return -9223372036854775805L;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "OfflineItem(query=" + this.b + ", mode=" + this.c + ')';
    }
}
