package xsna;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.chats.ChatPreview;
import com.vk.im.engine.models.users.User;
import com.vk.im.ui.components.common.NotifyId;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.im.ui.views.avatars.StackAvatarView;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.messages.chat_invite.accept.ChatInviteFragment;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: ChatInviteComponent.kt */
/* loaded from: classes2.dex */
public final class bsb extends j8i {
    public static final /* synthetic */ qcy<Object>[] p;
    public final Context i;
    public final a1w j;
    public final b25 k;
    public u230 l;
    public final g9e0 m;
    public final a n;
    public ChatInviteFragment.b o;

    /* compiled from: ChatInviteComponent.kt */
    public final class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action != null && action.hashCode() == 3866578 && action.equals("com.vkontakte.android.DONUT_SUBSCRIPTION_PAID")) {
                bsb bsbVar = bsb.this;
                if (bsbVar.l.b.h) {
                    bsb.X0(bsbVar);
                }
            }
        }
    }

    /* compiled from: ChatInviteComponent.kt */
    public final class b {
        public b() {
        }
    }

    /* compiled from: ChatInviteComponent.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NotifyId.values().length];
            try {
                iArr[NotifyId.CHAT_INVITE_INVALID_LINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotifyId.CHAT_DELETED_WITH_HISTORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(bsb.class, "vc", "getVc()Lcom/vk/im/ui/components/chat_invite/accept/vc/ChatInviteVC;", 0);
        fpf0.a.getClass();
        p = new qcy[]{propertyReference1Impl};
    }

    public bsb(Context context, a1w a1wVar, b25 b25Var, String str, ChatPreview chatPreview, boolean z) {
        this.i = context;
        this.j = a1wVar;
        this.k = b25Var;
        this.l = new u230(str, chatPreview == null ? new ChatPreview(null, null, 0, 0L, false, false, false, false, false, null, 0, null, null, null, 16383, null) : chatPreview, z);
        this.m = new g9e0(new na(this, 15));
        this.n = new a();
    }

    public static final void X0(bsb bsbVar) {
        u230 u230Var = bsbVar.l;
        long j = u230Var.b.e;
        if (j <= 0) {
            bsbVar.I0(new io.reactivex.rxjava3.internal.operators.single.n(bsbVar.j.E(bsbVar, new tzb(u230Var.a)), new n20(new com.vk.im.engine.internal.storage.delegates.messages.b(bsbVar, 24), 15)).subscribe(new tf(new ay0(bsbVar, 22), 11), new ji3(new g20(bsbVar, 20), 10)));
            return;
        }
        ChatInviteFragment.b bVar = bsbVar.o;
        if (bVar != null) {
            bVar.a(j);
        }
        ChatInviteFragment.b bVar2 = bsbVar.o;
        if (bVar2 != null) {
            bVar2.b();
        }
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        this.m.d();
        Y0().p = new b();
        isb Y0 = Y0();
        Y0.getClass();
        View inflate = layoutInflater.inflate(R.layout.vkim_chat_invite, viewGroup, false);
        Y0.d = inflate;
        Y0.e = inflate.findViewById(R.id.vkim_animated_view);
        View view = Y0.d;
        if (view == null) {
            view = null;
        }
        Y0.f = view.findViewById(R.id.vkim_content);
        View view2 = Y0.d;
        if (view2 == null) {
            view2 = null;
        }
        Y0.m = (StackAvatarView) view2.findViewById(R.id.vkim_avatars);
        View view3 = Y0.d;
        if (view3 == null) {
            view3 = null;
        }
        Y0.g = view3.findViewById(R.id.vkim_progress);
        View view4 = Y0.d;
        if (view4 == null) {
            view4 = null;
        }
        Y0.h = (TextView) view4.findViewById(R.id.vkim_chat_invite_title);
        View view5 = Y0.d;
        if (view5 == null) {
            view5 = null;
        }
        Y0.l = view5.findViewById(R.id.vkim_join_progress);
        View view6 = Y0.d;
        if (view6 == null) {
            view6 = null;
        }
        Y0.i = (TextView) view6.findViewById(R.id.vkim_hint);
        View view7 = Y0.d;
        if (view7 == null) {
            view7 = null;
        }
        Y0.j = (TextView) view7.findViewById(R.id.vkim_description_text);
        View view8 = Y0.d;
        if (view8 == null) {
            view8 = null;
        }
        Y0.n = view8.findViewById(R.id.vkim_chat_avatar_casper);
        View view9 = Y0.d;
        if (view9 == null) {
            view9 = null;
        }
        Y0.o = (ImageView) view9.findViewById(R.id.vkim_chat_avatar_donut);
        View view10 = Y0.d;
        if (view10 == null) {
            view10 = null;
        }
        TextView textView = (TextView) view10.findViewById(R.id.vkim_join_btn);
        Y0.k = textView;
        jjc.g(textView, new fb(Y0, 18));
        View view11 = Y0.d;
        if (view11 == null) {
            view11 = null;
        }
        view11.setOnClickListener(new tg(Y0, 1));
        View view12 = Y0.g;
        if (view12 == null) {
            view12 = null;
        }
        view12.setClickable(true);
        View view13 = Y0.f;
        if (view13 == null) {
            view13 = null;
        }
        view13.setClickable(true);
        TextView textView2 = Y0.h;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(o25.b(Y0.c) ? R.string.vkim_vk_invite_sferum : R.string.vkim_vk_invite);
        ImageView imageView = Y0.o;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageResource(R.drawable.vk_icon_donut_color_20);
        View view14 = Y0.d;
        if (view14 != null) {
            return view14;
        }
        return null;
    }

    @Override // xsna.j8i
    public final void N0() {
        View view = Y0().d;
        if (view == null) {
            view = null;
        }
        view.animate().cancel();
        Y0().p = null;
        this.m.a();
        enj.s(this.i, this.n);
    }

    @Override // xsna.j8i
    public final void O0(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        u230 u230Var = this.l;
        String string = bundle.getString("link");
        if (string == null) {
            string = this.l.a;
        }
        ChatPreview chatPreview = (ChatPreview) bundle.getParcelable("chat_preview");
        if (chatPreview == null) {
            chatPreview = this.l.b;
        }
        this.l = u230.a(u230Var, string, chatPreview, 4);
    }

    @Override // xsna.j8i
    public final void P0(Bundle bundle) {
        bundle.putString("link", this.l.a);
        bundle.putParcelable("chat_preview", this.l.b);
    }

    public final isb Y0() {
        qcy<Object> qcyVar = p[0];
        return (isb) this.m.b();
    }

    public final void Z0() {
        String string;
        String quantityString;
        isb Y0 = Y0();
        u230 u230Var = this.l;
        Y0.getClass();
        ChatPreview chatPreview = u230Var.b;
        Y0.b = u230Var;
        StackAvatarView stackAvatarView = Y0.m;
        if (stackAvatarView == null) {
            stackAvatarView = null;
        }
        List<Peer> list = chatPreview.m;
        ProfilesSimpleInfo profilesSimpleInfo = new ProfilesSimpleInfo(chatPreview.n, (Collection) null, (Collection) null, chatPreview.o, (Collection) null, 22, (zcl) null);
        stackAvatarView.getClass();
        stackAvatarView.e(list, list.size(), profilesSimpleInfo);
        StackAvatarView stackAvatarView2 = Y0.m;
        if (stackAvatarView2 == null) {
            stackAvatarView2 = null;
        }
        bwt0.p0(stackAvatarView2, !chatPreview.m.isEmpty());
        View view = Y0.f;
        if (view == null) {
            view = null;
        }
        view.setVisibility(0);
        View view2 = Y0.g;
        if (view2 == null) {
            view2 = null;
        }
        view2.setVisibility(4);
        Context context = Y0.a;
        u230 u230Var2 = Y0.b;
        ChatPreview chatPreview2 = u230Var2.b;
        boolean z = u230Var2.c;
        View view3 = Y0.f;
        if (view3 == null) {
            view3 = null;
        }
        ((AvatarView) view3.findViewById(R.id.vkim_avatar)).W0(chatPreview2);
        View view4 = Y0.f;
        if (view4 == null) {
            view4 = null;
        }
        TextView textView = (TextView) view4.findViewById(R.id.vkim_title);
        String str = chatPreview2.b;
        int i = chatPreview2.l;
        List<User> list2 = chatPreview2.n;
        boolean z2 = chatPreview2.f;
        textView.setText(str);
        if (z2) {
            TextView textView2 = Y0.i;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setText(R.string.vkim_channel_invite_title);
            StackAvatarView stackAvatarView3 = Y0.m;
            if (stackAvatarView3 == null) {
                stackAvatarView3 = null;
            }
            stackAvatarView3.setVisibility(8);
        } else {
            TextView textView3 = Y0.i;
            if (textView3 == null) {
                textView3 = null;
            }
            textView3.setText(R.string.vkim_chat_invite_title);
        }
        TextView textView4 = Y0.k;
        if (textView4 == null) {
            textView4 = null;
        }
        LinkButton linkButton = chatPreview2.k;
        if (linkButton != null) {
            string = linkButton.b;
        } else if (z2) {
            string = context.getString(z ? R.string.vkim_open_channel_by_link_btn : R.string.vkim_join_channel_by_link_btn);
        } else {
            string = context.getString(z ? R.string.vkim_open_by_link_btn : R.string.vkim_join_by_link_btn);
        }
        textView4.setText(string);
        int min = Math.min(3, list2.size());
        int i2 = i - min;
        View view5 = Y0.f;
        if (view5 == null) {
            view5 = null;
        }
        TextView textView5 = (TextView) view5.findViewById(R.id.vkim_subtitle);
        if (z2) {
            View view6 = Y0.f;
            if (view6 == null) {
                view6 = null;
            }
            quantityString = view6.getResources().getQuantityString(R.plurals.vkim_msg_header_channel_count, i, Integer.valueOf(i));
        } else {
            quantityString = min == 0 ? context.getResources().getQuantityString(R.plurals.vkim_msg_header_chat_count, i, Integer.valueOf(i)) : i2 > 0 ? context.getResources().getQuantityString(R.plurals.vkim_chat_invite_members_count, i2, rli0.r(rli0.y(new ulp0(new i5g(list2), new yy(10)), min), null, null, 63), Integer.valueOf(i2)) : rli0.r(rli0.y(new ulp0(new i5g(list2), new d37(5)), min), null, null, 63);
        }
        textView5.setText(quantityString);
        bwt0.p0(textView5, quantityString.length() > 0);
        View view7 = Y0.n;
        if (view7 == null) {
            view7 = null;
        }
        bwt0.p0(view7, Y0.b.b.g);
        ImageView imageView = Y0.o;
        if (imageView == null) {
            imageView = null;
        }
        bwt0.p0(imageView, Y0.b.b.h);
        ChatPreview chatPreview3 = Y0.b.b;
        if (!chatPreview3.h || chatPreview3.i) {
            TextView textView6 = Y0.j;
            bwt0.p0(textView6 != null ? textView6 : null, false);
            return;
        }
        TextView textView7 = Y0.j;
        if (textView7 == null) {
            textView7 = null;
        }
        textView7.setText(context.getString(R.string.vkim_invite_donut_chat_description));
        TextView textView8 = Y0.j;
        bwt0.p0(textView8 != null ? textView8 : null, true);
    }
}
