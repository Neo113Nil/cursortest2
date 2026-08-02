package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;

/* compiled from: ClipsFeedAnalyticContextHolder.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class x5e {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[ClipFeedTab.TopVideo.Mode.values().length];
        try {
            iArr[ClipFeedTab.TopVideo.Mode.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ClipFeedTab.TopVideo.Mode.FROM_RETENTION_BLOCK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[ClipFeedTab.MusicTemplate.IdType.values().length];
        try {
            iArr2[ClipFeedTab.MusicTemplate.IdType.AudioId.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ClipFeedTab.MusicTemplate.IdType.ClipId.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
