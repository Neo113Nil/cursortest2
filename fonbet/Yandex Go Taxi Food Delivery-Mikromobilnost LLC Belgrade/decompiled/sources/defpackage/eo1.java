package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.animation.core.a;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.ui.unit.LayoutDirection;
import com.yandex.go.ai_widget.router.b;
import com.yandex.go.settings.AppSettingsComposeRouter$withRestore$$inlined$start$1;
import com.yandex.go.settings.presentation.models.AppSettingsTransitionMode;
import com.yandex.go.zone.dto.objects.h2;
import com.yandex.mapkit.maps.core.geometry.Point;
import com.yandex.messaging.audio.d;
import com.yandex.messaging.core.net.entities.ChatMutingsBucket;
import com.yandex.messaging.core.net.entities.HiddenPrivateChatsBucket;
import com.yandex.messaging.core.net.entities.RestrictionsBucket;
import com.yandex.messaging.core.net.entities.StickerPacksBucket;
import com.yandex.passport.internal.core.announcing.f;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.ui.RequestStatus$Data$Source;
import com.ybsdk.feature.autotopup.api.domain.model.SettingStatus;
import com.ybsdk.feature.autotopup.internal.domain.entities.AutoTopupInputType;
import com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupLogoResultStatus;
import com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupResultFragment;
import com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularFragment;
import com.ybsdk.feature.deeplink.api.actions.AutoTopupSettingType;
import com.ybsdk.feature.split.deposit.internal.ui.autotopup.payment.methods.AutoTopupPaymentMethodsFragment;
import com.ybsdk.widgets.common.autotopup.AutoFundEditView;
import com.ybsdk.widgets.common.autotopup.AutoTopupEditView;
import com.ybsdk.widgets.common.g;
import defpackage.kx2;
import defpackage.sp1;
import defpackage.tje;
import defpackage.uw2;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.plus.badge.AmountTextView;
import ru.yandex.taxi.widget.AnimatedCircularHoleFogView;

/* loaded from: classes3.dex */
public final /* synthetic */ class eo1 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eo1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0129  */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        zy11 initAnimations$lambda$2;
        zy11 hideStaticFogAnimated$lambda$0;
        stz0 render$lambda$3;
        stz0 render$lambda$6;
        zy11 renderBottomSheet$lambda$6$lambda$5;
        ahq0 renderSourceSelection$lambda$42;
        g renderFrequencyOnce$lambda$27$lambda$23;
        r0 r0Var;
        Object value;
        zy11 renderBottomSheet$lambda$7$lambda$6;
        mr3 mr3Var;
        List list;
        List list2;
        int intValue;
        Boolean bool;
        int i = this.a;
        int i2 = 2;
        boolean z = false;
        boolean z2 = false;
        z = false;
        int i3 = 14;
        int i4 = 1;
        RequestStatus$Data$Source requestStatus$Data$Source = null;
        r8 = null;
        MoneyEntity moneyEntity = null;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((m2k0) obj).u(((LayoutDirection) obj2) != LayoutDirection.Rtl ? 1.0f : -1.0f);
                return zy11Var;
            case 1:
                final b bVar = (b) obj2;
                final yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).c = (gci0) bVar.L.w;
                tls tlsVar = new tls() { // from class: com.yandex.go.ai_widget.router.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        b bVar2 = b.this;
                        tje.N(bVar2.o(), null, null, new AiWidgetEvaluationRouter$content$1$1$1(bVar2, (sp1) obj3, yfdVar, null), 3);
                        return zy11.a;
                    }
                };
                agd agdVar = (agd) yfdVar;
                agdVar.e = tlsVar;
                l2d.a.getClass();
                agdVar.g = l2d.b;
                return zy11Var;
            case 2:
                com.yandex.go.ai_widget.ui.component.b bVar2 = (com.yandex.go.ai_widget.ui.component.b) obj2;
                m2k0 m2k0Var = (m2k0) obj;
                m2k0Var.D(((Number) bVar2.l.e()).floatValue());
                m2k0Var.G(((Number) bVar2.m.e()).floatValue());
                a aVar = bVar2.l;
                m2k0Var.q(Math.max(Math.abs(bVar2.n), Math.abs((((Number) aVar.e()).floatValue() / bVar2.b) * 15.0f)) * (((Number) aVar.e()).floatValue() >= 0.0f ? 1.0f : -1.0f));
                return zy11Var;
            case 3:
                r8i0 r8i0Var = (r8i0) ((LinkedHashMap) obj2).get(((h2) obj).getA());
                if (r8i0Var != null && r8i0Var.c) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                return new w50(i4, (z02) obj2);
            case 5:
                initAnimations$lambda$2 = AmountTextView.initAnimations$lambda$2((AmountTextView) obj2, (Animator) obj);
                return initAnimations$lambda$2;
            case 6:
                ((mnq0) obj).a(qkq0.a, new pkq0(Handle.Cursor, ((mv60) obj2).a(), SelectionHandleAnchor.Middle, true));
                return zy11Var;
            case 7:
                hideStaticFogAnimated$lambda$0 = AnimatedCircularHoleFogView.hideStaticFogAnimated$lambda$0((AnimatedCircularHoleFogView) obj2, ((Boolean) obj).booleanValue());
                return hideStaticFogAnimated$lambda$0;
            case 8:
                Point point = (Point) obj;
                h2c0 h2c0Var = ((rf2) obj2).a;
                if (h2c0Var.c()) {
                    h2c0Var.d(point);
                }
                return zy11Var;
            case 9:
                zi2 zi2Var = (zi2) obj2;
                d530 d530Var = (d530) obj;
                if (d530Var.getClass().getName().equals("androidx.compose.animation.SizeAnimationModifierElement")) {
                    zi2Var.b.add(d530Var);
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 10:
                final uw2 uw2Var = (uw2) obj2;
                yfd yfdVar2 = (yfd) obj;
                r0 r0Var2 = uw2Var.P;
                r0Var2.l(AppSettingsTransitionMode.Forward);
                tpr b = uw2Var.F.b(r0Var2, ((tw2) ((agd) yfdVar2).a).a);
                agd agdVar2 = (agd) yfdVar2;
                mx2 mx2Var = (mx2) agdVar2.d;
                if (mx2Var != null) {
                    b = com.yandex.go.coroutines.b.d(new mth(b, 4), new AppSettingsComposeRouter$withRestore$$inlined$start$1(mx2Var, null));
                }
                agdVar2.c = b;
                agdVar2.e = new tls() { // from class: com.yandex.go.settings.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        uw2 uw2Var2 = uw2.this;
                        tje.N(uw2Var2.o(), null, null, new AppSettingsComposeRouter$content$1$1$1(uw2Var2, (kx2) obj3, null), 3);
                        return zy11.a;
                    }
                };
                r2d.a.getClass();
                agdVar2.g = r2d.b;
                return zy11Var;
            case 11:
                y73 y73Var = (y73) obj;
                Context context = y73Var.a;
                tq90 tq90Var = new tq90(context);
                ((f) obj2).invoke(tq90Var);
                String str = tq90Var.c;
                Path path = new Path();
                ur90[] c = xr90.c(str);
                if (c != null) {
                    try {
                        ur90.b(c, path);
                    } catch (RuntimeException e) {
                        ny61.n(g8e.o("Error in parsing ", str), e);
                        return null;
                    }
                } else {
                    path = null;
                }
                if (path == null) {
                    path = new Path();
                }
                sq90 sq90Var = new sq90(path);
                Integer num = tq90Var.a;
                if (num != null) {
                    sq90Var.k.setColor(context.getResources().getColor(num.intValue(), null));
                }
                if (1.0f != sq90Var.m) {
                    sq90Var.m = 1.0f;
                    sq90Var.o = true;
                }
                RectF rectF = tq90Var.d;
                if (rectF != null) {
                    sq90Var.j = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
                }
                y73Var.b = sq90Var;
                return zy11Var;
            case 12:
                d dVar = (d) obj2;
                float floatValue = ((Float) obj).floatValue();
                tyc0 tyc0Var = dVar.a;
                tyc0Var.a();
                rh3 j = tyc0Var.e.j();
                if (j != null) {
                    sh3 sh3Var = (sh3) j;
                    long j2 = sh3Var.b;
                    sh3Var.c = y6i0.g((long) (j2 * floatValue), new imz(0L, j2, false));
                }
                dVar.b();
                j24 j24Var = dVar.f;
                if (j24Var != null) {
                    j24Var.invoke(dVar.h);
                }
                return zy11Var;
            case 13:
                ((ykn0) obj2).D((StickerPacksBucket) obj);
                return zy11Var;
            case 14:
                ((vfc0) obj2).D((RestrictionsBucket) obj);
                return zy11Var;
            case 15:
                ((go3) obj2).D((ChatMutingsBucket) obj);
                return zy11Var;
            case 16:
                ((i4u) obj2).D((HiddenPrivateChatsBucket) obj);
                return zy11Var;
            case 17:
                render$lambda$3 = AutoFundEditView.render$lambda$3((kr3) obj2, (stz0) obj);
                return render$lambda$3;
            case 18:
                render$lambda$6 = AutoTopupEditView.render$lambda$6((jv3) obj2, (stz0) obj);
                return render$lambda$6;
            case 19:
                vnn vnnVar = (vnn) obj2;
                g gVar = (g) obj;
                return g.a(gVar, vnnVar.getValue(), new cyy(i2), gVar.c, null, vnnVar.getText(), null, null, vnnVar.a(), null, null, vnnVar.getCurrency(), false, null, null, !vnnVar.b(), 0, false, 0, 0, null, null, null, 33516392);
            case 20:
                renderBottomSheet$lambda$6$lambda$5 = AutoTopupPaymentMethodsFragment.renderBottomSheet$lambda$6$lambda$5((AutoTopupPaymentMethodsFragment) obj2, ((Boolean) obj).booleanValue());
                return renderBottomSheet$lambda$6$lambda$5;
            case 21:
                renderSourceSelection$lambda$42 = AutoTopupRegularFragment.renderSourceSelection$lambda$42((jy3) obj2, (ahq0) obj);
                return renderSourceSelection$lambda$42;
            case 22:
                renderFrequencyOnce$lambda$27$lambda$23 = AutoTopupRegularFragment.renderFrequencyOnce$lambda$27$lambda$23((g) obj2, (g) obj);
                return renderFrequencyOnce$lambda$27$lambda$23;
            case 23:
                com.ybsdk.feature.autotopup.internal.presentation.saver.a aVar2 = (com.ybsdk.feature.autotopup.internal.presentation.saver.a) obj2;
                String str2 = (String) obj;
                asi0 asi0Var = (asi0) ((qx3) aVar2.X()).e.a();
                if (asi0Var != null) {
                    Iterator it = asi0Var.d.a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (jl40.l(((h5a0) next).getId(), str2)) {
                                requestStatus$Data$Source = next;
                            }
                        }
                    }
                    h5a0 h5a0Var = (h5a0) requestStatus$Data$Source;
                    if (h5a0Var != null) {
                        pz40 Y = aVar2.Y();
                        do {
                            r0Var = (r0) Y;
                            value = r0Var.getValue();
                        } while (!r0Var.k(value, qx3.a((qx3) value, null, null, null, null, null, null, h5a0Var, false, 191)));
                        aVar2.l0();
                    }
                }
                return zy11Var;
            case 24:
                qx3 qx3Var = (qx3) obj;
                String str3 = ((e5a0) obj2).l;
                asi0 asi0Var2 = (asi0) qx3Var.e.a();
                if (asi0Var2 == null) {
                    return qx3Var;
                }
                List list3 = asi0Var2.i;
                return qx3.a(qx3Var, null, null, null, null, new r8j0(new asi0(asi0Var2.a, asi0Var2.b, asi0Var2.c, asi0Var2.d, asi0Var2.e, asi0Var2.f, asi0Var2.g, asi0Var2.h, list3 != null ? kotlin.collections.a.o0(list3, str3) : null, asi0Var2.j), requestStatus$Data$Source, i3), null, null, false, 239);
            case 25:
                renderBottomSheet$lambda$7$lambda$6 = AutoTopupResultFragment.renderBottomSheet$lambda$7$lambda$6((AutoTopupResultFragment) obj2, ((Boolean) obj).booleanValue());
                return renderBottomSheet$lambda$7$lambda$6;
            case 26:
                bqg bqgVar = (bqg) obj2;
                wy3 wy3Var = (wy3) obj;
                AutoTopupLogoResultStatus autoTopupLogoResultStatus = AutoTopupLogoResultStatus.FAILED;
                Text.Constant i5 = g8e.i(Text.Companion, bqgVar.a);
                String str4 = bqgVar.b;
                Text.Constant constant = str4 != null ? new Text.Constant(str4) : null;
                ActionButtonEntity actionButtonEntity = new ActionButtonEntity(new Text.Resource(dzh0.ybsdk_auto_topup_result_screen_fail_button_text), null, false, null, 12, null);
                String str5 = bqgVar.d;
                return wy3.a(wy3Var, null, i5, constant, actionButtonEntity, str5 != null ? new ActionButtonEntity(new Text.Resource(dzh0.ybsdk_common_send_message_to_support), str5, true, null, 8, null) : null, null, autoTopupLogoResultStatus, false, null, null, 1953);
            case 27:
                n04 n04Var = (n04) obj2;
                u04 u04Var = (u04) obj;
                r8j0 r8j0Var = new r8j0(n04Var, requestStatus$Data$Source, i3);
                usz0 usz0Var = n04Var.c;
                isz0 isz0Var = usz0Var != null ? new isz0(usz0Var.a, usz0Var.b) : null;
                rr51 rr51Var = n04Var.d;
                s24 g = z1b1.g(n04Var.e);
                r24 f = z1b1.f(n04Var.f);
                zw3 zw3Var = n04Var.l;
                if (zw3Var != null && (mr3Var = zw3Var.a) != null) {
                    moneyEntity = mr3Var.a;
                }
                return u04.a(u04Var, r8j0Var, isz0Var, rr51Var, g, f, moneyEntity, null, new thq0(n04Var.g), n04Var.h, n04Var.a, n04Var.b, null, null, null, false, 30784);
            case 28:
                u04 u04Var2 = (u04) obj;
                int i6 = z04.a[((AutoTopupSettingType) obj2).ordinal()];
                if (i6 == 1) {
                    r24 r24Var = u04Var2.e;
                    return u04.a(u04Var2, null, null, null, null, r24Var != null ? r24.a(r24Var, SettingStatus.ENABLED, null, 2) : null, null, null, null, null, null, null, null, null, null, false, 32751);
                }
                if (i6 == 2) {
                    s24 s24Var = u04Var2.d;
                    return u04.a(u04Var2, null, null, null, s24Var != null ? s24.a(s24Var, SettingStatus.ENABLED) : null, null, null, null, null, null, null, null, null, null, null, false, 32759);
                }
                w511.b();
                return null;
            default:
                qz3 qz3Var = (qz3) obj2;
                j04 j04Var = (j04) obj;
                r8j0 r8j0Var2 = new r8j0(qz3Var, requestStatus$Data$Source, i3);
                h5a0 h5a0Var2 = j04Var.f;
                String str6 = j04Var.m;
                if (h5a0Var2 == null) {
                    h5a0Var2 = qz3Var.m;
                }
                h5a0 h5a0Var3 = h5a0Var2;
                List list4 = j04Var.e;
                if (list4.isEmpty()) {
                    list4 = null;
                }
                if (list4 == null) {
                    ArrayList<cn11> arrayList = qz3Var.j.d;
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    for (cn11 cn11Var : arrayList) {
                        Locale locale = tm60.a;
                        arrayList2.add(tm60.b(j2b1.b(cn11Var, AutoTopupInputType.AMOUNT).d));
                    }
                    list = arrayList2;
                } else {
                    list = list4;
                }
                List list5 = j04Var.d;
                if (list5.isEmpty()) {
                    list5 = null;
                }
                if (list5 == null) {
                    ArrayList<cn11> arrayList3 = qz3Var.j.d;
                    ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                    for (cn11 cn11Var2 : arrayList3) {
                        Locale locale2 = tm60.a;
                        arrayList4.add(tm60.b(j2b1.b(cn11Var2, AutoTopupInputType.THRESHOLD).d));
                    }
                    list2 = arrayList4;
                } else {
                    list2 = list5;
                }
                Integer num2 = j04Var.k;
                if (num2 != null) {
                    intValue = num2.intValue();
                } else {
                    Iterator it2 = qz3Var.j.d.iterator();
                    int i7 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i7 = -1;
                        } else if (!((cn11) it2.next()).a) {
                            i7++;
                        }
                    }
                    Integer valueOf = Integer.valueOf(i7);
                    if (i7 == -1) {
                        valueOf = null;
                    }
                    intValue = valueOf != null ? valueOf.intValue() : 0;
                }
                if (str6.equals("")) {
                    str6 = null;
                }
                if (str6 == null) {
                    lz3 lz3Var = qz3Var.k;
                    c22 c22Var = lz3Var != null ? lz3Var.d : null;
                    Locale locale3 = tm60.a;
                    str6 = tm60.b(k2b1.b(c22Var).d);
                }
                String str7 = str6;
                Boolean bool2 = j04Var.n;
                boolean booleanValue = bool2 != null ? bool2.booleanValue() : qz3Var.j.a;
                Boolean bool3 = j04Var.l;
                if (bool3 == null) {
                    lz3 lz3Var2 = qz3Var.k;
                    if (lz3Var2 == null) {
                        bool = null;
                        lz3 lz3Var3 = qz3Var.k;
                        return j04.a(j04Var, r8j0Var2, false, list2, list, h5a0Var3, null, null, null, null, Integer.valueOf(intValue), bool, str7, Boolean.valueOf(booleanValue), null, null, lz3Var3 != null ? lz3Var3.e : null, 115654);
                    }
                    bool3 = Boolean.valueOf(lz3Var2.a);
                }
                bool = bool3;
                lz3 lz3Var32 = qz3Var.k;
                return j04.a(j04Var, r8j0Var2, false, list2, list, h5a0Var3, null, null, null, null, Integer.valueOf(intValue), bool, str7, Boolean.valueOf(booleanValue), null, null, lz3Var32 != null ? lz3Var32.e : null, 115654);
        }
    }
}
