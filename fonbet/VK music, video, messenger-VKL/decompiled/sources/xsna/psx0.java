package xsna;

import com.vk.network.eventhub.api.ConnectionState;
import xsna.osx0;

/* compiled from: WithConnectionState.kt */
/* loaded from: classes3.dex */
public final class psx0 implements osx0.a {
    public final /* synthetic */ osx0 a;
    public final /* synthetic */ gzs<s3q0> b;

    public psx0(osx0 osx0Var, gzs<s3q0> gzsVar) {
        this.a = osx0Var;
        this.b = gzsVar;
    }

    @Override // xsna.osx0.a
    public final void a(ConnectionState connectionState) {
        if (connectionState == ConnectionState.CONNECTED) {
            this.a.a(this);
            this.b.invoke();
        }
    }
}
