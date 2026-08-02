package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.vk.location.common.LocationCommon;
import com.vk.search.params.api.City;
import com.vk.search.params.api.domain.model.SearchLocation;
import com.vk.search.params.impl.presentation.modal.database.mvi.model.a;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dyz;
import xsna.gm50;
import xsna.ph;
import xsna.tyz;
import xsna.uph0;

/* compiled from: LocationSearchDatabaseDialog.kt */
/* loaded from: classes5.dex */
public final class jyz extends lfc {
    public static final /* synthetic */ int r1 = 0;
    public final Object p1 = msy.a(LazyThreadSafetyMode.NONE, new lk(23));
    public final hb0<String[]> q1 = registerForActivityResult(new bb0(), new ua0() { // from class: xsna.gyz
        @Override // xsna.ua0
        public final void onActivityResult(Object obj) {
            int i = jyz.r1;
            jyz jyzVar = jyz.this;
            myz oo = jyzVar.oo();
            LocationCommon locationCommon = LocationCommon.a;
            Context requireContext = jyzVar.requireContext();
            locationCommon.getClass();
            oo.C(new dyz.g(LocationCommon.a(requireContext), LocationCommon.b(jyzVar.requireContext())));
        }
    });

    /* compiled from: LocationSearchDatabaseDialog.kt */
    public static final class a extends ph.b {
        public SearchLocation f;

        @Override // xsna.vwh0
        public final void S0(Bundle bundle) {
            SearchLocation searchLocation = this.f;
            if (searchLocation != null) {
                bundle.putParcelable("search_location", searchLocation);
            }
        }

        @Override // xsna.vwh0
        public final dw20 T0() {
            return new jyz();
        }
    }

    /* compiled from: LocationSearchDatabaseDialog.kt */
    public static final class b extends ph.c {
        public SearchLocation i;

        @Override // xsna.uwh0
        public final void V0(Bundle bundle) {
            SearchLocation searchLocation = this.i;
            if (searchLocation != null) {
                bundle.putParcelable("search_location", searchLocation);
            }
        }

        @Override // xsna.uwh0
        public final dw20 W0() {
            return new jyz();
        }
    }

    /* compiled from: LocationSearchDatabaseDialog.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<tyz, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(tyz tyzVar) {
            tyz tyzVar2 = tyzVar;
            jyz jyzVar = (jyz) this.receiver;
            int i = jyz.r1;
            jyzVar.getClass();
            if (epx.f(tyzVar2, tyz.e.a)) {
                LocationCommon locationCommon = LocationCommon.a;
                Context requireContext = jyzVar.requireContext();
                locationCommon.getClass();
                if (LocationCommon.a(requireContext)) {
                    jyzVar.oo().C(new dyz.g(true, LocationCommon.b(jyzVar.requireContext())));
                } else {
                    jyzVar.q1.a(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"});
                }
            } else if (epx.f(tyzVar2, tyz.d.a)) {
                String packageName = jyzVar.requireContext().getPackageName();
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", packageName, null));
                jyzVar.startActivity(intent);
            } else if (epx.f(tyzVar2, tyz.c.a)) {
                jyzVar.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            } else if (epx.f(tyzVar2, tyz.a.a)) {
                myz oo = jyzVar.oo();
                LocationCommon locationCommon2 = LocationCommon.a;
                Context requireContext2 = jyzVar.requireContext();
                locationCommon2.getClass();
                oo.C(new dyz.g(LocationCommon.a(requireContext2), LocationCommon.b(jyzVar.requireContext())));
            } else if (tyzVar2 instanceof tyz.f) {
                jyzVar.no(((tyz.f) tyzVar2).a);
            } else {
                if (!epx.f(tyzVar2, tyz.b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bqh0 bqh0Var = jyzVar.l1;
                if (bqh0Var != null) {
                    bqh0Var.c.d0();
                }
            }
            return s3q0.a;
        }
    }

    public static SearchLocation po(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("search_location", SearchLocation.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("search_location");
            if (!(parcelable3 instanceof SearchLocation)) {
                parcelable3 = null;
            }
            parcelable = (SearchLocation) parcelable3;
        }
        return (SearchLocation) parcelable;
    }

    @Override // xsna.lfc, xsna.ph
    public final vph0 co() {
        return new vph0(R.string.search_params_location_param_title);
    }

    @Override // xsna.lfc, xsna.ph
    public final jph0<City> fo() {
        return new vul(requireContext().getApplicationContext(), new oec(requireContext(), true, (Integer) null));
    }

    @Override // xsna.ph
    public final Object go(uph0.a<City> aVar) {
        City city = aVar.a;
        if (city != null) {
            return new SearchLocation.City(city);
        }
        return null;
    }

    @Override // xsna.lfc, xsna.ph
    public final com.vk.search.params.impl.presentation.modal.database.mvi.model.a<City> ho() {
        SearchLocation po = po(requireArguments());
        if (po instanceof SearchLocation.City) {
            return new a.b(((SearchLocation.City) po).b);
        }
        if (po instanceof SearchLocation.CurrentLocation) {
            return new a.C1764a(0);
        }
        if (po == null) {
            return a.c.a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.ph, xsna.tl50, xsna.xn50
    /* renamed from: io */
    public final void R4(lph0<City> lph0Var) {
        super.R4(lph0Var);
        oo().g.a(new c(1, this, jyz.class, "handleSideEffect", "handleSideEffect(Lcom/vk/search/params/impl/presentation/modal/location/mvi/model/LocationSearchSideEffect;)V", 0), this);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ph, xsna.xn50
    /* renamed from: jo */
    public final void Jh(com.vk.search.params.impl.presentation.modal.database.mvi.model.b<City> bVar, View view) {
        super.Jh(bVar, view);
        if (((Boolean) this.p1.getValue()).booleanValue()) {
            return;
        }
        gm50.a.b(this, ((vyz) oo().c.g()).b, new dkg(this, 24));
    }

    @Override // xsna.ph
    public final lph0 ko() {
        SearchLocation po = po(requireArguments());
        qyz qyzVar = new qyz(0);
        Context applicationContext = requireContext().getApplicationContext();
        f2i f2iVar = new f2i(2);
        xfg0 xfg0Var = new xfg0();
        h18 h18Var = new h18();
        h18Var.b = f2iVar;
        h18Var.c = xfg0Var;
        myz myzVar = new myz(qyzVar, new dyz.f(po), new hzz(applicationContext, h18Var));
        return new nti(myzVar, bo(new lyz(myzVar)));
    }

    @Override // xsna.ph
    public final gph0 lo(u8 u8Var, defpackage.j jVar, w8 w8Var) {
        ebx ebxVar = new ebx(this, 2);
        nyz nyzVar = new nyz(u8Var, jVar, Integer.valueOf(iah0.a(56)));
        nyzVar.x0(ykt.class, new com.vk.im.engine.commands.messages.a(25, w8Var, ebxVar));
        return nyzVar;
    }

    @Override // xsna.ph
    public final void mo() {
        oo().C(dyz.d.b);
    }

    @Override // xsna.ph, xsna.tl50, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.V = getString(R.string.search_params_apply_button);
        this.W = new hyz(this, 0);
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        oo().C(dyz.c.b);
    }

    public final myz oo() {
        return ((nti) getFeature()).b;
    }

    @Override // xsna.ph, xsna.xn50
    public final /* bridge */ /* synthetic */ vk50 x8(Bundle bundle, km50 km50Var) {
        return ko();
    }

    @Override // xsna.ph, xsna.tl50, xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        yn.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xsna.fyz
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                int i = jyz.r1;
                final ViewGroup Gn = jyz.this.Gn();
                if (Gn == null) {
                    return;
                }
                final ViewGroup viewGroup = (ViewGroup) Gn.getParent();
                Gn.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: xsna.iyz
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        ViewGroup.MarginLayoutParams marginLayoutParams;
                        int i2 = jyz.r1;
                        ViewGroup viewGroup2 = Gn;
                        int bottom = viewGroup2.getBottom();
                        ViewGroup viewGroup3 = viewGroup;
                        if (bottom != viewGroup3.getHeight()) {
                            ViewGroup.LayoutParams layoutParams = viewGroup3.getLayoutParams();
                            marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                            if ((marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) != 0) {
                                return true;
                            }
                            ViewGroup.LayoutParams layoutParams2 = viewGroup3.getLayoutParams();
                            if (layoutParams2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                            marginLayoutParams2.bottomMargin = -viewGroup2.getHeight();
                            viewGroup3.setLayoutParams(marginLayoutParams2);
                            viewGroup2.setVisibility(4);
                            return false;
                        }
                        ViewGroup.LayoutParams layoutParams3 = viewGroup3.getLayoutParams();
                        marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                        if ((marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) == 0) {
                            return true;
                        }
                        ViewGroup.LayoutParams layoutParams4 = viewGroup3.getLayoutParams();
                        if (layoutParams4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
                        marginLayoutParams3.bottomMargin = 0;
                        viewGroup3.setLayoutParams(marginLayoutParams3);
                        viewGroup2.setVisibility(0);
                        return false;
                    }
                });
            }
        });
        return yn;
    }
}
