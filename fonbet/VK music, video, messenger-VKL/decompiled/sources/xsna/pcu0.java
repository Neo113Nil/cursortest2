package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Trace;
import com.vk.api.generated.account.dto.AccountGetMultiResponseDto;
import com.vk.api.generated.auth.dto.AuthGetExchangeTokenResponseDto;
import com.vk.api.generated.auth.dto.AuthUserExchangeTokenDto;
import com.vk.api.generated.tabbar.dto.TabbarGetResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.users.dto.UsersUserProfileTypeDto;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.VkClientLibverifyInfo;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.EngineInvalidateSource;
import com.vk.im.engine.models.credentials.UserCredentials;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.superapp.api.internal.oauthrequests.EmptyDataException;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.b;
import com.vk.toggle.internal.ToggleManager;
import com.vk.toggle.internal.a;
import com.vkontakte.android.ShortcutManagerWrapper;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.cs;
import xsna.ext;
import xsna.i9r0;
import xsna.j1v0;
import xsna.k35;
import xsna.nb3;
import xsna.usi0;
import xsna.xbu0;

/* compiled from: VkAuthModel.kt */
/* loaded from: classes11.dex */
public final class pcu0 extends fbl {
    public final via g;
    public final wa3 h;
    public final mui0 i;
    public final sxi0 j;
    public final bpn0 k;
    public final bpn0 l;
    public final wtn0 m;
    public final bpn0 n;
    public final bpn0 o;
    public final bpn0 p;
    public final bpn0 q;
    public final bpn0 r;
    public final bpn0 s;
    public final String t;
    public final VkClientLibverifyInfo u;
    public final bpn0 v;
    public final Object w;

    /* compiled from: VkAuthModel.kt */
    /* loaded from: classes7.dex */
    public static final class a extends com.vk.api.request.rx.batch.a<AccountGetMultiResponseDto, AuthGetExchangeTokenResponseDto, xbu0> {
        public final h7r0 v;

        public a(h7r0 h7r0Var) {
            super(yfb.x(cs.a.c((2 & 1) != 0 ? null : k35.b)), yfb.x(new ufx("auth.getExchangeToken", new defpackage.j0(9), new or(5))));
            this.v = h7r0Var;
            B(h7r0Var.a, h7r0Var.b);
        }

        @Override // com.vk.api.request.rx.batch.a
        public final xbu0 K0(bv6<AccountGetMultiResponseDto> bv6Var, bv6<AuthGetExchangeTokenResponseDto> bv6Var2) {
            Object obj;
            Object obj2;
            String d;
            AccountGetMultiResponseDto accountGetMultiResponseDto = bv6Var.a;
            AuthGetExchangeTokenResponseDto authGetExchangeTokenResponseDto = bv6Var2.a;
            List<String> list = k35.b;
            UserId userId = this.v.e;
            List<UsersUserFullDto> d2 = accountGetMultiResponseDto.d();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = d2.iterator();
            while (true) {
                obj = null;
                r6 = null;
                r6 = null;
                k35.b bVar = null;
                if (!it.hasNext()) {
                    break;
                }
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) it.next();
                List<AuthUserExchangeTokenDto> d3 = authGetExchangeTokenResponseDto.d();
                if (d3 != null) {
                    Iterator<T> it2 = d3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        if (epx.f(((AuthUserExchangeTokenDto) obj2).getUserId(), usersUserFullDto.s1())) {
                            break;
                        }
                    }
                    AuthUserExchangeTokenDto authUserExchangeTokenDto = (AuthUserExchangeTokenDto) obj2;
                    if (authUserExchangeTokenDto != null && (d = authUserExchangeTokenDto.d()) != null) {
                        AccountProfileType.a aVar = AccountProfileType.Companion;
                        UsersUserProfileTypeDto I2 = usersUserFullDto.I2();
                        Integer valueOf = I2 != null ? Integer.valueOf(I2.i()) : null;
                        aVar.getClass();
                        AccountProfileType a = AccountProfileType.a.a(valueOf);
                        UserId s1 = usersUserFullDto.s1();
                        if (a == null) {
                            a = AccountProfileType.NORMAL;
                        }
                        bVar = new k35.b(s1, a, usersUserFullDto.X1(), String.valueOf(usersUserFullDto.D0()), rq.a(usersUserFullDto, new StringBuilder(), ' '), d);
                    }
                }
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                if (epx.f(((k35.b) next).a, userId)) {
                    obj = next;
                    break;
                }
            }
            k35.b bVar2 = (k35.b) obj;
            ArrayList arrayList2 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Object next2 = it4.next();
                if (!epx.f(((k35.b) next2).a, userId)) {
                    arrayList2.add(next2);
                }
            }
            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                k35.b bVar3 = (k35.b) it5.next();
                arrayList3.add(new xbu0.a(bVar3.a, bVar3.d, bVar3.c, bVar3.f, bVar3.b));
            }
            if (bVar2 != null) {
                return new xbu0(bVar2.a, bVar2.d, bVar2.c, bVar2.f, bVar2.b, arrayList3, bVar2.e, null, 128);
            }
            throw new EmptyDataException("AuthGetExchangeItemsCommand: main account is null");
        }

        public final io.reactivex.rxjava3.core.q<xbu0> N0() {
            return new io.reactivex.rxjava3.internal.operators.observable.q(new ox2("AuthGetExchangeLoginData", this, dgn0.c(), null, new sdx0()));
        }
    }

    public pcu0(Context context, via viaVar, wa3 wa3Var, mui0 mui0Var, sxi0 sxi0Var, bpn0 bpn0Var, bpn0 bpn0Var2, wtn0 wtn0Var, bpn0 bpn0Var3, bpn0 bpn0Var4, bpn0 bpn0Var5, bpn0 bpn0Var6, bpn0 bpn0Var7, bpn0 bpn0Var8) {
        super(context);
        this.g = viaVar;
        this.h = wa3Var;
        this.i = mui0Var;
        this.j = sxi0Var;
        this.k = bpn0Var;
        this.l = bpn0Var2;
        this.m = wtn0Var;
        this.n = bpn0Var3;
        this.o = bpn0Var4;
        this.p = bpn0Var5;
        this.q = bpn0Var6;
        this.r = bpn0Var7;
        this.s = bpn0Var8;
        this.t = "all";
        ug9 ug9Var = new ug9(16);
        String[] strArr = {"android.permission.READ_CALL_LOG", "android.permission.READ_PHONE_STATE", "android.permission.READ_PHONE_NUMBERS"};
        if (!BuildInfo.i()) {
            BuildInfo.h();
        }
        this.u = new VkClientLibverifyInfo(ug9Var, strArr);
        this.v = new bpn0(new via(15));
        this.w = msy.a(LazyThreadSafetyMode.NONE, new s63(18));
    }

    public static io.reactivex.rxjava3.core.q p(final AuthResult authResult, final boolean z) {
        return new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.mcu0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ext extVar = new ext(z);
                AuthResult authResult2 = authResult;
                String str = authResult2.b;
                String str2 = authResult2.c;
                extVar.l = str;
                extVar.m = str2;
                return extVar;
            }
        }).r0(asu0.a.c()).L(new wii0(new kbq0(4), 14), false);
    }

    @Override // com.vk.auth.main.AuthModel
    public final io.reactivex.rxjava3.internal.operators.observable.m2 d(final AuthResult authResult) {
        boolean z;
        boolean r = sv1.r(authResult.l());
        ArrayList e = this.i.e();
        if (!e.isEmpty()) {
            Iterator it = e.iterator();
            while (it.hasNext()) {
                if (epx.f(((usi0.a) it.next()).c().b(), authResult.getUid())) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        io.reactivex.rxjava3.core.q<R> L = new io.reactivex.rxjava3.internal.operators.observable.t(new io.reactivex.rxjava3.functions.n() { // from class: xsna.ncu0
            @Override // io.reactivex.rxjava3.functions.n
            public final Object get() {
                m6r0 e2 = q6r0.e(AuthResult.this.d);
                return e2 != null ? io.reactivex.rxjava3.core.q.T(e2) : io.reactivex.rxjava3.internal.operators.observable.g0.b;
            }
        }).r0(asu0.a.c()).L(new l340(new ocu0(r, z, this, authResult), 22), false);
        io.reactivex.rxjava3.core.q<xbu0> r2 = r(authResult);
        L.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.m2(L, r2);
    }

    @Override // com.vk.auth.main.AuthModel
    public final String f() {
        return this.t;
    }

    @Override // com.vk.auth.main.AuthModel
    public final void h(AuthResult authResult, Uri uri) {
        ozg0.a().k(uri, authResult.getUid());
    }

    @Override // com.vk.auth.main.AuthModel
    public final VkClientLibverifyInfo n() {
        return this.u;
    }

    public final void o(AuthResult authResult) {
        m6r0 f = q6r0.f();
        if (!f.A() || epx.f(f.y(), authResult.getUid())) {
            return;
        }
        String k = f.k();
        if (k == null) {
            k = "";
        }
        String v = f.v();
        String str = v != null ? v : "";
        qsk0.a.e(null);
        xe8 xe8Var = new xe8(this.n);
        long j = f.y().b;
        xe8Var.e(k, str, sv1.r(authResult.l()));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    public final synchronized void q(AuthResult authResult, ext.b bVar) {
        Throwable th;
        try {
            try {
                UserId uid = authResult.getUid();
                String d = authResult.d();
                String o = authResult.o();
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"set tokens in VKAuthModel"});
                }
                o(authResult);
                m6r0 m6r0Var = new m6r0();
                m6r0Var.G(uid);
                m6r0Var.f(m6r0.i, bVar.a.r());
                m6r0Var.C(d);
                m6r0Var.E(o);
                m6r0Var.D(authResult.k());
                m6r0Var.F(authResult.i());
                s(d, authResult, uid);
                if (bVar.b != null) {
                    try {
                        wtn0 wtn0Var = this.m;
                        gun0 gun0Var = (gun0) this.w.getValue();
                        TabbarGetResponseDto tabbarGetResponseDto = bVar.b;
                        gun0Var.getClass();
                        wtn0Var.d(gun0.a(tabbarGetResponseDto), false);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                v6u0 v6u0Var = obu0.a;
                obu0.d(this.a, b35.a(authResult, bVar.a.r()));
                q6r0.i(m6r0Var, bVar);
                cfr0.a(bVar, true);
                t(bVar.d, d, o, authResult, uid);
                v(authResult, bVar);
                u(authResult);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final io.reactivex.rxjava3.core.q<xbu0> r(AuthResult authResult) {
        boolean h = SakFeatures.Type.GET_USER_INFO_CUT_OFF_FROM_AUTH.h();
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        if (!h) {
            io.reactivex.rxjava3.core.q p = p(authResult, true);
            asu0.a.getClass();
            return bxp0.b(bxp0.c(p.a0(asu0.i()).E(new s440(new rls0(3, this, authResult), 23), lVar, kVar, kVar).a0(io.reactivex.rxjava3.android.schedulers.a.b()), authResult, false), authResult, (ymj0) this.q.getValue(), new zzl0(9), new hwi0(16)).U(new p5w(new eni0(13), 25));
        }
        String d = authResult.d();
        String o = authResult.o();
        return new a(new h7r0(authResult.k(), authResult.i(), authResult.C(), authResult.getUid(), d, o)).N0().r0(io.reactivex.rxjava3.schedulers.a.b()).E(new eiy(new t6c0(16), 29), lVar, kVar, kVar).L(new vtg0(new fgm0(3, this, authResult), 13), false);
    }

    public final void s(String str, AuthResult authResult, UserId userId) {
        vj vjVar = new vj(str, authResult.k(), authResult.i());
        fhq0 fhq0Var = new fhq0(userId, AccountProfileType.NORMAL);
        usi0.a aVar = new usi0.a(vjVar, fhq0Var, authResult.C());
        bpn0 bpn0Var = this.v;
        fcd0 fcd0Var = (fcd0) bpn0Var.getValue();
        mui0 mui0Var = this.i;
        mui0Var.f(fcd0Var);
        usi0.a i = mui0Var.i();
        sxi0 sxi0Var = this.j;
        if (i == null) {
            sxi0Var.l(aVar);
        } else if (epx.f(i.c().b(), fhq0Var.b())) {
            sxi0Var.j(i, aVar);
        } else {
            sxi0Var.l(aVar);
        }
        mui0Var.k((fcd0) bpn0Var.getValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0065, code lost:
    
        if (r8 != (-1)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
    
        r11 = java.lang.Integer.valueOf(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
    
        if (r11 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        r4 = r11.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        r14.b(new xsna.hp(r18, r2, r15, r16, r5, r6, r4, r9, com.vk.api.sdk.auth.AccountProfileType.NORMAL, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(String str, String str2, String str3, AuthResult authResult, UserId userId) {
        mp mpVar = (mp) this.l.getValue();
        r55 r55Var = r55.a;
        og0 og0Var = new og0(mpVar, r55.d());
        String a2 = cqm0.a(str);
        if (a2 == null) {
            a2 = og0Var.b(userId);
        }
        String str4 = a2;
        i9r0.a aVar = i9r0.a;
        String valueOf = String.valueOf(userId.b);
        int k = authResult.k();
        long i = authResult.i();
        Iterator it = this.i.e().iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            Integer num = null;
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            Object next = it.next();
            if (i3 < 0) {
                e43.t();
                throw null;
            }
            if (epx.f(((usi0.a) next).c().b(), userId)) {
                break;
            } else {
                i3++;
            }
        }
    }

    public final void u(AuthResult authResult) {
        r1w r1wVar = (r1w) this.s.getValue();
        UserId uid = authResult.getUid();
        String d = authResult.d();
        String o = authResult.o();
        if (o == null) {
            o = "";
        }
        r1wVar.a(new UserCredentials(authResult.k(), authResult.i(), uid, d, o), EngineInvalidateSource.LOGIN);
        c4g0.x(this.a);
        i2w.a().D(this, new pam());
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0145, code lost:
    
        if (r15 > 0) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(AuthResult authResult, ext.b bVar) {
        int i;
        ReentrantReadWriteLock.ReadLock readLock;
        int readHoldCount;
        ReentrantReadWriteLock.WriteLock writeLock;
        long j;
        boolean b;
        long j2;
        ((com.vk.superapp.multiaccount.api.d) this.k.getValue()).c();
        ((j8e0) this.o.getValue()).a();
        ArrayList arrayList = ukg.b.e;
        m6r0 m6r0Var = bVar.a;
        l7r l7rVar = m6r0.q0;
        com.vk.dto.hints.a aVar = (com.vk.dto.hints.a) ((bxx) m6r0Var.a(l7rVar));
        if (aVar != null) {
            bVar.a.f(l7rVar, aVar.b(arrayList));
        }
        o6i G = j6i.a().G();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        G.b(context, "com.vk.companion.ACTION_LOGIN");
        ShortcutManagerWrapper shortcutManagerWrapper = ShortcutManagerWrapper.a;
        ShortcutManagerWrapper.j(this.a, authResult.getUid().b, ShortcutManagerWrapper.ShortcutCategory.VKAPP);
        this.h.getClass();
        t6g0.b().load();
        wvv.b(wvv.a, new n52(this, 17), ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS, 0L, 12);
        f620.c();
        if (!SakFeatures.Type.CORE_REMOVE_EXTRA_STICKERS_UPDATE.h()) {
            xx1.F();
        }
        if (!fkq0.c(authResult.getUid())) {
            return;
        }
        bny.a.getClass();
        bny.b().a.set(j1v0.a.C3091a.a);
        int i2 = 1;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        UserId uid = authResult.getUid();
        plq0 plq0Var = new plq0(4, countDownLatch, this);
        nb3 nb3Var = nb3.a;
        com.vk.toggle.b.y();
        com.vk.toggle.b bVar2 = com.vk.toggle.b.A;
        String valueOf = String.valueOf(uid.b);
        synchronized (bVar2) {
            Trace.beginSection(ndp0.f("ToggleManager.onStorageNameChanged"));
            try {
                if (valueOf.length() == 0) {
                    valueOf = "default_storage";
                }
                if (!epx.f(bVar2.h.i(), valueOf)) {
                    bVar2.m = 0;
                    Lazy<? extends xuq> lazy = bVar2.k;
                    if (lazy == null) {
                        lazy = null;
                    }
                    bVar2.h = bVar2.g(valueOf, lazy);
                }
                bVar2.m();
                bVar2.i.a.clear();
                bVar2.s.clear();
                bVar2.h.h(new n0p0(bVar2), true);
                if (!bVar2.h.isEmpty()) {
                    bVar2.k().a.onNext(a.b.a);
                }
                s3q0 s3q0Var = s3q0.a;
                Trace.endSection();
            } finally {
                Trace.endSection();
            }
        }
        if (!bVar2.h.isEmpty()) {
            if (bVar2.j != null) {
                ToggleManager.b bVar3 = bVar2.j;
                if (bVar3 == null) {
                    bVar3 = null;
                }
                j2 = bVar3.c.getValue().longValue();
            } else {
                j2 = -1;
            }
        }
        synchronized (bVar2) {
            try {
                ReentrantReadWriteLock reentrantReadWriteLock = bVar2.w;
                readLock = reentrantReadWriteLock.readLock();
                readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i3 = 0; i3 < readHoldCount; i3++) {
                    readLock.unlock();
                }
                writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                ToggleManager.Sync sync = bVar2.d;
                ToggleManager.Sync sync2 = ToggleManager.Sync.InProgress;
                if (sync == sync2) {
                    L.G("toggles: already start updating!");
                    for (int i4 = 0; i4 < readHoldCount; i4++) {
                        readLock.lock();
                    }
                    writeLock.unlock();
                    b = false;
                } else {
                    L.p("toggles: start initial loading...");
                    bVar2.t(sync2);
                    bVar2.f.onNext(sync2);
                    s3q0 s3q0Var2 = s3q0.a;
                    for (int i5 = 0; i5 < readHoldCount; i5++) {
                        readLock.lock();
                    }
                    writeLock.unlock();
                    if (bVar2.j != null) {
                        ToggleManager.b bVar4 = bVar2.j;
                        if (bVar4 == null) {
                            bVar4 = null;
                        }
                        j = bVar4.c.getValue().longValue();
                    } else {
                        j = -1;
                    }
                    Long valueOf2 = Long.valueOf(j);
                    if (j <= 0) {
                        valueOf2 = null;
                    }
                    long longValue = valueOf2 != null ? valueOf2.longValue() : TimeUnit.SECONDS.toMillis(3L);
                    b.InterfaceC1925b interfaceC1925b = bVar2.o;
                    if (interfaceC1925b == null) {
                        interfaceC1925b = null;
                    }
                    int i6 = 21;
                    io.reactivex.rxjava3.internal.operators.observable.g.subscribe(interfaceC1925b.a(bVar2.v(), null).y0(longValue, TimeUnit.MILLISECONDS), new tmz(new l850(bVar2, 22), i6), new ow40(new bua(bVar2, longValue, i2), i6), io.reactivex.rxjava3.internal.functions.a.c);
                    b = bVar2.b();
                }
            } catch (Throwable th) {
                for (i = 0; i < readHoldCount; i++) {
                    readLock.lock();
                }
                writeLock.unlock();
                throw th;
            } finally {
            }
        }
        if (b) {
            plq0Var.invoke();
            countDownLatch.await(3L, TimeUnit.SECONDS);
            ivg0 ivg0Var = ivg0.e;
            owi.a(ivg0Var.d, 10000L, new z56(ivg0Var, 7));
            owi.a(hhx0.a, 10000L, new knf(25));
            v9v0.b.getClass();
            Handler handler = v9v0.c;
            handler.removeCallbacksAndMessages(null);
            handler.postDelayed(new f5m(2), 1000L);
            ns nsVar = (ns) this.r.getValue();
            nsVar.stop();
            nb3.a.getClass();
            if (nb3.e == null) {
                if (o25.a().b()) {
                    nsVar.a(o25.a().c(), new fb3(0));
                }
                nb3.b bVar5 = new nb3.b(nsVar);
                nb3.e = bVar5;
                c63.a(bVar5);
                return;
            }
            return;
        }
        nb3.a.getClass();
        nb3.c(plq0Var);
        countDownLatch.await(3L, TimeUnit.SECONDS);
        ivg0 ivg0Var2 = ivg0.e;
        owi.a(ivg0Var2.d, 10000L, new z56(ivg0Var2, 7));
        owi.a(hhx0.a, 10000L, new knf(25));
        v9v0.b.getClass();
        Handler handler2 = v9v0.c;
        handler2.removeCallbacksAndMessages(null);
        handler2.postDelayed(new f5m(2), 1000L);
        ns nsVar2 = (ns) this.r.getValue();
        nsVar2.stop();
        nb3.a.getClass();
        if (nb3.e == null) {
        }
    }
}
