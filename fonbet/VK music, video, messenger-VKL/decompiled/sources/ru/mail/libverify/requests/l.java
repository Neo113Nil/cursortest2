package ru.mail.libverify.requests;

import android.net.Network;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Objects;
import ru.mail.libverify.u.w;
import ru.mail.libverify.u.x;
import ru.mail.verify.core.utils.json.JsonParseException;

/* loaded from: classes9.dex */
public final class l extends c<l, ru.mail.libverify.m.n> {

    @NonNull
    private final ru.mail.libverify.l.c l;

    @NonNull
    private final x m;

    @Nullable
    private ru.mail.libverify.j0.f n;

    public l(@NonNull w wVar, @NonNull ru.mail.libverify.l.c cVar) {
        super(wVar);
        this.n = null;
        this.l = cVar;
        this.m = new x(this, this.h);
    }

    @NonNull
    public final ru.mail.libverify.l.b B() {
        return this.l.action;
    }

    @Nullable
    public final ru.mail.libverify.i.j C() {
        return this.l.pushPermissions;
    }

    @Nullable
    public final String D() {
        return this.l.pushToken;
    }

    @Override // ru.mail.libverify.j0.k
    @NonNull
    public final ru.mail.libverify.k0.a a(@NonNull String str) throws JsonParseException {
        ru.mail.libverify.m.n nVar = (ru.mail.libverify.m.n) ru.mail.libverify.q0.a.a(str, ru.mail.libverify.m.n.class);
        if (this.l.action == ru.mail.libverify.l.b.REQUEST_SMS_INFO) {
            nVar.s();
        }
        if (nVar.o() != null) {
            ru.mail.libverify.m.m o = nVar.o();
            this.h.u();
            o.a(System.currentTimeMillis());
        }
        if (nVar.m() != null) {
            ru.mail.libverify.m.f m = nVar.m();
            this.h.u();
            m.b(System.currentTimeMillis());
        }
        return nVar;
    }

    @Override // ru.mail.libverify.requests.c, ru.mail.libverify.j0.k
    @NonNull
    public final String o() {
        return "libverifysettings";
    }

    @Override // ru.mail.libverify.requests.c, ru.mail.libverify.j0.k
    @NonNull
    public final ru.mail.libverify.j0.f p() {
        String str;
        String a = this.m.a();
        ru.mail.libverify.j0.f fVar = this.n;
        if (fVar != null && !fVar.isEmpty()) {
            return this.n;
        }
        this.n = super.p();
        if (!TextUtils.isEmpty(a)) {
            this.n.put(CommonUrlParts.REQUEST_ID, a);
        }
        if (!TextUtils.isEmpty(this.l.pushToken)) {
            this.n.put("push_token", this.l.pushToken);
        }
        int i = this.l.blockTimeoutSec;
        if (i > 0) {
            this.n.put("block_timeout", Integer.toString(i));
        }
        if (!TextUtils.isEmpty(this.l.from)) {
            this.n.put("from", this.l.from);
        }
        ru.mail.libverify.l.b bVar = this.l.action;
        if (bVar != ru.mail.libverify.l.b.NO_ACTION) {
            this.n.put("action_type", bVar.a());
        }
        if (!TextUtils.isEmpty(this.l.checkParams)) {
            this.n.put("checkparams", Base64.encodeToString(this.l.checkParams.getBytes(StandardCharsets.UTF_8), 2));
        }
        if (!TextUtils.isEmpty(this.l.smsParams)) {
            this.n.put("smsparams", Base64.encodeToString(this.l.smsParams.getBytes(StandardCharsets.UTF_8), 2));
        }
        this.n.put("language", ru.mail.libverify.n0.e.a(this.h.d()));
        ru.mail.libverify.l.a aVar = this.l.policy;
        if (aVar != ru.mail.libverify.l.a.NOTHING) {
            this.n.put("drop", aVar.a());
        }
        if (!TextUtils.isEmpty(this.l.appCheckParams)) {
            this.n.put("jws", this.l.appCheckParams);
        }
        String B = this.h.B();
        if (!TextUtils.isEmpty(B)) {
            this.n.put("server_key", B);
        }
        if (!TextUtils.isEmpty(this.l.sessionId)) {
            this.n.put("session_id", this.l.sessionId);
        }
        ArrayList<ru.mail.libverify.d.b> arrayList = this.l.mobileIdRoutes;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.n.put("mobileid_info", ru.mail.libverify.q0.a.f(new ru.mail.libverify.d.a(this.l.mobileIdRoutes)));
        }
        if (Objects.equals(this.l.action, ru.mail.libverify.l.b.CALLIN_CALL) && (str = this.l.phone) != null) {
            this.n.put("phone", str);
        }
        ru.mail.libverify.j0.f fVar2 = this.n;
        boolean a2 = ru.mail.libverify.a.a.a();
        fVar2.getClass();
        fVar2.put("use_lifecycle", a2 ? "1" : "0");
        ru.mail.libverify.i.j jVar = this.l.pushPermissions;
        if (jVar != null) {
            ru.mail.libverify.j0.f fVar3 = this.n;
            boolean a3 = jVar.a();
            fVar3.getClass();
            fVar3.put("view_push", a3 ? "1" : "0");
        }
        return this.n;
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

    @Override // ru.mail.libverify.j0.k
    public final boolean v() {
        if (!TextUtils.isEmpty(this.l.appCheckParams)) {
            return true;
        }
        ArrayList<ru.mail.libverify.d.b> arrayList = this.l.mobileIdRoutes;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    @Override // ru.mail.libverify.requests.c
    public final boolean w() {
        return true;
    }

    public l(@NonNull w wVar, @NonNull ru.mail.libverify.l.c cVar, @Nullable Network network) {
        super(wVar);
        this.n = null;
        this.l = cVar;
        this.a = network;
        this.m = new x(this, this.h);
    }

    public l(@NonNull w wVar, @NonNull ru.mail.libverify.j0.m mVar) throws JsonParseException {
        super(wVar);
        this.n = null;
        this.l = (ru.mail.libverify.l.c) ru.mail.libverify.q0.a.a(mVar.a, ru.mail.libverify.l.c.class);
        this.m = new x(this, wVar);
    }
}
