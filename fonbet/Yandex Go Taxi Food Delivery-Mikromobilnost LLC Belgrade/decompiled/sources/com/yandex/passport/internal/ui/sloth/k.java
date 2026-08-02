package com.yandex.passport.internal.ui.sloth;

import com.yandex.passport.R;
import com.yandex.passport.common.resources.StringResource;
import com.yandex.passport.sloth.ui.string.SlothString;
import defpackage.w511;

/* loaded from: classes2.dex */
public final class k implements com.yandex.passport.sloth.ui.string.a {
    public final com.yandex.passport.internal.ui.g a;

    public k(com.yandex.passport.internal.ui.g gVar) {
        this.a = gVar;
    }

    public final int a(SlothString slothString) {
        int i;
        switch (j.a[slothString.ordinal()]) {
            case 1:
                i = R.string.passport_webview_unexpected_error_text;
                break;
            case 2:
                i = R.string.passport_webview_404_error_text;
                break;
            case 3:
                i = R.string.passport_webview_coonection_lost_error_text;
                break;
            case 4:
                i = R.string.passport_webview_back_button_text;
                break;
            case 5:
                i = R.string.passport_fatal_error_dialog_text;
                break;
            case 6:
                i = R.string.passport_fatal_error_dialog_button;
                break;
            case 7:
                i = R.string.passport_debug_information_title;
                break;
            case 8:
                i = R.string.passport_reg_try_again;
                break;
            case 9:
                i = R.string.passport_unsupported_format_url;
                break;
            case 10:
                i = R.string.passport_button_close_for_error;
                break;
            default:
                w511.b();
                return 0;
        }
        return StringResource.m277constructorimpl(i);
    }
}
