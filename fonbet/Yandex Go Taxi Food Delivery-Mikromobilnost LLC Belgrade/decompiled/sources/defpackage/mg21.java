package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes10.dex */
public final class mg21 implements lg21 {
    public final Context a;
    public final h1h b;

    public mg21(Context context, h1h h1hVar) {
        this.a = context;
        this.b = h1hVar;
    }

    public final boolean a(String str) {
        Uri parse = (str == null || evu0.J(str)) ? null : Uri.parse(str);
        if (parse == null) {
            return false;
        }
        if (this.b.a(parse)) {
            return b(parse);
        }
        Intent intent = new Intent("android.intent.action.VIEW", parse);
        Context context = this.a;
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : queryIntentActivities) {
            if (!jl40.l(((ResolveInfo) obj).activityInfo.packageName, context.getPackageName())) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ResolveInfo) it.next()).activityInfo.packageName);
            }
            List I = a.I(arrayList2);
            ArrayList arrayList3 = new ArrayList(tcc.n(I, 10));
            Iterator it2 = I.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new Intent(intent).setPackage((String) it2.next()));
            }
            ArrayList arrayList4 = new ArrayList(arrayList3);
            intent = Intent.createChooser((Intent) arrayList4.remove(0), null);
            if (!arrayList4.isEmpty()) {
                intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList4.toArray(new Intent[0]));
            }
        }
        return d(intent);
    }

    public final boolean b(Uri uri) {
        return d(this.b.b(this.a, uri, null));
    }

    public final boolean c(String str) {
        Uri parse = (str == null || evu0.J(str)) ? null : Uri.parse(str);
        return parse != null && b(parse);
    }

    public final boolean d(Intent intent) {
        Object failure;
        try {
            intent.setFlags(SelfTester_JCP.IMITA);
            this.a.startActivity(intent);
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            jst.e.k(a, String.format("Error to start activity with link %s", Arrays.copyOf(new Object[]{String.valueOf(intent.getData())}, 1)));
        }
        return !(failure instanceof Result.Failure);
    }
}
