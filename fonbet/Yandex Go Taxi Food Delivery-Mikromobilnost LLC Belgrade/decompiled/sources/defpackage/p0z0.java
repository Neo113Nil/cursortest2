package defpackage;

import com.yandex.go.shortcuts.dto.response.RoundLabelThumbOverlay;
import com.yandex.go.shortcuts.dto.response.StickerThumbOverlay;
import com.yandex.go.shortcuts.dto.response.f3;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class p0z0 extends xqt {
    public static final p0z0 e = new p0z0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, f3.INSTANCE.serializer(), qoi0.a(f3.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("round_label", RoundLabelThumbOverlay.Companion.serializer(), qoi0.a(RoundLabelThumbOverlay.class)), new f9("sticker", StickerThumbOverlay.Companion.serializer(), qoi0.a(StickerThumbOverlay.class)));
    }
}
