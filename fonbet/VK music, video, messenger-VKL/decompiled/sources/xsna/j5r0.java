package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.vk.uxpolls.api.models.BaseRequestParam;
import com.vk.uxpolls.data.model.UxPollsShownData;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: UxPollsPreferencesImpl.kt */
/* loaded from: classes6.dex */
public final class j5r0 implements i5r0 {
    public final Gson a;
    public final bpn0 b;

    /* compiled from: UxPollsPreferencesImpl.kt */
    public static final class a extends xtp0<ArrayList<BaseRequestParam>> {
    }

    public j5r0(Context context, Gson gson) {
        this.a = gson;
        this.b = new bpn0(new zx20(context, 3));
    }

    @Override // xsna.i5r0
    public final List<BaseRequestParam> a() {
        List<BaseRequestParam> list = (List) this.a.fromJson(((SharedPreferences) this.b.getValue()).getString("sp_ux_poll_translations_key", ""), new a().getType());
        return list == null ? EmptyList.b : list;
    }

    @Override // xsna.i5r0
    public final String b() {
        String string = ((SharedPreferences) this.b.getValue()).getString("sp_ux_poll_key", null);
        if (string != null) {
            return (String) this.a.fromJson(string, String.class);
        }
        return null;
    }

    @Override // xsna.i5r0
    public final void c(UxPollsShownData uxPollsShownData) {
        SharedPreferences.Editor edit = ((SharedPreferences) this.b.getValue()).edit();
        edit.putString("sp_ux_poll_passed_key", this.a.toJson(uxPollsShownData));
        edit.commit();
    }

    @Override // xsna.i5r0
    public final void d(String str) {
        SharedPreferences.Editor edit = ((SharedPreferences) this.b.getValue()).edit();
        edit.putString("sp_ux_poll_key", this.a.toJson(str));
        edit.commit();
    }

    @Override // xsna.i5r0
    public final void e(List<BaseRequestParam> list) {
        SharedPreferences.Editor edit = ((SharedPreferences) this.b.getValue()).edit();
        edit.putString("sp_ux_poll_translations_key", this.a.toJson(list));
        edit.commit();
    }
}
