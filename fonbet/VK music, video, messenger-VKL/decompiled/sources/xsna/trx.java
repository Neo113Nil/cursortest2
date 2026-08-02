package xsna;

import androidx.compose.runtime.a;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.q630;

/* compiled from: InviteFriendsSearchField.kt */
/* loaded from: classes14.dex */
public final class trx {

    /* compiled from: InviteFriendsSearchField.kt */
    @b6l(c = "com.vk.friends.groupinvite.impl.ui.InviteFriendsSearchFieldKt$InviteFriendsSearchField$2$1", f = "InviteFriendsSearchField.kt", l = {TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ rwr $focusRequester;
        final /* synthetic */ boolean $requestFocus;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, rwr rwrVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$requestFocus = z;
            this.$focusRequester = rwrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$requestFocus, this.$focusRequester, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                this.label = 1;
                if (qsl.b(500L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            if (this.$requestFocus) {
                rwr.b(this.$focusRequester);
            } else {
                this.$focusRequester.a();
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final tho0 tho0Var, final gzs<s3q0> gzsVar, q630 q630Var, final boolean z, boolean z2, final gzs<s3q0> gzsVar2, final gzs<s3q0> gzsVar3, final izs<? super tho0, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        final boolean z3;
        int i3;
        q630 q630Var2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-610768967);
        int i4 = (M.J(tho0Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= M.y(gzsVar) ? 32 : 16;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            z3 = z2;
            i4 |= M.l(z3) ? 16384 : 8192;
            i3 = (!M.y(izsVar) ? 8388608 : 4194304) | i4 | (!M.y(gzsVar2) ? 131072 : 65536) | (!M.y(gzsVar3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
            if (M.t(i3 & 1, (4793491 & i3) == 4793490)) {
                q630Var2 = q630Var;
                aVar2 = M;
                aVar2.h();
            } else {
                boolean z4 = i5 != 0 ? false : z3;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-610768967, i3, -1, "com.vk.friends.groupinvite.impl.ui.InviteFriendsSearchField (InviteFriendsSearchField.kt:36)");
                }
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = ir.h(M);
                }
                sg50 sg50Var = (sg50) x;
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new rwr();
                    M.R(x2);
                }
                rwr rwrVar = (rwr) x2;
                if (((Boolean) sdi.e(sg50Var, M, 6).getValue()).booleanValue()) {
                    gzsVar.invoke();
                }
                String N = d370.N(R.string.vk_talkback_ic_voice, 0, M);
                SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = new zsw(2);
                    M.R(x3);
                }
                int i6 = i3 >> 12;
                lkg0 a2 = vlh0.a((i6 & 112) | 3072, 0, M, com.vk.core.compose.component.semantics.b.a(mode, (izs) x3, 2), N, gzsVar2);
                q630 f = txj0.f(txj0.h(jvi.d(q630.a.a, rwrVar), 36), 1.0f);
                q630Var2 = q630Var;
                q630 g = q630Var2.g(f);
                String N2 = d370.N(R.string.vk_search, 0, M);
                boolean z5 = (i3 & 29360128) == 8388608;
                Object x4 = M.x();
                if (z5 || x4 == c0012a) {
                    x4 = new mmd(izsVar, 2);
                    M.R(x4);
                }
                z3 = z4;
                fiv0.a(N2, tho0Var, (izs) x4, g, null, a2, null, sg50Var, gzsVar3, null, null, z, null, false, false, M, ((i3 << 3) & 112) | 12582912 | ((i3 << 6) & 234881024), 48, 30288);
                aVar2 = M;
                Boolean valueOf = Boolean.valueOf(z3);
                boolean z6 = (i3 & 57344) == 16384;
                Object x5 = aVar2.x();
                if (z6 || x5 == c0012a) {
                    x5 = new a(z3, rwrVar, null);
                    aVar2.R(x5);
                }
                bap.g(valueOf, (wzs) x5, aVar2, i6 & 14);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            s = aVar2.s();
            if (s == null) {
                final q630 q630Var3 = q630Var2;
                s.d = new wzs() { // from class: xsna.srx
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        trx.a(tho0.this, gzsVar, q630Var3, z, z3, gzsVar2, gzsVar3, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        z3 = z2;
        i3 = (!M.y(izsVar) ? 8388608 : 4194304) | i4 | (!M.y(gzsVar2) ? 131072 : 65536) | (!M.y(gzsVar3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i3 & 1, (4793491 & i3) == 4793490)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}
