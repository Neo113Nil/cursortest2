package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.RecoverableSecurityException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import com.fluttercandies.photo_manager.core.utils.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class ehb0 implements nzc0 {
    public ozj0 B;
    public ozj0 C;
    public final Context a;
    public dhb0 z;
    public Activity b = null;
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public final LinkedList y = new LinkedList();
    public final int A = 40069;

    public ehb0(Context context) {
        this.a = context;
    }

    public final void a(List list) {
        String X = a.X(list, ",", null, null, new dia0(25), 30);
        ContentResolver contentResolver = this.a.getContentResolver();
        b.a.getClass();
        contentResolver.delete(MediaStore.Files.getContentUri("external"), oyr.p("_id in (", X, Extension.C_BRAKE), (String[]) list.toArray(new String[0]));
    }

    public final void b(List list, ozj0 ozj0Var) {
        PendingIntent createDeleteRequest;
        this.B = ozj0Var;
        ContentResolver contentResolver = this.a.getContentResolver();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (uri != null) {
                arrayList.add(uri);
            }
        }
        createDeleteRequest = MediaStore.createDeleteRequest(contentResolver, arrayList);
        Activity activity = this.b;
        if (activity != null) {
            activity.startIntentSenderForResult(createDeleteRequest.getIntentSender(), this.A, null, 0, 0, 0);
        }
    }

    public final void c(HashMap hashMap, ozj0 ozj0Var) {
        this.C = ozj0Var;
        LinkedHashMap linkedHashMap = this.c;
        linkedHashMap.clear();
        linkedHashMap.putAll(hashMap);
        this.w.clear();
        ArrayList arrayList = this.x;
        arrayList.clear();
        LinkedList linkedList = this.y;
        linkedList.clear();
        for (Map.Entry entry : hashMap.entrySet()) {
            Uri uri = (Uri) entry.getValue();
            if (uri != null) {
                String str = (String) entry.getKey();
                try {
                    this.a.getContentResolver().delete(uri, null, null);
                    arrayList.add(str);
                } catch (Exception e) {
                    if (!(e instanceof RecoverableSecurityException)) {
                        wfz.f(e, "delete assets error in api 29");
                        e();
                        return;
                    }
                    linkedList.add(new dhb0(this, str, uri, (RecoverableSecurityException) e));
                }
            }
        }
        f();
    }

    public final void d(List list, ozj0 ozj0Var) {
        PendingIntent createTrashRequest;
        this.B = ozj0Var;
        ContentResolver contentResolver = this.a.getContentResolver();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (uri != null) {
                arrayList.add(uri);
            }
        }
        createTrashRequest = MediaStore.createTrashRequest(contentResolver, arrayList, true);
        Activity activity = this.b;
        if (activity != null) {
            activity.startIntentSenderForResult(createTrashRequest.getIntentSender(), this.A, null, 0, 0, 0);
        }
    }

    public final void e() {
        ArrayList arrayList = this.w;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) this.c.get((String) it.next());
                if (uri != null) {
                    this.a.getContentResolver().delete(uri, null, null);
                }
            }
        }
        ozj0 ozj0Var = this.C;
        ArrayList arrayList2 = this.x;
        if (ozj0Var != null) {
            ozj0Var.a(a.m0(a.J0(arrayList2), a.J0(arrayList)));
        }
        arrayList.clear();
        arrayList2.clear();
        this.C = null;
    }

    public final void f() {
        dhb0 dhb0Var = (dhb0) this.y.poll();
        if (dhb0Var == null) {
            e();
            return;
        }
        this.z = dhb0Var;
        Intent intent = new Intent();
        intent.setData(dhb0Var.b);
        Activity activity = dhb0Var.d.b;
        if (activity != null) {
            activity.startIntentSenderForResult(dhb0Var.c.getUserAction().getActionIntent().getIntentSender(), 40070, intent, 0, 0, 0);
        }
    }

    @Override // defpackage.nzc0
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        List list;
        ozj0 ozj0Var;
        if (i == this.A) {
            ozj0 ozj0Var2 = this.B;
            if (i2 == -1) {
                if (ozj0Var2 != null && (list = (List) ozj0Var2.b.a("ids")) != null && (ozj0Var = this.B) != null) {
                    ozj0Var.a(list);
                    return true;
                }
            } else if (ozj0Var2 != null) {
                ozj0Var2.a(EmptyList.a);
                return true;
            }
        } else {
            if (i != 40070) {
                return false;
            }
            dhb0 dhb0Var = this.z;
            if (dhb0Var != null) {
                ehb0 ehb0Var = dhb0Var.d;
                if (i2 == -1) {
                    ehb0Var.w.add(dhb0Var.a);
                }
                ehb0Var.f();
            }
        }
        return true;
    }
}
