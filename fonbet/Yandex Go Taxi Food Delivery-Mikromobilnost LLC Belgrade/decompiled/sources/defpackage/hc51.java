package defpackage;

import com.apollographql.apollo3.network.ws.WsFrameType;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class hc51 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WsFrameType.values().length];
        try {
            iArr[WsFrameType.Text.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WsFrameType.Binary.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
