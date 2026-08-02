package xsna;

import com.vk.im.engine.models.ImBgSyncState;

/* compiled from: VcUtils.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class tkr0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ImBgSyncState.values().length];
        try {
            iArr[ImBgSyncState.CONNECTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ImBgSyncState.REFRESHING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ImBgSyncState.REFRESHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ImBgSyncState.CONNECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
