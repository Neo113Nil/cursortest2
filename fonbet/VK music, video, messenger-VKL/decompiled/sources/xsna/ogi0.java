package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: SemanticsProperties.android.kt */
/* loaded from: classes11.dex */
public final class ogi0 {
    public static final sgi0<Boolean> a = new sgi0<>("TestTagsAsResourceId", false, b.i);
    public static final sgi0<String> b = new sgi0<>("AccessibilityClassName", true, a.i);

    /* compiled from: SemanticsProperties.android.kt */
    public static final class a extends Lambda implements wzs<String, String, String> {
        public static final a i = new a(2);

        @Override // xsna.wzs
        public final String invoke(String str, String str2) {
            return str;
        }
    }

    /* compiled from: SemanticsProperties.android.kt */
    public static final class b extends Lambda implements wzs<Boolean, Boolean, Boolean> {
        public static final b i = new b(2);

        @Override // xsna.wzs
        public final Boolean invoke(Boolean bool, Boolean bool2) {
            Boolean bool3 = bool;
            bool2.booleanValue();
            return bool3;
        }
    }
}
