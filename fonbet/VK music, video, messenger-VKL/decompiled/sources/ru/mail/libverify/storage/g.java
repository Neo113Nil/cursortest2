package ru.mail.libverify.storage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import ru.mail.libverify.R;
import ru.mail.libverify.api.VerificationFactory;
import ru.mail.libverify.fetcher.FetcherService;
import ru.mail.libverify.g0.q;
import ru.mail.libverify.platform.core.PlatformCoreService;
import ru.mail.libverify.platform.storage.KeyValueStorage;
import ru.mail.libverify.u.v;
import ru.mail.libverify.u.w;
import ru.mail.libverify.utils.BatteryLevelReceiver;
import ru.mail.libverify.utils.ScreenStateReceiver;
import ru.mail.libverify.utils.network.NetworkCheckService;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.json.JsonParseException;
import xsna.bqy;
import xsna.cuz;

/* loaded from: classes9.dex */
public class g implements w {

    @NonNull
    private final bqy<q> a;

    @NonNull
    private final bqy<ru.mail.libverify.h0.a> b;

    @NonNull
    private final bqy<ru.mail.libverify.g0.a> c;

    @NonNull
    private final bqy<ru.mail.libverify.f0.c> d;

    @NonNull
    private final bqy<PhoneNumberUtil> e;

    @NonNull
    private final bqy<ru.mail.libverify.o.e> f;

    @NonNull
    private final ru.mail.libverify.c.g g;

    @NonNull
    private final bqy<KeyValueStorage> h;

    @NonNull
    private final Context i;

    @NonNull
    private final ru.mail.libverify.api.k j;
    private volatile String k;
    private volatile String l;
    private volatile String m;
    private volatile String n;
    private volatile String o;
    private volatile boolean p = false;
    private volatile boolean q = false;
    private volatile Boolean r;
    private volatile Boolean s;
    private volatile Locale t;
    private volatile i u;
    private volatile ru.mail.libverify.n.d v;
    private volatile k w;
    private volatile HashMap x;
    private volatile File y;

    public g(@NonNull Context context, @NonNull ru.mail.libverify.c.g gVar, @NonNull bqy<ru.mail.libverify.g0.a> bqyVar, @NonNull bqy<ru.mail.libverify.h0.a> bqyVar2, @NonNull bqy<q> bqyVar3, @NonNull bqy<KeyValueStorage> bqyVar4, @NonNull bqy<ru.mail.libverify.f0.c> bqyVar5, @NonNull bqy<PhoneNumberUtil> bqyVar6, @NonNull bqy<ru.mail.libverify.o.e> bqyVar7) {
        this.a = bqyVar3;
        this.g = gVar;
        this.b = bqyVar2;
        this.c = bqyVar;
        this.d = bqyVar5;
        this.e = bqyVar6;
        this.f = bqyVar7;
        this.i = context;
        this.h = bqyVar4;
        this.j = new ru.mail.libverify.api.k(context);
    }

    private k O() {
        if (this.w == null) {
            synchronized (this) {
                try {
                    if (this.w == null) {
                        this.w = new k(this.h.get(), this.i);
                    }
                } finally {
                }
            }
        }
        return this.w;
    }

    private i P() {
        if (this.u == null) {
            synchronized (this) {
                try {
                    if (this.u == null) {
                        this.u = new i(this.h.get());
                    }
                } finally {
                }
            }
        }
        return this.u;
    }

    @Override // ru.mail.libverify.u.w
    @NonNull
    public final String A() {
        return this.g.a();
    }

    @Override // ru.mail.libverify.u.w
    @Nullable
    public String B() {
        return P().a();
    }

    @Override // ru.mail.libverify.u.w
    @NonNull
    public final ru.mail.libverify.h0.a C() {
        return this.b.get();
    }

    @Override // ru.mail.libverify.u.w
    @NonNull
    public final q D() {
        return this.a.get();
    }

    @Override // ru.mail.libverify.u.w
    @Nullable
    public final String E() {
        return this.h.get().getValue("instance_api_proxy_domain");
    }

    @Override // ru.mail.libverify.u.w
    public final void F() {
        FileLog.v("InstanceData", "prepare internal members");
        ScreenStateReceiver.b(this.i);
        getId();
        t();
        r();
        B();
        O().b();
    }

    @Override // ru.mail.libverify.u.w
    @NonNull
    public final String G() {
        return this.g.b();
    }

    @Override // ru.mail.libverify.u.w
    @NonNull
    public final ru.mail.libverify.z.c H() {
        return ScreenStateReceiver.a(this.i);
    }

    @Override // ru.mail.libverify.u.w
    public final boolean I() {
        Integer integerValue;
        if (this.r == null && !this.q) {
            synchronized (this) {
                try {
                    if (this.r == null && (integerValue = this.h.get().getIntegerValue("instance_disable_sim_data_send", null)) != null) {
                        this.r = Boolean.valueOf(integerValue.intValue() > 0);
                    }
                    this.q = true;
                } finally {
                }
            }
        }
        if (this.r != null) {
            return this.r.booleanValue();
        }
        if (this.s == null) {
            this.s = Boolean.valueOf(this.i.getString(R.string.libverify_default_disable_sim_data_send));
        }
        return this.s.booleanValue();
    }

    @Override // ru.mail.libverify.u.w
    @Nullable
    public final String J() {
        if (O().a("instance_send_call_stats")) {
            return v.a(this, this.a.get(), this.f.get());
        }
        return null;
    }

    @Override // ru.mail.libverify.u.w
    @NonNull
    public final ru.mail.libverify.n.c K() {
        if (this.v == null) {
            synchronized (this) {
                try {
                    if (this.v == null) {
                        this.v = new ru.mail.libverify.n.d(this.i);
                    }
                } finally {
                }
            }
        }
        return this.v;
    }

    @Override // ru.mail.libverify.u.w
    public final void L() {
        synchronized (this) {
            this.k = null;
        }
        e.f(this.i);
        P().b();
    }

    @Override // ru.mail.libverify.u.w
    @NonNull
    public final String M() {
        return TimeZone.getDefault().getID();
    }

    @Override // ru.mail.libverify.u.w
    @NonNull
    public final void N() {
        String str = Build.VERSION.RELEASE;
    }

    @Override // ru.mail.libverify.u.w
    @NonNull
    public final String a(@NonNull String str, @NonNull String str2) throws DecryptionError {
        return P().a(str, str2);
    }

    @Override // ru.mail.libverify.u.w
    @NonNull
    public final ru.mail.libverify.f0.a b() {
        return this.d.get().b();
    }

    @Override // ru.mail.libverify.u.w
    @NonNull
    public final KeyValueStorage c() {
        return this.h.get();
    }

    @Override // ru.mail.libverify.u.w
    public final boolean d(@NonNull String str) {
        return O().a(str);
    }

    @Override // ru.mail.libverify.u.w
    public final int e() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    @Override // ru.mail.libverify.u.w
    public final boolean f() {
        boolean exists;
        Context context = this.i;
        synchronized (j.class) {
            exists = new File(ru.mail.libverify.n0.e.c(context), "SMS_TEMPLATES").exists();
        }
        return exists;
    }

    @Override // ru.mail.libverify.u.w
    @NonNull
    public final void g() {
        String str = Build.MODEL;
    }

    @Override // ru.mail.libverify.u.w
    @NonNull
    public final Context getContext() {
        return this.i;
    }

    @Override // ru.mail.libverify.u.w
    @NonNull
    public String getId() {
        return e.e(this.i);
    }

    @Override // ru.mail.libverify.u.w
    @NonNull
    public String h() {
        if (this.k == null) {
            synchronized (this) {
                try {
                    if (this.k == null) {
                        this.k = ru.mail.libverify.n0.e.f(getId());
                    }
                } finally {
                }
            }
        }
        return this.k;
    }

    @Override // ru.mail.libverify.u.w
    public final int i() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    @Override // ru.mail.libverify.u.w
    public final void j() {
        this.h.get().removeValue("instance_api_proxy_domain").commit();
    }

    @Override // ru.mail.libverify.u.w
    @NonNull
    public final String k() {
        if (this.l == null) {
            this.l = Integer.toString(ru.mail.libverify.n0.e.a(this.i));
        }
        return this.l;
    }

    @Override // ru.mail.libverify.u.w
    @Nullable
    public final String l() {
        PlatformCoreService platformService = VerificationFactory.getPlatformService(this.i);
        if (this.n == null) {
            synchronized (this) {
                try {
                    if (this.n == null) {
                        this.n = platformService.getIDv2ProviderService(this.i).get();
                    }
                } finally {
                }
            }
        }
        return this.n;
    }

    @Override // ru.mail.libverify.u.w
    @NonNull
    public final String m() {
        return Build.MANUFACTURER;
    }

    @Override // ru.mail.libverify.u.w
    public final boolean n() {
        return BatteryLevelReceiver.a();
    }

    @Override // ru.mail.libverify.u.w
    public final void o() {
        if (O().a("instance_broadcast_on_demand")) {
            c.a(this.i, FetcherService.class, 56);
        }
        ru.mail.libverify.fetcher.a.a(this.i);
    }

    @Override // ru.mail.libverify.u.w
    @NonNull
    public Map<String, String> p() {
        HashMap hashMap = this.x;
        if (hashMap != null) {
            return hashMap;
        }
        String value = this.h.get().getValue("instance_api_endpoints");
        if (this.x == null) {
            synchronized (this) {
                try {
                    if (this.x == null) {
                        if (TextUtils.isEmpty(value)) {
                            this.x = new HashMap();
                        } else {
                            this.x = ru.mail.libverify.q0.a.d(value, String.class);
                        }
                    }
                } catch (JsonParseException e) {
                    FileLog.e("InstanceData", "failed to restore api endpoints", e);
                    this.h.get().removeValue("instance_api_endpoints").commit();
                    this.x = new HashMap();
                } finally {
                }
            }
        }
        return this.x;
    }

    @Override // ru.mail.libverify.u.w
    @NonNull
    public final PhoneNumberUtil q() {
        return this.e.get();
    }

    @Override // ru.mail.libverify.u.w
    @Nullable
    public final String r() {
        if (this.o == null) {
            synchronized (this) {
                try {
                    if (this.o == null) {
                        this.o = ru.mail.libverify.n0.e.d(this.i);
                    }
                } finally {
                }
            }
        }
        return this.o;
    }

    @Override // ru.mail.libverify.u.w
    @NonNull
    public final File s() {
        if (this.y == null) {
            synchronized (this) {
                try {
                    if (this.y == null) {
                        File file = new File(this.i.getCacheDir().getAbsolutePath() + "/VERIFY_CACHE");
                        if (!file.exists() && !file.mkdirs()) {
                            FileLog.e("InstanceData", "Failed to create cache folder");
                        }
                        this.y = file;
                    }
                } finally {
                }
            }
        }
        return this.y;
    }

    @Override // ru.mail.libverify.u.w
    public final boolean setApiEndpoints(@NonNull Map<String, String> map) {
        try {
            HashMap hashMap = new HashMap();
            String[] split = "https://clientapi.mail.ru/".split(";");
            if (split.length == 0) {
                throw new IllegalArgumentException("At least one api host must be provided");
            }
            for (String str : split) {
                String host = Uri.parse(str).getHost();
                if (TextUtils.isEmpty(host)) {
                    throw new IllegalArgumentException("Host name must be non empty");
                }
                String str2 = map.get(host);
                if (!TextUtils.isEmpty(str2) && !TextUtils.equals(host, str2)) {
                    hashMap.put(host, str2);
                }
            }
            if (hashMap.isEmpty()) {
                FileLog.d("InstanceData", "reset api endpoints");
                this.x = new HashMap();
                this.h.get().removeValue("instance_api_endpoints").commit();
                return false;
            }
            FileLog.d("InstanceData", "set api endpoints %s", hashMap);
            this.x = hashMap;
            this.h.get().putValue("instance_api_endpoints", ru.mail.libverify.q0.a.f(hashMap)).commit();
            return true;
        } catch (Exception e) {
            FileLog.e("InstanceData", "failed to set api endpoints", e);
            return false;
        }
    }

    @Override // ru.mail.libverify.u.w
    public final void setCustomLocale(@NonNull Locale locale) {
        this.t = locale;
        this.h.get().putValue("instance_custom_locale", ru.mail.libverify.n0.e.a(locale)).commitSync();
    }

    @Override // ru.mail.libverify.u.w
    public final void setSimDataSendDisabled(boolean z) {
        this.r = Boolean.valueOf(z);
        this.h.get().putValue("instance_disable_sim_data_send", z ? 1 : 0).commitSync();
    }

    @Override // ru.mail.libverify.u.w
    @Nullable
    public final String t() {
        KeyValueStorage keyValueStorage = this.h.get();
        PlatformCoreService platformService = VerificationFactory.getPlatformService(this.i);
        if (this.m == null) {
            synchronized (this) {
                try {
                    if (this.m == null) {
                        this.m = platformService.obtainAdvertisingId(this.i, keyValueStorage);
                    }
                } finally {
                }
            }
        }
        return this.m;
    }

    @Override // ru.mail.libverify.u.w
    @NonNull
    public final ru.mail.libverify.i0.b u() {
        return new ru.mail.libverify.i0.b(this.h.get());
    }

    @Override // ru.mail.libverify.u.w
    public final boolean v() {
        return Boolean.parseBoolean(this.i.getString(R.string.libverify_support_feature_callui));
    }

    @Override // ru.mail.libverify.u.w
    @NonNull
    public final w w() {
        FileLog.v("InstanceData", "create new immutable config");
        return new d(this, this.i, this.g, this.c, this.b, this.a, this.h, this.d, this.e, this.f);
    }

    @Override // ru.mail.libverify.u.w
    public final void x() {
        NetworkCheckService.a(this.i);
    }

    @Override // ru.mail.libverify.u.w
    public final ru.mail.libverify.api.k y() {
        return this.j;
    }

    @Override // ru.mail.libverify.u.w
    @Nullable
    public final ru.mail.libverify.m.m z() {
        return j.a(this.i);
    }

    @Override // ru.mail.libverify.u.w
    public final void a(@NonNull Object obj, boolean z, int i) {
        ru.mail.verify.core.utils.e.a(this.i, obj, z);
        if (O().a("instance_broadcast_on_demand")) {
            c.a(this.i, obj, i);
        }
    }

    @Override // ru.mail.libverify.u.w
    public final boolean b(@Nullable String str) {
        return ru.mail.libverify.z.b.a(this.i, str);
    }

    @Override // ru.mail.libverify.u.w
    public final boolean c(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.h.get().putValue("instance_api_proxy_domain", str).commit();
        return true;
    }

    @Override // ru.mail.libverify.u.w
    @NonNull
    public Locale d() {
        if (this.t == null && !this.p) {
            synchronized (this) {
                try {
                    if (this.t == null) {
                        String value = this.h.get().getValue("instance_custom_locale");
                        if (!TextUtils.isEmpty(value)) {
                            this.t = ru.mail.libverify.n0.e.d(value);
                        }
                    }
                    this.p = true;
                } finally {
                }
            }
        }
        return this.t == null ? Locale.getDefault() : this.t;
    }

    @Override // ru.mail.libverify.u.w
    public final void a(@NonNull Object obj) {
        ru.mail.verify.core.utils.e.a(this.i, obj);
        if (O().a("instance_broadcast_on_demand")) {
            c.a(this.i, obj);
        }
    }

    @Override // ru.mail.libverify.u.w
    public final void a() {
        ru.mail.verify.core.utils.e.a(this.i);
    }

    @Override // ru.mail.libverify.u.w
    public final void a(boolean z) {
        if (O().a("instance_broadcast_on_demand") && z) {
            c.a(this.i, FetcherService.class);
        }
        ru.mail.libverify.fetcher.a.b(this.i);
    }

    @Override // ru.mail.libverify.u.w
    public final void a(@Nullable ru.mail.libverify.m.m mVar) {
        j.a(this.i, mVar);
    }

    @Override // ru.mail.libverify.u.w
    public final boolean a(@Nullable Map map) {
        Intent intent = new Intent(VerificationFactory.LIBVERIFY_GCM_TOKEN_BROADCAST_ACTION);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                intent.putExtra((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return cuz.a(this.i).c(intent);
    }

    @Override // ru.mail.libverify.u.w
    public final boolean a(@NonNull String str) {
        ru.mail.libverify.m.m a;
        if (TextUtils.isEmpty(str) || (a = j.a(this.i)) == null || a.d() == null) {
            return false;
        }
        return a.d().contains(str);
    }

    @Override // ru.mail.libverify.u.w
    public final void a(@NonNull String str, @Nullable Boolean bool) {
        O().a(str, bool);
    }
}
