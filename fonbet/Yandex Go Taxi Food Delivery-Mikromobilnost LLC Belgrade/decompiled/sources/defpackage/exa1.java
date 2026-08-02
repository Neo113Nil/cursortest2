package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.internal.FrameworkClassParsingException;
import com.yx360.design.compose.atoms.DsButton$Style;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.sequences.b;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class exa1 {
    public static final void a(sls slsVar, sls slsVar2, sls slsVar3, f530 f530Var, fid fidVar, int i) {
        int i2;
        sls slsVar4;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1693695976);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(slsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(slsVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            slsVar4 = slsVar3;
            i2 |= btsVar.e(slsVar4) ? 256 : 128;
        } else {
            slsVar4 = slsVar3;
        }
        int i3 = i2 | HProv.ALG_TYPE_SECURECHANNEL;
        if ((i3 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
            f530Var2 = f530Var;
        } else {
            String e = ohb1.e(btsVar, oyh0.folders_main_settings_alert_title);
            vnm vnmVar = new vnm(slsVar, DsButton$Style.Neutral, ohb1.e(btsVar, oyh0.button_no));
            String e2 = ohb1.e(btsVar, oyh0.button_yes);
            c530 c530Var = c530.a;
            qn91.a(slsVar4, e, vnmVar, c530Var, null, null, new vnm(slsVar2, DsButton$Style.Brand, e2), btsVar, ((i3 >> 6) & 14) | (i3 & 7168), 176);
            f530Var2 = c530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c8i0((Object) slsVar, (cms) slsVar2, (cms) slsVar3, f530Var2, i, 3);
        }
    }

    public static void b(TextView textView, int i, int i2, long j) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        ofObject.setDuration(j);
        ofObject.addUpdateListener(new sh2(textView, 0));
        ofObject.start();
    }

    public static GetCredentialException c(String str, String str2) {
        Exception b;
        try {
            GetPublicKeyCredentialDomException getPublicKeyCredentialDomException = new GetPublicKeyCredentialDomException(new w121(), null);
            if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                b = lk91.b(new r4(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                b = lk91.b(new e7e(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                b = lk91.b(new tng(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                b = lk91.b(new bog(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                b = lk91.b(new qzn(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                b = lk91.b(new dju(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                b = lk91.b(new oov(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                b = lk91.b(new hvw(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                b = lk91.b(new jvw(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                b = lk91.b(new kvw(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                b = lk91.b(new lvw(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                b = lk91.b(new b250(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                b = lk91.b(new qs50(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                b = lk91.b(new sc60(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                b = lk91.b(new jf60(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                b = lk91.b(new of60(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                b = lk91.b(new sf60(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                b = lk91.b(new tf60(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                b = lk91.b(new ic70(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                b = lk91.b(new zc70(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                b = lk91.b(new klg0(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                b = lk91.b(new ubi0(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                b = lk91.b(new b7q0(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                b = lk91.b(new o1x0(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                b = lk91.b(new aez0(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                b = lk91.b(new le01(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                b = lk91.b(new w121(), str2, getPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                b = lk91.b(new ea31(), str2, getPublicKeyCredentialDomException);
            } else {
                if (!str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                    throw new FrameworkClassParsingException();
                }
                b = lk91.b(new gc51(), str2, getPublicKeyCredentialDomException);
            }
            return (GetCredentialException) b;
        } catch (FrameworkClassParsingException unused) {
            return new GetCredentialCustomException(str2, str);
        }
    }

    public static final void d(View view, List list, sls slsVar) {
        view.setOnTouchListener(new rh2(0, list, slsVar));
    }

    public static void e(ViewGroup viewGroup, View.OnClickListener onClickListener) {
        jr31 jr31Var = new jr31(viewGroup, 1);
        t5r g = b.g(jr31Var, th2.a);
        EmptyList emptyList = EmptyList.a;
        d(viewGroup, b.s(b.p(new yw01(b.g(g, new qh2(emptyList, 0)), new f22(13)), new yw01(b.g(b.g(jr31Var, uh2.a), new qh2(emptyList, 1)), new f22(14)))), new j0(29, onClickListener, viewGroup));
    }

    public static Object f(Class cls, String str, gr81... gr81VarArr) {
        int length = gr81VarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i = 0; i < gr81VarArr.length; i++) {
            gr81 gr81Var = gr81VarArr[i];
            gr81Var.getClass();
            clsArr[i] = (Class) gr81Var.b;
            objArr[i] = gr81VarArr[i].c;
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }
}
