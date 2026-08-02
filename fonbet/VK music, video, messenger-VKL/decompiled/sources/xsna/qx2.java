package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Build;
import android.os.Trace;
import com.vk.api.sdk.auth.a;
import com.vk.core.preference.Preference;
import com.vk.games.di.GamesCatalogComponentImpl;
import com.vk.im.engine.internal.sync.longpoll.LongPollStateComposingPolicy;
import com.vk.im.engine.lifecycle.di.ImEngineLifecycleComponent;
import com.vk.im.engine.models.LongPollType;
import com.vk.superapp.vkhealth.api.di.VkHealthComponent;
import com.vk.topics.api.di.TopicsComponent;
import com.vkontakte.android.task.di.components.NewsFeedBridgeComponentImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import xsna.fxv.a;
import xsna.hzg0;
import xsna.wqu0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class qx2 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qx2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                dc3 dc3Var = (dc3) obj;
                List<h7r0> w = dc3Var.w();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : w) {
                    if (!drm0.N(((h7r0) obj2).a)) {
                        arrayList.add(obj2);
                    }
                }
                List x = rdi.x(arrayList);
                if (x != null) {
                    return x;
                }
                String v = dc3Var.v();
                o25.a().getClass();
                return Collections.singletonList(new h7r0(o25.a().I(), o25.a().r(), o25.a().v(), dc3Var.c(), v, ""));
            case 1:
                hql hqlVar = (hql) obj;
                Locale locale = Locale.US;
                String str = hqlVar.a;
                String str2 = hqlVar.b;
                String str3 = hqlVar.c;
                String str4 = Build.VERSION.RELEASE;
                Integer valueOf = Integer.valueOf(Build.VERSION.SDK_INT);
                String str5 = Build.CPU_ABI;
                String str6 = Build.MANUFACTURER;
                String str7 = Build.MODEL;
                String property = System.getProperty("user.language");
                Point point = hqlVar.d;
                return xhr0.c(String.format(locale, "%s/%s-%s (Android %s; SDK %d; %s; %s %s; %s; %dx%d)", Arrays.copyOf(new Object[]{str, str2, str3, str4, valueOf, str5, str6, str7, property, Integer.valueOf(Math.max(point.x, point.y)), Integer.valueOf(Math.min(point.x, point.y))}, 11)));
            case 2:
                qcy<Object>[] qcyVarArr = GamesCatalogComponentImpl.s;
                ewy ewyVar = ((GamesCatalogComponentImpl) obj).e;
                qcy<Object> qcyVar = GamesCatalogComponentImpl.s[4];
                return new q73((ykg) ewyVar.c());
            case 3:
                fxv fxvVar = (fxv) obj;
                w2w w2wVar = fxvVar.a;
                boolean u = d370.u(w2wVar);
                int i2 = 3;
                HashSet hashSet = new HashSet(3);
                hashSet.add(LongPollType.MESSAGES);
                if (u) {
                    hashSet.add(LongPollType.CHANNELS);
                }
                f840 f840Var = new f840(w2wVar, hashSet, u ? LongPollStateComposingPolicy.MESSAGES_AND_CHANNELS : LongPollStateComposingPolicy.MESSAGES_ONLY, qv20.a(w2wVar.I0()), new nt8(new esp(w2wVar, new ehu(i2))), fxvVar.new a());
                fxvVar.e = io.reactivex.rxjava3.kotlin.c.f(3, new io.reactivex.rxjava3.internal.operators.observable.j2(f840Var.e()), null, null, new foh(fxvVar, 2));
                return f840Var;
            case 4:
                return ((ImEngineLifecycleComponent) ((axw) obj).c().a(fpf0.a(ImEngineLifecycleComponent.class))).N();
            case 5:
                return ((TopicsComponent) ((NewsFeedBridgeComponentImpl) obj).b.getValue()).n8();
            case 6:
                bhl0 bhl0Var = (bhl0) obj;
                Trace.beginSection(ndp0.f("lazy StorageManager.buttonsStorageManager"));
                try {
                    return new ms8(bhl0Var.B());
                } finally {
                    Trace.endSection();
                }
            case 7:
                return ((VkHealthComponent) ((k7m) m7m.f((ser0) obj)).a(fpf0.a(VkHealthComponent.class))).Ee();
            default:
                wqu0 wqu0Var = (wqu0) obj;
                Preference preference = Preference.a;
                Context context = wqu0Var.a;
                hzg0 hzg0Var = wqu0Var.b;
                preference.getClass();
                Preference.w(context);
                Preference.h = v790.a.a(context);
                qjp qjpVar = new qjp(context);
                if (!qjpVar.b.getBoolean("migrated_".concat("VkEncryptedStorage"), false)) {
                    SharedPreferences h = Preference.h(context, 0, "com.vkontakte.android_pref_name");
                    List<String> list = com.vk.api.sdk.auth.a.k;
                    SharedPreferences.Editor editor = null;
                    for (String str8 : a.C0375a.a()) {
                        String string = h.getString(str8, null);
                        if (string != null) {
                            if (editor == null) {
                                editor = hzg0Var.edit();
                            }
                            ((hzg0.b) editor).putString(str8, string);
                            h.edit().remove(str8).apply();
                        }
                    }
                    if (editor != null) {
                        ((hzg0.b) editor).apply();
                    }
                    List<String> list2 = com.vk.api.sdk.auth.a.k;
                    qjpVar.a("VkEncryptedStorage", new wqu0.a(a.C0375a.a()), hzg0Var);
                }
                return s3q0.a;
        }
    }
}
