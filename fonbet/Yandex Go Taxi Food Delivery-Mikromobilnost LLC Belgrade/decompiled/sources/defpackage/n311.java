package defpackage;

import com.yandex.mapkit.navigation.transport.NavigationListener;
import com.yandex.runtime.Error;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes7.dex */
public final class n311 implements NavigationListener {
    public final /* synthetic */ o311 a;

    public n311(o311 o311Var) {
        this.a = o311Var;
    }

    @Override // com.yandex.mapkit.navigation.transport.NavigationListener
    public final void onResetRoutes() {
        yeo yeoVar;
        o311 o311Var = this.a;
        try {
            Map e = gw00.e(new Pair("type", "onResetRoutes"));
            if ((e instanceof zy11) || (yeoVar = o311Var.b) == null) {
                return;
            }
            yeoVar.success(e);
        } catch (Throwable th) {
            yeo yeoVar2 = o311Var.b;
            if (yeoVar2 != null) {
                yeoVar2.error(o311.class.getSimpleName(), ljo.b(th), null);
            }
        }
    }

    @Override // com.yandex.mapkit.navigation.transport.NavigationListener
    public final void onRoutesBuilt() {
        yeo yeoVar;
        o311 o311Var = this.a;
        try {
            Map e = gw00.e(new Pair("type", "onRoutesBuilt"));
            if ((e instanceof zy11) || (yeoVar = o311Var.b) == null) {
                return;
            }
            yeoVar.success(e);
        } catch (Throwable th) {
            yeo yeoVar2 = o311Var.b;
            if (yeoVar2 != null) {
                yeoVar2.error(o311.class.getSimpleName(), ljo.b(th), null);
            }
        }
    }

    @Override // com.yandex.mapkit.navigation.transport.NavigationListener
    public final void onRoutingError(Error error) {
        yeo yeoVar;
        o311 o311Var = this.a;
        try {
            Map e = gw00.e(new Pair("type", "onRoutingError"));
            if ((e instanceof zy11) || (yeoVar = o311Var.b) == null) {
                return;
            }
            yeoVar.success(e);
        } catch (Throwable th) {
            yeo yeoVar2 = o311Var.b;
            if (yeoVar2 != null) {
                yeoVar2.error(o311.class.getSimpleName(), ljo.b(th), null);
            }
        }
    }
}
