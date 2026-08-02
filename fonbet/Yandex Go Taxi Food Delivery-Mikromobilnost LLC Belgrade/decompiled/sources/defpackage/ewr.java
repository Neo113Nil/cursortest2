package defpackage;

import java.util.ArrayList;

/* loaded from: classes15.dex */
public final /* synthetic */ class ewr implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean w;

    public /* synthetic */ ewr(String str, int i, long j, boolean z) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.w = z;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = this.w;
        long j = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                ull0 T0 = ((oll0) obj).T0("\n        SELECT DISTINCT chat.chat_id FROM chats chat\n            INNER JOIN filter_chats_cross_ref filter_chat ON chat.chat_id = filter_chat.chat_id\n            INNER JOIN folder_filter_cross_ref folder_filter ON filter_chat.filter_id = folder_filter.filter_id\n            INNER JOIN folders folder ON folder.folder_id = folder_filter.folder_id AND folder.organization_id = folder_filter.organization_id\n            LEFT JOIN chat_organization_cross_ref chat_org ON chat.chat_internal_id = chat_org.chat_internal_id\n            LEFT JOIN organizations org ON chat_org.organization_id = org.organization_id\n        WHERE folder_filter.folder_id = ?\n            AND folder_filter.organization_id = ?\n            AND folder_filter.inclusive = ?\n            AND (((chat_org.organization_id IS NULL OR org.is_public) AND folder.organization_id = 0) OR (chat_org.organization_id = folder.organization_id))\n    ");
                try {
                    T0.g1(1, str);
                    T0.b(2, j);
                    T0.b(3, z ? 1L : 0L);
                    ArrayList arrayList = new ArrayList();
                    while (T0.q()) {
                        arrayList.add(T0.Y1(0));
                    }
                    return arrayList;
                } finally {
                }
            default:
                oll0 oll0Var = (oll0) obj;
                ull0 T02 = oll0Var.T0("INSERT OR REPLACE INTO message_moderation_user_choice VALUES (?, ?, ?)");
                try {
                    T02.g1(1, str);
                    T02.b(2, j);
                    T02.b(3, z ? 1L : 0L);
                    T02.q();
                    long t = jx81.t(oll0Var);
                    T02.close();
                    return Long.valueOf(t);
                } finally {
                }
        }
    }
}
