package com.yandex.messaging.domain.folders;

import defpackage.iwk0;
import defpackage.k020;
import defpackage.l7t;
import defpackage.ny61;
import defpackage.o4b;
import defpackage.p4b;
import defpackage.tcc;
import defpackage.udq0;
import defpackage.ueb;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ l7t b;

    public f(vpr vprVar, l7t l7tVar) {
        this.a = vprVar;
        this.b = l7tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetFolderAllChatsUseCase$readChats$$inlined$map$1$2$1 getFolderAllChatsUseCase$readChats$$inlined$map$1$2$1;
        int i;
        ArrayList w;
        if (continuation instanceof GetFolderAllChatsUseCase$readChats$$inlined$map$1$2$1) {
            getFolderAllChatsUseCase$readChats$$inlined$map$1$2$1 = (GetFolderAllChatsUseCase$readChats$$inlined$map$1$2$1) continuation;
            int i2 = getFolderAllChatsUseCase$readChats$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getFolderAllChatsUseCase$readChats$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getFolderAllChatsUseCase$readChats$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getFolderAllChatsUseCase$readChats$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Long l = new Long(((Number) obj).longValue());
                    k020 k020Var = this.b.c;
                    int i3 = 0;
                    if (l.longValue() == 0) {
                        ueb c = k020Var.b.c();
                        c.getClass();
                        TreeMap treeMap = iwk0.B;
                        w = new o4b(c.a.O0(udq0.e(0, "SELECT\n            chats_view.chat_internal_id,\n            chats_view.chat_id,\n            chats_view.unseen,\n            chats_view.display_name,\n            chats_view.is_pinned,\n            chats_view.mute,\n            chats_view.addressee_id,\n            chats_view.flags,\n            coalesce(chat_organization_cross_ref.organization_id, 0) as org_id\n        FROM chats_view\n        LEFT JOIN chat_organization_cross_ref ON chats_view.chat_internal_id=chat_organization_cross_ref.chat_internal_id\n        LEFT JOIN organizations ON organizations.organization_id = chat_organization_cross_ref.organization_id\n        LEFT JOIN pinned_chats ON chats_view.chat_id = pinned_chats.chat_id\n        WHERE (org_id = 0 OR organizations.is_public = 1) AND chats_view.is_hidden = 0\n        GROUP BY chats_view.chat_internal_id\n        ORDER BY chats_order IS NULL, chats_order ASC, sort_time DESC")), i3).w();
                    } else {
                        long longValue = l.longValue();
                        ueb c2 = k020Var.b.c();
                        c2.getClass();
                        TreeMap treeMap2 = iwk0.B;
                        iwk0 e = udq0.e(1, "SELECT\n            chats_view.chat_internal_id,\n            chats_view.chat_id,\n            chats_view.unseen,\n            chats_view.display_name,\n            chats_view.is_pinned,\n            chats_view.mute,\n            chats_view.addressee_id,\n            chats_view.flags,\n            coalesce(chat_organization_cross_ref.organization_id, 0) as org_id\n        FROM chats_view\n        LEFT JOIN chat_organization_cross_ref ON chats_view.chat_internal_id=chat_organization_cross_ref.chat_internal_id\n        LEFT JOIN pinned_chats ON chats_view.chat_id = pinned_chats.chat_id\n        WHERE org_id = ? AND chats_view.is_hidden = 0\n        ORDER BY chats_order IS NULL, chats_order ASC, sort_time DESC");
                        e.b(1, longValue);
                        w = new o4b(c2.a.O0(e), i3).w();
                    }
                    ArrayList arrayList = new ArrayList(tcc.n(w, 10));
                    Iterator it = w.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((p4b) it.next()).a);
                    }
                    getFolderAllChatsUseCase$readChats$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList, getFolderAllChatsUseCase$readChats$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        getFolderAllChatsUseCase$readChats$$inlined$map$1$2$1 = new GetFolderAllChatsUseCase$readChats$$inlined$map$1$2$1(this, continuation);
        Object obj22 = getFolderAllChatsUseCase$readChats$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getFolderAllChatsUseCase$readChats$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
