package xsna;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.vk.camera.editor.stories.impl.base.BaseCameraEditorContract$ScreenState;
import com.vk.editor.analytics.StoryEditorEvents;
import com.vk.stories.design.view.editor.verticalization.VerticalizationBannerView;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.LazyThreadSafetyMode;
import xsna.ikv0;
import xsna.ppr0;

/* compiled from: VerticalizationDelegate.kt */
/* loaded from: classes16.dex */
public final class jpr0 implements w8i {
    public final y440 b;
    public final u76 c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final boolean g;
    public final fqr0 h;
    public iz8 i;
    public final HashMap<Integer, ppr0.b> j;
    public ppr0 k;
    public final ViewStub l;
    public VerticalizationBannerView m;
    public final kpr0 n;

    /* compiled from: VerticalizationDelegate.kt */
    public static final class a implements ppr0.a {
        public final /* synthetic */ zpr0 b;
        public final /* synthetic */ ViewGroup c;
        public final /* synthetic */ ppr0 d;

        public a(zpr0 zpr0Var, ViewGroup viewGroup, ppr0 ppr0Var) {
            this.b = zpr0Var;
            this.c = viewGroup;
            this.d = ppr0Var;
        }

        @Override // xsna.ppr0.a
        public final void a() {
            jpr0.this.c().i(StoryEditorEvents.CANCEL_VERTICALIZATION);
        }

        @Override // xsna.ppr0.a
        public final void b(Throwable th) {
            this.b.a(th);
            jpr0 jpr0Var = jpr0.this;
            y440 y440Var = jpr0Var.b;
            jpr0Var.f(y440Var.getRequireContext().getString(R.string.story_snackbar_verticalization_error_title_network), y440Var.getRequireContext().getString(R.string.story_snackbar_verticalization_error_button_retry), new orj0(jpr0Var, 16));
        }

        @Override // xsna.ppr0.a
        public final void c(List<String> list) {
            jpr0 jpr0Var = jpr0.this;
            ppr0.b bVar = jpr0Var.j.get(Integer.valueOf(jpr0Var.c.getCurrentIndex()));
            if (bVar != null) {
                bVar.f = list;
            }
        }

        @Override // xsna.ppr0.a
        public final void d(Bitmap bitmap, int i, boolean z) {
            jpr0 jpr0Var = jpr0.this;
            HashMap<Integer, ppr0.b> hashMap = jpr0Var.j;
            u76 u76Var = jpr0Var.c;
            ppr0.b bVar = hashMap.get(Integer.valueOf(u76Var.getCurrentIndex()));
            if (bVar != null) {
                bVar.e = z ? Integer.valueOf(i) : null;
            }
            ppr0.b bVar2 = hashMap.get(Integer.valueOf(u76Var.getCurrentIndex()));
            u76Var.C3(bitmap, bVar2 != null ? bVar2.c : null, z);
            jpr0Var.c().i(StoryEditorEvents.APPLY_VERTICALIZATION);
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.ppr0.a
        public final void e() {
            this.c.removeView(this.d);
            jpr0 jpr0Var = jpr0.this;
            ((xqj0) jpr0Var.e.getValue()).f(new ape0(jpr0Var, 22));
            jpr0Var.c.Q3(BaseCameraEditorContract$ScreenState.EDITOR_MAIN_SCREEN);
            jpr0Var.k = null;
        }

        @Override // xsna.ppr0.a
        public final void f(Throwable th) {
            this.b.a(th);
            jpr0 jpr0Var = jpr0.this;
            jpr0Var.f(jpr0Var.b.getRequireContext().getString(R.string.story_snackbar_verticalization_server_restriction), null, null);
        }

        @Override // xsna.ppr0.a
        public final void g(Throwable th) {
            this.b.a(th);
            jpr0 jpr0Var = jpr0.this;
            y440 y440Var = jpr0Var.b;
            jpr0Var.f(y440Var.getRequireContext().getString(R.string.story_snackbar_verticalization_error_title_common), y440Var.getRequireContext().getString(R.string.story_snackbar_verticalization_error_button_retry), new afl0(jpr0Var, 10));
        }
    }

    public jpr0(y440 y440Var, u76 u76Var) {
        this.b = y440Var;
        this.c = u76Var;
        stg0 stg0Var = new stg0(this, 19);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, stg0Var);
        this.e = msy.a(lazyThreadSafetyMode, new yei0(this, 13));
        this.f = msy.a(lazyThreadSafetyMode, new mwm0(this, 7));
        StoriesFeatures storiesFeatures = StoriesFeatures.VERTICALIZATION;
        storiesFeatures.getClass();
        this.g = com.vk.toggle.b.A.a(storiesFeatures);
        this.h = new fqr0();
        this.j = new HashMap<>();
        this.l = (ViewStub) y440Var.findViewById(R.id.fl_verticalization_banner_stub);
        this.n = new kpr0(this);
    }

    public static final void a(jpr0 jpr0Var) {
        tn9 tn9Var = new tn9(jpr0Var, 21);
        VerticalizationBannerView verticalizationBannerView = jpr0Var.m;
        if (verticalizationBannerView != null) {
            cp2.d(verticalizationBannerView, 0L, tn9Var, null, 27);
        }
        jpr0Var.m = null;
    }

    public final void b() {
        yaa0 yaa0Var;
        Uri uri;
        u76 u76Var = this.c;
        Integer valueOf = Integer.valueOf(u76Var.getCurrentIndex());
        HashMap<Integer, ppr0.b> hashMap = this.j;
        ppr0.b bVar = hashMap.get(valueOf);
        if (bVar == null) {
            iz8 iz8Var = this.i;
            tam0 O2 = u76Var.O2();
            String uri2 = (O2 == null || (yaa0Var = O2.a) == null || (uri = yaa0Var.a) == null) ? null : uri.toString();
            tam0 O22 = u76Var.O2();
            Bitmap bitmap = O22 != null ? O22.u : null;
            Bitmap d = d();
            if (iz8Var == null || uri2 == null || bitmap == null || d == null) {
                return;
            }
            ppr0.b bVar2 = new ppr0.b(iz8Var, uri2, bitmap, d);
            hashMap.put(Integer.valueOf(u76Var.getCurrentIndex()), bVar2);
            bVar = bVar2;
        }
        y440 y440Var = this.b;
        ppr0 ppr0Var = new ppr0(y440Var.getRequireContext());
        ppr0Var.setEditorInitialData(bVar);
        zpr0 zpr0Var = new zpr0(new jcf0(this, 15));
        ppr0Var.setAnalyticsTracker(zpr0Var);
        ppr0Var.setCallback(new a(zpr0Var, y440Var, ppr0Var));
        y440Var.addView(ppr0Var);
        this.k = ppr0Var;
        u76Var.Q3(BaseCameraEditorContract$ScreenState.VERTICALIZATION);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final y3p c() {
        return (y3p) this.d.getValue();
    }

    public final Bitmap d() {
        nov novVar;
        nov novVar2;
        y440 y440Var = this.b;
        CopyOnWriteArrayList<nov> copyOnWriteArrayList = y440Var.getStickersState().a;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 == copyOnWriteArrayList.size()) {
                novVar = null;
                break;
            }
            if (copyOnWriteArrayList.get(i2) instanceof si9) {
                novVar = copyOnWriteArrayList.get(i2);
                break;
            }
            i2++;
        }
        si9 si9Var = (si9) novVar;
        CopyOnWriteArrayList<nov> copyOnWriteArrayList2 = y440Var.getStickersState().a;
        while (true) {
            if (i == copyOnWriteArrayList2.size()) {
                novVar2 = null;
                break;
            }
            if (copyOnWriteArrayList2.get(i) instanceof yv5) {
                novVar2 = copyOnWriteArrayList2.get(i);
                break;
            }
            i++;
        }
        yv5 yv5Var = (yv5) novVar2;
        if (si9Var != null) {
            return si9Var.getSrcBmp();
        }
        if (yv5Var != null) {
            return yv5Var.j;
        }
        return null;
    }

    public final boolean e() {
        Bitmap d;
        u76 u76Var = this.c;
        if (this.j.get(Integer.valueOf(u76Var.getCurrentIndex())) != null) {
            return true;
        }
        if (!this.g || u76Var.B3()) {
            return false;
        }
        if (this.b.getStickers().size() > 1 || (d = d()) == null) {
            return false;
        }
        bpn0 bpn0Var = z5l0.a;
        return !z5l0.f(d.getWidth() / d.getHeight(), r0.getLayoutWidth() / r0.getLayoutHeight());
    }

    public final void f(String str, String str2, gzs<s3q0> gzsVar) {
        iz8 iz8Var = this.i;
        int b = cn70.b(8) + (iz8Var != null ? (int) iz8Var.d : 0);
        y440 y440Var = this.b;
        int i = b + (y440Var.getBottomControlPanel().d() ? u48.r : 0);
        ikv0.a aVar = new ikv0.a(y440Var.getRequireContext());
        aVar.u = new ikv0.d(new ikv0.d.c(str, null), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        if (str2 != null && gzsVar != null) {
            aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, str2, new fha0(1, gzsVar));
        }
        aVar.o = Integer.valueOf(i);
        aVar.b().c();
    }
}
