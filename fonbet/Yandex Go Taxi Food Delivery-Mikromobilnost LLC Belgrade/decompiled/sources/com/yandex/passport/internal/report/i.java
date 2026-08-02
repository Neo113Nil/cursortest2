package com.yandex.passport.internal.report;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.links.LinkMode;
import com.yandex.passport.internal.ui.domik.DomikActivity;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;

/* loaded from: classes15.dex */
public final class i implements pd {
    public final /* synthetic */ int a;
    public final String b;

    public i(boolean z, int i) {
        this.a = i;
        switch (i) {
            case 4:
                this.b = String.valueOf(z);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 17:
            default:
                this.b = String.valueOf(z);
                break;
            case 10:
                this.b = String.valueOf(z);
                break;
            case 11:
                this.b = String.valueOf(z);
                break;
            case 12:
                this.b = String.valueOf(z);
                break;
            case 13:
                this.b = String.valueOf(z);
                break;
            case 14:
                this.b = String.valueOf(z);
                break;
            case 15:
                this.b = String.valueOf(z);
                break;
            case 16:
                this.b = String.valueOf(z);
                break;
            case 18:
                this.b = String.valueOf(z);
                break;
            case 19:
                this.b = String.valueOf(z);
                break;
            case 20:
                this.b = String.valueOf(z);
                break;
        }
    }

    @Override // com.yandex.passport.internal.report.pd
    public final boolean a() {
        switch (this.a) {
        }
        return true;
    }

    @Override // com.yandex.passport.internal.report.pd
    public final String getName() {
        switch (this.a) {
            case 0:
                return "way";
            case 1:
                return "event_name";
            case 2:
                return "flow_id";
            case 3:
                return "force_native";
            case 4:
                return "force_update";
            case 5:
                return "fromLoginSDK";
            case 6:
                return "from";
            case 7:
                return URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST;
            case 8:
                return "hosts";
            case 9:
                return "id";
            case 10:
                return "is_actual";
            case 11:
                return "is_face_recognized";
            case 12:
                return "is_finishing";
            case 13:
                return "is_flow_successful";
            case 14:
                return "is_need_crypto_sdk_init";
            case 15:
                return DomikActivity.EXTRA_IS_RELOGIN;
            case 16:
                return "is_remove_account_explicitly";
            case 17:
                return "is_silent";
            case 18:
                return "is_task_id_null";
            case 19:
                return "xtoken_has_muid";
            case 20:
                return "is_webauthn_available";
            case 21:
                return CSPDirectoryConstants.SUBDIRECTORY_KEYS;
            case 22:
                return "language";
            case 23:
                return "link_mode";
            case 24:
                return "login_action";
            case 25:
                return "logout_option";
            case 26:
                return "mask_master_token";
            case 27:
                return "mask_new_master_token";
            case 28:
                return "muid_list";
            default:
                return "muid";
        }
    }

    @Override // com.yandex.passport.internal.report.pd
    public final String getValue() {
        int i = this.a;
        return this.b;
    }

    public i(Long l) {
        this.a = 29;
        this.b = String.valueOf(l);
    }

    public i(ArrayList arrayList, int i) {
        String str;
        this.a = i;
        switch (i) {
            case 28:
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uid uid = (Uid) it.next();
                    StringBuilder sb = new StringBuilder();
                    sb.append(uid.getEnvironment().getInteger());
                    sb.append(':');
                    sb.append(uid.getValue());
                    arrayList2.add(sb.toString());
                }
                this.b = qd.a(arrayList2);
                break;
            default:
                try {
                    ArrayList arrayList3 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(com.yandex.passport.common.url.b.d((String) it2.next()));
                    }
                    str = kotlin.collections.a.X(arrayList3, null, null, null, null, 63);
                } catch (Exception unused) {
                    str = "null";
                }
                this.b = str;
                break;
        }
    }

    public i(PassportLoginAction passportLoginAction) {
        this.a = 24;
        this.b = passportLoginAction.toString();
    }

    public /* synthetic */ i(String str, int i, boolean z) {
        this.a = i;
        this.b = str;
    }

    public i(LinkMode linkMode) {
        this.a = 23;
        this.b = linkMode.getPath();
    }

    public i(Set set) {
        this.a = 21;
        this.b = qd.a(set);
    }

    public i(String str, int i) {
        this.a = i;
        String str2 = "null";
        switch (i) {
            case 2:
                this.b = String.valueOf(str);
                break;
            case 7:
                if (str != null) {
                    try {
                        str2 = com.yandex.passport.common.url.b.d(str);
                    } catch (Exception unused) {
                    }
                }
                this.b = str2;
                break;
            case 26:
                Set set = qd.a;
                this.b = String.valueOf(com.yandex.passport.internal.ui.sloth.e.l(str));
                break;
            case 27:
                if (str != null) {
                    Set set2 = qd.a;
                    str2 = String.valueOf(com.yandex.passport.internal.ui.sloth.e.l(str));
                }
                this.b = str2;
                break;
            default:
                this.b = str == null ? "null" : str;
                break;
        }
    }

    public i(Boolean bool) {
        this.a = 17;
        this.b = String.valueOf(bool);
    }
}
