package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes8.dex */
public final class a6w implements xbi0 {
    public final /* synthetic */ int a;
    public final SharedPreferences b;
    public final String c;

    public /* synthetic */ a6w(int i, SharedPreferences sharedPreferences, String str) {
        this.a = i;
        this.b = sharedPreferences;
        this.c = str;
    }

    public Long a() {
        return Long.valueOf(this.b.getLong(this.c, 0L));
    }

    public void b(Integer num) {
        SharedPreferences.Editor edit = this.b.edit();
        String str = this.c;
        if (num != null) {
            edit.putInt(str, num.intValue());
        } else {
            edit.remove(str);
        }
        edit.apply();
    }

    public void c(Long l) {
        SharedPreferences.Editor edit = this.b.edit();
        String str = this.c;
        if (l != null) {
            edit.putLong(str, l.longValue());
        } else {
            edit.remove(str);
        }
        edit.apply();
    }

    @Override // defpackage.vbi0
    public final Object getValue(Object obj, kgx kgxVar) {
        int i = this.a;
        String str = this.c;
        SharedPreferences sharedPreferences = this.b;
        switch (i) {
            case 0:
                return Integer.valueOf(sharedPreferences.getInt(str, 0));
            case 1:
                return a();
            default:
                String string = sharedPreferences.getString("prefs_session_id", str);
                return string == null ? str : string;
        }
    }

    @Override // defpackage.xbi0
    public final void setValue(Object obj, kgx kgxVar, Object obj2) {
        switch (this.a) {
            case 0:
                b((Integer) obj2);
                break;
            case 1:
                c((Long) obj2);
                break;
            default:
                SharedPreferences.Editor edit = this.b.edit();
                edit.putString("prefs_session_id", (String) obj2);
                edit.apply();
                break;
        }
    }
}
