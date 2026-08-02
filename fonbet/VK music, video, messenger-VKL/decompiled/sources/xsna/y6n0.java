package xsna;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vk.sunrise.SunState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.text.Regex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class y6n0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y6n0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r6 > r5) goto L18;
     */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        SharedPreferences sharedPreferences;
        int i;
        switch (this.b) {
            case 0:
                ((z6n0) this.c).a = SunState.UNKNOWN;
                break;
            default:
                oqo0 oqo0Var = (oqo0) this.c;
                Set b = oqo0.b();
                if (b != null) {
                    SchemeStat$TypeDevNullItem a = oqo0.a(0, b);
                    SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = oqo0.e;
                    if (schemeStat$TypeDevNullItem != null) {
                        Integer k = a.k();
                        int intValue = k != null ? k.intValue() : 0;
                        Integer k2 = schemeStat$TypeDevNullItem.k();
                        if (k2 != null) {
                            i = k2.intValue();
                            break;
                        } else {
                            i = 0;
                            break;
                        }
                    }
                    oqo0.e = a;
                    Set set = b;
                    ArrayList arrayList = new ArrayList(c5g.u(set, 10));
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        String name = ((Thread) it.next()).getName();
                        String D0 = erm0.D0(10, new Regex("[-_\\s]+").g(z23.c("\\b\\d+\\b", z23.c("[:#]\\d+(_\\d+)?", name.toLowerCase(Locale.ROOT), ""), ""), ""));
                        for (Map.Entry entry : oqo0.f.entrySet()) {
                            D0 = brm0.y(D0, (String) entry.getKey(), (String) entry.getValue());
                        }
                        if (!oqo0Var.b.contains(D0)) {
                            name = D0;
                        }
                        arrayList.add(name);
                    }
                    int i2 = 16;
                    ArrayList arrayList2 = new ArrayList(16);
                    for (int i3 = 0; i3 < 16; i3++) {
                        arrayList2.add(new ArrayList());
                    }
                    int[] iArr = new int[16];
                    for (int i4 = 0; i4 < 16; i4++) {
                        iArr[i4] = 2;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    int i5 = 2;
                    while (it2.hasNext()) {
                        String str = (String) it2.next();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= i2) {
                                int a2 = k73.a(3, i5, str);
                                if (a2 <= 1024) {
                                    arrayList3.add(str);
                                    i5 = a2;
                                }
                            } else {
                                int length = iArr[i6] + str.length() + 3;
                                if (length <= 256) {
                                    ((List) arrayList2.get(i6)).add(str);
                                    iArr[i6] = length;
                                } else {
                                    i6++;
                                    i2 = 16;
                                }
                            }
                        }
                        i2 = 16;
                    }
                    ArrayList arrayList4 = new ArrayList(c5g.u(arrayList2, 10));
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(j5g.O0((List) it3.next()));
                    }
                    Pair pair = new Pair(arrayList4, j5g.O0(arrayList3));
                    List list = (List) pair.d();
                    String json = oqo0Var.c.toJson(SchemeStat$TypeDevNullItem.a(a, oqo0Var.c((List) pair.g()), oqo0Var.c((List) list.get(0)), oqo0Var.c((List) list.get(1)), null, oqo0Var.c((List) list.get(2)), null, oqo0Var.c((List) list.get(3)), null, oqo0Var.c((List) list.get(4)), oqo0Var.c((List) list.get(5)), oqo0Var.c((List) list.get(6)), oqo0Var.c((List) list.get(7)), oqo0Var.c((List) list.get(8)), oqo0Var.c((List) list.get(9)), oqo0Var.c((List) list.get(10)), oqo0Var.c((List) list.get(11)), oqo0Var.c((List) list.get(12)), oqo0Var.c((List) list.get(13)), oqo0Var.c((List) list.get(14)), oqo0Var.c((List) list.get(15)), -1431655767, 2));
                    if (!TextUtils.isEmpty("max_threads_count_event_key") && (sharedPreferences = bl20.a) != null) {
                        sharedPreferences.edit().putString("max_threads_count_event_key", json).apply();
                    }
                }
                break;
        }
        return s3q0.a;
    }
}
