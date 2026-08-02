package xsna;

import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastAuthor;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastStream;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: BroadcastSettingsContract.kt */
/* loaded from: classes3.dex */
public abstract class wi8 implements xl50 {

    /* compiled from: BroadcastSettingsContract.kt */
    public static final class a extends wi8 {
        public static final a b = new a();
    }

    /* compiled from: BroadcastSettingsContract.kt */
    public static final class b extends wi8 {
        public final Throwable b;

        public b(Throwable th) {
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("OnLoadError(error="), this.b, ')');
        }
    }

    /* compiled from: BroadcastSettingsContract.kt */
    public static final class c extends wi8 {
        public final ArrayList b;
        public final HashMap c;
        public final BroadcastAuthor d;
        public final BroadcastStream e;

        public c(ArrayList arrayList, HashMap hashMap, BroadcastAuthor broadcastAuthor, BroadcastStream broadcastStream) {
            this.b = arrayList;
            this.c = hashMap;
            this.d = broadcastAuthor;
            this.e = broadcastStream;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "OnLoadSuccess(authors=" + this.b + ", streams=" + this.c + ", selectedAuthor=" + this.d + ", selectedStream=" + this.e + ')';
        }
    }

    /* compiled from: BroadcastSettingsContract.kt */
    public static final class d extends wi8 {
        public static final d b = new d();
    }

    /* compiled from: BroadcastSettingsContract.kt */
    public static final class e extends wi8 {
        public final BroadcastAuthor b;

        public e(BroadcastAuthor broadcastAuthor) {
            this.b = broadcastAuthor;
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
            return "SelectAuthor(author=" + this.b + ')';
        }
    }

    /* compiled from: BroadcastSettingsContract.kt */
    public static final class f extends wi8 {
        public final BroadcastStream b;

        public f(BroadcastStream broadcastStream) {
            this.b = broadcastStream;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SelectStream(stream=" + this.b + ')';
        }
    }
}
