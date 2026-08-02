package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.Merchant;
import com.vk.im.engine.models.attaches.AttachLink;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.MsgPartSnippetView;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import xsna.e3m;

/* compiled from: MsgPartLinkProductHolder.kt */
/* loaded from: classes2.dex */
public final class or30 extends hr30<AttachLink, pr30> {
    public MsgPartSnippetView d;
    public pk30 h;
    public pr30 i;
    public String j;
    public final StringBuilder e = new StringBuilder();
    public final uy9 f = new uy9();
    public final DecimalFormat g = new DecimalFormat("#.#");
    public final v5t k = new v5t(R.layout.vkim_msg_part_link_large);

    /* compiled from: MsgPartLinkProductHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Merchant.values().length];
            try {
                iArr[Merchant.ALIEXPRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class b implements izs<View, s3q0> {
        public b() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            or30 or30Var = or30.this;
            pk30 pk30Var = or30Var.h;
            pr30 pr30Var = or30Var.i;
            Msg msg = pr30Var != null ? pr30Var.o : null;
            Attach attach = pr30Var != null ? pr30Var.q : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, pr30Var != null ? pr30Var.p : null);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class c implements View.OnLongClickListener {
        public c() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            or30 or30Var = or30.this;
            pk30 pk30Var = or30Var.h;
            pr30 pr30Var = or30Var.i;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = pr30Var != null ? pr30Var.o : null;
            Attach attach = pr30Var != null ? pr30Var.q : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, pr30Var != null ? pr30Var.p : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        MsgPartSnippetView msgPartSnippetView = this.d;
        if (msgPartSnippetView == null) {
            msgPartSnippetView = null;
        }
        hr30.k(msgPartSnippetView, bubbleColors);
    }

    @Override // xsna.hr30
    public final void p(pr30 pr30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        CharSequence i;
        pr30 pr30Var2 = pr30Var;
        int i2 = pr30Var2.i;
        String str = pr30Var2.d;
        this.i = pr30Var2;
        this.h = pk30Var;
        MsgPartSnippetView msgPartSnippetView = this.d;
        if (msgPartSnippetView == null) {
            msgPartSnippetView = null;
        }
        msgPartSnippetView.setImageList(pr30Var2.f);
        MsgPartSnippetView msgPartSnippetView2 = this.d;
        if (msgPartSnippetView2 == null) {
            msgPartSnippetView2 = null;
        }
        msgPartSnippetView2.setImageOverlay(null);
        if (str.length() == 0) {
            i = this.j;
        } else {
            ucp ucpVar = ucp.a;
            i = ucp.i(str);
        }
        String str2 = pr30Var2.e;
        int i3 = str2.length() == 0 ? 2 : 1;
        MsgPartSnippetView msgPartSnippetView3 = this.d;
        if (msgPartSnippetView3 == null) {
            msgPartSnippetView3 = null;
        }
        msgPartSnippetView3.j(i3, i);
        MsgPartSnippetView msgPartSnippetView4 = this.d;
        if (msgPartSnippetView4 == null) {
            msgPartSnippetView4 = null;
        }
        msgPartSnippetView4.setButtonText(str2);
        float f = pr30Var2.g;
        boolean z = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z) {
            MsgPartSnippetView msgPartSnippetView5 = this.d;
            if (msgPartSnippetView5 == null) {
                msgPartSnippetView5 = null;
            }
            msgPartSnippetView5.setRatingText(this.g.format(Float.valueOf(f)));
        } else {
            MsgPartSnippetView msgPartSnippetView6 = this.d;
            if (msgPartSnippetView6 == null) {
                msgPartSnippetView6 = null;
            }
            msgPartSnippetView6.setRatingText(null);
        }
        Merchant merchant = pr30Var2.h;
        int i4 = (merchant == null ? -1 : a.$EnumSwitchMapping$0[merchant.ordinal()]) == 1 ? R.drawable.vkim_aliexpress : 0;
        boolean z2 = i4 != 0;
        if (z2) {
            MsgPartSnippetView msgPartSnippetView7 = this.d;
            MsgPartSnippetView msgPartSnippetView8 = msgPartSnippetView7 == null ? null : msgPartSnippetView7;
            if (msgPartSnippetView7 == null) {
                msgPartSnippetView7 = null;
            }
            Context context = msgPartSnippetView7.getContext();
            e3m.a aVar = e3m.a;
            msgPartSnippetView8.setMerchantLogoDrawable(m33.a(i4, context));
        } else {
            MsgPartSnippetView msgPartSnippetView9 = this.d;
            if (msgPartSnippetView9 == null) {
                msgPartSnippetView9 = null;
            }
            msgPartSnippetView9.setMerchantLogoDrawable(null);
        }
        if (i2 > 0) {
            StringBuilder sb = this.e;
            sb.setLength(0);
            if (z) {
                sb.append(" · ");
            }
            MsgPartSnippetView msgPartSnippetView10 = this.d;
            if (msgPartSnippetView10 == null) {
                msgPartSnippetView10 = null;
            }
            sb.append(enj.f(R.plurals.vkim_msg_product_orders, i2, msgPartSnippetView10.getContext()));
            MsgPartSnippetView msgPartSnippetView11 = this.d;
            if (msgPartSnippetView11 == null) {
                msgPartSnippetView11 = null;
            }
            msgPartSnippetView11.setOrdersCountText(sb);
            if (z2) {
                MsgPartSnippetView msgPartSnippetView12 = this.d;
                if (msgPartSnippetView12 == null) {
                    msgPartSnippetView12 = null;
                }
                msgPartSnippetView12.setMiddotVisibility(0);
            } else {
                MsgPartSnippetView msgPartSnippetView13 = this.d;
                if (msgPartSnippetView13 == null) {
                    msgPartSnippetView13 = null;
                }
                msgPartSnippetView13.setMiddotVisibility(8);
            }
        } else {
            MsgPartSnippetView msgPartSnippetView14 = this.d;
            if (msgPartSnippetView14 == null) {
                msgPartSnippetView14 = null;
            }
            msgPartSnippetView14.setOrdersCountText(null);
            if (z && z2) {
                MsgPartSnippetView msgPartSnippetView15 = this.d;
                if (msgPartSnippetView15 == null) {
                    msgPartSnippetView15 = null;
                }
                msgPartSnippetView15.setMiddotVisibility(0);
            } else {
                MsgPartSnippetView msgPartSnippetView16 = this.d;
                if (msgPartSnippetView16 == null) {
                    msgPartSnippetView16 = null;
                }
                msgPartSnippetView16.setMiddotVisibility(8);
            }
        }
        int i5 = pr30Var2.j;
        int i6 = pr30Var2.k;
        String str3 = pr30Var2.l;
        uy9 uy9Var = this.f;
        if (i5 > 0) {
            MsgPartSnippetView msgPartSnippetView17 = this.d;
            if (msgPartSnippetView17 == null) {
                msgPartSnippetView17 = null;
            }
            msgPartSnippetView17.setPriceText(uy9Var.b(i5 * 0.01d, str3, false));
        } else {
            MsgPartSnippetView msgPartSnippetView18 = this.d;
            if (msgPartSnippetView18 == null) {
                msgPartSnippetView18 = null;
            }
            msgPartSnippetView18.setPriceText(null);
        }
        if (i6 > 0) {
            MsgPartSnippetView msgPartSnippetView19 = this.d;
            if (msgPartSnippetView19 == null) {
                msgPartSnippetView19 = null;
            }
            msgPartSnippetView19.setOldPriceText(uy9Var.b(i6 * 0.01d, str3, false));
        } else {
            MsgPartSnippetView msgPartSnippetView20 = this.d;
            if (msgPartSnippetView20 == null) {
                msgPartSnippetView20 = null;
            }
            msgPartSnippetView20.setOldPriceText(null);
        }
        if (i5 > 0 || i6 > 0) {
            MsgPartSnippetView msgPartSnippetView21 = this.d;
            if (msgPartSnippetView21 == null) {
                msgPartSnippetView21 = null;
            }
            msgPartSnippetView21.setCaptionText(null);
        } else {
            MsgPartSnippetView msgPartSnippetView22 = this.d;
            if (msgPartSnippetView22 == null) {
                msgPartSnippetView22 = null;
            }
            msgPartSnippetView22.setCaptionText(this.j);
        }
        jr30 jr30Var = pr30Var2.b;
        MsgPartSnippetView msgPartSnippetView23 = this.d;
        hr30.m(jr30Var, msgPartSnippetView23 != null ? msgPartSnippetView23 : null);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        Resources resources = context.getResources();
        v5t v5tVar = this.k;
        this.d = (MsgPartSnippetView) v5tVar.c(layoutInflater, viewGroup);
        View view = (View) v5tVar.c;
        if (view == null) {
            view = null;
        }
        jjc.g(view, new b());
        View view2 = (View) v5tVar.c;
        if (view2 == null) {
            view2 = null;
        }
        view2.setOnLongClickListener(new c());
        this.j = resources.getString(R.string.vkim_msg_link_single);
        int d = e3m.d(R.attr.im_msg_part_corner_radius_small, layoutInflater.getContext());
        MsgPartSnippetView msgPartSnippetView = this.d;
        if (msgPartSnippetView == null) {
            msgPartSnippetView = null;
        }
        msgPartSnippetView.setImagePlaceholder(new wng0(context.getColor(R.color.vkim_msg_part_placeholder), d));
        MsgPartSnippetView msgPartSnippetView2 = this.d;
        if (msgPartSnippetView2 == null) {
            msgPartSnippetView2 = null;
        }
        abg0 abg0Var = dhr0.t;
        msgPartSnippetView2.setTitleTextColor(abg0Var.c(R.attr.vk_legacy_text_muted));
        MsgPartSnippetView msgPartSnippetView3 = this.d;
        if (msgPartSnippetView3 == null) {
            msgPartSnippetView3 = null;
        }
        msgPartSnippetView3.setPriceTextColor(abg0Var.c(R.attr.vk_legacy_text_muted));
        MsgPartSnippetView msgPartSnippetView4 = this.d;
        if (msgPartSnippetView4 == null) {
            msgPartSnippetView4 = null;
        }
        msgPartSnippetView4.setPriceFont(FontFamily.MEDIUM);
        int a2 = iah0.a(3.0f);
        MsgPartSnippetView msgPartSnippetView5 = this.d;
        if (msgPartSnippetView5 == null) {
            msgPartSnippetView5 = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) msgPartSnippetView5.i.getLayoutParams();
        marginLayoutParams.leftMargin = 0;
        marginLayoutParams.topMargin = a2;
        marginLayoutParams.rightMargin = 0;
        marginLayoutParams.bottomMargin = 0;
        msgPartSnippetView5.i.setLayoutParams(marginLayoutParams);
        MsgPartSnippetView msgPartSnippetView6 = this.d;
        if (msgPartSnippetView6 == null) {
            msgPartSnippetView6 = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) msgPartSnippetView6.j.getLayoutParams();
        marginLayoutParams2.leftMargin = 0;
        marginLayoutParams2.topMargin = a2;
        marginLayoutParams2.rightMargin = 0;
        marginLayoutParams2.bottomMargin = 0;
        msgPartSnippetView6.j.setLayoutParams(marginLayoutParams2);
        int a3 = iah0.a(2.0f);
        MsgPartSnippetView msgPartSnippetView7 = this.d;
        if (msgPartSnippetView7 == null) {
            msgPartSnippetView7 = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) msgPartSnippetView7.e.getLayoutParams();
        marginLayoutParams3.leftMargin = 0;
        marginLayoutParams3.topMargin = a3;
        marginLayoutParams3.rightMargin = 0;
        marginLayoutParams3.bottomMargin = 0;
        msgPartSnippetView7.e.setLayoutParams(marginLayoutParams3);
        MsgPartSnippetView msgPartSnippetView8 = this.d;
        if (msgPartSnippetView8 == null) {
            msgPartSnippetView8 = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) msgPartSnippetView8.f.getLayoutParams();
        marginLayoutParams4.leftMargin = 0;
        marginLayoutParams4.topMargin = a3;
        marginLayoutParams4.rightMargin = 0;
        marginLayoutParams4.bottomMargin = 0;
        msgPartSnippetView8.f.setLayoutParams(marginLayoutParams4);
        MsgPartSnippetView msgPartSnippetView9 = this.d;
        if (msgPartSnippetView9 == null) {
            msgPartSnippetView9 = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) msgPartSnippetView9.g.getLayoutParams();
        marginLayoutParams5.leftMargin = 0;
        marginLayoutParams5.topMargin = a3;
        marginLayoutParams5.rightMargin = 0;
        marginLayoutParams5.bottomMargin = 0;
        msgPartSnippetView9.g.setLayoutParams(marginLayoutParams5);
        MsgPartSnippetView msgPartSnippetView10 = this.d;
        if (msgPartSnippetView10 == null) {
            msgPartSnippetView10 = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) msgPartSnippetView10.h.getLayoutParams();
        marginLayoutParams6.leftMargin = 0;
        marginLayoutParams6.topMargin = a3;
        marginLayoutParams6.rightMargin = 0;
        marginLayoutParams6.bottomMargin = 0;
        msgPartSnippetView10.h.setLayoutParams(marginLayoutParams6);
        MsgPartSnippetView msgPartSnippetView11 = this.d;
        if (msgPartSnippetView11 == null) {
            msgPartSnippetView11 = null;
        }
        msgPartSnippetView11.k();
        if (!dhr0.L()) {
            MsgPartSnippetView msgPartSnippetView12 = this.d;
            if (msgPartSnippetView12 == null) {
                msgPartSnippetView12 = null;
            }
            msgPartSnippetView12.setMerchantLogoTint(ColorStateList.valueOf(context.getColor(R.color.vk_gray_100)));
        }
        MsgPartSnippetView msgPartSnippetView13 = this.d;
        if (msgPartSnippetView13 == null) {
            msgPartSnippetView13 = null;
        }
        int a4 = iah0.a(8.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) msgPartSnippetView13.l.getLayoutParams();
        marginLayoutParams7.leftMargin = 0;
        marginLayoutParams7.topMargin = a4;
        marginLayoutParams7.rightMargin = 0;
        marginLayoutParams7.bottomMargin = 0;
        msgPartSnippetView13.l.setLayoutParams(marginLayoutParams7);
        MsgPartSnippetView msgPartSnippetView14 = this.d;
        if (msgPartSnippetView14 == null) {
            return null;
        }
        return msgPartSnippetView14;
    }

    @Override // xsna.hr30
    public final void r() {
        this.h = null;
        this.i = null;
    }
}
