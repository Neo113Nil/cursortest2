package xsna;

import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.BottomConfirmButton;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.users.User;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dqx;
import xsna.dw20;

/* compiled from: ChatInvitationBroadcastBottomSheet.kt */
/* loaded from: classes2.dex */
public final class asb extends dw20 {
    public static final /* synthetic */ int k1 = 0;
    public BottomConfirmButton f1;
    public BottomConfirmButton g1;
    public TextView h1;
    public bqx i1;
    public final bpn0 j1 = new bpn0(new vf0(this, 16));

    /* compiled from: ChatInvitationBroadcastBottomSheet.kt */
    public static final class a extends dw20.b {
        public String e;

        public a(Context context) {
            super(context, null);
            v0(R.string.vkm_chat_invitation_broadcast_title);
            j0(context.getString(R.string.vkm_chat_invitation_broadcast_button_share), new zq3(5));
        }

        public final void S0(String str) {
            this.e = str;
        }

        public final void T0(ProfilesInfo profilesInfo) {
            String f;
            LinkedHashMap n = pn00.n(profilesInfo.c.c, profilesInfo.b.c);
            int size = n.size();
            if (size == 1) {
                qtd0 qtd0Var = (qtd0) j5g.X(n.values());
                f = this.c.getString(qtd0Var.B2() == UserSex.FEMALE ? R.string.vkm_chat_invitation_broadcast_subtitle_female : R.string.vkm_chat_invitation_broadcast_subtitle_male, qtd0Var.ha());
            } else {
                f = enj.f(R.plurals.vkm_chat_invitation_broadcast_subtitle_plurals, size, this.c);
            }
            StringBuilder b = v1v.b(f, ' ');
            b.append(this.c.getString(R.string.vkm_chat_invitation_broadcast_text));
            s0(b.toString());
            this.d.g0 = Integer.valueOf(cn70.b(16));
            Collection values = n.values();
            ArrayList arrayList = new ArrayList(c5g.u(values, 10));
            for (Object obj : values) {
                arrayList.add(obj instanceof Contact ? new dqx.a((Contact) obj) : new dqx.b((User) obj));
            }
            LayoutInflater b2 = e3m.b(this.c);
            bqx bqxVar = new bqx(true);
            bqxVar.x0(dqx.b.class, new ya(21, b2, bqxVar));
            bqxVar.x0(dqx.a.class, new by5(17, b2, bqxVar));
            bqxVar.setItems(arrayList);
            i(bqxVar, (r3 & 2) == 0, false);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            asb asbVar = new asb();
            Bundle bundle = new Bundle();
            String str = this.e;
            if (str == null) {
                str = "";
            }
            bundle.putString("invitationLink", str);
            asbVar.setArguments(bundle);
            return asbVar;
        }
    }

    /* compiled from: ChatInvitationBroadcastBottomSheet.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            asb asbVar = (asb) this.receiver;
            int i = asb.k1;
            asbVar.Yn();
            return s3q0.a;
        }
    }

    public final void Yn() {
        int i;
        bqx bqxVar = this.i1;
        if (bqxVar == null) {
            bqxVar = null;
        }
        List<? extends hfz> list = bqxVar.d;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((dqx) ((hfz) it.next())).c && (i = i + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        }
        if (i <= 0) {
            BottomConfirmButton bottomConfirmButton = this.f1;
            if (bottomConfirmButton == null) {
                bottomConfirmButton = null;
            }
            f4m.j(bottomConfirmButton);
            BottomConfirmButton bottomConfirmButton2 = this.g1;
            if (bottomConfirmButton2 == null) {
                bottomConfirmButton2 = null;
            }
            bottomConfirmButton2.setVisibility(0);
            TextView textView = this.h1;
            f4m.j(textView != null ? textView : null);
            return;
        }
        BottomConfirmButton bottomConfirmButton3 = this.f1;
        if (bottomConfirmButton3 == null) {
            bottomConfirmButton3 = null;
        }
        bottomConfirmButton3.setCounter(i);
        BottomConfirmButton bottomConfirmButton4 = this.f1;
        if (bottomConfirmButton4 == null) {
            bottomConfirmButton4 = null;
        }
        bottomConfirmButton4.setVisibility(0);
        TextView textView2 = this.h1;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setVisibility(0);
        BottomConfirmButton bottomConfirmButton5 = this.g1;
        f4m.j(bottomConfirmButton5 != null ? bottomConfirmButton5 : null);
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        bqx bqxVar = (bqx) ((RecyclerView) Ln().findViewById(R.id.recycler)).getAdapter();
        this.i1 = bqxVar;
        if (bqxVar == null) {
            bqxVar = null;
        }
        bqxVar.h = new b(0, this, asb.class, "updateButtons", "updateButtons()V", 0);
        LinearLayout linearLayout = (LinearLayout) Gn();
        linearLayout.removeAllViews();
        bwt0.e0(linearLayout, 0, 0, 0, 0);
        bwt0.I(R.layout.vkim_chat_invitation_broadcast_buttons, linearLayout, true);
        this.f1 = (BottomConfirmButton) linearLayout.findViewById(R.id.vkm_chat_invitation_broadcast_send_btn);
        this.g1 = (BottomConfirmButton) linearLayout.findViewById(R.id.vkm_chat_invitation_broadcast_share_btn);
        this.h1 = (TextView) linearLayout.findViewById(R.id.vkm_chat_invitation_broadcast_share_small_btn);
        BottomConfirmButton bottomConfirmButton = this.f1;
        if (bottomConfirmButton == null) {
            bottomConfirmButton = null;
        }
        bottomConfirmButton.setBackgroundColor(0);
        BottomConfirmButton bottomConfirmButton2 = this.g1;
        if (bottomConfirmButton2 == null) {
            bottomConfirmButton2 = null;
        }
        int b2 = cn70.b(24);
        int f = e3m.f(R.attr.vk_ui_text_contrast_themed, requireContext());
        Drawable mutate = m33.a(R.drawable.vk_icon_share_outline_24, bottomConfirmButton2.getContext()).mutate();
        mutate.setBounds(0, 0, b2, b2);
        sjo.b(mutate, f, PorterDuff.Mode.SRC_IN);
        bottomConfirmButton2.c.setCompoundDrawablesRelative(mutate, null, null, null);
        BottomConfirmButton bottomConfirmButton3 = this.g1;
        if (bottomConfirmButton3 == null) {
            bottomConfirmButton3 = null;
        }
        bottomConfirmButton3.setBackgroundColor(0);
        BottomConfirmButton bottomConfirmButton4 = this.g1;
        if (bottomConfirmButton4 == null) {
            bottomConfirmButton4 = null;
        }
        bottomConfirmButton4.a(true);
        BottomConfirmButton bottomConfirmButton5 = this.f1;
        if (bottomConfirmButton5 == null) {
            bottomConfirmButton5 = null;
        }
        bottomConfirmButton5.a(true);
        Drawable mutate2 = m33.a(R.drawable.vk_icon_share_outline_24, linearLayout.getContext()).mutate();
        mutate2.setBounds(0, 0, cn70.b(24), cn70.b(24));
        sjo.b(mutate2, e3m.f(R.attr.vk_ui_text_accent_themed, linearLayout.getContext()), PorterDuff.Mode.SRC_IN);
        TextView textView = this.h1;
        if (textView == null) {
            textView = null;
        }
        textView.setCompoundDrawablesRelative(mutate2, null, null, null);
        BottomConfirmButton bottomConfirmButton6 = this.f1;
        if (bottomConfirmButton6 == null) {
            bottomConfirmButton6 = null;
        }
        jjc.g(bottomConfirmButton6, new i50(this, 10));
        BottomConfirmButton bottomConfirmButton7 = this.g1;
        if (bottomConfirmButton7 == null) {
            bottomConfirmButton7 = null;
        }
        jjc.g(bottomConfirmButton7, new yx0(this, 23));
        TextView textView2 = this.h1;
        jjc.g(textView2 != null ? textView2 : null, new d7(this, 20));
        Yn();
        return yn;
    }
}
