package defpackage;

import com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.action.serializer.IntercityOpenShuttleClarifyPointAction;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class dnw {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[IntercityOpenShuttleClarifyPointAction.FlexPointType.values().length];
        try {
            iArr[IntercityOpenShuttleClarifyPointAction.FlexPointType.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IntercityOpenShuttleClarifyPointAction.FlexPointType.DESTINATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
