package com.yandex.go.eboks.objects.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.tvl;
import defpackage.w96;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/eboks/objects/experiments/EboksObjectsParamsExperiment;", "Lw96;", "Companion", "Params", "Thinning", "RowanThinningItem", "com/yandex/go/eboks/objects/experiments/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EboksObjectsParamsExperiment extends w96 {
    public static final a Companion = new a();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tvl(25))};
    public static final EboksObjectsParamsExperiment e = new EboksObjectsParamsExperiment(0);
    public final boolean b;
    public final List c;

    public /* synthetic */ EboksObjectsParamsExperiment(int i, boolean z, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public EboksObjectsParamsExperiment(int i) {
        this.b = false;
        this.c = EmptyList.a;
    }

    public EboksObjectsParamsExperiment() {
        this(0);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/eboks/objects/experiments/EboksObjectsParamsExperiment$RowanThinningItem;", "", "Companion", "$serializer", "com/yandex/go/eboks/objects/experiments/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class RowanThinningItem {
        public static final c Companion = new c();
        public final float a;
        public final float b;
        public final int c;

        public /* synthetic */ RowanThinningItem(int i, float f, float f2, int i2) {
            this.a = (i & 1) == 0 ? 11.0f : f;
            if ((i & 2) == 0) {
                this.b = 15.0f;
            } else {
                this.b = f2;
            }
            if ((i & 4) == 0) {
                this.c = 500;
            } else {
                this.c = i2;
            }
        }

        public RowanThinningItem() {
            this.a = 11.0f;
            this.b = 15.0f;
            this.c = 500;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/eboks/objects/experiments/EboksObjectsParamsExperiment$Thinning;", "", "Companion", "$serializer", "com/yandex/go/eboks/objects/experiments/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Thinning {
        public static final d Companion = new d();
        public final double a;
        public final double b;
        public final double c;
        public final double d;

        public /* synthetic */ Thinning(int i, double d, double d2, double d3, double d4) {
            this.a = (i & 1) == 0 ? 15.0d : d;
            if ((i & 2) == 0) {
                this.b = 11.0d;
            } else {
                this.b = d2;
            }
            if ((i & 4) == 0) {
                this.c = 0.0d;
            } else {
                this.c = d3;
            }
            if ((i & 8) == 0) {
                this.d = 0.85d;
            } else {
                this.d = d4;
            }
        }

        public Thinning() {
            this.a = 15.0d;
            this.b = 11.0d;
            this.c = 0.0d;
            this.d = 0.85d;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/eboks/objects/experiments/EboksObjectsParamsExperiment$Params;", "", "Companion", "$serializer", "com/yandex/go/eboks/objects/experiments/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Params {
        public static final b Companion = new b();
        public static final i3y[] g = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tvl(26))};
        public final String a;
        public final String b;
        public final float c;
        public final long d;
        public final Thinning e;
        public final List f;

        public /* synthetic */ Params(int i, String str, String str2, float f, long j, Thinning thinning, List list) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = 0.2f;
            } else {
                this.c = f;
            }
            if ((i & 8) == 0) {
                this.d = 100L;
            } else {
                this.d = j;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = thinning;
            }
            if ((i & 32) == 0) {
                this.f = EmptyList.a;
            } else {
                this.f = list;
            }
        }

        public Params(int i) {
            this.a = "";
            this.b = "";
            this.c = 0.2f;
            this.d = 100L;
            this.e = null;
            this.f = EmptyList.a;
        }

        public Params() {
            this(0);
        }
    }
}
