package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.vk.api.generated.users.dto.UsersUserCountersDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.newsfeed.domain.model.DiscoverCustomIntent;
import com.vk.search.params.api.domain.model.education.School;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedRequestContext;
import com.vk.voip.call_effects.CallEffectsDependency;
import com.vkontakte.android.R;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.regex.Matcher;
import kotlin.Lazy;
import org.json.JSONObject;
import ru.ok.call_effects.TensorflowModels;
import ru.ok.gl.tf.TensorflowFaceLandmarksType;
import ru.ok.gl.tf.TensorflowModel;
import ru.ok.gl.tf.TensorflowSegmentationType;
import ru.ok.tensorflow.tflite.ModelDataProvider;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class bqz0 implements omz0, dk01, q9f, xw8, p2q0, fsn0, TensorflowModels, oh60, jph0, fer0 {
    public final Object b;

    public /* synthetic */ bqz0(Object obj) {
        this.b = obj;
    }

    @Override // xsna.fsn0
    public boolean a(UsersUserFullDto usersUserFullDto) {
        Integer i;
        UsersUserCountersDto R = usersUserFullDto.R();
        return !(!x19.B(usersUserFullDto) || ((R == null || (i = R.i()) == null) ? 0 : i.intValue()) == 0);
    }

    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [xsna.jx2, xsna.qyn0] */
    @Override // xsna.oh60
    public mx6 c(vg60 vg60Var, krk0 krk0Var) {
        awq bwqVar;
        ?? r0;
        boolean z = krk0Var.a;
        String str = vg60Var.d;
        String str2 = vg60Var.a;
        String str3 = vg60Var.b;
        DiscoverCustomIntent discoverCustomIntent = vg60Var.e;
        Integer num = vg60Var.k;
        kf60 kf60Var = new kf60(str, str2, str3, discoverCustomIntent, num);
        JSONObject jSONObject = vg60Var.g;
        kf60Var.j = jSONObject != null ? jSONObject.toString() : null;
        kf60Var.f = vg60Var.h;
        kf60Var.g = vg60Var.i;
        kf60Var.h = vg60Var.j;
        ((ac60) this.b).getClass();
        long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        kf60Var.k = Long.valueOf(micros);
        if (z) {
            p1n p1nVar = krk0Var.c;
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = krk0Var.b;
            String h = discoverCustomIntent != null ? discoverCustomIntent.h() : null;
            r0 = 0;
            bwqVar = new bwq(new MobileOfficialAppsFeedStat$FeedRequestContext(num != null ? num.intValue() : -1, str2, vrk0.c(h), mobileOfficialAppsCoreNavStat$EventScreen, x260.b(com.vk.core.utils.newtork.b.c()), "newsfeed.getCustom", str, p1nVar != null ? vrk0.b(p1nVar) : null, null, Long.valueOf(micros), null, null, null, 7424, null));
            kf60Var.l = bwqVar;
        } else {
            bwqVar = new zvq();
            r0 = 0;
        }
        hz2 a = kf60Var.a();
        return new mx6(z ? rsg0.y0(a, r0, r0, 3).p(new yb60(bwqVar)) : rsg0.y0(a, r0, r0, 3).U(new rt0(new w110(bwqVar, 10), 24)), bwqVar);
    }

    @Override // xsna.p2q0
    public dql d(Context context) {
        return new dql(context);
    }

    @Override // xsna.omz0
    public void e(int i, boolean z) {
        ConnectionResult connectionResult;
        eqz0 eqz0Var = (eqz0) this.b;
        Lock lock = eqz0Var.o;
        Lock lock2 = eqz0Var.o;
        lock.lock();
        try {
            if (!eqz0Var.n && (connectionResult = eqz0Var.m) != null && connectionResult.j()) {
                eqz0Var.n = true;
                eqz0Var.g.onConnectionSuspended(i);
                lock2.unlock();
            }
            eqz0Var.n = false;
            eqz0Var.b.e(i, z);
            eqz0Var.m = null;
            eqz0Var.l = null;
            lock2.unlock();
        } catch (Throwable th) {
            lock2.unlock();
            throw th;
        }
    }

    @Override // xsna.dk01
    public void f(vk01 vk01Var, File file, boolean z) throws IOException {
        wd01 wd01Var = (wd01) this.b;
        wd01Var.b.add(file);
        if (z) {
            return;
        }
        wd01Var.c.set(false);
    }

    @Override // xsna.omz0
    public void g(@Nullable Bundle bundle) {
        eqz0 eqz0Var = (eqz0) this.b;
        eqz0Var.o.lock();
        try {
            Bundle bundle2 = eqz0Var.k;
            if (bundle2 == null) {
                eqz0Var.k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            eqz0Var.l = ConnectionResult.g;
            eqz0Var.k();
        } finally {
            eqz0Var.o.unlock();
        }
    }

    @Override // ru.ok.call_effects.TensorflowModels
    public ModelDataProvider getModelDataProvider(TensorflowModel tensorflowModel) {
        return (ModelDataProvider) ((CallEffectsDependency) this.b).h().get(tensorflowModel);
    }

    @Override // ru.ok.call_effects.TensorflowModels
    public TensorflowFaceLandmarksType getTensorflowFaceLandmarksType() {
        return ((CallEffectsDependency) this.b).f();
    }

    @Override // ru.ok.call_effects.TensorflowModels
    public TensorflowSegmentationType getTensorflowSegmentationType() {
        return ((CallEffectsDependency) this.b).getTensorflowSegmentationType();
    }

    @Override // xsna.jph0
    public hfz h(boolean z, cph0 cph0Var, int i) {
        return null;
    }

    @Override // xsna.fer0
    public void i(int i) {
        ((hl00) this.b).f();
    }

    @Override // ru.ok.call_effects.TensorflowModels
    public boolean isReady() {
        return ((CallEffectsDependency) this.b).a();
    }

    @Override // xsna.q9f
    public int j() {
        return ((jpd) this.b).i.b;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|2|3|(12:38|(1:40)|(9:37|9|(1:11)|12|13|14|(1:16)(1:32)|17|(2:19|20)(2:22|(2:24|25)(2:26|(2:28|29)(2:30|31))))|8|9|(0)|12|13|14|(0)(0)|17|(0)(0))|5|(1:7)(10:35|37|9|(0)|12|13|14|(0)(0)|17|(0)(0))|8|9|(0)|12|13|14|(0)(0)|17|(0)(0)|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058 A[Catch: all -> 0x006d, TryCatch #0 {all -> 0x006d, blocks: (B:3:0x000c, B:9:0x0037, B:17:0x004f, B:19:0x0058, B:22:0x006f, B:24:0x0077, B:26:0x0084, B:28:0x008c, B:30:0x0099, B:35:0x0029, B:37:0x0032, B:38:0x0019), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[Catch: all -> 0x006d, TryCatch #0 {all -> 0x006d, blocks: (B:3:0x000c, B:9:0x0037, B:17:0x004f, B:19:0x0058, B:22:0x006f, B:24:0x0077, B:26:0x0084, B:28:0x008c, B:30:0x0099, B:35:0x0029, B:37:0x0032, B:38:0x0019), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004b A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #1 {all -> 0x004f, blocks: (B:14:0x0042, B:32:0x004b), top: B:13:0x0042 }] */
    @Override // xsna.xw8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String k(evk evkVar) {
        Matcher matcher;
        String group;
        String queryParameter;
        xw8 xw8Var = (xw8) this.b;
        Uri uri = evkVar.a;
        try {
            String a = ol4.a(uri);
            String authority = uri.getAuthority();
            if (authority != null) {
                matcher = ol4.a.matcher(authority);
                if (!matcher.matches()) {
                }
                if (matcher != null && matcher.groupCount() == 3) {
                    group = matcher.group(1);
                    String str = "null".equals(group) ? null : group;
                    int i = -1;
                    queryParameter = uri.getQueryParameter("segment_num");
                    if (queryParameter == null) {
                        i = Integer.parseInt(queryParameter);
                    }
                    if (!drm0.D(a, ".ts", false)) {
                        return "ts/" + str + '/' + i;
                    }
                    if (drm0.D(a, "key.pub", false)) {
                        return "key/" + str;
                    }
                    if (!drm0.D(a, ".m3u8", false)) {
                        return xw8Var.k(evkVar);
                    }
                    return "manifest/" + str;
                }
                group = null;
                if ("null".equals(group)) {
                }
                int i2 = -1;
                queryParameter = uri.getQueryParameter("segment_num");
                if (queryParameter == null) {
                }
                if (!drm0.D(a, ".ts", false)) {
                }
            }
            matcher = null;
            if (matcher != null) {
                group = matcher.group(1);
                if ("null".equals(group)) {
                }
                int i22 = -1;
                queryParameter = uri.getQueryParameter("segment_num");
                if (queryParameter == null) {
                }
                if (!drm0.D(a, ".ts", false)) {
                }
            }
            group = null;
            if ("null".equals(group)) {
            }
            int i222 = -1;
            queryParameter = uri.getQueryParameter("segment_num");
            if (queryParameter == null) {
            }
            if (!drm0.D(a, ".ts", false)) {
            }
        } catch (Throwable th) {
            bn40.c(th, i6n0.a(uri, "Failed to build cache key from: "));
            return xw8Var.k(evkVar);
        }
    }

    @Override // xsna.p2q0
    public void l(View view, o2q0 o2q0Var) {
        if (view instanceof dql) {
            if (o2q0Var.b) {
                ad0.d((dql) view, o2q0Var);
            } else {
                dql dqlVar = (dql) view;
                Context context = dqlVar.getContext();
                boolean z = o2q0Var.h;
                String str = o2q0Var.d;
                String str2 = o2q0Var.c;
                boolean z2 = o2q0Var.g;
                if (!z) {
                    ad0.h(dqlVar, z2, o2q0Var.i, str, str2);
                } else if (o2q0Var.e == 0) {
                    if (o2q0Var.k) {
                        dqlVar.o(R.drawable.vk_icon_users_outline_56, R.attr.vk_ui_icon_secondary, context.getString(R.string.unavailable_tab_title_no_followers, str2), z2 ? context.getString(R.string.unavailable_tab_subtitle_no_followers_f) : context.getString(R.string.unavailable_tab_subtitle_no_followers_m));
                    } else if (o2q0Var.j) {
                        ad0.g(dqlVar, context.getString(R.string.unavailable_tab_title_no_followers, str2), z2, str);
                    } else {
                        dqlVar.o(R.drawable.vk_icon_users_outline_56, R.attr.vk_ui_icon_secondary, context.getString(R.string.unavailable_tab_title_no_followers, str2), z2 ? context.getString(R.string.unavailable_tab_subtitle_follow_suggestion_f) : context.getString(R.string.unavailable_tab_subtitle_follow_suggestion_m));
                    }
                }
            }
            ad0.f((dql) view, o2q0Var, (q7) this.b);
        }
    }

    @Override // xsna.omz0
    public void m(@NonNull ConnectionResult connectionResult) {
        eqz0 eqz0Var = (eqz0) this.b;
        eqz0Var.o.lock();
        try {
            eqz0Var.l = connectionResult;
            eqz0Var.k();
        } finally {
            eqz0Var.o.unlock();
        }
    }

    @Override // xsna.jph0
    public hfz n(int i, Object obj, boolean z) {
        School school = (School) obj;
        return new iph0(school.c, school.b, null, z, i);
    }

    @Override // xsna.jph0
    public hfz o(boolean z) {
        return new iph0(Integer.MIN_VALUE, ((Context) this.b).getString(R.string.search_params_any_institution_title), null, z, -1);
    }

    public io.reactivex.rxjava3.core.x p(boolean z) {
        return new io.reactivex.rxjava3.internal.operators.single.c(new io.reactivex.rxjava3.functions.n() { // from class: xsna.o22
            @Override // io.reactivex.rxjava3.functions.n
            public final Object get() {
                return ((pq40) ((Lazy) bqz0.this.b).getValue()).A();
            }
        }).l(new rt0(new p22(z), 1)).q(io.reactivex.rxjava3.schedulers.a.b());
    }

    public bqz0(int i) {
        switch (i) {
            case 14:
                this.b = new HashMap();
                break;
            default:
                this.b = new ac60();
                break;
        }
    }

    public bqz0(InputStream inputStream) {
        this.b = new dmb(inputStream, emb.b);
    }
}
