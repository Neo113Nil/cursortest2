package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.j18;
import defpackage.l8x;
import defpackage.pey;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class a0 implements q {
    public final /* synthetic */ Lifecycle.Event a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ tse c;
    public final /* synthetic */ Lifecycle.Event w;
    public final /* synthetic */ j18 x;
    public final /* synthetic */ kotlinx.coroutines.sync.a y;
    public final /* synthetic */ wls z;

    public a0(Lifecycle.Event event, Ref$ObjectRef ref$ObjectRef, tse tseVar, Lifecycle.Event event2, j18 j18Var, kotlinx.coroutines.sync.a aVar, wls wlsVar) {
        this.a = event;
        this.b = ref$ObjectRef;
        this.c = tseVar;
        this.w = event2;
        this.x = j18Var;
        this.y = aVar;
        this.z = wlsVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, pzt0] */
    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        Lifecycle.Event event2 = this.a;
        Ref$ObjectRef ref$ObjectRef = this.b;
        if (event == event2) {
            ref$ObjectRef.element = tje.N(this.c, null, null, new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1(this.y, this.z, null), 3);
            return;
        }
        if (event == this.w) {
            l8x l8xVar = (l8x) ref$ObjectRef.element;
            if (l8xVar != null) {
                l8xVar.a(null);
            }
            ref$ObjectRef.element = null;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.x.resumeWith(zy11.a);
        }
    }
}
