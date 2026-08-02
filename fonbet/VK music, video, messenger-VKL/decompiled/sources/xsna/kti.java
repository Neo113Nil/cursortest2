package xsna;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.compose.foundation.text.KeyCommand;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.api.generated.money.dto.MoneyNspkMemberDto;
import com.vk.api.generated.stickers.dto.StickersGetUGCPackListsResponseDto;
import com.vk.api.generated.stickers.dto.StickersUgcPacksListDto;
import com.vk.api.generated.stickers.dto.StickersUgcPacksListItemDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.ugc.UGCChatSettingsModel;
import com.vk.knet.cornet.CronetDisabledException;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.api.posting.author.PostingAuthor;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.vkpay.checkout.config.VkPayCheckoutParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.bex0;
import xsna.c3q0;
import xsna.ggo0;
import xsna.gku0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class kti implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kti(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0969  */
    /* JADX WARN: Type inference failed for: r2v48, types: [T, io.reactivex.rxjava3.disposables.c] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        kjy kjyVar;
        mkv mkvVar;
        io.reactivex.rxjava3.disposables.c cVar;
        Integer c;
        Integer d;
        Integer d2;
        Integer c2;
        ljo0 ljo0Var;
        ljo0 ljo0Var2;
        mjo0 mjo0Var;
        mjo0 mjo0Var2;
        Integer c3;
        Integer d3;
        Integer d4;
        Integer c4;
        ljo0 ljo0Var3;
        ljo0 ljo0Var4;
        mjo0 mjo0Var3;
        mjo0 mjo0Var4;
        tho0 tho0Var;
        c3q0.a aVar;
        tho0 tho0Var2;
        Iterator it;
        StickersUgcPacksListItemDto stickersUgcPacksListItemDto;
        Object obj2;
        switch (this.b) {
            case 0:
                lti ltiVar = (lti) this.c;
                final ckv ckvVar = (ckv) this.d;
                yjv yjvVar = (yjv) this.e;
                if (((Boolean) ltiVar.i.invoke()).booleanValue()) {
                    ReentrantReadWriteLock.ReadLock readLock = ltiVar.n.readLock();
                    readLock.lock();
                    try {
                        kjyVar = ltiVar.c;
                    } finally {
                        readLock.unlock();
                    }
                } else {
                    kjyVar = null;
                }
                boolean booleanValue = ((Boolean) ltiVar.j.invoke()).booleanValue();
                kjv kjvVar = ltiVar.f;
                if (kjvVar.a.a() || kjvVar.c.a()) {
                    return ltiVar.d.a(ckvVar, yjvVar);
                }
                try {
                    return ltiVar.b(yjvVar, ckvVar, kjyVar, booleanValue);
                } catch (Throwable th) {
                    String str = ltiVar.o;
                    final boolean a = ((y260) ltiVar.e.getValue()).a();
                    final boolean equals = th.equals(CronetDisabledException.b);
                    final boolean z = skd.i(th) && a;
                    if (z || equals) {
                        L.c(str, new gzs() { // from class: xsna.hti
                            @Override // xsna.gzs
                            public final Object invoke() {
                                StringBuilder c5 = gp.c("[compat] Try fallback isCronetDisabled: ", " hasNetwork: ", " isNetworkError: ", equals, a);
                                c5.append(z);
                                c5.append(" url: ");
                                c5.append(ckvVar.b);
                                c5.append("!, exception: ");
                                c5.append(fpf0.a(th.getClass()).l());
                                return c5.toString();
                            }
                        });
                        if (!ltiVar.c(ckvVar) || equals) {
                            try {
                                mkv a2 = ltiVar.d.a(ckvVar, yjvVar);
                                L l = L.a;
                                l.getClass();
                                if (!L.m(LoggerOutputTarget.NONE)) {
                                    L.u(l, L.LogType.d, new Object[]{str, "[compat] OKHTTP Fallback is handled for " + ckvVar.b + '!'});
                                }
                                mkvVar = a2;
                            } catch (Throwable th2) {
                                final Throwable a3 = Result.a(new Result.Failure(th2));
                                if (a3 != null) {
                                    L.c(str, new gzs() { // from class: xsna.iti
                                        @Override // xsna.gzs
                                        public final Object invoke() {
                                            StringBuilder c5 = gp.c("[compat] Can't fallback hasNetwork: ", " isNetworkError: ", " url: ", a, z);
                                            c5.append(ckvVar.b);
                                            c5.append("! exception: ");
                                            c5.append(fpf0.a(a3.getClass()).l());
                                            return c5.toString();
                                        }
                                    });
                                }
                                mkvVar = null;
                                if (mkvVar != null) {
                                    return mkvVar;
                                }
                                throw th;
                            }
                            if (mkvVar != null) {
                            }
                        } else {
                            L l2 = L.a;
                            l2.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l2, L.LogType.d, new Object[]{str, "[compat] Ignored request to fallback. Skip fallback to other engine"});
                            }
                        }
                    } else {
                        L.c(str, new gzs() { // from class: xsna.jti
                            @Override // xsna.gzs
                            public final Object invoke() {
                                StringBuilder c5 = gp.c("[compat] Fallback is not available! hasNetwork: ", " isNetworkError: ", " url: ", a, z);
                                c5.append(ckvVar.b);
                                c5.append(" exception: ");
                                c5.append(fpf0.a(th.getClass()).l());
                                return c5.toString();
                            }
                        });
                    }
                    mkvVar = null;
                    if (mkvVar != null) {
                    }
                }
                break;
            case 1:
                n7y n7yVar = (n7y) this.c;
                x6y x6yVar = n7yVar.a;
                VkPayCheckoutParams vkPayCheckoutParams = (VkPayCheckoutParams) this.d;
                JsApiMethodType jsApiMethodType = (JsApiMethodType) this.e;
                iku0 iku0Var = (iku0) obj;
                if (epx.f(iku0Var.a(), vkPayCheckoutParams.e)) {
                    if (iku0Var instanceof lku0) {
                        bex0.a.b(x6yVar, jsApiMethodType, com.vk.movika.sdk.android.defaultplayer.interactive.c.b("result", true), null, 12);
                    } else {
                        if (!(iku0Var instanceof hku0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        gku0 gku0Var = ((hku0) iku0Var).c.a;
                        bex0.a.a(x6yVar, jsApiMethodType, gku0Var.equals(gku0.d.b) ? VkAppsErrors.Client.USER_DENIED : gku0Var.equals(gku0.b.b) ? VkAppsErrors.Client.UNKNOWN_ERROR : VkAppsErrors.Client.INVALID_PARAMS, gku0Var.a, null, null, 56);
                    }
                    bbv0.g.getClass();
                    bbv0.i = null;
                    zav0 zav0Var = n7yVar.b;
                    if (zav0Var != null && (cVar = zav0Var.a) != null) {
                        cVar.dispose();
                    }
                    n7yVar.b = null;
                }
                return s3q0.a;
            case 2:
                ((com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.data.b) this.c).getClass();
                return new com.vk.newsfeed.api.posting.author.a((UserId) this.d, (PostingAuthor.User) this.e, (List) obj);
            case 3:
                Uri uri = (Uri) this.c;
                PackageManager packageManager = (PackageManager) this.d;
                w2h0 w2h0Var = (w2h0) this.e;
                MoneyNspkMemberDto moneyNspkMemberDto = (MoneyNspkMemberDto) obj;
                String d5 = moneyNspkMemberDto.d();
                String e = moneyNspkMemberDto.e();
                ResolveInfo resolveInfo = (ResolveInfo) j5g.a0(packageManager.queryIntentActivities(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri.buildUpon().scheme(e).build()), 131072));
                if (resolveInfo != null) {
                    return new p2h0(d5, resolveInfo.activityInfo.applicationInfo.loadUnbadgedIcon(packageManager), resolveInfo.loadLabel(w2h0Var.b.getPackageManager()).toString(), new r2h0(resolveInfo.activityInfo.packageName, e));
                }
                return null;
            case 4:
                KeyCommand keyCommand = (KeyCommand) this.c;
                ggo0 ggo0Var = (ggo0) this.d;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.e;
                qgo0 qgo0Var = (qgo0) obj;
                int i = 4;
                switch (ggo0.a.$EnumSwitchMapping$0[keyCommand.ordinal()]) {
                    case 1:
                        ggo0Var.b.f(false);
                        break;
                    case 2:
                        ggo0Var.b.r();
                        break;
                    case 3:
                        ggo0Var.b.h();
                        break;
                    case 4:
                        qgo0Var.e.a = null;
                        if (qgo0Var.g.c.length() > 0) {
                            if (qko0.c(qgo0Var.f)) {
                                qgo0Var.g();
                                s3q0 s3q0Var = s3q0.a;
                                break;
                            } else if (qgo0Var.e()) {
                                int f = qko0.f(qgo0Var.f);
                                qgo0Var.o(f, f);
                                break;
                            } else {
                                int e2 = qko0.e(qgo0Var.f);
                                qgo0Var.o(e2, e2);
                                break;
                            }
                        }
                        break;
                    case 5:
                        qgo0Var.e.a = null;
                        if (qgo0Var.g.c.length() > 0) {
                            if (qko0.c(qgo0Var.f)) {
                                qgo0Var.k();
                                s3q0 s3q0Var2 = s3q0.a;
                                break;
                            } else if (qgo0Var.e()) {
                                int e3 = qko0.e(qgo0Var.f);
                                qgo0Var.o(e3, e3);
                                break;
                            } else {
                                int f2 = qko0.f(qgo0Var.f);
                                qgo0Var.o(f2, f2);
                                break;
                            }
                        }
                        break;
                    case 6:
                        pko0 pko0Var = qgo0Var.e;
                        pko0Var.a = null;
                        if (qgo0Var.g.c.length() > 0) {
                            if (qgo0Var.e()) {
                                pko0Var.a = null;
                                if (qgo0Var.g.c.length() > 0 && (d = qgo0Var.d()) != null) {
                                    int intValue = d.intValue();
                                    qgo0Var.o(intValue, intValue);
                                    break;
                                }
                            } else {
                                pko0Var.a = null;
                                if (qgo0Var.g.c.length() > 0 && (c = qgo0Var.c()) != null) {
                                    int intValue2 = c.intValue();
                                    qgo0Var.o(intValue2, intValue2);
                                    break;
                                }
                            }
                        }
                        break;
                    case 7:
                        pko0 pko0Var2 = qgo0Var.e;
                        pko0Var2.a = null;
                        if (qgo0Var.g.c.length() > 0) {
                            if (qgo0Var.e()) {
                                pko0Var2.a = null;
                                if (qgo0Var.g.c.length() > 0 && (c2 = qgo0Var.c()) != null) {
                                    int intValue3 = c2.intValue();
                                    qgo0Var.o(intValue3, intValue3);
                                    break;
                                }
                            } else {
                                pko0Var2.a = null;
                                if (qgo0Var.g.c.length() > 0 && (d2 = qgo0Var.d()) != null) {
                                    int intValue4 = d2.intValue();
                                    qgo0Var.o(intValue4, intValue4);
                                    break;
                                }
                            }
                        }
                        break;
                    case 8:
                        qgo0Var.j();
                        break;
                    case 9:
                        qgo0Var.h();
                        break;
                    case 10:
                        if (qgo0Var.g.c.length() > 0 && (ljo0Var = qgo0Var.c) != null) {
                            int f3 = qgo0Var.f(ljo0Var, -1);
                            qgo0Var.o(f3, f3);
                            break;
                        }
                        break;
                    case 11:
                        if (qgo0Var.g.c.length() > 0 && (ljo0Var2 = qgo0Var.c) != null) {
                            int f4 = qgo0Var.f(ljo0Var2, 1);
                            qgo0Var.o(f4, f4);
                            break;
                        }
                        break;
                    case 12:
                        if (qgo0Var.g.c.length() > 0 && (mjo0Var = qgo0Var.i) != null) {
                            int r = qgo0Var.r(mjo0Var, -1);
                            qgo0Var.o(r, r);
                            break;
                        }
                        break;
                    case 13:
                        if (qgo0Var.g.c.length() > 0 && (mjo0Var2 = qgo0Var.i) != null) {
                            int r2 = qgo0Var.r(mjo0Var2, 1);
                            qgo0Var.o(r2, r2);
                            break;
                        }
                        break;
                    case 14:
                        qgo0Var.m();
                        break;
                    case 15:
                        qgo0Var.l();
                        break;
                    case 16:
                        qgo0Var.e.a = null;
                        if (qgo0Var.g.c.length() > 0) {
                            if (qgo0Var.e()) {
                                qgo0Var.m();
                                break;
                            } else {
                                qgo0Var.l();
                                break;
                            }
                        }
                        break;
                    case 17:
                        qgo0Var.e.a = null;
                        if (qgo0Var.g.c.length() > 0) {
                            if (qgo0Var.e()) {
                                qgo0Var.l();
                                break;
                            } else {
                                qgo0Var.m();
                                break;
                            }
                        }
                        break;
                    case 18:
                        qgo0Var.e.a = null;
                        if (qgo0Var.g.c.length() > 0) {
                            qgo0Var.o(0, 0);
                            break;
                        }
                        break;
                    case 19:
                        qgo0Var.e.a = null;
                        us2 us2Var = qgo0Var.g;
                        if (us2Var.c.length() > 0) {
                            int length = us2Var.c.length();
                            qgo0Var.o(length, length);
                            break;
                        }
                        break;
                    case 20:
                        List<pzo> q = qgo0Var.q(new m4k0(6));
                        if (q != null) {
                            ggo0Var.a(q);
                            s3q0 s3q0Var3 = s3q0.a;
                            break;
                        }
                        break;
                    case 21:
                        List<pzo> q2 = qgo0Var.q(new e750(18));
                        if (q2 != null) {
                            ggo0Var.a(q2);
                            s3q0 s3q0Var4 = s3q0.a;
                            break;
                        }
                        break;
                    case 22:
                        List<pzo> q3 = qgo0Var.q(new ygm0(3));
                        if (q3 != null) {
                            ggo0Var.a(q3);
                            s3q0 s3q0Var5 = s3q0.a;
                            break;
                        }
                        break;
                    case 23:
                        List<pzo> q4 = qgo0Var.q(new ubj0(5));
                        if (q4 != null) {
                            ggo0Var.a(q4);
                            s3q0 s3q0Var6 = s3q0.a;
                            break;
                        }
                        break;
                    case 24:
                        List<pzo> q5 = qgo0Var.q(new zzl0(i));
                        if (q5 != null) {
                            ggo0Var.a(q5);
                            s3q0 s3q0Var7 = s3q0.a;
                            break;
                        }
                        break;
                    case 25:
                        List<pzo> q6 = qgo0Var.q(new hwi0(11));
                        if (q6 != null) {
                            ggo0Var.a(q6);
                            s3q0 s3q0Var8 = s3q0.a;
                            break;
                        }
                        break;
                    case 26:
                        if (ggo0Var.e) {
                            ref$BooleanRef.element = ((j1z) ggo0Var.a.x.c).r.a(ggo0Var.l);
                        } else {
                            ggo0Var.a(Collections.singletonList(new pgg("\n", 1)));
                        }
                        s3q0 s3q0Var9 = s3q0.a;
                        break;
                    case 27:
                        if (ggo0Var.e) {
                            ref$BooleanRef.element = false;
                        } else {
                            ggo0Var.a(Collections.singletonList(new pgg("\t", 1)));
                        }
                        s3q0 s3q0Var10 = s3q0.a;
                        break;
                    case 28:
                        qgo0Var.e.a = null;
                        us2 us2Var2 = qgo0Var.g;
                        if (us2Var2.c.length() > 0) {
                            qgo0Var.o(0, us2Var2.c.length());
                            break;
                        }
                        break;
                    case 29:
                        qgo0Var.g();
                        qgo0Var.n();
                        break;
                    case 30:
                        qgo0Var.k();
                        qgo0Var.n();
                        break;
                    case 31:
                        pko0 pko0Var3 = qgo0Var.e;
                        pko0Var3.a = null;
                        if (qgo0Var.g.c.length() > 0) {
                            if (qgo0Var.e()) {
                                pko0Var3.a = null;
                                if (qgo0Var.g.c.length() > 0 && (d3 = qgo0Var.d()) != null) {
                                    int intValue5 = d3.intValue();
                                    qgo0Var.o(intValue5, intValue5);
                                }
                            } else {
                                pko0Var3.a = null;
                                if (qgo0Var.g.c.length() > 0 && (c3 = qgo0Var.c()) != null) {
                                    int intValue6 = c3.intValue();
                                    qgo0Var.o(intValue6, intValue6);
                                }
                            }
                        }
                        qgo0Var.n();
                        break;
                    case 32:
                        pko0 pko0Var4 = qgo0Var.e;
                        pko0Var4.a = null;
                        if (qgo0Var.g.c.length() > 0) {
                            if (qgo0Var.e()) {
                                pko0Var4.a = null;
                                if (qgo0Var.g.c.length() > 0 && (c4 = qgo0Var.c()) != null) {
                                    int intValue7 = c4.intValue();
                                    qgo0Var.o(intValue7, intValue7);
                                }
                            } else {
                                pko0Var4.a = null;
                                if (qgo0Var.g.c.length() > 0 && (d4 = qgo0Var.d()) != null) {
                                    int intValue8 = d4.intValue();
                                    qgo0Var.o(intValue8, intValue8);
                                }
                            }
                        }
                        qgo0Var.n();
                        break;
                    case 33:
                        qgo0Var.j();
                        qgo0Var.n();
                        break;
                    case 34:
                        qgo0Var.h();
                        qgo0Var.n();
                        break;
                    case 35:
                        qgo0Var.m();
                        qgo0Var.n();
                        break;
                    case 36:
                        qgo0Var.l();
                        qgo0Var.n();
                        break;
                    case 37:
                        qgo0Var.e.a = null;
                        if (qgo0Var.g.c.length() > 0) {
                            if (qgo0Var.e()) {
                                qgo0Var.m();
                            } else {
                                qgo0Var.l();
                            }
                        }
                        qgo0Var.n();
                        break;
                    case 38:
                        qgo0Var.e.a = null;
                        if (qgo0Var.g.c.length() > 0) {
                            if (qgo0Var.e()) {
                                qgo0Var.l();
                            } else {
                                qgo0Var.m();
                            }
                        }
                        qgo0Var.n();
                        break;
                    case 39:
                        if (qgo0Var.g.c.length() > 0 && (ljo0Var3 = qgo0Var.c) != null) {
                            int f5 = qgo0Var.f(ljo0Var3, -1);
                            qgo0Var.o(f5, f5);
                        }
                        qgo0Var.n();
                        break;
                    case 40:
                        if (qgo0Var.g.c.length() > 0 && (ljo0Var4 = qgo0Var.c) != null) {
                            int f6 = qgo0Var.f(ljo0Var4, 1);
                            qgo0Var.o(f6, f6);
                        }
                        qgo0Var.n();
                        break;
                    case 41:
                        if (qgo0Var.g.c.length() > 0 && (mjo0Var3 = qgo0Var.i) != null) {
                            int r3 = qgo0Var.r(mjo0Var3, -1);
                            qgo0Var.o(r3, r3);
                        }
                        qgo0Var.n();
                        break;
                    case 42:
                        if (qgo0Var.g.c.length() > 0 && (mjo0Var4 = qgo0Var.i) != null) {
                            int r4 = qgo0Var.r(mjo0Var4, 1);
                            qgo0Var.o(r4, r4);
                        }
                        qgo0Var.n();
                        break;
                    case 43:
                        qgo0Var.e.a = null;
                        if (qgo0Var.g.c.length() > 0) {
                            qgo0Var.o(0, 0);
                        }
                        qgo0Var.n();
                        break;
                    case 44:
                        qgo0Var.e.a = null;
                        us2 us2Var3 = qgo0Var.g;
                        if (us2Var3.c.length() > 0) {
                            int length2 = us2Var3.c.length();
                            qgo0Var.o(length2, length2);
                        }
                        qgo0Var.n();
                        break;
                    case 45:
                        qgo0Var.e.a = null;
                        if (qgo0Var.g.c.length() > 0) {
                            long j = qgo0Var.f;
                            int i2 = qko0.c;
                            int i3 = (int) (j & 4294967295L);
                            qgo0Var.o(i3, i3);
                            break;
                        }
                        break;
                    case 46:
                        c3q0 c3q0Var = ggo0Var.h;
                        if (c3q0Var != null) {
                            c3q0Var.a(tho0.b(qgo0Var.h, qgo0Var.g, qgo0Var.f, 4));
                        }
                        c3q0 c3q0Var2 = ggo0Var.h;
                        if (c3q0Var2 != null) {
                            c3q0.a aVar2 = c3q0Var2.b;
                            if (aVar2 == null || (aVar = aVar2.a) == null) {
                                tho0Var = null;
                            } else {
                                c3q0Var2.b = aVar;
                                c3q0Var2.d -= aVar2.b.a.c.length();
                                c3q0Var2.c = new c3q0.a(c3q0Var2.c, aVar2.b);
                                tho0Var = aVar.b;
                            }
                            if (tho0Var != null) {
                                ggo0Var.k.invoke(tho0Var);
                                s3q0 s3q0Var11 = s3q0.a;
                                break;
                            }
                        }
                        break;
                    case 47:
                        c3q0 c3q0Var3 = ggo0Var.h;
                        if (c3q0Var3 != null) {
                            c3q0.a aVar3 = c3q0Var3.c;
                            if (aVar3 != null) {
                                c3q0Var3.c = aVar3.a;
                                tho0 tho0Var3 = aVar3.b;
                                c3q0Var3.b = new c3q0.a(c3q0Var3.b, tho0Var3);
                                c3q0Var3.d = tho0Var3.a.c.length() + c3q0Var3.d;
                                tho0Var2 = aVar3.b;
                            } else {
                                tho0Var2 = null;
                            }
                            if (tho0Var2 != null) {
                                ggo0Var.k.invoke(tho0Var2);
                                s3q0 s3q0Var12 = s3q0.a;
                                break;
                            }
                        }
                        break;
                    case 48:
                    case 49:
                        s3q0 s3q0Var13 = s3q0.a;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            default:
                hwp0 hwp0Var = (hwp0) this.c;
                Long l3 = (Long) this.d;
                String str2 = (String) this.e;
                StickersGetUGCPackListsResponseDto stickersGetUGCPackListsResponseDto = (StickersGetUGCPackListsResponseDto) obj;
                hwp0Var.getClass();
                if (!stickersGetUGCPackListsResponseDto.d().isEmpty() || l3 == null) {
                    for (StickersUgcPacksListDto stickersUgcPacksListDto : stickersGetUGCPackListsResponseDto.d()) {
                        if (stickersUgcPacksListDto.f().isEmpty()) {
                            UserId q7 = stickersUgcPacksListDto.q();
                            Boolean d6 = stickersUgcPacksListDto.d();
                            boolean booleanValue2 = d6 != null ? d6.booleanValue() : false;
                            boolean j2 = stickersUgcPacksListDto.j();
                            Boolean g = stickersUgcPacksListDto.g();
                            hwp0Var.f(q7, booleanValue2, j2, false, g != null ? g.booleanValue() : false);
                        } else {
                            long j3 = stickersUgcPacksListDto.q().b;
                            List<dwp0> c5 = hwp0Var.c.a.c(j3);
                            ArrayList arrayList = new ArrayList(c5g.u(c5, 10));
                            for (dwp0 dwp0Var : c5) {
                                arrayList.add(new ewp0(dwp0Var.a, dwp0Var.b, dwp0Var.c, dwp0Var.d, dwp0Var.e));
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = stickersUgcPacksListDto.f().iterator();
                            while (it2.hasNext()) {
                                StickersUgcPacksListItemDto stickersUgcPacksListItemDto2 = (StickersUgcPacksListItemDto) it2.next();
                                Iterator it3 = arrayList.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        obj2 = it3.next();
                                        it = it2;
                                        stickersUgcPacksListItemDto = stickersUgcPacksListItemDto2;
                                        if (((ewp0) obj2).b != stickersUgcPacksListItemDto.e()) {
                                            it2 = it;
                                            stickersUgcPacksListItemDto2 = stickersUgcPacksListItemDto;
                                        }
                                    } else {
                                        it = it2;
                                        stickersUgcPacksListItemDto = stickersUgcPacksListItemDto2;
                                        obj2 = null;
                                    }
                                }
                                ewp0 ewp0Var = (ewp0) obj2;
                                if (ewp0Var == null || !epx.f(ewp0Var.d, stickersUgcPacksListItemDto.d())) {
                                    arrayList2.add(Long.valueOf(stickersUgcPacksListItemDto.e()));
                                }
                                it2 = it;
                            }
                            Boolean d7 = stickersUgcPacksListDto.d();
                            boolean booleanValue3 = d7 != null ? d7.booleanValue() : false;
                            boolean j4 = stickersUgcPacksListDto.j();
                            Boolean i4 = stickersUgcPacksListDto.i();
                            boolean booleanValue4 = i4 != null ? i4.booleanValue() : false;
                            boolean e4 = stickersUgcPacksListDto.e();
                            Boolean g2 = stickersUgcPacksListDto.g();
                            hwp0Var.g(new UGCChatSettingsModel(j3, j4, false, g2 != null ? g2.booleanValue() : false, booleanValue4, booleanValue3, e4, 4, null));
                            if (!arrayList2.isEmpty()) {
                                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                                Iterator it4 = arrayList2.iterator();
                                while (it4.hasNext()) {
                                    arrayList3.add(Integer.valueOf((int) ((Number) it4.next()).longValue()));
                                }
                                tfx tfxVar = new tfx("stickers.getUGCPacks", new vcl0(0), new io.reactivex.rxjava3.internal.operators.mixed.j(26));
                                tfx.m(tfxVar, "owner_id", j3, 0L, 12);
                                tfxVar.i("pack_ids", arrayList3);
                                int i5 = 22;
                                ?? subscribe = new io.reactivex.rxjava3.internal.operators.single.j(rsg0.w0(yfb.x(tfxVar)).m(asu0.a.c()), new mvm(1, ref$ObjectRef, hwp0Var)).l(new a0m0(new zzl0(6), 3)).subscribe(new r7a0(new wb00(hwp0Var, j3), 14), new d750(new dl70(i5), i5));
                                hwp0Var.g.b(subscribe);
                                ref$ObjectRef.element = subscribe;
                            }
                        }
                    }
                } else {
                    hwp0Var.f(new UserId(l3.longValue()), false, false, true, false);
                }
                hwp0Var.a.b();
                if (str2 == null && l3 != null) {
                    hwp0Var.f.add(l3);
                }
                return s3q0.a;
        }
    }
}
