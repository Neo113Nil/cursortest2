package com.yandex.payment.divkit.common;

import com.yandex.xplat.payment.sdk.DivCardForAnalytics;
import defpackage.a5j0;
import defpackage.fse;
import defpackage.gtq0;
import defpackage.iho;
import defpackage.kvo;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.omk;
import defpackage.qv90;
import defpackage.rwo;
import defpackage.sjh;
import defpackage.sv90;
import defpackage.tje;
import defpackage.tls;
import defpackage.tmk;
import defpackage.u2l;
import defpackage.uyj;
import defpackage.y22;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final com.yandex.payment.divkit.repository.a a;
    public final rwo b;
    public final fse c;

    public a(com.yandex.payment.divkit.repository.a aVar, rwo rwoVar) {
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        this.a = aVar;
        this.b = rwoVar;
        this.c = mdhVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(1:17))(3:45|(1:47)|32)|18|19|20|21))|48|6|7|(0)(0)|18|19|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b4, code lost:
    
        r5 = defpackage.qv90.a;
        r2 = r2.a;
        r10 = com.yandex.xplat.payment.sdk.DivCardJson.PRIMARY;
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c7, code lost:
    
        switch(defpackage.rv90.b[r2.ordinal()]) {
            case 1: goto L38;
            case 2: goto L37;
            case 3: goto L36;
            case 4: goto L35;
            case 5: goto L34;
            case 6: goto L33;
            case 7: goto L32;
            case 8: goto L31;
            case 9: goto L30;
            case 10: goto L29;
            case 11: goto L28;
            default: goto L27;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ca, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ec, code lost:
    
        r5 = ("Рендер карточки DivKit " + r5 + ", div_card_json = " + r10).concat(", произошёл откат к предустановленной карточке: fallback_to_predefined = ");
        r13 = new defpackage.wj00(0);
        r13.k("div_card_json", r10.toString());
        r13.k("div_card", r2.getValue());
        r13.k("fallback_to_predefined", "");
        r13.k(ru.yandex.video.m3.player.utils.DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, r5);
        r2 = defpackage.y891.c("div_card_rendered", r13);
        r5 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0134, code lost:
    
        if (r5 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0136, code lost:
    
        r5 = r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x013a, code lost:
    
        ((defpackage.y22) r8).a(defpackage.iho.b(r2, r5, 2));
        r6.L$0 = r3;
        r6.L$1 = null;
        r6.L$2 = null;
        r6.L$3 = null;
        r6.L$4 = r4;
        r6.L$5 = null;
        r6.L$6 = null;
        r6.I$0 = 0;
        r6.label = 2;
        r0 = r1.invoke(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0159, code lost:
    
        if (r0 != r7) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x015c, code lost:
    
        r2 = r3;
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cc, code lost:
    
        r5 = "на экране iPayment";
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cf, code lost:
    
        r5 = "на экране результата";
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d2, code lost:
    
        r5 = "на экране выбора метода";
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:
    
        r5 = "на экране привязки карты";
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d8, code lost:
    
        r5 = "на экране СБП Челленджера";
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00db, code lost:
    
        r5 = "в поле поиска банка";
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00de, code lost:
    
        r5 = "на экране лицензии СБП";
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e1, code lost:
    
        r5 = "на экране выхода";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e4, code lost:
    
        r5 = "на экране выбора банка";
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e7, code lost:
    
        r5 = "на экране ввода CVV";
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ea, code lost:
    
        r5 = "на экране выбора способа оплаты";
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(u2l u2lVar, a5j0 a5j0Var, tls tlsVar, ContinuationImpl continuationImpl) {
        LoadUseCase$loadOrGetPredefine$1 loadUseCase$loadOrGetPredefine$1;
        int i;
        u2l u2lVar2;
        tls tlsVar2;
        a5j0 a5j0Var2 = a5j0Var;
        if (continuationImpl instanceof LoadUseCase$loadOrGetPredefine$1) {
            loadUseCase$loadOrGetPredefine$1 = (LoadUseCase$loadOrGetPredefine$1) continuationImpl;
            int i2 = loadUseCase$loadOrGetPredefine$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loadUseCase$loadOrGetPredefine$1.label = i2 - Integer.MIN_VALUE;
                LoadUseCase$loadOrGetPredefine$1 loadUseCase$loadOrGetPredefine$12 = loadUseCase$loadOrGetPredefine$1;
                Object obj = loadUseCase$loadOrGetPredefine$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = loadUseCase$loadOrGetPredefine$12.label;
                rwo rwoVar = this.b;
                if (i != 0) {
                    b.b(obj);
                    sv90 sv90Var = qv90.a;
                    DivCardForAnalytics divCardForAnalytics = a5j0Var2.a;
                    sv90Var.getClass();
                    iho f0 = sv90.f0(divCardForAnalytics);
                    ((y22) rwoVar).a(f0);
                    LoadUseCase$loadOrGetPredefine$2 loadUseCase$loadOrGetPredefine$2 = new LoadUseCase$loadOrGetPredefine$2(this, a5j0Var2, f0, tlsVar, null);
                    loadUseCase$loadOrGetPredefine$12.L$0 = u2lVar;
                    loadUseCase$loadOrGetPredefine$12.L$1 = a5j0Var2;
                    loadUseCase$loadOrGetPredefine$12.L$2 = tlsVar;
                    loadUseCase$loadOrGetPredefine$12.L$3 = null;
                    loadUseCase$loadOrGetPredefine$12.label = 1;
                    Object k0 = tje.k0(this.c, loadUseCase$loadOrGetPredefine$2, loadUseCase$loadOrGetPredefine$12);
                    if (k0 != coroutineSingletons) {
                        u2lVar2 = u2lVar;
                        obj = k0;
                        tlsVar2 = tlsVar;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tmk tmkVar = (tmk) loadUseCase$loadOrGetPredefine$12.L$4;
                    u2l u2lVar3 = (u2l) loadUseCase$loadOrGetPredefine$12.L$0;
                    b.b(obj);
                    u2lVar3.e(((tmk) obj).a);
                    kvo kvoVar = omk.i;
                    return gtq0.n(u2lVar3, tmkVar.b);
                }
                tlsVar2 = (tls) loadUseCase$loadOrGetPredefine$12.L$2;
                a5j0Var2 = (a5j0) loadUseCase$loadOrGetPredefine$12.L$1;
                u2lVar2 = (u2l) loadUseCase$loadOrGetPredefine$12.L$0;
                b.b(obj);
                tmk tmkVar2 = (tmk) obj;
                u2lVar2.e(tmkVar2.a);
                kvo kvoVar2 = omk.i;
                return gtq0.n(u2lVar2, tmkVar2.b);
            }
        }
        loadUseCase$loadOrGetPredefine$1 = new LoadUseCase$loadOrGetPredefine$1(this, continuationImpl);
        LoadUseCase$loadOrGetPredefine$1 loadUseCase$loadOrGetPredefine$122 = loadUseCase$loadOrGetPredefine$1;
        Object obj2 = loadUseCase$loadOrGetPredefine$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loadUseCase$loadOrGetPredefine$122.label;
        rwo rwoVar2 = this.b;
        if (i != 0) {
        }
        tmk tmkVar22 = (tmk) obj2;
        u2lVar2.e(tmkVar22.a);
        kvo kvoVar22 = omk.i;
        return gtq0.n(u2lVar2, tmkVar22.b);
    }
}
