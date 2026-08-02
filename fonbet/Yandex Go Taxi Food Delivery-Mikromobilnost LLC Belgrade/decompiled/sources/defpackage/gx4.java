package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.search.view.BaseAddressSearchView;

/* loaded from: classes6.dex */
public final class gx4 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseAddressSearchView b;

    public /* synthetic */ gx4(BaseAddressSearchView baseAddressSearchView, int i) {
        this.a = i;
        this.b = baseAddressSearchView;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        BaseAddressSearchView baseAddressSearchView = this.b;
        switch (i) {
            case 0:
                baseAddressSearchView.onTextCleared();
                break;
            default:
                baseAddressSearchView.filterChanged(((CharSequence) obj).toString());
                break;
        }
        return zy11Var;
    }
}
