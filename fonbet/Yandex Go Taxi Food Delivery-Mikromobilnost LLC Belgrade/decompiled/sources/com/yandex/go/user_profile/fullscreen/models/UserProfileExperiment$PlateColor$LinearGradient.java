package com.yandex.go.user_profile.fullscreen.models;

import defpackage.gn11;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.uw51;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/user_profile/fullscreen/models/UserProfileExperiment$PlateColor$LinearGradient", "Lcom/yandex/go/user_profile/fullscreen/models/f;", "Companion", "$serializer", "com/yandex/go/user_profile/fullscreen/models/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class UserProfileExperiment$PlateColor$LinearGradient extends f {
    public static final c Companion = new c();
    public static final i3y[] d;
    public final List a;
    public final List b;
    public final float c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new gn11(27)), kotlin.a.b(lazyThreadSafetyMode, new gn11(28)), null};
    }

    public UserProfileExperiment$PlateColor$LinearGradient(int i, List list, List list2, float f) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.a = emptyList;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = emptyList;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = 0.0f;
        } else {
            this.c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfileExperiment$PlateColor$LinearGradient)) {
            return false;
        }
        UserProfileExperiment$PlateColor$LinearGradient userProfileExperiment$PlateColor$LinearGradient = (UserProfileExperiment$PlateColor$LinearGradient) obj;
        return jl40.l(this.a, userProfileExperiment$PlateColor$LinearGradient.a) && jl40.l(this.b, userProfileExperiment$PlateColor$LinearGradient.b) && Float.compare(this.c, userProfileExperiment$PlateColor$LinearGradient.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uw51.i(qv10.v("LinearGradient(colors=", this.a, ", positions=", this.b, ", angle="), this.c, Extension.C_BRAKE);
    }

    public UserProfileExperiment$PlateColor$LinearGradient() {
        EmptyList emptyList = EmptyList.a;
        this.a = emptyList;
        this.b = emptyList;
        this.c = 0.0f;
    }
}
