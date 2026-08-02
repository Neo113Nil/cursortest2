package defpackage;

import android.location.Location;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.persuggest.domain.model.CoordinateProvider$Source;
import ru.yandex.taxi.polling.e;

/* loaded from: classes6.dex */
public final class ldz implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ CoordinateProvider$Source c;
    public final /* synthetic */ Long w;

    public /* synthetic */ ldz(e eVar, CoordinateProvider$Source coordinateProvider$Source, Long l, int i) {
        this.a = i;
        this.b = eVar;
        this.c = coordinateProvider$Source;
        this.w = l;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                CoordinateProvider$Source coordinateProvider$Source = this.c;
                Long l = this.w;
                return e.d(this.b, coordinateProvider$Source, (Location) obj, l, continuation);
            case 1:
                CoordinateProvider$Source coordinateProvider$Source2 = this.c;
                Long l2 = this.w;
                return e.d(this.b, coordinateProvider$Source2, (Location) obj, l2, continuation);
            case 2:
                CoordinateProvider$Source coordinateProvider$Source3 = this.c;
                Long l3 = this.w;
                return e.d(this.b, coordinateProvider$Source3, (Location) obj, l3, continuation);
            case 3:
                CoordinateProvider$Source coordinateProvider$Source4 = this.c;
                Long l4 = this.w;
                return e.d(this.b, coordinateProvider$Source4, (Location) obj, l4, continuation);
            case 4:
                CoordinateProvider$Source coordinateProvider$Source5 = this.c;
                Long l5 = this.w;
                return e.d(this.b, coordinateProvider$Source5, (Location) obj, l5, continuation);
            default:
                CoordinateProvider$Source coordinateProvider$Source6 = this.c;
                Long l6 = this.w;
                return e.d(this.b, coordinateProvider$Source6, (Location) obj, l6, continuation);
        }
    }
}
