package xsna;

import android.content.Intent;
import com.vk.api.generated.friends.dto.FriendsFriendsListDto;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bex0;

/* compiled from: VkUiFriendsSearchCommand.kt */
/* loaded from: classes7.dex */
public final class dwv0 extends dvv0 {
    public final FragmentImpl e;
    public final Object f = msy.a(LazyThreadSafetyMode.NONE, new e6k0(11));

    /* compiled from: VkUiFriendsSearchCommand.kt */
    public static final class a {
        public static final JSONObject a(List list) {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((UserId) it.next()).b);
            }
            jSONObject.put("ids", jSONArray);
            return jSONObject;
        }

        public static final JSONObject b(ArrayList arrayList) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("listIds", new JSONArray((Collection) arrayList));
            return jSONObject;
        }
    }

    /* compiled from: VkUiFriendsSearchCommand.kt */
    public static final class b {
        public final String[] a;
        public final boolean[] b;
        public final List<FriendsFriendsListDto> c;

        public b(String[] strArr, boolean[] zArr, List<FriendsFriendsListDto> list) {
            this.a = strArr;
            this.b = zArr;
            this.c = list;
        }
    }

    public dwv0(FragmentImpl fragmentImpl) {
        this.e = fragmentImpl;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.dvv0
    public final void a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        if (!jSONObject.optBoolean("lists")) {
            pro0.f(new km1(25, this, jSONObject));
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("listIds");
        List L = optJSONArray != null ? f370.L(optJSONArray) : EmptyList.b;
        io.reactivex.rxjava3.disposables.b b2 = b();
        if (b2 != null) {
            b2.b(rsg0.W(yfb.x(nts.f((nts) this.f.getValue(), o25.a().c(), 6)), 7).l(new pu50(new i54(L, 2), 19)).m(asu0.a.d()).subscribe(new ksb0(new b8e0(this, 28), 17), new jgv0(new kl60(26), 1)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    @Override // xsna.dvv0
    public final void c(int i, int i2, Intent intent) {
        ?? r2;
        List<Long> t0;
        ?? r22;
        if (i == 212) {
            if (intent != null && intent.hasExtra("result")) {
                r6y r6yVar = this.b;
                if (r6yVar != null) {
                    JsApiMethodType jsApiMethodType = JsApiMethodType.FRIENDS_SEARCH;
                    ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("result");
                    if (parcelableArrayListExtra != null) {
                        r22 = new ArrayList(c5g.u(parcelableArrayListExtra, 10));
                        Iterator it = parcelableArrayListExtra.iterator();
                        while (it.hasNext()) {
                            r22.add(((UserProfile) it.next()).c);
                        }
                    } else {
                        r22 = EmptyList.b;
                    }
                    bex0.a.b(r6yVar, jsApiMethodType, a.a(r22), null, 12);
                    return;
                }
                return;
            }
            if (intent == null || !intent.hasExtra("ids")) {
                r6y r6yVar2 = this.b;
                if (r6yVar2 != null) {
                    bex0.a.b(r6yVar2, JsApiMethodType.FRIENDS_SEARCH, a.a(EmptyList.b), null, 12);
                    return;
                }
                return;
            }
            r6y r6yVar3 = this.b;
            if (r6yVar3 != null) {
                JsApiMethodType jsApiMethodType2 = JsApiMethodType.FRIENDS_SEARCH;
                long[] longArrayExtra = intent.getLongArrayExtra("ids");
                if (longArrayExtra == null || (t0 = rl3.t0(longArrayExtra)) == null) {
                    r2 = EmptyList.b;
                } else {
                    List<Long> list = t0;
                    r2 = new ArrayList(c5g.u(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        dq.h(((Number) it2.next()).longValue(), r2);
                    }
                }
                bex0.a.b(r6yVar3, jsApiMethodType2, a.a(r2), null, 12);
            }
        }
    }
}
