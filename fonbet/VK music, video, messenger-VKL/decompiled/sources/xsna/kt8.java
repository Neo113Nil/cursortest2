package xsna;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.widget.TextView;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.Price;
import com.vk.dto.stickers.PurchaseDetails;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.imageloader.view.VKImageView;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.GiftData;
import com.vk.vas.design.view.VkButtonCommerce;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: BuyPackControllerImpl.kt */
/* loaded from: classes6.dex */
public final class kt8 implements t3l0 {
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

    /* compiled from: BuyPackControllerImpl.kt */
    public static final class a {
        public final Context a;
        public final View b;
        public final TextView c;
        public final View d;
        public final VkButton e;
        public final VkButtonCommerce f;
        public final VkButton g;
        public final VkButton h;
        public final View i;
        public final VKImageView j;
        public final TextView k;

        public a(View view) {
            this.a = view.getContext();
            View findViewById = view.findViewById(R.id.buy_container);
            this.b = findViewById;
            this.c = (TextView) findViewById.findViewById(R.id.buy_container_notes);
            this.d = findViewById.findViewById(R.id.usual_buy_container);
            this.e = (VkButton) findViewById.findViewById(R.id.vkme_button);
            this.f = (VkButtonCommerce) findViewById.findViewById(R.id.big_button);
            this.g = (VkButton) findViewById.findViewById(R.id.small_button);
            this.h = (VkButton) findViewById.findViewById(R.id.bottom_button);
            View findViewById2 = findViewById.findViewById(R.id.context_user_container);
            this.i = findViewById2;
            this.j = (VKImageView) findViewById2.findViewById(R.id.context_user_avatar);
            this.k = (TextView) findViewById2.findViewById(R.id.context_user_title);
        }
    }

    public kt8(Activity activity, View view, GiftData giftData, ContextUser contextUser, String str, UserId userId) {
        this.b = activity;
        this.c = view;
        this.d = giftData;
        this.e = contextUser;
        this.f = str;
        this.g = userId;
        this.h = g2v.d().e(activity);
        a aVar = new a(view);
        this.j = aVar;
        t6g0 t6g0Var = t6g0.b;
        this.k = new d80(t6g0.d());
        this.l = !t6g0.d().U().isEmpty();
        aVar.d.setVisibility(0);
        VkButtonCommerce vkButtonCommerce = aVar.f;
        vkButtonCommerce.setEnabled(false);
        vkButtonCommerce.setVisibility(0);
        f4m.j(aVar.g);
    }

    public static boolean a(ContextUser contextUser, UserId userId) {
        return (contextUser == null || userId == null || contextUser.b.b != userId.b) ? false : true;
    }

    public static String b(a aVar, d790 d790Var, ContextUser contextUser) {
        return aVar.a.getString(d790Var.b.isEmpty() ? R.string.stickers_user_already_has_that_pack : R.string.stickers_user_already_has_that_style, contextUser.c);
    }

    public static void c(kt8 kt8Var, d790 d790Var, ArrayList arrayList, View view, View view2, View view3, StickerStockItem stickerStockItem, int i) {
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
            jjc.g(view, new kp5(1, kt8Var, d790Var));
        }
        if (view2 != null) {
            jjc.g(view2, new it8(kt8Var, d790Var, arrayList, 0));
        }
        if (view3 != null) {
            jjc.g(view3, new na7(2, stickerStockItem, kt8Var));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02f0  */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v12 */
    @Override // xsna.t3l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Oh(StickerStockItem stickerStockItem, d790 d790Var) {
        String str;
        ?? r8;
        kt8 kt8Var;
        d790 d790Var2;
        int zb;
        Iterator it;
        CharSequence string;
        int zb2;
        VkButton vkButton;
        Integer valueOf = Integer.valueOf(R.drawable.vk_icon_done_outline_24);
        Integer valueOf2 = Integer.valueOf(R.drawable.vk_icon_gift_outline_28);
        StickerStockItem stickerStockItem2 = d790Var.a;
        boolean z = stickerStockItem2.Q;
        boolean z2 = stickerStockItem2.G;
        UserId userId = this.g;
        GiftData giftData = this.d;
        ContextUser contextUser = this.e;
        a aVar = this.j;
        if (z && !this.l) {
            t6g0 t6g0Var = t6g0.b;
            if (t6g0.d().Y0()) {
                TextView textView = aVar.c;
                View view = aVar.i;
                View view2 = aVar.b;
                VkButton vkButton2 = aVar.g;
                f4m.j(textView);
                f4m.j(aVar.e);
                aVar.d.setVisibility(0);
                VkButtonCommerce vkButtonCommerce = aVar.f;
                vkButtonCommerce.setEnabled(true);
                vkButtonCommerce.setMode(VkButton.Mode.Secondary);
                vkButtonCommerce.setText(R.string.vmoji_avatar_create);
                vkButtonCommerce.setIcon(Integer.valueOf(R.drawable.vk_icon_vmoji_outline_28));
                Collection<UserId> collection = giftData.b;
                ArrayList arrayList = collection != null ? new ArrayList(collection) : null;
                boolean a2 = d790Var.a();
                if (!a2 || contextUser == null || !contextUser.zb(stickerStockItem) || a(contextUser, userId)) {
                    f4m.v(cn70.b(12), view2);
                    f4m.j(view);
                } else {
                    f4m.v(cn70.b(6), view2);
                    bwt0.f0(aVar.i, 0, cn70.b(12), 0, 0, 13);
                    view.setVisibility(0);
                    aVar.k.setText(b(aVar, d790Var, contextUser));
                    aVar.j.load(contextUser.d);
                    if (arrayList != null) {
                        arrayList.remove(contextUser.b);
                    }
                }
                f4m.j(aVar.h);
                vkButton2.setVisibility(0);
                int[] iArr = VkButton.W;
                vkButton2.a5(true, valueOf2);
                vkButton2.setEnabled(a2);
                c(this, d790Var, arrayList, aVar.f, aVar.g, null, null, 48);
                return;
            }
        }
        boolean b = xhr0.b(this.c.getContext(), g2v.d().v().d());
        boolean f = g2v.d().f();
        if (z2 && !b && f) {
            aVar.c.setText(aVar.a.getString(R.string.vkim_stickers_pack_description, stickerStockItem2.d));
            aVar.c.setVisibility(0);
            VkButton vkButton3 = aVar.e;
            vkButton3.setVisibility(0);
            f4m.j(aVar.d);
            f4m.j(aVar.i);
            jjc.g(vkButton3, new wl0(aVar, 9));
            return;
        }
        if (!d790Var.m()) {
            TextView textView2 = aVar.c;
            VkButtonCommerce vkButtonCommerce2 = aVar.f;
            f4m.j(textView2);
            f4m.j(aVar.e);
            aVar.d.setVisibility(0);
            f4m.j(aVar.i);
            f4m.j(aVar.g);
            if (d790Var.o()) {
                vkButtonCommerce2.setEnabled(false);
                vkButtonCommerce2.setIcon(valueOf);
                vkButtonCommerce2.setText(R.string.sticker_added);
                return;
            }
            vkButtonCommerce2.setIcon((Integer) null);
            ArrayList h = d790Var.h();
            if (h.size() != 1) {
                vkButtonCommerce2.setEnabled(false);
                vkButtonCommerce2.setText(R.string.unavailable);
                return;
            }
            vkButtonCommerce2.setEnabled(true);
            StickerStockItem stickerStockItem3 = (StickerStockItem) j5g.Y(h);
            PurchaseDetails purchaseDetails = stickerStockItem3.F;
            vkButtonCommerce2.setText((purchaseDetails == null || (str = purchaseDetails.b) == null) ? "" : str);
            jjc.g(vkButtonCommerce2, new jt8(stickerStockItem3, this, purchaseDetails, 0));
            return;
        }
        TextView textView3 = aVar.c;
        Context context = aVar.a;
        TextView textView4 = aVar.c;
        View view3 = aVar.i;
        View view4 = aVar.b;
        VkButton vkButton4 = aVar.h;
        VkButton vkButton5 = aVar.g;
        f4m.j(textView3);
        f4m.j(aVar.e);
        aVar.d.setVisibility(0);
        VkButtonCommerce vkButtonCommerce3 = aVar.f;
        vkButtonCommerce3.setAppearance(d790Var.n() ? VkButton.Appearance.Accent : VkButton.Appearance.Positive);
        Collection<UserId> collection2 = giftData.b;
        ArrayList arrayList2 = collection2 != null ? new ArrayList(collection2) : null;
        boolean a3 = d790Var.a();
        if (!a3 || contextUser == null || !contextUser.zb(stickerStockItem) || a(contextUser, userId)) {
            f4m.v(cn70.b(12), view4);
            f4m.j(view3);
        } else {
            f4m.v(cn70.b(6), view4);
            bwt0.f0(aVar.i, 0, cn70.b(12), 0, 0, 13);
            view3.setVisibility(0);
            aVar.k.setText(b(aVar, d790Var, contextUser));
            aVar.j.load(contextUser.d);
            if (arrayList2 != null) {
                arrayList2.remove(contextUser.b);
            }
        }
        if (d790Var.o() && a3) {
            f4m.j(vkButton4);
            vkButton5.setAppearance(VkButton.Appearance.Accent);
            vkButton5.setMode(VkButton.Mode.Secondary);
            vkButton5.setVisibility(0);
            vkButton5.a5(true, Integer.valueOf(R.drawable.vk_icon_done_outline_28));
            vkButton5.setContentDescription(context.getString(R.string.stickers_accessibility_pack_added));
            vkButton5.setEnabled(false);
            vkButtonCommerce3.setDiscountText(null);
            vkButtonCommerce3.setEnabled(true);
            vkButtonCommerce3.setIcon(Integer.valueOf(R.drawable.vk_icon_gift_24));
            vkButtonCommerce3.setText(R.string.stickers_gift);
            vkButton = vkButton5;
            c(this, d790Var, arrayList2, aVar.g, aVar.f, null, null, 48);
        } else {
            VkButton vkButton6 = vkButton5;
            ArrayList arrayList3 = arrayList2;
            if (d790Var.o() && !a3) {
                f4m.j(vkButton4);
                f4m.j(vkButton6);
                vkButtonCommerce3.setDiscountText(null);
                vkButtonCommerce3.setEnabled(false);
                vkButtonCommerce3.setIcon(valueOf);
                vkButtonCommerce3.setText(R.string.sticker_added);
                vkButton = vkButton6;
            } else if (d790Var.p() && a3) {
                if (d790Var.g().size() > 1) {
                    textView4.setText(d790Var.j(context));
                    textView4.setVisibility(0);
                }
                boolean z3 = d790Var.k() || d790Var.l();
                boolean z4 = d790Var.b() != d790Var.d();
                if (z3 && z4) {
                    String string2 = context.getString(R.string.stickers_gift_with_price, "");
                    boolean Gb = stickerStockItem2.Gb();
                    Price price = stickerStockItem2.n;
                    if (Gb) {
                        Price.PriceInfo Cb = price.Cb();
                        if (Cb != null) {
                            zb = Cb.zb();
                            ArrayList arrayList4 = d790Var.b;
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj : arrayList4) {
                                if (((StickerStockItem) obj).A) {
                                    arrayList5.add(obj);
                                }
                            }
                            it = arrayList5.iterator();
                            int i = 0;
                            while (it.hasNext()) {
                                StickerStockItem stickerStockItem4 = (StickerStockItem) it.next();
                                boolean Gb2 = stickerStockItem4.Gb();
                                Price price2 = stickerStockItem4.n;
                                if (Gb2) {
                                    Price.PriceInfo Cb2 = price2.Cb();
                                    if (Cb2 != null) {
                                        zb2 = Cb2.zb();
                                    }
                                    zb2 = 0;
                                } else {
                                    Price.PriceInfo Fb = price2.Fb();
                                    if (Fb != null) {
                                        zb2 = Fb.zb();
                                    }
                                    zb2 = 0;
                                }
                                i += zb2;
                            }
                            int i2 = i + zb;
                            if (d790Var.l()) {
                                string = context.getString(R.string.stickers_gift_with_price, d790Var.e(context));
                            } else {
                                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) string2).append((CharSequence) rik0.b(5.0f)).append(String.valueOf(i2), new StrikethroughSpan(), 33);
                                append.setSpan(new ForegroundColorSpan(l8g.f(0.64f, dhr0.t.c(R.attr.vk_ui_stroke_accent_themed))), string2.length(), append.length(), 33);
                                string = append.append((CharSequence) rik0.b(7.0f)).append((CharSequence) d790Var.e(context));
                            }
                            vkButton4.setText(string);
                            vkButton4.setVisibility(0);
                            f4m.j(vkButton6);
                            if (bwt0.K(view3)) {
                                f4m.v(cn70.b(8), view4);
                            } else {
                                f4m.v(cn70.b(2), view4);
                                bwt0.f0(aVar.i, 0, 0, 0, 0, 13);
                            }
                            kt8Var = this;
                            c(kt8Var, d790Var, arrayList3, aVar.f, aVar.h, null, null, 48);
                            d790Var2 = d790Var;
                        }
                        zb = 0;
                        ArrayList arrayList42 = d790Var.b;
                        ArrayList arrayList52 = new ArrayList();
                        while (r7.hasNext()) {
                        }
                        it = arrayList52.iterator();
                        int i3 = 0;
                        while (it.hasNext()) {
                        }
                        int i22 = i3 + zb;
                        if (d790Var.l()) {
                        }
                        vkButton4.setText(string);
                        vkButton4.setVisibility(0);
                        f4m.j(vkButton6);
                        if (bwt0.K(view3)) {
                        }
                        kt8Var = this;
                        c(kt8Var, d790Var, arrayList3, aVar.f, aVar.h, null, null, 48);
                        d790Var2 = d790Var;
                    } else {
                        Price.PriceInfo Fb2 = price.Fb();
                        if (Fb2 != null) {
                            zb = Fb2.zb();
                            ArrayList arrayList422 = d790Var.b;
                            ArrayList arrayList522 = new ArrayList();
                            while (r7.hasNext()) {
                            }
                            it = arrayList522.iterator();
                            int i32 = 0;
                            while (it.hasNext()) {
                            }
                            int i222 = i32 + zb;
                            if (d790Var.l()) {
                            }
                            vkButton4.setText(string);
                            vkButton4.setVisibility(0);
                            f4m.j(vkButton6);
                            if (bwt0.K(view3)) {
                            }
                            kt8Var = this;
                            c(kt8Var, d790Var, arrayList3, aVar.f, aVar.h, null, null, 48);
                            d790Var2 = d790Var;
                        }
                        zb = 0;
                        ArrayList arrayList4222 = d790Var.b;
                        ArrayList arrayList5222 = new ArrayList();
                        while (r7.hasNext()) {
                        }
                        it = arrayList5222.iterator();
                        int i322 = 0;
                        while (it.hasNext()) {
                        }
                        int i2222 = i322 + zb;
                        if (d790Var.l()) {
                        }
                        vkButton4.setText(string);
                        vkButton4.setVisibility(0);
                        f4m.j(vkButton6);
                        if (bwt0.K(view3)) {
                        }
                        kt8Var = this;
                        c(kt8Var, d790Var, arrayList3, aVar.f, aVar.h, null, null, 48);
                        d790Var2 = d790Var;
                    }
                } else {
                    f4m.j(vkButton4);
                    vkButton6.setVisibility(0);
                    vkButton6.setAppearance(VkButton.Appearance.Positive);
                    vkButton6.setMode(VkButton.Mode.Primary);
                    vkButton6.a5(true, valueOf2);
                    vkButton6.setEnabled(true);
                    kt8Var = this;
                    d790Var2 = d790Var;
                    c(kt8Var, d790Var2, arrayList3, aVar.f, aVar.g, null, null, 48);
                }
                kt8Var.d(aVar, d790Var2);
                vkButton = vkButton6;
            } else {
                if (d790Var.g().size() > 1) {
                    textView4.setText(d790Var.j(context));
                    r8 = 0;
                    textView4.setVisibility(0);
                } else {
                    r8 = 0;
                }
                f4m.j(vkButton4);
                if (d790Var.a()) {
                    vkButton6.setVisibility(r8);
                    int[] iArr2 = VkButton.W;
                    vkButton6.a5(true, valueOf2);
                    vkButton6.setEnabled(r8);
                } else {
                    f4m.j(vkButton6);
                }
                d(aVar, d790Var);
                c(this, d790Var, arrayList3, aVar.f, aVar.g, null, null, 48);
                vkButton = vkButton6;
            }
        }
        if (z2) {
            f4m.j(vkButton);
        }
    }

    public final void d(a aVar, d790 d790Var) {
        CharSequence string;
        VkButtonCommerce vkButtonCommerce = aVar.f;
        Context context = aVar.a;
        vkButtonCommerce.setEnabled(true);
        VkButtonCommerce vkButtonCommerce2 = aVar.f;
        vkButtonCommerce2.setIcon((Integer) null);
        StickerStockItem stickerStockItem = d790Var.a;
        String Gb = stickerStockItem.n.Gb();
        if (Gb != null) {
            vkButtonCommerce2.setSubText(Gb);
        } else {
            vkButtonCommerce2.setSubText(null);
        }
        if (d790Var.n()) {
            string = context.getString(R.string.stickers_buy_for_free);
        } else if (d790Var.q()) {
            string = context.getString(R.string.price_free);
        } else {
            Context context2 = this.j.a;
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
        if (d790Var.b.isEmpty()) {
            boolean Fb = stickerStockItem.Fb();
            Price price = stickerStockItem.n;
            if (Fb && !epx.f(price.zb(), price.Ab())) {
                String zb = price.zb();
                vkButtonCommerce2.setDiscountText(zb != null ? zb : "");
                vkButtonCommerce2.setText(string);
            }
        }
        vkButtonCommerce2.setDiscountText(null);
        vkButtonCommerce2.setText(string);
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
        TextView textView = aVar.c;
        VkButton vkButton = aVar.g;
        View view = aVar.i;
        View view2 = aVar.b;
        f4m.j(textView);
        f4m.j(aVar.e);
        aVar.d.setVisibility(0);
        VkButtonCommerce vkButtonCommerce = aVar.f;
        vkButtonCommerce.setEnabled(true);
        vkButtonCommerce.setAppearance(VkButton.Appearance.Accent);
        vkButtonCommerce.setIcon((Integer) null);
        vkButtonCommerce.setText(R.string.stickers_activate_style);
        Collection<UserId> collection = this.d.b;
        ArrayList arrayList = collection != null ? new ArrayList(collection) : null;
        boolean z = stickerStockItem.A;
        ContextUser contextUser = this.e;
        if (contextUser == null || !z || !contextUser.zb(stickerStockItem) || a(contextUser, this.g)) {
            f4m.v(cn70.b(12), view2);
            f4m.j(view);
        } else {
            f4m.v(cn70.b(6), view2);
            bwt0.f0(aVar.i, 0, cn70.b(12), 0, 0, 13);
            view.setVisibility(0);
            aVar.k.setText(b(aVar, d790Var, contextUser));
            aVar.j.load(contextUser.d);
            if (arrayList != null) {
                arrayList.remove(contextUser.b);
            }
        }
        if (d790Var.a()) {
            vkButton.setVisibility(0);
            Integer valueOf = Integer.valueOf(R.drawable.vk_icon_gift_outline_28);
            int[] iArr = VkButton.W;
            vkButton.a5(true, valueOf);
            vkButton.setEnabled(z);
        } else {
            f4m.j(vkButton);
        }
        c(this, d790Var, arrayList, null, aVar.g, aVar.f, stickerStockItem, 4);
    }
}
