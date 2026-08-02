package xsna;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.internal.consent_sdk.zzbn;
import com.google.android.gms.internal.consent_sdk.zzcr;
import com.google.android.ump.ConsentInformation;
import xsna.b5j;
import xsna.d8s;

/* compiled from: GoogleUmpUserConsentInfo.kt */
/* loaded from: classes2.dex */
public final class rau implements qgq0 {
    public final ConsentInformation a;
    public final h1j b;

    public rau(ConsentInformation consentInformation, h1j h1jVar) {
        this.a = consentInformation;
        this.b = h1jVar;
    }

    @Override // xsna.qgq0
    public final void a(FragmentActivity fragmentActivity, final x620 x620Var) {
        oau oauVar = ((nau) this.b.c).e;
        if (oauVar != null) {
            oauVar.b();
        }
        com.google.android.gms.internal.consent_sdk.zza.zza(fragmentActivity).zzc().zze(fragmentActivity, new b5j.a() { // from class: xsna.qau
            @Override // xsna.b5j.a
            public final void a(d8s d8sVar) {
                oau oauVar2 = ((nau) rau.this.b.c).e;
                if (oauVar2 != null) {
                    oauVar2.g(d8sVar == null);
                }
                x620Var.invoke(d8sVar != null ? new g2q0(d8sVar.a, d8sVar.b) : null);
            }
        });
    }

    public final int b() {
        int consentStatus = this.a.getConsentStatus();
        int i = 2;
        if (consentStatus != 2) {
            i = 3;
            if (consentStatus != 3) {
                return 1;
            }
        }
        return i;
    }

    public final void c(final Activity activity, final izs<? super g2q0, s3q0> izsVar) {
        oau oauVar = ((nau) this.b.c).e;
        if (oauVar != null) {
            oauVar.d();
        }
        final b5j.a aVar = new b5j.a() { // from class: xsna.pau
            @Override // xsna.b5j.a
            public final void a(d8s d8sVar) {
                oau oauVar2 = ((nau) rau.this.b.c).e;
                if (oauVar2 != null) {
                    oauVar2.f(d8sVar == null);
                }
                izsVar.invoke(d8sVar != null ? new g2q0(d8sVar.a, d8sVar.b) : null);
            }
        };
        if (com.google.android.gms.internal.consent_sdk.zza.zza(activity).zzb().canRequestAds()) {
            aVar.a(null);
            return;
        }
        zzbn zzc = com.google.android.gms.internal.consent_sdk.zza.zza(activity).zzc();
        zzcr.zza();
        zzc.zzb(new ykq0() { // from class: com.google.android.gms.internal.consent_sdk.zzbl
            @Override // xsna.ykq0
            public final void onConsentFormLoadSuccess(b5j b5jVar) {
                b5jVar.show(activity, aVar);
            }
        }, new xkq0() { // from class: com.google.android.gms.internal.consent_sdk.zzbm
            @Override // xsna.xkq0
            public final void onConsentFormLoadFailure(d8s d8sVar) {
                b5j.a.this.a(d8sVar);
            }
        });
    }
}
