package com.yandex.go.app.icon.api;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/app/icon/api/RestoreSource;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "RECEIVER", "PUSH", "go-client-android.features.app_icon:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RestoreSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RestoreSource[] $VALUES;
    public static final RestoreSource PUSH;
    public static final RestoreSource RECEIVER;
    private final String id;

    static {
        RestoreSource restoreSource = new RestoreSource("RECEIVER", 0, "receiver");
        RECEIVER = restoreSource;
        RestoreSource restoreSource2 = new RestoreSource("PUSH", 1, Constants.PUSH);
        PUSH = restoreSource2;
        RestoreSource[] restoreSourceArr = {restoreSource, restoreSource2};
        $VALUES = restoreSourceArr;
        $ENTRIES = a.a(restoreSourceArr);
    }

    public RestoreSource(String str, int i, String str2) {
        this.id = str2;
    }

    public static RestoreSource valueOf(String str) {
        return (RestoreSource) Enum.valueOf(RestoreSource.class, str);
    }

    public static RestoreSource[] values() {
        return (RestoreSource[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }
}
