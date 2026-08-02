package defpackage;

import com.yandex.go.preorder.source.altpins.Alternatives$PinIconStateDto$PinEtaDto;
import com.yandex.go.preorder.source.altpins.Alternatives$PinIconStateDto$PinIconDto;
import com.yandex.go.preorder.source.altpins.p0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class jy1 extends xqt {
    public static final jy1 e = new jy1();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, p0.INSTANCE.serializer(), qoi0.a(p0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        f9[] f9VarArr = {new f9("icon", Alternatives$PinIconStateDto$PinIconDto.Companion.serializer(), qoi0.a(Alternatives$PinIconStateDto$PinIconDto.class)), new f9("eta", Alternatives$PinIconStateDto$PinEtaDto.Companion.serializer(), qoi0.a(Alternatives$PinIconStateDto$PinEtaDto.class))};
        e.getClass();
        return Arrays.asList(f9VarArr);
    }
}
