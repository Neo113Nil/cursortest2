package com.yandex.fintechsdk.core.nfc.impl.internal.nfcstate;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.yandex.fintechsdk.core.nfc.impl.internal.a;
import defpackage.ca60;
import defpackage.ea60;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.keo;
import defpackage.uk10;
import kotlin.Metadata;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/yandex/fintechsdk/core/nfc/impl/internal/nfcstate/NfcStateReceiver;", "Landroid/content/BroadcastReceiver;", "Lca60;", "listener", "<init>", "(Lca60;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lca60;", "Companion", "ea60", "impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NfcStateReceiver extends BroadcastReceiver {
    public static final ea60 Companion = new ea60();
    private final ca60 listener;

    public NfcStateReceiver(ca60 ca60Var) {
        this.listener = ca60Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (jl40.l(intent != null ? intent.getAction() : null, "android.nfc.action.ADAPTER_STATE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.nfc.extra.ADAPTER_STATE", 1);
            if (intExtra == 1) {
                a aVar = (a) ((uk10) this.listener).a;
                ((com.yandex.fintechsdk.core.analytics.impl.internal.a) aVar.b).a(new keo("nfc_off", g8e.z(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "NFC модуль выключен")));
                aVar.a.a(false);
            } else {
                if (intExtra != 3) {
                    return;
                }
                a aVar2 = (a) ((uk10) this.listener).a;
                ((com.yandex.fintechsdk.core.analytics.impl.internal.a) aVar2.b).a(new keo("nfc_on", g8e.z(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "NFC модуль включен")));
                aVar2.a.a(true);
                aVar2.h.invoke();
            }
        }
    }
}
