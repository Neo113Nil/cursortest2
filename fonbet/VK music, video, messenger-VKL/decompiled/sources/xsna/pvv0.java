package xsna;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.vk.permission.PermissionHelper;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vkontakte.android.R;
import kotlin.Pair;
import kotlin.Result;
import org.json.JSONObject;
import xsna.bex0;

/* compiled from: VkUiContactsCommand.kt */
/* loaded from: classes6.dex */
public final class pvv0 extends dvv0 {
    public final Fragment e;

    public pvv0(Fragment fragment) {
        this.e = fragment;
    }

    @Override // xsna.dvv0
    public final void a(String str) {
        FragmentActivity activity = this.e.getActivity();
        if (activity == null) {
            return;
        }
        PermissionHelper permissionHelper = PermissionHelper.a;
        permissionHelper.getClass();
        PermissionHelper.h(permissionHelper, activity, PermissionHelper.u, R.string.vk_permissions_contacts_vkpay, R.string.vk_permissions_contacts_vkpay_settings, new egu0(this, 1), new hij0(this, 23), 64);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00be, code lost:
    
        if (r12 == null) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // xsna.dvv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i, int i2, Intent intent) {
        Object string;
        boolean z;
        String str;
        String str2;
        String string2;
        if (i == 21) {
            s3q0 s3q0Var = null;
            if (i2 != -1 || intent == null) {
                r6y r6yVar = this.b;
                String str3 = r6yVar != null ? r6yVar.g.get(JsApiMethodType.OPEN_CONTACTS) : null;
                r6y r6yVar2 = this.b;
                if (r6yVar2 != null) {
                    r6yVar2.B(JsApiMethodType.OPEN_CONTACTS, "VKWebAppContactsClosed", new JSONObject(), null, null);
                }
                r6y r6yVar3 = this.b;
                if (r6yVar3 != null) {
                    bex0.a.a(r6yVar3, JsApiMethodType.OPEN_CONTACTS, VkAppsErrors.Client.USER_DENIED, null, null, str3, 44);
                    return;
                }
                return;
            }
            Uri data = intent.getData();
            if (data == null) {
                return;
            }
            Fragment fragment = this.e;
            ContentResolver contentResolver = fragment.kn().getContentResolver();
            Cursor query = contentResolver != null ? contentResolver.query(data, new String[]{"_id"}, null, null, null) : null;
            try {
                if (query != null) {
                    try {
                    } finally {
                    }
                    if (query.moveToFirst()) {
                        string = query.getString(query.getColumnIndexOrThrow("_id"));
                        Object obj = string;
                        z = obj instanceof Result.Failure;
                        Object obj2 = obj;
                        if (z) {
                            obj2 = null;
                        }
                        str = (String) obj2;
                        ro.e(query, null);
                        if (str != null) {
                            Cursor query2 = fragment.kn().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"data1"}, "contact_id = ? AND data2 = 2", new String[]{str}, null);
                            if (query2 != null) {
                                try {
                                    query2.moveToFirst();
                                } finally {
                                    try {
                                        throw th;
                                    } finally {
                                    }
                                }
                            }
                            try {
                                str2 = query2.getString(query2.getColumnIndexOrThrow("data1"));
                            } catch (Throwable unused) {
                                str2 = null;
                            }
                            ro.e(query2, null);
                            Cursor query3 = fragment.kn().getContentResolver().query(ContactsContract.Data.CONTENT_URI, null, "mimetype = ? AND contact_id = ?", new String[]{"vnd.android.cursor.item/name", str}, "data2");
                            if (query3 != null) {
                                try {
                                    query3.moveToFirst();
                                } catch (Throwable th) {
                                }
                            }
                            String str4 = "";
                            if (query3 != null) {
                                try {
                                    string2 = query3.getString(query3.getColumnIndexOrThrow("data2"));
                                } catch (Throwable th2) {
                                    xgx0.a.getClass();
                                    xgx0.d(th2);
                                }
                            }
                            string2 = "";
                            if (query3 != null) {
                                try {
                                    String string3 = query3.getString(query3.getColumnIndexOrThrow("data3"));
                                    if (string3 != null) {
                                        str4 = string3;
                                    }
                                } catch (Throwable th3) {
                                    xgx0.a.getClass();
                                    xgx0.d(th3);
                                }
                            }
                            Pair pair = new Pair(string2, str4);
                            ro.e(query3, null);
                            String str5 = (String) pair.d();
                            String str6 = (String) pair.g();
                            if (str2 != null) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("phone", str2);
                                jSONObject.put("first_name", str5);
                                jSONObject.put("last_name", str6);
                                d(jSONObject);
                                s3q0Var = s3q0.a;
                            }
                            if (s3q0Var != null) {
                                return;
                            }
                        }
                        d(new JSONObject());
                    }
                }
                string = null;
                Object obj3 = string;
                z = obj3 instanceof Result.Failure;
                Object obj22 = obj3;
                if (z) {
                }
                str = (String) obj22;
                ro.e(query, null);
                if (str != null) {
                }
                d(new JSONObject());
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    ro.e(query, th4);
                }
            }
        }
    }

    public final void d(JSONObject jSONObject) {
        String str;
        r6y r6yVar = this.b;
        if (r6yVar != null) {
            str = r6yVar.g.get(JsApiMethodType.OPEN_CONTACTS);
        } else {
            str = null;
        }
        r6y r6yVar2 = this.b;
        if (r6yVar2 != null) {
            r6yVar2.B(JsApiMethodType.OPEN_CONTACTS, "VKWebAppContactsDone", jSONObject, null, null);
        }
        r6y r6yVar3 = this.b;
        if (r6yVar3 != null) {
            bex0.a.b(r6yVar3, JsApiMethodType.OPEN_CONTACTS, jSONObject, str, 8);
        }
    }
}
