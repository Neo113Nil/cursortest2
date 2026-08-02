package xsna;

import com.vk.dto.common.ImageSizeKey;

/* compiled from: MD5.kt */
/* loaded from: classes.dex */
public final class ub00 {
    public static final char[] a = {ImageSizeKey.SIZE_KEY_UNDEFINED, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final a b = new a();

    /* compiled from: MD5.kt */
    public static final class a extends ThreadLocal<StringBuilder> {
        public final StringBuilder a() {
            return (StringBuilder) super.get();
        }

        @Override // java.lang.ThreadLocal
        public final StringBuilder get() {
            return (StringBuilder) super.get();
        }

        @Override // java.lang.ThreadLocal
        public final StringBuilder initialValue() {
            return new StringBuilder();
        }
    }
}
