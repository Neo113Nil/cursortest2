package androidx.datastore.preferences;

import defpackage.wls;
import defpackage.zls;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class a {
    public static final LinkedHashSet a = new LinkedHashSet();

    public static final zls a() {
        return new SharedPreferencesMigrationKt$getMigrationFunction$1(3, null);
    }

    public static final wls b(Set set) {
        return new SharedPreferencesMigrationKt$getShouldRunMigration$1(set, null);
    }
}
