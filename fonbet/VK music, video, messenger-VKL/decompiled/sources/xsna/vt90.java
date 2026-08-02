package xsna;

import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;

/* compiled from: MsgSearchAdapterModels.kt */
/* loaded from: classes2.dex */
public final class vt90 implements com.vk.im.ui.components.msg_search.vc.a {
    public final gyh0<Dialog> b;
    public final ProfilesSimpleInfo c;
    public final boolean d;
    public final String e;
    public final boolean f;

    public vt90(gyh0<Dialog> gyh0Var, ProfilesSimpleInfo profilesSimpleInfo, boolean z, String str, boolean z2) {
        this.b = gyh0Var;
        this.c = profilesSimpleInfo;
        this.d = z;
        this.e = str;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt90)) {
            return false;
        }
        vt90 vt90Var = (vt90) obj;
        return epx.f(this.b, vt90Var.b) && epx.f(this.c, vt90Var.c) && this.d == vt90Var.d && this.e.equals(vt90Var.e) && this.f == vt90Var.f;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return this.b.a.Sb();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + urd0.a(qoy.b(io.reactivex.rxjava3.subjects.c.a(this.c, this.b.hashCode() * 31, 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PeerItem(searchResultItem=");
        sb.append(this.b);
        sb.append(", profiles=");
        sb.append(this.c);
        sb.append(", recent=");
        sb.append(this.d);
        sb.append(", name=");
        sb.append(this.e);
        sb.append(", isActive=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
