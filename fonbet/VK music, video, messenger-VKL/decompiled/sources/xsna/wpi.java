package xsna;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.dh6;
import xsna.dw20;

/* compiled from: ComposeModalBottomSheetBuilder.kt */
/* loaded from: classes17.dex */
public abstract class wpi extends dw20.b {
    public final Object e;
    public final Object f;

    /* compiled from: ComposeModalBottomSheetBuilder.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements gzs<ComposeView> {
        @Override // xsna.gzs
        public final ComposeView invoke() {
            return mpi.a((Context) this.receiver);
        }
    }

    /* compiled from: ComposeModalBottomSheetBuilder.kt */
    public static final /* synthetic */ class b extends AdaptedFunctionReference implements gzs<ComposeView> {
        @Override // xsna.gzs
        public final ComposeView invoke() {
            return mpi.a((Context) this.receiver);
        }
    }

    public wpi(Context context, dh6.a aVar) {
        super(context, aVar);
        K();
        this.d.p0 = new bkh(5);
        b bVar = new b(0, context, mpi.class, "createComposeView", "createComposeView(Landroid/content/Context;Landroid/view/ViewGroup$LayoutParams;)Landroidx/compose/ui/platform/ComposeView;", 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, bVar);
        this.f = msy.a(lazyThreadSafetyMode, new a(0, context, mpi.class, "createComposeView", "createComposeView(Landroid/content/Context;Landroid/view/ViewGroup$LayoutParams;)Landroidx/compose/ui/platform/ComposeView;", 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ComposeView S0() {
        return (ComposeView) this.e.getValue();
    }

    public final void T0() {
        vq.b(-1, -2, S0());
    }
}
