package defpackage;

import android.app.UiModeManager;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import com.google.android.gms.tasks.Task;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.squareup.moshi.JsonDataException;
import com.yandex.div.evaluable.EvaluableException;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.impl.Eq;
import io.appmetrica.analytics.impl.Kn;
import io.appmetrica.analytics.impl.L8;
import io.appmetrica.analytics.locationinternal.impl.J;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final /* synthetic */ class kbs implements pke, flu, f2f0, rix, FunctionWithThrowable, r131, Eq {
    public final /* synthetic */ int a;

    public /* synthetic */ kbs(yuf0 yuf0Var) {
        this.a = 3;
    }

    public static /* synthetic */ void d(double d, String str) {
        throw new IllegalArgumentException(str + d);
    }

    public static /* synthetic */ void e(Object obj, Object obj2, Object obj3) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void f(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void g(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void i(String str, int i, Object obj) {
        throw new IllegalArgumentException(str + i + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void j(String str, Object obj, int i) {
        throw new IllegalArgumentException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3) {
        throw new JsonDataException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void n(String str, Throwable th) {
        throw new EvaluableException(str, th);
    }

    public static /* synthetic */ void o(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static /* synthetic */ void p(StringBuilder sb, Object obj) {
        sb.append(" at path ");
        sb.append(obj);
        throw new com.apollographql.apollo3.exception.JsonDataException(sb.toString());
    }

    public static /* synthetic */ void q(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void r(Throwable th) {
        throw new IOException(th);
    }

    public static /* synthetic */ void s(Object obj, String str) {
        throw new JsonDataException(str + obj);
    }

    public static /* synthetic */ void t(String str) {
        throw new InvalidAlgorithmParameterException(str);
    }

    public static /* synthetic */ void u(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new JsonDataException(sb.toString());
    }

    public static /* synthetic */ void v(String str) {
        throw new GeneralSecurityException(str);
    }

    @Override // defpackage.rix
    public lhx a(yuf0 yuf0Var) {
        if (!((String) yuf0Var.a).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            ny61.g("Wrong type URL in call to HmacProtoSerialization.parseKey");
            return null;
        }
        try {
            mou F = mou.F((ByteString) yuf0Var.c, oyo.b());
            if (F.D() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            wjm wjmVar = new wjm();
            wjmVar.x(F.B().size());
            wjmVar.y(F.C().B());
            wjmVar.w(zou.a(F.C().A()));
            wjmVar.z(zou.b((OutputPrefixType) yuf0Var.e));
            tou a = wjmVar.a();
            r1s r1sVar = new r1s();
            r1sVar.r(a);
            r1sVar.p(new va90(u77.a(F.B().j())));
            r1sVar.n((Integer) yuf0Var.f);
            return r1sVar.a();
        } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
            v("Parsing HmacKey failed");
            return null;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* renamed from: apply */
    public Object mo489apply(Object obj) {
        switch (this.a) {
            case 15:
                return J.a((TelephonyManager) obj);
            default:
                return L8.a((UiModeManager) obj);
        }
    }

    @Override // defpackage.f2f0
    public Object b(lhx lhxVar) {
        return new ysb();
    }

    @Override // defpackage.flu
    public boolean c() {
        switch (this.a) {
            case 7:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.pke
    public Object h(Task task) {
        Bundle bundle = (Bundle) task.l(IOException.class);
        if (bundle == null) {
            ny61.v("SERVICE_NOT_AVAILABLE");
            return null;
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            ny61.v("INSTANCE_ID_RESET");
            return null;
        }
        if (string3 != null) {
            ny61.v(string3);
            return null;
        }
        bundle.toString();
        new Throwable();
        ny61.v("SERVICE_NOT_AVAILABLE");
        return null;
    }

    @Override // defpackage.r131
    public boolean l(Object obj) {
        switch (this.a) {
            case 17:
                return !((String) obj).isEmpty();
            case 18:
                kbs kbsVar = pdx.a;
                return true;
            case 19:
                return true;
            default:
                return ((String) obj).length() > 0;
        }
    }

    public /* synthetic */ kbs(int i) {
        this.a = i;
    }

    @Override // io.appmetrica.analytics.impl.Eq
    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return Kn.a(sQLiteDatabase);
    }
}
