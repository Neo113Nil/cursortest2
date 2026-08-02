package xsna;

import com.vk.dto.common.Peer;

/* compiled from: MemberInfoExt.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class v120 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[Peer.Type.values().length];
        try {
            iArr[Peer.Type.USER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Peer.Type.CONTACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Peer.Type.EMAIL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Peer.Type.GROUP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
