package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.vk.music.bottomsheets.di.MusicBottomSheetComponent;
import com.vk.music.bottomsheets.promo.presentation.model.PromoInfo;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dw20;
import xsna.gm50;
import xsna.mk50;
import xsna.o4e0;
import xsna.xn50;

/* compiled from: MusicPromoModalBottomSheet.kt */
/* loaded from: classes3.dex */
public final class p250 extends tl50<b5e0, f6e0, o4e0> implements w8i {
    public static final /* synthetic */ int j1 = 0;
    public y5e0 i1;

    /* compiled from: MusicPromoModalBottomSheet.kt */
    public static final class a extends dw20.b {
        public final Bundle e;

        public a(Activity activity, int i, PromoInfo promoInfo, String str) {
            super(activity, new o250(i, str));
            this.e = yfb.b(new Pair("KEY_PROMO_ID", Integer.valueOf(i)), new Pair("KEY_PROMO_INFO", promoInfo));
            N0();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            p250 p250Var = new p250();
            p250Var.setArguments(this.e);
            return p250Var;
        }
    }

    /* compiled from: MusicPromoModalBottomSheet.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<o4e0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(o4e0 o4e0Var) {
            p250 p250Var = (p250) this.receiver;
            p250Var.getClass();
            xn50.a.c(p250Var, o4e0Var);
            return s3q0.a;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        Context requireContext = requireContext();
        b bVar = new b(1, this, p250.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalStateException("KEY_PROMO_ID is required");
        }
        this.i1 = new y5e0(requireContext, this, bVar, arguments.getInt("KEY_PROMO_ID"));
        y5e0 y5e0Var = this.i1;
        if (y5e0Var == null) {
            y5e0Var = null;
        }
        this.e0 = new jgj(y5e0Var.e, 0, cn70.b(375), 42);
        y5e0 y5e0Var2 = this.i1;
        return new mk50.c((y5e0Var2 != null ? y5e0Var2 : null).e);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        gm50.a.b(this, ((f6e0) ao50Var).a, new ut30(this, 2));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((b5e0) vk50Var).g.a(new h630(this, 5), this);
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalStateException("KEY_PROMO_ID is required");
        }
        xn50.a.c(this, new o4e0.a(arguments.getInt("KEY_PROMO_ID"), true));
        super.onDismiss(dialogInterface);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Object parcelable;
        PromoInfo promoInfo = null;
        if (Build.VERSION.SDK_INT < 33) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                promoInfo = (PromoInfo) arguments.getParcelable("KEY_PROMO_INFO");
            }
        } else {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                parcelable = arguments2.getParcelable("KEY_PROMO_INFO", PromoInfo.class);
                promoInfo = (PromoInfo) parcelable;
            }
        }
        if (promoInfo == null) {
            throw new IllegalStateException("KEY_PROMO_INFO is required");
        }
        return new b5e0(new x5e0(new c6e0(promoInfo)), ((MusicBottomSheetComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(MusicBottomSheetComponent.class))).O3());
    }
}
