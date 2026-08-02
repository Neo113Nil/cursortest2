package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"LBluetoothAudioReceiverConnectionCallback;", "Landroid/media/AudioDeviceCallback;", "Lr2v;", "bluetoothAudioReporter", "<init>", "(Lr2v;)V", "", "Landroid/media/AudioDeviceInfo;", "addedDevices", "Lzy11;", "onAudioDevicesAdded", "([Landroid/media/AudioDeviceInfo;)V", "removedDevices", "onAudioDevicesRemoved", "Lr2v;", "yx_platform_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BluetoothAudioReceiverConnectionCallback extends AudioDeviceCallback {
    private final r2v bluetoothAudioReporter;

    public BluetoothAudioReceiverConnectionCallback(r2v r2vVar) {
        this.bluetoothAudioReporter = r2vVar;
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesAdded(AudioDeviceInfo[] addedDevices) {
        for (AudioDeviceInfo audioDeviceInfo : addedDevices) {
            if (((ymu) this.bluetoothAudioReporter).n(audioDeviceInfo.getType())) {
                ((ymu) this.bluetoothAudioReporter).x("add", audioDeviceInfo);
            }
        }
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesRemoved(AudioDeviceInfo[] removedDevices) {
        for (AudioDeviceInfo audioDeviceInfo : removedDevices) {
            if (((ymu) this.bluetoothAudioReporter).n(audioDeviceInfo.getType())) {
                ((ymu) this.bluetoothAudioReporter).x("remove", audioDeviceInfo);
            }
        }
    }
}
