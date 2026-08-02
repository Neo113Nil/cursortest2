package xsna;

import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.RichCell$Middle;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PostingWithAuthorView.kt */
/* loaded from: classes4.dex */
public final class m6p0 implements RichCell$Middle.h.a {
    public final lg90 a;
    public final long b;
    public final String c;
    public final boolean d;
    public final gzs<s3q0> e;
    public final gzs<s3q0> f;

    /* compiled from: PostingWithAuthorView.kt */
    @b6l(c = "com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.posting.TooltipTitleAlongIcon$Content$3$1", f = "PostingWithAuthorView.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ etv0 $tooltipState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(etv0 etv0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$tooltipState = etv0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return m6p0.this.new a(this.$tooltipState, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (m6p0.this.d) {
                this.$tooltipState.setVisible(true);
            }
            return s3q0.a;
        }
    }

    public m6p0(lg90 lg90Var, long j, String str, boolean z, gzs gzsVar, gzs gzsVar2) {
        this.a = lg90Var;
        this.b = j;
        this.c = str;
        this.d = z;
        this.e = gzsVar;
        this.f = gzsVar2;
    }

    @Override // com.vk.core.compose.component.cell.content.RichCell.Middle.h.a, com.vk.core.compose.component.cell.content.RichCell.Middle.g.a, com.vk.core.compose.component.cell.content.RichCell.Middle.c.a
    public final void b(spg0 spg0Var, q630 q630Var, RichCell$Middle.Size size, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(2145819899);
        if ((i & 3072) == 0) {
            i2 = (M.J(this) ? 2048 : 1024) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & IronSourceError.ERROR_LOAD_FAILED_TIMEOUT) != 1024)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2145819899, i2, -1, "com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.posting.TooltipTitleAlongIcon.Content (PostingWithAuthorView.kt:327)");
            }
            int i3 = i2 & 7168;
            boolean z = i3 == 2048;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z || x == obj) {
                x = new kvm0(this, 5);
                M.R(x);
            }
            buv0 z2 = rdi.z(false, (izs) x, null, M, 0, 5);
            VkTooltip$BalloonPosition vkTooltip$BalloonPosition = VkTooltip$BalloonPosition.BottomLeft;
            VkTooltip$BalloonTilt vkTooltip$BalloonTilt = VkTooltip$BalloonTilt.Left;
            VkTooltip$MarkerStyle vkTooltip$MarkerStyle = VkTooltip$MarkerStyle.Style1;
            VkTooltip$MarkerSize vkTooltip$MarkerSize = VkTooltip$MarkerSize.Size48;
            boolean z3 = dhr0.C().b;
            boolean y = M.y(z2) | (i3 == 2048);
            Object x2 = M.x();
            if (y || x2 == obj) {
                x2 = new com.vk.movika.sdk.base.ui.r(20, z2, this);
                M.R(x2);
            }
            o9v0.a(this.c, z2, null, vkTooltip$MarkerStyle, vkTooltip$MarkerSize, null, vkTooltip$BalloonPosition, vkTooltip$BalloonTilt, (gzs) x2, this.e, null, null, null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, z3, kai.c(1852185224, new nw6(this, 10), M), M, 14183424, 805306368, 261156);
            M = M;
            Boolean valueOf = Boolean.valueOf(this.d);
            boolean y2 = M.y(z2) | (i3 == 2048);
            Object x3 = M.x();
            if (y2 || x3 == obj) {
                x3 = new a(z2, null);
                M.R(x3);
            }
            bap.g(valueOf, (wzs) x3, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vrx(this, spg0Var, q630Var, size, i, 2);
        }
    }
}
