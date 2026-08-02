package com.yandex.go.flex.common.insets.experiments;

import defpackage.gmt;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.xn11;
import defpackage.yjd;
import defpackage.z96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/flex/common/insets/experiments/HandleInsetsInFlexExperiment;", "Lxn11;", "Companion", "ScreenConfiguration", "com/yandex/go/flex/common/insets/experiments/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HandleInsetsInFlexExperiment implements xn11 {
    public static final a Companion = new a();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gmt(19))};
    public static final HandleInsetsInFlexExperiment d = new HandleInsetsInFlexExperiment(0);
    public final Map b;

    public /* synthetic */ HandleInsetsInFlexExperiment(int i, Map map) {
        if ((i & 1) == 0) {
            this.b = kotlin.collections.b.f();
        } else {
            this.b = map;
        }
    }

    public HandleInsetsInFlexExperiment() {
        this(0);
    }

    public HandleInsetsInFlexExperiment(int i) {
        this.b = kotlin.collections.b.f();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/insets/experiments/HandleInsetsInFlexExperiment$ScreenConfiguration;", "", "Companion", "$serializer", "com/yandex/go/flex/common/insets/experiments/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class ScreenConfiguration {
        public static final b Companion = new b();
        public final Boolean a;
        public final Boolean b;

        public /* synthetic */ ScreenConfiguration(int i, Boolean bool, Boolean bool2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = bool;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = bool2;
            }
        }

        public static final /* synthetic */ void c(ScreenConfiguration screenConfiguration, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || screenConfiguration.a != null) {
                yjdVar.g(serialDescriptor, 0, z96.a, screenConfiguration.a);
            }
            if (!yjdVar.F() && screenConfiguration.b == null) {
                return;
            }
            yjdVar.g(serialDescriptor, 1, z96.a, screenConfiguration.b);
        }

        /* renamed from: a, reason: from getter */
        public final Boolean getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final Boolean getA() {
            return this.a;
        }

        public ScreenConfiguration() {
            this.a = null;
            this.b = null;
        }
    }
}
