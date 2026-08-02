package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.Peer;
import com.vk.im.engine.exceptions.ApiArgNotFoundException;
import com.vk.im.engine.exceptions.InvalidCredentialsException;
import com.vk.im.engine.exceptions.chat.ChatNotExistsException;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.k7r0;

/* compiled from: MessagesGetConversationsByIdApiCmd.kt */
/* loaded from: classes2.dex */
public final class re20 extends nx2<b> {
    public final List<Peer> b;
    public final Peer c;
    public final boolean d;
    public final String e;

    /* compiled from: MessagesGetConversationsByIdApiCmd.kt */
    public static final class a implements k7r0<b> {
        public static b b(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            JSONArray jSONArray = jSONObject2.getJSONArray("items");
            ProfilesSimpleInfo b = i1e0.b(jSONObject2);
            f1e0 f1e0Var = new f1e0();
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(dsj.b(jSONArray.getJSONObject(i), f1e0Var));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                dsj.a((com.vk.im.engine.models.dialogs.a) it.next(), b);
            }
            HashMap hashMap = new HashMap(arrayList.size());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                hashMap.put(Long.valueOf(((com.vk.im.engine.models.dialogs.a) next).a), next);
            }
            return new b(hashMap, b);
        }

        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            try {
                return b(jSONObject);
            } catch (JSONException e) {
                throw new VKApiIllegalResponseException(e);
            }
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    /* compiled from: MessagesGetConversationsByIdApiCmd.kt */
    public static final class b {
        public final HashMap a;
        public final ProfilesSimpleInfo b;

        public b(HashMap hashMap, ProfilesSimpleInfo profilesSimpleInfo) {
            this.a = hashMap;
            this.b = profilesSimpleInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b.equals(bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Response(dialogs=" + this.a + ", info=" + this.b + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public re20(List<? extends Peer> list, Peer peer, boolean z, String str) {
        this.b = list;
        this.c = peer;
        this.d = z;
        this.e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.nx2
    public final b f(l7r0 l7r0Var) {
        Throwable invalidCredentialsException;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = "";
        try {
            b bVar = new b(new LinkedHashMap(), new ProfilesSimpleInfo());
            Iterator it = j5g.V0(this.b, 100, 100, true, new ihb(ref$ObjectRef, l7r0Var, this, 6)).iterator();
            while (it.hasNext()) {
                b bVar2 = (b) it.next();
                ttp0.c(bVar.a).putAll(bVar2.a);
                bVar.b.Hb(bVar2.b);
            }
            return bVar;
        } catch (VKApiExecutionException e) {
            if (e.V()) {
                com.vk.metrics.eventtracking.b.a.a(e);
                invalidCredentialsException = new InvalidCredentialsException(e);
            } else if (e.Q()) {
                com.vk.metrics.eventtracking.b.a.a(e);
                invalidCredentialsException = new ChatNotExistsException(e);
            } else {
                if (e.s() != 100) {
                    throw e;
                }
                com.vk.metrics.eventtracking.b.a.a(new IllegalStateException(ho8.a(new StringBuilder("messages.getConversationsById ["), (String) ref$ObjectRef.element, ']'), e));
                invalidCredentialsException = new ApiArgNotFoundException(e);
            }
            throw invalidCredentialsException;
        }
    }
}
