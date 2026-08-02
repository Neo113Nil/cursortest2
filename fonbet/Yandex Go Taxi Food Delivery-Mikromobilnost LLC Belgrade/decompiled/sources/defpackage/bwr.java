package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes15.dex */
public final /* synthetic */ class bwr implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ gwr c;

    public /* synthetic */ bwr(long j, gwr gwrVar, int i) {
        this.a = i;
        this.b = j;
        this.c = gwrVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        x400 x400Var;
        int i = this.a;
        gwr gwrVar = this.c;
        long j = this.b;
        switch (i) {
            case 0:
                T0 = ((oll0) obj).T0("SELECT * FROM folders WHERE organization_id = ?");
                try {
                    T0.b(1, j);
                    int r = eja1.r(T0, "folder_id");
                    int r2 = eja1.r(T0, "name");
                    int r3 = eja1.r(T0, "organization_id");
                    int r4 = eja1.r(T0, "sort_order");
                    int r5 = eja1.r(T0, "folder_icon");
                    int r6 = eja1.r(T0, "included_chat_ids");
                    int r7 = eja1.r(T0, "excluded_chat_ids");
                    ArrayList arrayList = new ArrayList();
                    while (T0.q()) {
                        String Y1 = T0.Y1(r);
                        String Y12 = T0.Y1(r2);
                        long j2 = T0.getLong(r3);
                        int i2 = (int) T0.getLong(r4);
                        gwr gwrVar2 = gwrVar;
                        int i3 = (int) T0.getLong(r5);
                        Set set = (Set) gwrVar2.a().l(T0.isNull(r6) ? null : T0.Y1(r6));
                        if (set == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Set<kotlin.String>', but it was NULL.");
                        }
                        Set set2 = (Set) gwrVar2.a().l(T0.isNull(r7) ? null : T0.Y1(r7));
                        if (set2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Set<kotlin.String>', but it was NULL.");
                        }
                        arrayList.add(new hwr(Y1, Y12, j2, i2, i3, set, set2));
                        gwrVar = gwrVar2;
                    }
                    T0.close();
                    return arrayList;
                } finally {
                    T0.close();
                }
            default:
                T0 = ((oll0) obj).T0("SELECT * FROM main_folders WHERE organization_id = ? LIMIT 1");
                try {
                    T0.b(1, j);
                    int r8 = eja1.r(T0, "organization_id");
                    int r9 = eja1.r(T0, "excluded_folder_ids");
                    if (T0.q()) {
                        long j3 = T0.getLong(r8);
                        Set set3 = (Set) gwrVar.a().l(T0.isNull(r9) ? null : T0.Y1(r9));
                        if (set3 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Set<kotlin.String>', but it was NULL.");
                        }
                        x400Var = new x400(set3, j3);
                    } else {
                        x400Var = null;
                    }
                    return x400Var;
                } catch (Throwable th) {
                    T0.close();
                    throw th;
                }
        }
    }
}
