package ru.ok.proto.okmp;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes9.dex */
public class PlatformSpecificInfo {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public PlatformSpecificInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(PlatformSpecificInfo platformSpecificInfo) {
        if (platformSpecificInfo == null) {
            return 0L;
        }
        return platformSpecificInfo.swigCPtr;
    }

    public static long swigRelease(PlatformSpecificInfo platformSpecificInfo) {
        if (platformSpecificInfo == null) {
            return 0L;
        }
        if (!platformSpecificInfo.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = platformSpecificInfo.swigCPtr;
        platformSpecificInfo.swigCMemOwn = false;
        platformSpecificInfo.delete();
        return j;
    }

    public synchronized void delete() {
        try {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    OkmpJNI.delete_PlatformSpecificInfo(j);
                }
                this.swigCPtr = 0L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void finalize() {
        delete();
    }

    public PlatformSpecificInfo(String str, String str2, String str3, String str4, String str5) {
        this(OkmpJNI.new_PlatformSpecificInfo(str, str2, str3, str4, str5), true);
    }
}
