package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* loaded from: classes9.dex */
public final class jol0 implements i3m {
    public final ArrayList a;

    public jol0(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        this.a = arrayList;
    }

    @Override // defpackage.i3m
    public final void dispose() {
        ArrayList arrayList = this.a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((i3m) it.next()).dispose();
            } catch (Throwable th) {
                h5z0.a.e(th);
            }
        }
        arrayList.clear();
    }

    @Override // defpackage.i3m
    public final void onDocumentApplied(l1o l1oVar, xzl xzlVar, List list) {
        ArrayList arrayList = (ArrayList) list;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((i3m) it.next()).onDocumentApplied(l1oVar, xzlVar, arrayList);
            } catch (Throwable th) {
                h5z0.a.e(th);
            }
        }
    }

    @Override // defpackage.i3m
    public final void onDocumentLoadingCancelled(l1o l1oVar, u1m u1mVar, List list, Throwable th) {
        ArrayList arrayList = (ArrayList) list;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((i3m) it.next()).onDocumentLoadingCancelled(l1oVar, u1mVar, arrayList, th);
            } catch (Throwable th2) {
                h5z0.a.e(th2);
            }
        }
    }

    @Override // defpackage.i3m
    public final void onDocumentLoadingFailed(l1o l1oVar, u1m u1mVar, Throwable th, List list) {
        ArrayList arrayList = (ArrayList) list;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((i3m) it.next()).onDocumentLoadingFailed(l1oVar, u1mVar, th, arrayList);
            } catch (Throwable th2) {
                h5z0.a.e(th2);
            }
        }
    }

    @Override // defpackage.i3m
    public final void onDocumentLoadingFinished(l1o l1oVar, u1m u1mVar, xzl xzlVar, List list) {
        ArrayList arrayList = (ArrayList) list;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((i3m) it.next()).onDocumentLoadingFinished(l1oVar, u1mVar, xzlVar, arrayList);
            } catch (Throwable th) {
                h5z0.a.e(th);
            }
        }
    }

    @Override // defpackage.i3m
    public final void onDocumentLoadingStarted(l1o l1oVar, u1m u1mVar, List list) {
        ArrayList arrayList = (ArrayList) list;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((i3m) it.next()).onDocumentLoadingStarted(l1oVar, u1mVar, arrayList);
            } catch (Throwable th) {
                h5z0.a.e(th);
            }
        }
    }

    @Override // defpackage.i3m
    public final void onDocumentPause(l1o l1oVar, u1m u1mVar, List list) {
        ArrayList arrayList = (ArrayList) list;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((i3m) it.next()).onDocumentPause(l1oVar, u1mVar, arrayList);
            } catch (Throwable th) {
                h5z0.a.e(th);
            }
        }
    }

    @Override // defpackage.i3m
    public final void onDocumentResume(l1o l1oVar, u1m u1mVar, List list) {
        ArrayList arrayList = (ArrayList) list;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((i3m) it.next()).onDocumentResume(l1oVar, u1mVar, arrayList);
            } catch (Throwable th) {
                h5z0.a.e(th);
            }
        }
    }

    @Override // defpackage.i3m
    public final void onPortionLoadingCancelled(l1o l1oVar, u1m u1mVar, wbe0 wbe0Var, List list, Throwable th) {
        ArrayList arrayList = (ArrayList) list;
        CancellationException cancellationException = (CancellationException) th;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((i3m) it.next()).onPortionLoadingCancelled(l1oVar, u1mVar, wbe0Var, arrayList, cancellationException);
            } catch (Throwable th2) {
                h5z0.a.e(th2);
            }
        }
    }

    @Override // defpackage.i3m
    public final void onPortionLoadingFailed(l1o l1oVar, u1m u1mVar, wbe0 wbe0Var, Throwable th, List list) {
        ArrayList arrayList = (ArrayList) list;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((i3m) it.next()).onPortionLoadingFailed(l1oVar, u1mVar, wbe0Var, th, arrayList);
            } catch (Throwable th2) {
                h5z0.a.e(th2);
            }
        }
    }

    @Override // defpackage.i3m
    public final void onPortionLoadingFinished(l1o l1oVar, u1m u1mVar, wbe0 wbe0Var, ywl ywlVar, List list) {
        ArrayList arrayList = (ArrayList) list;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((i3m) it.next()).onPortionLoadingFinished(l1oVar, u1mVar, wbe0Var, ywlVar, arrayList);
            } catch (Throwable th) {
                h5z0.a.e(th);
            }
        }
    }

    @Override // defpackage.i3m
    public final void onPortionLoadingStarted(l1o l1oVar, u1m u1mVar, wbe0 wbe0Var, List list) {
        ArrayList arrayList = (ArrayList) list;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((i3m) it.next()).onPortionLoadingStarted(l1oVar, u1mVar, wbe0Var, arrayList);
            } catch (Throwable th) {
                h5z0.a.e(th);
            }
        }
    }

    @Override // defpackage.i3m
    public final void onRenderingFinished(l1o l1oVar, u1m u1mVar, xzl xzlVar, long j, List list) {
        ArrayList arrayList = (ArrayList) list;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((i3m) it.next()).onRenderingFinished(l1oVar, u1mVar, xzlVar, j, arrayList);
            } catch (Throwable th) {
                h5z0.a.e(th);
            }
        }
    }

    @Override // defpackage.i3m
    public final void onRenderingFinishedLegacy(l1o l1oVar, u1m u1mVar, ywl ywlVar, long j, List list) {
        ArrayList arrayList = (ArrayList) list;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((i3m) it.next()).onRenderingFinishedLegacy(l1oVar, u1mVar, ywlVar, j, arrayList);
            } catch (Throwable th) {
                h5z0.a.e(th);
            }
        }
    }

    @Override // defpackage.i3m
    public final void onRenderingStarted(l1o l1oVar, u1m u1mVar, xzl xzlVar, List list) {
        ArrayList arrayList = (ArrayList) list;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((i3m) it.next()).onRenderingStarted(l1oVar, u1mVar, xzlVar, arrayList);
            } catch (Throwable th) {
                h5z0.a.e(th);
            }
        }
    }

    @Override // defpackage.i3m
    public final void onDocumentApplied(l1o l1oVar, ywl ywlVar, List list) {
    }

    @Override // defpackage.i3m
    public final void onDocumentLoadingFailed(l1o l1oVar, u1m u1mVar, Throwable th) {
    }

    @Override // defpackage.i3m
    public final void onDocumentLoadingFinished(l1o l1oVar, u1m u1mVar, ywl ywlVar, List list) {
    }

    @Override // defpackage.i3m
    public final void onDocumentLoadingStarted(l1o l1oVar, u1m u1mVar) {
    }

    @Override // defpackage.i3m
    public final void onDocumentPause(l1o l1oVar, u1m u1mVar) {
    }

    @Override // defpackage.i3m
    public final void onDocumentResume(l1o l1oVar, u1m u1mVar) {
    }

    @Override // defpackage.i3m
    public final void onRenderingStarted(l1o l1oVar, u1m u1mVar, ywl ywlVar, List list) {
    }

    @Override // defpackage.i3m
    public final void onDocumentApplied(l1o l1oVar, ywl ywlVar) {
    }

    @Override // defpackage.i3m
    public final void onDocumentLoadingFinished(l1o l1oVar, u1m u1mVar, ywl ywlVar) {
    }

    @Override // defpackage.i3m
    public final void onDocumentLoadingStarted(l1o l1oVar, u1m u1mVar, List list, ywl ywlVar) {
        ArrayList arrayList = (ArrayList) list;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                ((i3m) it.next()).onDocumentLoadingStarted(l1oVar, u1mVar, arrayList, ywlVar);
            } catch (Throwable th) {
                h5z0.a.e(th);
            }
        }
    }

    @Override // defpackage.i3m
    public final void onRenderingFinished(l1o l1oVar, u1m u1mVar, ywl ywlVar, long j, List list) {
    }

    @Override // defpackage.i3m
    public final void onRenderingStarted(l1o l1oVar, u1m u1mVar, ywl ywlVar) {
    }

    @Override // defpackage.i3m
    public final void onRenderingFinished(l1o l1oVar, u1m u1mVar, ywl ywlVar, long j) {
    }
}
