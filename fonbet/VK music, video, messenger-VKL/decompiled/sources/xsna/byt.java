package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.ironsource.O6;
import com.vk.api.generated.newsfeed.dto.NewsfeedGetBannedExtendedFilterDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.Image;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import java.lang.reflect.Method;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GhostViewPlatform.java */
/* loaded from: classes12.dex */
public final class byt implements zxt, fr5, c4, dwz0 {
    public static Class c;
    public static boolean d;
    public static Method e;
    public static boolean f;
    public static Method g;
    public static boolean h;
    public final Object b;

    public /* synthetic */ byt(Object obj) {
        this.b = obj;
    }

    public void b(int i, String str) {
        try {
            ((JSONObject) this.b).put(str, i);
        } catch (JSONException unused) {
            throw new RuntimeException(zil0.a(i, "Illegal JSON value ", str, ": "));
        }
    }

    public io.reactivex.rxjava3.internal.operators.observable.j1 c(int i, String str) {
        return rsg0.T(yfb.x(new dz60().c((List) this.b, NewsfeedGetBannedExtendedFilterDto.GROUPS, Integer.valueOf(i), str))).U(new g7(new x8m(25), 28));
    }

    @Override // xsna.c4
    public void d(b4 b4Var) {
        q4 q4Var = ((VideoMinimizableDiscoveryFragment) this.b).I0;
        if (q4Var != null) {
            q4Var.d(b4Var);
        }
    }

    public io.reactivex.rxjava3.internal.operators.observable.j1 e(int i, String str) {
        return rsg0.T(yfb.x(new dz60().c((List) this.b, NewsfeedGetBannedExtendedFilterDto.PROFILES, Integer.valueOf(i), str))).U(new bj50(new xpt(11), 2));
    }

    @Override // xsna.fr5
    public io.reactivex.rxjava3.core.x i() {
        return io.reactivex.rxjava3.core.x.k((Image) this.b);
    }

    @Override // xsna.zxt
    public void setVisibility(int i) {
        ((View) this.b).setVisibility(i);
    }

    @Override // xsna.dwz0
    public Object zza() {
        dc01 dc01Var = (dc01) ((dwz0) this.b).zza();
        if (dc01Var != null) {
            return dc01Var;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public byt(int i) {
        switch (i) {
            case 3:
                this.b = e43.l(UsersFieldsDto.CAREER, UsersFieldsDto.CITY, UsersFieldsDto.COUNTRY, UsersFieldsDto.EDUCATION, UsersFieldsDto.DESCRIPTION, UsersFieldsDto.DESCRIPTIONS, UsersFieldsDto.ACTIVITY, UsersFieldsDto.VERIFIED, UsersFieldsDto.TRENDING, UsersFieldsDto.IS_NFT, UsersFieldsDto.PHOTO_BASE);
                return;
            default:
                JSONObject jSONObject = new JSONObject();
                this.b = jSONObject;
                b(0, "autoplay");
                b(0, "mute");
                b(0, "controls");
                b(1, "enablejsapi");
                b(0, O6.W0);
                try {
                    jSONObject.put("origin", "https://www.youtube.com");
                    b(0, "rel");
                    b(0, "showinfo");
                    b(3, "iv_load_policy");
                    b(1, "modestbranding");
                    b(0, "cc_load_policy");
                    return;
                } catch (JSONException unused) {
                    throw new RuntimeException("Illegal JSON value origin: https://www.youtube.com");
                }
        }
    }

    @Override // xsna.zxt
    public void a(View view, ViewGroup viewGroup) {
    }
}
