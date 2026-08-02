package xsna;

import com.vk.contacts.ContactSyncState;
import com.vk.core.utils.newtork.NetworkState;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import xsna.hfr;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class aej implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ aej(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ContactSyncState contactSyncState;
        switch (this.b) {
            case 0:
                List list = (List) obj;
                boolean z = false;
                ContactSyncState contactSyncState2 = (ContactSyncState) j5g.b0(0, list);
                ContactSyncState contactSyncState3 = (ContactSyncState) j5g.b0(1, list);
                if (contactSyncState2 != null && contactSyncState2 != (contactSyncState = ContactSyncState.NOT_PERMITTED) && contactSyncState3 != null && contactSyncState3 == contactSyncState) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                return Boolean.valueOf(((ImBgSyncState) obj) == ImBgSyncState.CONNECTED);
            case 2:
                NetworkState networkState = (NetworkState) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"Network state changed - " + networkState});
                }
                return s3q0.a;
            case 3:
                gy90 gy90Var = (gy90) obj;
                hfr.a aVar = new hfr.a(rli0.j(new i5g(gy90Var.c()), new dl70(4)));
                while (aVar.hasNext()) {
                    cy90.a(true);
                }
                hfr.a aVar2 = new hfr.a(rli0.j(new i5g(gy90Var.b()), new wx30(4)));
                while (aVar2.hasNext()) {
                    cy90.a(false);
                }
                return s3q0.a;
            case 4:
                Set b = oqo0.b();
                if (b != null) {
                    SchemeStat$TypeDevNullItem a = oqo0.a(120, b);
                    l5m l5mVar = new l5m(null, null, 3);
                    l5mVar.g = a;
                    l5mVar.q();
                }
                return s3q0.a;
            default:
                Map.Entry entry = (Map.Entry) obj;
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Long n = arm0.n(str);
                if (n == null) {
                    return null;
                }
                UserId userId = new UserId(n.longValue());
                if (!fkq0.c(userId)) {
                    userId = null;
                }
                if (userId == null) {
                    return null;
                }
                String str2 = value instanceof String ? (String) value : null;
                if (str2 == null) {
                    return null;
                }
                if (drm0.N(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    return new Pair(userId, str2);
                }
                return null;
        }
    }

    public /* synthetic */ aej(Object obj, int i) {
        this.b = i;
    }
}
