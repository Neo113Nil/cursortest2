package androidx.compose.ui.platform;

import androidx.lifecycle.Lifecycle;
import defpackage.e851;
import defpackage.gux;
import defpackage.i18;
import defpackage.ike;
import defpackage.j18;
import defpackage.pey;
import defpackage.tje;
import defpackage.w511;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes.dex */
public final class u implements androidx.lifecycle.q {
    public final /* synthetic */ ike a;
    public final /* synthetic */ androidx.compose.runtime.e b;
    public final /* synthetic */ androidx.compose.runtime.j c;
    public final /* synthetic */ Ref$ObjectRef w;

    public u(ike ikeVar, androidx.compose.runtime.e eVar, androidx.compose.runtime.j jVar, Ref$ObjectRef ref$ObjectRef) {
        this.a = ikeVar;
        this.b = eVar;
        this.c = jVar;
        this.w = ref$ObjectRef;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        boolean z;
        i18 i18Var = null;
        switch (e851.a[event.ordinal()]) {
            case 1:
                tje.N(this.a, null, CoroutineStart.UNDISPATCHED, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.w, this.c, peyVar, this, null), 1);
                return;
            case 2:
                androidx.compose.runtime.e eVar = this.b;
                if (eVar != null) {
                    gux guxVar = eVar.b;
                    synchronized (guxVar.a) {
                        try {
                            synchronized (guxVar.a) {
                                z = guxVar.d;
                            }
                            if (!z) {
                                ArrayList arrayList = guxVar.b;
                                guxVar.b = guxVar.c;
                                guxVar.c = arrayList;
                                guxVar.d = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((Continuation) arrayList.get(i)).resumeWith(zy11.a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                androidx.compose.runtime.j jVar = this.c;
                synchronized (jVar.c) {
                    if (jVar.t) {
                        jVar.t = false;
                        i18Var = jVar.C();
                    }
                }
                if (i18Var != null) {
                    ((j18) i18Var).resumeWith(zy11.a);
                    return;
                }
                return;
            case 3:
                androidx.compose.runtime.j jVar2 = this.c;
                synchronized (jVar2.c) {
                    jVar2.t = true;
                }
                return;
            case 4:
                this.c.A();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                w511.b();
                return;
        }
    }
}
