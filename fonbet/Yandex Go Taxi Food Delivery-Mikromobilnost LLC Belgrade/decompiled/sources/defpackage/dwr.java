package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public final /* synthetic */ class dwr implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ gwr b;

    public /* synthetic */ dwr(gwr gwrVar, int i) {
        this.a = i;
        this.b = gwrVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        List arrayList;
        int i = this.a;
        gwr gwrVar = this.b;
        switch (i) {
            case 0:
                T0 = ((oll0) obj).T0("\n        SELECT * FROM folders f\n        LEFT JOIN folder_filter_cross_ref ffcr ON f.folder_id = ffcr.folder_id AND f.organization_id = ffcr.organization_id\n        ");
                try {
                    int[][] p = wfz.p(T0.getColumnNames(), new String[][]{new String[]{"folder_id", "name", "organization_id", "sort_order", "folder_icon", "included_chat_ids", "excluded_chat_ids"}, new String[]{"folder_id", "organization_id", "filter_id", "inclusive"}});
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (T0.q()) {
                        String Y1 = T0.Y1(p[0][0]);
                        String Y12 = T0.Y1(p[0][1]);
                        long j = T0.getLong(p[0][2]);
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
                        hwr hwrVar = new hwr(Y1, Y12, j, i2, i3, set, set2);
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
                } catch (Throwable th) {
                    throw th;
                }
            default:
                T0 = ((oll0) obj).T0("SELECT * FROM main_folders");
                try {
                    int r = eja1.r(T0, "organization_id");
                    int r2 = eja1.r(T0, "excluded_folder_ids");
                    ArrayList arrayList2 = new ArrayList();
                    while (T0.q()) {
                        long j2 = T0.getLong(r);
                        Set set3 = (Set) gwrVar.a().l(T0.isNull(r2) ? null : T0.Y1(r2));
                        if (set3 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Set<kotlin.String>', but it was NULL.");
                        }
                        arrayList2.add(new x400(set3, j2));
                    }
                    T0.close();
                    return arrayList2;
                } finally {
                    T0.close();
                }
        }
    }
}
