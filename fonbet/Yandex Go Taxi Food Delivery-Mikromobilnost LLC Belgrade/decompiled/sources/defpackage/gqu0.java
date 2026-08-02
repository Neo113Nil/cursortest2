package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.communications.api.dto.q0;

@gsq0
/* loaded from: classes5.dex */
public final class gqu0 {
    public static final fqu0 Companion = new fqu0();
    public static final i3y[] i;
    public final String a;
    public final String b;
    public final String c;
    public final q0 d;
    public final Map e;
    public final List f;
    public boolean g;
    public final boolean h;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new i3y[]{null, null, null, null, a.b(lazyThreadSafetyMode, new bmu0(12)), a.b(lazyThreadSafetyMode, new bmu0(13))};
    }

    public /* synthetic */ gqu0(int i2, String str, String str2, String str3, q0 q0Var, Map map, List list) {
        if (15 != (i2 & 15)) {
            qje.Z(i2, 15, equ0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = q0Var;
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = map;
        }
        if ((i2 & 32) == 0) {
            this.f = EmptyList.a;
        } else {
            this.f = list;
        }
        this.g = false;
        this.h = false;
    }

    public gqu0(String str, String str2, String str3, q0 q0Var, boolean z, boolean z2, int i2) {
        z2 = (i2 & 128) != 0 ? false : z2;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = q0Var;
        this.e = null;
        this.f = EmptyList.a;
        this.g = z;
        this.h = z2;
    }
}
