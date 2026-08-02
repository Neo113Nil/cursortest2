package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.vk.core.ui.bottomsheet.internal.BottomSheetBehaviourExt;
import com.vk.core.view.ArrowSendButton;
import com.vk.core.view.BottomConfirmButton;
import com.vk.core.view.search.ModernSearchView;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import xsna.d98;
import xsna.gzw;
import xsna.xia0;

/* compiled from: PickerVc.kt */
/* loaded from: classes2.dex */
public final class aja0 implements d98.b {
    public final /* synthetic */ xia0 a;

    public aja0(xia0 xia0Var) {
        this.a = xia0Var;
    }

    @Override // xsna.d98.b
    public final void B0(float f) {
        xia0 xia0Var = this.a;
        xia0.a aVar = xia0Var.b;
        if (f <= 0.9f || !aVar.p0()) {
            View view = xia0Var.j;
            if (view != null) {
                view.setVisibility(4);
            }
        } else {
            float min = Math.min((f - 0.9f) * 10, 1.0f);
            View view2 = xia0Var.j;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = xia0Var.j;
            if (view3 != null) {
                view3.setAlpha(min);
            }
        }
        aVar.n0(f);
    }

    @Override // xsna.d98.b
    public final int C0() {
        return iah0.a(48);
    }

    @Override // xsna.d98.b
    public final void E0(FrameLayout frameLayout) {
        final xia0 xia0Var = this.a;
        View inflate = ((LayoutInflater) xia0Var.o.getValue()).inflate(R.layout.vkim_msg_send_picker_controls, (ViewGroup) frameLayout, true);
        EditText editText = (EditText) inflate.findViewById(R.id.vkim_caption_view);
        xia0Var.g = editText;
        kkm kkmVar = xia0Var.c;
        xia0.a aVar = xia0Var.b;
        editText.setText(aVar.t0());
        EditText editText2 = xia0Var.g;
        if (editText2 == null) {
            editText2 = null;
        }
        editText2.setSelection(aVar.t0().length());
        EditText editText3 = xia0Var.g;
        if (editText3 == null) {
            editText3 = null;
        }
        editText3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.yia0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    xia0 xia0Var2 = xia0.this;
                    d98 d98Var = xia0Var2.l;
                    if (d98Var != null) {
                        d98Var.c(true);
                    }
                    xia0Var2.q.postDelayed(new sb(xia0Var2, 10), 100L);
                    d98 d98Var2 = xia0Var2.l;
                    if (d98Var2 != null) {
                        BottomSheetBehaviourExt<View> bottomSheetBehaviourExt = d98Var2.g;
                        if (bottomSheetBehaviourExt.M == 3) {
                            d98Var2.a.B0(1.0f);
                        } else {
                            bottomSheetBehaviourExt.X(3);
                        }
                    }
                }
            }
        });
        EditText editText4 = xia0Var.g;
        if (editText4 == null) {
            editText4 = null;
        }
        awt0.h(editText4, new f880(xia0Var, 4), false);
        xia0Var.i = inflate.findViewById(R.id.vkim_caption_separator);
        ArrowSendButton arrowSendButton = (ArrowSendButton) inflate.findViewById(R.id.vkim_send_btn);
        xia0Var.h = arrowSendButton;
        kkmVar.e(arrowSendButton, new bo3(xia0Var, 12));
        BottomConfirmButton bottomConfirmButton = (BottomConfirmButton) inflate.findViewById(R.id.vkim_confirm_btn);
        kkmVar.e(bottomConfirmButton, new id4(xia0Var, 9));
        bottomConfirmButton.setAccentColor(kkmVar.f(R.attr.vk_legacy_accent));
        xia0Var.f = bottomConfirmButton;
        bwt0.i0(bottomConfirmButton, new l6u(xia0Var, 29));
        ArrowSendButton arrowSendButton2 = xia0Var.h;
        if (arrowSendButton2 == null) {
            arrowSendButton2 = null;
        }
        bwt0.i0(arrowSendButton2, new e810(xia0Var, 15));
        ArrowSendButton arrowSendButton3 = xia0Var.h;
        if (arrowSendButton3 == null) {
            arrowSendButton3 = null;
        }
        bwt0.k0(arrowSendButton3, new cws(xia0Var, 28));
        xia0Var.j = inflate.findViewById(R.id.vkim_picker_search_container);
        ModernSearchView modernSearchView = (ModernSearchView) inflate.findViewById(R.id.vkim_picker_search);
        xia0Var.d.b(new io.reactivex.rxjava3.internal.operators.observable.j2(new gzw.a(new qno0(modernSearchView.j))).y(400L, TimeUnit.MILLISECONDS).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new pd40(new f410(xia0Var, 20), 8)));
        modernSearchView.setFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.zia0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    xia0 xia0Var2 = xia0.this;
                    ModernSearchView modernSearchView2 = xia0Var2.k;
                    if (modernSearchView2 != null) {
                        modernSearchView2.f();
                    }
                    ModernSearchView modernSearchView3 = xia0Var2.k;
                    if (modernSearchView3 != null) {
                        h94 h94Var = ModernSearchView.y;
                        modernSearchView3.c(0L);
                    }
                    d98 d98Var = xia0Var2.l;
                    if (d98Var != null) {
                        d98Var.c(z);
                    }
                }
            }
        });
        modernSearchView.setOnActionBackListener(new io60(xia0Var, 11));
        modernSearchView.e(modernSearchView.getOnActionBackListener(), null);
        modernSearchView.setVoiceIsAvailable(false);
        xia0Var.k = modernSearchView;
    }

    @Override // xsna.d98.b
    public final void F0(FrameLayout frameLayout) {
        this.a.e = frameLayout;
    }

    @Override // xsna.d98.b
    public final int G0() {
        xia0 xia0Var = this.a;
        return xia0Var.b.o0(xia0Var.p);
    }

    @Override // xsna.d98.b
    public final boolean H0() {
        this.a.b.s0();
        return false;
    }

    @Override // xsna.d98.b
    public final void h() {
        xia0 xia0Var = this.a;
        nh3 nh3Var = xia0Var.n;
        if (nh3Var != null) {
            nh3Var.invoke();
        }
        xia0Var.n = null;
    }

    @Override // xsna.d98.b
    public final void i() {
        xia0 xia0Var = this.a;
        xia0Var.d.dispose();
        gzs<s3q0> gzsVar = xia0Var.m;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        xia0Var.m = null;
        xia0Var.f = null;
        xia0Var.e = null;
        xia0Var.k = null;
        xia0Var.j = null;
        xia0Var.b.onDestroyView();
    }

    @Override // xsna.d98.b
    public final void j() {
        this.a.b.j();
    }

    @Override // xsna.d98.b
    public final WindowManager.LayoutParams k() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 1000, 131072, 1);
        layoutParams.softInputMode = 1;
        return layoutParams;
    }

    @Override // xsna.d98.b
    public final void D0() {
    }

    @Override // xsna.d98.b
    public final void a() {
    }
}
