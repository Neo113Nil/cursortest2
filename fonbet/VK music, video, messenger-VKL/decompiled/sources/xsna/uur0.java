package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vkontakte.android.R;

/* compiled from: VhPhonebookContact.kt */
/* loaded from: classes2.dex */
public final class uur0 extends vfz<u8j> {
    public static final /* synthetic */ int r = 0;
    public final mkr0 l;
    public final AvatarView m;
    public final TextView n;
    public final TextView o;
    public final g3a0 p;
    public final DisplayNameFormatter q;

    public uur0(View view, mkr0 mkr0Var) {
        super(view);
        this.l = mkr0Var;
        this.m = (AvatarView) view.findViewById(R.id.avatar);
        this.n = (TextView) view.findViewById(R.id.text);
        this.o = (TextView) view.findViewById(R.id.subtitle);
        this.p = new g3a0();
        this.q = new DisplayNameFormatter(null, 3, null);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void h6(u8j u8jVar) {
        u8j u8jVar2 = u8jVar;
        qtd0 qtd0Var = (qtd0) u8jVar2.b.a;
        bwt0.i0(this.itemView, new zu1(u8jVar2, this, qtd0Var, 5));
        this.m.Y0(qtd0Var);
        DisplayNameFormatter displayNameFormatter = this.q;
        displayNameFormatter.getClass();
        this.n.setText(displayNameFormatter.e(qtd0Var, UserNameCase.NOM));
        this.o.setText(this.p.a(qtd0Var.c5()));
    }
}
