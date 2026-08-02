package xsna;

import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastAuthor;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastStream;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: BroadcastSettingsInteractor.kt */
/* loaded from: classes3.dex */
public final class ri8 {
    public final ArrayList a;
    public final HashMap b;
    public final BroadcastAuthor c;
    public final BroadcastStream d;

    public ri8(ArrayList arrayList, HashMap hashMap, BroadcastAuthor broadcastAuthor, BroadcastStream broadcastStream) {
        this.a = arrayList;
        this.b = hashMap;
        this.c = broadcastAuthor;
        this.d = broadcastStream;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri8)) {
            return false;
        }
        ri8 ri8Var = (ri8) obj;
        return this.a.equals(ri8Var.a) && this.b.equals(ri8Var.b) && this.c.equals(ri8Var.c) && epx.f(this.d, ri8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Result(authors=" + this.a + ", streams=" + this.b + ", selectedAuthor=" + this.c + ", selectedStream=" + this.d + ')';
    }
}
