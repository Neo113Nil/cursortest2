package com.yandex.runtime.recording;

import java.util.List;

/* loaded from: classes2.dex */
public interface ReportData {
    byte[] data();

    long getEndTime();

    String getIssueId();

    long getStartTime();

    List<Long> problemMarks();

    void setIssueId(String str);
}
