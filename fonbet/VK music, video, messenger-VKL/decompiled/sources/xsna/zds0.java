package xsna;

import ru.ok.media.utils.DataSample;

/* compiled from: VideoDataCallback.java */
/* loaded from: classes12.dex */
public interface zds0 {
    void handleFormatChange(byte[] bArr);

    void handleSampleData(DataSample dataSample, long j, boolean z, int i);

    boolean isBlocked();

    boolean isKeyFrameRequested();
}
