package xsna;

import android.graphics.Canvas;
import android.graphics.Rect;
import com.vk.rlottie.RLottieDrawable;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.lfe;

/* compiled from: ClipHeartSlotLottieDecoratorImpl.kt */
/* loaded from: classes17.dex */
public final class uzc implements lfe.b {
    public static final float i = iah0.b(22.0f);
    public final d1d a;
    public final e7 b;
    public final tzc c;
    public final Object d;
    public final Object e;
    public RLottieDrawable f;
    public boolean g;
    public boolean h;

    /* compiled from: ClipHeartSlotLottieDecoratorImpl.kt */
    public interface a extends lfe.b.a {

        /* compiled from: ClipHeartSlotLottieDecoratorImpl.kt */
        /* renamed from: xsna.uzc$a$a, reason: collision with other inner class name */
        public static final class C3859a implements a {
            public static final C3859a a = new C3859a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3859a);
            }

            public final int hashCode() {
                return -1116048826;
            }

            public final String toString() {
                return "StartAnimation";
            }
        }
    }

    /* compiled from: ClipHeartSlotLottieDecoratorImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((com.vk.metrics.eventtracking.b) this.receiver).a(th);
            return s3q0.a;
        }
    }

    public uzc(d1d d1dVar, e7 e7Var, tzc tzcVar) {
        this.a = d1dVar;
        this.b = e7Var;
        this.c = tzcVar;
        h9 h9Var = new h9(this, 19);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, h9Var);
        this.e = msy.a(lazyThreadSafetyMode, vzc.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r2 == null) goto L18;
     */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.lfe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        String str;
        io.reactivex.rxjava3.core.x<String> xVar;
        io.reactivex.rxjava3.core.x l;
        if (this.h || (str = (String) this.b.c) == null) {
            return;
        }
        if (str.length() == 0) {
            l = io.reactivex.rxjava3.internal.operators.single.a0.b;
        } else {
            tzc tzcVar = this.c;
            Pair<String, ? extends io.reactivex.rxjava3.core.x<String>> pair = tzcVar.a;
            if (pair != null) {
                String d = pair.d();
                xVar = pair.g();
                if (!epx.f(d, str)) {
                    xVar = null;
                }
            }
            io.reactivex.rxjava3.internal.operators.single.a aVar = new io.reactivex.rxjava3.internal.operators.single.a(c7r0.h(str).K());
            tzcVar.a = new Pair<>(str, aVar);
            xVar = aVar;
            l = xVar.l(new t34(new b40(6), 7));
        }
        ((io.reactivex.rxjava3.disposables.b) this.e.getValue()).b(l.subscribe(new defpackage.x(new ix2(this, 20), 11), new xz(new b(1, com.vk.metrics.eventtracking.b.a, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0), 15)));
        this.h = true;
    }

    @Override // xsna.lfe.b
    public final void c(lfe.b.a aVar) {
        if (aVar instanceof a) {
            if (!(((a) aVar) instanceof a.C3859a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.h) {
                RLottieDrawable rLottieDrawable = this.f;
                if (rLottieDrawable != null) {
                    rLottieDrawable.j();
                } else {
                    this.g = true;
                }
            }
        }
    }

    @Override // xsna.lfe.b
    public final void d(Canvas canvas, Rect rect) {
        RLottieDrawable rLottieDrawable = this.f;
        if (rLottieDrawable != null) {
            int save = canvas.save();
            float f = i;
            canvas.translate(f, f);
            try {
                rLottieDrawable.setBounds(rect);
                rLottieDrawable.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }
}
