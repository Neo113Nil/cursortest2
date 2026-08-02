package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.core.view.components.bottombar.VkBottomBar;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.PurchaseDetails;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.GiftData;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import xsna.ayv0;
import xsna.tlo0;

/* compiled from: LegoBuyPackControllerImpl.kt */
/* loaded from: classes6.dex */
public final class t1z implements t3l0 {
    public final Activity b;
    public final View c;
    public final GiftData d;
    public final ContextUser e;
    public final String f;
    public final UserId g;
    public final obl0 h;
    public is8 i;
    public final a j;
    public final d80 k;
    public final boolean l;
    public ucl0 m;
    public dwg n;

    /* compiled from: LegoBuyPackControllerImpl.kt */
    public static final class a {
        public final VkBottomBar a;
        public final Context b;
        public final VkButton c;
        public final VkButton d;
        public final TextView e;
        public final VkUserStack f;

        public a(VkBottomBar vkBottomBar) {
            this.a = vkBottomBar;
            Context context = vkBottomBar.getContext();
            this.b = context;
            VkButton button = vkBottomBar.getButton();
            this.c = button;
            VkButton secondButton = vkBottomBar.getSecondButton();
            this.d = secondButton;
            TextView textView = new TextView(context);
            TypedArray obtainStyledAttributes = textView.getContext().obtainStyledAttributes(new int[]{R.attr.vk_ui_typography_subhead});
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
            if (resourceId != 0) {
                textView.setTextAppearance(resourceId);
            }
            textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_secondary));
            textView.setGravity(1);
            int b = hbh0.b(16, textView.getContext());
            textView.setPadding(b, 0, b, 0);
            this.e = textView;
            VkUserStack vkUserStack = new VkUserStack(context, null, 6);
            vkUserStack.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
            this.f = vkUserStack;
            float b2 = hbh0.b(16, context);
            button.setCornerRadius(Float.valueOf(b2));
            secondButton.setCornerRadius(Float.valueOf(b2));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams.setMarginEnd(hbh0.b(8, context));
            button.setLayoutParams(layoutParams);
        }

        public final void a() {
            VkButton vkButton = this.c;
            VkButton vkButton2 = this.d;
            for (VkButton vkButton3 : e43.l(vkButton, vkButton2)) {
                vkButton3.setVisibility(0);
                vkButton3.setEnabled(true);
                vkButton3.setAlpha(1.0f);
                vkButton3.setMode(VkButton.Mode.Primary);
                vkButton3.setAppearance(VkButton.Appearance.Neutral);
                vkButton3.a5(true, null);
                vkButton3.setText((CharSequence) null);
                vkButton3.setContentDescription(null);
            }
            int b = hbh0.b(52, this.b);
            vkButton2.setLayoutParams(new LinearLayout.LayoutParams(b, b));
            VkBottomBar vkBottomBar = this.a;
            vkBottomBar.setTopSlot(null);
            vkBottomBar.setBottomSlot(null);
        }
    }

    public t1z(Activity activity, VkBottomBar vkBottomBar, GiftData giftData, ContextUser contextUser, String str, UserId userId) {
        this.b = activity;
        this.c = vkBottomBar;
        this.d = giftData;
        this.e = contextUser;
        this.f = str;
        this.g = userId;
        this.h = g2v.d().e(activity);
        a aVar = new a(vkBottomBar);
        this.j = aVar;
        t6g0 t6g0Var = t6g0.b;
        this.k = new d80(t6g0.d());
        this.l = !t6g0.d().U().isEmpty();
        aVar.a();
        aVar.c.setEnabled(false);
        f4m.j(aVar.d);
    }

    public static void a(t1z t1zVar, d790 d790Var, ArrayList arrayList, View view, View view2, View view3, StickerStockItem stickerStockItem, int i) {
        if ((i & 4) != 0) {
            view = null;
        }
        if ((i & 16) != 0) {
            view3 = null;
        }
        if ((i & 32) != 0) {
            stickerStockItem = null;
        }
        if (view != null) {
            jjc.g(view, new ll1(13, t1zVar, d790Var));
        }
        if (view2 != null) {
            jjc.g(view2, new ftm(t1zVar, d790Var, arrayList, 1));
        }
        if (view3 != null) {
            jjc.g(view3, new sf4(10, stickerStockItem, t1zVar));
        }
    }

    @Override // xsna.t3l0
    public final void Oh(StickerStockItem stickerStockItem, d790 d790Var) {
        String str;
        d790 d790Var2;
        Integer valueOf = Integer.valueOf(R.drawable.vk_icon_done_outline_24);
        Integer valueOf2 = Integer.valueOf(R.drawable.vk_icon_gift_24);
        a aVar = this.j;
        aVar.a();
        VkButton vkButton = aVar.c;
        VkButton vkButton2 = aVar.d;
        StickerStockItem stickerStockItem2 = d790Var.a;
        boolean z = stickerStockItem2.Q;
        boolean z2 = stickerStockItem2.G;
        GiftData giftData = this.d;
        if (z && !this.l) {
            t6g0 t6g0Var = t6g0.b;
            if (t6g0.d().Y0()) {
                Collection<UserId> collection = giftData.b;
                ArrayList arrayList = collection != null ? new ArrayList(collection) : null;
                boolean a2 = d790Var.a();
                a aVar2 = this.j;
                ArrayList arrayList2 = arrayList;
                if (b(aVar2, a2, stickerStockItem, d790Var, arrayList2)) {
                    return;
                }
                VkButton vkButton3 = aVar2.c;
                vkButton3.setEnabled(true);
                vkButton3.setMode(VkButton.Mode.Secondary);
                vkButton3.setText(R.string.vmoji_avatar_create);
                vkButton3.a5(true, Integer.valueOf(R.drawable.vk_icon_vmoji_outline_28));
                VkButton vkButton4 = aVar2.d;
                vkButton4.setVisibility(0);
                vkButton4.a5(true, valueOf2);
                vkButton4.setText((CharSequence) null);
                vkButton4.setEnabled(a2);
                a(this, d790Var, arrayList2, aVar2.c, aVar2.d, null, null, 48);
                return;
            }
        }
        boolean b = xhr0.b(this.c.getContext(), g2v.d().v().d());
        boolean f = g2v.d().f();
        if (z2 && !b && f) {
            f4m.j(vkButton2);
            vkButton.setEnabled(true);
            vkButton.setMode(VkButton.Mode.Primary);
            vkButton.setAppearance(VkButton.Appearance.Accent);
            vkButton.setText(R.string.vkim_install);
            vkButton.a5(true, Integer.valueOf(R.drawable.vk_icon_logo_vkme_icon_28));
            jjc.g(vkButton, new o3w(aVar, 4));
            String string = aVar.b.getString(R.string.vkim_stickers_pack_description, stickerStockItem2.d);
            TextView textView = aVar.e;
            textView.setText(string);
            aVar.a.setBottomSlot(textView);
            return;
        }
        if (!d790Var.m()) {
            f4m.j(vkButton2);
            if (d790Var.o()) {
                vkButton.setEnabled(false);
                vkButton.a5(true, valueOf);
                vkButton.setText(R.string.sticker_added);
                return;
            }
            ArrayList h = d790Var.h();
            if (h.size() != 1) {
                vkButton.setEnabled(false);
                vkButton.setText(R.string.unavailable);
                return;
            }
            vkButton.setEnabled(true);
            StickerStockItem stickerStockItem3 = (StickerStockItem) j5g.Y(h);
            PurchaseDetails purchaseDetails = stickerStockItem3.F;
            if (purchaseDetails == null || (str = purchaseDetails.b) == null) {
                str = "";
            }
            vkButton.setText(str);
            jjc.g(vkButton, new jy5(stickerStockItem3, this, purchaseDetails, 5));
            return;
        }
        Collection<UserId> collection2 = giftData.b;
        ArrayList arrayList3 = collection2 != null ? new ArrayList(collection2) : null;
        boolean a3 = d790Var.a();
        ArrayList arrayList4 = arrayList3;
        a aVar3 = this.j;
        if (b(aVar3, a3, stickerStockItem, d790Var, arrayList4)) {
            return;
        }
        if (d790Var.o() && a3) {
            VkButton vkButton5 = aVar3.d;
            vkButton5.setVisibility(0);
            vkButton5.setAppearance(VkButton.Appearance.Neutral);
            vkButton5.setMode(VkButton.Mode.Primary);
            vkButton5.a5(true, Integer.valueOf(R.drawable.vk_icon_done_outline_28));
            vkButton5.setText((CharSequence) null);
            vkButton5.setEnabled(false);
            vkButton5.setAlpha(1.0f);
            vkButton5.setContentDescription(aVar3.b.getString(R.string.stickers_accessibility_pack_added));
            VkButton vkButton6 = aVar3.c;
            vkButton6.setEnabled(true);
            vkButton6.a5(true, valueOf2);
            vkButton6.setText(R.string.stickers_gift);
            a(this, d790Var, arrayList4, aVar3.d, aVar3.c, null, null, 48);
        } else if (d790Var.o() && !a3) {
            f4m.j(aVar3.d);
            VkButton vkButton7 = aVar3.c;
            vkButton7.setEnabled(false);
            vkButton7.setAlpha(1.0f);
            vkButton7.a5(true, valueOf);
            vkButton7.setText(R.string.sticker_added);
        } else if (d790Var.p() && a3) {
            if (d790Var.g().size() > 1) {
                String j = d790Var.j(aVar3.b);
                TextView textView2 = aVar3.e;
                textView2.setText(j);
                aVar3.a.setBottomSlot(textView2);
            }
            boolean z3 = d790Var.k() || d790Var.l();
            boolean z4 = d790Var.b() != d790Var.d();
            if (z3 && z4) {
                Context context = aVar3.b;
                VkButton vkButton8 = aVar3.d;
                String string2 = context.getString(R.string.stickers_gift_with_price, d790Var.e(context));
                vkButton8.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                vkButton8.setVisibility(0);
                vkButton8.setText(string2);
                vkButton8.setEnabled(true);
                VkButton vkButton9 = aVar3.c;
                VkButton vkButton10 = aVar3.d;
                d790Var2 = d790Var;
                a(this, d790Var2, arrayList4, vkButton9, vkButton10, null, null, 48);
            } else {
                VkButton vkButton11 = aVar3.d;
                vkButton11.setVisibility(0);
                int[] iArr = VkButton.W;
                vkButton11.a5(true, valueOf2);
                vkButton11.setText((CharSequence) null);
                vkButton11.setEnabled(true);
                VkButton vkButton12 = aVar3.c;
                VkButton vkButton13 = aVar3.d;
                d790Var2 = d790Var;
                a(this, d790Var2, arrayList4, vkButton12, vkButton13, null, null, 48);
            }
            c(aVar3, d790Var2);
        } else {
            if (d790Var.g().size() > 1) {
                String j2 = d790Var.j(aVar3.b);
                TextView textView3 = aVar3.e;
                textView3.setText(j2);
                aVar3.a.setBottomSlot(textView3);
            }
            if (d790Var.a()) {
                VkButton vkButton14 = aVar3.d;
                vkButton14.setVisibility(0);
                int[] iArr2 = VkButton.W;
                vkButton14.a5(true, valueOf2);
                vkButton14.setText((CharSequence) null);
                vkButton14.setEnabled(false);
            } else {
                f4m.j(aVar3.d);
            }
            c(aVar3, d790Var);
            a(this, d790Var, arrayList4, aVar3.c, aVar3.d, null, null, 48);
        }
        if (z2) {
            f4m.j(aVar3.d);
        }
    }

    public final boolean b(a aVar, boolean z, StickerStockItem stickerStockItem, d790 d790Var, ArrayList arrayList) {
        ContextUser contextUser;
        if (!z || (contextUser = this.e) == null) {
            return false;
        }
        UserId userId = contextUser.b;
        if (!contextUser.zb(stickerStockItem)) {
            return false;
        }
        UserId userId2 = this.g;
        if (userId2 != null && userId.b == userId2.b) {
            return false;
        }
        VkUserStack vkUserStack = aVar.f;
        tlo0.a aVar2 = tlo0.Companion;
        String string = aVar.b.getString(d790Var.b.isEmpty() ? R.string.stickers_user_already_has_that_pack : R.string.stickers_user_already_has_that_style, contextUser.c);
        aVar2.getClass();
        vkUserStack.setText(new tlo0.h(string));
        String str = contextUser.d;
        vkUserStack.setAvatars(str != null ? Collections.singletonList(new ayv0.c(str)) : Collections.singletonList(new ayv0.b(R.drawable.user_placeholder)));
        f4m.j(aVar.c);
        f4m.j(aVar.d);
        aVar.a.setTopSlot(vkUserStack);
        if (arrayList == null) {
            return true;
        }
        arrayList.remove(userId);
        return true;
    }

    public final void c(a aVar, d790 d790Var) {
        CharSequence string;
        VkButton vkButton = aVar.c;
        Context context = aVar.b;
        vkButton.setEnabled(true);
        VkButton vkButton2 = aVar.c;
        vkButton2.a5(true, null);
        if (d790Var.n()) {
            string = context.getString(R.string.stickers_buy_for_free);
        } else if (d790Var.q()) {
            string = context.getString(R.string.price_free);
        } else {
            Context context2 = this.j.b;
            String string2 = context2.getString(R.string.stickers_buy_for, "");
            int i = d790Var.i();
            if (d790Var.k()) {
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) string2).append((CharSequence) rik0.b(5.0f)).append(String.valueOf(i), new StrikethroughSpan(), 33);
                append.setSpan(new ForegroundColorSpan(context2.getColor(R.color.vk_white_alpha60)), string2.length(), append.length(), 33);
                string = append.append((CharSequence) rik0.b(7.0f)).append((CharSequence) d790Var.c(context2));
            } else {
                string = context2.getString(R.string.stickers_buy_for, d790Var.c(this.b));
            }
        }
        vkButton2.setText(string);
    }

    @Override // xsna.t3l0
    public final void m6(StickerStockItem stickerStockItem, StickerStockItem stickerStockItem2) {
        Integer num;
        int i = stickerStockItem2.b;
        d790 d790Var = (i == stickerStockItem.b || (num = stickerStockItem.L) == null || num.intValue() != i) ? new d790(stickerStockItem) : new d790(stickerStockItem2, e43.o(stickerStockItem));
        if (!stickerStockItem.h || stickerStockItem.k) {
            Oh(stickerStockItem, d790Var);
            return;
        }
        a aVar = this.j;
        aVar.a();
        VkButton vkButton = aVar.d;
        VkButton vkButton2 = aVar.c;
        Collection<UserId> collection = this.d.b;
        ArrayList arrayList = collection != null ? new ArrayList(collection) : null;
        boolean z = stickerStockItem.A;
        ArrayList arrayList2 = arrayList;
        if (b(aVar, z, stickerStockItem, d790Var, arrayList2)) {
            return;
        }
        vkButton2.setEnabled(true);
        vkButton2.setText(R.string.stickers_activate_style);
        if (d790Var.a()) {
            vkButton.setVisibility(0);
            vkButton.a5(true, Integer.valueOf(R.drawable.vk_icon_gift_24));
            vkButton.setText((CharSequence) null);
            vkButton.setEnabled(z);
            vkButton.setAlpha(1.0f);
        } else {
            f4m.j(vkButton);
        }
        a(this, d790Var, arrayList2, null, aVar.d, aVar.c, stickerStockItem, 4);
    }
}
