package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.ui.semantics.f;
import com.yandex.go.ble.connection.BleConnectionImpl$gattCallback$1;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoView;
import com.yandex.go.rida.bids.router.g;
import com.yandex.xplat.common.YSError;
import com.yandex.xplat.payment.sdk.ExternalConvertibleError;
import com.yandex.xplat.payment.sdk.ExternalErrorKind;
import com.yandex.xplat.payment.sdk.ExternalErrorTrigger;
import com.yandex.xplat.payment.sdk.SbpVerifyGuessStatus;
import com.ybsdk.widgets.common.bottombar.BottomBarNavigation;
import java.util.Arrays;
import java.util.LinkedHashMap;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final /* synthetic */ class ar5 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ ar5(dt20 dt20Var) {
        this.a = 2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        CharSequence onServicesDiscovered$lambda$8$0;
        zy11 onTabClickListener$lambda$0;
        int i = this.a;
        int i2 = 1;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                m5k0 m5k0Var = (m5k0) obj;
                g.S(m5k0Var.c, m5k0Var.b, m5k0Var.a);
                return zy11Var;
            case 1:
                return ((fvv) obj).h;
            case 2:
                return dt20.f((ggb) obj);
            case 3:
                y3x y3xVar = (y3x) obj;
                uhj uhjVar = (uhj) mbb1.d(y3xVar, new lhj(i2)).d();
                wj00 b = y3xVar.b();
                return new iv5(uhjVar.a, uhjVar.b, uhjVar.c, b.p("payment_method"), b.p("trust_payment_id"));
            case 4:
                return (yuv) obj;
            case 5:
                String str = ((t931) obj).c;
                return str != null ? zmx.d(new e0t0(str)) : zmx.c(new YSError("Expected deny resend until field in resend code response", null));
            case 6:
                YSError ySError = (YSError) obj;
                LinkedHashMap linkedHashMap = zdz.a;
                ogb1.b("Check status polling failed: " + ySError.getMessage());
                return zmx.c(ySError);
            case 7:
                YSError ySError2 = (YSError) obj;
                LinkedHashMap linkedHashMap2 = zdz.a;
                ogb1.b("Check status polling failed: " + ySError2.getMessage());
                return zmx.c(ySError2);
            case 8:
                zeb zebVar = (zeb) obj;
                String str2 = zebVar.h;
                return jl40.l(zebVar.i, "duplicate") ? zmx.c(new ExternalConvertibleError(ExternalErrorKind.sbp_token_duplicate, ExternalErrorTrigger.diehard, null, null, g8e.o("Successful binding of a duplicate token: ", str2))) : zmx.d(new vim0(zebVar.e, str2));
            case 9:
                t931 t931Var = (t931) obj;
                return new u931(t931Var.a.equals("success") ? SbpVerifyGuessStatus.correct : SbpVerifyGuessStatus.incorrect, t931Var.b);
            case 10:
                zeb zebVar2 = (zeb) obj;
                return new sb8(zebVar2.e, zebVar2.f);
            case 11:
                YSError ySError3 = (YSError) obj;
                LinkedHashMap linkedHashMap3 = zdz.a;
                ogb1.b("Check status polling failed: " + ySError3.getMessage());
                return zmx.c(ySError3);
            case 12:
                YSError ySError4 = (YSError) obj;
                LinkedHashMap linkedHashMap4 = zdz.a;
                ogb1.b("Check status polling failed: " + ySError4.getMessage());
                return zmx.c(ySError4);
            case 13:
                return zy11Var;
            case 14:
                return (yuv) obj;
            case 15:
                return hia1.b(((String) obj) + "_awaiting");
            case 16:
                onServicesDiscovered$lambda$8$0 = BleConnectionImpl$gattCallback$1.onServicesDiscovered$lambda$8$0((BluetoothGattCharacteristic) obj);
                return onServicesDiscovered$lambda$8$0;
            case 17:
                Byte b2 = (Byte) obj;
                b2.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b2}, 1));
            case 18:
                f.a((mnq0) obj);
                return zy11Var;
            case 19:
                f.a((mnq0) obj);
                return zy11Var;
            case 20:
                i46 i46Var = ((h46) obj).a;
                if (i46Var.E.a()) {
                    i46Var.z((m950) i46Var.F.get(), new h46(i46Var));
                } else {
                    i46Var.r(new qu(9));
                }
                return zy11Var;
            case 21:
                ((c1y) obj).a();
                return zy11Var;
            case 22:
                onTabClickListener$lambda$0 = BottomBarNavigation.onTabClickListener$lambda$0((tb6) obj);
                return onTabClickListener$lambda$0;
            case 23:
                RobotoTextView robotoTextView = new RobotoTextView(((ViewGroup) obj).getContext(), null, 0, 6, null);
                robotoTextView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                robotoTextView.setTextSize(tje.s(mrg0.component_text_size_body, robotoTextView.getContext()));
                robotoTextView.setTextColor(new bdc(xng0.textMain));
                return robotoTextView;
            case 24:
                GoImageView goImageView = new GoImageView(((ViewGroup) obj).getContext(), null, 0, 6, null);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(tje.u(40, goImageView.getContext()), tje.u(40, goImageView.getContext()));
                marginLayoutParams.setMargins(tje.u(10, goImageView.getContext()), tje.u(10, goImageView.getContext()), marginLayoutParams.rightMargin, tje.r(mrg0.go_design_s_space, goImageView.getContext()));
                goImageView.setLayoutParams(marginLayoutParams);
                goImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                goImageView.setImportantForAccessibility(2);
                return goImageView;
            case 25:
                GoView goView = new GoView(((ViewGroup) obj).getContext(), null, 0, 0, 14, null);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, tje.u(1, goView.getContext()));
                marginLayoutParams2.setMargins(tje.u(16, goView.getContext()), marginLayoutParams2.topMargin, tje.u(16, goView.getContext()), marginLayoutParams2.bottomMargin);
                goView.setLayoutParams(marginLayoutParams2);
                goView.setBackgroundAttr(xng0.line);
                goView.setFocusable(false);
                goView.setImportantForAccessibility(4);
                return goView;
            case 26:
                return new ad6((yss0) ((View) obj));
            case 27:
                GoView goView2 = new GoView(((ViewGroup) obj).getContext(), null, 0, 0, 14, null);
                goView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                goView2.setBackgroundColor(goView2.getContext().getColor(xqg0.transparent));
                goView2.setFocusable(false);
                goView2.setImportantForAccessibility(4);
                return goView2;
            case 28:
                RobotoTextView robotoTextView2 = new RobotoTextView(((ViewGroup) obj).getContext(), null, 0, 6, null);
                robotoTextView2.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                robotoTextView2.setTextSize(tje.s(mrg0.component_text_size_title, robotoTextView2.getContext()));
                robotoTextView2.setTextColor(new bdc(xng0.textMain));
                robotoTextView2.setTextTypeface(5);
                return robotoTextView2;
            default:
                return zy11Var;
        }
    }

    public /* synthetic */ ar5(int i) {
        this.a = i;
    }
}
