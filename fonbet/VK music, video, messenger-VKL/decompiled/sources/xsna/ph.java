package xsna;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.search.params.impl.presentation.modal.database.mvi.model.SearchDatabaseState;
import com.vk.search.params.impl.presentation.modal.database.mvi.model.a;
import com.vk.search.params.impl.presentation.modal.database.mvi.model.b;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.gm50;
import xsna.ify;
import xsna.mk50;
import xsna.uph0;

/* compiled from: AbstractSearchDatabaseDialog.kt */
/* loaded from: classes5.dex */
public abstract class ph<Item extends Parcelable> extends tl50<lph0<Item>, com.vk.search.params.impl.presentation.modal.database.mvi.model.b<Item>, bph0> implements ify.a {
    public static final /* synthetic */ qcy<Object>[] n1 = {new MutablePropertyReference1Impl(ph.class, "contentView", "getContentView()Lcom/vk/mvi/compose/MviComposeView;", 0), p5j.a(0, ph.class, "renderHolder", "getRenderHolder()Lcom/vk/mvi/compose/render/ComposeStateRenderHolder;", fpf0.a)};
    public bqh0 l1;
    public final Object i1 = msy.a(LazyThreadSafetyMode.NONE, new nh(0));
    public final nf3 j1 = new nf3();
    public final nf3 k1 = new nf3();
    public final bpn0 m1 = new bpn0(new g(0, this, ph.class, "createTextsConfig", "createTextsConfig()Lcom/vk/search/params/impl/presentation/modal/database/config/SearchDatabaseTextsConfig;", 0));

    /* compiled from: AbstractSearchDatabaseDialog.kt */
    public final class a extends ModalBottomSheetBehavior.d {
        public final ModalBottomSheetBehavior.d a;

        public a(ModalBottomSheetBehavior.d dVar) {
            this.a = dVar;
        }

        @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
        public final void a(View view, float f) {
            bqh0 bqh0Var = ph.this.l1;
            if (bqh0Var != null) {
                bqh0Var.a();
            }
            ModalBottomSheetBehavior.d dVar = this.a;
            if (dVar != null) {
                dVar.a(view, f);
            }
        }

        @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
        public final void b(int i, View view) {
            if (i == 1 || i == 4) {
                mhy.d(view);
            }
            ModalBottomSheetBehavior.d dVar = this.a;
            if (dVar != null) {
                dVar.b(i, view);
            }
        }
    }

    /* compiled from: AbstractSearchDatabaseDialog.kt */
    public static abstract class b extends vwh0 {
        public b(Context context) {
            super(context, null);
            c(new a470());
            J();
        }
    }

    /* compiled from: AbstractSearchDatabaseDialog.kt */
    public static abstract class c extends uwh0 {
        public c(Context context, boolean z) {
            super(context, new twh0());
            x(0);
            F0(true);
            q(true);
            if (z) {
                c(new a470());
            } else {
                c(new cpo(false, 0, 7));
            }
        }
    }

    /* compiled from: AbstractSearchDatabaseDialog.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<uph0<? extends Item>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Object obj) {
            uph0 uph0Var = (uph0) obj;
            ph phVar = (ph) this.receiver;
            qcy<Object>[] qcyVarArr = ph.n1;
            phVar.getClass();
            if (!(uph0Var instanceof uph0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            phVar.no(phVar.go((uph0.a) uph0Var));
            return s3q0.a;
        }
    }

    /* compiled from: AbstractSearchDatabaseDialog.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<String, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(String str) {
            String str2 = str;
            bqh0 bqh0Var = (bqh0) this.receiver;
            EditText editView = bqh0Var.c.getEditView();
            Editable text = editView.getText();
            if (!epx.f(str2, text != null ? text.toString() : null)) {
                bqh0Var.m = true;
                editView.setText(str2);
                bqh0Var.m = false;
            }
            return s3q0.a;
        }
    }

    /* compiled from: AbstractSearchDatabaseDialog.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<List<? extends hfz>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(List<? extends hfz> list) {
            ((bqh0) this.receiver).b.setItems(list);
            return s3q0.a;
        }
    }

    /* compiled from: AbstractSearchDatabaseDialog.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements gzs<vph0> {
        @Override // xsna.gzs
        public final vph0 invoke() {
            return ((ph) this.receiver).co();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final mk50 Fl() {
        if (!((Boolean) this.i1.getValue()).booleanValue()) {
            View inflate = getLayoutInflater().inflate(R.layout.search_params_database_param_dialog, (ViewGroup) null);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.search_params_items);
            if (recyclerView != null) {
                recyclerView.addOnScrollListener(new rh());
            }
            return new mk50.c(inflate);
        }
        xqi xqiVar = new xqi(b.a.d.a, this, e43.l(getFeature().g().a, getFeature().g().d, getFeature().g().b, getFeature().g().c, getFeature().g().e));
        qcy<Object>[] qcyVarArr = n1;
        qcy<Object> qcyVar = qcyVarArr[1];
        nf3 nf3Var = this.k1;
        nf3Var.c = xqiVar;
        zph0 zph0Var = new zph0(this, requireContext(), (xqi) nf3Var.getValue(this, qcyVar), (vph0) this.m1.getValue(), new mh(this, 0), new qh(0, this, ph.class, "onCustomActionClick", "onCustomActionClick()V", 0));
        qcy<Object> qcyVar2 = qcyVarArr[0];
        nf3 nf3Var2 = this.j1;
        nf3Var2.c = zph0Var;
        return new mk50.c(((kk50) nf3Var2.getValue(this, qcyVar2)).c());
    }

    public final eph0 bo(fph0 fph0Var) {
        return new eph0(new sph0(new SearchDatabaseState(ho(), 27), fo()), new pph0(eo()), fph0Var);
    }

    public abstract vph0 co();

    public abstract tph0<Item> eo();

    public abstract jph0<Item> fo();

    public Object go(uph0.a<Item> aVar) {
        return aVar.a;
    }

    public com.vk.search.params.impl.presentation.modal.database.mvi.model.a<Item> ho() {
        return a.c.a;
    }

    @Override // xsna.tl50, xsna.xn50
    /* renamed from: io, reason: merged with bridge method [inline-methods] */
    public void R4(lph0<Item> lph0Var) {
        lph0Var.x().a(new d(1, this, ph.class, "handleSideEffect", "handleSideEffect(Lcom/vk/search/params/impl/presentation/modal/database/mvi/model/SearchDatabaseSideEffect;)V", 0), this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    /* renamed from: jo, reason: merged with bridge method [inline-methods] */
    public void Jh(com.vk.search.params.impl.presentation.modal.database.mvi.model.b<Item> bVar, View view) {
        if (((Boolean) this.i1.getValue()).booleanValue()) {
            ((kk50) this.j1.getValue(this, n1[0])).f(bVar, new com.vk.movika.sdk.base.observable.k(this, 1));
            return;
        }
        int i = 1;
        bqh0 bqh0Var = new bqh0(view, lo(new u8(this, 1), new defpackage.j(this, 3), new w8(this, 1)), co(), new e5(this, i), new ac(this, i), new f5(this, i));
        this.l1 = bqh0Var;
        gm50.a.b(this, bVar.a, new defpackage.o(1, this, bqh0Var));
        gm50.a.b(this, bVar.c, new lh(0, this, bqh0Var));
        int i2 = 1;
        gm50.a.b(this, bVar.d, new com.vk.movika.sdk.base.observable.m(bqh0Var, i2));
        gm50.a.b(this, bVar.e, new com.vk.movika.sdk.base.observable.q(bqh0Var, i2));
        gm50.a.b(this, bVar.b, new tb(bqh0Var, 1));
    }

    public lph0 ko() {
        return bo(new cml());
    }

    public gph0 lo(u8 u8Var, defpackage.j jVar, w8 w8Var) {
        return new gph0(u8Var, jVar, null);
    }

    public final void no(Object obj) {
        String string = requireArguments().getString("request_key");
        if (string == null) {
            throw new IllegalArgumentException("Request key (request_key) must be specified");
        }
        getParentFragmentManager().k0(yfb.b(new Pair("database_result", obj)), string);
        this.g0 = null;
        dismiss();
    }

    @Override // xsna.tl50, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.I = getString(((vph0) this.m1.getValue()).a);
        this.i0 = new a(this.i0);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        int i = ify.a;
        ify.g(this);
        this.l1 = null;
    }

    @Override // xsna.ify.a
    public final void x0(int i) {
        Dialog dialog = this.s;
        nw20 nw20Var = dialog instanceof nw20 ? (nw20) dialog : null;
        if (nw20Var == null) {
            return;
        }
        i0q0.d(100L, new oh(nw20Var, 0));
    }

    public /* bridge */ /* synthetic */ vk50 x8(Bundle bundle, km50 km50Var) {
        return ko();
    }

    @Override // xsna.tl50, xsna.dw20, xsna.c33, androidx.fragment.app.d
    public Dialog yn(Bundle bundle) {
        int i = ify.a;
        ify.a(this);
        return super.yn(bundle);
    }

    @Override // xsna.ify.a
    public final void Y0() {
    }

    public void mo() {
    }
}
