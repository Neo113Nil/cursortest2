package defpackage;

import com.yandex.go.zone.dto.response.ZoneAcceptance$Default;
import com.yandex.go.zone.dto.response.ZoneAcceptance$Trackable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public final class cd61 extends xqt {
    public static final cd61 e = new cd61();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, ZoneAcceptance$Default.Companion.serializer(), qoi0.a(ZoneAcceptance$Default.class));
    }

    @Override // defpackage.h9
    public final String e() {
        return "eula_type";
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("default", ZoneAcceptance$Default.Companion.serializer(), qoi0.a(ZoneAcceptance$Default.class)), new f9("trackable", ZoneAcceptance$Trackable.Companion.serializer(), qoi0.a(ZoneAcceptance$Trackable.class)));
    }
}
