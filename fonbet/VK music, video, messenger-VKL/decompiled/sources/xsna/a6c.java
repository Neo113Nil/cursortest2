package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.superapp.vkpay.checkout.data.model.PayMethodData;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import xsna.bbv0;
import xsna.y5c;

/* compiled from: CheckoutMethodsFragment.kt */
/* loaded from: classes6.dex */
public final class a6c extends bb6<z5c> {
    public static final /* synthetic */ int n = 0;
    public final bpn0 i = new bpn0(new com.vk.movika.sdk.base.ui.t(this, 19));
    public final ArrayList<WeakReference<RecyclerView.e0>> j = new ArrayList<>();
    public final a k = new a();
    public RecyclerView l;
    public ProgressBar m;

    /* compiled from: CheckoutMethodsFragment.kt */
    public static final class a implements y5c.a {
        public a() {
        }

        @Override // xsna.y5c.a
        public final void a() {
            z5c z5cVar = (z5c) a6c.this.h;
            if (z5cVar != null) {
                z5cVar.s2();
            }
        }

        @Override // xsna.y5c.a
        public final void b() {
            z5c z5cVar = (z5c) a6c.this.h;
            if (z5cVar != null) {
                z5cVar.f0();
            }
        }

        @Override // xsna.y5c.a
        public final void c(PayMethodData payMethodData) {
            z5c z5cVar = (z5c) a6c.this.h;
            if (z5cVar != null) {
                z5cVar.i0(payMethodData);
            }
        }

        @Override // xsna.y5c.a
        public final void d(PayMethodData payMethodData, int i) {
            z5c z5cVar = (z5c) a6c.this.h;
            if (z5cVar != null) {
                z5cVar.e0(payMethodData, i);
            }
        }
    }

    @Override // xsna.uhv0, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        a8c a8cVar = sdi.f;
        bbv0.g.getClass();
        this.h = new e6c(this, a8cVar, bbv0.a.f().d);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.vk_pay_checkout_fragment_checkout_methods, (ViewGroup) null);
    }

    @Override // xsna.gi6, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.m = null;
        this.l = null;
    }

    @Override // xsna.gi6, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.l = (RecyclerView) view.findViewById(R.id.fragment_checkout_methods_list);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.fragment_checkout_progress_bar);
        this.m = progressBar;
        if (progressBar != null) {
            progressBar.setAlpha(1.0f);
        }
        RecyclerView recyclerView = this.l;
        if (recyclerView != null) {
            recyclerView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            recyclerView.setAdapter(un());
            un().j = new b6c(this, recyclerView);
        }
        z5c z5cVar = (z5c) this.h;
        if (z5cVar != null) {
            z5cVar.t3(false);
        }
        z5c z5cVar2 = (z5c) this.h;
        if (z5cVar2 != null) {
            z5cVar2.X3();
        }
    }

    public final y5c un() {
        return (y5c) this.i.getValue();
    }
}
