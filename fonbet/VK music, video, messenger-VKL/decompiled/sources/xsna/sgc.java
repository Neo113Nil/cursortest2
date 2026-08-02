package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.ecomm.catalog.impl.geo.ClassifiedsGeoData;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.dw20;
import xsna.gko;
import xsna.tlo0;
import xsna.zgc;

/* compiled from: ClassifiedsGeoFragment.kt */
/* loaded from: classes18.dex */
public final class sgc extends hi6<rgc> {
    public static final /* synthetic */ int n1 = 0;
    public View g1;
    public RecyclerView h1;
    public View i1;
    public VkPlaceholder j1;
    public qgc k1;
    public io.reactivex.rxjava3.disposables.c l1;
    public boolean m1;

    /* compiled from: ClassifiedsGeoFragment.kt */
    public static final class a extends dw20.b {
        public final ClassifiedsGeoData e;
        public final int f;

        public a(Context context, ClassifiedsGeoData classifiedsGeoData, int i) {
            super(context, null);
            this.e = classifiedsGeoData;
            this.f = i;
            c(new a470());
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            sgc sgcVar = new sgc();
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", this.e);
            bundle.putInt("suggestion_mode", this.f);
            bundle.putString("custom_title", null);
            bundle.putString("custom_search_hint", null);
            sgcVar.setArguments(bundle);
            return sgcVar;
        }
    }

    public final void Zn(View... viewArr) {
        View view = this.g1;
        if (view == null) {
            view = null;
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        biq biqVar = new biq();
        biqVar.setDuration(150L);
        for (View view2 : viewArr) {
            if (view2 != null) {
                biqVar.addTarget(view2);
            }
        }
        zmp0.a(viewGroup, biqVar);
    }

    public final void ao(ArrayList arrayList) {
        RecyclerView recyclerView = this.h1;
        if (recyclerView == null) {
            recyclerView = null;
        }
        View view = this.i1;
        if (view == null) {
            view = null;
        }
        VkPlaceholder vkPlaceholder = this.j1;
        if (vkPlaceholder == null) {
            vkPlaceholder = null;
        }
        Zn(recyclerView, view, vkPlaceholder);
        RecyclerView recyclerView2 = this.h1;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setVisibility(0);
        View view2 = this.i1;
        if (view2 == null) {
            view2 = null;
        }
        f4m.j(view2);
        VkPlaceholder vkPlaceholder2 = this.j1;
        if (vkPlaceholder2 == null) {
            vkPlaceholder2 = null;
        }
        f4m.j(vkPlaceholder2);
        qgc qgcVar = this.k1;
        (qgcVar != null ? qgcVar : null).setItems(arrayList);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        rgc rgcVar;
        super.onActivityResult(i, i2, intent);
        if (i == 1005) {
            PermissionHelper permissionHelper = PermissionHelper.a;
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            String[] strArr = PermissionHelper.i;
            permissionHelper.getClass();
            if (PermissionHelper.b(context, strArr) && (rgcVar = (rgc) this.f1) != null) {
                rgcVar.z6();
            }
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ClassifiedsGeoData classifiedsGeoData;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (classifiedsGeoData = (ClassifiedsGeoData) arguments.getParcelable("data")) == null) {
            classifiedsGeoData = new ClassifiedsGeoData(null, null, null, false);
        }
        Bundle arguments2 = getArguments();
        int i = arguments2 != null ? arguments2.getInt("suggestion_mode", 0) : 0;
        zgc zgcVar = zgc.b.f;
        if (i != zgcVar.a) {
            zgcVar = zgc.a.f;
        }
        com.vk.ecomm.catalog.impl.geo.b bVar = new com.vk.ecomm.catalog.impl.geo.b(this, classifiedsGeoData, new com.vk.ecomm.catalog.impl.geo.a(new yd10()), zgcVar);
        this.f1 = bVar;
        this.k1 = new qgc(bVar);
    }

    @Override // xsna.hi6, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        io.reactivex.rxjava3.disposables.c cVar = this.l1;
        if (cVar != null) {
            cVar.dispose();
        }
        this.l1 = null;
    }

    @Override // xsna.hi6, xsna.dw20, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.m1) {
            this.m1 = false;
            rgc rgcVar = (rgc) this.f1;
            if (rgcVar != null) {
                rgcVar.z6();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.hi6, xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        int i;
        String string;
        String string2;
        String string3 = getString(R.string.classifieds_geo_title);
        Bundle arguments = getArguments();
        if (arguments != null && (string2 = arguments.getString("custom_title")) != null) {
            string3 = string2;
        }
        this.I = string3;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        View inflate = LayoutInflater.from(new lpj(requireContext(), this.A0)).inflate(R.layout.fragment_classifieds_geo, (ViewGroup) null, false);
        this.g1 = inflate;
        String string4 = getString(R.string.classifieds_geo_search_hint);
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("custom_search_hint")) != null) {
            string4 = string;
        }
        VkSearchView vkSearchView = (VkSearchView) inflate.findViewById(R.id.search_view);
        vkSearchView.X4(false);
        vkSearchView.c5(iah0.a(12.0f), 0, iah0.a(12.0f), iah0.a(4.0f));
        vkSearchView.setMaxInputLength(50);
        vkSearchView.setHint(string4);
        int i2 = 10;
        new io.reactivex.rxjava3.internal.operators.observable.c0(d02.y(vkSearchView, 300L, 2).a0(io.reactivex.rxjava3.android.schedulers.a.b()), new cp0(new p40(this, 25), i2), io.reactivex.rxjava3.internal.functions.a.c).subscribe(new is1(new s9(this, 17), 9));
        VkPlaceholder vkPlaceholder = (VkPlaceholder) inflate.findViewById(R.id.error_placeholder);
        if (dhr0.M()) {
            gko.b bVar = gko.Companion;
            i = R.drawable.vk_icon_illustration_antenna_dark_56;
        } else {
            gko.b bVar2 = gko.Companion;
            i = R.drawable.vk_icon_illustration_antenna_light_56;
        }
        vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(i), null, tq.h(tlo0.Companion, R.string.classifieds_accessibility_error), 22));
        vkPlaceholder.setMiddle(new VkPlaceholder.b((tlo0) new tlo0.f(R.string.vk_geopicker_loading_error_title), (tlo0) new tlo0.f(R.string.vk_geopicker_loading_error_description), (com.vk.core.compose.component.semantics.a) (objArr2 == true ? 1 : 0), i2));
        vkPlaceholder.setBottom(new VkPlaceholder.a(new VkPlaceholder.a.C0854a(new tlo0.f(R.string.vk_geopicker_loading_error_retry_button), new com.vk.movika.sdk.base.ui.g(this, 23), null, null, null, VkButton.Mode.Link, VkButton.Appearance.Accent, false, null, 1660), (VkPlaceholder.a.C0854a) (objArr == true ? 1 : 0), 6));
        this.j1 = vkPlaceholder;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.locations_rv);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        qgc qgcVar = this.k1;
        recyclerView.setAdapter(qgcVar != null ? qgcVar : null);
        this.h1 = recyclerView;
        this.i1 = inflate.findViewById(R.id.empty_view);
        dw20.Rn(this, inflate, 4);
        return super.yn(bundle);
    }
}
