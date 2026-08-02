package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.ActionMode;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.text.contextmenu.internal.b;
import com.yandex.div.legacy.view.DivView;
import com.yandex.go.navigator.alt_select.AltSelectModalView;
import com.yandex.go.payments.shared.y;
import com.yandex.go.quark.ai_assistant.impl.ui.AiAssistantModalView;
import com.yandex.go.taxi.order.communications.e;
import com.yandex.go.taxi.order.feedback.after.ui.AfterFeedbackInfoModalView;
import com.yandex.go.taxi.order.util.accordion.AccordionComponent;
import com.yandex.mapkit.offline_cache.internal.BackgroundDownloadInitializer;
import com.ybsdk.core.design.widget.SlideableModalView;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import ru.yandex.taxi.altpins.confirmation_screen.modal.AlternativeDestinationModalView;
import ru.yandex.taxi.altpins.source.modal.AlternativeSourceModalView;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.order.back.BackButtonView;
import ru.yandex.taxi.order.view.AllRatingReasonsView;
import ru.yandex.taxi.preorder.source.domain.s;
import ru.yandex.taxi.search.presenter.f;
import ru.yandex.taxi.widget.BackButton;

/* loaded from: classes13.dex */
public final /* synthetic */ class jg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jg(o8g0 o8g0Var, boolean z) {
        this.a = 23;
        this.b = o8g0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0196 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ViewGroup viewGroup;
        int i;
        boolean z;
        boolean z2;
        int i2 = this.a;
        boolean z3 = false;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ((View) ((ng) obj).d.getValue()).performAccessibilityAction(64, null);
                break;
            case 1:
                AccordionComponent.collapseAnimated$lambda$0((AccordionComponent) obj);
                break;
            case 2:
                ((y) ((fl) obj).c.x.b.b).d();
                break;
            case 3:
                ((y) ((xl) obj).x.b.a).d();
                break;
            case 4:
                cm cmVar = (cm) obj;
                vnr0 vnr0Var = cmVar.y;
                bm bmVar = cmVar.w;
                String str = bmVar.a.b().a;
                y9p y9pVar = vnr0Var.l;
                String k = vnr0Var.k(str);
                HashMap n = tse0.n(y9pVar);
                if (k != null) {
                    n.put("type_group", k);
                }
                if (str != null) {
                    n.put("group_id", str);
                }
                y9pVar.a.a("FamilyAccount.Card.Closed", n, 1, new HashMap());
                bmVar.b.a.d();
                break;
            case 5:
                e eVar = (e) obj;
                o2y0 o2y0Var = eVar.r0;
                if (o2y0Var != null) {
                    ((v2y0) eVar.o0).a(o2y0Var);
                    break;
                }
                break;
            case 6:
                ((z4r0) obj).d.invoke();
                break;
            case 7:
                ((s) ((op0) obj).H).c();
                break;
            case 8:
                ((f) obj).kh();
                break;
            case 9:
                ((AfterFeedbackInfoModalView) obj).onBackPressed();
                break;
            case 10:
                ((ListItemSwitchComponent) obj).toggle();
                break;
            case 11:
                AiAssistantModalView aiAssistantModalView = (AiAssistantModalView) obj;
                tje.a0(aiAssistantModalView.getContext(), aiAssistantModalView.getQuarkInterceptedBackPressedCallback());
                break;
            case 12:
                ((AllRatingReasonsView) obj).updateItemsAndExpand();
                break;
            case 13:
                ((AltSelectModalView) obj).updateRightSideContainer();
                break;
            case 14:
                AlternativeDestinationModalView.backButton$onBackButtonClick((cx1) obj);
                break;
            case 15:
                ((AlternativeSourceModalView) obj).onBackPressed();
                break;
            case 16:
                viewGroup = ((SlideableModalView) ((wor0) ((d62) obj).w.V).a).bottomSheetBackground;
                viewGroup.setVisibility(8);
                break;
            case 17:
                ActionMode actionMode = ((b) obj).h;
                if (actionMode != null) {
                    actionMode.finish();
                    break;
                }
                break;
            case 18:
                w4u w4uVar = (w4u) obj;
                if (!w4uVar.e) {
                    while (true) {
                        md2 md2Var = (md2) ((ReferenceQueue) w4uVar.j).poll();
                        if (md2Var == null) {
                            ((Handler) w4uVar.d).postDelayed((jg) w4uVar.l, w4uVar.f);
                            break;
                        } else {
                            Long l = (Long) ym11.c((HashMap) w4uVar.k).remove(md2Var);
                            if (l != null) {
                                ((HashMap) w4uVar.b).remove(l);
                                ((HashMap) w4uVar.i).remove(l);
                                new m2v(((pd2) ((g191) w4uVar.g).a).a, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", (rs10) pd2.b.getValue(), null).z(Collections.singletonList(l), new nd2(0, new cs0(l.longValue(), 6)));
                            }
                        }
                    }
                }
                break;
            case 19:
                ((eh2) obj).b.a = true;
                break;
            case 20:
                yh2 yh2Var = (yh2) ((yh2) obj).c.a;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = yh2Var.b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    y4n y4nVar = (y4n) arrayList.get(i3);
                    if (y4nVar != null) {
                        ycs0 ycs0Var = yh2Var.a;
                        Long l2 = (Long) ycs0Var.get(y4nVar);
                        if (l2 != null) {
                            if (l2.longValue() < uptimeMillis2) {
                                ycs0Var.remove(y4nVar);
                            }
                        }
                        long j = y4nVar.i;
                        if (j == 0) {
                            y4nVar.i = uptimeMillis;
                            y4nVar.f(y4nVar.b);
                        } else {
                            long j2 = uptimeMillis - j;
                            y4nVar.i = uptimeMillis;
                            float f = yh2.b().g;
                            long j3 = f == 0.0f ? 2147483647L : (long) (j2 / f);
                            nwt0 nwt0Var = (nwt0) y4nVar;
                            boolean z4 = nwt0Var.w;
                            float f2 = nwt0Var.v;
                            if (z4) {
                                if (f2 != Float.MAX_VALUE) {
                                    z = true;
                                    nwt0Var.u.i = f2;
                                    nwt0Var.v = Float.MAX_VALUE;
                                } else {
                                    z = true;
                                }
                                nwt0Var.b = (float) nwt0Var.u.i;
                                nwt0Var.a = 0.0f;
                                nwt0Var.w = z3;
                            } else {
                                z = true;
                                owt0 owt0Var = nwt0Var.u;
                                float f3 = nwt0Var.b;
                                float f4 = nwt0Var.a;
                                if (f2 != Float.MAX_VALUE) {
                                    long j4 = j3 / 2;
                                    iq31 c = owt0Var.c(f3, f4, j4);
                                    owt0 owt0Var2 = nwt0Var.u;
                                    owt0Var2.i = nwt0Var.v;
                                    nwt0Var.v = Float.MAX_VALUE;
                                    iq31 c2 = owt0Var2.c(c.a, c.b, j4);
                                    nwt0Var.b = c2.a;
                                    nwt0Var.a = c2.b;
                                } else {
                                    iq31 c3 = owt0Var.c(f3, f4, j3);
                                    nwt0Var.b = c3.a;
                                    nwt0Var.a = c3.b;
                                }
                                float max = Math.max(nwt0Var.b, nwt0Var.h);
                                nwt0Var.b = max;
                                nwt0Var.b = Math.min(max, nwt0Var.g);
                                float f5 = nwt0Var.a;
                                owt0 owt0Var3 = nwt0Var.u;
                                if (Math.abs(f5) >= owt0Var3.e || Math.abs(r2 - ((float) owt0Var3.i)) >= owt0Var3.d) {
                                    z2 = false;
                                    float min = Math.min(y4nVar.b, y4nVar.g);
                                    y4nVar.b = min;
                                    float max2 = Math.max(min, y4nVar.h);
                                    y4nVar.b = max2;
                                    y4nVar.f(max2);
                                    if (!z2) {
                                        y4nVar.d(false);
                                    }
                                    i3++;
                                    z3 = false;
                                } else {
                                    nwt0Var.b = (float) nwt0Var.u.i;
                                    nwt0Var.a = 0.0f;
                                }
                            }
                            z2 = z;
                            float min2 = Math.min(y4nVar.b, y4nVar.g);
                            y4nVar.b = min2;
                            float max22 = Math.max(min2, y4nVar.h);
                            y4nVar.b = max22;
                            y4nVar.f(max22);
                            if (!z2) {
                            }
                            i3++;
                            z3 = false;
                        }
                    }
                    i3++;
                    z3 = false;
                }
                if (yh2Var.f) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        h0w h0wVar = yh2Var.h;
                        ValueAnimator.unregisterDurationScaleChangeListener((vh2) h0wVar.b);
                        h0wVar.b = null;
                    }
                    i = 0;
                    yh2Var.f = false;
                } else {
                    i = 0;
                }
                if (arrayList.size() > 0) {
                    ((Choreographer) yh2Var.e.b).postFrameCallback(new wh2(i, yh2Var.d));
                    break;
                }
                break;
            case 21:
                ((da20) obj).notImplemented();
                break;
            case 22:
                at20 at20Var = (at20) ((mrj) obj).w;
                if (at20Var != null && ((pbj) at20Var.b).b) {
                    ((DivView) at20Var.a).switchToState(3);
                    break;
                }
                break;
            case 23:
                ((o8g0) obj).getClass();
                break;
            case 24:
                vit vitVar = ((jm3) obj).b;
                nci0 nci0Var = (nci0) vitVar.b;
                if (nci0Var != null) {
                    nci0Var.cancel();
                }
                vitVar.b = null;
                break;
            case 25:
                ((xqi0) obj).b();
                break;
            case 26:
                ((AutoDividerComponentList) obj).invalidate();
                break;
            case 27:
                ((BackButton) obj).onClick();
                break;
            case 28:
                BackButtonView.onAttachedToWindow$lambda$0((BackButtonView) obj);
                break;
            default:
                ((BackgroundDownloadInitializer) obj).setListener(null);
                break;
        }
    }

    public /* synthetic */ jg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
