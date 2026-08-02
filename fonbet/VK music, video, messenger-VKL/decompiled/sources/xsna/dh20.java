package xsna;

import com.google.firebase.messaging.reporting.MessagingClientEvent;

/* compiled from: MessagingClientEventExtension.java */
/* loaded from: classes13.dex */
public final class dh20 {
    public final MessagingClientEvent a;

    /* compiled from: MessagingClientEventExtension.java */
    public static final class a {
        public MessagingClientEvent a;

        public final dh20 a() {
            return new dh20(this.a);
        }

        public final void b(MessagingClientEvent messagingClientEvent) {
            this.a = messagingClientEvent;
        }
    }

    public dh20(MessagingClientEvent messagingClientEvent) {
        this.a = messagingClientEvent;
    }

    public static a a() {
        a aVar = new a();
        aVar.a = null;
        return aVar;
    }
}
