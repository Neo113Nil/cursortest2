package com.yandex.go.shortcuts.impl.experiments;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jg11;
import defpackage.w96;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/shortcuts/impl/experiments/TurboButtonExperiment;", "Lw96;", "Lc6z;", "Companion", "ServiceConfig", "com/yandex/go/shortcuts/impl/experiments/g", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TurboButtonExperiment extends w96 implements c6z {
    public static final g Companion = new g();
    public static final i3y[] e;
    public static final TurboButtonExperiment f;
    public final boolean b;
    public final Map c;
    public final List d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new jg11(7)), kotlin.a.b(lazyThreadSafetyMode, new jg11(8))};
        f = new TurboButtonExperiment(0);
    }

    public /* synthetic */ TurboButtonExperiment(int i, List list, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 4) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.w96
    public final boolean h() {
        return getB() && this != f;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/impl/experiments/TurboButtonExperiment$ServiceConfig;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/impl/experiments/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class ServiceConfig {
        public static final h Companion = new h();
        public final String a;
        public final String b;

        public /* synthetic */ ServiceConfig(int i, String str, String str2) {
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
        }

        public ServiceConfig() {
            this.a = "";
            this.b = "";
        }
    }

    public TurboButtonExperiment() {
        this(0);
    }

    public TurboButtonExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        this.b = false;
        this.c = f2;
        this.d = EmptyList.a;
    }
}
