package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: OkHttpCookiesJar.kt */
@ozl
/* loaded from: classes.dex */
public final class sx70 implements wsj {
    public final cu2 b;
    public final LinkedHashSet c = new LinkedHashSet();

    /* compiled from: OkHttpCookiesJar.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public final usj a;

        public a(usj usjVar) {
            this.a = usjVar;
        }

        public final usj a() {
            return this.a;
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

    public sx70(cu2 cu2Var) {
        this.b = cu2Var;
    }

    @Override // xsna.wsj
    public final synchronized void a(List list) {
        try {
            LinkedHashSet linkedHashSet = this.c;
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

    @Override // xsna.wsj
    public final synchronized List<usj> b(okhttp3.l lVar) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                usj a2 = ((a) it.next()).a();
                if (a2.b() < ((Number) this.b.invoke()).longValue()) {
                    it.remove();
                } else if (a2.d(lVar)) {
                    arrayList.add(a2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }
}
