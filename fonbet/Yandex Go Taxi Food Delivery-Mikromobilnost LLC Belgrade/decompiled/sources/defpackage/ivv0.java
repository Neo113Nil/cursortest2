package defpackage;

import android.view.View;
import com.yandex.go.superapp.discovery.map.impl.ui.base.SuperAppDiscoveryMapLifecycleAwareModalView;
import defpackage.otv0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.a;
import ru.yandex.taxi.widget.modalview.ModalViewCoordinator$StackChangeType;

/* loaded from: classes14.dex */
public final class ivv0 implements v030 {
    public final ArrayList a = new ArrayList();
    public final otv0 b = new otv0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.v030
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(u45 u45Var, u45 u45Var2, ModalViewCoordinator$StackChangeType modalViewCoordinator$StackChangeType) {
        boolean z;
        int i;
        int i2;
        omu0 omu0Var = new omu0(27);
        ArrayList arrayList = this.a;
        ycc.w(arrayList, omu0Var, true);
        int i3 = hvv0.a[modalViewCoordinator$StackChangeType.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    w511.b();
                    return;
                }
                arrayList.clear();
            } else if (u45Var != 0) {
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i2 = -1;
                        break;
                    } else if (((WeakReference) listIterator.previous()).get() == u45Var) {
                        i2 = listIterator.nextIndex();
                        break;
                    }
                }
                if (i2 >= 0) {
                    arrayList.remove(i2);
                }
            }
        } else if (u45Var2 != 0) {
            arrayList.add(new WeakReference(u45Var2));
        }
        int i4 = hvv0.a[modalViewCoordinator$StackChangeType.ordinal()];
        otv0 otv0Var = this.b;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    w511.b();
                    return;
                }
                otv0Var.a();
                z = false;
                if (u45Var != 0) {
                    SuperAppDiscoveryMapLifecycleAwareModalView superAppDiscoveryMapLifecycleAwareModalView = u45Var instanceof SuperAppDiscoveryMapLifecycleAwareModalView ? (SuperAppDiscoveryMapLifecycleAwareModalView) u45Var : null;
                    if (superAppDiscoveryMapLifecycleAwareModalView != null) {
                        superAppDiscoveryMapLifecycleAwareModalView.onHide();
                    }
                }
                if (u45Var2 == 0) {
                    boolean z2 = modalViewCoordinator$StackChangeType != ModalViewCoordinator$StackChangeType.CLEAN && z;
                    SuperAppDiscoveryMapLifecycleAwareModalView superAppDiscoveryMapLifecycleAwareModalView2 = u45Var2 instanceof SuperAppDiscoveryMapLifecycleAwareModalView ? (SuperAppDiscoveryMapLifecycleAwareModalView) u45Var2 : null;
                    if (superAppDiscoveryMapLifecycleAwareModalView2 != null) {
                        if (z2) {
                            superAppDiscoveryMapLifecycleAwareModalView2.onShow();
                            return;
                        } else {
                            superAppDiscoveryMapLifecycleAwareModalView2.onHide();
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (u45Var != 0) {
                otv0Var.b(u45Var);
            }
            if (u45Var2 != 0) {
                otv0Var.b(u45Var2);
            }
        } else if (u45Var instanceof puv0) {
            View view = (View) u45Var;
            view.setVisibility(4);
            ogu0 ogu0Var = new ogu0(20, this);
            otv0Var.getClass();
            if (!(u45Var instanceof View)) {
                view = null;
            }
            if (view != null) {
                otv0Var.b(u45Var);
                otv0.a aVar = new otv0.a();
                View view2 = view;
                zph zphVar = new zph(otv0Var, u45Var, aVar, view2, ogu0Var, 1);
                aVar.b = zphVar;
                otv0Var.a.put(u45Var, aVar);
                view2.addOnLayoutChangeListener(zphVar);
                otv0.c(otv0Var, u45Var, aVar, view2, ogu0Var);
                view2.post(new te5(otv0Var, u45Var, aVar, view2, ogu0Var, 4));
            }
        }
        if (u45Var2 instanceof puv0) {
            puv0 puv0Var = (puv0) u45Var2;
            ListIterator listIterator2 = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    i = -1;
                    break;
                } else if (((WeakReference) listIterator2.previous()).get() == puv0Var) {
                    i = listIterator2.nextIndex();
                    break;
                }
            }
            z = i == -1 || (!(puv0Var instanceof ctv0) ? i != scc.f(arrayList) : arrayList.size() != 1);
            ((View) u45Var2).setVisibility(z ? 0 : 8);
        } else {
            z = true;
        }
        b();
        if (u45Var != 0) {
        }
        if (u45Var2 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        Object obj;
        otv0 otv0Var = this.b;
        for (u45 u45Var : a.J0(otv0Var.a.keySet())) {
            View view = u45Var instanceof View ? (View) u45Var : null;
            if (view != null) {
                ArrayList arrayList = this.a;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((WeakReference) it.next()).get() == u45Var) {
                            otv0.a aVar = (otv0.a) otv0Var.a.get(u45Var);
                            if (aVar != null) {
                                if (aVar.a) {
                                    ListIterator listIterator = arrayList.listIterator(arrayList.size());
                                    while (true) {
                                        if (listIterator.hasPrevious()) {
                                            obj = listIterator.previous();
                                            if (((WeakReference) obj).get() != null) {
                                                break;
                                            }
                                        } else {
                                            obj = null;
                                            break;
                                        }
                                    }
                                    WeakReference weakReference = (WeakReference) obj;
                                    boolean z = view.getVisibility() == 4 && u45Var != (weakReference != null ? (u45) weakReference.get() : null);
                                    otv0Var.b(u45Var);
                                    if (z) {
                                        view.setVisibility(8);
                                    }
                                }
                            }
                        }
                    }
                }
                otv0Var.b(u45Var);
            }
        }
    }
}
