package defpackage;

import android.location.Location;
import android.os.Bundle;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.destination_picker.ChooseAddressMode;
import com.yandex.go.mainscreen.superapp.impl.fragment.a;
import com.yandex.go.navigation.api.router.FragmentAnimation$TransitionType;
import java.util.HashMap;
import ru.yandex.taxi.ChangeOrderSourceAddressFragment;
import ru.yandex.taxi.favorites.fragment.FavoriteAddressPickerMapFragment;
import ru.yandex.taxi.fragment.BaseFragment;
import ru.yandex.taxi.fragment.settings.ParksListFragment;

/* loaded from: classes12.dex */
public final class fc9 extends dds {
    public final /* synthetic */ int F;
    public final a G;
    public final Object H;
    public final Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc9(h3y h3yVar, xcz xczVar, a aVar) {
        super(null);
        this.F = 2;
        this.H = h3yVar;
        this.I = xczVar;
        this.G = aVar;
    }

    @Override // defpackage.dds
    public final a P() {
        switch (this.F) {
        }
        return this.G;
    }

    @Override // defpackage.dds
    public void Q(Object obj, BaseFragment baseFragment) {
        switch (this.F) {
            case 1:
                cgp0 cgp0Var = (cgp0) this.I;
                cgp0Var.getClass();
                cgp0Var.a.a("screen.address_picker", new HashMap(), 1, new HashMap());
                ((FavoriteAddressPickerMapFragment) baseFragment).setCallbackListener(new eep(this));
                break;
        }
    }

    @Override // defpackage.dds
    public xbs S(Object obj) {
        switch (this.F) {
            case 1:
                return new vbs(FragmentAnimation$TransitionType.ENTER);
            case 2:
                return new vbs(FragmentAnimation$TransitionType.ENTER);
            default:
                return super.S(obj);
        }
    }

    @Override // defpackage.dds
    public final BaseFragment T(Object obj) {
        Address address;
        int i = this.F;
        String str = null;
        Object obj2 = this.H;
        switch (i) {
            case 0:
                bc9 bc9Var = (bc9) obj;
                o2y0 o2y0Var = bc9Var.a;
                ChangeOrderSourceAddressFragment.Companion.getClass();
                ChangeOrderSourceAddressFragment changeOrderSourceAddressFragment = new ChangeOrderSourceAddressFragment();
                changeOrderSourceAddressFragment.changeOrderSourcePointInitData = bc9Var;
                Address u = bc9Var.a.b().u();
                if (u != null) {
                    changeOrderSourceAddressFragment.setInitialAddress(new pv0(u, null, null, null, null, null, null, null, 1022));
                } else {
                    changeOrderSourceAddressFragment.updateInitialPoint(bc9Var.b);
                }
                changeOrderSourceAddressFragment.setChooseAddressMode(ChooseAddressMode.OTHER);
                changeOrderSourceAddressFragment.setCallbackListener(new ec9(this, o2y0Var));
                return changeOrderSourceAddressFragment;
            case 1:
                dep depVar = (dep) obj;
                FavoriteAddressPickerMapFragment.Companion.getClass();
                FavoriteAddressPickerMapFragment favoriteAddressPickerMapFragment = new FavoriteAddressPickerMapFragment();
                favoriteAddressPickerMapFragment.setChooseAddressMode(ChooseAddressMode.OTHER);
                if (depVar instanceof aep) {
                    favoriteAddressPickerMapFragment.setInitialAddress(((aep) depVar).a);
                } else if (depVar instanceof bep) {
                    favoriteAddressPickerMapFragment.updateInitialPoint(((bep) depVar).a);
                } else {
                    if (!jl40.l(depVar, cep.a)) {
                        w511.b();
                        return null;
                    }
                    Location a = ((acz) ((h3y) obj2).get()).a();
                    if (a != null) {
                        zzs.Companion.getClass();
                        favoriteAddressPickerMapFragment.updateInitialPoint(uzs.b(a));
                    }
                }
                return favoriteAddressPickerMapFragment;
            default:
                String str2 = ((ie90) obj).a;
                if (str2 == null) {
                    ZoneAddress f = ((dqe0) ((h3y) obj2).get()).f();
                    if (f != null && (address = f.a) != null) {
                        str = address.getZoneName();
                    }
                    str2 = str == null ? "" : str;
                }
                ParksListFragment.Companion.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("zoneName", str2);
                ParksListFragment parksListFragment = new ParksListFragment();
                parksListFragment.setArguments(bundle);
                parksListFragment.setCallbackListener(new je90(this, str2));
                return parksListFragment;
        }
    }

    @Override // defpackage.dds
    public xbs U() {
        switch (this.F) {
            case 1:
                return new vbs(FragmentAnimation$TransitionType.RETURN);
            case 2:
                return new vbs(FragmentAnimation$TransitionType.RETURN);
            default:
                return super.U();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fc9(a aVar, Object obj, Object obj2, int i) {
        super(null);
        this.F = i;
        this.G = aVar;
        this.H = obj;
        this.I = obj2;
    }
}
