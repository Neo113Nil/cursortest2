package com.yandex.payment.sdk.nfcscanner.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.bvf0;
import defpackage.cvu0;
import defpackage.j860;
import defpackage.n4u0;
import defpackage.pz40;
import defpackage.tje;
import defpackage.tse;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/yandex/payment/sdk/nfcscanner/tools/NfcEnableReceiver;", "Landroid/content/BroadcastReceiver;", "", "isEnableAtStart", "<init>", "(Z)V", "Ltse;", "coroutineScope", "Lzy11;", "attachToScope", "(Ltse;)V", "detachFromScope", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lpz40;", "_isEnable", "Lpz40;", "Ln4u0;", "isEnable", "Ln4u0;", "()Ln4u0;", "scope", "Ltse;", "Companion", "j860", "nfcscanner_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NfcEnableReceiver extends BroadcastReceiver {
    public static final j860 Companion = new j860();
    private final pz40 _isEnable;
    private final n4u0 isEnable;
    private tse scope;

    public NfcEnableReceiver(boolean z) {
        r0 c = bvf0.c(Boolean.valueOf(z));
        this._isEnable = c;
        this.isEnable = c;
    }

    public final void attachToScope(tse coroutineScope) {
        this.scope = coroutineScope;
    }

    public final void detachFromScope() {
        this.scope = null;
    }

    /* renamed from: isEnable, reason: from getter */
    public final n4u0 getIsEnable() {
        return this.isEnable;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        tse tseVar;
        if (cvu0.t(intent.getAction(), "android.nfc.action.ADAPTER_STATE_CHANGED", false)) {
            int intExtra = intent.getIntExtra("android.nfc.extra.ADAPTER_STATE", 1);
            if (intExtra == 1) {
                tse tseVar2 = this.scope;
                if (tseVar2 != null) {
                    tje.N(tseVar2, null, null, new NfcEnableReceiver$onReceive$2(this, null), 3);
                    return;
                }
                return;
            }
            if (intExtra == 2) {
                tse tseVar3 = this.scope;
                if (tseVar3 != null) {
                    tje.N(tseVar3, null, null, new NfcEnableReceiver$onReceive$3(this, null), 3);
                    return;
                }
                return;
            }
            if (intExtra != 3) {
                if (intExtra == 4 && (tseVar = this.scope) != null) {
                    tje.N(tseVar, null, null, new NfcEnableReceiver$onReceive$4(this, null), 3);
                    return;
                }
                return;
            }
            tse tseVar4 = this.scope;
            if (tseVar4 != null) {
                tje.N(tseVar4, null, null, new NfcEnableReceiver$onReceive$1(this, null), 3);
            }
        }
    }
}
