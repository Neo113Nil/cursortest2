package com.yandex.passport.internal;

import android.accounts.Account;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.api.PassportLoginAction;
import com.yandex.passport.api.PassportPartition;
import com.yandex.passport.api.PassportSocialConfiguration;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.c0;
import com.yandex.passport.api.d0;
import com.yandex.passport.api.e1;
import com.yandex.passport.api.exception.PassportDeprecatedApiUsageException;
import com.yandex.passport.api.exception.PassportRuntimeUnknownException;
import com.yandex.passport.api.f1;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.l1;
import com.yandex.passport.api.l2;
import com.yandex.passport.api.o0;
import com.yandex.passport.api.u0;
import com.yandex.passport.api.u1;
import com.yandex.passport.api.x1;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Partition;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.data.network.GetChildrenInfoRequest$Member;
import com.yandex.passport.internal.account.PassportAccountImpl;
import com.yandex.passport.internal.credentials.Credentials;
import com.yandex.passport.internal.entities.Partitions;
import com.yandex.passport.internal.properties.AccountNotAuthorizedProperties;
import com.yandex.passport.internal.properties.AuthByQrProperties;
import com.yandex.passport.internal.properties.BindPhoneProperties;
import com.yandex.passport.internal.properties.BiometricVerificationPropertiesImpl;
import com.yandex.passport.internal.properties.EsiaBindProperties;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.ManagingPlusDevicesPropertiesImpl;
import com.yandex.passport.internal.properties.PassportDeleteAccountPropertiesImpl;
import com.yandex.passport.internal.properties.PassportLogoutPropertiesImpl;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import com.yandex.passport.internal.properties.RegisterWebAuthNPropertiesImpl;
import com.yandex.passport.internal.stash.Stash;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.tcc;
import defpackage.vg10;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes15.dex */
public abstract class a0 {
    public static com.yandex.passport.internal.analytics.c A() {
        return com.yandex.passport.internal.analytics.c.c;
    }

    public static com.yandex.passport.internal.analytics.k B() {
        return com.yandex.passport.internal.analytics.k.r;
    }

    public static final int C(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndexOrThrow(str));
    }

    public static final long D(Cursor cursor) {
        return cursor.getLong(cursor.getColumnIndexOrThrow("local_timestamp"));
    }

    public static com.yandex.passport.internal.analytics.k E() {
        return com.yandex.passport.internal.analytics.k.q;
    }

    public static com.yandex.passport.internal.analytics.k F() {
        return com.yandex.passport.internal.analytics.k.p;
    }

    public static com.yandex.passport.internal.analytics.g G() {
        return com.yandex.passport.internal.analytics.g.f;
    }

    public static com.yandex.passport.internal.analytics.k H() {
        return com.yandex.passport.internal.analytics.k.b;
    }

    public static com.yandex.passport.internal.analytics.c I() {
        return com.yandex.passport.internal.analytics.c.b;
    }

    public static com.yandex.passport.internal.analytics.n J() {
        return com.yandex.passport.internal.analytics.n.c;
    }

    public static com.yandex.passport.internal.analytics.s K() {
        return com.yandex.passport.internal.analytics.s.b;
    }

    public static final String L(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndexOrThrow(str));
    }

    public static final String M(Cursor cursor, String str) {
        String string = cursor.getString(cursor.getColumnIndexOrThrow(str));
        if (string != null) {
            return string;
        }
        vg10.d("Required column ".concat(str));
        return null;
    }

    public static com.yandex.passport.internal.analytics.e N() {
        return com.yandex.passport.internal.analytics.e.e;
    }

    public static com.yandex.passport.internal.database.c O(Cursor cursor) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        String L = L(cursor, "uid");
        long parseLong = L != null ? Long.parseLong(L) : -1L;
        String valueOf = String.valueOf(L(cursor, "parent_name"));
        boolean z3 = false;
        boolean z4 = cursor.getInt(cursor.getColumnIndexOrThrow("is_child")) > 0;
        if (cursor.getInt(cursor.getColumnIndexOrThrow("has_plus")) > 0) {
            z = false;
            z3 = true;
        } else {
            z = false;
        }
        String valueOf2 = String.valueOf(L(cursor, "display_login"));
        String valueOf3 = String.valueOf(L(cursor, "display_name"));
        String valueOf4 = String.valueOf(L(cursor, "public_name"));
        String L2 = L(cursor, "avatar_url");
        if (cursor.getInt(cursor.getColumnIndexOrThrow("is_deleted")) > 0) {
            z2 = true;
            str = valueOf2;
            str2 = valueOf4;
        } else {
            str = valueOf2;
            str2 = valueOf4;
            z2 = z;
        }
        return new com.yandex.passport.internal.database.c(parseLong, valueOf, z4, z3, str, valueOf3, str2, L2, z2);
    }

    public static com.yandex.passport.internal.database.c P(String str, GetChildrenInfoRequest$Member getChildrenInfoRequest$Member) {
        return new com.yandex.passport.internal.database.c(getChildrenInfoRequest$Member.getUid(), str, true, getChildrenInfoRequest$Member.getHasPlus(), getChildrenInfoRequest$Member.getDisplayLogin(), getChildrenInfoRequest$Member.getDisplayName(), getChildrenInfoRequest$Member.getPublicName(), getChildrenInfoRequest$Member.getAvatarUrl(), false);
    }

    public static String Q(String str, String str2, String str3) {
        String str4;
        String str5;
        String encode;
        StringBuilder sb = new StringBuilder("v=1&masterToken=");
        String str6 = "~";
        if (str == null || (str4 = Uri.encode(str)) == null) {
            str4 = "~";
        }
        sb.append(str4);
        sb.append("&userInfo=");
        if (str2 == null || (str5 = Uri.encode(str2)) == null) {
            str5 = "~";
        }
        sb.append(str5);
        sb.append("&stash=");
        if (str3 != null && (encode = Uri.encode(str3)) != null) {
            str6 = encode;
        }
        sb.append(str6);
        return sb.toString();
    }

    public static final long R(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) {
        try {
            return sQLiteDatabase.insertOrThrow(str, null, contentValues);
        } catch (SQLException e) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (!com.yandex.passport.common.logger.a.a.isEnabled()) {
                return -1L;
            }
            com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Error inserting", e);
            return -1L;
        }
    }

    public static long T(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) {
        try {
            return sQLiteDatabase.replaceOrThrow(str, null, contentValues);
        } catch (SQLException e) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (!com.yandex.passport.common.logger.a.a.isEnabled()) {
                return -1L;
            }
            com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Error replacing", e);
            return -1L;
        }
    }

    public static Bundle U(Credentials credentials) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("client-credentials", credentials);
        return bundle;
    }

    public static final SocialConfiguration V(PassportSocialConfiguration passportSocialConfiguration) {
        SocialConfiguration.Companion.getClass();
        return y.a(passportSocialConfiguration);
    }

    public static final AccountNotAuthorizedProperties W(com.yandex.passport.api.k kVar) {
        AccountNotAuthorizedProperties.Companion.getClass();
        k2 uid = kVar.getUid();
        PassportUidImpl.Companion.getClass();
        PassportUidImpl a = l2.a(uid);
        PassportTheme theme = kVar.getTheme();
        String message = kVar.getMessage();
        com.yandex.passport.internal.properties.i iVar = LoginProperties.Companion;
        e1 loginProperties = kVar.getLoginProperties();
        iVar.getClass();
        return new AccountNotAuthorizedProperties(a, theme, message, com.yandex.passport.internal.properties.i.b((com.yandex.passport.api.limited.a) loginProperties));
    }

    public static final AuthByQrProperties X(com.yandex.passport.api.p pVar) {
        AuthByQrProperties.Companion.getClass();
        return new AuthByQrProperties(pVar.getTheme(), PassportEnvironmentImpl.from(pVar.getEnvironment()), pVar.isShowSkipButton(), pVar.isShowSettingsButton(), pVar.isFinishWithoutDialogOnError(), pVar.getLottieSpinnerResId(), pVar.getBackgroundResId(), pVar.getSkipBackButton(), pVar.getOrigin());
    }

    public static final BindPhoneProperties Y(c0 c0Var) {
        BindPhoneProperties.Companion.getClass();
        return com.yandex.passport.internal.properties.f.a(c0Var);
    }

    public static final BiometricVerificationPropertiesImpl Z(d0 d0Var) {
        BiometricVerificationPropertiesImpl.Companion.getClass();
        String flowId = d0Var.getFlowId();
        k2 uid = d0Var.getUid();
        PassportUidImpl.Companion.getClass();
        return new BiometricVerificationPropertiesImpl(l2.a(uid), flowId, d0Var.getServiceId(), d0Var.getTheme());
    }

    public static int a(com.yandex.passport.internal.filter.r rVar, com.yandex.passport.internal.filter.r rVar2) {
        boolean z = rVar instanceof com.yandex.passport.internal.filter.p;
        if (z && (rVar2 instanceof com.yandex.passport.internal.filter.p)) {
            return jl40.q(((com.yandex.passport.internal.filter.p) rVar).a, ((com.yandex.passport.internal.filter.p) rVar2).a);
        }
        boolean z2 = rVar instanceof com.yandex.passport.internal.filter.q;
        if (z2 && (rVar2 instanceof com.yandex.passport.internal.filter.q)) {
            return ((com.yandex.passport.internal.filter.q) rVar).a.compareTo(((com.yandex.passport.internal.filter.q) rVar2).a);
        }
        if (z && (rVar2 instanceof com.yandex.passport.internal.filter.q)) {
            return -1;
        }
        return (z2 && (rVar2 instanceof com.yandex.passport.internal.filter.p)) ? 1 : 0;
    }

    public static final EsiaBindProperties a0(u0 u0Var) {
        EsiaBindProperties.Companion.getClass();
        PassportTheme theme = u0Var.getTheme();
        l2 l2Var = PassportUidImpl.Companion;
        k2 uid = u0Var.getUid();
        l2Var.getClass();
        return new EsiaBindProperties(theme, l2.a(uid), u0Var.getApplication(), u0Var.getConsumer(), u0Var.getScope());
    }

    public static Uid b(Environment environment, long j) {
        return new Uid(environment, j);
    }

    public static final LoginProperties b0(e1 e1Var) {
        LoginProperties.Companion.getClass();
        return com.yandex.passport.internal.properties.i.b((com.yandex.passport.api.limited.a) e1Var);
    }

    public static Uid c(Environment environment, Long l) {
        if (l != null) {
            return new Uid(environment, l.longValue());
        }
        return null;
    }

    public static final ManagingPlusDevicesPropertiesImpl c0(l1 l1Var) {
        ManagingPlusDevicesPropertiesImpl.Companion.getClass();
        PassportTheme theme = l1Var.getTheme();
        k2 uid = l1Var.getUid();
        PassportUidImpl.Companion.getClass();
        return new ManagingPlusDevicesPropertiesImpl(theme, l2.a(uid), l1Var.getService(), l1Var.getBrand(), l1Var.isForceShowManagingPlusDevices());
    }

    public static com.yandex.passport.internal.core.announcing.e d(long j, String str, String str2, String str3) {
        return new com.yandex.passport.internal.core.announcing.e("com.yandex.accounts.LOGIN_ACCOUNTS_CHANGED", str, str2, str3, j, 0L, 0L);
    }

    public static final PassportDeleteAccountPropertiesImpl d0(o0 o0Var) {
        PassportDeleteAccountPropertiesImpl.Companion.getClass();
        k2 uid = o0Var.getUid();
        PassportUidImpl.Companion.getClass();
        PassportUidImpl a = l2.a(uid);
        u1 progressProperties = o0Var.getProgressProperties();
        ProgressPropertiesImpl.Companion.getClass();
        return new PassportDeleteAccountPropertiesImpl(a, com.yandex.passport.internal.properties.m.b(progressProperties), o0Var.getTheme(), o0Var.getHeaders());
    }

    public static com.yandex.passport.internal.entities.j e(Bundle bundle) {
        com.yandex.passport.internal.entities.j jVar = null;
        jVar = null;
        jVar = null;
        if (bundle != null && bundle.containsKey("passport-login-result-environment") && bundle.containsKey("passport-login-result-uid")) {
            int i = bundle.getInt("passport-login-result-environment");
            long j = bundle.getLong("passport-login-result-uid");
            int i2 = bundle.getInt("passport-login-action");
            String string = bundle.getString("passport-login-additional-action");
            jVar = new com.yandex.passport.internal.entities.j(new PassportUidImpl(PassportEnvironmentImpl.from(i), j), PassportLoginAction.values()[i2], string != null ? string : null);
        }
        if (jVar != null) {
            return jVar;
        }
        if (bundle != null && bundle.containsKey("passport-result-url") && bundle.containsKey("passport-result-purpose")) {
            throw new PassportDeprecatedApiUsageException("PassportAuthorizationResult.OpenUrl");
        }
        throw new PassportRuntimeUnknownException("Error parsing LoginResult");
    }

    public static final PassportLogoutPropertiesImpl e0(f1 f1Var) {
        PassportLogoutPropertiesImpl.Companion.getClass();
        return com.yandex.passport.internal.properties.l.b(f1Var);
    }

    public static com.yandex.passport.internal.analytics.k f() {
        return com.yandex.passport.internal.analytics.k.n;
    }

    public static final RegisterWebAuthNPropertiesImpl f0(x1 x1Var) {
        RegisterWebAuthNPropertiesImpl.Companion.getClass();
        PassportTheme theme = x1Var.getTheme();
        k2 uid = x1Var.getUid();
        PassportUidImpl.Companion.getClass();
        return new RegisterWebAuthNPropertiesImpl(theme, l2.a(uid));
    }

    public static com.yandex.passport.internal.analytics.k g() {
        return com.yandex.passport.internal.analytics.k.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d5 A[LOOP:0: B:9:0x00cf->B:11:0x00d5, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final PassportAccountImpl g0(ModernAccount modernAccount) {
        PassportUidImpl passportUidImpl;
        String str;
        Date date;
        Date parse;
        Iterator<T> it;
        PassportUidImpl A = com.yandex.passport.internal.util.p.A(modernAccount.getUid());
        String primaryDisplayName = modernAccount.getPrimaryDisplayName();
        String secondaryDisplayName = modernAccount.getSecondaryDisplayName();
        String avatarUrl = modernAccount.getUserInfo().getAvatarUrl();
        boolean isAvatarEmpty = modernAccount.getUserInfo().isAvatarEmpty();
        String nativeDefaultEmail = modernAccount.getUserInfo().getNativeDefaultEmail();
        boolean isYandexoid = modernAccount.getUserInfo().isYandexoid();
        String yandexoidLogin = modernAccount.getUserInfo().getYandexoidLogin();
        boolean isBetaTester = modernAccount.getUserInfo().isBetaTester();
        boolean z = modernAccount.getMasterToken().getValue() != null;
        Stash stash = modernAccount.getStash();
        Account account = modernAccount.getAccount();
        PassportAccountType accountType = modernAccount.getAccountType();
        String socialProviderCode = modernAccount.getSocialProviderCode();
        boolean hasPlus = modernAccount.getUserInfo().getHasPlus();
        String firstName = modernAccount.getUserInfo().getFirstName();
        String lastName = modernAccount.getUserInfo().getLastName();
        String birthday = modernAccount.getUserInfo().getBirthday();
        SimpleDateFormat simpleDateFormat = com.yandex.passport.internal.util.c.a;
        if (birthday != null) {
            try {
                parse = com.yandex.passport.internal.util.c.a.parse(birthday);
                passportUidImpl = A;
                str = primaryDisplayName;
            } catch (ParseException unused) {
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    passportUidImpl = A;
                    str = primaryDisplayName;
                    date = null;
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Failed to parse birthday ".concat(birthday), 8);
                }
            }
            String publicId = modernAccount.getUserInfo().getPublicId();
            List<Partition> partitions = modernAccount.getPartitions();
            ArrayList arrayList = new ArrayList(tcc.n(partitions, 10));
            it = partitions.iterator();
            while (it.hasNext()) {
                arrayList.add(PassportPartition.m231boximpl(PassportPartition.m232constructorimpl(((Partition) it.next()).m257unboximpl())));
            }
            return new PassportAccountImpl(passportUidImpl, str, secondaryDisplayName, avatarUrl, isAvatarEmpty, nativeDefaultEmail, isYandexoid, yandexoidLogin, isBetaTester, z, stash, account, accountType, socialProviderCode, hasPlus, firstName, lastName, parse, publicId, new Partitions(arrayList), modernAccount.getUserInfo().getMachineReadableLogin(), modernAccount.getUserInfo().is2faEnabled(), modernAccount.getUserInfo().isSms2faEnabled(), modernAccount.getUserInfo().isRfc2faEnabled(), !modernAccount.getUserInfo().isPictureLoginForbidden(), modernAccount.getUserInfo().isXtokenTrusted(), modernAccount.getUserInfo().isBrowserAccount(), modernAccount.getUserInfo().getHasWebAuthNCredential());
        }
        passportUidImpl = A;
        str = primaryDisplayName;
        date = null;
        parse = date;
        String publicId2 = modernAccount.getUserInfo().getPublicId();
        List<Partition> partitions2 = modernAccount.getPartitions();
        ArrayList arrayList2 = new ArrayList(tcc.n(partitions2, 10));
        it = partitions2.iterator();
        while (it.hasNext()) {
        }
        return new PassportAccountImpl(passportUidImpl, str, secondaryDisplayName, avatarUrl, isAvatarEmpty, nativeDefaultEmail, isYandexoid, yandexoidLogin, isBetaTester, z, stash, account, accountType, socialProviderCode, hasPlus, firstName, lastName, parse, publicId2, new Partitions(arrayList2), modernAccount.getUserInfo().getMachineReadableLogin(), modernAccount.getUserInfo().is2faEnabled(), modernAccount.getUserInfo().isSms2faEnabled(), modernAccount.getUserInfo().isRfc2faEnabled(), !modernAccount.getUserInfo().isPictureLoginForbidden(), modernAccount.getUserInfo().isXtokenTrusted(), modernAccount.getUserInfo().isBrowserAccount(), modernAccount.getUserInfo().getHasWebAuthNCredential());
    }

    public static com.yandex.passport.internal.analytics.k h() {
        return com.yandex.passport.internal.analytics.k.m;
    }

    public static final String[] h0(Uid uid) {
        StringBuilder sb = new StringBuilder();
        sb.append(uid.getEnvironment().getInteger());
        sb.append(':');
        sb.append(uid.getValue());
        return new String[]{sb.toString()};
    }

    public static com.yandex.passport.internal.analytics.k i() {
        return com.yandex.passport.internal.analytics.k.l;
    }

    public static final String[] i0(AccountRow accountRow) {
        return new String[]{accountRow.name};
    }

    public static com.yandex.passport.internal.analytics.s j() {
        return com.yandex.passport.internal.analytics.s.c;
    }

    public static final String[] j0(v vVar) {
        Uid uid = vVar.a;
        StringBuilder sb = new StringBuilder();
        sb.append(uid.getEnvironment().getInteger());
        sb.append(':');
        sb.append(uid.getValue());
        return new String[]{sb.toString(), vVar.b};
    }

    public static com.yandex.passport.internal.analytics.k k() {
        return com.yandex.passport.internal.analytics.k.k;
    }

    public static com.yandex.passport.internal.database.b k0(String str) {
        if (!cvu0.x(str, "v=1&", false)) {
            return null;
        }
        HashMap hashMap = new HashMap(4);
        for (String str2 : evu0.Y(str, new char[]{'&'}, 0, 6)) {
            int G = evu0.G(str2, '=', 0, 6);
            if (G > 0) {
                hashMap.put(str2.substring(0, G), str2.substring(G + 1));
            }
        }
        return new com.yandex.passport.internal.database.b(l0("masterToken", hashMap), l0("userInfo", hashMap), l0("stash", hashMap));
    }

    public static com.yandex.passport.internal.analytics.s l() {
        return com.yandex.passport.internal.analytics.s.d;
    }

    public static final String l0(String str, HashMap hashMap) {
        String str2 = (String) hashMap.get(str);
        if (str2 == null || str2.equals("~")) {
            return null;
        }
        return Uri.decode(str2);
    }

    public static com.yandex.passport.internal.analytics.s m() {
        return com.yandex.passport.internal.analytics.s.e;
    }

    public static com.yandex.passport.internal.analytics.k n() {
        return com.yandex.passport.internal.analytics.k.i;
    }

    public static com.yandex.passport.internal.analytics.k o() {
        return com.yandex.passport.internal.analytics.k.g;
    }

    public static com.yandex.passport.internal.analytics.k p() {
        return com.yandex.passport.internal.analytics.k.f;
    }

    public static com.yandex.passport.internal.analytics.k q() {
        return com.yandex.passport.internal.analytics.k.h;
    }

    public static com.yandex.passport.internal.analytics.k r() {
        return com.yandex.passport.internal.analytics.k.e;
    }

    public static com.yandex.passport.internal.analytics.g s() {
        return com.yandex.passport.internal.analytics.g.d;
    }

    public static com.yandex.passport.internal.analytics.g t() {
        return com.yandex.passport.internal.analytics.g.b;
    }

    public static final List u(List list, Set set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.yandex.passport.internal.badges.a aVar = (com.yandex.passport.internal.badges.a) it.next();
            if (!set.contains(aVar.a)) {
                aVar = null;
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return kotlin.collections.a.A0(arrayList, 5);
    }

    public static com.yandex.passport.internal.analytics.j v() {
        return com.yandex.passport.internal.analytics.j.c;
    }

    public static com.yandex.passport.internal.analytics.j w() {
        return com.yandex.passport.internal.analytics.j.b;
    }

    public static com.yandex.passport.internal.analytics.c x() {
        return com.yandex.passport.internal.analytics.c.d;
    }

    public static com.yandex.passport.internal.analytics.e y() {
        return com.yandex.passport.internal.analytics.e.d;
    }

    public static com.yandex.passport.internal.analytics.f z() {
        return com.yandex.passport.internal.analytics.f.e;
    }
}
