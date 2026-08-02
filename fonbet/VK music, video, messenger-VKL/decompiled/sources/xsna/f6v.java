package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vkontakte.android.R;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.f6v.a;
import xsna.q630;

/* compiled from: StoryRepostSwitchCell.kt */
/* loaded from: classes18.dex */
public final class f6v implements Cell$Middle.d {
    public final boolean a;
    public final gzs<s3q0> b;

    /* compiled from: StoryRepostSwitchCell.kt */
    @b6l(c = "com.vk.feed.tool.compose.posting.step2cell.HighlightedTitle$Content$1$1$1", f = "StoryRepostSwitchCell.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return f6v.this.new a(spjVar);
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
            f6v.this.b.invoke();
            return s3q0.a;
        }
    }

    public f6v(boolean z, gzs<s3q0> gzsVar) {
        this.a = z;
        this.b = gzsVar;
    }

    @Override // com.vk.core.compose.component.cell.content.Cell$Middle.d, com.vk.core.compose.component.cell.content.Cell$Middle.c, com.vk.core.compose.component.cell.content.Cell$Middle.b
    public final void c(q630 q630Var, final Cell$Middle.Size size, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1099050204);
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
                androidx.compose.runtime.b.f(-1099050204, i2, -1, "com.vk.feed.tool.compose.posting.step2cell.HighlightedTitle.Content (StoryRepostSwitchCell.kt:72)");
            }
            String N = d370.N(R.string.story_repost_toggle_title, 0, M);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new v5v(N, new Pair(0, Integer.valueOf(N.length())));
                M.R(x);
            }
            final v5v v5vVar = (v5v) x;
            if (this.a) {
                M.K(-1268605198);
                d8v0.a(new Pair(0, Integer.valueOf(N.length())), null, null, null, false, true, true, null, kai.c(-17069715, new zzs() { // from class: xsna.z5v
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
                        int i4 = i3;
                        if (aVar2.t(i4 & 1, (i4 & 147) != 146)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-17069715, i4, -1, "com.vk.feed.tool.compose.posting.step2cell.HighlightedTitle.Content.<anonymous> (StoryRepostSwitchCell.kt:83)");
                            }
                            s3q0 s3q0Var = s3q0.a;
                            f6v f6vVar = f6v.this;
                            boolean J = aVar2.J(f6vVar);
                            Object x2 = aVar2.x();
                            if (J || x2 == a.C0011a.a) {
                                x2 = f6vVar.new a(null);
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
                            boolean s = true ^ ylu0Var.s();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var2 = (ylu0) aVar2.r(iyk0Var);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            long j = ylu0Var2.getText().o;
                            bpn0 bpn0Var = v5v.c;
                            Cell$Middle.d.b.b(d8v0.c(v5vVar, booleanValue, s, j, aVar2, i4 & 112), null, null, null, 0, 0, null, null, izsVar, aVar2, (i4 << 27) & 1879048192, 6, 510).c(q630.a.a, size, aVar2, 6);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar2.h();
                        }
                        return s3q0.a;
                    }
                }, M), M, 807075840, 414);
                M.j();
            } else {
                M.K(-1267786860);
                dcm0.c(N, size, null, M, i2 & 112);
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
            s.d = new jo7(this, q630Var, size, i, 3);
        }
    }
}
