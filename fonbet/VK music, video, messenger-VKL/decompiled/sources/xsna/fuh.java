package xsna;

import android.graphics.Rect;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.community.design.compose.topbar.PassthroughThemedComposeView;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.o1i;

/* compiled from: CommunityProfileTopBarDelegates.kt */
/* loaded from: classes5.dex */
public abstract class fuh implements euh {
    public final guh a;
    public final iuh b;

    public fuh(guh guhVar) {
        this.a = guhVar;
        PassthroughThemedComposeView passthroughThemedComposeView = guhVar.a;
        iuh iuhVar = new iuh(passthroughThemedComposeView);
        this.b = iuhVar;
        d(new CommunityProfileViewState.Data.e.a(EmptyList.b));
        h(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        o(iuhVar);
        passthroughThemedComposeView.setContent(new jai(-881681578, new ht7(this, 3), true));
    }

    @Override // xsna.euh
    public final void a(boolean z) {
        ((zak0) this.b.f).setValue(Boolean.valueOf(z));
    }

    @Override // xsna.euh
    public final void b(int i) {
        f4m.l(i, i, this.b.a);
    }

    @Override // xsna.euh
    public final o1i.a.InterfaceC3433a.C3434a c() {
        iuh iuhVar = this.b;
        zhf0 a = iuhVar.a();
        if (a == null && (a = iuhVar.b()) == null) {
            return null;
        }
        return new o1i.a.InterfaceC3433a.C3434a(xa4.K(a), iuhVar.a);
    }

    /* JADX WARN: Finally extract failed */
    @Override // xsna.euh
    public void d(CommunityProfileViewState.Data.e eVar) {
        uh50 C;
        iuh iuhVar = this.b;
        ((zak0) iuhVar.b).setValue(eVar);
        if (eVar != null) {
            return;
        }
        iuhVar.getClass();
        dak0 j = qak0.j();
        uh50 uh50Var = j instanceof uh50 ? (uh50) j : null;
        if (uh50Var == null || (C = uh50Var.C(null, null)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        try {
            dak0 j2 = C.j();
            try {
                ((vak0) iuhVar.c).g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ((zak0) iuhVar.g).setValue(Boolean.FALSE);
                s3q0 s3q0Var = s3q0.a;
                C.w().a();
                C.c();
                iuhVar.l = null;
                iuhVar.m = null;
                iuhVar.n = null;
                iuhVar.o = xax.e;
            } finally {
                dak0.q(j2);
            }
        } finally {
        }
    }

    @Override // xsna.euh
    public final void e() {
        iuh iuhVar = this.b;
        ((zak0) iuhVar.d).setValue(Boolean.FALSE);
        zak0 zak0Var = (zak0) iuhVar.h;
        if (((tho0) zak0Var.getValue()).a.c.length() > 0) {
            zak0Var.setValue(new tho0((String) null, 0L, 7));
            this.a.e.invoke(new CommunityProfileAction.b0.b(0));
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.euh
    public final PassthroughThemedComposeView f() {
        return this.a.a;
    }

    @Override // xsna.euh
    public final void g(int i) {
        ((wak0) this.b.e).C(i);
    }

    @Override // xsna.euh
    public final void h(float f) {
        uh50 C;
        iuh iuhVar = this.b;
        iuhVar.getClass();
        dak0 j = qak0.j();
        uh50 uh50Var = j instanceof uh50 ? (uh50) j : null;
        if (uh50Var == null || (C = uh50Var.C(null, null)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        try {
            dak0 j2 = C.j();
            try {
                ((vak0) iuhVar.c).g(f);
                wh50<Boolean> wh50Var = iuhVar.g;
                boolean z = false;
                if (f >= 1.0f) {
                    WeakReference<View> weakReference = iuhVar.p;
                    View view = weakReference != null ? weakReference.get() : null;
                    if (iuhVar.a.getBottom() >= (view != null ? f4m.e(view).bottom : 0) - (((view != null ? view.getHeight() : 0) - (view != null ? view.getPaddingTop() : 0)) * 0.5d)) {
                        z = true;
                    }
                }
                ((zak0) wh50Var).setValue(Boolean.valueOf(z));
                s3q0 s3q0Var = s3q0.a;
                C.w().a();
            } finally {
                dak0.q(j2);
            }
        } finally {
        }
    }

    @Override // xsna.euh
    public final float i() {
        return this.b.a.getTranslationY() + r0.getBottom();
    }

    @Override // xsna.euh
    public final boolean isLoading() {
        return ((Boolean) ((zak0) this.b.f).getValue()).booleanValue();
    }

    @Override // xsna.euh
    public void j(Rect rect) {
        iuh iuhVar = this.b;
        rg50 rg50Var = iuhVar.i;
        if (rect.top != 0 || ((wak0) rg50Var).getIntValue() <= 0) {
            ((wak0) rg50Var).C(rect.top);
            PassthroughThemedComposeView passthroughThemedComposeView = iuhVar.a;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            Pair y = k9q0.y(rect.left, rect.right, passthroughThemedComposeView.getLayoutDirection() == 1);
            int intValue = ((Number) y.d()).intValue();
            int intValue2 = ((Number) y.g()).intValue();
            ((wak0) iuhVar.j).C(intValue);
            ((wak0) iuhVar.k).C(intValue2);
        }
    }

    @Override // xsna.euh
    public final void k() {
        ((zak0) this.b.d).setValue(Boolean.TRUE);
    }

    @Override // xsna.euh
    public final void l(WeakReference<View> weakReference) {
        this.b.p = weakReference;
    }

    @Override // xsna.euh
    public final boolean m() {
        return ((Boolean) ((zak0) this.b.d).getValue()).booleanValue();
    }

    public abstract void n(int i, androidx.compose.runtime.a aVar);

    public abstract void o(iuh iuhVar);
}
