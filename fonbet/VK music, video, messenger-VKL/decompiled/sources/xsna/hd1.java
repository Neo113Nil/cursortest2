package xsna;

import androidx.compose.runtime.a;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.entity.AlbumChooseState;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.AlbumChooseFragment;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AlbumChooseComposeComponent.kt */
/* loaded from: classes7.dex */
public final class hd1 extends dk50<bn50<AlbumChooseState, AlbumChooseState, cd1, id1>> {
    public final ye1 b;
    public final AlbumChooseFragment.b c;

    /* compiled from: AlbumChooseComposeComponent.kt */
    public static final /* synthetic */ class a implements xy, g0t {
        public final /* synthetic */ bn50<AlbumChooseState, AlbumChooseState, cd1, id1> b;

        public a(bn50<AlbumChooseState, AlbumChooseState, cd1, id1> bn50Var) {
            this.b = bn50Var;
        }

        @Override // xsna.xy
        public final void a(lj50 lj50Var) {
            this.b.b((cd1) lj50Var);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof xy) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.b, bn50.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: AlbumChooseComposeComponent.kt */
    @b6l(c = "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.AlbumChooseComposeComponent$ThemedContent$2$1", f = "AlbumChooseComposeComponent.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements yzs<z37<cd1>, id1, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public b(spj<? super b> spjVar) {
            super(3, spjVar);
        }

        @Override // xsna.yzs
        public final Object invoke(z37<cd1> z37Var, id1 id1Var, spj<? super s3q0> spjVar) {
            b bVar = hd1.this.new b(spjVar);
            bVar.L$0 = id1Var;
            return bVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            id1 id1Var = (id1) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            hd1.this.c.invoke(id1Var);
            return s3q0.a;
        }
    }

    public hd1(ye1 ye1Var, AlbumChooseFragment.b bVar) {
        this.b = ye1Var;
        this.c = bVar;
    }

    @Override // xsna.zqi
    public final void a(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        androidx.compose.runtime.a M = aVar.M(-1585917779);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1585917779, i, -1, "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.AlbumChooseComposeComponent.Theme (AlbumChooseComposeComponent.kt:44)");
            }
            rrv0.d(null, null, null, null, kai.c(1303666898, new ed1(0, jaiVar), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fd1(this, jaiVar, i, 0);
        }
    }

    @Override // xsna.ypo0
    public final /* bridge */ /* synthetic */ void b(mm50 mm50Var, androidx.compose.runtime.a aVar) {
        d((bn50) mm50Var, aVar, 0);
    }

    public final void d(bn50<AlbumChooseState, AlbumChooseState, cd1, id1> bn50Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1996226293);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1996226293, i, -1, "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.AlbumChooseComposeComponent.ThemedContent (AlbumChooseComposeComponent.kt:25)");
        }
        boolean y = M.y(bn50Var) | M.y(this);
        Object x = M.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (y || x == c0012a) {
            x = new com.vk.libvideo.b(2, bn50Var, this);
            M.R(x);
        }
        izs izsVar = (izs) x;
        boolean y2 = M.y(this);
        Object x2 = M.x();
        if (y2 || x2 == c0012a) {
            x2 = new b(null);
            M.R(x2);
        }
        r37.a(izsVar, (yzs) x2, mai.a, M, 384, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new gd1(this, bn50Var, i, 0);
        }
    }
}
