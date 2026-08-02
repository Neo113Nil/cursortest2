package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.mail.auth.contract.result.userblockstatus.MailBlockStatusError;
import com.vk.mail.auth.contract.result.userblockstatus.MailUserBlockedStatus;
import com.vk.superapp.api.exceptions.AuthException;
import java.lang.reflect.Method;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Result;
import xsna.l55;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class tk1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tk1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object failure;
        switch (this.b) {
            case 0:
                return new zk1((b2a) obj, (o0r0) this.c, (com.vk.video.kidsprofile.restricteduseractions.a) this.d);
            case 1:
                Throwable th = (Throwable) this.c;
                String str = (String) this.d;
                MailUserBlockedStatus mailUserBlockedStatus = (MailUserBlockedStatus) obj;
                int i = mailUserBlockedStatus == null ? -1 : l55.a.$EnumSwitchMapping$0[mailUserBlockedStatus.ordinal()];
                if (i != 1) {
                    th = i != 2 ? new MailBlockStatusError.CheckAccBlockRequestException("unknown status!") : new AuthException.MailAccountBlockedException(str);
                }
                return io.reactivex.rxjava3.core.q.H(th);
            default:
                String str2 = (String) this.c;
                ohk0 ohk0Var = (ohk0) this.d;
                UnknownHostException unknownHostException = (UnknownHostException) obj;
                nvn.b.getClass();
                List b = nvn.b(str2, ohk0Var);
                if (b != null) {
                    return b;
                }
                try {
                    Object d = ((Result) nvn.e.getValue()).d();
                    kotlin.a.a(d);
                    failure = ((Method) d).invoke(null, null);
                } catch (Throwable th2) {
                    failure = new Result.Failure(th2);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.d, new Object[]{ms9.b("Can't clear DNS ", a)});
                    }
                }
                if (!(failure instanceof Result.Failure)) {
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l2, L.LogType.d, new Object[]{"DNS cleared successfully"});
                    }
                }
                Throwable a2 = Result.a(failure);
                if (a2 != null) {
                    mnh0.d(unknownHostException, a2);
                    throw unknownHostException;
                }
                if (ohk0Var != null) {
                    ohk0Var.j("dns.cache_cleared", jk3.e);
                }
                return nvn.c(str2, ohk0Var);
        }
    }
}
