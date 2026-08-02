package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Build;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.FadeThroughUpdateListener;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.RectEvaluator;
import com.google.android.material.internal.ReversableAnimatedValueInterpolator;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.e;
import com.google.android.material.motion.c;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;
import com.google.android.material.search.g;
import com.yandex.fintechsdk.core.analytics.impl.internal.a;
import com.yandex.payment.sdk.core.data.BoundSbpToken;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.ui.payment.sbp.d;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.home.api.config.PlusHomeBundle;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPayButtonDiagnostic$ButtonType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPayButtonDiagnostic$OfferType;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.PlusPayButtonDiagnostic$PaymentType;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$PurchaseProductClick$Type;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseTypeDto;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.feature.pin.internal.screens.checkpin.CheckPinFragment;
import com.ybsdk.feature.pin.internal.screens.checkpin.CheckType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.b;
import okhttp3.internal.connection.RealConnection;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.exceptions.AccessDeniedEsiaVerificationEbsException;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.exceptions.VerificationAttemptsExceededEbsException;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter;

/* loaded from: classes11.dex */
public final class pgk0 implements s8i0, ow01, IVerificationRouter, ryj0, qur, rid0, nxp0, jg5, ca20, qjo {
    public final /* synthetic */ int a;
    public Object b;

    public pgk0(c1m0 c1m0Var) {
        this.a = 23;
        c1m0Var.d(new quq0(0, this));
    }

    public static AnimatorSet t(View view, int i, int i2, boolean z) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(i, 0.0f);
        ofFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(view));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(i2, 0.0f);
        ofFloat2.addUpdateListener(MultiViewUpdateListener.translationYListener(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(z ? 300L : 250L);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z, mj2.b));
        return animatorSet;
    }

    @Override // defpackage.ow01
    public Bitmap A(Bitmap bitmap) {
        kb4 kb4Var = (kb4) this.b;
        int i = kb4Var.a;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        paint.setColor(-1);
        paint.setAlpha(255);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.preScale(kb4Var.a / bitmap.getWidth(), kb4Var.a / bitmap.getHeight());
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        int i2 = kb4Var.a;
        canvas.drawRoundRect(0.0f, 0.0f, i2, i2, kb4Var.b(), kb4Var.b(), paint);
        bitmap.recycle();
        return createBitmap;
    }

    @Override // defpackage.nxp0
    public void a(boolean z) {
        g.a((g) this.b, z ? 0.0f : 1.0f);
    }

    @Override // defpackage.qjo
    public RealConnection b() {
        f7l0 b;
        IOException iOException = null;
        while (!((gdi0) this.b).k.K) {
            try {
                b = ((gdi0) this.b).b();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    ljo.a(iOException, e);
                }
                if (!((gdi0) this.b).a(null)) {
                    throw iOException;
                }
            }
            if (!b.isReady()) {
                e7l0 d = b.d();
                if (d.b == null && d.c == null) {
                    d = b.c();
                }
                f7l0 f7l0Var = d.b;
                Throwable th = d.c;
                if (th != null) {
                    throw th;
                }
                if (f7l0Var != null) {
                    ((gdi0) this.b).p.addFirst(f7l0Var);
                }
            }
            return b.a();
        }
        ny61.v("Canceled");
        return null;
    }

    @Override // defpackage.s8i0
    public void c(String str, boolean z) {
        ((wls) this.b).invoke(str, Boolean.valueOf(z));
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter
    public void closeNoInternetConnectionError() {
        ((mc50) this.b).a(new uwi0(qoi0.a(wfp0.class).d()));
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter
    public void closeVerification() {
        ((mc50) this.b).a(i5c.a);
    }

    @Override // defpackage.nxp0
    public AnimatorSet d(boolean z) {
        EditText editText;
        Animator animator;
        AnimatorSet animatorSet = new AnimatorSet();
        g gVar = (g) this.b;
        EditText editText2 = gVar.k;
        View view = gVar.m;
        SearchView searchView = gVar.a;
        c cVar = gVar.q;
        Toolbar toolbar = gVar.h;
        if (gVar.r == null) {
            animatorSet.playTogether(q(z));
        }
        TimeInterpolator timeInterpolator = z ? mj2.a : mj2.b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(z ? 300L : 250L);
        ofFloat.setStartDelay(z ? 100L : 0L);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z, timeInterpolator));
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(gVar.b));
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = gVar.d;
        Rect rect = cVar.j;
        Rect rect2 = cVar.k;
        if (rect == null) {
            rect = e.b(0, searchView);
        }
        if (rect2 == null) {
            rect2 = e.a(clippableRoundedCornerLayout, gVar.s);
        }
        final Rect rect3 = new Rect(rect2);
        final float cornerSize = gVar.s.getCornerSize();
        float[] cornerRadii = clippableRoundedCornerLayout.getCornerRadii();
        float[] b = cVar.b();
        final float[] fArr = {Math.max(cornerRadii[0], b[0]), Math.max(cornerRadii[1], b[1]), Math.max(cornerRadii[2], b[2]), Math.max(cornerRadii[3], b[3]), Math.max(cornerRadii[4], b[4]), Math.max(cornerRadii[5], b[5]), Math.max(cornerRadii[6], b[6]), Math.max(cornerRadii[7], b[7])};
        ValueAnimator ofObject = ValueAnimator.ofObject(new RectEvaluator(rect3), rect2, rect);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: qxp0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                float[] fArr2 = fArr;
                float f = fArr2[0];
                float f2 = cornerSize;
                ((g) pgk0.this.b).d.updateClipBoundsAndCornerRadii(rect3, new float[]{mj2.a(f2, f, animatedFraction), mj2.a(f2, fArr2[1], animatedFraction), mj2.a(f2, fArr2[2], animatedFraction), mj2.a(f2, fArr2[3], animatedFraction), mj2.a(f2, fArr2[4], animatedFraction), mj2.a(f2, fArr2[5], animatedFraction), mj2.a(f2, fArr2[6], animatedFraction), mj2.a(f2, fArr2[7], animatedFraction)});
            }
        });
        ofObject.setDuration(z ? 300L : 250L);
        FastOutSlowInInterpolator fastOutSlowInInterpolator = mj2.b;
        ofObject.setInterpolator(ReversableAnimatedValueInterpolator.of(z, fastOutSlowInInterpolator));
        Animator g = g.g(gVar, z);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setDuration(z ? 150L : 83L);
        ofFloat2.setStartDelay(z ? 75L : 0L);
        LinearInterpolator linearInterpolator = mj2.a;
        ofFloat2.setInterpolator(ReversableAnimatedValueInterpolator.of(z, linearInterpolator));
        TouchObserverFrameLayout touchObserverFrameLayout = gVar.n;
        ofFloat2.addUpdateListener(MultiViewUpdateListener.alphaListener(view, touchObserverFrameLayout));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat((touchObserverFrameLayout.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        ofFloat3.setDuration(z ? 300L : 250L);
        ofFloat3.setInterpolator(ReversableAnimatedValueInterpolator.of(z, fastOutSlowInInterpolator));
        ofFloat3.addUpdateListener(MultiViewUpdateListener.translationYListener(view));
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.95f, 1.0f);
        ofFloat4.setDuration(z ? 300L : 250L);
        ofFloat4.setInterpolator(ReversableAnimatedValueInterpolator.of(z, fastOutSlowInInterpolator));
        ofFloat4.addUpdateListener(MultiViewUpdateListener.scaleListener(touchObserverFrameLayout));
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat4);
        View view2 = gVar.e;
        Animator t = t(view2, r(view2), s(), z);
        Animator t2 = t(toolbar, r(toolbar) - (gVar.s.getPaddingEnd() - toolbar.getPaddingEnd()), s(), z);
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat5.setDuration(z ? 300L : 250L);
        ofFloat5.setInterpolator(ReversableAnimatedValueInterpolator.of(z, fastOutSlowInInterpolator));
        if (searchView.isMenuItemsAnimated()) {
            ofFloat5.addUpdateListener(new FadeThroughUpdateListener(v5a1.b(toolbar), v5a1.b(gVar.g)));
        }
        Animator u = u(editText2, z);
        Animator u2 = u(gVar.i, z);
        AnimatorSet animatorSet3 = new AnimatorSet();
        if (gVar.s == null || TextUtils.equals(editText2.getText(), gVar.s.getText())) {
            editText = editText2;
        } else {
            ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
            editText = editText2;
            ofFloat6.addUpdateListener(new mxp0(3, this));
            animatorSet3.playTogether(ofFloat6);
        }
        if (gVar.s == null || !TextUtils.equals(editText.getText(), gVar.s.getText())) {
            animator = u;
        } else {
            animator = u;
            Rect rect4 = new Rect(0, 0, editText.getWidth(), editText.getHeight());
            ValueAnimator ofInt = ValueAnimator.ofInt(gVar.s.getTextView().getWidth(), editText.getWidth());
            ofInt.addUpdateListener(new vf2(16, this, rect4));
            animatorSet3.playTogether(ofInt);
        }
        animatorSet3.setDuration(z ? 300L : 250L);
        animatorSet3.setInterpolator(ReversableAnimatedValueInterpolator.of(z, linearInterpolator));
        animatorSet.playTogether(ofFloat, ofObject, g, animatorSet2, t, t2, ofFloat5, animator, u2, animatorSet3);
        return animatorSet;
    }

    @Override // defpackage.nxp0
    public List e(boolean z) {
        return new ArrayList();
    }

    @Override // defpackage.nxp0
    public void f(boolean z) {
        g gVar = (g) this.b;
        EditText editText = gVar.k;
        g.a(gVar, z ? 1.0f : 0.0f);
        editText.setAlpha(1.0f);
        SearchBar searchBar = gVar.s;
        if (searchBar != null) {
            searchBar.getTextView().setAlpha(1.0f);
        }
        editText.setClipBounds(null);
        gVar.d.resetClipBoundsAndCornerRadii();
        if (z) {
            return;
        }
        gVar.q.l = null;
    }

    @Override // defpackage.nxp0
    public void g() {
        q(false).start();
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter
    public void gotoAccessDeniedScreen(AccessDeniedEsiaVerificationEbsException accessDeniedEsiaVerificationEbsException) {
        o(new sfp0(accessDeniedEsiaVerificationEbsException));
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter
    public void gotoBiometryInfo() {
        o(tfp0.a);
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter
    public void gotoEsiaAuthorization(boolean z) {
        o(new ufp0(z));
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter
    public void gotoFailedVerification() {
        o(vfp0.a);
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter
    public void gotoNoInternetConnectionError(Exception exc) {
        ((mc50) this.b).a(new x550(new wfp0(exc), qoi0.a(wfp0.class).d()));
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter
    public void gotoPhotoRecording() {
        o(xfp0.a);
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter
    public void gotoProcessing() {
        ((mc50) this.b).a(new d1j0(yfp0.a));
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter
    public void gotoVerificationAttemptsExceededError(VerificationAttemptsExceededEbsException verificationAttemptsExceededEbsException) {
        o(new zfp0(verificationAttemptsExceededEbsException));
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter
    public void gotoVerificationError(Exception exc) {
        o(new agp0(exc));
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter
    public void gotoVideoRecording() {
        o(bgp0.a);
    }

    @Override // defpackage.rid0
    public void h() {
        nsu nsuVar = (nsu) this.b;
        PlusLogTag plusLogTag = PlusLogTag.UI;
        StringBuilder sb = new StringBuilder("On host PurchaseSuccess ");
        PlusHomeBundle plusHomeBundle = nsuVar.a;
        sb.append(plusHomeBundle.getActiveTrackId());
        sb.append(", ready:");
        sb.append(nsuVar.j);
        skd0.e(plusLogTag, sb.toString());
        if (plusHomeBundle.getActiveTrackId() != null) {
            plusHomeBundle.n(Boolean.TRUE);
            nsuVar.a();
        } else {
            nsuVar.d.invoke();
        }
        nsuVar.e.invoke();
    }

    @Override // defpackage.ryj0
    public void i(Object obj) {
        switch (this.a) {
            case 9:
                ((d) this.b).a0(new hjm0((PaymentKitError) obj));
                break;
            default:
                ((afq0) this.b).D.l(new eeq0((PaymentKitError) obj));
                break;
        }
    }

    @Override // defpackage.nxp0
    public void j() {
        g gVar = (g) this.b;
        Toolbar toolbar = gVar.h;
        Menu menu = toolbar.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (!g.e(gVar)) {
            toolbar.setVisibility(8);
            return;
        }
        toolbar.inflateMenu(gVar.s.getMenuResId());
        g.f(gVar, toolbar);
        toolbar.setVisibility(0);
    }

    @Override // defpackage.qur
    public void k(ArrayList arrayList) {
        sfn0 sfn0Var = (sfn0) this.b;
        fi6 fi6Var = new fi6();
        fi6Var.e(arrayList);
        sfn0Var.a = fi6Var.g();
    }

    @Override // defpackage.qjo
    public gdi0 l() {
        return (gdi0) this.b;
    }

    @Override // defpackage.rid0
    public void m() {
        nsu nsuVar = (nsu) this.b;
        StringBuilder sb = new StringBuilder("Host purchase failed, activeTrackId=");
        PlusHomeBundle plusHomeBundle = nsuVar.a;
        sb.append(plusHomeBundle.getActiveTrackId());
        sb.append(", ready=");
        sb.append(nsuVar.j);
        String sb2 = sb.toString();
        skd0.c(PlusLogTag.UI, sb2, null);
        nsuVar.i.a(PlusPayButtonDiagnostic$ButtonType.NATIVE_HOST, PlusPayButtonDiagnostic$PaymentType.HOST, PlusPayButtonDiagnostic$OfferType.UNKNOWN, sb2);
        if (plusHomeBundle.getActiveTrackId() != null) {
            plusHomeBundle.n(Boolean.FALSE);
            nsuVar.a();
        }
    }

    @Override // defpackage.rid0
    public void n() {
        nsu nsuVar = (nsu) this.b;
        PlusLogTag plusLogTag = PlusLogTag.UI;
        StringBuilder sb = new StringBuilder("User click host subscribe. TrackId=");
        PlusHomeBundle plusHomeBundle = nsuVar.a;
        sb.append(plusHomeBundle.getActiveTrackId());
        skd0.e(plusLogTag, sb.toString());
        nsuVar.f.invoke();
        nsuVar.c.invoke(new cnv(plusHomeBundle.getActiveTrackId(), PurchaseTypeDto.HOST, InMessage$PurchaseProductClick$Type.BUTTON));
    }

    public void o(mds mdsVar) {
        ((mc50) this.b).a(new c1j0(mdsVar));
    }

    @Override // defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        int i;
        ndl0 ndl0Var = (ndl0) this.b;
        if (((vqq0) ndl0Var.b) == null) {
            return;
        }
        String str = x920Var.a;
        str.getClass();
        i = 2;
        switch (str) {
            case "SensitiveContent.getContentSensitivity":
                try {
                    int a = ((vqq0) ndl0Var.b).a();
                    if (a == 0) {
                        i = 0;
                    } else if (a == 1) {
                        i = 1;
                    } else if (a != 2) {
                        i = 3;
                    }
                    ((ba20) da20Var).success(Integer.valueOf(i));
                    break;
                } catch (IllegalArgumentException | IllegalStateException e) {
                    ((ba20) da20Var).error("error", e.getMessage(), null);
                    return;
                }
            case "SensitiveContent.setContentSensitivity":
                int intValue = ((Integer) x920Var.b).intValue();
                try {
                    vqq0 vqq0Var = (vqq0) ndl0Var.b;
                    if (intValue != 0) {
                        if (intValue == 1) {
                            i = 1;
                        } else if (intValue != 2) {
                            ny61.g(oyr.j(intValue, "contentSensitivityIndex ", " not known to the SensitiveContentChannel."));
                        }
                        vqq0Var.b(i);
                        break;
                    }
                    i = 0;
                    vqq0Var.b(i);
                } catch (IllegalArgumentException | IllegalStateException e2) {
                    ((ba20) da20Var).error("error", e2.getMessage(), null);
                    return;
                }
            case "SensitiveContent.isSupported":
                ((vqq0) ndl0Var.b).getClass();
                ((ba20) da20Var).success(Boolean.valueOf(Build.VERSION.SDK_INT >= 35));
                break;
            default:
                ((ba20) da20Var).notImplemented();
                break;
        }
    }

    @Override // defpackage.ryj0
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 9:
                d dVar = (d) this.b;
                xry0 xry0Var = yry0.a;
                dVar.a0(new gjm0(yry0.a.h, (BoundSbpToken) obj));
                break;
            default:
                uv90 uv90Var = (uv90) obj;
                afq0 afq0Var = (afq0) this.b;
                afq0Var.G = uv90Var;
                afq0Var.B.l(uv90Var);
                afq0Var.W(uv90Var);
                break;
        }
    }

    public FragmentScreen p() {
        return new FragmentScreen("CheckPinCodeForChangeScreen", false, new CheckPinFragment.CheckPinScreenParams(CheckType.CHANGE_PIN, null, false, 2, null), null, qoi0.a(CheckPinFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 10, null);
    }

    public AnimatorSet q(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        MaterialToolbar materialToolbar = ((g) this.b).g;
        ImageButton d = v5a1.d(materialToolbar);
        if (d != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(g.c(r1, v5a1.d(r1.s), d), 0.0f);
            ofFloat.addUpdateListener(MultiViewUpdateListener.translationXListener(d));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(s(), 0.0f);
            ofFloat2.addUpdateListener(MultiViewUpdateListener.translationYListener(d));
            animatorSet.playTogether(ofFloat, ofFloat2);
        }
        ActionMenuView b = v5a1.b(materialToolbar);
        if (b != null) {
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(g.c(r1, v5a1.b(r1.s), b), 0.0f);
            ofFloat3.addUpdateListener(MultiViewUpdateListener.translationXListener(b));
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(s(), 0.0f);
            ofFloat4.addUpdateListener(MultiViewUpdateListener.translationYListener(b));
            animatorSet.playTogether(ofFloat3, ofFloat4);
        }
        animatorSet.setDuration(z ? 300L : 250L);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z, mj2.b));
        return animatorSet;
    }

    public int r(View view) {
        int marginEnd = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginEnd();
        g gVar = (g) this.b;
        int k = gVar.k(gVar.s);
        return e.i(gVar.s) ? k - marginEnd : ((gVar.s.getWidth() + k) + marginEnd) - gVar.a.getWidth();
    }

    public int s() {
        g gVar = (g) this.b;
        FrameLayout frameLayout = gVar.f;
        return ((gVar.s.getHeight() / 2) + g.b(gVar, gVar.s)) - ((frameLayout.getHeight() / 2) + frameLayout.getTop());
    }

    public AnimatorSet u(View view, boolean z) {
        g gVar = (g) this.b;
        TextView placeholderTextView = gVar.s.getPlaceholderTextView();
        if (TextUtils.isEmpty(placeholderTextView.getText()) || z) {
            placeholderTextView = gVar.s.getTextView();
        }
        int k = gVar.k(placeholderTextView) - gVar.k(view);
        if (e.i(gVar.s)) {
            k += placeholderTextView.getWidth() - view.getWidth();
        }
        return t(view, k, s(), z);
    }

    public void v() {
        crl0 crl0Var = (crl0) this.b;
        tql0 tql0Var = crl0Var.I;
        hrl0 hrl0Var = new hrl0();
        lf2 lf2Var = tql0Var.a;
        crl0Var.A(new sql0(hrl0Var, (opl0) lf2Var.b.get(), (npl0) lf2Var.a.a, (w030) lf2Var.c.get()), zy11.a, sy60.Q2);
    }

    @Override // defpackage.jg5
    public void y(ig5 ig5Var, jh5 jh5Var) {
        if (ig5Var instanceof boq0) {
            z22 z22Var = (z22) this.b;
            boq0 boq0Var = (boq0) ig5Var;
            String str = boq0Var.a;
            Map map = boq0Var.b;
            if (map == null) {
                map = b.f();
            }
            ((a) z22Var).a(new keo(str, map));
        }
    }

    @Override // defpackage.ow01
    public String z() {
        kb4 kb4Var = (kb4) this.b;
        return "RoundSquareTransformation " + kb4Var.a + " " + kb4Var.b();
    }

    public /* synthetic */ pgk0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
