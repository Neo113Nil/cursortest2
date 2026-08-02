package defpackage;

import com.yandex.messaging.core.net.entities.proto.message.ReactionInfo;
import com.yandex.messaging.core.net.entities.proto.message.UserReaction;
import com.yandex.messaging.internal.entities.FullReactionInfo;
import com.yandex.messaging.internal.entities.MessageReactions;
import com.yandex.mobile.drive.sdk.full.Environment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public abstract class cha1 {
    public static void a(int i, int i2) {
        if (i < 0 || i >= i2) {
            ny61.s();
        }
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ny61.r(str);
    }

    public static void c(String str, boolean z) {
        if (z) {
            return;
        }
        ny61.g(str);
    }

    public static String d() {
        return cvu0.x("/external/sessions/current?multi_sessions=1", "http", false) ? "/external/sessions/current?multi_sessions=1" : g().concat("/external/sessions/current?multi_sessions=1");
    }

    public static ssa0 e(ArrayList arrayList, int i, UserReaction[] userReactionArr, long j) {
        ReactionInfo[] reactionInfoArr;
        ReactionInfo reactionInfo;
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FullReactionInfo fullReactionInfo = (FullReactionInfo) it.next();
            ReactionInfo reactionInfo2 = new ReactionInfo();
            reactionInfo2.type = fullReactionInfo.getType();
            boolean isChecked = fullReactionInfo.isChecked();
            int count = fullReactionInfo.getCount();
            if (isChecked) {
                count--;
            }
            reactionInfo2.count = count;
            if (reactionInfo2.type == i) {
                count++;
            }
            reactionInfo2.count = count;
            arrayList2.add(reactionInfo2);
        }
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                if (((ReactionInfo) it2.next()).type == i) {
                    break;
                }
            }
        }
        if (i != 0) {
            int size = arrayList2.size() + 1;
            ReactionInfo[] reactionInfoArr2 = new ReactionInfo[size];
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 < arrayList2.size()) {
                    reactionInfo = (ReactionInfo) arrayList2.get(i2);
                } else {
                    reactionInfo = new ReactionInfo();
                    reactionInfo.type = i;
                    reactionInfo.count = 1;
                }
                reactionInfoArr2[i2] = reactionInfo;
            }
            reactionInfoArr = reactionInfoArr2;
            return new ssa0(j, MessageReactions.a(reactionInfoArr, userReactionArr));
        }
        reactionInfoArr = (ReactionInfo[]) arrayList2.toArray(new ReactionInfo[0]);
        return new ssa0(j, MessageReactions.a(reactionInfoArr, userReactionArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    public static evo f(u2l u2lVar, JSONObject jSONObject) {
        ?? r4;
        int optInt = jSONObject.optInt("percentage", 50);
        int optInt2 = jSONObject.optInt("duration", 1000);
        int optInt3 = jSONObject.optInt("limit", 0);
        JSONArray optJSONArray = jSONObject.optJSONArray("actions");
        if (optJSONArray != null) {
            d6w n = y6i0.n(0, optJSONArray.length());
            r4 = new ArrayList();
            c6w it = n.iterator();
            while (it.c) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(it.nextInt());
                v3k v3kVar = null;
                if (optJSONObject != null) {
                    try {
                        kvo kvoVar = v3k.m;
                        v3kVar = kp50.p(u2lVar, optJSONObject);
                    } catch (Exception unused) {
                    }
                }
                if (v3kVar != null) {
                    r4.add(v3kVar);
                }
            }
        } else {
            r4 = EmptyList.a;
        }
        return new evo(optInt, optInt2, optInt3, r4);
    }

    public static String g() {
        Environment environment = (Environment) bfm.i.a.get();
        if (environment == null) {
            environment = Environment.STABLE;
        }
        int i = f1.a[environment.ordinal()];
        if (i == 1) {
            return "https://stable.carsharing.yandex.net";
        }
        if (i == 2) {
            return "https://prestable.carsharing.yandex.net";
        }
        if (i == 3 || i == 4) {
            return "https://testing.carsharing.yandex.net";
        }
        w511.b();
        return null;
    }
}
