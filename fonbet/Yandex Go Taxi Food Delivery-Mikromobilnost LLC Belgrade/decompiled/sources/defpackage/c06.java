package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.camera2.CaptureResult;
import android.nfc.tech.MifareClassic;
import android.util.Property;
import android.view.View;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import androidx.camera.core.impl.CameraCaptureMetaData$AeState;
import androidx.camera.core.impl.CameraCaptureMetaData$AfState;
import androidx.camera.core.impl.CameraCaptureMetaData$AwbState;
import androidx.camera.core.impl.CameraCaptureMetaData$FlashState;
import androidx.camera.core.impl.utils.ExifData$WhiteBalanceMode;
import com.bumptech.glide.load.EncodeStrategy;
import com.yandex.fintechsdk.core.nfc.impl.internal.exception.CompareDataException;
import com.yandex.fintechsdk.core.nfc.impl.internal.exception.ReadingException;
import com.yandex.go.chargers.data.f;
import com.yandex.go.chargers.offer.data.ChargersOfferApi;
import com.yandex.go.chargers.offer.data.model.ChargersCreateOrderParams;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import flex.core.model.Document$TransitionSettings$Option$Interpolator;
import flex.engine.document.DocumentExtKt$createAnimatorListener$1;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$IntRef;
import ru.yandex.taxi.network.api.a;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes10.dex */
public class c06 implements vtj0, ay01, ap7 {
    public Object a;
    public Object b;

    public c06(byte[] bArr) {
        this.b = bArr;
        ArrayList arrayList = new ArrayList();
        s(0, bArr.length < 31 ? bArr.length : 31, arrayList);
        if (bArr.length > 31) {
            s(31, bArr.length, arrayList);
        }
        this.a = arrayList;
    }

    @Override // defpackage.ap7
    public void a(ilo iloVar) {
        ArrayList arrayList = iloVar.a;
        CaptureResult captureResult = (CaptureResult) this.b;
        super.a(iloVar);
        try {
            Integer num = (Integer) captureResult.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                iloVar.f(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            sgb1.g(5, "C2CameraCaptureResult");
        }
        if (((Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME)) != null) {
            iloVar.c("ExposureTime", String.valueOf(r6.longValue() / 1.0E9d), arrayList);
        }
        Float f = (Float) captureResult.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            iloVar.c("FNumber", String.valueOf(f.floatValue()), arrayList);
        }
        Integer num2 = (Integer) captureResult.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            if (((Integer) captureResult.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                num2 = Integer.valueOf(num2.intValue() * ((int) (r0.intValue() / 100.0f)));
            }
            iloVar.e(num2.intValue());
        }
        Float f2 = (Float) captureResult.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            iloVar.d(f2.floatValue());
        }
        Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            ExifData$WhiteBalanceMode exifData$WhiteBalanceMode = ExifData$WhiteBalanceMode.AUTO;
            if (num3.intValue() == 0) {
                exifData$WhiteBalanceMode = ExifData$WhiteBalanceMode.MANUAL;
            }
            iloVar.g(exifData$WhiteBalanceMode);
        }
    }

    @Override // defpackage.ap7
    public q6x0 b() {
        return (q6x0) this.a;
    }

    @Override // defpackage.vtj0
    public EncodeStrategy c(mg70 mg70Var) {
        return EncodeStrategy.TRANSFORMED;
    }

    @Override // defpackage.ap7
    public CameraCaptureMetaData$FlashState d() {
        Integer num = (Integer) ((CaptureResult) this.b).get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return CameraCaptureMetaData$FlashState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return CameraCaptureMetaData$FlashState.NONE;
        }
        if (intValue == 2) {
            return CameraCaptureMetaData$FlashState.READY;
        }
        if (intValue == 3 || intValue == 4) {
            return CameraCaptureMetaData$FlashState.FIRED;
        }
        sgb1.d("C2CameraCaptureResult", "Undefined flash state: " + num);
        return CameraCaptureMetaData$FlashState.UNKNOWN;
    }

    @Override // defpackage.wyn
    public boolean e(Object obj, File file, mg70 mg70Var) {
        return ((f06) this.b).e(new h16((b16) this.a, ((BitmapDrawable) ((otj0) obj).get()).getBitmap()), file, mg70Var);
    }

    @Override // defpackage.ap7
    public CameraCaptureMetaData$AfState f() {
        Integer num = (Integer) ((CaptureResult) this.b).get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return CameraCaptureMetaData$AfState.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
            case 3:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                sgb1.d("C2CameraCaptureResult", "Undefined af state: " + num);
                break;
        }
        return CameraCaptureMetaData$AfState.UNKNOWN;
    }

    public void g() {
        sk7 sk7Var = (sk7) this.a;
        if (sk7Var != null) {
            ((AtomicBoolean) sk7Var.c).set(true);
            ((ScheduledFuture) sk7Var.b).cancel(true);
        }
        this.a = null;
    }

    @Override // defpackage.ap7
    public long getTimestamp() {
        Long l = (Long) ((CaptureResult) this.b).get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    @Override // defpackage.ay01
    public void h(View view, vwl vwlVar, DocumentExtKt$createAnimatorListener$1 documentExtKt$createAnimatorListener$1) {
        t(true, view, vwlVar, documentExtKt$createAnimatorListener$1);
    }

    @Override // defpackage.ap7
    public CameraCaptureMetaData$AwbState i() {
        Integer num = (Integer) ((CaptureResult) this.b).get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return CameraCaptureMetaData$AwbState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return CameraCaptureMetaData$AwbState.INACTIVE;
        }
        if (intValue == 1) {
            return CameraCaptureMetaData$AwbState.METERING;
        }
        if (intValue == 2) {
            return CameraCaptureMetaData$AwbState.CONVERGED;
        }
        if (intValue == 3) {
            return CameraCaptureMetaData$AwbState.LOCKED;
        }
        sgb1.d("C2CameraCaptureResult", "Undefined awb state: " + num);
        return CameraCaptureMetaData$AwbState.UNKNOWN;
    }

    @Override // defpackage.ay01
    public void j(View view, vwl vwlVar, DocumentExtKt$createAnimatorListener$1 documentExtKt$createAnimatorListener$1) {
        t(false, view, vwlVar, documentExtKt$createAnimatorListener$1);
    }

    public Object k(String str, Continuation continuation) {
        ChargersOfferApi chargersOfferApi = (ChargersOfferApi) ((h3y) this.a).get();
        ((f) this.b).getClass();
        return a.b(chargersOfferApi.b(f.e(), new ChargersCreateOrderParams(str)), null, continuation);
    }

    @Override // defpackage.ap7
    public CameraCaptureMetaData$AeState l() {
        Integer num = (Integer) ((CaptureResult) this.b).get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return CameraCaptureMetaData$AeState.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return CameraCaptureMetaData$AeState.INACTIVE;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return CameraCaptureMetaData$AeState.CONVERGED;
            }
            if (intValue == 3) {
                return CameraCaptureMetaData$AeState.LOCKED;
            }
            if (intValue == 4) {
                return CameraCaptureMetaData$AeState.FLASH_REQUIRED;
            }
            if (intValue != 5) {
                sgb1.d("C2CameraCaptureResult", "Undefined ae state: " + num);
                return CameraCaptureMetaData$AeState.UNKNOWN;
            }
        }
        return CameraCaptureMetaData$AeState.SEARCHING;
    }

    @Override // defpackage.ap7
    public CaptureResult m() {
        return (CaptureResult) this.b;
    }

    public InputStream n() {
        return (a97) this.b;
    }

    public ArrayList o() {
        return (ArrayList) this.a;
    }

    public boolean p() {
        return ((CommonFeatureFlag) ((qu01) ((ro01) this.a)).b.d(wlp.G0).getData()).isEnabled() || ((ru01) this.b).a.a();
    }

    public boolean q(TaxiOrder taxiOrder) {
        noe noeVar = (noe) this.b;
        if (taxiOrder == null) {
            taxiOrder = ((o2y0) this.a).b();
        }
        return !((ooe) noeVar).c(taxiOrder) || ((ooe) noeVar).a(taxiOrder);
    }

    public void r(wyr wyrVar) {
        py5 py5Var = (py5) this.b;
        dp11 dp11Var = (dp11) this.a;
        int i = wyrVar.b;
        if (i != 0) {
            py5Var.execute(new hl7(dp11Var, i, 0));
        } else {
            py5Var.execute(new uqs(1, dp11Var, wyrVar.a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void s(int i, int i2, ArrayList arrayList) {
        jra0 jra0Var;
        byte b;
        do {
            byte[] bArr = (byte[]) this.b;
            if (bArr.length - i >= 2 && (b = bArr[i]) > 0) {
                byte b2 = bArr[i + 1];
                int i3 = i + 2;
                if (i3 < bArr.length) {
                    jra0Var = new jra0();
                    int i4 = i + b;
                    jra0Var.d = i4;
                    if (i4 >= bArr.length) {
                        jra0Var.d = bArr.length - 1;
                    }
                    jra0Var.a = b2;
                    jra0Var.b = b;
                    jra0Var.c = i3;
                    if (jra0Var != null) {
                        i = i + jra0Var.b + 1;
                        arrayList.add(jra0Var);
                    }
                    if (jra0Var != null) {
                        return;
                    }
                }
            }
            jra0Var = null;
            if (jra0Var != null) {
            }
            if (jra0Var != null) {
            }
        } while (i < i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [kh6] */
    public void t(boolean z, View view, vwl vwlVar, DocumentExtKt$createAnimatorListener$1 documentExtKt$createAnimatorListener$1) {
        Float valueOf = Float.valueOf(0.0f);
        AnimatorSet animatorSet = (AnimatorSet) this.b;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        long j = (long) vwlVar.a;
        iuw iuwVar = (iuw) this.a;
        Document$TransitionSettings$Option$Interpolator document$TransitionSettings$Option$Interpolator = vwlVar.b;
        if (document$TransitionSettings$Option$Interpolator == null) {
            document$TransitionSettings$Option$Interpolator = z ? Document$TransitionSettings$Option$Interpolator.EaseOut : Document$TransitionSettings$Option$Interpolator.EaseIn;
        }
        iuwVar.getClass();
        final BaseInterpolator b = iuw.b(document$TransitionSettings$Option$Interpolator);
        if (z) {
            final float interpolation = b.getInterpolation(0.2f);
            final float interpolation2 = b.getInterpolation(1.0f) - interpolation;
            if (interpolation2 != 0.0f) {
                b = new Interpolator() { // from class: kh6
                    @Override // android.animation.TimeInterpolator
                    public final float getInterpolation(float f) {
                        return (b.getInterpolation((0.8f * f) + 0.2f) - interpolation) / interpolation2;
                    }
                };
            }
        }
        Pair pair = z ? new Pair(valueOf, Float.valueOf(view.getAlpha())) : new Pair(Float.valueOf(view.getAlpha()), valueOf);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, ((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue());
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(b);
        float height = view.getHeight() / 6.0f;
        Pair pair2 = z ? new Pair(Float.valueOf(height), valueOf) : new Pair(valueOf, Float.valueOf(height));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, ((Number) pair2.getFirst()).floatValue(), ((Number) pair2.getSecond()).floatValue());
        ofFloat2.setDuration(j);
        ofFloat2.setInterpolator(b);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ofFloat, ofFloat2);
        animatorSet2.addListener(documentExtKt$createAnimatorListener$1);
        animatorSet2.start();
        this.b = animatorSet2;
    }

    public rb51 u(List list) {
        z22 z22Var = (z22) this.b;
        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new keo("nfc_write_blocks_start", g8e.z(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Начало записи блоков на карту")));
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new qb51(((ec51) list.get(i)).a, WriteBlocks.NO_WRITE));
        }
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        if (((MifareClassic) this.a) == null) {
            return new rb51();
        }
        try {
            new jo0(list, this, arrayList, ref$IntRef, 5).invoke();
            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new keo("nfc_write_blocks_success", gw00.e(new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Успешная запись блоков на карту"))));
        } catch (CompareDataException e) {
            sba1.k(z22Var, String.valueOf(e.getMessage()));
            int i2 = ref$IntRef.element;
            arrayList.set(i2, qb51.a((qb51) arrayList.get(i2), WriteBlocks.COMPARE_ERROR));
        } catch (ReadingException e2) {
            sba1.k(z22Var, String.valueOf(e2.getMessage()));
            int i3 = ref$IntRef.element;
            arrayList.set(i3, qb51.a((qb51) arrayList.get(i3), WriteBlocks.READ_ERROR));
        } catch (Exception e3) {
            sba1.k(z22Var, String.valueOf(e3.getMessage()));
            int i4 = ref$IntRef.element;
            arrayList.set(i4, qb51.a((qb51) arrayList.get(i4), WriteBlocks.WRITE_ERROR));
        }
        return new rb51();
    }

    public /* synthetic */ c06(Object obj) {
        this.a = obj;
    }

    public /* synthetic */ c06(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public c06(u2 u2Var, InputStream inputStream, int i) {
        this.a = u2Var;
        this.b = new a97(new BufferedInputStream(inputStream, 32768));
    }

    public c06(CaptureResult captureResult) {
        this(q6x0.b, captureResult);
    }
}
