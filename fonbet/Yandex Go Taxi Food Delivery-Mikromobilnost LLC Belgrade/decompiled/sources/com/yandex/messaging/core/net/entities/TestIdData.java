package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.x4e;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/yandex/messaging/core/net/entities/TestIdData;", "", "bucket", "", "testId", "", "<init>", "(JLjava/lang/String;)V", "getBucket", "()J", "getTestId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TestIdData {
    private final long bucket;
    private final String testId;

    public TestIdData(@Json(name = "Bucket") long j, @Json(name = "Testid") String str) {
        this.bucket = j;
        this.testId = str;
    }

    public static /* synthetic */ TestIdData copy$default(TestIdData testIdData, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = testIdData.bucket;
        }
        if ((i & 2) != 0) {
            str = testIdData.testId;
        }
        return testIdData.copy(j, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getBucket() {
        return this.bucket;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTestId() {
        return this.testId;
    }

    public final TestIdData copy(@Json(name = "Bucket") long bucket, @Json(name = "Testid") String testId) {
        return new TestIdData(bucket, testId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TestIdData)) {
            return false;
        }
        TestIdData testIdData = (TestIdData) other;
        return this.bucket == testIdData.bucket && jl40.l(this.testId, testIdData.testId);
    }

    public final long getBucket() {
        return this.bucket;
    }

    public final String getTestId() {
        return this.testId;
    }

    public int hashCode() {
        return this.testId.hashCode() + (Long.hashCode(this.bucket) * 31);
    }

    public String toString() {
        StringBuilder k = x4e.k("TestIdData(bucket=", this.bucket, ", testId=", this.testId);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
