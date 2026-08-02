package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.ij20;
import xsna.k7r0;

/* compiled from: BroadcastDataProvider.kt */
/* loaded from: classes7.dex */
public final class se8 {
    public final wy2 a;
    public final w1i b;

    /* compiled from: BroadcastDataProvider.kt */
    public static final class a<Result> implements k7r0 {
        public static final a<Result> b = new a<>();

        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            JSONArray jSONArray = jSONObject.getJSONObject("response").getJSONArray("items");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(efw0.a(jSONArray.getJSONObject(i)));
            }
            return arrayList;
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    /* compiled from: BroadcastDataProvider.kt */
    public static final class b<Result> implements k7r0 {
        public static final b<Result> b = new b<>();

        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            JSONArray jSONArray = jSONObject.getJSONArray("response");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(vyd0.a(jSONArray.getJSONObject(i)));
            }
            return arrayList;
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    /* compiled from: BroadcastDataProvider.kt */
    public static final class c<Result> implements k7r0 {
        public static final c<Result> b = new c<>();

        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            JSONArray jSONArray = jSONObject.getJSONObject("response").getJSONArray("items");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(efw0.a(jSONArray.getJSONObject(i)));
            }
            return arrayList;
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    /* compiled from: BroadcastDataProvider.kt */
    public static final class d<Result> implements k7r0 {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            ?? r2;
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            int w = f370.w(jSONObject2, 0, "unique_viewers");
            JSONArray optJSONArray = jSONObject2.optJSONArray("friends_viewers");
            if (optJSONArray != null) {
                r2 = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    r2.add(vyd0.b(optJSONArray.getJSONObject(i), ((Boolean) se8.this.b.invoke()).booleanValue()));
                }
            } else {
                r2 = EmptyList.b;
            }
            return new gfw0(w, r2);
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    public se8(wy2 wy2Var, w1i w1iVar) {
        this.a = wy2Var;
        this.b = w1iVar;
    }

    public final dfw0 a(String str, String str2) {
        Object obj;
        ij20.a aVar = new ij20.a();
        aVar.c = "video.get";
        aVar.b("videos", str2 + '_' + str);
        Integer num = 1;
        aVar.f.put("extended", num.toString());
        aVar.i = false;
        aVar.g = 0;
        Iterator it = ((List) this.a.d(new ij20(aVar), a.b)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            dfw0 dfw0Var = (dfw0) obj;
            if (dfw0Var.a.equals(str) && dfw0Var.b.equals(str2)) {
                break;
            }
        }
        return (dfw0) obj;
    }

    public final List<qvw0> b() {
        ij20.a aVar = new ij20.a();
        aVar.c = "video.getGroupsForStreaming";
        aVar.i = false;
        aVar.g = 0;
        return (List) this.a.d(new ij20(aVar), b.b);
    }

    public final Collection<dfw0> c(Collection<String> collection) {
        if (collection.isEmpty()) {
            return EmptyList.b;
        }
        ij20.a aVar = new ij20.a();
        aVar.c = "video.getUpcomingLives";
        aVar.b("owner_ids", j5g.g0(collection, StringUtils.COMMA, null, null, 0, null, 62));
        aVar.i = false;
        aVar.g = 0;
        return (Collection) this.a.d(new ij20(aVar), c.b);
    }

    public final qvw0 d(String str) {
        int parseInt = Integer.parseInt(str);
        wy2 wy2Var = this.a;
        if (parseInt >= 0) {
            ij20.a aVar = new ij20.a();
            aVar.c = "users.get";
            aVar.b("user_ids", str);
            aVar.b("fields", "first_name,last_name,photo_base,sex,verified,friend_status,can_call,contact_name,is_nft,is_nft_photo");
            aVar.i = false;
            aVar.g = 0;
            return (qvw0) wy2Var.d(new ij20(aVar), new ve8(this));
        }
        ij20.a aVar2 = new ij20.a();
        aVar2.c = "groups.getById";
        aVar2.f.put("group_ids", Integer.valueOf(-Integer.parseInt(str)).toString());
        aVar2.b("fields", "name,photo_base,is_nft_photo,is_closed");
        aVar2.i = false;
        aVar2.g = 0;
        return (qvw0) wy2Var.d(new ij20(aVar2), ue8.b);
    }

    public final dfw0 e(String str, String str2) {
        int parseInt = Integer.parseInt(str2);
        ij20.a aVar = new ij20.a();
        aVar.c = "video.stopStreaming";
        aVar.b("video_id", str);
        Integer num = 1;
        aVar.f.put("extended", num.toString());
        aVar.b("fields", "unique_viewers,friends_viewers,first_name,last_name,photo_base,sex,verified,friend_status,can_call,contact_name,is_nft,is_nft_photo");
        if (parseInt < 0) {
            aVar.f.put("group_id", Integer.valueOf(-parseInt).toString());
        }
        if (parseInt > 0) {
            aVar.f.put("user_id", Integer.valueOf(parseInt).toString());
        }
        aVar.i = false;
        aVar.g = 4;
        gfw0 gfw0Var = (gfw0) this.a.d(new ij20(aVar), new d());
        Thread.sleep(1000L);
        dfw0 a2 = a(str, str2);
        dfw0 a3 = a2 != null ? dfw0.a(a2, null, 0L, Integer.valueOf(gfw0Var.a), gfw0Var.b, 0, 260607) : null;
        if (a3 != null) {
            return a3;
        }
        throw new IllegalStateException("Expect broadcast to exist right after creation");
    }
}
