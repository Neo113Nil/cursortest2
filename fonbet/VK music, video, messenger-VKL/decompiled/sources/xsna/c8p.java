package xsna;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.vk.search.params.api.City;
import com.vk.search.params.api.domain.model.education.EducationParam;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.EducationState;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.a;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.d;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.c8p;
import xsna.gm50;
import xsna.mk50;

/* compiled from: EducationParameterDialog.kt */
/* loaded from: classes5.dex */
public final class c8p extends tl50<q7p, com.vk.search.params.impl.presentation.modal.education.mvi.model.d, com.vk.search.params.impl.presentation.modal.education.mvi.model.a> {
    public nqh0 l1;
    public static final /* synthetic */ qcy<Object>[] o1 = {new MutablePropertyReference1Impl(c8p.class, "contentView", "getContentView()Lcom/vk/search/params/impl/presentation/modal/education/view/EducationFilterBottomSheetContent;", 0), p5j.a(0, c8p.class, "renderHolder", "getRenderHolder()Lcom/vk/mvi/compose/render/ComposeStateRenderHolder;", fpf0.a)};
    public static final b n1 = new b();
    public final Object i1 = msy.a(LazyThreadSafetyMode.NONE, new uw3(14));
    public final nf3 j1 = new nf3();
    public final nf3 k1 = new nf3();
    public mnk m1 = new mnk();

    /* compiled from: EducationParameterDialog.kt */
    public static final class a extends vwh0 {
        public EducationParam f;
        public City g;
        public nqh0 h;

        public a(Context context) {
            super(context, null);
            c(new cpo(false, 0, 7));
            J();
        }

        @Override // xsna.vwh0
        public final void S0(Bundle bundle) {
            City city;
            EducationParam educationParam = this.f;
            if (educationParam != null) {
                bundle.putParcelable("initial_value", educationParam);
            }
            if (this.f != null || (city = this.g) == null) {
                return;
            }
            bundle.putParcelable("initial_city", city);
        }

        @Override // xsna.vwh0
        public final dw20 T0() {
            c8p c8pVar = new c8p();
            Bundle bundle = new Bundle();
            S0(bundle);
            c8pVar.setArguments(bundle);
            c8pVar.l1 = this.h;
            return c8pVar;
        }
    }

    /* compiled from: EducationParameterDialog.kt */
    public static final class b {
        public static EducationParam a(Bundle bundle) {
            Parcelable parcelable;
            Object parcelable2;
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = bundle.getParcelable("database_result", EducationParam.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = bundle.getParcelable("database_result");
                if (!(parcelable3 instanceof EducationParam)) {
                    parcelable3 = null;
                }
                parcelable = (EducationParam) parcelable3;
            }
            return (EducationParam) parcelable;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        if (!bo()) {
            return new mk50.b(R.layout.search_params_education_param_dialog);
        }
        qcy<Object>[] qcyVarArr = o1;
        r7p r7pVar = new r7p(this, requireContext(), (xqi) this.k1.getValue(this, qcyVarArr[1]));
        qcy<Object> qcyVar = qcyVarArr[0];
        nf3 nf3Var = this.j1;
        nf3Var.c = r7pVar;
        return new mk50.c(((r7p) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        com.vk.search.params.impl.presentation.modal.education.mvi.model.d dVar = (com.vk.search.params.impl.presentation.modal.education.mvi.model.d) ao50Var;
        if (bo()) {
            ((r7p) this.j1.getValue(this, o1[0])).f(dVar, new kf8(1, this, c8p.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 5));
            return;
        }
        gm50.a.b(this, dVar.b, new nm1(10, this, new k8p(view, new eoh(1, getFeature(), q7p.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0, 1))));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        getParentFragmentManager().l0("education_city_request", this, new b9(this, 16));
        getParentFragmentManager().l0("education_school_request", this, new rj4(this, 11));
        getParentFragmentManager().l0("education_university_request", this, new d9(this, 11));
        ((q7p) vk50Var).g.a(new bhh(this, 12), this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean bo() {
        return ((Boolean) this.i1.getValue()).booleanValue();
    }

    public final void co(dw20 dw20Var) {
        nqh0 nqh0Var = this.l1;
        if (nqh0Var != null) {
            nqh0Var.a(dw20Var);
        } else {
            dw20Var.Td(getParentFragmentManager(), null);
        }
    }

    @Override // xsna.tl50, androidx.fragment.app.Fragment, xsna.gm50
    public final f5z getViewOwner() {
        return this.m1;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (bo()) {
            ((r7p) this.j1.getValue(this, o1[0])).d.s();
        }
        super.onDestroyView();
        mnk mnkVar = this.m1;
        mnkVar.b.e(Lifecycle.State.DESTROYED);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Parcelable parcelable2;
        Object parcelable3;
        Object parcelable4;
        Bundle requireArguments = requireArguments();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            parcelable4 = requireArguments.getParcelable("initial_value", EducationParam.class);
            parcelable = (Parcelable) parcelable4;
        } else {
            Parcelable parcelable5 = requireArguments.getParcelable("initial_value");
            if (!(parcelable5 instanceof EducationParam)) {
                parcelable5 = null;
            }
            parcelable = (EducationParam) parcelable5;
        }
        EducationParam educationParam = (EducationParam) parcelable;
        Bundle requireArguments2 = requireArguments();
        if (i >= 33) {
            parcelable3 = requireArguments2.getParcelable("initial_city", City.class);
            parcelable2 = (Parcelable) parcelable3;
        } else {
            Parcelable parcelable6 = requireArguments2.getParcelable("initial_city");
            if (!(parcelable6 instanceof City)) {
                parcelable6 = null;
            }
            parcelable2 = (City) parcelable6;
        }
        a.g gVar = educationParam != null ? new a.g(educationParam, null, 2) : new a.g(null, (City) parcelable2, 1);
        o8p o8pVar = new o8p(new EducationState(null, null, null, 127));
        q7p q7pVar = new q7p(gVar, o8pVar, new slk());
        if (bo()) {
            d.b.C1771b c1771b = d.b.C1771b.a;
            mnk mnkVar = this.m1;
            VS vs = o8pVar.b;
            xqi xqiVar = new xqi(c1771b, mnkVar, e43.l(((com.vk.search.params.impl.presentation.modal.education.mvi.model.d) vs).a, ((com.vk.search.params.impl.presentation.modal.education.mvi.model.d) vs).b));
            qcy<Object> qcyVar = o1[1];
            this.k1.c = xqiVar;
        }
        return q7pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [xsna.b8p, xsna.e5z] */
    @Override // xsna.tl50, xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        this.I = getText(R.string.search_params_education_title);
        this.R = getString(R.string.clear);
        this.S = new lwh(this, 7);
        i0q0.f(new i5f(this, 19));
        if (this.m1.b.d == Lifecycle.State.DESTROYED) {
            this.m1 = new mnk();
        }
        final mnk mnkVar = this.m1;
        Lifecycle lifecycle = getLifecycle();
        ?? r2 = new androidx.lifecycle.l() { // from class: xsna.b8p
            @Override // androidx.lifecycle.l
            public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
                c8p.b bVar = c8p.n1;
                Lifecycle.State h = event.h();
                if (h.compareTo(Lifecycle.State.CREATED) >= 0) {
                    mnk.this.b.e(h);
                }
            }
        };
        lifecycle.addObserver(r2);
        mnkVar.b.addObserver(new i8p(lifecycle, r2, mnkVar));
        return super.yn(bundle);
    }
}
