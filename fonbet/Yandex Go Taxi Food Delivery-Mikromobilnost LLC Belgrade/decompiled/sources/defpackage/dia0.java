package defpackage;

import android.view.ViewGroup;
import com.yandex.go.pickup_from_photo.navigation.c;
import com.yandex.go.shortcuts.impl.view.adapter.PersonalSliderShortcutViewHolder$DisallowInterceptLinearLayout;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.a;
import com.yandex.xplat.payment.sdk.PaymethodMarkup;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes13.dex */
public final /* synthetic */ class dia0 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ dia0(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v4, types: [z7b0] */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ArrayList o0;
        int i = this.a;
        int i2 = 4;
        int i3 = 9;
        int i4 = 1;
        zy11 zy11Var = zy11.a;
        boolean z = false;
        switch (i) {
            case 0:
                PaymentKitError.Companion.getClass();
                a.a("Unknown error");
                zsa zsaVar = ((ce30) obj).a;
                zsaVar.r(new qu(i3));
                ((m020) zsaVar.G).invoke();
                return zy11Var;
            case 1:
                ((yba0) obj).a.invoke();
                return zy11Var;
            case 2:
                qwd qwdVar = tka0.a;
                return zy11Var;
            case 3:
                kma0 kma0Var = (kma0) obj;
                lma0 lma0Var = kma0Var.a;
                lma0Var.I.m.g(new am80(lma0Var.N.a(), kma0Var.b), new ak80(20, lma0Var));
                return zy11Var;
            case 4:
                return new PaymethodMarkup(((y3x) obj).b().h("card"));
            case 5:
                ListItemComponent listItemComponent = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                lob1.c(listItemComponent, 0);
                return listItemComponent;
            case 6:
                return new m0o((ListItemComponent) obj, 4);
            case 7:
                ull0 T0 = ((oll0) obj).T0("SELECT * FROM pending_poll_votes");
                try {
                    int r = eja1.r(T0, "message_timestamp");
                    int r2 = eja1.r(T0, "chat_id");
                    int r3 = eja1.r(T0, "choices");
                    int r4 = eja1.r(T0, "operation_type");
                    int r5 = eja1.r(T0, "forward_message_timestamp");
                    int r6 = eja1.r(T0, "forward_chat_id");
                    ArrayList arrayList = new ArrayList();
                    while (T0.q()) {
                        arrayList.add(new dta0(T0.getLong(r), T0.Y1(r2), (int) T0.getLong(r3), (int) T0.getLong(r4), T0.isNull(r5) ? null : Long.valueOf(T0.getLong(r5)), T0.isNull(r6) ? null : T0.Y1(r6)));
                    }
                    return arrayList;
                } finally {
                }
            case 8:
                return (w3j0) obj;
            case 9:
                return (CharSequence) ((Pair) obj).c();
            case 10:
                ull0 T02 = ((oll0) obj).T0("\n        SELECT COUNT(DISTINCT personal_mentions.row_id) FROM personal_mentions\n            LEFT JOIN chats_view ON chats_view.chat_id=personal_mentions.chat_id\n            LEFT JOIN chat_organization_cross_ref ON chats_view.chat_internal_id=chat_organization_cross_ref.chat_internal_id\n            LEFT JOIN organizations ON organizations.organization_id = chat_organization_cross_ref.organization_id\n        WHERE is_thread=0\n            AND chats_view.is_member=1\n            AND (coalesce(chat_organization_cross_ref.organization_id, 0)=0\n            OR organizations.is_public=1)\n        ");
                try {
                    int i5 = T02.q() ? (int) T02.getLong(0) : 0;
                    T02.close();
                    return Integer.valueOf(i5);
                } finally {
                }
            case 11:
                ull0 T03 = ((oll0) obj).T0("\n        SELECT COUNT(32) FROM personal_mentions\n            LEFT JOIN threads_view ON threads_view.thread_id=personal_mentions.chat_id\n        WHERE is_thread=1 AND threads_view.is_member=1");
                try {
                    int i6 = T03.q() ? (int) T03.getLong(0) : 0;
                    T03.close();
                    return Integer.valueOf(i6);
                } finally {
                }
            case 12:
                ull0 T04 = ((oll0) obj).T0("\n        SELECT COUNT(32) FROM personal_mentions\n            LEFT JOIN chats_view ON chats_view.chat_id=personal_mentions.chat_id\n        WHERE is_thread=0 AND chats_view.is_member=1");
                try {
                    int i7 = T04.q() ? (int) T04.getLong(0) : 0;
                    T04.close();
                    return Integer.valueOf(i7);
                } finally {
                }
            case 13:
                ull0 T05 = ((oll0) obj).T0("\n        SELECT COUNT(DISTINCT personal_mentions.row_id) FROM personal_mentions\n            LEFT JOIN threads_view ON threads_view.thread_id=personal_mentions.chat_id\n            LEFT JOIN chat_organization_cross_ref ON threads_view.parent_internal_id=chat_organization_cross_ref.chat_internal_id\n            LEFT JOIN organizations ON organizations.organization_id = chat_organization_cross_ref.organization_id\n        WHERE is_thread=1 AND threads_view.is_member=1\n            AND (coalesce(chat_organization_cross_ref.organization_id, 0)=0 OR organizations.is_public=1)\n        ");
                try {
                    int i8 = T05.q() ? (int) T05.getLong(0) : 0;
                    T05.close();
                    return Integer.valueOf(i8);
                } finally {
                }
            case 14:
                ull0 T06 = ((oll0) obj).T0("SELECT * FROM personal_mentions");
                try {
                    int r7 = eja1.r(T06, "row_id");
                    int r8 = eja1.r(T06, "chat_id");
                    int r9 = eja1.r(T06, "message_timestamp");
                    int r10 = eja1.r(T06, "is_thread");
                    ArrayList arrayList2 = new ArrayList();
                    while (T06.q()) {
                        arrayList2.add(new l5b0(T06.getLong(r7), T06.Y1(r8), T06.getLong(r9), ((int) T06.getLong(r10)) != 0));
                    }
                    return arrayList2;
                } finally {
                }
            case 15:
                ull0 T07 = ((oll0) obj).T0("SELECT * FROM organizations");
                try {
                    int r11 = eja1.r(T07, "organization_id");
                    int r12 = eja1.r(T07, "organization_name");
                    int r13 = eja1.r(T07, "registration_status");
                    int r14 = eja1.r(T07, "is_public");
                    int r15 = eja1.r(T07, "is_guest");
                    int r16 = eja1.r(T07, "organization_rights");
                    int r17 = eja1.r(T07, BackendConfig.Restrictions.DISABLED);
                    ArrayList arrayList3 = new ArrayList();
                    while (T07.q()) {
                        arrayList3.add(new n5b0(T07.getLong(r11), T07.getLong(r16), T07.Y1(r12), T07.Y1(r13), ((int) T07.getLong(r14)) != 0, ((int) T07.getLong(r15)) != 0, ((int) T07.getLong(r17)) != 0));
                    }
                    return arrayList3;
                } finally {
                }
            case 16:
                ull0 T08 = ((oll0) obj).T0("SELECT EXISTS(SELECT 1 FROM organizations WHERE organization_id = 0 AND disabled = 1 LIMIT 1 )");
                try {
                    if (T08.q()) {
                        z = ((int) T08.getLong(0)) != 0;
                    }
                    T08.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case 17:
                try {
                    ((oll0) obj).T0("DELETE FROM organizations").q();
                    return zy11Var;
                } finally {
                }
            case 18:
                return new PersonalSliderShortcutViewHolder$DisallowInterceptLinearLayout(((ViewGroup) obj).getContext(), null, 0, 0, 14, null);
            case 19:
                ull0 T09 = ((oll0) obj).T0("SELECT * FROM personal_user_info");
                try {
                    int r18 = eja1.r(T09, "row_id");
                    int r19 = eja1.r(T09, "user_id");
                    int r20 = eja1.r(T09, "version");
                    int r21 = eja1.r(T09, "avatar_url");
                    int r22 = eja1.r(T09, "display_name");
                    int r23 = eja1.r(T09, "nickname");
                    int r24 = eja1.r(T09, "phone");
                    int r25 = eja1.r(T09, "registration_status");
                    int r26 = eja1.r(T09, "is_empty");
                    int r27 = eja1.r(T09, "is_corporate");
                    int r28 = eja1.r(T09, "is_onboarded");
                    int r29 = eja1.r(T09, "needs_migration_onboarding");
                    int r30 = eja1.r(T09, "account_type");
                    if (T09.q()) {
                        r9 = new z7b0(T09.getLong(r18), T09.Y1(r19), T09.getLong(r20), T09.isNull(r21) ? null : T09.Y1(r21), T09.Y1(r22), T09.isNull(r23) ? null : T09.Y1(r23), T09.isNull(r24) ? null : T09.Y1(r24), T09.Y1(r25), ((int) T09.getLong(r26)) != 0, ((int) T09.getLong(r27)) != 0, ((int) T09.getLong(r28)) != 0, ((int) T09.getLong(r29)) != 0, T09.isNull(r30) ? null : T09.Y1(r30));
                    }
                    return r9;
                } finally {
                }
            case 20:
                ull0 T010 = ((oll0) obj).T0("SELECT registration_status FROM personal_user_info");
                try {
                    if (T010.q() && !T010.isNull(0)) {
                        r9 = T010.Y1(0);
                    }
                    return r9;
                } finally {
                }
            case 21:
                n70 n70Var = (n70) obj;
                n70Var.a0(new t8b0(n70Var, i4));
                t8b0 t8b0Var = new t8b0(n70Var, 2);
                if (n70Var.T == null) {
                    n70Var.T = t8b0Var;
                    return zy11Var;
                }
                ny61.r("onViewDetachedFromWindow { ... } is already defined. Only one onViewDetachedFromWindow { ... } is allowed.");
                return null;
            case 22:
                n70 n70Var2 = (n70) obj;
                n70Var2.a0(new t8b0(n70Var2, 3));
                t8b0 t8b0Var2 = new t8b0(n70Var2, i2);
                if (n70Var2.T == null) {
                    n70Var2.T = t8b0Var2;
                    return zy11Var;
                }
                ny61.r("onViewDetachedFromWindow { ... } is already defined. Only one onViewDetachedFromWindow { ... } is allowed.");
                return null;
            case 23:
                return new pbv((String) obj, (ccv) null, rev.e, (dcv) null, (vfv) null, 58);
            case 24:
                wcb0 wcb0Var = (wcb0) obj;
                List list = wcb0Var.c;
                u8j0 u8j0Var = (u8j0) kotlin.collections.a.b0(list);
                if ((u8j0Var instanceof s8j0) || (u8j0Var instanceof t8j0)) {
                    o0 = kotlin.collections.a.o0(kotlin.collections.a.K(list), new t8j0());
                } else {
                    if (!(u8j0Var instanceof r8j0) && u8j0Var != null) {
                        w511.b();
                        return null;
                    }
                    o0 = kotlin.collections.a.o0(list, new t8j0());
                }
                return wcb0.a(wcb0Var, null, o0, null, null, null, null, null, null, 507);
            case 25:
                return "?";
            case 26:
                return Boolean.TRUE;
            case 27:
                ((z01) obj).a.r(new qu(i3));
                return zy11Var;
            case 28:
                qob0 qob0Var = (qob0) obj;
                c cVar = qob0Var.b;
                cob0 cob0Var = qob0Var.a;
                if (cob0Var == null || cob0Var.b) {
                    c.P(cVar, (pv0) cVar.F.i().orElse(null), true);
                } else {
                    cVar.M.a(jnb0.a);
                }
                return zy11Var;
            default:
                c cVar2 = ((pob0) obj).a;
                cVar2.P.a = false;
                cVar2.M.a(knb0.a);
                cVar2.i();
                return zy11Var;
        }
    }
}
