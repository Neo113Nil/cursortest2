package defpackage;

import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;

@gsq0
/* loaded from: classes9.dex */
public final class l3u0 {
    public static final e3u0 Companion = new e3u0();
    public static final i3y[] n;
    public final zzs a;
    public final uc4 b;
    public final float c;
    public final Mode d;
    public final Screen e;
    public final zzs f;
    public final List g;
    public final kj21 h;
    public final List i;
    public final hp40 j;
    public final String k;
    public final boolean l;
    public final m310 m;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        n = new i3y[]{null, null, null, a.b(lazyThreadSafetyMode, new s7s0(28)), a.b(lazyThreadSafetyMode, new s7s0(29)), null, a.b(lazyThreadSafetyMode, new c3u0(0)), null, a.b(lazyThreadSafetyMode, new c3u0(1)), null, null, null, null};
    }

    public /* synthetic */ l3u0(int i, zzs zzsVar, uc4 uc4Var, float f, Mode mode, Screen screen, zzs zzsVar2, List list, kj21 kj21Var, List list2, hp40 hp40Var, String str, boolean z, m310 m310Var) {
        if (447 != (i & 447)) {
            qje.Z(i, 447, d3u0.a.getDescriptor());
            throw null;
        }
        this.a = zzsVar;
        this.b = uc4Var;
        this.c = f;
        this.d = mode;
        this.e = screen;
        this.f = zzsVar2;
        if ((i & 64) == 0) {
            this.g = EmptyList.a;
        } else {
            this.g = list;
        }
        this.h = kj21Var;
        this.i = list2;
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = hp40Var;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str;
        }
        this.l = (i & 2048) == 0 ? false : z;
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = m310Var;
        }
    }

    public l3u0(zzs zzsVar, uc4 uc4Var, float f, Mode mode, Screen screen, zzs zzsVar2, List list, kj21 kj21Var, ArrayList arrayList, hp40 hp40Var, String str, boolean z, m310 m310Var) {
        this.a = zzsVar;
        this.b = uc4Var;
        this.c = f;
        this.d = mode;
        this.e = screen;
        this.f = zzsVar2;
        this.g = list;
        this.h = kj21Var;
        this.i = arrayList;
        this.j = hp40Var;
        this.k = str;
        this.l = z;
        this.m = m310Var;
    }
}
