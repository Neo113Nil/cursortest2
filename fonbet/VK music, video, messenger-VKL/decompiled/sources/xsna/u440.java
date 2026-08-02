package xsna;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.camera.editor.stories.impl.base.BaseCameraEditorContract$ScreenState;
import com.vk.camera.editor.stories.impl.multi.CameraPhotoDelegate;
import com.vk.core.preference.Preference;
import com.vk.dto.camera.CameraEditorContentType;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.stories.entities.OrdData;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vk.dto.stories.entities.StoryEditorMode;
import com.vk.dto.stories.entities.stat.BackgroundInfo;
import com.vk.dto.stories.entities.stat.StoryBackgroundType;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.editor.analytics.StoryEditorEvents;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import com.vk.story.api.di.StoriesComponent;
import com.vk.superapp.api.dto.story.WebServiceInfo;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.io.File;
import java.io.InputStream;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.text.Regex;
import xsna.el9;
import xsna.h7u0;
import xsna.hfr;
import xsna.mny;
import xsna.n930;
import xsna.nov;
import xsna.ppr0;
import xsna.q850;
import xsna.u850;

/* compiled from: MultiCameraEditorPresenter.kt */
/* loaded from: classes16.dex */
public final class u440 extends k86<g440> implements f440 {
    public static final /* synthetic */ int I0 = 0;
    public gzs<s3q0> A0;
    public tam0 B0;
    public ListDataSet C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public final LinkedHashMap G0;
    public final io.reactivex.rxjava3.core.w H0;
    public final bpn0 o0;
    public final Object p0;
    public final Object q0;
    public final e2m0 r0;
    public final CameraPhotoDelegate s0;
    public final bh9 t0;
    public final w850 u0;
    public final fh9 v0;
    public final io.reactivex.rxjava3.disposables.b w0;
    public final LinkedHashMap x0;
    public final LinkedHashMap y0;
    public final io.reactivex.rxjava3.subjects.f<s3q0> z0;

    /* compiled from: MultiCameraEditorPresenter.kt */
    public static final class a {
        public final tam0 a;
        public final h640 b;

        public a(tam0 tam0Var, h640 h640Var) {
            this.a = tam0Var;
            this.b = h640Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            h640 h640Var = this.b;
            return hashCode + (h640Var == null ? 0 : h640Var.hashCode());
        }

        public final String toString() {
            return "MultiStoryItemWrapper(story=" + this.a + ", item=" + this.b + ')';
        }
    }

    /* compiled from: MultiCameraEditorPresenter.kt */
    public final class b {
        public b() {
        }

        public final int a() {
            return ((g440) u440.this.s).getLayoutHeight();
        }

        public final int b() {
            return ((g440) u440.this.s).getLayoutWidth();
        }
    }

    public u440(CameraEditorContentType cameraEditorContentType, StoryCameraTarget storyCameraTarget, CommonUploadParams commonUploadParams, StoryUploadParams storyUploadParams, ArrayList arrayList, di9 di9Var, g440 g440Var) {
        super(cameraEditorContentType, storyCameraTarget, commonUploadParams, storyUploadParams, arrayList, di9Var, g440Var);
        this.o0 = new bpn0(new s6y(this, 9));
        gzv gzvVar = new gzv(this, 16);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.p0 = msy.a(lazyThreadSafetyMode, gzvVar);
        this.q0 = msy.a(lazyThreadSafetyMode, new x4u(this, 13));
        e2m0 e2m0Var = new e2m0(new b(), this.m, ((StoriesComponent) ((k7m) m7m.f(this)).a(fpf0.a(StoriesComponent.class))).j5());
        this.r0 = e2m0Var;
        CameraPhotoDelegate cameraPhotoDelegate = new CameraPhotoDelegate(new Cnew(g440Var, 9), cameraEditorContentType, this.m, new m130(g440Var, 5), new h440(this, 0));
        this.s0 = cameraPhotoDelegate;
        bh9 bh9Var = new bh9(cameraPhotoDelegate, e2m0Var, new i440(this, 0), new x3i(this, 26));
        this.t0 = bh9Var;
        this.u0 = new w850();
        this.v0 = new fh9(bh9Var, this);
        this.w0 = new io.reactivex.rxjava3.disposables.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.x0 = linkedHashMap;
        this.y0 = new LinkedHashMap();
        this.z0 = new io.reactivex.rxjava3.subjects.f<>();
        this.E0 = true;
        this.G0 = linkedHashMap;
        this.H0 = k86.n0;
    }

    @Override // xsna.u76
    public final int B0() {
        oit0 m;
        wds0 videoData;
        tam0 tam0Var = this.B0;
        if (tam0Var == null || !tam0Var.h.u() || (m = ((g440) this.s).getStickersState().m()) == null || (videoData = m.getVideoData()) == null) {
            return 0;
        }
        long j = videoData.d;
        return (int) (j != 0 ? j - videoData.c : videoData.b);
    }

    @Override // xsna.u76
    public final boolean B3() {
        return d8();
    }

    @Override // xsna.u76
    public final void C2(boolean z) {
        if (I7() || !this.y || this.A) {
            return;
        }
        this.o.r.b.g();
        this.A = true;
        this.B.a.m(null, 6, false, false);
        g440 g440Var = (g440) this.s;
        g440Var.m9(300L);
        g440Var.m();
        ArrayList arrayList = new ArrayList();
        for (tam0 tam0Var : this.v) {
            arrayList.add(null);
        }
        g440Var.getAnimationStickerManager().a(false);
        a(new io.reactivex.rxjava3.internal.operators.observable.o0(new io.reactivex.rxjava3.internal.operators.observable.q(new b630(this, 1)), new nb(new nh1(this, z, 1), 24)).r0(k86.n0).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new jz(new j440(this, arrayList, z), 28), new ir0(new uv20(this, 5), 27), new rcl(this, 2)));
    }

    @Override // xsna.u76
    public final void C3(Bitmap bitmap, Bitmap bitmap2, boolean z) {
        yaa0 yaa0Var;
        yaa0 yaa0Var2;
        tam0 tam0Var = this.B0;
        if (tam0Var != null && (yaa0Var2 = tam0Var.a) != null) {
            yaa0Var2.b = bitmap;
        }
        if (tam0Var != null && (yaa0Var = tam0Var.a) != null) {
            yaa0Var.c = z;
        }
        if (tam0Var != null) {
            if (z) {
                bitmap2 = null;
            }
            tam0Var.t = bitmap2;
        }
        K7();
        T7();
        j8();
        gyl0 gyl0Var = this.p;
        if (gyl0Var != null) {
            gyl0Var.B5();
        }
    }

    @Override // xsna.u76
    public final void C5(w1m0 w1m0Var, boolean z) {
        if (z) {
            BackgroundInfo backgroundInfo = w1m0Var.c;
            Bitmap bitmap = w1m0Var.b;
            if (bitmap != null) {
                Q7(bitmap, null, backgroundInfo);
            }
            if (backgroundInfo != null) {
                Integer num = backgroundInfo.d;
                StoryBackgroundType storyBackgroundType = backgroundInfo.c;
                gyl0 gyl0Var = this.p;
                if (gyl0Var != null && num != null && storyBackgroundType != null) {
                    int intValue = num.intValue();
                    fw5 fw5Var = new fw5();
                    fw5Var.a = intValue;
                    fw5Var.b = storyBackgroundType;
                    gyl0Var.Z5(fw5Var);
                }
            }
        }
        gzs ss3Var = new ss3(14, this, w1m0Var);
        if (this.F0) {
            ss3Var.invoke();
            return;
        }
        gzs<s3q0> gzsVar = this.A0;
        if (gzsVar != null) {
            ss3Var = new km1(14, gzsVar, ss3Var);
        }
        this.A0 = ss3Var;
    }

    @Override // xsna.u76
    public final n930.e D2() {
        CommonUploadParams commonUploadParams = this.k;
        Boolean bool = (Boolean) this.x0.getOrDefault(fkq0.e(commonUploadParams.e), null);
        if (!epx.f(commonUploadParams.e, UserId.d)) {
            if (epx.f(bool, Boolean.TRUE)) {
                return n930.g.c;
            }
            if (epx.f(bool, Boolean.FALSE)) {
                return n930.f.c;
            }
        }
        return null;
    }

    @Override // xsna.u76
    public final void E2() {
        mat0 d;
        this.n.a(!r0.b);
        tam0 tam0Var = this.B0;
        if (tam0Var == null || (d = tam0Var.d()) == null) {
            return;
        }
        D7().i(d.e ? StoryEditorEvents.SOUND_OFF : StoryEditorEvents.SOUND_ON);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.u76
    public final void F2() {
        if (this.G) {
            D7().i(StoryEditorEvents.CHANGE_PHOTO);
            Activity h = e3m.h(((g440) this.s).getRequireContext());
            if (h == null) {
                return;
            }
            ((mrj0) this.q0.getValue()).a(h, 301, new nl30(this, 1));
        }
    }

    @Override // xsna.f440
    public final void F6(int i) {
        S7((tam0) this.v.get(i), false);
    }

    @Override // xsna.u76
    public final int G2() {
        return this.v.size();
    }

    @Override // xsna.u76
    public final boolean I3() {
        return epx.f(p5(), Boolean.TRUE);
    }

    @Override // xsna.k86
    public final boolean I7() {
        ArrayList arrayList = this.v;
        if (arrayList.size() == 1 && ((tam0) arrayList.get(0)).f()) {
            yaa0 yaa0Var = ((tam0) arrayList.get(0)).a;
            if ((yaa0Var != null ? yaa0Var.a : null) == null) {
                yaa0 yaa0Var2 = ((tam0) arrayList.get(0)).a;
                if ((yaa0Var2 != null ? yaa0Var2.b : null) == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // xsna.f440
    public final void J6(int i, int i2) {
        Collections.swap(this.v, i, i2);
        HashMap<Integer, OrdData> hashMap = this.o.q.b;
        OrdData ordData = hashMap.get(Integer.valueOf(i));
        OrdData zb = ordData != null ? OrdData.zb(ordData) : null;
        OrdData ordData2 = hashMap.get(Integer.valueOf(i2));
        hashMap.put(Integer.valueOf(i), ordData2 != null ? OrdData.zb(ordData2) : null);
        hashMap.put(Integer.valueOf(i2), zb);
        HashMap<Integer, ppr0.b> hashMap2 = ((g440) this.s).getVerticalizationDelegate().j;
        ppr0.b bVar = hashMap2.get(Integer.valueOf(i));
        hashMap2.put(Integer.valueOf(i), hashMap2.get(Integer.valueOf(i2)));
        hashMap2.put(Integer.valueOf(i2), bVar);
    }

    @Override // xsna.u76
    public final void K() {
        ((g440) this.s).K();
    }

    @Override // xsna.u76
    public final void K2(final int i) {
        this.Q = k86.v7(i);
        StoriesFeatures storiesFeatures = StoriesFeatures.ST_STORY_LIFETIME_SAVE;
        storiesFeatures.getClass();
        if (com.vk.toggle.b.A.a(storiesFeatures)) {
            this.b.b(io.reactivex.rxjava3.core.a.l(new io.reactivex.rxjava3.functions.a() { // from class: xsna.j5m0
                @Override // io.reactivex.rxjava3.functions.a
                public final void run() {
                    Preference.F(i, "story_lifetime", "selected_lifetime_hours");
                }
            }).q(asu0.a.c()).subscribe(new k440(), new s520(new f1s(11), 2)));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.u76
    public final void L2() {
        Activity h = e3m.h(((g440) this.s).getRequireContext());
        if (h == null) {
            return;
        }
        ((mrj0) this.q0.getValue()).a(h, 300, new cws(this, 23));
        D7().o(this.k, H2());
    }

    @Override // xsna.u76
    public final boolean N6() {
        OrdData ordData = this.o.q.b.get(Integer.valueOf(getCurrentIndex()));
        return ordData != null && ordData.b;
    }

    @Override // xsna.u76
    public final tam0 O2() {
        return this.B0;
    }

    public final void R7(nov novVar, yzs<? super Integer, ? super Integer, ? super nov, s3q0> yzsVar) {
        ((g440) this.s).sc(novVar, yzsVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0268, code lost:
    
        if (((xsna.el9.b) r3).a.Sb() == false) goto L142;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x028d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S7(tam0 tam0Var, boolean z) {
        nov novVar;
        gyl0 gyl0Var;
        mat0 d;
        WebStoryBox webStoryBox;
        boolean z2;
        gyl0 gyl0Var2;
        Bitmap bitmap;
        tam0 tam0Var2;
        gyl0 gyl0Var3;
        tam0 tam0Var3;
        zcl0 zcl0Var;
        qx5 e;
        zcl0 zcl0Var2;
        nov novVar2;
        tam0 tam0Var4 = this.B0;
        if (tam0Var4 != null) {
            zcl0 zcl0Var3 = tam0Var4.h;
            if (zcl0Var3.r()) {
                this.B.a();
            }
            qx5 e2 = zcl0Var3.e();
            if (e2 != null) {
                e2.w();
            }
            CopyOnWriteArrayList<nov> copyOnWriteArrayList = zcl0Var3.a;
            int i = 0;
            while (true) {
                if (i == copyOnWriteArrayList.size()) {
                    novVar2 = null;
                    break;
                } else {
                    if (copyOnWriteArrayList.get(i) instanceof lo9) {
                        novVar2 = copyOnWriteArrayList.get(i);
                        break;
                    }
                    i++;
                }
            }
            lo9 lo9Var = (lo9) novVar2;
            if (lo9Var != null) {
                lo9Var.w();
            }
        }
        io.reactivex.rxjava3.disposables.b bVar = this.w0;
        bVar.e();
        gyl0 gyl0Var4 = this.p;
        if (gyl0Var4 != null) {
            gyl0Var4.S4(tam0Var);
        }
        this.B0 = tam0Var;
        p86 p86Var = this.o;
        r7m0 r7m0Var = p86Var.q;
        dl9 dl9Var = p86Var.a;
        r7m0Var.c = getCurrentIndex();
        ListDataSet listDataSet = this.C0;
        if (listDataSet != null) {
            listDataSet.u(new l440(getCurrentIndex(), this));
        }
        V v = this.s;
        if (z) {
            g440 g440Var = (g440) v;
            CopyOnWriteArrayList<nov> copyOnWriteArrayList2 = g440Var.getStickersState().a;
            if (!copyOnWriteArrayList2.isEmpty()) {
                Iterator<nov> it = copyOnWriteArrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (it.next() instanceof pjm0) {
                        tam0 tam0Var5 = this.B0;
                        if (tam0Var5 != null && (zcl0Var2 = tam0Var5.h) != null) {
                            zcl0Var2.b(g440Var.getStickersState().a);
                        }
                    }
                }
            }
        }
        tam0 tam0Var6 = this.B0;
        if (tam0Var6 != null) {
            zcl0 zcl0Var4 = tam0Var6.h;
            g440 g440Var2 = (g440) v;
            g440Var2.setStickersState(zcl0Var4);
            Iterator<nov> it2 = zcl0Var4.a.iterator();
            while (it2.hasNext()) {
                M(it2.next());
            }
            g440Var2.p9(tam0Var6, new c230(tam0Var6, 3));
            p86Var.a(tam0Var6);
        }
        boolean z3 = tam0Var.g;
        String str = tam0Var.r;
        zcl0 zcl0Var5 = tam0Var.h;
        if (z3) {
            e8();
        }
        g8();
        tam0 tam0Var7 = this.B0;
        if (tam0Var7 != null && tam0Var7.c() && (tam0Var3 = this.B0) != null && (zcl0Var = tam0Var3.h) != null && (e = zcl0Var.e()) != null) {
            e.u();
            gyl0 gyl0Var5 = this.p;
            if (gyl0Var5 != null) {
                gyl0Var5.G0(e.getVideoRawData());
            }
        }
        if (tam0Var.f()) {
            T7();
        } else {
            boolean g = tam0Var.g();
            di9 di9Var = this.j;
            if (g && str == null) {
                if ((H7() || ((webStoryBox = di9Var.x().e) != null && webStoryBox.Db())) && !di9Var.x().k.f && (gyl0Var = this.p) != null) {
                    gyl0Var.r2(tam0Var.b);
                }
                if (!tam0Var.c()) {
                    tam0 tam0Var8 = this.B0;
                    this.E0 = true;
                    if (tam0Var8 != null && (d = tam0Var8.d()) != null) {
                        if (!tam0Var8.h.t()) {
                            f8(tam0Var8);
                        } else if (dl9Var != null) {
                            dl9Var.b();
                        }
                        new qo2(5, this, tam0Var8).run();
                        this.n.a(d.e);
                    }
                }
            } else if (str != null) {
                x7();
            } else {
                if (zcl0Var5.t() && dl9Var != null) {
                    dl9Var.b();
                }
                Uri uri = tam0Var.p;
                if (uri != null) {
                    lh9 lh9Var = p86Var.i;
                    lh9Var.b(uri.toString(), new kh9(1, lh9Var, lh9.class, "setBlurredBackground", "setBlurredBackground(Landroid/graphics/Bitmap;Z)V", 0));
                } else {
                    gyl0 gyl0Var6 = this.p;
                    if (gyl0Var6 != null) {
                        gyl0Var6.o1();
                    }
                    CopyOnWriteArrayList<nov> copyOnWriteArrayList3 = zcl0Var5.a;
                    int i2 = 0;
                    while (true) {
                        if (i2 == copyOnWriteArrayList3.size()) {
                            novVar = null;
                            break;
                        } else {
                            if (copyOnWriteArrayList3.get(i2) instanceof yv5) {
                                novVar = copyOnWriteArrayList3.get(i2);
                                break;
                            }
                            i2++;
                        }
                    }
                    WebStoryBox webStoryBox2 = di9Var.x().e;
                    if (webStoryBox2 != null && webStoryBox2.Db() && novVar != null) {
                        yaa0 yaa0Var = new yaa0(null);
                        yv5 yv5Var = novVar instanceof yv5 ? (yv5) novVar : null;
                        yaa0Var.b = yv5Var != null ? yv5Var.j : null;
                        this.B0 = new tam0(yaa0Var, tam0Var.b, tam0Var.c, tam0Var.d, tam0Var.e, tam0Var.f, tam0Var.g, tam0Var.h, tam0Var.i, tam0Var.j, tam0Var.k, tam0Var.l, tam0Var.m, tam0Var.n, tam0Var.o, tam0Var.p, tam0Var.q, null, null, 393216);
                        T7();
                    }
                }
            }
        }
        w7();
        if (!tam0Var.g() || tam0Var.c()) {
            if (dl9Var != null) {
                el9 el9Var = dl9Var.a;
                if (!(el9Var instanceof el9.a)) {
                    if (!(el9Var instanceof el9.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            z2 = true;
            gyl0Var2 = this.p;
            if (gyl0Var2 != null) {
                gyl0Var2.T3(z2);
            }
            bitmap = tam0Var.u;
            if (bitmap != null && (gyl0Var3 = this.p) != null) {
                gyl0Var3.K3(bitmap, false);
            }
            this.H = null;
            tam0Var2 = this.B0;
            if (tam0Var2 != null) {
                ((g440) v).getSideControlPanel().setBackgroundButton(tam0Var2);
            }
            J7(true);
            io.reactivex.rxjava3.internal.operators.observable.s y = this.z0.y(1L, TimeUnit.SECONDS);
            asu0 asu0Var = asu0.a;
            bVar.b(y.r0(asu0Var.d()).a0(asu0Var.d()).subscribe(new tl30(new mgz(this, 8), 1)));
        }
        z2 = false;
        gyl0Var2 = this.p;
        if (gyl0Var2 != null) {
        }
        bitmap = tam0Var.u;
        if (bitmap != null) {
            gyl0Var3.K3(bitmap, false);
        }
        this.H = null;
        tam0Var2 = this.B0;
        if (tam0Var2 != null) {
        }
        J7(true);
        io.reactivex.rxjava3.internal.operators.observable.s y2 = this.z0.y(1L, TimeUnit.SECONDS);
        asu0 asu0Var2 = asu0.a;
        bVar.b(y2.r0(asu0Var2.d()).a0(asu0Var2.d()).subscribe(new tl30(new mgz(this, 8), 1)));
    }

    @Override // xsna.u76
    public final void T4(izs<? super StoryPrivacyType, s3q0> izsVar) {
        D7().i(StoryEditorEvents.CLICK_ON_PRIVACY);
        m9m0 m9m0Var = this.o.r;
        q3p q3pVar = this.u;
        g9m0 g9m0Var = m9m0Var.b;
        if (q3pVar != null) {
            q3pVar.g(g9m0Var.o(), g9m0Var.c(), g9m0Var.j(), new vn7(1, m9m0Var, izsVar));
        }
        m9m0Var.b.g();
    }

    public final void T7() {
        yaa0 yaa0Var;
        yaa0 yaa0Var2;
        tam0 tam0Var = this.B0;
        if (((tam0Var == null || (yaa0Var2 = tam0Var.a) == null) ? null : yaa0Var2.a) == null) {
            if (((tam0Var == null || (yaa0Var = tam0Var.a) == null) ? null : yaa0Var.b) == null) {
                L.e("It's ok - this is photo from camera. Should wait image in setImageBitmap method");
                return;
            }
        }
        yaa0 yaa0Var3 = tam0Var.a;
        if ((yaa0Var3 != null ? yaa0Var3.b : null) != null) {
            U7(tam0Var);
        } else {
            this.s0.getClass();
            this.w0.b(CameraPhotoDelegate.c(tam0Var).r0(k86.n0).a0(asu0.a.d()).subscribe(new pdw(new u9(23, this, tam0Var), 5), new k2y(new w910(this, 3), 5)));
        }
    }

    @Override // xsna.f440
    public final void U5() {
        gyl0 gyl0Var = this.p;
        if (gyl0Var != null) {
            gyl0Var.T6(b8((tam0) this.v.get(0)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U7(tam0 tam0Var) {
        nov novVar;
        zcl0 zcl0Var = tam0Var.h;
        if (zcl0Var.t()) {
            dl9 dl9Var = this.o.a;
            if (dl9Var != null) {
                dl9Var.b();
            }
        } else {
            f8(tam0Var);
        }
        int i = 0;
        yv5 yv5Var = null;
        if (zcl0Var.f() != null) {
            CopyOnWriteArrayList<nov> copyOnWriteArrayList = zcl0Var.a;
            while (true) {
                if (i == copyOnWriteArrayList.size()) {
                    novVar = null;
                    break;
                } else {
                    if (copyOnWriteArrayList.get(i) instanceof si9) {
                        novVar = copyOnWriteArrayList.get(i);
                        break;
                    }
                    i++;
                }
            }
            si9 si9Var = novVar instanceof si9 ? (si9) novVar : null;
            if (si9Var != null) {
                si9Var.setFilteredBitmap(si9Var.getEnhancedBmp());
                return;
            }
            return;
        }
        yaa0 yaa0Var = tam0Var.a;
        Bitmap bitmap = yaa0Var != null ? yaa0Var.b : null;
        boolean z = tam0Var.f;
        tam0 tam0Var2 = this.B0;
        Object[] objArr = tam0Var2 != null && tam0Var2.c;
        Object[] objArr2 = (tam0Var2 == null || tam0Var2.c || !tam0Var2.f()) ? false : true;
        WebStoryBox webStoryBox = this.j.x().e;
        if (webStoryBox == null || !webStoryBox.Db() || objArr == true || objArr2 == true) {
            si9 V7 = V7(bitmap, z);
            if (V7 != null) {
                v2(V7);
                return;
            }
            return;
        }
        L7();
        if (bitmap != null) {
            yv5Var = new yv5(bitmap);
            z2l0 z2l0Var = yv5Var.c;
            z2l0Var.o = z;
            bpn0 bpn0Var = z5l0.a;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            g440 g440Var = (g440) this.s;
            nov.a.h(z5l0.d(width, height, g440Var.getLayoutWidth(), g440Var.getLayoutHeight()), yv5Var);
            z2l0Var.m = z2l0Var.l;
            z2l0Var.q = false;
        }
        if (yv5Var != null) {
            v2(yv5Var);
        }
    }

    public final si9 V7(Bitmap bitmap, boolean z) {
        if (bitmap == null) {
            return null;
        }
        g440 g440Var = (g440) this.s;
        si9 si9Var = new si9(g440Var.getRequireContext(), bitmap, null);
        si9Var.setStatic(z);
        bpn0 bpn0Var = z5l0.a;
        si9Var.setStickerScale(z5l0.d(bitmap.getWidth(), bitmap.getHeight(), g440Var.getLayoutWidth(), g440Var.getLayoutHeight()));
        si9Var.setOriginalStickerScale(si9Var.getStickerScale());
        return si9Var;
    }

    public final lo9 W7(tam0 tam0Var, boolean z) {
        mat0 mat0Var = tam0Var.b.get(0);
        g440 g440Var = (g440) this.s;
        Context requireContext = g440Var.getRequireContext();
        mat0 d = tam0Var.d();
        Bitmap bitmap = d != null ? d.h : null;
        StoriesFeatures storiesFeatures = StoriesFeatures.ST_ANIM_OPTIMIZATION;
        storiesFeatures.getClass();
        lo9 lo9Var = new lo9(requireContext, mat0Var, this, this.k0, this.m0, com.vk.toggle.b.A.a(storiesFeatures) ? bitmap : null, this.l0, z, 256);
        lo9Var.z();
        if (mat0Var.b() * mat0Var.c() != 0) {
            bpn0 bpn0Var = z5l0.a;
            lo9Var.setStickerScale(z5l0.d(mat0Var.c(), mat0Var.b(), g440Var.getLayoutWidth(), g440Var.getLayoutHeight()));
            lo9Var.setOriginalStickerScale(lo9Var.getStickerScale());
        }
        lo9Var.setStatic(tam0Var.f);
        return lo9Var;
    }

    public final void X7() {
        if (this.y) {
            this.B.a.m(null, 6, false, false);
            ((g440) this.s).getAnimationStickerManager().a(false);
            tam0 tam0Var = this.B0;
            if (tam0Var != null) {
                this.b.b(itg0.l(io.reactivex.rxjava3.core.a.l(new osn(2, this, tam0Var)).q(k86.n0).o(asu0.a.d()).i(new n240(new ioh(1, this, u440.class, "handleError", "handleError(Ljava/lang/Throwable;Z)V", 0, 1), 1)).j(new lg4(this, 4))));
            }
            D7().i(StoryEditorEvents.SAVE_STORY);
        }
    }

    @Override // xsna.u76
    public final n930.i Y6() {
        return this.Q;
    }

    public final void Y7(List<tam0> list, izs<? super List<tam0>, s3q0> izsVar) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(null);
        }
        final int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            final tam0 tam0Var = (tam0) obj;
            izs<? super List<tam0>, s3q0> izsVar2 = izsVar;
            a(new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.n440
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    u440 u440Var = u440.this;
                    tam0 tam0Var2 = tam0Var;
                    return new h640(u440Var.b8(tam0Var2), u440Var.C0 == null && i2 == 0, tam0Var2.g());
                }
            }).r0(k86.n0).a0(io.reactivex.rxjava3.android.schedulers.a.b()), new cx00(new o440(this, 0), 2), io.reactivex.rxjava3.internal.functions.a.c).subscribe(new q440(new p440(arrayList, i2, tam0Var, this, list.size(), izsVar2), 0), new oo20(new pb00(this, 7), 2)));
            izsVar = izsVar2;
            i2 = i3;
        }
    }

    @Override // xsna.u76
    public final void Z2(List<? extends nov> list) {
        nov novVar;
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        for (int i = 1; i < size; i++) {
            tam0 tam0Var = (tam0) arrayList.get(i);
            Iterator<nov> it = tam0Var.h.a.iterator();
            while (true) {
                if (it.hasNext()) {
                    novVar = it.next();
                    if (novVar instanceof pjm0) {
                        break;
                    }
                } else {
                    novVar = null;
                    break;
                }
            }
            if (((pjm0) (novVar instanceof pjm0 ? novVar : null)) == null) {
                zcl0 zcl0Var = tam0Var.h;
                List<? extends nov> list2 = list;
                ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((nov) it2.next()).C0());
                }
                zcl0Var.b(arrayList2);
            }
        }
    }

    @Override // xsna.fyl0
    public final void a6(Bitmap bitmap) {
        gyl0 gyl0Var;
        lh9 lh9Var = this.o.i;
        vf6 vf6Var = lh9Var.c;
        tam0 tam0Var = lh9Var.b.B0;
        mny.a aVar = mny.a;
        Bitmap e = vf6Var.e(tam0Var, bitmap, null);
        if (e == null || (gyl0Var = this.p) == null) {
            return;
        }
        gyl0Var.K3(e, true);
    }

    public final void a8(final int i) {
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.r440
            @Override // java.util.concurrent.Callable
            public final Object call() {
                yaa0 yaa0Var;
                Object obj;
                nov V7;
                u440 u440Var = this;
                ArrayList arrayList = u440Var.v;
                int size = arrayList.size();
                for (int i2 = i; i2 < size; i2++) {
                    tam0 tam0Var = (tam0) arrayList.get(i2);
                    if (tam0Var.f() && (yaa0Var = tam0Var.a) != null && yaa0Var.b == null) {
                        u440Var.s0.getClass();
                        try {
                            obj = CameraPhotoDelegate.c(tam0Var).a();
                        } catch (Throwable unused) {
                            obj = null;
                        }
                        Bitmap bitmap = (Bitmap) obj;
                        yaa0Var.b = bitmap;
                        V7 = u440Var.V7(bitmap, tam0Var.f);
                    } else {
                        V7 = null;
                    }
                    if (V7 == null) {
                        V7 = (!tam0Var.g() || tam0Var.d() == null) ? null : u440Var.W7(tam0Var, false);
                    }
                    if (V7 != null) {
                        vf6 vf6Var = u440Var.m;
                        mny.a aVar = mny.a;
                        tam0Var.t = vf6Var.f(tam0Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
                        g440 g440Var = (g440) u440Var.s;
                        float layoutWidth = g440Var.getLayoutWidth();
                        float layoutHeight = g440Var.getLayoutHeight();
                        V7.w0(layoutWidth, layoutHeight);
                        V7.e((layoutWidth / 2.0f) - (V7.getOriginalWidth() / 2.0f), (layoutHeight / 2.0f) - (V7.getOriginalHeight() / 2.0f));
                        tam0Var.h.a(V7);
                    }
                }
                return s3q0.a;
            }
        }).r0(k86.n0).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        int i2 = kwg0.a;
        a(a0.subscribe(new iwg0(), new iwg0()));
    }

    @Override // xsna.u76
    public final void b0() {
        dispose();
        ((g440) this.s).getMusicDelegate();
        this.w0.dispose();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r6v0, types: [V extends xsna.v76, xsna.v76] */
    /* JADX WARN: Type inference failed for: r7v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v12, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v14, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r7v16, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v9, types: [android.view.View] */
    @Override // xsna.u76
    public final void b3(n930 n930Var) {
        boolean z;
        boolean z2 = n930Var instanceof n930.b;
        hi9 hi9Var = this.C;
        ?? r4 = 0;
        ?? r6 = this.s;
        if (z2) {
            BaseCameraEditorContract$ScreenState baseCameraEditorContract$ScreenState = BaseCameraEditorContract$ScreenState.EDITOR_MAIN_SCREEN;
            BaseCameraEditorContract$ScreenState baseCameraEditorContract$ScreenState2 = BaseCameraEditorContract$ScreenState.DRAWING;
            while (true) {
                AtomicReference<BaseCameraEditorContract$ScreenState> atomicReference = this.E;
                if (atomicReference.compareAndSet(baseCameraEditorContract$ScreenState, baseCameraEditorContract$ScreenState2)) {
                    b96 b96Var = this.F;
                    if (b96Var != null) {
                        y440 y440Var = b96Var.a;
                        y440Var.getDrawToolControlsDelegate().b();
                        y440Var.getBottomPanel().setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        y440Var.getBottomPanel().setVisibility(r4);
                        ?? trashPreviewBtn = y440Var.getTrashPreviewBtn();
                        if (trashPreviewBtn != null) {
                            trashPreviewBtn.setVisibility(r4);
                        }
                        y440Var.getCloseButtonBackground().setAlpha(1.0f);
                        y440Var.getCloseButtonBackground().setVisibility(r4);
                        y440Var.getTopButtonsPanel().setAlpha(1.0f);
                        y440Var.getTopButtonsPanel().setVisibility(r4);
                        y440Var.getEndButtonsPanel().setAlpha(1.0f);
                        y440Var.getEndButtonsPanel().setVisibility(r4);
                        DecelerateInterpolator decelerateInterpolator = qq2.b;
                        AnimatorSet animatorSet = new AnimatorSet();
                        View bottomPanel = y440Var.getBottomPanel();
                        Property property = View.TRANSLATION_Y;
                        float f = b96.c;
                        float[] fArr = new float[1];
                        fArr[r4] = f;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bottomPanel, (Property<View, Float>) property, fArr);
                        View closeButtonBackground = y440Var.getCloseButtonBackground();
                        Property property2 = View.ALPHA;
                        float[] fArr2 = new float[1];
                        fArr2[r4] = 0.0f;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(closeButtonBackground, (Property<View, Float>) property2, fArr2);
                        ViewGroup topButtonsPanel = y440Var.getTopButtonsPanel();
                        float[] fArr3 = new float[1];
                        fArr3[r4] = 0.0f;
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(topButtonsPanel, (Property<ViewGroup, Float>) property2, fArr3);
                        View endButtonsPanel = y440Var.getEndButtonsPanel();
                        ?? r17 = r4;
                        float[] fArr4 = new float[1];
                        fArr4[r17] = 0.0f;
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(endButtonsPanel, (Property<View, Float>) property2, fArr4);
                        AnimatorSet S = y440Var.S(f, decelerateInterpolator);
                        Animator[] animatorArr = new Animator[5];
                        animatorArr[r17] = ofFloat;
                        animatorArr[1] = ofFloat2;
                        animatorArr[2] = ofFloat3;
                        animatorArr[3] = ofFloat4;
                        animatorArr[4] = S;
                        animatorSet.playTogether(rl3.I(animatorArr));
                        animatorSet.setInterpolator(decelerateInterpolator);
                        animatorSet.setDuration(112L);
                        animatorSet.addListener(new e96(b96Var));
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        View drawingBottomPanel = y440Var.getDrawingBottomPanel();
                        float[] fArr5 = new float[1];
                        fArr5[r17] = 0.0f;
                        ArrayList o = e43.o(ObjectAnimator.ofFloat(drawingBottomPanel, (Property<View, Float>) property, fArr5));
                        View drawingUndoContainer = y440Var.getDrawingUndoContainer();
                        if (drawingUndoContainer != null) {
                            float[] fArr6 = new float[1];
                            fArr6[r17] = 1.0f;
                            o.add(ObjectAnimator.ofFloat(drawingUndoContainer, (Property<View, Float>) property2, fArr6));
                        }
                        View topDrawingControlsPanel = y440Var.getTopDrawingControlsPanel();
                        if (topDrawingControlsPanel != null) {
                            float[] fArr7 = new float[1];
                            fArr7[r17] = 1.0f;
                            o.add(ObjectAnimator.ofFloat(topDrawingControlsPanel, (Property<View, Float>) property2, fArr7));
                        }
                        animatorSet2.playTogether(j5g.O0(o));
                        animatorSet2.setInterpolator(decelerateInterpolator);
                        animatorSet2.setDuration(112L);
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        Animator[] animatorArr2 = new Animator[2];
                        animatorArr2[r17] = animatorSet;
                        animatorArr2[1] = animatorSet2;
                        animatorSet3.playSequentially(animatorArr2);
                        z = r17;
                        animatorSet3.addListener(new f96(b96Var, z ? 1 : 0));
                        animatorSet3.start();
                    } else {
                        z = r4;
                    }
                    hi9Var.b = true;
                    r6.setDrawingUndoButtonEnabled(r6.getDrawingHistorySize() <= 0 ? z : true);
                    W4(z, z);
                } else if (atomicReference.get() != baseCameraEditorContract$ScreenState) {
                    break;
                } else {
                    r4 = 0;
                }
            }
        } else if (n930Var instanceof n930.n) {
            jpr0 verticalizationDelegate = r6.getVerticalizationDelegate();
            verticalizationDelegate.c().i(StoryEditorEvents.CLICK_ON_VERTICALIZATION_BUTTON);
            if (verticalizationDelegate.e()) {
                verticalizationDelegate.b();
            } else {
                verticalizationDelegate.f(verticalizationDelegate.b.getRequireContext().getString(R.string.story_snackbar_verticalization_client_restriction), null, null);
            }
        } else if (n930Var instanceof n930.d) {
            L2();
        } else if (n930Var instanceof n930.h) {
            hi9Var.d = true;
            D7().l();
            if (!r6.getStickersState().r() && !((tam0) this.v.get(0)).h.q()) {
                r5 = false;
            }
            if (!this.y || r5) {
                int i = r6.getStickersState().q() ? R.string.story_save_without_sound : R.string.story_save_without_audio;
                h7u0.a aVar = new h7u0.a(this.U);
                aVar.g0(i);
                aVar.c0(R.string.save, new f86(this, 0));
                aVar.W(R.string.cancel, new h86());
                aVar.m();
            } else {
                X7();
            }
        } else if (n930Var instanceof n930.c) {
            i8(false);
        } else if (n930Var instanceof n930.a) {
            i8(true);
        } else if (n930Var instanceof n930.i) {
            ((g440) r6).S6(null);
        } else {
            if (!(n930Var instanceof n930.e)) {
                throw new NoWhenBranchMatchedException();
            }
            ((g440) r6).dk(new kpd(1, this, u440.class, "setOnlineBooking", "setOnlineBooking(Z)V", 0, 7));
        }
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.u76
    public final String b5() {
        ArrayList arrayList = this.v;
        return arrayList.size() == 1 ? ((tam0) j5g.Y(arrayList)).f() ? "photo" : "video" : "multi";
    }

    public final Bitmap b8(tam0 tam0Var) {
        io.reactivex.rxjava3.core.q d;
        Bitmap bitmap;
        di9 di9Var = this.j;
        if (di9Var.x().k.f && !tam0Var.a()) {
            return tam0Var.t;
        }
        if (tam0Var.f()) {
            this.s0.getClass();
            yaa0 yaa0Var = tam0Var.a;
            if (yaa0Var == null || (bitmap = yaa0Var.b) == null) {
                d = mcr0.d(y8g0.a(R.dimen.editor_fragment_preview_width), y8g0.a(R.dimen.editor_fragment_preview_height), 94848, yaa0Var != null ? yaa0Var.a : null, null, null, null, true, false);
            } else {
                d = io.reactivex.rxjava3.core.q.T(bitmap);
            }
            return (Bitmap) itg0.e(d);
        }
        if (tam0Var.g()) {
            mat0 d2 = tam0Var.d();
            StoriesFeatures storiesFeatures = StoriesFeatures.ST_ANIM_OPTIMIZATION;
            storiesFeatures.getClass();
            return this.r0.a(d2, false, com.vk.toggle.b.A.a(storiesFeatures) && di9Var.x().e == null);
        }
        yaa0 yaa0Var2 = tam0Var.n;
        p86 p86Var = this.o;
        if (yaa0Var2 == null) {
            yaa0 yaa0Var3 = tam0Var.o;
            if (yaa0Var3 != null) {
                yi9 yi9Var = p86Var.h;
                if (yi9Var != null) {
                    Context context = yi9Var.a;
                    Uri uri = yaa0Var3.a;
                    if (uri != null) {
                        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                        try {
                            Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream);
                            ro.e(openInputStream, null);
                            return yi9.a(decodeStream, context, Float.valueOf(yi9Var.c.c));
                        } finally {
                        }
                    }
                }
            } else if (tam0Var.g) {
                StoryUploadParams storyUploadParams = this.l;
                storyUploadParams.getClass();
                return (Bitmap) itg0.e(this.v0.b(tam0Var, new StoryUploadParams(storyUploadParams)));
            }
        } else if (p86Var.g != null) {
            io.reactivex.rxjava3.core.q i = mcr0.i(yaa0Var2.a, 1080, 1920, 94848, null, null);
            i22 i22Var = new i22(new v9(tam0Var, 14), 4);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            return (Bitmap) itg0.e(i.E(i22Var, lVar, kVar, kVar));
        }
        return null;
    }

    public final void c8() {
        ArrayList arrayList = this.v;
        S7((tam0) arrayList.get(0), true);
        gzs<s3q0> gzsVar = this.A0;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        if (this.h == StoryEditorMode.WITH_BACKGROUND && arrayList.size() == 1) {
            tam0 tam0Var = (tam0) j5g.Y(arrayList);
            if (tam0Var.c && tam0Var.a()) {
                o5().i(StoryEditorEvents.APPLY_BACKGROUND);
            }
        }
        Integer num = this.j.x().m.e;
        if (num != null) {
            this.Q = k86.v7(num.intValue());
        }
        this.F0 = true;
    }

    public final boolean d8() {
        tam0 tam0Var = this.B0;
        return tam0Var != null && tam0Var.g();
    }

    public final void e8() {
        if (this.v.size() <= 1 || this.C0 != null) {
            ((g440) this.s).we();
        }
    }

    @Override // xsna.u76
    public final boolean f3() {
        tam0 tam0Var = this.B0;
        return tam0Var != null && tam0Var.h.u();
    }

    public final void f8(tam0 tam0Var) {
        mny.a aVar = mny.a;
        Bitmap f = this.m.f(tam0Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
        if (f != null) {
            gyl0 gyl0Var = this.p;
            if (gyl0Var != null) {
                gyl0Var.K3(f, false);
            }
            N7(f);
        }
    }

    @Override // xsna.f440
    public final boolean g4() {
        return this.C0 != null;
    }

    public final void g8() {
        tam0 tam0Var;
        zcl0 zcl0Var;
        h7m0 i;
        StoryMusicInfo info;
        tam0 tam0Var2 = this.B0;
        if (tam0Var2 == null || !tam0Var2.h.r() || (tam0Var = this.B0) == null || (zcl0Var = tam0Var.h) == null || (i = zcl0Var.i()) == null || (info = i.getInfo()) == null) {
            return;
        }
        MusicTrack musicTrack = info.b;
        int i2 = info.d;
        int i3 = info.e;
        int i4 = info.f;
        p1m0 p1m0Var = this.B;
        p1m0Var.f.removeCallbacksAndMessages(null);
        q850 q850Var = p1m0Var.a;
        q850Var.d.g(false);
        p1m0Var.b = musicTrack;
        p1m0Var.c = i2;
        p1m0Var.d = i4;
        String str = musicTrack.i;
        if (str == null) {
            str = "null";
        }
        bn40.f("url:", str, "boundsFromMs:", Integer.valueOf(i2), "boundsToMs:", Integer.valueOf(i3), "loop:", Boolean.TRUE, "partialPlayback:", Boolean.valueOf(q850Var.k));
        bn40.f(new Object[0]);
        q850Var.c.c(q850Var.b);
        String str2 = musicTrack.i;
        if (str2 == null) {
            throw new NullPointerException("Trying to play track with null url!");
        }
        q850Var.q(new q850.a(str2, Math.max(0, i2), i3, true, true, musicTrack));
    }

    @Override // xsna.u76
    public final iz8 getCadreSize() {
        return ((g440) this.s).getCadreSize();
    }

    @Override // xsna.u76
    public final int getCurrentIndex() {
        return this.v.indexOf(this.B0);
    }

    @Override // xsna.fyl0
    public final void h1(List<mat0> list) {
        mat0 mat0Var = (mat0) j5g.a0(list);
        if (mat0Var == null) {
            return;
        }
        qx5 qx5Var = new qx5(((g440) this.s).getRequireContext(), mat0Var, this.k0, this.m0, null, this.l0, new rmg(this, 28), 64);
        L7();
        tam0 tam0Var = this.B0;
        if (tam0Var != null) {
            tam0Var.b = new ArrayList(list);
        }
        v2(qx5Var);
        qx5Var.z();
        j8();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void i8(boolean z) {
        o5().i(z ? StoryEditorEvents.EDIT_ADVERTISER_MARK : StoryEditorEvents.MARK_ADVERTISER);
        String v = f870.v(InternalVkMiniApps.ORD.h());
        OrdData ordData = this.o.q.b.get(Integer.valueOf(getCurrentIndex()));
        if (ordData != null) {
            String str = ordData.c;
            boolean z2 = ordData.b;
            String str2 = ordData.d;
            StringBuilder sb = new StringBuilder();
            sb.append(v);
            sb.append("#ord_pred_id=");
            sb.append(str);
            sb.append("&is_ad=");
            sb.append(z2);
            String a2 = i5s.a(sb, "&erid=", str2);
            if (a2 != null) {
                v = a2;
            }
        }
        ((hrj0) this.p0.getValue()).a(((g440) this.s).getRequireContext(), v);
    }

    @Override // xsna.u76
    public final LinkedHashMap j6() {
        return this.G0;
    }

    public final void j8() {
        this.z0.onNext(s3q0.a);
    }

    @Override // xsna.u76
    public final void l() {
        ((g440) this.s).getSideControlPanel().b();
    }

    @Override // xsna.u76
    public final Boolean m3() {
        return (Boolean) this.x0.getOrDefault(fkq0.e(this.k.e), null);
    }

    @Override // xsna.u76
    public final void onActivityResult(int i, int i2, Intent intent) {
        WebServiceInfo webServiceInfo;
        tam0 tam0Var;
        tam0 tam0Var2;
        tam0 tam0Var3;
        Uri uri;
        zcl0 zcl0Var;
        nov novVar;
        if (i2 != -1) {
            return;
        }
        ArrayList arrayList = this.v;
        if (i == 300) {
            boolean f3 = f3();
            WebStoryBox webStoryBox = this.j.x().e;
            List<tam0> a2 = f3m0.a(intent, f3, (webStoryBox == null || (webServiceInfo = webStoryBox.i) == null) ? false : epx.f(webServiceInfo.h, Boolean.TRUE));
            if (a2.isEmpty()) {
                return;
            }
            boolean z = this.C0 == null;
            Y7(z ? j5g.u0(a2, arrayList) : a2, new khh(z, this, a2));
            return;
        }
        if (i == 301 && (tam0Var = this.B0) != null && tam0Var.a() && (tam0Var2 = (tam0) j5g.a0(f3m0.a(intent, f3(), false))) != null) {
            L7();
            K7();
            tam0 tam0Var4 = this.B0;
            if (tam0Var4 != null && (zcl0Var = tam0Var4.h) != null) {
                CopyOnWriteArrayList<nov> copyOnWriteArrayList = zcl0Var.a;
                int i3 = 0;
                while (true) {
                    if (i3 == copyOnWriteArrayList.size()) {
                        novVar = null;
                        break;
                    } else {
                        if (copyOnWriteArrayList.get(i3) instanceof lo9) {
                            novVar = copyOnWriteArrayList.get(i3);
                            break;
                        }
                        i3++;
                    }
                }
                lo9 lo9Var = (lo9) novVar;
                if (lo9Var != null) {
                    lo9Var.w();
                    M7(lo9Var);
                }
            }
            yaa0 yaa0Var = tam0Var2.a;
            yaa0 yaa0Var2 = (yaa0Var == null || (uri = yaa0Var.a) == null) ? null : new yaa0(uri);
            List arrayList2 = yaa0Var2 == null ? tam0Var2.b : new ArrayList();
            if (yaa0Var2 == null && arrayList2.isEmpty()) {
                tam0Var3 = null;
            } else {
                tam0 tam0Var5 = new tam0(yaa0Var2, arrayList2, false, tam0Var.d, tam0Var.e, tam0Var.f, tam0Var.g, tam0Var.h, tam0Var.i, tam0Var.j, tam0Var.k, tam0Var.l, tam0Var.m, tam0Var.n, tam0Var.o, null, tam0Var.q, null, tam0Var.s);
                tam0Var5.v = tam0Var.v;
                tam0Var5.w = tam0Var.w;
                tam0Var5.t = null;
                tam0Var5.u = null;
                tam0Var3 = tam0Var5;
            }
            if (tam0Var3 == null) {
                return;
            }
            arrayList.set(arrayList.indexOf(tam0Var), tam0Var3);
            this.E0 = true;
            S7(tam0Var3, false);
            j8();
            if (this.w == CameraEditorContentType.MEDIA && tam0Var3.f()) {
                this.m.f = this.D0;
            }
        }
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        x1m0 x1m0Var;
        mat0 d;
        File file;
        V v = this.s;
        ((g440) v).release();
        this.r0.getClass();
        boolean z = this.z;
        ArrayList arrayList = this.v;
        if (z) {
            tam0 tam0Var = this.B0;
            if (tam0Var != null && (x1m0Var = (x1m0) this.o0.getValue()) != null) {
                x1m0Var.c(tam0Var);
            }
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                tam0 tam0Var2 = (tam0) it.next();
                if (!tam0Var2.f() && tam0Var2.c && (d = tam0Var2.d()) != null && (file = d.a) != null && this.S) {
                    Regex regex = com.vk.core.files.a.a;
                    vhk0.b(file);
                }
            }
        }
        b0();
        L.e("onDestroy()");
        hfr.a aVar = new hfr.a(rli0.j(rli0.p(new i5g(arrayList), new jr3(2)), m86.c));
        while (aVar.hasNext()) {
            ((bij) aVar.next()).k(this.j0);
        }
        this.i.removeCallbacksAndMessages(null);
        dispose();
        gyl0 gyl0Var = this.p;
        if (gyl0Var != null) {
            gyl0Var.onDestroy();
        }
        A2();
        p86 p86Var = this.o;
        p86Var.q.d.getClass();
        ctu.b();
        this.t = null;
        this.u = null;
        p86Var.r.b.e();
        v.release();
    }

    @Override // xsna.cc6
    public final void onPause() {
        L.e("onPause()");
        this.I = false;
        p1m0 p1m0Var = this.B;
        p1m0Var.a();
        V v = this.s;
        v.w0();
        q850 q850Var = p1m0Var.a;
        q850Var.getClass();
        u850.a aVar = u850.a.a;
        q850Var.i = aVar;
        q850Var.e.onNext(aVar);
        v.onPause();
        ((g440) v).pauseVideo();
    }

    @Override // xsna.cc6
    public final void onResume() {
        L.e("onResume()");
        V v = this.s;
        boolean I4 = v.I4();
        boolean O = this.j.O();
        q850 q850Var = this.B.a;
        q850Var.getClass();
        u850.h hVar = u850.h.a;
        q850Var.i = hVar;
        q850Var.e.onNext(hVar);
        v.onResume();
        if (!I4 && !O) {
            v.w0();
            if (this.B0 != null) {
                v.K();
            }
        }
        this.I = true;
        this.r0.getClass();
        g8();
    }

    @Override // com.vk.media.player.video.view.SimpleVideoView.k
    public final void p0(Integer num) {
        mat0 d;
        tam0 tam0Var = this.B0;
        if (tam0Var == null || (d = tam0Var.d()) == null) {
            return;
        }
        int b2 = d.b() * d.c();
        int i = 2;
        io.reactivex.rxjava3.core.w wVar = k86.n0;
        if (b2 == 0) {
            io.reactivex.rxjava3.internal.operators.observable.l2 r0 = io.reactivex.rxjava3.core.q.B0(500L, TimeUnit.MILLISECONDS).U(new or20(new f2s(d, 28), i)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).r0(wVar);
            int i2 = kwg0.a;
            a(r0.subscribe(new iwg0(), new iwg0()));
        } else {
            if (this.E0) {
                ((g440) this.s).K();
            }
            this.w0.b(new io.reactivex.rxjava3.internal.operators.observable.s0(new hca(i, this, d)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).r0(wVar).subscribe(new tts(new by5(20, tam0Var, this), 13), new l8w(new iou(this, 16), 7)));
            this.E0 = false;
        }
    }

    @Override // xsna.u76
    public final Boolean p5() {
        return (Boolean) this.y0.getOrDefault(fkq0.e(this.k.e), null);
    }

    @Override // xsna.u76
    public final void pauseVideo() {
        ((g440) this.s).pauseVideo();
    }

    @Override // xsna.f440
    public final void setImageBitmap(Bitmap bitmap) {
        gyl0 gyl0Var;
        tam0 tam0Var = this.B0;
        if (tam0Var != null && tam0Var.f()) {
            yaa0 yaa0Var = tam0Var.a;
            if ((yaa0Var != null ? yaa0Var.a : null) == null) {
                if (yaa0Var != null) {
                    yaa0Var.b = bitmap;
                }
                if (tam0Var.h.a.size() != 0 || bitmap == null) {
                    WebStoryBox webStoryBox = this.j.x().e;
                    if (webStoryBox != null && !webStoryBox.Db() && (gyl0Var = this.p) != null) {
                        gyl0Var.T6(bitmap);
                    }
                } else {
                    a6(bitmap);
                }
                T7();
                e8();
                if (this.w == CameraEditorContentType.MEDIA) {
                    this.m.f = this.D0;
                    return;
                }
                return;
            }
        }
        L.l("MultiStory", "Wrong state for setImageBitmap");
    }

    @Override // xsna.u76
    public final void w0() {
        ((g440) this.s).w0();
    }

    @Override // xsna.f440
    public final void w6(d8m0 d8m0Var) {
        this.A0 = d8m0Var;
    }

    @Override // xsna.f440
    public final void z5(int i) {
        ListDataSet listDataSet;
        ListDataSet listDataSet2;
        ArrayList arrayList = this.v;
        arrayList.remove(i);
        HashMap<Integer, OrdData> hashMap = this.o.q.b;
        hashMap.put(Integer.valueOf(i), null);
        Set<Integer> keySet = hashMap.keySet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : keySet) {
            if (((Integer) obj).intValue() > i) {
                arrayList2.add(obj);
            }
        }
        Iterator it = j5g.C0(arrayList2).iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            OrdData ordData = hashMap.get(Integer.valueOf(intValue));
            OrdData zb = ordData != null ? OrdData.zb(ordData) : null;
            hashMap.put(Integer.valueOf(intValue), null);
            hashMap.put(Integer.valueOf(intValue - 1), zb);
        }
        HashMap<Integer, ppr0.b> hashMap2 = ((g440) this.s).getVerticalizationDelegate().j;
        hashMap2.put(Integer.valueOf(i), null);
        Set<Integer> keySet2 = hashMap2.keySet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : keySet2) {
            if (((Integer) obj2).intValue() > i) {
                arrayList3.add(obj2);
            }
        }
        Iterator it2 = j5g.C0(arrayList3).iterator();
        while (it2.hasNext()) {
            int intValue2 = ((Number) it2.next()).intValue();
            ppr0.b bVar = hashMap2.get(Integer.valueOf(intValue2));
            hashMap2.put(Integer.valueOf(intValue2), null);
            hashMap2.put(Integer.valueOf(intValue2 - 1), bVar);
        }
        if (arrayList.isEmpty()) {
            A7();
        } else if (i < arrayList.size()) {
            S7((tam0) arrayList.get(i), false);
        } else {
            S7((tam0) arrayList.get(i - 1), false);
        }
        ListDataSet listDataSet3 = this.C0;
        if (listDataSet3 != null) {
            listDataSet3.A(i);
        }
        ListDataSet listDataSet4 = this.C0;
        Object obj3 = listDataSet4 != null ? (zif0) listDataSet4.c(i) : null;
        h640 h640Var = obj3 instanceof h640 ? (h640) obj3 : null;
        if (h640Var != null) {
            h640Var.b = true;
        }
        ListDataSet listDataSet5 = this.C0;
        if (listDataSet5 != null) {
            listDataSet5.d(i);
        }
        if (arrayList.size() >= 10 || (listDataSet = this.C0) == null) {
            return;
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        AbstractList abstractList = listDataSet.d;
        for (int i2 = 0; i2 < abstractList.size(); i2++) {
            if (((zif0) abstractList.get(i2)) instanceof y340) {
                ref$BooleanRef.element = true;
                s3q0 s3q0Var = s3q0.a;
            } else {
                s3q0 s3q0Var2 = s3q0.a;
            }
        }
        if (ref$BooleanRef.element || (listDataSet2 = this.C0) == null) {
            return;
        }
        listDataSet2.s(new y340());
    }
}
