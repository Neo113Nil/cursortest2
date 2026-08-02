package com.yandex.go.ugc.entities;

import defpackage.c6z;
import defpackage.gn11;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.n96;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/ugc/entities/UGCItemExperiment;", "Ln96;", "Lc6z;", "Companion", "com/yandex/go/ugc/entities/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UGCItemExperiment extends n96 implements c6z {
    public static final b Companion = new b();
    public static final i3y[] f;
    public static final UGCItemExperiment g;
    public final boolean b;
    public final List c;
    public final MenuItem d;
    public final Map e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new gn11(7)), null, kotlin.a.b(lazyThreadSafetyMode, new gn11(8))};
        g = new UGCItemExperiment(0);
    }

    public UGCItemExperiment(int i, boolean z, List list, MenuItem menuItem, Map map) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 4) == 0) {
            MenuItem.Companion.getClass();
            this.d = MenuItem.d;
        } else {
            this.d = menuItem;
        }
        if ((i & 8) == 0) {
            this.e = kotlin.collections.b.f();
        } else {
            this.e = map;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.n96
    public final boolean b() {
        return getB() && !this.c.isEmpty();
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.e;
    }

    public UGCItemExperiment() {
        this(0);
    }

    public UGCItemExperiment(int i) {
        MenuItem.Companion.getClass();
        Map f2 = kotlin.collections.b.f();
        this.b = false;
        this.c = EmptyList.a;
        this.d = MenuItem.d;
        this.e = f2;
    }
}
