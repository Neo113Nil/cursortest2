package xsna;

import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: MsgSearchAdapterModels.kt */
/* loaded from: classes2.dex */
public final class gk30 implements com.vk.im.ui.components.msg_search.vc.a {
    public final Dialog b;
    public final ProfilesSimpleInfo c;
    public final Msg d;
    public final CharSequence e;
    public final com.vk.im.engine.models.messages.a f;
    public final boolean g;
    public final boolean h;

    public gk30(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo, Msg msg, CharSequence charSequence, com.vk.im.engine.models.messages.a aVar, boolean z, boolean z2) {
        this.b = dialog;
        this.c = profilesSimpleInfo;
        this.d = msg;
        this.e = charSequence;
        this.f = aVar;
        this.g = z;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk30)) {
            return false;
        }
        gk30 gk30Var = (gk30) obj;
        return epx.f(this.b, gk30Var.b) && epx.f(this.c, gk30Var.c) && epx.f(this.d, gk30Var.d) && epx.f(this.e, gk30Var.e) && epx.f(this.f, gk30Var.f) && this.g == gk30Var.g && this.h == gk30Var.h;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.d.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + qoy.b((this.f.hashCode() + u11.c(pn.a(this.d, io.reactivex.rxjava3.subjects.c.a(this.c, this.b.hashCode() * 31, 31), 31), 31, this.e)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgItem(dialog=");
        sb.append(this.b);
        sb.append(", profiles=");
        sb.append(this.c);
        sb.append(", msg=");
        sb.append(this.d);
        sb.append(", body=");
        sb.append((Object) this.e);
        sb.append(", nestedMsg=");
        sb.append(this.f);
        sb.append(", useSenderInfo=");
        sb.append(this.g);
        sb.append(", useAttachTranscriptFormat=");
        return defpackage.q0.a(sb, this.h, ')');
    }
}
