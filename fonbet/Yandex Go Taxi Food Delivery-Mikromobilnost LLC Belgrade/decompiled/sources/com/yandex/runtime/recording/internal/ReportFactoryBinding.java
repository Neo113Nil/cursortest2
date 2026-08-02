package com.yandex.runtime.recording.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.recording.ReportData;
import com.yandex.runtime.recording.ReportFactory;

/* loaded from: classes2.dex */
public class ReportFactoryBinding implements ReportFactory {
    private final NativeObject nativeObject;

    public ReportFactoryBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.runtime.recording.ReportFactory
    public native ReportData createReportData(byte[] bArr);
}
