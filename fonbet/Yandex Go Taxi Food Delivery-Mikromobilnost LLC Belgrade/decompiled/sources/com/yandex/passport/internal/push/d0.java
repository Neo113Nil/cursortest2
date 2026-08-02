package com.yandex.passport.internal.push;

import android.os.Bundle;
import com.yandex.passport.internal.report.x9;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.sloth.data.PushType;
import defpackage.bvu0;
import defpackage.evu0;
import defpackage.ny61;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes8.dex */
public final class d0 {
    public final com.yandex.passport.internal.report.reporters.s0 a;

    public d0(com.yandex.passport.internal.report.reporters.s0 s0Var) {
        this.a = s0Var;
    }

    public static ArrayList b(Bundle bundle) {
        List W;
        String string = bundle.getString("2fa_pictures_am");
        if (string == null) {
            ny61.r("missing key 2fa_pictures_am");
            return null;
        }
        W = evu0.W(string, new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
        ArrayList arrayList = new ArrayList();
        Iterator it = W.iterator();
        while (it.hasNext()) {
            Integer l = bvu0.l(10, (String) it.next());
            if (l != null) {
                arrayList.add(l);
            }
        }
        return arrayList;
    }

    public static long c(Bundle bundle) {
        String string = bundle.getString(ClidProvider.TIMESTAMP);
        return string != null ? TimeUnit.SECONDS.toMillis(Long.parseLong(string)) : new Date().getTime();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d8, code lost:
    
        if (r2 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PushPayload a(Bundle bundle) {
        boolean z;
        boolean z2;
        Long l;
        PushType pushType;
        try {
            if (bundle.getString("webview_url") == null) {
                throw new IllegalStateException("missing key or value for key webview_url");
            }
            String string = bundle.getString("platform");
            String string2 = bundle.getString("passp_am_proto");
            float parseFloat = string2 != null ? Float.parseFloat(string2) : -1.0f;
            String string3 = bundle.getString("push_service");
            String string4 = bundle.getString("event_name");
            long c = c(bundle);
            String string5 = bundle.getString("uid");
            if (string5 == null) {
                throw new IllegalStateException("missing key uid");
            }
            long parseLong = Long.parseLong(string5);
            String string6 = bundle.getString("push_id");
            String string7 = bundle.getString("min_am_version");
            String string8 = bundle.getString("title");
            String string9 = bundle.getString("body");
            boolean parseBoolean = Boolean.parseBoolean(bundle.getString("is_silent"));
            String string10 = bundle.getString("subtitle");
            String string11 = bundle.getString("webview_url");
            if (string11 == null) {
                throw new IllegalStateException("missing key webview_url");
            }
            boolean parseBoolean2 = Boolean.parseBoolean(bundle.getString("require_web_auth"));
            String string12 = bundle.getString("body_include_code");
            String string13 = bundle.getString("track_id");
            boolean parseBoolean3 = Boolean.parseBoolean(bundle.getString("show_code_in_notification"));
            String string14 = bundle.getString("push_expire_at");
            if (string14 != null) {
                z = parseBoolean;
                z2 = parseBoolean3;
                l = Long.valueOf(TimeUnit.SECONDS.toMillis(Long.parseLong(string14)));
            } else {
                z = parseBoolean;
                z2 = parseBoolean3;
                l = null;
            }
            String string15 = bundle.getString("push_type");
            if (string15 != null) {
                pushType = string15.equals("notification") ? PushType.Notification : string15.equals(Constants.KEY_DATA) ? PushType.Data : PushType.Unknown;
            }
            pushType = PushType.Unknown;
            String string16 = bundle.getString("open_in_browser");
            Boolean valueOf = string16 != null ? Boolean.valueOf(Boolean.parseBoolean(string16)) : null;
            String string17 = bundle.getString("require_web_auth_with_uid");
            return new PushPayload(string, parseFloat, string3, string4, c, parseLong, string6, string8, string9, string10, string7, Boolean.valueOf(z), string11, Boolean.valueOf(parseBoolean2), string12, string13, Boolean.valueOf(z2), l, pushType, valueOf, string17 != null ? Boolean.valueOf(Boolean.parseBoolean(string17)) : null);
        } catch (Throwable th) {
            com.yandex.passport.internal.report.reporters.s0 s0Var = this.a;
            s0Var.getClass();
            s0Var.f(x9.w, new yd("push_payload", 15, false), new yd(th));
            throw th;
        }
    }
}
