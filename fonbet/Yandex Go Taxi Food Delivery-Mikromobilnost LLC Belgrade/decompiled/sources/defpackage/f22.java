package defpackage;

import android.text.Editable;
import android.widget.ImageView;
import android.widget.TextView;
import com.fluttercandies.photo_manager.core.utils.a;
import com.yandex.go.captcha.api.AuthChallengeResult;
import com.yandex.go.captcha.b;
import com.ybsdk.core.transfer.utils.AmountTextWatcher;
import defpackage.tls;
import defpackage.y4c0;
import defpackage.zy11;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Result;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.am.AuthCancellationException;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;

/* loaded from: classes14.dex */
public final /* synthetic */ class f22 implements tls {
    public final /* synthetic */ int a;

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 _init_$lambda$0;
        int i = this.a;
        int i2 = 0;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                _init_$lambda$0 = AmountTextWatcher._init_$lambda$0((Editable) obj);
                return _init_$lambda$0;
            case 1:
                czj0 czj0Var = (czj0) obj;
                if (czj0Var.d) {
                    Throwable th = czj0Var.c;
                    Objects.requireNonNull(th);
                    qwf0.a("Analyzer.analyze", th);
                }
                return null;
            case 2:
                return Float.valueOf(((Float) obj).floatValue() / 2.0f);
            case 3:
                return Boolean.TRUE;
            case 4:
                ((Integer) obj).getClass();
                return Float.valueOf(Float.NaN);
            case 5:
                return Boolean.TRUE;
            case 6:
                return new t62((agj) obj);
            case 7:
                return new u62((fdu) obj);
            case 8:
                return new r62((v81) obj);
            case 9:
                return new w62((kmq0) obj);
            case 10:
                return new v62((iej0) obj);
            case 11:
                return new s62((ie3) obj);
            case 12:
                a aVar = a.b;
                return "?";
            case 13:
                return new vo31((ImageView) obj);
            case 14:
                TextView textView = (TextView) obj;
                return new xo31(textView, textView.getTextColors().getDefaultColor());
            case 15:
                return Boolean.valueOf(((d530) obj).getClass().getName().equals("androidx.compose.animation.SizeAnimationModifierElement"));
            case 16:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 17:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 18:
                return Boolean.valueOf(!(((fk2) obj) instanceof gc90));
            case 19:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 20:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 21:
                Pair pair = (Pair) obj;
                return pair.c() + " = " + pair.f() + "MB";
            case 22:
                return new z5w((((int) (r13 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (((int) (((k6w) obj).a >> 32)) << 32));
            case 23:
                return new z5w((((int) (r13 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (((int) (((k6w) obj).a >> 32)) << 32));
            case 24:
                Map.Entry entry = (Map.Entry) obj;
                return ((String) entry.getKey()) + "=" + entry.getValue();
            case 25:
                return Boolean.valueOf(((u2r) obj).b.isImage());
            case 26:
                return zy11Var;
            case 27:
                final y4c0 y4c0Var = ((b) obj).a;
                y4c0Var.r(new qu(9));
                ((fb20) y4c0Var.F).a.a("Antirobot.AuthChallenge.Explain.Tap", new Pair[0]);
                ((jj3) y4c0Var.G).c(new um3(Events$Zalogin$LoginContext.AUTH_CHALLENGE, new qzj0(null, new tls() { // from class: com.yandex.go.captcha.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        tls tlsVar = (tls) y4c0.this.H;
                        Object value = ((Result) obj2).getValue();
                        if (!(value instanceof Result.Failure)) {
                            ((AuthChallengeActivityListener$showExplainDialog$1) tlsVar).invoke(AuthChallengeResult.Success);
                        }
                        Throwable a = Result.a(value);
                        if (a != null) {
                            if (a instanceof AuthCancellationException) {
                                ((AuthChallengeActivityListener$showExplainDialog$1) tlsVar).invoke(AuthChallengeResult.Failure);
                            } else {
                                ((AuthChallengeActivityListener$showExplainDialog$1) tlsVar).invoke(AuthChallengeResult.Success);
                            }
                        }
                        return zy11.a;
                    }
                }), false, false, 20));
                return zy11Var;
            case 28:
                n70 n70Var = (n70) obj;
                n70Var.W(new ns3(n70Var, i2));
                return zy11Var;
            default:
                return new pbv((dcv) null, (dcv) null, (tev) rev.o, (vfv) h2b1.G, (String) obj, false);
        }
    }

    public /* synthetic */ f22(int i) {
        this.a = i;
    }
}
