package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.View;
import com.ironsource.X3;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.notifications.NotificationAction;
import com.vk.dto.notifications.NotificationItem;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.qrcode.d;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.superapp.base.js.bridge.data.PersonalDiscountDialogType;
import com.vk.superapp.browser.ui.model.PersonalDiscountTransitionFrom;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Pair;
import xsna.e3m;
import xsna.e860;
import xsna.e8v0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class it8 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ it8(Activity activity, com.vk.qrcode.c cVar, d.b bVar, cme0 cme0Var) {
        this.b = 4;
        this.c = activity;
        this.d = cVar;
        this.e = bVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                kt8 kt8Var = (kt8) obj4;
                d790 d790Var = (d790) obj3;
                Collection collection = (Collection) obj2;
                View view = (View) obj;
                ucl0 ucl0Var = kt8Var.m;
                if (ucl0Var != null) {
                    ucl0Var.a(d790Var.a.b, MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SEND_GIFT_OUT);
                }
                is8 is8Var = kt8Var.i;
                if (is8Var != null) {
                    is8Var.c();
                }
                zal0 a = g2v.d().a();
                Context context = view.getContext();
                ArrayList f = d790Var.f();
                String str = d790Var.a.O;
                if (epx.f(str, X3.i.U) || str == null) {
                    str = "stickers_store";
                }
                a.w(context, f, collection, str);
                break;
            case 1:
                NewsComment newsComment = (NewsComment) obj4;
                aa aaVar = (aa) obj2;
                newsComment.p = ((t9x0) obj).a;
                ((mdg) obj3).M.remove(Integer.valueOf(newsComment.i));
                ib6 ib6Var = aaVar instanceof ib6 ? (ib6) aaVar : null;
                if (ib6Var != null) {
                    ib6Var.E6(newsComment);
                }
                break;
            case 2:
                ((etv0) obj).b(false);
                ((View) obj4).callOnClick();
                ((fwm) obj3).a.a((VkOnboardingCampaign) obj2, VkOnboardingType.Tooltip, e8v0.f.b);
                break;
            case 3:
                bj70 bj70Var = (bj70) obj4;
                NotificationAction notificationAction = (NotificationAction) obj3;
                NotificationItem notificationItem = (NotificationItem) obj2;
                if (bj70Var != null) {
                    bj70Var.C(notificationAction.d, notificationItem);
                }
                break;
            case 4:
                Activity activity = (Activity) obj4;
                com.vk.qrcode.c cVar = (com.vk.qrcode.c) obj3;
                d.b bVar = (d.b) obj2;
                Post post = (Post) obj;
                if (post != null) {
                    Owner owner = post.o;
                    nh3 nh3Var = new nh3(25, activity, post);
                    cg1 cg1Var = new cg1(21, activity, post);
                    Pair pair = new Pair(activity.getString(R.string.favorites_add), new xy0(18, post, cVar));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) owner.c);
                    if (!drm0.N(post.s)) {
                        SpannableString spannableString = new SpannableString("\n\n");
                        spannableString.setSpan(new AbsoluteSizeSpan(8, true), 0, spannableString.length(), 0);
                        spannableStringBuilder.append((CharSequence) spannableString);
                        spannableStringBuilder.append(xwk.d().a().m(post.s));
                    }
                    String string = activity.getString(R.string.qr_action_go_to_faves);
                    l5x l5xVar = new l5x(activity, 1);
                    d.a aVar = new d.a(string, l5xVar, false);
                    com.vk.qrcode.d dVar = com.vk.qrcode.d.b;
                    String f2 = owner.f(com.vk.qrcode.d.c);
                    e3m.a aVar2 = e3m.a;
                    Drawable a2 = m33.a(R.drawable.vk_icon_edit_circle_fill_blue_20, activity);
                    String h = com.vk.qrcode.d.h(activity, cVar);
                    SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
                    Pair pair2 = pair;
                    SpannableString spannableString2 = new SpannableString(spannableStringBuilder);
                    Pair pair3 = new Pair(activity.getString(R.string.qr_action_open_wall_post), cg1Var);
                    if (post.X()) {
                        pair2 = new Pair(string, l5xVar);
                    }
                    com.vk.qrcode.d.k(dVar, activity, bVar, null, f2, null, nh3Var, a2, h, null, spannableString2, 5, null, pair3, pair2, null, !post.X() ? aVar : null, null, null, 1722984);
                }
                break;
            default:
                kfr0 kfr0Var = (kfr0) obj4;
                ifr0 ifr0Var = kfr0Var.h;
                PersonalDiscountTransitionFrom personalDiscountTransitionFrom = (PersonalDiscountTransitionFrom) obj3;
                PersonalDiscountDialogType personalDiscountDialogType = (PersonalDiscountDialogType) obj2;
                q1a0 q1a0Var = (q1a0) obj;
                if (q1a0Var.a != 0) {
                    l1a0 l1a0Var = q1a0Var.b;
                    ifr0Var.c(l1a0Var != null ? l1a0Var.d : null, personalDiscountTransitionFrom);
                    new e860.a(((ggu0) kfr0Var.f.c).b, kfr0Var.a, q1a0Var, personalDiscountDialogType, ifr0Var, kfr0Var.i).I0(null);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ it8(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
