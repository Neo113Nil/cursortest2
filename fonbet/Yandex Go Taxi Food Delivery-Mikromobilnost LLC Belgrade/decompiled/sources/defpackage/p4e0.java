package defpackage;

import com.yandex.go.dto.response.Action$Payload;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lp4e0;", "", "Companion", "n4e0", "o4e0", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p4e0 {
    public static final o4e0 Companion = new o4e0();
    public static final i3y[] f;
    public final a5e0 a;
    public final Action$Payload.ObjectType b;
    public final s4e0 c;
    public final List d;
    public final String e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, a.b(lazyThreadSafetyMode, new yud0(11)), null, a.b(lazyThreadSafetyMode, new yud0(12)), null};
    }

    public /* synthetic */ p4e0(int i, a5e0 a5e0Var, Action$Payload.ObjectType objectType, s4e0 s4e0Var, List list, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = a5e0Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = objectType;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = s4e0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
    }

    /* renamed from: a, reason: from getter */
    public final s4e0 getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final List getD() {
        return this.d;
    }

    /* renamed from: c, reason: from getter */
    public final a5e0 getA() {
        return this.a;
    }

    /* renamed from: d, reason: from getter */
    public final String getE() {
        return this.e;
    }

    public p4e0() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
