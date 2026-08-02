package com.yandex.go.drive;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.tvl;
import defpackage.w96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/drive/DriveSdkExperiment;", "Lw96;", "Lc6z;", "Companion", "com/yandex/go/drive/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DriveSdkExperiment extends w96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] g = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tvl(14)), null, null, null};
    public static final DriveSdkExperiment h = new DriveSdkExperiment(0);
    public final boolean b;
    public final Map c;
    public final int d;
    public final int e;
    public final int f;

    public /* synthetic */ DriveSdkExperiment(int i, boolean z, Map map, int i2, int i3, int i4) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = 0;
        } else {
            this.d = i2;
        }
        if ((i & 8) == 0) {
            this.e = 0;
        } else {
            this.e = i3;
        }
        if ((i & 16) == 0) {
            this.f = 21600;
        } else {
            this.f = i4;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getB() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getC() {
        return this.b;
    }

    public DriveSdkExperiment() {
        this(0);
    }

    public DriveSdkExperiment(int i) {
        Map f = b.f();
        this.b = false;
        this.c = f;
        this.d = 0;
        this.e = 0;
        this.f = 21600;
    }
}
