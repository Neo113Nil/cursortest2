package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import com.vk.dto.common.data.Subscription;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.ok.android.utils.Logger;
import xsna.ys8;

/* compiled from: DefaultBuyMusicSubscriptionButtonModel.kt */
/* loaded from: classes3.dex */
public final class dcl implements ys8 {
    public final oge0 b;
    public final boolean c;
    public Subscription d;
    public io.reactivex.rxjava3.disposables.c e;

    /* compiled from: DefaultBuyMusicSubscriptionButtonModel.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            bn40.c(th, new Object[0]);
            return s3q0.a;
        }
    }

    public dcl(oge0 oge0Var, boolean z) {
        this.b = oge0Var;
        this.c = z;
    }

    public static int c(boolean z) {
        if (z) {
            return 5;
        }
        r6m.a.getClass();
        return !r6m.j() ? 3 : 4;
    }

    @Override // xsna.ys8
    public final Subscription a() {
        return this.d;
    }

    @Override // xsna.ys8
    @SuppressLint({"CheckResult"})
    public final void b(ys8.b bVar) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        this.b.c(context).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new w00(new he3(20, this, bVar), 18), new gf0(new a(1, bn40.a, bn40.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;[Ljava/lang/Object;)V", 0), 18));
    }

    @Override // xsna.ys8
    public final void release() {
        io.reactivex.rxjava3.disposables.c cVar = this.e;
        if (cVar != null) {
            cVar.dispose();
        }
        this.d = null;
        this.e = null;
    }
}
