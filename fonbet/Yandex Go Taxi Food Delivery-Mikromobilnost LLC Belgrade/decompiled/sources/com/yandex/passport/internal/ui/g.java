package com.yandex.passport.internal.ui;

import com.yandex.passport.R;
import com.yandex.passport.data.exceptions.FailedResponseException;
import defpackage.g8e;
import defpackage.w53;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.json.JSONException;

/* loaded from: classes8.dex */
public class g {
    public static final Pattern d = Pattern.compile("backend\\..*_failed");
    public final w53 a;
    public final ArrayList b;
    public final ArrayList c;

    static {
        new HashSet(Arrays.asList("invalidid", "track_id.invalid", "track.not_found", "unknowntrack", "unknownnode"));
    }

    public g() {
        w53 w53Var = new w53();
        this.a = w53Var;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.c = arrayList2;
        w53Var.put("unknown server response", Integer.valueOf(R.string.passport_error_unknown_server_response));
        w53Var.put("network error", Integer.valueOf(R.string.passport_error_network_fail));
        w53Var.put("unknown error", Integer.valueOf(R.string.passport_error_unknown));
        w53Var.put("account.disabled", Integer.valueOf(R.string.passport_error_account_disabled));
        w53Var.put("account.disabled_on_deletion", Integer.valueOf(R.string.passport_error_account_disabled));
        w53Var.put("track_id.invalid", Integer.valueOf(R.string.passport_error_unknown));
        w53Var.put("track.invalid_state", Integer.valueOf(R.string.passport_error_unknown));
        w53Var.put("code.invalid", Integer.valueOf(R.string.passport_error_code_incorrect));
        w53Var.put("confirmations_limit.exceeded", Integer.valueOf(R.string.passport_error_code_limit_exceeded));
        w53Var.put("code.empty", Integer.valueOf(R.string.passport_error_code_empty));
        w53Var.put("webam.failed", Integer.valueOf(R.string.passport_error_unknown));
        w53Var.put("oauth_token.invalid", Integer.valueOf(R.string.passport_account_not_authorized_default_message));
        w53Var.put("sms_limit.exceeded", Integer.valueOf(R.string.passport_reg_error_sms_send_limit_exceeded));
        arrayList.add("network error");
        arrayList.add("unknown server response");
        arrayList.add("unknown error");
        arrayList.add("null.blackboxfailed");
        arrayList2.add("track_id.invalid");
        arrayList2.add("track.invalid");
        arrayList2.add("track.invalid_state");
        arrayList2.add("track_id.empty");
        arrayList2.add("track.not_found");
        arrayList2.add("firstname.invalid");
        arrayList2.add("lastname.invalid");
        arrayList2.add("account.global_logout");
        arrayList2.add("webam.failed");
    }

    public EventError a(Throwable th) {
        return new EventError(th instanceof FailedResponseException ? th.getMessage() : th instanceof JSONException ? "unknown server response" : th instanceof IOException ? "network error" : "unknown error", th);
    }

    public final int b(String str) {
        Integer num = (Integer) this.a.get(str);
        if (num != null) {
            return num.intValue();
        }
        String o = g8e.o("Unknown error description=", str);
        if (this.b.contains(str) || d.matcher(str).find()) {
            com.yandex.passport.legacy.a.b(o);
        } else {
            com.yandex.passport.legacy.a.d(new Exception(o));
        }
        return R.string.passport_error_unknown;
    }
}
