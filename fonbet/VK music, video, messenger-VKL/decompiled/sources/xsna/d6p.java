package xsna;

import android.animation.ValueAnimator;
import android.view.ViewStub;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.TransitionData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.hg1;

/* compiled from: EduMaxMembersComponent.kt */
/* loaded from: classes2.dex */
public final class d6p {
    public final a1w a;
    public final f6p b;
    public boolean c;
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: EduMaxMembersComponent.kt */
    public interface a {

        /* compiled from: EduMaxMembersComponent.kt */
        /* renamed from: xsna.d6p$a$a, reason: collision with other inner class name */
        public static final class C2709a implements a {
            public static final C2709a a = new C2709a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2709a);
            }

            public final int hashCode() {
                return -1993833519;
            }

            public final String toString() {
                return "HideBadge";
            }
        }

        /* compiled from: EduMaxMembersComponent.kt */
        public static final class b implements a {
            public final List<qtd0> a;
            public final int b;
            public final String c;

            /* JADX WARN: Multi-variable type inference failed */
            public b(List<? extends qtd0> list, int i, String str) {
                this.a = list;
                this.b = i;
                this.c = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && this.b == bVar.b && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                int a = shy.a(this.b, this.a.hashCode() * 31, 31);
                String str = this.c;
                return a + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ShowBadge(profilesMigrated=");
                sb.append(this.a);
                sb.append(", usersTotalCount=");
                sb.append(this.b);
                sb.append(", migrationUrl=");
                return ho8.a(sb, this.c, ')');
            }
        }
    }

    public d6p(ViewStub viewStub, a1w a1wVar, h7 h7Var) {
        this.a = a1wVar;
        this.b = new f6p(viewStub, viewStub.getContext(), h7Var);
    }

    public final void a() {
        ValueAnimator valueAnimator = this.b.m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d.e();
    }

    public final void b(DialogExt dialogExt) {
        Dialog Cb = dialogExt.Cb();
        if (Cb == null || this.c) {
            return;
        }
        this.c = true;
        io.reactivex.rxjava3.core.q X = io.reactivex.rxjava3.core.q.X(new io.reactivex.rxjava3.internal.jdk8.a(new io.reactivex.rxjava3.internal.operators.observable.i0(this.a.l.a(), new hg1.k1()).U(new hg1.j1()), new vx6(new x2e(Cb, 13), 12)).L(new ox0(new j9k(this, 8), 16), false), c(Cb).w());
        X.getClass();
        io.reactivex.rxjava3.internal.operators.observable.y yVar = new io.reactivex.rxjava3.internal.operators.observable.y(X, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = yVar.r0(asu0Var.c()).a0(asu0Var.d());
        t00 t00Var = new t00(new lbe(this, 18), 27);
        int i = kwg0.a;
        this.d.b(a0.subscribe(t00Var, new iwg0()));
    }

    public final io.reactivex.rxjava3.core.x<a> c(Dialog dialog) {
        ArrayList arrayList;
        TransitionData jc = dialog.jc();
        List<Long> list = jc != null ? jc.b : null;
        if (list != null) {
            List<Long> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                Serializer.c<Peer> cVar = Peer.CREATOR;
                arrayList.add(Peer.a.b(longValue));
            }
        } else {
            arrayList = null;
        }
        ChatSettings Hb = dialog.Hb();
        String str = jc != null ? jc.c : null;
        if (arrayList == null || arrayList.isEmpty() || Hb == null || Hb.f > 50) {
            return io.reactivex.rxjava3.core.x.k(a.C2709a.a);
        }
        Serializer.c<Peer> cVar2 = Peer.CREATOR;
        Peer b = Peer.a.b(dialog.Sb().longValue());
        Source source = Source.ACTUAL;
        cem cemVar = new cem(b, source);
        a1w a1wVar = this.a;
        return io.reactivex.rxjava3.core.x.B(a1wVar.C(this, cemVar).l(new np1(new y40(28), 15)), a1wVar.C(this, new d1e0((Collection<? extends Peer>) arrayList, source, true)).l(new com.vk.movika.sdk.base.hooks.k(new yve(arrayList, 20), 24)), new rx0(new c6p(str), 20));
    }
}
