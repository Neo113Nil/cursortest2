package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import defpackage.ny61;
import defpackage.yci0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class f1 implements Iterable {
    public final ArrayList a = new ArrayList();
    public final Context b;

    public f1(Context context) {
        this.b = context;
    }

    public static f1 d(AppCompatActivity appCompatActivity) {
        return new f1(appCompatActivity);
    }

    public final void a(ComponentName componentName) {
        Context context = this.b;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        try {
            for (Intent h = com.yandex.passport.internal.util.p.h(context, componentName); h != null; h = com.yandex.passport.internal.util.p.h(context, h.getComponent())) {
                arrayList.add(size, h);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            yci0.r(e);
        }
    }

    public final void b(AppCompatActivity appCompatActivity) {
        Intent supportParentActivityIntent = appCompatActivity.getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = com.yandex.passport.internal.util.p.i(appCompatActivity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.b.getPackageManager());
            }
            a(component);
            this.a.add(supportParentActivityIntent);
        }
    }

    public final void e() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            ny61.r("No intents added to TaskStackBuilder; cannot startActivities");
            return;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.b.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
