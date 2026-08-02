package xsna;

import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.k7r0;
import xsna.xbr0;

/* compiled from: QueueReleaseApiCmd.kt */
/* loaded from: classes5.dex */
public final class pre0 extends nx2<Boolean> {
    public final UserId b;
    public final String c;
    public final Collection<xqe0> d;
    public final boolean e = true;

    /* compiled from: QueueReleaseApiCmd.kt */
    public static final class a implements k7r0<Boolean> {
        public static final a b = new a();

        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            try {
                jSONObject.getInt("OK");
                return Boolean.TRUE;
            } catch (JSONException e) {
                throw new VKApiIllegalResponseException(e);
            }
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    public pre0(UserId userId, String str, Collection collection) {
        this.b = userId;
        this.c = str;
        this.d = collection;
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        Collection<xqe0> collection = this.d;
        if (collection.isEmpty()) {
            return Boolean.TRUE;
        }
        Collection<xqe0> collection2 = collection;
        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((xqe0) it.next()).c);
        }
        String B = f870.B(arrayList, "", null);
        ArrayList arrayList2 = new ArrayList(c5g.u(collection2, 10));
        Iterator<T> it2 = collection2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((xqe0) it2.next()).d));
        }
        String B2 = f870.B(arrayList2, BundleUtil.UNDERLINE_TAG, null);
        xbr0.a aVar = new xbr0.a();
        aVar.a = this.c;
        aVar.f = this.e;
        aVar.d = 0;
        aVar.b = false;
        aVar.a("act", "a_release");
        aVar.a("id", String.valueOf(this.b.b));
        aVar.a("key", B);
        aVar.a("ts", B2);
        return (Boolean) l7r0.g(l7r0Var, new xbr0(aVar), a.b);
    }
}
