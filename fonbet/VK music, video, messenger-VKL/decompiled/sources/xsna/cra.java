package xsna;

import android.content.Context;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import com.vk.log.L;
import com.vk.push.core.utils.CoroutineExtensionsKt;
import com.vk.richcontent.api.MimeType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.fx40;
import xsna.yye0;

/* compiled from: ChainMusicPlayerListenerDelegate.kt */
/* loaded from: classes3.dex */
public final class cra implements p7f0, yye0.a, ub80 {
    public final Object b;
    public Object c;

    public /* synthetic */ cra(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    public void a(View view) {
        HashSet hashSet = (HashSet) this.b;
        HashSet hashSet2 = (HashSet) this.c;
        if (hashSet2.isEmpty()) {
            throw new IllegalArgumentException("You must add at least 1 adapter via addContentAdapter method");
        }
        d7v0 d7v0Var = new d7v0(hashSet, hashSet2);
        L.e("Register rich content receiver for " + view + " with supported types: " + j5g.g0(hashSet, null, null, null, 0, null, 63));
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            g5g.y(((MimeType) it.next()).h(), arrayList);
        }
        iut0.s(view, (String[]) arrayList.toArray(new String[0]), d7v0Var);
    }

    @Override // xsna.yye0.a
    public void b() {
        CoroutineExtensionsKt.safeResume((lq9) this.b, ((o1i0) this.c).c.getmailv2("com.vk.push.authsdk"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ub80
    public void c(ClickableSpan clickableSpan, View view) {
        sf20 sf20Var = (sf20) this.c;
        b3b b3bVar = (b3b) this.b;
        io.reactivex.rxjava3.disposables.b bVar = b3bVar.f;
        e1b e1bVar = b3bVar.d;
        f1b f1bVar = b3bVar.c;
        l3b l3bVar = b3bVar.e;
        pf20 pf20Var = b3bVar.b;
        Context context = b3bVar.a;
        if (clickableSpan instanceof ovu0) {
            String e = ((ovu0) clickableSpan).e();
            Integer b = sf20Var.b(view);
            if (b != null) {
                l3bVar.a(b.intValue(), e, true);
            }
            if (f1bVar.b(context, new peq0(Uri.parse(e)), e1bVar, bVar)) {
                return;
            }
            pf20Var.g(context, e);
            return;
        }
        if (clickableSpan instanceof j420) {
            pf20Var.c(context, ((j420) clickableSpan).e);
            return;
        }
        if (clickableSpan instanceof ifq0) {
            String a = ((ifq0) clickableSpan).a();
            Integer b2 = sf20Var.b(view);
            if (b2 != null) {
                l3bVar.a(b2.intValue(), a, false);
            }
            if (f1bVar.b(context, new peq0(Uri.parse(a)), e1bVar, bVar)) {
                return;
            }
            pf20Var.b(context, a);
            return;
        }
        if (clickableSpan instanceof jcp) {
            pf20Var.a(context, ((jcp) clickableSpan).e);
            return;
        }
        if (clickableSpan instanceof jvu) {
            String str = ((jvu) clickableSpan).e;
            long j = b3bVar.g;
            if (j != 0) {
                pf20Var.f(context, j, str);
                return;
            } else {
                pf20Var.d(context, str);
                return;
            }
        }
        if (clickableSpan instanceof t3a0) {
            b3bVar.a(((t3a0) clickableSpan).e);
        } else if (clickableSpan instanceof y7o0) {
            b3bVar.a(((y7o0) clickableSpan).e);
        }
    }

    @Override // xsna.yye0.a
    public void d(Throwable th) {
        CoroutineExtensionsKt.safeResumeWithException((lq9) this.b, new IllegalStateException("Library loading was failed", th));
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.i7f0
    public Object getValue(Object obj, qcy qcyVar) {
        if (((px40) this.c) == null) {
            Iterator it = ((List) this.b.getValue()).iterator();
            px40 px40Var = null;
            while (it.hasNext()) {
                px40Var = ((qx40) it.next()).a(px40Var);
            }
            this.c = px40Var;
        }
        return (px40) this.c;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.p7f0
    public void setValue(Object obj, qcy qcyVar, Object obj2) {
        px40 px40Var = (px40) obj2;
        Iterator it = ((List) this.b.getValue()).iterator();
        while (it.hasNext()) {
            px40Var = ((qx40) it.next()).a(px40Var);
        }
        this.c = px40Var;
    }

    public cra() {
        this.b = new HashSet();
        this.c = new HashSet();
    }

    public cra(final fx40.a aVar, final hx40 hx40Var, final oe5 oe5Var, final aw40 aw40Var) {
        this.b = msy.a(LazyThreadSafetyMode.NONE, new gzs() { // from class: xsna.bra
            @Override // xsna.gzs
            public final Object invoke() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(oe5Var.invoke());
                fiq fiqVar = fx40.a.this.d;
                if (fiqVar != null) {
                    hjk c = fiqVar.c();
                    hx40 hx40Var2 = hx40Var;
                    if (c == null) {
                        arrayList.add(new giq(fiqVar, hx40Var2));
                        return arrayList;
                    }
                    arrayList.add(new gjk(fiqVar, hx40Var2, aw40Var));
                }
                return arrayList;
            }
        });
    }
}
