package xsna;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* compiled from: Person.java */
/* loaded from: classes11.dex */
public final class j1a0 {
    public CharSequence a;
    public IconCompat b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;

    public static j1a0 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        CharSequence charSequence = bundle.getCharSequence("name");
        IconCompat b = bundle2 != null ? IconCompat.b(bundle2) : null;
        String string = bundle.getString("uri");
        String string2 = bundle.getString("key");
        boolean z = bundle.getBoolean("isBot");
        boolean z2 = bundle.getBoolean("isImportant");
        j1a0 j1a0Var = new j1a0();
        j1a0Var.a = charSequence;
        j1a0Var.b = b;
        j1a0Var.c = string;
        j1a0Var.d = string2;
        j1a0Var.e = z;
        j1a0Var.f = z2;
        return j1a0Var;
    }

    public final Person b() {
        Person.Builder name = new Person.Builder().setName(this.a);
        IconCompat iconCompat = this.b;
        return name.setIcon(iconCompat != null ? iconCompat.l(null) : null).setUri(this.c).setKey(this.d).setBot(this.e).setImportant(this.f).build();
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.a);
        IconCompat iconCompat = this.b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.k() : null);
        bundle.putString("uri", this.c);
        bundle.putString("key", this.d);
        bundle.putBoolean("isBot", this.e);
        bundle.putBoolean("isImportant", this.f);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof j1a0)) {
            return false;
        }
        j1a0 j1a0Var = (j1a0) obj;
        String str = this.d;
        String str2 = j1a0Var.d;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(this.a), Objects.toString(j1a0Var.a)) && Objects.equals(this.c, j1a0Var.c) && Boolean.valueOf(this.e).equals(Boolean.valueOf(j1a0Var.e)) && Boolean.valueOf(this.f).equals(Boolean.valueOf(j1a0Var.f)) : Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.d;
        return str != null ? str.hashCode() : Objects.hash(this.a, this.c, Boolean.valueOf(this.e), Boolean.valueOf(this.f));
    }
}
