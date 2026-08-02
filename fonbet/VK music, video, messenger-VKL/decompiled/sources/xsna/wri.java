package xsna;

import android.util.ArraySet;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.typing.ComposingType;

/* compiled from: ComposingBeginLpEvent.kt */
/* loaded from: classes2.dex */
public final class wri implements e900 {
    public final Peer a;
    public final ArraySet b;
    public final int c;
    public final int d;
    public final ComposingType e;

    public wri(Peer peer, ArraySet arraySet, int i, int i2, ComposingType composingType) {
        this.a = peer;
        this.b = arraySet;
        this.c = i;
        this.d = i2;
        this.e = composingType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wri)) {
            return false;
        }
        wri wriVar = (wri) obj;
        return epx.f(this.a, wriVar.a) && this.b.equals(wriVar.b) && this.c == wriVar.c && this.d == wriVar.d && this.e == wriVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + shy.a(this.d, shy.a(this.c, (this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "ComposingBeginLpEvent(dialog=" + this.a + ", members=" + this.b + ", total=" + this.c + ", ts=" + this.d + ", type=" + this.e + ')';
    }
}
