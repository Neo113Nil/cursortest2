package xsna;

import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: VhIdFactory.kt */
/* loaded from: classes2.dex */
public final class rrr0 {

    /* compiled from: VhIdFactory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdapterEntryType.values().length];
            try {
                iArr[AdapterEntryType.TYPE_UNREAD_FROM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdapterEntryType.TYPE_DATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdapterEntryType.TYPE_LOAD_MORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
