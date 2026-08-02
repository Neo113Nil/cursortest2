package xsna;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.components.msg_search.vc.d;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vkontakte.android.R;
import kotlin.collections.EmptyList;

/* compiled from: VhHints.kt */
/* loaded from: classes2.dex */
public final class prr0 extends RecyclerView.Adapter<c7v> {
    public final LayoutInflater c;
    public final int d;
    public final mkr0 e;
    public w6v f = new w6v(EmptyList.b, jgp.b, new ProfilesSimpleInfo());

    public prr0(LayoutInflater layoutInflater, int i, mkr0 mkr0Var) {
        this.c = layoutInflater;
        this.d = i;
        this.e = mkr0Var;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f.b.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        T t = this.f.b.get(i).a;
        if (t instanceof Dialog) {
            return ((Dialog) t).Sb().longValue();
        }
        if (t instanceof d.b) {
            return C.TIME_UNSET;
        }
        throw new IllegalArgumentException("Not applicable type");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(c7v c7vVar, int i) {
        String str;
        c7v c7vVar2 = c7vVar;
        TextView textView = c7vVar2.n;
        ImAvatarView imAvatarView = c7vVar2.m;
        T t = this.f.b.get(i).a;
        if (!(t instanceof Dialog)) {
            if (!(t instanceof d.b)) {
                throw new IllegalArgumentException("Not applicable type");
            }
            imAvatarView.u1();
            textView.setText(R.string.vkim_peers_search_contacts);
            VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
            VerifyInfoHelper.k(c7vVar2.o, true, null, false, false, 56);
            jjc.g(c7vVar2.itemView, new lwh(c7vVar2, 19));
            c7vVar2.itemView.setAlpha(1.0f);
            return;
        }
        gyh0<?> gyh0Var = this.f.b.get(i);
        Boolean bool = (Boolean) this.f.c.get(((Dialog) t).Sb());
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        ProfilesSimpleInfo profilesSimpleInfo = this.f.d;
        Dialog dialog = (Dialog) gyh0Var.a;
        imAvatarView.r1(dialog, profilesSimpleInfo);
        DisplayNameFormatter displayNameFormatter = c7vVar2.p;
        qcy<Object>[] qcyVarArr = DisplayNameFormatter.d;
        StringBuilder j = displayNameFormatter.j();
        String str2 = displayNameFormatter.a;
        if (j == displayNameFormatter.j()) {
            displayNameFormatter.j().setLength(0);
        }
        if (dialog == null) {
            j.append(str2);
        } else if (dialog.Jc()) {
            j.append(displayNameFormatter.b.getString(R.string.vkim_dialog_with_self_title));
        } else if (dialog.uc()) {
            ChatSettings Hb = dialog.Hb();
            if (Hb != null && (str = Hb.b) != null) {
                str2 = str;
            }
            j.append(str2);
        } else {
            qtd0 zb = profilesSimpleInfo.zb(dialog.Zb());
            UserNameCase userNameCase = UserNameCase.NOM;
            if (zb == null) {
                j.append(str2);
            } else {
                j.append(zb.d6(userNameCase));
            }
        }
        textView.setText(j);
        qtd0 Ab = profilesSimpleInfo.Ab(dialog.Sb());
        VerifyInfoHelper verifyInfoHelper2 = VerifyInfoHelper.a;
        VerifyInfoHelper.k(c7vVar2.o, true, Ab != null ? Ab.q9() : null, false, false, 56);
        jjc.g(c7vVar2.itemView, new b7v(gyh0Var, c7vVar2, dialog, profilesSimpleInfo, 0));
        if (booleanValue) {
            c7vVar2.itemView.setAlpha(1.0f);
        } else {
            c7vVar2.itemView.setAlpha(0.4f);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final c7v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new c7v(this.c.inflate(R.layout.vkim_search_hint_dialog, viewGroup, false), this.e);
    }
}
