package defpackage;

import android.content.Intent;
import androidx.camera.camera2.internal.s;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.EnhancedIntentService;
import com.yandex.go.dynamic.api.DynamicFeature;
import com.yandex.go.superapp.api.repository.SuperAppRecenterPointRepository$Type;
import com.yandex.go.superapp.order_tracking.eats.presentation.navigation.j;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.card.api.RetrofitProvider$Type;
import com.ybsdk.feature.pin.internal.domain.PinState;
import com.ybsdk.feature.pin.internal.screens.checkpin.CheckPinFragment;
import com.ybsdk.feature.pin.internal.screens.checkpin.CheckType;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.rconfig.configs.PinNfcActionButton;
import com.ybsdk.rconfig.configs.PinNfcActionButtonConfig;
import com.ybsdk.rconfig.model.ThemedImage;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.function.Consumer;
import kotlin.Pair;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.discovery.b;
import ru.yandex.taxi.order.state.checkin.CheckInStateView;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.view.a;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.video.m3.player.impl.source.CachedDataSourceFactory;

/* loaded from: classes3.dex */
public final /* synthetic */ class e90 implements y80, dx4, gpg, aa3, lzd, eps0, ev31, ly60, ruy, suy, ynw0, iy60, sfn, wx60, s4p {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e90(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.lzd
    public void a(x34 x34Var) {
        a48 a48Var = (a48) this.b;
        szd szdVar = (szd) this.c;
        a48Var.a.t(x34Var, szdVar.e(x34Var), szdVar.f(x34Var));
    }

    @Override // defpackage.aa3
    public euy apply(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 4:
                s sVar = (s) obj3;
                sVar.close();
                ((iiv) obj2).a();
                return sVar.release();
            default:
                return jx81.r(new e5h((gl7) obj2, ((gn7) obj3).c, 3000L, 1));
        }
    }

    @Override // defpackage.sfn
    public tpr b() {
        lfn lfnVar = (lfn) this.b;
        ufn ufnVar = (ufn) this.c;
        lfnVar.G.d(Collections.singletonList(SuperAppRecenterPointRepository$Type.EATS));
        return e.t(new j(lfnVar.F.v, ufnVar));
    }

    @Override // defpackage.gpg
    public hpg c() {
        hpg provideCacheWriteDataSinkFactory;
        provideCacheWriteDataSinkFactory = ((CachedDataSourceFactory) this.b).provideCacheWriteDataSinkFactory((ra7) this.c);
        return provideCacheWriteDataSinkFactory;
    }

    @Override // defpackage.ynw0
    public void d(xnw0 xnw0Var) {
        ((DefaultSurfaceProcessor) this.b).lambda$onInputSurface$0((znw0) this.c, xnw0Var);
    }

    @Override // defpackage.suy
    public void e(Object obj, hfr hfrVar) {
        j42 j42Var = (j42) obj;
        j42Var.onEvents((zxc0) this.c, new i42(hfrVar, ((j5h) this.b).x));
    }

    public void f() {
        pzt0 pzt0Var = (pzt0) this.b;
        b bVar = (b) this.c;
        pzt0Var.a(null);
        ModalView modalView = bVar.D;
        if (modalView != null) {
            bVar.z.l(modalView);
            bVar.D = null;
        }
    }

    public void g(as7 as7Var) {
        cs7 cs7Var = (cs7) this.b;
        n2v0 n2v0Var = (n2v0) this.c;
        cs7Var.a = false;
        n2v0Var.h(as7Var);
    }

    public t0k0 h(RetrofitProvider$Type retrofitProvider$Type) {
        yvf0 yvf0Var = (yvf0) this.b;
        yvf0 yvf0Var2 = (yvf0) this.c;
        int i = gf8.a[retrofitProvider$Type.ordinal()];
        if (i == 1) {
            return (t0k0) yvf0Var.get();
        }
        if (i == 2) {
            return (t0k0) yvf0Var2.get();
        }
        w511.b();
        return null;
    }

    @Override // defpackage.ruy
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 12:
                ((j42) obj).onCues((h42) obj3, (List) obj2);
                break;
            case 13:
                ((j42) obj).onDeviceInfoChanged((h42) obj3, (xaj) obj2);
                break;
            case 14:
                h42 h42Var = (h42) obj3;
                do31 do31Var = (do31) obj2;
                j42 j42Var = (j42) obj;
                j42Var.onVideoSizeChanged(h42Var, do31Var);
                j42Var.onVideoSizeChanged(h42Var, do31Var.a, do31Var.b, 0, do31Var.c);
                break;
            case 15:
                ((j42) obj).onCues((h42) obj3, (rdf) obj2);
                break;
            case 16:
            default:
                ((j42) obj).onMetadata((h42) obj3, (w820) obj2);
                break;
            case 17:
                ((j42) obj).onPlaybackParametersChanged((h42) obj3, (lxc0) obj2);
                break;
            case 18:
                ((j42) obj).onTracksChanged((h42) obj3, (r801) obj2);
                break;
            case 19:
                ((j42) obj).onTrackSelectionParametersChanged((h42) obj3, (r001) obj2);
                break;
            case 20:
                ((j42) obj).onAvailableCommandsChanged((h42) obj3, (vxc0) obj2);
                break;
            case 21:
                ((j42) obj).onAudioAttributesChanged((h42) obj3, (ue3) obj2);
                break;
        }
    }

    @Override // defpackage.y80
    public boolean n(String str) {
        g90 g90Var = (g90) this.b;
        Consumer consumer = (Consumer) this.c;
        g90Var.a.b(str);
        consumer.accept(str);
        return true;
    }

    @Override // defpackage.dx4
    public void o(a aVar, pv0 pv0Var) {
        PointType pointType;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 2:
                ((w71) obj2).r(new v5(10, (s71) obj, pv0Var));
                break;
            default:
                gai gaiVar = (gai) obj2;
                hki hkiVar = (hki) obj;
                dyh dyhVar = gaiVar.O;
                if (!(hkiVar instanceof gki)) {
                    if (!(hkiVar instanceof fki)) {
                        w511.b();
                        break;
                    } else {
                        pointType = PointType.DESTINATION;
                    }
                } else {
                    pointType = PointType.SOURCE;
                }
                bhh bhhVar = new bhh(15, gaiVar);
                dyhVar.getClass();
                Pair a = dyh.a(pv0Var, pointType, bhhVar);
                gaiVar.E((m950) gaiVar.N.get(), (m41) a.getFirst(), (k41) a.getSecond(), hxx.a);
                break;
        }
    }

    @Override // defpackage.wx60
    public void onComplete(Task task) {
        ((EnhancedIntentService) this.b).lambda$onStartCommand$1((Intent) this.c, task);
    }

    @Override // defpackage.iy60
    public void onFailure(Exception exc) {
        com.yandex.go.dynamic.impl.b bVar = (com.yandex.go.dynamic.impl.b) this.b;
        DynamicFeature dynamicFeature = (DynamicFeature) this.c;
        g7n g7nVar = bVar.c;
        String id = dynamicFeature.getId();
        pj pjVar = g7nVar.a;
        pjVar.getClass();
        HashMap hashMap = new HashMap();
        if (id != null) {
            hashMap.put("id", id);
        }
        pjVar.a.a("DynamicFeature.Prefetch.Error", hashMap, 1, new HashMap());
        xby.l(jst.e, "DynamicFeature.Prefetch.Error", null, exc, id, 2);
    }

    @Override // defpackage.eps0
    public void p(int i, long j) {
        CheckInStateView.applyCheckInActionButtons$lambda$2((CheckInStateView) this.b, (yfb) this.c, i, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01f6, code lost:
    
        if (r0.isEnabled() != false) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.ybsdk.core.utils.text.Text] */
    @Override // defpackage.ev31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q(Object obj) {
        Text text;
        boolean z;
        PinState pinState;
        int i;
        jbs0 jbs0Var;
        n760 n760Var;
        com.ybsdk.core.utils.text.b bVar;
        int i2;
        CheckPinFragment.CheckPinScreenParams checkPinScreenParams = (CheckPinFragment.CheckPinScreenParams) this.b;
        bwb0 bwb0Var = (bwb0) this.c;
        phb phbVar = (phb) obj;
        CheckType checkType = checkPinScreenParams.getCheckType();
        khb khbVar = khb.c;
        khb khbVar2 = khb.b;
        khb khbVar3 = khb.a;
        khb khbVar4 = khb.d;
        boolean z2 = phbVar.c;
        ykb1 ykb1Var = phbVar.g;
        com.ybsdk.rconfig.b bVar2 = bwb0Var.a;
        wzb0 wzb0Var = phbVar.i;
        utb0 utb0Var = null;
        if (wzb0Var == null) {
            int i3 = uhb.a[checkType.ordinal()];
            if (i3 == 1 || i3 == 2 || i3 == 3) {
                text = Text.Empty.INSTANCE;
            } else {
                if (i3 == 4) {
                    bVar = Text.Companion;
                    i2 = dzh0.ybsdk_pin_biometric_title;
                } else {
                    if (i3 != 5) {
                        w511.b();
                        return null;
                    }
                    bVar = Text.Companion;
                    i2 = dzh0.ybsdk_pin_change_pin_title;
                }
                text = unr0.h(bVar, i2);
            }
        } else {
            text = Text.Empty.INSTANCE;
        }
        Text text2 = text;
        int length = phbVar.f.length();
        boolean z3 = ykb1Var instanceof nhb;
        if (z3) {
            pinState = PinState.NORMAL;
            z = true;
        } else {
            z = true;
            if (ykb1Var instanceof ohb) {
                pinState = ((ohb) ykb1Var).c() instanceof CancellationException ? PinState.NORMAL : PinState.ERROR;
            } else if (jl40.l(ykb1Var, khbVar3)) {
                pinState = PinState.LOADING;
            } else if (jl40.l(ykb1Var, khbVar2)) {
                pinState = PinState.LOADING;
            } else if (jl40.l(ykb1Var, khbVar)) {
                pinState = PinState.SUCCESS;
            } else {
                if (!jl40.l(ykb1Var, khbVar4)) {
                    w511.b();
                    return null;
                }
                pinState = PinState.NORMAL;
            }
        }
        nwb0 nwb0Var = new nwb0(length, pinState);
        Text text3 = phbVar.e;
        if (text3 == null) {
            text3 = vhb.a(phbVar, checkType);
        }
        if (jl40.l(ykb1Var, khbVar)) {
            i = ung0.ybColor_textIcon_positive;
        } else {
            if (!jl40.l(ykb1Var, khbVar3) && !jl40.l(ykb1Var, khbVar2) && !jl40.l(ykb1Var, khbVar4) && !(ykb1Var instanceof ohb)) {
                w511.b();
                return null;
            }
            i = ung0.ybColor_textIcon_secondary;
        }
        uju ujuVar = new uju(text3, i);
        boolean z4 = (phbVar.h == null || !((jl40.l(ykb1Var, khbVar4) || (ykb1Var instanceof ohb)) && checkType.isEnterOrValidateOnReturn$feature_pin_release())) ? false : z;
        boolean z5 = phbVar.k;
        ohb ohbVar = ykb1Var instanceof ohb ? (ohb) ykb1Var : null;
        kao a = r501.a(ohbVar != null ? ohbVar.c() : null, z3 ? null : new Text.Resource(dzh0.ybsdk_pin_seems_like_you_forgot_code), z3 ? null : new Text.Resource(dzh0.ybsdk_pin_you_have_to_log_in_again), z3 ? null : new Text.Resource(dzh0.ybsdk_pin_set_new_code), null, null, null, null, null, null, null, null, null, 65506);
        boolean z6 = phbVar.a;
        boolean z7 = phbVar.b;
        if (wzb0Var == null) {
            jbs0Var = null;
        } else {
            rbv rbvVar = wzb0Var.c;
            Text.Constant constant = wzb0Var.a;
            if (z2) {
                ?? r9 = wzb0Var.b;
                jbs0Var = new jbs0(r9 == 0 ? constant : r9, 6, l1i0.Widget_YB_Text_Caption1_Regular, 24, rbvVar);
            } else {
                jbs0Var = new jbs0(constant, 8, l1i0.Widget_YB_Text_Body3, 28, rbvVar);
            }
        }
        boolean z8 = !checkType.isEnterOrValidateOnReturn$feature_pin_release();
        boolean z9 = (z2 && ((CommonFeatureFlag) bVar2.d(wlp.k0).getData()).isEnabled()) ? z : false;
        PinNfcActionButtonConfig pinNfcActionButtonConfig = (PinNfcActionButtonConfig) bVar2.d(lxb0.a).getData();
        PinNfcActionButton button = pinNfcActionButtonConfig.getButton();
        if (button != null) {
            String title = button.getTitle();
            String action = button.getAction();
            ThemedImage icon = button.getIcon();
            String light = icon.getLight();
            String dark = icon.getDark();
            rev revVar = rev.f;
            ccv ccvVar = null;
            n760Var = new n760(title, action, fob1.a(new pbv(light, (ccv) null, revVar, ccvVar, (vfv) null, 58), new pbv(dark, ccvVar, revVar, (dcv) null, (vfv) null, 58)));
        }
        n760Var = null;
        if (n760Var != null) {
            if (!phbVar.d) {
                n760Var = null;
            }
            if (n760Var != null) {
                utb0Var = new utb0(n760Var.a, n760Var.b, n760Var.c);
            }
        }
        return new thb(text2, nwb0Var, ujuVar, z4, z6, z7, a, jbs0Var, z8, z9, z5, utb0Var);
    }
}
