package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.community.design.view.components.compose.CommunityCardMode;
import com.vk.community.design.view.components.compose.CommunityCardTitle$Text;
import com.vk.community.design.view.components.compose.a;
import com.vk.community.design.view.components.compose.b;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.yd5;

/* compiled from: AuthorsChannelSliderView.kt */
/* loaded from: classes.dex */
public final class qe5 extends m2a<ne5, me5, yd5> {
    public final zd5 b;

    /* compiled from: AuthorsChannelSliderView.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.channel.AuthorsChannelSliderView$BlockView$ContentImpl$1$1", f = "AuthorsChannelSliderView.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes16.dex */
    public static final class a extends SuspendLambda implements wzs<yd5, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = qe5.this.new a(this.$context, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yd5 yd5Var, spj<? super s3q0> spjVar) {
            return ((a) create(yd5Var, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            yd5 yd5Var = (yd5) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            zd5 zd5Var = qe5.this.b;
            zd5Var.getClass();
            if (yd5Var instanceof yd5.b) {
                ydt0 ydt0Var = zd5Var.a;
                UserId userId = ((yd5.b) yd5Var).b;
                ydt0Var.getClass();
            } else {
                if (!(yd5Var instanceof yd5.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bpn0 bpn0Var = o25.a;
                if (bpn0Var == null) {
                    bpn0Var = null;
                }
                ((b25) bpn0Var.getValue()).getClass();
            }
            return s3q0.a;
        }
    }

    public qe5(zd5 zd5Var) {
        super(fpf0.a(yd5.class));
        this.b = zd5Var;
    }

    @Override // xsna.m2a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(final a8a a8aVar, final ne5 ne5Var, final izs izsVar, final ksr ksrVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        boolean z = ne5Var.d;
        androidx.compose.runtime.a M = aVar.M(-876499121);
        if ((i & 48) == 0) {
            i2 = (M.J(ne5Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(ksrVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74897 & i2) != 74896)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-876499121, i2, -1, "com.vk.catalog.mvi.block.video.impl.channel.AuthorsChannelSliderView.BlockView.ContentImpl (AuthorsChannelSliderView.kt:150)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b());
            boolean y = ((458752 & i2) == 131072) | M.y(context);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (y || x == obj) {
                x = new a(context, null);
                M.R(x);
            }
            c1q.a(ksrVar, (wzs) x, M, (i2 >> 9) & 14);
            CommunityCardTitle$Text communityCardTitle$Text = new CommunityCardTitle$Text(ne5Var.e, ne5Var.g, null, 10);
            int i3 = i2 & 896;
            int i4 = i2 & 112;
            boolean z2 = (i3 == 256) | (i4 == 32);
            Object x2 = M.x();
            if (z2 || x2 == obj) {
                x2 = new oe5(0, izsVar, ne5Var);
                M.R(x2);
            }
            q630 E = ahn.E(ojc.c(q630Var, false, null, null, (gzs) x2, 15), "mvi_catalog_authors_channel_card_tag");
            b.a aVar3 = new b.a(ne5Var.f, 6);
            String a2 = z ? zq.a(M, 1617038448, R.string.profile_btn_subscribed, M, 0) : zq.a(M, 1617142453, R.string.profile_subscribe, M, 0);
            ButtonStyle buttonStyle = z ? ButtonStyle.Secondary : ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = z ? ButtonAppearance.Neutral : ButtonAppearance.Overlay;
            boolean z3 = (i3 == 256) | (i4 == 32);
            Object x3 = M.x();
            if (z3 || x3 == obj) {
                x3 = new sk(3, izsVar, ne5Var);
                M.R(x3);
            }
            a.C0722a c0722a = new a.C0722a(a2, (gzs) x3, buttonAppearance, buttonStyle, 76);
            String str = ne5Var.c;
            aVar2 = M;
            emu0.c(communityCardTitle$Text, E, aVar3, null, c0722a, str != null ? new etg(str) : null, CommunityCardMode.VideoSquare, null, aVar2, 1572864, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.l(new wzs() { // from class: xsna.pe5
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    qe5.this.b(a8aVar, ne5Var, izsVar, ksrVar, q630Var, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            });
        }
    }
}
