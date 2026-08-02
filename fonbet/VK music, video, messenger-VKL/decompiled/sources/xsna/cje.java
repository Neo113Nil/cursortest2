package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import xsna.gje;
import xsna.mje;

/* compiled from: ClipsLikesAnimationHelper.kt */
/* loaded from: classes17.dex */
public final class cje {
    public final LinkedHashMap a = new LinkedHashMap();

    /* compiled from: ClipsLikesAnimationHelper.kt */
    public static final class a {
        public static final a e = new a(null, null, null, null);
        public final eje a;
        public final gje b;
        public final kje c;
        public final mje d;

        public a(eje ejeVar, gje gjeVar, kje kjeVar, mje mjeVar) {
            this.a = ejeVar;
            this.b = gjeVar;
            this.c = kjeVar;
            this.d = mjeVar;
        }

        public static a a(a aVar, eje ejeVar, gje gjeVar, kje kjeVar, mje mjeVar, int i) {
            if ((i & 1) != 0) {
                ejeVar = aVar.a;
            }
            if ((i & 2) != 0) {
                gjeVar = aVar.b;
            }
            if ((i & 4) != 0) {
                kjeVar = aVar.c;
            }
            if ((i & 8) != 0) {
                mjeVar = aVar.d;
            }
            return new a(ejeVar, gjeVar, kjeVar, mjeVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            eje ejeVar = this.a;
            int hashCode = (ejeVar == null ? 0 : ejeVar.hashCode()) * 31;
            gje gjeVar = this.b;
            int hashCode2 = (hashCode + (gjeVar == null ? 0 : gjeVar.hashCode())) * 31;
            kje kjeVar = this.c;
            int hashCode3 = (hashCode2 + (kjeVar == null ? 0 : kjeVar.hashCode())) * 31;
            mje mjeVar = this.d;
            return hashCode3 + (mjeVar != null ? mjeVar.hashCode() : 0);
        }

        public final String toString() {
            return "LikesAnimation(appear=" + this.a + ", disappear=" + this.b + ", movement=" + this.c + ", transition=" + this.d + ')';
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(ViewGroup viewGroup) {
        a aVar = (a) this.a.remove(Integer.valueOf(viewGroup.getId()));
        if (aVar == null) {
            return;
        }
        eje ejeVar = aVar.a;
        if (ejeVar != null) {
            ValueAnimator valueAnimator = (ValueAnimator) ejeVar.e.getValue();
            if (valueAnimator.isRunning()) {
                ejeVar.c = null;
                ejeVar.d = false;
                valueAnimator.setStartDelay(0L);
                valueAnimator.setDuration(0L);
                valueAnimator.cancel();
            }
        }
        gje gjeVar = aVar.b;
        if (gjeVar != null) {
            ValueAnimator valueAnimator2 = (ValueAnimator) gjeVar.c.getValue();
            if (valueAnimator2.isRunning()) {
                valueAnimator2.setStartDelay(0L);
                valueAnimator2.setDuration(0L);
                valueAnimator2.cancel();
            }
        }
        kje kjeVar = aVar.c;
        if (kjeVar != null) {
            ValueAnimator valueAnimator3 = (ValueAnimator) kjeVar.f.getValue();
            if (valueAnimator3.isRunning()) {
                kjeVar.b = null;
                valueAnimator3.cancel();
            }
        }
        mje mjeVar = aVar.d;
        if (mjeVar != null) {
            ValueAnimator valueAnimator4 = (ValueAnimator) mjeVar.d.getValue();
            if (valueAnimator4.isRunning()) {
                mjeVar.c = null;
                valueAnimator4.setDuration(0L);
                valueAnimator4.cancel();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(View view, gje.a aVar, gzs<s3q0> gzsVar) {
        gje gjeVar;
        Integer valueOf = Integer.valueOf(view.getId());
        LinkedHashMap linkedHashMap = this.a;
        a aVar2 = (a) linkedHashMap.get(valueOf);
        if (aVar2 != null && (gjeVar = aVar2.b) != null && ((ValueAnimator) gjeVar.c.getValue()).isRunning()) {
            ValueAnimator valueAnimator = (ValueAnimator) gjeVar.c.getValue();
            if (valueAnimator.isRunning()) {
                valueAnimator.setStartDelay(0L);
                valueAnimator.setDuration(0L);
                valueAnimator.cancel();
            }
        }
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        gje gjeVar2 = new gje(new com.vk.im.ui.components.viewcontrollers.dialog_header.info.a(view, 24), gzsVar);
        ValueAnimator valueAnimator2 = (ValueAnimator) gjeVar2.c.getValue();
        if (!valueAnimator2.isRunning()) {
            valueAnimator2.setStartDelay(0L);
            valueAnimator2.setDuration(150L);
            valueAnimator2.start();
        }
        if (aVar2 == null) {
            aVar2 = a.e;
        }
        linkedHashMap.put(Integer.valueOf(view.getId()), a.a(aVar2, null, gjeVar2, null, null, 13));
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void c(View view, mje.a aVar, gzs<s3q0> gzsVar) {
        mje mjeVar;
        Integer valueOf = Integer.valueOf(view.getId());
        LinkedHashMap linkedHashMap = this.a;
        a aVar2 = (a) linkedHashMap.get(valueOf);
        if (aVar2 != null && (mjeVar = aVar2.d) != null && ((ValueAnimator) mjeVar.d.getValue()).isRunning()) {
            ValueAnimator valueAnimator = (ValueAnimator) mjeVar.d.getValue();
            if (valueAnimator.isRunning()) {
                mjeVar.c = null;
                valueAnimator.setDuration(0L);
                valueAnimator.cancel();
            }
        }
        mje mjeVar2 = new mje(gzsVar, new com.vk.movika.tools.controls.seekbar.i(view, 5));
        ValueAnimator valueAnimator2 = (ValueAnimator) mjeVar2.d.getValue();
        if (!valueAnimator2.isRunning()) {
            mjeVar2.c = aVar;
            valueAnimator2.setDuration(100L);
            valueAnimator2.start();
        }
        if (aVar2 == null) {
            aVar2 = a.e;
        }
        linkedHashMap.put(Integer.valueOf(view.getId()), a.a(aVar2, null, null, null, mjeVar2, 7));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void d(View view) {
        kje kjeVar;
        a aVar = (a) this.a.get(Integer.valueOf(view.getId()));
        if (aVar == null || (kjeVar = aVar.c) == null || !((ValueAnimator) kjeVar.f.getValue()).isRunning()) {
            return;
        }
        ValueAnimator valueAnimator = (ValueAnimator) kjeVar.f.getValue();
        if (valueAnimator.isRunning()) {
            kjeVar.b = null;
            valueAnimator.cancel();
        }
    }
}
