package xsna;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.dw20;
import xsna.gm50;
import xsna.ify;
import xsna.mk50;

/* compiled from: CityParameterDialog.kt */
@ozl
/* loaded from: classes5.dex */
public final class rec extends tl50<tec, gfc, pec> implements ify.a {
    public static final /* synthetic */ int j1 = 0;
    public ffc i1;

    /* compiled from: CityParameterDialog.kt */
    public final class a extends ModalBottomSheetBehavior.d {
        public final ModalBottomSheetBehavior.d a;

        public a(ModalBottomSheetBehavior.d dVar) {
            this.a = dVar;
        }

        @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
        public final void a(View view, float f) {
            ffc ffcVar = rec.this.i1;
            if (ffcVar != null) {
                ffcVar.a();
            }
            ModalBottomSheetBehavior.d dVar = this.a;
            if (dVar != null) {
                dVar.a(view, f);
            }
        }

        @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
        public final void b(int i, View view) {
            if (i == 4) {
                mhy.d(view);
            }
            ModalBottomSheetBehavior.d dVar = this.a;
            if (dVar != null) {
                dVar.b(i, view);
            }
        }
    }

    /* compiled from: CityParameterDialog.kt */
    @ozl
    public static final class b extends dw20.b {
        public String e;

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            rec recVar = new rec();
            recVar.setArguments(yfb.b(new Pair("request_key", this.e)));
            return recVar;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.search_params_city_param_dialog);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        gfc gfcVar = (gfc) ao50Var;
        ffc ffcVar = new ffc(view, new l5(this, 17), new po1(this, 15), new com.vk.movika.sdk.base.presenter.b(this, 9));
        this.i1 = ffcVar;
        gm50.a.b(this, gfcVar.a, new s53(6, this, ffcVar));
        gm50.a.b(this, gfcVar.c, new defpackage.y(3, this, ffcVar));
        gm50.a.b(this, gfcVar.d, new com.vk.newsfeed.posting.impl.presentation.base.fragment.a(ffcVar, 16));
        gm50.a.b(this, gfcVar.e, new e1(ffcVar, 22));
        gm50.a.b(this, gfcVar.b, new k9(ffcVar, 25));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((tec) vk50Var).h.a(new kf8(1, this, rec.class, "handleSideEffect", "handleSideEffect(Lcom/vk/search/params/impl/presentation/modal/city/mvi/CityParameterSideEffect;)V", 0, 2), this);
    }

    @Override // xsna.tl50, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.I = getString(R.string.search_params_city_title);
        this.i0 = new a(this.i0);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        int i = ify.a;
        ify.g(this);
        this.i1 = null;
    }

    @Override // xsna.ify.a
    public final void x0(int i) {
        Dialog dialog = this.s;
        nw20 nw20Var = dialog instanceof nw20 ? (nw20) dialog : null;
        if (nw20Var == null) {
            return;
        }
        i0q0.d(100L, new tn9(nw20Var, 2));
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        kec kecVar = new kec(new edi(9));
        new emi(7);
        fr9 fr9Var = new fr9();
        fr9Var.b = kecVar;
        return new tec(new afc(new cfc(0)), new hfc(fr9Var), new jfc());
    }

    @Override // xsna.tl50, xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        int i = ify.a;
        ify.a(this);
        return super.yn(bundle);
    }

    @Override // xsna.ify.a
    public final void Y0() {
    }
}
