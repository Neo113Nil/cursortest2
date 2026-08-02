package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public final /* synthetic */ class cwr implements tls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ gwr w;

    public /* synthetic */ cwr(long j, String str, gwr gwrVar) {
        this.c = j;
        this.b = str;
        this.w = gwrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [hwr] */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        List arrayList;
        int i = this.a;
        String str = null;
        gwr gwrVar = this.w;
        long j = this.c;
        String str2 = this.b;
        switch (i) {
            case 0:
                T0 = ((oll0) obj).T0("\n        SELECT * FROM folders f\n        LEFT JOIN folder_filter_cross_ref ffcr ON f.folder_id = ffcr.folder_id AND f.organization_id = ffcr.organization_id\n        WHERE f.organization_id = ?\n        AND f.folder_id = ?\n        ");
                try {
                    T0.b(1, j);
                    T0.g1(2, str2);
                    int[][] p = wfz.p(T0.getColumnNames(), new String[][]{new String[]{"folder_id", "name", "organization_id", "sort_order", "folder_icon", "included_chat_ids", "excluded_chat_ids"}, new String[]{"folder_id", "organization_id", "filter_id", "inclusive"}});
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (T0.q()) {
                        String Y1 = T0.Y1(p[0][0]);
                        String Y12 = T0.Y1(p[0][1]);
                        long j2 = T0.getLong(p[0][2]);
                        int i2 = (int) T0.getLong(p[0][3]);
                        int i3 = (int) T0.getLong(p[0][4]);
                        Set set = (Set) gwrVar.a().l(T0.isNull(p[0][5]) ? null : T0.Y1(p[0][5]));
                        if (set == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Set<kotlin.String>', but it was NULL.");
                        }
                        Set set2 = (Set) gwrVar.a().l(T0.isNull(p[0][6]) ? null : T0.Y1(p[0][6]));
                        if (set2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Set<kotlin.String>', but it was NULL.");
                        }
                        hwr hwrVar = new hwr(Y1, Y12, j2, i2, i3, set, set2);
                        if (linkedHashMap.containsKey(hwrVar)) {
                            arrayList = (List) b.g(hwrVar, linkedHashMap);
                        } else {
                            arrayList = new ArrayList();
                            linkedHashMap.put(hwrVar, arrayList);
                        }
                        if (!T0.isNull(p[1][0]) || !T0.isNull(p[1][1]) || !T0.isNull(p[1][2]) || !T0.isNull(p[1][3])) {
                            arrayList.add(new nwr(T0.getLong(p[1][1]), T0.Y1(p[1][0]), T0.Y1(p[1][2]), ((int) T0.getLong(p[1][3])) != 0));
                        }
                    }
                    T0.close();
                    return linkedHashMap;
                } finally {
                }
            default:
                T0 = ((oll0) obj).T0("SELECT * FROM folders WHERE folder_id = ? AND organization_id = ?");
                try {
                    T0.g1(1, str2);
                    T0.b(2, j);
                    int r = eja1.r(T0, "folder_id");
                    int r2 = eja1.r(T0, "name");
                    int r3 = eja1.r(T0, "organization_id");
                    int r4 = eja1.r(T0, "sort_order");
                    int r5 = eja1.r(T0, "folder_icon");
                    int r6 = eja1.r(T0, "included_chat_ids");
                    int r7 = eja1.r(T0, "excluded_chat_ids");
                    if (T0.q()) {
                        String Y13 = T0.Y1(r);
                        String Y14 = T0.Y1(r2);
                        long j3 = T0.getLong(r3);
                        int i4 = (int) T0.getLong(r4);
                        int i5 = (int) T0.getLong(r5);
                        Set set3 = (Set) gwrVar.a().l(T0.isNull(r6) ? null : T0.Y1(r6));
                        if (set3 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Set<kotlin.String>', but it was NULL.");
                        }
                        if (!T0.isNull(r7)) {
                            str = T0.Y1(r7);
                        }
                        Set set4 = (Set) gwrVar.a().l(str);
                        if (set4 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Set<kotlin.String>', but it was NULL.");
                        }
                        str = new hwr(Y13, Y14, j3, i4, i5, set3, set4);
                    }
                    return str;
                } finally {
                    T0.close();
                }
        }
    }

    public /* synthetic */ cwr(String str, long j, gwr gwrVar) {
        this.b = str;
        this.c = j;
        this.w = gwrVar;
    }
}
