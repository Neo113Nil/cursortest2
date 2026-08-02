package xsna;

import com.vk.api.sdk.VKApiConfig;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import java.util.ArrayList;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ij20;
import xsna.k7r0;

/* compiled from: AccountGetContactListApiCmd.kt */
/* loaded from: classes2.dex */
public final class go extends nx2<a> {
    public final int b = 50;
    public final boolean c = true;
    public final String d;

    /* compiled from: AccountGetContactListApiCmd.kt */
    public static final class a {
        public final ArrayList a;
        public final ProfilesSimpleInfo b;
        public final Long c;

        public a(ArrayList arrayList, ProfilesSimpleInfo profilesSimpleInfo, Long l) {
            this.a = arrayList;
            this.b = profilesSimpleInfo;
            this.c = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + io.reactivex.rxjava3.subjects.c.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AccountContactListResponse(itemsDialogIds=");
            sb.append(this.a);
            sb.append(", profiles=");
            sb.append(this.b);
            sb.append(", contactsLastUpdateTimeSeconds=");
            return iq.b(sb, this.c, ')');
        }
    }

    /* compiled from: AccountGetContactListApiCmd.kt */
    public static final class b implements k7r0<a> {
        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            return new a(f370.J(jSONObject2.getJSONArray("items")), i1e0.b(jSONObject2), Long.valueOf(jSONObject2.optLong("contacts_last_update", 0L)));
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    public go(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go)) {
            return false;
        }
        go goVar = (go) obj;
        return this.b == goVar.b && this.c == goVar.c && epx.f(this.d, goVar.d);
    }

    @Override // xsna.nx2
    public final a f(l7r0 l7r0Var) {
        ij20.a aVar = new ij20.a();
        VKApiConfig vKApiConfig = l7r0Var.a;
        aVar.d = vKApiConfig.g;
        aVar.i = this.c;
        aVar.c = "account.getContactList";
        aVar.h(vKApiConfig.f, "device_id");
        aVar.f.put("count", Integer.valueOf(this.b).toString());
        Integer num = 0;
        aVar.f.put(SignalingProtocol.KEY_OFFSET, num.toString());
        aVar.b("lang", this.d);
        return (a) l7r0Var.d(new ij20(aVar), new b());
    }

    public final int hashCode() {
        return this.d.hashCode() + qoy.b(shy.a(0, Integer.hashCode(this.b) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountGetContactListApiCmd(count=");
        sb.append(this.b);
        sb.append(", offset=0, awaitNetwork=");
        sb.append(this.c);
        sb.append(", languageCode=");
        return ho8.a(sb, this.d, ')');
    }
}
