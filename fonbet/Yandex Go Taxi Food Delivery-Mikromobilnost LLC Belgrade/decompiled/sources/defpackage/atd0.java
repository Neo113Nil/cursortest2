package defpackage;

import ru.yandex.taxi.persuggest.api.finalsuggest.Action;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.g;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes10.dex */
public interface atd0 {
    static tpr a(atd0 atd0Var, zzs zzsVar, RoutePointType routePointType) {
        i iVar = (i) atd0Var;
        iVar.getClass();
        return c(iVar, zzsVar, routePointType, null, null, null, null, 24);
    }

    static tpr b(atd0 atd0Var, zzs zzsVar, RoutePointType routePointType, String str, PositionInitAction positionInitAction, Action action) {
        i iVar = (i) atd0Var;
        return iVar.s(g.l(iVar.e, zzsVar, routePointType, str, iVar.b.m(), null, positionInitAction, Float.valueOf(((gh00) iVar.g).j()), action, null, null, 256));
    }

    static tpr c(atd0 atd0Var, zzs zzsVar, RoutePointType routePointType, PositionInitAction positionInitAction, Action action, String str, String str2, int i) {
        i iVar = (i) atd0Var;
        return iVar.s(g.l(iVar.e, zzsVar, routePointType, "auto", iVar.b.m(), (i & 16) != 0 ? null : str, positionInitAction, Float.valueOf(((gh00) iVar.g).j()), (i & 8) != 0 ? Action.PIN_DROP : action, null, (i & 32) != 0 ? null : str2, 256));
    }
}
