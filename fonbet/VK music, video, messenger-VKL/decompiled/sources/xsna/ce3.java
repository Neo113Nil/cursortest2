package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.webkit.WebView;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: AppsCacheInMemoryManager.kt */
/* loaded from: classes11.dex */
public final class ce3 implements de3 {
    public final s1w0 a;
    public final u8y e;
    public final long b = TimeUnit.MINUTES.toMillis(15);
    public final HashMap<Long, Integer> c = new HashMap<>(2);
    public final HashMap<Long, Collection<gzs<s3q0>>> d = new HashMap<>();
    public final b f = new b(Looper.getMainLooper());

    /* compiled from: AppsCacheInMemoryManager.kt */
    public static final class a extends nf3 {
        public a(s1w0 s1w0Var) {
            super(s1w0Var);
        }
    }

    /* compiled from: AppsCacheInMemoryManager.kt */
    public static final class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what == 0) {
                Object obj = message.obj;
                Long l = obj instanceof Long ? (Long) obj : null;
                if (l != null) {
                    ce3.this.remove(l.longValue());
                }
            }
        }
    }

    public ce3(s1w0 s1w0Var) {
        this.a = s1w0Var;
        this.e = new u8y(new a(s1w0Var));
    }

    @Override // xsna.k1w0
    public final void a(long j) {
        Long valueOf = Long.valueOf(j);
        HashMap<Long, Integer> hashMap = this.c;
        Integer num = hashMap.get(valueOf);
        hashMap.put(Long.valueOf(j), Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        this.f.removeMessages(0, Long.valueOf(j));
    }

    @Override // xsna.de3
    public final u13 b(long j) {
        return ((jf3) this.e.b).get(Long.valueOf(j));
    }

    @Override // xsna.de3
    public final u13 c(long j, u13 u13Var) {
        jf3 jf3Var = (jf3) this.e.b;
        u13 u13Var2 = jf3Var.get(Long.valueOf(j));
        Set<Long> keySet = jf3Var.snapshot().keySet();
        Long l = (Long) j5g.Z(keySet);
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        Object obj = null;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        if (epx.f(superappUiRouterBridge.e(), l)) {
            Iterator<T> it = keySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Long valueOf = Long.valueOf(((Number) next).longValue());
                SuperappUiRouterBridge superappUiRouterBridge2 = e370.d;
                if (superappUiRouterBridge2 == null) {
                    superappUiRouterBridge2 = null;
                }
                if (!epx.f(superappUiRouterBridge2.e(), valueOf)) {
                    obj = next;
                    break;
                }
            }
            Long l2 = (Long) obj;
            if (l2 != null) {
                jf3Var.remove(Long.valueOf(l2.longValue()));
            }
        }
        jf3Var.put(Long.valueOf(j), u13Var);
        return u13Var2;
    }

    @Override // xsna.k1w0
    public final void d(final long j) {
        Long valueOf = Long.valueOf(j);
        HashMap<Long, Integer> hashMap = this.c;
        Integer num = hashMap.get(valueOf);
        int intValue = num != null ? num.intValue() : 0;
        hashMap.put(Long.valueOf(j), Integer.valueOf(intValue > 0 ? intValue - 1 : 0));
        if (e(j)) {
            return;
        }
        final u13 b2 = b(j);
        if (b2 != null) {
            b2.a().a().Y();
            WebView b3 = b2.b();
            if (b3 != null) {
                b3.setWebChromeClient(null);
            }
            WebView b4 = b2.b();
            if (b4 != null) {
                b4.postDelayed(new Runnable() { // from class: xsna.ae3
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (ce3.this.e(j)) {
                            return;
                        }
                        b2.b().getSettings().setJavaScriptEnabled(false);
                    }
                }, TimeUnit.SECONDS.toMillis(3L));
            }
        }
        Long valueOf2 = Long.valueOf(j);
        HashMap<Long, Collection<gzs<s3q0>>> hashMap2 = this.d;
        Collection<gzs<s3q0>> collection = hashMap2.get(valueOf2);
        if (collection != null) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                ((gzs) it.next()).invoke();
            }
        }
        hashMap2.remove(Long.valueOf(j));
        Long valueOf3 = Long.valueOf(j);
        b bVar = this.f;
        bVar.sendMessageDelayed(Message.obtain(bVar, 0, valueOf3), this.b);
    }

    public final boolean e(long j) {
        Integer num = this.c.get(Long.valueOf(j));
        return (num != null ? num.intValue() : 0) > 0;
    }

    @Override // xsna.de3
    public final u13 remove(long j) {
        return ((jf3) this.e.b).remove(Long.valueOf(j));
    }
}
