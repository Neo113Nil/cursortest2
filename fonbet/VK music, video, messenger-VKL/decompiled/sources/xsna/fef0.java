package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.music.common.MusicPlaybackLaunchContext;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.eef0;
import xsna.y050;

/* compiled from: RecommendedPlaylistEvent.kt */
/* loaded from: classes.dex */
public final class fef0 {
    public final fl4 a;

    /* compiled from: RecommendedPlaylistEvent.kt */
    @b6l(c = "com.vk.catalog.mvi.block.music.impl.recommended.entity.RecommendedPlaylistEventsHandler$HandleEvent$1$1", f = "RecommendedPlaylistEvent.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes16.dex */
    public static final class a extends SuspendLambda implements wzs<eef0, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ fef0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, fef0 fef0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$context = context;
            this.this$0 = fef0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$context, this.this$0, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(eef0 eef0Var, spj<? super s3q0> spjVar) {
            return ((a) create(eef0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            eef0 eef0Var = (eef0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (eef0Var instanceof eef0.a) {
                Activity h = e3m.h(this.$context);
                if (h == null) {
                    return s3q0.a;
                }
                y050 U = this.this$0.a.U();
                eef0.a aVar = (eef0.a) eef0Var;
                Playlist playlist = aVar.b;
                BlockId blockId = aVar.a;
                U.a(h, new y050.b.a(playlist, blockId.getId(), blockId.getId(), null, null, 24));
            } else if (eef0Var instanceof eef0.b) {
                Activity h2 = e3m.h(this.$context);
                if (h2 == null) {
                    return s3q0.a;
                }
                eef0.b bVar = (eef0.b) eef0Var;
                fl4.p(this.this$0.a, h2, MusicPlaybackLaunchContext.Fb(bVar.a.getId()), bVar.b, null, null, 24);
            } else {
                if (!(eef0Var instanceof eef0.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                Activity h3 = e3m.h(this.$context);
                eef0.c cVar = (eef0.c) eef0Var;
                Iterator<T> it = cVar.b.y.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (epx.f(((MusicTrack) obj2).Fb(), cVar.c)) {
                        break;
                    }
                }
                fef0 fef0Var = this.this$0;
                if (h3 != null && obj2 != null) {
                    fef0Var.a.k(h3, (MusicTrack) obj2, MusicPlaybackLaunchContext.Fb(cVar.a.getId()).Db(cVar.b), cVar.d);
                }
            }
            return s3q0.a;
        }
    }

    public fef0(fl4 fl4Var) {
        this.a = fl4Var;
    }

    public final void a(ksr ksrVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-982506733);
        if ((i & 6) == 0) {
            i2 = (M.J(ksrVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-982506733, i2, -1, "com.vk.catalog.mvi.block.music.impl.recommended.entity.RecommendedPlaylistEventsHandler.HandleEvent (RecommendedPlaylistEvent.kt:40)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b());
            boolean y = M.y(context) | ((i2 & 112) == 32);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new a(context, this, null);
                M.R(x);
            }
            c1q.a(ksrVar, (wzs) x, M, i2 & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new u67(this, ksrVar, i, 4));
        }
    }
}
