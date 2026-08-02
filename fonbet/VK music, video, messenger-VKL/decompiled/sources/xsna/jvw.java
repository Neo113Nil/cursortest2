package xsna;

import com.vk.im.engine.models.InfoBar;

/* compiled from: DialogsListModels.kt */
/* loaded from: classes2.dex */
public final class jvw implements ogm {
    public final InfoBar b;

    public jvw(InfoBar infoBar) {
        this.b = infoBar;
    }

    @Override // xsna.ogm
    public final int Za() {
        return 15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jvw) && epx.f(this.b, ((jvw) obj).b);
    }

    @Override // xsna.hfz
    public final /* bridge */ /* synthetic */ Number getItemId() {
        return 2147483641;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "InfoBarItem(infoBar=" + this.b + ')';
    }
}
