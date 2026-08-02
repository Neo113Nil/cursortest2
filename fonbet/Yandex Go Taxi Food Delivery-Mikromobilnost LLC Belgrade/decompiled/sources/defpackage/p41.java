package defpackage;

import com.yandex.go.address.models.PlainAddress;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final class p41 {
    public p41(int i) {
        if ((i & 1) != 0) {
            jvd0 jvd0Var = PointType.Companion;
        }
        if ((i & 2) != 0) {
            zgc0 zgc0Var = PlainAddress.Companion;
        }
        SourcePicker sourcePicker = SourcePicker.NONE;
        ModalViewOrigin modalViewOrigin = ModalViewOrigin.HOME;
    }

    public p41() {
        this(255);
    }
}
