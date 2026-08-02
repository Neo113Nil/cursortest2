package xsna;

import androidx.camera.core.impl.f;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.preference.Preference;
import com.vk.cameraui.impl.a;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.masks.Mask;
import com.vk.dto.stories.model.GifWithQueryData;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.voip.ui.groupcalls.grid.GroupCallGridContainerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import kotlin.Pair;
import xsna.as9;
import xsna.ea9;
import xsna.hlw;
import xsna.jms0;
import xsna.pf60;
import xsna.qav;
import xsna.qdd;
import xsna.snw;
import xsna.ub9;
import xsna.ugw;
import xsna.xn60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class vx6 implements io.reactivex.rxjava3.functions.l, Preference.b, jms0.a, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.c, iy3, dwp, hlw.a, SwipeDrawableRefreshLayout.g {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vx6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        o2l o2lVar = o2l.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o2lVar.getClass();
        o2l.h("__dbg_knet_detailed_log", booleanValue);
        enj.r(debugDevSettingsFragment.mo2getContext(), "Please restart the app!", 0);
        return true;
    }

    @Override // xsna.jms0.a
    public void a(VideoFrameProcessingException videoFrameProcessingException) {
        e840 e840Var = e840.this;
        e840Var.f.execute(new kw6(6, e840Var, videoFrameProcessingException));
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (jsj) ((pd) obj2).invoke(obj);
            case 1:
                return (ea9.a) ((pl2) obj2).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.t) ((nj) obj2).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.t) ((a.g) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.t) ((d05) obj2).invoke(obj);
            case 5:
                return (Pair) ((z90) obj2).invoke(obj);
            case 6:
            case 9:
            case 10:
            case 13:
            case 15:
            case 17:
            case 18:
            case 20:
            case 22:
            case 24:
            case 25:
            default:
                return (Boolean) ((lyb0) obj2).invoke(obj);
            case 7:
                return ((qdd.a) obj2).invoke(obj);
            case 8:
                return (vqt) ((pd) obj2).invoke(obj);
            case 11:
                return (com.vk.im.engine.models.dialogs.c) ((x2e) obj2).invoke(obj);
            case 12:
                return (Optional) ((x2e) obj2).invoke(obj);
            case 14:
                return (GifWithQueryData) ((x2e) obj2).invoke(obj);
            case 16:
                return (qav.b) ((d05) obj2).invoke(obj);
            case 19:
                return (List) ((x2e) obj2).invoke(obj);
            case 21:
                int i2 = MasksWrap.e0;
                return (Mask) ((kpr) obj2).invoke(obj);
            case 23:
                return (g4p) ((kpr) obj2).invoke(obj);
            case 26:
                return (vqt) ((w910) obj2).invoke(obj);
            case 27:
                return (io.reactivex.rxjava3.core.t) ((w910) obj2).invoke(obj);
            case 28:
                return (Boolean) ((kpr) obj2).invoke(obj);
        }
    }

    @Override // xsna.dwp
    public void b(IOException iOException) {
        lfx.c((zpa0) this.c, iOException);
    }

    @Override // xsna.hlw.a
    public void d(hlw hlwVar) {
        alw alwVar;
        pi20 pi20Var = (pi20) this.c;
        synchronized (pi20Var.a) {
            if (pi20Var.d) {
                return;
            }
            int i = 0;
            do {
                try {
                    alwVar = hlwVar.b();
                    if (alwVar != null) {
                        i++;
                        pi20Var.i.put(alwVar.B().getTimestamp(), alwVar);
                        pi20Var.j();
                    }
                } catch (IllegalStateException unused) {
                    alwVar = null;
                }
                if (alwVar == null) {
                    break;
                }
            } while (i < hlwVar.e());
        }
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        NewsfeedCustomFragment2 newsfeedCustomFragment2 = (NewsfeedCustomFragment2) this.c;
        qcy<Object>[] qcyVarArr = NewsfeedCustomFragment2.r0;
        ((te60) newsfeedCustomFragment2.V.getValue()).a(new pf60.d(xn60.d.b.b));
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((pl2) this.c).invoke(obj)).booleanValue();
    }

    public /* synthetic */ vx6(ugw ugwVar, ugw.g gVar) {
        this.b = 17;
        this.c = ugwVar;
    }

    public /* synthetic */ vx6(lfx lfxVar, zpa0 zpa0Var) {
        this.b = 18;
        this.c = zpa0Var;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 15:
                int i2 = GroupCallGridContainerView.i;
                return (Boolean) ((f6g) obj3).invoke(obj, obj2);
            case 20:
                return (vr00) ((bv4) obj3).invoke(obj, obj2);
            default:
                return (Pair) ((bv4) obj3).invoke(obj, obj2);
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public ugz apply(Object obj) {
        zr9 v;
        final ugw ugwVar = (ugw) this.c;
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        String str = null;
        if (ugwVar.v != null) {
            if (ugwVar.s) {
                v = ugwVar.v(as9.a());
                if (((as9.a) v).a.size() > 1) {
                    return new snw.a(new IllegalArgumentException("Software JPEG not supported with CaptureBundle size > 1."));
                }
            } else {
                v = ugwVar.v(null);
            }
            if (v == null) {
                return new snw.a(new IllegalArgumentException("ImageCapture cannot set empty CaptureBundle."));
            }
            if (((as9.a) v).a.size() > ugwVar.q) {
                return new snw.a(new IllegalArgumentException("ImageCapture has CaptureStages > Max CaptureStage size"));
            }
            ugwVar.v.f(v);
            str = ugwVar.v.o;
        } else {
            v = ugwVar.v(as9.a());
            if (((as9.a) v).a.size() > 1) {
                return new snw.a(new IllegalArgumentException("ImageCapture have no CaptureProcess set with CaptureBundle size > 1."));
            }
        }
        for (final androidx.camera.core.impl.g gVar : ((as9.a) v).a) {
            final f.a aVar = new f.a();
            androidx.camera.core.impl.f fVar = ugwVar.o;
            aVar.c = fVar.c;
            aVar.c(fVar.b);
            aVar.a(Collections.unmodifiableList(ugwVar.t.f));
            aVar.a.add(ugwVar.x);
            if (((chw) m6m.a.a(chw.class)) == null) {
                aVar.b.C(androidx.camera.core.impl.f.g, 0);
            } else {
                androidx.camera.core.impl.a aVar2 = androidx.camera.core.impl.f.g;
            }
            aVar.b.C(androidx.camera.core.impl.f.h, 0);
            aVar.c(gVar.a().b);
            if (str != null) {
                aVar.f.a.put(str, 0);
            }
            aVar.b(ugwVar.w);
            arrayList.add(ub9.a(new ub9.c(ugwVar, aVar, arrayList2, gVar) { // from class: xsna.pgw
                public final /* synthetic */ f.a b;
                public final /* synthetic */ ArrayList c;
                public final /* synthetic */ androidx.camera.core.impl.g d;

                {
                    this.b = aVar;
                    this.c = arrayList2;
                    this.d = gVar;
                }

                @Override // xsna.ub9.c
                public final Object attachCompleter(ub9.a aVar3) {
                    ygw ygwVar = new ygw(aVar3);
                    f.a aVar4 = this.b;
                    aVar4.b(ygwVar);
                    this.c.add(aVar4.d());
                    return "issueTakePicture[stage=0]";
                }
            }));
        }
        ugwVar.b().b(arrayList2);
        sez sezVar = new sez(new ArrayList(arrayList), true, xo9.g());
        or orVar = new or(17);
        return r0t.g(sezVar, new t98(orVar), xo9.g());
    }
}
