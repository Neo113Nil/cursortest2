package xsna;

import android.view.View;
import android.widget.ProgressBar;
import com.vk.imageloader.view.VKImageView;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MusicTemplateBehaviorFacade.kt */
/* loaded from: classes17.dex */
public final class y950 implements z8e {
    public final /* synthetic */ z7e b;
    public final /* synthetic */ a8e c;
    public final /* synthetic */ aa50 d;

    public y950(z7e z7eVar, a8e a8eVar, aa50 aa50Var) {
        this.b = z7eVar;
        this.c = a8eVar;
        this.d = aa50Var;
    }

    @Override // xsna.z8e
    public final List<View> N0() {
        return EmptyList.b;
    }

    public final void a(yg5 yg5Var) {
        d3b0 v0;
        awc awcVar = this.b.a;
        VKImageView vKImageView = awcVar.b;
        if (!yg5Var.isReady() || yg5Var.J() || (v0 = yg5Var.v0()) == null || !v0.k(awcVar.a)) {
            vKImageView.setVisibility(0);
        } else {
            f4m.j(vKImageView);
        }
    }

    public final void b(boolean z) {
        a8e a8eVar = this.c;
        awc awcVar = a8eVar.c;
        boolean videoFocused = a8eVar.a.getVideoFocused();
        if (a8eVar.b.c(z && videoFocused)) {
            f4m.j(awcVar.c);
            return;
        }
        if (z && videoFocused) {
            ProgressBar progressBar = awcVar.c;
            if (!f4m.h(progressBar)) {
                d3m.c(progressBar, 300L, 400L, null, null, 1.0f);
            }
            k15.q(awcVar.d);
            return;
        }
        if (!videoFocused) {
            f4m.j(awcVar.c);
        } else if (awcVar.c.getVisibility() == 0) {
            k15.q(awcVar.c);
        }
    }

    @Override // xsna.z8e
    public final List<View> q1() {
        return this.d.q1();
    }

    @Override // xsna.z8e
    public final List<View> w2() {
        return this.d.w2();
    }
}
