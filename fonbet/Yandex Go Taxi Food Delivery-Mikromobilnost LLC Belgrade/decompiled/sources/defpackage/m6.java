package defpackage;

import android.media.Image;
import android.net.Uri;
import android.util.Log;
import android.util.Range;
import android.view.View;
import androidx.camera.camera2.internal.b;
import androidx.compose.ui.unit.LayoutDirection;
import com.adjust.sdk.OnDeferredDeeplinkResponseListener;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.overlay.BottomSheetFlexOverlayController;
import com.yandex.go.address.address_map_picker.domain.e;
import com.yandex.go.address.address_map_picker.domain.g;
import com.yandex.go.address.address_map_picker.navigation.f;
import com.yandex.go.payments.shared.business.accountcreation.BusinessAccountCreationView;
import com.yandex.go.pickup_from_photo.api.PickupFromPhotoEntryPointAnalytics$EntryPointScreen;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;
import com.yandex.messaging.internal.view.timeline.c;
import com.yandex.messaging.internal.view.timeline.d;
import com.yandex.messaging.views.AppCompatEmojiTextView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import ru.rt.ebs.cryptosdk.presentation.base.BaseFragment;
import ru.yandex.taxi.preorder.source.pickup.a;
import ru.yandex.taxi.preorder.summary.selector.verticals.bold.BoldVerticalsView;
import ru.yandextaxi.flutter_yandex_mapkit.helper.PlatformExceptionWrapper;

/* loaded from: classes15.dex */
public final /* synthetic */ class m6 implements ev31, ims, vl00, cx4, OnDeferredDeeplinkResponseListener, qvc, j43, bx60, b2c, k8x, nl21, w3x, ca20, aee0, pi, ek6, dnu0, el7, aa3, odv {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.nl21
    public void B(o0k o0kVar) {
        iv31 iv31Var = ((c) this.b).x1;
        String string = iv31Var.d().getString(oyh0.forwarded_message);
        ((AppCompatEmojiTextView) iv31Var.a()).setText(String.format(string, Arrays.copyOf(new Object[]{nlb1.a(o0kVar.a, string, string.length())}, 1)));
    }

    @Override // defpackage.k8x
    public void a(int i, ByteBuffer byteBuffer) {
        try {
            ((i8x) this.b).a(i, byteBuffer);
        } catch (Throwable th) {
            Log.e("jni_method_handler", "error in channel: 1, method: " + i, th);
        }
    }

    @Override // defpackage.ims
    /* renamed from: apply */
    public euy mo104apply(Object obj) {
        an7 an7Var = (an7) this.b;
        if (!Boolean.TRUE.equals((Boolean) obj)) {
            return hiv.c;
        }
        long j = an7Var.g;
        ScheduledExecutorService scheduledExecutorService = an7Var.c;
        b bVar = an7Var.d;
        long j2 = j / 1000000;
        cn7 cn7Var = new cn7(new vm7(1));
        bVar.r(cn7Var);
        nm7 nm7Var = new nm7(4, bVar, cn7Var);
        androidx.camera.core.impl.utils.executor.b bVar2 = bVar.c;
        gl7 gl7Var = cn7Var.b;
        gl7Var.b.c(nm7Var, bVar2);
        return jx81.r(new e5h(gl7Var, scheduledExecutorService, j2, 1));
    }

    @Override // defpackage.j43
    public int b(int i, LayoutDirection layoutDirection) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 8:
                return ((to5) obj).a(0, i);
            default:
                return ((so5) obj).a(0, i, layoutDirection);
        }
    }

    @Override // defpackage.aee0
    public oeq0 c(int i) {
        oeq0 lambda$0$0$0;
        lambda$0$0$0 = BoldVerticalsView.lambda$0$0$0((BoldVerticalsView) this.b, i);
        return lambda$0$0$0;
    }

    @Override // defpackage.dnu0
    public void d(String str, ArrayList arrayList) {
        BusinessAccountCreationView.setupStories$lambda$0((BusinessAccountCreationView) this.b, arrayList, str);
    }

    @Override // defpackage.b2c
    public void e() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 13:
                ((com.yandex.messaging.internal.view.timeline.b) obj).n0();
                break;
            default:
                ((d) obj).n0();
                break;
        }
    }

    @Override // defpackage.cx4
    public void g() {
        w71 w71Var = (w71) this.b;
        ((umb0) w71Var.F).b(PickupFromPhotoEntryPointAnalytics$EntryPointScreen.SUGGEST);
        w71Var.r(new j01(11));
    }

    @Override // defpackage.vl00
    public void h(CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z) {
        ru.yandex.taxi.map.overlay.pickup.d dVar;
        e eVar = ((f) this.b).M;
        com.yandex.go.address.address_map_picker.domain.f fVar = eVar.d;
        if (fVar == null) {
            return;
        }
        g gVar = fVar.a;
        if (cameraUpdateReason == CameraUpdateReason.APPLICATION) {
            return;
        }
        if (!z) {
            eVar.i = false;
            a aVar = gVar.b;
            ah00 ah00Var = gVar.c;
            wpb0 h = aVar.h(ah00Var, ((gh00) ah00Var).e.b(), false);
            ru.yandex.taxi.map.overlay.pickup.d dVar2 = gVar.e;
            if (h != null) {
                if (dVar2 != null) {
                    dVar2.Jg(h);
                    return;
                }
                return;
            } else {
                if (dVar2 != null) {
                    dVar2.Mg();
                    return;
                }
                return;
            }
        }
        ru.yandex.taxi.map.overlay.pickup.d dVar3 = gVar.e;
        if (dVar3 != null) {
            dVar3.Mg();
        }
        a aVar2 = gVar.b;
        ah00 ah00Var2 = gVar.c;
        aVar2.getClass();
        boolean b = a.b(ah00Var2);
        ru.yandex.taxi.map.overlay.pickup.d dVar4 = gVar.e;
        if (b) {
            if (dVar4 != null && !dVar4.Kg() && (dVar = gVar.e) != null) {
                dVar.Pg(aVar2.o);
            }
        } else if (dVar4 != null) {
            dVar4.Ig();
        }
        if (eVar.h) {
            eVar.i = true;
        } else {
            eVar.c();
        }
    }

    @Override // defpackage.el7
    public Object j(androidx.concurrent.futures.b bVar) {
        euy euyVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 25:
                b bVar2 = (b) obj;
                try {
                    bVar2.c.execute(new fm7(bVar2, bVar, 1));
                    return "isRepeatingRequestAvailable";
                } catch (RejectedExecutionException unused) {
                    bVar.d(new RuntimeException("Unable to check if repeating request is available. Camera executor shut down."));
                    return "isRepeatingRequestAvailable";
                }
            default:
                androidx.camera.core.e eVar = (androidx.camera.core.e) obj;
                eVar.n.d();
                us7 us7Var = eVar.a;
                synchronized (us7Var.a) {
                    try {
                        boolean isEmpty = us7Var.b.isEmpty();
                        euy euyVar2 = us7Var.d;
                        euy euyVar3 = euyVar2;
                        euy euyVar4 = euyVar2;
                        if (!isEmpty) {
                            if (euyVar2 == null) {
                                androidx.concurrent.futures.b bVar3 = new androidx.concurrent.futures.b();
                                bVar3.c = new hsj0();
                                gl7 gl7Var = new gl7(bVar3);
                                bVar3.b = gl7Var;
                                bVar3.a = x4e.class;
                                try {
                                    synchronized (us7Var.a) {
                                        us7Var.e = bVar3;
                                    }
                                    bVar3.a = "CameraRepository-deinit";
                                } catch (Exception e) {
                                    gl7Var.a(e);
                                }
                                us7Var.d = gl7Var;
                                euyVar4 = gl7Var;
                            }
                            us7Var.c.addAll(us7Var.b.values());
                            for (br7 br7Var : us7Var.b.values()) {
                                br7Var.release().c(new nm7(10, us7Var, br7Var), geb1.b());
                            }
                            us7Var.b.clear();
                            euyVar = euyVar4;
                        } else if (euyVar2 == null) {
                            euyVar3 = hiv.c;
                        }
                    } finally {
                    }
                }
                euyVar.c(new nm7(11, eVar, bVar), eVar.d);
                return "CameraX shutdownInternal";
        }
    }

    @Override // com.adjust.sdk.OnDeferredDeeplinkResponseListener
    public boolean launchReceivedDeeplink(Uri uri) {
        return ru.yandex.taxi.analytics.c.b((u6) this.b, uri);
    }

    @Override // defpackage.pi
    public boolean o(View view, hi hiVar) {
        boolean lambda$onBottomSheetStateChanged$0;
        lambda$onBottomSheetStateChanged$0 = ((BottomSheetDragHandleView) this.b).lambda$onBottomSheetStateChanged$0(view, hiVar);
        return lambda$onBottomSheetStateChanged$0;
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        n751 insetsListener$lambda$1;
        n751 insetsListener$lambda$20;
        n751 showOverlay$lambda$4;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 12:
                insetsListener$lambda$1 = BaseFragment.setInsetsListener$lambda$1((BaseFragment) obj, view, n751Var);
                return insetsListener$lambda$1;
            case 20:
                insetsListener$lambda$20 = BottomSheetDialogView.setInsetsListener$lambda$20((BottomSheetDialogView) obj, view, n751Var);
                return insetsListener$lambda$20;
            default:
                showOverlay$lambda$4 = BottomSheetFlexOverlayController.showOverlay$lambda$4((qf6) obj, view, n751Var);
                return showOverlay$lambda$4;
        }
    }

    @Override // defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        k45 k45Var = (k45) this.b;
        try {
            k45Var.onMethodCall(x920Var, da20Var);
        } catch (PlatformExceptionWrapper e) {
            ((ba20) da20Var).error(k45Var.getClass().getSimpleName(), ljo.b(e.getCause()), e.getErrorDetails());
        } catch (Throwable th) {
            ((ba20) da20Var).error(k45Var.getClass().getSimpleName(), ljo.b(th), null);
        }
    }

    @Override // defpackage.ev31
    public Object q(Object obj) {
        e5 e5Var = (e5) this.b;
        h6 h6Var = (h6) obj;
        ArrayList arrayList = h6Var.a;
        Integer num = h6Var.c;
        lbv lbvVar = num != null ? new lbv(num.intValue()) : null;
        ((h5) e5Var).getClass();
        return new n6(arrayList, lbvVar, null);
    }

    @Override // defpackage.odv
    public void r(pdv pdvVar) {
        Image f;
        z38 z38Var = (z38) this.b;
        synchronized (z38Var.a) {
            try {
                if (z38Var.d) {
                    return;
                }
                jdv w = pdvVar.w();
                if (w != null && (f = w.f()) != null) {
                    if (z38Var.g) {
                        long j = z38Var.h;
                        if (j != -1) {
                            f.setTimestamp(j);
                        }
                    }
                    z38Var.b.queueInputImage(f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ims
    /* renamed from: apply */
    public Object mo104apply(Object obj) {
        Range range = (Range) this.b;
        kf61 kf61Var = (kf61) obj;
        return new y64(kf61Var.d(), ((Float) range.getUpper()).floatValue(), ((Float) range.getLower()).floatValue(), g70.C(kf61Var.d(), ((Float) range.getLower()).floatValue(), ((Float) range.getUpper()).floatValue()));
    }
}
