package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final /* synthetic */ class nyc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ nyc0(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                aVar.t();
                break;
            case 1:
                View view = aVar.j;
                ViewGroup viewGroup = aVar.e;
                if (viewGroup != null) {
                    viewGroup.setVisibility(aVar.A ? 0 : 4);
                }
                if (view != null) {
                    int dimensionPixelSize = aVar.a.getResources().getDimensionPixelSize(jvg0.exo_styled_progress_margin_bottom);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (aVar.A) {
                            dimensionPixelSize = 0;
                        }
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                        view.setLayoutParams(marginLayoutParams);
                    }
                    if (view instanceof DefaultTimeBar) {
                        DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                        if (aVar.A) {
                            defaultTimeBar.hideScrubber(true);
                        } else {
                            int i2 = aVar.z;
                            if (i2 == 1) {
                                defaultTimeBar.hideScrubber(false);
                            } else if (i2 != 3) {
                                defaultTimeBar.showScrubber();
                            }
                        }
                    }
                }
                Iterator it = aVar.y.iterator();
                while (it.hasNext()) {
                    View view2 = (View) it.next();
                    view2.setVisibility((aVar.A && a.r(view2)) ? 4 : 0);
                }
                break;
            case 2:
                ValueAnimator valueAnimator = aVar.r;
                View view3 = aVar.k;
                PlayerControlView playerControlView = aVar.a;
                ViewGroup viewGroup2 = aVar.g;
                ViewGroup viewGroup3 = aVar.f;
                if (viewGroup3 != null && viewGroup2 != null) {
                    int width = (playerControlView.getWidth() - playerControlView.getPaddingLeft()) - playerControlView.getPaddingRight();
                    while (viewGroup2.getChildCount() > 1) {
                        int childCount = viewGroup2.getChildCount() - 2;
                        View childAt = viewGroup2.getChildAt(childCount);
                        viewGroup2.removeViewAt(childCount);
                        viewGroup3.addView(childAt, 0);
                    }
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                    int c = a.c(aVar.i);
                    int childCount2 = viewGroup3.getChildCount() - 1;
                    for (int i3 = 0; i3 < childCount2; i3++) {
                        c += a.c(viewGroup3.getChildAt(i3));
                    }
                    if (c <= width) {
                        ViewGroup viewGroup4 = aVar.h;
                        if (viewGroup4 != null && viewGroup4.getVisibility() == 0 && !valueAnimator.isStarted()) {
                            aVar.q.cancel();
                            valueAnimator.start();
                            break;
                        }
                    } else {
                        if (view3 != null) {
                            view3.setVisibility(0);
                            c += a.c(view3);
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i4 = 0; i4 < childCount2; i4++) {
                            View childAt2 = viewGroup3.getChildAt(i4);
                            c -= a.c(childAt2);
                            arrayList.add(childAt2);
                            if (c <= width) {
                                if (arrayList.isEmpty()) {
                                    viewGroup3.removeViews(0, arrayList.size());
                                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                                        viewGroup2.addView((View) arrayList.get(i5), viewGroup2.getChildCount() - 1);
                                    }
                                    break;
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                        }
                    }
                }
                break;
            case 3:
                aVar.n.start();
                break;
            case 4:
                aVar.m.start();
                break;
            case 5:
                aVar.l.start();
                aVar.l(2000L, aVar.u);
                break;
            default:
                aVar.q(2);
                break;
        }
    }
}
