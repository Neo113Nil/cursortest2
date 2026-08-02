package ru.mail.libverify.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.api.q;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.components.MessageBus;

/* loaded from: classes9.dex */
final class o {
    private volatile ConcurrentHashMap<String, s> a;

    @NonNull
    private final ru.mail.libverify.c.b f;

    @NonNull
    private final MessageBus g;

    @NonNull
    private final q.g h;

    @NonNull
    private final ru.mail.libverify.i0.a j;

    @NonNull
    private final ConcurrentHashMap<String, s> b = new ConcurrentHashMap<>();
    private final LinkedList<s> c = new LinkedList<>();
    private final ConcurrentHashMap<String, s> d = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, s> e = new ConcurrentHashMap<>();
    private final Runnable i = new Runnable() { // from class: ru.mail.libverify.api.z
        @Override // java.lang.Runnable
        public final void run() {
            o.this.e();
        }
    };

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.ALL_HASHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.TEMPORARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.NOT_TEMPORARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        ALL,
        ALL_HASHED,
        TEMPORARY,
        NOT_TEMPORARY
    }

    public o(@NonNull ru.mail.libverify.c.b bVar, @NonNull q.g gVar) {
        this.f = bVar;
        q.d dVar = (q.d) bVar;
        this.g = dVar.a();
        this.h = gVar;
        this.j = dVar.e().u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.a == null) {
            return;
        }
        try {
            if (this.a.isEmpty()) {
                ((q.d) this.f).c().putValue("api_verification_sessions_data", "").commit();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<s> it = this.a.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().j());
                }
                ((q.d) this.f).c().putValue("api_verification_sessions_data", ru.mail.libverify.q0.a.f(arrayList)).commit();
            }
        } catch (Exception e) {
            ru.mail.libverify.n0.b.a("SessionContainer", "Failed to save sessions", e);
        }
        Iterator<s> it2 = this.c.iterator();
        while (it2.hasNext()) {
            s next = it2.next();
            if (!this.d.containsKey(next.h())) {
                this.g.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.SESSION_CONTAINER_REMOVED_SESSION, next));
            }
        }
        this.c.clear();
    }

    @Nullable
    public final void b(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        d();
        String f = ru.mail.libverify.n0.e.f(str);
        s remove = this.a.remove(str);
        this.b.remove(f);
        if (remove != null) {
            FileLog.v("SessionContainer", "session with id = %s marked as temporary", str);
            this.d.put(str, remove);
            this.e.put(f, remove);
            this.c.add(remove);
            ((q.d) this.f).b().removeCallbacks(this.i);
            ((q.d) this.f).b().postDelayed(this.i, 300L);
        }
    }

    public final boolean c() {
        d();
        return this.a.isEmpty() && this.d.isEmpty();
    }

    public final boolean d(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        d();
        boolean containsKey = this.a.containsKey(str);
        if (containsKey) {
            FileLog.v("SessionContainer", "session with id = %s touched", str);
            ((q.d) this.f).b().removeCallbacks(this.i);
            ((q.d) this.f).b().postDelayed(this.i, 300L);
        }
        return containsKey;
    }

    public final int f() {
        d();
        return this.d.size() + this.a.size();
    }

    @NonNull
    public final ArrayList g() {
        d();
        ArrayList arrayList = new ArrayList(this.a.values());
        arrayList.addAll(this.d.values());
        return arrayList;
    }

    @Nullable
    public final s a(@NonNull String str, @NonNull b bVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        d();
        int i = a.a[bVar.ordinal()];
        if (i == 1) {
            s sVar = this.a.get(str);
            return sVar == null ? this.d.get(str) : sVar;
        }
        if (i == 2) {
            s sVar2 = this.b.get(str);
            return sVar2 == null ? this.e.get(str) : sVar2;
        }
        if (i == 3) {
            return this.d.get(str);
        }
        if (i == 4) {
            return this.a.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Nullable
    public final s c(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        d();
        String f = ru.mail.libverify.n0.e.f(str);
        s remove = this.a.remove(str);
        this.b.remove(f);
        if (remove == null) {
            remove = this.d.remove(str);
            this.e.remove(f);
        }
        if (remove != null) {
            FileLog.v("SessionContainer", "session with id = %s removed", str);
            this.c.add(remove);
            ((q.d) this.f).b().removeCallbacks(this.i);
            ((q.d) this.f).b().postDelayed(this.i, 300L);
        }
        return remove;
    }

    private void d() {
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        this.a = new ConcurrentHashMap<>();
                        this.b.clear();
                        String value = ((q.d) this.f).c().getValue("api_verification_sessions_data");
                        if (!TextUtils.isEmpty(value)) {
                            for (String str : ru.mail.libverify.q0.a.c(value, String.class)) {
                                if (!TextUtils.isEmpty(str)) {
                                    s a2 = this.h.a(str);
                                    long b2 = this.j.b() - a2.n();
                                    if (b2 >= 0 && b2 <= 43200000) {
                                        this.a.put(a2.h(), a2);
                                        this.b.put(ru.mail.libverify.n0.e.f(a2.h()), a2);
                                        this.g.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.SESSION_CONTAINER_ADDED_SESSION, a2));
                                    }
                                    this.g.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.SESSION_CONTAINER_REMOVED_SESSION, a2));
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    a();
                    ru.mail.libverify.n0.b.a("SessionContainer", "Failed to read saved sessions", th);
                } finally {
                }
            }
        }
    }

    public final boolean a(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        d();
        return this.a.containsKey(str) || this.d.containsKey(str);
    }

    public final boolean b() {
        d();
        Iterator it = new ArrayList(this.a.values()).iterator();
        while (it.hasNext()) {
            if (((s) it.next()).m().getState() != VerificationApi.VerificationState.FINAL) {
                return true;
            }
        }
        Iterator it2 = new ArrayList(this.d.values()).iterator();
        while (it2.hasNext()) {
            if (((s) it2.next()).m().getState() != VerificationApi.VerificationState.FINAL) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final void a(@NonNull String str, @NonNull s sVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        d();
        s put = this.a.put(str, sVar);
        this.b.put(ru.mail.libverify.n0.e.f(str), sVar);
        if (put == null) {
            FileLog.v("SessionContainer", "session with id = %s added", str);
            this.g.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.SESSION_CONTAINER_ADDED_SESSION, sVar));
            ((q.d) this.f).b().removeCallbacks(this.i);
            ((q.d) this.f).b().postDelayed(this.i, 300L);
        }
    }

    public final void a() {
        if (this.a == null) {
            return;
        }
        Iterator<s> it = this.a.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.d.clear();
        this.e.clear();
        this.c.clear();
        this.c.addAll(this.a.values());
        this.a.clear();
        this.b.clear();
        e();
    }

    @NonNull
    public final ArrayList a(@NonNull b bVar) {
        ArrayList arrayList;
        d();
        ArrayList arrayList2 = new ArrayList();
        int i = a.a[bVar.ordinal()];
        if (i == 1 || i == 2) {
            arrayList = new ArrayList(this.a.values());
            arrayList.addAll(this.d.values());
        } else if (i == 3) {
            arrayList = new ArrayList(this.d.values());
        } else if (i == 4) {
            arrayList = new ArrayList(this.a.values());
        } else {
            throw new IllegalArgumentException();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((s) it.next()).h());
        }
        return arrayList2;
    }
}
