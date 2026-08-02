package xsna;

import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.vk.httpexecutor.api.exceptions.SocialNetworkException;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: SocialNetworkHelper.kt */
/* loaded from: classes17.dex */
public final class eek0 implements b780 {
    public final /* synthetic */ b780 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewOutlineProvider d;
    public final /* synthetic */ boolean e;

    public eek0(b780 b780Var, View view, ViewOutlineProvider viewOutlineProvider, boolean z) {
        this.b = b780Var;
        this.c = view;
        this.d = viewOutlineProvider;
        this.e = z;
    }

    @Override // xsna.b780
    public final void b(String str, Throwable th) {
        b780 b780Var = this.b;
        if (b780Var != null) {
            b780Var.b(str, th);
        }
        int i = dek0.a;
        List<Throwable> b = th != null ? qta0.a.b(th) : null;
        boolean z = false;
        if (b != null) {
            List<Throwable> list = b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((Throwable) it.next()) instanceof SocialNetworkException) {
                        z = true;
                        break;
                    }
                }
            }
        }
        if (dek0.c && z) {
            int i2 = dek0.b;
            View view = this.c;
            if (bwt0.K(view)) {
                bwt0.d0(view, true);
            }
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup == null) {
                return;
            }
            int id = viewGroup.getId();
            int i3 = dek0.a;
            if (id == i3) {
                View findViewById = viewGroup.findViewById(i2);
                View view2 = findViewById != null ? findViewById : null;
                if (view2 == null || bwt0.K(view2)) {
                    return;
                }
                bwt0.p0(view2, true);
                return;
            }
            int indexOfChild = viewGroup.indexOfChild(view);
            viewGroup.removeViewAt(indexOfChild);
            TransitionManager.beginDelayedTransition(viewGroup);
            FrameLayout frameLayout = new FrameLayout(view.getContext());
            frameLayout.setId(i3);
            bwt0.Z(R.attr.vk_ui_image_placeholder, frameLayout);
            ViewOutlineProvider viewOutlineProvider = this.d;
            if (viewOutlineProvider != null) {
                frameLayout.setOutlineProvider(viewOutlineProvider);
                frameLayout.setClipToOutline(true);
            }
            frameLayout.addView(view);
            cek0 cek0Var = new cek0(view.getContext(), this.e);
            cek0Var.setOutlineProvider(viewOutlineProvider);
            cek0Var.setClipToOutline(true);
            cek0Var.setId(i2);
            frameLayout.addView(cek0Var, new FrameLayout.LayoutParams(-1, -1));
            viewGroup.addView(frameLayout, indexOfChild, view.getLayoutParams());
            viewGroup.requestLayout();
            viewGroup.invalidate();
        }
    }

    @Override // xsna.b780
    public final void g(String str) {
        b780 b780Var = this.b;
        if (b780Var != null) {
            b780Var.g(str);
        }
    }

    @Override // xsna.b780
    public final void onCancel(String str) {
        b780 b780Var = this.b;
        if (b780Var != null) {
            b780Var.onCancel(str);
        }
    }

    @Override // xsna.b780
    public final void t(int i, int i2, String str) {
        b780 b780Var = this.b;
        if (b780Var != null) {
            b780Var.t(i, i2, str);
        }
        if (dek0.c) {
            int i3 = dek0.a;
            View view = this.c;
            if (!bwt0.K(view)) {
                view.setVisibility(0);
            }
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null && viewGroup.getId() == dek0.a) {
                View findViewById = viewGroup.findViewById(dek0.b);
                View view2 = findViewById != null ? findViewById : null;
                if (view2 == null) {
                    return;
                }
                bwt0.p0(view2, false);
            }
        }
    }
}
