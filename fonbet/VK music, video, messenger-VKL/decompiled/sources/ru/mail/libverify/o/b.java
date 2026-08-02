package ru.mail.libverify.o;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.api.s;
import ru.mail.libverify.g.b;
import ru.mail.libverify.requests.j;
import ru.mail.verify.core.utils.ClientException;
import ru.mail.verify.core.utils.ServerException;
import xsna.asp;
import xsna.bqy;
import xsna.zrp;

/* loaded from: classes9.dex */
public final class b {
    private final ru.mail.libverify.i0.a a;
    private final bqy<d> b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a NO_CALL_PERMISSION;
        public static final a NO_READY_SIM;

        static {
            a aVar = new a("NO_CALL_PERMISSION", 0);
            NO_CALL_PERMISSION = aVar;
            a aVar2 = new a("NO_READY_SIM", 1);
            NO_READY_SIM = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        private a(String str, int i) {
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ru.mail.libverify.o.b$b, reason: collision with other inner class name */
    public static final class EnumC2211b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EnumC2211b[] $VALUES;
        public static final EnumC2211b ALL;
        public static final EnumC2211b SMS;
        public static final EnumC2211b SMS_DIALOG;

        static {
            EnumC2211b enumC2211b = new EnumC2211b("ALL", 0);
            ALL = enumC2211b;
            EnumC2211b enumC2211b2 = new EnumC2211b("SMS", 1);
            SMS = enumC2211b2;
            EnumC2211b enumC2211b3 = new EnumC2211b("SMS_DIALOG", 2);
            SMS_DIALOG = enumC2211b3;
            EnumC2211b[] enumC2211bArr = {enumC2211b, enumC2211b2, enumC2211b3};
            $VALUES = enumC2211bArr;
            $ENTRIES = new asp(enumC2211bArr);
        }

        private EnumC2211b(String str, int i) {
        }

        public static EnumC2211b valueOf(String str) {
            return (EnumC2211b) Enum.valueOf(EnumC2211b.class, str);
        }

        public static EnumC2211b[] values() {
            return (EnumC2211b[]) $VALUES.clone();
        }
    }

    public b(ru.mail.libverify.i0.a aVar, bqy<d> bqyVar) {
        this.a = aVar;
        this.b = bqyVar;
    }

    public final void a(s sVar, VerificationApi.CancelReason cancelReason) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.VERIFICATION_CANCELLED;
        i iVar = new i();
        iVar.a("ServiceName", sVar.k());
        iVar.a("VerificationCancelReason", cancelReason.toString());
        iVar.a("Success", Boolean.valueOf(sVar.m().completedSuccessfully()));
        dVar.a(aVar, iVar.a());
    }

    public final void b(ru.mail.libverify.g.b bVar) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.POPUP_DISMISSED;
        i iVar = new i();
        iVar.a("PushSender", bVar.f());
        dVar.a(aVar, iVar.a());
    }

    public final void c(ru.mail.libverify.g.b bVar) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.POPUP_EQUAL_SMS_RECEIVED;
        i iVar = new i();
        iVar.a("PushSender", bVar.f());
        iVar.a("SmsTime", c.a(this.a.b() - bVar.d()));
        dVar.a(aVar, iVar.a());
    }

    public final void d(ru.mail.libverify.g.b bVar) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.POPUP_FULLSCREEN_OPENED;
        i iVar = new i();
        iVar.a("PushSender", bVar.f());
        dVar.a(aVar, iVar.a());
    }

    public final void e(s sVar) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.VERIFICATION_COMPLETED;
        i iVar = new i();
        iVar.a("ServiceName", sVar.k());
        iVar.a("VerificationSource", sVar.m().getSource().toString());
        iVar.a("VerificationResult", sVar.m().getReason().toString());
        iVar.a("VerificationTime", c.a(this.a.b() - sVar.n()));
        dVar.a(aVar, iVar.a());
    }

    public final void f(s sVar) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.VERIFICATION_COMPLETED_BACKGROUND;
        i iVar = new i();
        iVar.a("ServiceName", sVar.k());
        iVar.a("VerificationSource", sVar.m().getSource().toString());
        dVar.a(aVar, iVar.a());
    }

    public final void g(s sVar) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.VERIFICATION_IVR_REQUESTED;
        i iVar = new i();
        iVar.a("ServiceName", sVar.k());
        dVar.a(aVar, iVar.a());
    }

    public final void h(s sVar) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.VERIFICATION_NEWSMSCODE_REQUESTED;
        i iVar = new i();
        iVar.a("ServiceName", sVar.k());
        dVar.a(aVar, iVar.a());
    }

    public final void i(s sVar) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.VERIFICATION_PHONE_VALIDATED;
        i iVar = new i();
        iVar.a("ServiceName", sVar.k());
        dVar.a(aVar, iVar.a());
    }

    public final void j(s sVar) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.VERIFICATION_STARTED;
        i iVar = new i();
        iVar.a("ServiceName", sVar.k());
        dVar.a(aVar, iVar.a());
    }

    public final void k(s sVar) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.VERIFICATION_SWITCHED_BACKGROUND;
        i iVar = new i();
        iVar.a("ServiceName", sVar.k());
        dVar.a(aVar, iVar.a());
    }

    public final void l() {
        this.b.get().a(ru.mail.libverify.o.a.SMS_RETRIEVER_FAILURE, new i().a());
    }

    public final void m() {
        this.b.get().a(ru.mail.libverify.o.a.SMS_RETRIEVER_INITIALIZED, new i().a());
    }

    public final void n() {
        this.b.get().a(ru.mail.libverify.o.a.SMS_RETRIEVER_TIMEOUT, new i().a());
    }

    public final void b(String str) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.NOTIFICATION_HISTORY_ADDED;
        i iVar = new i();
        if (str == null) {
            str = "List";
        }
        iVar.a("PushSender", str);
        dVar.a(aVar, iVar.a());
    }

    public final void d(String str) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.NOTIFICATION_HISTORY_REQUESTED;
        i iVar = new i();
        if (str == null) {
            str = "List";
        }
        iVar.a("PushSender", str);
        dVar.a(aVar, iVar.a());
    }

    public final void g(ru.mail.libverify.g.b bVar) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.PUSH_SERVER_COMPLETED;
        i iVar = new i();
        iVar.a("PushSender", bVar.f());
        iVar.a("PushDelivery", bVar.a().toString());
        dVar.a(aVar, iVar.a());
    }

    public final void h(ru.mail.libverify.g.b bVar) {
        b.a e = bVar.e();
        if (e == null) {
            return;
        }
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.SETTINGS_REPORT_REUSE_CLICKED;
        i iVar = new i();
        iVar.a("PushSender", bVar.f());
        iVar.a("PushFlags", e.d().toString());
        dVar.a(aVar, iVar.a());
    }

    public final void i(ru.mail.libverify.g.b bVar) {
        b.a e = bVar.e();
        if (e == null) {
            return;
        }
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.SETTINGS_TEMPORARY_BLOCK_CLICKED;
        i iVar = new i();
        iVar.a("PushSender", bVar.f());
        iVar.a("PushFlags", e.d().toString());
        dVar.a(aVar, iVar.a());
    }

    public final void j() {
        this.b.get().a(ru.mail.libverify.o.a.PUSHTOKEN_SERVICE_ERROR, new i().a());
    }

    public final void k() {
        this.b.get().a(ru.mail.libverify.o.a.SERVER_API_HOST_OVERRIDDEN, new i().a());
    }

    public final void f(ru.mail.libverify.g.b bVar) {
        b.a e = bVar.e();
        if (e == null) {
            return;
        }
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.PUSH_RECEIVED;
        i iVar = new i();
        iVar.a("PushSender", bVar.f());
        iVar.a("PushType", e.o().toString());
        iVar.a("PushDelivery", bVar.a().toString());
        iVar.a("PushWithConfirm", Boolean.valueOf(e.r()));
        Set<b.a.EnumC2202b> d = e.d();
        if (d != null) {
            iVar.a("PushFlags", d.toString());
        }
        dVar.a(aVar, iVar.a());
    }

    public final void a(ru.mail.libverify.g.b bVar, List<? extends j.d> list) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.PUSH_COMPLETED;
        i iVar = new i();
        iVar.a("PushSender", bVar.f());
        iVar.a("PushCompletion", list.toString());
        iVar.a("PushDelivery", bVar.a().toString());
        dVar.a(aVar, iVar.a());
    }

    public final void c(String str) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.NOTIFICATION_HISTORY_OPENED;
        i iVar = new i();
        if (str == null) {
            str = "List";
        }
        iVar.a("PushSender", str);
        dVar.a(aVar, iVar.a());
    }

    public final void b() {
        this.b.get().a(ru.mail.libverify.o.a.INITIAL_VERIFICATION_RECEIVED, new i().a());
    }

    public final void d() {
        this.b.get().a(ru.mail.libverify.o.a.INSTANCE_FETCHER_STOPPED, new i().a());
    }

    public final void e(String str) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.VERIFICATION_COMPLETED;
        i iVar = new i();
        iVar.a("SessionId", str);
        dVar.a(aVar, iVar.a());
    }

    public final void g() {
        this.b.get().a(ru.mail.libverify.o.a.PHONECHECKER_NEW_CHECK_STARTED, new i().a());
    }

    public final void h() {
        this.b.get().a(ru.mail.libverify.o.a.PUSHTOKEN_FAILED_TO_OBTAIN, new i().a());
    }

    public final void i() {
        this.b.get().a(ru.mail.libverify.o.a.PUSHTOKEN_RECEIVED_FIRST, new i().a());
    }

    public final void b(Throwable th) {
        this.b.get().a(th, true);
    }

    public final void c() {
        this.b.get().a(ru.mail.libverify.o.a.INSTANCE_FETCHER_STARTED, new i().a());
    }

    public final void d(s sVar) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.SESSION_MOBILEID_REDIRECT_LIMIT_REACHED;
        i iVar = new i();
        iVar.a("ServiceName", sVar.k());
        iVar.a("SessionId", sVar.h());
        dVar.a(aVar, iVar.a());
    }

    public final void a(long j) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.PUSH_STATUS_SUBMITTED;
        i iVar = new i();
        iVar.a("SubmitTime", c.a(this.a.b() - j));
        dVar.a(aVar, iVar.a());
    }

    public final void b(s sVar, j.c cVar) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.SESSION_MOBILEID_CODE_RECEIVED;
        i iVar = new i();
        iVar.a("PushDelivery", cVar.toString());
        iVar.a("PushTime", c.a(this.a.b() - sVar.n()));
        dVar.a(aVar, iVar.a());
    }

    public final void e(ru.mail.libverify.g.b bVar) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.POPUP_SETTINGS_OPENED;
        i iVar = new i();
        iVar.a("PushSender", bVar.f());
        dVar.a(aVar, iVar.a());
    }

    public final void c(s sVar) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.SESSION_MOBILEID_REDIRECT_ERROR;
        i iVar = new i();
        iVar.a("ServiceName", sVar.k());
        iVar.a("SessionId", sVar.h());
        dVar.a(aVar, iVar.a());
    }

    public final void f() {
        this.b.get().a(ru.mail.libverify.o.a.INSTANCE_SOFT_SIGNOUT, new i().a());
    }

    public final void e() {
        this.b.get().a(ru.mail.libverify.o.a.INSTANCE_RESET, new i().a());
    }

    public final void a(ru.mail.libverify.g.b bVar, ru.mail.libverify.g.b bVar2) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.PUSH_DUPLICATION;
        i iVar = new i();
        StringBuilder sb = new StringBuilder();
        sb.append(bVar.a());
        sb.append('_');
        sb.append(bVar2.a());
        iVar.a("PushDelivery", sb.toString());
        iVar.a("PushTime", c.a(bVar2.d() - bVar.d()));
        dVar.a(aVar, iVar.a());
    }

    public final void b(s sVar) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.SESSION_CALL_IN_PROCESS;
        i iVar = new i();
        iVar.a("ServiceName", sVar.k());
        iVar.a("SessionId", sVar.h());
        dVar.a(aVar, iVar.a());
    }

    public final void a(ru.mail.libverify.g.b bVar) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.POPUP_CONFIRM_CLICKED;
        i iVar = new i();
        iVar.a("PushSender", bVar.f());
        dVar.a(aVar, iVar.a());
    }

    public final void a(EnumC2211b enumC2211b, String str) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.NOTIFICATION_HISTORY_ERASED;
        i iVar = new i();
        iVar.a("PushSender", str);
        iVar.a("Type", enumC2211b.toString());
        dVar.a(aVar, iVar.a());
    }

    public final void a(boolean z) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.NOTIFICATION_HISTORY_SHORTCUT_CREATED;
        i iVar = new i();
        iVar.a("Result", Boolean.valueOf(z));
        dVar.a(aVar, iVar.a());
    }

    public final void a(s sVar, j.c cVar) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.SESSION_CALL_INFO_RECEIVED;
        i iVar = new i();
        iVar.a("PushDelivery", cVar.toString());
        iVar.a("PushTime", c.a(this.a.b() - sVar.n()));
        dVar.a(aVar, iVar.a());
    }

    public final void a(a aVar) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar2 = ru.mail.libverify.o.a.SESSION_CALL_REJECTED;
        i iVar = new i();
        iVar.a("CallRejectReason", aVar.toString());
        dVar.a(aVar2, iVar.a());
    }

    public final void a() {
        this.b.get().a(ru.mail.libverify.o.a.CHECK_ACCOUNT_STARTED, new i().a());
    }

    public final void a(VerificationApi.AccountCheckResult accountCheckResult, boolean z) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.CHECK_ACCOUNT_COMPLETED;
        i iVar = new i();
        iVar.a("Result", accountCheckResult.toString());
        iVar.a("SmsFound", Boolean.valueOf(z));
        dVar.a(aVar, iVar.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ru.mail.libverify.m.c<?, ?> cVar) {
        ru.mail.libverify.requests.c cVar2 = (ru.mail.libverify.requests.c) cVar.a();
        if (cVar2 != null) {
            d dVar = this.b.get();
            ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.API_REQUEST_FAILURE;
            i iVar = new i();
            iVar.a("Method", cVar2.d());
            StringBuilder sb = new StringBuilder();
            sb.append(cVar.g());
            sb.append('_');
            sb.append(cVar.e());
            iVar.a("StatusCode", sb.toString());
            dVar.a(aVar, iVar.a());
        }
    }

    public final void a(ru.mail.libverify.requests.c<?, ?> cVar, ServerException serverException) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.SERVER_FAILURE;
        i iVar = new i();
        iVar.a("Code", Integer.valueOf(serverException.a()));
        iVar.a("Method", cVar.d());
        dVar.a(aVar, iVar.a());
    }

    public final void a(ru.mail.libverify.requests.c<?, ?> cVar, ClientException clientException) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.SERVER_FAILURE;
        i iVar = new i();
        iVar.a("Code", clientException.toString());
        iVar.a("Method", cVar.d());
        dVar.a(aVar, iVar.a());
    }

    public final void a(ru.mail.libverify.requests.c<?, ?> cVar, IOException iOException) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.SERVER_SWITCHED_TO_NEXT_API_HOST;
        i iVar = new i();
        iVar.a("Code", iOException.toString());
        iVar.a("Method", cVar.d());
        dVar.a(aVar, iVar.a());
    }

    public final void a(Throwable th) {
        this.b.get().a(th, false);
    }

    public final void a(String str) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.CHECK_APPLICATION_COMPLETED;
        i iVar = new i();
        iVar.a("Result", str);
        dVar.a(aVar, iVar.a());
    }

    public final void a(String str, s sVar) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.SESSION_MOBILEID_URL_RECEIVED;
        i iVar = new i();
        iVar.a("ServiceName", sVar.k());
        iVar.a("Location", str);
        dVar.a(aVar, iVar.a());
    }

    public final void a(s sVar, String str, int i) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.SESSION_MOBILEID_REDIRECT;
        i iVar = new i();
        iVar.a("ServiceName", sVar.k());
        iVar.a("SessionId", sVar.h());
        iVar.a("RedirectLocation", str);
        iVar.a("maxRedirectsCount", Integer.valueOf(i));
        dVar.a(aVar, iVar.a());
    }

    public final void a(s sVar) {
        d dVar = this.b.get();
        ru.mail.libverify.o.a aVar = ru.mail.libverify.o.a.SESSION_CALL_IN_CLICKED;
        i iVar = new i();
        iVar.a("ServiceName", sVar.k());
        iVar.a("SessionId", sVar.h());
        dVar.a(aVar, iVar.a());
    }
}
