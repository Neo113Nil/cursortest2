package xsna;

import com.vk.net.cookie.persistence.SerializableCookie;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import xsna.lyi0;
import xsna.r27;
import xsna.usj;

/* compiled from: PersistentCookieJar.kt */
/* loaded from: classes.dex */
public final class ty90 implements wsj {
    public final lyi0 b;
    public final r27 c;
    public final boolean d;

    public ty90(lyi0 lyi0Var, r27 r27Var, boolean z) {
        this.b = lyi0Var;
        this.c = r27Var;
        this.d = z;
    }

    @Override // xsna.wsj
    public final synchronized void a(List list) {
        this.b.a(list);
        this.c.b(list);
    }

    @Override // xsna.wsj
    public final synchronized List<usj> b(okhttp3.l lVar) {
        ArrayList arrayList;
        try {
            ArrayList arrayList2 = new ArrayList();
            arrayList = new ArrayList();
            Iterator<usj> it = this.b.iterator();
            while (((lyi0.a) it).b.hasNext()) {
                lyi0.a aVar = (lyi0.a) it;
                usj usjVar = (usj) aVar.next();
                if (usjVar.b() < System.currentTimeMillis()) {
                    arrayList2.add(usjVar);
                    aVar.remove();
                } else if (usjVar.d(lVar)) {
                    arrayList.add(usjVar);
                }
            }
            r27 r27Var = this.c;
            HashMap<String, SerializableCookie> hashMap = r27Var.a;
            if (!arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                boolean z = false;
                while (it2.hasNext()) {
                    z |= hashMap.remove(r27.b.a((usj) it2.next())) != null;
                }
                if (z) {
                    r27Var.d.onNext(new HashMap<>(hashMap));
                }
            }
            if (this.d) {
                usj.a aVar2 = new usj.a();
                aVar2.b(lVar.d);
                aVar2.d("XDEBUG_SESSION");
                aVar2.e("PHPSTORM");
                arrayList.add(aVar2.a());
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }
}
