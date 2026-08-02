package ru.ok.android.webrtc.animoji.util;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class AnimojiChannelBehavior {
    public static final int CHANNEL_ID = 1;
    public static final AnimojiChannelBehavior CREATE_FIXED_ID;
    public static final AnimojiChannelBehavior CREATE_SENDRECV;
    public static final Companion Companion;
    public static final AnimojiChannelBehavior EXPECT_SENDRECV;
    public static final AnimojiChannelBehavior NONE;
    public static final /* synthetic */ AnimojiChannelBehavior[] a;
    public static final /* synthetic */ zrp b;

    /* JADX WARN: Type inference failed for: r0v2, types: [ru.ok.android.webrtc.animoji.util.AnimojiChannelBehavior$Companion] */
    static {
        AnimojiChannelBehavior animojiChannelBehavior = new AnimojiChannelBehavior("CREATE_SENDRECV", 0);
        CREATE_SENDRECV = animojiChannelBehavior;
        AnimojiChannelBehavior animojiChannelBehavior2 = new AnimojiChannelBehavior("EXPECT_SENDRECV", 1);
        EXPECT_SENDRECV = animojiChannelBehavior2;
        AnimojiChannelBehavior animojiChannelBehavior3 = new AnimojiChannelBehavior("CREATE_FIXED_ID", 2);
        CREATE_FIXED_ID = animojiChannelBehavior3;
        AnimojiChannelBehavior animojiChannelBehavior4 = new AnimojiChannelBehavior("NONE", 3);
        NONE = animojiChannelBehavior4;
        AnimojiChannelBehavior[] animojiChannelBehaviorArr = {animojiChannelBehavior, animojiChannelBehavior2, animojiChannelBehavior3, animojiChannelBehavior4};
        a = animojiChannelBehaviorArr;
        b = new asp(animojiChannelBehaviorArr);
        Companion = new Object(null) { // from class: ru.ok.android.webrtc.animoji.util.AnimojiChannelBehavior.Companion
        };
    }

    public AnimojiChannelBehavior(String str, int i) {
    }

    public static zrp<AnimojiChannelBehavior> getEntries() {
        return b;
    }

    public static AnimojiChannelBehavior valueOf(String str) {
        return (AnimojiChannelBehavior) Enum.valueOf(AnimojiChannelBehavior.class, str);
    }

    public static AnimojiChannelBehavior[] values() {
        return (AnimojiChannelBehavior[]) a.clone();
    }
}
