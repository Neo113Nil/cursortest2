package com.yandex.go.logistics.cargo_flow.experiment;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.n5h;
import defpackage.n96;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/logistics/cargo_flow/experiment/DeliveryOrderFormPersistentSettingsExperiment;", "Ln96;", "Companion", "PersistentConfiguration", "com/yandex/go/logistics/cargo_flow/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DeliveryOrderFormPersistentSettingsExperiment extends n96 {
    public static final a Companion = new a();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new n5h(27))};
    public static final DeliveryOrderFormPersistentSettingsExperiment e = new DeliveryOrderFormPersistentSettingsExperiment(0);
    public final boolean b;
    public final List c;

    public /* synthetic */ DeliveryOrderFormPersistentSettingsExperiment(int i, boolean z, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public DeliveryOrderFormPersistentSettingsExperiment(int i) {
        this.b = false;
        this.c = EmptyList.a;
    }

    public DeliveryOrderFormPersistentSettingsExperiment() {
        this(0);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/logistics/cargo_flow/experiment/DeliveryOrderFormPersistentSettingsExperiment$PersistentConfiguration;", "", "Companion", "$serializer", "com/yandex/go/logistics/cargo_flow/experiment/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PersistentConfiguration {
        public static final b Companion = new b();
        public static final i3y[] d;
        public final String a;
        public final List b;
        public final List c;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            d = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new n5h(28)), kotlin.a.b(lazyThreadSafetyMode, new n5h(29))};
        }

        public /* synthetic */ PersistentConfiguration(int i, String str, List list, List list2) {
            this.a = (i & 1) == 0 ? "" : str;
            int i2 = i & 2;
            EmptyList emptyList = EmptyList.a;
            if (i2 == 0) {
                this.b = emptyList;
            } else {
                this.b = list;
            }
            if ((i & 4) == 0) {
                this.c = emptyList;
            } else {
                this.c = list2;
            }
        }

        public PersistentConfiguration() {
            this.a = "";
            EmptyList emptyList = EmptyList.a;
            this.b = emptyList;
            this.c = emptyList;
        }
    }
}
