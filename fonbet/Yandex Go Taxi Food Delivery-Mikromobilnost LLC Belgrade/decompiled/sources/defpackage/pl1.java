package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import androidx.core.view.b;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.quark.ai_assistant.impl.ui.AiAssistantModalView;
import defpackage.pl1;
import java.util.WeakHashMap;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;

/* loaded from: classes13.dex */
public final class pl1 implements ul1 {
    public final /* synthetic */ AiAssistantModalView a;

    public pl1(AiAssistantModalView aiAssistantModalView) {
        this.a = aiAssistantModalView;
    }

    public static void I(GoImageView goImageView) {
        int w = (int) tje.w(56, goImageView.getContext());
        int r = tje.r(ql1.a, goImageView.getContext());
        goImageView.setPadding(r, goImageView.getPaddingTop(), r, goImageView.getPaddingBottom());
        c.D(w, goImageView.getLayoutParams().height, goImageView);
    }

    public static final void h(pl1 pl1Var) {
        x1y binding;
        binding = pl1Var.a.getBinding();
        int max = Math.max(binding.b.getWidth(), binding.m.getWidth());
        RobotoTextView robotoTextView = binding.k;
        ViewGroup.LayoutParams layoutParams = robotoTextView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.setMargins(max, marginLayoutParams2.topMargin, max, marginLayoutParams2.bottomMargin);
            marginLayoutParams = marginLayoutParams2;
        }
        robotoTextView.setLayoutParams(marginLayoutParams);
    }

    @Override // defpackage.ul1
    public final void onBackPressed() {
        this.a.onBackPressed();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b2, code lost:
    
        if (r5.c == true) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
    @Override // defpackage.eyi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void render(Object obj) {
        x1y binding;
        zl1 zl1Var;
        x1y binding2;
        zl1 zl1Var2;
        x1y binding3;
        boolean z;
        zl1 zl1Var3;
        int i;
        int i2;
        zl1 zl1Var4;
        zl1 zl1Var5;
        x1y binding4;
        View chatView;
        View chatView2;
        ViewStub viewStub;
        View chatView3;
        x1y binding5;
        mm1 mm1Var = (mm1) obj;
        View a = mm1Var.a();
        AiAssistantModalView aiAssistantModalView = this.a;
        if (a != null) {
            ViewParent parent = a.getParent();
            binding4 = aiAssistantModalView.getBinding();
            if (parent != binding4.c) {
                if (a.getParent() != null) {
                    hst hstVar = jst.e;
                    ViewParent parent2 = a.getParent();
                    binding5 = aiAssistantModalView.getBinding();
                    hstVar.q("ChatView [" + a + "] attached to another container [" + parent2 + "]; current is [" + binding5.c + "]");
                } else {
                    chatView = aiAssistantModalView.getChatView();
                    if (chatView != a) {
                        chatView2 = aiAssistantModalView.getChatView();
                        viewStub = aiAssistantModalView.stubChatView;
                        if (chatView2 != viewStub) {
                            aiAssistantModalView.detachChatView();
                        }
                        chatView3 = aiAssistantModalView.getChatView();
                        c.w(chatView3, a);
                        a.post(new jg(11, aiAssistantModalView));
                    }
                }
            }
        } else {
            aiAssistantModalView.detachChatView();
        }
        boolean z2 = mm1Var instanceof jm1;
        yl1 yl1Var = yl1.a;
        if (!z2) {
            binding3 = aiAssistantModalView.getBinding();
            boolean z3 = mm1Var instanceof lm1;
            ShimmeringBar shimmeringBar = binding3.l;
            GoImageView goImageView = binding3.j;
            GoImageView goImageView2 = binding3.e;
            shimmeringBar.setVisibility(z3 ? 0 : 8);
            binding3.f.a.setVisibility(z3 ? 0 : 8);
            boolean z4 = mm1Var instanceof km1;
            km1 km1Var = z4 ? (km1) mm1Var : null;
            if (km1Var != null) {
                z = true;
            }
            z = false;
            zl1Var3 = aiAssistantModalView.headerConfig;
            if (zl1Var3 instanceof xl1) {
                binding3.k.setVisibility(z4 ? 0 : 8);
                if (z4 && z) {
                    zl1Var5 = aiAssistantModalView.headerConfig;
                    if (((xl1) zl1Var5).b) {
                        i = 0;
                        goImageView2.setVisibility(i);
                        if (z4) {
                            zl1Var4 = aiAssistantModalView.headerConfig;
                            if (((xl1) zl1Var4).c) {
                                i2 = 0;
                                goImageView.setVisibility(i2);
                            }
                        }
                        i2 = 8;
                        goImageView.setVisibility(i2);
                    }
                }
                i = 8;
                goImageView2.setVisibility(i);
                if (z4) {
                }
                i2 = 8;
                goImageView.setVisibility(i2);
            } else {
                if (!jl40.l(zl1Var3, yl1Var)) {
                    w511.b();
                    return;
                }
                binding3.i.setVisibility(!z4 ? 0 : 8);
            }
            if (goImageView.getVisibility() == 0) {
                I(goImageView);
                int w = (int) tje.w(40, goImageView2.getContext());
                int r = tje.r(ql1.b, goImageView2.getContext());
                goImageView2.setPadding(r, goImageView2.getPaddingTop(), r, goImageView2.getPaddingBottom());
                c.D(w, goImageView2.getLayoutParams().height, goImageView2);
            } else {
                I(goImageView2);
            }
            WeakHashMap weakHashMap = b.a;
            if (!aiAssistantModalView.isLaidOut() || aiAssistantModalView.isLayoutRequested()) {
                aiAssistantModalView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.quark.ai_assistant.impl.ui.AiAssistantModalView$InnerView$configureContentVisibility$lambda$0$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view.removeOnLayoutChangeListener(this);
                        pl1.h(pl1.this);
                    }
                });
            } else {
                h(this);
            }
            binding3.d.b.setVisibility(mm1Var instanceof im1 ? 0 : 8);
        }
        if (z2 || (mm1Var instanceof lm1)) {
            return;
        }
        if (!(mm1Var instanceof km1)) {
            if (!(mm1Var instanceof im1)) {
                w511.b();
                return;
            }
            im1 im1Var = (im1) mm1Var;
            binding = aiAssistantModalView.getBinding();
            y1y y1yVar = binding.d;
            y1yVar.e.setText(im1Var.b);
            y1yVar.d.setText(im1Var.c);
            y1yVar.c.setText(im1Var.d);
            return;
        }
        km1 km1Var2 = (km1) mm1Var;
        zl1Var = aiAssistantModalView.headerConfig;
        if (!(zl1Var instanceof xl1)) {
            if (jl40.l(zl1Var, yl1Var)) {
                return;
            }
            w511.b();
            return;
        }
        binding2 = aiAssistantModalView.getBinding();
        RobotoTextView robotoTextView = binding2.k;
        zl1Var2 = aiAssistantModalView.headerConfig;
        String str = ((xl1) zl1Var2).a;
        if (str == null) {
            str = km1Var2.b;
        }
        robotoTextView.setText(str);
    }
}
