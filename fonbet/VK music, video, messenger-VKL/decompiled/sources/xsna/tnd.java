package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.im.engine.models.ImBgSyncState;
import java.io.IOException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class tnd implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tnd(fws fwsVar, boolean z) {
        this.b = 1;
        this.d = fwsVar;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                und undVar = (und) this.d;
                vqt vqtVar = (vqt) obj;
                if (this.c) {
                    undVar.m.e(vqtVar.a.size());
                } else {
                    undVar.m.e(vqtVar.a.size() + vqtVar.c);
                }
                return s3q0.a;
            case 1:
                fws fwsVar = (fws) this.d;
                VKList vKList = (VKList) obj;
                com.vk.lists.c cVar = ((afi0) fwsVar.k.c).o;
                fwsVar.a.c = vKList;
                if (cVar != null) {
                    cVar.q(vKList.size());
                }
                if (cVar != null) {
                    cVar.r(vKList.k() == 1);
                }
                io.reactivex.rxjava3.subjects.f<s3q0> fVar = fwsVar.n;
                s3q0 s3q0Var = s3q0.a;
                fVar.onNext(s3q0Var);
                if (!this.c) {
                    fwsVar.a();
                }
                return s3q0Var;
            default:
                f840 f840Var = (f840) this.d;
                ImBgSyncState imBgSyncState = (ImBgSyncState) obj;
                if (!this.c) {
                    f840Var.getClass();
                    if (imBgSyncState == ImBgSyncState.DISCONNECTED || imBgSyncState == ImBgSyncState.CONNECTING) {
                        throw new IOException("Connection is not established");
                    }
                }
                return Boolean.valueOf(imBgSyncState == ImBgSyncState.CONNECTED || imBgSyncState == ImBgSyncState.REFRESHED);
        }
    }

    public /* synthetic */ tnd(boolean z, Object obj, int i) {
        this.b = i;
        this.c = z;
        this.d = obj;
    }
}
