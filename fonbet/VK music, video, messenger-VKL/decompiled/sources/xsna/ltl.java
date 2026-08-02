package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import com.vk.dto.common.data.Subscription;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.ok.android.utils.Logger;
import xsna.ys8;

/* compiled from: DelegateBuyMusicSubscriptionButtonModel.kt */
/* loaded from: classes3.dex */
public final class ltl implements ys8 {
    public final oge0 b;
    public Subscription c;

    /* compiled from: DelegateBuyMusicSubscriptionButtonModel.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            bn40.c(th, new Object[0]);
            return s3q0.a;
        }
    }

    public ltl(oge0 oge0Var) {
        this.b = oge0Var;
    }

    @Override // xsna.ys8
    public final Subscription a() {
        return this.c;
    }

    @Override // xsna.ys8
    @SuppressLint({"CheckResult"})
    public final void b(ys8.b bVar) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        this.b.c(context).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ew(new n9(7, this, bVar), 16), new pm1(new a(1, bn40.a, bn40.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;[Ljava/lang/Object;)V", 0), 13));
    }

    @Override // xsna.ys8
    public final void release() {
    }
}
