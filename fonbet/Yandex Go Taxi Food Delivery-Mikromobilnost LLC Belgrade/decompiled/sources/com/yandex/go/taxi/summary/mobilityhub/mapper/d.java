package com.yandex.go.taxi.summary.mobilityhub.mapper;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableStringBuilder;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.DefaultOfferBodyDto$IconBodyDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.DefaultOfferBodyDto$TextBodyDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.DefaultOfferBodyDto$TransportRouteBodyDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.DefaultOfferHeaderDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.FilterStateDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubAnalyticsPayload;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubFilterDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubFooterDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubItemAction$DetailedTransportRoute;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubItemAction$DriveRedirect;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubItemAction$ScootersRedirect;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubItemAction$TaxiRedirect;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubItemDto$DefaultOfferItem;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubItemDto$SectionHeader;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubItemType;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubOnboardingDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.TrailingItemDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.TransportRouteSection;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.TransportRouteSeparator;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.s;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.t;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.x;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.y;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.ErrorButtonAction;
import defpackage.as60;
import defpackage.avj0;
import defpackage.b64;
import defpackage.bdc;
import defpackage.c611;
import defpackage.d9s;
import defpackage.evu0;
import defpackage.f4v;
import defpackage.fh4;
import defpackage.gwk0;
import defpackage.gzu;
import defpackage.h0v;
import defpackage.hst;
import defpackage.ief;
import defpackage.jl40;
import defpackage.jst;
import defpackage.k7x0;
import defpackage.kdc;
import defpackage.kyh0;
import defpackage.kzu;
import defpackage.l811;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.pex0;
import defpackage.q2h0;
import defpackage.qrq0;
import defpackage.qzu;
import defpackage.sls;
import defpackage.tcc;
import defpackage.ufu;
import defpackage.uzu;
import defpackage.w511;
import defpackage.x0v;
import defpackage.xby;
import defpackage.xdf;
import defpackage.xjf;
import defpackage.xng0;
import defpackage.xyu;
import defpackage.yfh;
import defpackage.yw01;
import defpackage.yxu;
import defpackage.z9o;
import defpackage.zrm;
import defpackage.zuj0;
import defpackage.zyu;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.utils.CustomImageSpan;

/* loaded from: classes14.dex */
public final class d {
    public final Context a;
    public final pdc b;
    public final k7x0 c;
    public final ru.yandex.taxi.widget.utils.e d;
    public final xdf e;
    public final ru.yandex.taxi.widget.c f;
    public final zuj0 g;

    public d(Context context, pdc pdcVar, k7x0 k7x0Var, ru.yandex.taxi.widget.utils.e eVar, xdf xdfVar, ru.yandex.taxi.widget.c cVar, zuj0 zuj0Var) {
        this.a = context;
        this.b = pdcVar;
        this.c = k7x0Var;
        this.d = eVar;
        this.e = xdfVar;
        this.f = cVar;
        this.g = zuj0Var;
    }

    public static qzu c(t tVar, List list) {
        Object obj;
        if (!(tVar instanceof HubItemAction$DetailedTransportRoute)) {
            if (tVar instanceof HubItemAction$TaxiRedirect) {
                return new kzu(((HubItemAction$TaxiRedirect) tVar).a);
            }
            if (tVar instanceof HubItemAction$DriveRedirect) {
                return new zyu(((HubItemAction$DriveRedirect) tVar).a);
            }
            if (tVar instanceof HubItemAction$ScootersRedirect) {
                return new gzu(((HubItemAction$ScootersRedirect) tVar).a);
            }
            if (jl40.l(tVar, s.INSTANCE)) {
                return null;
            }
            w511.b();
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((c611) obj).a, ((HubItemAction$DetailedTransportRoute) tVar).a)) {
                break;
            }
        }
        c611 c611Var = (c611) obj;
        if (c611Var != null) {
            return new xyu(c611Var);
        }
        xby.l(jst.e, "VerticalHub.UiStateMapping.Error", null, null, "Cannot find transport routes in cache", 6);
        return null;
    }

    public final Object a(FormattedText formattedText, ief iefVar, ContinuationImpl continuationImpl) {
        if (jl40.l(formattedText, FormattedText.c)) {
            return null;
        }
        if (iefVar != null) {
            formattedText = d9s.c(formattedText, this.e, gwk0.h(iefVar), true);
        }
        return ru.yandex.taxi.widget.c.i(this.f, formattedText, null, continuationImpl, 30);
    }

    public final z9o b(boolean z) {
        zrm zrmVar;
        zuj0 zuj0Var = this.g;
        if (z) {
            zrmVar = new zrm(10, ((avj0) zuj0Var).h(kyh0.hub_no_route_by_filter_button_title), ErrorButtonAction.EXPAND);
        } else {
            zrmVar = null;
        }
        return new z9o(((avj0) zuj0Var).h(kyh0.hub_no_route_by_filter_title), null, zrmVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(TrailingItemDto trailingItemDto, ContinuationImpl continuationImpl) {
        VerticalHubItemsUiStateMapper$mapButton$1 verticalHubItemsUiStateMapper$mapButton$1;
        int i;
        if (continuationImpl instanceof VerticalHubItemsUiStateMapper$mapButton$1) {
            verticalHubItemsUiStateMapper$mapButton$1 = (VerticalHubItemsUiStateMapper$mapButton$1) continuationImpl;
            int i2 = verticalHubItemsUiStateMapper$mapButton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubItemsUiStateMapper$mapButton$1.label = i2 - Integer.MIN_VALUE;
                Object obj = verticalHubItemsUiStateMapper$mapButton$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubItemsUiStateMapper$mapButton$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = trailingItemDto.a;
                    verticalHubItemsUiStateMapper$mapButton$1.L$0 = trailingItemDto;
                    verticalHubItemsUiStateMapper$mapButton$1.label = 1;
                    obj = ru.yandex.taxi.widget.c.i(this.f, formattedText, null, verticalHubItemsUiStateMapper$mapButton$1, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    trailingItemDto = (TrailingItemDto) verticalHubItemsUiStateMapper$mapButton$1.L$0;
                    kotlin.b.b(obj);
                }
                return new as60((CharSequence) obj, ((ufu) this.b).e(trailingItemDto.b), trailingItemDto.c);
            }
        }
        verticalHubItemsUiStateMapper$mapButton$1 = new VerticalHubItemsUiStateMapper$mapButton$1(this, continuationImpl);
        Object obj2 = verticalHubItemsUiStateMapper$mapButton$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubItemsUiStateMapper$mapButton$1.label;
        if (i != 0) {
        }
        return new as60((CharSequence) obj2, ((ufu) this.b).e(trailingItemDto.b), trailingItemDto.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009f, code lost:
    
        if (r13 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(DefaultOfferHeaderDto defaultOfferHeaderDto, ief iefVar, ContinuationImpl continuationImpl) {
        VerticalHubItemsUiStateMapper$mapDefaultOfferHeader$1 verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1;
        int i;
        CharSequence charSequence;
        DefaultOfferHeaderDto defaultOfferHeaderDto2;
        CharSequence charSequence2;
        Object a;
        CharSequence charSequence3;
        CharSequence charSequence4;
        ief iefVar2;
        Object a2;
        CharSequence charSequence5;
        DefaultOfferHeaderDto defaultOfferHeaderDto3;
        if (continuationImpl instanceof VerticalHubItemsUiStateMapper$mapDefaultOfferHeader$1) {
            verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1 = (VerticalHubItemsUiStateMapper$mapDefaultOfferHeader$1) continuationImpl;
            int i2 = verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.label = i2 - Integer.MIN_VALUE;
                Object obj = verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = defaultOfferHeaderDto.a;
                    verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$0 = defaultOfferHeaderDto;
                    verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$1 = iefVar;
                    verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.label = 1;
                    obj = a(formattedText, iefVar, verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            charSequence2 = (CharSequence) verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$3;
                            iefVar = (ief) verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$1;
                            defaultOfferHeaderDto2 = (DefaultOfferHeaderDto) verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$0;
                            kotlin.b.b(obj);
                            CharSequence charSequence6 = (CharSequence) obj;
                            FormattedText formattedText2 = defaultOfferHeaderDto2.c;
                            verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$0 = defaultOfferHeaderDto2;
                            verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$1 = iefVar;
                            verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$2 = null;
                            verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$3 = charSequence2;
                            verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$4 = charSequence6;
                            verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.label = 3;
                            a = a(formattedText2, iefVar, verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1);
                            if (a != obj2) {
                                ief iefVar3 = iefVar;
                                charSequence3 = charSequence2;
                                charSequence4 = charSequence6;
                                obj = a;
                                iefVar2 = iefVar3;
                                CharSequence charSequence7 = (CharSequence) obj;
                                FormattedText formattedText3 = defaultOfferHeaderDto2.d;
                                verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$0 = defaultOfferHeaderDto2;
                                verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$1 = null;
                                verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$2 = null;
                                verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$3 = charSequence3;
                                verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$4 = charSequence4;
                                verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$5 = charSequence7;
                                verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.label = 4;
                                a2 = a(formattedText3, iefVar2, verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1);
                                if (a2 != obj2) {
                                }
                            }
                            return obj2;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            CharSequence charSequence8 = (CharSequence) verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$5;
                            charSequence4 = (CharSequence) verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$4;
                            charSequence3 = (CharSequence) verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$3;
                            defaultOfferHeaderDto3 = (DefaultOfferHeaderDto) verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$0;
                            kotlin.b.b(obj);
                            charSequence5 = charSequence8;
                            return new yfh(charSequence3, charSequence4, charSequence5, (CharSequence) obj, defaultOfferHeaderDto3.e);
                        }
                        charSequence4 = (CharSequence) verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$4;
                        charSequence3 = (CharSequence) verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$3;
                        ief iefVar4 = (ief) verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$1;
                        DefaultOfferHeaderDto defaultOfferHeaderDto4 = (DefaultOfferHeaderDto) verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$0;
                        kotlin.b.b(obj);
                        iefVar2 = iefVar4;
                        defaultOfferHeaderDto2 = defaultOfferHeaderDto4;
                        CharSequence charSequence72 = (CharSequence) obj;
                        FormattedText formattedText32 = defaultOfferHeaderDto2.d;
                        verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$0 = defaultOfferHeaderDto2;
                        verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$1 = null;
                        verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$2 = null;
                        verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$3 = charSequence3;
                        verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$4 = charSequence4;
                        verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$5 = charSequence72;
                        verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.label = 4;
                        a2 = a(formattedText32, iefVar2, verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1);
                        if (a2 != obj2) {
                            charSequence5 = charSequence72;
                            defaultOfferHeaderDto3 = defaultOfferHeaderDto2;
                            obj = a2;
                            return new yfh(charSequence3, charSequence4, charSequence5, (CharSequence) obj, defaultOfferHeaderDto3.e);
                        }
                        return obj2;
                    }
                    iefVar = (ief) verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$1;
                    defaultOfferHeaderDto = (DefaultOfferHeaderDto) verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$0;
                    kotlin.b.b(obj);
                }
                charSequence = (CharSequence) obj;
                if (charSequence != null) {
                    return null;
                }
                FormattedText formattedText4 = defaultOfferHeaderDto.b;
                verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$0 = defaultOfferHeaderDto;
                verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$1 = iefVar;
                verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$2 = null;
                verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$3 = charSequence;
                verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.label = 2;
                Object a3 = a(formattedText4, iefVar, verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1);
                if (a3 != obj2) {
                    defaultOfferHeaderDto2 = defaultOfferHeaderDto;
                    charSequence2 = charSequence;
                    obj = a3;
                    CharSequence charSequence62 = (CharSequence) obj;
                    FormattedText formattedText22 = defaultOfferHeaderDto2.c;
                    verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$0 = defaultOfferHeaderDto2;
                    verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$1 = iefVar;
                    verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$2 = null;
                    verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$3 = charSequence2;
                    verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.L$4 = charSequence62;
                    verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.label = 3;
                    a = a(formattedText22, iefVar, verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1);
                    if (a != obj2) {
                    }
                }
                return obj2;
            }
        }
        verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1 = new VerticalHubItemsUiStateMapper$mapDefaultOfferHeader$1(this, continuationImpl);
        Object obj3 = verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubItemsUiStateMapper$mapDefaultOfferHeader$1.label;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj3;
        if (charSequence != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(HubItemDto$DefaultOfferItem hubItemDto$DefaultOfferItem, qrq0 qrq0Var, List list, HubAnalyticsPayload hubAnalyticsPayload, ief iefVar, String str, sls slsVar, ContinuationImpl continuationImpl) {
        VerticalHubItemsUiStateMapper$mapDefaultOfferItem$1 verticalHubItemsUiStateMapper$mapDefaultOfferItem$1;
        List list2;
        HubAnalyticsPayload hubAnalyticsPayload2;
        HubItemDto$DefaultOfferItem hubItemDto$DefaultOfferItem2;
        String str2;
        qrq0 qrq0Var2;
        Object obj;
        sls slsVar2;
        yfh yfhVar;
        List list3;
        String str3;
        yfh yfhVar2;
        Object obj2;
        String str4;
        List list4;
        sls slsVar3;
        HubAnalyticsPayload hubAnalyticsPayload3;
        String str5;
        yfh yfhVar3;
        String str6;
        String str7;
        String str8;
        String str9;
        sls slsVar4;
        HubAnalyticsPayload hubAnalyticsPayload4;
        HubItemDto$DefaultOfferItem hubItemDto$DefaultOfferItem3;
        yfh yfhVar4;
        List list5;
        TrailingItemDto trailingItemDto;
        String str10;
        HubAnalyticsPayload hubAnalyticsPayload5;
        HubItemDto$DefaultOfferItem hubItemDto$DefaultOfferItem4;
        l811 l811Var;
        yfh yfhVar5;
        List list6;
        as60 as60Var;
        yfh yfhVar6;
        List list7;
        sls slsVar5;
        String str11;
        HubAnalyticsPayload hubAnalyticsPayload6;
        List list8;
        CharSequence charSequence;
        TrailingItemDto trailingItemDto2;
        sls slsVar6;
        String str12;
        List list9;
        HubItemDto$DefaultOfferItem hubItemDto$DefaultOfferItem5;
        CharSequence charSequence2;
        HubAnalyticsPayload hubAnalyticsPayload7;
        ief iefVar2 = iefVar;
        if (continuationImpl instanceof VerticalHubItemsUiStateMapper$mapDefaultOfferItem$1) {
            verticalHubItemsUiStateMapper$mapDefaultOfferItem$1 = (VerticalHubItemsUiStateMapper$mapDefaultOfferItem$1) continuationImpl;
            int i = verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.label = i - Integer.MIN_VALUE;
                Object obj3 = verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.result;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                as60 as60Var2 = null;
                switch (verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.label) {
                    case 0:
                        kotlin.b.b(obj3);
                        DefaultOfferHeaderDto defaultOfferHeaderDto = hubItemDto$DefaultOfferItem.b;
                        verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$0 = hubItemDto$DefaultOfferItem;
                        verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$1 = qrq0Var;
                        list2 = list;
                        verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$2 = list2;
                        hubAnalyticsPayload2 = hubAnalyticsPayload;
                        verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$3 = hubAnalyticsPayload2;
                        verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$4 = iefVar2;
                        verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$5 = str;
                        verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$6 = slsVar;
                        verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.label = 1;
                        Object e = e(defaultOfferHeaderDto, iefVar2, verticalHubItemsUiStateMapper$mapDefaultOfferItem$1);
                        if (e != obj4) {
                            hubItemDto$DefaultOfferItem2 = hubItemDto$DefaultOfferItem;
                            str2 = str;
                            qrq0Var2 = qrq0Var;
                            obj = e;
                            slsVar2 = slsVar;
                            yfhVar = (yfh) obj;
                            if (yfhVar == null) {
                                com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.e eVar = hubItemDto$DefaultOfferItem2.c;
                                String str13 = hubItemDto$DefaultOfferItem2.a;
                                if (!(eVar instanceof DefaultOfferBodyDto$IconBodyDto)) {
                                    if (!(eVar instanceof DefaultOfferBodyDto$TransportRouteBodyDto)) {
                                        if (!(eVar instanceof DefaultOfferBodyDto$TextBodyDto)) {
                                            if (!jl40.l(eVar, com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.d.INSTANCE) && eVar != null) {
                                                w511.b();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } else {
                                            FormattedText formattedText = ((DefaultOfferBodyDto$TextBodyDto) eVar).a;
                                            verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$0 = hubItemDto$DefaultOfferItem2;
                                            verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$1 = null;
                                            verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$2 = list2;
                                            verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$3 = hubAnalyticsPayload2;
                                            verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$4 = null;
                                            verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$5 = str2;
                                            verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$6 = slsVar2;
                                            verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$7 = null;
                                            verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$8 = str13;
                                            verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$9 = yfhVar;
                                            verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.label = 5;
                                            Object a = a(formattedText, iefVar2, verticalHubItemsUiStateMapper$mapDefaultOfferItem$1);
                                            if (a != obj4) {
                                                list3 = list2;
                                                str3 = str2;
                                                yfhVar2 = yfhVar;
                                                obj2 = a;
                                                str4 = str13;
                                                charSequence = (CharSequence) obj2;
                                                trailingItemDto2 = ((DefaultOfferBodyDto$TextBodyDto) hubItemDto$DefaultOfferItem2.c).b;
                                                if (trailingItemDto2 != null) {
                                                    verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$0 = hubItemDto$DefaultOfferItem2;
                                                    verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$1 = null;
                                                    verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$2 = list3;
                                                    verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$3 = hubAnalyticsPayload2;
                                                    verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$4 = null;
                                                    verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$5 = str3;
                                                    verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$6 = slsVar2;
                                                    verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$7 = null;
                                                    verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$8 = null;
                                                    verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$9 = str4;
                                                    verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$10 = yfhVar2;
                                                    verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$11 = charSequence;
                                                    verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.label = 6;
                                                    Object d = d(trailingItemDto2, verticalHubItemsUiStateMapper$mapDefaultOfferItem$1);
                                                    if (d != obj4) {
                                                        slsVar6 = slsVar2;
                                                        str12 = str3;
                                                        list9 = list3;
                                                        hubItemDto$DefaultOfferItem5 = hubItemDto$DefaultOfferItem2;
                                                        obj3 = d;
                                                        charSequence2 = charSequence;
                                                        hubAnalyticsPayload7 = hubAnalyticsPayload2;
                                                        hubItemDto$DefaultOfferItem2 = hubItemDto$DefaultOfferItem5;
                                                        str3 = str12;
                                                        hubAnalyticsPayload2 = hubAnalyticsPayload7;
                                                        list3 = list9;
                                                        charSequence = charSequence2;
                                                        as60Var2 = (as60) obj3;
                                                        slsVar2 = slsVar6;
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                    } else {
                                        TransportRouteSeparator transportRouteSeparator = ((DefaultOfferBodyDto$TransportRouteBodyDto) eVar).b;
                                        String a2 = (transportRouteSeparator == null || (str8 = transportRouteSeparator.a) == null) ? null : ((m7x0) this.c).a(str8);
                                        List list10 = ((DefaultOfferBodyDto$TransportRouteBodyDto) hubItemDto$DefaultOfferItem2.c).a;
                                        verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$0 = hubItemDto$DefaultOfferItem2;
                                        verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$1 = null;
                                        verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$2 = list2;
                                        verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$3 = hubAnalyticsPayload2;
                                        verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$4 = null;
                                        verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$5 = str2;
                                        verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$6 = slsVar2;
                                        verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$7 = null;
                                        verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$8 = a2;
                                        verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$9 = str13;
                                        verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$10 = yfhVar;
                                        verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.label = 3;
                                        Object l = l(list10, verticalHubItemsUiStateMapper$mapDefaultOfferItem$1);
                                        if (l != obj4) {
                                            list4 = list2;
                                            slsVar3 = slsVar2;
                                            obj3 = l;
                                            hubAnalyticsPayload3 = hubAnalyticsPayload2;
                                            str5 = str2;
                                            yfhVar3 = yfhVar;
                                            str6 = a2;
                                            str7 = str13;
                                            List list11 = (List) obj3;
                                            if (str6 == null) {
                                                str6 = "";
                                            }
                                            l811 l811Var2 = new l811(str6, q2h0.ic_mt_separator);
                                            trailingItemDto = ((DefaultOfferBodyDto$TransportRouteBodyDto) hubItemDto$DefaultOfferItem2.c).c;
                                            if (trailingItemDto == null) {
                                                verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$0 = hubItemDto$DefaultOfferItem2;
                                                verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$1 = null;
                                                verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$2 = list4;
                                                verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$3 = hubAnalyticsPayload3;
                                                verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$4 = null;
                                                verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$5 = str5;
                                                verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$6 = slsVar3;
                                                verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$7 = null;
                                                verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$8 = null;
                                                verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$9 = null;
                                                verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$10 = str7;
                                                verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$11 = yfhVar3;
                                                verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$12 = list11;
                                                verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$13 = l811Var2;
                                                verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.label = 4;
                                                Object d2 = d(trailingItemDto, verticalHubItemsUiStateMapper$mapDefaultOfferItem$1);
                                                if (d2 != obj4) {
                                                    yfhVar6 = yfhVar3;
                                                    list7 = list11;
                                                    slsVar5 = slsVar3;
                                                    str11 = str5;
                                                    hubAnalyticsPayload6 = hubAnalyticsPayload3;
                                                    hubItemDto$DefaultOfferItem4 = hubItemDto$DefaultOfferItem2;
                                                    list8 = list4;
                                                    obj3 = d2;
                                                    l811Var = l811Var2;
                                                    list6 = list7;
                                                    yfhVar5 = yfhVar6;
                                                    as60Var = (as60) obj3;
                                                    str10 = str11;
                                                    hubAnalyticsPayload5 = hubAnalyticsPayload6;
                                                    list4 = list8;
                                                    slsVar3 = slsVar5;
                                                    break;
                                                }
                                            } else {
                                                str10 = str5;
                                                hubAnalyticsPayload5 = hubAnalyticsPayload3;
                                                hubItemDto$DefaultOfferItem4 = hubItemDto$DefaultOfferItem2;
                                                l811Var = l811Var2;
                                                yfhVar5 = yfhVar3;
                                                list6 = list11;
                                                as60Var = null;
                                            }
                                        }
                                    }
                                } else {
                                    verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$0 = hubItemDto$DefaultOfferItem2;
                                    verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$1 = null;
                                    verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$2 = list2;
                                    verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$3 = hubAnalyticsPayload2;
                                    verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$4 = null;
                                    verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$5 = str2;
                                    verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$6 = slsVar2;
                                    verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$7 = yfhVar;
                                    verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.label = 2;
                                    Object k = k((DefaultOfferBodyDto$IconBodyDto) eVar, str13, qrq0Var2, verticalHubItemsUiStateMapper$mapDefaultOfferItem$1);
                                    if (k != obj4) {
                                        str9 = str2;
                                        slsVar4 = slsVar2;
                                        hubAnalyticsPayload4 = hubAnalyticsPayload2;
                                        hubItemDto$DefaultOfferItem3 = hubItemDto$DefaultOfferItem2;
                                        obj3 = k;
                                        yfhVar4 = yfhVar;
                                        list5 = list2;
                                        String str14 = hubItemDto$DefaultOfferItem3.a;
                                        break;
                                    }
                                }
                            } else {
                                hst hstVar = jst.e;
                                hubItemDto$DefaultOfferItem2.getClass();
                                xby.l(hstVar, "VerticalHub.UiStateMapping.Error", null, null, "Empty default offer header " + HubItemType.DEFAULT_OFFER_ITEM, 6);
                                break;
                            }
                        }
                        break;
                    case 1:
                        sls slsVar7 = (sls) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$6;
                        String str15 = (String) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$5;
                        ief iefVar3 = (ief) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$4;
                        HubAnalyticsPayload hubAnalyticsPayload8 = (HubAnalyticsPayload) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$3;
                        List list12 = (List) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$2;
                        qrq0Var2 = (qrq0) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$1;
                        hubItemDto$DefaultOfferItem2 = (HubItemDto$DefaultOfferItem) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$0;
                        kotlin.b.b(obj3);
                        slsVar2 = slsVar7;
                        str2 = str15;
                        iefVar2 = iefVar3;
                        obj = obj3;
                        hubAnalyticsPayload2 = hubAnalyticsPayload8;
                        list2 = list12;
                        yfhVar = (yfh) obj;
                        if (yfhVar == null) {
                        }
                        break;
                    case 2:
                        yfhVar4 = (yfh) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$7;
                        slsVar4 = (sls) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$6;
                        str9 = (String) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$5;
                        hubAnalyticsPayload4 = (HubAnalyticsPayload) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$3;
                        list5 = (List) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$2;
                        hubItemDto$DefaultOfferItem3 = (HubItemDto$DefaultOfferItem) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$0;
                        kotlin.b.b(obj3);
                        String str142 = hubItemDto$DefaultOfferItem3.a;
                        break;
                    case 3:
                        yfhVar3 = (yfh) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$10;
                        str7 = (String) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$9;
                        str6 = (String) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$8;
                        slsVar3 = (sls) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$6;
                        str5 = (String) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$5;
                        hubAnalyticsPayload3 = (HubAnalyticsPayload) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$3;
                        List list13 = (List) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$2;
                        HubItemDto$DefaultOfferItem hubItemDto$DefaultOfferItem6 = (HubItemDto$DefaultOfferItem) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$0;
                        kotlin.b.b(obj3);
                        list4 = list13;
                        hubItemDto$DefaultOfferItem2 = hubItemDto$DefaultOfferItem6;
                        List list112 = (List) obj3;
                        if (str6 == null) {
                        }
                        l811 l811Var22 = new l811(str6, q2h0.ic_mt_separator);
                        trailingItemDto = ((DefaultOfferBodyDto$TransportRouteBodyDto) hubItemDto$DefaultOfferItem2.c).c;
                        if (trailingItemDto == null) {
                        }
                        break;
                    case 4:
                        l811Var = (l811) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$13;
                        list7 = (List) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$12;
                        yfhVar6 = (yfh) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$11;
                        slsVar5 = (sls) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$6;
                        str11 = (String) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$5;
                        hubAnalyticsPayload6 = (HubAnalyticsPayload) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$3;
                        list8 = (List) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$2;
                        hubItemDto$DefaultOfferItem4 = (HubItemDto$DefaultOfferItem) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$0;
                        kotlin.b.b(obj3);
                        list6 = list7;
                        yfhVar5 = yfhVar6;
                        as60Var = (as60) obj3;
                        str10 = str11;
                        hubAnalyticsPayload5 = hubAnalyticsPayload6;
                        list4 = list8;
                        slsVar3 = slsVar5;
                        break;
                    case 5:
                        yfhVar2 = (yfh) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$9;
                        str4 = (String) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$8;
                        sls slsVar8 = (sls) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$6;
                        str3 = (String) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$5;
                        hubAnalyticsPayload2 = (HubAnalyticsPayload) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$3;
                        list3 = (List) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$2;
                        hubItemDto$DefaultOfferItem2 = (HubItemDto$DefaultOfferItem) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$0;
                        kotlin.b.b(obj3);
                        obj2 = obj3;
                        slsVar2 = slsVar8;
                        charSequence = (CharSequence) obj2;
                        trailingItemDto2 = ((DefaultOfferBodyDto$TextBodyDto) hubItemDto$DefaultOfferItem2.c).b;
                        if (trailingItemDto2 != null) {
                        }
                        break;
                    case 6:
                        charSequence2 = (CharSequence) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$11;
                        yfhVar2 = (yfh) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$10;
                        slsVar6 = (sls) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$6;
                        str12 = (String) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$5;
                        hubAnalyticsPayload7 = (HubAnalyticsPayload) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$3;
                        list9 = (List) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$2;
                        hubItemDto$DefaultOfferItem5 = (HubItemDto$DefaultOfferItem) verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.L$0;
                        kotlin.b.b(obj3);
                        hubItemDto$DefaultOfferItem2 = hubItemDto$DefaultOfferItem5;
                        str3 = str12;
                        hubAnalyticsPayload2 = hubAnalyticsPayload7;
                        list3 = list9;
                        charSequence = charSequence2;
                        as60Var2 = (as60) obj3;
                        slsVar2 = slsVar6;
                        break;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
                return null;
            }
        }
        verticalHubItemsUiStateMapper$mapDefaultOfferItem$1 = new VerticalHubItemsUiStateMapper$mapDefaultOfferItem$1(this, continuationImpl);
        Object obj32 = verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.result;
        Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        as60 as60Var22 = null;
        switch (verticalHubItemsUiStateMapper$mapDefaultOfferItem$1.label) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, tfv] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [kdc] */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x012b -> B:10:0x0130). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x013f -> B:11:0x0138). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(HubFooterDto hubFooterDto, String str, ContinuationImpl continuationImpl) {
        VerticalHubItemsUiStateMapper$mapFilters$1 verticalHubItemsUiStateMapper$mapFilters$1;
        int i;
        String str2;
        ArrayList arrayList;
        Iterator it;
        List list;
        String str3;
        d dVar = this;
        if (continuationImpl instanceof VerticalHubItemsUiStateMapper$mapFilters$1) {
            verticalHubItemsUiStateMapper$mapFilters$1 = (VerticalHubItemsUiStateMapper$mapFilters$1) continuationImpl;
            int i2 = verticalHubItemsUiStateMapper$mapFilters$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubItemsUiStateMapper$mapFilters$1.label = i2 - Integer.MIN_VALUE;
                Object obj = verticalHubItemsUiStateMapper$mapFilters$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubItemsUiStateMapper$mapFilters$1.label;
                pdc pdcVar = dVar.b;
                if (i != 0) {
                    str2 = null;
                    kotlin.b.b(obj);
                    List list2 = hubFooterDto.b;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((HubFilterDto) it2.next()).a);
                    }
                    List list3 = hubFooterDto.b;
                    arrayList = new ArrayList(tcc.n(list3, 10));
                    it = list3.iterator();
                    list = arrayList2;
                    str3 = str;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r1 = (Collection) verticalHubItemsUiStateMapper$mapFilters$1.L$14;
                    String str4 = (String) verticalHubItemsUiStateMapper$mapFilters$1.L$13;
                    String str5 = (String) verticalHubItemsUiStateMapper$mapFilters$1.L$12;
                    kdc h = (kdc) verticalHubItemsUiStateMapper$mapFilters$1.L$11;
                    FilterStateDto filterStateDto = (FilterStateDto) verticalHubItemsUiStateMapper$mapFilters$1.L$9;
                    HubFilterDto hubFilterDto = (HubFilterDto) verticalHubItemsUiStateMapper$mapFilters$1.L$8;
                    it = (Iterator) verticalHubItemsUiStateMapper$mapFilters$1.L$6;
                    ?? r14 = (Collection) verticalHubItemsUiStateMapper$mapFilters$1.L$5;
                    list = (List) verticalHubItemsUiStateMapper$mapFilters$1.L$2;
                    String str6 = (String) verticalHubItemsUiStateMapper$mapFilters$1.L$1;
                    kotlin.b.b(obj);
                    ArrayList arrayList3 = r14;
                    String str7 = null;
                    ArrayList arrayList4 = r1;
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                    String str8 = str4;
                    arrayList = arrayList4;
                    str3 = str6;
                    String str9 = str7;
                    String str10 = str5;
                    kdc kdcVar = h;
                    List list4 = list;
                    String str11 = filterStateDto.b;
                    if (evu0.J(str11)) {
                        str11 = str9;
                    }
                    arrayList.add(new yxu(str8, str10, kdcVar, bitmapDrawable, str11 != null ? ((ufu) pdcVar).i(str11) : str9, ((ufu) pdcVar).a(new bdc(xng0.controlMinor), filterStateDto.c), hubFilterDto.g, list4));
                    arrayList = arrayList3;
                    str2 = str9;
                    list = list4;
                    dVar = this;
                    if (!it.hasNext()) {
                        hubFilterDto = (HubFilterDto) it.next();
                        boolean equals = evu0.J(str3) ? hubFilterDto.f : str3.equals(hubFilterDto.a);
                        FilterStateDto filterStateDto2 = hubFilterDto.e;
                        if (filterStateDto2 == null || !equals) {
                            filterStateDto2 = hubFilterDto.d;
                        }
                        filterStateDto = filterStateDto2;
                        String str12 = hubFilterDto.a;
                        str5 = hubFilterDto.b;
                        h = ((ufu) pdcVar).h(new bdc(xng0.textOnControlMinor), filterStateDto.a);
                        String str13 = hubFilterDto.c;
                        if (evu0.J(str13)) {
                            str13 = str2;
                        }
                        ?? r142 = str2;
                        if (str13 != null) {
                            verticalHubItemsUiStateMapper$mapFilters$1.L$0 = r142;
                            verticalHubItemsUiStateMapper$mapFilters$1.L$1 = str3;
                            verticalHubItemsUiStateMapper$mapFilters$1.L$2 = list;
                            verticalHubItemsUiStateMapper$mapFilters$1.L$3 = r142;
                            verticalHubItemsUiStateMapper$mapFilters$1.L$4 = r142;
                            verticalHubItemsUiStateMapper$mapFilters$1.L$5 = arrayList;
                            verticalHubItemsUiStateMapper$mapFilters$1.L$6 = it;
                            verticalHubItemsUiStateMapper$mapFilters$1.L$7 = r142;
                            verticalHubItemsUiStateMapper$mapFilters$1.L$8 = hubFilterDto;
                            verticalHubItemsUiStateMapper$mapFilters$1.L$9 = filterStateDto;
                            verticalHubItemsUiStateMapper$mapFilters$1.L$10 = r142;
                            verticalHubItemsUiStateMapper$mapFilters$1.L$11 = h;
                            verticalHubItemsUiStateMapper$mapFilters$1.L$12 = str5;
                            verticalHubItemsUiStateMapper$mapFilters$1.L$13 = str12;
                            verticalHubItemsUiStateMapper$mapFilters$1.L$14 = arrayList;
                            verticalHubItemsUiStateMapper$mapFilters$1.Z$0 = equals;
                            verticalHubItemsUiStateMapper$mapFilters$1.label = 1;
                            Object f = ru.yandex.taxi.widget.utils.e.f(dVar.d, str13, r142, verticalHubItemsUiStateMapper$mapFilters$1, 6);
                            if (f == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            str4 = str12;
                            str6 = str3;
                            ArrayList arrayList5 = arrayList;
                            obj = f;
                            arrayList3 = arrayList5;
                            arrayList4 = arrayList5;
                            str7 = r142;
                            BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj;
                            String str82 = str4;
                            arrayList = arrayList4;
                            str3 = str6;
                            String str92 = str7;
                            String str102 = str5;
                            kdc kdcVar2 = h;
                            List list42 = list;
                            String str112 = filterStateDto.b;
                            if (evu0.J(str112)) {
                            }
                            if (str112 != null) {
                            }
                            arrayList.add(new yxu(str82, str102, kdcVar2, bitmapDrawable2, str112 != null ? ((ufu) pdcVar).i(str112) : str92, ((ufu) pdcVar).a(new bdc(xng0.controlMinor), filterStateDto.c), hubFilterDto.g, list42));
                            arrayList = arrayList3;
                            str2 = str92;
                            list = list42;
                            dVar = this;
                            if (!it.hasNext()) {
                                return arrayList;
                            }
                        } else {
                            arrayList3 = arrayList;
                            str82 = str12;
                            bitmapDrawable2 = r142;
                            str92 = r142;
                            String str1022 = str5;
                            kdc kdcVar22 = h;
                            List list422 = list;
                            String str1122 = filterStateDto.b;
                            if (evu0.J(str1122)) {
                            }
                            if (str1122 != null) {
                            }
                            arrayList.add(new yxu(str82, str1022, kdcVar22, bitmapDrawable2, str1122 != null ? ((ufu) pdcVar).i(str1122) : str92, ((ufu) pdcVar).a(new bdc(xng0.controlMinor), filterStateDto.c), hubFilterDto.g, list422));
                            arrayList = arrayList3;
                            str2 = str92;
                            list = list422;
                            dVar = this;
                            if (!it.hasNext()) {
                            }
                        }
                    }
                }
            }
        }
        verticalHubItemsUiStateMapper$mapFilters$1 = new VerticalHubItemsUiStateMapper$mapFilters$1(dVar, continuationImpl);
        Object obj2 = verticalHubItemsUiStateMapper$mapFilters$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubItemsUiStateMapper$mapFilters$1.label;
        pdc pdcVar2 = dVar.b;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(HubItemDto$SectionHeader hubItemDto$SectionHeader, ContinuationImpl continuationImpl) {
        VerticalHubItemsUiStateMapper$mapHeaderUiState$1 verticalHubItemsUiStateMapper$mapHeaderUiState$1;
        int i;
        CharSequence charSequence;
        if (continuationImpl instanceof VerticalHubItemsUiStateMapper$mapHeaderUiState$1) {
            verticalHubItemsUiStateMapper$mapHeaderUiState$1 = (VerticalHubItemsUiStateMapper$mapHeaderUiState$1) continuationImpl;
            int i2 = verticalHubItemsUiStateMapper$mapHeaderUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubItemsUiStateMapper$mapHeaderUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = verticalHubItemsUiStateMapper$mapHeaderUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubItemsUiStateMapper$mapHeaderUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = hubItemDto$SectionHeader.a;
                    verticalHubItemsUiStateMapper$mapHeaderUiState$1.L$0 = null;
                    verticalHubItemsUiStateMapper$mapHeaderUiState$1.label = 1;
                    obj = ru.yandex.taxi.widget.c.i(this.f, formattedText, null, verticalHubItemsUiStateMapper$mapHeaderUiState$1, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                charSequence = (CharSequence) obj;
                if (charSequence.length() == 0) {
                    return new uzu(charSequence);
                }
                xby.l(jst.e, "VerticalHub.UiStateMapping.Error", null, null, "Empty section header", 6);
                return null;
            }
        }
        verticalHubItemsUiStateMapper$mapHeaderUiState$1 = new VerticalHubItemsUiStateMapper$mapHeaderUiState$1(this, continuationImpl);
        Object obj2 = verticalHubItemsUiStateMapper$mapHeaderUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubItemsUiStateMapper$mapHeaderUiState$1.label;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj2;
        if (charSequence.length() == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r14v10, types: [qrq0] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.yandex.go.taxi.summary.mobilityhub.mapper.d] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x014a -> B:11:0x0154). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x015f -> B:13:0x0160). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(List list, yw01 yw01Var, List list2, HubAnalyticsPayload hubAnalyticsPayload, ief iefVar, String str, ContinuationImpl continuationImpl) {
        VerticalHubItemsUiStateMapper$mapItemsUiState$1 verticalHubItemsUiStateMapper$mapItemsUiState$1;
        int i;
        ief iefVar2;
        String str2;
        Ref$IntRef ref$IntRef;
        VerticalHubItemsUiStateMapper$mapItemsUiState$1 verticalHubItemsUiStateMapper$mapItemsUiState$12;
        Iterator it;
        ArrayList arrayList;
        yw01 yw01Var2;
        List list3;
        HubAnalyticsPayload hubAnalyticsPayload2;
        h0v h0vVar;
        ?? r14;
        HubAnalyticsPayload hubAnalyticsPayload3;
        ?? r4;
        List list4;
        Iterator it2;
        ief iefVar3;
        Ref$IntRef ref$IntRef2;
        if (continuationImpl instanceof VerticalHubItemsUiStateMapper$mapItemsUiState$1) {
            verticalHubItemsUiStateMapper$mapItemsUiState$1 = (VerticalHubItemsUiStateMapper$mapItemsUiState$1) continuationImpl;
            int i2 = verticalHubItemsUiStateMapper$mapItemsUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubItemsUiStateMapper$mapItemsUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = verticalHubItemsUiStateMapper$mapItemsUiState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubItemsUiStateMapper$mapItemsUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Ref$IntRef ref$IntRef3 = new Ref$IntRef();
                    ref$IntRef3.element = 1;
                    ArrayList arrayList2 = new ArrayList();
                    iefVar2 = iefVar;
                    str2 = str;
                    ref$IntRef = ref$IntRef3;
                    verticalHubItemsUiStateMapper$mapItemsUiState$12 = verticalHubItemsUiStateMapper$mapItemsUiState$1;
                    it = list.iterator();
                    arrayList = arrayList2;
                    yw01Var2 = yw01Var;
                    list3 = list2;
                    hubAnalyticsPayload2 = hubAnalyticsPayload;
                    if (!it.hasNext()) {
                    }
                } else if (i == 1) {
                    it2 = (Iterator) verticalHubItemsUiStateMapper$mapItemsUiState$1.L$11;
                    r4 = (Collection) verticalHubItemsUiStateMapper$mapItemsUiState$1.L$9;
                    ref$IntRef2 = (Ref$IntRef) verticalHubItemsUiStateMapper$mapItemsUiState$1.L$6;
                    str2 = (String) verticalHubItemsUiStateMapper$mapItemsUiState$1.L$5;
                    iefVar3 = (ief) verticalHubItemsUiStateMapper$mapItemsUiState$1.L$4;
                    hubAnalyticsPayload3 = (HubAnalyticsPayload) verticalHubItemsUiStateMapper$mapItemsUiState$1.L$3;
                    list4 = (List) verticalHubItemsUiStateMapper$mapItemsUiState$1.L$2;
                    r14 = (qrq0) verticalHubItemsUiStateMapper$mapItemsUiState$1.L$1;
                    kotlin.b.b(obj);
                    h0vVar = (h0v) obj;
                    HubAnalyticsPayload hubAnalyticsPayload4 = hubAnalyticsPayload3;
                    verticalHubItemsUiStateMapper$mapItemsUiState$12 = verticalHubItemsUiStateMapper$mapItemsUiState$1;
                    yw01Var2 = r14;
                    arrayList = r4;
                    hubAnalyticsPayload2 = hubAnalyticsPayload4;
                    List list5 = list4;
                    it = it2;
                    list3 = list5;
                    ref$IntRef = ref$IntRef2;
                    iefVar2 = iefVar3;
                    if (h0vVar != null) {
                    }
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it2 = (Iterator) verticalHubItemsUiStateMapper$mapItemsUiState$1.L$11;
                    Collection collection = (Collection) verticalHubItemsUiStateMapper$mapItemsUiState$1.L$9;
                    ref$IntRef2 = (Ref$IntRef) verticalHubItemsUiStateMapper$mapItemsUiState$1.L$6;
                    str2 = (String) verticalHubItemsUiStateMapper$mapItemsUiState$1.L$5;
                    iefVar3 = (ief) verticalHubItemsUiStateMapper$mapItemsUiState$1.L$4;
                    hubAnalyticsPayload3 = (HubAnalyticsPayload) verticalHubItemsUiStateMapper$mapItemsUiState$1.L$3;
                    list4 = (List) verticalHubItemsUiStateMapper$mapItemsUiState$1.L$2;
                    qrq0 qrq0Var = (qrq0) verticalHubItemsUiStateMapper$mapItemsUiState$1.L$1;
                    kotlin.b.b(obj);
                    r4 = collection;
                    r14 = qrq0Var;
                    h0vVar = (h0v) obj;
                    HubAnalyticsPayload hubAnalyticsPayload42 = hubAnalyticsPayload3;
                    verticalHubItemsUiStateMapper$mapItemsUiState$12 = verticalHubItemsUiStateMapper$mapItemsUiState$1;
                    yw01Var2 = r14;
                    arrayList = r4;
                    hubAnalyticsPayload2 = hubAnalyticsPayload42;
                    List list52 = list4;
                    it = it2;
                    list3 = list52;
                    ref$IntRef = ref$IntRef2;
                    iefVar2 = iefVar3;
                    if (h0vVar != null) {
                        arrayList.add(h0vVar);
                    }
                    if (!it.hasNext()) {
                        y yVar = (y) it.next();
                        if (yVar instanceof HubItemDto$DefaultOfferItem) {
                            VerticalHubItemsUiStateMapper$mapItemsUiState$2$1 verticalHubItemsUiStateMapper$mapItemsUiState$2$1 = new VerticalHubItemsUiStateMapper$mapItemsUiState$2$1(ref$IntRef);
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$0 = null;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$1 = yw01Var2;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$2 = list3;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$3 = hubAnalyticsPayload2;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$4 = iefVar2;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$5 = str2;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$6 = ref$IntRef;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$7 = null;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$8 = null;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$9 = arrayList;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$10 = null;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$11 = it;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$12 = null;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$13 = null;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$14 = null;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.label = 1;
                            Object f = f((HubItemDto$DefaultOfferItem) yVar, yw01Var2, list3, hubAnalyticsPayload2, iefVar2, str2, verticalHubItemsUiStateMapper$mapItemsUiState$2$1, verticalHubItemsUiStateMapper$mapItemsUiState$12);
                            if (f != coroutineSingletons) {
                                ArrayList arrayList3 = arrayList;
                                r14 = yw01Var2;
                                verticalHubItemsUiStateMapper$mapItemsUiState$1 = verticalHubItemsUiStateMapper$mapItemsUiState$12;
                                hubAnalyticsPayload3 = hubAnalyticsPayload2;
                                r4 = arrayList3;
                                Iterator it3 = it;
                                list4 = list3;
                                it2 = it3;
                                iefVar3 = iefVar2;
                                ref$IntRef2 = ref$IntRef;
                                h0vVar = (h0v) f;
                                HubAnalyticsPayload hubAnalyticsPayload422 = hubAnalyticsPayload3;
                                verticalHubItemsUiStateMapper$mapItemsUiState$12 = verticalHubItemsUiStateMapper$mapItemsUiState$1;
                                yw01Var2 = r14;
                                arrayList = r4;
                                hubAnalyticsPayload2 = hubAnalyticsPayload422;
                                List list522 = list4;
                                it = it2;
                                list3 = list522;
                                ref$IntRef = ref$IntRef2;
                                iefVar2 = iefVar3;
                                if (h0vVar != null) {
                                }
                                if (!it.hasNext()) {
                                }
                            }
                        } else if (yVar instanceof HubItemDto$SectionHeader) {
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$0 = null;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$1 = yw01Var2;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$2 = list3;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$3 = hubAnalyticsPayload2;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$4 = iefVar2;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$5 = str2;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$6 = ref$IntRef;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$7 = null;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$8 = null;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$9 = arrayList;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$10 = null;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$11 = it;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$12 = null;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$13 = null;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.L$14 = null;
                            verticalHubItemsUiStateMapper$mapItemsUiState$12.label = 2;
                            obj = h((HubItemDto$SectionHeader) yVar, verticalHubItemsUiStateMapper$mapItemsUiState$12);
                            if (obj != coroutineSingletons) {
                                ArrayList arrayList4 = arrayList;
                                r14 = yw01Var2;
                                verticalHubItemsUiStateMapper$mapItemsUiState$1 = verticalHubItemsUiStateMapper$mapItemsUiState$12;
                                hubAnalyticsPayload3 = hubAnalyticsPayload2;
                                r4 = arrayList4;
                                Iterator it4 = it;
                                list4 = list3;
                                it2 = it4;
                                iefVar3 = iefVar2;
                                ref$IntRef2 = ref$IntRef;
                                h0vVar = (h0v) obj;
                                HubAnalyticsPayload hubAnalyticsPayload4222 = hubAnalyticsPayload3;
                                verticalHubItemsUiStateMapper$mapItemsUiState$12 = verticalHubItemsUiStateMapper$mapItemsUiState$1;
                                yw01Var2 = r14;
                                arrayList = r4;
                                hubAnalyticsPayload2 = hubAnalyticsPayload4222;
                                List list5222 = list4;
                                it = it2;
                                list3 = list5222;
                                ref$IntRef = ref$IntRef2;
                                iefVar2 = iefVar3;
                                if (h0vVar != null) {
                                }
                                if (!it.hasNext()) {
                                }
                            }
                        } else {
                            if (!jl40.l(yVar, x.INSTANCE)) {
                                w511.b();
                                return null;
                            }
                            h0vVar = null;
                            if (h0vVar != null) {
                            }
                            if (!it.hasNext()) {
                                return arrayList;
                            }
                        }
                        return coroutineSingletons;
                    }
                }
            }
        }
        verticalHubItemsUiStateMapper$mapItemsUiState$1 = new VerticalHubItemsUiStateMapper$mapItemsUiState$1(this, continuationImpl);
        Object obj2 = verticalHubItemsUiStateMapper$mapItemsUiState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubItemsUiStateMapper$mapItemsUiState$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(HubOnboardingDto hubOnboardingDto, ContinuationImpl continuationImpl) {
        VerticalHubItemsUiStateMapper$mapOnboarding$1 verticalHubItemsUiStateMapper$mapOnboarding$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        HubOnboardingDto hubOnboardingDto2;
        String str;
        Object i2;
        CharSequence charSequence;
        if (continuationImpl instanceof VerticalHubItemsUiStateMapper$mapOnboarding$1) {
            verticalHubItemsUiStateMapper$mapOnboarding$1 = (VerticalHubItemsUiStateMapper$mapOnboarding$1) continuationImpl;
            int i3 = verticalHubItemsUiStateMapper$mapOnboarding$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                verticalHubItemsUiStateMapper$mapOnboarding$1.label = i3 - Integer.MIN_VALUE;
                Object obj = verticalHubItemsUiStateMapper$mapOnboarding$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubItemsUiStateMapper$mapOnboarding$1.label;
                ru.yandex.taxi.widget.c cVar = this.f;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str2 = hubOnboardingDto.a;
                    FormattedText formattedText = hubOnboardingDto.b;
                    verticalHubItemsUiStateMapper$mapOnboarding$1.L$0 = hubOnboardingDto;
                    verticalHubItemsUiStateMapper$mapOnboarding$1.L$1 = str2;
                    verticalHubItemsUiStateMapper$mapOnboarding$1.label = 1;
                    Object i4 = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, verticalHubItemsUiStateMapper$mapOnboarding$1, 30);
                    if (i4 != coroutineSingletons) {
                        hubOnboardingDto2 = hubOnboardingDto;
                        str = str2;
                        obj = i4;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence = (CharSequence) verticalHubItemsUiStateMapper$mapOnboarding$1.L$2;
                    str = (String) verticalHubItemsUiStateMapper$mapOnboarding$1.L$1;
                    kotlin.b.b(obj);
                    return new x0v(charSequence, (CharSequence) obj, str);
                }
                str = (String) verticalHubItemsUiStateMapper$mapOnboarding$1.L$1;
                hubOnboardingDto2 = (HubOnboardingDto) verticalHubItemsUiStateMapper$mapOnboarding$1.L$0;
                kotlin.b.b(obj);
                CharSequence charSequence2 = (CharSequence) obj;
                FormattedText formattedText2 = hubOnboardingDto2.c;
                verticalHubItemsUiStateMapper$mapOnboarding$1.L$0 = null;
                verticalHubItemsUiStateMapper$mapOnboarding$1.L$1 = str;
                verticalHubItemsUiStateMapper$mapOnboarding$1.L$2 = charSequence2;
                verticalHubItemsUiStateMapper$mapOnboarding$1.label = 2;
                i2 = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, verticalHubItemsUiStateMapper$mapOnboarding$1, 30);
                if (i2 != coroutineSingletons) {
                    obj = i2;
                    charSequence = charSequence2;
                    return new x0v(charSequence, (CharSequence) obj, str);
                }
                return coroutineSingletons;
            }
        }
        verticalHubItemsUiStateMapper$mapOnboarding$1 = new VerticalHubItemsUiStateMapper$mapOnboarding$1(this, continuationImpl);
        Object obj2 = verticalHubItemsUiStateMapper$mapOnboarding$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubItemsUiStateMapper$mapOnboarding$1.label;
        ru.yandex.taxi.widget.c cVar2 = this.f;
        if (i != 0) {
        }
        CharSequence charSequence22 = (CharSequence) obj2;
        FormattedText formattedText22 = hubOnboardingDto2.c;
        verticalHubItemsUiStateMapper$mapOnboarding$1.L$0 = null;
        verticalHubItemsUiStateMapper$mapOnboarding$1.L$1 = str;
        verticalHubItemsUiStateMapper$mapOnboarding$1.L$2 = charSequence22;
        verticalHubItemsUiStateMapper$mapOnboarding$1.label = 2;
        i2 = ru.yandex.taxi.widget.c.i(cVar2, formattedText22, null, verticalHubItemsUiStateMapper$mapOnboarding$1, 30);
        if (i2 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(DefaultOfferBodyDto$IconBodyDto defaultOfferBodyDto$IconBodyDto, String str, qrq0 qrq0Var, ContinuationImpl continuationImpl) {
        VerticalHubItemsUiStateMapper$mapTariffClassIconBody$1 verticalHubItemsUiStateMapper$mapTariffClassIconBody$1;
        int i;
        String str2;
        String str3;
        Object obj;
        if (continuationImpl instanceof VerticalHubItemsUiStateMapper$mapTariffClassIconBody$1) {
            verticalHubItemsUiStateMapper$mapTariffClassIconBody$1 = (VerticalHubItemsUiStateMapper$mapTariffClassIconBody$1) continuationImpl;
            int i2 = verticalHubItemsUiStateMapper$mapTariffClassIconBody$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubItemsUiStateMapper$mapTariffClassIconBody$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = verticalHubItemsUiStateMapper$mapTariffClassIconBody$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubItemsUiStateMapper$mapTariffClassIconBody$1.label;
                as60 as60Var = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String str4 = defaultOfferBodyDto$IconBodyDto.b;
                    String str5 = defaultOfferBodyDto$IconBodyDto.a;
                    if (str4.length() <= 0) {
                        str4 = null;
                    }
                    String a = str4 != null ? ((m7x0) this.c).a(str4) : null;
                    if (a == null) {
                        Iterator it = qrq0Var.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (jl40.l(((pex0) obj).b, str5)) {
                                break;
                            }
                        }
                        pex0 pex0Var = (pex0) obj;
                        a = pex0Var != null ? pex0Var.j : null;
                    }
                    if (a == null || a.length() == 0) {
                        xby.l(jst.e, "VerticalHub.UiStateMapping.Error", null, null, b64.l("Empty icon for tariff ", str5, ". Offer id ", str), 6);
                    }
                    str2 = a == null ? "" : a;
                    TrailingItemDto trailingItemDto = defaultOfferBodyDto$IconBodyDto.c;
                    if (trailingItemDto != null) {
                        verticalHubItemsUiStateMapper$mapTariffClassIconBody$1.L$0 = null;
                        verticalHubItemsUiStateMapper$mapTariffClassIconBody$1.L$1 = null;
                        verticalHubItemsUiStateMapper$mapTariffClassIconBody$1.L$2 = null;
                        verticalHubItemsUiStateMapper$mapTariffClassIconBody$1.L$3 = null;
                        verticalHubItemsUiStateMapper$mapTariffClassIconBody$1.L$4 = null;
                        verticalHubItemsUiStateMapper$mapTariffClassIconBody$1.L$5 = null;
                        verticalHubItemsUiStateMapper$mapTariffClassIconBody$1.L$6 = str2;
                        verticalHubItemsUiStateMapper$mapTariffClassIconBody$1.label = 1;
                        obj2 = d(trailingItemDto, verticalHubItemsUiStateMapper$mapTariffClassIconBody$1);
                        if (obj2 == obj3) {
                            return obj3;
                        }
                        str3 = str2;
                    }
                    return new f4v(str2, as60Var);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str3 = (String) verticalHubItemsUiStateMapper$mapTariffClassIconBody$1.L$6;
                kotlin.b.b(obj2);
                as60Var = (as60) obj2;
                str2 = str3;
                return new f4v(str2, as60Var);
            }
        }
        verticalHubItemsUiStateMapper$mapTariffClassIconBody$1 = new VerticalHubItemsUiStateMapper$mapTariffClassIconBody$1(this, continuationImpl);
        Object obj22 = verticalHubItemsUiStateMapper$mapTariffClassIconBody$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubItemsUiStateMapper$mapTariffClassIconBody$1.label;
        as60 as60Var2 = null;
        if (i != 0) {
        }
        as60Var2 = (as60) obj22;
        str2 = str3;
        return new f4v(str2, as60Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0097 -> B:10:0x009a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(List list, ContinuationImpl continuationImpl) {
        VerticalHubItemsUiStateMapper$transportSections$1 verticalHubItemsUiStateMapper$transportSections$1;
        int i;
        ArrayList arrayList;
        Iterator it;
        if (continuationImpl instanceof VerticalHubItemsUiStateMapper$transportSections$1) {
            verticalHubItemsUiStateMapper$transportSections$1 = (VerticalHubItemsUiStateMapper$transportSections$1) continuationImpl;
            int i2 = verticalHubItemsUiStateMapper$transportSections$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalHubItemsUiStateMapper$transportSections$1.label = i2 - Integer.MIN_VALUE;
                Object obj = verticalHubItemsUiStateMapper$transportSections$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalHubItemsUiStateMapper$transportSections$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = list;
                    arrayList = new ArrayList(tcc.n(list2, 10));
                    it = list2.iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r4 = (Collection) verticalHubItemsUiStateMapper$transportSections$1.L$7;
                    TransportRouteSection transportRouteSection = (TransportRouteSection) verticalHubItemsUiStateMapper$transportSections$1.L$6;
                    Iterator it2 = (Iterator) verticalHubItemsUiStateMapper$transportSections$1.L$4;
                    ?? r9 = (Collection) verticalHubItemsUiStateMapper$transportSections$1.L$3;
                    kotlin.b.b(obj);
                    ArrayList arrayList2 = r4;
                    arrayList = r9;
                    Iterator it3 = it2;
                    TransportRouteSection transportRouteSection2 = transportRouteSection;
                    BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                    CustomImageSpan customImageSpan = bitmapDrawable == null ? new CustomImageSpan(bitmapDrawable, 2, false, false, new xjf(transportRouteSection2.a), 12, null) : null;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (customImageSpan != null) {
                        spannableStringBuilder.append(" ", customImageSpan, 33);
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    for (TransportRouteSection.Cube cube : transportRouteSection2.b) {
                        String str = cube.b;
                        ufu ufuVar = (ufu) this.b;
                        kdc i3 = ufuVar.i(str);
                        if (i3 == null) {
                            i3 = new bdc(xng0.textMain);
                        }
                        spannableStringBuilder.append(fh4.h(this.a, cube.a, ufuVar.e(cube.c), i3));
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    arrayList2.add(spannableStringBuilder);
                    it = it3;
                    if (it.hasNext()) {
                        TransportRouteSection transportRouteSection3 = (TransportRouteSection) it.next();
                        String str2 = transportRouteSection3.a;
                        verticalHubItemsUiStateMapper$transportSections$1.L$0 = null;
                        verticalHubItemsUiStateMapper$transportSections$1.L$1 = null;
                        verticalHubItemsUiStateMapper$transportSections$1.L$2 = null;
                        verticalHubItemsUiStateMapper$transportSections$1.L$3 = arrayList;
                        verticalHubItemsUiStateMapper$transportSections$1.L$4 = it;
                        verticalHubItemsUiStateMapper$transportSections$1.L$5 = null;
                        verticalHubItemsUiStateMapper$transportSections$1.L$6 = transportRouteSection3;
                        verticalHubItemsUiStateMapper$transportSections$1.L$7 = arrayList;
                        verticalHubItemsUiStateMapper$transportSections$1.label = 1;
                        obj = ru.yandex.taxi.widget.utils.e.f(this.d, str2, null, verticalHubItemsUiStateMapper$transportSections$1, 6);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        it3 = it;
                        transportRouteSection2 = transportRouteSection3;
                        arrayList2 = arrayList;
                        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj;
                        if (bitmapDrawable2 == null) {
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        if (customImageSpan != null) {
                        }
                        while (r8.hasNext()) {
                        }
                        arrayList2.add(spannableStringBuilder2);
                        it = it3;
                        if (it.hasNext()) {
                            return arrayList;
                        }
                    }
                }
            }
        }
        verticalHubItemsUiStateMapper$transportSections$1 = new VerticalHubItemsUiStateMapper$transportSections$1(this, continuationImpl);
        Object obj2 = verticalHubItemsUiStateMapper$transportSections$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalHubItemsUiStateMapper$transportSections$1.label;
        if (i != 0) {
        }
    }
}
