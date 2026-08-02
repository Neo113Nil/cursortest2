package com.yandex.go.user_profile.settings.profile.data;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.t5z;
import defpackage.xn11;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/user_profile/settings/profile/data/LogoutAvailabilityForServiceOrdersExperiment;", "Lxn11;", "Companion", "ServiceParameters", "com/yandex/go/user_profile/settings/profile/data/c", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class LogoutAvailabilityForServiceOrdersExperiment implements xn11 {
    public static final c Companion = new c();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new t5z(5))};
    public static final LogoutAvailabilityForServiceOrdersExperiment e = new LogoutAvailabilityForServiceOrdersExperiment(0);
    public final ServiceParameters b;
    public final Map c;

    public /* synthetic */ LogoutAvailabilityForServiceOrdersExperiment(int i, ServiceParameters serviceParameters, Map map) {
        this.b = (i & 1) == 0 ? new ServiceParameters(0) : serviceParameters;
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogoutAvailabilityForServiceOrdersExperiment)) {
            return false;
        }
        LogoutAvailabilityForServiceOrdersExperiment logoutAvailabilityForServiceOrdersExperiment = (LogoutAvailabilityForServiceOrdersExperiment) obj;
        return jl40.l(this.b, logoutAvailabilityForServiceOrdersExperiment.b) && jl40.l(this.c, logoutAvailabilityForServiceOrdersExperiment.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "LogoutAvailabilityForServiceOrdersExperiment(default=" + this.b + ", services=" + this.c + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/user_profile/settings/profile/data/LogoutAvailabilityForServiceOrdersExperiment$ServiceParameters;", "", "Companion", "$serializer", "com/yandex/go/user_profile/settings/profile/data/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ServiceParameters {
        public static final d Companion = new d();
        public final boolean a;

        public /* synthetic */ ServiceParameters(int i, boolean z) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
        }

        public ServiceParameters(int i) {
            this.a = false;
        }

        public ServiceParameters() {
            this(0);
        }
    }

    public LogoutAvailabilityForServiceOrdersExperiment() {
        this(0);
    }

    public LogoutAvailabilityForServiceOrdersExperiment(int i) {
        ServiceParameters serviceParameters = new ServiceParameters(0);
        Map f = kotlin.collections.b.f();
        this.b = serviceParameters;
        this.c = f;
    }
}
