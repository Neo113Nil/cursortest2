package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.yandex.payment.divkit.BankNameForMethod;
import com.yandex.payment.divkit.StringMethod;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class dcq0 implements gtk {
    public final boolean a;
    public final Context b;

    public dcq0(Context context, boolean z) {
        this.a = z;
        this.b = context.getApplicationContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x02fc, code lost:
    
        if (r5 != 0) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02fe, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0314, code lost:
    
        if (r5 != 0) goto L163;
     */
    @Override // defpackage.gtk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hxy loadImage(String str, btk btkVar) {
        Integer valueOf;
        Integer valueOf2;
        Uri parse = Uri.parse(str);
        boolean l = jl40.l(parse.getScheme(), "local-image");
        Executor executor = ph91.a;
        final int i = 1;
        Context context = this.b;
        if (!l) {
            p5j0 H = Glide.with(context).asBitmap().J(parse).H(new tht(btkVar, new pht(3, parse), 1));
            final xe60 xe60Var = new xe60();
            H.F(xe60Var, null, H, executor);
            return new hxy(this) { // from class: bcq0
                public final /* synthetic */ dcq0 b;

                {
                    this.b = this;
                }

                @Override // defpackage.hxy
                public final void cancel() {
                    int i2 = i;
                    xe60 xe60Var2 = xe60Var;
                    dcq0 dcq0Var = this.b;
                    switch (i2) {
                        case 0:
                            Glide.with(dcq0Var.b).clear(xe60Var2);
                            break;
                        default:
                            Glide.with(dcq0Var.b).clear(xe60Var2);
                            break;
                    }
                }
            };
        }
        String host = parse.getHost();
        if (host == null) {
            host = "";
        }
        boolean h = i891.h(context.getTheme(), ong0.paymentsdk_is_light_theme, true);
        int i2 = host.equals(StringMethod.YB.getValue()) ? zwg0.paymentsdk_divkit_yb : host.equals(StringMethod.NEW_CARD_LIGHT.getValue()) ? zwg0.paymentsdk_divkit_add_card : host.equals(StringMethod.NEW_CARD_DARK.getValue()) ? zwg0.paymentsdk_divkit_add_card : (host.equals(StringMethod.SBP.getValue()) || host.equals(StringMethod.NEW_SBP_TOKEN.getValue())) ? this.a ? h ? zwg0.ic_unknown_light_theme : zwg0.ic_unknown_black_theme : zwg0.paymentsdk_divkit_sbp_icon : host.equals(BankNameForMethod.TINKOFF.getValue()) ? zwg0.paymentsdk_divkit_tinkoff : host.equals(BankNameForMethod.ALPHA_BANK.getValue()) ? zwg0.paymentsdk_divkit_alfabank : host.equals(BankNameForMethod.SBERBANK.getValue()) ? zwg0.paymentsdk_divkit_sber : host.equals(BankNameForMethod.VTB.getValue()) ? zwg0.paymentsdk_divkit_vtb : host.equals(BankNameForMethod.GAZPROM.getValue()) ? zwg0.paymentsdk_divkit_gazprom : host.equals(BankNameForMethod.OPEN_BANK.getValue()) ? zwg0.paymentsdk_divkit_otkritye : host.equals(BankNameForMethod.ROSBANK.getValue()) ? zwg0.paymentsdk_divkit_rosbank : host.equals(BankNameForMethod.UNICREDIT_BANK.getValue()) ? zwg0.paymentsdk_divkit_unicredit : host.equals(BankNameForMethod.RAIFFEISEN_BANK.getValue()) ? zwg0.paymentsdk_divkit_raif : h ? zwg0.ic_unknown_light_theme : zwg0.ic_unknown_black_theme;
        if (host.equals("selected")) {
            valueOf = Integer.valueOf(zwg0.paymentsdk_divkit_ic_selected);
        } else if (host.equals("unselected")) {
            valueOf = Integer.valueOf(i891.h(context.getTheme(), ong0.paymentsdk_is_light_theme, true) ? zwg0.ic_unselected_light_theme : zwg0.ic_unselected_black_theme);
        } else if (host.equals("link_light") || host.equals("link_dark")) {
            valueOf = Integer.valueOf(zwg0.paymentsdk_ic_link);
        } else if (host.equals("right_arrow_light_theme")) {
            valueOf = Integer.valueOf(zwg0.paymentsdk_divkit_arrow_short_forward_black);
        } else if (host.equals("right_arrow_dark_theme")) {
            valueOf = Integer.valueOf(zwg0.paymentsdk_divkit_arrow_short_forward_white);
        } else if (host.equals("arrow_short_forward")) {
            valueOf = Integer.valueOf(zwg0.paymentsdk_divkit_arrow_short_forward);
        } else if (host.equals("close_dark")) {
            valueOf = Integer.valueOf(zwg0.paymentsdk_divkit_ic_close_white);
        } else if (host.equals("close_light")) {
            valueOf = Integer.valueOf(zwg0.paymentsdk_divkit_ic_close_black);
        } else if (host.equals("navbar_back_dark")) {
            valueOf = Integer.valueOf(zwg0.paymentsdk_divkit_ic_back_dark);
        } else if (host.equals("navbar_back_light")) {
            valueOf = Integer.valueOf(zwg0.paymentsdk_divkit_ic_back_light);
        } else if (host.equals("plus_badge")) {
            valueOf = Integer.valueOf(zwg0.paymentsdk_yandex_services);
        } else if (host.equals("discount_badge_side")) {
            valueOf = Integer.valueOf(zwg0.paymentsdk_discount_badge_side);
        } else if (host.equals("ypay_light") || host.equals("ypay_dark") || host.equals("brand_light") || host.equals("brand_dark")) {
            TypedValue g = i891.g(context.getTheme(), ong0.paymentsdk_brandIcon);
            if (g != null) {
                int i3 = g.resourceId;
                valueOf2 = Integer.valueOf(i3);
            }
            valueOf = null;
        } else if (host.equals("warning_dark") || host.equals("warning_light")) {
            TypedValue g2 = i891.g(context.getTheme(), ong0.paymentsdk_warning_icon);
            if (g2 != null) {
                int i4 = g2.resourceId;
                valueOf2 = Integer.valueOf(i4);
            }
            valueOf = null;
        } else {
            valueOf = (host.equals("checked_dark") || host.equals("checked_light")) ? Integer.valueOf(zwg0.paymentsdk_divkit_ic_checked) : (host.equals("unchecked_dark") || host.equals("unchecked_light")) ? Integer.valueOf(zwg0.paymentsdk_divkit_ic_unchecked) : host.equals("unchecked_dark") ? Integer.valueOf(zwg0.paymentsdk_divkit_ic_unchecked) : host.equals("unchecked_light") ? Integer.valueOf(zwg0.paymentsdk_divkit_ic_unchecked) : (host.equals("nfc_light") || host.equals("nfc_dark")) ? Integer.valueOf(bxg0.paymentsdk_ic_nfc_full) : (host.equals("success_light") || host.equals("success_dark")) ? Integer.valueOf(zwg0.paymentsdk_divkit_ic_success) : host.equals("family_symbol") ? Integer.valueOf(zwg0.paymentsdk_divkit_ic_family) : host.equals("error_triangle") ? Integer.valueOf(zwg0.paymentsdk_divkit_error_triangle) : host.equals("error_cassa") ? Integer.valueOf(zwg0.paymentsdk_divkit_error_cassa) : host.equals("pad_lock_filled_light") ? Integer.valueOf(zwg0.paymentsdk_divkit_lock_light) : host.equals("pad_lock_filled_dark") ? Integer.valueOf(zwg0.paymentsdk_divkit_lock_dark) : Integer.valueOf(i2);
        }
        if (valueOf == null) {
            return new d7l();
        }
        p5j0 asBitmap = Glide.with(context).asBitmap();
        Resources resources = context.getResources();
        int intValue = valueOf.intValue();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = wuj0.a;
        Drawable drawable = resources.getDrawable(intValue, theme);
        final int i5 = 0;
        p5j0 p5j0Var = (p5j0) asBitmap.K(drawable != null ? ffx.d0(drawable, 0, 0, 7) : null).a(r7j0.A(exj.a)).u(new lp60(String.valueOf(System.currentTimeMillis())));
        if (host.equals("selected") || host.equals("unselected")) {
            p5j0Var = (p5j0) p5j0Var.o(zwg0.ic_unselected_light_theme);
        }
        p5j0 H2 = p5j0Var.H(new tht(btkVar, new pht(2, parse), 1));
        final xe60 xe60Var2 = new xe60();
        H2.F(xe60Var2, null, H2, executor);
        return new hxy(this) { // from class: bcq0
            public final /* synthetic */ dcq0 b;

            {
                this.b = this;
            }

            @Override // defpackage.hxy
            public final void cancel() {
                int i22 = i5;
                xe60 xe60Var22 = xe60Var2;
                dcq0 dcq0Var = this.b;
                switch (i22) {
                    case 0:
                        Glide.with(dcq0Var.b).clear(xe60Var22);
                        break;
                    default:
                        Glide.with(dcq0Var.b).clear(xe60Var22);
                        break;
                }
            }
        };
    }

    @Override // defpackage.gtk
    public final hxy loadImageBytes(String str, btk btkVar) {
        return loadImage(str, btkVar);
    }

    @Override // defpackage.gtk
    public final hxy loadImage(String str, ImageView imageView) {
        throw new IllegalStateException("not used");
    }
}
