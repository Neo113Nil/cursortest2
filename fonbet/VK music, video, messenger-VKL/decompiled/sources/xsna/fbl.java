package xsna;

import android.content.Context;
import com.vk.auth.enterphone.choosecountry.Country;
import com.vk.auth.main.AuthModel;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import kotlin.LazyThreadSafetyMode;

/* compiled from: DefaultAuthModel.kt */
/* loaded from: classes.dex */
public abstract class fbl implements AuthModel {
    public final Context a;
    public final Object b;
    public final Object c;
    public final int d;
    public final int e;
    public final AuthModel.EmailAdsAcceptance f;

    public fbl(Context context) {
        this.a = context.getApplicationContext();
        k55 k55Var = new k55(3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, k55Var);
        this.c = msy.a(lazyThreadSafetyMode, new u94(4));
        this.d = 4;
        this.e = 6;
        this.f = AuthModel.EmailAdsAcceptance.UNKNOWN;
    }

    @Override // com.vk.auth.main.AuthModel
    public final Country a() {
        LinkedHashMap linkedHashMap = uyj.a;
        bpn0 bpn0Var = t65.a;
        String a = ply.a();
        Context context = this.a;
        return uyj.b(context, uyj.a(context, a));
    }

    @Override // com.vk.auth.main.AuthModel
    public final int b() {
        return this.d;
    }

    @Override // com.vk.auth.main.AuthModel
    public final String c(String str) {
        String a = i5s.a(new StringBuilder("https://m."), a0a.d, "/terms?api_view=1&cc=%s&lang=%s");
        bpn0 bpn0Var = t65.a;
        return String.format(a, Arrays.copyOf(new Object[]{str, ply.a()}, 2));
    }

    @Override // com.vk.auth.main.AuthModel
    public final AuthModel.EmailAdsAcceptance e() {
        return this.f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.auth.main.AuthModel
    public final Pattern g() {
        return (Pattern) this.b.getValue();
    }

    @Override // com.vk.auth.main.AuthModel
    public final io.reactivex.rxjava3.internal.operators.observable.b0 i() {
        return com.vk.registration.funnels.a.a(new io.reactivex.rxjava3.internal.operators.observable.s0(new ota(this, 1)).r0(io.reactivex.rxjava3.schedulers.a.a()).a0(io.reactivex.rxjava3.android.schedulers.a.b()));
    }

    @Override // com.vk.auth.main.AuthModel
    public final int j() {
        return this.e;
    }

    @Override // com.vk.auth.main.AuthModel
    public final pr0 k() {
        return new pr0(10);
    }

    @Override // com.vk.auth.main.AuthModel
    public final String l(String str) {
        String a = i5s.a(new StringBuilder("https://m."), a0a.d, "/privacy?api_view=1&cc=%s&lang=%s");
        bpn0 bpn0Var = t65.a;
        return String.format(a, Arrays.copyOf(new Object[]{str, ply.a()}, 2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.auth.main.AuthModel
    public final Pattern m() {
        return (Pattern) this.c.getValue();
    }
}
