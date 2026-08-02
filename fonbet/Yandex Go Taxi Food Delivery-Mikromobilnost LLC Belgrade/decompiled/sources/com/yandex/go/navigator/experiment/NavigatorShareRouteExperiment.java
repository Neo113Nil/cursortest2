package com.yandex.go.navigator.experiment;

import defpackage.ah40;
import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/navigator/experiment/NavigatorShareRouteExperiment;", "Lw96;", "Lc6z;", "Companion", "com/yandex/go/navigator/experiment/f", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NavigatorShareRouteExperiment extends w96 implements c6z {
    public static final f Companion = new f();
    public static final i3y[] f = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ah40(24)), null, null};
    public static final NavigatorShareRouteExperiment g = new NavigatorShareRouteExperiment(0);
    public final boolean b;
    public final Map c;
    public final String d;
    public final String e;

    public /* synthetic */ NavigatorShareRouteExperiment(int i, String str, String str2, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 4) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 8) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getD() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public NavigatorShareRouteExperiment() {
        this(0);
    }

    public NavigatorShareRouteExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        this.b = false;
        this.c = f2;
        this.d = "";
        this.e = "";
    }
}
