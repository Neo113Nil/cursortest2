package defpackage;

import com.yandex.go.user_profile.fullscreen.models.UserProfileExperiment$PlateColor$LinearGradient;
import com.yandex.go.user_profile.fullscreen.models.UserProfileExperiment$PlateColor$Solid;
import com.yandex.go.user_profile.fullscreen.models.e;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public final class fs21 extends xqt {
    public static final fs21 e = new fs21();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, e.INSTANCE.serializer(), qoi0.a(e.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("solid", UserProfileExperiment$PlateColor$Solid.Companion.serializer(), qoi0.a(UserProfileExperiment$PlateColor$Solid.class)), new f9("linear_gradient", UserProfileExperiment$PlateColor$LinearGradient.Companion.serializer(), qoi0.a(UserProfileExperiment$PlateColor$LinearGradient.class)));
    }
}
