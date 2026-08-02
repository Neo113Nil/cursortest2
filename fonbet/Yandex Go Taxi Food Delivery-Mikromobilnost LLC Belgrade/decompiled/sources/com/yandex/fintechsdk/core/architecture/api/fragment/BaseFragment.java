package com.yandex.fintechsdk.core.architecture.api.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.yandex.fintechsdk.flows.payment.kit.internal.activity.PaymentKitActivity;
import defpackage.brg0;
import defpackage.bx60;
import defpackage.j24;
import defpackage.mx60;
import defpackage.n751;
import defpackage.o751;
import defpackage.p751;
import defpackage.pub1;
import defpackage.q751;
import defpackage.u1w;
import defpackage.va90;
import defpackage.wc5;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u00042\u00020\u0005B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\b*\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010#\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010!H\u0017¢\u0006\u0004\b#\u0010$J!\u0010'\u001a\u00020\u00122\b\b\u0001\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\fH\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\fH\u0014¢\u0006\u0004\b)\u0010*R\u001a\u0010%\u001a\u00020\b8\u0014X\u0095\u0004¢\u0006\f\n\u0004\b%\u0010+\u001a\u0004\b,\u0010-R \u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010.8$X¤\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/yandex/fintechsdk/core/architecture/api/fragment/BaseFragment;", "", "STATE", "SIDE_EFFECT", "Landroidx/fragment/app/Fragment;", "Lbx60;", "<init>", "()V", "", "contentLayoutId", "(I)V", "Landroid/content/res/Resources;", "", "isDarkMode", "(Landroid/content/res/Resources;)Z", "getNightModeFlags", "(Landroid/content/res/Resources;)I", ClidProvider.STATE, "Lzy11;", "render", "(Ljava/lang/Object;)V", "sideEffect", "Landroid/view/View;", "v", "Ln751;", "insets", "onApplyWindowInsets", "(Landroid/view/View;Ln751;)Ln751;", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "statusBarColor", "isDarkText", "setupStatusBar", "(IZ)V", "isBottomSheetMode", "()Z", CA20Status.STATUS_USER_I, "getStatusBarColor", "()I", "Lwc5;", "getViewModel", "()Lwc5;", "viewModel", "api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class BaseFragment<STATE, SIDE_EFFECT> extends Fragment implements bx60 {
    private final int statusBarColor;

    public BaseFragment() {
        this.statusBarColor = brg0.finsdk_surface_elevated_0;
    }

    private final int getNightModeFlags(Resources resources) {
        return resources.getConfiguration().uiMode & 48;
    }

    private final boolean isDarkMode(Resources resources) {
        return getNightModeFlags(resources) == 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttach$lambda$1(BaseFragment baseFragment, mx60 mx60Var) {
        baseFragment.getViewModel().W();
        return zy11.a;
    }

    public int getStatusBarColor() {
        return this.statusBarColor;
    }

    public abstract wc5 getViewModel();

    public boolean isBottomSheetMode() {
        FragmentActivity activity = getActivity();
        if (activity instanceof PaymentKitActivity) {
            return ((PaymentKitActivity) activity).isBottomSheetMode();
        }
        return false;
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View v, n751 insets) {
        u1w g = insets.a.g(519);
        v.setPadding(g.a, g.b, g.c, g.d);
        return n751.b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        pub1.c(requireActivity().getOnBackPressedDispatcher(), this, new j24(5, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (!isBottomSheetMode()) {
            WeakHashMap weakHashMap = b.a;
            ViewCompat$Api21Impl.o(view, this);
            setupStatusBar(getStatusBarColor(), !isDarkMode(requireContext().getResources()));
        }
        com.yandex.fintechsdk.core.architecture.api.mvi.b.b(getViewModel(), getViewLifecycleOwner(), new BaseFragment$onViewCreated$1(1, this, BaseFragment.class, "render", "render(Ljava/lang/Object;)V", 0), new BaseFragment$onViewCreated$2(1, this, BaseFragment.class, "sideEffect", "sideEffect(Ljava/lang/Object;)V", 0));
    }

    public void render(STATE state) {
    }

    public void setupStatusBar(int statusBarColor, boolean isDarkText) {
        requireActivity().getWindow().setStatusBarColor(requireContext().getColor(statusBarColor));
        Window window = requireActivity().getWindow();
        va90 va90Var = new va90(requireActivity().getWindow().getDecorView());
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new q751(window, va90Var) : i >= 30 ? new p751(window, va90Var) : new o751(window, va90Var)).U(isDarkText);
    }

    public void sideEffect(SIDE_EFFECT sideEffect) {
    }

    public BaseFragment(int i) {
        super(i);
        this.statusBarColor = brg0.finsdk_surface_elevated_0;
    }
}
