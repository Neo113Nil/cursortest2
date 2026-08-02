package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.reactions.api.chips.ReactionChipStyle;
import com.vkontakte.android.R;
import java.util.List;
import xsna.e3m;
import xsna.rxd0;
import xsna.v0f0;

/* compiled from: MsgPartReactionsHolder.kt */
/* loaded from: classes2.dex */
public final class ft30 extends hr30<Attach, gt30> implements rxd0.a {
    public final u0f0 d;
    public v0f0 e;
    public boolean f = true;
    public pk30 g;
    public gt30 h;

    public ft30(u0f0 u0f0Var) {
        this.d = u0f0Var;
    }

    @Override // xsna.rxd0.a
    public final void b(ProfilesSimpleInfo profilesSimpleInfo, f1e0 f1e0Var) {
        v0f0 v0f0Var = this.e;
        if (v0f0Var != null) {
            v0f0Var.setProfiles(profilesSimpleInfo);
        }
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        v0f0 v0f0Var = this.e;
        if (v0f0Var != null) {
            gt30 gt30Var = this.h;
            if (gt30Var == null || !gt30Var.j) {
                v0f0Var.setTimeBgColor(0);
                v0f0Var.setTimeTextColor(bubbleColors.h);
            } else {
                Context context = v0f0Var.getContext();
                e3m.a aVar = e3m.a;
                v0f0Var.setTimeBgColor(context.getColor(R.color.vk_black_alpha35));
                v0f0Var.setTimeTextColor(l8g.f(1.0f, -1));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.hr30
    public final void p(gt30 gt30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        ProfilesSimpleInfo profilesSimpleInfo;
        boolean z;
        v0f0 v0f0Var;
        boolean z2;
        gt30 gt30Var2 = gt30Var;
        jr30 jr30Var = gt30Var2.d;
        boolean z3 = gt30Var2.e;
        oh30 oh30Var = gt30Var2.b;
        this.g = pk30Var;
        this.h = gt30Var2;
        rxd0 rxd0Var = gt30Var2.l;
        if (rxd0Var != null) {
            rxd0Var.c(this);
        }
        if (rxd0Var == null || (profilesSimpleInfo = rxd0Var.a()) == null) {
            profilesSimpleInfo = new ProfilesSimpleInfo();
        }
        Msg msg = gt30Var2.c;
        if (msg instanceof aux0) {
            ReactionChipStyle reactionChipStyle = gt30Var2.m ? ReactionChipStyle.GRADIENT_BUBBLE : ((oh30Var == null || !oh30Var.f) && (oh30Var == null || !oh30Var.i)) ? z3 ? ReactionChipStyle.INCOMING : ReactionChipStyle.OUTGOING : ReactionChipStyle.WITHOUT_BUBBLE;
            v0f0 v0f0Var2 = this.e;
            if (v0f0Var2 != null) {
                v0f0Var2.a(gt30Var2.f, new pzj(4, this, msg), new eaa(21, this, msg));
                v0f0Var2.setProfiles(profilesSimpleInfo);
                z = false;
                aux0 aux0Var = (aux0) msg;
                List<Integer> list = gt30Var2.h;
                int i = gt30Var2.p;
                if (z3 || oh30Var == null || !(oh30Var.f || oh30Var.i)) {
                    v0f0Var = v0f0Var2;
                    z2 = false;
                } else {
                    v0f0Var = v0f0Var2;
                    z2 = true;
                }
                v0f0Var.setItems(new v0f0.a(aux0Var, msg, reactionChipStyle, i, list, z2, !this.f, gt30Var2.i, gt30Var2.g));
                v0f0Var.setIsIncognito(gt30Var2.n);
            } else {
                z = false;
            }
            v0f0 v0f0Var3 = this.e;
            hux0 hux0Var = v0f0Var3 instanceof hux0 ? (hux0) v0f0Var3 : null;
            if (hux0Var != null) {
                if (jr30Var.q) {
                    if (v0f0Var3 != 0) {
                        f4m.v(iah0.a(10), v0f0Var3);
                    }
                } else if (v0f0Var3 != 0) {
                    f4m.v(iah0.a(z ? 1.0f : 0.0f), v0f0Var3);
                }
                hr30.m(jr30Var, hux0Var);
            }
        } else {
            z = false;
        }
        this.f = z;
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        u0f0 u0f0Var = this.d;
        if (u0f0Var == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        w0f0 a = u0f0Var.a(viewGroup.getContext());
        this.e = a;
        return a;
    }

    @Override // xsna.hr30
    public final void r() {
        rxd0 rxd0Var;
        this.f = true;
        this.g = null;
        gt30 gt30Var = this.h;
        if (gt30Var != null && (rxd0Var = gt30Var.l) != null) {
            rxd0Var.b(this);
        }
        this.h = null;
    }
}
