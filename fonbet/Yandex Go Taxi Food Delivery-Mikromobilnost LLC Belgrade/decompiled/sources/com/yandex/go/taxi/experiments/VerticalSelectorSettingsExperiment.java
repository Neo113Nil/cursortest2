package com.yandex.go.taxi.experiments;

import defpackage.c6z;
import defpackage.gs21;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.xn11;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/experiments/VerticalSelectorSettingsExperiment;", "Lxn11;", "Lc6z;", "Companion", "VerticalsScrollVisibility", "com/yandex/go/taxi/experiments/m", "$serializer", "selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class VerticalSelectorSettingsExperiment implements xn11, c6z {
    public static final m Companion = new m();
    public static final i3y[] g = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gs21(15)), null, null, null};
    public static final VerticalSelectorSettingsExperiment h = new VerticalSelectorSettingsExperiment(0);
    public final boolean b;
    public final Map c;
    public final boolean d;
    public final VerticalsScrollVisibility e;
    public final BoldVerticalsDesignDto f;

    public VerticalSelectorSettingsExperiment(int i, boolean z, Map map, boolean z2, VerticalsScrollVisibility verticalsScrollVisibility, BoldVerticalsDesignDto boldVerticalsDesignDto) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
        if ((i & 8) == 0) {
            VerticalsScrollVisibility.Companion.getClass();
            this.e = VerticalsScrollVisibility.d;
        } else {
            this.e = verticalsScrollVisibility;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = boldVerticalsDesignDto;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getD() {
        return this.c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/experiments/VerticalSelectorSettingsExperiment$VerticalsScrollVisibility;", "", "Companion", "com/yandex/go/taxi/experiments/n", "$serializer", "selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class VerticalsScrollVisibility {
        public static final n Companion = new n();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gs21(16)), null};
        public static final VerticalsScrollVisibility d = new VerticalsScrollVisibility(0);
        public final Map a;
        public final int b;

        public /* synthetic */ VerticalsScrollVisibility(int i, int i2, Map map) {
            this.a = (i & 1) == 0 ? kotlin.collections.b.f() : map;
            if ((i & 2) == 0) {
                this.b = 3;
            } else {
                this.b = i2;
            }
        }

        public VerticalsScrollVisibility() {
            this(0);
        }

        public VerticalsScrollVisibility(int i) {
            this.a = kotlin.collections.b.f();
            this.b = 3;
        }
    }

    public VerticalSelectorSettingsExperiment() {
        this(0);
    }

    public VerticalSelectorSettingsExperiment(int i) {
        Map f = kotlin.collections.b.f();
        VerticalsScrollVisibility.Companion.getClass();
        VerticalsScrollVisibility verticalsScrollVisibility = VerticalsScrollVisibility.d;
        this.b = false;
        this.c = f;
        this.d = false;
        this.e = verticalsScrollVisibility;
        this.f = null;
    }
}
