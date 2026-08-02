package com.yandex.xplat.common;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/xplat/common/NetworkMethod;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "get", "post", "xplat-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NetworkMethod {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NetworkMethod[] $VALUES;
    public static final NetworkMethod get;
    public static final NetworkMethod post;
    private final String value;

    static {
        NetworkMethod networkMethod = new NetworkMethod("get", 0, "get");
        get = networkMethod;
        NetworkMethod networkMethod2 = new NetworkMethod("post", 1, "post");
        post = networkMethod2;
        NetworkMethod[] networkMethodArr = {networkMethod, networkMethod2};
        $VALUES = networkMethodArr;
        $ENTRIES = kotlin.enums.a.a(networkMethodArr);
    }

    public NetworkMethod(String str, int i, String str2) {
        this.value = str2;
    }

    public static NetworkMethod valueOf(String str) {
        return (NetworkMethod) Enum.valueOf(NetworkMethod.class, str);
    }

    public static NetworkMethod[] values() {
        return (NetworkMethod[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
