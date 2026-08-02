package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.avatar.api.VKAvatarView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.dto.money.MoneyTransfer;
import com.vk.dto.user.UserProfile;
import com.vk.money.ui.avatar.MoneyAvatarView;
import com.vkontakte.android.R;
import com.vkontakte.android.data.FriendsUtils;
import xsna.e3m;

/* compiled from: MoneyInfoBottomSheetDialog.kt */
/* loaded from: classes3.dex */
public final class p730 extends smu0 {
    public static final /* synthetic */ int m1 = 0;
    public View j1;
    public MoneyTransfer k1;
    public final Drawable l1 = dhr0.w(R.drawable.group_placeholder, mo2getContext());

    @Override // xsna.smu0
    public final View Yn(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        MoneyTransfer moneyTransfer = this.k1;
        if ((moneyTransfer != null && moneyTransfer.u() && moneyTransfer.j == 0) || jo()) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.money_transfer_details_help, (ViewGroup) frameLayout, false);
        inflate.setOnClickListener(new z1q(this, 3));
        return inflate;
    }

    @Override // xsna.smu0
    public final View Zn(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        int i;
        String string;
        String str;
        this.j1 = layoutInflater.inflate(R.layout.money_transfer_details, (ViewGroup) frameLayout, false);
        Bundle arguments = getArguments();
        MoneyTransfer moneyTransfer = arguments != null ? (MoneyTransfer) arguments.getParcelable("arg_transfer_info") : null;
        this.k1 = moneyTransfer;
        if (moneyTransfer != null) {
            UserProfile f = moneyTransfer.f();
            if (f != null) {
                boolean u = moneyTransfer.u();
                boolean z = moneyTransfer.l;
                View view = this.j1;
                if (view == null) {
                    view = null;
                }
                MoneyAvatarView moneyAvatarView = (MoneyAvatarView) view.findViewById(R.id.photo);
                AvatarBorderType avatarBorderType = f.Y ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE;
                String str2 = f.h;
                moneyAvatarView.getClass();
                VKAvatarView.Z0(moneyAvatarView, str2, this.l1, avatarBorderType, null, 8);
                if (z) {
                    moneyAvatarView.setContentDescription(u ? getString(R.string.accessibility_money_transfer_avatar_content_description_transfer_from_anonymous, FriendsUtils.b(f, 1)) : getString(R.string.accessibility_money_transfer_avatar_content_description_transfer_to_anonymous, FriendsUtils.b(f, 2)));
                } else {
                    moneyAvatarView.setContentDescription(getString(R.string.accessibility_money_transfer_content_description_proceed_to_user_profile, FriendsUtils.b(f, 1)));
                }
                if (!com.vk.core.apps.a.b() || (str = f.L) == null) {
                    string = u ? getString(R.string.money_transfer_from, FriendsUtils.b(f, z ? 11 : 1)) : getString(R.string.money_transfer_to, FriendsUtils.b(f, z ? 12 : 2));
                } else {
                    string = u ? getString(R.string.money_transfer_from, str) : getString(R.string.money_transfer_to, str);
                }
                TextView textView = (TextView) view.findViewById(R.id.tv_mt_to);
                textView.setText(string);
                th4 th4Var = new th4(2, this, f);
                TextView textView2 = (TextView) view.findViewById(R.id.tv_mt_date);
                moneyAvatarView.setOnClickListener(th4Var);
                textView.setOnClickListener(th4Var);
                textView2.setOnClickListener(th4Var);
            }
            View view2 = this.j1;
            if (view2 == null) {
                view2 = null;
            }
            TextView textView3 = (TextView) view2.findViewById(R.id.tv_mt_sign);
            String str3 = moneyTransfer.u() ? "+" : "−";
            textView3.setText(str3);
            ((TextView) view2.findViewById(R.id.tv_mt_date)).setText(pvo0.i(false, moneyTransfer.k, false, false));
            ((TextView) view2.findViewById(R.id.tv_mt_sum)).setText(moneyTransfer.d());
            ((TextView) view2.findViewById(R.id.tv_mt_sum_symb)).setText(moneyTransfer.e());
            TextView textView4 = (TextView) view2.findViewById(R.id.tv_mt_comment);
            ucp ucpVar = ucp.a;
            CharSequence i2 = ucp.i(moneyTransfer.o);
            if (TextUtils.isEmpty(i2)) {
                textView4.setVisibility(8);
            } else {
                textView4.setText(i2);
            }
            TextView textView5 = (TextView) view2.findViewById(R.id.tv_mt_status);
            textView5.setVisibility(((moneyTransfer.u() && ((i = moneyTransfer.j) == 2 || i == 1)) || !moneyTransfer.u()) ? 0 : 8);
            Context context = textView5.getContext();
            int i3 = moneyTransfer.j;
            if (i3 == 0) {
                textView5.setTextColor(dhr0.t.c(R.attr.vk_ui_text_secondary));
                textView5.setText(getString(R.string.money_transfer_status_pending));
                e3m.a aVar = e3m.a;
                uko.c(textView5, m33.a(R.drawable.vk_icon_recent_16, context), e3m.c(R.attr.vk_ui_text_secondary, context));
            } else if (i3 == 1) {
                textView5.setTextColor(context.getColor(R.color.vk_green));
                textView5.setText(getString(R.string.money_transfer_status_completed));
                uko.b(textView5, R.drawable.vk_icon_done_16, R.color.vk_green);
            } else if (i3 == 2) {
                textView5.setTextColor(context.getColor(R.color.vk_red));
                textView5.setText(getString(R.string.money_transfer_status_cancelled));
                uko.b(textView5, R.drawable.vk_icon_cancel_16, R.color.vk_red);
            }
            ViewGroup viewGroup = (ViewGroup) view2.findViewById(R.id.ll_mt_sum);
            StringBuilder b = v1v.b(str3, ' ');
            b.append(moneyTransfer.d());
            b.append(' ');
            b.append(moneyTransfer.e());
            viewGroup.setContentDescription(b.toString());
        }
        this.f1 = new o730();
        if (jo()) {
            View view3 = this.j1;
            if (view3 == null) {
                view3 = null;
            }
            view3.setPadding(0, 0, 0, iah0.a(40.0f));
        }
        Configuration configuration = getResources().getConfiguration();
        int i4 = getResources().getDisplayMetrics().heightPixels;
        if (configuration.orientation == 2 || i4 < iah0.a(600.0f)) {
            io(true);
        }
        View view4 = this.j1;
        if (view4 == null) {
            return null;
        }
        return view4;
    }

    @Override // xsna.smu0
    public final String ao() {
        return getString(R.string.money_transfer_send_money);
    }

    @Override // xsna.smu0
    public final int bo(Context context) {
        MoneyTransfer moneyTransfer = this.k1;
        if (moneyTransfer != null && moneyTransfer.u() && moneyTransfer.j == 0) {
            e3m.a aVar = e3m.a;
            return context.getColor(R.color.vk_red);
        }
        e3m.a aVar2 = e3m.a;
        return context.getColor(R.color.vk_blue_400);
    }

    @Override // xsna.smu0
    public final String co() {
        int i;
        MoneyTransfer moneyTransfer = this.k1;
        return moneyTransfer != null ? (moneyTransfer.u() && moneyTransfer.j == 0) ? getString(R.string.money_transfer_decline) : (moneyTransfer.u() || !((i = moneyTransfer.j) == 1 || i == 2)) ? (moneyTransfer.u() || moneyTransfer.j != 0) ? getString(R.string.vkim_money_request_btn_history) : getString(R.string.money_transfer_cancel_transfer) : getString(R.string.money_transfer_repeat_transfer) : "";
    }

    @Override // xsna.smu0
    public final boolean eo() {
        MoneyTransfer moneyTransfer = this.k1;
        return moneyTransfer != null && moneyTransfer.u() && moneyTransfer.j == 0;
    }

    @Override // xsna.smu0
    public final boolean fo() {
        MoneyTransfer moneyTransfer = this.k1;
        return (moneyTransfer == null || !moneyTransfer.l) ? !jo() : moneyTransfer.j == 0;
    }

    public final void io(boolean z) {
        View view = this.j1;
        if (view == null) {
            view = null;
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.money_info_container);
        View view2 = this.j1;
        ViewGroup viewGroup2 = (ViewGroup) (view2 != null ? view2 : null).findViewById(R.id.ll_mt_sum);
        if (z) {
            f4m.v(iah0.a(2.0f), viewGroup);
            f4m.t(iah0.a(8.0f), viewGroup2);
        } else {
            f4m.v(iah0.a(24.0f), viewGroup);
            f4m.t(iah0.a(39.0f), viewGroup2);
        }
    }

    public final boolean jo() {
        Bundle arguments = getArguments();
        return (arguments != null ? arguments.getBoolean("arg_hide_history") : false) && co().equals(getString(R.string.vkim_money_request_btn_history));
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        io(configuration.orientation == 2 || getResources().getDisplayMetrics().heightPixels < iah0.a(600.0f));
    }
}
