package xsna;

import android.content.Context;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Base64;
import com.vk.dto.common.id.UserId;
import com.vk.silentauth.SilentAuthInfo;
import java.security.MessageDigest;
import java.util.Calendar;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SilentAuthInfoUtils.kt */
/* loaded from: classes5.dex */
public final class bnj0 {
    public static final bnj0 a = new bnj0();
    public static final List<String> b = e43.l("86259288a43f6c409a922bc3ce40ba08085bbadb", "48761eef50ee53afc4cc9c5f10e6bde7f8f5b82f");

    /* compiled from: SilentAuthInfoUtils.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Signature, String> {
        @Override // xsna.izs
        public final String invoke(Signature signature) {
            ((bnj0) this.receiver).getClass();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            messageDigest.update(signature.toByteArray());
            return Base64.encodeToString(messageDigest.digest(), 0);
        }
    }

    public static String b(Context context, String str, izs izsVar) {
        Signature signature;
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
            if (signatureArr == null || (signature = (Signature) rl3.O(signatureArr)) == null) {
                return null;
            }
            return (String) izsVar.invoke(signature);
        } catch (Exception unused) {
            return null;
        }
    }

    public static SilentAuthInfo c(bnj0 bnj0Var, String str, String str2, int i, String str3) {
        bnj0Var.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.add(13, i);
        UserId userId = UserId.d;
        long timeInMillis = calendar.getTimeInMillis();
        Bundle bundle = new Bundle(1);
        bundle.putString("key_service_name", str3);
        return new SilentAuthInfo(userId, str2, str, timeInMillis, "", null, null, null, "", null, null, bundle, 0, null, null, null, 0, null, 259072, null);
    }

    public final String a(Context context) {
        return b(context, context.getPackageName(), new a(1, this, bnj0.class, "calculateDigestBase64", "calculateDigestBase64(Landroid/content/pm/Signature;)Ljava/lang/String;", 0));
    }
}
