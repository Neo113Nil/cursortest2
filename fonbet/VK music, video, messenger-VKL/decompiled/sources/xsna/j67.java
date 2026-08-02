package xsna;

import android.app.Activity;
import android.location.Location;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.tabbar.core.api.domain.TabbarItem;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.q97;
import xsna.ug5;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j67 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j67(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r0 != null) goto L16;
     */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object obj2;
        boolean z = true;
        int i = 0;
        switch (this.b) {
            case 0:
                k67 k67Var = (k67) this.c;
                q97 q97Var = (q97) obj;
                if (!(q97Var instanceof q97.c)) {
                    if (q97Var instanceof q97.b) {
                        k67Var.e = false;
                        k67Var.i = false;
                        k67Var.h = false;
                    } else if (q97Var instanceof q97.d) {
                        k67Var.m.b().onNext(Boolean.FALSE);
                        k67Var.e = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        k67Var.d.l(currentTimeMillis);
                        k67Var.g = currentTimeMillis;
                    } else if (q97Var instanceof q97.a) {
                        k67Var.d.e();
                        k67Var.e = false;
                        k67Var.i = false;
                        k67Var.h = false;
                    } else if (q97Var instanceof q97.e) {
                        io.reactivex.rxjava3.subjects.d<Boolean> dVar = k67Var.k;
                        ((q97.e) q97Var).getClass();
                        dVar.onNext(Boolean.FALSE);
                        r57.b().d(k67Var.b);
                        synchronized (k67Var.t) {
                            try {
                                Iterator it = k67Var.t.iterator();
                                while (it.hasNext()) {
                                    ((gzs) it.next()).invoke();
                                }
                                k67Var.t.clear();
                                s3q0 s3q0Var = s3q0.a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        k67Var.m.e();
                        r57.b().d(k67Var.b);
                    } else if (q97Var instanceof q97.f) {
                        k67Var.f = ((q97.f) q97Var).a();
                        ehe0 ehe0Var = (ehe0) k67Var.o.getValue();
                        long j = k67Var.f;
                        TimeUnit timeUnit = TimeUnit.MINUTES;
                        ehe0Var.b = j == timeUnit.toMillis(0L) ? ug5.b.b : j == timeUnit.toMillis(1L) ? ug5.c.b : j == timeUnit.toMillis(5L) ? ug5.a.b : j == timeUnit.toMillis(30L) ? ug5.d.b : ug5.a.b;
                    } else if (q97Var instanceof q97.i) {
                        k67Var.g = ((q97.i) q97Var).a();
                    } else if (q97Var instanceof q97.g) {
                        q97.g gVar = (q97.g) q97Var;
                        k67Var.h = gVar.a();
                        if (gVar.a()) {
                            k67Var.j(true);
                        } else {
                            c63 c63Var = c63.a;
                            Activity b = c63.b();
                            if (b instanceof AppCompatActivity) {
                                i0q0.f(new z57((AppCompatActivity) b, i));
                            }
                        }
                    } else {
                        if (!(q97Var instanceof q97.h)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        k67Var.i = ((q97.h) q97Var).a();
                    }
                }
                return s3q0.a;
            case 1:
                ezz ezzVar = (ezz) this.c;
                Location location = (Location) obj;
                ezzVar.i.add(location);
                ezzVar.g.onNext(location);
                int size = ezzVar.i.size() - ezzVar.j;
                if (size > 1) {
                    List<Location> list = ezzVar.i;
                    ezzVar.i = list.subList(size, list.size());
                } else if (size == 1) {
                    ezzVar.i.remove(0);
                }
                return s3q0.a;
            case 2:
                ((i950) this.c).i = 0L;
                return s3q0.a;
            default:
                List list2 = (List) obj;
                if (((dun0) this.c).e) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = it2.next();
                            if (((TabbarItem) obj2).e() != null) {
                                break;
                            }
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
        }
    }
}
