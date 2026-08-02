package xsna;

import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import com.vk.ecomm.moderation.api.restrictions.ModerationRestriction;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.z430;

/* compiled from: ModerationWrapperImpl.kt */
/* loaded from: classes18.dex */
public final class v530 implements q530 {
    public final a530 a;
    public g530 b;
    public final a c = new a();
    public final io.reactivex.rxjava3.disposables.c d;
    public final List<d430> e;

    /* compiled from: ModerationWrapperImpl.kt */
    public final class a implements androidx.lifecycle.l {
        public a() {
        }

        @Override // androidx.lifecycle.l
        public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                v530 v530Var = v530.this;
                v530Var.b = null;
                v530Var.d.dispose();
            }
        }
    }

    /* compiled from: ModerationWrapperImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            a530 a530Var = ((v530) this.receiver).a;
            a530Var.b(z430.d.a);
            a530Var.b(z430.c.a);
            return s3q0.a;
        }
    }

    /* compiled from: ModerationWrapperImpl.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            a530 a530Var = ((v530) this.receiver).a;
            a530Var.b(z430.a.a);
            a530Var.b(z430.c.a);
            return s3q0.a;
        }
    }

    /* compiled from: ModerationWrapperImpl.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            a530 a530Var = ((v530) this.receiver).a;
            a530Var.b(z430.d.a);
            a530Var.b(z430.c.a);
            return s3q0.a;
        }
    }

    /* compiled from: ModerationWrapperImpl.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            a530 a530Var = ((v530) this.receiver).a;
            a530Var.b(z430.a.a);
            a530Var.b(z430.c.a);
            return s3q0.a;
        }
    }

    public v530(Context context, f5z f5zVar, k530 k530Var, y330 y330Var, boolean z, a530 a530Var) {
        this.a = a530Var;
        this.e = e43.l(new j530(k530Var, z, context), new b430(k530Var, y330Var, z, context));
        new Handler(context.getMainLooper()).post(new qe9(4, f5zVar, this));
        this.d = a530Var.a().subscribe(new tts(new x2y(this, 10), 11));
    }

    @Override // xsna.q530
    public final ModerationRestriction a(c530 c530Var) {
        Iterator<T> it = this.e.iterator();
        while (it.hasNext()) {
            ModerationRestriction a2 = ((d430) it.next()).a(c530Var);
            if (a2 != ModerationRestriction.NONE) {
                return a2;
            }
        }
        return ModerationRestriction.NONE;
    }

    @Override // xsna.q530
    public final boolean b(c530 c530Var, ModerationRestriction moderationRestriction) {
        List<d430> list = this.e;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((d430) it.next()).b(c530Var, moderationRestriction, new b(0, this, v530.class, "onAdultRestrictionDismissed", "onAdultRestrictionDismissed()V", 0), new c(0, this, v530.class, "onHardBlockRestrictionDismissed", "onHardBlockRestrictionDismissed()V", 0))) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.q530
    public final void c(c530 c530Var, f530 f530Var, izs<? super ModerationRestriction, s3q0> izsVar) {
        Iterator<T> it = this.e.iterator();
        while (it.hasNext() && !((d430) it.next()).d(c530Var, f530Var, izsVar, new d(0, this, v530.class, "onAdultRestrictionDismissed", "onAdultRestrictionDismissed()V", 0), new e(0, this, v530.class, "onHardBlockRestrictionDismissed", "onHardBlockRestrictionDismissed()V", 0))) {
        }
    }

    @Override // xsna.q530
    public final void d(g530 g530Var) {
        this.b = g530Var;
    }
}
