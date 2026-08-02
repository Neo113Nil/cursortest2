package xsna;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.ui.views.avatars.StackAvatarView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: NewUsersVh.kt */
/* loaded from: classes2.dex */
public final class g960 extends vfz<f960> {
    public final e960 l;
    public final StackAvatarView m;
    public final TextView n;
    public final TextView o;
    public final View p;
    public f960 q;

    public g960(View view, e960 e960Var) {
        super(view);
        this.l = e960Var;
        this.m = (StackAvatarView) this.itemView.findViewById(R.id.vkim_avatars);
        this.n = (TextView) this.itemView.findViewById(R.id.vkim_new_users_label);
        TextView textView = (TextView) this.itemView.findViewById(R.id.vkim_content);
        this.o = textView;
        View findViewById = this.itemView.findViewById(R.id.vkim_close_btn);
        this.p = findViewById;
        bwt0.i0(textView, new o010(this, 13));
        bwt0.i0(findViewById, new cww(this, 18));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(f960 f960Var) {
        f960 f960Var2 = f960Var;
        this.q = f960Var2;
        Context context = this.itemView.getContext();
        List<qtd0> list = f960Var2.b;
        this.n.setText(enj.f(R.plurals.vkim_contacts_label, list.size(), context));
        this.o.setText(enj.f(R.plurals.vkim_contacts_show_new_users, list.size(), this.itemView.getContext()));
        List<qtd0> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (qtd0 qtd0Var : list2) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList.add(Peer.a.b(qtd0Var.G3()));
        }
        ProfilesSimpleInfo profilesSimpleInfo = new ProfilesSimpleInfo(list);
        StackAvatarView stackAvatarView = this.m;
        stackAvatarView.getClass();
        stackAvatarView.e(arrayList, arrayList.size(), profilesSimpleInfo);
    }
}
