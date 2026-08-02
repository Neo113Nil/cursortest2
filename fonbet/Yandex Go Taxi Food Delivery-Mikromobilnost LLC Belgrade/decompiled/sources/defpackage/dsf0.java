package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import java.util.Set;
import kotlin.a;
import kotlin.collections.EmptySet;

/* loaded from: classes9.dex */
public final class dsf0 {
    public static final p53 f = new p53(azs.Companion.serializer(), 0);
    public final Context a;
    public final wnt b;
    public final tt2 c;
    public final i3y d = a.a(new csf0(0, this));
    public volatile List e;

    public dsf0(Context context, wnt wntVar, tt2 tt2Var) {
        this.a = context;
        this.b = wntVar;
        this.c = tt2Var;
    }

    public final SharedPreferences a() {
        return (SharedPreferences) this.d.getValue();
    }

    public final boolean b(String str) {
        SharedPreferences a = a();
        Set<String> set = EmptySet.a;
        Set<String> stringSet = a.getStringSet("ru.yandex.taxi.PromotionsProvider.FIELD_WATCHED_PROMOTIONS_IDS", set);
        if (stringSet != null) {
            set = stringSet;
        }
        return set.contains(str);
    }
}
