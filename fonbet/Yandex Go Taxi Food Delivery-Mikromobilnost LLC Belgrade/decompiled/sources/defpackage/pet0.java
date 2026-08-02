package defpackage;

import com.yandex.go.address.models.Address;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final /* synthetic */ class pet0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ set0 b;

    public /* synthetic */ pet0(set0 set0Var, int i) {
        this.a = i;
        this.b = set0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                PointType pointType = PointType.DESTINATION;
                SourcePicker sourcePicker = SourcePicker.A_FROM_SUMMARY;
                ModalViewOrigin modalViewOrigin = ModalViewOrigin.SUMMARY;
                this.b.a(pointType, (Address) obj, sourcePicker, modalViewOrigin, false, true, true);
                break;
            case 1:
                this.b.e.a((pv0) obj);
                break;
            default:
                PointType pointType2 = PointType.SOURCE;
                SourcePicker sourcePicker2 = SourcePicker.A_FROM_HOME;
                ModalViewOrigin modalViewOrigin2 = ModalViewOrigin.HOME;
                this.b.a(pointType2, (Address) obj, sourcePicker2, modalViewOrigin2, false, false, false);
                break;
        }
        return zy11Var;
    }
}
