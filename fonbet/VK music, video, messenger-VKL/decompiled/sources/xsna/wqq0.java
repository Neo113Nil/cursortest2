package xsna;

import com.vkontakte.android.R;

/* compiled from: UserProfileLegoCallsContextMenu.kt */
/* loaded from: classes5.dex */
public final class wqq0 {
    public static final int a = cn70.b(10);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UserProfileLegoCallsContextMenu.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a AudioCall;
        public static final a MaxCall;
        public static final a VideoCall;
        private final int iconRes;
        private final Integer iconTintAttr;
        private final int titleRes;

        static {
            Integer valueOf = Integer.valueOf(R.attr.vk_ui_icon_primary);
            a aVar = new a("AudioCall", 0, R.string.vkim_msg_header_menu_call_with_audio, R.drawable.vk_icon_phone_outline_28, valueOf);
            AudioCall = aVar;
            a aVar2 = new a("VideoCall", 1, R.string.vkim_msg_header_menu_call_with_video, R.drawable.vk_icon_videocam_outline_28, valueOf);
            VideoCall = aVar2;
            a aVar3 = new a("MaxCall", 2, R.string.vkim_msg_header_menu_call_in_MAX, R.drawable.vk_icon_logo_max_color_56, null);
            MaxCall = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, int i2, int i3, Integer num) {
            this.titleRes = i2;
            this.iconRes = i3;
            this.iconTintAttr = num;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final int h() {
            return this.iconRes;
        }

        public final Integer i() {
            return this.iconTintAttr;
        }

        public final int j() {
            return this.titleRes;
        }
    }

    /* compiled from: UserProfileLegoCallsContextMenu.kt */
    public static final class b {
        public final int hashCode() {
            throw null;
        }
    }

    /* compiled from: UserProfileLegoCallsContextMenu.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.AudioCall.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.VideoCall.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.MaxCall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
