package ru.mail.libverify.requests;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.Locale;
import ru.mail.libverify.api.VerificationFactory;
import ru.mail.libverify.platform.core.ServiceType;
import ru.mail.libverify.u.w;
import ru.mail.libverify.u.x;
import ru.mail.verify.core.utils.json.JsonParseException;
import xsna.fo8;
import xsna.fw3;

/* loaded from: classes9.dex */
public final class j extends ru.mail.libverify.requests.c<j, ru.mail.libverify.m.k> {

    @NonNull
    private final k l;

    @Nullable
    private final Long m;

    @NonNull
    private final x n;

    @Nullable
    private ru.mail.libverify.j0.f o;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ServiceType.values().length];
            a = iArr;
            try {
                iArr[ServiceType.Huawei.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ServiceType.Firebase.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        SMS_CODE,
        VERIFIED,
        SERVER_INFO,
        ROUTE_INFO,
        MOBILEID,
        DO_ATTEMPT
    }

    public enum c {
        GCM,
        FETCHER,
        UNKNOWN
    }

    public enum d {
        DELIVERED,
        SMS_ACCESS_ERROR,
        IMSI_NOT_MATCH,
        IMEI_NOT_MATCH,
        APPLICATION_ID_NOT_MATCH,
        IPC_ACCESS_ERROR,
        UNABLE_TO_SHOW,
        NO_RECEIVER,
        TTL_EXPIRED
    }

    public j() {
        throw null;
    }

    @Nullable
    public final String B() {
        return this.l.pushSessionId;
    }

    public final long C() {
        return this.l.statusTimestamp;
    }

    @Override // ru.mail.libverify.j0.k
    @NonNull
    public final ru.mail.libverify.k0.a a(@NonNull String str) throws JsonParseException {
        return (ru.mail.libverify.m.k) ru.mail.libverify.q0.a.a(str, ru.mail.libverify.m.k.class);
    }

    @Override // ru.mail.libverify.requests.c, ru.mail.libverify.j0.k
    @NonNull
    public final String o() {
        return "pushstatus";
    }

    @Override // ru.mail.libverify.requests.c, ru.mail.libverify.j0.k
    @NonNull
    public final ru.mail.libverify.j0.f p() {
        String a2 = this.n.a();
        ru.mail.libverify.j0.f fVar = this.o;
        if (fVar != null && !fVar.isEmpty()) {
            return this.o;
        }
        this.o = super.p();
        if (!TextUtils.isEmpty(a2)) {
            this.o.put(CommonUrlParts.REQUEST_ID, a2);
        }
        String str = "";
        for (d dVar : this.l.statusData) {
            if (!TextUtils.isEmpty(str)) {
                str = fo8.a(str, StringUtils.COMMA);
            }
            StringBuilder e = fw3.e(str);
            e.append(dVar.toString());
            str = e.toString();
        }
        this.o.put("status", str);
        if (!TextUtils.isEmpty(this.l.pushSessionId)) {
            this.o.put("session_id", this.l.pushSessionId);
        }
        if (!TextUtils.isEmpty(this.l.pushApplicationId)) {
            this.o.put("application_id_old", this.l.pushApplicationId);
        }
        ru.mail.libverify.z.c H = this.h.H();
        if (H.c()) {
            this.o.put("device_screen_active", "1");
        } else {
            this.o.put("device_screen_active", "0");
            if (H.b()) {
                this.o.put("device_inactive_time", Long.toString(H.a() / 1000));
            }
        }
        String str2 = this.l.routeType;
        if (str2 != null) {
            this.o.put("route_type", str2.toLowerCase(Locale.getDefault()));
        }
        Long l = this.m;
        if (l != null) {
            this.o.put("push_id", l.toString());
        }
        c cVar = this.l.deliveryMethod;
        if (cVar == c.GCM) {
            this.o.put("delivery_method", a.a[VerificationFactory.getPlatformService(this.h.getContext()).getServiceType().ordinal()] != 1 ? "GCM" : "HCM");
        } else {
            this.o.put("delivery_method", cVar.toString());
        }
        this.o.put("confirm_action", this.l.confirmAction.toString());
        return this.o;
    }

    @Override // ru.mail.libverify.j0.k
    @NonNull
    public final ru.mail.libverify.j0.l r() {
        return this.l;
    }

    @Override // ru.mail.libverify.j0.k
    @NonNull
    public final ru.mail.libverify.j0.m t() throws JsonParseException {
        return new ru.mail.libverify.j0.m(ru.mail.libverify.q0.a.f(this.l));
    }

    @Override // ru.mail.libverify.requests.c
    public final boolean w() {
        return true;
    }

    public j(@NonNull w wVar, @NonNull ru.mail.libverify.j0.m mVar) throws JsonParseException {
        super(wVar);
        this.o = null;
        this.l = (k) ru.mail.libverify.q0.a.a(mVar.a, k.class);
        this.m = null;
        this.n = new x(this, wVar);
    }

    public j(@NonNull w wVar, @NonNull List<d> list, @NonNull String str, @NonNull c cVar, @NonNull b bVar, @Nullable String str2, @Nullable Long l, @Nullable String str3, long j) {
        super(wVar);
        this.o = null;
        if (!list.isEmpty()) {
            this.m = l;
            this.l = new k(list, str, str3, j, cVar, bVar, str2);
            this.n = new x(this, wVar);
            return;
        }
        throw new IllegalArgumentException("statusData can't be empty");
    }
}
