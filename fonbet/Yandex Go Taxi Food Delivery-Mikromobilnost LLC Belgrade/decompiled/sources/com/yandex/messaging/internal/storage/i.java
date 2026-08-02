package com.yandex.messaging.internal.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import defpackage.hjt;
import defpackage.kse;
import defpackage.lff0;
import defpackage.oyr;
import defpackage.tje;
import defpackage.x22;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes8.dex */
public final class i {
    public final Context a;
    public final lff0 b;
    public final File c;
    public final x22 d;
    public final SharedPreferences e;
    public final kse f;
    public final Looper g;
    public final Set h = c();
    public boolean i;

    public i(Context context, lff0 lff0Var, File file, x22 x22Var, SharedPreferences sharedPreferences, kse kseVar, Looper looper) {
        this.a = context;
        this.b = lff0Var;
        this.c = file;
        this.d = x22Var;
        this.e = sharedPreferences;
        this.f = kseVar;
        this.g = looper;
    }

    public final Set a(Set set) {
        lff0 lff0Var = this.b;
        lff0Var.getClass();
        File file = new File(lff0Var.a.getNoBackupFilesDir(), "messenger");
        boolean exists = file.exists();
        EmptySet emptySet = EmptySet.a;
        if (!exists) {
            return emptySet;
        }
        if (!file.canWrite()) {
            this.d.reportEvent("tech_cleanup_profile_inaccessible");
            return emptySet;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (e(new File(file, str))) {
                linkedHashSet.add(str);
            }
        }
        return kotlin.collections.a.N0(linkedHashSet);
    }

    public final Set b(Set set) {
        File file = this.c;
        boolean exists = file.exists();
        EmptySet emptySet = EmptySet.a;
        if (!exists) {
            return emptySet;
        }
        if (!file.canWrite()) {
            this.d.reportEvent("tech_cleanup_profile_prefs_inaccessible");
            return emptySet;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (e(new File(file, oyr.p("messenger_", str, ".xml"))) && e(new File(file, oyr.p("messenger_ui_", str, ".xml")))) {
                linkedHashSet.add(str);
            }
        }
        return kotlin.collections.a.N0(linkedHashSet);
    }

    public final Set c() {
        Set<String> stringSet = this.e.getStringSet("OUTDATED_PROFILES", null);
        return stringSet != null ? kotlin.collections.a.N0(kotlin.collections.a.M(stringSet)) : EmptySet.a;
    }

    public final void d(String str) {
        tje.N(hjt.a, this.f.f, null, new StorageCleaner$scheduleCleanupProfile$1(this, str, null), 2);
    }

    public final boolean e(File file) {
        try {
            if (file.exists()) {
                return file.isFile() ? file.delete() : kotlin.io.b.l(file);
            }
            return true;
        } catch (IOException e) {
            this.d.reportError("Can't delete file " + file, e);
            return false;
        }
    }
}
