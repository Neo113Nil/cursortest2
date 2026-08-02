package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.auth.loginconfirmation.VkLoginConfirmationStatusType;
import com.vk.auth.ui.VkLoadingButton;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.superapp.ui.shimmer.Shimmer;
import com.vk.superapp.ui.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: VkLoginConfirmationFragment.kt */
/* loaded from: classes15.dex */
public final class x2v0 extends a66<u2v0> implements v2v0 {
    public ShimmerFrameLayout A;
    public ShimmerFrameLayout B;
    public View C;
    public View D;
    public View E;
    public ViewGroup F;
    public ImageView G;
    public TextView H;
    public TextView I;
    public Button J;
    public final y2v0 K = new y2v0();
    public NestedScrollView s;
    public ImageView t;
    public VKImageController<? extends View> u;
    public TextView v;
    public TextView w;
    public VkLoadingButton x;
    public VkLoadingButton y;
    public RecyclerView z;

    /* compiled from: VkLoginConfirmationFragment.kt */
    public static final class a {
        public static Bundle a(int i) {
            Bundle bundle = new Bundle(1);
            bundle.putInt("CODE", i);
            return bundle;
        }
    }

    @Override // xsna.v2v0
    public final void Ee(String str, String str2, String str3) {
        VKImageController<? extends View> vKImageController = this.u;
        if (vKImageController == null) {
            vKImageController = null;
        }
        vKImageController.f(str, adu0.a(6, requireContext()));
        TextView textView = this.v;
        if (textView == null) {
            textView = null;
        }
        textView.setText(str2);
        TextView textView2 = this.w;
        if (textView2 == null) {
            textView2 = null;
        }
        ey2.i(textView2, str3);
        ShimmerFrameLayout shimmerFrameLayout = this.B;
        if (shimmerFrameLayout == null) {
            shimmerFrameLayout = null;
        }
        shimmerFrameLayout.a();
        ShimmerFrameLayout shimmerFrameLayout2 = this.B;
        f4m.j(shimmerFrameLayout2 != null ? shimmerFrameLayout2 : null);
    }

    @Override // xsna.v2v0
    public final void Ge() {
        VkLoadingButton vkLoadingButton = this.x;
        if (vkLoadingButton == null) {
            vkLoadingButton = null;
        }
        vkLoadingButton.setLoading(true);
        VkLoadingButton vkLoadingButton2 = this.x;
        if (vkLoadingButton2 == null) {
            vkLoadingButton2 = null;
        }
        vkLoadingButton2.setEnabled(false);
        VkLoadingButton vkLoadingButton3 = this.y;
        (vkLoadingButton3 != null ? vkLoadingButton3 : null).setEnabled(false);
    }

    @Override // xsna.v2v0
    public final void Lb() {
        VkLoadingButton vkLoadingButton = this.y;
        if (vkLoadingButton == null) {
            vkLoadingButton = null;
        }
        vkLoadingButton.setLoading(true);
        VkLoadingButton vkLoadingButton2 = this.x;
        if (vkLoadingButton2 == null) {
            vkLoadingButton2 = null;
        }
        vkLoadingButton2.setEnabled(false);
        VkLoadingButton vkLoadingButton3 = this.y;
        (vkLoadingButton3 != null ? vkLoadingButton3 : null).setEnabled(false);
    }

    @Override // xsna.v2v0
    public final void S4() {
        ShimmerFrameLayout shimmerFrameLayout = this.A;
        if (shimmerFrameLayout == null) {
            shimmerFrameLayout = null;
        }
        shimmerFrameLayout.c();
        ShimmerFrameLayout shimmerFrameLayout2 = this.A;
        if (shimmerFrameLayout2 == null) {
            shimmerFrameLayout2 = null;
        }
        shimmerFrameLayout2.setVisibility(0);
        ShimmerFrameLayout shimmerFrameLayout3 = this.B;
        if (shimmerFrameLayout3 == null) {
            shimmerFrameLayout3 = null;
        }
        shimmerFrameLayout3.d = true;
        shimmerFrameLayout3.c();
        ShimmerFrameLayout shimmerFrameLayout4 = this.B;
        if (shimmerFrameLayout4 == null) {
            shimmerFrameLayout4 = null;
        }
        shimmerFrameLayout4.setVisibility(0);
        ColorStateList valueOf = ColorStateList.valueOf(e3m.f(R.attr.vk_ui_background, requireContext()));
        View view = this.C;
        if (view == null) {
            view = null;
        }
        view.setBackgroundTintList(valueOf);
        View view2 = this.D;
        if (view2 == null) {
            view2 = null;
        }
        view2.setBackgroundTintList(valueOf);
        View view3 = this.E;
        if (view3 == null) {
            view3 = null;
        }
        f4m.j(view3);
        RecyclerView recyclerView = this.z;
        if (recyclerView == null) {
            recyclerView = null;
        }
        f4m.j(recyclerView);
        VkLoadingButton vkLoadingButton = this.x;
        if (vkLoadingButton == null) {
            vkLoadingButton = null;
        }
        f4m.j(vkLoadingButton);
        VkLoadingButton vkLoadingButton2 = this.y;
        f4m.j(vkLoadingButton2 != null ? vkLoadingButton2 : null);
    }

    @Override // xsna.v2v0
    public final void cm() {
        VkLoadingButton vkLoadingButton = this.x;
        if (vkLoadingButton == null) {
            vkLoadingButton = null;
        }
        vkLoadingButton.setLoading(false);
        VkLoadingButton vkLoadingButton2 = this.x;
        if (vkLoadingButton2 == null) {
            vkLoadingButton2 = null;
        }
        vkLoadingButton2.setEnabled(true);
        VkLoadingButton vkLoadingButton3 = this.y;
        if (vkLoadingButton3 == null) {
            vkLoadingButton3 = null;
        }
        vkLoadingButton3.setLoading(false);
        VkLoadingButton vkLoadingButton4 = this.y;
        (vkLoadingButton4 != null ? vkLoadingButton4 : null).setEnabled(true);
    }

    @Override // xsna.v2v0
    public final void e() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    @Override // xsna.v2v0
    public final void na() {
        ShimmerFrameLayout shimmerFrameLayout = this.A;
        if (shimmerFrameLayout == null) {
            shimmerFrameLayout = null;
        }
        shimmerFrameLayout.d();
        ShimmerFrameLayout shimmerFrameLayout2 = this.A;
        if (shimmerFrameLayout2 == null) {
            shimmerFrameLayout2 = null;
        }
        f4m.j(shimmerFrameLayout2);
        ShimmerFrameLayout shimmerFrameLayout3 = this.B;
        if (shimmerFrameLayout3 == null) {
            shimmerFrameLayout3 = null;
        }
        shimmerFrameLayout3.a();
        ShimmerFrameLayout shimmerFrameLayout4 = this.B;
        if (shimmerFrameLayout4 == null) {
            shimmerFrameLayout4 = null;
        }
        shimmerFrameLayout4.setVisibility(0);
        ColorStateList valueOf = ColorStateList.valueOf(e3m.f(R.attr.vk_ui_transparent_active, requireContext()));
        View view = this.C;
        if (view == null) {
            view = null;
        }
        view.setBackgroundTintList(valueOf);
        View view2 = this.D;
        if (view2 == null) {
            view2 = null;
        }
        view2.setBackgroundTintList(valueOf);
        View view3 = this.E;
        if (view3 == null) {
            view3 = null;
        }
        view3.setVisibility(0);
        RecyclerView recyclerView = this.z;
        if (recyclerView == null) {
            recyclerView = null;
        }
        f4m.j(recyclerView);
        VkLoadingButton vkLoadingButton = this.x;
        if (vkLoadingButton == null) {
            vkLoadingButton = null;
        }
        vkLoadingButton.setVisibility(4);
        VkLoadingButton vkLoadingButton2 = this.y;
        (vkLoadingButton2 != null ? vkLoadingButton2 : null).setVisibility(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    @Override // xsna.v2v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void oa(VkLoginConfirmationStatusType vkLoginConfirmationStatusType) {
        String str;
        Button button;
        NestedScrollView nestedScrollView = this.s;
        if (nestedScrollView == null) {
            nestedScrollView = null;
        }
        f4m.j(nestedScrollView);
        VkLoadingButton vkLoadingButton = this.x;
        if (vkLoadingButton == null) {
            vkLoadingButton = null;
        }
        f4m.j(vkLoadingButton);
        VkLoadingButton vkLoadingButton2 = this.y;
        if (vkLoadingButton2 == null) {
            vkLoadingButton2 = null;
        }
        f4m.j(vkLoadingButton2);
        ViewGroup viewGroup = this.F;
        if (viewGroup == null) {
            viewGroup = null;
        }
        viewGroup.setVisibility(0);
        Context mo2getContext = mo2getContext();
        Drawable e = mo2getContext != null ? enj.e(vkLoginConfirmationStatusType.j(), vkLoginConfirmationStatusType.i(), mo2getContext) : null;
        ImageView imageView = this.G;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageDrawable(e);
        TextView textView = this.H;
        if (textView == null) {
            textView = null;
        }
        textView.setText(vkLoginConfirmationStatusType.l());
        TextView textView2 = this.I;
        if (textView2 == null) {
            textView2 = null;
        }
        Integer k = vkLoginConfirmationStatusType.k();
        if (k != null) {
            int intValue = k.intValue();
            Context mo2getContext2 = mo2getContext();
            if (mo2getContext2 != null) {
                str = mo2getContext2.getString(intValue);
                ey2.i(textView2, str);
                button = this.J;
                if (button == null) {
                    button = null;
                }
                button.setText(vkLoginConfirmationStatusType.h());
                Button button2 = this.J;
                (button2 != null ? button2 : null).setOnClickListener(new w2v0(0, this, vkLoginConfirmationStatusType));
            }
        }
        str = null;
        ey2.i(textView2, str);
        button = this.J;
        if (button == null) {
        }
        button.setText(vkLoginConfirmationStatusType.h());
        Button button22 = this.J;
        (button22 != null ? button22 : null).setOnClickListener(new w2v0(0, this, vkLoginConfirmationStatusType));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.vk_login_confirmation, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.s = (NestedScrollView) view.findViewById(R.id.scroll_view);
        this.t = (ImageView) view.findViewById(R.id.shadow);
        ifx0 ifx0Var = e370.c;
        if (ifx0Var == null) {
            ifx0Var = null;
        }
        this.u = ifx0Var.b().create(requireContext());
        VKReplacerView vKReplacerView = (VKReplacerView) view.findViewById(R.id.user_avatar_view);
        VKImageController<? extends View> vKImageController = this.u;
        if (vKImageController == null) {
            vKImageController = null;
        }
        vKReplacerView.a(vKImageController.getView());
        this.A = (ShimmerFrameLayout) view.findViewById(R.id.shimmer_container);
        this.B = (ShimmerFrameLayout) view.findViewById(R.id.user_shimmer_container);
        this.C = view.findViewById(R.id.user_avatar_shimmer);
        this.D = view.findViewById(R.id.username_shimmer);
        ShimmerFrameLayout shimmerFrameLayout = this.B;
        if (shimmerFrameLayout == null) {
            shimmerFrameLayout = null;
        }
        shimmerFrameLayout.a();
        ShimmerFrameLayout shimmerFrameLayout2 = this.B;
        if (shimmerFrameLayout2 == null) {
            shimmerFrameLayout2 = null;
        }
        Context requireContext = requireContext();
        Shimmer.c c = new Shimmer.c().c(false);
        c.k(e3m.f(R.attr.vk_ui_transparent_active, requireContext));
        Shimmer.c d = c.d(0.08f);
        d.a.d = e3m.f(R.attr.vk_ui_transparent_hover, requireContext);
        shimmerFrameLayout2.b(d.h(0.2f).g(iah0.a(360)).a());
        this.E = view.findViewById(R.id.error_retry_container);
        view.findViewById(R.id.error_retry).setOnClickListener(new q01(this, 15));
        this.v = (TextView) view.findViewById(R.id.username);
        this.w = (TextView) view.findViewById(R.id.user_city);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.info_recycler);
        this.z = recyclerView;
        recyclerView.setAdapter(this.K);
        RecyclerView recyclerView2 = this.z;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        requireContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        this.x = (VkLoadingButton) view.findViewById(R.id.allow);
        this.y = (VkLoadingButton) view.findViewById(R.id.deny);
        VkLoadingButton vkLoadingButton = this.x;
        if (vkLoadingButton == null) {
            vkLoadingButton = null;
        }
        vkLoadingButton.setOnClickListener(new wz5(this, 13));
        VkLoadingButton vkLoadingButton2 = this.y;
        if (vkLoadingButton2 == null) {
            vkLoadingButton2 = null;
        }
        vkLoadingButton2.setOnClickListener(new xz5(this, 15));
        this.F = (ViewGroup) view.findViewById(R.id.status_container);
        this.G = (ImageView) view.findViewById(R.id.status_icon);
        this.H = (TextView) view.findViewById(R.id.status_title);
        this.I = (TextView) view.findViewById(R.id.status_subtitle);
        this.J = (Button) view.findViewById(R.id.status_button);
        NestedScrollView nestedScrollView = this.s;
        if (nestedScrollView == null) {
            nestedScrollView = null;
        }
        boolean canScrollVertically = nestedScrollView.canScrollVertically(-1);
        ImageView imageView = this.t;
        if (imageView == null) {
            imageView = null;
        }
        awt0.v(imageView, canScrollVertically);
        NestedScrollView nestedScrollView2 = this.s;
        if (nestedScrollView2 == null) {
            nestedScrollView2 = null;
        }
        nestedScrollView2.setOnScrollChangeListener(new sqk0(this, 8));
        Object obj = this.o;
        ((u2v0) (obj != null ? obj : null)).y0(this);
    }

    @Override // xsna.v2v0
    public final void rf(List<t2v0> list) {
        ShimmerFrameLayout shimmerFrameLayout = this.A;
        if (shimmerFrameLayout == null) {
            shimmerFrameLayout = null;
        }
        shimmerFrameLayout.d();
        ShimmerFrameLayout shimmerFrameLayout2 = this.A;
        if (shimmerFrameLayout2 == null) {
            shimmerFrameLayout2 = null;
        }
        f4m.j(shimmerFrameLayout2);
        ShimmerFrameLayout shimmerFrameLayout3 = this.B;
        if (shimmerFrameLayout3 == null) {
            shimmerFrameLayout3 = null;
        }
        shimmerFrameLayout3.a();
        ShimmerFrameLayout shimmerFrameLayout4 = this.B;
        if (shimmerFrameLayout4 == null) {
            shimmerFrameLayout4 = null;
        }
        f4m.j(shimmerFrameLayout4);
        View view = this.E;
        if (view == null) {
            view = null;
        }
        f4m.j(view);
        RecyclerView recyclerView = this.z;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setVisibility(0);
        y2v0 y2v0Var = this.K;
        ArrayList arrayList = y2v0Var.c;
        arrayList.clear();
        arrayList.addAll(list);
        y2v0Var.notifyDataSetChanged();
        VkLoadingButton vkLoadingButton = this.x;
        if (vkLoadingButton == null) {
            vkLoadingButton = null;
        }
        vkLoadingButton.setVisibility(0);
        VkLoadingButton vkLoadingButton2 = this.y;
        (vkLoadingButton2 != null ? vkLoadingButton2 : null).setVisibility(0);
    }

    @Override // xsna.a66
    public final u2v0 tn(Bundle bundle) {
        return new a3v0(requireContext(), requireArguments().getInt("CODE"));
    }

    @Override // xsna.v2v0
    public final void u4() {
        NestedScrollView nestedScrollView = this.s;
        if (nestedScrollView == null) {
            nestedScrollView = null;
        }
        nestedScrollView.setVisibility(0);
        VkLoadingButton vkLoadingButton = this.x;
        if (vkLoadingButton == null) {
            vkLoadingButton = null;
        }
        vkLoadingButton.setVisibility(0);
        VkLoadingButton vkLoadingButton2 = this.y;
        if (vkLoadingButton2 == null) {
            vkLoadingButton2 = null;
        }
        vkLoadingButton2.setVisibility(0);
        ViewGroup viewGroup = this.F;
        f4m.j(viewGroup != null ? viewGroup : null);
    }

    @Override // xsna.x65
    public final void wm(boolean z) {
        VkLoadingButton vkLoadingButton = this.x;
        if (vkLoadingButton == null) {
            vkLoadingButton = null;
        }
        vkLoadingButton.setEnabled(!z);
        VkLoadingButton vkLoadingButton2 = this.y;
        (vkLoadingButton2 != null ? vkLoadingButton2 : null).setEnabled(!z);
    }
}
