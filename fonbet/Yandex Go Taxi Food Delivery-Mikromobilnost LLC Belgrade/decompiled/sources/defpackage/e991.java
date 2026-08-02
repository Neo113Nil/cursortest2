package defpackage;

import android.content.Context;
import com.yandex.payment.sdk.core.data.ConsoleLoggingMode;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.ybsdk.widgets.common.MoneyInputEditView;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.yandex.taxi.contacts.SelectedFrom;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliverySelectedFrom;

/* loaded from: classes5.dex */
public abstract class e991 {
    public static final char[] a = {MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final c0a0 a(Context context, u02 u02Var) {
        u02Var.getClass();
        PaymentSdkEnvironment paymentSdkEnvironment = PaymentSdkEnvironment.PRODUCTION;
        a0a0 a0a0Var = new a0a0();
        a0a0Var.a = context.getApplicationContext();
        a0a0Var.b = paymentSdkEnvironment;
        a0a0Var.c = ConsoleLoggingMode.AUTOMATIC;
        return a0a0Var.a();
    }

    public static final boolean b(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public static String c(ByteArrayInputStream byteArrayInputStream) {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bArr = new byte[1024];
        int read = byteArrayInputStream.read(bArr, 0, 1024);
        while (read > -1) {
            messageDigest.update(bArr, 0, read);
            read = byteArrayInputStream.read(bArr, 0, 1024);
        }
        byte[] digest = messageDigest.digest();
        char[] cArr = new char[digest.length << 1];
        int i = 0;
        for (byte b : digest) {
            int i2 = i + 1;
            char[] cArr2 = a;
            cArr[i] = cArr2[(b & 240) >>> 4];
            i += 2;
            cArr[i2] = cArr2[b & PKIBody._CCP];
        }
        return new String(cArr);
    }

    public static final int d(idc idcVar, boolean z) {
        if (idcVar instanceof ddc) {
            return ((ddc) idcVar).a;
        }
        if (idcVar instanceof fdc) {
            fdc fdcVar = (fdc) idcVar;
            return z ? fdcVar.b : fdcVar.a;
        }
        w511.b();
        return 0;
    }

    public static final r0i e(bgq0 bgq0Var) {
        DeliverySelectedFrom deliverySelectedFrom;
        String str = bgq0Var.a;
        String str2 = bgq0Var.b;
        int i = t0i.a[bgq0Var.c.ordinal()];
        if (i == 1) {
            deliverySelectedFrom = DeliverySelectedFrom.CONTACTS;
        } else if (i == 2) {
            deliverySelectedFrom = DeliverySelectedFrom.LAST_CONTACTS;
        } else if (i == 3) {
            deliverySelectedFrom = DeliverySelectedFrom.MANUAL;
        } else if (i == 4) {
            deliverySelectedFrom = DeliverySelectedFrom.STANDALONE;
        } else {
            if (i != 5) {
                w511.b();
                return null;
            }
            deliverySelectedFrom = DeliverySelectedFrom.SUGGEST;
        }
        return new r0i(str, str2, deliverySelectedFrom);
    }

    public static final bgq0 f(r0i r0iVar) {
        SelectedFrom selectedFrom;
        String str = r0iVar.a;
        String str2 = r0iVar.b;
        switch (t0i.b[r0iVar.c.ordinal()]) {
            case 1:
                selectedFrom = SelectedFrom.CONTACTS;
                break;
            case 2:
                selectedFrom = SelectedFrom.LAST_CONTACTS;
                break;
            case 3:
                selectedFrom = SelectedFrom.MANUAL;
                break;
            case 4:
                selectedFrom = SelectedFrom.STANDALONE;
                break;
            case 5:
                selectedFrom = SelectedFrom.MANUAL;
                break;
            case 6:
                selectedFrom = SelectedFrom.SUGGEST;
                break;
            default:
                w511.b();
                return null;
        }
        return new bgq0(str, str2, selectedFrom, 8);
    }
}
