package defpackage;

import com.yandex.go.search.address.model.Service;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.b;
import ru.yandex.taxi.search.presenter.f;
import ru.yandex.taxi.search.view.AddressSearchView;

/* loaded from: classes6.dex */
public class b61 extends zw4 {
    public final f l;
    public final b m;
    public String n;
    public Service o;
    public boolean p;
    public dx4 q;
    public String r;
    public boolean s;
    public boolean t;
    public PointType u;
    public s2h v;
    public ButtonComponent w;
    public boolean x;
    public cx4 y;
    public final int z;

    public b61(f51 f51Var) {
        super(f51Var.N(), f51Var.d(), f51Var.Z(), f51Var.e(), f51Var.b(), f51Var.I0(), f51Var.c(), f51Var.L());
        this.l = f51Var.a();
        this.m = (b) f51Var.h0().get();
        this.o = Service.UNDEFINED;
        this.t = true;
        this.x = true;
        this.z = mqg0.component_black_opacity_45;
    }

    @Override // defpackage.zw4
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public AddressSearchView a() {
        return new AddressSearchView(this);
    }
}
