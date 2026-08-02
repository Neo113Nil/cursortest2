package xsna;

import android.R;
import android.app.Dialog;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.translate.impl.models.SelectLanguageInitConfig;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a9i0;
import xsna.qb20;
import xsna.tzp0;

/* compiled from: MessageTranslateBottomSheetFragment.kt */
/* loaded from: classes6.dex */
public final class pb20 extends dw20 implements qb20.a, bop0, m0q0 {
    public static final a k1;
    public static final /* synthetic */ qcy<Object>[] l1;
    public nnp0 f1;
    public final Object g1 = msy.a(LazyThreadSafetyMode.NONE, new dgm(this, 21));
    public final ras h1 = xo9.v("vk.message.translate.screen.peer.key");
    public final ras i1 = xo9.v("vk.message.translate.cnv.msg.id");
    public final ras j1 = xo9.v("vk.message.translate.text");

    /* compiled from: MessageTranslateBottomSheetFragment.kt */
    public static final class a {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(pb20.class, "peerDialog", "getPeerDialog()Lcom/vk/dto/common/Peer;", 0);
        hpf0 hpf0Var = fpf0.a;
        l1 = new qcy[]{propertyReference1Impl, fp.c(0, pb20.class, "cnvMsgId", "getCnvMsgId()I", hpf0Var), ep.a(0, pb20.class, "text", "getText()Ljava/lang/String;", hpf0Var)};
        k1 = new a();
    }

    public pb20() {
        this.x = new tzp0.c.a(this, false);
    }

    @Override // xsna.bop0
    public final void Q3(nnp0 nnp0Var) {
        this.f1 = nnp0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final qb20 Yn() {
        return (qb20) this.g1.getValue();
    }

    @Override // xsna.qb20.a
    public final void em(SelectLanguageInitConfig selectLanguageInitConfig) {
        if (getChildFragmentManager().H("SelectLanguageBottomSheetFragment") != null) {
            return;
        }
        a9i0.a aVar = a9i0.i1;
        FragmentManager childFragmentManager = getChildFragmentManager();
        aVar.getClass();
        a9i0 a9i0Var = new a9i0();
        a9i0Var.setArguments(yfb.b(new Pair("select.language.init.config", selectLanguageInitConfig)));
        a9i0Var.Td(childFragmentManager, "SelectLanguageBottomSheetFragment");
        getChildFragmentManager().l0("select.language.request_key", this, new xl0(this, 27));
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        qb20 Yn = Yn();
        if (bundle != null) {
            Yn.getClass();
        } else {
            Yn.Z0().k(Yn.i, Yn.j);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Yn().G0();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Yn().H0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        Yn().W0();
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Yn().V0();
    }

    @Override // xsna.qb20.a
    public final void w3(AutoTransition autoTransition) {
        ViewGroup viewGroup;
        Dialog dialog = this.s;
        if (dialog == null || (viewGroup = (ViewGroup) dialog.findViewById(R.id.content)) == null) {
            return;
        }
        TransitionManager.endTransitions(viewGroup);
        TransitionManager.beginDelayedTransition(viewGroup, autoTransition);
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Window window;
        WindowManager.LayoutParams attributes;
        dw20.Rn(this, Yn().D0(requireContext(), null, null, bundle), 2);
        Dialog yn = super.yn(bundle);
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null || (attributes.flags & 8192) != 0) {
            try {
                Window window2 = yn.getWindow();
                if (window2 != null) {
                    window2.addFlags(8192);
                }
            } catch (Exception unused) {
            }
        }
        return yn;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
