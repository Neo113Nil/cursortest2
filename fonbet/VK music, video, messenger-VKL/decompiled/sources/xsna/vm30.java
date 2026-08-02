package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.pnikosis.materialishprogress.ProgressWheel;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.messages.dto.MessagesSendReactionSourceDto;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.OverSizeChildLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.dto.common.Direction;
import com.vk.dto.common.OccupationType;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.exceptions.IllegalDateFormatException;
import com.vk.dto.messages.MsgIdType;
import com.vk.dto.messages.WritePermission;
import com.vk.dto.user.SocialButtonType;
import com.vk.im.design.view.placeholder.ImChipPlaceholder;
import com.vk.im.design.view.placeholder.ImPlaceholder;
import com.vk.im.design.view.placeholder.a;
import com.vk.im.design.view.placeholder.b;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.MsgReaction;
import com.vk.im.engine.models.users.User;
import com.vk.im.popup.Popup;
import com.vk.im.popup.a;
import com.vk.im.reactions.api.BigReactionAnimationsView;
import com.vk.im.reactions.impl.assets.ReactionAssetDrawable;
import com.vk.im.ui.components.viewcontrollers.dialog_header.redesign.popup.ReadReactionsChooser;
import com.vk.im.ui.components.viewcontrollers.msg_list.MsgLinearLayoutManager;
import com.vk.im.ui.components.viewcontrollers.msg_list.stb.ScrollToBottomAnimator;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.MsgListEmptyViewState;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.b;
import com.vk.im.ui.utils.recyclerview.LinearLayoutManagerScrollHelper;
import com.vk.im.ui.views.ScrollToBottomView;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.im.ui.views.avatars.StackAvatarView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.function.Predicate;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ayv0;
import xsna.cwb0;
import xsna.e3m;
import xsna.epx;
import xsna.gko;
import xsna.k1u0;
import xsna.r1f0;
import xsna.sf20;
import xsna.tlo0;
import xsna.uaw;
import xsna.ug30;
import xsna.vm30;
import xsna.vm30.m;
import xsna.zm30;

/* compiled from: MsgListVc.kt */
/* loaded from: classes2.dex */
public final class vm30 {
    public static final Object v0 = new Object();
    public static final Object w0 = new Object();
    public static final Object x0 = new Object();
    public final FrameLayout A;
    public final ViewGroup B;
    public final com.vk.im.ui.components.viewcontrollers.msg_list_empty.a C;
    public final zm30 D;
    public boolean E;
    public final an30 F;
    public final Object G;
    public final ok30 H;
    public final MsgLinearLayoutManager I;
    public final ujq J;
    public final mrr K;
    public final androidx.recyclerview.widget.r L;
    public final f M;
    public final a4v N;
    public final b O;
    public final boolean P;
    public final g Q;
    public final v2n0 R;
    public final v2n0 S;
    public final v2n0 T;
    public final v2n0 U;
    public zfh0 V;
    public boolean W;
    public final tel0 X;
    public final LinearLayoutManagerScrollHelper Y;
    public final int Z;
    public final Activity a;
    public final lgh0 a0;
    public final b9w b;
    public final mgh0 b0;
    public final q9 c;
    public final ogh0 c0;
    public final kkm d;
    public final bzb0 d0;
    public final fbw e;
    public final com.vk.im.popup.b e0;
    public final r1f0 f;
    public i f0;
    public final vg30 g;
    public a g0;
    public final b5q0 h;
    public kl30 h0;
    public final c i;
    public boolean i0;
    public final i2n0 j;
    public int j0;
    public final k2n0 k;
    public int k0;
    public wz30 l;
    public int l0;
    public final boolean m;
    public int m0;
    public final boolean n;
    public vci0 n0;
    public final boolean o;
    public boolean o0;
    public final VkOnboardingComponent p;
    public boolean p0;
    public final Context q;
    public boolean q0;
    public final Handler r;
    public boolean r0;
    public final bpn0 s;
    public boolean s0;
    public final View t;
    public ym30 t0;
    public final RecyclerView u;
    public v14 u0;
    public final TextView v;
    public final ViewGroup w;
    public final Object x;
    public final Object y;
    public final Object z;

    /* compiled from: MsgListVc.kt */
    public final class a {
        public MsgFromUser a;
        public boolean b;
        public q1f0 c;
    }

    /* compiled from: MsgListVc.kt */
    public final class b extends RecyclerView.t {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i2 > 0 || i2 < 0) {
                vm30.this.i();
            }
        }
    }

    /* compiled from: MsgListVc.kt */
    public interface c {
        void a();

        void d();

        boolean getEnabled();

        void h(int i, int i2, View view);

        void j();
    }

    /* compiled from: MsgListVc.kt */
    public final class d implements ol30 {
        public d() {
        }

        @Override // xsna.ol30
        public final void a(com.vk.im.ui.components.viewcontrollers.msg_list_empty.b bVar) {
            boolean z = bVar instanceof b.o;
            vm30 vm30Var = vm30.this;
            if (z) {
                ym30 ym30Var = vm30Var.t0;
                if (ym30Var != null) {
                    ym30Var.T(new ug30.c0(((b.o) bVar).a.B7(), null), null);
                    return;
                }
                return;
            }
            if (bVar instanceof b.a) {
                ym30 ym30Var2 = vm30Var.t0;
                if (ym30Var2 != null) {
                    b.a aVar = (b.a) bVar;
                    ym30Var2.X(aVar.a, aVar.b, aVar.c);
                    return;
                }
                return;
            }
            if (bVar instanceof b.k) {
                ym30 ym30Var3 = vm30Var.t0;
                if (ym30Var3 != null) {
                    ym30Var3.h0(((b.k) bVar).a);
                    return;
                }
                return;
            }
            if (bVar instanceof b.c) {
                ym30 ym30Var4 = vm30Var.t0;
                if (ym30Var4 != null) {
                    b.c cVar = (b.c) bVar;
                    ym30Var4.X(cVar.a, cVar.b, cVar.c);
                    return;
                }
                return;
            }
            if (bVar instanceof b.m) {
                ym30 ym30Var5 = vm30Var.t0;
                if (ym30Var5 != null) {
                    ym30Var5.h0(((b.m) bVar).a);
                    return;
                }
                return;
            }
            if (bVar instanceof b.C1172b) {
                ym30 ym30Var6 = vm30Var.t0;
                if (ym30Var6 != null) {
                    ym30Var6.Y();
                    return;
                }
                return;
            }
            if (bVar instanceof b.j) {
                ym30 ym30Var7 = vm30Var.t0;
                if (ym30Var7 != null) {
                    ym30Var7.B0();
                    return;
                }
                return;
            }
            if (bVar instanceof b.l) {
                ym30 ym30Var8 = vm30Var.t0;
                if (ym30Var8 != null) {
                    b.l lVar = (b.l) bVar;
                    ym30Var8.p0(lVar.a, lVar.b);
                    return;
                }
                return;
            }
            if (bVar instanceof b.n) {
                ym30 ym30Var9 = vm30Var.t0;
                if (ym30Var9 != null) {
                    b.n nVar = (b.n) bVar;
                    ym30Var9.p0(nVar.a, nVar.b);
                    return;
                }
                return;
            }
            if (bVar instanceof b.d) {
                ym30 ym30Var10 = vm30Var.t0;
                if (ym30Var10 != null) {
                    ym30Var10.m0();
                    return;
                }
                return;
            }
            if (bVar instanceof b.h) {
                ym30 ym30Var11 = vm30Var.t0;
                if (ym30Var11 != null) {
                    ym30Var11.r0();
                    return;
                }
                return;
            }
            if (bVar instanceof b.f) {
                ym30 ym30Var12 = vm30Var.t0;
                if (ym30Var12 != null) {
                    ym30Var12.E0(((b.f) bVar).a);
                    return;
                }
                return;
            }
            if (bVar instanceof b.g) {
                ym30 ym30Var13 = vm30Var.t0;
                if (ym30Var13 != null) {
                    ym30Var13.b0();
                    return;
                }
                return;
            }
            if (bVar instanceof b.e) {
                ym30 ym30Var14 = vm30Var.t0;
                if (ym30Var14 != null) {
                    ym30Var14.W();
                    return;
                }
                return;
            }
            if (!(bVar instanceof b.i)) {
                throw new NoWhenBranchMatchedException();
            }
            ym30 ym30Var15 = vm30Var.t0;
            if (ym30Var15 != null) {
                ym30Var15.A0();
            }
        }
    }

    /* compiled from: MsgListVc.kt */
    public static final class e {
        public float a;
        public Float b;

        public e(float f, Float f2) {
            this.a = f;
            this.b = f2;
        }

        public final boolean a() {
            Float f = this.b;
            if (Float.compare(this.a, 0.35f) < 0) {
                return f != null && Float.compare(f.floatValue(), 0.35f) >= 0;
            }
            return true;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Float.compare(this.a, eVar.a) == 0 && epx.f(this.b, eVar.b);
        }

        public final int hashCode() {
            int hashCode = Float.hashCode(this.a) * 31;
            Float f = this.b;
            return hashCode + (f == null ? 0 : f.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MsgVisibilityInfo(heightRelativeScreen=");
            sb.append(this.a);
            sb.append(", heightRelativeBubble=");
            return so.b(sb, this.b, ')');
        }
    }

    /* compiled from: MsgListVc.kt */
    public final class f extends vc80 {
        public f() {
        }

        @Override // xsna.vc80
        public final void l(int i, int i2, int i3) {
            vm30.this.n(i, i2, i3, "OnVisibleRangeChangedScrollListener");
        }
    }

    /* compiled from: MsgListVc.kt */
    public final class g extends RecyclerView.t {
        public g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                vm30 vm30Var = vm30.this;
                vm30Var.u.post(new qo4(vm30Var, 7));
                vm30Var.s("PendingScrollDetector");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            vm30 vm30Var = vm30.this;
            zfh0 zfh0Var = vm30Var.V;
            if (zfh0Var == null || zfh0Var.a()) {
                return;
            }
            if (vm30Var.W) {
                L l = L.a;
                l.getClass();
                if (L.m(LoggerOutputTarget.NONE)) {
                    return;
                }
                L.u(l, L.LogType.d, new Object[]{"ChatScrollIssue: instantpending IN PROGRESS"});
                return;
            }
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l2, L.LogType.d, new Object[]{"ChatScrollIssue: instantpendingScrollParams clear"});
            }
            vm30Var.V = null;
        }
    }

    /* compiled from: MsgListVc.kt */
    public static final class h extends RecyclerView.t {
        public final gzs<s3q0> b;

        public h(gzs<s3q0> gzsVar) {
            this.b = gzsVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                this.b.invoke();
                recyclerView.removeOnScrollListener(this);
            }
        }
    }

    /* compiled from: MsgListVc.kt */
    public final class i {
        public FrameLayout a;
        public q1f0 b;
        public a.b<ug30> c;
        public czb0 d;
    }

    /* compiled from: MsgListVc.kt */
    public final class j {
        public j() {
        }

        public final int a() {
            vm30 vm30Var = vm30.this;
            b5q0 b5q0Var = vm30Var.h;
            return b5q0Var != null ? b5q0Var.a() : vm30Var.h0.d;
        }
    }

    /* compiled from: MsgListVc.kt */
    public final class k {
        public k() {
        }
    }

    /* compiled from: MsgListVc.kt */
    public final class l {

        /* compiled from: MsgListVc.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ReadReactionsChooser.Choice.values().length];
                try {
                    iArr[ReadReactionsChooser.Choice.READ_ALL_REACTIONS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public l() {
        }
    }

    /* compiled from: MsgListVc.kt */
    public static final /* synthetic */ class m extends FunctionReferenceImpl implements izs<ug30, s3q0> {
        public m() {
            super(1, epx.a.class, "report", "showMsgActionsDialog$lambda$89$report(Lcom/vk/im/ui/components/viewcontrollers/msg_list/MsgListVc;Lcom/vk/dto/messages/MsgAction;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(ug30 ug30Var) {
            vm30 vm30Var = vm30.this;
            Object obj = xg30.a;
            xg30.a(ug30Var, vm30Var.h0.g.b, true);
            return s3q0.a;
        }
    }

    /* compiled from: MsgListVc.kt */
    public static final /* synthetic */ class n extends FunctionReferenceImpl implements gzs<s3q0> {
        final /* synthetic */ ug30 $action;
        final /* synthetic */ vm30 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ug30 ug30Var, vm30 vm30Var) {
            super(0, epx.a.class, "report", "showMsgActionsDialog$lambda$89$report$84(Lcom/vk/dto/messages/MsgAction;Lcom/vk/im/ui/components/viewcontrollers/msg_list/MsgListVc;)V", 0);
            this.$action = ug30Var;
            this.this$0 = vm30Var;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            vm30.G(this.$action, this.this$0);
            return s3q0.a;
        }
    }

    /* compiled from: MsgListVc.kt */
    public static final /* synthetic */ class o extends FunctionReferenceImpl implements gzs<s3q0> {
        final /* synthetic */ ug30 $action;
        final /* synthetic */ vm30 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ug30 ug30Var, vm30 vm30Var) {
            super(0, epx.a.class, "report", "showMsgActionsDialog$lambda$89$report$84(Lcom/vk/dto/messages/MsgAction;Lcom/vk/im/ui/components/viewcontrollers/msg_list/MsgListVc;)V", 0);
            this.$action = ug30Var;
            this.this$0 = vm30Var;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            vm30.G(this.$action, this.this$0);
            return s3q0.a;
        }
    }

    /* compiled from: MsgListVc.kt */
    public static final /* synthetic */ class p extends FunctionReferenceImpl implements gzs<s3q0> {
        final /* synthetic */ ug30 $action;
        final /* synthetic */ vm30 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ug30 ug30Var, vm30 vm30Var) {
            super(0, epx.a.class, "report", "showMsgActionsDialog$lambda$89$report$84(Lcom/vk/dto/messages/MsgAction;Lcom/vk/im/ui/components/viewcontrollers/msg_list/MsgListVc;)V", 0);
            this.$action = ug30Var;
            this.this$0 = vm30Var;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            vm30.G(this.$action, this.this$0);
            return s3q0.a;
        }
    }

    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, kotlin.Lazy] */
    public vm30(Activity activity, LayoutInflater layoutInflater, ViewGroup viewGroup, RecyclerView.u uVar, boolean z, boolean z2, zdw zdwVar, b9w b9wVar, q9 q9Var, kkm kkmVar, fbw fbwVar, r1f0 r1f0Var, u0f0 u0f0Var, vg30 vg30Var, sf20.b bVar, c cVar, i2n0 i2n0Var, k2n0 k2n0Var, ub80 ub80Var, vb80 vb80Var, wz30 wz30Var, boolean z3, g1l g1lVar, boolean z4, boolean z5, boolean z6, VkOnboardingComponent vkOnboardingComponent, int i2) {
        RecyclerView.u uVar2 = (i2 & 8) != 0 ? null : uVar;
        b9w b9wVar2 = (i2 & 128) != 0 ? null : b9wVar;
        sf20.b bVar2 = (i2 & 16384) != 0 ? null : bVar;
        c cVar2 = (32768 & i2) != 0 ? null : cVar;
        i2n0 k9q0Var = (65536 & i2) != 0 ? new k9q0() : i2n0Var;
        k2n0 k2 = (131072 & i2) != 0 ? zdwVar.d.t().k() : k2n0Var;
        ub80 ub80Var2 = (262144 & i2) != 0 ? null : ub80Var;
        vb80 vb80Var2 = (524288 & i2) != 0 ? null : vb80Var;
        wz30 wz30Var2 = (1048576 & i2) != 0 ? new wz30(0) : wz30Var;
        boolean z7 = (i2 & 2097152) != 0 ? false : z3;
        g1l g1lVar2 = (i2 & 4194304) != 0 ? null : g1lVar;
        boolean z8 = (i2 & 8388608) != 0 ? true : z4;
        boolean z9 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? false : z5;
        ub80 ub80Var3 = ub80Var2;
        boolean z10 = (i2 & 33554432) != 0 ? false : z6;
        vb80 vb80Var3 = vb80Var2;
        VkOnboardingComponent vkOnboardingComponent2 = (i2 & 67108864) != 0 ? null : vkOnboardingComponent;
        this.a = activity;
        this.b = b9wVar2;
        b9w b9wVar3 = b9wVar2;
        this.c = q9Var;
        this.d = kkmVar;
        this.e = fbwVar;
        this.f = r1f0Var;
        this.g = vg30Var;
        this.h = bVar2;
        this.i = cVar2;
        this.j = k9q0Var;
        this.k = k2;
        this.l = wz30Var2;
        this.m = z7;
        this.n = z8;
        this.o = z9;
        this.p = vkOnboardingComponent2;
        Context context = layoutInflater.getContext();
        this.q = context;
        this.r = new Handler();
        this.s = new bpn0(new bv0(24));
        View inflate = activity.getLayoutInflater().inflate(R.layout.vkim_msg_list, viewGroup, false);
        this.t = inflate;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.msg_list);
        this.u = recyclerView;
        TextView textView = (TextView) inflate.findViewById(R.id.msg_list_sticky_date);
        this.v = textView;
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.scroll_to_item_container);
        this.w = viewGroup2;
        bzj bzjVar = new bzj(this, 27);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy a2 = msy.a(lazyThreadSafetyMode, bzjVar);
        this.x = a2;
        boolean z11 = z9;
        VkOnboardingComponent vkOnboardingComponent3 = vkOnboardingComponent2;
        Lazy a3 = msy.a(lazyThreadSafetyMode, new t210(this, 5));
        this.y = a3;
        i2n0 i2n0Var2 = k9q0Var;
        Lazy a4 = msy.a(lazyThreadSafetyMode, new t2l(this, 21));
        this.z = a4;
        this.A = (FrameLayout) inflate.findViewById(R.id.float_reactions_picker);
        d dVar = new d();
        ViewGroup viewGroup3 = (ViewGroup) inflate.findViewById(R.id.empty_container);
        this.B = viewGroup3;
        RecyclerView.u uVar3 = uVar2;
        com.vk.im.ui.components.viewcontrollers.msg_list_empty.a aVar = new com.vk.im.ui.components.viewcontrollers.msg_list_empty.a(activity, viewGroup3, kkmVar, z10);
        if (!aVar.S) {
            throw new IllegalStateException("Instance is destroyed");
        }
        aVar.P.add(dVar);
        this.C = aVar;
        this.D = new zm30(inflate, dVar);
        an30 an30Var = new an30(inflate);
        this.F = an30Var;
        vrr0 vrr0Var = new vrr0(layoutInflater, new f6y0(), zdwVar.f().d, zdwVar.f().c, vkOnboardingComponent3, u0f0Var, b9wVar3, new kj0(this), ub80Var3, vb80Var3);
        Lazy a5 = msy.a(lazyThreadSafetyMode, new ee4(24));
        this.G = a5;
        ok30 ok30Var = new ok30(vrr0Var, (com.vk.stat.recycler.d) a5.getValue(), 4);
        this.H = ok30Var;
        MsgLinearLayoutManager msgLinearLayoutManager = new MsgLinearLayoutManager(context, (com.vk.stat.recycler.d) a5.getValue());
        this.I = msgLinearLayoutManager;
        ujq ujqVar = new ujq(0, iah0.a(12));
        this.J = ujqVar;
        mrr mrrVar = new mrr();
        this.K = mrrVar;
        com.vk.im.ui.components.viewcontrollers.msg_list.decoration.a aVar2 = new com.vk.im.ui.components.viewcontrollers.msg_list.decoration.a(context, q9Var.c(), ok30Var, context.getResources().getDisplayMetrics().heightPixels, z11);
        this.L = new androidx.recyclerview.widget.r(new lmn0(context, new jjx(this, 10)));
        this.M = new f();
        this.N = new a4v(context, new r820(this, 4), false);
        this.O = new b();
        this.P = o90.a(activity);
        g gVar = new g();
        this.Q = gVar;
        pbw pbwVar = zdwVar.d;
        this.R = pbwVar.t().z();
        this.S = pbwVar.t().h();
        this.T = pbwVar.t().C();
        this.U = pbwVar.t().q();
        this.X = new tel0(recyclerView, new qd50(inflate), new hez(recyclerView, msgLinearLayoutManager, ok30Var, g1lVar2));
        this.Y = new LinearLayoutManagerScrollHelper(recyclerView, LinearLayoutManagerScrollHelper.Speed.FAST, new cf00(this, 5));
        this.Z = iah0.a(100);
        ScrollToBottomAnimator scrollToBottomAnimator = new ScrollToBottomAnimator(viewGroup2);
        lgh0 lgh0Var = new lgh0(a2, scrollToBottomAnimator, new j());
        this.a0 = lgh0Var;
        mgh0 mgh0Var = new mgh0(a3, scrollToBottomAnimator, new k());
        this.b0 = mgh0Var;
        ogh0 ogh0Var = new ogh0(a4, scrollToBottomAnimator, new l());
        this.c0 = ogh0Var;
        this.d0 = new bzb0(activity);
        this.e0 = new com.vk.im.popup.b(activity);
        this.h0 = new kl30(0);
        this.r0 = z;
        A(z2);
        recyclerView.addOnScrollListener(lgh0Var.d);
        recyclerView.addOnScrollListener(lgh0Var.e);
        lgh0Var.g = 0;
        lgh0Var.h = false;
        lgh0Var.i = false;
        lgh0Var.j = false;
        msgLinearLayoutManager.l = true;
        recyclerView.setLayoutManager(msgLinearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(ujqVar);
        recyclerView.addItemDecoration(aVar2);
        recyclerView.addItemDecoration(mrrVar);
        uy2 uy2Var = DialogTheme.f;
        S(DialogTheme.a.a());
        recyclerView.addOnScrollListener(gVar);
        recyclerView.addOnItemTouchListener(new um30(this));
        recyclerView.setRecycledViewPool(uVar3);
        recyclerView.swapAdapter(ok30Var, false);
        recyclerView.setItemAnimator(null);
        an30Var.a = kkmVar;
        ?? r2 = an30Var.c;
        if (r2.isInitialized()) {
            kkmVar.e((ProgressWheel) r2.getValue(), new uhd(6));
        }
        kkm kkmVar2 = lgh0Var.k;
        lgh0Var.k = kkmVar;
        if (a2.isInitialized()) {
            if (kkmVar2 != null) {
                kkmVar2.h(lgh0Var.a());
            }
            kkmVar.e(lgh0Var.a(), new yh3(10));
        }
        kkm kkmVar3 = mgh0Var.e;
        mgh0Var.e = kkmVar;
        if (a3.isInitialized()) {
            if (kkmVar3 != null) {
                kkmVar3.h(mgh0Var.a());
            }
            kkmVar.e(mgh0Var.a(), new bkh(9));
        }
        kkm kkmVar4 = ogh0Var.e;
        ogh0Var.e = kkmVar;
        int i3 = 8;
        if (a4.isInitialized()) {
            if (kkmVar4 != null) {
                kkmVar4.h(ogh0Var.a());
            }
            kkmVar.e(ogh0Var.a(), new uhd(i3));
        }
        kkmVar.e(textView, new hue(this, i3));
        ow90 ow90Var = ow90.a;
        ow90.c(ScrollScreenType.DIALOG, recyclerView);
        if (b9wVar3 != null) {
            b9wVar3.e(activity, recyclerView);
        }
        msgLinearLayoutManager.L(true);
        x(this, null, "init", 10);
        y(this.j0);
        i2n0Var2.e(true);
    }

    public static void D(vm30 vm30Var, MsgFromUser msgFromUser, am30 am30Var, int i2) {
        k3b k3bVar = new k3b(0, vm30Var, vm30.class, "hideFloatReactionsPicker", "hideFloatReactionsPicker()V", 0, 5);
        if ((i2 & 32) != 0) {
            am30Var = null;
        }
        vm30Var.u.postDelayed(new wm30(vm30Var, msgFromUser, k3bVar, am30Var), 300L);
    }

    public static final void G(ug30 ug30Var, vm30 vm30Var) {
        Object obj = xg30.a;
        xg30.a(ug30Var, vm30Var.h0.g.b, true);
    }

    public static void M(int i2, int i3, MsgIdType msgIdType, final vm30 vm30Var) {
        int i4 = vm30Var.j0 + vm30Var.k0;
        int a2 = qk30.a(vm30Var.H, msgIdType, i2);
        Integer valueOf = Integer.valueOf(a2);
        if (a2 == -1) {
            valueOf = null;
        }
        final int intValue = valueOf != null ? valueOf.intValue() : 0;
        vm30Var.V = new gb20(msgIdType, i2, i3);
        L.d(new gzs() { // from class: xsna.pm30
            @Override // xsna.gzs
            public final Object invoke() {
                StringBuilder a3 = vq.a("ChatScrollIssue: smoothScrollToMsg position=", intValue, '/');
                vm30 vm30Var2 = vm30Var;
                a3.append(vm30Var2.H.f.size() - 1);
                a3.append(", scrollTo=");
                a3.append(vm30Var2.V);
                a3.append(", chain=scrollToReactionsBubble");
                return a3.toString();
            }
        });
        LinearLayoutManagerScrollHelper.f(vm30Var.Y, intValue, i3, i4, null, null, 48);
    }

    public static void q(vm30 vm30Var, izs izsVar) {
        com.vk.movika.sdk.base.logic.processor.actions.e eVar = new com.vk.movika.sdk.base.logic.processor.actions.e(13, vm30Var, izsVar);
        RecyclerView recyclerView = vm30Var.u;
        if (vm30Var.o) {
            awt0.i(recyclerView, new j3(18, recyclerView, eVar));
        } else {
            recyclerView.post(new yr2(4, recyclerView, eVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void x(vm30 vm30Var, List list, String str, int i2) {
        if ((i2 & 2) != 0) {
            list = null;
        }
        vm30Var.w(null, list, str, false);
    }

    public final void A(boolean z) {
        this.q0 = z;
        androidx.recyclerview.widget.r rVar = this.L;
        if (!z) {
            rVar.l(null);
            return;
        }
        RecyclerView recyclerView = this.u;
        rVar.l(recyclerView);
        recyclerView.removeItemDecoration(rVar);
        recyclerView.addItemDecoration(rVar, 0);
    }

    public final void B(MsgFromUser msgFromUser, fm20 fm20Var) {
        int a2 = qk30.a(this.H, MsgIdType.LOCAL_ID, msgFromUser.b);
        View findViewByPosition = a2 == -1 ? null : this.I.findViewByPosition(a2);
        if (findViewByPosition == null) {
            return;
        }
        FrameLayout frameLayout = this.A;
        frameLayout.setTag(R.id.im_floating_reactions_cancelable_on_touch_outside, null);
        r1f0 r1f0Var = this.f;
        if (r1f0Var != null) {
            boolean z = this.h0.j;
            String j2 = MessagesSendReactionSourceDto.LONG_CLICK.j();
            ImFeatures.IM_CHAT_MODALS_REDESIGN.getClass();
            r1f0Var.c(new r1f0.d(frameLayout, z, this.n, new w70(this, msgFromUser, fm20Var), j2, findViewByPosition, msgFromUser, !com.vk.toggle.b.A.a(r1)));
        }
    }

    public final q1f0 C(MsgFromUser msgFromUser, View view, gzs gzsVar) {
        Object obj = new Object();
        FrameLayout frameLayout = this.A;
        frameLayout.setTag(R.id.im_floating_reactions_cancelable_on_touch_outside, obj);
        a aVar = new a();
        aVar.a = msgFromUser;
        aVar.b = false;
        q1f0 q1f0Var = null;
        aVar.c = null;
        this.g0 = aVar;
        r1f0 r1f0Var = this.f;
        if (r1f0Var != null) {
            boolean z = this.h0.j;
            String j2 = MessagesSendReactionSourceDto.FLOATING_BUTTON.j();
            k9b k9bVar = new k9b(0, this, vm30.class, "handleFloatingReactionsPickerAsCloudExpandedStateChanged", "handleFloatingReactionsPickerAsCloudExpandedStateChanged()V", 0, 3);
            ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
            imFeatures.getClass();
            q1f0Var = r1f0Var.d(new r1f0.e(frameLayout, z, this.n, new mq0(this, msgFromUser, gzsVar), j2, view, msgFromUser, k9bVar, !com.vk.toggle.b.A.a(imFeatures)));
        }
        a aVar2 = this.g0;
        if (aVar2 != null) {
            aVar2.c = q1f0Var;
        }
        return q1f0Var;
    }

    public final void E(boolean z) {
        Popup.c aisVar;
        if (z) {
            ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
            imFeatures.getClass();
            aisVar = new dhd0(com.vk.toggle.b.A.a(imFeatures));
        } else {
            ImFeatures imFeatures2 = ImFeatures.IM_CHAT_MODALS_REDESIGN;
            imFeatures2.getClass();
            aisVar = new ais(com.vk.toggle.b.A.a(imFeatures2));
        }
        this.e0.b(aisVar, new pvh(this, 19));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [xsna.cwb0$m] */
    public final void F(final MsgFromUser msgFromUser, List<? extends ug30> list, final boolean z, final boolean z2) {
        final cwb0.l0 l0Var;
        cwb0.l0 l0Var2;
        i iVar;
        Map<ug30, cpj0> a2 = this.g.a(msgFromUser);
        boolean z3 = this.h0.m;
        q1f0 q1f0Var = null;
        Context context = this.q;
        String string = !z3 ? context.getString(R.string.vkim_chat_sharing_disabled_hint) : null;
        r1f0 r1f0Var = this.f;
        if (r1f0Var != null) {
            Iterator it = msgFromUser.S.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                i2 += ((MsgReaction) it.next()).getCount();
            }
            String e2 = r1f0Var.e(i2, context);
            int f2 = e3m.f(R.attr.vk_ui_text_subhead, context);
            int i3 = cwb0.a;
            cwb0.c1.b bVar = cwb0.c1.b.a;
            ArrayList arrayList = new ArrayList();
            ug30.o oVar = ug30.o.a;
            if (a2.containsKey(oVar)) {
                arrayList.add(new jwb0(null, 0, null, null, 0, oVar, false, a2.get(oVar), 735));
            }
            arrayList.add(new jwb0(e2, 0, null, null, R.drawable.vk_icon_stars_outline_28, ug30.d0.a, false, null, 974));
            arrayList.addAll(new cwb0.l0(context, list, a2, null, 20).l);
            l0Var = new cwb0.m0(string, 3, Integer.valueOf(f2), null, Integer.valueOf(i3), arrayList, list, bVar, 2850);
        } else {
            l0Var = new cwb0.l0(context, list, a2, string, 4);
        }
        izs izsVar = new izs() { // from class: xsna.dm30
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                vm30 vm30Var = vm30.this;
                Context context2 = vm30Var.q;
                MsgFromUser msgFromUser2 = msgFromUser;
                boolean z4 = z;
                boolean z5 = z2;
                cwb0.m mVar = l0Var;
                Iterable iterable = mVar.m;
                Iterable iterable2 = mVar.l;
                ug30 ug30Var = (ug30) obj;
                if (ug30Var.equals(ug30.g.a)) {
                    vm30Var.e0.e(new ki30(1, context2, z4, z5), new rm9(vm30Var.new m(), vm30Var, msgFromUser2, 4));
                } else if (ug30Var.equals(ug30.s.a)) {
                    vm30.n nVar = new vm30.n(ug30Var, vm30Var);
                    long j2 = msgFromUser2.c;
                    List<Integer> singletonList = Collections.singletonList(Integer.valueOf(msgFromUser2.d));
                    r3y.a("VKWebAppReturnReason", new ih4(new c2k(vm30Var, msgFromUser2, nVar, 2), 5));
                    g2v.c().getClass();
                    l0v0 l0v0Var = l0v0.a;
                    gzs<s3q0> gzsVar = fkq0.a;
                    l0v0Var.b(context2, new UserId(j2), singletonList);
                } else if (ug30Var.equals(ug30.p.a)) {
                    com.vk.im.popup.a.d(vm30Var.e0, ooa0.j, new grb(new vm30.o(ug30Var, vm30Var), vm30Var, msgFromUser2, 7), null, null, 12);
                } else if (ug30Var.equals(ug30.b0.a)) {
                    com.vk.im.popup.a.d(vm30Var.e0, poa0.j, new n0(new vm30.p(ug30Var, vm30Var), vm30Var, msgFromUser2), null, null, 12);
                } else if (ug30Var.equals(ug30.b.a)) {
                    vm30.i iVar2 = vm30Var.f0;
                    if (iVar2 != null) {
                        q1f0 q1f0Var2 = iVar2.b;
                        if (q1f0Var2 != null) {
                            q1f0Var2.e();
                        }
                        ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
                        imFeatures.getClass();
                        if (com.vk.toggle.b.A.a(imFeatures)) {
                            a.b<ug30> bVar2 = iVar2.c;
                            if (bVar2 != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj2 : iterable2) {
                                    if (j5g.P(iterable, ((jwb0) obj2).f)) {
                                        arrayList2.add(obj2);
                                    }
                                }
                                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    jwb0 jwb0Var = (jwb0) it2.next();
                                    arrayList3.add(new lwb0(jwb0Var.a, jwb0Var.b, jwb0Var.c, jwb0Var.d, jwb0Var.e, jwb0Var.f, jwb0Var.h, jwb0Var.i, jwb0Var.j, false, 1536));
                                }
                                bVar2.setItems(arrayList3);
                            }
                        } else {
                            czb0 czb0Var = iVar2.d;
                            if (czb0Var != null) {
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj3 : iterable2) {
                                    if (j5g.P(iterable, ((jwb0) obj3).f)) {
                                        arrayList4.add(obj3);
                                    }
                                }
                                czb0Var.a(arrayList4);
                            }
                        }
                    }
                } else {
                    vm30.G(ug30Var, vm30Var);
                    ym30 ym30Var = vm30Var.t0;
                    if (ym30Var != null) {
                        ym30Var.T(ug30Var, msgFromUser2);
                    }
                }
                if (!ug30Var.equals(ug30.b.a)) {
                    vm30Var.f0 = null;
                }
                return s3q0.a;
            }
        };
        cwb0.l0 l0Var3 = l0Var;
        boolean z4 = this.h0.b;
        bzb0 bzb0Var = this.d0;
        com.vk.im.popup.b bVar2 = this.e0;
        if (!z4 || !com.vk.im.engine.utils.a.j(msgFromUser)) {
            ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
            imFeatures.getClass();
            if (com.vk.toggle.b.A.a(imFeatures)) {
                bVar2.c(gwb0.a(l0Var3), izsVar, null);
                return;
            } else {
                bzb0Var.b(l0Var3, izsVar, null);
                return;
            }
        }
        FrameLayout frameLayout = new FrameLayout(this.q);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        i iVar2 = new i();
        iVar2.a = frameLayout;
        iVar2.b = null;
        iVar2.c = null;
        iVar2.d = null;
        r010 r010Var = new r010(iVar2, 5);
        if (r1f0Var != null) {
            boolean z5 = this.h0.j;
            rig rigVar = new rig(3, this, msgFromUser);
            String j2 = MessagesSendReactionSourceDto.NEARBY_CLICK.j();
            ImFeatures.IM_CHAT_MODALS_REDESIGN.getClass();
            l0Var2 = l0Var3;
            iVar = iVar2;
            q1f0Var = r1f0Var.b(new r1f0.c(frameLayout, z5, false, this.n, rigVar, j2, msgFromUser, r010Var, !com.vk.toggle.b.A.a(r7)));
        } else {
            l0Var2 = l0Var3;
            iVar = iVar2;
        }
        iVar.b = q1f0Var;
        ImFeatures imFeatures2 = ImFeatures.IM_CHAT_MODALS_REDESIGN;
        imFeatures2.getClass();
        if (com.vk.toggle.b.A.a(imFeatures2)) {
            iVar.c = bVar2.g(gwb0.a(l0Var2), izsVar, new gb(20, this, iVar));
        } else {
            iVar.d = bzb0.h(bzb0Var, l0Var2, izsVar, frameLayout);
        }
        this.f0 = iVar;
    }

    public final void H(Throwable th) {
        i2n0 i2n0Var = this.j;
        if (i2n0Var.b()) {
            i2n0Var.onError(th);
        }
        zk70.e(th);
    }

    public final void I() {
        ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
        imFeatures.getClass();
        this.e0.b(new hoa0(R.string.vkim_popup_pinned_msg_attach_progress_desc, 5, null, null, com.vk.toggle.b.A.a(imFeatures)), new m1o(this, 20));
    }

    public final void J(final String str) {
        ok30 ok30Var = this.H;
        if (qk30.e(ok30Var)) {
            final int d2 = qk30.d(ok30Var);
            this.V = new bvx(d2, "smoothScrollToLatestBottom", ok30Var.getItemId(e43.h(ok30Var.f)), 0, true);
            L.d(new gzs() { // from class: xsna.em30
                @Override // xsna.gzs
                public final Object invoke() {
                    StringBuilder a2 = vq.a("ChatScrollIssue: smoothScrollToLatestBottom position=", d2, '/');
                    vm30 vm30Var = this;
                    a2.append(vm30Var.H.f.size() - 1);
                    a2.append(", scrollTo=");
                    a2.append(vm30Var.V);
                    a2.append(", chain=");
                    a2.append(str);
                    return a2.toString();
                }
            });
            LinearLayoutManagerScrollHelper.f(this.Y, Math.max(0, r4.b().getItemCount() - 1), 0, 0, LinearLayoutManagerScrollHelper.Snap.END, null, 44);
        }
    }

    public final void K(final String str) {
        ok30 ok30Var = this.H;
        final int d2 = qk30.d(ok30Var);
        if (d2 >= 0) {
            this.V = new bvx(d2, "smoothScrollToLatestTop", qk30.c(d2, ok30Var), this.Z, true);
            L.d(new gzs() { // from class: xsna.km30
                @Override // xsna.gzs
                public final Object invoke() {
                    StringBuilder a2 = vq.a("ChatScrollIssue: smoothScrollToLatestTop position=", d2, '/');
                    vm30 vm30Var = this;
                    a2.append(vm30Var.H.f.size() - 1);
                    a2.append(", scrollTo=");
                    a2.append(vm30Var.V);
                    a2.append(", chain=");
                    a2.append(str);
                    return a2.toString();
                }
            });
            LinearLayoutManagerScrollHelper.f(this.Y, d2, this.Z, 0, null, null, 56);
        } else {
            L l2 = L.a;
            l2.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l2, L.LogType.w, new Object[]{"ChatScrollIssue: smoothScrollToLatestTop last item not found"});
        }
    }

    public final void L(MsgIdType msgIdType, int i2, final String str) {
        int a2 = qk30.a(this.H, msgIdType, i2);
        Integer valueOf = Integer.valueOf(a2);
        if (a2 == -1) {
            valueOf = null;
        }
        final int intValue = valueOf != null ? valueOf.intValue() : 0;
        this.V = new gb20(msgIdType, i2, this.Z);
        L.d(new gzs() { // from class: xsna.bm30
            @Override // xsna.gzs
            public final Object invoke() {
                StringBuilder a3 = vq.a("ChatScrollIssue: smoothScrollToMsg position=", intValue, '/');
                vm30 vm30Var = this;
                a3.append(vm30Var.H.f.size() - 1);
                a3.append(", scrollTo=");
                a3.append(vm30Var.V);
                a3.append(", chain=");
                a3.append(str);
                return a3.toString();
            }
        });
        LinearLayoutManagerScrollHelper.f(this.Y, intValue, this.Z, 0, null, null, 56);
    }

    public final void N() {
        uaw a2;
        this.i0 = true;
        f fVar = this.M;
        RecyclerView recyclerView = this.u;
        recyclerView.addOnScrollListener(fVar);
        recyclerView.addOnScrollListener(this.N);
        recyclerView.addOnScrollListener(this.O);
        BigReactionAnimationsView bigReactionAnimationsView = (BigReactionAnimationsView) this.t.findViewById(R.id.big_reaction_animations);
        if (this.n) {
            zdw zdwVar = i7o0.b;
            if (zdwVar == null) {
                zdwVar = null;
            }
            j3f0 e2 = zdwVar.e();
            if (e2 != null && (a2 = e2.a()) != null) {
                a2.d = new io.reactivex.rxjava3.disposables.b();
                a2.c = new WeakReference<>(bigReactionAnimationsView);
            }
        }
        P(true ^ this.h0.m);
        b9w b9wVar = this.b;
        if (b9wVar != null) {
            b9wVar.onResume();
        }
        this.X.a(this.o0);
        s("start");
        r3y.b();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void O() {
        uaw a2;
        BigReactionAnimationsView bigReactionAnimationsView;
        this.V = null;
        f fVar = this.M;
        RecyclerView recyclerView = this.u;
        recyclerView.removeOnScrollListener(fVar);
        recyclerView.removeOnScrollListener(this.N);
        recyclerView.removeOnScrollListener(this.O);
        P(this.P);
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        j3f0 e2 = zdwVar.e();
        if (e2 != null && (a2 = e2.a()) != null) {
            HashMap<uaw.a, Object> hashMap = a2.b;
            a2.d.e();
            WeakReference<BigReactionAnimationsView> weakReference = a2.c;
            if (weakReference != null && (bigReactionAnimationsView = weakReference.get()) != null) {
                Iterator<Map.Entry<uaw.a, Object>> it = hashMap.entrySet().iterator();
                while (it.hasNext()) {
                    Object value = it.next().getValue();
                    vaw vawVar = value instanceof vaw ? (vaw) value : null;
                    if (vawVar != null) {
                        ImageView imageView = vawVar.a.get();
                        Drawable drawable = imageView != null ? imageView.getDrawable() : null;
                        ReactionAssetDrawable reactionAssetDrawable = drawable instanceof ReactionAssetDrawable ? (ReactionAssetDrawable) drawable : null;
                        if (reactionAssetDrawable != null) {
                            reactionAssetDrawable.a = null;
                            reactionAssetDrawable.f = ReactionAssetDrawable.Stage.STATIC;
                            reactionAssetDrawable.invalidateSelf();
                        }
                    }
                }
                bigReactionAnimationsView.b.clear();
            }
            a2.c = null;
            Set<Map.Entry<uaw.a, Object>> entrySet = hashMap.entrySet();
            final l8k l8kVar = new l8k(12);
            entrySet.removeIf(new Predicate() { // from class: xsna.qaw
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((Boolean) l8k.this.invoke(obj)).booleanValue();
                }
            });
        }
        b9w b9wVar = this.b;
        if (b9wVar != null) {
            b9wVar.onPause();
        }
        this.X.a(false);
        lgh0 lgh0Var = this.a0;
        if (lgh0Var.a.isInitialized()) {
            lgh0Var.b.c(lgh0Var.a());
        }
        mgh0 mgh0Var = this.b0;
        if (mgh0Var.a.isInitialized()) {
            mgh0Var.b.c(mgh0Var.a());
        }
        ogh0 ogh0Var = this.c0;
        if (ogh0Var.a.isInitialized()) {
            ogh0Var.b.c(ogh0Var.a());
        }
        owi.b(w0);
        this.r.removeCallbacksAndMessages(v0);
        this.i0 = false;
    }

    public final void P(boolean z) {
        Activity activity = this.a;
        if (activity.getIntent().getBooleanExtra("app_content_hidden", false)) {
            return;
        }
        if (z) {
            activity.getWindow().addFlags(8192);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            activity.getWindow().clearFlags(8192);
        }
    }

    public final void Q(int i2) {
        this.J.b = iah0.a(4) + i2 + this.l0;
        this.u.invalidateItemDecorations();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
    
        if (r5 != 0) goto L34;
     */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R() {
        this.a0.e();
        mgh0 mgh0Var = this.b0;
        ScrollToBottomAnimator scrollToBottomAnimator = mgh0Var.b;
        ?? r2 = mgh0Var.a;
        vm30 vm30Var = vm30.this;
        int size = vm30Var.h0.c.size();
        boolean z = mgh0Var.g;
        boolean z2 = false;
        boolean z3 = !vm30Var.r0 || size == 0;
        mgh0Var.g = z3;
        if (z != z3) {
            if (!z3) {
                scrollToBottomAnimator.k(mgh0Var.a(), true);
                mgh0Var.a().setOnClickListener(mgh0Var.d);
            } else if (r2.isInitialized()) {
                scrollToBottomAnimator.g(mgh0Var.a());
                mgh0Var.a().setOnClickListener(null);
            }
        }
        if (r2.isInitialized()) {
            mgh0Var.a().setCounter(size);
            mgh0Var.a().setContentDescription(size > 0 ? mgh0Var.a().getContext().getResources().getQuantityString(R.plurals.vkim_accessibility_msg_list_scroll_to_mention_has_unread, size) : "");
        }
        final ogh0 ogh0Var = this.c0;
        ScrollToBottomAnimator scrollToBottomAnimator2 = ogh0Var.b;
        ?? r3 = ogh0Var.a;
        vm30 vm30Var2 = vm30.this;
        int size2 = vm30Var2.h0.a.size();
        boolean z4 = ogh0Var.d;
        if (vm30Var2.r0 && vm30Var2.h0.b) {
            zdw zdwVar = i7o0.b;
            if (zdwVar == null) {
                zdwVar = null;
            }
            if (zdwVar.e() != null) {
            }
        }
        z2 = true;
        ogh0Var.d = z2;
        if (z4 != z2) {
            if (!z2) {
                scrollToBottomAnimator2.k(ogh0Var.a(), true);
                ogh0Var.a().setOnClickListener(new og8(ogh0Var, 5));
                ogh0Var.a().setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.ngh0
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        ogh0 ogh0Var2 = ogh0.this;
                        vm30.l lVar = ogh0Var2.c;
                        ScrollToBottomView a2 = ogh0Var2.a();
                        vm30 vm30Var3 = vm30.this;
                        com.vk.im.popup.b bVar = vm30Var3.e0;
                        Popup.g.a aVar = new Popup.g.a(a2);
                        int f2 = e3m.f(R.attr.vk_ui_icon_accent, a2.getContext());
                        ReadReactionsChooser.Choice choice = ReadReactionsChooser.Choice.READ_ALL_REACTIONS;
                        bVar.c(new ReadReactionsChooser(Collections.singletonList(new lwb0(null, R.string.vkim_reactions_read_all_reactions, null, Integer.valueOf(f2), R.drawable.vk_icon_message_check_outline_28, choice, false, null, false, false, 1989)), Collections.singletonList(choice), aVar, 2431), new rxz(vm30Var3, 5), null);
                        return true;
                    }
                });
            } else if (r3.isInitialized()) {
                scrollToBottomAnimator2.g(ogh0Var.a());
                ogh0Var.a().setOnClickListener(null);
            }
        }
        if (r3.isInitialized()) {
            ogh0Var.a().setCounter(size2);
            ogh0Var.a().setContentDescription(size2 > 0 ? ogh0Var.a().getContext().getResources().getQuantityString(R.plurals.vkim_accessibility_msg_list_scroll_to_reaction_has_unread, size2) : "");
        }
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void S(DialogTheme dialogTheme) {
        BubbleColors Ab;
        int[] iArr;
        yau remove;
        vci0 remove2;
        vci0 vci0Var = this.n0;
        boolean z = vci0Var != null ? vci0Var.c : false;
        boolean z2 = vci0Var != null ? vci0Var.d : false;
        WeakHashMap<RecyclerView, vci0> weakHashMap = vci0.p;
        RecyclerView recyclerView = this.u;
        vci0 remove3 = weakHashMap.remove(recyclerView);
        if (remove3 != null) {
            recyclerView.removeItemDecoration(remove3);
        }
        tcn tcnVar = new tcn(this, 22);
        if (weakHashMap.containsKey(recyclerView) && (remove2 = weakHashMap.remove(recyclerView)) != null) {
            recyclerView.removeItemDecoration(remove2);
        }
        vci0 vci0Var2 = new vci0(recyclerView, tcnVar);
        weakHashMap.put(recyclerView, vci0Var2);
        recyclerView.addItemDecoration(vci0Var2);
        vci0Var2.m(z);
        if (vci0Var2.d != z2) {
            vci0Var2.m.evictAll();
            vci0Var2.d = z2;
        }
        this.n0 = vci0Var2;
        WeakHashMap<RecyclerView, yau> weakHashMap2 = yau.l;
        yau remove4 = weakHashMap2.remove(recyclerView);
        if (remove4 != null) {
            recyclerView.removeItemDecoration(remove4);
        }
        if (!dialogTheme.b.a()) {
            dialogTheme = null;
        }
        if (dialogTheme == null || (Ab = dialogTheme.Ab(dhr0.C(), 0L, false)) == null || (iArr = Ab.D) == null) {
            return;
        }
        if (iArr.length == 0) {
            iArr = null;
        }
        if (iArr != null) {
            if (weakHashMap2.containsKey(recyclerView) && (remove = weakHashMap2.remove(recyclerView)) != null) {
                recyclerView.removeItemDecoration(remove);
            }
            yau yauVar = new yau(new eqd(new GradientDrawable(GradientDrawable.Orientation.TL_BR, iArr), 23), new h6g((xau) yau.k.getValue(), 21), new leq(9));
            recyclerView.setLayerType(2, null);
            recyclerView.addItemDecoration(yauVar);
            weakHashMap2.put(recyclerView, yauVar);
        }
    }

    public final void a() {
        if (this.o) {
            q(this, new f2s(this, 26));
        }
    }

    public final void b() {
        pp00 pp00Var = new pp00(this, 6);
        RecyclerView recyclerView = this.u;
        wjf0.c(recyclerView, pp00Var);
        com.vk.im.ui.components.viewcontrollers.msg_list_empty.a aVar = this.C;
        if (aVar.S) {
            ViewGroup viewGroup = aVar.e;
            if (viewGroup != null && viewGroup.getViewTreeObserver().isAlive()) {
                ViewGroup viewGroup2 = aVar.e;
                if (viewGroup2 == null) {
                    viewGroup2 = null;
                }
                viewGroup2.getViewTreeObserver().removeOnGlobalLayoutListener(aVar.O);
            }
            aVar.S = false;
        }
        b9w b9wVar = this.b;
        if (b9wVar != null) {
            b9wVar.c(recyclerView);
        }
        if (b9wVar != null) {
            b9wVar.onDestroy();
        }
        this.r.removeCallbacksAndMessages(null);
        this.k.onDestroy();
        this.f0 = null;
        this.g0 = null;
        this.d0.a();
        this.e0.dismiss();
        v14 v14Var = this.u0;
        if (v14Var != null) {
            v14Var.dismiss();
        }
        this.u0 = null;
    }

    public final void c(RecyclerView recyclerView, gzs<s3q0> gzsVar) {
        if (!this.W) {
            this.W = true;
            awt0.i(recyclerView, new com.vk.movika.sdk.base.presenter.c(17, gzsVar, this));
            return;
        }
        L l2 = L.a;
        l2.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l2, L.LogType.d, new Object[]{"ChatScrollIssue: scroll denied"});
    }

    public final int d(zfh0 zfh0Var) {
        boolean z = zfh0Var instanceof bvx;
        ok30 ok30Var = this.H;
        if (!z) {
            if (!(zfh0Var instanceof gb20)) {
                throw new NoWhenBranchMatchedException();
            }
            gb20 gb20Var = (gb20) zfh0Var;
            return qk30.a(ok30Var, gb20Var.a, gb20Var.b);
        }
        long j2 = ((bvx) zfh0Var).a;
        if (ok30Var != null) {
            for (int size = ok30Var.f.size() - 1; -1 < size; size--) {
                if (j2 == ok30Var.getItemId(size)) {
                    return size;
                }
            }
        }
        return -1;
    }

    public final View e(int i2) {
        View s5;
        RecyclerView recyclerView = this.u;
        int childCount = recyclerView.getChildCount();
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                return null;
            }
            Object findContainingViewHolder = recyclerView.findContainingViewHolder(recyclerView.getChildAt(i3));
            chr chrVar = findContainingViewHolder instanceof chr ? (chr) findContainingViewHolder : null;
            if (chrVar != null && (s5 = chrVar.s5(i2)) != null) {
                return s5;
            }
            i3++;
        }
    }

    public final LinkedHashSet f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        MsgLinearLayoutManager msgLinearLayoutManager = this.I;
        int v = msgLinearLayoutManager.v();
        int x = msgLinearLayoutManager.x();
        if (v != -1 && x != -1) {
            j9x it = new k9x(v, x, 1).iterator();
            while (it.d) {
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g b2 = qk30.b(it.nextInt(), this.H);
                Msg Q = b2 != null ? b2.Q() : null;
                if (Q != null) {
                    linkedHashSet.add(Q);
                }
            }
        }
        return linkedHashSet;
    }

    public final zfh0 g(String str) {
        MsgLinearLayoutManager msgLinearLayoutManager = this.I;
        final int v = msgLinearLayoutManager.v();
        final int x = msgLinearLayoutManager.x();
        if (v == -1 || x == -1) {
            return null;
        }
        zfh0 zfh0Var = this.V;
        if (zfh0Var != null) {
            return zfh0Var;
        }
        if (v > x) {
            return null;
        }
        final int i2 = x;
        while (true) {
            ok30 ok30Var = this.H;
            final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g b2 = qk30.b(i2, ok30Var);
            if (b2 != null && b2.C0()) {
                final long c2 = qk30.c(i2, ok30Var);
                View findViewByPosition = msgLinearLayoutManager.findViewByPosition(i2);
                if (findViewByPosition != null) {
                    final String str2 = str;
                    L.d(new gzs() { // from class: xsna.gm30
                        @Override // xsna.gzs
                        public final Object invoke() {
                            StringBuilder a2 = odj.a(v, x, "ChatScrollIssue: getScrollParams fvp=", ", lvp=", ", position=");
                            a2.append(i2);
                            a2.append('/');
                            a2.append(this.H.f.size() - 1);
                            a2.append(", id=");
                            a2.append(c2);
                            a2.append(", tag=");
                            a2.append(str2);
                            a2.append(", item=");
                            a2.append(b2.l());
                            return a2.toString();
                        }
                    });
                    return new bvx(i2, "getScrollParams", c2, msgLinearLayoutManager.getDecoratedTop(findViewByPosition), false);
                }
            }
            String str3 = str;
            if (i2 == v) {
                return null;
            }
            i2--;
            str = str3;
        }
    }

    public final int h() {
        Msg Q;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        MsgLinearLayoutManager msgLinearLayoutManager = this.I;
        int v = msgLinearLayoutManager.v();
        int x = msgLinearLayoutManager.x();
        if (v != -1 && x != -1) {
            j9x it = new k9x(v, x, 1).iterator();
            while (it.d) {
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g b2 = qk30.b(it.nextInt(), this.H);
                Integer num = null;
                if (b2 != null && (Q = b2.Q()) != null) {
                    num = Integer.valueOf(Q.b);
                }
                if (num != null) {
                    linkedHashSet.add(num);
                }
            }
        }
        return linkedHashSet.size();
    }

    public final void i() {
        FrameLayout frameLayout = this.A;
        frameLayout.setTag(R.id.im_floating_reactions_cancelable_on_touch_outside, null);
        frameLayout.removeAllViews();
        frameLayout.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = cn70.b(60);
        frameLayout.setLayoutParams(marginLayoutParams);
        this.g0 = null;
    }

    public final void j(final String str) {
        ok30 ok30Var = this.H;
        if (qk30.e(ok30Var)) {
            final int d2 = qk30.d(ok30Var);
            this.V = new bvx(d2, "instantScrollToLatestBottom", ok30Var.getItemId(e43.h(ok30Var.f)), 0, false);
            L.d(new gzs() { // from class: xsna.fm30
                @Override // xsna.gzs
                public final Object invoke() {
                    StringBuilder a2 = vq.a("ChatScrollIssue: instantScrollToLatestBottom position=", d2, '/');
                    vm30 vm30Var = this;
                    a2.append(vm30Var.H.f.size() - 1);
                    a2.append(", scrollTo=");
                    a2.append(vm30Var.V);
                    a2.append(", stop=true, chain=");
                    a2.append(str);
                    return a2.toString();
                }
            });
            LinearLayoutManagerScrollHelper.d(this.Y, Math.max(0, r10.b().getItemCount() - 1), 0, 4);
        }
    }

    public final void k(final String str) {
        ok30 ok30Var = this.H;
        final int d2 = qk30.d(ok30Var);
        if (d2 >= 0) {
            this.V = new bvx(d2, "instantScrollToLatestTop", qk30.c(d2, ok30Var), this.Z, false);
            L.d(new gzs() { // from class: xsna.lm30
                @Override // xsna.gzs
                public final Object invoke() {
                    StringBuilder a2 = vq.a("ChatScrollIssue: instantScrollToLatestTop position=", d2, '/');
                    vm30 vm30Var = this;
                    a2.append(vm30Var.H.f.size() - 1);
                    a2.append(", scrollTo=");
                    a2.append(vm30Var.V);
                    a2.append(", stop=true, chain=");
                    a2.append(str);
                    return a2.toString();
                }
            });
            this.Y.c(d2, this.Z, true, true);
        } else {
            L l2 = L.a;
            l2.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l2, L.LogType.w, new Object[]{"ChatScrollIssue: instantScrollToLatestTop last item not found"});
        }
    }

    public final void l(final MsgIdType msgIdType, final int i2, final String str) {
        int a2 = qk30.a(this.H, msgIdType, i2);
        Integer valueOf = Integer.valueOf(a2);
        if (a2 == -1) {
            valueOf = null;
        }
        final int intValue = valueOf != null ? valueOf.intValue() : 0;
        L.d(new gzs() { // from class: xsna.jm30
            @Override // xsna.gzs
            public final Object invoke() {
                StringBuilder a3 = vq.a("ChatScrollIssue: instantScrollToMsg position=", intValue, '/');
                a3.append(this.H.f.size() - 1);
                a3.append(", msgIdType=");
                a3.append(msgIdType.h());
                a3.append(", msgId=");
                a3.append(i2);
                a3.append(", chain=");
                a3.append(str);
                return a3.toString();
            }
        });
        m(intValue, this.Z, str);
    }

    public final void m(int i2, int i3, String str) {
        if (i2 >= 0) {
            this.V = new bvx(i2, "instantScrollToPosition", qk30.c(i2, this.H), this.Z, false);
            L.d(new r70(i2, this, str));
            this.Y.c(i2, i3, true, true);
        } else {
            L l2 = L.a;
            l2.getClass();
            if (L.m(LoggerOutputTarget.NONE)) {
                return;
            }
            L.u(l2, L.LogType.w, new Object[]{"ChatScrollIssue: instantScrollToPosition wrong position"});
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c9, code lost:
    
        if (r12.b != r9.b) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(final int i2, final int i3, final int i4, final String str) {
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar;
        ok30 ok30Var;
        Msg Q;
        RecyclerView.e0 findViewHolderForAdapterPosition;
        View view;
        Float valueOf;
        ym30 ym30Var;
        L.d(new gzs() { // from class: xsna.cm30
            @Override // xsna.gzs
            public final Object invoke() {
                StringBuilder a2 = odj.a(i2, i3, "ChatScrollIssue: onLoadMoreRequested fvp ", " lvp ", " count ");
                a2.append(i4);
                a2.append(" caller: ");
                a2.append(str);
                return a2.toString();
            }
        });
        ok30 ok30Var2 = this.H;
        List<? extends com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list = ok30Var2.f;
        RecyclerView recyclerView = this.u;
        if (i2 >= 0 && i2 < list.size() && i3 >= 0 && i3 < list.size()) {
            if (i2 <= i3) {
                int i5 = i3;
                while (true) {
                    gVar = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i5, list);
                    if (gVar != null && gVar.C0()) {
                        break;
                    } else if (i5 == i2) {
                        break;
                    } else {
                        i5--;
                    }
                }
            }
            gVar = null;
            Msg Q2 = gVar != null ? gVar.Q() : null;
            if (Q2 != null && (ym30Var = this.t0) != null) {
                ym30Var.q0(Q2);
            }
            HashMap<Integer, Msg> hashMap = o5u0.a;
            HashMap<Msg, e> hashMap2 = o5u0.b;
            if (recyclerView.getScrollState() == 2) {
                hashMap.clear();
                hashMap2.clear();
            } else {
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g b2 = qk30.b(i2 - 1, ok30Var2);
                Msg Q3 = b2 != null ? b2.Q() : null;
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g b3 = qk30.b(i3 + 1, ok30Var2);
                Msg Q4 = b3 != null ? b3.Q() : null;
                if (i2 <= i3) {
                    int i6 = i2;
                    while (true) {
                        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g b4 = qk30.b(i6, ok30Var2);
                        if (b4 == null || (Q = b4.Q()) == null || (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i6)) == null || (view = findViewHolderForAdapterPosition.itemView) == null) {
                            ok30Var = ok30Var2;
                        } else {
                            int max = Math.max(0, Math.min(recyclerView.getBottom(), view.getBottom()) - Math.max(recyclerView.getTop(), view.getTop()));
                            if (Q3 != null) {
                                ok30Var = ok30Var2;
                            } else {
                                ok30Var = ok30Var2;
                            }
                            if (Q4 == null || Q4.b != Q.b) {
                                valueOf = Float.valueOf(view.getBottom() - view.getTop());
                                if (hashMap.get(Integer.valueOf(Q.b)) != null) {
                                    hashMap.put(Integer.valueOf(Q.b), Q);
                                    hashMap2.put(Q, new e(max, valueOf));
                                } else {
                                    e eVar = hashMap2.get(Q);
                                    if (eVar != null) {
                                        eVar.a += max;
                                        Float f2 = eVar.b;
                                        if (valueOf != null && f2 != null) {
                                            eVar.b = Float.valueOf(valueOf.floatValue() + f2.floatValue());
                                        }
                                    }
                                }
                            }
                            valueOf = null;
                            if (hashMap.get(Integer.valueOf(Q.b)) != null) {
                            }
                        }
                        if (i6 == i3) {
                            break;
                        }
                        i6++;
                        ok30Var2 = ok30Var;
                    }
                }
                Collection<e> values = hashMap2.values();
                if ((values instanceof List) && (values instanceof RandomAccess)) {
                    List list2 = (List) values;
                    int size = list2.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        e eVar2 = (e) list2.get(i7);
                        Float f3 = eVar2.b;
                        if (f3 != null && !epx.d(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                            eVar2.b = Float.valueOf(i35.k(eVar2.a / f3.floatValue(), 2));
                        }
                        if (recyclerView.getHeight() != 0) {
                            eVar2.a = i35.k(eVar2.a / recyclerView.getHeight(), 2);
                        } else {
                            eVar2.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                    }
                } else {
                    for (e eVar3 : values) {
                        Float f4 = eVar3.b;
                        if (f4 != null && !epx.d(f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                            eVar3.b = Float.valueOf(i35.k(eVar3.a / f4.floatValue(), 2));
                        }
                        if (recyclerView.getHeight() != 0) {
                            eVar3.a = i35.k(eVar3.a / recyclerView.getHeight(), 2);
                        } else {
                            eVar3.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        }
                    }
                }
                Collection<Msg> values2 = hashMap.values();
                ym30 ym30Var2 = this.t0;
                if (ym30Var2 != null) {
                    ym30Var2.d0(values2, hashMap2);
                }
                s3q0 s3q0Var = s3q0.a;
                hashMap.clear();
                hashMap2.clear();
            }
            ym30 ym30Var3 = this.t0;
            Integer valueOf2 = ym30Var3 != null ? Integer.valueOf(ym30Var3.v0(Direction.AFTER)) : null;
            k2n0 k2n0Var = this.k;
            if (valueOf2 != null && valueOf2.intValue() + i3 >= i4) {
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) ji.a(1, list);
                if (gVar2 instanceof lvr0) {
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l2, L.LogType.d, new Object[]{"ChatScrollIssue: onLoadMoreRequested for SKELETON " + ((lvr0) gVar2).c});
                    }
                    lvr0 lvr0Var = (lvr0) gVar2;
                    k2n0Var.a(lvr0Var.f);
                    ym30 ym30Var4 = this.t0;
                    if (ym30Var4 != null) {
                        ym30Var4.z0(str, lvr0Var.c);
                    }
                }
            }
            ym30 ym30Var5 = this.t0;
            Integer valueOf3 = ym30Var5 != null ? Integer.valueOf(ym30Var5.v0(Direction.BEFORE)) : null;
            if (valueOf3 != null && i2 - valueOf3.intValue() <= 0) {
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar3 = list.get(0);
                if (gVar3 instanceof lvr0) {
                    L l3 = L.a;
                    l3.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l3, L.LogType.d, new Object[]{"ChatScrollIssue: onLoadMoreRequested for SKELETON " + ((lvr0) gVar3).c});
                    }
                    lvr0 lvr0Var2 = (lvr0) gVar3;
                    k2n0Var.c(lvr0Var2.f);
                    ym30 ym30Var6 = this.t0;
                    if (ym30Var6 != null) {
                        ym30Var6.z0(str, lvr0Var2.c);
                    }
                }
            }
        }
        this.Q.onScrolled(recyclerView, 0, 0);
    }

    public final boolean o(boolean z) {
        ok30 ok30Var = this.H;
        boolean z2 = ok30Var.f.size() == 0;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.k0(ok30Var.f);
        boolean N0 = gVar != null ? gVar.N0() : false;
        if (!z2 && !N0) {
            zfh0 zfh0Var = this.V;
            if (zfh0Var != null && d(zfh0Var) == e43.h(ok30Var.f)) {
                L l2 = L.a;
                l2.getClass();
                if (L.m(LoggerOutputTarget.NONE)) {
                    return true;
                }
                L.u(l2, L.LogType.d, new Object[]{"ChatScrollIssue: isLatestMessageVisible -> true, pending: " + zfh0Var});
                return true;
            }
            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.k0(ok30Var.f);
            boolean z3 = gVar2 != null && gVar2.I();
            MsgLinearLayoutManager msgLinearLayoutManager = this.I;
            int x = (!z || z3) ? msgLinearLayoutManager.x() : msgLinearLayoutManager.w();
            int itemCount = msgLinearLayoutManager.getItemCount() - 1;
            r2 = x >= itemCount;
            if (r2) {
                L l3 = L.a;
                l3.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l3, L.LogType.d, new Object[]{efz.a(x, itemCount, "ChatScrollIssue: isLatestMessageVisible -> true, lastVisible: ", ", lastPosition: ")});
                }
            }
        }
        return r2;
    }

    public final void p(boolean z) {
        vci0 vci0Var = this.n0;
        if (vci0Var != null && vci0Var.d != z) {
            vci0Var.m.evictAll();
            vci0Var.d = z;
        }
        wz30 wz30Var = this.l;
        if (wz30Var.a != z) {
            wz30 a2 = wz30.a(wz30Var, z, null, 254);
            this.l = a2;
            an30 an30Var = this.F;
            an30Var.b = a2;
            if (an30Var.b().isInitialized()) {
                an30Var.a().setSkeletonConfig(a2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [xsna.am30] */
    @SuppressLint({"NotifyDataSetChanged"})
    public final void r() {
        q1f0 q1f0Var;
        this.H.notifyDataSetChanged();
        R();
        i iVar = this.f0;
        if (iVar != null && (q1f0Var = iVar.b) != null) {
            q1f0Var.i();
        }
        a aVar = this.g0;
        if (aVar == null) {
            return;
        }
        final boolean z = aVar.b;
        i();
        D(this, aVar.a, new izs() { // from class: xsna.am30
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                q1f0 q1f0Var2;
                vm30.a aVar2 = vm30.this.g0;
                boolean z2 = z;
                if (aVar2 != null) {
                    aVar2.b = z2;
                }
                if (aVar2 != null && (q1f0Var2 = aVar2.c) != null) {
                    q1f0Var2.k(z2);
                }
                return s3q0.a;
            }
        }, 16);
    }

    public final void s(String str) {
        Handler handler = this.r;
        Object obj = v0;
        handler.removeCallbacksAndMessages(obj);
        handler.postAtTime(new lx5(2, this, str), obj, SystemClock.uptimeMillis() + 64);
    }

    public final void t(zfh0 zfh0Var, boolean z, String str) {
        boolean a2 = zfh0Var.a();
        RecyclerView recyclerView = this.u;
        if (a2) {
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l2, L.LogType.d, new Object[]{"ChatScrollIssue: resetSmoothlyTo " + zfh0Var});
            }
            this.V = zfh0Var;
            c(recyclerView, new cta(zfh0Var, this, str, 3));
            return;
        }
        L l3 = L.a;
        l3.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l3, L.LogType.d, new Object[]{"ChatScrollIssue: resetInstantlyTo " + zfh0Var});
        }
        this.V = zfh0Var;
        c(recyclerView, new t8r(zfh0Var, this, z, str));
    }

    public final boolean u(MsgFromUser msgFromUser) {
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g b2;
        int b3 = cn70.b(36);
        int b4 = cn70.b(75);
        MsgIdType msgIdType = MsgIdType.LOCAL_ID;
        int i2 = msgFromUser.b;
        ok30 ok30Var = this.H;
        int a2 = qk30.a(ok30Var, msgIdType, i2);
        if (a2 != 0) {
            if (a2 != 1 || (b2 = qk30.b(0, ok30Var)) == null || !(b2 instanceof yqn0)) {
                return false;
            }
            int i3 = b4 - b3;
            if (this.k0 != i3) {
                this.k0 = i3;
                Q(this.j0 + i3);
                return true;
            }
        } else if (this.k0 != b4) {
            this.k0 = b4;
            Q(this.j0 + b4);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x013f, code lost:
    
        if (r1 == null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(MsgListEmptyViewState msgListEmptyViewState) {
        int i2;
        Integer valueOf;
        Pair pair;
        boolean z;
        SocialButtonType socialButtonType;
        b.a aVar;
        b.C1104b c1104b;
        Integer valueOf2;
        Pair pair2;
        int i3;
        String url;
        String str;
        boolean z2 = msgListEmptyViewState instanceof MsgListEmptyViewState.ForDialog;
        zm30 zm30Var = this.D;
        int i4 = 1;
        if (z2) {
            MsgListEmptyViewState.ForDialog forDialog = (MsgListEmptyViewState.ForDialog) msgListEmptyViewState;
            Dialog dialog = forDialog.a;
            boolean z3 = dialog.oc().a == WritePermission.State.DISABLED_RECEIVER_PRIVACY_SETTINGS;
            if ((dialog.t1() || dialog.E8()) && z3) {
                this.E = true;
                f4m.j(this.B);
                if (z2) {
                    zm30Var.getClass();
                    bpn0 bpn0Var = zm30Var.f;
                    bpn0 bpn0Var2 = zm30Var.g;
                    Dialog dialog2 = forDialog.a;
                    ProfilesSimpleInfo profilesSimpleInfo = forDialog.b;
                    if (dialog2.t1()) {
                        boolean z4 = forDialog.d;
                        qtd0 zb = profilesSimpleInfo.zb(dialog2.Zb());
                        User user = zb instanceof User ? (User) zb : null;
                        if (user != null) {
                            SocialButtonType socialButtonType2 = user.R;
                            int i5 = user.z;
                            zm30Var.b(zb);
                            ImPlaceholder a2 = zm30Var.a();
                            ers ersVar = forDialog.c;
                            OccupationType occupationType = user.J;
                            if (i5 == 0 || i5 == 1 || i5 == 2) {
                                int i6 = zm30.a.$EnumSwitchMapping$0[socialButtonType2.ordinal()];
                                if (i6 == 1) {
                                    i2 = R.string.vkim_msg_list_empty_placeholder_forbidden_write_try_add_to_friend;
                                } else {
                                    if (i6 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    i2 = R.string.vkim_msg_list_empty_placeholder_forbidden_write_try_to_follow;
                                }
                                valueOf = Integer.valueOf(i2);
                            } else {
                                valueOf = i5 != 3 ? null : Integer.valueOf(R.string.vkim_msg_list_empty_placeholder_forbidden_write);
                            }
                            List<Peer> list = ersVar.a;
                            ArrayList arrayList = new ArrayList();
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                int i7 = i4;
                                bpn0 bpn0Var3 = bpn0Var;
                                qtd0 Bb = ersVar.e.Bb((Peer) it.next());
                                if (Bb != null) {
                                    arrayList.add(Bb);
                                }
                                bpn0Var = bpn0Var3;
                                i4 = i7;
                            }
                            bpn0 bpn0Var4 = bpn0Var;
                            int i8 = i4;
                            if (z4) {
                                String str2 = user.K;
                                String str3 = user.I;
                                Integer num = user.M;
                                Integer num2 = user.L;
                                int i9 = occupationType == OccupationType.WORK ? i8 : 0;
                                int i10 = (((SimpleDateFormat) bpn0Var2.getValue()) == null || num2 == null || num == null) ? 0 : i8;
                                int i11 = i9;
                                int i12 = (occupationType == OccupationType.SCHOOL || occupationType == OccupationType.UNIVERSITY) ? i8 : 0;
                                boolean N = drm0.N(str3);
                                if (i11 != 0) {
                                    pair = new Pair(str2, Integer.valueOf(R.drawable.vk_icon_work_outline_20));
                                } else if (i10 != 0) {
                                    SimpleDateFormat simpleDateFormat = (SimpleDateFormat) bpn0Var2.getValue();
                                    if (simpleDateFormat != null) {
                                        str = (num == null || num2 == null) ? null : simpleDateFormat.format(new Date(1900, num.intValue() - 1, num2.intValue()));
                                    }
                                    str = "";
                                    pair = new Pair(str, Integer.valueOf(R.drawable.vk_icon_cake_outline_20));
                                } else if (i12 != 0) {
                                    pair = new Pair(str2, Integer.valueOf(R.drawable.vk_icon_education_outline_20));
                                } else if (!N) {
                                    pair = new Pair(str3, Integer.valueOf(R.drawable.vk_icon_home_outline_20));
                                }
                                tlo0.a aVar2 = tlo0.Companion;
                                gdp gdpVar = (gdp) bpn0Var4.getValue();
                                String Db = user.Db();
                                gdpVar.getClass();
                                CharSequence a3 = gdp.a(Db);
                                aVar2.getClass();
                                tlo0.h hVar = new tlo0.h(a3);
                                tlo0.g c2 = valueOf == null ? tlo0.a.c(valueOf.intValue(), user.s) : null;
                                if (pair == null) {
                                    z = z4;
                                    socialButtonType = socialButtonType2;
                                    aVar = new b.a(new tlo0.h((CharSequence) pair.d()), new b.a.C1103a(new gko(((Number) pair.g()).intValue()), new x7g(R.attr.vk_ui_icon_secondary)));
                                } else {
                                    z = z4;
                                    socialButtonType = socialButtonType2;
                                    aVar = null;
                                }
                                if (rdi.x(arrayList) == null) {
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        fxj0 o2 = ixj0.o(((qtd0) it2.next()).C8());
                                        ayv0.c cVar = (o2 == null || (url = o2.getUrl()) == null) ? null : new ayv0.c(url);
                                        if (cVar != null) {
                                            arrayList2.add(cVar);
                                        }
                                    }
                                    c1104b = new b.C1104b(arrayList2, hq.b(tlo0.Companion, R.plurals.vkim_msg_list_empty_common_friends_count, ersVar.f));
                                } else {
                                    c1104b = null;
                                }
                                a2.setMiddle(new maw(hVar, c2, new com.vk.im.design.view.placeholder.b(aVar, c1104b)));
                                ImPlaceholder a4 = zm30Var.a();
                                boolean z5 = forDialog.e;
                                int i13 = R.string.vkim_msg_list_empty_friends_status_add;
                                if (i5 != 0) {
                                    int i14 = zm30.a.$EnumSwitchMapping$0[socialButtonType.ordinal()];
                                    if (i14 != 1) {
                                        if (i14 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        i13 = R.string.vkim_msg_list_empty_friends_status_follow;
                                    }
                                    valueOf2 = Integer.valueOf(i13);
                                } else if (i5 == i8) {
                                    int i15 = zm30.a.$EnumSwitchMapping$0[socialButtonType.ordinal()];
                                    if (i15 == 1) {
                                        i3 = R.string.vkim_msg_list_empty_friends_status_sent;
                                    } else {
                                        if (i15 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        i3 = R.string.vkim_msg_list_empty_friends_status_following;
                                    }
                                    valueOf2 = Integer.valueOf(i3);
                                } else if (i5 != 2) {
                                    valueOf2 = null;
                                } else {
                                    if (!z5) {
                                        i13 = R.string.vkim_msg_list_empty_friends_status_accept;
                                    }
                                    valueOf2 = Integer.valueOf(i13);
                                }
                                a.C1102a c1102a = !z ? new a.C1102a(tq.h(tlo0.Companion, R.string.vkim_msg_list_empty_open_profile), new com.vk.voip.a(18, zm30Var, user), VkButton.Size.Small, VkButton.Mode.Tertiary, VkButton.Appearance.Accent, 284) : null;
                                if (valueOf2 != null) {
                                    pair2 = new Pair(c1102a, null);
                                } else {
                                    pair2 = new Pair(new a.C1102a(tq.h(tlo0.Companion, valueOf2.intValue()), new wx0(14, zm30Var, user), VkButton.Size.Small, i5 == 0 ? VkButton.Mode.Primary : VkButton.Mode.Secondary, VkButton.Appearance.Accent, 284), c1102a);
                                }
                                a.C1102a c1102a2 = (a.C1102a) pair2.d();
                                a4.setBottom(c1102a2 == null ? new law(new com.vk.im.design.view.placeholder.a(c1102a2, (a.C1102a) pair2.g(), 4)) : null);
                            }
                            pair = null;
                            tlo0.a aVar22 = tlo0.Companion;
                            gdp gdpVar2 = (gdp) bpn0Var4.getValue();
                            String Db2 = user.Db();
                            gdpVar2.getClass();
                            CharSequence a32 = gdp.a(Db2);
                            aVar22.getClass();
                            tlo0.h hVar2 = new tlo0.h(a32);
                            if (valueOf == null) {
                            }
                            if (pair == null) {
                            }
                            if (rdi.x(arrayList) == null) {
                            }
                            a2.setMiddle(new maw(hVar2, c2, new com.vk.im.design.view.placeholder.b(aVar, c1104b)));
                            ImPlaceholder a42 = zm30Var.a();
                            boolean z52 = forDialog.e;
                            int i132 = R.string.vkim_msg_list_empty_friends_status_add;
                            if (i5 != 0) {
                            }
                            if (!z) {
                            }
                            if (valueOf2 != null) {
                            }
                            a.C1102a c1102a22 = (a.C1102a) pair2.d();
                            a42.setBottom(c1102a22 == null ? new law(new com.vk.im.design.view.placeholder.a(c1102a22, (a.C1102a) pair2.g(), 4)) : null);
                        }
                    } else if (dialog2.E8()) {
                        qtd0 zb2 = profilesSimpleInfo.zb(dialog2.Zb());
                        Contact contact = zb2 instanceof Contact ? (Contact) zb2 : null;
                        if (contact != null) {
                            zm30Var.b(zb2);
                            int i16 = dialog2.Gb() ? R.string.vkim_msg_list_empty_placeholder_contact_can_write : R.string.vkim_msg_list_empty_placeholder_contact_can_not_write;
                            ImPlaceholder a5 = zm30Var.a();
                            tlo0.a aVar3 = tlo0.Companion;
                            gdp gdpVar3 = (gdp) bpn0Var.getValue();
                            String str4 = contact.c;
                            gdpVar3.getClass();
                            CharSequence a6 = gdp.a(str4);
                            aVar3.getClass();
                            a5.setMiddle(new maw(new tlo0.h(a6), new tlo0.f(i16), (com.vk.im.design.view.placeholder.b) null));
                        }
                    }
                }
                zm30Var.c(zm30Var.d);
                return;
            }
        }
        this.E = false;
        zm30Var.c(false);
        com.vk.im.ui.components.viewcontrollers.msg_list_empty.a aVar4 = this.C;
        if (!aVar4.S) {
            throw new IllegalStateException("Instance is destroyed");
        }
        if (epx.f(aVar4.Q, msgListEmptyViewState)) {
            return;
        }
        MsgListEmptyViewState msgListEmptyViewState2 = aVar4.Q;
        if (!epx.f(msgListEmptyViewState2 != null ? msgListEmptyViewState2.getClass() : null, msgListEmptyViewState.getClass())) {
            aVar4.R = true;
        }
        aVar4.Q = msgListEmptyViewState;
        if (aVar4.e != null) {
            aVar4.d(msgListEmptyViewState);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(m.d dVar, List<? extends com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list, String str, boolean z) {
        String str2;
        String str3;
        int i2;
        RecyclerView recyclerView;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar;
        lvr0 lvr0Var;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2;
        if (list != null && (gVar2 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.a0(list)) != null) {
            lvr0 lvr0Var2 = gVar2 instanceof lvr0 ? (lvr0) gVar2 : null;
            if (lvr0Var2 != null) {
                str2 = lvr0Var2.f;
                if (list != null && (gVar = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.k0(list)) != null) {
                    lvr0Var = !(gVar instanceof lvr0) ? (lvr0) gVar : null;
                    if (lvr0Var != null) {
                        str3 = lvr0Var.f;
                        this.k.b(str2, str3);
                        Handler handler = this.r;
                        Object obj = x0;
                        handler.removeCallbacksAndMessages(obj);
                        if (o25.b(o25.a())) {
                            this.c.c().getClass();
                        }
                        int i3 = 0;
                        int i4 = 1;
                        Object[] objArr = (list == null || this.m) ? false : true;
                        i2 = 2;
                        recyclerView = this.u;
                        if (list != null || objArr == true) {
                            wjf0.c(recyclerView, new rf20(this, i2));
                            s3q0 s3q0Var = s3q0.a;
                            R();
                            handler.postAtTime(new gs2(this, 12), obj, SystemClock.uptimeMillis() + 150);
                        }
                        boolean isEmpty = list.isEmpty();
                        int i5 = 13;
                        int i6 = 5;
                        zm30 zm30Var = this.D;
                        ViewGroup viewGroup = this.B;
                        an30 an30Var = this.F;
                        if (!isEmpty) {
                            L l2 = L.a;
                            l2.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l2, L.LogType.d, new Object[]{zr.a("ChatScrollIssue: ", str, "->setHistoryNEW")});
                            }
                            String concat = str.concat("->setHistoryNEW");
                            c cVar = this.i;
                            if (cVar != null && cVar.getEnabled()) {
                                q010 q010Var = new q010(this, i4);
                                if (an30Var.b().isInitialized()) {
                                    bwt0.k(an30Var.a(), new qi00(q010Var, 6));
                                } else {
                                    q010Var.invoke();
                                }
                            }
                            if (an30Var.b().isInitialized() && bwt0.K(an30Var.a())) {
                                d3m.e(an30Var.a(), (r15 & 1) != 0 ? 300L : 100L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new ke9(i6, an30Var, recyclerView), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                            } else {
                                recyclerView.setVisibility(0);
                            }
                            f4m.j(viewGroup);
                            zm30Var.c(false);
                            if (!list.isEmpty()) {
                                ok30 ok30Var = this.H;
                                if (cVar != null) {
                                    c cVar2 = cVar.getEnabled() ? cVar : null;
                                    if (cVar2 != null) {
                                        cVar2.d();
                                        ok30Var.registerAdapterDataObserver(new sjf0(ok30Var, new wo1(9, this, cVar2)));
                                    }
                                }
                                if (this.j.b()) {
                                    ok30Var.registerAdapterDataObserver(new sjf0(ok30Var, new s1x(this, i5)));
                                }
                            }
                            wjf0.c(recyclerView, new im30(this, list, dVar, z));
                            if (this.i0) {
                                s(concat);
                                return;
                            }
                            return;
                        }
                        L l3 = L.a;
                        l3.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l3, L.LogType.d, new Object[]{"ChatScrollIssue: setHistoryEmpty"});
                        }
                        if (an30Var.b().isInitialized()) {
                            hh6 a2 = an30Var.a();
                            a2.c();
                            f4m.j(a2);
                        }
                        wjf0.c(recyclerView, new b410(this, i2));
                        if (this.E) {
                            zm30Var.c(true);
                        } else {
                            if (viewGroup.getChildCount() == 0) {
                                com.vk.im.ui.components.viewcontrollers.msg_list_empty.a aVar = this.C;
                                if (!aVar.S) {
                                    throw new IllegalStateException("Instance is destroyed");
                                }
                                if (aVar.e == null) {
                                    Context context = aVar.a;
                                    LayoutInflater from = LayoutInflater.from(context);
                                    ViewGroup viewGroup2 = aVar.b;
                                    ViewGroup viewGroup3 = (ViewGroup) from.inflate(R.layout.vkim_msg_list_empty, viewGroup2, false);
                                    aVar.e = viewGroup3;
                                    if (viewGroup3 == null) {
                                        viewGroup3 = null;
                                    }
                                    aVar.F = (ImPlaceholder) viewGroup3.findViewById(R.id.msg_list_container_redesign);
                                    ViewGroup viewGroup4 = aVar.e;
                                    if (viewGroup4 == null) {
                                        viewGroup4 = null;
                                    }
                                    aVar.y = (ImChipPlaceholder) viewGroup4.findViewById(R.id.chip_placeholder);
                                    ViewGroup viewGroup5 = aVar.e;
                                    if (viewGroup5 == null) {
                                        viewGroup5 = null;
                                    }
                                    aVar.f = (ViewGroup) viewGroup5.findViewById(R.id.msg_list_container);
                                    ViewGroup viewGroup6 = aVar.e;
                                    if (viewGroup6 == null) {
                                        viewGroup6 = null;
                                    }
                                    aVar.g = (ImageView) viewGroup6.findViewById(R.id.icon);
                                    ViewGroup viewGroup7 = aVar.e;
                                    if (viewGroup7 == null) {
                                        viewGroup7 = null;
                                    }
                                    aVar.h = (TextView) viewGroup7.findViewById(R.id.title);
                                    ViewGroup viewGroup8 = aVar.e;
                                    if (viewGroup8 == null) {
                                        viewGroup8 = null;
                                    }
                                    aVar.i = (TextView) viewGroup8.findViewById(R.id.subtitle);
                                    ViewGroup viewGroup9 = aVar.e;
                                    if (viewGroup9 == null) {
                                        viewGroup9 = null;
                                    }
                                    aVar.j = (AvatarView) viewGroup9.findViewById(R.id.avatar);
                                    ViewGroup viewGroup10 = aVar.e;
                                    if (viewGroup10 == null) {
                                        viewGroup10 = null;
                                    }
                                    aVar.k = (TextView) viewGroup10.findViewById(R.id.name_primary);
                                    ViewGroup viewGroup11 = aVar.e;
                                    if (viewGroup11 == null) {
                                        viewGroup11 = null;
                                    }
                                    aVar.l = (TextView) viewGroup11.findViewById(R.id.name_secondary);
                                    ViewGroup viewGroup12 = aVar.e;
                                    if (viewGroup12 == null) {
                                        viewGroup12 = null;
                                    }
                                    aVar.m = (TextView) viewGroup12.findViewById(R.id.motivation);
                                    ViewGroup viewGroup13 = aVar.e;
                                    if (viewGroup13 == null) {
                                        viewGroup13 = null;
                                    }
                                    aVar.n = (ViewGroup) viewGroup13.findViewById(R.id.hint_container);
                                    ViewGroup viewGroup14 = aVar.e;
                                    if (viewGroup14 == null) {
                                        viewGroup14 = null;
                                    }
                                    aVar.o = (ImageView) viewGroup14.findViewById(R.id.hint_icon);
                                    ViewGroup viewGroup15 = aVar.e;
                                    if (viewGroup15 == null) {
                                        viewGroup15 = null;
                                    }
                                    aVar.p = (StackAvatarView) viewGroup15.findViewById(R.id.hint_avatars);
                                    ViewGroup viewGroup16 = aVar.e;
                                    if (viewGroup16 == null) {
                                        viewGroup16 = null;
                                    }
                                    aVar.q = (TextView) viewGroup16.findViewById(R.id.hint_text);
                                    ViewGroup viewGroup17 = aVar.e;
                                    if (viewGroup17 == null) {
                                        viewGroup17 = null;
                                    }
                                    aVar.r = (VkButton) viewGroup17.findViewById(R.id.friends_status);
                                    ViewGroup viewGroup18 = aVar.e;
                                    if (viewGroup18 == null) {
                                        viewGroup18 = null;
                                    }
                                    aVar.s = (VkButton) viewGroup18.findViewById(R.id.open_profile);
                                    e3m.a aVar2 = e3m.a;
                                    aVar.G = m33.a(R.drawable.vk_icon_education_outline_20, context);
                                    aVar.H = m33.a(R.drawable.vk_icon_work_outline_20, context);
                                    aVar.I = m33.a(R.drawable.vk_icon_home_outline_20, context);
                                    aVar.J = m33.a(R.drawable.vk_icon_cake_outline_20, context);
                                    aVar.L = new gdp();
                                    String string = context.getString(R.string.vkim_msg_list_time_this_year);
                                    try {
                                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(string, Locale.getDefault());
                                        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
                                        dateFormatSymbols.setMonths(context.getResources().getStringArray(R.array.months_full_dep));
                                        simpleDateFormat.setDateFormatSymbols(dateFormatSymbols);
                                        aVar.M = simpleDateFormat;
                                    } catch (Throwable th) {
                                        com.vk.metrics.eventtracking.b.a.q(new IllegalDateFormatException(string, th));
                                    }
                                    if (!aVar.U) {
                                        VkButton vkButton = aVar.r;
                                        if (vkButton == null) {
                                            vkButton = null;
                                        }
                                        bwt0.i0(vkButton, new o010(aVar, 7));
                                        VkButton vkButton2 = aVar.s;
                                        if (vkButton2 == null) {
                                            vkButton2 = null;
                                        }
                                        bwt0.i0(vkButton2, new cww(aVar, i5));
                                    }
                                    ViewGroup viewGroup19 = aVar.e;
                                    if (viewGroup19 == null) {
                                        viewGroup19 = null;
                                    }
                                    if (viewGroup19.getViewTreeObserver().isAlive()) {
                                        ViewGroup viewGroup20 = aVar.e;
                                        if (viewGroup20 == null) {
                                            viewGroup20 = null;
                                        }
                                        viewGroup20.getViewTreeObserver().addOnGlobalLayoutListener(aVar.O);
                                    }
                                    ViewGroup viewGroup21 = aVar.e;
                                    if (viewGroup21 == null) {
                                        viewGroup21 = null;
                                    }
                                    aVar.z = (ViewGroup) viewGroup21.findViewById(R.id.empty_channel_root);
                                    ViewGroup viewGroup22 = aVar.e;
                                    if (viewGroup22 == null) {
                                        viewGroup22 = null;
                                    }
                                    ViewGroup viewGroup23 = (ViewGroup) viewGroup22.findViewById(R.id.empty_vk_app_channel_root);
                                    aVar.t = viewGroup23;
                                    aVar.u = viewGroup23.findViewById(R.id.vk_app_channel_onboarding_first_post_card);
                                    ViewGroup viewGroup24 = aVar.t;
                                    if (viewGroup24 == null) {
                                        viewGroup24 = null;
                                    }
                                    aVar.v = viewGroup24.findViewById(R.id.vk_app_channel_onboarding_monetization_card);
                                    ViewGroup viewGroup25 = aVar.t;
                                    if (viewGroup25 == null) {
                                        viewGroup25 = null;
                                    }
                                    aVar.w = viewGroup25.findViewById(R.id.vk_app_channel_onboarding_tg_migration_card);
                                    ViewGroup viewGroup26 = aVar.t;
                                    if (viewGroup26 == null) {
                                        viewGroup26 = null;
                                    }
                                    aVar.x = (VkPlaceholder) viewGroup26.findViewById(R.id.vk_app_channel_onboarding_placeholder);
                                    int i7 = 8;
                                    if (BuildInfo.t()) {
                                        if (aVar.d) {
                                            ViewGroup viewGroup27 = aVar.e;
                                            if (viewGroup27 == null) {
                                                viewGroup27 = null;
                                            }
                                            ((TextView) viewGroup27.findViewById(R.id.onboarding_title)).setText(R.string.vkm_empty_community_title);
                                            ViewGroup viewGroup28 = aVar.e;
                                            if (viewGroup28 == null) {
                                                viewGroup28 = null;
                                            }
                                            ((TextView) viewGroup28.findViewById(R.id.add_description_subtitle)).setText(R.string.vkm_empty_community_add_description_subtitle);
                                            ViewGroup viewGroup29 = aVar.e;
                                            if (viewGroup29 == null) {
                                                viewGroup29 = null;
                                            }
                                            ((TextView) viewGroup29.findViewById(R.id.share_link_subtitle)).setText(R.string.vkm_empty_community_share_link_subtitile);
                                            ViewGroup viewGroup30 = aVar.e;
                                            if (viewGroup30 == null) {
                                                viewGroup30 = null;
                                            }
                                            ((TextView) viewGroup30.findViewById(R.id.write_post_subtitle)).setText(R.string.vkm_empty_community_write_first_message_subtitle);
                                        }
                                        ViewGroup viewGroup31 = aVar.e;
                                        if (viewGroup31 == null) {
                                            viewGroup31 = null;
                                        }
                                        TextView textView = (TextView) viewGroup31.findViewById(R.id.add_description_button);
                                        com.vk.im.ui.components.viewcontrollers.msg_list_empty.a.a(textView);
                                        awt0.j(cn70.b(8), textView);
                                        bwt0.i0(textView, new kdn(aVar, 25));
                                        aVar.B = textView;
                                        ViewGroup viewGroup32 = aVar.e;
                                        if (viewGroup32 == null) {
                                            viewGroup32 = null;
                                        }
                                        aVar.A = (ImageView) viewGroup32.findViewById(R.id.add_description_icon);
                                        ViewGroup viewGroup33 = aVar.e;
                                        if (viewGroup33 == null) {
                                            viewGroup33 = null;
                                        }
                                        TextView textView2 = (TextView) viewGroup33.findViewById(R.id.share_link_button);
                                        com.vk.im.ui.components.viewcontrollers.msg_list_empty.a.a(textView2);
                                        awt0.j(cn70.b(8), textView2);
                                        bwt0.i0(textView2, new uv20(aVar, i4));
                                        aVar.D = textView2;
                                        ViewGroup viewGroup34 = aVar.e;
                                        if (viewGroup34 == null) {
                                            viewGroup34 = null;
                                        }
                                        aVar.C = (ImageView) viewGroup34.findViewById(R.id.share_link_icon);
                                        ViewGroup viewGroup35 = aVar.e;
                                        if (viewGroup35 == null) {
                                            viewGroup35 = null;
                                        }
                                        aVar.E = (ImageView) viewGroup35.findViewById(R.id.write_post_icon);
                                        kkm kkmVar = aVar.c;
                                        kkmVar.e(viewGroup2, new tji(i6));
                                        TextView textView3 = aVar.B;
                                        if (textView3 == null) {
                                            textView3 = null;
                                        }
                                        kkmVar.e(textView3, new woi(2));
                                        ImageView imageView = aVar.A;
                                        if (imageView == null) {
                                            imageView = null;
                                        }
                                        kkmVar.e(imageView, new uni(i4));
                                        TextView textView4 = aVar.D;
                                        if (textView4 == null) {
                                            textView4 = null;
                                        }
                                        kkmVar.e(textView4, new hkb(i6));
                                        ImageView imageView2 = aVar.C;
                                        if (imageView2 == null) {
                                            imageView2 = null;
                                        }
                                        kkmVar.e(imageView2, new nhi(i6));
                                        ImageView imageView3 = aVar.E;
                                        if (imageView3 == null) {
                                            imageView3 = null;
                                        }
                                        kkmVar.e(imageView3, new rei(i6));
                                    } else {
                                        View view = aVar.u;
                                        if (view == null) {
                                            view = null;
                                        }
                                        bwt0.i0(view, new nl30(aVar, i3));
                                        View view2 = aVar.v;
                                        if (view2 == null) {
                                            view2 = null;
                                        }
                                        bwt0.i0(view2, new ayo(aVar, 21));
                                        View view3 = aVar.w;
                                        if (view3 == null) {
                                            view3 = null;
                                        }
                                        bwt0.i0(view3, new bq00(aVar, i7));
                                        OverSizeChildLayout overSizeChildLayout = aVar.K;
                                        if (overSizeChildLayout != null) {
                                            overSizeChildLayout.setDisableChangingSize(true);
                                        }
                                        VkPlaceholder vkPlaceholder = aVar.x;
                                        if (vkPlaceholder == null) {
                                            vkPlaceholder = null;
                                        }
                                        Context context2 = vkPlaceholder.getContext();
                                        e3m.a aVar3 = e3m.a;
                                        Drawable a3 = m33.a(R.drawable.vk_icon_illustration_channel_142, context2);
                                        vkPlaceholder.setTop(a3 != null ? new VkPlaceholder.c.C0860c(new slw(a3), null, null, null, 30) : null);
                                        vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(i2, tq.h(tlo0.Companion, R.string.vkm_new_empty_channel_stub_for_personal_title)), new VkPlaceholder.b.C0859b(14, new tlo0.f(R.string.vkm_new_empty_channel_stub_for_author_subtitle))));
                                        vkPlaceholder.setWithVerticalPaddings(false);
                                        ViewGroup viewGroup36 = aVar.e;
                                        if (viewGroup36 == null) {
                                            viewGroup36 = null;
                                        }
                                        VkCell vkCell = (VkCell) viewGroup36.findViewById(R.id.vk_app_channel_onboarding_first_post_cell);
                                        gko.b bVar = gko.Companion;
                                        x7g x7gVar = new x7g(R.attr.vk_ui_icon_accent_themed);
                                        VkCell.Left.Main.Size size = VkCell.Left.Main.Size.Small;
                                        vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.c(new gko(R.drawable.vk_icon_message_outline_24), size, new k1u0.a(x7gVar), i7), null));
                                        vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(new tlo0.f(R.string.vkm_new_empty_channel_first_post), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), (VkCell.Middle.d) null, (VkCell.Middle.c) null, (VkCell.Middle.Size) (0 == true ? 1 : 0), 14));
                                        VkCell.Right.c cVar3 = VkCell.Right.Companion;
                                        vkCell.setRight(VkCell.Right.c.a(cVar3, null, null, null, new VkCell.Right.b((izs) null, (tlo0.f) null, new k1u0.a(new x7g(R.attr.vk_ui_icon_tertiary)), 3), 23));
                                        ViewGroup viewGroup37 = aVar.e;
                                        if (viewGroup37 == null) {
                                            viewGroup37 = null;
                                        }
                                        VkCell vkCell2 = (VkCell) viewGroup37.findViewById(R.id.vk_app_channel_onboarding_tg_migration_cell);
                                        vkCell2.setLeft(new VkCell.Left.b(new VkCell.Left.Main.c(new gko(R.drawable.vk_icon_sort_horizontal_outline_24), size, new k1u0.a(new x7g(R.attr.vk_ui_icon_accent_themed)), i7), null));
                                        vkCell2.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(new tlo0.f(R.string.vkm_new_empty_channel_tg_transfer), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), (VkCell.Middle.d) null, (VkCell.Middle.c) null, (VkCell.Middle.Size) (0 == true ? 1 : 0), 14));
                                        vkCell2.setRight(VkCell.Right.c.a(cVar3, null, null, null, new VkCell.Right.b((izs) null, (tlo0.f) null, new k1u0.a(new x7g(R.attr.vk_ui_icon_tertiary)), 3), 23));
                                        ViewGroup viewGroup38 = aVar.e;
                                        if (viewGroup38 == null) {
                                            viewGroup38 = null;
                                        }
                                        VkCell vkCell3 = (VkCell) viewGroup38.findViewById(R.id.vk_app_channel_onboarding_monetization_cell);
                                        vkCell3.setLeft(new VkCell.Left.b(new VkCell.Left.Main.c(new gko(R.drawable.vk_icon_money_circle_outline_24), size, new k1u0.a(new x7g(R.attr.vk_ui_icon_accent_themed)), i7), null));
                                        vkCell3.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(new tlo0.f(R.string.vkm_new_empty_channel_monetization), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), (VkCell.Middle.d) null, (VkCell.Middle.c) null, (VkCell.Middle.Size) (0 == true ? 1 : 0), 14));
                                        vkCell3.setRight(VkCell.Right.c.a(cVar3, null, null, null, new VkCell.Right.b((izs) null, (tlo0.f) null, new k1u0.a(new x7g(R.attr.vk_ui_icon_tertiary)), 3), 23));
                                    }
                                    MsgListEmptyViewState msgListEmptyViewState = aVar.Q;
                                    if (msgListEmptyViewState != null) {
                                        aVar.d(msgListEmptyViewState);
                                    }
                                }
                                ViewGroup viewGroup39 = aVar.e;
                                viewGroup.addView(viewGroup39 != null ? viewGroup39 : null);
                            }
                            d3m.c(this.B, (r15 & 1) != 0 ? 300L : 150L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                        R();
                        return;
                    }
                }
                str3 = null;
                this.k.b(str2, str3);
                Handler handler2 = this.r;
                Object obj2 = x0;
                handler2.removeCallbacksAndMessages(obj2);
                if (o25.b(o25.a())) {
                }
                int i32 = 0;
                int i42 = 1;
                if (list == null) {
                }
                i2 = 2;
                recyclerView = this.u;
                if (list != null) {
                }
                wjf0.c(recyclerView, new rf20(this, i2));
                s3q0 s3q0Var2 = s3q0.a;
                R();
                handler2.postAtTime(new gs2(this, 12), obj2, SystemClock.uptimeMillis() + 150);
            }
        }
        str2 = null;
        if (list != null) {
            if (!(gVar instanceof lvr0)) {
            }
            if (lvr0Var != null) {
            }
        }
        str3 = null;
        this.k.b(str2, str3);
        Handler handler22 = this.r;
        Object obj22 = x0;
        handler22.removeCallbacksAndMessages(obj22);
        if (o25.b(o25.a())) {
        }
        int i322 = 0;
        int i422 = 1;
        if (list == null) {
        }
        i2 = 2;
        recyclerView = this.u;
        if (list != null) {
        }
        wjf0.c(recyclerView, new rf20(this, i2));
        s3q0 s3q0Var22 = s3q0.a;
        R();
        handler22.postAtTime(new gs2(this, 12), obj22, SystemClock.uptimeMillis() + 150);
    }

    public final void y(int i2) {
        if (this.j0 != i2) {
            this.j0 = i2;
            Q(i2);
            f4m.t(i2 + this.l0, this.v);
            this.X.b.a(true);
        }
    }

    public final void z(boolean z) {
        this.o0 = z;
        this.X.a(this.i0 && z);
    }
}
