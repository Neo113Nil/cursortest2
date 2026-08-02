package xsna;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class im30 implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ im30(VkOnboardingHighlighter vkOnboardingHighlighter, boolean z, Long l, gzs gzsVar) {
        this.d = vkOnboardingHighlighter;
        this.c = z;
        this.e = l;
        this.f = gzsVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                vm30 vm30Var = (vm30) this.d;
                qk30.f(vm30Var.H, (List) this.e, (m.d) this.f);
                RecyclerView recyclerView = vm30Var.u;
                recyclerView.invalidateItemDecorations();
                if (vm30Var.o) {
                    vm30.q(vm30Var, new f410(vm30Var, 7));
                }
                if (vm30Var.h() > 0 && this.c) {
                    rk30 rk30Var = (rk30) vm30Var.s.getValue();
                    if (!epx.f(recyclerView.getItemAnimator(), rk30Var)) {
                        recyclerView.setItemAnimator(rk30Var);
                    }
                } else if (!epx.f(recyclerView.getItemAnimator(), null)) {
                    recyclerView.setItemAnimator(null);
                }
                return s3q0.a;
            default:
                return VkOnboardingHighlighter.a((VkOnboardingHighlighter) this.d, this.c, (Long) this.e, (gzs) this.f);
        }
    }

    public /* synthetic */ im30(vm30 vm30Var, List list, m.d dVar, boolean z) {
        this.d = vm30Var;
        this.e = list;
        this.f = dVar;
        this.c = z;
    }
}
