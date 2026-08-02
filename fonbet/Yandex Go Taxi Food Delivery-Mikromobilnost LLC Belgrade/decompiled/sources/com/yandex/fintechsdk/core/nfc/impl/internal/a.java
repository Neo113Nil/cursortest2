package com.yandex.fintechsdk.core.nfc.impl.internal;

import android.nfc.NfcAdapter;
import android.nfc.tech.MifareClassic;
import androidx.appcompat.app.AppCompatActivity;
import com.yandex.fintechsdk.core.nfc.impl.internal.callback.NfcReaderCallback;
import com.yandex.fintechsdk.core.nfc.impl.internal.nfcstate.NfcStateReceiver;
import defpackage.agt;
import defpackage.bgc;
import defpackage.eja1;
import defpackage.h511;
import defpackage.sba1;
import defpackage.sls;
import defpackage.tje;
import defpackage.uk10;
import defpackage.z22;
import defpackage.zjy0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public final class a {
    public final agt a;
    public final z22 b;
    public NfcAdapter d;
    public MifareClassic e;
    public NfcReaderCallback f;
    public WeakReference c = new WeakReference(null);
    public WeakReference g = new WeakReference(null);
    public sls h = new bgc(12);
    public final NfcStateReceiver i = new NfcStateReceiver(new uk10(this));

    public a(agt agtVar, z22 z22Var) {
        this.a = agtVar;
        this.b = z22Var;
    }

    public final void a(ArrayList arrayList, zjy0 zjy0Var, h511 h511Var) {
        AppCompatActivity appCompatActivity = (AppCompatActivity) this.c.get();
        if (appCompatActivity != null) {
            tje.N(eja1.s(appCompatActivity), null, null, new NfcControllerImpl$readBlocks$1(this, arrayList, zjy0Var, h511Var, null), 3);
        }
    }

    public final void b() {
        c();
        AppCompatActivity appCompatActivity = (AppCompatActivity) this.c.get();
        if (appCompatActivity != null) {
            try {
                NfcAdapter nfcAdapter = this.d;
                if (nfcAdapter != null) {
                    nfcAdapter.disableReaderMode((AppCompatActivity) this.c.get());
                }
                appCompatActivity.unregisterReceiver(this.i);
            } catch (Exception e) {
                sba1.h(this.b, String.valueOf(e.getMessage()));
            }
        }
        this.h = new bgc(12);
    }

    public final void c() {
        try {
            MifareClassic mifareClassic = this.e;
            if (mifareClassic != null) {
                mifareClassic.close();
            }
            this.e = null;
        } catch (Exception e) {
            sba1.h(this.b, String.valueOf(e.getMessage()));
        }
    }

    public final void d(ArrayList arrayList, zjy0 zjy0Var, h511 h511Var) {
        AppCompatActivity appCompatActivity = (AppCompatActivity) this.c.get();
        if (appCompatActivity != null) {
            tje.N(eja1.s(appCompatActivity), null, null, new NfcControllerImpl$writeBlocks$1(this, arrayList, zjy0Var, h511Var, null), 3);
        }
    }
}
