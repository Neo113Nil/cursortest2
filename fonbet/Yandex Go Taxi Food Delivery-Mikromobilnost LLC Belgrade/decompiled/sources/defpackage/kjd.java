package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchView;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final class kjd implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ CompositeAddressSearchView b;

    public /* synthetic */ kjd(CompositeAddressSearchView compositeAddressSearchView, int i) {
        this.a = i;
        this.b = compositeAddressSearchView;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        CompositeAddressSearchView compositeAddressSearchView = this.b;
        switch (i) {
            case 0:
                compositeAddressSearchView.onFocusChange(((Boolean) obj).booleanValue(), PointType.SOURCE);
                break;
            default:
                compositeAddressSearchView.onFocusChange(((Boolean) obj).booleanValue(), PointType.DESTINATION);
                break;
        }
        return zy11Var;
    }
}
