package xsna;

import com.vk.clips.attachments.api.publish.cta.ClipsInvolvementType;

/* compiled from: ClipInvolvementActionButton.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class f0d {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ClipsInvolvementType.values().length];
        try {
            iArr[ClipsInvolvementType.MESSAGE_TO_BC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ClipsInvolvementType.ONLINE_BOOKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ClipsInvolvementType.OPEN_CHANNEL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ClipsInvolvementType.DONUT_LEVEL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ClipsInvolvementType.VK_TICKET.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
