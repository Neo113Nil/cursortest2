package xsna;

import com.vk.newsfeed.posting.donut_teaser.domain.interactor.TextValidationState;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.i3o;
import xsna.q3o;
import xsna.t3o;

/* compiled from: DonutTeaserFeature.kt */
/* loaded from: classes4.dex */
public final class n3o extends wk50<y3o, u3o, i3o, q3o> {
    public final f4z f;
    public final pvn g;
    public io.reactivex.rxjava3.disposables.c h;

    /* compiled from: DonutTeaserFeature.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextValidationState.values().length];
            try {
                iArr[TextValidationState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextValidationState.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public n3o() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3o(String str, String str2) {
        super(i3o.c.b, new r3o(new u3o(false, false, null, str, null, 0, str2, str)));
        f4z f4zVar = new f4z();
        this.f = f4zVar;
        this.g = new pvn(new fto0(), false);
    }

    @Override // xsna.wk50
    public final void N(u3o u3oVar, i3o i3oVar) {
        u3o u3oVar2 = u3oVar;
        i3o i3oVar2 = i3oVar;
        String str = u3oVar2.h;
        String str2 = u3oVar2.e;
        if (i3oVar2.equals(i3o.c.b)) {
            T(q3o.a.b);
            return;
        }
        boolean equals = i3oVar2.equals(i3o.a.b);
        f4z f4zVar = this.f;
        if (!equals) {
            if (i3oVar2.equals(i3o.b.b)) {
                f4zVar.b(t3o.a.a);
                return;
            }
            if (i3oVar2 instanceof i3o.f) {
                i3o.f fVar = (i3o.f) i3oVar2;
                String str3 = fVar.b;
                String str4 = epx.f(str3, str) ? null : str3;
                if (epx.f(str4, str2)) {
                    return;
                }
                T(new q3o.f(str4, fVar.c));
                return;
            }
            if (i3oVar2.equals(i3o.e.b)) {
                T(q3o.b.b);
                return;
            } else {
                if (!i3oVar2.equals(i3o.d.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                io.reactivex.rxjava3.disposables.c cVar = this.h;
                if (cVar != null) {
                    cVar.dispose();
                    return;
                }
                return;
            }
        }
        String obj = str2 != null ? drm0.p0(str2).toString() : null;
        if (obj != null && obj.length() < 10) {
            T(new q3o.d(tq.h(tlo0.Companion, R.string.post_teaser_min_symblos_error_text)));
            return;
        }
        if (epx.f(obj, str) || obj == null) {
            f4zVar.b(new t3o.b(null));
            return;
        }
        if (obj.equals(u3oVar2.i)) {
            f4zVar.b(new t3o.b(str2));
            return;
        }
        if (u3oVar2.d != null || u3oVar2.b) {
            return;
        }
        T(new q3o.c(true));
        io.reactivex.rxjava3.disposables.c cVar2 = this.h;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        pvn pvnVar = this.g;
        pvnVar.getClass();
        this.h = new io.reactivex.rxjava3.internal.operators.observable.q(new com.vk.newsfeed.posting.donut_teaser.domain.interactor.a(pvnVar, obj)).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new m20(new aq1(9, this, obj), 20), new n20(new o1e(this, 19), 23));
    }
}
