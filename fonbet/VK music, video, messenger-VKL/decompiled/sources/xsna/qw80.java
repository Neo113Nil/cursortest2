package xsna;

import android.animation.ObjectAnimator;
import android.location.LocationManager;
import android.os.Parcelable;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.preference.Preference;
import com.unity3d.services.UnityAdsConstants;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.model.CameraBounds;
import com.vk.geo.impl.model.id.StringId;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.superapp.api.dto.app.WebSubscriptionInfo;
import com.vkontakte.android.fragments.videos.UploadedVideosFragment;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import xsna.jkv0.a;
import xsna.jkv0.b;
import xsna.l2l;
import xsna.myt0;
import xsna.o2z0;
import xsna.phg0;
import xsna.uee0;
import xsna.zgm0;
import xsna.zu50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class qw80 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.g, io.reactivex.rxjava3.functions.c, l2l.a, io.reactivex.rxjava3.functions.m, myt0.a, io.reactivex.rxjava3.core.s, Preference.b, o2z0.b, FunctionWithThrowable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qw80(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        boolean a;
        a = ru.mail.libverify.k.a.a((ru.mail.libverify.k.a) this.c, preference, obj);
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0088  */
    @Override // xsna.l2l.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(Object obj, Object obj2, rp70 rp70Var) {
        uee0 a;
        uee0 uee0Var;
        wce0 wce0Var = (wce0) this.c;
        uee0 uee0Var2 = (uee0) obj;
        xf9.d(xf9.e, uee0Var2.a, wce0Var);
        if (!rp70Var.f()) {
            CameraBounds cameraBounds = uee0Var2.a;
            Map d = sni.d(0, 3);
            Object obj3 = ((uee0) rp70Var.c()).c;
            Object[] objArr = rp70Var.a;
            int i = rp70Var.b;
            boolean z = true;
            for (int i2 = 0; i2 < i; i2++) {
                uee0 uee0Var3 = (uee0) objArr[i2];
                CameraBounds cameraBounds2 = uee0Var3.a;
                Map<StringId, do00> map = uee0Var3.b;
                Object obj4 = uee0Var3.c;
                d.putAll(map);
                if (cameraBounds2 != cameraBounds) {
                    xf9.e.h(cameraBounds2, wce0Var);
                }
                z = z && obj3 == obj4;
            }
            if (z) {
                AtomicInteger atomicInteger = uee0.d;
                a = uee0.a.a(cameraBounds, d, uee0Var2.c);
                uee0Var = wce0Var.d.l;
                if (uee0Var != null && uee0Var != uee0Var2) {
                    xf9.e.h(uee0Var.a, wce0Var);
                }
                if (a != null) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.LogType logType = L.LogType.d;
                        StringBuilder sb = new StringBuilder("geojson2 = ");
                        CameraBounds cameraBounds3 = a.a;
                        Parcelable.Creator<BoundingBox> creator = BoundingBox.CREATOR;
                        sb.append(cameraBounds3.geoJsonString(true));
                        L.u(l, logType, new Object[]{sb.toString()});
                    }
                    myc0.h(wce0Var.b, wce0Var.a, null, new vce0(wce0Var, a, null), 2);
                }
                return true;
            }
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l2, L.LogType.w, new Object[]{"PublishMarkersExecutor", "datasets are changed in transaction"});
            }
        }
        a = null;
        uee0Var = wce0Var.d.l;
        if (uee0Var != null) {
            xf9.e.h(uee0Var.a, wce0Var);
        }
        if (a != null) {
        }
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (List) ((zpb) this.c).invoke(obj, obj2);
    }

    @Override // xsna.myt0.a
    public void b() {
        jkv0 jkv0Var = (jkv0) this.c;
        View view = jkv0Var.a;
        float height = view.getHeight() + jkv0Var.b;
        if (jkv0Var.c) {
            height = -height;
        }
        view.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, height);
        ofFloat.addListener(jkv0Var.new b(4));
        ofFloat.addListener(jkv0Var.new a(jkv0Var.e));
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(jkv0.j);
        jkv0Var.g = ofFloat;
        ofFloat.start();
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (Pair) ((fli) this.c).invoke(obj, obj2, obj3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, xsna.cbx0] */
    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(final io.reactivex.rxjava3.core.r rVar) {
        final View view = (View) this.c;
        final ?? r1 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.cbx0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                boolean isShown = view.isShown();
                io.reactivex.rxjava3.core.r rVar2 = rVar;
                if (isShown) {
                    rVar2.onNext(Boolean.TRUE);
                } else {
                    rVar2.onNext(Boolean.FALSE);
                }
            }
        };
        view.getViewTreeObserver().addOnGlobalLayoutListener(r1);
        rVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.dbx0
            @Override // io.reactivex.rxjava3.functions.e
            public final void cancel() {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(r1);
            }
        });
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        UploadedVideosFragment uploadedVideosFragment = (UploadedVideosFragment) this.c;
        int i = UploadedVideosFragment.n1;
        uploadedVideosFragment.getClass();
        return obj instanceof paq0;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (rw80) ((h2s) this.c).c;
            case 1:
                return (Boolean) ((i0r) this.c).invoke(obj);
            case 2:
            case 4:
            case 5:
            case 8:
            case 10:
            case 16:
            case 20:
            default:
                return io.appmetrica.analytics.location.impl.u.a((io.appmetrica.analytics.location.impl.u) this.c, (LocationManager) obj);
            case 3:
                return (k9d0) ((gda0) this.c).invoke(obj);
            case 6:
                return (s3q0) ((gda0) this.c).invoke(obj);
            case 7:
                return (phg0.c) ((i0r) this.c).invoke(obj);
            case 9:
                return (c3m0) ((zgm0.b) this.c).invoke(obj);
            case 11:
                return (Boolean) ((lf5) this.c).invoke(obj);
            case 12:
                return (VideoAutoPlay.e) ((es2) this.c).invoke(obj);
            case 13:
                return (sfs0) ((gda0) this.c).invoke(obj);
            case 14:
                return (Pair) ((xd60) this.c).invoke(obj);
            case 15:
                return (io.reactivex.rxjava3.core.t) ((i0r) this.c).invoke(obj);
            case 17:
                return (WebSubscriptionInfo) ((z4t0) this.c).c;
            case 18:
                return (ncq0) ((z4t0) this.c).invoke(obj);
            case 19:
                return (Boolean) ((z4t0) this.c).invoke(obj);
            case 21:
                return (Boolean) ((nkh) this.c).invoke(obj);
        }
    }

    @Override // xsna.o2z0.b
    public void a(boolean z) {
        zu50.d dVar;
        dhy0 dhy0Var = (dhy0) this.c;
        if (!z || (dVar = dhy0Var.i.b.i) == null) {
            return;
        }
        dVar.a();
    }
}
