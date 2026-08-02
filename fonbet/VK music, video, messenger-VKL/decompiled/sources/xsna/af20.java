package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.attaches.MediaType;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.ij20;
import xsna.k7r0;

/* compiled from: MessagesGetHistoryClipsApiCmd.kt */
/* loaded from: classes2.dex */
public final class af20 extends nx2<a> {
    public final long b;
    public final int c;
    public final int d;
    public final List<MediaType> e;
    public final Peer f;
    public final b g = new b();

    /* compiled from: MessagesGetHistoryClipsApiCmd.kt */
    public static final class a {
        public final ArrayList a;

        public a(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("HistoryClipsResponse(clips="), this.a);
        }
    }

    /* compiled from: MessagesGetHistoryClipsApiCmd.kt */
    public static final class b implements k7r0<a> {
        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            try {
                return k8v.a(jSONObject.getJSONObject("response"));
            } catch (JSONException e) {
                throw new VKApiIllegalResponseException(e);
            }
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    public af20(long j, int i, int i2, List list, Peer peer) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = list;
        this.f = peer;
    }

    @Override // xsna.nx2
    public final a f(l7r0 l7r0Var) {
        ij20.a aVar = new ij20.a();
        aVar.d = l7r0Var.a.g;
        aVar.c = "messages.getHistoryAttachments";
        aVar.f.put("peer_id", Long.valueOf(this.b).toString());
        Peer peer = this.f;
        peer.getClass();
        if (peer.Ab(Peer.Type.GROUP)) {
            aVar.f.put("group_id", Long.valueOf(peer.d).toString());
        }
        aVar.f.put("count", Integer.valueOf(this.d).toString());
        aVar.f.put("cmid", Integer.valueOf(this.c).toString());
        aVar.b("attachment_types", j5g.g0(this.e, StringUtils.COMMA, null, null, 0, new nyq(13), 30));
        Integer num = 1;
        aVar.f.put("need_short_info", num.toString());
        aVar.i = false;
        ij20 ij20Var = new ij20(aVar);
        return (a) bz2.k(ij20Var, this.g, new com.vk.movika.sdk.base.logic.interactor.n(l7r0Var, ij20Var, this, 3));
    }
}
