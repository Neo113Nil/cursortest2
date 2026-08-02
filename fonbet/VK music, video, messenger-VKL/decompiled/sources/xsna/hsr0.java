package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vkontakte.android.R;
import xsna.yyb;

/* compiled from: VhMembersItem.kt */
/* loaded from: classes2.dex */
public final class hsr0 extends lqr0<yyb.f> {
    public final vlm x;
    public final gp80 y;
    public final StringBuffer z;

    public hsr0(jj0 jj0Var, ViewGroup viewGroup, int i) {
        super(jj0Var, viewGroup, i);
        this.x = new vlm(this.itemView.getContext());
        this.y = new gp80(this.itemView.getContext());
        this.z = new StringBuffer();
    }

    @Override // xsna.lqr0
    public final void j6(yyb.f fVar, TextView textView) {
        yyb.f fVar2 = fVar;
        DialogMember dialogMember = fVar2.b;
        if (!dialogMember.e) {
            String c = imj0.c(this.y, dialogMember.b, fVar2.f);
            textView.setVisibility(drm0.N(c) ? 4 : 0);
            textView.setText(c);
            return;
        }
        StringBuffer stringBuffer = this.z;
        stringBuffer.setLength(0);
        textView.setVisibility(0);
        this.x.a(dialogMember.d, stringBuffer);
        textView.setText(this.itemView.getContext().getString(R.string.vkim_chat_invite_time, stringBuffer));
    }
}
