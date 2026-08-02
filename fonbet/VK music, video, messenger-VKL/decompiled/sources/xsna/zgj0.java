package xsna;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import xsna.c000;

/* compiled from: ShortcutInfoCompat.java */
/* loaded from: classes11.dex */
public final class zgj0 {
    public Context a;
    public String b;
    public Intent[] c;
    public ComponentName d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public IconCompat h;
    public j1a0[] i;
    public Set<String> j;
    public c000 k;
    public boolean l;
    public int m;
    public PersistableBundle n;

    /* compiled from: ShortcutInfoCompat.java */
    public static class a {
        public static void a(ShortcutInfo.Builder builder) {
            builder.setExcludedFromSurfaces(0);
        }
    }

    /* compiled from: ShortcutInfoCompat.java */
    public static class b {
        public final zgj0 a;

        public b(Context context, ShortcutInfo shortcutInfo) {
            j1a0[] j1a0VarArr;
            String string;
            LocusId locusId;
            LocusId locusId2;
            zgj0 zgj0Var = new zgj0();
            this.a = zgj0Var;
            zgj0Var.a = context;
            zgj0Var.b = shortcutInfo.getId();
            shortcutInfo.getPackage();
            Intent[] intents = shortcutInfo.getIntents();
            zgj0Var.c = (Intent[]) Arrays.copyOf(intents, intents.length);
            zgj0Var.d = shortcutInfo.getActivity();
            zgj0Var.e = shortcutInfo.getShortLabel();
            zgj0Var.f = shortcutInfo.getLongLabel();
            zgj0Var.g = shortcutInfo.getDisabledMessage();
            shortcutInfo.getDisabledReason();
            zgj0Var.j = shortcutInfo.getCategories();
            PersistableBundle extras = shortcutInfo.getExtras();
            c000 c000Var = null;
            if (extras == null || !extras.containsKey("extraPersonCount")) {
                j1a0VarArr = null;
            } else {
                int i = extras.getInt("extraPersonCount");
                j1a0VarArr = new j1a0[i];
                int i2 = 0;
                while (i2 < i) {
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i3 = i2 + 1;
                    sb.append(i3);
                    PersistableBundle persistableBundle = extras.getPersistableBundle(sb.toString());
                    String string2 = persistableBundle.getString("name");
                    String string3 = persistableBundle.getString("uri");
                    String string4 = persistableBundle.getString("key");
                    boolean z = persistableBundle.getBoolean("isBot");
                    boolean z2 = persistableBundle.getBoolean("isImportant");
                    j1a0 j1a0Var = new j1a0();
                    j1a0Var.a = string2;
                    j1a0Var.b = null;
                    j1a0Var.c = string3;
                    j1a0Var.d = string4;
                    j1a0Var.e = z;
                    j1a0Var.f = z2;
                    j1a0VarArr[i2] = j1a0Var;
                    i2 = i3;
                }
            }
            zgj0Var.i = j1a0VarArr;
            zgj0 zgj0Var2 = this.a;
            shortcutInfo.getUserHandle();
            zgj0Var2.getClass();
            zgj0 zgj0Var3 = this.a;
            shortcutInfo.getLastChangedTimestamp();
            zgj0Var3.getClass();
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                zgj0 zgj0Var4 = this.a;
                shortcutInfo.isCached();
                zgj0Var4.getClass();
            }
            zgj0 zgj0Var5 = this.a;
            shortcutInfo.isDynamic();
            zgj0Var5.getClass();
            zgj0 zgj0Var6 = this.a;
            shortcutInfo.isPinned();
            zgj0Var6.getClass();
            zgj0 zgj0Var7 = this.a;
            shortcutInfo.isDeclaredInManifest();
            zgj0Var7.getClass();
            zgj0 zgj0Var8 = this.a;
            shortcutInfo.isImmutable();
            zgj0Var8.getClass();
            zgj0 zgj0Var9 = this.a;
            shortcutInfo.isEnabled();
            zgj0Var9.getClass();
            zgj0 zgj0Var10 = this.a;
            shortcutInfo.hasKeyFieldsOnly();
            zgj0Var10.getClass();
            zgj0 zgj0Var11 = this.a;
            if (i4 >= 29) {
                locusId = shortcutInfo.getLocusId();
                if (locusId != null) {
                    locusId2 = shortcutInfo.getLocusId();
                    obr.e(locusId2, "locusId cannot be null");
                    String b = c000.a.b(locusId2);
                    if (TextUtils.isEmpty(b)) {
                        throw new IllegalArgumentException("id cannot be empty");
                    }
                    c000Var = new c000(b);
                }
            } else {
                PersistableBundle extras2 = shortcutInfo.getExtras();
                if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                    c000Var = new c000(string);
                }
            }
            zgj0Var11.k = c000Var;
            this.a.m = shortcutInfo.getRank();
            this.a.n = shortcutInfo.getExtras();
        }

        public final zgj0 a() {
            zgj0 zgj0Var = this.a;
            if (TextUtils.isEmpty(zgj0Var.e)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            Intent[] intentArr = zgj0Var.c;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            return zgj0Var;
        }
    }

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final ShortcutInfo b() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.a, this.b).setShortLabel(this.e).setIntents(this.c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.l(this.a));
        }
        if (!TextUtils.isEmpty(this.f)) {
            intents.setLongLabel(this.f);
        }
        if (!TextUtils.isEmpty(this.g)) {
            intents.setDisabledMessage(this.g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.m);
        PersistableBundle persistableBundle = this.n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            j1a0[] j1a0VarArr = this.i;
            if (j1a0VarArr != null && j1a0VarArr.length > 0) {
                int length = j1a0VarArr.length;
                Person[] personArr = new Person[length];
                while (i < length) {
                    personArr[i] = this.i[i].b();
                    i++;
                }
                intents.setPersons(personArr);
            }
            c000 c000Var = this.k;
            if (c000Var != null) {
                intents.setLocusId(c000Var.b);
            }
            intents.setLongLived(this.l);
        } else {
            if (this.n == null) {
                this.n = new PersistableBundle();
            }
            j1a0[] j1a0VarArr2 = this.i;
            if (j1a0VarArr2 != null && j1a0VarArr2.length > 0) {
                this.n.putInt("extraPersonCount", j1a0VarArr2.length);
                while (i < this.i.length) {
                    PersistableBundle persistableBundle2 = this.n;
                    StringBuilder sb = new StringBuilder("extraPerson_");
                    int i2 = i + 1;
                    sb.append(i2);
                    String sb2 = sb.toString();
                    j1a0 j1a0Var = this.i[i];
                    j1a0Var.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = j1a0Var.a;
                    persistableBundle3.putString("name", charSequence != null ? charSequence.toString() : null);
                    persistableBundle3.putString("uri", j1a0Var.c);
                    persistableBundle3.putString("key", j1a0Var.d);
                    persistableBundle3.putBoolean("isBot", j1a0Var.e);
                    persistableBundle3.putBoolean("isImportant", j1a0Var.f);
                    persistableBundle2.putPersistableBundle(sb2, persistableBundle3);
                    i = i2;
                }
            }
            c000 c000Var2 = this.k;
            if (c000Var2 != null) {
                this.n.putString("extraLocusId", c000Var2.a);
            }
            this.n.putBoolean("extraLongLived", this.l);
            intents.setExtras(this.n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.a(intents);
        }
        return intents.build();
    }
}
