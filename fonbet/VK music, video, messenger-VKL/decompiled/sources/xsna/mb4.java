package xsna;

import androidx.core.app.NotificationCompat;
import com.vkontakte.android.data.b;

/* compiled from: AudioAdStatSenderImpl.kt */
/* loaded from: classes3.dex */
public final class mb4 {
    public volatile boolean a;
    public volatile boolean b;
    public volatile boolean c;
    public volatile boolean d;

    /* compiled from: AudioAdStatSenderImpl.kt */
    public static final class a {
        public static void a(String str, String str2, t750 t750Var) {
            b.d a = io.reactivex.rxjava3.processors.b.a("audio_ad", NotificationCompat.CATEGORY_EVENT, str);
            a.b(t750Var.t(), "section");
            a.b(str2, "type");
            bn40.b("MusicStats", "[VK_TRACKER]", "ADVERTISEMENT", a);
            a.e();
        }
    }

    public final void a(String str, String str2, t750 t750Var) {
        b.d dVar = new b.d("audio_ad");
        dVar.b("rejected", NotificationCompat.CATEGORY_EVENT);
        dVar.b(str2, "reject_reason");
        dVar.b(str, "type");
        dVar.b(t750Var.t(), "section");
        dVar.e();
        bn40.b("MusicStats", "[VK_TRACKER]", "ADVERTISEMENT", dVar);
        dVar.e();
    }
}
