package ru.mail.libverify.requests;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.List;
import ru.mail.libverify.R;
import ru.mail.libverify.e.c;
import ru.mail.libverify.m.o;
import ru.mail.libverify.u.w;
import ru.mail.libverify.u.x;
import ru.mail.verify.core.utils.json.JsonParseException;
import ru.ok.android.sdk.SharedKt;
import xsna.e43;
import xsna.j5g;
import xsna.lir0;

/* loaded from: classes9.dex */
public final class VerifyApiRequest extends c<VerifyApiRequest, o> {
    private static final String[] z = {"sms_retriever"};

    @NonNull
    private final x l;

    @Nullable
    private ru.mail.libverify.j0.f m;

    @NonNull
    private final String n;

    @NonNull
    private final String o;

    @Nullable
    private final String p;

    @NonNull
    private final VerifyChecks[] q;

    @Nullable
    private final String r;
    private final boolean s;

    @NonNull
    private final a t;

    @Nullable
    private final String u;

    @Nullable
    private final String v;

    @Nullable
    private final String w;
    private final boolean x;

    @Nullable
    String y;

    public enum VerifyChecks {
        IVR("ivr"),
        SMS("sms"),
        CALL(NotificationCompat.CATEGORY_CALL),
        PUSH("push"),
        CALLUI("callui"),
        VKC("vkc"),
        MOBILEID("mobileid"),
        CALLIN("callin"),
        MESSENGER("messenger");

        public final String value;

        VerifyChecks(String str) {
            this.value = str;
        }

        @Nullable
        public static VerifyChecks fromString(@Nullable String str) {
            for (VerifyChecks verifyChecks : values()) {
                if (verifyChecks.value.equalsIgnoreCase(str)) {
                    return verifyChecks;
                }
            }
            return null;
        }
    }

    public enum a {
        VKCONNECT("VKCONNECT"),
        EMPTY("EMPTY");

        public final String value;

        a(String str) {
            this.value = str;
        }
    }

    public VerifyApiRequest(@NonNull w wVar, @NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @NonNull VerifyChecks[] verifyChecksArr, @NonNull a aVar, @Nullable String str5, boolean z2, @Nullable String str6, @Nullable String str7, boolean z3) {
        super(wVar);
        this.m = null;
        this.y = null;
        this.n = str;
        this.o = str2;
        this.p = str4;
        this.r = str3;
        this.q = verifyChecksArr;
        this.u = str5;
        this.t = aVar;
        this.s = z2;
        this.v = str6;
        this.w = str7;
        this.x = z3;
        this.l = new x(this, wVar);
    }

    @Override // ru.mail.libverify.j0.k
    @NonNull
    public final ru.mail.libverify.k0.a a(@NonNull String str) throws JsonParseException {
        return (o) ru.mail.libverify.q0.a.a(str, o.class);
    }

    @Override // ru.mail.libverify.requests.c, ru.mail.libverify.j0.k
    @NonNull
    public final String o() {
        return "verify";
    }

    @Override // ru.mail.libverify.requests.c, ru.mail.libverify.j0.k
    @NonNull
    public final ru.mail.libverify.j0.f p() {
        VerifyChecks[] verifyChecksArr = this.q;
        int i = 1;
        if (!(verifyChecksArr.length == 1 && verifyChecksArr[0] == VerifyChecks.VKC) && TextUtils.isEmpty(this.r) && TextUtils.isEmpty(this.p)) {
            throw new IllegalArgumentException("Can't prepare verification request without phone number or user id");
        }
        String a2 = this.l.a();
        ru.mail.libverify.j0.f fVar = this.m;
        if (fVar != null && !fVar.isEmpty()) {
            return this.m;
        }
        this.m = super.p();
        if (!TextUtils.isEmpty(a2)) {
            this.m.put(CommonUrlParts.REQUEST_ID, a2);
        }
        this.m.put("session_id", this.n);
        this.m.put("service", this.o);
        this.m.put("language", ru.mail.libverify.n0.e.a(this.h.d()));
        if (!TextUtils.isEmpty(this.v)) {
            this.m.put("jws", this.v);
        }
        if (!TextUtils.isEmpty(this.w)) {
            this.m.put("external_id", this.w);
        }
        String m = this.h.m();
        this.h.g();
        String a3 = ru.mail.libverify.n0.e.a(m, Build.MODEL);
        if (!TextUtils.isEmpty(a3)) {
            this.m.put("device_name", a3);
        }
        if (this.x) {
            this.m.put("resend", "1");
        }
        if (this.q.length != 0) {
            StringBuilder sb = new StringBuilder();
            for (VerifyChecks verifyChecks : this.q) {
                if (verifyChecks == null) {
                    ru.mail.libverify.n0.b.a("VerifyApiRequest", "VerifyChecks can't be null!", new RuntimeException());
                } else {
                    if (sb.length() != 0) {
                        sb.append(StringUtils.COMMA);
                    }
                    sb.append(verifyChecks.value);
                }
            }
            this.m.put("checks", sb.toString());
            try {
                if (this.y == null) {
                    this.y = this.e.getString(R.string.libverify_debug_checks);
                }
                String str = this.y;
                if (!TextUtils.isEmpty(str)) {
                    this.m.put("checks", str);
                }
            } catch (Exception unused) {
            }
            String J = this.h.J();
            if (!TextUtils.isEmpty(J)) {
                this.m.put("ext_info", ru.mail.libverify.n0.e.c(J));
            }
        }
        if (this.s) {
            this.m.put("manual_routes", "1");
        }
        if (!TextUtils.isEmpty(this.p)) {
            this.m.put("user_id", this.p);
            this.m.put("verify_by_user_id", "1");
        }
        if (!TextUtils.isEmpty(this.r)) {
            this.m.put("phone", this.r);
        }
        String c = this.h.C().c();
        if (!TextUtils.isEmpty(c)) {
            this.m.put("push_token", c);
        }
        String B = this.h.B();
        if (!TextUtils.isEmpty(B)) {
            this.m.put("server_key", B);
        }
        a aVar = this.t;
        if (aVar != a.EMPTY) {
            this.m.put(SharedKt.PARAM_AUTH_TYPE, aVar.value);
        }
        if (!TextUtils.isEmpty(this.u)) {
            this.m.put("src_application", this.u);
        }
        Context context = this.e;
        List l = e43.l(c.C2192c.c, c.a.c, c.b.c);
        ArrayList arrayList = new ArrayList();
        for (Object obj : l) {
            String[] b = ((ru.mail.libverify.e.c) obj).b();
            int length = b.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    try {
                        context.getPackageManager().getPackageInfo(b[i2], 0);
                        arrayList.add(obj);
                        break;
                    } catch (Exception unused2) {
                        i2++;
                    }
                }
            }
        }
        lir0 lir0Var = new lir0(i);
        StringBuilder sb2 = new StringBuilder();
        j5g.e0(arrayList, sb2, StringUtils.COMMA, "", "", -1, "", lir0Var);
        String sb3 = sb2.toString();
        if (!TextUtils.isEmpty(sb3)) {
            this.m.put("available_messengers", sb3);
        }
        return this.m;
    }

    @Override // ru.mail.libverify.j0.k
    @Nullable
    public final ru.mail.libverify.j0.l r() {
        return null;
    }

    @Override // ru.mail.libverify.j0.k
    @Nullable
    public final ru.mail.libverify.j0.m t() {
        throw null;
    }

    @Override // ru.mail.libverify.j0.k
    public final boolean v() {
        return !TextUtils.isEmpty(this.v);
    }

    @Override // ru.mail.libverify.requests.c
    public final boolean w() {
        return true;
    }

    @Override // ru.mail.libverify.requests.c
    @NonNull
    public final String[] y() {
        return z;
    }
}
