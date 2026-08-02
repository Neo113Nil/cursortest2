package com.yandex.messaging.activity;

import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/messaging/activity/MessengerRequestCode;", "", "", "value", CA20Status.STATUS_USER_I, "a", "()I", "CAMERA", "GALLERY", "CREATE_CHAT", "CREATE_GEO_CHAT", "JOIN_CHAT", "IMAGE_PREVIEW", "SEND_MESSAGE", "MESSENGER_ONBOARDING", "MESSENGER_PROFILE", "CHAT_LIST_BANNER", "USER_AVATAR_PREVIEW", "FORWARD_REQUESTED", "QUASAR_AUTH_FOR_DEVICE", "INITIAL_OPENING", "IMAGE_PREVIEW_FROM_MEDIABROWSER", "MEDIA_VIEWER", "MEDIA_VIEWER_FROM_MEDIABROWSER", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessengerRequestCode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MessengerRequestCode[] $VALUES;
    public static final MessengerRequestCode CAMERA;
    public static final MessengerRequestCode CHAT_LIST_BANNER;
    public static final MessengerRequestCode CREATE_CHAT;
    public static final MessengerRequestCode CREATE_GEO_CHAT;
    public static final MessengerRequestCode FORWARD_REQUESTED;
    public static final MessengerRequestCode GALLERY;
    public static final MessengerRequestCode IMAGE_PREVIEW;
    public static final MessengerRequestCode IMAGE_PREVIEW_FROM_MEDIABROWSER;
    public static final MessengerRequestCode INITIAL_OPENING;
    public static final MessengerRequestCode JOIN_CHAT;
    public static final MessengerRequestCode MEDIA_VIEWER;
    public static final MessengerRequestCode MEDIA_VIEWER_FROM_MEDIABROWSER;
    public static final MessengerRequestCode MESSENGER_ONBOARDING;
    public static final MessengerRequestCode MESSENGER_PROFILE;
    public static final MessengerRequestCode QUASAR_AUTH_FOR_DEVICE;
    public static final MessengerRequestCode SEND_MESSAGE;
    public static final MessengerRequestCode USER_AVATAR_PREVIEW;
    private final int value;

    static {
        MessengerRequestCode messengerRequestCode = new MessengerRequestCode("CAMERA", 0, 2562);
        CAMERA = messengerRequestCode;
        MessengerRequestCode messengerRequestCode2 = new MessengerRequestCode("GALLERY", 1, 2563);
        GALLERY = messengerRequestCode2;
        MessengerRequestCode messengerRequestCode3 = new MessengerRequestCode("CREATE_CHAT", 2, 2565);
        CREATE_CHAT = messengerRequestCode3;
        MessengerRequestCode messengerRequestCode4 = new MessengerRequestCode("CREATE_GEO_CHAT", 3, 2566);
        CREATE_GEO_CHAT = messengerRequestCode4;
        MessengerRequestCode messengerRequestCode5 = new MessengerRequestCode("JOIN_CHAT", 4, 2567);
        JOIN_CHAT = messengerRequestCode5;
        MessengerRequestCode messengerRequestCode6 = new MessengerRequestCode("IMAGE_PREVIEW", 5, 2568);
        IMAGE_PREVIEW = messengerRequestCode6;
        MessengerRequestCode messengerRequestCode7 = new MessengerRequestCode("SEND_MESSAGE", 6, 2569);
        SEND_MESSAGE = messengerRequestCode7;
        MessengerRequestCode messengerRequestCode8 = new MessengerRequestCode("MESSENGER_ONBOARDING", 7, 2570);
        MESSENGER_ONBOARDING = messengerRequestCode8;
        MessengerRequestCode messengerRequestCode9 = new MessengerRequestCode("MESSENGER_PROFILE", 8, 2571);
        MESSENGER_PROFILE = messengerRequestCode9;
        MessengerRequestCode messengerRequestCode10 = new MessengerRequestCode("CHAT_LIST_BANNER", 9, 2572);
        CHAT_LIST_BANNER = messengerRequestCode10;
        MessengerRequestCode messengerRequestCode11 = new MessengerRequestCode("USER_AVATAR_PREVIEW", 10, 2573);
        USER_AVATAR_PREVIEW = messengerRequestCode11;
        MessengerRequestCode messengerRequestCode12 = new MessengerRequestCode("FORWARD_REQUESTED", 11, 2574);
        FORWARD_REQUESTED = messengerRequestCode12;
        MessengerRequestCode messengerRequestCode13 = new MessengerRequestCode("QUASAR_AUTH_FOR_DEVICE", 12, 2575);
        QUASAR_AUTH_FOR_DEVICE = messengerRequestCode13;
        MessengerRequestCode messengerRequestCode14 = new MessengerRequestCode("INITIAL_OPENING", 13, 2576);
        INITIAL_OPENING = messengerRequestCode14;
        MessengerRequestCode messengerRequestCode15 = new MessengerRequestCode("IMAGE_PREVIEW_FROM_MEDIABROWSER", 14, 2577);
        IMAGE_PREVIEW_FROM_MEDIABROWSER = messengerRequestCode15;
        MessengerRequestCode messengerRequestCode16 = new MessengerRequestCode("MEDIA_VIEWER", 15, 2578);
        MEDIA_VIEWER = messengerRequestCode16;
        MessengerRequestCode messengerRequestCode17 = new MessengerRequestCode("MEDIA_VIEWER_FROM_MEDIABROWSER", 16, 2579);
        MEDIA_VIEWER_FROM_MEDIABROWSER = messengerRequestCode17;
        MessengerRequestCode[] messengerRequestCodeArr = {messengerRequestCode, messengerRequestCode2, messengerRequestCode3, messengerRequestCode4, messengerRequestCode5, messengerRequestCode6, messengerRequestCode7, messengerRequestCode8, messengerRequestCode9, messengerRequestCode10, messengerRequestCode11, messengerRequestCode12, messengerRequestCode13, messengerRequestCode14, messengerRequestCode15, messengerRequestCode16, messengerRequestCode17};
        $VALUES = messengerRequestCodeArr;
        $ENTRIES = kotlin.enums.a.a(messengerRequestCodeArr);
    }

    public MessengerRequestCode(String str, int i, int i2) {
        this.value = i2;
    }

    public static MessengerRequestCode valueOf(String str) {
        return (MessengerRequestCode) Enum.valueOf(MessengerRequestCode.class, str);
    }

    public static MessengerRequestCode[] values() {
        return (MessengerRequestCode[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
