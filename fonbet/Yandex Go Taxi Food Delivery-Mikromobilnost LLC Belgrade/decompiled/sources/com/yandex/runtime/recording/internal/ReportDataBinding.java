package com.yandex.runtime.recording.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.recording.ReportData;
import java.util.List;

/* loaded from: classes2.dex */
public class ReportDataBinding implements ReportData {
    private final NativeObject nativeObject;

    public ReportDataBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.runtime.recording.ReportData
    public native byte[] data();

    @Override // com.yandex.runtime.recording.ReportData
    public native long getEndTime();

    @Override // com.yandex.runtime.recording.ReportData
    public native String getIssueId();

    @Override // com.yandex.runtime.recording.ReportData
    public native long getStartTime();

    @Override // com.yandex.runtime.recording.ReportData
    public native List<Long> problemMarks();

    @Override // com.yandex.runtime.recording.ReportData
    public native void setIssueId(String str);
}
