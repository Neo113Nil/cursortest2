package defpackage;

import flex.feature.sections.action.ScrollPositionSurrogate;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes4.dex */
public final class cjp0 {
    public static final bjp0 Companion = new bjp0();
    public static final i3y[] f;
    public final String a;
    public final ScrollPositionSurrogate b;
    public final ScrollPositionSurrogate c;
    public final int d;
    public final boolean e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, a.b(lazyThreadSafetyMode, new c6p0(19)), a.b(lazyThreadSafetyMode, new c6p0(20)), null, null};
    }

    public /* synthetic */ cjp0(int i, String str, ScrollPositionSurrogate scrollPositionSurrogate, ScrollPositionSurrogate scrollPositionSurrogate2, int i2, boolean z) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, ajp0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = scrollPositionSurrogate;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = scrollPositionSurrogate2;
        }
        if ((i & 8) == 0) {
            this.d = 0;
        } else {
            this.d = i2;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
    }
}
