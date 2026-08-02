package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class lbh implements e5p {
    public static final int[] f = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final xjg g = new xjg(new x8e(18));
    public static final xjg h = new xjg(new x8e(19));
    public ImmutableList b;
    public int e;
    public dlh d = new dlh();
    public boolean c = true;

    @Override // defpackage.e5p
    public final void a(boolean z) {
        synchronized (this) {
            this.c = z;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x0031, B:15:0x0039, B:18:0x003e, B:21:0x0044, B:23:0x0047, B:27:0x004a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:9:0x0024, B:11:0x002b, B:12:0x0031, B:15:0x0039, B:18:0x003e, B:21:0x0044, B:23:0x0047, B:27:0x004a), top: B:2:0x0001 }] */
    @Override // defpackage.e5p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized b5p[] b(Uri uri, Map map) {
        ArrayList arrayList;
        String str;
        int d;
        int e;
        try {
            int[] iArr = f;
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            if (list != null && !list.isEmpty()) {
                str = (String) list.get(0);
                d = yma1.d(str);
                if (d != -1) {
                    f(d, arrayList);
                }
                e = yma1.e(uri);
                if (e != -1 && e != d) {
                    f(e, arrayList);
                }
                for (int i = 0; i < 21; i++) {
                    int i2 = iArr[i];
                    if (i2 != d && i2 != e) {
                        f(i2, arrayList);
                    }
                }
            }
            str = null;
            d = yma1.d(str);
            if (d != -1) {
            }
            e = yma1.e(uri);
            if (e != -1) {
                f(e, arrayList);
            }
            while (i < 21) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return (b5p[]) arrayList.toArray(new b5p[arrayList.size()]);
    }

    @Override // defpackage.e5p
    public final synchronized b5p[] c() {
        return b(Uri.EMPTY, new HashMap());
    }

    @Override // defpackage.e5p
    public final void d(dlh dlhVar) {
        synchronized (this) {
            this.d = dlhVar;
        }
    }

    @Override // defpackage.e5p
    public final void e() {
        synchronized (this) {
        }
    }

    public final void f(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new fb());
                break;
            case 1:
                arrayList.add(new ib());
                break;
            case 2:
                arrayList.add(new ed1(0));
                break;
            case 3:
                arrayList.add(new g22(0));
                break;
            case 4:
                b5p c = g.c(0);
                if (c == null) {
                    arrayList.add(new xer(0));
                    break;
                } else {
                    arrayList.add(c);
                    break;
                }
            case 5:
                arrayList.add(new ltr());
                break;
            case 6:
                arrayList.add(new q810(this.c ? 0 : 2, this.d));
                break;
            case 7:
                arrayList.add(new rb30(0));
                break;
            case 8:
                arrayList.add(new les(this.c ? 0 : 32, this.d));
                arrayList.add(new wb30(this.c ? 0 : 16, this.d));
                break;
            case 9:
                arrayList.add(new qv60());
                break;
            case 10:
                arrayList.add(new cyf0());
                break;
            case 11:
                if (this.b == null) {
                    this.b = ImmutableList.p();
                }
                arrayList.add(new vi11(1, !this.c ? 1 : 0, this.d, new sez0(0L), new ymh(0, this.b)));
                break;
            case 12:
                arrayList.add(new o941());
                break;
            case 14:
                arrayList.add(new x9x(this.e));
                break;
            case 15:
                b5p c2 = h.c(new Object[0]);
                if (c2 != null) {
                    arrayList.add(c2);
                    break;
                }
                break;
            case 16:
                arrayList.add(new rb4(!this.c ? 1 : 0, this.d));
                break;
            case 17:
                arrayList.add(new osd0());
                break;
            case 18:
                arrayList.add(new cw41());
                break;
            case 19:
                arrayList.add(new o76());
                break;
            case 20:
                arrayList.add(new efu());
                break;
            case 21:
                arrayList.add(new ub4());
                break;
        }
    }
}
