package com.yandex.go.payments.cards.nfc.domain;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.nfc.tech.IsoDep;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yandex.go.payments.cards.nfc.data.NfcBankCardRepositoryImpl$addBankCardListener$job$1$invokeSuspend$$inlined$safeCollect$2$1;
import defpackage.jl40;
import defpackage.jx81;
import defpackage.mdh;
import defpackage.pey;
import defpackage.qke;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes13.dex */
public final class a implements DefaultLifecycleObserver {
    public final ComponentActivity a;
    public final NfcAdapter b;
    public boolean c;
    public final PendingIntent w;
    public final IntentFilter[] x;
    public final String[][] y;
    public final CardNfcReader$receiver$1 z;

    /* JADX WARN: Type inference failed for: r3v8, types: [com.yandex.go.payments.cards.nfc.domain.CardNfcReader$receiver$1] */
    public a(ComponentActivity componentActivity, NfcAdapter nfcAdapter) {
        this.a = componentActivity;
        this.b = nfcAdapter;
        this.w = PendingIntent.getActivity(componentActivity, 0, new Intent(componentActivity, componentActivity.getClass()).addFlags(536870912), jx81.e() ? SelfTester_JCP.DECRYPT_CFB : 0);
        this.x = new IntentFilter[]{new IntentFilter("android.nfc.action.TECH_DISCOVERED"), new IntentFilter("android.nfc.action.TAG_DISCOVERED")};
        this.y = new String[][]{new String[]{IsoDep.class.getName()}};
        this.z = new BroadcastReceiver() { // from class: com.yandex.go.payments.cards.nfc.domain.CardNfcReader$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (jl40.l(intent.getAction(), "android.nfc.action.ADAPTER_STATE_CHANGED") && intent.getIntExtra("android.nfc.extra.ADAPTER_STATE", 1) == 3) {
                    a aVar = a.this;
                    aVar.b.enableForegroundDispatch(aVar.a, aVar.w, aVar.x, aVar.y);
                }
            }
        };
    }

    public final Object a(Intent intent, NfcBankCardRepositoryImpl$addBankCardListener$job$1$invokeSuspend$$inlined$safeCollect$2$1 nfcBankCardRepositoryImpl$addBankCardListener$job$1$invokeSuspend$$inlined$safeCollect$2$1) {
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new CardNfcReader$readCard$2(this, intent, null), nfcBankCardRepositoryImpl$addBankCardListener$job$1$invokeSuspend$$inlined$safeCollect$2$1);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(pey peyVar) {
        boolean z = this.c;
        ComponentActivity componentActivity = this.a;
        if (z) {
            componentActivity.unregisterReceiver(this.z);
            this.c = false;
        }
        this.b.disableForegroundDispatch(componentActivity);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(pey peyVar) {
        IntentFilter intentFilter = new IntentFilter("android.nfc.action.ADAPTER_STATE_CHANGED");
        ComponentActivity componentActivity = this.a;
        qke.z(componentActivity, this.z, intentFilter, 2);
        this.c = true;
        this.b.enableForegroundDispatch(componentActivity, this.w, this.x, this.y);
    }
}
