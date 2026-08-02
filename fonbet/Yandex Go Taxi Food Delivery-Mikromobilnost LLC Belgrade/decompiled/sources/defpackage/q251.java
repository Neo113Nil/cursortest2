package defpackage;

import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.adapter.extensions.a;
import com.yandex.go.payments.data.model.response.Card;
import com.yandex.go.payments.data.model.response.YapeToken;
import com.yandex.go.payments.data.model.response.b2;
import com.yandex.xplat.xflags.LanguageKind;
import java.lang.reflect.Method;
import java.util.Locale;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes2.dex */
public final /* synthetic */ class q251 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ q251(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        Object newInstance;
        Method method;
        WindowLayoutComponent a;
        String str = null;
        switch (this.a) {
            case 0:
                return new p53(auu0.a, 0);
            case 1:
                return wv.Companion.serializer();
            case 2:
                return new p53(a2x.Companion.serializer(), 0);
            case 3:
                return new p53(auu0.a, 0);
            case 4:
                try {
                    ClassLoader classLoader = o651.class.getClassLoader();
                    gpl0 gpl0Var = classLoader != null ? new gpl0(classLoader, new yfa(classLoader)) : null;
                    if (gpl0Var == null || (a = gpl0Var.a()) == null) {
                        return null;
                    }
                    yfa yfaVar = new yfa(classLoader);
                    int a2 = uzo.a();
                    return a2 >= 9 ? new ezo(a, yfaVar) : a2 >= 6 ? new dzo(a, yfaVar) : a2 >= 2 ? new czo(a, yfaVar) : a2 == 1 ? new a(a, yfaVar) : new bzo();
                } catch (Throwable unused) {
                    return null;
                }
            case 5:
                v851 v851Var = u851.Companion;
                return new k8u(auu0.a, s851.a, 1);
            case 6:
                v851 v851Var2 = u851.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 7:
                throw new IllegalStateException("No GloballyPositionedListener provided");
            case 8:
                String language = Locale.getDefault().getLanguage();
                if (language != null) {
                    int hashCode = language.hashCode();
                    if (hashCode != 3241) {
                        if (hashCode != 3651) {
                            if (hashCode != 3710) {
                                if (hashCode == 3734 && language.equals("uk")) {
                                    return LanguageKind.Uk;
                                }
                            } else if (language.equals("tr")) {
                                return LanguageKind.Tr;
                            }
                        } else if (language.equals(ClearCryptoProPrefs.COUNTRY)) {
                            return LanguageKind.Ru;
                        }
                    } else if (language.equals("en")) {
                        return LanguageKind.En;
                    }
                }
                return LanguageKind.Other;
            case 9:
                try {
                    str = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, "ro.miui.ui.version.name");
                } catch (Exception unused2) {
                }
                return Boolean.valueOf((str == null || str.length() == 0) ? false : true);
            case 10:
                return zy11.a;
            case 11:
                try {
                    Class<?> cls = Class.forName("com.yandex.payment.sdk.bankadapter.YBAdapterFactory");
                    newInstance = cls.getConstructor(null).newInstance(null);
                    method = cls.getMethod("create", null);
                } catch (ClassNotFoundException unused3) {
                }
                if (!jp4.class.isAssignableFrom(method.getReturnType())) {
                    return null;
                }
                method.invoke(newInstance, null);
                throw new ClassCastException();
            case 12:
                com.yandex.payment.sdk.core.utils.a aVar = com.yandex.payment.sdk.core.utils.a.a;
                com.yandex.payment.sdk.core.utils.a.c();
                return Boolean.FALSE;
            case 13:
                throw new IllegalStateException("No YandexColors provided");
            case 14:
                return new vl51(0, lzr.A);
            case 15:
                return new vl51(1, lzr.E);
            case 16:
                return new vl51(0, lzr.G);
            case 17:
                return new vl51(1, lzr.G);
            case 18:
                return new vl51(0, lzr.H);
            case 19:
                return new vl51(1, lzr.H);
            case 20:
                return vez0.a(m5h0.ys_logotype_regular, lzr.F, 0, 8);
            case 21:
                return new vl51(1, lzr.A);
            case 22:
                return new vl51(0, lzr.C);
            case 23:
                return new vl51(1, lzr.C);
            case 24:
                return new vl51(0, lzr.D);
            case 25:
                return new vl51(1, lzr.D);
            case 26:
                return new vl51(0, lzr.E);
            case 27:
                return new YandexShapes(0, 0, 15);
            case 28:
                return new zm51();
            default:
                b2 b2Var = YapeToken.Companion;
                return Card.VerifyStrategy.Companion.serializer();
        }
    }
}
