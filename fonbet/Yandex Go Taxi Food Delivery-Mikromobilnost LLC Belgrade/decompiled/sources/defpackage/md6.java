package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.camera2.CaptureResult;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.camera2.internal.l;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.CameraCaptureMetaData$AeState;
import androidx.camera.core.impl.CameraCaptureMetaData$AfState;
import androidx.camera.core.impl.CameraCaptureMetaData$AwbState;
import androidx.camera.core.impl.CameraCaptureMetaData$FlashState;
import androidx.camera.core.impl.utils.ExifData$WhiteBalanceMode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.go.logistics.cargo_flow.form.cost_centers.a;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.BulletsOrderPopup;
import com.yandex.go.zone.dto.objects.PaidOptions;
import com.yandex.go.zone.dto.objects.u2;
import com.yandex.messaging.base.rights.OrganizationRightsFlag;
import com.yandex.messaging.core.net.entities.ChatData;
import com.yandex.messaging.core.net.entities.UserData;
import com.yandex.messaging.internal.net.Error;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.Collections;
import org.webrtc.MediaStreamTrack;
import ru.yandex.taxi.logistics.address.g;
import ru.yandex.taxi.logistics.photocomment.c;

/* loaded from: classes12.dex */
public final class md6 implements upr, z87, r87, ca20, ap7, iqs, jg5, u8v, jw8, ho3, fo3, a9b {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public md6(final cv8 cv8Var, final dv8 dv8Var, final q1f q1fVar, final qnh qnhVar, final nwh nwhVar, final oyh oyhVar, final vyh vyhVar, final f4l0 f4l0Var, final a aVar, final com.yandex.go.logistics.cargo_flow.form.repository.a aVar2, final String str, final g gVar, final ru.yandex.taxi.logistics.payment.a aVar3, final c cVar) {
        String str2;
        this.a = 19;
        String o = g8e.o("delivery_order_form_", str);
        a6s a6sVar = cv8Var.b;
        this.b = j73.A(new String[]{"delivery_order_form", o, (a6sVar == null || (str2 = a6sVar.a) == null) ? null : b64.l("delivery_order_form_", str, "_", str2)});
        this.c = kotlin.a.a(new sls() { // from class: dw8
            @Override // defpackage.sls
            public final Object invoke() {
                xni a;
                com.yandex.go.logistics.cargo_flow.form.repository.a aVar4 = aVar2;
                q1f q1fVar2 = q1fVar;
                nv8 nv8Var = new nv8(cv8Var, dv8Var, str, aVar3, vyhVar, f4l0Var, gVar, new ji41(2, new com.yandex.go.logistics.cargo_flow.form.a(nwhVar)), cVar, aVar, qnhVar, oyhVar, new d4s(aVar4, q1fVar2));
                synchronized (bvf0.g) {
                    y8g y8gVar = bvf0.e;
                    if (y8gVar == null) {
                        y8gVar = null;
                    }
                    a = ((wv8) y8gVar.H1.get()).a(nv8Var);
                }
                return a;
            }
        });
    }

    private final void p(Throwable th) {
    }

    @Override // defpackage.go3
    public void D(Object obj) {
        x4b0 A;
        UserData userData = (UserData) obj;
        u1b u1bVar = (u1b) this.c;
        w1b w1bVar = (w1b) this.b;
        k020 k020Var = w1bVar.b;
        UserData.EmployeeInfo[] employeeInfoArr = userData.employeesInfo;
        if ((employeeInfoArr == null || employeeInfoArr.length == 0) && k020Var.v()) {
            u1bVar.g(Error.GENERIC);
        } else if (!w1bVar.n.a(tz10.L) || (A = k020Var.A()) == null || A.c(OrganizationRightsFlag.CanCreateChat, w1bVar.m.c())) {
            u1b.a(u1bVar, userData);
        } else {
            u1bVar.g(Error.HAS_NO_RIGHTS);
        }
    }

    @Override // defpackage.ap7
    public void a(ilo iloVar) {
        ArrayList arrayList = iloVar.a;
        CaptureResult captureResult = (CaptureResult) this.c;
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
        return (q6x0) this.b;
    }

    @Override // defpackage.ho3
    /* renamed from: c */
    public boolean mo103c(int i) {
        ((u1b) this.c).g(Error.GENERIC);
        return true;
    }

    @Override // defpackage.a9b
    public void close() {
        this.c = null;
    }

    @Override // defpackage.ap7
    public CameraCaptureMetaData$FlashState d() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.FLASH_STATE);
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

    @Override // defpackage.upr
    public void e(int i, Intent intent) {
        p61 p61Var = new p61(this, intent, i, 4);
        md6 md6Var = ((m2a0) ((hh5) this.c).b).b.h;
        if (md6Var == null) {
            p61Var.invoke();
            return;
        }
        og6 og6Var = (og6) md6Var.c;
        if (og6Var == null) {
            p61Var.invoke();
            return;
        }
        BottomSheetBehavior bottomSheetBehavior = og6Var.h;
        if (bottomSheetBehavior == null) {
            p61Var.invoke();
            return;
        }
        int i2 = bottomSheetBehavior.k0;
        c06 c06Var = og6Var.k;
        if (i2 != 5) {
            c06Var.b = p61Var;
            bottomSheetBehavior.W(5);
        } else {
            c06Var.b = p61Var;
            c06Var.b = null;
            p61Var.invoke();
        }
    }

    @Override // defpackage.ap7
    public CameraCaptureMetaData$AfState f() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AF_STATE);
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

    @Override // defpackage.fo3
    public void g(Error error) {
    }

    @Override // defpackage.q87
    public Object getContent() {
        return rza1.b((byte[]) this.c);
    }

    @Override // defpackage.r87
    public InputStream getInputStream() {
        return new ByteArrayInputStream((byte[]) this.c);
    }

    @Override // defpackage.ap7
    public long getTimestamp() {
        Long l = (Long) ((CaptureResult) this.c).get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    @Override // defpackage.fo3
    public void h(ChatData chatData, UserData userData) {
        l020 C = ((i7b) this.b).c.C();
        try {
            C.B(chatData.getChatId(), true);
            if (userData != null) {
                C.P0(userData);
            }
            C.I(chatData);
            C.s();
            C.close();
            d7b d7bVar = (d7b) this.c;
            d7bVar.a = d7bVar.b.f(d7bVar.c, d7bVar.w, d7bVar.x);
        } finally {
        }
    }

    @Override // defpackage.ap7
    public CameraCaptureMetaData$AwbState i() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AWB_STATE);
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

    @Override // defpackage.u8v
    public void j(ImageCaptureException imageCaptureException) {
        ((File) this.c).delete();
    }

    @Override // defpackage.u8v
    public void k(reu reuVar) {
        ((tls) this.b).invoke((File) this.c);
    }

    @Override // defpackage.ap7
    public CameraCaptureMetaData$AeState l() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AE_STATE);
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
        return (CaptureResult) this.c;
    }

    public cu6 n() {
        pex0 m = ((k) ((wiq0) this.b)).m();
        if (m == null) {
            return cu6.d;
        }
        PaidOptions paidOptions = m.e0;
        u2 u2Var = paidOptions.f;
        return (!m.h() && paidOptions.e && (u2Var instanceof BulletsOrderPopup)) ? ((au6) this.c).a((BulletsOrderPopup) u2Var) : cu6.d;
    }

    public void o(ChatData chatData) {
        l020 C;
        n3b n3bVar = (n3b) this.c;
        k020 k020Var = n3bVar.a;
        if (chatData == null) {
            C = k020Var.C();
            try {
                C.d((String) this.b, false);
                C.s();
                C.close();
                return;
            } finally {
            }
        }
        z83.g(null, n3bVar.c, Looper.myLooper());
        C = k020Var.C();
        try {
            C.I(chatData);
            C.s();
            C.close();
            s020 e = n3bVar.d.e(chatData.getChatId());
            if (e != null) {
                l270 l270Var = (l270) ((m8g) e).s0.get();
                z83.g(null, l270Var.a, Looper.myLooper());
                if (l270Var.e != null) {
                    return;
                }
                l270Var.e = l270Var.d.f(new xlu(l270Var, l270Var.b.a.b));
            }
        } finally {
        }
    }

    @Override // defpackage.iqs
    public void onFailure(Throwable th) {
        switch (this.a) {
            case 11:
                break;
            default:
                tob1.b();
                m6f0 m6f0Var = (m6f0) this.b;
                j4n j4nVar = (j4n) this.c;
                m6f0 m6f0Var2 = (m6f0) j4nVar.a;
                if (m6f0Var == m6f0Var2) {
                    int i = m6f0Var2.a;
                    sgb1.g(5, "CaptureNode");
                    ht10 ht10Var = (ht10) j4nVar.w;
                    if (ht10Var != null) {
                        ht10Var.c = null;
                    }
                    j4nVar.a = null;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        try {
            if (!jl40.l(x920Var.a, "getNormalizedCallVolumeLevel")) {
                ((ba20) da20Var).notImplemented();
                return;
            }
            AudioManager audioManager = (AudioManager) ((Context) this.b).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            int streamVolume = audioManager.getStreamVolume(0);
            int streamMaxVolume = audioManager.getStreamMaxVolume(0);
            ((ba20) da20Var).success(streamMaxVolume > 0 ? Double.valueOf(streamVolume / streamMaxVolume) : null);
        } catch (Exception e) {
            f69 f69Var = xi7.a;
            xi7.a.m(g8e.o("onMethodCall error: ", e.getMessage()), null, Collections.singletonList("CallVolumeHandler"));
            ((ba20) da20Var).error("UNKNOWN_ERROR", e.getMessage(), e);
        }
    }

    @Override // defpackage.iqs
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 11:
                ((l) this.c).J.remove((f48) this.b);
                int ordinal = ((l) this.c).x.ordinal();
                if (ordinal != 1 && ordinal != 5) {
                    if (ordinal == 6 || (ordinal == 7 && ((l) this.c).E != 0)) {
                        ((l) this.c).w("Camera reopen required. Checking if the current camera can be closed safely.");
                    }
                }
                if (((l) this.c).J.isEmpty()) {
                    l lVar = (l) this.c;
                    if (lVar.D != null) {
                        lVar.w("closing camera");
                        ((l) this.c).D.close();
                        ((l) this.c).D = null;
                        break;
                    }
                }
                break;
            default:
                break;
        }
    }

    @Override // defpackage.a9b
    public e1k w(s020 s020Var) {
        m8g m8gVar = (m8g) s020Var;
        return new u2c0(new oy80(14, (oab) m8gVar.h.get(), (w2c0) m8gVar.k.get()), this);
    }

    @Override // defpackage.q87
    public void write(OutputStream outputStream) {
        outputStream.write((byte[]) this.c);
    }

    @Override // defpackage.jg5
    public void y(ig5 ig5Var, jh5 jh5Var) {
        Context context;
        PackageManager.PackageInfoFlags of;
        if ((ig5Var instanceof lu7) && (context = (Context) ((fke) this.b).a()) != null) {
            lu7 lu7Var = (lu7) ig5Var;
            String str = lu7Var.b;
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    of = PackageManager.PackageInfoFlags.of(0L);
                    packageManager.getPackageInfo(str, of);
                } else {
                    packageManager.getPackageInfo(str, 0);
                }
                z = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            FlexAdapter flexAdapter = (FlexAdapter) this.c;
            if (flexAdapter != null) {
                flexAdapter.updateVariable(lu7Var.c, Boolean.valueOf(z));
            }
        }
    }

    public /* synthetic */ md6(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public md6(byte[] bArr) {
        this(6, p87.Z0, bArr);
        this.a = 6;
    }

    public md6(Activity activity, dna dnaVar, w2a0 w2a0Var, boolean z) {
        this.a = 2;
        this.b = w2a0Var;
    }

    public md6(Context context, tt5 tt5Var) {
        this.a = 9;
        this.b = context;
        ea20 ea20Var = new ea20(tt5Var, "in-app-calls/call_volume_level");
        this.c = ea20Var;
        f69 f69Var = xi7.a;
        f69.k("init", Collections.singletonList("CallVolumeHandler"));
        ea20Var.b(this);
    }

    public md6(x22 x22Var) {
        this.a = 26;
        this.b = x22Var;
    }

    public /* synthetic */ md6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public md6(com.yandex.messaging.internal.view.chat.c cVar) {
        this.a = 28;
        this.b = new Handler();
        this.c = cVar;
    }

    public md6() {
        this.a = 15;
    }
}
