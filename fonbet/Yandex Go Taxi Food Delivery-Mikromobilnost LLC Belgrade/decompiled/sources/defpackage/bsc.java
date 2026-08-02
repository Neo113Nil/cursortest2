package defpackage;

import com.ybsdk.widgets.common.communication.CommunicationFullScreenView$State$Type;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class bsc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CommunicationFullScreenView$State$Type.values().length];
        try {
            iArr[CommunicationFullScreenView$State$Type.VIDEO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CommunicationFullScreenView$State$Type.GRAPHIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CommunicationFullScreenView$State$Type.DESCRIPTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
