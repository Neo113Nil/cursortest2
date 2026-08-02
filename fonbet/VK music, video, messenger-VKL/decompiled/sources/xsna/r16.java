package xsna;

import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.a26;

/* compiled from: BannerCompanionRenderDelegate.kt */
/* loaded from: classes17.dex */
public final class r16 {
    public final FrameLayout a;
    public final u6d b;
    public final Object c;
    public final Object d;

    public r16(FrameLayout frameLayout, u6d u6dVar) {
        this.a = frameLayout;
        this.b = u6dVar;
        hh1 hh1Var = new hh1(this, 5);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, hh1Var);
        this.d = msy.a(lazyThreadSafetyMode, new s4(this, 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(a26 a26Var) {
        z16 z16Var;
        z16 z16Var2 = a26Var.a() ? (z16) this.c.getValue() : (z16) this.d.getValue();
        FrameLayout frameLayout = this.a;
        z16 z16Var3 = null;
        if (frameLayout.getChildCount() != 0) {
            View childAt = frameLayout.getChildAt(0);
            if (childAt instanceof z16) {
                z16Var = (z16) childAt;
                if (!epx.f(z16Var2, z16Var)) {
                    frameLayout.removeAllViews();
                    frameLayout.addView(z16Var2);
                }
                if (a26Var instanceof a26.c) {
                    if (a26Var instanceof a26.b) {
                        a26.b bVar = (a26.b) a26Var;
                        this.b.a(new p4d(bVar.b, bVar.f, bVar.e, bVar.d, bVar.c));
                        return;
                    }
                    if (!(a26Var instanceof a26.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((a26.a) a26Var).b) {
                        d3m.e(this.a, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
                        return;
                    } else {
                        f4m.j(frameLayout);
                        return;
                    }
                }
                a26.c cVar = (a26.c) a26Var;
                if (frameLayout.getChildCount() != 0) {
                    View childAt2 = frameLayout.getChildAt(0);
                    if (childAt2 instanceof z16) {
                        z16Var3 = (z16) childAt2;
                    }
                }
                if (z16Var3 != null) {
                    y16 y16Var = z16Var3.E;
                    z16Var3.B = false;
                    z16Var3.setImage(cVar.b);
                    String str = cVar.d;
                    String str2 = cVar.e;
                    String str3 = cVar.c;
                    VkText vkText = z16Var3.t;
                    if (str.length() > 0 && str2.length() > 0) {
                        str = z16Var3.getContext().getString(R.string.clips_banner_companion_label_string, str, str2);
                    } else if (str.length() <= 0) {
                        str = str2.length() > 0 ? str2 : "";
                    }
                    vkText.setText(str);
                    z16Var3.u.setText(str3);
                    z16Var3.setButtonText(cVar.f);
                    awt0.u(frameLayout, true);
                    d3m.c(this.a, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    Boolean bool = cVar.g;
                    if (epx.f(bool, Boolean.FALSE)) {
                        if (z16Var3.C) {
                            return;
                        }
                        z16Var3.P4(true);
                        y16Var.start();
                        z16Var3.C = true;
                        return;
                    }
                    if (epx.f(bool, Boolean.TRUE)) {
                        y16Var.cancel();
                        z16Var3.P4(false);
                        z16Var3.C = false;
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z16Var = null;
        if (!epx.f(z16Var2, z16Var)) {
        }
        if (a26Var instanceof a26.c) {
        }
    }
}
