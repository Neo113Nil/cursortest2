package defpackage;

import android.net.Uri;
import com.yandex.quark.utils.Disposable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.a;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class e4h implements olw0, m3h, ugz, g38, pza0, khg0 {
    public final a4h A;
    public Disposable B;
    public oza0 c;
    public final zwf0 x;
    public final r0 y;
    public final d4h z;
    public List a = EmptyList.a;
    public final LinkedHashSet b = new LinkedHashSet();
    public final ArrayList w = new ArrayList();

    public e4h() {
        zwf0 zwf0Var = new zwf0();
        this.x = zwf0Var;
        r0 c = bvf0.c(EmptySet.a);
        this.y = c;
        this.z = new d4h(c, 0);
        this.A = new a4h(this, zwf0Var);
    }

    @Override // defpackage.m3h
    public final synchronized void a(Uri uri) {
        Object failure;
        try {
            String uri2 = uri.toString();
            List list = this.a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (cvu0.x(uri2, (String) it.next(), false)) {
                        Iterator it2 = this.b.iterator();
                        while (it2.hasNext()) {
                            try {
                                ((m3h) it2.next()).a(uri);
                                failure = zy11.a;
                            } catch (Throwable th) {
                                failure = new Result.Failure(th);
                            }
                            Throwable a = Result.a(failure);
                            if (a != null) {
                                this.x.a("DeeplinksFeature", "Fail to open " + uri, a);
                            }
                        }
                        return;
                    }
                }
            }
            this.x.c("DeeplinksFeature", "Received url " + uri + " that is not match to any allowed prefixes " + a.X(this.a, Extension.FIX_SPACE, null, null, null, 62));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(a1h a1hVar) {
        try {
            if (a1hVar instanceof pza0) {
                this.w.add(a1hVar);
                oza0 oza0Var = this.c;
                if (oza0Var != null) {
                    ((pza0) a1hVar).l(oza0Var);
                }
            }
            b1h b1hVar = new b1h(a1hVar);
            synchronized (this) {
                this.b.add(b1hVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.ugz
    public final synchronized void d(qgz qgzVar) {
        this.x.a = qgzVar;
    }

    @Override // defpackage.olw0
    public final tpr j() {
        return this.z;
    }

    @Override // defpackage.pza0
    public final synchronized void l(oza0 oza0Var) {
        this.c = oza0Var;
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            ((pza0) it.next()).l(oza0Var);
        }
    }

    @Override // defpackage.g38
    public final synchronized void n(e8h e8hVar) {
        Object obj = e8hVar.a(this.A).a;
        if (obj != null) {
            this.x.info("DeeplinksFeature", "Success register capability");
            this.B = (Disposable) obj;
        }
    }
}
