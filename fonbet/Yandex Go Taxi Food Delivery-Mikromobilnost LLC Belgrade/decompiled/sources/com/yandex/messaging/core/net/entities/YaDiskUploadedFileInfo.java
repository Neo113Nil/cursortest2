package com.yandex.messaging.core.net.entities;

import defpackage.jl40;
import defpackage.ly3;
import defpackage.oyr;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/core/net/entities/YaDiskUploadedFileInfo;", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class YaDiskUploadedFileInfo {
    public final boolean a;
    public final String b;
    public final long c;

    public YaDiskUploadedFileInfo(String str, long j, boolean z) {
        this.a = z;
        this.b = str;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YaDiskUploadedFileInfo)) {
            return false;
        }
        YaDiskUploadedFileInfo yaDiskUploadedFileInfo = (YaDiskUploadedFileInfo) obj;
        return this.a == yaDiskUploadedFileInfo.a && jl40.l(this.b, yaDiskUploadedFileInfo.b) && this.c == yaDiskUploadedFileInfo.c;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return Long.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return oyr.n(this.c, Extension.C_BRAKE, ly3.v("YaDiskUploadedFileInfo(isSuccessful=", ", location=", this.b, ", fileSize=", this.a));
    }
}
