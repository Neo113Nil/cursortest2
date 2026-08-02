package com.yandex.go.profile.config;

import defpackage.gsq0;
import defpackage.vn11;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/profile/config/SuperAppConfigProfileExperiment;", "Lvn11;", "Companion", "com/yandex/go/profile/config/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SuperAppConfigProfileExperiment implements vn11 {
    public static final a Companion = new a();
    public static final SuperAppConfigProfileExperiment d = new SuperAppConfigProfileExperiment(0);
    public final Boolean b;
    public final Boolean c;

    public /* synthetic */ SuperAppConfigProfileExperiment(int i, Boolean bool, Boolean bool2) {
        if ((i & 1) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = bool2;
        }
    }

    public SuperAppConfigProfileExperiment(int i) {
        this.b = null;
        this.c = null;
    }

    public SuperAppConfigProfileExperiment() {
        this(0);
    }
}
