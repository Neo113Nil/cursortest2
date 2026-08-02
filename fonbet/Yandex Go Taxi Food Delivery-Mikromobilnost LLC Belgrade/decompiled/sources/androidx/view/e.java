package androidx.view;

import android.net.Uri;
import android.os.Bundle;
import defpackage.c550;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.m550;
import defpackage.nrb1;
import defpackage.oyr;
import defpackage.scc;
import defpackage.sls;
import defpackage.t550;
import defpackage.tcc;
import defpackage.tls;
import defpackage.unr0;
import defpackage.w511;
import defpackage.wwg;
import defpackage.x450;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;

/* loaded from: classes10.dex */
public final class e {
    public static final Pattern q = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final Pattern r = Pattern.compile("\\{(.+?)\\}");
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final String e;
    public final i3y f;
    public final i3y g;
    public final i3y h;
    public boolean i;
    public final i3y j;
    public final i3y k;
    public final i3y l;
    public final i3y m;
    public final String n;
    public final i3y o;
    public final boolean p;

    public e(String str, String str2, String str3) {
        List list;
        this.a = str;
        this.b = str2;
        this.c = str3;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f = a.a(new sls() { // from class: androidx.navigation.NavDeepLink$pathPattern$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                String str4 = e.this.e;
                if (str4 != null) {
                    return Pattern.compile(str4, 2);
                }
                return null;
            }
        });
        this.g = a.a(new sls() { // from class: androidx.navigation.NavDeepLink$isParameterizedQuery$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                String str4 = e.this.a;
                return Boolean.valueOf((str4 == null || Uri.parse(str4).getQuery() == null) ? false : true);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h = a.b(lazyThreadSafetyMode, new sls() { // from class: androidx.navigation.NavDeepLink$queryArgsMap$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                e eVar = e.this;
                String str4 = eVar.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) eVar.g.getValue()).booleanValue()) {
                    Uri parse = Uri.parse(str4);
                    for (String str5 : parse.getQueryParameterNames()) {
                        StringBuilder sb = new StringBuilder();
                        List<String> queryParameters = parse.getQueryParameters(str5);
                        if (queryParameters.size() > 1) {
                            w511.f(unr0.p("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                            return null;
                        }
                        String str6 = (String) kotlin.collections.a.R(queryParameters);
                        if (str6 == null) {
                            eVar.i = true;
                            str6 = str5;
                        }
                        Matcher matcher = e.r.matcher(str6);
                        c550 c550Var = new c550();
                        int i = 0;
                        while (matcher.find()) {
                            c550Var.b.add(matcher.group(1));
                            sb.append(Pattern.quote(str6.substring(i, matcher.start())));
                            sb.append("(.+?)?");
                            i = matcher.end();
                        }
                        if (i < str6.length()) {
                            sb.append(Pattern.quote(str6.substring(i)));
                        }
                        c550Var.a = cvu0.v(sb.toString(), ".*", "\\E.*\\Q", false);
                        linkedHashMap.put(str5, c550Var);
                    }
                }
                return linkedHashMap;
            }
        });
        this.j = a.b(lazyThreadSafetyMode, new sls() { // from class: androidx.navigation.NavDeepLink$fragArgsAndRegex$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                String str4 = e.this.a;
                if (str4 == null || Uri.parse(str4).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                String fragment = Uri.parse(str4).getFragment();
                StringBuilder sb = new StringBuilder();
                e.a(fragment, sb, arrayList2);
                return new Pair(arrayList2, sb.toString());
            }
        });
        this.k = a.b(lazyThreadSafetyMode, new sls() { // from class: androidx.navigation.NavDeepLink$fragArgs$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                List list2;
                Pair pair = (Pair) e.this.j.getValue();
                return (pair == null || (list2 = (List) pair.c()) == null) ? new ArrayList() : list2;
            }
        });
        this.l = a.b(lazyThreadSafetyMode, new sls() { // from class: androidx.navigation.NavDeepLink$fragRegex$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                Pair pair = (Pair) e.this.j.getValue();
                if (pair != null) {
                    return (String) pair.f();
                }
                return null;
            }
        });
        this.m = a.a(new sls() { // from class: androidx.navigation.NavDeepLink$fragPattern$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                String str4 = (String) e.this.l.getValue();
                if (str4 != null) {
                    return Pattern.compile(str4, 2);
                }
                return null;
            }
        });
        this.o = a.a(new sls() { // from class: androidx.navigation.NavDeepLink$mimeTypePattern$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                String str4 = e.this.n;
                if (str4 != null) {
                    return Pattern.compile(str4);
                }
                return null;
            }
        });
        if (str != null) {
            StringBuilder sb = new StringBuilder("^");
            if (!q.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
            matcher.find();
            a(str.substring(0, matcher.start()), sb, arrayList);
            this.p = (evu0.y(sb, ".*", false) || evu0.y(sb, "([^/]+?)", false)) ? false : true;
            sb.append("($|(\\?(.)*)|(\\#(.)*))");
            this.e = cvu0.v(sb.toString(), ".*", "\\E.*\\Q", false);
        }
        if (str3 == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
            w511.f(oyr.p("The given mimeType ", str3, " does not match to required \"type/subtype\" format"));
            throw null;
        }
        List l = new Regex("/").l(0, str3);
        if (!l.isEmpty()) {
            ListIterator listIterator = l.listIterator(l.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    list = kotlin.collections.a.A0(l, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        list = EmptyList.a;
        this.n = cvu0.v(unr0.p("^(", (String) list.get(0), "|[*]+)/(", (String) list.get(1), "|[*]+)$"), "*|[*]", "[\\s\\S]", false);
    }

    public static void a(String str, StringBuilder sb, ArrayList arrayList) {
        Matcher matcher = r.matcher(str);
        int i = 0;
        while (matcher.find()) {
            arrayList.add(matcher.group(1));
            if (matcher.start() > i) {
                sb.append(Pattern.quote(str.substring(i, matcher.start())));
            }
            sb.append("([^/]*?|)");
            i = matcher.end();
        }
        if (i < str.length()) {
            sb.append(Pattern.quote(str.substring(i)));
        }
    }

    public final ArrayList b() {
        Collection values = ((Map) this.h.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            ycc.r(((c550) it.next()).b, arrayList);
        }
        return kotlin.collections.a.m0((List) this.k.getValue(), kotlin.collections.a.m0(arrayList, this.d));
    }

    public final Bundle c(Uri uri, LinkedHashMap linkedHashMap) {
        Pattern pattern = (Pattern) this.f.getValue();
        Matcher matcher = pattern != null ? pattern.matcher(uri.toString()) : null;
        if (matcher != null && matcher.matches()) {
            final Bundle bundle = new Bundle();
            if (d(matcher, bundle, linkedHashMap) && (!((Boolean) this.g.getValue()).booleanValue() || e(uri, bundle, linkedHashMap))) {
                String fragment = uri.getFragment();
                Pattern pattern2 = (Pattern) this.m.getValue();
                Matcher matcher2 = pattern2 != null ? pattern2.matcher(String.valueOf(fragment)) : null;
                if (matcher2 != null && matcher2.matches()) {
                    List list = (List) this.k.getValue();
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            scc.m();
                            throw null;
                        }
                        String str = (String) obj;
                        String decode = Uri.decode(matcher2.group(i2));
                        x450 x450Var = (x450) linkedHashMap.get(str);
                        if (x450Var != null) {
                            try {
                                t550 t550Var = x450Var.a;
                                t550Var.e(bundle, str, t550Var.d(decode));
                            } catch (IllegalArgumentException unused) {
                            }
                        } else {
                            bundle.putString(str, decode);
                        }
                        arrayList.add(zy11.a);
                        i = i2;
                    }
                }
                if (nrb1.a(linkedHashMap, new tls() { // from class: androidx.navigation.NavDeepLink$getMatchingArguments$missingRequiredArguments$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(!bundle.containsKey((String) obj2));
                    }
                }).isEmpty()) {
                    return bundle;
                }
            }
        }
        return null;
    }

    public final boolean d(Matcher matcher, Bundle bundle, Map map) {
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            String str = (String) next;
            String decode = Uri.decode(matcher.group(i2));
            x450 x450Var = (x450) map.get(str);
            if (x450Var != null) {
                try {
                    t550 t550Var = x450Var.a;
                    t550Var.e(bundle, str, t550Var.d(decode));
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            } else {
                bundle.putString(str, decode);
            }
            arrayList2.add(zy11.a);
            i = i2;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e(Uri uri, Bundle bundle, Map map) {
        Object obj;
        boolean z;
        String query;
        for (Map.Entry entry : ((Map) this.h.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            c550 c550Var = (c550) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.i && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = Collections.singletonList(query);
            }
            Object obj2 = zy11.a;
            int i = 0;
            Bundle g = wwg.g(new Pair[0]);
            Iterator it = c550Var.b.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                x450 x450Var = (x450) map.get(str2);
                t550 t550Var = x450Var != null ? x450Var.a : null;
                if ((t550Var instanceof m550) && !x450Var.c) {
                    int i2 = ((m550) t550Var).r;
                    Object obj3 = EmptyList.a;
                    switch (i2) {
                        case 0:
                            obj3 = new boolean[0];
                            break;
                        case 2:
                            obj3 = new float[0];
                            break;
                        case 4:
                            obj3 = new int[0];
                            break;
                        case 6:
                            obj3 = new long[0];
                            break;
                        case 8:
                            obj3 = new String[0];
                            break;
                    }
                    t550Var.e(g, str2, obj3);
                }
            }
            for (String str3 : queryParameters) {
                String str4 = c550Var.a;
                Matcher matcher = str4 != null ? Pattern.compile(str4, 32).matcher(str3) : null;
                if (matcher == null || !matcher.matches()) {
                    return i;
                }
                ArrayList arrayList = c550Var.b;
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                int i3 = i;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        scc.m();
                        throw null;
                    }
                    String str5 = (String) next;
                    String group = matcher.group(i4);
                    if (group == null) {
                        group = "";
                    }
                    int i5 = i;
                    x450 x450Var2 = (x450) map.get(str5);
                    try {
                        if (g.containsKey(str5)) {
                            if (g.containsKey(str5)) {
                                if (x450Var2 != null) {
                                    t550 t550Var2 = x450Var2.a;
                                    Object a = t550Var2.a(g, str5);
                                    if (!g.containsKey(str5)) {
                                        throw new IllegalArgumentException("There is no previous value in this bundle.");
                                    }
                                    t550Var2.e(g, str5, t550Var2.c(a, group));
                                }
                                z = i5;
                            } else {
                                z = 1;
                            }
                            try {
                                obj = Boolean.valueOf(z);
                            } catch (IllegalArgumentException unused) {
                                obj = obj2;
                                arrayList2.add(obj);
                                i3 = i4;
                                i = i5;
                            }
                        } else {
                            if (x450Var2 != null) {
                                t550 t550Var3 = x450Var2.a;
                                t550Var3.e(g, str5, t550Var3.d(group));
                            } else {
                                g.putString(str5, group);
                            }
                            obj = obj2;
                        }
                    } catch (IllegalArgumentException unused2) {
                    }
                    arrayList2.add(obj);
                    i3 = i4;
                    i = i5;
                }
            }
            bundle.putAll(g);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof e)) {
            e eVar = (e) obj;
            if (jl40.l(this.a, eVar.a) && jl40.l(this.b, eVar.b) && jl40.l(this.c, eVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
