package com.yandex.go.payments.cards.nfc.data;

import android.nfc.NfcAdapter;
import androidx.activity.ComponentActivity;
import com.yandex.go.payments.cards.nfc.experiments.NfcScanCardExperiment;
import defpackage.bvf0;
import defpackage.d6z;
import defpackage.ddf;
import defpackage.g18;
import defpackage.ike;
import defpackage.l30;
import defpackage.q760;
import defpackage.s760;
import defpackage.tje;
import java.util.concurrent.atomic.AtomicInteger;
import ru.yandex.taxi.activity.i;

/* loaded from: classes13.dex */
public final class b implements s760 {
    public final i a;
    public final q760 b;
    public final NfcScanCardExperiment c;
    public final com.yandex.go.payments.cards.nfc.domain.a d;
    public final AtomicInteger e = new AtomicInteger(0);
    public final ike f = bvf0.b();

    public b(ComponentActivity componentActivity, i iVar, q760 q760Var, NfcScanCardExperiment nfcScanCardExperiment) {
        this.a = iVar;
        this.b = q760Var;
        this.c = nfcScanCardExperiment;
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(componentActivity);
        if (defaultAdapter != null) {
            this.d = new com.yandex.go.payments.cards.nfc.domain.a(componentActivity, defaultAdapter);
        }
    }

    @Override // defpackage.s760
    public final String a() {
        NfcScanCardExperiment nfcScanCardExperiment = this.c;
        return d6z.Y(nfcScanCardExperiment, nfcScanCardExperiment.d.c);
    }

    @Override // defpackage.s760
    public final g18 b(ddf ddfVar) {
        com.yandex.go.payments.cards.nfc.domain.a aVar;
        if (this.e.incrementAndGet() == 1 && (aVar = this.d) != null) {
            aVar.a.getLifecycle().a(aVar);
        }
        return new l30(11, tje.N(this.f, null, null, new NfcBankCardRepositoryImpl$addBankCardListener$job$1(this, ddfVar, null), 3), this);
    }

    @Override // defpackage.s760
    public final boolean c() {
        com.yandex.go.payments.cards.nfc.domain.a aVar;
        return this.c.d.a && (aVar = this.d) != null && aVar.b.isEnabled();
    }

    @Override // defpackage.s760
    public final String d() {
        NfcScanCardExperiment nfcScanCardExperiment = this.c;
        return d6z.Y(nfcScanCardExperiment, nfcScanCardExperiment.d.b);
    }
}
