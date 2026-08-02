package xsna;

import com.vk.im.engine.models.InfoBar;

/* compiled from: InfoBarEventProducer.kt */
/* loaded from: classes18.dex */
public final class hvw {
    public final gum a;

    /* compiled from: InfoBarEventProducer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InfoBar.ButtonType.values().length];
            try {
                iArr[InfoBar.ButtonType.LINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InfoBar.ButtonType.GIFTS_LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InfoBar.ButtonType.CALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InfoBar.ButtonType.OPEN_MSG_PUSH_SETTINGS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InfoBar.ButtonType.SYNC_CONTACTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InfoBar.ButtonType.OPEN_EDU_AUTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[InfoBar.ButtonType.CALLS_PRIVACY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[InfoBar.ButtonType.OPEN_CONNECT_EDU_CHATS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[InfoBar.ButtonType.POPUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InfoBar.Style.values().length];
            try {
                iArr2[InfoBar.Style.OUTAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[InfoBar.Style.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public hvw(gum gumVar) {
        this.a = gumVar;
    }
}
