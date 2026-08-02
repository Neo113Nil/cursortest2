package com.ybsdk.feature.divkit.internal.domain.hmac;

import com.ybsdk.feature.divkit.internal.domain.hmac.HmacData;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[HmacData.KeyType.values().length];
        try {
            iArr[HmacData.KeyType.SESSION_ID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HmacData.KeyType.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[HmacData.Item.Type.values().length];
        try {
            iArr2[HmacData.Item.Type.VALUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[HmacData.Item.Type.IDEMPOTENCY_TOKEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[HmacData.Item.Type.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
