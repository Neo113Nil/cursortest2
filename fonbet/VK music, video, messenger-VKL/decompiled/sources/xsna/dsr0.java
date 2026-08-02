package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.yyb;

/* compiled from: VhMembersCount.kt */
/* loaded from: classes2.dex */
public final class dsr0 extends kqr0<yyb.g> {
    public final TextView l;

    public dsr0(jj0 jj0Var, ViewGroup viewGroup) {
        super(R.layout.vkim_chat_settings_members_count, viewGroup);
        this.l = (TextView) this.itemView.findViewById(R.id.count);
    }

    @Override // xsna.kqr0, xsna.vfz
    public final void W5(hfz hfzVar) {
        yyb.g gVar = (yyb.g) hfzVar;
        this.l.setText(enj.f(gVar.d ? R.plurals.vkim_chat_settings_invites_count : R.plurals.vkim_chat_settings_members_count, gVar.c, this.itemView.getContext()));
    }

    @Override // xsna.kqr0
    /* renamed from: h6 */
    public final void W5(yyb.g gVar) {
        yyb.g gVar2 = gVar;
        this.l.setText(enj.f(gVar2.d ? R.plurals.vkim_chat_settings_invites_count : R.plurals.vkim_chat_settings_members_count, gVar2.c, this.itemView.getContext()));
    }
}
