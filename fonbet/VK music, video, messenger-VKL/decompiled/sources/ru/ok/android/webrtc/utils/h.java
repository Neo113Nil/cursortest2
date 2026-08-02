package ru.ok.android.webrtc.utils;

import java.util.Comparator;
import org.webrtc.CameraEnumerationAndroid;

/* loaded from: classes9.dex */
public final class h implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        CameraEnumerationAndroid.CaptureFormat captureFormat = (CameraEnumerationAndroid.CaptureFormat) obj;
        CameraEnumerationAndroid.CaptureFormat captureFormat2 = (CameraEnumerationAndroid.CaptureFormat) obj2;
        return Integer.compare(captureFormat2.width * captureFormat2.height, captureFormat.width * captureFormat.height);
    }
}
