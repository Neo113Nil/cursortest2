package defpackage;

import android.view.View;
import ru.yandex.taxi.address.design.SourceDestinationComponent;
import ru.yandex.taxi.design.AddressInputComponent;

/* loaded from: classes5.dex */
public final class o1d implements zo31 {
    public final SourceDestinationComponent a;
    public final View b;

    public o1d(SourceDestinationComponent sourceDestinationComponent, View view, AddressInputComponent addressInputComponent, AddressInputComponent addressInputComponent2) {
        this.a = sourceDestinationComponent;
        this.b = view;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
