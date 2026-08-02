package com.yandex.go.user_profile.ui;

import com.yandex.go.ultima_mode.domain.c;
import com.yandex.go.user_profile.main_menu.profile.domain.d;
import defpackage.adf0;
import defpackage.cdf0;
import defpackage.ddf0;
import defpackage.g8e;
import defpackage.gff0;
import defpackage.iff0;
import defpackage.im51;
import defpackage.jff0;
import defpackage.jj10;
import defpackage.jl40;
import defpackage.kff0;
import defpackage.ncf0;
import defpackage.ny61;
import defpackage.ocf0;
import defpackage.pcf0;
import defpackage.pff0;
import defpackage.ps21;
import defpackage.qcf0;
import defpackage.rcf0;
import defpackage.scf0;
import defpackage.tcf0;
import defpackage.u8w;
import defpackage.ucf0;
import defpackage.vcf0;
import defpackage.w511;
import defpackage.wcf0;
import defpackage.xcf0;
import defpackage.xv11;
import defpackage.ycf0;
import defpackage.zcf0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.settings.profile.ProfileAnalyticsReporter$PreviousScreenIdentifier;

/* loaded from: classes14.dex */
public final class a {
    public final im51 a;
    public final d b;
    public final ddf0 c;
    public final xv11 d;
    public boolean e;
    public boolean f;

    public a(im51 im51Var, d dVar, ddf0 ddf0Var, xv11 xv11Var) {
        this.a = im51Var;
        this.b = dVar;
        this.c = ddf0Var;
        this.d = xv11Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0185, code lost:
    
        if (b(r11, r2, r12, r0) == r1) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(adf0 adf0Var, kff0 kff0Var, ContinuationImpl continuationImpl) {
        ProfileActionInteractor$handleAction$1 profileActionInteractor$handleAction$1;
        int i;
        pcf0 pcf0Var;
        ProfileContext profileContext;
        if (continuationImpl instanceof ProfileActionInteractor$handleAction$1) {
            profileActionInteractor$handleAction$1 = (ProfileActionInteractor$handleAction$1) continuationImpl;
            int i2 = profileActionInteractor$handleAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                profileActionInteractor$handleAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = profileActionInteractor$handleAction$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = profileActionInteractor$handleAction$1.label;
                ddf0 ddf0Var = this.c;
                if (i == 0) {
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            adf0Var = (adf0) profileActionInteractor$handleAction$1.L$0;
                            kotlin.b.b(obj);
                        } else if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                kotlin.b.b(obj);
                if (jl40.l(adf0Var, ncf0.a)) {
                    kff0Var.close();
                } else if (jl40.l(adf0Var, rcf0.a)) {
                    u8w u8wVar = ddf0Var.c;
                    u8wVar.getClass();
                    u8wVar.a.a("profile.logout", new HashMap(), 1, new HashMap());
                    kff0Var.h();
                } else if (jl40.l(adf0Var, ocf0.a)) {
                    kff0Var.a();
                } else if (jl40.l(adf0Var, qcf0.a)) {
                    this.a.getClass();
                    kff0Var.d();
                } else if (jl40.l(adf0Var, scf0.a)) {
                    u8w u8wVar2 = ddf0Var.c;
                    u8wVar2.getClass();
                    u8wVar2.a.a("profile.auth", new HashMap(), 1, new HashMap());
                    kff0Var.b();
                } else if (jl40.l(adf0Var, tcf0.a)) {
                    u8w u8wVar3 = ddf0Var.c;
                    u8wVar3.getClass();
                    u8wVar3.a.a("profile.email", new HashMap(), 1, new HashMap());
                    kff0Var.i();
                } else if (jl40.l(adf0Var, vcf0.a)) {
                    kff0Var.g();
                } else {
                    if (!jl40.l(adf0Var, wcf0.a)) {
                        if (jl40.l(adf0Var, xcf0.a)) {
                            profileActionInteractor$handleAction$1.L$0 = null;
                            profileActionInteractor$handleAction$1.L$1 = null;
                            profileActionInteractor$handleAction$1.label = 2;
                            Object b = this.b.b(profileActionInteractor$handleAction$1);
                            if (b != obj2) {
                                return b;
                            }
                        } else if (adf0Var instanceof ucf0) {
                            kff0Var.openUrl(((ucf0) adf0Var).a);
                        } else if (adf0Var instanceof ycf0) {
                            boolean z = ((ycf0) adf0Var).a;
                            if (z) {
                                kff0Var.e();
                            } else {
                                if (z) {
                                    w511.b();
                                    return null;
                                }
                                kff0Var.c();
                            }
                        } else if (adf0Var instanceof pcf0) {
                            pcf0 pcf0Var2 = (pcf0) adf0Var;
                            ProfileContext profileContext2 = pcf0Var2.a;
                            jff0 jff0Var = pcf0Var2.b;
                            profileActionInteractor$handleAction$1.L$0 = adf0Var;
                            profileActionInteractor$handleAction$1.L$1 = null;
                            profileActionInteractor$handleAction$1.label = 3;
                        } else {
                            if (!(adf0Var instanceof zcf0)) {
                                w511.b();
                                return null;
                            }
                            profileActionInteractor$handleAction$1.L$0 = null;
                            profileActionInteractor$handleAction$1.L$1 = null;
                            profileActionInteractor$handleAction$1.label = 4;
                            Object e = ((c) this.d).e(profileActionInteractor$handleAction$1);
                            if (e != obj2) {
                                return e;
                            }
                        }
                        return obj2;
                    }
                    cdf0 a = ddf0Var.a();
                    jj10 jj10Var = ddf0Var.d;
                    String str = a.a;
                    Boolean valueOf = Boolean.valueOf(a.b);
                    Boolean valueOf2 = Boolean.valueOf(a.c);
                    jj10Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("rating", str);
                    hashMap.put("photo_flg", valueOf);
                    jj10Var.a.a("Menu.Profile.RatingTapped", hashMap, 1, g8e.v(hashMap, "user_name_flg", valueOf2));
                    kff0Var.f();
                }
                return zy11.a;
                pcf0Var = (pcf0) adf0Var;
                profileContext = pcf0Var.a;
                if (!(pcf0Var.c instanceof pff0) && !this.f) {
                    if (profileContext != ProfileContext.DEEPLINK) {
                        ddf0Var.b(ProfileAnalyticsReporter$PreviousScreenIdentifier.DEEPLINK);
                    } else {
                        ddf0Var.b(ProfileAnalyticsReporter$PreviousScreenIdentifier.PROFILE_FRAGMENT);
                    }
                    this.f = true;
                }
                return zy11.a;
            }
        }
        profileActionInteractor$handleAction$1 = new ProfileActionInteractor$handleAction$1(this, continuationImpl);
        Object obj3 = profileActionInteractor$handleAction$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = profileActionInteractor$handleAction$1.label;
        ddf0 ddf0Var2 = this.c;
        if (i == 0) {
        }
        pcf0Var = (pcf0) adf0Var;
        profileContext = pcf0Var.a;
        if (!(pcf0Var.c instanceof pff0)) {
            if (profileContext != ProfileContext.DEEPLINK) {
            }
            this.f = true;
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(kff0 kff0Var, ProfileContext profileContext, jff0 jff0Var, ContinuationImpl continuationImpl) {
        ProfileActionInteractor$handleName$1 profileActionInteractor$handleName$1;
        int i;
        if (continuationImpl instanceof ProfileActionInteractor$handleName$1) {
            profileActionInteractor$handleName$1 = (ProfileActionInteractor$handleName$1) continuationImpl;
            int i2 = profileActionInteractor$handleName$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                profileActionInteractor$handleName$1.label = i2 - Integer.MIN_VALUE;
                Object obj = profileActionInteractor$handleName$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = profileActionInteractor$handleName$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if ((jff0Var instanceof iff0) || this.e) {
                        return zy11Var;
                    }
                    if (profileContext == ProfileContext.DEEPLINK) {
                        boolean z = jff0Var instanceof gff0;
                        ddf0 ddf0Var = this.c;
                        if (z) {
                            ps21 ps21Var = ddf0Var.e;
                            ps21Var.getClass();
                            ps21Var.a.a("UserRating.Deeplink.UserRatingDidShow", new HashMap(), 1, new HashMap());
                        } else {
                            ps21 ps21Var2 = ddf0Var.e;
                            ps21Var2.getClass();
                            ps21Var2.a.a("UserRating.Deeplink.UserRatingNeedNameDidShow", new HashMap(), 1, new HashMap());
                            adf0 ycf0Var = new ycf0(false);
                            profileActionInteractor$handleName$1.L$0 = null;
                            profileActionInteractor$handleName$1.L$1 = null;
                            profileActionInteractor$handleName$1.L$2 = null;
                            profileActionInteractor$handleName$1.label = 1;
                            if (a(ycf0Var, kff0Var, profileActionInteractor$handleName$1) == obj2) {
                                return obj2;
                            }
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                this.e = true;
                return zy11Var;
            }
        }
        profileActionInteractor$handleName$1 = new ProfileActionInteractor$handleName$1(this, continuationImpl);
        Object obj3 = profileActionInteractor$handleName$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = profileActionInteractor$handleName$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        this.e = true;
        return zy11Var2;
    }
}
