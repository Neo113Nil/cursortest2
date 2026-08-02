package defpackage;

import android.app.Person;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.x0;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes10.dex */
public final class lzr0 {
    public Context a;
    public String b;
    public Intent[] c;
    public CharSequence d;
    public IconCompat e;
    public x0[] f;
    public boolean g;

    public final ShortcutInfo a() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.a, this.b).setShortLabel(this.d).setIntents(this.c);
        IconCompat iconCompat = this.e;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.i(this.a));
        }
        if (!TextUtils.isEmpty(null)) {
            intents.setLongLabel(null);
        }
        if (!TextUtils.isEmpty(null)) {
            intents.setDisabledMessage(null);
        }
        intents.setRank(0);
        x0[] x0VarArr = this.f;
        if (x0VarArr != null && x0VarArr.length > 0) {
            int length = x0VarArr.length;
            Person[] personArr = new Person[length];
            for (int i = 0; i < length; i++) {
                personArr[i] = this.f[i].a();
            }
            intents.setPersons(personArr);
        }
        intents.setLongLived(this.g);
        if (Build.VERSION.SDK_INT >= 33) {
            rh.n(intents);
        }
        return intents.build();
    }
}
