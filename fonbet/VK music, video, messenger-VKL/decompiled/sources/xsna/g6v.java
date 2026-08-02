package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vkontakte.android.R;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: StoryRepostSwitchCell.kt */
/* loaded from: classes15.dex */
public final class g6v implements Cell$Middle.d {
    public final boolean a;
    public final gzs<s3q0> b;

    /* compiled from: StoryRepostSwitchCell.kt */
    @b6l(c = "com.vk.avatarchange.HighlightedTitle$Content$1$1$1", f = "StoryRepostSwitchCell.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return g6v.this.new a(spjVar);
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
            g6v.this.b.invoke();
            return s3q0.a;
        }
    }

    public g6v(boolean z, gzs<s3q0> gzsVar) {
        this.a = z;
        this.b = gzsVar;
    }

    @Override // com.vk.core.compose.component.cell.content.Cell$Middle.d, com.vk.core.compose.component.cell.content.Cell$Middle.c, com.vk.core.compose.component.cell.content.Cell$Middle.b
    public final void c(q630 q630Var, Cell$Middle.Size size, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-554828491);
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
                androidx.compose.runtime.b.f(-554828491, i2, -1, "com.vk.avatarchange.HighlightedTitle.Content (StoryRepostSwitchCell.kt:69)");
            }
            String N = d370.N(R.string.avatar_publish_story, 0, M);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new v5v(N, new Pair(0, Integer.valueOf(N.length())));
                M.R(x);
            }
            v5v v5vVar = (v5v) x;
            if (this.a) {
                M.K(-1861100575);
                d8v0.a(new Pair(0, Integer.valueOf(N.length())), null, null, null, false, true, true, null, kai.c(832267532, new eta(this, v5vVar, size, 1), M), M, 807075840, 414);
                M.j();
            } else {
                M.K(-1860282237);
                ecm0.c(N, size, null, M, i2 & 112);
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
            s.d = new c6v(i, 0, this, q630Var, size);
        }
    }
}
