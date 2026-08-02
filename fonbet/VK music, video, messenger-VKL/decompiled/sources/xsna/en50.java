package xsna;

import android.os.Handler;
import android.os.Looper;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;

/* compiled from: MviStrainer.kt */
/* loaded from: classes3.dex */
public final class en50<Content, State> implements dn50<Content, State> {
    public final List<scr<Content, State, Object>> b;
    public final List<Pair<dcy<? extends State>, dn50<Content, ? extends State>>> c;
    public final List<Pair<dcy<? extends State>, wzs<gom0<Content, State>, State, s3q0>>> d;
    public final ReentrantLock e = new ReentrantLock();
    public final fg00<State> f = new fg00<>();
    public final LinkedHashMap g = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public en50(List<scr<Content, State, Object>> list, List<? extends Pair<? extends dcy<? extends State>, ? extends dn50<Content, ? extends State>>> list2, List<Pair<dcy<? extends State>, wzs<gom0<Content, State>, State, s3q0>>> list3) {
        this.b = list;
        this.c = list2;
        this.d = list3;
    }

    @Override // xsna.uic
    public final void clear() {
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            this.f.clear();
            Iterator<T> it = this.c.iterator();
            while (it.hasNext()) {
                ((dn50) ((Pair) it.next()).j()).clear();
            }
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // xsna.dn50
    public final void consume(Content content, State state) {
        Collection values;
        LinkedHashMap linkedHashMap = this.g;
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            fg00<State> fg00Var = this.f;
            wuh wuhVar = new wuh(this, state, content);
            ReentrantLock reentrantLock2 = fg00Var.e;
            reentrantLock2.lock();
            try {
                ac3 ac3Var = fg00Var.c;
                if (ac3Var != null) {
                    jd2.a.getClass();
                    Handler handler = jd2.c;
                    if (handler == null) {
                        handler = new Handler(Looper.getMainLooper());
                        jd2.c = handler;
                    }
                    handler.removeCallbacks(ac3Var);
                }
                wuhVar.invoke(fg00Var.d, fg00Var.b);
                s3q0 s3q0Var = s3q0.a;
                reentrantLock2.unlock();
                Iterator<T> it = this.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) it.next();
                    dcy dcyVar = (dcy) pair.d();
                    dn50 dn50Var = (dn50) pair.g();
                    if (dcyVar.c(state)) {
                        dn50 dn50Var2 = dn50Var != null ? dn50Var : null;
                        if (dn50Var2 != null) {
                            dn50Var2.consume(content, state);
                        }
                    } else {
                        dn50Var.clear();
                    }
                }
                int i = 0;
                for (Object obj : this.d) {
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    Pair pair2 = (Pair) obj;
                    dcy dcyVar2 = (dcy) pair2.d();
                    wzs wzsVar = (wzs) pair2.g();
                    if (dcyVar2.c(state)) {
                        Integer valueOf = Integer.valueOf(i);
                        Object obj2 = linkedHashMap.get(valueOf);
                        if (obj2 == null) {
                            obj2 = new LinkedHashMap();
                            linkedHashMap.put(valueOf, obj2);
                        }
                        Map map = (Map) obj2;
                        rfc a = fpf0.a(state.getClass());
                        Object obj3 = map.get(a);
                        if (obj3 == null) {
                            gom0 gom0Var = new gom0();
                            wzsVar.invoke(gom0Var, state);
                            s3q0 s3q0Var2 = s3q0.a;
                            en50 en50Var = new en50(gom0Var.a, gom0Var.b, gom0Var.c);
                            map.put(a, en50Var);
                            obj3 = en50Var;
                        }
                        ((dn50) obj3).consume(content, state);
                    } else {
                        Map map2 = (Map) linkedHashMap.get(Integer.valueOf(i));
                        if (map2 != null && (values = map2.values()) != null) {
                            Iterator it2 = values.iterator();
                            while (it2.hasNext()) {
                                ((dn50) it2.next()).clear();
                            }
                        }
                    }
                    i = i2;
                }
                s3q0 s3q0Var3 = s3q0.a;
                reentrantLock.unlock();
            } finally {
                reentrantLock2.unlock();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
