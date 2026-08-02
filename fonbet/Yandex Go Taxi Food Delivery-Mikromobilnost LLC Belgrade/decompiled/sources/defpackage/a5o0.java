package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import kotlin.Pair;
import kotlin.collections.b;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.c;
import ru.yandex.taxi.scooters.data.ScootersParkingSelectionMode;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes6.dex */
public final class a5o0 extends q6e {
    public final /* synthetic */ String c;
    public final /* synthetic */ r7p0 d;
    public final /* synthetic */ zzs e;
    public final /* synthetic */ b5o0 f;
    public final /* synthetic */ ScootersParkingSelectionMode g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5o0(String str, r7p0 r7p0Var, zzs zzsVar, b5o0 b5o0Var, ScootersParkingSelectionMode scootersParkingSelectionMode, boolean z, JsonNull jsonNull) {
        super("scooters", jsonNull);
        this.c = str;
        this.d = r7p0Var;
        this.e = zzsVar;
        this.f = b5o0Var;
        this.g = scootersParkingSelectionMode;
        this.h = z;
    }

    @Override // defpackage.q6e, defpackage.un0
    public final c a(c cVar) {
        kdx kdxVar = new kdx();
        abb1.d(kdxVar, "session_id", this.c);
        r7p0 r7p0Var = this.d;
        if (r7p0Var != null) {
            kdx kdxVar2 = new kdx();
            abb1.d(kdxVar2, "number", r7p0Var.a);
            abb1.d(kdxVar2, DRMInfoProvider.MediaDRMKeys.VENDOR, r7p0Var.b.k());
            kdxVar.b("polygons_selected_vehicle", kdxVar2.a());
        }
        zzs zzsVar = this.e;
        if (zzsVar != null) {
            kdxVar.b("destination", ((xnt) this.f.a).a(zzsVar, zzs.Companion.serializer()));
        }
        ScootersParkingSelectionMode scootersParkingSelectionMode = this.g;
        if (scootersParkingSelectionMode != null) {
            abb1.d(kdxVar, "parking_selection_mode", scootersParkingSelectionMode.getModeName());
        }
        kdx kdxVar3 = new kdx();
        abb1.c(kdxVar3, BackendConfig.Restrictions.ENABLED, Boolean.valueOf(this.h));
        kdxVar.b("navigation", kdxVar3.a());
        return new c(b.o(cVar, new Pair(this.a, kdxVar.a())));
    }
}
