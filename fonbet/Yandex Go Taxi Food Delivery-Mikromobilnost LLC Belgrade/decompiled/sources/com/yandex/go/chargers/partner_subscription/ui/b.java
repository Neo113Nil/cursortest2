package com.yandex.go.chargers.partner_subscription.ui;

import com.yandex.go.chargers.partner_subscription.data.ChargersPartnerSubscriptionInfoResponse;
import com.yandex.go.chargers.partner_subscription.data.LoyaltyTermsLink;
import com.yandex.go.chargers.partner_subscription.data.LoyaltyTermsLink$LoyaltyTermsLinkAction$OpenUrl;
import com.yandex.go.chargers.partner_subscription.data.e;
import com.yandex.go.chargers.partner_subscription.data.f;
import com.yandex.go.chargers.partner_subscription.data.n;
import defpackage.iea;
import defpackage.jea;
import defpackage.mea;
import defpackage.ny61;
import defpackage.sea;
import defpackage.tcc;
import defpackage.tea;
import defpackage.uea;
import defpackage.vea;
import defpackage.w511;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class b {
    public final c a;

    public b(c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ChargersPartnerSubscriptionInfoResponse.Button button, ContinuationImpl continuationImpl) {
        ChargersPartnerSubscriptionInfoUiStateMapper$mapToButtonUiState$1 chargersPartnerSubscriptionInfoUiStateMapper$mapToButtonUiState$1;
        int i;
        f fVar;
        mea meaVar;
        if (continuationImpl instanceof ChargersPartnerSubscriptionInfoUiStateMapper$mapToButtonUiState$1) {
            chargersPartnerSubscriptionInfoUiStateMapper$mapToButtonUiState$1 = (ChargersPartnerSubscriptionInfoUiStateMapper$mapToButtonUiState$1) continuationImpl;
            int i2 = chargersPartnerSubscriptionInfoUiStateMapper$mapToButtonUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPartnerSubscriptionInfoUiStateMapper$mapToButtonUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPartnerSubscriptionInfoUiStateMapper$mapToButtonUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPartnerSubscriptionInfoUiStateMapper$mapToButtonUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = button.a;
                    chargersPartnerSubscriptionInfoUiStateMapper$mapToButtonUiState$1.L$0 = button;
                    chargersPartnerSubscriptionInfoUiStateMapper$mapToButtonUiState$1.label = 1;
                    obj = c.i(this.a, formattedText, null, chargersPartnerSubscriptionInfoUiStateMapper$mapToButtonUiState$1, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    button = (ChargersPartnerSubscriptionInfoResponse.Button) chargersPartnerSubscriptionInfoUiStateMapper$mapToButtonUiState$1.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence = (CharSequence) obj;
                fVar = button.b;
                if (!(fVar instanceof com.yandex.go.chargers.partner_subscription.data.b)) {
                    meaVar = iea.a;
                } else {
                    if (!(fVar instanceof e)) {
                        w511.b();
                        return null;
                    }
                    meaVar = jea.a;
                }
                return new sea(charSequence, meaVar);
            }
        }
        chargersPartnerSubscriptionInfoUiStateMapper$mapToButtonUiState$1 = new ChargersPartnerSubscriptionInfoUiStateMapper$mapToButtonUiState$1(this, continuationImpl);
        Object obj2 = chargersPartnerSubscriptionInfoUiStateMapper$mapToButtonUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPartnerSubscriptionInfoUiStateMapper$mapToButtonUiState$1.label;
        if (i != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        fVar = button.b;
        if (!(fVar instanceof com.yandex.go.chargers.partner_subscription.data.b)) {
        }
        return new sea(charSequence2, meaVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bc, code lost:
    
        if (r14 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x013c -> B:20:0x0142). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ChargersPartnerSubscriptionInfoResponse chargersPartnerSubscriptionInfoResponse, ContinuationImpl continuationImpl) {
        ChargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1 chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1;
        Object obj;
        int i;
        Object d;
        CharSequence charSequence;
        FormattedText formattedText;
        CharSequence charSequence2;
        List list;
        CharSequence charSequence3;
        ChargersPartnerSubscriptionInfoResponse chargersPartnerSubscriptionInfoResponse2;
        List list2;
        ChargersPartnerSubscriptionInfoResponse chargersPartnerSubscriptionInfoResponse3;
        Collection arrayList;
        Iterator it;
        List list3;
        CharSequence charSequence4;
        List list4;
        CharSequence charSequence5;
        if (continuationImpl instanceof ChargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1) {
            chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1 = (ChargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1) continuationImpl;
            int i2 = chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.label;
                c cVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    FormattedText formattedText2 = chargersPartnerSubscriptionInfoResponse.a;
                    chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$0 = chargersPartnerSubscriptionInfoResponse;
                    chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.label = 1;
                    obj2 = c.i(cVar, formattedText2, null, chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1, 30);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            CharSequence charSequence6 = (CharSequence) chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$1;
                            ChargersPartnerSubscriptionInfoResponse chargersPartnerSubscriptionInfoResponse4 = (ChargersPartnerSubscriptionInfoResponse) chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$0;
                            kotlin.b.b(obj2);
                            charSequence = charSequence6;
                            chargersPartnerSubscriptionInfoResponse = chargersPartnerSubscriptionInfoResponse4;
                            List list5 = (List) obj2;
                            formattedText = chargersPartnerSubscriptionInfoResponse.c;
                            if (formattedText != null) {
                                charSequence2 = charSequence;
                                list = list5;
                                charSequence3 = null;
                                List list6 = chargersPartnerSubscriptionInfoResponse.d;
                                chargersPartnerSubscriptionInfoResponse3 = chargersPartnerSubscriptionInfoResponse;
                                arrayList = new ArrayList(tcc.n(list6, 10));
                                it = list6.iterator();
                                if (it.hasNext()) {
                                }
                                return obj;
                            }
                            chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$0 = chargersPartnerSubscriptionInfoResponse;
                            chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$1 = null;
                            chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$2 = charSequence;
                            chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$3 = list5;
                            chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.label = 3;
                            Object i3 = c.i(cVar, formattedText, null, chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1, 30);
                            if (i3 != obj) {
                                chargersPartnerSubscriptionInfoResponse2 = chargersPartnerSubscriptionInfoResponse;
                                list2 = list5;
                                obj2 = i3;
                                charSequence3 = (CharSequence) obj2;
                                CharSequence charSequence7 = charSequence;
                                list = list2;
                                chargersPartnerSubscriptionInfoResponse = chargersPartnerSubscriptionInfoResponse2;
                                charSequence2 = charSequence7;
                                List list62 = chargersPartnerSubscriptionInfoResponse.d;
                                chargersPartnerSubscriptionInfoResponse3 = chargersPartnerSubscriptionInfoResponse;
                                arrayList = new ArrayList(tcc.n(list62, 10));
                                it = list62.iterator();
                                if (it.hasNext()) {
                                }
                            }
                            return obj;
                        }
                        if (i == 3) {
                            list2 = (List) chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$3;
                            charSequence = (CharSequence) chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$2;
                            chargersPartnerSubscriptionInfoResponse2 = (ChargersPartnerSubscriptionInfoResponse) chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$0;
                            kotlin.b.b(obj2);
                            charSequence3 = (CharSequence) obj2;
                            CharSequence charSequence72 = charSequence;
                            list = list2;
                            chargersPartnerSubscriptionInfoResponse = chargersPartnerSubscriptionInfoResponse2;
                            charSequence2 = charSequence72;
                            List list622 = chargersPartnerSubscriptionInfoResponse.d;
                            chargersPartnerSubscriptionInfoResponse3 = chargersPartnerSubscriptionInfoResponse;
                            arrayList = new ArrayList(tcc.n(list622, 10));
                            it = list622.iterator();
                            if (it.hasNext()) {
                            }
                            return obj;
                        }
                        if (i != 4) {
                            if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            List list7 = (List) chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$4;
                            CharSequence charSequence8 = (CharSequence) chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$3;
                            List list8 = (List) chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$2;
                            CharSequence charSequence9 = (CharSequence) chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$1;
                            kotlin.b.b(obj2);
                            list3 = list7;
                            charSequence4 = charSequence8;
                            list4 = list8;
                            charSequence5 = charSequence9;
                            return new vea(charSequence5, list4, charSequence4, list3, (uea) obj2);
                        }
                        arrayList = (Collection) chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$10;
                        CharSequence charSequence10 = (CharSequence) chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$9;
                        List list9 = (List) chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$8;
                        CharSequence charSequence11 = (CharSequence) chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$7;
                        it = (Iterator) chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$4;
                        Collection collection = (Collection) chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$3;
                        chargersPartnerSubscriptionInfoResponse3 = (ChargersPartnerSubscriptionInfoResponse) chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$0;
                        kotlin.b.b(obj2);
                        arrayList.add((sea) obj2);
                        charSequence3 = charSequence10;
                        list = list9;
                        charSequence2 = charSequence11;
                        arrayList = collection;
                        if (it.hasNext()) {
                            ChargersPartnerSubscriptionInfoResponse.Button button = (ChargersPartnerSubscriptionInfoResponse.Button) it.next();
                            chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$0 = chargersPartnerSubscriptionInfoResponse3;
                            chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$1 = null;
                            chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$2 = null;
                            chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$3 = arrayList;
                            chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$4 = it;
                            chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$5 = null;
                            chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$6 = null;
                            chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$7 = charSequence2;
                            chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$8 = list;
                            chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$9 = charSequence3;
                            chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$10 = arrayList;
                            chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.label = 4;
                            Object a = a(button, chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1);
                            if (a != obj) {
                                List list10 = list;
                                charSequence10 = charSequence3;
                                obj2 = a;
                                charSequence11 = charSequence2;
                                list9 = list10;
                                collection = arrayList;
                                arrayList.add((sea) obj2);
                                charSequence3 = charSequence10;
                                list = list9;
                                charSequence2 = charSequence11;
                                arrayList = collection;
                                if (it.hasNext()) {
                                    List list11 = (List) arrayList;
                                    LoyaltyTermsLink loyaltyTermsLink = chargersPartnerSubscriptionInfoResponse3.e;
                                    chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$0 = null;
                                    chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$1 = charSequence2;
                                    chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$2 = list;
                                    chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$3 = charSequence3;
                                    chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$4 = list11;
                                    chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$5 = null;
                                    chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$6 = null;
                                    chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$7 = null;
                                    chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$8 = null;
                                    chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$9 = null;
                                    chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$10 = null;
                                    chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.label = 5;
                                    Object c = c(loyaltyTermsLink, chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1);
                                    if (c != obj) {
                                        list3 = list11;
                                        charSequence4 = charSequence3;
                                        list4 = list;
                                        charSequence5 = charSequence2;
                                        obj2 = c;
                                        return new vea(charSequence5, list4, charSequence4, list3, (uea) obj2);
                                    }
                                }
                            }
                        }
                        return obj;
                    }
                    chargersPartnerSubscriptionInfoResponse = (ChargersPartnerSubscriptionInfoResponse) chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$0;
                    kotlin.b.b(obj2);
                }
                CharSequence charSequence12 = (CharSequence) obj2;
                List list12 = chargersPartnerSubscriptionInfoResponse.b;
                chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$0 = chargersPartnerSubscriptionInfoResponse;
                chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$1 = charSequence12;
                chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.label = 2;
                d = d(list12, chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1);
                if (d != obj) {
                    charSequence = charSequence12;
                    obj2 = d;
                    List list52 = (List) obj2;
                    formattedText = chargersPartnerSubscriptionInfoResponse.c;
                    if (formattedText != null) {
                    }
                }
                return obj;
            }
        }
        chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1 = new ChargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1(this, continuationImpl);
        Object obj22 = chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.label;
        c cVar2 = this.a;
        if (i != 0) {
        }
        CharSequence charSequence122 = (CharSequence) obj22;
        List list122 = chargersPartnerSubscriptionInfoResponse.b;
        chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$0 = chargersPartnerSubscriptionInfoResponse;
        chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.L$1 = charSequence122;
        chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1.label = 2;
        d = d(list122, chargersPartnerSubscriptionInfoUiStateMapper$mapToSuccessUiState$1);
        if (d != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(LoyaltyTermsLink loyaltyTermsLink, ContinuationImpl continuationImpl) {
        ChargersPartnerSubscriptionInfoUiStateMapper$mapToTermsLink$1 chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsLink$1;
        int i;
        LoyaltyTermsLink$LoyaltyTermsLinkAction$OpenUrl loyaltyTermsLink$LoyaltyTermsLinkAction$OpenUrl;
        if (continuationImpl instanceof ChargersPartnerSubscriptionInfoUiStateMapper$mapToTermsLink$1) {
            chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsLink$1 = (ChargersPartnerSubscriptionInfoUiStateMapper$mapToTermsLink$1) continuationImpl;
            int i2 = chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsLink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsLink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsLink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsLink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (loyaltyTermsLink != null) {
                        n nVar = loyaltyTermsLink.b;
                        LoyaltyTermsLink$LoyaltyTermsLinkAction$OpenUrl loyaltyTermsLink$LoyaltyTermsLinkAction$OpenUrl2 = nVar instanceof LoyaltyTermsLink$LoyaltyTermsLinkAction$OpenUrl ? (LoyaltyTermsLink$LoyaltyTermsLinkAction$OpenUrl) nVar : null;
                        if (loyaltyTermsLink$LoyaltyTermsLinkAction$OpenUrl2 != null) {
                            FormattedText formattedText = loyaltyTermsLink.a;
                            chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsLink$1.L$0 = null;
                            chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsLink$1.L$1 = loyaltyTermsLink$LoyaltyTermsLinkAction$OpenUrl2;
                            chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsLink$1.label = 1;
                            Object i3 = c.i(this.a, formattedText, null, chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsLink$1, 30);
                            if (i3 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            LoyaltyTermsLink$LoyaltyTermsLinkAction$OpenUrl loyaltyTermsLink$LoyaltyTermsLinkAction$OpenUrl3 = loyaltyTermsLink$LoyaltyTermsLinkAction$OpenUrl2;
                            obj = i3;
                            loyaltyTermsLink$LoyaltyTermsLinkAction$OpenUrl = loyaltyTermsLink$LoyaltyTermsLinkAction$OpenUrl3;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                loyaltyTermsLink$LoyaltyTermsLinkAction$OpenUrl = (LoyaltyTermsLink$LoyaltyTermsLinkAction$OpenUrl) chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsLink$1.L$1;
                kotlin.b.b(obj);
                return new uea((CharSequence) obj, loyaltyTermsLink$LoyaltyTermsLinkAction$OpenUrl.a);
            }
        }
        chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsLink$1 = new ChargersPartnerSubscriptionInfoUiStateMapper$mapToTermsLink$1(this, continuationImpl);
        Object obj2 = chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsLink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsLink$1.label;
        if (i != 0) {
        }
        return new uea((CharSequence) obj2, loyaltyTermsLink$LoyaltyTermsLinkAction$OpenUrl.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0093 -> B:10:0x0094). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(List list, ContinuationImpl continuationImpl) {
        ChargersPartnerSubscriptionInfoUiStateMapper$mapToTermsUiState$1 chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsUiState$1;
        int i;
        Iterator it;
        Collection collection;
        if (continuationImpl instanceof ChargersPartnerSubscriptionInfoUiStateMapper$mapToTermsUiState$1) {
            chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsUiState$1 = (ChargersPartnerSubscriptionInfoUiStateMapper$mapToTermsUiState$1) continuationImpl;
            int i2 = chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    it = list2.iterator();
                    collection = arrayList;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection = (Collection) chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsUiState$1.L$8;
                    String str = (String) chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsUiState$1.L$7;
                    it = (Iterator) chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsUiState$1.L$4;
                    Collection collection2 = (Collection) chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsUiState$1.L$3;
                    kotlin.b.b(obj);
                    collection.add(new tea((CharSequence) obj, str));
                    collection = collection2;
                    if (it.hasNext()) {
                        ChargersPartnerSubscriptionInfoResponse.Term term = (ChargersPartnerSubscriptionInfoResponse.Term) it.next();
                        str = term.a;
                        FormattedText formattedText = term.b;
                        chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsUiState$1.L$0 = null;
                        chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsUiState$1.L$1 = null;
                        chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsUiState$1.L$2 = null;
                        chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsUiState$1.L$3 = collection;
                        chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsUiState$1.L$4 = it;
                        chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsUiState$1.L$5 = null;
                        chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsUiState$1.L$6 = null;
                        chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsUiState$1.L$7 = str;
                        chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsUiState$1.L$8 = collection;
                        chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsUiState$1.label = 1;
                        obj = c.i(this.a, formattedText, null, chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsUiState$1, 30);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        collection2 = collection;
                        collection.add(new tea((CharSequence) obj, str));
                        collection = collection2;
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                }
            }
        }
        chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsUiState$1 = new ChargersPartnerSubscriptionInfoUiStateMapper$mapToTermsUiState$1(this, continuationImpl);
        Object obj2 = chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPartnerSubscriptionInfoUiStateMapper$mapToTermsUiState$1.label;
        if (i != 0) {
        }
    }
}
