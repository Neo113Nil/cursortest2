package xsna;

import android.os.SystemClock;
import com.vk.contacts.ContactSyncState;
import kotlin.Triple;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class yqd implements izs {
    public final /* synthetic */ int b;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((Boolean) obj).booleanValue();
                return s3q0.a;
            default:
                Triple triple = (Triple) obj;
                Boolean bool = (Boolean) triple.d();
                Boolean bool2 = (Boolean) triple.g();
                ContactSyncState contactSyncState = (ContactSyncState) triple.h();
                long j = com.vk.contacts.e.h.get();
                boolean z = j < 0 || SystemClock.elapsedRealtime() - j > com.vk.contacts.e.i;
                contactSyncState.getClass();
                return Boolean.valueOf(bool.booleanValue() && bool2.booleanValue() && (contactSyncState == ContactSyncState.PERMITTED || contactSyncState == ContactSyncState.DONE) && z && com.vk.toggle.b.A.b());
        }
    }
}
