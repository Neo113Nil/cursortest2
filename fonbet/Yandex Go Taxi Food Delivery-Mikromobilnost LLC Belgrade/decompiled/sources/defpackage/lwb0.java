package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.PinIconStateDto$PinEtaDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.PinIconStateDto$PinIconDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.n1;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class lwb0 extends xqt {
    public static final lwb0 e = new lwb0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, n1.INSTANCE.serializer(), qoi0.a(n1.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("icon", PinIconStateDto$PinIconDto.Companion.serializer(), qoi0.a(PinIconStateDto$PinIconDto.class)), new f9("eta", PinIconStateDto$PinEtaDto.Companion.serializer(), qoi0.a(PinIconStateDto$PinEtaDto.class)));
    }
}
