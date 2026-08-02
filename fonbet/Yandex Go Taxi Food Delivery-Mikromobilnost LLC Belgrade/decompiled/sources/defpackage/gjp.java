package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlaceType;
import ru.yandex.taxi.favorites.edit.arguments.EditArguments;
import ru.yandex.taxi.fragment.MapFragment;

/* loaded from: classes5.dex */
public final class gjp extends MapFragment.a {
    public final /* synthetic */ ljp a;
    public final /* synthetic */ PlaceType b;

    public gjp(ljp ljpVar, PlaceType placeType) {
        this.a = ljpVar;
        this.b = placeType;
    }

    @Override // defpackage.si00
    public final void a(Address address) {
        EditArguments.Companion.getClass();
        ljp.W(this.a, wkn.a(address, this.b), true);
    }
}
