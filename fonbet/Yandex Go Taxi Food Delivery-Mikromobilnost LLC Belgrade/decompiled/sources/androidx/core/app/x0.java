package androidx.core.app;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class x0 {
    public CharSequence a;
    public IconCompat b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;

    public final Person a() {
        Person.Builder name = new Person.Builder().setName(this.a);
        IconCompat iconCompat = this.b;
        return name.setIcon(iconCompat != null ? iconCompat.i(null) : null).setUri(this.c).setKey(this.d).setBot(this.e).setImportant(this.f).build();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        String str = this.d;
        String str2 = x0Var.d;
        return (str == null && str2 == null) ? Objects.equals(Objects.toString(this.a), Objects.toString(x0Var.a)) && Objects.equals(this.c, x0Var.c) && Boolean.valueOf(this.e).equals(Boolean.valueOf(x0Var.e)) && Boolean.valueOf(this.f).equals(Boolean.valueOf(x0Var.f)) : Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.d;
        return str != null ? str.hashCode() : Objects.hash(this.a, this.c, Boolean.valueOf(this.e), Boolean.valueOf(this.f));
    }
}
