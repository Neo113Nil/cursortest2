package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.VideoFile;
import com.vk.newsfeed.common.views.video.VideoAutoPlayHolderView;
import com.vk.permission.PermissionHelper;
import com.vk.video.ui.slider.impl.VideoSliderAutoPlayHolder;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dw20;
import xsna.ikv0;
import xsna.nps0;
import xsna.rps0;
import xsna.tps0;

/* compiled from: VideoAutoPlayHolder.kt */
/* loaded from: classes7.dex */
public final class t3s0 extends x5n0 {
    public static final /* synthetic */ int V0 = 0;
    public final View L0;
    public final View M0;
    public final View N0;
    public final TextView O0;
    public final FrameLayout P0;
    public final View Q0;
    public final View R0;
    public final gqk0 S0;
    public final ge70 T0;
    public mm50<ups0, nps0, rps0> U0;

    /* compiled from: VideoAutoPlayHolder.kt */
    public static final class a {
        public final Context a;

        public a(t3s0 t3s0Var) {
            this.a = t3s0Var.itemView.getContext();
        }
    }

    /* compiled from: VideoAutoPlayHolder.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<rps0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(rps0 rps0Var) {
            rps0 rps0Var2 = rps0Var;
            final t3s0 t3s0Var = (t3s0) this.receiver;
            if (rps0Var2 instanceof rps0.a) {
                ge70 ge70Var = t3s0Var.T0;
                View view = t3s0Var.itemView;
                rtg0 rtg0Var = new rtg0(t3s0Var, 18);
                ge70Var.getClass();
                Context context = view.getContext();
                PermissionHelper.a.getClass();
                if (PermissionHelper.b(context, PermissionHelper.b)) {
                    rtg0Var.invoke(Boolean.TRUE);
                } else {
                    Activity b = enj.b(view);
                    FragmentActivity fragmentActivity = b instanceof FragmentActivity ? (FragmentActivity) b : null;
                    if (fragmentActivity != null) {
                        dw20.b t0 = new dw20.b(context, null).v0(R.string.video_accept_push_notification_title).r0(R.string.video_accept_push_notification_subtitle).t0(context.getColor(R.color.vk_steel_gray_500));
                        Drawable drawable = context.getDrawable(R.drawable.vk_icon_notification_outline_56);
                        if (drawable != null) {
                            drawable.setTint(context.getColor(R.color.vk_azure_300));
                        } else {
                            drawable = null;
                        }
                        t0.N(drawable).j0(context.getString(R.string.video_allow_push_notification), new lb6(19, fragmentActivity, rtg0Var)).V(context.getString(R.string.video_deny_push_notification), new b010(rtg0Var, 17)).H0(fragmentActivity.getSupportFragmentManager(), null);
                    }
                }
            } else {
                int i = t3s0.V0;
                t3s0Var.getClass();
                if (!(rps0Var2 instanceof rps0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                rps0.b bVar = (rps0.b) rps0Var2;
                final String str = bVar.a;
                final int i2 = bVar.b;
                t3s0Var.itemView.post(new Runnable() { // from class: xsna.r3s0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Window c = pkv0.c(t3s0.this.itemView.getContext(), null);
                        if (c != null) {
                            ikv0.a aVar = new ikv0.a(c.getContext());
                            aVar.t = new ikv0.c.C3058c(i2, Integer.valueOf(R.attr.vk_ui_text_accent), (Size) null, 12);
                            aVar.u = new ikv0.d(new ikv0.d.c(str), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                            aVar.p(c);
                        }
                    }
                });
            }
            return s3q0.a;
        }
    }

    public t3s0(ViewGroup viewGroup, VideoSliderAutoPlayHolder videoSliderAutoPlayHolder, String str, Lazy lazy, Lazy lazy2, tps0.a aVar) {
        super(viewGroup, videoSliderAutoPlayHolder, str, lazy, lazy2, aVar);
        this.T0 = new ge70();
        TextView textView = (TextView) this.itemView.findViewById(R.id.subtitle);
        View findViewById = this.itemView.findViewById(R.id.video_preview);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.title);
        VideoAutoPlayHolderView videoAutoPlayHolderView = (VideoAutoPlayHolderView) this.itemView.findViewById(R.id.video_wrap);
        View findViewById2 = this.itemView.findViewById(R.id.avatar);
        this.L0 = findViewById2;
        if (findViewById2 != null) {
            f4m.j(findViewById2);
        }
        this.Q0 = videoAutoPlayHolderView.findViewById(R.id.video_spectators);
        this.M0 = videoAutoPlayHolderView.findViewById(R.id.video_duration_holder);
        this.N0 = videoAutoPlayHolderView.findViewById(R.id.video_inline_live_holder);
        TextView textView3 = new TextView(this.itemView.getContext());
        textView3.setTextAppearance(R.style.VkUiTypography_Caption1);
        textView3.setCompoundDrawablePadding(iah0.a(4));
        his0.x(textView3, R.color.vk_white);
        his0.v(textView3, R.drawable.vk_icon_clock_outline_12, R.color.vk_white);
        textView3.setBackgroundColor(textView3.getContext().getColor(R.color.vk_black_alpha45));
        bwt0.d(textView3, iah0.a(r1), (r4 & 2) != 0, (r4 & 4) != 0);
        textView3.setGravity(16);
        textView3.setIncludeFontPadding(false);
        float f = 6;
        int a2 = iah0.a(f);
        f4m.l(a2, a2, textView3);
        int a3 = iah0.a(3);
        f4m.B(a3, a3, textView3);
        f4m.j(textView3);
        this.O0 = textView3;
        FrameLayout frameLayout = new FrameLayout(this.itemView.getContext());
        AppCompatImageView appCompatImageView = new AppCompatImageView(frameLayout.getContext());
        appCompatImageView.setImageResource(R.drawable.vk_icon_logo_live_28);
        bwt0.o0(appCompatImageView, appCompatImageView.getContext().getColor(R.color.vk_white));
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        f4m.v(iah0.a(1), appCompatImageView);
        frameLayout.addView(appCompatImageView, new FrameLayout.LayoutParams(-1, -1));
        int a4 = iah0.a(f);
        f4m.l(a4, a4, frameLayout);
        f4m.j(frameLayout);
        this.P0 = frameLayout;
        View view = new View(videoAutoPlayHolderView.getContext());
        view.setBackgroundColor(view.getContext().getColor(R.color.vk_black_alpha35));
        f4m.j(view);
        this.R0 = view;
        gqk0 gqk0Var = new gqk0(videoAutoPlayHolderView.getContext());
        jjc.g(gqk0Var, new q8i0(this, 20));
        f4m.j(gqk0Var);
        this.S0 = gqk0Var;
        videoAutoPlayHolderView.addView(this.R0, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = this.P0;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, iah0.a(20));
        layoutParams.gravity = 8388693;
        s3q0 s3q0Var = s3q0.a;
        videoAutoPlayHolderView.addView(frameLayout2, layoutParams);
        TextView textView4 = this.O0;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388691;
        videoAutoPlayHolderView.addView(textView4, layoutParams2);
        gqk0 gqk0Var2 = this.S0;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, iah0.a(28));
        layoutParams3.gravity = 8388661;
        videoAutoPlayHolderView.addView(gqk0Var2, layoutParams3);
        int a5 = iah0.a(8);
        TextView textView5 = this.O0;
        if (textView5 != null) {
            f4m.s(a5, textView5);
            f4m.q(a5, textView5);
        }
        FrameLayout frameLayout3 = this.P0;
        if (frameLayout3 != null) {
            f4m.r(a5, frameLayout3);
            f4m.q(a5, frameLayout3);
        }
        gqk0 gqk0Var3 = this.S0;
        if (gqk0Var3 != null) {
            f4m.r(a5, gqk0Var3);
            f4m.t(a5, gqk0Var3);
        }
        WeakHashMap weakHashMap = j6r0.a;
        f4m.t(iah0.a(7.0f), textView2);
        f4m.q(iah0.a(12.0f), textView);
        if (findViewById2 != null) {
            f4m.t(iah0.a(8.0f), findViewById2);
        }
        textView.setLineSpacing((int) iah0.y(3.0f), 1.0f);
        float dimension = this.itemView.getContext().getResources().getDimension(R.dimen.video_view_corner_radius);
        videoAutoPlayHolderView.setClipToOutline(true);
        videoAutoPlayHolderView.setOutlineProvider(new s3s0(dimension));
        int dimensionPixelSize = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.video_view_stroke);
        ProgressBar progressBar = this.U;
        if (progressBar != null) {
            f4m.s(dimensionPixelSize, progressBar);
        }
        ProgressBar progressBar2 = this.U;
        if (progressBar2 != null) {
            f4m.r(dimensionPixelSize, progressBar2);
        }
        findViewById.setForeground(this.itemView.getContext().getDrawable(R.drawable.round_borders_stroked));
        videoAutoPlayHolderView.setForeground(null);
        M7();
    }

    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder
    public final void F7(View view, int i, boolean z) {
        Activity b2;
        if (this.L.j == null || (b2 = enj.b(view)) == null) {
            return;
        }
        uc.r(this.L, b2, true, null, null, null, null, 252);
    }

    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder
    public final void H7() {
        VideoFile A;
        yg5 yg5Var = this.h0;
        if (yg5Var == null || (A = yg5Var.A()) == null) {
            return;
        }
        boolean z = !A.v() || A.X2();
        View view = this.M0;
        if (view != null) {
            bwt0.p0(view, z);
        }
        if (z) {
            super.H7();
        }
    }

    public final void M7() {
        mm50<ups0, nps0, rps0> d = up2.d(new iy2(3), new kh5(new a(this), 0), svj.b);
        this.U0 = d;
        ((um50) d).G(new q3s0(this, 0));
        mm50<ups0, nps0, rps0> mm50Var = this.U0;
        if (mm50Var != null) {
            mm50Var.R(new b(1, this, t3s0.class, "handelEvents", "handelEvents(Lcom/vk/video/ui/slider/impl/entity/VideoHolderEvent;)V", 0));
        }
    }

    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder, xsna.fi, android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ProgressBar progressBar;
        Trace.beginSection("VideoAutoPlayHolder.onViewAttachedToWindow");
        try {
            if (this.U0 == null) {
                M7();
            }
            super.onViewAttachedToWindow(view);
            yg5 yg5Var = this.h0;
            if (yg5Var != null && this.L.N(yg5Var) && (progressBar = this.U) != null) {
                progressBar.setVisibility(0);
            }
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder, xsna.fi, android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        super.onViewDetachedFromWindow(view);
        mm50<ups0, nps0, rps0> mm50Var = this.U0;
        if (mm50Var != null) {
            mm50Var.clear();
        }
        this.U0 = null;
    }

    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder, xsna.eq6
    /* renamed from: z7 */
    public final void c7(VideoAttachment videoAttachment) {
        if (videoAttachment == null) {
            return;
        }
        if (this.U0 == null) {
            M7();
        }
        mm50<ups0, nps0, rps0> mm50Var = this.U0;
        if (mm50Var != null) {
            mm50Var.b(new nps0.a(videoAttachment.k));
        }
        super.c7(videoAttachment);
    }
}
