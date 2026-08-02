package xsna;

import android.content.Context;
import com.vk.ecomm.moderation.api.restrictions.ModerationRestriction;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.z430;

/* compiled from: ModerationWrapperManagerImpl.kt */
/* loaded from: classes18.dex */
public final class x530 implements w530 {
    public final a530 a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final io.reactivex.rxjava3.core.w c = io.reactivex.rxjava3.android.schedulers.a.b();
    public final List<d430> d;

    /* compiled from: ModerationWrapperManagerImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((x530) this.receiver).a.b(z430.c.a);
            return s3q0.a;
        }
    }

    public x530(Context context, k530 k530Var, y330 y330Var, boolean z, a530 a530Var) {
        this.a = a530Var;
        this.d = e43.l(new j530(k530Var, z, context), new b430(k530Var, y330Var, z, context));
    }

    @Override // xsna.w530
    public final ModerationRestriction a(c530 c530Var) {
        Iterator<T> it = this.d.iterator();
        while (it.hasNext()) {
            ModerationRestriction a2 = ((d430) it.next()).a(c530Var);
            if (a2 != ModerationRestriction.NONE) {
                return a2;
            }
        }
        return ModerationRestriction.NONE;
    }

    @Override // xsna.w530
    public final boolean b(c530 c530Var, ModerationRestriction moderationRestriction) {
        List<d430> list = this.d;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((d430) it.next()).c(c530Var, moderationRestriction, new a(0, this, x530.class, "onRestrictionDismissed", "onRestrictionDismissed()V", 0))) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.w530
    public final void c(Object obj, g530 g530Var) {
        this.b.put(obj, this.a.a().a0(this.c).subscribe(new fs00(new h2s(g530Var, 17), 3)));
    }

    @Override // xsna.w530
    public final void d(c530 c530Var, wr30 wr30Var, leq leqVar) {
        Iterator<T> it = this.d.iterator();
        while (it.hasNext()) {
            int i = 0;
            int i2 = 1;
            int i3 = 0;
            if (((d430) it.next()).d(c530Var, wr30Var, leqVar, new e07(i3, this, x530.class, "onRestrictionDismissed", "onRestrictionDismissed()V", i, i2), new nyy(i3, this, x530.class, "onRestrictionDismissed", "onRestrictionDismissed()V", i, i2))) {
                return;
            }
        }
    }

    @Override // xsna.w530
    public final void e(Object obj) {
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) this.b.remove(obj);
        if (cVar != null) {
            cVar.dispose();
        }
    }
}
