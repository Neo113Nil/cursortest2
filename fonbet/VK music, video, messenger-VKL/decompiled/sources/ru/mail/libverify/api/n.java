package ru.mail.libverify.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import ru.mail.libverify.api.q;
import ru.mail.verify.core.utils.components.MessageBus;

/* loaded from: classes9.dex */
final class n {

    @NonNull
    private final ru.mail.libverify.c.b b;

    @NonNull
    private final MessageBus c;

    @Nullable
    private HashMap<String, ru.mail.libverify.g.b> a = null;
    private final LinkedList<ru.mail.libverify.g.b> d = new LinkedList<>();

    @NonNull
    private final Runnable e = new Runnable() { // from class: ru.mail.libverify.api.y
        @Override // java.lang.Runnable
        public final void run() {
            n.this.d();
        }
    };

    public n(@NonNull ru.mail.libverify.c.b bVar) {
        this.b = bVar;
        this.c = ((q.d) bVar).a();
    }

    private void c() {
        if (this.a != null) {
            return;
        }
        this.a = new HashMap<>();
        String value = ((q.d) this.b).c().getValue("api_popup_notifications_data");
        if (TextUtils.isEmpty(value)) {
            return;
        }
        try {
            for (Map.Entry entry : ru.mail.libverify.q0.a.d(value, ru.mail.libverify.g.b.class).entrySet()) {
                ru.mail.libverify.g.b bVar = (ru.mail.libverify.g.b) entry.getValue();
                ((q.d) this.b).e().u();
                long currentTimeMillis = System.currentTimeMillis() - bVar.d();
                if (currentTimeMillis >= 0 && currentTimeMillis <= 43200000) {
                    this.a.put((String) entry.getKey(), (ru.mail.libverify.g.b) entry.getValue());
                    this.c.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.POPUP_CONTAINER_NOTIFICATION_ADDED, entry.getValue()));
                }
            }
        } catch (Throwable th) {
            a();
            ru.mail.libverify.n0.b.a("PopupMessageContainer", "Failed to read popup notifications", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        HashMap<String, ru.mail.libverify.g.b> hashMap = this.a;
        if (hashMap == null) {
            return;
        }
        try {
            if (hashMap.isEmpty()) {
                ((q.d) this.b).c().removeValue("api_popup_notifications_data").commit();
            } else {
                ((q.d) this.b).c().putValue("api_popup_notifications_data", ru.mail.libverify.q0.a.f(this.a)).commit();
            }
        } catch (Exception e) {
            ru.mail.libverify.n0.b.a("PopupMessageContainer", "Failed to save popup notifications", e);
        }
        Iterator<ru.mail.libverify.g.b> it = this.d.iterator();
        while (it.hasNext()) {
            this.c.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.POPUP_CONTAINER_NOTIFICATION_REMOVED, it.next()));
        }
        this.d.clear();
    }

    public final boolean b() {
        c();
        HashMap<String, ru.mail.libverify.g.b> hashMap = this.a;
        return hashMap == null || hashMap.isEmpty();
    }

    @Nullable
    public final Collection<ru.mail.libverify.g.b> e() {
        c();
        HashMap<String, ru.mail.libverify.g.b> hashMap = this.a;
        if (hashMap != null) {
            return hashMap.values();
        }
        return null;
    }

    @Nullable
    public final void a(@NonNull String str, @NonNull ru.mail.libverify.g.b bVar) {
        c();
        HashMap<String, ru.mail.libverify.g.b> hashMap = this.a;
        ru.mail.libverify.g.b put = hashMap != null ? hashMap.put(str, bVar) : null;
        this.c.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.POPUP_CONTAINER_NOTIFICATION_ADDED, bVar));
        if (put != null) {
            this.c.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.POPUP_CONTAINER_NOTIFICATION_REMOVED, put));
        }
        ((q.d) this.b).b().removeCallbacks(this.e);
        ((q.d) this.b).b().postDelayed(this.e, 200L);
    }

    @Nullable
    public final ru.mail.libverify.g.b b(@NonNull String str) {
        c();
        HashMap<String, ru.mail.libverify.g.b> hashMap = this.a;
        ru.mail.libverify.g.b remove = hashMap != null ? hashMap.remove(str) : null;
        if (remove != null) {
            this.d.add(remove);
            ((q.d) this.b).b().removeCallbacks(this.e);
            ((q.d) this.b).b().postDelayed(this.e, 200L);
        }
        return remove;
    }

    @Nullable
    public final ru.mail.libverify.g.b a(@NonNull String str) {
        c();
        HashMap<String, ru.mail.libverify.g.b> hashMap = this.a;
        if (hashMap != null) {
            return hashMap.get(str);
        }
        return null;
    }

    public final void a() {
        if (this.a == null) {
            return;
        }
        this.d.clear();
        this.d.addAll(this.a.values());
        this.a.clear();
        d();
    }
}
