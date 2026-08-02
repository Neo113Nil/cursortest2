package xsna;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TaskStackBuilder.java */
/* loaded from: classes11.dex */
public final class e7o0 implements Iterable<Intent> {
    public final ArrayList<Intent> b = new ArrayList<>();
    public final AppCompatActivity c;

    /* compiled from: TaskStackBuilder.java */
    /* loaded from: classes.dex */
    public interface a {
        Intent getSupportParentActivityIntent();
    }

    public e7o0(AppCompatActivity appCompatActivity) {
        this.c = appCompatActivity;
    }

    public static e7o0 b(AppCompatActivity appCompatActivity) {
        return new e7o0(appCompatActivity);
    }

    public final void a(AppCompatActivity appCompatActivity) {
        Intent supportParentActivityIntent = appCompatActivity.getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = jw50.b(appCompatActivity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            AppCompatActivity appCompatActivity2 = this.c;
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(appCompatActivity2.getPackageManager());
            }
            ArrayList<Intent> arrayList = this.b;
            int size = arrayList.size();
            try {
                for (Intent a2 = jw50.a(appCompatActivity2, component); a2 != null; a2 = jw50.a(appCompatActivity2, a2.getComponent())) {
                    arrayList.add(size, a2);
                }
                arrayList.add(supportParentActivityIntent);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e);
            }
        }
    }

    public final void c() {
        ArrayList<Intent> arrayList = this.b;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.c.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.b.iterator();
    }
}
