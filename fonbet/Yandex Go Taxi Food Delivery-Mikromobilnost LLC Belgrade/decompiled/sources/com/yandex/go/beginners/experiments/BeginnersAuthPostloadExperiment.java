package com.yandex.go.beginners.experiments;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.tt4;
import defpackage.w96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/beginners/experiments/BeginnersAuthPostloadExperiment;", "Lw96;", "Lc6z;", "Companion", "com/yandex/go/beginners/experiments/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BeginnersAuthPostloadExperiment extends w96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] h = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tt4(19)), null, null, null, null, null};
    public static final BeginnersAuthPostloadExperiment i = new BeginnersAuthPostloadExperiment(0);
    public final Map b;
    public final boolean c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;

    public /* synthetic */ BeginnersAuthPostloadExperiment(int i2, Map map, boolean z, int i3, int i4, String str, String str2) {
        this.b = (i2 & 1) == 0 ? kotlin.collections.b.f() : map;
        if ((i2 & 2) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i2 & 4) == 0) {
            this.d = 0;
        } else {
            this.d = i3;
        }
        if ((i2 & 8) == 0) {
            this.e = 0;
        } else {
            this.e = i4;
        }
        if ((i2 & 16) == 0) {
            this.f = "";
        } else {
            this.f = str;
        }
        if ((i2 & 32) == 0) {
            this.g = "";
        } else {
            this.g = str2;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.b;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.c;
    }

    public BeginnersAuthPostloadExperiment() {
        this(0);
    }

    public BeginnersAuthPostloadExperiment(int i2) {
        this.b = kotlin.collections.b.f();
        this.c = false;
        this.d = 0;
        this.e = 0;
        this.f = "";
        this.g = "";
    }
}
