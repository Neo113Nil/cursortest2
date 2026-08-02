package xsna;

import androidx.core.app.NotificationCompat;
import com.vk.dto.attaches.AttachWithDownload;
import com.vk.instantjobs.InstantJob;

/* compiled from: ImJobNotificationFactory.kt */
/* loaded from: classes.dex */
public interface w8w {
    static {
        int i = a.a;
    }

    String a();

    int b();

    void c(NotificationCompat.h hVar);

    void d(NotificationCompat.h hVar);

    void f(NotificationCompat.h hVar, int i);

    int g();

    int h(int i);

    String i();

    String j();

    void k();

    int l();

    void m();

    void n(NotificationCompat.h hVar, long j, int i, AttachWithDownload attachWithDownload, InstantJob.a aVar);

    /* compiled from: ImJobNotificationFactory.kt */
    public static final class a {
        private static final w8w STUB = new C3918a();
        public static final /* synthetic */ int a = 0;

        public final w8w getSTUB() {
            return STUB;
        }

        /* compiled from: ImJobNotificationFactory.kt */
        /* renamed from: xsna.w8w$a$a, reason: collision with other inner class name */
        public static final class C3918a implements w8w {
            @Override // xsna.w8w
            public final String a() {
                return "MsgSendChannelId";
            }

            @Override // xsna.w8w
            public final int b() {
                return 2;
            }

            @Override // xsna.w8w
            public final int g() {
                return 4;
            }

            @Override // xsna.w8w
            public final String i() {
                return "AttachDownloadGroup";
            }

            @Override // xsna.w8w
            public final String j() {
                return "AttachDownloadChannelId";
            }

            @Override // xsna.w8w
            public final int l() {
                return 1;
            }

            @Override // xsna.w8w
            public final void k() {
            }

            @Override // xsna.w8w
            public final void m() {
            }

            @Override // xsna.w8w
            public final void c(NotificationCompat.h hVar) {
            }

            @Override // xsna.w8w
            public final void d(NotificationCompat.h hVar) {
            }

            @Override // xsna.w8w
            public final int h(int i) {
                return i;
            }

            @Override // xsna.w8w
            public final void f(NotificationCompat.h hVar, int i) {
            }

            @Override // xsna.w8w
            public final void e(NotificationCompat.h hVar, long j, int i, AttachWithDownload attachWithDownload, InstantJob.a aVar) {
            }

            @Override // xsna.w8w
            public final void n(NotificationCompat.h hVar, long j, int i, AttachWithDownload attachWithDownload, InstantJob.a aVar) {
            }
        }
    }

    default void e(NotificationCompat.h hVar, long j, int i, AttachWithDownload attachWithDownload, InstantJob.a aVar) {
    }
}
