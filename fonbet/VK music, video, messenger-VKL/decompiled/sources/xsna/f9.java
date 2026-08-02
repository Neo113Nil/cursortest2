package xsna;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.widget.EditText;
import com.mbridge.msdk.config.dynamic.baseview.ComponentScrollView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.main.AfterPhoneReuseVerificationWay;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SilentAuthSource;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.user.RequestUserProfile;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.libvideo.bottomsheet.about.delegate.r;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.photo.editor.features.crop.models.params.CropAspectRatioFormat;
import com.vk.photo.editor.features.crop.models.stat.CropStatEvent;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.superapp.api.states.VkAuthState;
import com.vk.superapp.browser.internal.ui.communitypicker.VkCommunityPickerActivity;
import com.vk.webapp.fragments.DonutPaymentAppFragment;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.am9;
import xsna.b4;
import xsna.fss;
import xsna.kz30;
import xsna.oik;
import xsna.ptw0;
import xsna.s5e0;
import xsna.zi6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f9 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [xsna.j8i, xsna.xwb$a] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VkAuthState b;
        CropAspectRatioFormat cropAspectRatioFormat;
        ChatSettings Hb;
        Long l;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                r.a aVar = (r.a) obj;
                if (aVar.m != null) {
                    int i2 = s5e0.a.a;
                }
                aVar.l.d(b4.g.a);
                return;
            case 1:
                Object obj2 = ((ta6) obj).o;
                ((l0c) (obj2 != null ? obj2 : null)).P();
                return;
            case 2:
                Object obj3 = ((ed6) obj).o;
                Object obj4 = obj3;
                if (obj3 == null) {
                    obj4 = null;
                }
                w4q w4qVar = (w4q) obj4;
                SignUpDataHolder signUpDataHolder = w4qVar.p;
                String str = w4qVar.z;
                String str2 = (signUpDataHolder != null ? signUpDataHolder : null).o;
                if (signUpDataHolder == null) {
                    signUpDataHolder = null;
                }
                SilentAuthSource silentAuthSource = signUpDataHolder.I.e;
                if (drm0.N(w4qVar.y) && w4qVar.C) {
                    Serializer.c<VkAuthState> cVar = VkAuthState.CREATOR;
                    b = VkAuthState.a.c(str2, str, true, false);
                    AfterPhoneReuseVerificationWay afterPhoneReuseVerificationWay = w4qVar.F;
                    if (afterPhoneReuseVerificationWay != null) {
                        SilentAuthSource silentAuthSource2 = AfterPhoneReuseVerificationWay.b.$EnumSwitchMapping$0[afterPhoneReuseVerificationWay.ordinal()] == 1 ? SilentAuthSource.BY_ECOSYSTEM_PUSH : SilentAuthSource.BY_PHONE;
                        if (silentAuthSource2 != null) {
                            silentAuthSource = silentAuthSource2;
                        }
                    }
                    if (silentAuthSource == null) {
                        silentAuthSource = SilentAuthSource.BY_PHONE;
                    }
                } else {
                    Serializer.c<VkAuthState> cVar2 = VkAuthState.CREATOR;
                    b = VkAuthState.a.b(str, w4qVar.y, str2, true);
                    if (silentAuthSource == null) {
                        silentAuthSource = SilentAuthSource.BY_LOGIN;
                    }
                }
                VkAuthState vkAuthState = b;
                zi6.a aVar2 = new zi6.a();
                SignUpDataHolder signUpDataHolder2 = w4qVar.p;
                if (signUpDataHolder2 == null) {
                    signUpDataHolder2 = null;
                }
                p66.j0(w4qVar, vkAuthState, aVar2, VkAuthMetaInfo.zb(signUpDataHolder2.H, silentAuthSource, null, null, 55), new arf(w4qVar, 13), 8);
                return;
            case 3:
                cj6 cj6Var = (cj6) obj;
                otu0 un = cj6Var.un();
                Context requireContext = cj6Var.requireContext();
                SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.AUTH_PASSWORD;
                un.getClass();
                otu0.b(requireContext, schemeStatSak$EventScreen);
                return;
            case 4:
                ((xwb) obj).b.o();
                return;
            case 5:
                ((ComponentScrollView) obj).a(view);
                return;
            case 6:
                gik gikVar = (gik) obj;
                final uik uikVar = gikVar.n;
                if (uikVar != null) {
                    hfk hfkVar = uikVar.e;
                    jfk jfkVar = uikVar.o;
                    final tnt tntVar = jfkVar != null ? jfkVar.j : null;
                    if (tntVar != null) {
                        final float f = tntVar.i;
                        final float f2 = f - 90;
                        if (uikVar.m) {
                            return;
                        }
                        uikVar.m = true;
                        uikVar.a();
                        RectF cropRect = hfkVar.getCropRect();
                        RectF cropRect2 = hfkVar.getCropRect();
                        final RectF a = hfkVar.a(hfkVar.getCropHeight() / hfkVar.getCropWidth());
                        Matrix matrix = new Matrix();
                        matrix.postRotate(-90.0f, hfkVar.getCenterX(), hfkVar.getCenterY());
                        matrix.mapRect(cropRect2);
                        final float min = Math.min(a.width() / cropRect2.width(), a.height() / cropRect2.height());
                        cropRect2.set(cropRect);
                        hfkVar.setRawRect(a);
                        final float f3 = tntVar.g;
                        final float f4 = f3 * min;
                        hfkVar.setRawRect(cropRect);
                        CropAspectRatioFormat cropAspectRatioFormat2 = uikVar.k;
                        cropAspectRatioFormat2.getClass();
                        switch (CropAspectRatioFormat.a.$EnumSwitchMapping$0[cropAspectRatioFormat2.ordinal()]) {
                            case 1:
                                cropAspectRatioFormat = CropAspectRatioFormat.CropOriginal;
                                break;
                            case 2:
                                cropAspectRatioFormat = CropAspectRatioFormat.CropFree;
                                break;
                            case 3:
                                cropAspectRatioFormat = CropAspectRatioFormat.CropSquare;
                                break;
                            case 4:
                                cropAspectRatioFormat = CropAspectRatioFormat.Crop4X3;
                                break;
                            case 5:
                                cropAspectRatioFormat = CropAspectRatioFormat.Crop3X4;
                                break;
                            case 6:
                                cropAspectRatioFormat = CropAspectRatioFormat.Crop9X16;
                                break;
                            case 7:
                                cropAspectRatioFormat = CropAspectRatioFormat.Crop16X9;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        final CropAspectRatioFormat cropAspectRatioFormat3 = cropAspectRatioFormat;
                        final ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.tik
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                uik uikVar2 = uik.this;
                                jfk jfkVar2 = uikVar2.o;
                                hfk hfkVar2 = uikVar2.e;
                                if (jfkVar2 != null) {
                                    float f5 = f2;
                                    float f6 = f;
                                    float animatedFraction = (valueAnimator.getAnimatedFraction() * (f5 - f6)) + f6;
                                    tnt tntVar2 = jfkVar2.j;
                                    float f7 = animatedFraction - tntVar2.i;
                                    hfk hfkVar3 = jfkVar2.c;
                                    float centerX = hfkVar3.getCenterX();
                                    float centerY = hfkVar3.getCenterY();
                                    float f8 = tntVar2.b;
                                    float f9 = tntVar2.a;
                                    tntVar2.o.postRotate(f7, centerX, centerY);
                                    float f10 = tntVar2.i + f7;
                                    tntVar2.i = f10;
                                    tntVar2.e = f10 % 180.0f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f9 / f8 : f8 / f9;
                                }
                                float animatedFraction2 = valueAnimator.getAnimatedFraction();
                                float f11 = f4;
                                float f12 = f3;
                                float b2 = u11.b(f11, f12, animatedFraction2, f12) / tntVar.g;
                                jfk jfkVar3 = uikVar2.o;
                                if (jfkVar3 != null) {
                                    float centerX2 = hfkVar2.getCenterX();
                                    float centerY2 = hfkVar2.getCenterY();
                                    tnt tntVar3 = jfkVar3.j;
                                    tntVar3.a(b2, centerX2, centerY2);
                                    tntVar3.n *= b2;
                                    tntVar3.f *= b2;
                                }
                                float animatedFraction3 = valueAnimator.getAnimatedFraction() * (-90.0f);
                                float b3 = u11.b(min, 1.0f, valueAnimator.getAnimatedFraction(), 1.0f);
                                hfkVar2.setContentRotation(animatedFraction3);
                                hfkVar2.setContentScale(b3);
                                jfk jfkVar4 = uikVar2.o;
                                if (jfkVar4 != null) {
                                    jfkVar4.i();
                                }
                                hfkVar2.getRotatingView().setVisibility(4);
                                we2.a(ofFloat, new w76(uikVar2, a, cropAspectRatioFormat3, 1));
                            }
                        });
                        ofFloat.start();
                        uikVar.h = ofFloat;
                        oik.a aVar3 = gikVar.d.d;
                        (aVar3 != null ? aVar3 : null).a(cropAspectRatioFormat3, true);
                        gikVar.j.b(CropStatEvent.i.a);
                        s3q0 s3q0Var = s3q0.a;
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((djo) obj).o();
                return;
            case 8:
                cjs cjsVar = (cjs) obj;
                int i3 = cjs.v;
                cjsVar.n.a(new fss.b.e((RequestUserProfile) cjsVar.m));
                return;
            case 9:
                Object obj5 = ((sys) obj).o;
                ((qys) (obj5 != null ? obj5 : null)).H1();
                return;
            case 10:
                kz30 kz30Var = (kz30) obj;
                Dialog Cb = kz30Var.k.Cb();
                if (Cb == null) {
                    return;
                }
                if (kz30.d.$EnumSwitchMapping$2[Cb.oc().a.ordinal()] != 5 || (Hb = Cb.Hb()) == null || (l = Hb.C) == null) {
                    return;
                }
                long longValue = l.longValue();
                kz30Var.c.k();
                Activity activity = kz30Var.i;
                int i4 = DonutPaymentAppFragment.a0;
                DonutPaymentAppFragment.b.a(longValue, null, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.IM), false).k(activity);
                return;
            case 11:
                ((z150) obj).b.invoke();
                return;
            case 12:
                int i5 = ProfileFriendsFragment.k0;
                ((EditText) obj).getText().clear();
                return;
            case 13:
                Object obj6 = ((mii0) obj).o;
                ((kii0) (obj6 != null ? obj6 : null)).w();
                return;
            case 14:
                cmo0 cmo0Var = (cmo0) obj;
                kmo0 kmo0Var = cmo0Var.w;
                kmo0 kmo0Var2 = kmo0.CHOOSE_FONTS;
                if (kmo0Var == kmo0Var2) {
                    kmo0Var2 = kmo0.CHOOSE_COLOR;
                }
                cmo0Var.w = kmo0Var2;
                cmo0Var.b(kmo0Var2);
                nf9 nf9Var = nf9.b;
                am9.a aVar4 = new am9.a();
                aVar4.j = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_EDITOR);
                nf9.b(nf9Var, StoryPublishEvent.SWITCH_FONT_EDITOR_MODE, aVar4, null, null, false, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE).e();
                return;
            case 15:
                int i6 = VkCommunityPickerActivity.g;
                ((com.google.android.material.bottomsheet.b) obj).dismiss();
                return;
            default:
                ((cuw0) obj).c.invoke(ptw0.m.b);
                return;
        }
    }
}
