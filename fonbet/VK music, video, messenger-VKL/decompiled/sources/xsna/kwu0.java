package xsna;

import android.content.DialogInterface;
import android.util.LruCache;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import java.util.UUID;

/* compiled from: VkFullScreenBannerManager.kt */
/* loaded from: classes16.dex */
public final class kwu0 implements nvs, DialogInterface.OnShowListener, DialogInterface.OnDismissListener {
    public static final /* synthetic */ int g = 0;
    public final boolean b;
    public io.reactivex.rxjava3.disposables.c c;
    public mzp0 d;
    public final zk3<String, a> e = new zk3<>();
    public final io.reactivex.rxjava3.subjects.d<Boolean> f = io.reactivex.rxjava3.subjects.d.O0(Boolean.FALSE);

    /* compiled from: VkFullScreenBannerManager.kt */
    public static final class a {
        public final UUID a;
        public final boolean b;

        public a(UUID uuid, boolean z) {
            this.a = uuid;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UiSessionMeta(uuid=");
            sb.append(this.a);
            sb.append(", processed=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    public kwu0(boolean z) {
        this.b = z;
    }

    @Override // xsna.nvs
    public final io.reactivex.rxjava3.core.q<Boolean> a() {
        return this.f;
    }

    @Override // xsna.nvs
    public final void b(AppCompatActivity appCompatActivity, String str) {
        mzp0 mzp0Var;
        UUID uuid;
        if (str.length() == 0) {
            return;
        }
        zk3<String, a> zk3Var = this.e;
        a aVar = zk3Var.get(str);
        if (aVar == null || !aVar.b) {
            cancel();
            boolean s = iah0.s(appCompatActivity);
            boolean z = !s;
            if (s || this.b) {
                a aVar2 = zk3Var.get(str);
                if (aVar2 == null || !aVar2.b) {
                    if (aVar2 != null && (uuid = aVar2.a) != null) {
                        LruCache<UUID, mzp0> lruCache = rzp0.a;
                        mzp0 e = rzp0.e(uuid);
                        if (e != null) {
                            e.f();
                        }
                    }
                    LruCache<UUID, mzp0> lruCache2 = rzp0.a;
                    mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.MUSIC_FULLSCREEN_BANNER, null, false, 62).j();
                    mzp0Var.init();
                } else {
                    mzp0Var = null;
                }
                if (mzp0Var != null) {
                    zk3Var.put(str, new a(mzp0Var.Y0(), false));
                }
                if (mzp0Var != null) {
                    mzp0Var.start();
                    mzp0Var.a();
                } else {
                    mzp0Var = null;
                }
                this.d = mzp0Var;
                this.c = rsg0.y0(new cp4(str), null, null, 3).subscribe(new gyq0(new jij(this, str, z, appCompatActivity), 2), new h8l0(new tbs0(4, this, str), 9));
            }
        }
    }

    public final void c(String str) {
        mzp0 mzp0Var = this.d;
        if (mzp0Var != null) {
            mzp0Var.c(false);
        }
        zk3<String, a> zk3Var = this.e;
        a aVar = zk3Var.get(str);
        zk3Var.put(str, aVar != null ? new a(aVar.a, true) : null);
    }

    @Override // xsna.nvs
    public final void cancel() {
        io.reactivex.rxjava3.disposables.c cVar = this.c;
        if (cVar != null) {
            cVar.dispose();
        }
        this.c = null;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        mzp0 mzp0Var = this.d;
        if (mzp0Var != null) {
            mzp0Var.g();
        }
        this.f.onNext(Boolean.FALSE);
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        mzp0 mzp0Var = this.d;
        if (mzp0Var != null) {
            mzp0Var.d(null);
            mzp0Var.h();
        }
        this.f.onNext(Boolean.TRUE);
    }
}
