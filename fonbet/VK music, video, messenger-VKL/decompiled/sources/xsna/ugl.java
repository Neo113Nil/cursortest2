package xsna;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.datasource.c;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.TimelineThumbs;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.interactive.InteractiveInfo;
import com.vk.dto.hints.HintId;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.mediastore.media.exo.datasource.VkHttpCallFactory;
import com.vk.movika.impl.onboarding.InteractiveOnboardingModalBottomSheet;
import com.vk.movika.sdk.android.defaultplayer.interactive.d;
import com.vk.movika.sdk.base.b;
import com.vk.movika.sdk.base.d;
import com.vk.movika.sdk.base.e;
import com.vk.movika.sdk.base.logic.dto.c;
import com.vk.movika.sdk.base.model.Chapter;
import com.vk.movika.sdk.base.model.t;
import com.vk.movika.sdk.base.ui.d;
import com.vk.movika.sdk.base.ui.y;
import com.vk.movika.sdk.player.base.listener.PlaybackStateListener;
import com.vk.movika.sdk.player.base.model.PlayerItemVariant;
import com.vk.movika.sdk.utils.d;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import one.video.player.OneVideoPlayer;
import xsna.acx;
import xsna.cbx;
import xsna.cor;
import xsna.ef6;
import xsna.nbx;
import xsna.ocx;
import xsna.wbx;

/* compiled from: DefaultInteractiveVideoPlayer.kt */
/* loaded from: classes3.dex */
public final class ugl implements lcx {
    public boolean A;
    public final Context b;
    public final m7q c;
    public final String d;
    public final opt0 e;
    public final wbx f;
    public final gbx g;
    public final fbx h;
    public final yua0 i;
    public final Object j;
    public final bpn0 k;
    public ocx l;
    public final Object m;
    public List<? extends vbx> n;
    public Object o;
    public io.reactivex.rxjava3.disposables.c p;
    public final io.reactivex.rxjava3.disposables.b q;
    public ef6 r;
    public b s;
    public boolean t;
    public com.vk.movika.sdk.base.model.o u;
    public boolean v;
    public dj00 w;
    public boolean x;
    public com.vk.movika.sdk.base.asset.b y;
    public String z;

    /* compiled from: DefaultInteractiveVideoPlayer.kt */
    public final class b {
        public final mbr0 a;
        public final VideoTextureView b;

        public b(mbr0 mbr0Var, VideoTextureView videoTextureView) {
            this.a = mbr0Var;
            this.b = videoTextureView;
        }
    }

    /* compiled from: DefaultInteractiveVideoPlayer.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlaybackStateListener.PlaybackState.values().length];
            try {
                iArr[PlaybackStateListener.PlaybackState.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlaybackStateListener.PlaybackState.BUFFERING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ugl(Context context, ocx ocxVar, m7q m7qVar, String str, opt0 opt0Var, wbx wbxVar, gbx gbxVar, fbx fbxVar, yua0 yua0Var) {
        InteractiveInfo R7;
        String str2;
        this.b = context;
        this.c = m7qVar;
        this.d = str;
        this.e = opt0Var;
        this.f = wbxVar;
        this.g = gbxVar;
        this.h = fbxVar;
        this.i = yua0Var;
        trf trfVar = new trf(this, 16);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j = msy.a(lazyThreadSafetyMode, trfVar);
        this.k = new bpn0(new fn4(11));
        this.l = ocxVar;
        VideoFile videoFile = ocxVar.s;
        wcx wcxVar = new wcx((videoFile == null || (R7 = videoFile.R7()) == null || (str2 = R7.d) == null) ? "" : str2, this, this.l);
        this.m = msy.a(lazyThreadSafetyMode, new uv0(9));
        this.n = Collections.singletonList(wcxVar);
        this.o = EmptyList.b;
        this.q = new io.reactivex.rxjava3.disposables.b();
        if (BuildInfo.h()) {
            com.vk.movika.sdk.utils.f.a = true;
            com.vk.movika.sdk.utils.f.b = d.a.c;
        }
    }

    public static final ArrayList e(ugl uglVar, com.vk.movika.sdk.base.ui.c cVar) {
        List<com.vk.movika.sdk.base.model.f> list = cVar.k;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (com.vk.movika.sdk.base.utils.d.c((com.vk.movika.sdk.base.model.f) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void i(ugl uglVar, cbx cbxVar) {
        Iterator it = ((Iterable) uglVar.o).iterator();
        while (it.hasNext()) {
            ((dbx) it.next()).a(cbxVar);
        }
    }

    public static final void o(ugl uglVar, mc0 mc0Var) {
        Object obj;
        com.vk.movika.sdk.base.ui.c cVar = (com.vk.movika.sdk.base.ui.c) mc0Var.a;
        if (uglVar.t) {
            com.vk.movika.sdk.base.model.o oVar = cVar.n;
            if (oVar == null) {
                oVar = cVar.o;
            }
            if (oVar == null || oVar.equals(uglVar.u)) {
                return;
            }
            com.vk.movika.sdk.base.model.s sVar = cVar.j;
            if (com.vk.movika.sdk.base.model.m.c(cVar.i)) {
                oVar = com.vk.movika.sdk.base.model.o.a(oVar, null, null, Collections.singletonList(j5g.i0(oVar.h)), 127);
                uglVar.s().e(oVar);
            } else if ((uglVar.l.f instanceof ocx.c.a) && sVar != null) {
                oVar = com.vk.movika.sdk.base.model.o.a(oVar, null, null, Collections.singletonList(new com.vk.movika.sdk.base.model.c(sVar.h.a)), 127);
                uglVar.s().e(oVar);
            }
            uglVar.u = oVar;
            io.reactivex.rxjava3.disposables.b bVar = uglVar.q;
            fbx fbxVar = uglVar.h;
            List<com.vk.movika.sdk.base.model.c> list = oVar.h;
            dj00 dj00Var = uglVar.w;
            if (dj00Var == null) {
                return;
            }
            VideoFile videoFile = fbxVar.a;
            Map<String, String> map = dj00Var.b;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                q2z.a(entry.getValue(), entry.getKey(), arrayList);
            }
            Map s = pn00.s(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (com.vk.movika.sdk.base.model.c cVar2 : list) {
                Iterator it = s.keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (epx.f((String) obj, cVar2.a)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                String str = (String) obj;
                String str2 = str != null ? (String) s.get(str) : null;
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
            List y0 = j5g.y0(arrayList2);
            String g0 = j5g.g0(y0, null, X3.j.d, X3.j.e, 0, null, 57);
            UserId I0 = videoFile.I0();
            int o0 = videoFile.o0();
            String C1 = videoFile.C1();
            tfx tfxVar = new tfx("video.saveInteractiveVideoHistory", new kgj0(5), new dwm0(2));
            tfx.n(tfxVar, "owner_id", I0, 0L, 0L, 12);
            tfx.l(tfxVar, "video_id", o0, 1, 0, 8);
            if (C1 != null) {
                tfx.o(tfxVar, "access_key", C1, 0, 0, 12);
            }
            if (g0 != null) {
                tfx.o(tfxVar, "history", g0, 0, 0, 12);
            }
            bVar.b(rsg0.D0(yfb.x(tfxVar)).l(new h7(new gv3(28), 25)).subscribe(new bg1(new j60(19), 22), new tgl(new k60(25))));
        }
    }

    public static void v(ugl uglVar, b1j b1jVar, int i) {
        boolean z = (i & 1) == 0;
        if ((i & 2) != 0) {
            b1jVar = null;
        }
        com.vk.movika.sdk.base.asset.b bVar = uglVar.y;
        if (bVar == null) {
            uglVar.u();
            return;
        }
        if (b1jVar != null) {
            b1jVar.invoke();
        }
        nbx s = uglVar.s();
        String str = uglVar.z;
        if (str == null || z) {
            str = null;
        }
        mc0 mc0Var = s.g;
        if (mc0Var == null) {
            return;
        }
        if (z || str != null) {
            s.o = null;
        }
        com.vk.movika.sdk.base.ui.c cVar = (com.vk.movika.sdk.base.ui.c) mc0Var.a;
        nbx.e eVar = s.o;
        cVar.B(bVar, eVar != null ? eVar.b : null, s.p, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0194  */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v18, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.bcx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(acx acxVar) {
        View view;
        Context context;
        VideoFile videoFile;
        OneVideoPlayer a2;
        Chapter chapter;
        com.vk.movika.sdk.base.model.f d;
        d3b0 r;
        OneVideoPlayer a3;
        OneVideoPlayer a4;
        d3b0 r2;
        OneVideoPlayer a5;
        OneVideoPlayer a6;
        Integer a7;
        mc0 mc0Var;
        sht0 e;
        boolean isPrepared;
        OneVideoPlayer a8;
        ef6 ef6Var = this.r;
        if (ef6Var != null) {
            boolean z = acxVar instanceof acx.g;
            int i = -1;
            Float f = null;
            if (z) {
                acx.g gVar = (acx.g) acxVar;
                if (ef6Var != null && !this.l.i && gVar.a) {
                    nbx s = s();
                    mc0 mc0Var2 = s.g;
                    Context context2 = s.a;
                    if (mc0Var2 == null) {
                        nbx.f fVar = s.f;
                        m7q m7qVar = s.b;
                        if (m7qVar != null && (e = jgz.e(m7qVar)) != null) {
                            d3b0 l = qu5.c().l(e);
                            int i2 = 3;
                            if (l == null) {
                                o1b0 c2 = qu5.c();
                                m7q m7qVar2 = s.b;
                                nbx.g gVar2 = (nbx.g) s.i.getValue();
                                sr10 sr10Var = dy2.a;
                                l = o1b0.g(c2, m7qVar2, gVar2, false, epx.f(sr10Var != null ? sr10Var.g() : null, Boolean.TRUE), new yhu(s, i2), null, 992);
                                if (l == null) {
                                    L l2 = L.a;
                                    l2.getClass();
                                    if (!L.m(LoggerOutputTarget.NONE)) {
                                        L.u(l2, L.LogType.w, new Object[]{"Can not preparePoolPlayer"});
                                    }
                                    s3q0 s3q0Var = s3q0.a;
                                }
                            }
                            OneVideoPlayer a9 = l.a();
                            if (a9 != null) {
                                a9.d0((nbx.c) s.l.getValue());
                            }
                            if (s.r) {
                                OneVideoPlayer a10 = l.a();
                                isPrepared = epx.f(a10 != null ? a10.j() : null, jgz.e(m7qVar));
                            } else {
                                isPrepared = l.isPrepared();
                            }
                            if (!isPrepared) {
                                l.l(m7qVar, EmptyList.b);
                            }
                            OneVideoPlayer a11 = l.a();
                            xk80 xk80Var = a11 instanceof xk80 ? (xk80) a11 : null;
                            if (xk80Var == null) {
                                L l3 = L.a;
                                l3.getClass();
                                if (!L.m(LoggerOutputTarget.NONE)) {
                                    L.u(l3, L.LogType.w, new Object[]{"Can not cast OneVideoPlayer to OneVideoExoPlayer"});
                                }
                                s3q0 s3q0Var2 = s3q0.a;
                            } else {
                                mj80 mj80Var = new mj80(context2, xk80Var, new c.a(context2.getApplicationContext(), new etk(new VkHttpCallFactory(null, null, 3), null)), (kzg0) s.h.getValue());
                                mj80Var.s = PlayerItemVariant.Type.DASH;
                                mj80Var.m.getClass();
                                com.vk.movika.sdk.base.ui.c cVar = new com.vk.movika.sdk.base.ui.c(new com.vk.movika.sdk.player.base.components.a(mj80Var, mj80Var, mj80Var, mj80Var, s.d), new y.b(21));
                                s.e.b(new wbx.a(cVar, mj80Var, xk80Var), l);
                                ocx ocxVar = ((ugl) fVar.c.c).l;
                                if (ocxVar.p != -1 && (a8 = l.a()) != null) {
                                    vm80.c(a8, ocxVar.p);
                                }
                                OneVideoPlayer a12 = l.a();
                                if (a12 != null) {
                                    a12.setPlaybackSpeed(ocxVar.q);
                                }
                                l.j((ujt0) fVar.a.invoke());
                                Float f2 = ocxVar.o;
                                if (f2 != null) {
                                    float floatValue = f2.floatValue();
                                    OneVideoPlayer a13 = l.a();
                                    if (a13 != null) {
                                        a13.setVolume(floatValue);
                                    }
                                }
                                cVar.A((com.vk.movika.sdk.base.ui.d) fVar.b.invoke());
                                mc0Var = new mc0(cVar, mj80Var, l);
                                s.g = mc0Var;
                                if (mc0Var != null) {
                                    s.a(mc0Var);
                                    nbx.e eVar = s.o;
                                    if (eVar != null) {
                                        ((com.vk.movika.sdk.base.ui.c) mc0Var.a).B(eVar.a, eVar.b, s.p, null);
                                    }
                                }
                            }
                        }
                        mc0Var = null;
                        s.g = mc0Var;
                        if (mc0Var != null) {
                        }
                    } else {
                        s.a(mc0Var2);
                    }
                    com.vk.movika.sdk.base.ui.c q = q();
                    if (q != null) {
                        if (this.l.a.a) {
                            q.z();
                        } else {
                            q.y();
                        }
                    }
                }
            }
            if (this.y == null) {
                u();
            }
            if (acxVar.equals(acx.c.a)) {
                p(false);
                return true;
            }
            if (acxVar.equals(acx.d.a)) {
                p(true);
                return true;
            }
            if (acxVar instanceof acx.m) {
                acx.m mVar = (acx.m) acxVar;
                int i3 = mVar.a;
                d3b0 r3 = r();
                if (r3 != null && (a6 = r3.a()) != null && (a7 = vm80.a(a6)) != null) {
                    i = a7.intValue();
                }
                if (i != i3 && (r2 = r()) != null && (a5 = r2.a()) != null) {
                    vm80.c(a5, i3);
                }
                w(ocx.a(this.l, null, null, false, null, null, null, false, false, null, null, null, null, null, null, mVar.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4161535));
                return true;
            }
            if (acxVar instanceof acx.l) {
                acx.l lVar = (acx.l) acxVar;
                float f3 = lVar.a;
                d3b0 r4 = r();
                if (r4 != null && (a4 = r4.a()) != null) {
                    f = Float.valueOf(a4.b());
                }
                if (!epx.d(f, f3) && (r = r()) != null && (a3 = r.a()) != null) {
                    a3.setPlaybackSpeed(f3);
                }
                w(ocx.a(this.l, null, null, false, null, null, null, false, false, null, null, null, null, null, null, 0, lVar.a, null, null, false, null, 4128767));
                return true;
            }
            if (acxVar.equals(acx.p.a)) {
                mc0 c3 = s().c();
                if (c3 != null) {
                    com.vk.movika.sdk.base.ui.c cVar2 = (com.vk.movika.sdk.base.ui.c) c3.a;
                    ocx.e eVar2 = this.l.m;
                    ocx.e a14 = y3r0.a(cVar2.b(null));
                    if (epx.f(a14, ocx.e.a.a)) {
                        com.vk.movika.sdk.base.ui.v0 v0Var = cVar2.r;
                        if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
                            com.vk.movika.sdk.utils.c.a(cVar2, null);
                        }
                        cVar2.b.getClass();
                        if (cVar2.b(750L).equals(e.a.a) && (chapter = cVar2.i) != null && (d = com.vk.movika.sdk.base.utils.d.d(chapter, v0Var.o(v0Var.d.a.q()))) != null) {
                            boolean s2 = v0Var.s(Math.max(d.c - 750, 0L));
                            Boolean.valueOf(s2);
                            if (!s2) {
                            }
                        }
                    }
                    if (!epx.f(a14, eVar2)) {
                        w(ocx.a(this.l, null, null, false, null, null, null, false, false, null, null, null, a14, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4190207));
                    }
                    s3q0 s3q0Var3 = s3q0.a;
                    return true;
                }
            } else {
                if (z) {
                    t((acx.g) acxVar);
                    return true;
                }
                if (acxVar instanceof acx.h) {
                    com.vk.movika.sdk.base.ui.c q2 = q();
                    if (q2 != null) {
                        long j = ((acx.h) acxVar).a;
                        if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
                            com.vk.movika.sdk.utils.c.a(q2, null);
                        }
                        com.vk.movika.sdk.base.ui.v0 v0Var2 = q2.r;
                        Long r5 = v0Var2.d.a.r();
                        if ((r5 != null ? r5.longValue() : -1L) > 0) {
                            q2.w(new c.i(v0Var2.o(v0Var2.d.a.q()), j), true);
                            return true;
                        }
                        if (com.vk.movika.sdk.utils.f.b.b - 2 <= 0) {
                            com.vk.movika.sdk.utils.c.a(q2, null);
                        }
                        return true;
                    }
                } else if (acxVar instanceof acx.i) {
                    w(ocx.a(this.l, null, null, false, null, null, null, false, false, null, null, null, null, ocx.d.e.a, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4186111));
                    com.vk.movika.sdk.base.ui.c q3 = q();
                    if (q3 != null) {
                        if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
                            com.vk.movika.sdk.utils.c.a(q3, null);
                        }
                        q3.w(new c.k(), true);
                        return true;
                    }
                } else {
                    if (acxVar instanceof acx.n) {
                        d3b0 r6 = r();
                        if (r6 != null && (a2 = r6.a()) != null) {
                            a2.setVolume(((acx.n) acxVar).a);
                        }
                        w(ocx.a(this.l, null, null, false, null, null, null, false, false, null, null, null, null, null, Float.valueOf(((acx.n) acxVar).a), 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4177919));
                        return true;
                    }
                    if (acxVar instanceof acx.j) {
                        x(Boolean.valueOf(((acx.j) acxVar).a));
                        return true;
                    }
                    if (acxVar instanceof acx.e) {
                        g7s0 B = fxc0.B();
                        VideoFile videoFile2 = ((acx.e) acxVar).a;
                        B.d(videoFile2);
                        w(ocx.a(this.l, null, null, false, null, null, null, false, fxc0.B().c(videoFile2), null, null, null, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4194047));
                        return true;
                    }
                    if (acxVar instanceof acx.q) {
                        ef6 ef6Var2 = this.r;
                        if (ef6Var2 != null && (view = ef6Var2.getView()) != null && (context = view.getContext()) != null && (videoFile = this.l.s) != null) {
                            if (((Boolean) this.k.getValue()).booleanValue()) {
                                o25.a().getClass();
                            } else {
                                o25.a().getClass();
                            }
                            w(ocx.a(this.l, null, null, false, null, null, null, false, false, null, null, null, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, !r11.t, null, 3670015));
                            fxc0.B().m0(context, videoFile, this.d, videoFile.r(), new com.vk.movika.tools.controls.seekbar.u(this, 4), new vl1(this, 25));
                            s3q0 s3q0Var4 = s3q0.a;
                            return true;
                        }
                    } else if (acxVar instanceof acx.o) {
                        Context context3 = ((acx.o) acxVar).a;
                        yqf yqfVar = new yqf(this, 9);
                        com.vk.movika.impl.onboarding.e eVar3 = new com.vk.movika.impl.onboarding.e(context3, yqfVar, new zqf(this, 13));
                        if (pla.e().b().a(HintId.INFO_VIDEO_INTERACTIVE_VIDEO.getId()) && context3.getResources().getConfiguration().orientation != 2) {
                            new InteractiveOnboardingModalBottomSheet.a(new InteractiveOnboardingModalBottomSheet.OnboardingModalArguments(eVar3.b), context3, eVar3.c).I0(null);
                            yqfVar.invoke();
                        }
                    } else {
                        if (acxVar instanceof acx.k) {
                            w(ocx.a(this.l, null, null, false, null, null, null, ((acx.k) acxVar).a, false, null, null, null, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4194175));
                            return true;
                        }
                        if (acxVar instanceof acx.f) {
                            t(new acx.g(false, false, false));
                            ocx ocxVar2 = this.l;
                            ocxVar2.u.getClass();
                            w(ocx.a(ocxVar2, null, null, false, null, null, null, false, false, null, null, null, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, new ocx.a(true, true), 3145727));
                            return true;
                        }
                        if (acxVar instanceof acx.a) {
                            ocx ocxVar3 = this.l;
                            w(ocx.a(ocxVar3, null, null, false, null, null, null, false, false, null, null, null, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, new ocx.a(true, ocxVar3.u.b), 3145727));
                            return true;
                        }
                        if (acxVar instanceof acx.b) {
                            ocx ocxVar4 = this.l;
                            ocxVar4.u.getClass();
                            w(ocx.a(ocxVar4, null, null, false, null, null, null, false, false, null, null, null, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, new ocx.a(false, false), 3145727));
                            return true;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // xsna.lcx
    public final void c(ef6.g gVar) {
        this.n = j5g.s0(this.n, gVar);
    }

    @Override // xsna.lcx
    public final void d(ef6.g gVar) {
        this.n = j5g.v0(gVar, this.n);
        gVar.a(this.l);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.lcx
    public final void destroy() {
        w(ocx.a(this.l, null, null, false, null, null, null, false, false, null, null, null, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4193855));
        this.s = null;
        this.u = null;
        nbx s = s();
        s.b();
        s.o = null;
        asg0 asg0Var = (asg0) this.m.getValue();
        asg0Var.getClass();
        EmptyList emptyList = EmptyList.b;
        asg0Var.b = emptyList;
        io.reactivex.rxjava3.disposables.c cVar = this.p;
        if (cVar != null) {
            cVar.dispose();
        }
        this.p = null;
        this.q.dispose();
        this.f.b(null, null);
        this.e.c.e();
        this.n = emptyList;
        this.o = emptyList;
        ef6 ef6Var = this.r;
        if (ef6Var != null) {
            n(ef6Var);
        }
    }

    @Override // xsna.lcx
    public final d3b0 f() {
        return r();
    }

    @Override // xsna.lcx
    public final Long g() {
        com.vk.movika.sdk.base.ui.c q = q();
        if (q != null) {
            return Long.valueOf(q.g());
        }
        return null;
    }

    @Override // xsna.lcx
    public final ocx getCurrentState() {
        return this.l;
    }

    @Override // xsna.lcx
    public final boolean h(ef6 ef6Var) {
        return ef6Var.equals(this.r);
    }

    @Override // xsna.lcx
    public final void j(ef6.e eVar) {
        this.o = j5g.v0(eVar, (Collection) this.o);
    }

    @Override // xsna.lcx
    public final Long k() {
        com.vk.movika.sdk.base.ui.c q = q();
        if (q != null) {
            return q.r.d.a.r();
        }
        return null;
    }

    @Override // xsna.lcx
    public final void l(ncx ncxVar) {
        ViewGroup viewGroup = ncxVar.b;
        ef6 ef6Var = ncxVar.a;
        if (!ef6Var.equals(this.r)) {
            ef6 ef6Var2 = this.r;
            if (ef6Var2 != null) {
                n(ef6Var2);
            }
            this.r = ef6Var;
        }
        Context context = viewGroup.getContext();
        mbr0 mbr0Var = new mbr0(context, new d.b(1985));
        Typeface a2 = dbg0.a(R.font.vk_sans_display_regular, context);
        if (a2 != null) {
            ArrayList<com.vk.movika.sdk.android.defaultplayer.container.c> arrayList = mbr0Var.f;
            arrayList.clear();
            arrayList.add(new com.vk.movika.sdk.android.defaultplayer.container.c(new com.vk.movika.sdk.android.defaultplayer.container.h(context, true, false, new com.vk.movika.sdk.android.defaultplayer.control.b(context, new q1t(a2), false, true, 20), null, null, 476)));
            if (arrayList.size() > 1) {
                g5g.L(arrayList, new com.vk.movika.sdk.android.defaultplayer.interactive.e());
            }
        }
        mbr0Var.i(new d.a.i(!this.v));
        viewGroup.removeAllViews();
        viewGroup.addView(mbr0Var.j.b);
        this.s = new b(mbr0Var, ncxVar.c);
        ocx ocxVar = this.l;
        boolean z = ncxVar.d;
        boolean z2 = ncxVar.e;
        com.vk.libvideo.autoplay.a aVar = ncxVar.f;
        VideoFile videoFile = ncxVar.g;
        boolean X = videoFile != null ? videoFile.X() : false;
        ocx.c cVar = this.l.f;
        if ((cVar instanceof ocx.c.a ? (ocx.c.a) cVar : null) != null) {
            cVar = new ocx.c.a(true);
        }
        w(ocx.a(ocxVar, null, null, false, null, null, cVar, z, z2, null, null, null, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar, videoFile, X, null, 3276383));
    }

    @Override // xsna.lcx
    public final void m(ef6.e eVar) {
        this.o = j5g.s0((Iterable) this.o, eVar);
    }

    @Override // xsna.lcx
    public final void n(ef6 ef6Var) {
        if (ef6Var.equals(this.r)) {
            this.r = null;
            this.s = null;
            this.u = null;
            s().f();
        }
    }

    public final void p(boolean z) {
        if (this.l.e instanceof t.c) {
            return;
        }
        d3b0 r = r();
        OneVideoPlayer a2 = r != null ? r.a() : null;
        if (a2 != null) {
            com.vk.movika.sdk.base.model.t tVar = this.l.e;
            t.d dVar = tVar instanceof t.d ? (t.d) tVar : null;
            long duration = dVar != null ? dVar.b : a2.getDuration();
            long currentPosition = a2.getCurrentPosition();
            a2.seekTo(z ? Math.min(currentPosition + 10000, duration) : Math.max(currentPosition - 10000, 0L));
        }
    }

    public final com.vk.movika.sdk.base.ui.c q() {
        mc0 c2 = s().c();
        if (c2 != null) {
            return (com.vk.movika.sdk.base.ui.c) c2.a;
        }
        return null;
    }

    public final d3b0 r() {
        mc0 c2 = s().c();
        if (c2 != null) {
            return (d3b0) c2.c;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final nbx s() {
        return (nbx) this.j.getValue();
    }

    public final void t(acx.g gVar) {
        if (this.A && gVar.a) {
            return;
        }
        ocx ocxVar = this.l;
        ocx.b bVar = ocxVar.a;
        if (bVar.a || !bVar.b || gVar.b) {
            bVar = new ocx.b(gVar.a, gVar.b);
        }
        ocx.b bVar2 = bVar;
        w(ocx.a(ocxVar, bVar2, null, false, null, null, null, false, false, null, null, null, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4194302));
        if (gVar.c) {
            com.vk.movika.sdk.base.asset.b bVar3 = this.y;
            if (bVar3 == null) {
                u();
                return;
            }
            this.f.d();
            ocx ocxVar2 = this.l;
            ocx.b bVar4 = ocxVar2.a;
            ocx.c.b bVar5 = ocx.c.b.a;
            VideoFile videoFile = ocxVar2.s;
            w(new ocx(bVar4, bVar5, ocxVar2.h, ocxVar2.i, ocxVar2.p, ocxVar2.r, videoFile, videoFile != null && videoFile.X(), this.l.v, 1146462));
            s3q0 s3q0Var = s3q0.a;
            nbx s = s();
            mc0 mc0Var = s.g;
            if (mc0Var == null) {
                return;
            }
            s.o = null;
            ((com.vk.movika.sdk.base.ui.c) mc0Var.a).B(bVar3, null, s.p, null);
            return;
        }
        if (!bVar2.a) {
            com.vk.movika.sdk.base.ui.c q = q();
            if (q != null) {
                q.y();
                return;
            }
            return;
        }
        ocx ocxVar3 = this.l;
        if (ocxVar3.j != null) {
            v(this, new b1j(this, 5), 1);
            return;
        }
        if (ocxVar3.f instanceof ocx.c.a) {
            v(this, null, 2);
            return;
        }
        mc0 mc0Var2 = s().g;
        if ((mc0Var2 != null ? ((com.vk.movika.sdk.base.ui.c) mc0Var2.a).y : null) == null) {
            v(this, null, 3);
            return;
        }
        com.vk.movika.sdk.base.ui.c q2 = q();
        if (q2 != null) {
            q2.z();
        }
    }

    public final void u() {
        ocx ocxVar = this.l;
        if (ocxVar.g || this.p != null) {
            return;
        }
        ocx.b bVar = ocxVar.a;
        boolean z = ocxVar.h;
        ocx.c cVar = (z || ocxVar.i) ? ocx.c.C3448c.a : ocx.c.b.a;
        boolean z2 = ocxVar.i;
        VideoFile videoFile = ocxVar.s;
        w(new ocx(bVar, cVar, z, z2, ocxVar.p, ocxVar.r, videoFile, videoFile != null && videoFile.X(), this.l.v, 1145950));
        io.reactivex.rxjava3.internal.operators.single.b bVar2 = new io.reactivex.rxjava3.internal.operators.single.b(new pa(this.g, 22));
        asu0 asu0Var = asu0.a;
        this.p = bVar2.m(asu0Var.d()).q(asu0Var.c()).subscribe(new x8(new frg(this, 7), 16), new defpackage.n(new eph(this, 7), 21));
    }

    public final void w(ocx ocxVar) {
        boolean f = epx.f(this.l, ocxVar);
        this.l = ocxVar;
        if (f) {
            return;
        }
        Iterator<T> it = this.n.iterator();
        while (it.hasNext()) {
            ((vbx) it.next()).a(ocxVar);
        }
    }

    public final void x(Boolean bool) {
        if (bool != null) {
            this.v = bool.booleanValue();
        }
        b bVar = this.s;
        if (bVar != null) {
            bVar.a.i(new d.a.i(!this.v && this.l.a.a));
        }
    }

    public final void y(boolean z) {
        VideoFile videoFile = this.l.s;
        if (videoFile != null) {
            videoFile.s0(z);
        }
        w(ocx.a(this.l, null, null, false, null, null, null, false, false, null, null, null, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, z, null, 3670015));
    }

    /* compiled from: DefaultInteractiveVideoPlayer.kt */
    public final class a implements com.vk.movika.sdk.base.listener.c, com.vk.movika.sdk.base.listener.b, com.vk.movika.sdk.base.listener.k, com.vk.movika.sdk.base.listener.d, PlaybackStateListener, com.vk.movika.sdk.base.listener.j, com.vk.movika.sdk.base.listener.o, com.vk.movika.sdk.base.listener.a, com.vk.movika.sdk.player.base.listener.b, com.vk.movika.sdk.base.hooks.s, com.vk.movika.sdk.base.hooks.r, com.vk.movika.sdk.base.listener.e, com.vk.movika.sdk.base.listener.h, com.vk.movika.sdk.base.listener.l, com.vk.movika.sdk.base.listener.g {
        public a() {
        }

        @Override // com.vk.movika.sdk.player.base.listener.b
        public final void a(Throwable th) {
            ugl uglVar = ugl.this;
            uglVar.w(ocx.a(uglVar.l, null, null, false, null, null, null, false, false, th, null, null, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4193791));
        }

        @Override // com.vk.movika.sdk.base.hooks.r
        public final void b(com.vk.movika.sdk.base.d dVar) {
            com.vk.movika.sdk.base.d dVar2;
            ocx.d dVar3;
            ugl uglVar = ugl.this;
            if (uglVar.t) {
                dVar2 = d.C1289d.a;
                if (!epx.f(dVar, dVar2)) {
                    dVar2 = dVar;
                } else if (!com.vk.movika.sdk.base.model.m.c(uglVar.l.b) && uglVar.x) {
                    dVar2 = d.c.a;
                }
            } else {
                dVar2 = d.c.a;
            }
            ocx ocxVar = uglVar.l;
            if (dVar2.equals(d.a.a)) {
                dVar3 = ocx.d.a.a;
            } else if (dVar2.equals(d.b.a)) {
                dVar3 = ocx.d.b.a;
            } else if (dVar2.equals(d.e.a) || dVar2.equals(d.c.a)) {
                dVar3 = ocx.d.c.a;
            } else {
                if (!dVar2.equals(d.C1289d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar3 = ocx.d.C3449d.a;
            }
            uglVar.w(ocx.a(ocxVar, null, null, false, null, null, null, false, false, null, null, null, null, dVar3, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4186111));
        }

        @Override // com.vk.movika.sdk.base.listener.a
        public final void c(Throwable th) {
            ugl uglVar = ugl.this;
            uglVar.w(ocx.a(uglVar.l, null, null, false, null, null, null, false, false, th, null, null, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4193791));
        }

        @Override // com.vk.movika.sdk.base.hooks.s
        public final void d(com.vk.movika.sdk.base.e eVar) {
            ugl uglVar = ugl.this;
            uglVar.w(ocx.a(uglVar.l, null, null, false, null, null, null, false, false, null, null, null, y3r0.a(eVar), null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4190207));
        }

        @Override // com.vk.movika.sdk.base.listener.e
        public final void e(List<? extends com.vk.movika.sdk.base.model.k> list) {
            ugl.i(ugl.this, cbx.b.a);
        }

        @Override // com.vk.movika.sdk.base.listener.g
        public final void f(List<com.vk.movika.sdk.base.model.i> list) {
            ugl uglVar = ugl.this;
            mc0 c = uglVar.s().c();
            if (c != null) {
                uglVar.w(ocx.a(uglVar.l, null, null, false, list, b.C1288b.a((com.vk.movika.sdk.base.ui.c) c.a), null, false, false, null, null, null, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4194279));
            }
        }

        @Override // com.vk.movika.sdk.base.listener.l
        public final void g(String str) {
            cbx.a aVar = new cbx.a(str);
            ugl uglVar = ugl.this;
            ugl.i(uglVar, aVar);
            mc0 c = uglVar.s().c();
            if (c != null) {
                uglVar.w(ocx.a(uglVar.l, null, null, false, null, b.C1288b.a((com.vk.movika.sdk.base.ui.c) c.a), null, false, false, null, null, null, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4194287));
            }
        }

        @Override // com.vk.movika.sdk.base.listener.h
        public final void h(com.vk.movika.sdk.base.model.l lVar) {
            ugl uglVar = ugl.this;
            mc0 c = uglVar.s().c();
            if (c != null) {
                Chapter chapter = ((com.vk.movika.sdk.base.ui.c) c.a).i;
                if ((chapter != null ? chapter.g : null) == Chapter.Order.END) {
                    uglVar.f.d();
                }
            }
        }

        /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
        @Override // com.vk.movika.sdk.player.base.listener.PlaybackStateListener
        public final void i(PlaybackStateListener.PlaybackState playbackState) {
            ocx.c cVar;
            mc0 c;
            int i = c.$EnumSwitchMapping$0[playbackState.ordinal()];
            ugl uglVar = ugl.this;
            if (i != 1) {
                if (i == 2) {
                    cVar = ocx.c.b.a;
                }
                c = uglVar.s().c();
                if (c != null && ((mj80) c.b).q == PlaybackStateListener.PlaybackState.READY) {
                    uglVar.w(ocx.a(uglVar.l, null, null, false, null, b.C1288b.a((com.vk.movika.sdk.base.ui.c) c.a), null, false, false, null, null, null, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4194287));
                }
                if (playbackState == PlaybackStateListener.PlaybackState.READY && uglVar.s().c() != null) {
                    uglVar.z = null;
                }
                ((asg0) uglVar.m.getValue()).i(playbackState);
            }
            com.vk.movika.sdk.base.ui.c q = uglVar.q();
            if (q != null) {
                if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
                    com.vk.movika.sdk.utils.c.a(q, null);
                    Boolean bool = q.p.a;
                }
                if (!(q.p.a != null ? r1.booleanValue() : false)) {
                    cVar = ocx.c.d.a;
                }
            }
            cVar = ocx.c.C3448c.a;
            ocx.c cVar2 = cVar;
            ocx ocxVar = uglVar.l;
            Long k = uglVar.k();
            if (k == null) {
                k = uglVar.l.k;
            }
            uglVar.w(ocx.a(ocxVar, null, null, false, null, null, cVar2, false, false, null, k, null, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4193247));
            c = uglVar.s().c();
            if (c != null) {
                uglVar.w(ocx.a(uglVar.l, null, null, false, null, b.C1288b.a((com.vk.movika.sdk.base.ui.c) c.a), null, false, false, null, null, null, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4194287));
            }
            if (playbackState == PlaybackStateListener.PlaybackState.READY) {
                uglVar.z = null;
            }
            ((asg0) uglVar.m.getValue()).i(playbackState);
        }

        /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
        @Override // com.vk.movika.sdk.base.listener.d
        public final void j(Chapter chapter) {
            String str;
            TimelineThumbs B0;
            owo0 owo0Var;
            ugl uglVar = ugl.this;
            Chapter chapter2 = uglVar.l.b;
            if ((chapter2 != null ? chapter2.g : null) == Chapter.Order.END) {
                uglVar.x = chapter.g == Chapter.Order.SIMPLE;
                if (com.vk.movika.sdk.base.model.m.c(chapter)) {
                    uglVar.f.d();
                }
            }
            mc0 c = uglVar.s().c();
            if (c != null) {
                ugl.o(uglVar, c);
                dj00 dj00Var = uglVar.w;
                if (dj00Var == null || (str = (String) dj00Var.c.get(chapter.a)) == null) {
                    str = "";
                }
                VideoFile c2 = uglVar.e.c(str);
                if (c2 == null) {
                    asg0 asg0Var = (asg0) uglVar.m.getValue();
                    v43 v43Var = new v43(10, uglVar, str);
                    if (asg0Var.c == PlaybackStateListener.PlaybackState.READY) {
                        v43Var.invoke();
                    } else {
                        asg0Var.b = j5g.v0(v43Var, (Collection) asg0Var.b);
                    }
                    B0 = null;
                } else {
                    B0 = c2.B0();
                }
                ocx ocxVar = uglVar.l;
                com.vk.movika.sdk.base.model.t a = b.C1288b.a((com.vk.movika.sdk.base.ui.c) c.a);
                Long k = uglVar.k();
                if (k == null) {
                    k = uglVar.l.k;
                }
                Long l = k;
                if (B0 != null) {
                    int i = B0.b;
                    int i2 = B0.c;
                    int i3 = B0.d;
                    owo0Var = new owo0(i, i2, i3, B0.e / i3, B0.f, B0.i);
                } else {
                    owo0Var = null;
                }
                uglVar.w(ocx.a(ocxVar, null, chapter, false, null, a, null, false, false, null, l, owo0Var, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4191213));
            }
        }

        @Override // com.vk.movika.sdk.base.listener.c
        public final void l(com.vk.movika.sdk.base.model.f fVar) {
            ocx.c cVar;
            if (com.vk.movika.sdk.base.utils.d.c(fVar)) {
                ugl uglVar = ugl.this;
                mc0 c = uglVar.s().c();
                if (c != null) {
                    com.vk.movika.sdk.base.ui.c cVar2 = (com.vk.movika.sdk.base.ui.c) c.a;
                    Chapter chapter = cVar2.i;
                    if ((chapter != null ? chapter.g : null) == Chapter.Order.END) {
                        rfc a = fpf0.a(com.vk.movika.sdk.base.model.actions.c.class);
                        if (chapter != null) {
                            ArrayList arrayList = chapter.d;
                            List<com.vk.movika.sdk.base.model.j> b = chapter.b();
                            if (!(b instanceof Collection) || !b.isEmpty()) {
                                Iterator<T> it = b.iterator();
                                while (it.hasNext()) {
                                    if (fpf0.a(((com.vk.movika.sdk.base.model.j) it.next()).b.getClass()).equals(a)) {
                                        break;
                                    }
                                }
                            }
                            cor.a aVar = new cor.a(rli0.p(new i5g(arrayList), new c2(11)));
                            while (true) {
                                if (!aVar.hasNext()) {
                                    cor.a aVar2 = new cor.a(rli0.p(rli0.p(new i5g(arrayList), new wq3(10)), new y40(11)));
                                    while (aVar2.hasNext()) {
                                        if (fpf0.a(((com.vk.movika.sdk.base.model.j) aVar2.next()).b.getClass()).equals(a)) {
                                        }
                                    }
                                } else if (fpf0.a(((com.vk.movika.sdk.base.model.j) aVar.next()).b.getClass()).equals(a)) {
                                    break;
                                }
                            }
                            cVar = new ocx.c.a(true);
                            uglVar.w(ocx.a(uglVar.l, null, null, !ugl.e(uglVar, cVar2).isEmpty(), null, b.C1288b.a(cVar2), cVar, false, false, null, null, null, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4194251));
                        }
                    }
                    cVar = uglVar.l.f;
                    uglVar.w(ocx.a(uglVar.l, null, null, !ugl.e(uglVar, cVar2).isEmpty(), null, b.C1288b.a(cVar2), cVar, false, false, null, null, null, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4194251));
                }
            }
        }

        @Override // com.vk.movika.sdk.base.listener.h
        public final void m(com.vk.movika.sdk.base.model.l lVar) {
            ugl uglVar = ugl.this;
            mc0 c = uglVar.s().c();
            if (c != null) {
                uglVar.w(ocx.a(uglVar.l, null, null, false, null, b.C1288b.a((com.vk.movika.sdk.base.ui.c) c.a), null, false, false, null, null, null, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4194287));
            }
        }

        @Override // com.vk.movika.sdk.base.listener.j
        public final void o() {
            ugl uglVar = ugl.this;
            uglVar.w(ocx.a(uglVar.l, new ocx.b(false, false), null, false, null, null, new ocx.c.a(false), false, false, null, null, null, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4194266));
            mc0 c = uglVar.s().c();
            if (c != null) {
                ugl.o(uglVar, c);
            }
        }

        @Override // com.vk.movika.sdk.base.listener.o
        public final void s(boolean z) {
            ugl uglVar = ugl.this;
            mc0 c = uglVar.s().c();
            uglVar.w(ocx.a(uglVar.l, null, null, false, null, null, (c != null && ((mj80) c.b).q == PlaybackStateListener.PlaybackState.READY) ? z ? ocx.c.C3448c.a : ocx.c.d.a : uglVar.l.f, false, false, null, null, null, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4194271));
            uglVar.x(null);
            if (z) {
                return;
            }
            uglVar.i.a(uglVar);
        }

        @Override // com.vk.movika.sdk.base.listener.k
        public final void u(com.vk.movika.sdk.base.model.o oVar) {
            ugl uglVar = ugl.this;
            mc0 c = uglVar.s().c();
            if (c != null) {
                uglVar.w(ocx.a(uglVar.l, null, null, false, null, b.C1288b.a((com.vk.movika.sdk.base.ui.c) c.a), null, false, false, null, null, null, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4194287));
            }
        }

        @Override // com.vk.movika.sdk.base.listener.b
        public final void x(com.vk.movika.sdk.base.model.f fVar) {
            if (com.vk.movika.sdk.base.utils.d.c(fVar)) {
                ugl uglVar = ugl.this;
                mc0 c = uglVar.s().c();
                if (c != null) {
                    uglVar.w(ocx.a(uglVar.l, null, null, !ugl.e(uglVar, r2).isEmpty(), null, b.C1288b.a((com.vk.movika.sdk.base.ui.c) c.a), null, false, false, null, null, null, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, 4194283));
                }
            }
        }

        @Override // com.vk.movika.sdk.base.listener.h
        public final void n(com.vk.movika.sdk.base.model.l lVar) {
        }
    }
}
