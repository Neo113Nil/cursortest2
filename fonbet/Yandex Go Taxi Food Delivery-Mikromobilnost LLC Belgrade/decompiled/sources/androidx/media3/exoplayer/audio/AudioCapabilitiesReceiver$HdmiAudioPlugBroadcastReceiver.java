package androidx.media3.exoplayer.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.ye3;

/* loaded from: classes10.dex */
final class AudioCapabilitiesReceiver$HdmiAudioPlugBroadcastReceiver extends BroadcastReceiver {
    final /* synthetic */ a this$0;

    private AudioCapabilitiesReceiver$HdmiAudioPlugBroadcastReceiver(a aVar) {
        this.this$0 = aVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        a aVar = this.this$0;
        aVar.a(ye3.c(context, intent, aVar.i, aVar.h));
    }
}
