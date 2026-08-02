package ru.mail.libverify.platform.core;

import xsna.epx;
import xsna.ho8;

/* compiled from: SmsRetrieverResult.kt */
/* loaded from: classes9.dex */
public final class SmsRetrieverResult {
    private final String resultMessage;
    private final int resultStatus;

    public SmsRetrieverResult(int i, String str) {
        this.resultStatus = i;
        this.resultMessage = str;
    }

    public static /* synthetic */ SmsRetrieverResult copy$default(SmsRetrieverResult smsRetrieverResult, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = smsRetrieverResult.resultStatus;
        }
        if ((i2 & 2) != 0) {
            str = smsRetrieverResult.resultMessage;
        }
        return smsRetrieverResult.copy(i, str);
    }

    public final int component1() {
        return this.resultStatus;
    }

    public final String component2() {
        return this.resultMessage;
    }

    public final SmsRetrieverResult copy(int i, String str) {
        return new SmsRetrieverResult(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmsRetrieverResult)) {
            return false;
        }
        SmsRetrieverResult smsRetrieverResult = (SmsRetrieverResult) obj;
        return this.resultStatus == smsRetrieverResult.resultStatus && epx.f(this.resultMessage, smsRetrieverResult.resultMessage);
    }

    public final String getResultMessage() {
        return this.resultMessage;
    }

    public final int getResultStatus() {
        return this.resultStatus;
    }

    public int hashCode() {
        return this.resultMessage.hashCode() + (Integer.hashCode(this.resultStatus) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SmsRetrieverResult(resultStatus=");
        sb.append(this.resultStatus);
        sb.append(", resultMessage=");
        return ho8.a(sb, this.resultMessage, ')');
    }
}
