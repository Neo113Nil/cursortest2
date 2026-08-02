package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.media3.exoplayer.video.g;
import com.google.android.material.appbar.AppBarLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vkontakte.android.R;
import java.util.List;
import ru.ok.android.webrtc.PeerConnectionClient;
import ru.ok.proto.okmp.FileDescriptorRefCountWrapper;
import ru.ok.proto.okmp.OkmpClient;
import ru.ok.tracer.crash.report.LogEntry;
import ru.ok.tracer.crash.report.LogStorage;
import xsna.f8h;
import xsna.j1d0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class d8h implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d8h(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final gqk0 gqk0Var;
        Boolean bool;
        int i = this.b;
        boolean z = true;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                f8h f8hVar = (f8h) obj2;
                Float f = (Float) obj;
                i8h i8hVar = f8hVar.l;
                xy80 xy80Var = f8hVar.y;
                g8h g8hVar = f8hVar.o;
                f8hVar.z.a(10000L);
                f8hVar.g.b();
                f8h.b bVar = f8hVar.c;
                View view = bVar.b;
                View view2 = bVar.c;
                ViewGroup viewGroup = (ViewGroup) (view != null ? view.getParent() : null);
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
                if (view != null) {
                    view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                ViewGroup viewGroup2 = f8hVar.r;
                if (viewGroup2 != null) {
                    viewGroup2.addView(view);
                }
                ViewGroup viewGroup3 = (ViewGroup) (view2 != null ? view2.getParent() : null);
                if (viewGroup3 != null) {
                    viewGroup3.removeView(view2);
                }
                if (view2 != null) {
                    view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                ViewGroup viewGroup4 = f8hVar.s;
                if (viewGroup4 != null) {
                    viewGroup4.addView(view2);
                }
                Integer num = f8hVar.v;
                if (num != null) {
                    int intValue = num.intValue();
                    ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
                    AppBarLayout.d dVar = layoutParams instanceof AppBarLayout.d ? (AppBarLayout.d) layoutParams : null;
                    if (dVar != null) {
                        dVar.a = intValue;
                    }
                }
                i8hVar.l = true;
                ValueAnimator valueAnimator = i8hVar.k;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                }
                ValueAnimator valueAnimator2 = i8hVar.k;
                if (valueAnimator2 != null) {
                    valueAnimator2.pause();
                }
                ValueAnimator valueAnimator3 = i8hVar.k;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                View view3 = f8hVar.p;
                if (view != null) {
                    view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                if (view3 != null) {
                    view3.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                ViewGroup viewGroup5 = (ViewGroup) g8hVar.getParent();
                if (viewGroup5 != null) {
                    viewGroup5.removeView(g8hVar);
                }
                ((ViewGroup) f8hVar.b.getWindow().getDecorView()).removeView(g8hVar);
                ew3 ew3Var = f8hVar.i;
                if (ew3Var != null) {
                    ew3Var.invoke();
                }
                xy80Var.i();
                xy80Var.g();
                xy80Var.disable();
                f8hVar.e.a.invoke(new CommunityProfileAction.g.d.f(false));
                jyg b = bVar.a.b();
                if (b != null) {
                    b.W5(f);
                    break;
                }
                break;
            case 1:
                LogStorage.log$lambda$1((LogStorage) obj2, (LogEntry) obj);
                break;
            case 2:
                ((j7j) obj2).accept(obj);
                break;
            case 3:
                ((OkmpClient) obj2).lambda$start$0((FileDescriptorRefCountWrapper) obj);
                break;
            case 4:
                ((PeerConnectionClient) obj2).b((List) obj);
                break;
            case 5:
                sht0 sht0Var = (sht0) obj;
                j1d0.a aVar = ((j1d0) obj2).f;
                if (aVar != null) {
                    aVar.a(sht0Var);
                    break;
                }
                break;
            case 6:
                t3s0 t3s0Var = (t3s0) obj2;
                ups0 ups0Var = (ups0) obj;
                if (ups0Var.b != null) {
                    xjz xjzVar = ups0Var.c;
                    if (xjzVar != null && (gqk0Var = t3s0Var.S0) != null) {
                        final String str = xjzVar.a;
                        final Integer num2 = xjzVar.b;
                        final boolean z2 = xjzVar.c;
                        if (str != null && num2 != null && ((bool = gqk0Var.c) == null || !bool.equals(Boolean.valueOf(z2)))) {
                            gqk0Var.c = Boolean.valueOf(z2);
                            gqk0Var.post(new Runnable() { // from class: xsna.fqk0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final gqk0 gqk0Var2 = gqk0.this;
                                    ViewPropertyAnimator duration = gqk0Var2.animate().alpha(0.5f).setDuration(150L);
                                    final Integer num3 = num2;
                                    final boolean z3 = z2;
                                    final String str2 = str;
                                    duration.withEndAction(new Runnable() { // from class: xsna.eqk0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            gqk0 gqk0Var3 = gqk0.this;
                                            Context context = gqk0Var3.getContext();
                                            TextView textView = gqk0Var3.b;
                                            Drawable drawable = context.getDrawable(num3.intValue());
                                            if (drawable != null) {
                                                float f2 = 16;
                                                drawable.setBounds(0, 0, iah0.a(f2), iah0.a(f2));
                                            }
                                            if (z3) {
                                                his0.x(textView, R.color.vk_white);
                                                if (drawable != null) {
                                                    drawable.setTint(gqk0Var3.getContext().getColor(R.color.vk_white));
                                                }
                                                gqk0Var3.setBackgroundColor(gqk0Var3.getContext().getColor(R.color.vk_black_alpha45));
                                            } else {
                                                his0.x(textView, R.color.vk_black);
                                                if (drawable != null) {
                                                    drawable.setTint(gqk0Var3.getContext().getColor(R.color.vk_black));
                                                }
                                                gqk0Var3.setBackgroundColor(gqk0Var3.getContext().getColor(R.color.vk_white));
                                            }
                                            textView.setCompoundDrawables(drawable, null, null, null);
                                            textView.setText(str2);
                                            gqk0Var3.animate().alpha(1.0f).setDuration(150L).start();
                                        }
                                    }).start();
                                }
                            });
                        }
                    }
                    boolean z3 = ups0Var.f;
                    boolean z4 = ups0Var.d;
                    boolean z5 = ups0Var.e;
                    Integer num3 = ups0Var.g;
                    if (num3 != null) {
                        int intValue2 = num3.intValue();
                        FrameLayout frameLayout = t3s0Var.P0;
                        if (frameLayout != null) {
                            frameLayout.setBackgroundResource(intValue2);
                        }
                    }
                    View view4 = t3s0Var.R0;
                    if (view4 != null) {
                        bwt0.p0(view4, z5);
                    }
                    TextView textView = t3s0Var.O0;
                    if (textView != null) {
                        bwt0.p0(textView, z5);
                    }
                    gqk0 gqk0Var2 = t3s0Var.S0;
                    if (gqk0Var2 != null) {
                        bwt0.p0(gqk0Var2, z5);
                    }
                    View view5 = t3s0Var.N0;
                    if (view5 != null) {
                        bwt0.p0(view5, !z5);
                    }
                    FrameLayout frameLayout2 = t3s0Var.P0;
                    if (frameLayout2 != null) {
                        if (!z4 && !z3) {
                            z = false;
                        }
                        bwt0.p0(frameLayout2, z);
                    }
                    TextView textView2 = t3s0Var.O0;
                    if (textView2 != null) {
                        textView2.setText(ups0Var.h);
                    }
                    Integer num4 = ups0Var.i;
                    if (num4 != null) {
                        int intValue3 = num4.intValue();
                        ProgressBar progressBar = t3s0Var.U;
                        if (progressBar != null) {
                            progressBar.setMax(intValue3);
                        }
                    }
                    t3s0Var.z0.setVisibility(0);
                    break;
                }
                break;
            case 7:
                androidx.media3.exoplayer.video.g gVar = ((g.a) obj2).b;
                String str2 = y2r0.a;
                gVar.j((String) obj);
                break;
            default:
                ((ru.mail.libverify.n.m) obj2).a((Uri) obj);
                break;
        }
    }
}
