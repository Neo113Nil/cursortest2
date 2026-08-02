package xsna;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.feed.design.view.newsfeed.restriction.RestrictedBlurredPhotoView;
import com.vk.feed.design.view.newsfeed.restriction.RestrictedPhotoView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.lps0;
import xsna.p5t;
import xsna.tr00;
import xsna.y4a0;

/* compiled from: GalvitaGridItemAdapter.kt */
/* loaded from: classes4.dex */
public final class y5t extends b6y0<de6<?>> {
    public final h170 b;
    public final ArrayList c = new ArrayList();
    public final boolean d = true;
    public p5t.a e;

    public y5t(h170 h170Var) {
        this.b = h170Var;
    }

    @Override // xsna.b6y0
    public final int a() {
        return this.c.size();
    }

    @Override // xsna.b6y0
    public final void b(int i, e6y0 e6y0Var) {
        v64 v64Var = (v64) j5g.b0(i, this.c);
        e6y0Var.a = v64Var != null ? v64Var.d() : e6y0Var.a;
        e6y0Var.b = v64Var != null ? v64Var.b() : e6y0Var.b;
    }

    @Override // xsna.b6y0
    public final int c(int i) {
        v64 v64Var = (v64) j5g.b0(i, this.c);
        if (v64Var != null) {
            return v64Var.c();
        }
        return -1;
    }

    @Override // xsna.b6y0
    public final /* bridge */ /* synthetic */ void d(de6<?> de6Var, boolean z, boolean z2, boolean z3, boolean z4) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.b6y0
    public final void e(de6<?> de6Var, int i) {
        de6<?> de6Var2 = de6Var;
        T t = (T) j5g.b0(i, this.c);
        if (t != 0) {
            de6Var2.getClass();
            de6Var2.d = t.a();
            de6Var2.e = t;
            de6Var2.f = null;
            de6Var2.c(t);
            if (de6Var2 instanceof xna0) {
                ((xna0) de6Var2).a(null);
            }
        }
    }

    @Override // xsna.b6y0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final de6 f(int i, ViewGroup viewGroup) {
        h170 h170Var = this.b;
        boolean z = this.d;
        if (i == 0) {
            return new y9a0(viewGroup, z, this.e, h170Var);
        }
        if (i == 1) {
            return lps0.a.a(viewGroup, z);
        }
        if (i == 2) {
            return y4a0.a.a(viewGroup, z, this.e, h170Var);
        }
        if (i == 3) {
            return tr00.a.a(viewGroup, z, this.e);
        }
        if (i == 4) {
            return new ntn(new iun(viewGroup, z), 4);
        }
        if (i == 5) {
            return new ntn(new iun(viewGroup, z), 5);
        }
        if (i == 10) {
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            RestrictedPhotoView restrictedPhotoView = new RestrictedPhotoView(viewGroup.getContext(), null, 6, 0);
            restrictedPhotoView.setId(R.id.attach);
            frameLayout.addView(restrictedPhotoView);
            return new cba0(frameLayout);
        }
        if (i != 11) {
            return null;
        }
        FrameLayout frameLayout2 = new FrameLayout(viewGroup.getContext());
        RestrictedBlurredPhotoView restrictedBlurredPhotoView = new RestrictedBlurredPhotoView(viewGroup.getContext(), null, 6);
        restrictedBlurredPhotoView.setId(R.id.attach);
        restrictedBlurredPhotoView.c(R.drawable.vk_icon_hide_outline_56, -1, RestrictedPhotoView.u);
        int b = cn70.b(8);
        restrictedBlurredPhotoView.setPadding(b, b, b, b);
        frameLayout2.addView(restrictedBlurredPhotoView);
        return new r5a0(frameLayout2);
    }
}
