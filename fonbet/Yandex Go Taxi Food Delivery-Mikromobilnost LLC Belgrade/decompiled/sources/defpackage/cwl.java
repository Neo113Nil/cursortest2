package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import flex.engine.a;

/* loaded from: classes.dex */
public final class cwl implements DefaultLifecycleObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cwl(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(pey peyVar) {
    }

    private final void b(pey peyVar) {
    }

    private final void c(pey peyVar) {
    }

    private final void d(pey peyVar) {
    }

    private final void f(pey peyVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(pey peyVar) {
        int i = this.a;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(pey peyVar) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((a) this.b).j();
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(pey peyVar) {
        switch (this.a) {
            case 0:
                break;
            default:
                a aVar = (a) this.b;
                i7x0 i7x0Var = aVar.a;
                l1o l1oVar = aVar.Q;
                jol0 jol0Var = aVar.V;
                aVar.m().g(Lifecycle.Event.ON_PAUSE);
                gfe gfeVar = aVar.f0;
                if (gfeVar != null) {
                    gfeVar.d();
                }
                e3m e3mVar = (e3m) aVar.Z.a;
                if (!(e3mVar instanceof a3m)) {
                    if (!(e3mVar instanceof z2m)) {
                        if (!(e3mVar instanceof d3m)) {
                            if (!(e3mVar instanceof b3m)) {
                                if (!(e3mVar instanceof c3m)) {
                                    w511.b();
                                    break;
                                } else {
                                    jol0Var.onDocumentPause(l1oVar, ((c3m) e3mVar).c, i7x0Var.c());
                                    break;
                                }
                            } else {
                                jol0Var.onDocumentPause(l1oVar, ((b3m) e3mVar).c, i7x0Var.c());
                                break;
                            }
                        } else {
                            jol0Var.onDocumentPause(l1oVar, ((d3m) e3mVar).c, i7x0Var.c());
                            break;
                        }
                    } else {
                        jol0Var.onDocumentPause(l1oVar, ((z2m) e3mVar).c, i7x0Var.c());
                        break;
                    }
                }
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(pey peyVar) {
        switch (this.a) {
            case 0:
                break;
            default:
                a aVar = (a) this.b;
                i7x0 i7x0Var = aVar.a;
                l1o l1oVar = aVar.Q;
                jol0 jol0Var = aVar.V;
                aVar.m().g(Lifecycle.Event.ON_RESUME);
                gfe gfeVar = aVar.f0;
                if (gfeVar != null) {
                    gfeVar.f();
                }
                e3m e3mVar = (e3m) aVar.Z.a;
                if (!(e3mVar instanceof a3m)) {
                    if (!(e3mVar instanceof z2m)) {
                        if (!(e3mVar instanceof d3m)) {
                            if (!(e3mVar instanceof b3m)) {
                                if (!(e3mVar instanceof c3m)) {
                                    w511.b();
                                    break;
                                } else {
                                    jol0Var.onDocumentResume(l1oVar, ((c3m) e3mVar).c, i7x0Var.c());
                                    break;
                                }
                            } else {
                                jol0Var.onDocumentResume(l1oVar, ((b3m) e3mVar).c, i7x0Var.c());
                                break;
                            }
                        } else {
                            jol0Var.onDocumentResume(l1oVar, ((d3m) e3mVar).c, i7x0Var.c());
                            break;
                        }
                    } else {
                        jol0Var.onDocumentResume(l1oVar, ((z2m) e3mVar).c, i7x0Var.c());
                        break;
                    }
                }
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(pey peyVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                core.divkit.state.a aVar = (core.divkit.state.a) obj;
                aVar.b.post(new yvl(aVar, 1));
                break;
            default:
                a aVar2 = (a) obj;
                aVar2.q0 = false;
                aVar2.P.z(czl.a);
                aVar2.m().g(Lifecycle.Event.ON_START);
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(pey peyVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                core.divkit.state.a aVar = (core.divkit.state.a) obj;
                aVar.b.post(new yvl(aVar, 0));
                break;
            default:
                a aVar2 = (a) obj;
                aVar2.P.z(ezl.a);
                aVar2.m().g(Lifecycle.Event.ON_STOP);
                break;
        }
    }
}
