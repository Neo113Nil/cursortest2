package xsna;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.tool.view.FluidHorizontalLayout;
import com.vk.core.view.ProgressView;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.im.ui.views.msg.MsgPartExpiredStorySnippet;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;
import xsna.g34;
import xsna.pik0;

/* compiled from: MsgPartStoryHolder.kt */
/* loaded from: classes2.dex */
public final class xt30 extends ho30 implements g34.a {
    public static final int G = iah0.a(36);
    public yt30 D;
    public pk30 E;
    public FluidHorizontalLayout f;
    public VKEnhancedImageView g;
    public ImageView h;
    public ImageView i;
    public TextView j;
    public View k;
    public View l;
    public TextView m;
    public r3e0 n;
    public View o;
    public TimeAndStatusView p;
    public MsgPartExpiredStorySnippet q;
    public g34 r;
    public final bpn0 s = new bpn0(new ecm(this, 27));
    public final bpn0 t = new bpn0(new ko00(this, 7));
    public final bpn0 u = new bpn0(new wt30(this, 0));
    public final bpn0 v = new bpn0(new hvz(this, 11));
    public final bpn0 w = new bpn0(new foi(this, 28));
    public final bpn0 x = new bpn0(new n1i(this, 25));
    public final bpn0 y = new bpn0(new f84(15));
    public final bpn0 z = new bpn0(new vt30(this, 0));
    public final bpn0 A = new bpn0(new h1j(this, 26));
    public final bpn0 B = new bpn0(new wzh(this, 25));
    public final bpn0 C = new bpn0(new lo10(this, 2));
    public final v5t F = new v5t(R.layout.vkim_msg_part_story);

    /* compiled from: MsgPartStoryHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserSex.values().length];
            try {
                iArr[UserSex.FEMALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserSex.MALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class b implements izs<View, s3q0> {
        public b() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            xt30 xt30Var = xt30.this;
            pk30 pk30Var = xt30Var.E;
            yt30 yt30Var = xt30Var.D;
            Msg msg = yt30Var != null ? yt30Var.E : null;
            Attach attach = yt30Var != null ? yt30Var.G : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, yt30Var != null ? yt30Var.F : null);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class c implements izs<View, s3q0> {
        public c() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            xt30 xt30Var = xt30.this;
            pk30 pk30Var = xt30Var.E;
            yt30 yt30Var = xt30Var.D;
            Msg msg = yt30Var != null ? yt30Var.E : null;
            Attach attach = yt30Var != null ? yt30Var.G : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, yt30Var != null ? yt30Var.F : null);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class d implements View.OnLongClickListener {
        public d() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            xt30 xt30Var = xt30.this;
            pk30 pk30Var = xt30Var.E;
            yt30 yt30Var = xt30Var.D;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = yt30Var != null ? yt30Var.E : null;
            Attach attach = yt30Var != null ? yt30Var.G : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, yt30Var != null ? yt30Var.F : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class e implements View.OnLongClickListener {
        public e() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            xt30 xt30Var = xt30.this;
            pk30 pk30Var = xt30Var.E;
            yt30 yt30Var = xt30Var.D;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = yt30Var != null ? yt30Var.E : null;
            Attach attach = yt30Var != null ? yt30Var.G : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, yt30Var != null ? yt30Var.F : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    @Override // xsna.g34.a
    public final void c(int i) {
        r3e0 r3e0Var = this.n;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.b(i);
    }

    @Override // xsna.g34.a
    public final void e(int i, int i2, int i3) {
        r3e0 r3e0Var = this.n;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.d(i, i2, i3);
    }

    @Override // xsna.g34.a
    public final void f(int i) {
        r3e0 r3e0Var = this.n;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.c(i);
    }

    @Override // xsna.hr30
    public final View n(int i) {
        FluidHorizontalLayout fluidHorizontalLayout;
        yt30 yt30Var = this.D;
        if (yt30Var == null || i != yt30Var.m || (fluidHorizontalLayout = this.f) == null) {
            return null;
        }
        return fluidHorizontalLayout;
    }

    @Override // xsna.hr30
    public final void p(yt30 yt30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        boolean z;
        Drawable drawable;
        yt30 yt30Var2;
        yt30 yt30Var3 = yt30Var;
        qtd0 qtd0Var = yt30Var3.f;
        qtd0 qtd0Var2 = yt30Var3.e;
        ImageList imageList = yt30Var3.l;
        ImageList imageList2 = yt30Var3.k;
        boolean z2 = yt30Var3.n;
        boolean z3 = yt30Var3.D;
        boolean z4 = yt30Var3.d;
        Attach attach = yt30Var3.G;
        this.e = attach instanceof AttachStory ? (AttachStory) attach : null;
        this.E = pk30Var;
        this.D = yt30Var3;
        g34 g34Var = yt30Var3.g;
        this.r = g34Var;
        if (g34Var != null) {
            g34Var.a(yt30Var3.m, this);
        }
        boolean s = s(yt30Var3);
        TimeAndStatusView timeAndStatusView = this.p;
        if (timeAndStatusView == null) {
            timeAndStatusView = null;
        }
        bwt0.p0(timeAndStatusView, s);
        VKEnhancedImageView vKEnhancedImageView = this.g;
        if (vKEnhancedImageView == null) {
            vKEnhancedImageView = null;
        }
        vKEnhancedImageView.setVisible(s);
        r3e0 r3e0Var = this.n;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        bwt0.p0(r3e0Var.a, s);
        ImageView imageView = this.i;
        if (imageView == null) {
            imageView = null;
        }
        bwt0.p0(imageView, s);
        TextView textView = this.j;
        if (textView == null) {
            textView = null;
        }
        bwt0.p0(textView, s);
        ImageView imageView2 = this.h;
        if (imageView2 == null) {
            imageView2 = null;
        }
        bwt0.p0(imageView2, s && (yt30Var2 = this.D) != null && yt30Var2.n && yt30Var2.o == AttachSyncState.DONE);
        View view = this.o;
        if (view == null) {
            view = null;
        }
        bwt0.p0(view, s);
        MsgPartExpiredStorySnippet msgPartExpiredStorySnippet = this.q;
        if (msgPartExpiredStorySnippet == null) {
            msgPartExpiredStorySnippet = null;
        }
        bwt0.p0(msgPartExpiredStorySnippet, !s);
        View view2 = this.k;
        if (view2 == null) {
            view2 = null;
        }
        bwt0.p0(view2, false);
        FluidHorizontalLayout fluidHorizontalLayout = this.f;
        if (fluidHorizontalLayout == null) {
            fluidHorizontalLayout = null;
        }
        fluidHorizontalLayout.setBackground(s ? null : z4 ? (Drawable) this.s.getValue() : (Drawable) this.t.getValue());
        FluidHorizontalLayout fluidHorizontalLayout2 = this.f;
        if (fluidHorizontalLayout2 == null) {
            fluidHorizontalLayout2 = null;
        }
        fluidHorizontalLayout2.setMinimumHeight(s ? 0 : G);
        FluidHorizontalLayout fluidHorizontalLayout3 = this.f;
        if (fluidHorizontalLayout3 == null) {
            fluidHorizontalLayout3 = null;
        }
        f4m.v(0, fluidHorizontalLayout3);
        DisplayNameFormatter displayNameFormatter = this.d;
        if (s) {
            if (z3) {
                VKEnhancedImageView vKEnhancedImageView2 = this.g;
                if (vKEnhancedImageView2 == null) {
                    vKEnhancedImageView2 = null;
                }
                bwt0.m0(iah0.a(Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE), iah0.a(376), vKEnhancedImageView2);
                TextView textView2 = this.j;
                if (textView2 == null) {
                    textView2 = null;
                }
                bwt0.r0(iah0.a(176), textView2);
                textView2.setTextColor(krv0.l(R.attr.vk_ui_text_contrast));
                f4m.t(iah0.a(15), textView2);
                TimeAndStatusView timeAndStatusView2 = this.p;
                if (timeAndStatusView2 == null) {
                    timeAndStatusView2 = null;
                }
                float f = 8;
                bwt0.e0(timeAndStatusView2, iah0.a(f), iah0.a(f), iah0.a(f), iah0.a(f));
            } else {
                VKEnhancedImageView vKEnhancedImageView3 = this.g;
                if (vKEnhancedImageView3 == null) {
                    vKEnhancedImageView3 = null;
                }
                bwt0.m0(iah0.a(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), iah0.a(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE), vKEnhancedImageView3);
                TextView textView3 = this.j;
                if (textView3 == null) {
                    textView3 = null;
                }
                bwt0.r0(iah0.a(100), textView3);
                g2u0.a(R.color.vk_white_alpha60, textView3);
                f4m.t(iah0.a(8), textView3);
                TimeAndStatusView timeAndStatusView3 = this.p;
                if (timeAndStatusView3 == null) {
                    timeAndStatusView3 = null;
                }
                float f2 = 4;
                bwt0.e0(timeAndStatusView3, iah0.a(f2), iah0.a(f2), iah0.a(f2), iah0.a(f2));
            }
            if (z2) {
                VKEnhancedImageView vKEnhancedImageView4 = this.g;
                if (vKEnhancedImageView4 == null) {
                    vKEnhancedImageView4 = null;
                }
                vKEnhancedImageView4.setPostprocessor((jwx) this.y.getValue());
                VKEnhancedImageView vKEnhancedImageView5 = this.g;
                if (vKEnhancedImageView5 == null) {
                    vKEnhancedImageView5 = null;
                }
                vKEnhancedImageView5.setRemoteImage(imageList2);
                VKEnhancedImageView vKEnhancedImageView6 = this.g;
                if (vKEnhancedImageView6 == null) {
                    vKEnhancedImageView6 = null;
                }
                vKEnhancedImageView6.setLocalImage(imageList);
                VKEnhancedImageView vKEnhancedImageView7 = this.g;
                if (vKEnhancedImageView7 == null) {
                    vKEnhancedImageView7 = null;
                }
                vKEnhancedImageView7.setPlaceholder((Drawable) this.w.getValue());
            } else {
                VKEnhancedImageView vKEnhancedImageView8 = this.g;
                if (vKEnhancedImageView8 == null) {
                    vKEnhancedImageView8 = null;
                }
                vKEnhancedImageView8.setPostprocessor(null);
                VKEnhancedImageView vKEnhancedImageView9 = this.g;
                if (vKEnhancedImageView9 == null) {
                    vKEnhancedImageView9 = null;
                }
                vKEnhancedImageView9.setRemoteImage(imageList2);
                VKEnhancedImageView vKEnhancedImageView10 = this.g;
                if (vKEnhancedImageView10 == null) {
                    vKEnhancedImageView10 = null;
                }
                vKEnhancedImageView10.setLocalImage(imageList);
                VKEnhancedImageView vKEnhancedImageView11 = this.g;
                if (vKEnhancedImageView11 == null) {
                    vKEnhancedImageView11 = null;
                }
                vKEnhancedImageView11.setPlaceholder((Drawable) this.x.getValue());
            }
            Attach attach2 = yt30Var3.G;
            if (attach2 != null) {
                r3e0 r3e0Var2 = this.n;
                if (r3e0Var2 == null) {
                    r3e0Var2 = null;
                }
                r3e0Var2.a(attach2);
            }
            View view3 = this.k;
            if (view3 == null) {
                view3 = null;
            }
            bwt0.p0(view3, o25.a().a(yt30Var3.v) && s(yt30Var3) && yt30Var3.w && yt30Var3.x == 0);
            if (yt30Var3.p) {
                FluidHorizontalLayout fluidHorizontalLayout4 = this.f;
                if (fluidHorizontalLayout4 == null) {
                    fluidHorizontalLayout4 = null;
                }
                fluidHorizontalLayout4.setOrder(1);
                View view4 = this.l;
                if (view4 == null) {
                    view4 = null;
                }
                bwt0.b0(8388613, view4);
                TextView textView4 = this.m;
                if (textView4 == null) {
                    textView4 = null;
                }
                textView4.setGravity(8388613);
                z = false;
            } else {
                FluidHorizontalLayout fluidHorizontalLayout5 = this.f;
                if (fluidHorizontalLayout5 == null) {
                    fluidHorizontalLayout5 = null;
                }
                z = false;
                fluidHorizontalLayout5.setOrder(0);
                View view5 = this.l;
                if (view5 == null) {
                    view5 = null;
                }
                bwt0.b0(8388611, view5);
                TextView textView5 = this.m;
                if (textView5 == null) {
                    textView5 = null;
                }
                textView5.setGravity(8388611);
            }
            View view6 = this.k;
            if (view6 == null) {
                view6 = null;
            }
            if (z4) {
                drawable = (Drawable) this.v.getValue();
            } else {
                if (z4) {
                    throw new NoWhenBranchMatchedException();
                }
                drawable = (Drawable) this.u.getValue();
            }
            view6.setBackground(drawable);
            String e2 = z3 ? displayNameFormatter.e(qtd0Var, UserNameCase.GEN) : "\n".concat(displayNameFormatter.e(qtd0Var, UserNameCase.GEN));
            TextView textView6 = this.j;
            if (textView6 == null) {
                textView6 = null;
            }
            FluidHorizontalLayout fluidHorizontalLayout6 = this.f;
            if (fluidHorizontalLayout6 == null) {
                fluidHorizontalLayout6 = null;
            }
            Context context = fluidHorizontalLayout6.getContext();
            e3m.a aVar = e3m.a;
            context.getColor(R.color.vk_white);
            textView6.setText(u(yt30Var3, e2, qtd0Var2));
            int w = w(z4);
            View view7 = this.l;
            if (view7 == null) {
                view7 = null;
            }
            view7.getBackground().setTint(w);
            TextView textView7 = this.m;
            if (textView7 == null) {
                textView7 = null;
            }
            textView7.setTextColor(w);
            View view8 = this.o;
            if (view8 == null) {
                view8 = null;
            }
            bwt0.p0(view8, z3);
            jr30 jr30Var = yt30Var3.b;
            TimeAndStatusView timeAndStatusView4 = this.p;
            if (timeAndStatusView4 == null) {
                timeAndStatusView4 = null;
            }
            hr30.l(timeAndStatusView4, jr30Var, true);
        } else {
            z = false;
            int w2 = w(z4);
            String e3 = displayNameFormatter.e(qtd0Var, UserNameCase.GEN);
            CharSequence u = yt30Var3.s ? u(yt30Var3, e3, qtd0Var2) : yt30Var3.t ? t().getString(R.string.vkim_msg_story_removed) : !yt30Var3.u ? t().getString(R.string.vkim_story_private, e3) : u(yt30Var3, e3, qtd0Var2);
            MsgPartExpiredStorySnippet msgPartExpiredStorySnippet2 = this.q;
            if (msgPartExpiredStorySnippet2 == null) {
                msgPartExpiredStorySnippet2 = null;
            }
            msgPartExpiredStorySnippet2.setText(u);
            MsgPartExpiredStorySnippet msgPartExpiredStorySnippet3 = this.q;
            if (msgPartExpiredStorySnippet3 == null) {
                msgPartExpiredStorySnippet3 = null;
            }
            msgPartExpiredStorySnippet3.setTextColor(w2);
            MsgPartExpiredStorySnippet msgPartExpiredStorySnippet4 = this.q;
            if (msgPartExpiredStorySnippet4 == null) {
                msgPartExpiredStorySnippet4 = null;
            }
            Context t = t();
            int i = z2 ? R.drawable.vk_icon_bomb_outline_28 : R.drawable.vk_icon_story_outline_20;
            e3m.a aVar2 = e3m.a;
            msgPartExpiredStorySnippet4.setIcon(m33.a(i, t));
            MsgPartExpiredStorySnippet msgPartExpiredStorySnippet5 = this.q;
            if (msgPartExpiredStorySnippet5 == null) {
                msgPartExpiredStorySnippet5 = null;
            }
            msgPartExpiredStorySnippet5.setIconTint(w2);
        }
        boolean e4 = yt30Var3.e();
        yt30 yt30Var4 = this.D;
        boolean f3 = epx.f(yt30Var4 != null ? yt30Var4.c : null, yt30Var4 != null ? yt30Var4.q : null);
        yt30 yt30Var5 = this.D;
        boolean z5 = (yt30Var5 == null || !yt30Var5.n || f3) ? z : true;
        ColorFilter colorFilter = (z5 && e4) ? (PorterDuffColorFilter) this.C.getValue() : (!z5 || e4) ? e4 ? (fk30) this.z.getValue() : null : (PorterDuffColorFilter) this.B.getValue();
        PorterDuffColorFilter porterDuffColorFilter = e4 ? (PorterDuffColorFilter) this.A.getValue() : null;
        FluidHorizontalLayout fluidHorizontalLayout7 = this.f;
        if (fluidHorizontalLayout7 == null) {
            fluidHorizontalLayout7 = null;
        }
        Drawable background = fluidHorizontalLayout7.getBackground();
        if (background != null) {
            background.setColorFilter(porterDuffColorFilter);
        }
        View view9 = this.k;
        if (view9 == null) {
            view9 = null;
        }
        view9.getBackground().setColorFilter(porterDuffColorFilter);
        VKEnhancedImageView vKEnhancedImageView12 = this.g;
        (vKEnhancedImageView12 != null ? vKEnhancedImageView12 : null).setColorFilter(colorFilter);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FluidHorizontalLayout fluidHorizontalLayout = (FluidHorizontalLayout) this.F.c(layoutInflater, viewGroup);
        this.f = fluidHorizontalLayout;
        if (fluidHorizontalLayout == null) {
            fluidHorizontalLayout = null;
        }
        this.g = (VKEnhancedImageView) fluidHorizontalLayout.findViewById(R.id.image);
        FluidHorizontalLayout fluidHorizontalLayout2 = this.f;
        if (fluidHorizontalLayout2 == null) {
            fluidHorizontalLayout2 = null;
        }
        this.j = (TextView) fluidHorizontalLayout2.findViewById(R.id.story_title);
        FluidHorizontalLayout fluidHorizontalLayout3 = this.f;
        if (fluidHorizontalLayout3 == null) {
            fluidHorizontalLayout3 = null;
        }
        this.i = (ImageView) fluidHorizontalLayout3.findViewById(R.id.image_gradient);
        VKEnhancedImageView vKEnhancedImageView = this.g;
        if (vKEnhancedImageView == null) {
            vKEnhancedImageView = null;
        }
        vKEnhancedImageView.setPlaceholder((Drawable) this.x.getValue());
        VKEnhancedImageView vKEnhancedImageView2 = this.g;
        if (vKEnhancedImageView2 == null) {
            vKEnhancedImageView2 = null;
        }
        vKEnhancedImageView2.setCornerRadius(e3m.d(R.attr.im_msg_part_story_corner_radius, t()));
        FluidHorizontalLayout fluidHorizontalLayout4 = this.f;
        if (fluidHorizontalLayout4 == null) {
            fluidHorizontalLayout4 = null;
        }
        this.q = (MsgPartExpiredStorySnippet) fluidHorizontalLayout4.findViewById(R.id.expired_story_view);
        FluidHorizontalLayout fluidHorizontalLayout5 = this.f;
        if (fluidHorizontalLayout5 == null) {
            fluidHorizontalLayout5 = null;
        }
        this.k = fluidHorizontalLayout5.findViewById(R.id.story_info_container);
        FluidHorizontalLayout fluidHorizontalLayout6 = this.f;
        if (fluidHorizontalLayout6 == null) {
            fluidHorizontalLayout6 = null;
        }
        View findViewById = fluidHorizontalLayout6.findViewById(R.id.story_info_image);
        this.l = findViewById;
        findViewById.getBackground().mutate();
        FluidHorizontalLayout fluidHorizontalLayout7 = this.f;
        if (fluidHorizontalLayout7 == null) {
            fluidHorizontalLayout7 = null;
        }
        this.m = (TextView) fluidHorizontalLayout7.findViewById(R.id.story_info_text);
        FluidHorizontalLayout fluidHorizontalLayout8 = this.f;
        if (fluidHorizontalLayout8 == null) {
            fluidHorizontalLayout8 = null;
        }
        View findViewById2 = fluidHorizontalLayout8.findViewById(R.id.add_to_story_btn);
        bwt0.i0(findViewById2, new ut30(this, 0));
        this.o = findViewById2;
        FluidHorizontalLayout fluidHorizontalLayout9 = this.f;
        if (fluidHorizontalLayout9 == null) {
            fluidHorizontalLayout9 = null;
        }
        this.h = (ImageView) fluidHorizontalLayout9.findViewById(R.id.ic_one_time);
        FluidHorizontalLayout fluidHorizontalLayout10 = this.f;
        if (fluidHorizontalLayout10 == null) {
            fluidHorizontalLayout10 = null;
        }
        this.n = new r3e0((ProgressView) fluidHorizontalLayout10.findViewById(R.id.loader), null, new d27(this, 6));
        VKEnhancedImageView vKEnhancedImageView3 = this.g;
        if (vKEnhancedImageView3 == null) {
            vKEnhancedImageView3 = null;
        }
        jjc.g(vKEnhancedImageView3, new b());
        VKEnhancedImageView vKEnhancedImageView4 = this.g;
        if (vKEnhancedImageView4 == null) {
            vKEnhancedImageView4 = null;
        }
        vKEnhancedImageView4.setOnLongClickListener(new d());
        MsgPartExpiredStorySnippet msgPartExpiredStorySnippet = this.q;
        if (msgPartExpiredStorySnippet == null) {
            msgPartExpiredStorySnippet = null;
        }
        jjc.g(msgPartExpiredStorySnippet, new c());
        MsgPartExpiredStorySnippet msgPartExpiredStorySnippet2 = this.q;
        if (msgPartExpiredStorySnippet2 == null) {
            msgPartExpiredStorySnippet2 = null;
        }
        msgPartExpiredStorySnippet2.setOnLongClickListener(new e());
        FluidHorizontalLayout fluidHorizontalLayout11 = this.f;
        if (fluidHorizontalLayout11 == null) {
            fluidHorizontalLayout11 = null;
        }
        this.p = (TimeAndStatusView) fluidHorizontalLayout11.findViewById(R.id.timeAndStatus);
        FluidHorizontalLayout fluidHorizontalLayout12 = this.f;
        if (fluidHorizontalLayout12 == null) {
            return null;
        }
        return fluidHorizontalLayout12;
    }

    @Override // xsna.hr30
    public final void r() {
        yt30 yt30Var = this.D;
        if (yt30Var != null) {
            int i = yt30Var.m;
            g34 g34Var = this.r;
            if (g34Var != null) {
                g34Var.a(i, null);
            }
        }
        this.r = null;
        r3e0 r3e0Var = this.n;
        if (r3e0Var == null) {
            r3e0Var = null;
        }
        r3e0Var.e();
        this.E = null;
        this.D = null;
    }

    public final Context t() {
        FluidHorizontalLayout fluidHorizontalLayout = this.f;
        if (fluidHorizontalLayout == null) {
            fluidHorizontalLayout = null;
        }
        return fluidHorizontalLayout.getContext();
    }

    public final CharSequence u(yt30 yt30Var, String str, qtd0 qtd0Var) {
        boolean f = epx.f(yt30Var.c, yt30Var.q);
        boolean z = myc0.f(yt30Var.z) || yt30Var.y > 1;
        boolean z2 = yt30Var.p;
        if (f && (!z || z2)) {
            return t().getString(R.string.vkim_your_story);
        }
        if (f) {
            if (qtd0Var == null) {
                return t().getString(R.string.vkim_story_response);
            }
            int i = a.$EnumSwitchMapping$0[qtd0Var.B2().ordinal()];
            return i != 1 ? i != 2 ? t().getString(R.string.vkim_story_response) : t().getString(R.string.vkim_story_response_m) : t().getString(R.string.vkim_story_response_f);
        }
        String string = t().getString(R.string.vkim_story_from);
        pik0.a aVar = new pik0.a();
        aVar.a = "%name%";
        aVar.b = str;
        return pik0.a(string, Collections.singletonList(aVar));
    }

    public final int w(boolean z) {
        if (z) {
            FluidHorizontalLayout fluidHorizontalLayout = this.f;
            return (fluidHorizontalLayout != null ? fluidHorizontalLayout : null).getContext().getColor(R.color.vk_white);
        }
        FluidHorizontalLayout fluidHorizontalLayout2 = this.f;
        return e3m.f(R.attr.vk_ui_vkontakte_im_service_message_text, (fluidHorizontalLayout2 != null ? fluidHorizontalLayout2 : null).getContext());
    }
}
