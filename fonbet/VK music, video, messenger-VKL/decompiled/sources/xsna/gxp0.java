package xsna;

import androidx.lifecycle.Lifecycle;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: UIVisibilityBehavior.kt */
/* loaded from: classes17.dex */
public final class gxp0 {
    public static final /* synthetic */ qcy<Object>[] i = {new MutablePropertyReference1Impl(gxp0.class, "isMultiWindowModeEnabled", "isMultiWindowModeEnabled()Z", 0), p5j.a(0, gxp0.class, "isCinemaModeEnabled", "isCinemaModeEnabled()Z", fpf0.a), new MutablePropertyReference1Impl(gxp0.class, "isFastForwardModeEnabled", "isFastForwardModeEnabled()Z", 0), new MutablePropertyReference1Impl(gxp0.class, "isFeedItemBlockFocused", "isFeedItemBlockFocused()Z", 0), new MutablePropertyReference1Impl(gxp0.class, "isInlineNpsOverlayFocused", "isInlineNpsOverlayFocused()Z", 0), new MutablePropertyReference1Impl(gxp0.class, "isAdsEndOverlayFocused", "isAdsEndOverlayFocused()Z", 0), new MutablePropertyReference1Impl(gxp0.class, "isAdsItemFocused", "isAdsItemFocused()Z", 0)};
    public final b a = new b();
    public final b b = new b();
    public final b c = new b();
    public final b d = new b();
    public final b e = new b();
    public final b f = new b();
    public final b g = new b();
    public final LinkedHashSet h = new LinkedHashSet();

    /* compiled from: UIVisibilityBehavior.kt */
    public interface a {
        void X2(ixp0 ixp0Var);
    }

    /* compiled from: UIVisibilityBehavior.kt */
    public final class b extends wq70<Boolean> {
        public b() {
            super(Boolean.FALSE);
        }

        @Override // xsna.wq70
        public final void afterChange(qcy qcyVar, Boolean bool, Boolean bool2) {
            if (bool.booleanValue() != bool2.booleanValue()) {
                gxp0 gxp0Var = gxp0.this;
                Iterator it = gxp0Var.h.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).X2(gxp0Var.c());
                }
            }
        }
    }

    public final void a(hyc hycVar, Lifecycle lifecycle) {
        lifecycle.addObserver(new hxp0(this, hycVar));
    }

    public final void b(a aVar) {
        this.h.add(aVar);
        aVar.X2(c());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a2, code lost:
    
        if (r12.g.getValue(r12, r1[6]).booleanValue() != false) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0074  */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ixp0 c() {
        ?? r8;
        qcy<?>[] qcyVarArr = i;
        boolean z = false;
        boolean booleanValue = this.a.getValue(this, qcyVarArr[0]).booleanValue();
        boolean z2 = true;
        qcy<?> qcyVar = qcyVarArr[1];
        b bVar = this.b;
        boolean booleanValue2 = bVar.getValue(this, qcyVar).booleanValue();
        boolean booleanValue3 = this.d.getValue(this, qcyVarArr[3]).booleanValue();
        boolean booleanValue4 = bVar.getValue(this, qcyVarArr[1]).booleanValue();
        b bVar2 = this.c;
        if (!booleanValue4) {
            if (!this.e.getValue(this, qcyVarArr[4]).booleanValue() && !bVar2.getValue(this, qcyVarArr[2]).booleanValue()) {
                r8 = 1;
                z2 = false;
                if (!bVar.getValue(this, qcyVarArr[r8]).booleanValue()) {
                    if (!this.f.getValue(this, qcyVarArr[5]).booleanValue() && !bVar2.getValue(this, qcyVarArr[2]).booleanValue()) {
                    }
                }
                z = r8;
                return new ixp0(booleanValue, booleanValue2, booleanValue3, z2, z, bVar2.getValue(this, qcyVarArr[2]).booleanValue());
            }
        }
        r8 = 1;
        if (!bVar.getValue(this, qcyVarArr[r8]).booleanValue()) {
        }
        z = r8;
        return new ixp0(booleanValue, booleanValue2, booleanValue3, z2, z, bVar2.getValue(this, qcyVarArr[2]).booleanValue());
    }

    public final void d(a aVar) {
        this.h.remove(aVar);
    }

    public final void e(boolean z) {
        this.g.setValue(this, i[6], Boolean.valueOf(z));
    }

    public final void f(boolean z) {
        this.b.setValue(this, i[1], Boolean.valueOf(z));
    }

    public final void g(boolean z) {
        this.a.setValue(this, i[0], Boolean.valueOf(z));
    }
}
