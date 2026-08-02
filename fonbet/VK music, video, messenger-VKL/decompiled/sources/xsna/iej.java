package xsna;

import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.contacts.ContactSyncState;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.io.InputStream;
import java.util.List;
import xsna.c2r0;
import xsna.vx70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class iej implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ iej(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                List list = (List) obj;
                boolean z = false;
                ContactSyncState contactSyncState = (ContactSyncState) j5g.b0(0, list);
                ContactSyncState contactSyncState2 = (ContactSyncState) j5g.b0(1, list);
                if (contactSyncState == ContactSyncState.SYNCING && contactSyncState2 == ContactSyncState.DONE) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                return i5s.a(new StringBuilder(), ((zk10) obj).b().get(1), ":<HIDE>");
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 3:
                return s3q0.a;
            case 4:
                String h = DevNullEventKey.OOM_SCORE.h();
                dsg0.a.getClass();
                SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(h, null, null, dsg0.d(), null, dsg0.e(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -42, 3, null);
                l5m l5mVar = new l5m(null, null, 3);
                l5mVar.g = schemeStat$TypeDevNullItem;
                l5mVar.q();
                return s3q0.a;
            case 5:
                InputStream c = ((vx70.b) ((rsj0) obj).a()).c();
                if (c != null) {
                    return c;
                }
                throw new VKApiException("Response returned null for stream");
            default:
                return ((c2r0.b) obj).d();
        }
    }

    public /* synthetic */ iej(u090 u090Var) {
        this.b = 4;
    }
}
