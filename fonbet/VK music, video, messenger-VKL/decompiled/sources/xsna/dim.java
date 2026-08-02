package xsna;

import com.vk.metrics.eventtracking.Event;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;

/* compiled from: DialogOpenReporterImpl.kt */
/* loaded from: classes5.dex */
public final class dim implements cim {
    public static final dim a = new dim();

    @Override // xsna.cim
    public final void a(long j, String str, boolean z) {
        r6m.a.getClass();
        String f = r6m.f();
        String d = r6m.d();
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a b = h5s.b("vkm_dialog_load_on_chat_open");
        b.b("duration", Long.valueOf(j));
        b.a(Boolean.valueOf(z), "has_cached_dialog");
        b.c("entry_point", str);
        b.c(StatCustomFieldKey.NETWORK_TYPE, f);
        b.c("network_subtype", d);
        b.i("StatlogTracker");
        bVar.k(b.e());
    }
}
