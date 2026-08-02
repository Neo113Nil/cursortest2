package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.reporters.api.analytics.click.ImCallTypeAnalyticsItem;

/* compiled from: ImCallTypeAnalyticsItem.kt */
/* loaded from: classes2.dex */
public final class fyv {

    /* compiled from: ImCallTypeAnalyticsItem.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Peer.Type.values().length];
            try {
                iArr[Peer.Type.CONTACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Peer.Type.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Peer.Type.CHAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ImCallTypeAnalyticsItem a(Peer.Type type) {
        int i = a.$EnumSwitchMapping$0[type.ordinal()];
        return i != 1 ? (i == 2 || i == 3) ? ImCallTypeAnalyticsItem.GROUP : ImCallTypeAnalyticsItem.USER : ImCallTypeAnalyticsItem.CONTACT;
    }
}
