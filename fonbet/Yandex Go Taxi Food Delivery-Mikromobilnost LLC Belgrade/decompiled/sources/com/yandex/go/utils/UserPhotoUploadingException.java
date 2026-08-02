package com.yandex.go.utils;

import defpackage.xq21;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/utils/UserPhotoUploadingException;", "Lcom/yandex/go/utils/UserPhotoException;", "", "photoByteArray", "[B", "a", "()[B", "Lxq21;", "userPhotoUploadingInfo", "Lxq21;", "b", "()Lxq21;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UserPhotoUploadingException extends UserPhotoException {
    private final byte[] photoByteArray;
    private final xq21 userPhotoUploadingInfo;

    public UserPhotoUploadingException(byte[] bArr, xq21 xq21Var) {
        this.photoByteArray = bArr;
        this.userPhotoUploadingInfo = xq21Var;
    }

    /* renamed from: a, reason: from getter */
    public final byte[] getPhotoByteArray() {
        return this.photoByteArray;
    }

    /* renamed from: b, reason: from getter */
    public final xq21 getUserPhotoUploadingInfo() {
        return this.userPhotoUploadingInfo;
    }
}
