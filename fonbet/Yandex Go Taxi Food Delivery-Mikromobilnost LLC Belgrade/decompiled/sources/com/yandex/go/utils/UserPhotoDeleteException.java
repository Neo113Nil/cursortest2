package com.yandex.go.utils;

import defpackage.xq21;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/utils/UserPhotoDeleteException;", "Lcom/yandex/go/utils/UserPhotoException;", "Lxq21;", "userPhotoUploadingInfo", "Lxq21;", "a", "()Lxq21;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UserPhotoDeleteException extends UserPhotoException {
    private final xq21 userPhotoUploadingInfo;

    public UserPhotoDeleteException(xq21 xq21Var) {
        this.userPhotoUploadingInfo = xq21Var;
    }

    /* renamed from: a, reason: from getter */
    public final xq21 getUserPhotoUploadingInfo() {
        return this.userPhotoUploadingInfo;
    }
}
