package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.tool.onboarding.VkOnboarding$HighlighterMarkerType;
import com.vkontakte.android.R;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.q630;
import xsna.t5v.a;

/* compiled from: StoryRepostSwitchCell.kt */
/* loaded from: classes15.dex */
public final class t5v implements Cell$Middle.c {
    public final boolean a;
    public final gzs<s3q0> b;

    /* compiled from: StoryRepostSwitchCell.kt */
    @b6l(c = "com.vk.avatarchange.HighlightedSubtitle$Content$1$1$1", f = "StoryRepostSwitchCell.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return t5v.this.new a(spjVar);
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
            t5v.this.b.invoke();
            return s3q0.a;
        }
    }

    public t5v(boolean z, gzs<s3q0> gzsVar) {
        this.a = z;
        this.b = gzsVar;
    }

    @Override // com.vk.core.compose.component.cell.content.Cell$Middle.c, com.vk.core.compose.component.cell.content.Cell$Middle.b
    public final void c(q630 q630Var, final Cell$Middle.Size size, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-402635493);
        if ((i & 48) == 0) {
            i2 = (M.o(size.ordinal()) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-402635493, i2, -1, "com.vk.avatarchange.HighlightedSubtitle.Content (StoryRepostSwitchCell.kt:119)");
            }
            String N = d370.N(R.string.avatar_publish_story_subtitle, 0, M);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new v5v(N, new Pair(0, Integer.valueOf(N.length())));
                M.R(x);
            }
            final v5v v5vVar = (v5v) x;
            if (this.a) {
                M.K(930017064);
                d8v0.a(new Pair(0, Integer.valueOf(N.length())), null, VkOnboarding$HighlighterMarkerType.Type4, null, false, true, true, null, kai.c(694630884, new zzs() { // from class: xsna.p5v
                    @Override // xsna.zzs
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        int i3;
                        izs izsVar = (izs) obj;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                        int intValue = ((Integer) obj4).intValue();
                        if ((intValue & 6) == 0) {
                            i3 = (aVar2.y(izsVar) ? 4 : 2) | intValue;
                        } else {
                            i3 = intValue;
                        }
                        if ((intValue & 48) == 0) {
                            i3 |= aVar2.l(booleanValue) ? 32 : 16;
                        }
                        if (aVar2.t(i3 & 1, (i3 & 147) != 146)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(694630884, i3, -1, "com.vk.avatarchange.HighlightedSubtitle.Content.<anonymous> (StoryRepostSwitchCell.kt:131)");
                            }
                            s3q0 s3q0Var = s3q0.a;
                            t5v t5vVar = t5v.this;
                            boolean J = aVar2.J(t5vVar);
                            Object x2 = aVar2.x();
                            if (J || x2 == a.C0011a.a) {
                                x2 = t5vVar.new a(null);
                                aVar2.R(x2);
                            }
                            bap.g(s3q0Var, (wzs) x2, aVar2, 6);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            iyk0 iyk0Var = rrv0.a;
                            ylu0 ylu0Var = (ylu0) aVar2.r(iyk0Var);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            boolean z = !ylu0Var.s();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var2 = (ylu0) aVar2.r(iyk0Var);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            long j = ylu0Var2.getText().o;
                            bpn0 bpn0Var = v5v.c;
                            Cell$Middle.c.b.a(d8v0.c(v5vVar, booleanValue, z, j, aVar2, i3 & 112), null, 0, 0, null, null, null, izsVar, aVar2, ((i3 << 24) & 234881024) | 805306368, 254).c(q630.a.a, size, aVar2, 6);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar2.h();
                        }
                        return s3q0.a;
                    }
                }, M), M, 807076224, 410);
                M.j();
            } else {
                M.K(930915258);
                ecm0.b(N, size, null, M, i2 & 112);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ijl(i, 3, this, q630Var, size);
        }
    }
}
