package androidx.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import defpackage.a7e;
import defpackage.b550;
import defpackage.d550;
import defpackage.e100;
import defpackage.evu0;
import defpackage.f550;
import defpackage.i3y;
import defpackage.iw00;
import defpackage.jl40;
import defpackage.k550;
import defpackage.ke50;
import defpackage.l2i0;
import defpackage.nrb1;
import defpackage.ny61;
import defpackage.orb1;
import defpackage.pnt0;
import defpackage.sls;
import defpackage.snt0;
import defpackage.t550;
import defpackage.tls;
import defpackage.unr0;
import defpackage.urb1;
import defpackage.v450;
import defpackage.vg10;
import defpackage.x450;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes10.dex */
public abstract class f {
    public static final /* synthetic */ int D = 0;
    public int A;
    public String B;
    public i3y C;
    public final String a;
    public f550 b;
    public String c;
    public CharSequence w;
    public final ArrayList x;
    public final pnt0 y;
    public final LinkedHashMap z;

    static {
        new LinkedHashMap();
    }

    public f(j jVar) {
        LinkedHashMap linkedHashMap = ke50.b;
        this.a = urb1.e(jVar.getClass());
        this.x = new ArrayList();
        this.y = new pnt0((Object) null);
        this.z = new LinkedHashMap();
    }

    public final Bundle a(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = this.z;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            x450 x450Var = (x450) entry.getValue();
            if (x450Var.c && (obj = x450Var.d) != null) {
                x450Var.a.e(bundle2, str, obj);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                x450 x450Var2 = (x450) entry2.getValue();
                x450Var2.getClass();
                t550 t550Var = x450Var2.a;
                if (x450Var2.b || !bundle2.containsKey(str2) || bundle2.get(str2) != null) {
                    try {
                        t550Var.a(bundle2, str2);
                    } catch (ClassCastException unused) {
                    }
                }
                vg10.m(unr0.x("Wrong argument type for '", str2, "' in argument bundle. "), t550Var.b(), " expected.");
                return null;
            }
        }
        return bundle2;
    }

    public d550 b(e100 e100Var) {
        Bundle bundle;
        int i;
        boolean z;
        int i2;
        String str;
        List list;
        f fVar = this;
        ArrayList arrayList = fVar.x;
        Bundle bundle2 = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        d550 d550Var = null;
        while (it.hasNext()) {
            e eVar = (e) it.next();
            Uri uri = (Uri) e100Var.b;
            LinkedHashMap linkedHashMap = fVar.z;
            Bundle c = uri != null ? eVar.c(uri, linkedHashMap) : bundle2;
            String str2 = eVar.a;
            int size = (uri == null || str2 == null) ? 0 : a.U(uri.getPathSegments(), Uri.parse(str2).getPathSegments()).size();
            String str3 = (String) e100Var.c;
            if (str3 == null || !str3.equals(eVar.b)) {
                bundle = c;
                i = size;
                z = false;
            } else {
                bundle = c;
                i = size;
                z = true;
            }
            String str4 = (String) e100Var.w;
            if (str4 == null || (str = eVar.c) == null || !((Pattern) eVar.o.getValue()).matcher(str4).matches()) {
                i2 = -1;
            } else {
                List l = new Regex("/").l(0, str);
                boolean isEmpty = l.isEmpty();
                List list2 = EmptyList.a;
                if (!isEmpty) {
                    ListIterator listIterator = l.listIterator(l.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            list = a.A0(l, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                list = list2;
                String str5 = (String) list.get(0);
                String str6 = (String) list.get(1);
                List l2 = new Regex("/").l(0, str4);
                if (!l2.isEmpty()) {
                    ListIterator listIterator2 = l2.listIterator(l2.size());
                    while (true) {
                        if (!listIterator2.hasPrevious()) {
                            break;
                        }
                        if (((String) listIterator2.previous()).length() != 0) {
                            list2 = a.A0(l2, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                }
                List list3 = list2;
                String str7 = (String) list3.get(0);
                String str8 = (String) list3.get(1);
                i2 = jl40.l(str5, str7) ? 2 : 0;
                if (jl40.l(str6, str8)) {
                    i2++;
                }
            }
            if (bundle == null) {
                if (z || i2 > -1) {
                    final Bundle bundle3 = new Bundle();
                    if (uri != null) {
                        Pattern pattern = (Pattern) eVar.f.getValue();
                        Matcher matcher = pattern != null ? pattern.matcher(uri.toString()) : null;
                        if (matcher != null && matcher.matches()) {
                            eVar.d(matcher, bundle3, linkedHashMap);
                            if (((Boolean) eVar.g.getValue()).booleanValue()) {
                                eVar.e(uri, bundle3, linkedHashMap);
                            }
                        }
                    }
                    if (!nrb1.a(linkedHashMap, new tls() { // from class: androidx.navigation.NavDestination$hasRequiredArguments$missingRequiredArguments$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(!bundle3.containsKey((String) obj));
                        }
                    }).isEmpty()) {
                    }
                }
                bundle2 = null;
                fVar = this;
            }
            d550 d550Var2 = new d550(fVar, bundle, eVar.p, i, z, i2);
            if (d550Var == null || d550Var2.compareTo(d550Var) > 0) {
                bundle2 = null;
                fVar = this;
                d550Var = d550Var2;
            } else {
                bundle2 = null;
                fVar = this;
            }
        }
        return d550Var;
    }

    public final d550 d(String str) {
        e eVar;
        Uri parse;
        Bundle c;
        i3y i3yVar = this.C;
        if (i3yVar == null || (eVar = (e) i3yVar.getValue()) == null || (c = eVar.c((parse = Uri.parse("android-app://androidx.navigation/".concat(str))), this.z)) == null) {
            return null;
        }
        String str2 = eVar.a;
        return new d550(this, c, eVar.p, str2 == null ? 0 : a.U(parse.getPathSegments(), Uri.parse(str2).getPathSegments()).size(), false, -1);
    }

    public void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, l2i0.Navigator);
        String string = obtainAttributes.getString(l2i0.Navigator_route);
        if (string == null) {
            this.A = 0;
            this.c = null;
        } else {
            if (evu0.J(string)) {
                ny61.g("Cannot have an empty route");
                return;
            }
            final String concat = "android-app://androidx.navigation/".concat(string);
            b550 b550Var = new b550();
            b550Var.a = concat;
            final e eVar = new e(b550Var.a, b550Var.b, b550Var.c);
            ArrayList a = nrb1.a(this.z, new tls() { // from class: androidx.navigation.NavDestination$route$missingRequiredArguments$1
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(!e.this.b().contains((String) obj));
                }
            });
            if (!a.isEmpty()) {
                vg10.l("Cannot set route \"", string, "\" for destination ", this, ". Following required arguments are missing: ", a);
                return;
            } else {
                this.C = kotlin.a.a(new sls() { // from class: androidx.navigation.NavDestination$route$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        b550 b550Var2 = new b550();
                        b550Var2.a = concat;
                        return new e(b550Var2.a, b550Var2.b, b550Var2.c);
                    }
                });
                this.A = concat.hashCode();
                this.c = null;
            }
        }
        this.B = string;
        if (obtainAttributes.hasValue(l2i0.Navigator_android_id)) {
            int resourceId = obtainAttributes.getResourceId(l2i0.Navigator_android_id, 0);
            this.A = resourceId;
            this.c = null;
            this.c = orb1.b(resourceId, context);
        }
        this.w = obtainAttributes.getText(l2i0.Navigator_android_label);
        obtainAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z;
        LinkedHashMap linkedHashMap;
        boolean z2;
        if (this != obj) {
            if (obj != null && (obj instanceof f)) {
                f fVar = (f) obj;
                pnt0 pnt0Var = fVar.y;
                LinkedHashMap linkedHashMap2 = fVar.z;
                boolean l = jl40.l(this.x, fVar.x);
                pnt0 pnt0Var2 = this.y;
                if (pnt0Var2.e() == pnt0Var.e()) {
                    Iterator it = ((a7e) kotlin.sequences.a.b(new snt0(pnt0Var2))).iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        if (!jl40.l(pnt0Var2.b(intValue), pnt0Var.b(intValue))) {
                        }
                    }
                    z = true;
                    linkedHashMap = this.z;
                    if (linkedHashMap.size() == linkedHashMap2.size()) {
                        for (Map.Entry entry : (Iterable) iw00.w(linkedHashMap).b) {
                            if (linkedHashMap2.containsKey(entry.getKey()) && jl40.l(linkedHashMap2.get(entry.getKey()), entry.getValue())) {
                            }
                        }
                        z2 = true;
                        if (this.A == fVar.A || !jl40.l(this.B, fVar.B) || !l || !z || !z2) {
                        }
                    }
                    z2 = false;
                    if (this.A == fVar.A) {
                    }
                }
                z = false;
                linkedHashMap = this.z;
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                }
                z2 = false;
                if (this.A == fVar.A) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Set<String> keySet;
        int i = this.A * 31;
        String str = this.B;
        int hashCode = i + (str != null ? str.hashCode() : 0);
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            int i2 = hashCode * 31;
            String str2 = eVar.a;
            int hashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = eVar.b;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = eVar.c;
            hashCode = hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        int i3 = 0;
        while (true) {
            pnt0 pnt0Var = this.y;
            if (i3 >= pnt0Var.e()) {
                break;
            }
            int i4 = i3 + 1;
            v450 v450Var = (v450) pnt0Var.f(i3);
            int i5 = ((hashCode * 31) + v450Var.a) * 31;
            k550 k550Var = v450Var.b;
            hashCode = i5 + (k550Var != null ? k550Var.hashCode() : 0);
            Bundle bundle = v450Var.c;
            if (bundle != null && (keySet = bundle.keySet()) != null) {
                Iterator<T> it2 = keySet.iterator();
                while (it2.hasNext()) {
                    int i6 = hashCode * 31;
                    Object obj = v450Var.c.get((String) it2.next());
                    hashCode = i6 + (obj != null ? obj.hashCode() : 0);
                }
            }
            i3 = i4;
        }
        LinkedHashMap linkedHashMap = this.z;
        for (String str5 : linkedHashMap.keySet()) {
            int b = unr0.b(hashCode * 31, 31, str5);
            Object obj2 = linkedHashMap.get(str5);
            hashCode = b + (obj2 != null ? obj2.hashCode() : 0);
        }
        return hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(Extension.O_BRAKE);
        String str = this.c;
        if (str == null) {
            sb.append(HexString.STR_0x);
            sb.append(Integer.toHexString(this.A));
        } else {
            sb.append(str);
        }
        sb.append(Extension.C_BRAKE);
        String str2 = this.B;
        if (str2 != null && !evu0.J(str2)) {
            sb.append(" route=");
            sb.append(this.B);
        }
        if (this.w != null) {
            sb.append(" label=");
            sb.append(this.w);
        }
        return sb.toString();
    }
}
