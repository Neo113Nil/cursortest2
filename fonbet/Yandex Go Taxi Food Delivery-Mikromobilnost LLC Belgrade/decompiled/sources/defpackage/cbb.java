package defpackage;

import android.os.Looper;
import androidx.room.util.a;
import com.yandex.messaging.internal.storage.MessagesRange$LoadingType;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.NotImplementedError;

/* loaded from: classes15.dex */
public final class cbb {
    public final naz0 c;
    public final k020 d;
    public final n5t0 e;
    public final h3y f;
    public final fbb g;
    public final x22 i;
    public x08 j;
    public final zq60 a = new zq60();
    public final Looper b = Looper.myLooper();
    public final HashSet h = new HashSet();
    public e48 k = null;

    public cbb(naz0 naz0Var, k020 k020Var, n5t0 n5t0Var, h3y h3yVar, fbb fbbVar, x22 x22Var) {
        this.c = naz0Var;
        this.e = n5t0Var;
        this.d = k020Var;
        this.f = h3yVar;
        this.g = fbbVar;
        this.i = x22Var;
    }

    public final bbb a(ry10 ry10Var) {
        z83.g(null, this.b, Looper.myLooper());
        bbb bbbVar = new bbb(this, ry10Var);
        this.a.b(bbbVar);
        b();
        return bbbVar;
    }

    public final void b() {
        boolean z;
        boolean booleanValue;
        ry10 ry10Var = null;
        z83.g(null, this.b, Looper.myLooper());
        if (this.j != null) {
            return;
        }
        zq60 zq60Var = this.a;
        zq60Var.getClass();
        zq60Var.b++;
        int size = zq60Var.a.size();
        int i = 0;
        boolean z2 = false;
        while (true) {
            int i2 = i;
            while (i2 < size && zq60Var.a.get(i2) == null) {
                i2++;
            }
            if (i2 < size) {
                z = true;
            } else {
                if (!z2) {
                    zq60.a(zq60Var);
                    z2 = true;
                }
                z = false;
            }
            if (!z) {
                break;
            }
            ArrayList arrayList = zq60Var.a;
            while (i < size && arrayList.get(i) == null) {
                i++;
            }
            if (i >= size) {
                if (!z2) {
                    zq60.a(zq60Var);
                }
                ny61.p();
                return;
            }
            int i3 = i + 1;
            bbb bbbVar = (bbb) arrayList.get(i);
            k020 k020Var = this.d;
            long j = this.c.a.a;
            ry10 ry10Var2 = bbbVar.a;
            at2 at2Var = k020Var.b;
            MessagesRange$LoadingType messagesRange$LoadingType = ry10Var2.c;
            if (messagesRange$LoadingType == MessagesRange$LoadingType.FromNewest || messagesRange$LoadingType == MessagesRange$LoadingType.AroundNewest) {
                booleanValue = ((Boolean) a.b(at2Var.b().a, true, false, new j2b(18, j, ry10Var2.a()))).booleanValue();
            } else {
                if (messagesRange$LoadingType != MessagesRange$LoadingType.FromOldest) {
                    throw new NotImplementedError(0);
                }
                Long l = (Long) a.b(at2Var.b().a, true, false, new j2b(13, j, ry10Var2.a()));
                if (l != null) {
                    if (l.longValue() == ry10Var2.a()) {
                        booleanValue = true;
                    }
                }
                booleanValue = false;
            }
            if (!booleanValue) {
                ry10Var = bbbVar.a;
                break;
            }
            i = i3;
        }
        if (ry10Var == null || this.h.contains(ry10Var)) {
            return;
        }
        naz0 naz0Var = this.c;
        this.j = this.e.f(new abb(this, naz0Var.a.b, ry10Var, naz0Var.e(), this.c.b(), this.g.a * 2, this.i, ry10Var));
    }
}
