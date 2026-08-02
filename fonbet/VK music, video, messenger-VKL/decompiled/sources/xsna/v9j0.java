package xsna;

import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;

/* compiled from: DialogsListModels.kt */
/* loaded from: classes2.dex */
public final class v9j0 implements ogm {
    public final String b;
    public final String c;
    public final Dialog d;
    public final ProfilesSimpleInfo e;

    public v9j0(String str, String str2, Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo) {
        this.b = str;
        this.c = str2;
        this.d = dialog;
        this.e = profilesSimpleInfo;
    }

    @Override // xsna.ogm
    public final int Za() {
        return 22;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9j0)) {
            return false;
        }
        v9j0 v9j0Var = (v9j0) obj;
        return this.b.equals(v9j0Var.b) && this.c.equals(v9j0Var.c) && epx.f(this.d, v9j0Var.d) && this.e.equals(v9j0Var.e);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return this.d.Sb();
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        return "SharedChatItem(title=" + ((Object) this.b) + ", subtitle=" + this.c + ", dialog=" + this.d + ", profiles=" + this.e + ')';
    }
}
