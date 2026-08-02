package xsna;

import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastAuthor;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastStream;

/* compiled from: BroadcastSettingsContract.kt */
/* loaded from: classes3.dex */
public abstract class ki8 implements kj50 {

    /* compiled from: BroadcastSettingsContract.kt */
    public static final class a extends ki8 {
        public final BroadcastAuthor b;

        public a(BroadcastAuthor broadcastAuthor) {
            this.b = broadcastAuthor;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ClickAuthor(author=" + this.b + ')';
        }
    }

    /* compiled from: BroadcastSettingsContract.kt */
    public static final class b extends ki8 {
        public static final b b = new b();
    }

    /* compiled from: BroadcastSettingsContract.kt */
    public static final class c extends ki8 {
        public static final c b = new c();
    }

    /* compiled from: BroadcastSettingsContract.kt */
    public static final class d extends ki8 {
        public static final d b = new d();
    }

    /* compiled from: BroadcastSettingsContract.kt */
    public static final class e extends ki8 {
        public final BroadcastStream b;

        public e(BroadcastStream broadcastStream) {
            this.b = broadcastStream;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ClickStream(stream=" + this.b + ')';
        }
    }

    /* compiled from: BroadcastSettingsContract.kt */
    public static final class f extends ki8 {
        public static final f b = new f();
    }

    /* compiled from: BroadcastSettingsContract.kt */
    public static final class g extends ki8 {
        public static final g b = new g();
    }
}
