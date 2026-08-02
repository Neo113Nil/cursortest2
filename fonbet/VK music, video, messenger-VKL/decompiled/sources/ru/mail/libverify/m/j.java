package ru.mail.libverify.m;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import ru.mail.verify.core.utils.Gsonable;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes9.dex */
public final class j extends c<j, ru.mail.libverify.requests.i> {
    private a info;
    private String[] printable;
    private b typing_check;

    public static class a implements Gsonable {
        public String iso_country_code;
    }

    public static class b implements Gsonable {
        private String modified_phone_number;
        private String modified_prefix;
        private String[] prefix_state;
        private Integer[] remaining_lengths;
        private int show_warning;

        public final String a() {
            return this.modified_phone_number;
        }

        public final String b() {
            return this.modified_prefix;
        }

        @Nullable
        public final Integer[] c() {
            Integer[] numArr = this.remaining_lengths;
            if (numArr == null || numArr.length == 0) {
                return null;
            }
            return numArr;
        }

        public final boolean d() {
            String[] strArr = this.prefix_state;
            if (strArr == null) {
                return false;
            }
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str) && str.equalsIgnoreCase("fixed-line")) {
                    return true;
                }
            }
            return false;
        }

        public final boolean e() {
            String[] strArr = this.prefix_state;
            if (strArr == null) {
                return false;
            }
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str) && str.equalsIgnoreCase("mobile")) {
                    return true;
                }
            }
            return false;
        }

        public final boolean f() {
            return this.show_warning == 1;
        }
    }

    @Nullable
    public final a h() {
        return this.info;
    }

    @Nullable
    public final String[] i() {
        return this.printable;
    }

    @Nullable
    public final b j() {
        return this.typing_check;
    }
}
