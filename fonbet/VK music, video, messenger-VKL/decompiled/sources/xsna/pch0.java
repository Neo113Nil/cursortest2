package xsna;

import android.os.PowerManager;
import com.vk.voip.VoipCallActivity;
import com.vk.voip.dto.AudioDevice;
import com.vk.voip.ui.VoipViewModelState;

/* compiled from: ScreenOffWakeLock.kt */
/* loaded from: classes7.dex */
public final class pch0 {
    public static final String h = "voip:".concat(pch0.class.getSimpleName());
    public final PowerManager a;
    public PowerManager.WakeLock c;
    public boolean d;
    public boolean g;
    public final io.reactivex.rxjava3.disposables.b b = new io.reactivex.rxjava3.disposables.b();
    public VoipViewModelState e = VoipViewModelState.Idle;
    public AudioDevice f = AudioDevice.NONE;

    public pch0(VoipCallActivity voipCallActivity) {
        this.a = (PowerManager) voipCallActivity.getApplicationContext().getSystemService(PowerManager.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        VoipViewModelState voipViewModelState = this.e;
        Object[] objArr = voipViewModelState == VoipViewModelState.Idle;
        Object[] objArr2 = voipViewModelState == VoipViewModelState.ReceivingCallFromPeer;
        Object[] objArr3 = voipViewModelState == VoipViewModelState.RecordingAudioMessage;
        boolean z = this.f == AudioDevice.EARPIECE;
        try {
            if (!this.d || objArr == true || objArr2 == true || objArr3 == true || this.g || !z) {
                PowerManager.WakeLock wakeLock = this.c;
                if (wakeLock == null || !wakeLock.isHeld()) {
                    return;
                }
                wakeLock.release(this.d ? 1 : 0);
                return;
            }
            if (this.c == null) {
                this.c = this.a.newWakeLock(32, h);
            }
            PowerManager.WakeLock wakeLock2 = this.c;
            if (wakeLock2 == null || wakeLock2.isHeld()) {
                return;
            }
            wakeLock2.acquire();
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.a(th);
        }
    }
}
