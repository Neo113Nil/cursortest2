package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import xsna.pum;

/* compiled from: DialogsHistoryGetArgs.kt */
/* loaded from: classes2.dex */
public final class drm {
    public final gkx0 a;
    public final pum b;
    public final int c;
    public final Source d;
    public final boolean e;
    public final Object f;
    public final String g;

    public drm(gkx0 gkx0Var, pum pumVar, int i, Source source, boolean z, Object obj, String str) {
        this.a = gkx0Var;
        this.b = pumVar;
        this.c = i;
        this.d = source;
        this.e = z;
        this.f = obj;
        this.g = str;
        if (i < 1) {
            throw new IllegalArgumentException(lhg.a(i, "Illegal limit value: "));
        }
        if (source == Source.CACHE || i <= 200) {
            return;
        }
        throw new IllegalArgumentException("limit=" + i + " is not available for source " + source);
    }

    public final String a() {
        return this.g;
    }

    public final int b() {
        return this.c;
    }

    public final pum c() {
        return this.b;
    }

    public final Source d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drm)) {
            return false;
        }
        drm drmVar = (drm) obj;
        return epx.f(this.a, drmVar.a) && epx.f(this.b, drmVar.b) && this.c == drmVar.c && this.d == drmVar.d && this.e == drmVar.e && epx.f(this.f, drmVar.f) && epx.f(this.g, drmVar.g);
    }

    public final int hashCode() {
        int b = qoy.b(io.reactivex.rxjava3.internal.operators.mixed.k.c((((this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31) + this.c) * 31, 31, this.d), 31, this.e);
        Object obj = this.f;
        return this.g.hashCode() + ((b + (obj != null ? obj.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsHistoryGetArgs(since=");
        sb.append(this.a);
        sb.append(", mode=");
        sb.append(this.b);
        sb.append(", limit=");
        sb.append(this.c);
        sb.append(", source=");
        sb.append(this.d);
        sb.append(", isAwaitNetwork=");
        sb.append(this.e);
        sb.append(", changerTag=");
        sb.append(this.f);
        sb.append(", caller=");
        return ho8.a(sb, this.g, ')');
    }

    public drm(gkx0 gkx0Var, DialogsFilter dialogsFilter, int i, Source source, boolean z, Object obj, String str) {
        this(gkx0Var, new pum.a(dialogsFilter), i, source, z, obj, str);
    }
}
