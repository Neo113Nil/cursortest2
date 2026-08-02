package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.dto.music.Playlist;
import com.vk.music.common.MusicPlaybackLaunchContext;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.et3;
import xsna.y050;

/* compiled from: ArtistSliderEvent.kt */
/* loaded from: classes.dex */
public final class gt3 {
    public final fl4 a;

    /* compiled from: ArtistSliderEvent.kt */
    @b6l(c = "com.vk.catalog.mvi.block.music.impl.artists.slider.ArtistSliderEventHandler$HandleEvent$1$1", f = "ArtistSliderEvent.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes16.dex */
    public static final class a extends SuspendLambda implements wzs<et3, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ gt3 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, gt3 gt3Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$context = context;
            this.this$0 = gt3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$context, this.this$0, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(et3 et3Var, spj<? super s3q0> spjVar) {
            return ((a) create(et3Var, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            et3 et3Var = (et3) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (et3Var instanceof et3.a) {
                Activity h = e3m.h(this.$context);
                if (h == null) {
                    return s3q0.a;
                }
                y050 U = this.this$0.a.U();
                et3.a aVar = (et3.a) et3Var;
                Playlist playlist = aVar.b;
                BlockId blockId = aVar.a;
                U.a(h, new y050.b.C4065b(playlist.c, playlist.b, null, blockId.getId(), blockId.getId(), null, 100));
            } else {
                if (!(et3Var instanceof et3.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                Activity h2 = e3m.h(this.$context);
                if (h2 == null) {
                    return s3q0.a;
                }
                et3.b bVar = (et3.b) et3Var;
                fl4.p(this.this$0.a, h2, MusicPlaybackLaunchContext.Fb(bVar.a.getId()), bVar.b, null, null, 24);
            }
            return s3q0.a;
        }
    }

    public gt3(fl4 fl4Var) {
        this.a = fl4Var;
    }

    public final void a(ksr ksrVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(171528757);
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
                androidx.compose.runtime.b.f(171528757, i2, -1, "com.vk.catalog.mvi.block.music.impl.artists.slider.ArtistSliderEventHandler.HandleEvent (ArtistSliderEvent.kt:32)");
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
            s.l(new ft3(this, ksrVar, i, 0));
        }
    }
}
