package com.yandex.go.shortcuts.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.kz60;
import defpackage.vn11;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/shortcuts/experiments/OrderShortcutsParamsExperiment;", "Lvn11;", "Companion", "Param", "ShortcutsParams", "com/yandex/go/shortcuts/experiments/a", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OrderShortcutsParamsExperiment implements vn11 {
    public static final a Companion = new a();
    public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kz60(21))};
    public static final OrderShortcutsParamsExperiment f = new OrderShortcutsParamsExperiment(0);
    public final ShortcutsParams b;
    public final Boolean c;
    public final Map d;

    public /* synthetic */ OrderShortcutsParamsExperiment(int i, ShortcutsParams shortcutsParams, Boolean bool, Map map) {
        if ((i & 1) == 0) {
            this.b = null;
        } else {
            this.b = shortcutsParams;
        }
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
        if ((i & 4) == 0) {
            this.d = kotlin.collections.b.f();
        } else {
            this.d = map;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/experiments/OrderShortcutsParamsExperiment$Param;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/experiments/b", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Param {
        public static final b Companion = new b();
        public final boolean a;

        public /* synthetic */ Param(int i, boolean z) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
        }

        public Param() {
            this.a = false;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/experiments/OrderShortcutsParamsExperiment$ShortcutsParams;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/experiments/c", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ShortcutsParams {
        public static final c Companion = new c();
        public final long a;
        public final boolean b;

        public /* synthetic */ ShortcutsParams(boolean z, int i, long j) {
            this.a = (i & 1) == 0 ? 0L : j;
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z;
            }
        }

        public ShortcutsParams() {
            this.a = 0L;
            this.b = false;
        }
    }

    public OrderShortcutsParamsExperiment() {
        this(0);
    }

    public OrderShortcutsParamsExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        this.b = null;
        this.c = null;
        this.d = f2;
    }
}
