package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.TintTextView;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.attaches.AttachGroupCall;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.MsgPartGroupCallHolderItem;
import com.vk.im.ui.views.avatars.StackAvatarView;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.e3m;
import xsna.rxd0;

/* compiled from: MsgPartGroupCallHolder.kt */
/* loaded from: classes2.dex */
public final class er30 extends hr30<AttachGroupCall, MsgPartGroupCallHolderItem> implements rxd0.a {
    public static final /* synthetic */ int o = 0;
    public final View d;
    public final TextView e;
    public final TextView f;
    public final StackAvatarView g;
    public final TintTextView h;
    public final TimeAndStatusView i;
    public pk30 j;
    public MsgPartGroupCallHolderItem k;
    public final Context l;
    public final ha9 m;
    public final Drawable n;

    /* compiled from: MsgPartGroupCallHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MsgPartGroupCallHolderItem.AttachGroupCallInProgressType.values().length];
            try {
                iArr[MsgPartGroupCallHolderItem.AttachGroupCallInProgressType.AttachGroupCallInProgress.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MsgPartGroupCallHolderItem.AttachGroupCallInProgressType.AttachGroupCallFinished.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public er30(View view) {
        this.d = view;
        this.e = (TextView) view.findViewById(R.id.title_view);
        this.f = (TextView) view.findViewById(R.id.status_view);
        this.g = (StackAvatarView) view.findViewById(R.id.stack_avatar_view);
        this.h = (TintTextView) view.findViewById(R.id.join_btn);
        this.i = (TimeAndStatusView) view.findViewById(R.id.timeAndStatus);
        Context context = view.getContext();
        this.l = context;
        this.m = new ha9(context);
        e3m.a aVar = e3m.a;
        this.n = m33.a(R.drawable.user_placeholder_icon, context);
    }

    @Override // xsna.rxd0.a
    public final void b(ProfilesSimpleInfo profilesSimpleInfo, f1e0 f1e0Var) {
        List<Long> list;
        MsgPartGroupCallHolderItem msgPartGroupCallHolderItem = this.k;
        if (msgPartGroupCallHolderItem == null || (list = msgPartGroupCallHolderItem.h) == null) {
            list = EmptyList.b;
        }
        s(list, profilesSimpleInfo);
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        this.e.setTextColor(bubbleColors.d);
        this.f.setTextColor(bubbleColors.i);
        this.i.setTimeTextColor(bubbleColors.h);
        int i = bubbleColors.r;
        TintTextView tintTextView = this.h;
        tintTextView.setTextColor(i);
        tintTextView.setBackgroundTint(i);
        tintTextView.setDrawableTint(i);
    }

    @Override // xsna.hr30
    public final void p(MsgPartGroupCallHolderItem msgPartGroupCallHolderItem, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        ProfilesSimpleInfo profilesSimpleInfo;
        MsgPartGroupCallHolderItem msgPartGroupCallHolderItem2 = msgPartGroupCallHolderItem;
        this.j = pk30Var;
        this.k = msgPartGroupCallHolderItem2;
        rxd0 rxd0Var = msgPartGroupCallHolderItem2.d;
        if (rxd0Var != null) {
            rxd0Var.c(this);
        }
        if (rxd0Var == null || (profilesSimpleInfo = rxd0Var.a()) == null) {
            profilesSimpleInfo = new ProfilesSimpleInfo();
        }
        this.e.setText(R.string.vkim_msg_list_group_call_title);
        int i = a.$EnumSwitchMapping$0[msgPartGroupCallHolderItem2.m.ordinal()];
        boolean z = true;
        TextView textView = this.f;
        if (i == 1) {
            int i2 = msgPartGroupCallHolderItem2.l;
            Context context = this.l;
            if (i2 > 30) {
                textView.setText(context.getString(R.string.vkim_msg_list_group_call_large_participans_number_subtitle, 30));
            } else {
                textView.setText(enj.f(R.plurals.vkim_msg_list_group_call_subtitle, i2, context));
            }
        } else if (i == 2) {
            textView.setText("· " + ((Object) this.m.a(msgPartGroupCallHolderItem2.i, msgPartGroupCallHolderItem2.j, msgPartGroupCallHolderItem2.k, false)));
        }
        s(msgPartGroupCallHolderItem2.h, profilesSimpleInfo);
        String str = msgPartGroupCallHolderItem2.f;
        TintTextView tintTextView = this.h;
        if (str != null) {
            jjc.g(tintTextView, new o15(this, str, msgPartGroupCallHolderItem2, 5));
        } else {
            z = false;
        }
        bwt0.p0(tintTextView, z);
        hr30.l(this.i, msgPartGroupCallHolderItem2.b, false);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        b810 b810Var = new b810(this, 4);
        View view = this.d;
        jjc.g(view, b810Var);
        return view;
    }

    @Override // xsna.hr30
    public final void r() {
        rxd0 rxd0Var;
        this.j = null;
        MsgPartGroupCallHolderItem msgPartGroupCallHolderItem = this.k;
        if (msgPartGroupCallHolderItem != null && (rxd0Var = msgPartGroupCallHolderItem.d) != null) {
            rxd0Var.b(this);
        }
        this.k = null;
    }

    public final void s(List<Long> list, ProfilesSimpleInfo profilesSimpleInfo) {
        List A = rli0.A(rli0.y(new ulp0(new i5g(list), new fm0(profilesSimpleInfo, 10)), 3));
        StackAvatarView stackAvatarView = this.g;
        stackAvatarView.getClass();
        stackAvatarView.d(new ulp0(new i5g(A), new h2w(28)), 3, this.n);
    }
}
