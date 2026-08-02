package xsna;

import android.view.ViewGroup;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vkontakte.android.R;
import xsna.yyb;

/* compiled from: VhMembersItemV2.kt */
/* loaded from: classes2.dex */
public final class isr0 extends mqr0<yyb.f> {
    public final vlm r;
    public final gp80 s;
    public final StringBuffer t;

    public isr0(jj0 jj0Var, ViewGroup viewGroup, int i) {
        super(jj0Var, viewGroup, i);
        this.r = new vlm(this.itemView.getContext());
        this.s = new gp80(this.itemView.getContext());
        this.t = new StringBuffer();
    }

    @Override // xsna.mqr0
    public final String j6(yyb.f fVar) {
        yyb.f fVar2 = fVar;
        DialogMember dialogMember = fVar2.b;
        if (dialogMember.e) {
            StringBuffer stringBuffer = this.t;
            stringBuffer.setLength(0);
            this.r.a(dialogMember.d, stringBuffer);
            return this.itemView.getContext().getString(R.string.vkim_chat_invite_time, stringBuffer);
        }
        ProfilesInfo profilesInfo = fVar2.f;
        String c = imj0.c(this.s, dialogMember.b, profilesInfo);
        if (drm0.N(c)) {
            return null;
        }
        return c;
    }
}
