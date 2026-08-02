package sg.bigo.ads.am;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import sg.bigo.ads.am.b;
import xsna.eok;
import xsna.kok;
import xsna.lok;
import xsna.nok;
import xsna.ook;
import xsna.smv;

/* loaded from: classes9.dex */
public final class a implements d {
    public lok a;
    public nok b;
    public InterfaceC2427a c;
    public eok d;
    private ook e;

    /* renamed from: sg.bigo.ads.am.a$a, reason: collision with other inner class name */
    public interface InterfaceC2427a {
        void c();

        void d();
    }

    public interface b {
        void a(Context context, b.a aVar);

        void a(b.a aVar);
    }

    @Override // sg.bigo.ads.am.d
    public final void a(lok lokVar) {
        this.a = lokVar;
        lokVar.getClass();
        try {
            lokVar.a.V0();
        } catch (RemoteException unused) {
        }
        InterfaceC2427a interfaceC2427a = this.c;
        if (interfaceC2427a != null) {
            interfaceC2427a.c();
        }
    }

    @Override // sg.bigo.ads.am.d
    public final void b() {
        this.a = null;
        this.e = null;
        InterfaceC2427a interfaceC2427a = this.c;
        if (interfaceC2427a != null) {
            interfaceC2427a.d();
        }
    }

    public final ook a() {
        lok lokVar = this.a;
        ook ookVar = null;
        if (lokVar == null) {
            this.e = null;
        } else if (this.e == null) {
            eok eokVar = new eok() { // from class: sg.bigo.ads.am.a.1
                @Override // xsna.eok
                public final void extraCallback(String str, Bundle bundle) {
                    super.extraCallback(str, bundle);
                }

                @Override // xsna.eok
                public final void onMessageChannelReady(Bundle bundle) {
                    super.onMessageChannelReady(bundle);
                }

                @Override // xsna.eok
                public final void onNavigationEvent(int i, @Nullable Bundle bundle) {
                    super.onNavigationEvent(i, bundle);
                    eok eokVar2 = a.this.d;
                    if (eokVar2 != null) {
                        eokVar2.onNavigationEvent(i, bundle);
                    }
                }

                @Override // xsna.eok
                public final void onPostMessage(String str, Bundle bundle) {
                    super.onPostMessage(str, bundle);
                }

                @Override // xsna.eok
                public final void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
                    super.onRelationshipValidationResult(i, uri, z, bundle);
                }
            };
            smv smvVar = lokVar.a;
            kok kokVar = new kok(eokVar);
            try {
                if (smvVar.O(kokVar)) {
                    ookVar = new ook(smvVar, kokVar, lokVar.b);
                }
            } catch (RemoteException unused) {
            }
            this.e = ookVar;
        }
        return this.e;
    }
}
