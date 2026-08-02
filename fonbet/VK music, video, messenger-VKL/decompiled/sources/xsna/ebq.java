package xsna;

import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.view.TouchDelegate;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.ui.views.StencilLayout;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ebq implements Runnable {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ebq(View view, View view2, int i) {
        this.d = view;
        this.c = i;
        this.e = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        int i = this.b;
        int i2 = this.c;
        Object obj3 = this.e;
        View view = this.d;
        switch (i) {
            case 0:
                Rect rect = new Rect();
                view.getHitRect(rect);
                rect.top -= i2;
                rect.left -= i2;
                rect.bottom += i2;
                rect.right += i2;
                ((View) obj3).setTouchDelegate(new TouchDelegate(rect, view));
                break;
            default:
                nts0 nts0Var = (nts0) view;
                List list = (List) obj3;
                List list2 = list;
                List list3 = list;
                Iterator it = list3.iterator();
                while (true) {
                    obj = null;
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((e0l0) obj2).a == i2) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                e0l0 e0l0Var = (e0l0) obj2;
                if (e0l0Var == null) {
                    e0l0Var = (e0l0) j5g.Y(list);
                }
                Integer j = p4g.j(e0l0Var, list2);
                nts0Var.e((j != null ? j.intValue() : 0) + 1, true);
                bq2 bq2Var = nts0Var.A;
                int i3 = nts0.E;
                StencilLayout stencilLayout = (StencilLayout) bq2Var.b;
                Iterator it2 = list3.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (((e0l0) next).a == i3) {
                            obj = next;
                        }
                    }
                }
                e0l0 e0l0Var2 = (e0l0) obj;
                if (e0l0Var2 == null) {
                    e0l0Var2 = (e0l0) j5g.Y(list);
                }
                stencilLayout.setStencil(e0l0Var2.b);
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (!stencilLayout.isLaidOut()) {
                    stencilLayout.addOnLayoutChangeListener(new h0l0(stencilLayout));
                } else if (stencilLayout.getMeasuredWidth() != 0 && stencilLayout.getMeasuredHeight() != 0) {
                    Paint paint = new Paint();
                    paint.setShader(new RadialGradient(stencilLayout.getMeasuredWidth() / 2.0f, stencilLayout.getMeasuredHeight() / 2.0f, Integer.min(stencilLayout.getMeasuredWidth(), stencilLayout.getMeasuredHeight()) / 2.0f, new int[]{-16777216, 0}, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f}, Shader.TileMode.CLAMP));
                    stencilLayout.h = paint;
                    stencilLayout.f = true;
                    stencilLayout.invalidate();
                }
                ((ObjectAnimator) bq2Var.c).start();
                break;
        }
    }

    public /* synthetic */ ebq(nts0 nts0Var, List list, int i) {
        this.d = nts0Var;
        this.e = list;
        this.c = i;
    }
}
