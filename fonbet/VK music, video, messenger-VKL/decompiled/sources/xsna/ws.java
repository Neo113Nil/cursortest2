package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.im.engine.models.account.AccountInfo;
import com.vk.im.engine.models.account.PrivacySetting;
import com.vk.log.L;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.HashMap;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;

/* compiled from: AccountStorageManagerImpl.kt */
/* loaded from: classes2.dex */
public final class ws implements us, mtx0 {
    public final tgl0 b;
    public final ehl0<AccountInfo> c;
    public final ehl0<oo8> d;
    public final ehl0<PrivacySetting> e;
    public final ehl0<PrivacySetting> f = new ehl0<>(null, new c(0, this, ws.class, "getCallsPrivacySettingFromDb", "getCallsPrivacySettingFromDb()Lcom/vk/im/engine/models/account/PrivacySetting;", 0), new d(1, this, ws.class, "putCallsPrivacySettingToDb", "putCallsPrivacySettingToDb(Lcom/vk/im/engine/models/account/PrivacySetting;)V", 0));

    /* compiled from: AccountStorageManagerImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<oo8> {
        @Override // xsna.gzs
        public final oo8 invoke() {
            rey k = ((ws) this.receiver).b.I0().k();
            Boolean c = k.c("business_notify_config_enabled");
            Integer e = k.e("business_notify_config_phase");
            if (c == null || e == null) {
                return null;
            }
            return new oo8(c.booleanValue(), e.intValue());
        }
    }

    /* compiled from: AccountStorageManagerImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<oo8, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(oo8 oo8Var) {
            ((ws) this.receiver).b.I0().u(new vs(oo8Var, 0));
            return s3q0.a;
        }
    }

    /* compiled from: AccountStorageManagerImpl.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<PrivacySetting> {
        @Override // xsna.gzs
        public final PrivacySetting invoke() {
            byte[] b = ((ws) this.receiver).b.I0().k().b("calls_privacy_settings");
            if (b == null) {
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b);
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            PrivacySetting privacySetting = (PrivacySetting) new Serializer.d(new DataInputStream(byteArrayInputStream)).G(PrivacySetting.class.getClassLoader());
            byteArrayInputStream.close();
            return privacySetting;
        }
    }

    /* compiled from: AccountStorageManagerImpl.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<PrivacySetting, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(PrivacySetting privacySetting) {
            rey k = ((ws) this.receiver).b.I0().k();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            new Serializer.e(new DataOutputStream(byteArrayOutputStream)).i0(privacySetting);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            k.k(byteArray, "calls_privacy_settings");
            return s3q0.a;
        }
    }

    /* compiled from: AccountStorageManagerImpl.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements gzs<AccountInfo> {
        @Override // xsna.gzs
        public final AccountInfo invoke() {
            AccountInfo accountInfo;
            tgl0 tgl0Var = ((ws) this.receiver).b;
            byte[] b = tgl0Var.I0().k().b("account_info");
            com.vk.dto.hints.a aVar = null;
            if (b == null) {
                return null;
            }
            try {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                accountInfo = (AccountInfo) Serializer.b.a(b, AccountInfo.class.getClassLoader());
            } catch (Serializer.DeserializationError e) {
                L.e("AccountStorageManager", "account inf deserialization error", e);
                com.vk.metrics.eventtracking.b.a.q(e);
                tgl0Var.I0().k().delete("account_info");
                tgl0Var.I0().k().delete("account_info_hints");
                accountInfo = null;
            }
            if (accountInfo == null) {
                return null;
            }
            String string = tgl0Var.I0().k().getString("account_info_hints");
            if (string != null) {
                if (string.length() <= 0) {
                    string = null;
                }
                if (string != null) {
                    aVar = new com.vk.dto.hints.a(new JSONObject(string));
                }
            }
            if (aVar == null) {
                aVar = accountInfo.I;
            }
            return AccountInfo.zb(accountInfo, 0L, aVar, -1, 61);
        }
    }

    /* compiled from: AccountStorageManagerImpl.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<AccountInfo, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(AccountInfo accountInfo) {
            String jSONObject;
            AccountInfo accountInfo2 = accountInfo;
            tgl0 tgl0Var = ((ws) this.receiver).b;
            try {
                com.vk.dto.hints.a aVar = accountInfo2.I;
                AccountInfo zb = AccountInfo.zb(accountInfo2, 0L, null, -1, 61);
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                tgl0Var.I0().k().k(Serializer.b.e(zb), "account_info");
                if (aVar == null || (jSONObject = aVar.e5().toString()) == null) {
                    tgl0Var.I0().k().delete("account_info_hints");
                } else {
                    tgl0Var.I0().k().k(jSONObject, "account_info_hints");
                }
            } catch (Throwable th) {
                L.e("AccountStorageManager", "account info serialization error", th);
                com.vk.metrics.eventtracking.b.a.q(th);
            }
            return s3q0.a;
        }
    }

    /* compiled from: AccountStorageManagerImpl.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements gzs<PrivacySetting> {
        @Override // xsna.gzs
        public final PrivacySetting invoke() {
            byte[] b = ((ws) this.receiver).b.I0().k().b("online_privacy_settings");
            if (b == null) {
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b);
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            PrivacySetting privacySetting = (PrivacySetting) new Serializer.d(new DataInputStream(byteArrayInputStream)).G(PrivacySetting.class.getClassLoader());
            byteArrayInputStream.close();
            return privacySetting;
        }
    }

    /* compiled from: AccountStorageManagerImpl.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements izs<PrivacySetting, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(PrivacySetting privacySetting) {
            rey k = ((ws) this.receiver).b.I0().k();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            new Serializer.e(new DataOutputStream(byteArrayOutputStream)).i0(privacySetting);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            k.k(byteArray, "online_privacy_settings");
            return s3q0.a;
        }
    }

    public ws(tgl0 tgl0Var) {
        this.b = tgl0Var;
        this.c = new ehl0<>(tgl0Var.c(AccountInfo.class), new e(0, this, ws.class, "getInfoFromDb", "getInfoFromDb()Lcom/vk/im/engine/models/account/AccountInfo;", 0), new f(1, this, ws.class, "putInfoToDb", "putInfoToDb(Lcom/vk/im/engine/models/account/AccountInfo;)V", 0));
        this.d = new ehl0<>(tgl0Var.c(oo8.class), new a(0, this, ws.class, "getBusinessNotifyConfigFromDb", "getBusinessNotifyConfigFromDb()Lcom/vk/im/engine/models/account/BusinessNotifyConfig;", 0), new b(1, this, ws.class, "putBusinessNotifyConfigToDb", "putBusinessNotifyConfigToDb(Lcom/vk/im/engine/models/account/BusinessNotifyConfig;)V", 0));
        this.e = new ehl0<>(tgl0Var.c(PrivacySetting.class), new g(0, this, ws.class, "getOnlinePrivacySettingFromDb", "getOnlinePrivacySettingFromDb()Lcom/vk/im/engine/models/account/PrivacySetting;", 0), new h(1, this, ws.class, "putOnlinePrivacySettingToDb", "putOnlinePrivacySettingToDb(Lcom/vk/im/engine/models/account/PrivacySetting;)V", 0));
    }

    @Override // xsna.mtx0
    public final void Q() {
        this.c.e = null;
        this.d.e = null;
        this.e.e = null;
        this.f.e = null;
    }

    @Override // xsna.us
    public final oo8 a() {
        return this.d.a();
    }

    @Override // xsna.us
    public final void b(oo8 oo8Var) {
        this.d.b(oo8Var);
    }

    @Override // xsna.us
    public final void c(AccountInfo accountInfo) {
        this.c.b(accountInfo);
    }

    @Override // xsna.us
    public final void d(PrivacySetting privacySetting) {
        this.e.b(privacySetting);
    }

    @Override // xsna.us
    public final void e(PrivacySetting privacySetting) {
        this.f.b(privacySetting);
    }

    @Override // xsna.us
    public final PrivacySetting f() {
        return this.f.a();
    }

    @Override // xsna.us
    public final AccountInfo getInfo() {
        return this.c.a();
    }
}
