package com.yandex.go.navigator.domain.traffic_line;

import com.yandex.mapkit.navigation.JamSegment;
import defpackage.avj0;
import defpackage.f4x;
import defpackage.i901;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vog0;
import defpackage.w511;
import defpackage.zuj0;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class a {
    public final f4x a;
    public final tt2 b;
    public final zuj0 c;

    public a(f4x f4xVar, tt2 tt2Var, zuj0 zuj0Var) {
        this.a = f4xVar;
        this.b = tt2Var;
        this.c = zuj0Var;
    }

    public static final int a(a aVar, JamSegment jamSegment) {
        int i;
        aVar.getClass();
        switch (i901.a[jamSegment.getJamType().ordinal()]) {
            case 1:
                i = vog0.jams_unknown;
                break;
            case 2:
                i = vog0.jams_unknown;
                break;
            case 3:
                i = vog0.jams_free;
                break;
            case 4:
                i = vog0.jams_light;
                break;
            case 5:
                i = vog0.jams_hard;
                break;
            case 6:
                i = vog0.jams_hard;
                break;
            default:
                w511.b();
                return 0;
        }
        return ((avj0) aVar.c).a(i);
    }

    public static Object b(a aVar, List list, Continuation continuation) {
        aVar.b.getClass();
        return tje.k0(uyj.a, new TrafficLineContentMapper$map$2(aVar, list, 1000, null), continuation);
    }
}
