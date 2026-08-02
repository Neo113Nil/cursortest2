package com.yandex.go.chargers.data.model;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w96;
import defpackage.y99;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/data/model/ChargersExperiment;", "Lw96;", "Lc6z;", "Companion", "com/yandex/go/chargers/data/model/p", "$serializer", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChargersExperiment extends w96 implements c6z {
    public static final p Companion = new p();
    public static final i3y[] g = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y99(6)), null, null, null};
    public static final ChargersExperiment h = new ChargersExperiment(0);
    public final boolean b;
    public final Map c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ ChargersExperiment(int i, String str, String str2, String str3, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? kotlin.collections.b.f() : map;
        this.d = (i & 4) == 0 ? "" : str;
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getF() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public ChargersExperiment() {
        this(0);
    }

    public ChargersExperiment(int i) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
        this.d = "";
        this.e = null;
        this.f = null;
    }
}
