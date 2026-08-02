package com.yandex.passport.internal.flags.presentation;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.Lifecycle;
import com.lightside.slab.SlotView;
import com.lightside.visum.layouts.CoordinatorLayoutBuilder;
import com.lightside.visum.layouts.FrameLayoutBuilder;
import com.lightside.visum.layouts.LinearLayoutBuilder;
import com.lightside.visum.layouts.constraint.ConstraintSetBuilder;
import com.yandex.passport.R;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.ProgressAnimation;
import com.yandex.passport.api.n3;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.data.exceptions.CaptchaRequiredException;
import com.yandex.passport.data.exceptions.FailedResponseException;
import com.yandex.passport.data.exceptions.InvalidTotpException;
import com.yandex.passport.data.exceptions.OtpRequiredException;
import com.yandex.passport.internal.entities.ClientToken;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import com.yandex.passport.internal.report.m7;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.ui.bouncer.model.i2;
import com.yandex.passport.internal.ui.bouncer.model.t1;
import com.yandex.passport.internal.ui.bouncer.model.y1;
import com.yandex.passport.internal.ui.challenge.logout.LogoutComposeActivity;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.cma1;
import defpackage.i5m;
import defpackage.jl40;
import defpackage.kvj0;
import defpackage.mnq0;
import defpackage.n7e;
import defpackage.oz40;
import defpackage.p7e;
import defpackage.pey;
import defpackage.qd21;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tls;
import defpackage.uc20;
import defpackage.uw51;
import defpackage.w53;
import defpackage.xvf0;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes2.dex */
public final /* synthetic */ class s0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s0(com.yandex.passport.internal.network.client.a aVar, String str, String str2) {
        this.a = 4;
        this.b = str;
        this.c = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0596, code lost:
    
        if (defpackage.evu0.y(r4, r1, false) == true) goto L137;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v67, types: [com.yandex.passport.user_id.ui.b, oey] */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 4;
        Bundle bundle = null;
        int i3 = 10;
        int i4 = 2;
        int i5 = 1;
        int i6 = 0;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                oz40 oz40Var = (oz40) obj2;
                String str = (String) obj;
                ArrayList arrayList = new ArrayList();
                int i7 = 0;
                for (Object obj4 : (ArrayList) obj3) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        scc.m();
                        throw null;
                    }
                    String str2 = (String) obj4;
                    Integer valueOf = Integer.valueOf(i7);
                    if (str2 != null) {
                        break;
                    }
                    valueOf = null;
                    if (valueOf != null) {
                        arrayList.add(valueOf);
                    }
                    i7 = i8;
                }
                oz40Var.setValue(arrayList);
                return zy11Var;
            case 1:
                ((tls) obj3).invoke(new l0(((d0) obj2).b.a, (String) obj));
                return zy11Var;
            case 2:
                String str3 = (String) obj;
                ((oz40) obj2).setValue(str3);
                ((tls) obj3).invoke(str3);
                return zy11Var;
            case 3:
                return Boolean.valueOf(jl40.l(((com.yandex.passport.internal.methods.performer.k) obj3).a.a((Bundle) obj).getPushId(), (String) ((com.yandex.passport.internal.methods.i0) obj2).b.c));
            case 4:
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                String c = com.yandex.passport.internal.network.a.c((kvj0) obj);
                JSONObject jSONObject = new JSONObject(c);
                String string = jSONObject.getString(ACSPConstants.STATUS);
                if (WriteBlocks.OK.equals(string)) {
                    MasterToken from = MasterToken.from(jSONObject.getString("x_token"));
                    jSONObject.remove("x_token");
                    String e = com.yandex.passport.internal.network.m.e("access_token", jSONObject);
                    ClientToken clientToken = e != null ? new ClientToken(e, str5) : null;
                    jSONObject.remove("access_token");
                    return new com.yandex.passport.internal.network.response.e(from, com.yandex.passport.internal.ui.sloth.e.f((int) (System.currentTimeMillis() / 1000), c), clientToken);
                }
                ArrayList e2 = com.yandex.passport.internal.network.a.e(jSONObject);
                String e3 = com.yandex.passport.internal.network.m.e(ClidProvider.STATE, jSONObject);
                String optString = jSONObject.optString("captcha_image_url");
                if (e2 == null || e2.size() <= 0) {
                    throw new FailedResponseException(string);
                }
                if (e2.contains("captcha.required")) {
                    throw new CaptchaRequiredException(optString, str4);
                }
                if ("rfc_totp".equals(e3)) {
                    throw new OtpRequiredException((String) e2.get(0), str4);
                }
                if (e2.contains("rfc_otp.invalid") || e2.contains("otp.empty")) {
                    throw new InvalidTotpException((String) e2.get(0), str4);
                }
                throw new FailedResponseException((String) e2.get(0));
            case 5:
                com.yandex.passport.common.network.o oVar = (com.yandex.passport.common.network.o) obj;
                oVar.c("/1/bundle/account/short_info/");
                oVar.b("Authorization", "OAuth ".concat((String) obj3));
                oVar.d("avatar_size", "islands-300");
                oVar.e((Map) obj2);
                return zy11Var;
            case 6:
                ((com.yandex.passport.internal.social.esia.i0) obj3).b.a(com.yandex.passport.internal.social.esia.b0.a);
                ((tls) obj2).invoke((Uri) obj);
                return zy11Var;
            case 7:
                String str6 = (String) obj2;
                Exception exc = (Exception) obj;
                com.yandex.passport.internal.analytics.c0 c0Var = ((com.yandex.passport.internal.sso.g) obj3).c;
                if (c0Var != null) {
                    com.yandex.passport.internal.analytics.p pVar = com.yandex.passport.internal.analytics.p.c;
                    w53 w53Var = new w53();
                    w53Var.put("remote_package_name", str6);
                    w53Var.put("error", Log.getStackTraceString(exc));
                    c0Var.a.a(pVar, w53Var);
                }
                return zy11Var;
            case 8:
                t1 t1Var = (t1) obj2;
                ((com.yandex.passport.internal.ui.bouncer.t) obj3).a(new i2(t1Var.b, ((Boolean) obj).booleanValue(), t1Var.c));
                return zy11Var;
            case 9:
                com.lightside.visum.layouts.constraint.c cVar = (com.lightside.visum.layouts.constraint.c) obj;
                cVar.d(0);
                cVar.c(-2);
                ConstraintSetBuilder.Side side = ConstraintSetBuilder.Side.TOP;
                n7e d = uw51.d(side, side, cVar, 0);
                n7e b = cVar.b(new Pair(ConstraintSetBuilder.Side.BOTTOM, side), ((com.yandex.passport.internal.ui.bouncer.error.h) obj2).z);
                ConstraintSetBuilder.Side side2 = ConstraintSetBuilder.Side.START;
                n7e d2 = uw51.d(side2, side2, cVar, 0);
                ConstraintSetBuilder.Side side3 = ConstraintSetBuilder.Side.END;
                ((ConstraintSetBuilder) obj3).z(d, b, d2, uw51.d(side3, side3, cVar, 0));
                return zy11Var;
            case 10:
                com.yandex.passport.internal.ui.bouncer.loading.e eVar = (com.yandex.passport.internal.ui.bouncer.loading.e) obj2;
                View view = (View) obj;
                ViewGroup.LayoutParams generateLayoutParams = ((LinearLayoutBuilder) obj3).generateLayoutParams(-2, -2);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) generateLayoutParams;
                ProgressPropertiesImpl progressPropertiesImpl = eVar.c;
                n3 n3Var = eVar.x;
                layoutParams.width = progressPropertiesImpl.getAnimation() instanceof ProgressAnimation.Lottie ? n3Var.a : -2;
                layoutParams.height = n3Var.b;
                view.setLayoutParams(generateLayoutParams);
                return zy11Var;
            case 11:
                com.yandex.passport.internal.ui.bouncer.loading.k kVar = (com.yandex.passport.internal.ui.bouncer.loading.k) obj2;
                View view2 = (View) obj;
                ViewGroup.LayoutParams generateLayoutParams2 = ((LinearLayoutBuilder) obj3).generateLayoutParams(-2, -2);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) generateLayoutParams2;
                ProgressPropertiesImpl progressPropertiesImpl2 = kVar.c;
                n3 n3Var2 = kVar.x;
                layoutParams2.width = progressPropertiesImpl2.getAnimation() instanceof ProgressAnimation.Lottie ? n3Var2.a : -2;
                layoutParams2.height = n3Var2.b;
                view2.setLayoutParams(generateLayoutParams2);
                return zy11Var;
            case 12:
                NestedScrollView nestedScrollView = (NestedScrollView) obj;
                ViewGroup.LayoutParams generateLayoutParams3 = ((CoordinatorLayoutBuilder) obj3).generateLayoutParams(-2, -2);
                CoordinatorLayout.LayoutParams layoutParams3 = (CoordinatorLayout.LayoutParams) generateLayoutParams3;
                ((ViewGroup.MarginLayoutParams) layoutParams3).width = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams3).height = -2;
                layoutParams3.setBehavior(((com.yandex.passport.internal.ui.bouncer.roundabout.m) obj2).w);
                layoutParams3.gravity = 1;
                int dimensionPixelOffset = nestedScrollView.getResources().getDimensionPixelOffset(R.dimen.passport_bottom_sheet_margin_horizontal);
                ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = dimensionPixelOffset;
                ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = dimensionPixelOffset;
                nestedScrollView.setLayoutParams(generateLayoutParams3);
                return zy11Var;
            case 13:
                com.yandex.passport.internal.ui.bouncer.v vVar = (com.yandex.passport.internal.ui.bouncer.v) obj3;
                Context context = (Context) obj;
                vVar.getClass();
                com.yandex.passport.internal.ui.bouncer.roundabout.c cVar2 = new com.yandex.passport.internal.ui.bouncer.roundabout.c(vVar, i4);
                com.yandex.passport.internal.ui.bouncer.roundabout.c cVar3 = new com.yandex.passport.internal.ui.bouncer.roundabout.c(vVar, i6);
                int i9 = 9;
                com.yandex.passport.internal.ui.bouncer.roundabout.c cVar4 = new com.yandex.passport.internal.ui.bouncer.roundabout.c(vVar, i9);
                com.yandex.passport.internal.ui.bouncer.fallback.d dVar = new com.yandex.passport.internal.ui.bouncer.fallback.d(cVar3, cVar4, new com.yandex.passport.internal.ui.bouncer.roundabout.c(vVar, i2), r4);
                com.yandex.passport.internal.report.reporters.q0 q0Var = new com.yandex.passport.internal.report.reporters.q0(cVar3, cVar4, 11);
                xvf0 b2 = i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.q0(cVar3, cVar4, i9)));
                com.yandex.passport.internal.ui.bouncer.roundabout.items.d dVar2 = new com.yandex.passport.internal.ui.bouncer.roundabout.items.d(cVar3, cVar4, b2, i5);
                com.yandex.passport.internal.ui.bouncer.roundabout.items.d dVar3 = new com.yandex.passport.internal.ui.bouncer.roundabout.items.d(cVar3, cVar4, b2, i6);
                int i10 = 12;
                xvf0 b3 = i5m.b(cma1.i(new qd21(dVar, q0Var, dVar2, dVar3, new com.yandex.passport.internal.report.reporters.q0(cVar3, cVar4, i10), 13)));
                xvf0 b4 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.j((yvf0) i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.model.c1(cVar3, b3, i4))), (yvf0) cVar4, (yvf0) i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(cVar3, i10))), (yvf0) i5m.b(cma1.i(new com.yandex.passport.internal.report.reporters.q0(cVar3, new com.yandex.passport.internal.ui.bouncer.roundabout.c(vVar, 8), i3))), i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(cVar3, i9))), (yvf0) new com.yandex.passport.internal.ui.bouncer.roundabout.c(vVar, r4))));
                xvf0 b5 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(cVar3, 11)));
                xvf0 b6 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.e(cVar3, i3)));
                com.yandex.passport.internal.ui.bouncer.roundabout.c cVar5 = new com.yandex.passport.internal.ui.bouncer.roundabout.c(vVar, 3);
                com.yandex.passport.internal.ui.bouncer.roundabout.c cVar6 = new com.yandex.passport.internal.ui.bouncer.roundabout.c(vVar, 7);
                xvf0 b7 = i5m.b(cma1.i(new com.yandex.passport.internal.ui.sloth.m(cVar2, b4, b5, b6, i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.chooser.m(cVar5, b3, cVar6, new com.yandex.passport.internal.ui.bouncer.roundabout.c(vVar, 5), 4))), cVar4, cVar6, new com.yandex.passport.internal.ui.bouncer.roundabout.c(vVar, 1))));
                SlotView slotView = new SlotView(context, null, 0, 0, 14, null);
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView(slotView, new FrameLayout.LayoutParams(-1, -1));
                com.yandex.passport.internal.ui.bouncer.roundabout.v vVar2 = (com.yandex.passport.internal.ui.bouncer.roundabout.v) b7.get();
                vVar2.c((y1) obj2);
                slotView.insert(vVar2);
                return frameLayout;
            case 14:
                ConstraintSetBuilder constraintSetBuilder = (ConstraintSetBuilder) obj3;
                com.lightside.visum.layouts.constraint.c cVar7 = (com.lightside.visum.layouts.constraint.c) obj;
                cVar7.d(0);
                cVar7.c(-2);
                ConstraintSetBuilder.Side side4 = ConstraintSetBuilder.Side.TOP;
                ConstraintSetBuilder.Side side5 = ConstraintSetBuilder.Side.BOTTOM;
                n7e b8 = cVar7.b(new Pair(side4, side5), ((com.yandex.passport.internal.ui.bouncer.roundabout.s) obj2).z);
                int i11 = (int) (16.0f * uc20.a.density);
                constraintSetBuilder.getClass();
                p7e B = ConstraintSetBuilder.B(b8, i11);
                ConstraintSetBuilder.Side side6 = ConstraintSetBuilder.Side.START;
                n7e d3 = uw51.d(side6, side6, cVar7, 0);
                ConstraintSetBuilder.Side side7 = ConstraintSetBuilder.Side.END;
                constraintSetBuilder.z(B, d3, uw51.d(side7, side7, cVar7, 0), uw51.d(side5, side5, cVar7, 0));
                return zy11Var;
            case 15:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                com.yandex.passport.internal.report.reporters.o oVar2 = ((com.yandex.passport.internal.ui.challenge.n) obj3).f;
                oVar2.getClass();
                oVar2.f(m7.w, new yd((Uid) obj2), new com.yandex.passport.internal.report.f("success", String.valueOf(booleanValue)));
                return zy11Var;
            case 16:
                LogoutComposeActivity logoutComposeActivity = (LogoutComposeActivity) obj2;
                Uid uid = ((com.yandex.passport.internal.ui.challenge.logout.v) obj3).a;
                if (!jl40.l((Boolean) obj, Boolean.TRUE)) {
                    uid = null;
                }
                r4 = uid != null ? -1 : 6;
                if (uid != null) {
                    PassportUidImpl A = com.yandex.passport.internal.util.p.A(uid);
                    bundle = new Bundle();
                    bundle.putParcelable("passport-uid", A);
                }
                Intent intent = new Intent();
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                logoutComposeActivity.setResult(r4, intent);
                logoutComposeActivity.finish();
                return zy11Var;
            case 17:
                Context context2 = (Context) obj3;
                mnq0 mnq0Var = (mnq0) obj;
                int i12 = R.string.passport_logout_profiles_item_description;
                List<com.yandex.passport.internal.entities.k> list = (List) obj2;
                ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
                Iterator it = list.iterator();
                while (true) {
                    String str7 = "";
                    if (!it.hasNext()) {
                        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(((String) it2.next()).toLowerCase(Locale.ROOT));
                        }
                        if (arrayList3.size() != kotlin.collections.a.I(arrayList3).size()) {
                            arrayList2 = new ArrayList(tcc.n(list, 10));
                            for (com.yandex.passport.internal.entities.k kVar2 : list) {
                                StringBuilder sb = new StringBuilder();
                                String str8 = kVar2.d;
                                if (str8 == null) {
                                    str8 = "";
                                }
                                sb.append(str8);
                                sb.append(HexString.CHAR_SPACE);
                                String str9 = kVar2.e;
                                if (str9 == null) {
                                    str9 = "";
                                }
                                sb.append(str9);
                                arrayList2.add(sb.toString());
                            }
                        }
                        androidx.compose.ui.semantics.f.l(mnq0Var, context2.getString(i12, kotlin.collections.a.X(arrayList2, Extension.FIX_SPACE, null, null, null, 62)));
                        return zy11Var;
                    }
                    String str10 = ((com.yandex.passport.internal.entities.k) it.next()).e;
                    if (str10 != null) {
                        str7 = str10;
                    }
                    arrayList2.add(str7);
                }
            case 18:
                ((WebView) obj3).saveState((Bundle) obj2);
                return zy11Var;
            case 19:
                com.yandex.passport.internal.ui.common.c cVar8 = (com.yandex.passport.internal.ui.common.c) obj2;
                View view3 = (View) obj;
                ViewGroup.LayoutParams generateLayoutParams4 = ((LinearLayoutBuilder) obj3).generateLayoutParams(-2, -2);
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) generateLayoutParams4;
                ProgressPropertiesImpl progressPropertiesImpl3 = cVar8.c;
                n3 n3Var3 = cVar8.x;
                layoutParams4.width = progressPropertiesImpl3.getAnimation() instanceof ProgressAnimation.Lottie ? n3Var3.a : -2;
                layoutParams4.height = n3Var3.b;
                view3.setLayoutParams(generateLayoutParams4);
                return zy11Var;
            case 20:
                com.yandex.passport.internal.ui.router.w wVar = (com.yandex.passport.internal.ui.router.w) obj2;
                View view4 = (View) obj;
                ViewGroup.LayoutParams generateLayoutParams5 = ((FrameLayoutBuilder) obj3).generateLayoutParams(-2, -2);
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) generateLayoutParams5;
                ProgressPropertiesImpl progressPropertiesImpl4 = wVar.c;
                n3 n3Var4 = wVar.x;
                layoutParams5.width = progressPropertiesImpl4.getAnimation() instanceof ProgressAnimation.Lottie ? n3Var4.a : -2;
                layoutParams5.height = n3Var4.b;
                layoutParams5.gravity = 17;
                view4.setLayoutParams(generateLayoutParams5);
                return zy11Var;
            default:
                pey peyVar = (pey) obj3;
                final WebView webView = (WebView) obj2;
                ?? r1 = new androidx.lifecycle.q() { // from class: com.yandex.passport.user_id.ui.b
                    @Override // androidx.lifecycle.q
                    public final void M1(pey peyVar2, Lifecycle.Event event) {
                        int i13 = d.a[event.ordinal()];
                        WebView webView2 = webView;
                        if (i13 == 1) {
                            webView2.onResume();
                        } else if (i13 == 2) {
                            webView2.onPause();
                        } else {
                            if (i13 != 3) {
                                return;
                            }
                            webView2.destroy();
                        }
                    }
                };
                peyVar.getLifecycle().a(r1);
                return new com.yandex.passport.user_id.ui.e(peyVar, r1, webView);
        }
    }

    public /* synthetic */ s0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
