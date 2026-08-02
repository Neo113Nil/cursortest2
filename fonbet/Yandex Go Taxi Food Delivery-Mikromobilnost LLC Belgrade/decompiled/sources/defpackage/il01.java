package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.semantics.f;
import com.yandex.go.multimodal_route.a;
import java.util.ArrayList;
import kotlin.sequences.b;

/* loaded from: classes15.dex */
public final /* synthetic */ class il01 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ il01(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 4;
        zy11 zy11Var = zy11.a;
        mp21 mp21Var = null;
        nv21 nv21Var = null;
        Long valueOf = null;
        am21 am21Var = null;
        r8 = null;
        String str = null;
        String Y1 = null;
        yl21 yl21Var = null;
        r8 = null;
        String str2 = null;
        in21 in21Var = null;
        Boolean bool = null;
        String str3 = this.b;
        switch (i) {
            case 0:
                wk01 wk01Var = (wk01) obj;
                return wk01.b(wk01Var, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, null, false, null, null, v4r0.i(wk01Var.F, str3), null, null, null, null, Integer.MAX_VALUE, 15);
            case 1:
                return wk01.b((wk01) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, null, false, null, null, null, null, null, null, this.b, -1, 7);
            case 2:
                f.l((mnq0) obj, str3);
                return zy11Var;
            case 3:
                return Boolean.valueOf(evu0.y(((ary) obj).a.getTitle(), str3, true));
            case 4:
                View view = (View) obj;
                if (jl40.l(view.getTransitionName(), str3)) {
                    return view;
                }
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    return (View) b.j(b.o(new jr31(viewGroup, 0), new il01(str3, i2)));
                }
                return null;
            case 5:
                f.l((mnq0) obj, str3);
                return zy11Var;
            case 6:
                ou40 ou40Var = (ou40) obj;
                switch (ou40Var.a) {
                    case 0:
                        a aVar = (a) ou40Var.b;
                        iu40 iu40Var = (iu40) ou40Var.c;
                        String str4 = iu40Var.a;
                        o2y0 o2y0Var = iu40Var.b;
                        c4g Q = aVar.Q();
                        ra00 ra00Var = (ra00) ((c0g) ((i6r) Q.a)).u8.get();
                        q5z.h(ra00Var);
                        new at20(ra00Var, new gyc((c4g) Q.b)).e(o2y0Var, str3, str4);
                        return zy11Var;
                    default:
                        hw40 hw40Var = (hw40) ou40Var.b;
                        c4g c4gVar = hw40Var.E;
                        if (c4gVar == null) {
                            i6r i6rVar = hw40Var.D;
                            i6rVar.getClass();
                            c4g c4gVar2 = new c4g(i6rVar);
                            hw40Var.E = c4gVar2;
                            c4gVar = c4gVar2;
                        }
                        ra00 ra00Var2 = (ra00) ((c0g) ((i6r) c4gVar.a)).u8.get();
                        q5z.h(ra00Var2);
                        new at20(ra00Var2, new gyc((c4g) c4gVar.b)).e(null, str3, ((q911) ou40Var.c).c);
                        return zy11Var;
                }
            case 7:
                mnq0 mnq0Var = (mnq0) obj;
                if (str3.length() > 0) {
                    f.l(mnq0Var, str3);
                }
                return zy11Var;
            case 8:
                ull0 T0 = ((oll0) obj).T0("SELECT * FROM user_contact_table WHERE user_id=?");
                try {
                    T0.g1(1, str3);
                    int r = eja1.r(T0, "row_id");
                    int r2 = eja1.r(T0, "user_id");
                    int r3 = eja1.r(T0, "organization_id");
                    int r4 = eja1.r(T0, "type");
                    int r5 = eja1.r(T0, "value");
                    int r6 = eja1.r(T0, "is_legal");
                    ArrayList arrayList = new ArrayList();
                    while (T0.q()) {
                        arrayList.add(new il21(T0.isNull(r) ? null : Long.valueOf(T0.getLong(r)), T0.Y1(r2), T0.getLong(r3), T0.Y1(r4), T0.Y1(r5), ((int) T0.getLong(r6)) != 0));
                    }
                    return arrayList;
                } finally {
                }
            case 9:
                oll0 oll0Var = (oll0) obj;
                ull0 T02 = oll0Var.T0("DELETE FROM user_contact_table WHERE user_id=?");
                try {
                    T02.g1(1, str3);
                    T02.q();
                    int x = jx81.x(oll0Var);
                    T02.close();
                    return Integer.valueOf(x);
                } finally {
                }
            case 10:
                ull0 T03 = ((oll0) obj).T0("SELECT * FROM user_employee WHERE user_id=?");
                try {
                    T03.g1(1, str3);
                    int r7 = eja1.r(T03, "user_id");
                    int r8 = eja1.r(T03, "organization_id");
                    int r9 = eja1.r(T03, "organization_name");
                    int r10 = eja1.r(T03, "department_name");
                    int r11 = eja1.r(T03, "position");
                    int r12 = eja1.r(T03, "is_guest");
                    int r13 = eja1.r(T03, "deleted");
                    int r14 = eja1.r(T03, "guest_organization_name");
                    int r15 = eja1.r(T03, "display_name");
                    ArrayList arrayList2 = new ArrayList();
                    while (T03.q()) {
                        arrayList2.add(new xl21(T03.Y1(r7), T03.getLong(r8), T03.isNull(r9) ? null : T03.Y1(r9), T03.isNull(r10) ? null : T03.Y1(r10), T03.isNull(r11) ? null : T03.Y1(r11), ((int) T03.getLong(r12)) != 0, ((int) T03.getLong(r13)) != 0, T03.isNull(r14) ? null : T03.Y1(r14), T03.isNull(r15) ? null : T03.Y1(r15)));
                    }
                    return arrayList2;
                } finally {
                }
            case 11:
                ull0 T04 = ((oll0) obj).T0("SELECT organization_id FROM user_employee WHERE user_id=?");
                try {
                    T04.g1(1, str3);
                    ArrayList arrayList3 = new ArrayList();
                    while (T04.q()) {
                        arrayList3.add(Long.valueOf(T04.getLong(0)));
                    }
                    return arrayList3;
                } finally {
                }
            case 12:
                oll0 oll0Var2 = (oll0) obj;
                ull0 T05 = oll0Var2.T0("DELETE FROM user_employee WHERE user_id=?");
                try {
                    T05.g1(1, str3);
                    T05.q();
                    int x2 = jx81.x(oll0Var2);
                    T05.close();
                    return Integer.valueOf(x2);
                } finally {
                }
            case 13:
                oll0 oll0Var3 = (oll0) obj;
                ull0 T06 = oll0Var3.T0("DELETE FROM user_metadata WHERE user_guid = ?");
                try {
                    T06.g1(1, str3);
                    T06.q();
                    int x3 = jx81.x(oll0Var3);
                    T06.close();
                    return Integer.valueOf(x3);
                } finally {
                }
            case 14:
                ull0 T07 = ((oll0) obj).T0("SELECT * FROM user_metadata WHERE user_guid = ?");
                try {
                    T07.g1(1, str3);
                    int r16 = eja1.r(T07, "user_guid");
                    int r17 = eja1.r(T07, "chatbar");
                    int r18 = eja1.r(T07, "calls_settings");
                    int r19 = eja1.r(T07, "complain_action");
                    int r20 = eja1.r(T07, "view_importants_list");
                    if (T07.q()) {
                        String Y12 = T07.Y1(r16);
                        byte[] blob = T07.isNull(r17) ? null : T07.getBlob(r17);
                        byte[] blob2 = T07.isNull(r18) ? null : T07.getBlob(r18);
                        byte[] blob3 = T07.isNull(r19) ? null : T07.getBlob(r19);
                        Integer valueOf2 = T07.isNull(r20) ? null : Integer.valueOf((int) T07.getLong(r20));
                        if (valueOf2 != null) {
                            bool = Boolean.valueOf(valueOf2.intValue() != 0);
                        }
                        mp21Var = new mp21(Y12, blob, blob2, blob3, bool);
                    }
                    return mp21Var;
                } finally {
                }
            case 15:
                return Integer.valueOf(((cne0) obj).i(str3, 0));
            case 16:
                ((cne0) obj).r("user_photo_id", str3);
                return zy11Var;
            case 17:
                ull0 T08 = ((oll0) obj).T0("SELECT user_id, shown_name, display_name, avatar_url, nickname, version, phone_id, contact_id,\n        lookup_id, robot, cannot_be_blocked, is_support_bot, disable_privates,\n        deleted, is_fake FROM users WHERE user_id=?");
                try {
                    T08.g1(1, str3);
                    if (T08.q()) {
                        String Y13 = T08.Y1(0);
                        in21Var = new in21(T08.Y1(1), T08.isNull(3) ? null : T08.Y1(3), Y13, T08.isNull(4) ? null : T08.Y1(4), T08.isNull(6) ? null : T08.Y1(6), T08.isNull(7) ? null : Long.valueOf(T08.getLong(7)), T08.isNull(8) ? null : T08.Y1(8), ((int) T08.getLong(9)) != 0, ((int) T08.getLong(10)) != 0, ((int) T08.getLong(11)) != 0, ((int) T08.getLong(12)) != 0, T08.isNull(5) ? null : Long.valueOf(T08.getLong(5)), T08.isNull(2) ? null : T08.Y1(2), ((int) T08.getLong(13)) != 0, ((int) T08.getLong(14)) != 0);
                    }
                    return in21Var;
                } finally {
                }
            case 18:
                ull0 T09 = ((oll0) obj).T0("SELECT nickname FROM users WHERE user_id=?");
                try {
                    T09.g1(1, str3);
                    if (T09.q() && !T09.isNull(0)) {
                        str2 = T09.Y1(0);
                    }
                    return str2;
                } finally {
                }
            case 19:
                ull0 T010 = ((oll0) obj).T0("SELECT user_id, display_name, nickname FROM users WHERE phone_id = ?");
                try {
                    T010.g1(1, str3);
                    if (T010.q()) {
                        String Y14 = T010.Y1(0);
                        String Y15 = T010.Y1(1);
                        if (!T010.isNull(2)) {
                            Y1 = T010.Y1(2);
                        }
                        yl21Var = new yl21(Y14, Y15, Y1);
                    }
                    return yl21Var;
                } finally {
                }
            case 20:
                ull0 T011 = ((oll0) obj).T0("SELECT avatar_url FROM users WHERE user_id = ? UNION SELECT null ORDER BY 1 DESC LIMIT 1");
                try {
                    T011.g1(1, str3);
                    if (T011.q() && !T011.isNull(0)) {
                        str = T011.Y1(0);
                    }
                    return str;
                } finally {
                }
            case 21:
                ull0 T012 = ((oll0) obj).T0("SELECT COUNT(1) FROM users WHERE user_id=?");
                try {
                    T012.g1(1, str3);
                    if (T012.q()) {
                        if (((int) T012.getLong(0)) != 0) {
                            r9 = true;
                        }
                    }
                    T012.close();
                    return Boolean.valueOf(r9);
                } finally {
                }
            case 22:
                ull0 T013 = ((oll0) obj).T0("SELECT is_support_bot FROM users WHERE user_id = ?");
                try {
                    T013.g1(1, str3);
                    if (T013.q()) {
                        if (((int) T013.getLong(0)) != 0) {
                            r9 = true;
                        }
                    }
                    T013.close();
                    return Boolean.valueOf(r9);
                } finally {
                }
            case 23:
                ull0 T014 = ((oll0) obj).T0("SELECT is_fake FROM users WHERE user_id=?");
                try {
                    T014.g1(1, str3);
                    if (T014.q()) {
                        if (((int) T014.getLong(0)) != 0) {
                            r9 = true;
                        }
                    }
                    T014.close();
                    return Boolean.valueOf(r9);
                } finally {
                }
            case 24:
                ull0 T015 = ((oll0) obj).T0("SELECT is_contact FROM users WHERE user_id=?");
                try {
                    T015.g1(1, str3);
                    if (T015.q()) {
                        if (((int) T015.getLong(0)) != 0) {
                            r9 = true;
                        }
                    }
                    T015.close();
                    return Boolean.valueOf(r9);
                } finally {
                }
            case 25:
                ull0 T016 = ((oll0) obj).T0("SELECT user_reduced_version, version FROM users WHERE user_id = ?");
                try {
                    T016.g1(1, str3);
                    if (T016.q()) {
                        Long valueOf3 = T016.isNull(0) ? null : Long.valueOf(T016.getLong(0));
                        if (!T016.isNull(1)) {
                            valueOf = Long.valueOf(T016.getLong(1));
                        }
                        am21Var = new am21(valueOf, valueOf3);
                    }
                    return am21Var;
                } finally {
                }
            case 26:
                ull0 T017 = ((oll0) obj).T0("SELECT robot FROM users WHERE user_id = ?");
                try {
                    T017.g1(1, str3);
                    if (T017.q()) {
                        if (((int) T017.getLong(0)) != 0) {
                            r9 = true;
                        }
                    }
                    T017.close();
                    return Boolean.valueOf(r9);
                } finally {
                }
            case 27:
                ull0 T018 = ((oll0) obj).T0("\n        UPDATE localized_data\n        SET loaded = 0\n        WHERE user_id = ?\n    ");
                try {
                    T018.g1(1, str3);
                    T018.q();
                    return zy11Var;
                } finally {
                }
            case 28:
                ull0 T019 = ((oll0) obj).T0("SELECT * FROM users_to_talk WHERE user_id = ?");
                try {
                    T019.g1(1, str3);
                    int r21 = eja1.r(T019, "user_id");
                    int r22 = eja1.r(T019, "org_id");
                    int r23 = eja1.r(T019, "shown_name");
                    int r24 = eja1.r(T019, "has_private_chat");
                    int r25 = eja1.r(T019, "has_contact");
                    int r26 = eja1.r(T019, "user_search_key");
                    int r27 = eja1.r(T019, "deleted");
                    if (T019.q()) {
                        nv21Var = new nv21(T019.Y1(r21), T019.getLong(r22), T019.Y1(r23), ((int) T019.getLong(r24)) != 0, ((int) T019.getLong(r25)) != 0, T019.Y1(r26), ((int) T019.getLong(r27)) != 0);
                    }
                    return nv21Var;
                } finally {
                }
            default:
                oll0 oll0Var4 = (oll0) obj;
                ull0 T020 = oll0Var4.T0("DELETE FROM users_to_talk WHERE user_id = ?");
                try {
                    T020.g1(1, str3);
                    T020.q();
                    int x4 = jx81.x(oll0Var4);
                    T020.close();
                    return Integer.valueOf(x4);
                } finally {
                }
        }
    }
}
