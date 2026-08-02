package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.a;

/* loaded from: classes10.dex */
public final class jeu0 {
    public final SharedPreferences a;
    public final i3y b = a.a(new gas0(29, this));

    public jeu0(Context context) {
        this.a = context.getSharedPreferences("androidx.emoji2.emojipicker.preferences", 0);
    }
}
