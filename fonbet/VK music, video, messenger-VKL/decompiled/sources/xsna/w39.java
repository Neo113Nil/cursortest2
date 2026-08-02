package xsna;

import com.huawei.hms.hihealth.data.DeviceInfo;
import com.vkontakte.android.R;

/* compiled from: CallInPhoneNumberInfo.kt */
/* loaded from: classes15.dex */
public abstract class w39 {
    public final Integer a;
    public final Integer b;

    /* compiled from: CallInPhoneNumberInfo.kt */
    public static final class a extends w39 {
        public static final a c = new a(Integer.valueOf(R.string.vk_auth_call_in_flag_emoji_kz), Integer.valueOf(R.string.vk_otp_method_selection_verification_methods_libverify_callin_country_in_prepositional_case_kz));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1386346789;
        }

        public final String toString() {
            return "Kazakhstan";
        }
    }

    /* compiled from: CallInPhoneNumberInfo.kt */
    public static final class b extends w39 {
        public static final b c = new b(null, null);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 557415607;
        }

        public final String toString() {
            return DeviceInfo.STR_TYPE_UNKNOWN;
        }
    }

    public w39(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }
}
