package defpackage;

import java.util.function.Supplier;
import ru.yandex.taxi.fragment.preorder.RouteSelectorDestinationFragment;

/* loaded from: classes5.dex */
public final /* synthetic */ class eai implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ eai(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        String onAttach$lambda$0$0$0;
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                return str;
            default:
                onAttach$lambda$0$0$0 = RouteSelectorDestinationFragment.onAttach$lambda$0$0$0(str);
                return onAttach$lambda$0$0$0;
        }
    }
}
