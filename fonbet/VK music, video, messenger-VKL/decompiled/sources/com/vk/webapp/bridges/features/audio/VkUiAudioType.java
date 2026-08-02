package com.vk.webapp.bridges.features.audio;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ironsource.X3;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkUiAudioType.kt */
/* loaded from: classes7.dex */
public final class VkUiAudioType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkUiAudioType[] $VALUES;
    public static final VkUiAudioType AUDIO;
    public static final a Companion;
    public static final VkUiAudioType FILE;
    public static final VkUiAudioType NFT;
    public static final VkUiAudioType PODCAST;
    public static final VkUiAudioType UNKNOWN;
    private final String value;

    /* compiled from: VkUiAudioType.kt */
    public static final class a {
    }

    static {
        VkUiAudioType vkUiAudioType = new VkUiAudioType("FILE", 0, X3.i.b);
        FILE = vkUiAudioType;
        VkUiAudioType vkUiAudioType2 = new VkUiAudioType(SignalingProtocol.MEDIA_OPTION_AUDIO, 1, "audio");
        AUDIO = vkUiAudioType2;
        VkUiAudioType vkUiAudioType3 = new VkUiAudioType("PODCAST", 2, "podcast");
        PODCAST = vkUiAudioType3;
        VkUiAudioType vkUiAudioType4 = new VkUiAudioType("NFT", 3, "nft");
        NFT = vkUiAudioType4;
        VkUiAudioType vkUiAudioType5 = new VkUiAudioType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4, "unknown");
        UNKNOWN = vkUiAudioType5;
        VkUiAudioType[] vkUiAudioTypeArr = {vkUiAudioType, vkUiAudioType2, vkUiAudioType3, vkUiAudioType4, vkUiAudioType5};
        $VALUES = vkUiAudioTypeArr;
        $ENTRIES = new asp(vkUiAudioTypeArr);
        Companion = new a();
    }

    public VkUiAudioType(String str, int i, String str2) {
        this.value = str2;
    }

    public static VkUiAudioType valueOf(String str) {
        return (VkUiAudioType) Enum.valueOf(VkUiAudioType.class, str);
    }

    public static VkUiAudioType[] values() {
        return (VkUiAudioType[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
