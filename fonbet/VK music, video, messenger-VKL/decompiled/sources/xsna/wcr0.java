package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.update.core.DownloadState;
import com.vk.update.internal.VKInAppUpdateOpenStrategy;
import java.util.concurrent.Callable;
import okhttp3.p;

/* compiled from: VKInAppUpdateEngine.kt */
/* loaded from: classes6.dex */
public final class wcr0 implements vrw {
    public final boolean a;
    public final String b;
    public final zcr0 c;
    public final Context d;
    public final ro e;
    public final VKInAppUpdateOpenStrategy f;

    /* compiled from: VKInAppUpdateEngine.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VKInAppUpdateOpenStrategy.values().length];
            try {
                iArr[VKInAppUpdateOpenStrategy.CUSTOM_TABS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VKInAppUpdateOpenStrategy.BROWSER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public wcr0(boolean z, String str, zcr0 zcr0Var, Context context, ro roVar, VKInAppUpdateOpenStrategy vKInAppUpdateOpenStrategy) {
        this.a = z;
        this.b = str;
        this.c = zcr0Var;
        this.d = context;
        this.e = roVar;
        this.f = vKInAppUpdateOpenStrategy;
    }

    @Override // xsna.vrw
    public final String a() {
        return "com.vk.android.update";
    }

    @Override // xsna.vrw
    public final io.reactivex.rxjava3.core.q<wrw> b(wrw wrwVar) {
        this.e.l("download internal update: " + wrwVar);
        Object obj = wrwVar.f;
        return (obj instanceof vni0 ? (vni0) obj : null) == null ? io.reactivex.rxjava3.core.q.H(new IllegalArgumentException("Null Server update info")) : io.reactivex.rxjava3.core.q.T(wrw.a(wrwVar, 0L, DownloadState.DOWNLOADED, null, 55));
    }

    @Override // xsna.vrw
    public final io.reactivex.rxjava3.core.x<wrw> c(int i) {
        final zcr0 zcr0Var = this.c;
        return new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.ycr0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                StringBuilder sb = new StringBuilder();
                zcr0 zcr0Var2 = zcr0.this;
                String a2 = i5s.a(sb, zcr0Var2.a, "/latest.yml");
                zcr0Var2.b.l("check internal update:" + a2);
                p.a aVar = new p.a();
                aVar.i(a2);
                aVar.c(okhttp3.c.n);
                aVar.d();
                okhttp3.p b = aVar.b();
                okhttp3.v vVar = ((f8f0) ((okhttp3.o) zcr0Var2.c.getValue()).a(b)).execute().h;
                if (vVar != null) {
                    return vVar;
                }
                throw new IllegalStateException("Response body for " + b.a + " is null!");
            }
        }).l(new oyr(new ym1(zcr0Var, 13), 27)).q(io.reactivex.rxjava3.schedulers.a.b()).l(new nit(new def(this, i, 3), 22));
    }

    @Override // xsna.vrw
    public final boolean d() {
        return true;
    }

    @Override // xsna.vrw
    public final boolean e() {
        return this.a;
    }

    @Override // xsna.vrw
    public final io.reactivex.rxjava3.core.a f(wrw wrwVar) {
        this.e.l("complete internal update: " + wrwVar);
        Object obj = wrwVar.f;
        vni0 vni0Var = obj instanceof vni0 ? (vni0) obj : null;
        return vni0Var == null ? io.reactivex.rxjava3.core.a.k(new IllegalArgumentException("Null Server update info")) : io.reactivex.rxjava3.core.a.l(new rca0(1, this, vni0Var));
    }

    public final void g(Uri uri) {
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri);
        Context context = this.d;
        ResolveInfo resolveInfo = (ResolveInfo) j5g.a0(context.getPackageManager().queryIntentActivities(intent, 0));
        if (resolveInfo != null) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent.setClassName(activityInfo.packageName, activityInfo.name);
        }
        intent.addFlags(268435456);
        context.startActivity(intent);
    }
}
