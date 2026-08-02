package defpackage;

import android.content.Context;
import com.yandex.quark.capability.CapabilityListener;
import com.yandex.quark.file.download.handler.a;
import java.util.LinkedHashSet;
import kotlin.collections.b;
import okhttp3.OkHttpClient;
import okio.ByteString;
import ru.yandex.alice.protos.endpoint.capabilities.quark.file.download.TAliceFileDownloadCapability;
import ru.yandex.alice.protos.endpoint.platform.utils.TCapability;
import ru.yandex.alice.protos.endpoint.quark.file.download.TCapability;

/* loaded from: classes8.dex */
public final class ls1 implements e2z {
    public final LinkedHashSet a;
    public final String b;
    public final ul2 c;
    public final a d;
    public final String e;

    /* JADX WARN: Multi-variable type inference failed */
    public ls1(zwf0 zwf0Var, eya0 eya0Var, oza0 oza0Var, Context context, ike ikeVar, wly0 wly0Var, OkHttpClient.a aVar, zq6 zq6Var) {
        OkHttpClient okHttpClient = new OkHttpClient(aVar);
        au50 au50Var = new au50(15, zwf0Var);
        com.yandex.quark.file.download.request.a aVar2 = new com.yandex.quark.file.download.request.a(okHttpClient, au50Var, zwf0Var, wly0Var);
        com.yandex.quark.file.download.tracking.a aVar3 = new com.yandex.quark.file.download.tracking.a(context, zwf0Var, zq6Var, wly0Var, ikeVar);
        this.a = new LinkedHashSet();
        t830 t830Var = new t830(b.f(), true);
        this.b = "AliceFileDownloadCapability";
        TCapability.TMeta tMeta = null;
        TAliceFileDownloadCapability.TParameters tParameters = null;
        ByteString byteString = null;
        this.c = new ul2(TCapability.ECapabilityType.AliceFileDownloadCapabilityType, new TAliceFileDownloadCapability(tMeta, tParameters, new TAliceFileDownloadCapability.TState(null, 1, 0 == true ? 1 : 0), byteString, 11, null), t830Var);
        this.d = new a(t830Var, zwf0Var, context, ikeVar, au50Var, aVar2, aVar3);
        this.e = "FileDownloadModule";
    }

    @Override // defpackage.u28
    public final String a() {
        return this.b;
    }

    @Override // defpackage.u28
    public final synchronized syj0 b(CapabilityListener capabilityListener) {
        syj0 jyj0Var;
        try {
            if (this.a.add(capabilityListener)) {
                capabilityListener.onStateChanged(getCurrentState());
                jyj0Var = new lyj0(new ks1(0, this, capabilityListener));
            } else {
                jyj0Var = new jyj0(new upi0());
            }
        } catch (Throwable th) {
            throw th;
        }
        return jyj0Var;
    }

    @Override // defpackage.u28
    public final String c() {
        return this.e;
    }

    @Override // defpackage.u28
    public final bnj d() {
        return this.d;
    }

    @Override // defpackage.u28
    public final synchronized png getCurrentState() {
        return this.c;
    }
}
