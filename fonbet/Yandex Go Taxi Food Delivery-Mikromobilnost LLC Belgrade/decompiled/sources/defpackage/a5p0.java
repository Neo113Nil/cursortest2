package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.y;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.foundation.text.selection.i;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.semantics.f;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.scooters.tariff_fix.selection.ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.SmallTooltipEvents$SmallTooltipNotificationCloseCloseType;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.pin.api.entities.PinScenario;
import com.ybsdk.feature.pin.api.entities.ReissueActionType;
import com.ybsdk.feature.pin.internal.screens.createpin.OnFinishStrategy;
import com.ybsdk.feature.qr.payments.internal.screens.list.presentation.view.SelectorListView;
import com.ybsdk.feature.settings.internal.screens.settings.presentation.SettingsFragment;
import com.ybsdk.feature.settings.internal.view.b;
import com.ybsdk.widgets.common.Tooltip$DismissReason;
import com.ybsdk.widgets.common.checkbox.CheckBoxView;
import com.ybsdk.widgets.common.paymentmethod.SelectPaymentMethodItem$LeftImageType;
import com.ybsdk.widgets.common.paymentmethod.SelectPaymentMethodView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.superapp.shortcuts.a;

/* loaded from: classes13.dex */
public final /* synthetic */ class a5p0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a5p0(b bVar, tls tlsVar, bgc bgcVar, hlq0 hlq0Var) {
        this.a = 20;
        this.c = bVar;
        this.b = tlsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x0618, code lost:
    
        if (r3.b() == true) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0630, code lost:
    
        if (r3.b == true) goto L234;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x064c  */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i;
        long a;
        String str;
        String str2;
        int r;
        int i2;
        int i3;
        boolean z;
        ViewGroup.LayoutParams layoutParams;
        int r2;
        stz0 render$lambda$7$lambda$6$lambda$5;
        boolean z2;
        ckq0 ckq0Var;
        zy11 selectorsAdapterDelegate$lambda$7$lambda$6;
        SmallTooltipEvents$SmallTooltipNotificationCloseCloseType smallTooltipEvents$SmallTooltipNotificationCloseCloseType;
        String str3;
        zy11 showWipeNfcDialogBottomSheet$lambda$16$lambda$15;
        int i4 = this.a;
        int i5 = 6;
        int i6 = 4;
        int i7 = 0;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i4) {
            case 0:
                ((b5p0) obj3).r(new a5p0(1, (Throwable) obj, (ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason) obj2));
                return zy11Var;
            case 1:
                Throwable th = (Throwable) obj3;
                ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason scootersTariffFixSelectionAnalytics$FixSelectionOpenReason = (ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason) obj2;
                l4p0 l4p0Var = (l4p0) obj;
                m4p0 m4p0Var = l4p0Var.a;
                e4p0 e4p0Var = l4p0Var.b;
                m950 m950Var = (m950) m4p0Var.G.get();
                List c = q1b1.c((vbn0) e4p0Var.a.e);
                ArrayList arrayList = new ArrayList(tcc.n(c, 10));
                Iterator it = c.iterator();
                while (it.hasNext()) {
                    arrayList.add(((r7p0) it.next()).a);
                }
                m4p0Var.D(m950Var, new zjn0(th, arrayList, 4), new j4p0(m4p0Var, e4p0Var, scootersTariffFixSelectionAnalytics$FixSelectionOpenReason));
                return zy11Var;
            case 2:
                ru.yandex.taxi.superapp.shortcuts.b bVar = ((a) obj3).b;
                qaf0 qaf0Var = new qaf0((waf0) ((yaf0) obj2), bVar.hashCode());
                r0 r0Var = bVar.b.h;
                if (qaf0Var.equals(((raf0) r0Var.getValue()).a)) {
                    r0Var.m(null, new raf0(null));
                }
                return zy11Var;
            case 3:
                clp0 clp0Var = (clp0) obj3;
                y yVar = (y) obj2;
                k9m k9mVar = (k9m) obj;
                float f = k9mVar.b ? -1.0f : 1.0f;
                long j = k9mVar.a;
                if (yVar.d == Orientation.Horizontal) {
                    i = 1;
                    a = wu60.a(0.0f, j, 1);
                } else {
                    i = 1;
                    a = wu60.a(0.0f, j, 2);
                }
                clp0Var.a(i, wu60.g(f, a));
                return zy11Var;
            case 4:
                ((unp0) obj).b.a((inp0) obj3, (sls) obj2);
                return zy11Var;
            case 5:
                k8q0 k8q0Var = (k8q0) obj3;
                s8q0 s8q0Var = (s8q0) obj2;
                mnq0 mnq0Var = (mnq0) obj;
                String str4 = k8q0Var.c;
                if (str4 == null) {
                    CharSequence charSequence = s8q0Var.a;
                    CharSequence charSequence2 = s8q0Var.b;
                    String str5 = "";
                    if (charSequence2 == null || (str = charSequence2.toString()) == null) {
                        str = "";
                    }
                    w7q0 w7q0Var = k8q0Var.d;
                    if (w7q0Var != null && (str2 = w7q0Var.a) != null) {
                        str5 = str2;
                    }
                    str4 = ((Object) charSequence) + Extension.FIX_SPACE + str + Extension.FIX_SPACE + str5;
                }
                f.l(mnq0Var, str4);
                return zy11Var;
            case 6:
                bgq0 bgq0Var = (bgq0) obj3;
                hdu hduVar = (hdu) obj2;
                return jason.statham.tools.a.d((d6x) obj, (r5x) hduVar.a, new m5x(kotlin.collections.b.i(new Pair("phone", new o6x(bgq0Var.b)), new Pair("name", new o6x(bgq0Var.a)))), (s6x) hduVar.b);
            case 7:
                scq0 scq0Var = (scq0) obj3;
                xcq0 xcq0Var = (xcq0) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (scq0Var.F() != -1 && scq0Var.X(scq0Var.F())) {
                    xcq0Var.B = booleanValue;
                    xcq0Var.a.onChangeCvn(scq0Var.F(), xcq0Var.B, scq0Var.V);
                }
                return zy11Var;
            case 8:
                final n70 n70Var = (n70) obj3;
                final uyo0 uyo0Var = (uyo0) obj2;
                hdq0 hdq0Var = hdq0.b;
                hdq0 hdq0Var2 = hdq0.a;
                zo31 zo31Var = n70Var.N;
                Context context = n70Var.P;
                m261 m261Var = (m261) zo31Var;
                ConstraintLayout constraintLayout = m261Var.a;
                AppCompatImageView appCompatImageView = m261Var.c;
                ImageView imageView = m261Var.g;
                TextView textView = m261Var.e;
                CheckBoxView checkBoxView = m261Var.f;
                SpoilerTextView spoilerTextView = m261Var.d;
                constraintLayout.setPadding(constraintLayout.getPaddingLeft(), cdq0.b((ddq0) n70Var.Z()), constraintLayout.getPaddingRight(), cdq0.b((ddq0) n70Var.Z()));
                AppCompatImageView appCompatImageView2 = m261Var.b;
                ((ddq0) n70Var.Z()).getClass();
                appCompatImageView2.setBackgroundResource(((ddq0) n70Var.Z()).d == null ? nyg0.ybsdk_background_payment_item_image_fill : nyg0.ybsdk_background_payment_item_image);
                rbv rbvVar = ((ddq0) n70Var.Z()).d;
                if (rbvVar != null) {
                    v4b1.k(rbvVar, appCompatImageView2, null, null, 6);
                }
                rbv rbvVar2 = ((ddq0) n70Var.Z()).e;
                if (rbvVar2 != null) {
                    v4b1.k(rbvVar2, appCompatImageView, null, null, 6);
                }
                appCompatImageView.setVisibility(((ddq0) n70Var.Z()).e == null ? 8 : 0);
                ldq0 ldq0Var = ((ddq0) n70Var.Z()).i;
                if ((ldq0Var instanceof edq0) || jl40.l(ldq0Var, hdq0Var2) || (ldq0Var instanceof idq0) || (ldq0Var instanceof jdq0) || (ldq0Var instanceof kdq0) || jl40.l(ldq0Var, hdq0Var)) {
                    r = kp50.r(36);
                } else {
                    if (!(ldq0Var instanceof fdq0)) {
                        w511.b();
                        return null;
                    }
                    r = kp50.r(44);
                }
                ViewGroup.LayoutParams layoutParams2 = appCompatImageView2.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.setMargins(rje.d(vvg0.ybsdk_screen_horizontal_space, context), marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    marginLayoutParams.width = r;
                    if (!(((ddq0) n70Var.Z()).i instanceof idq0) && ((ddq0) n70Var.Z()).l != SelectPaymentMethodItem$LeftImageType.CIRCLE) {
                        appCompatImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        r = cdq0.a;
                    }
                    marginLayoutParams.height = r;
                    appCompatImageView2.setLayoutParams(marginLayoutParams);
                    ldq0 ldq0Var2 = ((ddq0) n70Var.Z()).i;
                    if ((ldq0Var2 instanceof edq0) || jl40.l(ldq0Var2, hdq0Var2) || (ldq0Var2 instanceof idq0) || (ldq0Var2 instanceof jdq0) || (ldq0Var2 instanceof kdq0) || jl40.l(ldq0Var2, hdq0Var)) {
                        i2 = l1i0.Widget_YB_Text_Body1;
                    } else if (ldq0Var2 instanceof fdq0) {
                        i2 = l1i0.Widget_YB_Text_Body2;
                    } else {
                        w511.b();
                    }
                    textView.setTextAppearance(i2);
                    textView.setText(d.a(context, ((ddq0) n70Var.Z()).f));
                    textView.setPadding(cdq0.a((ddq0) n70Var.Z()), textView.getPaddingTop(), cdq0.a((ddq0) n70Var.Z()), textView.getPaddingBottom());
                    SpoilerTextView spoilerTextView2 = ((m261) n70Var.N).d;
                    if (((ddq0) n70Var.Z()).i instanceof jdq0) {
                        i3 = 1;
                    } else {
                        ldq0 ldq0Var3 = ((ddq0) n70Var.Z()).i;
                        gdq0 gdq0Var = ldq0Var3 instanceof gdq0 ? (gdq0) ldq0Var3 : null;
                        if (gdq0Var != null) {
                            i3 = 1;
                            break;
                        }
                        ldq0 ldq0Var4 = ((ddq0) n70Var.Z()).i;
                        kdq0 kdq0Var = ldq0Var4 instanceof kdq0 ? (kdq0) ldq0Var4 : null;
                        if (kdq0Var != null) {
                            i3 = 1;
                            break;
                        } else {
                            i3 = 1;
                        }
                        z = 0;
                        SpoilerTextView.updateSpoilerState$default(spoilerTextView2, null, z, i3, null);
                        Text text = ((ddq0) n70Var.Z()).g;
                        spoilerTextView.setText(text == null ? d.a(context, text) : null);
                        spoilerTextView.setVisibility(((ddq0) n70Var.Z()).g == null ? 0 : 8);
                        spoilerTextView.setPadding(cdq0.a((ddq0) n70Var.Z()), spoilerTextView.getPaddingTop(), cdq0.a((ddq0) n70Var.Z()), spoilerTextView.getPaddingBottom());
                        layoutParams = spoilerTextView.getLayoutParams();
                        if (layoutParams == null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                            ldq0 ldq0Var5 = ((ddq0) n70Var.Z()).i;
                            if ((ldq0Var5 instanceof edq0) || jl40.l(ldq0Var5, hdq0Var2) || (ldq0Var5 instanceof idq0) || (ldq0Var5 instanceof jdq0) || (ldq0Var5 instanceof kdq0) || jl40.l(ldq0Var5, hdq0Var)) {
                                r2 = kp50.r(2);
                            } else if (ldq0Var5 instanceof fdq0) {
                                r2 = 0;
                            } else {
                                w511.b();
                            }
                            marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, r2, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                            spoilerTextView.setLayoutParams(marginLayoutParams2);
                            ((ddq0) n70Var.Z()).getClass();
                            ldq0 ldq0Var6 = ((ddq0) n70Var.Z()).i;
                            if ((ldq0Var6 instanceof kdq0) || (ldq0Var6 instanceof jdq0) || (ldq0Var6 instanceof gdq0)) {
                                imageView.setVisibility(8);
                                checkBoxView.setVisibility(0);
                                checkBoxView.setChecked(((ddq0) n70Var.Z()).k, checkBoxView.getChecked() != ((ddq0) n70Var.Z()).k);
                            } else {
                                imageView.setVisibility(0);
                                checkBoxView.setVisibility(8);
                                imageView.setImageDrawable(((ddq0) n70Var.Z()).h);
                            }
                            final int i8 = 0;
                            exa1.e(constraintLayout, new View.OnClickListener() { // from class: zcq0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i9 = i8;
                                    n70 n70Var2 = n70Var;
                                    uyo0 uyo0Var2 = uyo0Var;
                                    switch (i9) {
                                        case 0:
                                            uyo0Var2.invoke(((ddq0) n70Var2.Z()).i);
                                            break;
                                        default:
                                            uyo0Var2.invoke(((ddq0) n70Var2.Z()).i);
                                            break;
                                    }
                                }
                            });
                            final int i9 = 1;
                            checkBoxView.setOnClickListener(new View.OnClickListener() { // from class: zcq0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i92 = i9;
                                    n70 n70Var2 = n70Var;
                                    uyo0 uyo0Var2 = uyo0Var;
                                    switch (i92) {
                                        case 0:
                                            uyo0Var2.invoke(((ddq0) n70Var2.Z()).i);
                                            break;
                                        default:
                                            uyo0Var2.invoke(((ddq0) n70Var2.Z()).i);
                                            break;
                                    }
                                }
                            });
                            if (((ddq0) n70Var.Z()).j) {
                                androidx.core.view.b.p(constraintLayout, new fi(((ddq0) n70Var.Z()).k, 0));
                            } else {
                                tja1.b(constraintLayout);
                            }
                            return zy11Var;
                        }
                        ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    z = i3;
                    SpoilerTextView.updateSpoilerState$default(spoilerTextView2, null, z, i3, null);
                    Text text2 = ((ddq0) n70Var.Z()).g;
                    spoilerTextView.setText(text2 == null ? d.a(context, text2) : null);
                    spoilerTextView.setVisibility(((ddq0) n70Var.Z()).g == null ? 0 : 8);
                    spoilerTextView.setPadding(cdq0.a((ddq0) n70Var.Z()), spoilerTextView.getPaddingTop(), cdq0.a((ddq0) n70Var.Z()), spoilerTextView.getPaddingBottom());
                    layoutParams = spoilerTextView.getLayoutParams();
                    if (layoutParams == null) {
                    }
                } else {
                    ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                return null;
            case 9:
                render$lambda$7$lambda$6$lambda$5 = SelectPaymentMethodView.render$lambda$7$lambda$6$lambda$5((Text) obj3, (pdq0) obj2, (stz0) obj);
                return render$lambda$7$lambda$6$lambda$5;
            case 10:
                i iVar = (i) obj3;
                tls tlsVar = (tls) obj2;
                ckq0 ckq0Var2 = (ckq0) obj;
                iVar.b.setValue(ckq0Var2);
                if (ckq0Var2 != null) {
                    iVar.m();
                }
                tlsVar.invoke(ckq0Var2);
                return zy11Var;
            case 11:
                i iVar2 = (i) obj3;
                Context context2 = (Context) obj2;
                xky0 xky0Var = (xky0) obj;
                xky0Var.a();
                xy40 xy40Var = xky0Var.a;
                TextContextMenuItems textContextMenuItems = TextContextMenuItems.Copy;
                boolean i10 = iVar2.i();
                fkq0 fkq0Var = new fkq0(iVar2, i6);
                Resources resources = context2.getResources();
                ts4 ts4Var = new ts4(2, fkq0Var, null);
                if (i10) {
                    xy40Var.g(new hly0(resources.getString(textContextMenuItems.getStringId()), ts4Var, textContextMenuItems.getDrawableId(), textContextMenuItems.getKey()));
                }
                TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.SelectAll;
                zkq0 zkq0Var = iVar2.a;
                ArrayList c2 = zkq0Var.c(iVar2.k());
                if (!c2.isEmpty()) {
                    int size = c2.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        ho40 ho40Var = (ho40) c2.get(i11);
                        kk2 d = ho40Var.d();
                        if (d.b.length() != 0 && ((ckq0Var = (ckq0) zkq0Var.a().e(ho40Var.a)) == null || Math.abs(ckq0Var.a.b - ckq0Var.b.b) != d.b.length())) {
                            z2 = false;
                            fkq0 fkq0Var2 = new fkq0(iVar2, 5);
                            fkq0 fkq0Var3 = new fkq0(iVar2, i5);
                            Resources resources2 = context2.getResources();
                            ts4 ts4Var2 = new ts4(2, fkq0Var3, fkq0Var2);
                            if (!z2) {
                                xy40Var.g(new hly0(resources2.getString(textContextMenuItems2.getStringId()), ts4Var2, textContextMenuItems2.getDrawableId(), textContextMenuItems2.getKey()));
                            }
                            xky0Var.a();
                            return zy11Var;
                        }
                    }
                }
                z2 = true;
                fkq0 fkq0Var22 = new fkq0(iVar2, 5);
                fkq0 fkq0Var32 = new fkq0(iVar2, i5);
                Resources resources22 = context2.getResources();
                ts4 ts4Var22 = new ts4(2, fkq0Var32, fkq0Var22);
                if (!z2) {
                }
                xky0Var.a();
                return zy11Var;
            case 12:
                ((Boolean) obj).getClass();
                ((tls) obj3).invoke(((jlq0) obj2).h);
                return zy11Var;
            case 13:
                o.a.o((o.a) obj, (o) obj3, m810.b(((Number) ((m3u0) obj2).getValue()).floatValue()), 0);
                return zy11Var;
            case 14:
                selectorsAdapterDelegate$lambda$7$lambda$6 = SelectorListView.selectorsAdapterDelegate$lambda$7$lambda$6((n70) obj3, (SelectorListView) obj2, (List) obj);
                return selectorsAdapterDelegate$lambda$7$lambda$6;
            case 15:
                huq0 huq0Var = (huq0) obj2;
                z94 z94Var = ((juq0) obj3).b.j0;
                String str6 = huq0Var.a;
                String str7 = huq0Var.b;
                int i12 = iuq0.b[((Tooltip$DismissReason) obj).ordinal()];
                if (i12 == 1) {
                    smallTooltipEvents$SmallTooltipNotificationCloseCloseType = SmallTooltipEvents$SmallTooltipNotificationCloseCloseType.TIMEOUT;
                } else if (i12 == 2) {
                    smallTooltipEvents$SmallTooltipNotificationCloseCloseType = SmallTooltipEvents$SmallTooltipNotificationCloseCloseType.TOOLTIP_CLICK;
                } else {
                    if (i12 != 3) {
                        w511.b();
                        return null;
                    }
                    smallTooltipEvents$SmallTooltipNotificationCloseCloseType = SmallTooltipEvents$SmallTooltipNotificationCloseCloseType.OUTSIDE_ACTION;
                }
                LinkedHashMap t = x4e.t(4, "tooltip_id", str6, "view_id", str7);
                t.put(MetaDataField.SCREEN_FIELD, "PRODUCTS");
                t.put("close_type", smallTooltipEvents$SmallTooltipNotificationCloseCloseType.getOriginalValue());
                z94Var.a.a("small_tooltip_notification.close", t);
                return zy11Var;
            case 16:
                n70 n70Var2 = (n70) obj;
                n70Var2.W(new lxo0(r3, n70Var2, (tls) obj3, (lxo0) obj2));
                return zy11Var;
            case 17:
                n70 n70Var3 = (n70) obj;
                n70Var3.a0(new nao0(24, (uwl0) obj3, n70Var3));
                n70Var3.W(new a5p0(18, n70Var3, (a5p0) obj2));
                return zy11Var;
            case 18:
                n70 n70Var4 = (n70) obj3;
                a5p0 a5p0Var = (a5p0) obj2;
                p261 p261Var = (p261) n70Var4.N;
                z8r0 z8r0Var = (z8r0) n70Var4.Z();
                TextView textView2 = p261Var.e;
                ImageView imageView2 = p261Var.b;
                Text text3 = z8r0Var.b;
                ShimmerFrameLayout shimmerFrameLayout = p261Var.a;
                textView2.setText(d.a(shimmerFrameLayout.getContext(), text3));
                TextView textView3 = p261Var.e;
                textView3.setEnabled(z8r0Var.d);
                z8r0 z8r0Var2 = (z8r0) n70Var4.Z();
                TextView textView4 = p261Var.d;
                textView4.setVisibility(d.a(shimmerFrameLayout.getContext(), z8r0Var2.c).length() > 0 ? 0 : 8);
                if (textView4.getVisibility() == 0) {
                    textView4.setText(d.a(shimmerFrameLayout.getContext(), z8r0Var2.c));
                    ColorModel colorModel = z8r0Var2.i;
                    if (colorModel == null) {
                        colorModel = new ColorModel.Attr(ung0.ybColor_textIcon_secondary);
                    }
                    xty0.e(textView4, colorModel);
                    textView3.setPadding(0, kp50.r(8), 0, 0);
                    textView3.setMinHeight(0);
                } else {
                    textView3.setPadding(0, 0, 0, 0);
                    textView3.setMinHeight((int) shimmerFrameLayout.getContext().getResources().getDimension(lwg0.ybsdk_transfer_settings_item_switch_height));
                }
                z8r0 z8r0Var3 = (z8r0) n70Var4.Z();
                imageView2.setVisibility(z8r0Var3.h != null ? 0 : 8);
                rbv rbvVar3 = z8r0Var3.h;
                if (rbvVar3 != null) {
                    v4b1.k(rbvVar3, imageView2, null, null, 6);
                }
                z8r0 z8r0Var4 = (z8r0) n70Var4.Z();
                ConstraintLayout constraintLayout2 = p261Var.c;
                a5p0 a5p0Var2 = (z8r0Var4.d && z8r0Var4.e) ? new a5p0(19, a5p0Var, z8r0Var4) : null;
                constraintLayout2.setOnClickListener(a5p0Var2 != null ? new eaj0(15, a5p0Var2) : null);
                if (((z8r0) n70Var4.Z()).f) {
                    shimmerFrameLayout.startShimmer();
                } else {
                    shimmerFrameLayout.stopShimmer();
                }
                return zy11Var;
            case 19:
                ((a5p0) obj3).invoke((z8r0) obj2);
                return zy11Var;
            case 20:
                b bVar2 = (b) obj3;
                tls tlsVar2 = (tls) obj2;
                z8r0 z8r0Var5 = (z8r0) obj;
                AppAnalyticsReporter appAnalyticsReporter = bVar2.c;
                pgk0 pgk0Var = bVar2.d;
                tfl0 tfl0Var = bVar2.b;
                n7r0 n7r0Var = bVar2.a;
                qq7 qq7Var = appAnalyticsReporter.l;
                String str8 = z8r0Var5.a;
                qq7Var.a.a("card.main_screen.button.click", g8e.w(1, "key", str8));
                String str9 = z8r0Var5.j;
                if (str9 != null) {
                    h791.c((j3h) ((y7r0) n7r0Var).a.get(), str9);
                }
                if (evu0.y(str8, "freeze", false)) {
                    tlsVar2.invoke(z8r0Var5);
                } else if (str8.equals("change_pin")) {
                    tfl0Var.h(pgk0Var.p());
                } else if (str8.equals("set_pin")) {
                    tfl0Var.h(ycp0.b(((com.ybsdk.feature.pin.internal.a) pgk0Var.b).b, ReissueActionType.NONE, OnFinishStrategy.EXIT, PinScenario.SETUP_PIN, false, null, 16));
                } else if (!str8.equals("nfc_wipe_sdk") && !str8.equals("make_default_nfc_app") && !str8.equals("nfc_draw_overlay") && !str8.equals("nfc_xiaomi_background_start") && (str3 = z8r0Var5.g) != null) {
                    ((y7r0) n7r0Var).a(str3);
                }
                return zy11Var;
            case 21:
                showWipeNfcDialogBottomSheet$lambda$16$lambda$15 = SettingsFragment.showWipeNfcDialogBottomSheet$lambda$16$lambda$15((Ref$BooleanRef) obj3, (SettingsFragment) obj2, ((Boolean) obj).booleanValue());
                return showWipeNfcDialogBottomSheet$lambda$16$lambda$15;
            case 22:
                ((tls) obj3).invoke(new ix2((u8r0) ((v8r0) obj2), ((Boolean) obj).booleanValue()));
                return zy11Var;
            case 23:
                ((tls) obj3).invoke((c9r0) obj2);
                return zy11Var;
            case 24:
                n70 n70Var5 = (n70) obj;
                n70Var5.a0(new nao0(26, (wls) obj3, n70Var5));
                n70Var5.W(new a5p0(25, n70Var5, (cp1) obj2));
                return zy11Var;
            case 25:
                n70 n70Var6 = (n70) obj3;
                cp1 cp1Var = (cp1) obj2;
                v261 v261Var = (v261) n70Var6.N;
                g9r0 g9r0Var = (g9r0) n70Var6.Z();
                TextView textView5 = v261Var.d;
                SwitchCompat switchCompat = v261Var.c;
                Text text4 = g9r0Var.b;
                ShimmerFrameLayout shimmerFrameLayout2 = v261Var.a;
                textView5.setText(d.a(shimmerFrameLayout2.getContext(), text4));
                v261Var.d.setEnabled(g9r0Var.d);
                g9r0 g9r0Var2 = (g9r0) n70Var6.Z();
                ImageView imageView3 = v261Var.b;
                imageView3.setVisibility(g9r0Var2.j != null ? 0 : 8);
                rbv rbvVar4 = g9r0Var2.j;
                if (rbvVar4 != null) {
                    v4b1.k(rbvVar4, imageView3, null, null, 6);
                }
                g9r0 g9r0Var3 = (g9r0) n70Var6.Z();
                switchCompat.setOnCheckedChangeListener(null);
                switchCompat.setEnabled(g9r0Var3.d);
                switchCompat.setClickable(g9r0Var3.g);
                switchCompat.setChecked(g9r0Var3.e);
                if (g9r0Var3.d) {
                    switchCompat.setOnCheckedChangeListener(new kbr0(cp1Var, g9r0Var3, v261Var, i7));
                }
                gjb1.d(switchCompat);
                switchCompat.setClickable(!((g9r0) n70Var6.Z()).f);
                if (((g9r0) n70Var6.Z()).f) {
                    shimmerFrameLayout2.startShimmer();
                } else {
                    shimmerFrameLayout2.stopShimmer();
                }
                return zy11Var;
            case 26:
                return Long.valueOf(((gqr0) obj3).b.e((oll0) obj, (iqr0) obj2));
            case 27:
                ((eb2) obj3).j(((qiy) obj2).b(rzo.a0(((k6w) obj).a)));
                return zy11Var;
            case 28:
                return q791.d((f530) obj, false, null, null, new ppr0(i6, (tls) obj3, (u0s0) obj2), 15);
            default:
                ywl ywlVar = (ywl) obj3;
                y741 y741Var = (y741) obj;
                n530 n530Var = ((l1o) obj2).a;
                obs0 obs0Var = (obs0) ywlVar.c.b(qoi0.a(obs0.class));
                Map map = obs0Var != null ? obs0Var.a : null;
                if (map != null && !map.isEmpty()) {
                    rzo.p(n530Var, (kr) map.get(y741Var.a), new pxl(ywlVar.c));
                }
                return zy11Var;
        }
    }

    public /* synthetic */ a5p0(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ a5p0(flex.signals.a aVar, ywl ywlVar, l1o l1oVar) {
        this.a = 29;
        this.c = ywlVar;
        this.b = l1oVar;
    }
}
