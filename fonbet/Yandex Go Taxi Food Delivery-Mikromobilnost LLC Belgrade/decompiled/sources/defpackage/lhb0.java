package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import com.fluttercandies.photo_manager.core.PhotoManagerWriteManager$OperationType;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class lhb0 implements nzc0 {
    public final Context a;
    public Activity b;
    public ozj0 c;
    public khb0 w;

    public lhb0(Context context, Activity activity) {
        this.a = context;
        this.b = activity;
    }

    public final void a(ArrayList arrayList, String str, ozj0 ozj0Var) {
        PendingIntent createWriteRequest;
        if (this.b == null) {
            wfz.h("Activity is null, cannot request write permission");
            ozj0Var.a(Boolean.FALSE);
            return;
        }
        this.c = ozj0Var;
        this.w = new khb0(arrayList, str, PhotoManagerWriteManager$OperationType.MOVE);
        try {
            createWriteRequest = MediaStore.createWriteRequest(this.a.getContentResolver(), arrayList);
            Activity activity = this.b;
            if (activity != null) {
                activity.startIntentSenderForResult(createWriteRequest.getIntentSender(), 40071, null, 0, 0, 0);
            }
        } catch (Exception e) {
            wfz.f(e, "Failed to create write request");
            ozj0Var.a(Boolean.FALSE);
            this.w = null;
            this.c = null;
        }
    }

    @Override // defpackage.nzc0
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        boolean z = false;
        if (i != 40071) {
            return false;
        }
        if (i2 == -1) {
            khb0 khb0Var = this.w;
            if (khb0Var != null) {
                int i3 = jhb0.a[khb0Var.c.ordinal()];
                if (i3 == 1) {
                    ArrayList arrayList = khb0Var.a;
                    String str = khb0Var.b;
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("relative_path", str);
                        Iterator it = arrayList.iterator();
                        int i4 = 0;
                        while (it.hasNext()) {
                            Uri uri = (Uri) it.next();
                            try {
                                if (this.a.getContentResolver().update(uri, contentValues, null, null) > 0) {
                                    i4++;
                                }
                            } catch (Exception e) {
                                wfz.f(e, "Failed to move URI: " + uri);
                            }
                        }
                        wfz.l("Moved " + i4 + "/" + arrayList.size() + " files to " + str);
                        if (i4 > 0) {
                            z = true;
                        }
                    } catch (Exception e2) {
                        wfz.f(e2, "Failed to perform move operation");
                    }
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return false;
                    }
                    wfz.l("Generic update operation not yet implemented");
                }
                ozj0 ozj0Var = this.c;
                if (ozj0Var != null) {
                    ozj0Var.a(Boolean.valueOf(z));
                }
            } else {
                wfz.h("No pending operation found after write permission granted");
                ozj0 ozj0Var2 = this.c;
                if (ozj0Var2 != null) {
                    ozj0Var2.a(Boolean.FALSE);
                }
            }
        } else {
            wfz.l("User denied write permission");
            ozj0 ozj0Var3 = this.c;
            if (ozj0Var3 != null) {
                ozj0Var3.a(Boolean.FALSE);
            }
        }
        this.w = null;
        this.c = null;
        return true;
    }
}
