package defpackage;

import android.os.Handler;
import android.os.Message;
import androidx.media3.exoplayer.offline.e;
import com.samsung.android.sdk.samsungpay.v2.f;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.yandex.taxi.design.NotificationTimedItemComponent;
import yads.rj0;

/* loaded from: classes10.dex */
public final /* synthetic */ class j7m implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j7m(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean _init_$lambda$0;
        boolean H;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                e eVar = (e) obj;
                CopyOnWriteArraySet copyOnWriteArraySet = eVar.d;
                int i2 = message.what;
                if (i2 == 1) {
                    List list = (List) message.obj;
                    eVar.g = true;
                    eVar.m = Collections.unmodifiableList(list);
                    boolean d = eVar.d();
                    Iterator it = copyOnWriteArraySet.iterator();
                    while (it.hasNext()) {
                        ((l7m) it.next()).onInitialized(eVar);
                    }
                    if (d) {
                        eVar.a();
                        break;
                    }
                } else if (i2 == 2) {
                    int i3 = message.arg1;
                    int i4 = message.arg2;
                    int i5 = eVar.e - i3;
                    eVar.e = i5;
                    eVar.f = i4;
                    if (i4 == 0 && i5 == 0) {
                        Iterator it2 = copyOnWriteArraySet.iterator();
                        while (it2.hasNext()) {
                            ((l7m) it2.next()).onIdle(eVar);
                        }
                        break;
                    }
                } else if (i2 != 3) {
                    ny61.k();
                    break;
                } else {
                    k7m k7mVar = (k7m) message.obj;
                    eVar.m = Collections.unmodifiableList(k7mVar.c);
                    u6m u6mVar = k7mVar.a;
                    boolean d2 = eVar.d();
                    if (k7mVar.b) {
                        Iterator it3 = copyOnWriteArraySet.iterator();
                        while (it3.hasNext()) {
                            ((l7m) it3.next()).onDownloadRemoved(eVar, u6mVar);
                        }
                    } else {
                        Iterator it4 = copyOnWriteArraySet.iterator();
                        while (it4.hasNext()) {
                            ((l7m) it4.next()).onDownloadChanged(eVar, u6mVar, k7mVar.d);
                        }
                    }
                    if (d2) {
                        eVar.a();
                        break;
                    }
                }
                break;
            case 1:
                uuy uuyVar = (uuy) obj;
                Iterator it5 = uuyVar.d.iterator();
                while (it5.hasNext()) {
                    tuy tuyVar = (tuy) it5.next();
                    suy suyVar = uuyVar.c;
                    if (!tuyVar.d && tuyVar.c) {
                        hfr b = tuyVar.b.b();
                        tuyVar.b = new gfr();
                        tuyVar.c = false;
                        suyVar.e(tuyVar.a, b);
                    }
                    if (uuyVar.b.a.hasMessages(1)) {
                        break;
                    }
                }
                break;
            case 2:
                _init_$lambda$0 = NotificationTimedItemComponent._init_$lambda$0((NotificationTimedItemComponent) obj, message);
                break;
            case 3:
                H = ((f) obj).H(message);
                break;
            case 4:
                yy71 yy71Var = (yy71) obj;
                CopyOnWriteArraySet copyOnWriteArraySet2 = yy71Var.b;
                int i6 = message.what;
                if (i6 == 0) {
                    yy71Var.g = Collections.unmodifiableList((List) message.obj);
                    boolean a = yy71Var.a();
                    Iterator it6 = copyOnWriteArraySet2.iterator();
                    while (it6.hasNext()) {
                        ((yi81) it6.next()).getClass();
                    }
                    if (a) {
                        Iterator it7 = copyOnWriteArraySet2.iterator();
                        while (it7.hasNext()) {
                            ((yi81) it7.next()).getClass();
                        }
                        break;
                    }
                } else if (i6 == 1) {
                    int i7 = message.arg1;
                    int i8 = message.arg2;
                    int i9 = yy71Var.c - i7;
                    yy71Var.c = i9;
                    if (i8 == 0 && i9 == 0) {
                        Iterator it8 = copyOnWriteArraySet2.iterator();
                        while (it8.hasNext()) {
                            ((yi81) it8.next()).getClass();
                        }
                        break;
                    }
                } else if (i6 != 2) {
                    ny61.k();
                    break;
                } else {
                    ym71 ym71Var = (ym71) message.obj;
                    yy71Var.g = Collections.unmodifiableList(ym71Var.c);
                    pg71 pg71Var = ym71Var.a;
                    boolean a2 = yy71Var.a();
                    if (ym71Var.b) {
                        Iterator it9 = copyOnWriteArraySet2.iterator();
                        while (it9.hasNext()) {
                            ((yi81) it9.next()).getClass();
                        }
                    } else {
                        Iterator it10 = copyOnWriteArraySet2.iterator();
                        while (it10.hasNext()) {
                            yi81 yi81Var = (yi81) it10.next();
                            yi81Var.getClass();
                            r581 r581Var = yi81Var.b;
                            rj0 rj0Var = pg71Var.a;
                            int i10 = pg71Var.b;
                            if (jl40.l(rj0Var.b, yi81Var.a)) {
                                if (yi81.d.contains(Integer.valueOf(i10))) {
                                    kgx kgxVar = yi81.c[0];
                                    oy71 oy71Var = (oy71) r581Var.a.get();
                                    if (oy71Var != null) {
                                        oy71Var.a();
                                    }
                                }
                                if (yi81.e.contains(Integer.valueOf(i10))) {
                                    kgx kgxVar2 = yi81.c[0];
                                    oy71 oy71Var2 = (oy71) r581Var.a.get();
                                    if (oy71Var2 != null) {
                                        oy71Var2.c();
                                    }
                                }
                                if (yi81.f.contains(Integer.valueOf(i10))) {
                                    copyOnWriteArraySet2.remove(yi81Var);
                                }
                            }
                        }
                    }
                    if (a2) {
                        Iterator it11 = copyOnWriteArraySet2.iterator();
                        while (it11.hasNext()) {
                            ((yi81) it11.next()).getClass();
                        }
                        break;
                    }
                }
                break;
            default:
                xrr xrrVar = (xrr) obj;
                Iterator it12 = ((CopyOnWriteArraySet) xrrVar.y).iterator();
                while (it12.hasNext()) {
                    x181 x181Var = (x181) it12.next();
                    ly71 ly71Var = (ly71) xrrVar.x;
                    if (!x181Var.d && x181Var.c) {
                        hh71 a3 = x181Var.b.a();
                        x181Var.b = new je71();
                        x181Var.c = false;
                        ly71Var.c(x181Var.a, a3);
                    }
                    if (((rl71) xrrVar.w).a.hasMessages(0)) {
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
