package xsna;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.appredirects.entity.App;
import com.vk.appredirects.entity.LinkType;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.text.Regex;

/* compiled from: AppRedirector.kt */
/* loaded from: classes15.dex */
public final class l83 {
    public final Set<String> a = Collections.singleton(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT);
    public final Set<String> b = rl3.y0(new String[]{"http", HttpRequest.DEFAULT_SCHEME});
    public final Set<String> c = rl3.y0(new String[]{"vklink", "vkontakte", "vk"});
    public final Set<String> d = Collections.singleton("vkclips");
    public final Set<String> e = Collections.singleton("vkme");
    public final Set<String> f = Collections.singleton("vkvideo");
    public final Set<String> g = rl3.y0(new String[]{"vk", "vkcalls"});
    public final Set<String> h = Collections.singleton("vkdating");
    public final Set<String> i = Collections.singleton("vkmusic");
    public final ArrayList<String> j;
    public final LinkedHashSet k;
    public final Set<String> l;
    public final Set<String> m;
    public final Set<String> n;
    public final Set<String> o;
    public final Set<String> p;
    public final Set<String> q;
    public final Set<String> r;
    public final Set<String> s;
    public final Set<String> t;
    public final Set<String> u;
    public final LinkedHashSet v;
    public final Set<String> w;
    public final Set<String> x;

    /* compiled from: AppRedirector.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[App.values().length];
            try {
                iArr[App.VK_APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[App.VK_ME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[App.VK_CALLS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[App.VK_CLIPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[App.VK_VIDEO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[App.VK_TV.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[App.VK_DATING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[App.VK_MUSIC.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LinkType.values().length];
            try {
                iArr2[LinkType.IM.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[LinkType.CALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[LinkType.CLIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[LinkType.VIDEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public l83() {
        ArrayList<String> a2 = e43.a("vk.com", "vk.ru", "vkvideo.ru");
        this.j = a2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> it = a2.iterator();
        while (it.hasNext()) {
            String next = it.next();
            linkedHashSet.add("connect." + next);
            linkedHashSet.add("id." + next);
            linkedHashSet.add("qr." + next);
            linkedHashSet.add("oauth." + next);
        }
        this.k = linkedHashSet;
        ArrayList<String> arrayList = this.j;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator<String> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add("m." + it2.next());
        }
        this.l = j5g.S0(arrayList2);
        this.m = Collections.singleton("vk.me");
        Set<String> S0 = j5g.S0(this.j);
        this.n = S0;
        this.o = rl3.y0(new String[]{"sportmailru.vk.com", "sportmailru.m.vk.com", "sportmailru.vk.ru", "sportmailru.m.vk.ru"});
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : S0) {
            if (drm0.D((String) obj, "video", false)) {
                arrayList3.add(obj);
            }
        }
        this.p = j5g.S0(arrayList3);
        Set<String> set = this.l;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : set) {
            if (drm0.D((String) obj2, "video", false)) {
                arrayList4.add(obj2);
            }
        }
        this.q = j5g.S0(arrayList4);
        Set<String> set2 = this.p;
        ArrayList arrayList5 = new ArrayList(c5g.u(set2, 10));
        Iterator<T> it3 = set2.iterator();
        while (it3.hasNext()) {
            arrayList5.add("vksport." + ((String) it3.next()));
        }
        this.r = j5g.S0(arrayList5);
        this.s = Collections.singleton("vk.link");
        this.t = BuildInfo.t() ? rl3.y0(new String[]{"sferum.ru", "me.sferum.ru"}) : Collections.singleton("sferum.ru");
        ArrayList<String> arrayList6 = this.j;
        ArrayList arrayList7 = new ArrayList(c5g.u(arrayList6, 10));
        Iterator<String> it4 = arrayList6.iterator();
        while (it4.hasNext()) {
            arrayList7.add("clips." + it4.next());
        }
        this.u = j5g.S0(arrayList7);
        this.v = izi0.j(izi0.j(this.s, this.n), this.m);
        ArrayList<String> arrayList8 = this.j;
        ArrayList arrayList9 = new ArrayList(c5g.u(arrayList8, 10));
        Iterator<String> it5 = arrayList8.iterator();
        while (it5.hasNext()) {
            arrayList9.add("qr." + it5.next());
        }
        this.w = j5g.S0(arrayList9);
        ArrayList<String> arrayList10 = this.j;
        ArrayList arrayList11 = new ArrayList(c5g.u(arrayList10, 10));
        Iterator<String> it6 = arrayList10.iterator();
        while (it6.hasNext()) {
            arrayList11.add("multiqr." + it6.next());
        }
        this.x = j5g.S0(arrayList11);
    }

    public static boolean a(Intent intent, Set set) {
        String str;
        String query;
        String action;
        Set<String> categories;
        String host;
        String scheme;
        Set<f9z> set2 = set;
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            return false;
        }
        for (f9z f9zVar : set2) {
            bpn0 bpn0Var = f9zVar.h;
            Set<String> set3 = f9zVar.b;
            Set<String> set4 = f9zVar.c;
            Set<String> set5 = f9zVar.d;
            if (!((Boolean) bpn0Var.getValue()).booleanValue()) {
                Uri data = intent.getData();
                if (set5 == null || (data != null && (scheme = data.getScheme()) != null && set5.contains(scheme))) {
                    Set set6 = (Set) f9zVar.g.getValue();
                    if (set6 == null || (data != null && (host = data.getHost()) != null && set6.contains(host.toLowerCase(Locale.US)))) {
                        if (set4 == null || ((categories = intent.getCategories()) != null && !j5g.d0(set4, categories).isEmpty())) {
                            if (set3 == null || ((action = intent.getAction()) != null && set3.contains(action))) {
                                String str2 = "";
                                if (data == null || (str = data.getPath()) == null) {
                                    str = "";
                                }
                                if (data != null && (query = data.getQuery()) != null) {
                                    str2 = query;
                                }
                                String a2 = v1v.a('?', str, str2);
                                Set<Regex> set7 = f9zVar.f;
                                if (set7 != null) {
                                    Set<Regex> set8 = set7;
                                    if (!(set8 instanceof Collection) || !set8.isEmpty()) {
                                        Iterator<T> it = set8.iterator();
                                        while (it.hasNext()) {
                                            if (((Regex) it.next()).f(a2)) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                                Set<Regex> set9 = f9zVar.a;
                                if (set9 == null) {
                                    return true;
                                }
                                Set<Regex> set10 = set9;
                                if (!(set10 instanceof Collection) || !set10.isEmpty()) {
                                    Iterator<T> it2 = set10.iterator();
                                    while (it2.hasNext()) {
                                        if (((Regex) it2.next()).f(str)) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x08ef, code lost:
    
        if (r12 != null) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x090b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e83 b(Context context, Intent intent, App app2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        LinkedHashSet linkedHashSet;
        String str8;
        Pair pair;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        LinkedHashSet linkedHashSet2;
        Pair pair2;
        Set<String> stringSet;
        Iterable iterable;
        Iterator it;
        Set<String> set;
        String str15;
        String str16;
        String str17;
        LinkedHashSet linkedHashSet3;
        String str18;
        f9z f9zVar;
        int i = a.$EnumSwitchMapping$0[app2.ordinal()];
        LinkedHashSet linkedHashSet4 = this.k;
        ArrayList<String> arrayList = this.j;
        LinkedHashSet linkedHashSet5 = this.v;
        Set<String> set2 = this.n;
        Set<String> set3 = this.l;
        Set<String> set4 = this.b;
        switch (i) {
            case 1:
                str = "/video.*";
                str2 = "/im";
                str3 = "/room/.*";
                str4 = "/im\\?.*";
                str5 = "/mail.*";
                str6 = "/call/.*";
                str7 = "/call-add";
                linkedHashSet = linkedHashSet5;
                LinkedHashSet j = izi0.j(linkedHashSet, set3);
                f9z f9zVar2 = new f9z(null, null, null, this.c, null, null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
                f9z f9zVar3 = new f9z(null, null, null, this.b, j, null, 103);
                f9z f9zVar4 = new f9z(kq.b("/restore"), null, null, this.b, this.l, null, 102);
                f9z f9zVar5 = new f9z(null, null, Collections.singleton(NotificationCompat.INTENT_CATEGORY_NOTIFICATION_PREFERENCES), null, null, null, 123);
                f9z f9zVar6 = new f9z(null, null, null, this.a, null, null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
                str8 = "/write.*";
                f9z f9zVar7 = new f9z(kq.b("/disable_page.*"), null, null, this.b, linkedHashSet4, null, 102);
                f9z f9zVar8 = new f9z(kq.b("/restore.*"), null, null, this.b, linkedHashSet4, null, 102);
                f9z f9zVar9 = new f9z(kq.b("/code_auth.*"), null, null, this.b, linkedHashSet4, null, 102);
                f9z f9zVar10 = new f9z(kq.b("/ca.*"), null, null, this.b, linkedHashSet4, null, 102);
                f9z f9zVar11 = new f9z(kq.b("/w2a.*"), null, null, this.b, this.w, null, 102);
                f9z f9zVar12 = new f9z(kq.b("/rustore.*"), null, null, this.b, this.w, null, 102);
                f9z f9zVar13 = new f9z(kq.b("/.*"), null, null, this.b, this.x, null, 102);
                f9z f9zVar14 = new f9z(kq.b("/account.*"), null, null, this.b, linkedHashSet4, null, 102);
                f9z f9zVar15 = new f9z(null, Collections.singleton("android.intent.action.SEND"), null, null, null, null, 125);
                f9z f9zVar16 = new f9z(null, null, null, this.b, this.o, null, 103);
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator<String> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add("music." + it2.next());
                }
                pair = new Pair(rl3.y0(new f9z[]{f9zVar2, f9zVar3, f9zVar4, f9zVar5, f9zVar6, f9zVar7, f9zVar8, f9zVar9, f9zVar10, f9zVar11, f9zVar12, f9zVar13, f9zVar14, f9zVar15, f9zVar16, new f9z(kq.b("/link/.*"), null, null, this.b, j5g.S0(arrayList2), null, 102)}), EmptySet.b);
                Set set5 = (Set) pair.d();
                Set set6 = (Set) pair.g();
                boolean a2 = a(intent, set5);
                boolean a3 = a(intent, set6);
                stringSet = Preference.h(context, 0, "AppRedirectOverrides").getStringSet("overrides", EmptySet.b);
                if (stringSet != null) {
                    Set<String> set7 = stringSet;
                    ArrayList arrayList3 = new ArrayList(c5g.u(set7, 10));
                    Iterator<T> it3 = set7.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(LinkType.values()[Integer.parseInt((String) it3.next())]);
                    }
                    iterable = j5g.S0(arrayList3);
                    break;
                }
                iterable = EmptySet.b;
                Iterable iterable2 = iterable;
                ArrayList arrayList4 = new ArrayList(c5g.u(iterable2, 10));
                it = iterable2.iterator();
                while (it.hasNext()) {
                    int i2 = a.$EnumSwitchMapping$1[((LinkType) it.next()).ordinal()];
                    if (i2 == 1) {
                        set = set2;
                        str15 = str6;
                        str16 = str3;
                        LinkedHashSet j2 = izi0.j(linkedHashSet, set3);
                        str17 = str4;
                        linkedHashSet3 = linkedHashSet;
                        str18 = str8;
                        f9zVar = new f9z(rl3.y0(new Regex[]{new Regex(str5), new Regex(str4), new Regex(str2), new Regex(str18)}), null, null, this.b, j2, null, 102);
                    } else if (i2 != 2) {
                        if (i2 == 3) {
                            f9zVar = new f9z(kq.b("/clip.*"), null, null, this.b, this.n, null, 102);
                        } else {
                            if (i2 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f9zVar = new f9z(kq.b(str), null, null, this.b, izi0.j(set2, set3), null, 102);
                        }
                        set = set2;
                        str17 = str4;
                        linkedHashSet3 = linkedHashSet;
                        str15 = str6;
                        str18 = str8;
                        str16 = str3;
                    } else {
                        set = set2;
                        str15 = str6;
                        str16 = str3;
                        f9zVar = new f9z(rl3.y0(new Regex[]{new Regex(str6), new Regex(str7), new Regex(str16)}), null, null, this.b, this.n, null, 102);
                        str17 = str4;
                        linkedHashSet3 = linkedHashSet;
                        str18 = str8;
                    }
                    arrayList4.add(f9zVar);
                    str4 = str17;
                    str8 = str18;
                    str3 = str16;
                    set2 = set;
                    linkedHashSet = linkedHashSet3;
                    str6 = str15;
                }
                return new e83(a2, a3, a(intent, j5g.S0(arrayList4)));
            case 2:
                str6 = "/call/.*";
                str7 = "/call-add";
                linkedHashSet = linkedHashSet5;
                LinkedHashSet j3 = izi0.j(set4, this.e);
                Set<String> set8 = set3;
                str = "/video.*";
                str3 = "/room/.*";
                str5 = "/mail.*";
                str4 = "/im\\?.*";
                Pair pair3 = new Pair(rl3.y0(new f9z[]{new f9z(rl3.y0(new Regex[]{new Regex("/share.*"), new Regex("/settings.*"), new Regex("/mail.*"), new Regex("/stickers.*"), new Regex("/restore.*"), new Regex("/support.*"), new Regex("/help.*"), new Regex("/payments.*"), new Regex("/write.*"), new Regex("/im\\?.*"), new Regex("/im"), new Regex("/story.*"), new Regex("/narrative.*"), new Regex("/call.*"), new Regex(str7), new Regex("/room/.*"), new Regex("/wall.*"), new Regex("/app.*"), new Regex("/club.*")}), null, null, j3, izi0.j(linkedHashSet, set8), null, 102), new f9z(null, null, null, j3, this.m, null, 103), new f9z(null, null, null, j3, this.t, null, 103), new f9z(kq.b("/restore"), null, null, this.b, this.l, null, 102), new f9z(null, null, null, this.a, null, null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), new f9z(kq.b("/restore.*"), null, null, this.b, linkedHashSet4, null, 102), new f9z(null, null, Collections.singleton(NotificationCompat.INTENT_CATEGORY_NOTIFICATION_PREFERENCES), null, null, null, 123)}), rl3.y0(new f9z[]{new f9z(null, null, null, this.e, null, null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), new f9z(rl3.y0(new Regex[]{new Regex(str5), new Regex("/write.*"), new Regex(str4), new Regex("/im")}), null, null, this.b, izi0.j(linkedHashSet, set8), null, 102), new f9z(null, null, null, this.b, this.m, null, 103), new f9z(null, null, null, this.b, this.t, null, 103)}));
                str8 = "/write.*";
                str2 = "/im";
                pair = pair3;
                Set set52 = (Set) pair.d();
                Set set62 = (Set) pair.g();
                boolean a22 = a(intent, set52);
                boolean a32 = a(intent, set62);
                stringSet = Preference.h(context, 0, "AppRedirectOverrides").getStringSet("overrides", EmptySet.b);
                if (stringSet != null) {
                }
                iterable = EmptySet.b;
                Iterable iterable22 = iterable;
                ArrayList arrayList42 = new ArrayList(c5g.u(iterable22, 10));
                it = iterable22.iterator();
                while (it.hasNext()) {
                }
                return new e83(a22, a32, a(intent, j5g.S0(arrayList42)));
            case 3:
                Set<String> set9 = this.g;
                str6 = "/call/.*";
                str7 = "/call-add";
                linkedHashSet = linkedHashSet5;
                Pair pair4 = new Pair(rl3.y0(new f9z[]{new f9z(rl3.y0(new Regex[]{new Regex(str6), new Regex(str7), new Regex("/room/.*")}), null, null, izi0.j(set4, set9), this.n, null, 102), new f9z(null, null, null, this.b, this.m, null, 103), new f9z(kq.b("/restore"), null, null, this.b, this.l, null, 102), new f9z(null, null, null, this.a, null, null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), new f9z(kq.b("/restore.*"), null, null, this.b, linkedHashSet4, null, 102), new f9z(null, null, Collections.singleton(NotificationCompat.INTENT_CATEGORY_NOTIFICATION_PREFERENCES), null, null, null, 123)}), Collections.singleton(new f9z(rl3.y0(new Regex[]{new Regex(str6), new Regex(str7), new Regex("/room/.*")}), null, null, izi0.j(set4, set9), this.n, null, 102)));
                str4 = "/im\\?.*";
                pair = pair4;
                str2 = "/im";
                str8 = "/write.*";
                str3 = "/room/.*";
                str5 = "/mail.*";
                str = "/video.*";
                Set set522 = (Set) pair.d();
                Set set622 = (Set) pair.g();
                boolean a222 = a(intent, set522);
                boolean a322 = a(intent, set622);
                stringSet = Preference.h(context, 0, "AppRedirectOverrides").getStringSet("overrides", EmptySet.b);
                if (stringSet != null) {
                }
                iterable = EmptySet.b;
                Iterable iterable222 = iterable;
                ArrayList arrayList422 = new ArrayList(c5g.u(iterable222, 10));
                it = iterable222.iterator();
                while (it.hasNext()) {
                }
                return new e83(a222, a322, a(intent, j5g.S0(arrayList422)));
            case 4:
                str9 = "/room/.*";
                str10 = "/call-add";
                str11 = "/im\\?.*";
                str12 = "/write.*";
                str13 = "/mail.*";
                str14 = "/call/.*";
                linkedHashSet2 = linkedHashSet5;
                Set singleton = Collections.singleton(new f9z(kq.b("/clip.*"), null, null, izi0.j(set4, this.d), izi0.j(set2, this.u), kq.b("/camera\\?section=clips.*"), 38));
                EmptySet emptySet = EmptySet.b;
                pair2 = new Pair(singleton, Collections.singleton(new f9z(emptySet, null, null, this.d, this.u, emptySet, 38)));
                str4 = str11;
                pair = pair2;
                linkedHashSet = linkedHashSet2;
                str2 = "/im";
                str8 = str12;
                str5 = str13;
                str3 = str9;
                str7 = str10;
                str6 = str14;
                str = "/video.*";
                Set set5222 = (Set) pair.d();
                Set set6222 = (Set) pair.g();
                boolean a2222 = a(intent, set5222);
                boolean a3222 = a(intent, set6222);
                stringSet = Preference.h(context, 0, "AppRedirectOverrides").getStringSet("overrides", EmptySet.b);
                if (stringSet != null) {
                }
                iterable = EmptySet.b;
                Iterable iterable2222 = iterable;
                ArrayList arrayList4222 = new ArrayList(c5g.u(iterable2222, 10));
                it = iterable2222.iterator();
                while (it.hasNext()) {
                }
                return new e83(a2222, a3222, a(intent, j5g.S0(arrayList4222)));
            case 5:
                str9 = "/room/.*";
                str10 = "/call-add";
                str11 = "/im\\?.*";
                str12 = "/write.*";
                str13 = "/mail.*";
                str14 = "/call/.*";
                linkedHashSet2 = linkedHashSet5;
                Set<String> set10 = this.f;
                Set<String> set11 = set10;
                Set<String> set12 = set3;
                f9z f9zVar17 = new f9z(kq.b("/video.*"), null, null, izi0.j(set4, set11), izi0.j(set2, set12), null, 102);
                f9z f9zVar18 = new f9z(kq.b("/video.*"), null, null, this.f, null, null, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                LinkedHashSet j4 = izi0.j(set4, set11);
                Set<String> set13 = this.q;
                Set<String> set14 = this.p;
                LinkedHashSet j5 = izi0.j(set14, set13);
                Set<String> set15 = this.r;
                Set<String> set16 = set10;
                pair2 = new Pair(rl3.y0(new f9z[]{f9zVar17, f9zVar18, new f9z(kq.b("/.*"), null, null, j4, izi0.j(j5, set15), null, 102), new f9z(null, null, null, this.b, izi0.j(set2, set12), kq.b("/settings\\?act=notify&category=video_retention.*"), 39)}), rl3.y0(new f9z[]{new f9z(kq.b("/video.*"), null, null, izi0.j(set4, set16), izi0.j(set2, set12), kq.b("/settings\\?act=notify&category=video_retention.*"), 38), new f9z(kq.b("/.*"), null, null, izi0.j(set4, set16), izi0.j(izi0.j(set14, set13), set15), null, 102), new f9z(kq.b("/vkvideo.*"), null, null, this.b, this.x, null, 102)}));
                str4 = str11;
                pair = pair2;
                linkedHashSet = linkedHashSet2;
                str2 = "/im";
                str8 = str12;
                str5 = str13;
                str3 = str9;
                str7 = str10;
                str6 = str14;
                str = "/video.*";
                Set set52222 = (Set) pair.d();
                Set set62222 = (Set) pair.g();
                boolean a22222 = a(intent, set52222);
                boolean a32222 = a(intent, set62222);
                stringSet = Preference.h(context, 0, "AppRedirectOverrides").getStringSet("overrides", EmptySet.b);
                if (stringSet != null) {
                }
                iterable = EmptySet.b;
                Iterable iterable22222 = iterable;
                ArrayList arrayList42222 = new ArrayList(c5g.u(iterable22222, 10));
                it = iterable22222.iterator();
                while (it.hasNext()) {
                }
                return new e83(a22222, a32222, a(intent, j5g.S0(arrayList42222)));
            case 6:
                str9 = "/room/.*";
                str10 = "/call-add";
                str11 = "/im\\?.*";
                str12 = "/write.*";
                str13 = "/mail.*";
                str14 = "/call/.*";
                linkedHashSet2 = linkedHashSet5;
                pair2 = new Pair(rl3.y0(new f9z[]{new f9z(kq.b("/video.*"), null, null, this.b, this.n, null, 102), new f9z(rl3.y0(new Regex[]{new Regex("/@.*"), new Regex("/main"), new Regex("/video.*"), new Regex("/search.*"), new Regex("/playlist.*"), new Regex("/lives/tvchannels.*"), new Regex("/section.*")}), null, null, this.f, null, null, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE)}), EmptySet.b);
                str4 = str11;
                pair = pair2;
                linkedHashSet = linkedHashSet2;
                str2 = "/im";
                str8 = str12;
                str5 = str13;
                str3 = str9;
                str7 = str10;
                str6 = str14;
                str = "/video.*";
                Set set522222 = (Set) pair.d();
                Set set622222 = (Set) pair.g();
                boolean a222222 = a(intent, set522222);
                boolean a322222 = a(intent, set622222);
                stringSet = Preference.h(context, 0, "AppRedirectOverrides").getStringSet("overrides", EmptySet.b);
                if (stringSet != null) {
                }
                iterable = EmptySet.b;
                Iterable iterable222222 = iterable;
                ArrayList arrayList422222 = new ArrayList(c5g.u(iterable222222, 10));
                it = iterable222222.iterator();
                while (it.hasNext()) {
                }
                return new e83(a222222, a322222, a(intent, j5g.S0(arrayList422222)));
            case 7:
                str9 = "/room/.*";
                str10 = "/call-add";
                str11 = "/im\\?.*";
                str12 = "/write.*";
                str13 = "/mail.*";
                str14 = "/call/.*";
                linkedHashSet2 = linkedHashSet5;
                Set<String> set17 = this.h;
                Set<String> set18 = set3;
                pair2 = new Pair(rl3.y0(new f9z[]{new f9z(rl3.y0(new Regex[]{new Regex("/dating.*"), new Regex("/app7787819"), new Regex("/app7058363")}), null, null, izi0.j(set4, set17), izi0.j(set2, set18), null, 102), new f9z(kq.b("/dating.*"), null, null, this.h, null, null, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE)}), Collections.singleton(new f9z(rl3.y0(new Regex[]{new Regex("/dating.*"), new Regex("/app7787819"), new Regex("/app7058363")}), null, null, izi0.j(set4, set17), izi0.j(set2, set18), null, 102)));
                str4 = str11;
                pair = pair2;
                linkedHashSet = linkedHashSet2;
                str2 = "/im";
                str8 = str12;
                str5 = str13;
                str3 = str9;
                str7 = str10;
                str6 = str14;
                str = "/video.*";
                Set set5222222 = (Set) pair.d();
                Set set6222222 = (Set) pair.g();
                boolean a2222222 = a(intent, set5222222);
                boolean a3222222 = a(intent, set6222222);
                stringSet = Preference.h(context, 0, "AppRedirectOverrides").getStringSet("overrides", EmptySet.b);
                if (stringSet != null) {
                }
                iterable = EmptySet.b;
                Iterable iterable2222222 = iterable;
                ArrayList arrayList4222222 = new ArrayList(c5g.u(iterable2222222, 10));
                it = iterable2222222.iterator();
                while (it.hasNext()) {
                }
                return new e83(a2222222, a3222222, a(intent, j5g.S0(arrayList4222222)));
            case 8:
                linkedHashSet2 = linkedHashSet5;
                str11 = "/im\\?.*";
                str12 = "/write.*";
                str13 = "/mail.*";
                str9 = "/room/.*";
                f9z f9zVar19 = new f9z(rl3.y0(new Regex[]{new Regex("/audio.*"), new Regex("/music.*"), new Regex("/artist.*"), new Regex("/podcast.*")}), null, null, this.i, null, null, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                Set<String> set19 = this.i;
                Set<String> set20 = set3;
                str10 = "/call-add";
                str14 = "/call/.*";
                f9z f9zVar20 = new f9z(rl3.y0(new Regex[]{new Regex("/audio.*"), new Regex("/music.*"), new Regex("/artist.*"), new Regex("/podcast.*")}), null, null, izi0.j(set4, set19), izi0.j(set2, set20), kq.b("/settings\\?act=music_subscription.*"), 38);
                ArrayList arrayList5 = new ArrayList(c5g.u(arrayList, 10));
                for (Iterator<String> it4 = arrayList.iterator(); it4.hasNext(); it4 = it4) {
                    arrayList5.add("music." + it4.next());
                }
                Set y0 = rl3.y0(new f9z[]{f9zVar19, f9zVar20, new f9z(kq.b("/link/.*"), null, null, this.b, j5g.S0(arrayList5), null, 102)});
                f9z f9zVar21 = new f9z(rl3.y0(new Regex[]{new Regex("/audio.*"), new Regex("/music.*"), new Regex("/artist.*"), new Regex("/podcast.*")}), null, null, this.i, null, null, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                f9z f9zVar22 = new f9z(rl3.y0(new Regex[]{new Regex("/audio.*"), new Regex("/music.*"), new Regex("/artist.*"), new Regex("/podcast.*")}), null, null, izi0.j(set4, set19), izi0.j(set2, set20), kq.b("/settings\\?act=music_subscription.*"), 38);
                ArrayList arrayList6 = new ArrayList(c5g.u(arrayList, 10));
                Iterator<String> it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    arrayList6.add("music." + it5.next());
                }
                pair2 = new Pair(y0, rl3.y0(new f9z[]{f9zVar21, f9zVar22, new f9z(kq.b("/link/.*"), null, null, this.b, j5g.S0(arrayList6), null, 102)}));
                str4 = str11;
                pair = pair2;
                linkedHashSet = linkedHashSet2;
                str2 = "/im";
                str8 = str12;
                str5 = str13;
                str3 = str9;
                str7 = str10;
                str6 = str14;
                str = "/video.*";
                Set set52222222 = (Set) pair.d();
                Set set62222222 = (Set) pair.g();
                boolean a22222222 = a(intent, set52222222);
                boolean a32222222 = a(intent, set62222222);
                stringSet = Preference.h(context, 0, "AppRedirectOverrides").getStringSet("overrides", EmptySet.b);
                if (stringSet != null) {
                }
                iterable = EmptySet.b;
                Iterable iterable22222222 = iterable;
                ArrayList arrayList42222222 = new ArrayList(c5g.u(iterable22222222, 10));
                it = iterable22222222.iterator();
                while (it.hasNext()) {
                }
                return new e83(a22222222, a32222222, a(intent, j5g.S0(arrayList42222222)));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
