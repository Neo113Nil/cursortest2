package xsna;

import com.vk.dto.newsfeed.SituationalSuggest;
import com.vk.dto.newsfeed.TagConfirmation;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.fave.entities.FavePage;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.collections.EmptyList;
import xsna.c5f0;
import xsna.jzf0;

/* compiled from: NewsfeedItemsTransformer.kt */
/* loaded from: classes4.dex */
public final class pn60 {
    public a a;
    public final n070 f;
    public final AtomicInteger b = new AtomicInteger();
    public final ConcurrentHashMap<Object, Integer> c = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Object, wm60> d = new ConcurrentHashMap<>();
    public final com.vk.newsfeed.common.util.j e = new com.vk.newsfeed.common.util.j();
    public final ao8 g = new ao8(13);

    /* compiled from: NewsfeedItemsTransformer.kt */
    public static final class a {
        public final s1c0 a;
        public final String b;
        public final String c;

        public a(s1c0 s1c0Var, String str, String str2) {
            this.a = s1c0Var;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Config(displayContext=");
            sb.append(this.a);
            sb.append(", referer=");
            sb.append(this.b);
            sb.append(", listReferer=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: NewsfeedItemsTransformer.kt */
    public static final class b {
    }

    public pn60(a aVar, Lazy<? extends NewsFeedBridgeComponent> lazy) {
        this.a = aVar;
        this.f = new n070(lazy);
    }

    public static void b(pn60 pn60Var, String str) {
        a aVar = pn60Var.a;
        s1c0 s1c0Var = aVar.a;
        String str2 = aVar.b;
        if (str == null) {
            str = aVar.c;
        }
        pn60Var.a = new a(s1c0Var, str2, str);
        pn60Var.a();
    }

    public static List c(pn60 pn60Var, Object obj, wm60 wm60Var, Map map, int i) {
        int i2;
        ArrayList arrayList;
        String e;
        String e2;
        NewsfeedExternalAction.Navigation navigation;
        String str;
        NewsfeedExternalAction.Navigation navigation2;
        String str2;
        wm60 wm60Var2 = (i & 2) != 0 ? null : wm60Var;
        Map map2 = (i & 4) != 0 ? null : map;
        lzf0 stub = jzf0.a.a.getSTUB();
        ConcurrentHashMap<Object, wm60> concurrentHashMap = pn60Var.d;
        boolean z = obj instanceof k070;
        Class cls = z ? k070.class : obj instanceof ry60 ? ry60.class : obj instanceof c5f0 ? c5f0.class : obj;
        ConcurrentHashMap<Object, Integer> concurrentHashMap2 = pn60Var.c;
        Integer num = concurrentHashMap2.get(cls);
        if (num != null) {
            i2 = num.intValue();
        } else {
            int incrementAndGet = pn60Var.b.incrementAndGet();
            concurrentHashMap2.put(cls, Integer.valueOf(incrementAndGet));
            i2 = incrementAndGet;
        }
        wm60 wm60Var3 = concurrentHashMap.get(cls);
        if (wm60Var3 != null) {
            wm60Var2 = wm60Var3.b(wm60Var2);
        }
        wm60 wm60Var4 = wm60Var2;
        if (wm60Var4 != null) {
            concurrentHashMap.put(cls, wm60Var4);
        } else {
            concurrentHashMap.remove(cls);
        }
        if (z) {
            return pn60Var.f.a((k070) obj);
        }
        if (obj instanceof ry60) {
            pn60Var.g.getClass();
            return ao8.v(i2, (ry60) obj);
        }
        boolean z2 = true;
        if (obj instanceof SituationalSuggest) {
            SituationalSuggest situationalSuggest = (SituationalSuggest) obj;
            List<String> list = situationalSuggest.i;
            List V = list != null ? j5g.V(list) : null;
            boolean z3 = V == null || V.isEmpty();
            boolean z4 = !z3;
            String str3 = situationalSuggest.g;
            boolean z5 = str3 == null || str3.length() == 0;
            boolean z6 = !z5;
            String str4 = situationalSuggest.d;
            String str5 = situationalSuggest.e;
            SituationalSuggest.SituationalImage situationalImage = situationalSuggest.j;
            String str6 = situationalImage != null ? situationalImage.b : null;
            SituationalSuggest.SituationalImage situationalImage2 = situationalSuggest.k;
            String str7 = situationalImage2 != null ? situationalImage2.b : null;
            boolean z7 = situationalImage != null ? situationalImage.c : false;
            boolean z8 = situationalImage2 != null ? situationalImage2.c : false;
            if (V == null) {
                V = EmptyList.b;
            }
            return Collections.singletonList(new twj0(str4, str5, str6, str7, z7, z8, V, z4, situationalSuggest.g, z6, (z3 && z5) ? false : true, situationalSuggest, i2));
        }
        int i3 = i2;
        if (obj instanceof mv60) {
            int i4 = ((mv60) obj).a;
            int i5 = i4 == 0 ? -2 : -1;
            if (i4 == -2) {
                e = y8g0.e(R.string.no_news_friends);
                e2 = y8g0.e(R.string.find_friends);
                navigation = NewsfeedExternalAction.Navigation.a.a;
            } else {
                if (i4 != 0) {
                    str = y8g0.e(R.string.no_news_list);
                    str2 = null;
                    navigation2 = null;
                    z2 = false;
                    return Collections.singletonList(new ov60(str, str2, z2, i5, navigation2, i3));
                }
                e = y8g0.e(R.string.newsfeed_placeholder_title);
                e2 = y8g0.e(R.string.newsfeed_placeholder_find_interesting);
                navigation = NewsfeedExternalAction.Navigation.w.a;
            }
            str = e;
            navigation2 = navigation;
            str2 = e2;
            return Collections.singletonList(new ov60(str, str2, z2, i5, navigation2, i3));
        }
        if (obj instanceof nu60) {
            return Collections.singletonList(new bf90(1117, 0, i3, 0, null));
        }
        if (obj instanceof ru60) {
            return Collections.singletonList(new hf90(1118, 0, i3, 0, null));
        }
        if (obj instanceof rlt) {
            return w65.r(i3, (rlt) obj);
        }
        if (obj instanceof frq) {
            return Collections.singletonList(new hrq(1114, 0, i3, 2, null));
        }
        if (obj instanceof tqq) {
            List<FavePage> list2 = ((tqq) obj).a;
            return !list2.isEmpty() ? Collections.singletonList(new vqq(list2, i3)) : EmptyList.b;
        }
        if (obj instanceof mnq) {
            return Collections.singletonList(new onq(((mnq) obj).a, i3));
        }
        if (obj instanceof umq) {
            return Collections.singletonList(new wmq(1116, 0, i3, 0, null));
        }
        if (obj instanceof unq) {
            return nr2.O(i3, (unq) obj);
        }
        if (obj instanceof d5f0) {
            return Collections.singletonList(new f5f0(i3));
        }
        if (obj instanceof c5f0) {
            c5f0 c5f0Var = (c5f0) obj;
            List<c5f0.a> list3 = c5f0Var.a;
            ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList2.add(((c5f0.a) it.next()).a);
            }
            return Collections.singletonList(new b5f0(arrayList2, i3, c5f0Var));
        }
        if (obj instanceof p3f0) {
            return Collections.singletonList(new r3f0(i3));
        }
        if (obj instanceof rba0) {
            s1c0 s1c0Var = pn60Var.a.a;
            rba0 rba0Var = (rba0) obj;
            u1c0 u1c0Var = new u1c0(16, rba0Var.a);
            u1c0Var.g = new TagConfirmation(rba0Var.b, rba0Var.d, rba0Var.c);
            u1c0Var.n = s1c0Var;
            s3q0 s3q0Var = s3q0.a;
            return a020.w(i3, e43.a(u1c0Var), wm60Var4);
        }
        if (obj instanceof zba0) {
            s1c0 s1c0Var2 = pn60Var.a.a;
            zba0 zba0Var = (zba0) obj;
            u1c0 u1c0Var2 = new u1c0(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, zba0Var.a);
            u1c0Var2.g = zba0Var.b;
            u1c0Var2.n = s1c0Var2;
            s3q0 s3q0Var2 = s3q0.a;
            return a020.w(i3, e43.a(u1c0Var2), wm60Var4);
        }
        if (obj instanceof g9a0) {
            s1c0 s1c0Var3 = pn60Var.a.a;
            u1c0 u1c0Var3 = new u1c0(145, ((g9a0) obj).a);
            u1c0Var3.n = s1c0Var3;
            s3q0 s3q0Var3 = s3q0.a;
            return a020.w(i3, e43.a(u1c0Var3), wm60Var4);
        }
        if (obj instanceof u9a0) {
            s1c0 s1c0Var4 = pn60Var.a.a;
            r74 r74Var = new r74(33, null, null, null);
            r74Var.n = s1c0Var4;
            s3q0 s3q0Var4 = s3q0.a;
            return a020.w(i3, e43.a(r74Var), wm60Var4);
        }
        if (obj instanceof zsj) {
            zsj zsjVar = (zsj) obj;
            l1c0 l1c0Var = new l1c0(zsjVar.b, zsjVar.c);
            Post post = zsjVar.a;
            ol60 ol60Var = (ol60) j5g.a0(l1c0Var.c(post));
            if (ol60Var == null) {
                return EmptyList.b;
            }
            u1c0 u1c0Var4 = new u1c0(350, post);
            u1c0Var4.h = ol60Var;
            return a020.w(i3, Collections.singletonList(u1c0Var4), wm60Var4);
        }
        if (!(obj instanceof NewsEntry)) {
            throw new IllegalArgumentException("Instances of " + obj.getClass().getSimpleName() + " are not supported");
        }
        Object obj2 = map2 != null ? map2.get(obj) : null;
        if (obj2 instanceof k0d0) {
            arrayList = ((k0d0) obj2).a;
        } else {
            com.vk.newsfeed.common.util.j jVar = pn60Var.e;
            a aVar = pn60Var.a;
            s1c0 s1c0Var5 = aVar.a;
            String str8 = aVar.b;
            String str9 = aVar.c;
            jVar.getClass();
            ArrayList arrayList3 = new ArrayList();
            jVar.f((NewsEntry) obj, s1c0Var5, str8, str9, arrayList3, stub, wm60Var4);
            arrayList = arrayList3;
        }
        return a020.w(i3, arrayList, wm60Var4);
    }

    public final void a() {
        this.b.set(0);
        this.c.clear();
        this.d.clear();
    }
}
