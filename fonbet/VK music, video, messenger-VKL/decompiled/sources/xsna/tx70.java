package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: OkHttpCookiesJar.kt */
/* loaded from: classes8.dex */
public final class tx70 implements wsj {
    public final LinkedHashSet b = new LinkedHashSet();

    /* compiled from: OkHttpCookiesJar.kt */
    public static final class a {
        public final usj a;

        public a(usj usjVar) {
            this.a = usjVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            String str = aVar.a.a;
            usj usjVar = this.a;
            if (epx.f(str, usjVar.a) && epx.f(aVar.a.d, usjVar.d) && epx.f(aVar.a.e, usjVar.e)) {
                usj usjVar2 = aVar.a;
                if (usjVar2.f == usjVar.f && usjVar2.i == usjVar.i) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            usj usjVar = this.a;
            return ((urd0.a(urd0.a(urd0.a(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, usjVar.a), 31, usjVar.d), 31, usjVar.e) + (!usjVar.f ? 1 : 0)) * 31) + (!usjVar.i ? 1 : 0);
        }
    }

    @Override // xsna.wsj
    public final void a(List list) {
        synchronized (this.b) {
            try {
                LinkedHashSet linkedHashSet = this.b;
                List list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new a((usj) it.next()));
                }
                linkedHashSet.addAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.wsj
    public final List<usj> b(okhttp3.l lVar) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.b) {
            try {
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    usj usjVar = ((a) it.next()).a;
                    if (usjVar.c < System.currentTimeMillis()) {
                        it.remove();
                    } else if (usjVar.d(lVar)) {
                        arrayList.add(usjVar);
                    }
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }
}
