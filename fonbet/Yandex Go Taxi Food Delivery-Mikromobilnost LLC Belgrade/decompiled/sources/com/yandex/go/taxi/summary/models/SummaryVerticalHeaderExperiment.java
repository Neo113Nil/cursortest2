package com.yandex.go.taxi.summary.models;

import defpackage.bnv0;
import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.n96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/summary/models/SummaryVerticalHeaderExperiment;", "Ln96;", "Lc6z;", "Companion", "com/yandex/go/taxi/summary/models/d", "$serializer", "solid"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SummaryVerticalHeaderExperiment extends n96 implements c6z {
    public static final d Companion = new d();
    public static final i3y[] h = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bnv0(16)), null, null, null, null};
    public final boolean b;
    public final Map c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public /* synthetic */ SummaryVerticalHeaderExperiment(int i, String str, String str2, String str3, String str4, Map map, boolean z) {
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
        if ((i & 16) == 0) {
            this.f = "";
        } else {
            this.f = str3;
        }
        if ((i & 32) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public SummaryVerticalHeaderExperiment() {
        this(63);
    }

    public SummaryVerticalHeaderExperiment(int i) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = null;
    }
}
