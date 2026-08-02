package com.yandex.passport.internal.features;

import com.yandex.passport.internal.flags.d;
import com.yandex.passport.internal.flags.j;
import com.yandex.passport.internal.flags.o;
import defpackage.b64;
import defpackage.e89;
import defpackage.kgx;
import defpackage.qoi0;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes8.dex */
public final class a {
    public static final /* synthetic */ kgx[] J = {new PropertyReference1Impl("slothReporting", 0, "getSlothReporting()Z", a.class), b64.x(qoi0.a, a.class, "bouncerReporting", "getBouncerReporting()Z", 0), new PropertyReference1Impl("accountUpgradeReporting", 0, "getAccountUpgradeReporting()Z", a.class), new PropertyReference1Impl("challengeReporting", 0, "getChallengeReporting()Z", a.class), new PropertyReference1Impl("experimentsReporting", 0, "getExperimentsReporting()Z", a.class), new PropertyReference1Impl("pushReporting", 0, "getPushReporting()Z", a.class), new PropertyReference1Impl("tokenActionReporting", 0, "getTokenActionReporting()Z", a.class), new PropertyReference1Impl("backendReporting", 0, "getBackendReporting()Z", a.class), new PropertyReference1Impl("autoLoginReporting", 0, "getAutoLoginReporting()Z", a.class), new PropertyReference1Impl("userInfoReporting", 0, "getUserInfoReporting()Z", a.class), new PropertyReference1Impl("bindPhoneNumberReporting", 0, "getBindPhoneNumberReporting()Z", a.class), new PropertyReference1Impl("getAuthorizationUrlReporting", 0, "getGetAuthorizationUrlReporting()Z", a.class), new PropertyReference1Impl("suggestedLanguageReporting", 0, "getSuggestedLanguageReporting()Z", a.class), new PropertyReference1Impl("sendAuthToTrackReporting", 0, "getSendAuthToTrackReporting()Z", a.class), new PropertyReference1Impl("authorizationReporting", 0, "getAuthorizationReporting()Z", a.class), new PropertyReference1Impl("socialReporting", 0, "getSocialReporting()Z", a.class), new PropertyReference1Impl("passportInitReporting", 0, "getPassportInitReporting()Z", a.class), new PropertyReference1Impl("stashReporting", 0, "getStashReporting()Z", a.class), new PropertyReference1Impl("announcementReporting", 0, "getAnnouncementReporting()Z", a.class), new PropertyReference1Impl("linkAuthReporting", 0, "getLinkAuthReporting()Z", a.class), new PropertyReference1Impl("localUidReporting", 0, "getLocalUidReporting()Z", a.class), new PropertyReference1Impl("accountDeleteForeverReporting", 0, "getAccountDeleteForeverReporting()Z", a.class), new PropertyReference1Impl("warmUpWebViewReporting", 0, "getWarmUpWebViewReporting()Z", a.class), new PropertyReference1Impl("xTokenRotationReporting", 0, "getXTokenRotationReporting()Z", a.class), new PropertyReference1Impl("authSdkReporting", 0, "getAuthSdkReporting()Z", a.class), new PropertyReference1Impl("webCardReporting", 0, "getWebCardReporting()Z", a.class), new PropertyReference1Impl("standaloneReporting", 0, "getStandaloneReporting()Z", a.class), new PropertyReference1Impl("exitReasonReporting", 0, "getExitReasonReporting()Z", a.class), new PropertyReference1Impl("phonishReporting", 0, "getPhonishReporting()Z", a.class), new PropertyReference1Impl("webAmReporting", 0, "getWebAmReporting()Z", a.class), new PropertyReference1Impl("encryptReporting", 0, "getEncryptReporting()Z", a.class), new PropertyReference1Impl("managingPlusDevicesReporting", 0, "getManagingPlusDevicesReporting()Z", a.class), new PropertyReference1Impl("tombstoneReporter", 0, "getTombstoneReporter()Z", a.class)};
    public final e89 A;
    public final e89 B;
    public final e89 C;
    public final e89 D;
    public final e89 E;
    public final e89 F;
    public final e89 G;
    public final e89 H;
    public final e89 I;
    public final j a;
    public final com.yandex.passport.internal.flags.a b = o.a;
    public final boolean c = true;
    public final e89 d;
    public final e89 e;
    public final e89 f;
    public final e89 g;
    public final e89 h;
    public final e89 i;
    public final e89 j;
    public final e89 k;
    public final e89 l;
    public final e89 m;
    public final e89 n;
    public final e89 o;
    public final e89 p;
    public final e89 q;
    public final e89 r;
    public final e89 s;
    public final e89 t;
    public final e89 u;
    public final e89 v;
    public final e89 w;
    public final e89 x;
    public final e89 y;
    public final e89 z;

    public a(j jVar) {
        this.a = jVar;
        int i = 15;
        this.d = new e89(i, this, o.b);
        this.e = new e89(i, this, o.c);
        this.f = new e89(i, this, o.d);
        this.g = new e89(i, this, o.e);
        this.h = new e89(i, this, o.f);
        this.i = new e89(i, this, o.g);
        this.j = new e89(i, this, o.h);
        this.k = new e89(i, this, o.i);
        this.l = new e89(i, this, o.k);
        this.m = new e89(i, this, o.j);
        this.n = new e89(i, this, o.l);
        this.o = new e89(i, this, o.m);
        this.p = new e89(i, this, o.o);
        this.q = new e89(i, this, o.p);
        this.r = new e89(i, this, o.q);
        this.s = new e89(i, this, o.n);
        this.t = new e89(i, this, o.r);
        this.u = new e89(i, this, o.s);
        this.v = new e89(i, this, o.t);
        this.w = new e89(i, this, o.u);
        this.x = new e89(i, this, o.v);
        this.y = new e89(i, this, o.w);
        this.z = new e89(i, this, o.x);
        this.A = new e89(i, this, o.y);
        this.B = new e89(i, this, o.z);
        this.C = new e89(i, this, o.A);
        this.D = new e89(i, this, o.B);
        this.E = new e89(i, this, o.C);
        this.F = new e89(i, this, o.D);
        this.G = new e89(i, this, o.E);
        this.H = new e89(i, this, o.F);
        this.I = new e89(i, this, o.G);
    }

    public final boolean a() {
        com.yandex.passport.internal.flags.a aVar = this.b;
        boolean z = this.c;
        j jVar = this.a;
        if (z) {
            return ((Boolean) jVar.b(aVar)).booleanValue();
        }
        d dVar = jVar.a;
        String str = (String) ((com.yandex.passport.internal.util.storage.a) dVar.a.getValue(dVar, d.b[0])).a.get(aVar.a);
        Boolean bool = (Boolean) (str != null ? aVar.a(str) : null);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
