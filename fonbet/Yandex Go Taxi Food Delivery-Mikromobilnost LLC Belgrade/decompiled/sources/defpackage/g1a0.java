package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.yandex.go.payments.common.PaymentImageLoader$initBanksIcons$$inlined$safeCollectIn$1;
import com.yandex.go.payments.common.a;
import com.yandex.go.payments.paymentlist.ui.IconType;
import java.util.WeakHashMap;
import java.util.function.Function;
import ru.yandex.taxi.design.ClickableImageView;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class g1a0 implements z0a0 {
    public final tma0 a;
    public final pav b;
    public final k7x0 c;
    public final u0a0 d;
    public final WeakHashMap e = new WeakHashMap();
    public final WeakHashMap f = new WeakHashMap();
    public final hbp0 g = new hbp0(new czo0(14), "", null);
    public pzt0 h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;

    public g1a0(zuj0 zuj0Var, tma0 tma0Var, pav pavVar, k7x0 k7x0Var, u0a0 u0a0Var) {
        this.a = tma0Var;
        this.b = pavVar;
        this.c = k7x0Var;
        this.d = u0a0Var;
        avj0 avj0Var = (avj0) zuj0Var;
        this.i = avj0Var.c(utg0.bank_icon_width);
        this.j = avj0Var.c(utg0.bank_icon_height);
        this.k = avj0Var.c(utg0.sbp_token_icon_width);
        this.l = avj0Var.c(utg0.sbp_token_icon_height);
    }

    public final void a() {
        hbp0 hbp0Var = this.g;
        hbp0Var.a();
        pzt0 pzt0Var = this.h;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            this.h = tje.N(hbp0Var, null, null, new PaymentImageLoader$initBanksIcons$$inlined$safeCollectIn$1(((uma0) this.a).a.b(), null, this), 3);
        }
    }

    public final void b(ImageView imageView, t0a0 t0a0Var) {
        boolean z = t0a0Var instanceof n0a0;
        WeakHashMap weakHashMap = this.e;
        tma0 tma0Var = this.a;
        if (z) {
            String str = t0a0Var.a;
            Function function = t0a0Var.b;
            if (str == null) {
                weakHashMap.remove(imageView);
                imageView.setImageDrawable((Drawable) function.apply(imageView.getContext()));
                return;
            }
            weakHashMap.put(imageView, t0a0Var);
            Context context = imageView.getContext();
            Integer valueOf = Integer.valueOf(this.i);
            Integer valueOf2 = Integer.valueOf(this.j);
            uma0 uma0Var = (uma0) tma0Var;
            String a = uma0Var.a.a(str);
            uma0Var.c.getClass();
            Bitmap a2 = jq4.a(context, a, valueOf, valueOf2, true);
            if (a2 == null) {
                imageView.setImageDrawable((Drawable) function.apply(imageView.getContext()));
                return;
            } else {
                imageView.setImageBitmap(a2);
                return;
            }
        }
        boolean z2 = t0a0Var instanceof p0a0;
        WeakHashMap weakHashMap2 = this.f;
        if (z2) {
            String str2 = t0a0Var.a;
            Function function2 = t0a0Var.b;
            if (str2 == null) {
                weakHashMap2.remove(imageView);
                imageView.setImageDrawable((Drawable) function2.apply(imageView.getContext()));
                return;
            }
            weakHashMap2.put(imageView, t0a0Var);
            Context context2 = imageView.getContext();
            Integer valueOf3 = Integer.valueOf(this.k);
            Integer valueOf4 = Integer.valueOf(this.l);
            uma0 uma0Var2 = (uma0) tma0Var;
            String c = uma0Var2.a.c(str2);
            uma0Var2.c.getClass();
            Bitmap a3 = jq4.a(context2, c, valueOf3, valueOf4, false);
            if (a3 == null) {
                imageView.setImageDrawable((Drawable) function2.apply(imageView.getContext()));
                return;
            } else {
                imageView.setImageBitmap(a3);
                return;
            }
        }
        if (t0a0Var instanceof s0a0) {
            String str3 = t0a0Var.a;
            Function function3 = t0a0Var.b;
            s0a0 s0a0Var = (s0a0) t0a0Var;
            int b = s0a0Var.b();
            int a4 = s0a0Var.a();
            weakHashMap.remove(imageView);
            weakHashMap2.remove(imageView);
            if (str3 == null || evu0.J(str3)) {
                imageView.setImageDrawable((Drawable) function3.apply(imageView.getContext()));
                return;
            }
            nac nacVar = (nac) this.b.a(imageView);
            nacVar.i = new l2z(9, imageView, function3);
            nacVar.f(b, a4);
            nacVar.c(str3);
            return;
        }
        if (t0a0Var instanceof r0a0) {
            String str4 = t0a0Var.a;
            Function function4 = t0a0Var.b;
            r0a0 r0a0Var = (r0a0) t0a0Var;
            f(imageView, str4, function4, r0a0Var.c, r0a0Var.d, r0a0Var.e);
            return;
        }
        if (t0a0Var instanceof q0a0) {
            weakHashMap.remove(imageView);
            weakHashMap2.remove(imageView);
            imageView.setImageDrawable((Drawable) t0a0Var.b.apply(imageView.getContext()));
        } else {
            if (!jl40.l(t0a0Var, o0a0.c)) {
                w511.b();
                return;
            }
            weakHashMap.remove(imageView);
            weakHashMap2.remove(imageView);
            imageView.setImageDrawable(null);
        }
    }

    public final void c(ImageView imageView, lea0 lea0Var) {
        b(imageView, ((a) this.d).d(lea0Var));
    }

    public final void d() {
        this.g.b();
        this.e.clear();
        this.f.clear();
    }

    public final void e(ClickableImageView clickableImageView, PaymentMethod$Type paymentMethod$Type) {
        IconType iconType;
        if (paymentMethod$Type == PaymentMethod$Type.SHARED) {
            jst.e.j(new IllegalArgumentException("sharedAccountType is null"));
            return;
        }
        switch (f1a0.a[paymentMethod$Type.ordinal()]) {
            case 1:
                iconType = IconType.CASH;
                break;
            case 2:
                iconType = IconType.GENERIC_CARD;
                break;
            case 3:
                iconType = IconType.CORP;
                break;
            case 4:
                iconType = IconType.GOOGLE_PAY;
                break;
            case 5:
                iconType = IconType.PERSONAL_WALLET;
                break;
            case 6:
                iconType = IconType.CARGO_CORP;
                break;
            case 7:
                iconType = IconType.SBP_TOKEN;
                break;
            case 8:
                iconType = IconType.YANGO_WALLET;
                break;
            case 9:
                iconType = IconType.CASH_LIKE;
                break;
            default:
                iconType = null;
                break;
        }
        if (iconType != null) {
            clickableImageView.setImageResource(iconType.getResourceId());
            return;
        }
        jst.e.j(new IllegalArgumentException("Unknown payment type " + paymentMethod$Type));
    }

    public final void f(final ImageView imageView, String str, final Function function, final int i, final int i2, final String str2) {
        this.e.remove(imageView);
        this.f.remove(imageView);
        if (str == null || evu0.J(str)) {
            if (str2 == null || evu0.J(str2)) {
                imageView.setImageDrawable((Drawable) function.apply(imageView.getContext()));
                return;
            } else {
                f(imageView, str2, function, i, i2, null);
                return;
            }
        }
        String a = ((m7x0) this.c).a(str);
        pav pavVar = this.b;
        if (str2 == null || evu0.J(str2)) {
            nac nacVar = (nac) pavVar.a(imageView);
            nacVar.i = new l2z(9, imageView, function);
            nacVar.f(i, i2);
            nacVar.c(a);
            return;
        }
        nac nacVar2 = (nac) pavVar.a(imageView);
        nacVar2.i = new sls() { // from class: d1a0
            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                int i4 = i2;
                g1a0 g1a0Var = this;
                ImageView imageView2 = imageView;
                imageView2.post(new e1a0(i3, i4, g1a0Var, imageView2, str2, function));
                return zy11.a;
            }
        };
        nacVar2.f(i, i2);
        nacVar2.c(a);
    }
}
