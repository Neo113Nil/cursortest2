package defpackage;

import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.taxi.order.cache.api.data.model.OrderType;
import com.yandex.mob.b;
import com.yandex.mob.datastore.c;
import com.yandex.mob.m;
import java.io.IOException;
import java.util.Iterator;
import kotlin.collections.builders.ListBuilder;
import okhttp3.internal.http2.ErrorCode;

/* loaded from: classes9.dex */
public final class duu implements sls {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public duu(euu euuVar, huu huuVar) {
        this.a = 0;
        this.c = euuVar;
        this.b = huuVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        Throwable th;
        ErrorCode errorCode;
        bt70 bt70Var;
        OrderType orderType;
        int i = this.a;
        IOException iOException = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                euu euuVar = (euu) obj;
                huu huuVar = (huu) obj2;
                ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
                try {
                    try {
                    } catch (IOException e) {
                        iOException = e;
                    }
                    if (!huuVar.a(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    do {
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            errorCode = errorCode2;
                            euuVar.a(errorCode, errorCode2, iOException);
                            yf61.b(huuVar);
                            throw th;
                        }
                    } while (huuVar.a(false, this));
                    errorCode = ErrorCode.NO_ERROR;
                    try {
                        try {
                            euuVar.a(errorCode, ErrorCode.CANCEL, null);
                        } catch (IOException e2) {
                            iOException = e2;
                            ErrorCode errorCode3 = ErrorCode.PROTOCOL_ERROR;
                            euuVar.a(errorCode3, errorCode3, iOException);
                            yf61.b(huuVar);
                            return zy11.a;
                        }
                        yf61.b(huuVar);
                        return zy11.a;
                    } catch (Throwable th3) {
                        th = th3;
                        euuVar.a(errorCode, errorCode2, iOException);
                        yf61.b(huuVar);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            case 1:
                return new m((jr20) obj2, (c) ((b) obj).h.getValue());
            default:
                wl40 wl40Var = (wl40) obj;
                ((g) obj2).m.getClass();
                ListBuilder listBuilder = new ListBuilder(wl40Var.j());
                Iterator it = wl40Var.a.iterator();
                while (it.hasNext()) {
                    listBuilder.add(new et70(((o2y0) it.next()).b().a));
                }
                Iterator it2 = wl40Var.b.iterator();
                while (it2.hasNext()) {
                    tly a = ((sly) it2.next()).a();
                    if (a == null) {
                        bt70Var = null;
                    } else {
                        String str = a.e().a;
                        int i2 = xl40.a[a.e().b.ordinal()];
                        if (i2 == 1) {
                            orderType = OrderType.DEFAULT;
                        } else {
                            if (i2 != 2) {
                                w511.b();
                                return null;
                            }
                            orderType = OrderType.AMBULANCE;
                        }
                        bt70Var = new bt70(str, orderType);
                    }
                    if (bt70Var != null) {
                        listBuilder.add(bt70Var);
                    }
                }
                for (zuo0 zuo0Var : wl40Var.f) {
                    listBuilder.add(new dt70(zuo0Var.getSessionId(), zuo0Var.getNumber().a(), zuo0Var.m()));
                }
                Iterator it3 = wl40Var.d.iterator();
                while (it3.hasNext()) {
                    listBuilder.add(new zs70(((fnt) it3.next()).f()));
                }
                Iterator it4 = wl40Var.e.iterator();
                while (it4.hasNext()) {
                    listBuilder.add(new ct70(((vhz) it4.next()).i()));
                }
                Iterator it5 = wl40Var.c.iterator();
                while (it5.hasNext()) {
                    listBuilder.add(new at70(((ren) it5.next()).g()));
                }
                return listBuilder.j();
        }
    }

    public /* synthetic */ duu(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
