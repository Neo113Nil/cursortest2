package com.yandex.go.chargers.feedback.domain;

import com.yandex.go.chargers.feedback.data.ChargersFeedbackItemDto;
import com.yandex.go.chargers.feedback.data.ChargersFeedbackItemsDto;
import com.yandex.go.chargers.feedback.data.ChargersFeedbackResponseDto;
import com.yandex.go.chargers.feedback.data.ChargersFeedbackScreenBannerDto;
import com.yandex.go.chargers.feedback.data.ChargersFeedbackScreenPromoPlateDto;
import com.yandex.go.chargers.feedback.data.ChargersFinishedOrderDto;
import com.yandex.go.chargers.feedback.data.ChargersOrderDetailDto$TitleValue;
import com.yandex.go.chargers.feedback.data.ChargersOrderDetailsDto;
import com.yandex.go.chargers.feedback.data.d;
import com.yandex.go.chargers.feedback.data.u;
import com.yandex.go.chargers.feedback.data.w;
import com.yandex.go.chargers.feedback.data.x;
import com.yandex.go.chargers.feedback.domain.model.ChargersFeedbackCompletedOrder$FinishingStage;
import com.yandex.go.chargers.surge.data.ChargersSurgeModalDto;
import defpackage.az9;
import defpackage.bvf0;
import defpackage.dz9;
import defpackage.hwa;
import defpackage.jl40;
import defpackage.mja1;
import defpackage.nvi0;
import defpackage.ny61;
import defpackage.nz9;
import defpackage.ro9;
import defpackage.tcc;
import defpackage.tj9;
import defpackage.ty9;
import defpackage.uj9;
import defpackage.v0a;
import defpackage.w0a;
import defpackage.w511;
import defpackage.wz9;
import defpackage.x0a;
import defpackage.yy9;
import defpackage.zy9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes12.dex */
public final class a {
    public final c a;
    public final com.yandex.go.chargers.domain.mapper.a b;
    public final d c;

    public a(com.yandex.go.chargers.surge.domain.a aVar, c cVar, com.yandex.go.chargers.domain.mapper.a aVar2, d dVar) {
        this.a = cVar;
        this.b = aVar2;
        this.c = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        if (r7 == r10) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, x xVar, hwa hwaVar, ContinuationImpl continuationImpl) {
        ChargersFeedbackScreenInteractor$mapFinishInfoItem$1 chargersFeedbackScreenInteractor$mapFinishInfoItem$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object i2;
        x xVar2;
        CharSequence charSequence;
        boolean z;
        uj9 uj9Var;
        aVar.getClass();
        c cVar = aVar.a;
        if (continuationImpl instanceof ChargersFeedbackScreenInteractor$mapFinishInfoItem$1) {
            chargersFeedbackScreenInteractor$mapFinishInfoItem$1 = (ChargersFeedbackScreenInteractor$mapFinishInfoItem$1) continuationImpl;
            int i3 = chargersFeedbackScreenInteractor$mapFinishInfoItem$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                chargersFeedbackScreenInteractor$mapFinishInfoItem$1.label = i3 - Integer.MIN_VALUE;
                Object obj = chargersFeedbackScreenInteractor$mapFinishInfoItem$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersFeedbackScreenInteractor$mapFinishInfoItem$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(xVar instanceof ChargersOrderDetailDto$TitleValue)) {
                        if (xVar instanceof u) {
                            return w0a.a;
                        }
                        if (xVar instanceof w) {
                            return null;
                        }
                        w511.b();
                        return null;
                    }
                    FormattedText formattedText = ((ChargersOrderDetailDto$TitleValue) xVar).a;
                    chargersFeedbackScreenInteractor$mapFinishInfoItem$1.L$0 = xVar;
                    chargersFeedbackScreenInteractor$mapFinishInfoItem$1.L$1 = hwaVar;
                    chargersFeedbackScreenInteractor$mapFinishInfoItem$1.label = 1;
                    obj = c.i(cVar, formattedText, null, chargersFeedbackScreenInteractor$mapFinishInfoItem$1, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence = (CharSequence) chargersFeedbackScreenInteractor$mapFinishInfoItem$1.L$2;
                        hwaVar = (hwa) chargersFeedbackScreenInteractor$mapFinishInfoItem$1.L$1;
                        xVar2 = (x) chargersFeedbackScreenInteractor$mapFinishInfoItem$1.L$0;
                        kotlin.b.b(obj);
                        CharSequence charSequence2 = (CharSequence) obj;
                        z = ((ChargersOrderDetailDto$TitleValue) xVar2).c instanceof wz9;
                        uj9Var = tj9.a;
                        if (z && hwaVar != null) {
                            uj9Var = new ro9(hwaVar);
                        }
                        return new x0a(charSequence, charSequence2, uj9Var);
                    }
                    hwaVar = (hwa) chargersFeedbackScreenInteractor$mapFinishInfoItem$1.L$1;
                    xVar = (x) chargersFeedbackScreenInteractor$mapFinishInfoItem$1.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence3 = (CharSequence) obj;
                FormattedText formattedText2 = ((ChargersOrderDetailDto$TitleValue) xVar).b;
                chargersFeedbackScreenInteractor$mapFinishInfoItem$1.L$0 = xVar;
                chargersFeedbackScreenInteractor$mapFinishInfoItem$1.L$1 = hwaVar;
                chargersFeedbackScreenInteractor$mapFinishInfoItem$1.L$2 = charSequence3;
                chargersFeedbackScreenInteractor$mapFinishInfoItem$1.label = 2;
                i2 = c.i(cVar, formattedText2, null, chargersFeedbackScreenInteractor$mapFinishInfoItem$1, 30);
                if (i2 != coroutineSingletons) {
                    xVar2 = xVar;
                    charSequence = charSequence3;
                    obj = i2;
                    CharSequence charSequence22 = (CharSequence) obj;
                    z = ((ChargersOrderDetailDto$TitleValue) xVar2).c instanceof wz9;
                    uj9Var = tj9.a;
                    if (z) {
                        uj9Var = new ro9(hwaVar);
                    }
                    return new x0a(charSequence, charSequence22, uj9Var);
                }
                return coroutineSingletons;
            }
        }
        chargersFeedbackScreenInteractor$mapFinishInfoItem$1 = new ChargersFeedbackScreenInteractor$mapFinishInfoItem$1(aVar, continuationImpl);
        Object obj2 = chargersFeedbackScreenInteractor$mapFinishInfoItem$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersFeedbackScreenInteractor$mapFinishInfoItem$1.label;
        if (i != 0) {
        }
        CharSequence charSequence32 = (CharSequence) obj2;
        FormattedText formattedText22 = ((ChargersOrderDetailDto$TitleValue) xVar).b;
        chargersFeedbackScreenInteractor$mapFinishInfoItem$1.L$0 = xVar;
        chargersFeedbackScreenInteractor$mapFinishInfoItem$1.L$1 = hwaVar;
        chargersFeedbackScreenInteractor$mapFinishInfoItem$1.L$2 = charSequence32;
        chargersFeedbackScreenInteractor$mapFinishInfoItem$1.label = 2;
        i2 = c.i(cVar, formattedText22, null, chargersFeedbackScreenInteractor$mapFinishInfoItem$1, 30);
        if (i2 != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        ChargersFeedbackScreenInteractor$getFeedbackScreen$1 chargersFeedbackScreenInteractor$getFeedbackScreen$1;
        int i;
        if (continuationImpl instanceof ChargersFeedbackScreenInteractor$getFeedbackScreen$1) {
            chargersFeedbackScreenInteractor$getFeedbackScreen$1 = (ChargersFeedbackScreenInteractor$getFeedbackScreen$1) continuationImpl;
            int i2 = chargersFeedbackScreenInteractor$getFeedbackScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersFeedbackScreenInteractor$getFeedbackScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersFeedbackScreenInteractor$getFeedbackScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersFeedbackScreenInteractor$getFeedbackScreen$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    chargersFeedbackScreenInteractor$getFeedbackScreen$1.L$0 = str;
                    chargersFeedbackScreenInteractor$getFeedbackScreen$1.L$1 = this;
                    chargersFeedbackScreenInteractor$getFeedbackScreen$1.label = 1;
                    obj = this.c.a(str, chargersFeedbackScreenInteractor$getFeedbackScreen$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    this = (a) chargersFeedbackScreenInteractor$getFeedbackScreen$1.L$1;
                    str = (String) chargersFeedbackScreenInteractor$getFeedbackScreen$1.L$0;
                    kotlin.b.b(obj);
                }
                chargersFeedbackScreenInteractor$getFeedbackScreen$1.L$0 = null;
                chargersFeedbackScreenInteractor$getFeedbackScreen$1.L$1 = null;
                chargersFeedbackScreenInteractor$getFeedbackScreen$1.label = 2;
                Object e = this.e((ChargersFeedbackResponseDto) obj, str, chargersFeedbackScreenInteractor$getFeedbackScreen$1);
                return e != coroutineSingletons ? coroutineSingletons : e;
            }
        }
        chargersFeedbackScreenInteractor$getFeedbackScreen$1 = new ChargersFeedbackScreenInteractor$getFeedbackScreen$1(this, continuationImpl);
        Object obj2 = chargersFeedbackScreenInteractor$getFeedbackScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersFeedbackScreenInteractor$getFeedbackScreen$1.label;
        if (i != 0) {
        }
        chargersFeedbackScreenInteractor$getFeedbackScreen$1.L$0 = null;
        chargersFeedbackScreenInteractor$getFeedbackScreen$1.L$1 = null;
        chargersFeedbackScreenInteractor$getFeedbackScreen$1.label = 2;
        Object e2 = this.e((ChargersFeedbackResponseDto) obj2, str, chargersFeedbackScreenInteractor$getFeedbackScreen$1);
        if (e2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        if (r12 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00c7 -> B:11:0x00c8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ChargersFeedbackItemsDto chargersFeedbackItemsDto, ContinuationImpl continuationImpl) {
        ChargersFeedbackScreenInteractor$mapFeedbackItems$1 chargersFeedbackScreenInteractor$mapFeedbackItems$1;
        int i;
        CharSequence charSequence;
        FormattedText formattedText;
        List list;
        Iterator it;
        CharSequence charSequence2;
        Collection collection;
        if (continuationImpl instanceof ChargersFeedbackScreenInteractor$mapFeedbackItems$1) {
            chargersFeedbackScreenInteractor$mapFeedbackItems$1 = (ChargersFeedbackScreenInteractor$mapFeedbackItems$1) continuationImpl;
            int i2 = chargersFeedbackScreenInteractor$mapFeedbackItems$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersFeedbackScreenInteractor$mapFeedbackItems$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersFeedbackScreenInteractor$mapFeedbackItems$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersFeedbackScreenInteractor$mapFeedbackItems$1.label;
                c cVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (chargersFeedbackItemsDto == null || (formattedText = chargersFeedbackItemsDto.a) == null) {
                        charSequence = null;
                        if (chargersFeedbackItemsDto != null && (list = chargersFeedbackItemsDto.b) != null) {
                            List list2 = list;
                            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                            it = list2.iterator();
                            charSequence2 = charSequence;
                            collection = arrayList;
                            if (!it.hasNext()) {
                            }
                        }
                        return null;
                    }
                    chargersFeedbackScreenInteractor$mapFeedbackItems$1.L$0 = chargersFeedbackItemsDto;
                    chargersFeedbackScreenInteractor$mapFeedbackItems$1.L$1 = null;
                    chargersFeedbackScreenInteractor$mapFeedbackItems$1.label = 1;
                    obj = c.i(cVar, formattedText, null, chargersFeedbackScreenInteractor$mapFeedbackItems$1, 30);
                } else if (i == 1) {
                    chargersFeedbackItemsDto = (ChargersFeedbackItemsDto) chargersFeedbackScreenInteractor$mapFeedbackItems$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection = (Collection) chargersFeedbackScreenInteractor$mapFeedbackItems$1.L$9;
                    String str = (String) chargersFeedbackScreenInteractor$mapFeedbackItems$1.L$8;
                    it = (Iterator) chargersFeedbackScreenInteractor$mapFeedbackItems$1.L$5;
                    Collection collection2 = (Collection) chargersFeedbackScreenInteractor$mapFeedbackItems$1.L$4;
                    charSequence2 = (CharSequence) chargersFeedbackScreenInteractor$mapFeedbackItems$1.L$1;
                    kotlin.b.b(obj);
                    collection.add(new yy9((CharSequence) obj, str));
                    collection = collection2;
                    if (!it.hasNext()) {
                        ChargersFeedbackItemDto chargersFeedbackItemDto = (ChargersFeedbackItemDto) it.next();
                        str = chargersFeedbackItemDto.a;
                        FormattedText formattedText2 = chargersFeedbackItemDto.b;
                        chargersFeedbackScreenInteractor$mapFeedbackItems$1.L$0 = null;
                        chargersFeedbackScreenInteractor$mapFeedbackItems$1.L$1 = charSequence2;
                        chargersFeedbackScreenInteractor$mapFeedbackItems$1.L$2 = null;
                        chargersFeedbackScreenInteractor$mapFeedbackItems$1.L$3 = null;
                        chargersFeedbackScreenInteractor$mapFeedbackItems$1.L$4 = collection;
                        chargersFeedbackScreenInteractor$mapFeedbackItems$1.L$5 = it;
                        chargersFeedbackScreenInteractor$mapFeedbackItems$1.L$6 = null;
                        chargersFeedbackScreenInteractor$mapFeedbackItems$1.L$7 = null;
                        chargersFeedbackScreenInteractor$mapFeedbackItems$1.L$8 = str;
                        chargersFeedbackScreenInteractor$mapFeedbackItems$1.L$9 = collection;
                        chargersFeedbackScreenInteractor$mapFeedbackItems$1.label = 2;
                        obj = c.i(cVar, formattedText2, null, chargersFeedbackScreenInteractor$mapFeedbackItems$1, 30);
                        if (obj != coroutineSingletons) {
                            collection2 = collection;
                            collection.add(new yy9((CharSequence) obj, str));
                            collection = collection2;
                            if (!it.hasNext()) {
                                List list3 = (List) collection;
                                if (list3 != null) {
                                    return new zy9(charSequence2, list3);
                                }
                                return null;
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                charSequence = (CharSequence) obj;
                if (chargersFeedbackItemsDto != null) {
                    List list22 = list;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list22, 10));
                    it = list22.iterator();
                    charSequence2 = charSequence;
                    collection = arrayList2;
                    if (!it.hasNext()) {
                    }
                }
                return null;
            }
        }
        chargersFeedbackScreenInteractor$mapFeedbackItems$1 = new ChargersFeedbackScreenInteractor$mapFeedbackItems$1(this, continuationImpl);
        Object obj2 = chargersFeedbackScreenInteractor$mapFeedbackItems$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersFeedbackScreenInteractor$mapFeedbackItems$1.label;
        c cVar2 = this.a;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj2;
        if (chargersFeedbackItemsDto != null) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r10 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ChargersOrderDetailsDto chargersOrderDetailsDto, ChargersSurgeModalDto chargersSurgeModalDto, ContinuationImpl continuationImpl) {
        ChargersFeedbackScreenInteractor$mapFinishInfo$1 chargersFeedbackScreenInteractor$mapFinishInfo$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        hwa b;
        String str;
        String str2;
        if (continuationImpl instanceof ChargersFeedbackScreenInteractor$mapFinishInfo$1) {
            chargersFeedbackScreenInteractor$mapFinishInfo$1 = (ChargersFeedbackScreenInteractor$mapFinishInfo$1) continuationImpl;
            int i2 = chargersFeedbackScreenInteractor$mapFinishInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersFeedbackScreenInteractor$mapFinishInfo$1.label = i2 - Integer.MIN_VALUE;
                obj = chargersFeedbackScreenInteractor$mapFinishInfo$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersFeedbackScreenInteractor$mapFinishInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b = chargersSurgeModalDto != null ? com.yandex.go.chargers.surge.domain.a.b(chargersSurgeModalDto) : null;
                    ChargersFeedbackScreenInteractor$mapFinishInfo$mappedItems$1 chargersFeedbackScreenInteractor$mapFinishInfo$mappedItems$1 = new ChargersFeedbackScreenInteractor$mapFinishInfo$mappedItems$1(chargersOrderDetailsDto, this, b, null);
                    chargersFeedbackScreenInteractor$mapFinishInfo$1.L$0 = chargersOrderDetailsDto;
                    chargersFeedbackScreenInteractor$mapFinishInfo$1.L$1 = null;
                    chargersFeedbackScreenInteractor$mapFinishInfo$1.L$2 = b;
                    chargersFeedbackScreenInteractor$mapFinishInfo$1.label = 1;
                    obj = bvf0.n(chargersFeedbackScreenInteractor$mapFinishInfo$mappedItems$1, chargersFeedbackScreenInteractor$mapFinishInfo$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str2 = (String) chargersFeedbackScreenInteractor$mapFinishInfo$1.L$5;
                        str = (String) chargersFeedbackScreenInteractor$mapFinishInfo$1.L$4;
                        b = (hwa) chargersFeedbackScreenInteractor$mapFinishInfo$1.L$2;
                        kotlin.b.b(obj);
                        return new v0a(str, str2, kotlin.collections.a.M((Iterable) obj), b);
                    }
                    hwa hwaVar = (hwa) chargersFeedbackScreenInteractor$mapFinishInfo$1.L$2;
                    chargersOrderDetailsDto = (ChargersOrderDetailsDto) chargersFeedbackScreenInteractor$mapFinishInfo$1.L$0;
                    kotlin.b.b(obj);
                    b = hwaVar;
                }
                String str3 = chargersOrderDetailsDto.a;
                String str4 = chargersOrderDetailsDto.b;
                chargersFeedbackScreenInteractor$mapFinishInfo$1.L$0 = null;
                chargersFeedbackScreenInteractor$mapFinishInfo$1.L$1 = null;
                chargersFeedbackScreenInteractor$mapFinishInfo$1.L$2 = b;
                chargersFeedbackScreenInteractor$mapFinishInfo$1.L$3 = null;
                chargersFeedbackScreenInteractor$mapFinishInfo$1.L$4 = str3;
                chargersFeedbackScreenInteractor$mapFinishInfo$1.L$5 = str4;
                chargersFeedbackScreenInteractor$mapFinishInfo$1.label = 2;
                obj = kotlinx.coroutines.a.b((List) obj, chargersFeedbackScreenInteractor$mapFinishInfo$1);
                if (obj != coroutineSingletons) {
                    str = str3;
                    str2 = str4;
                    return new v0a(str, str2, kotlin.collections.a.M((Iterable) obj), b);
                }
                return coroutineSingletons;
            }
        }
        chargersFeedbackScreenInteractor$mapFinishInfo$1 = new ChargersFeedbackScreenInteractor$mapFinishInfo$1(this, continuationImpl);
        obj = chargersFeedbackScreenInteractor$mapFinishInfo$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersFeedbackScreenInteractor$mapFinishInfo$1.label;
        if (i != 0) {
        }
        String str32 = chargersOrderDetailsDto.a;
        String str42 = chargersOrderDetailsDto.b;
        chargersFeedbackScreenInteractor$mapFinishInfo$1.L$0 = null;
        chargersFeedbackScreenInteractor$mapFinishInfo$1.L$1 = null;
        chargersFeedbackScreenInteractor$mapFinishInfo$1.L$2 = b;
        chargersFeedbackScreenInteractor$mapFinishInfo$1.L$3 = null;
        chargersFeedbackScreenInteractor$mapFinishInfo$1.L$4 = str32;
        chargersFeedbackScreenInteractor$mapFinishInfo$1.L$5 = str42;
        chargersFeedbackScreenInteractor$mapFinishInfo$1.label = 2;
        obj = kotlinx.coroutines.a.b((List) obj, chargersFeedbackScreenInteractor$mapFinishInfo$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.yandex.go.chargers.feedback.domain.a] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ChargersFeedbackResponseDto chargersFeedbackResponseDto, String str, ContinuationImpl continuationImpl) {
        ChargersFeedbackScreenInteractor$mapResponse$1 chargersFeedbackScreenInteractor$mapResponse$1;
        int i;
        Object obj;
        ChargersFinishedOrderDto chargersFinishedOrderDto;
        String str2;
        nvi0 a;
        ChargersFeedbackResponseDto chargersFeedbackResponseDto2;
        int i2;
        int i3;
        ChargersFinishedOrderDto chargersFinishedOrderDto2;
        String str3;
        nvi0 nvi0Var;
        ty9 ty9Var;
        ChargersFeedbackScreenPromoPlateDto chargersFeedbackScreenPromoPlateDto;
        ChargersFeedbackResponseDto chargersFeedbackResponseDto3;
        ChargersFinishedOrderDto chargersFinishedOrderDto3;
        dz9 dz9Var;
        Object d;
        dz9 dz9Var2;
        ty9 ty9Var2;
        ChargersFinishedOrderDto chargersFinishedOrderDto4;
        Object c;
        dz9 dz9Var3;
        nvi0 nvi0Var2;
        v0a v0aVar;
        int i4;
        int i5;
        ChargersFeedbackCompletedOrder$FinishingStage chargersFeedbackCompletedOrder$FinishingStage;
        if (continuationImpl instanceof ChargersFeedbackScreenInteractor$mapResponse$1) {
            chargersFeedbackScreenInteractor$mapResponse$1 = (ChargersFeedbackScreenInteractor$mapResponse$1) continuationImpl;
            int i6 = chargersFeedbackScreenInteractor$mapResponse$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                chargersFeedbackScreenInteractor$mapResponse$1.label = i6 - Integer.MIN_VALUE;
                Object obj2 = chargersFeedbackScreenInteractor$mapResponse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersFeedbackScreenInteractor$mapResponse$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Iterator it = chargersFeedbackResponseDto.a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (jl40.l(((ChargersFinishedOrderDto) obj).a, str)) {
                            break;
                        }
                    }
                    ChargersFinishedOrderDto chargersFinishedOrderDto5 = (ChargersFinishedOrderDto) obj;
                    if (chargersFinishedOrderDto5 == null) {
                        ChargersFinishedOrderDto chargersFinishedOrderDto6 = (ChargersFinishedOrderDto) kotlin.collections.a.R(chargersFeedbackResponseDto.a);
                        if (chargersFinishedOrderDto6 == null) {
                            ny61.r("No order found in feedback response");
                            return null;
                        }
                        chargersFinishedOrderDto = chargersFinishedOrderDto6;
                    } else {
                        chargersFinishedOrderDto = chargersFinishedOrderDto5;
                    }
                    Boolean bool = chargersFinishedOrderDto.f;
                    ?? booleanValue = bool != null ? bool.booleanValue() : 1;
                    str2 = chargersFinishedOrderDto.b;
                    String str4 = chargersFinishedOrderDto.c;
                    if (str4 == null) {
                        str4 = "";
                    }
                    a = mja1.a(str4, null, 6);
                    ChargersFeedbackScreenBannerDto chargersFeedbackScreenBannerDto = chargersFeedbackResponseDto.b;
                    if (chargersFeedbackScreenBannerDto != null) {
                        chargersFeedbackScreenInteractor$mapResponse$1.L$0 = chargersFeedbackResponseDto;
                        chargersFeedbackScreenInteractor$mapResponse$1.L$1 = null;
                        chargersFeedbackScreenInteractor$mapResponse$1.L$2 = chargersFinishedOrderDto;
                        chargersFeedbackScreenInteractor$mapResponse$1.L$3 = null;
                        chargersFeedbackScreenInteractor$mapResponse$1.L$4 = str2;
                        chargersFeedbackScreenInteractor$mapResponse$1.L$5 = a;
                        chargersFeedbackScreenInteractor$mapResponse$1.I$0 = booleanValue;
                        chargersFeedbackScreenInteractor$mapResponse$1.I$1 = booleanValue;
                        chargersFeedbackScreenInteractor$mapResponse$1.label = 1;
                        Object n = bvf0.n(new ChargersFeedbackScreenInteractor$mapBanner$2(chargersFeedbackScreenBannerDto, this, null), chargersFeedbackScreenInteractor$mapResponse$1);
                        if (n != coroutineSingletons) {
                            chargersFeedbackResponseDto2 = chargersFeedbackResponseDto;
                            i2 = booleanValue;
                            obj2 = n;
                            i3 = i2;
                        }
                        return coroutineSingletons;
                    }
                    chargersFeedbackResponseDto2 = chargersFeedbackResponseDto;
                    i2 = booleanValue;
                    i3 = i2;
                    chargersFinishedOrderDto2 = chargersFinishedOrderDto;
                    str3 = str2;
                    nvi0Var = a;
                    ty9Var = null;
                    chargersFeedbackScreenPromoPlateDto = chargersFeedbackResponseDto2.c;
                    if (chargersFeedbackScreenPromoPlateDto == null) {
                        chargersFeedbackResponseDto3 = chargersFeedbackResponseDto2;
                        chargersFinishedOrderDto3 = chargersFinishedOrderDto2;
                        dz9Var = null;
                        ChargersOrderDetailsDto chargersOrderDetailsDto = chargersFinishedOrderDto3.d;
                        ChargersSurgeModalDto chargersSurgeModalDto = chargersFinishedOrderDto3.e;
                        chargersFeedbackScreenInteractor$mapResponse$1.L$0 = chargersFeedbackResponseDto3;
                        chargersFeedbackScreenInteractor$mapResponse$1.L$1 = null;
                        chargersFeedbackScreenInteractor$mapResponse$1.L$2 = chargersFinishedOrderDto3;
                        chargersFeedbackScreenInteractor$mapResponse$1.L$3 = str3;
                        chargersFeedbackScreenInteractor$mapResponse$1.L$4 = nvi0Var;
                        chargersFeedbackScreenInteractor$mapResponse$1.L$5 = ty9Var;
                        chargersFeedbackScreenInteractor$mapResponse$1.L$6 = dz9Var;
                        chargersFeedbackScreenInteractor$mapResponse$1.I$0 = i3;
                        chargersFeedbackScreenInteractor$mapResponse$1.I$1 = i2;
                        chargersFeedbackScreenInteractor$mapResponse$1.label = 3;
                        d = d(chargersOrderDetailsDto, chargersSurgeModalDto, chargersFeedbackScreenInteractor$mapResponse$1);
                        if (d != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    chargersFeedbackScreenInteractor$mapResponse$1.L$0 = chargersFeedbackResponseDto2;
                    chargersFeedbackScreenInteractor$mapResponse$1.L$1 = null;
                    chargersFeedbackScreenInteractor$mapResponse$1.L$2 = chargersFinishedOrderDto2;
                    chargersFeedbackScreenInteractor$mapResponse$1.L$3 = null;
                    chargersFeedbackScreenInteractor$mapResponse$1.L$4 = str3;
                    chargersFeedbackScreenInteractor$mapResponse$1.L$5 = nvi0Var;
                    chargersFeedbackScreenInteractor$mapResponse$1.L$6 = ty9Var;
                    chargersFeedbackScreenInteractor$mapResponse$1.I$0 = i3;
                    chargersFeedbackScreenInteractor$mapResponse$1.I$1 = i2;
                    chargersFeedbackScreenInteractor$mapResponse$1.label = 2;
                    Object n2 = bvf0.n(new ChargersFeedbackScreenInteractor$mapPromoPlate$2(chargersFeedbackScreenPromoPlateDto, this, null), chargersFeedbackScreenInteractor$mapResponse$1);
                    if (n2 != coroutineSingletons) {
                        chargersFeedbackResponseDto3 = chargersFeedbackResponseDto2;
                        chargersFinishedOrderDto3 = chargersFinishedOrderDto2;
                        obj2 = n2;
                        dz9Var = (dz9) obj2;
                        ChargersOrderDetailsDto chargersOrderDetailsDto2 = chargersFinishedOrderDto3.d;
                        ChargersSurgeModalDto chargersSurgeModalDto2 = chargersFinishedOrderDto3.e;
                        chargersFeedbackScreenInteractor$mapResponse$1.L$0 = chargersFeedbackResponseDto3;
                        chargersFeedbackScreenInteractor$mapResponse$1.L$1 = null;
                        chargersFeedbackScreenInteractor$mapResponse$1.L$2 = chargersFinishedOrderDto3;
                        chargersFeedbackScreenInteractor$mapResponse$1.L$3 = str3;
                        chargersFeedbackScreenInteractor$mapResponse$1.L$4 = nvi0Var;
                        chargersFeedbackScreenInteractor$mapResponse$1.L$5 = ty9Var;
                        chargersFeedbackScreenInteractor$mapResponse$1.L$6 = dz9Var;
                        chargersFeedbackScreenInteractor$mapResponse$1.I$0 = i3;
                        chargersFeedbackScreenInteractor$mapResponse$1.I$1 = i2;
                        chargersFeedbackScreenInteractor$mapResponse$1.label = 3;
                        d = d(chargersOrderDetailsDto2, chargersSurgeModalDto2, chargersFeedbackScreenInteractor$mapResponse$1);
                        if (d != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        i2 = chargersFeedbackScreenInteractor$mapResponse$1.I$1;
                        i3 = chargersFeedbackScreenInteractor$mapResponse$1.I$0;
                        ty9Var = (ty9) chargersFeedbackScreenInteractor$mapResponse$1.L$6;
                        nvi0Var = (nvi0) chargersFeedbackScreenInteractor$mapResponse$1.L$5;
                        str3 = (String) chargersFeedbackScreenInteractor$mapResponse$1.L$4;
                        chargersFinishedOrderDto3 = (ChargersFinishedOrderDto) chargersFeedbackScreenInteractor$mapResponse$1.L$2;
                        chargersFeedbackResponseDto3 = (ChargersFeedbackResponseDto) chargersFeedbackScreenInteractor$mapResponse$1.L$0;
                        kotlin.b.b(obj2);
                        dz9Var = (dz9) obj2;
                        ChargersOrderDetailsDto chargersOrderDetailsDto22 = chargersFinishedOrderDto3.d;
                        ChargersSurgeModalDto chargersSurgeModalDto22 = chargersFinishedOrderDto3.e;
                        chargersFeedbackScreenInteractor$mapResponse$1.L$0 = chargersFeedbackResponseDto3;
                        chargersFeedbackScreenInteractor$mapResponse$1.L$1 = null;
                        chargersFeedbackScreenInteractor$mapResponse$1.L$2 = chargersFinishedOrderDto3;
                        chargersFeedbackScreenInteractor$mapResponse$1.L$3 = str3;
                        chargersFeedbackScreenInteractor$mapResponse$1.L$4 = nvi0Var;
                        chargersFeedbackScreenInteractor$mapResponse$1.L$5 = ty9Var;
                        chargersFeedbackScreenInteractor$mapResponse$1.L$6 = dz9Var;
                        chargersFeedbackScreenInteractor$mapResponse$1.I$0 = i3;
                        chargersFeedbackScreenInteractor$mapResponse$1.I$1 = i2;
                        chargersFeedbackScreenInteractor$mapResponse$1.label = 3;
                        d = d(chargersOrderDetailsDto22, chargersSurgeModalDto22, chargersFeedbackScreenInteractor$mapResponse$1);
                        if (d != coroutineSingletons) {
                            dz9Var2 = dz9Var;
                            obj2 = d;
                            int i7 = i3;
                            ty9Var2 = ty9Var;
                            chargersFinishedOrderDto4 = chargersFinishedOrderDto3;
                            v0a v0aVar2 = (v0a) obj2;
                            ChargersFeedbackItemsDto chargersFeedbackItemsDto = chargersFeedbackResponseDto3.d;
                            chargersFeedbackScreenInteractor$mapResponse$1.L$0 = null;
                            chargersFeedbackScreenInteractor$mapResponse$1.L$1 = null;
                            chargersFeedbackScreenInteractor$mapResponse$1.L$2 = chargersFinishedOrderDto4;
                            chargersFeedbackScreenInteractor$mapResponse$1.L$3 = str3;
                            chargersFeedbackScreenInteractor$mapResponse$1.L$4 = nvi0Var;
                            chargersFeedbackScreenInteractor$mapResponse$1.L$5 = ty9Var2;
                            chargersFeedbackScreenInteractor$mapResponse$1.L$6 = dz9Var2;
                            chargersFeedbackScreenInteractor$mapResponse$1.L$7 = v0aVar2;
                            chargersFeedbackScreenInteractor$mapResponse$1.I$0 = i7;
                            chargersFeedbackScreenInteractor$mapResponse$1.I$1 = i2;
                            chargersFeedbackScreenInteractor$mapResponse$1.label = 4;
                            c = c(chargersFeedbackItemsDto, chargersFeedbackScreenInteractor$mapResponse$1);
                            if (c != coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = chargersFeedbackScreenInteractor$mapResponse$1.I$1;
                        v0a v0aVar3 = (v0a) chargersFeedbackScreenInteractor$mapResponse$1.L$7;
                        dz9 dz9Var4 = (dz9) chargersFeedbackScreenInteractor$mapResponse$1.L$6;
                        ty9Var2 = (ty9) chargersFeedbackScreenInteractor$mapResponse$1.L$5;
                        nvi0 nvi0Var3 = (nvi0) chargersFeedbackScreenInteractor$mapResponse$1.L$4;
                        String str5 = (String) chargersFeedbackScreenInteractor$mapResponse$1.L$3;
                        chargersFinishedOrderDto4 = (ChargersFinishedOrderDto) chargersFeedbackScreenInteractor$mapResponse$1.L$2;
                        kotlin.b.b(obj2);
                        nvi0Var2 = nvi0Var3;
                        str3 = str5;
                        v0aVar = v0aVar3;
                        dz9Var3 = dz9Var4;
                        zy9 zy9Var = (zy9) obj2;
                        i5 = nz9.a[chargersFinishedOrderDto4.g.ordinal()];
                        if (i5 != 1) {
                            chargersFeedbackCompletedOrder$FinishingStage = ChargersFeedbackCompletedOrder$FinishingStage.FREE_CHECK_SECONDS;
                        } else {
                            if (i5 != 2) {
                                w511.b();
                                return null;
                            }
                            chargersFeedbackCompletedOrder$FinishingStage = ChargersFeedbackCompletedOrder$FinishingStage.DEFAULT;
                        }
                        return new az9(str3, nvi0Var2, i4 == 0, ty9Var2, dz9Var3, v0aVar, zy9Var, chargersFeedbackCompletedOrder$FinishingStage);
                    }
                    i2 = chargersFeedbackScreenInteractor$mapResponse$1.I$1;
                    i3 = chargersFeedbackScreenInteractor$mapResponse$1.I$0;
                    dz9Var2 = (dz9) chargersFeedbackScreenInteractor$mapResponse$1.L$6;
                    ty9Var = (ty9) chargersFeedbackScreenInteractor$mapResponse$1.L$5;
                    nvi0Var = (nvi0) chargersFeedbackScreenInteractor$mapResponse$1.L$4;
                    str3 = (String) chargersFeedbackScreenInteractor$mapResponse$1.L$3;
                    chargersFinishedOrderDto3 = (ChargersFinishedOrderDto) chargersFeedbackScreenInteractor$mapResponse$1.L$2;
                    chargersFeedbackResponseDto3 = (ChargersFeedbackResponseDto) chargersFeedbackScreenInteractor$mapResponse$1.L$0;
                    kotlin.b.b(obj2);
                    int i72 = i3;
                    ty9Var2 = ty9Var;
                    chargersFinishedOrderDto4 = chargersFinishedOrderDto3;
                    v0a v0aVar22 = (v0a) obj2;
                    ChargersFeedbackItemsDto chargersFeedbackItemsDto2 = chargersFeedbackResponseDto3.d;
                    chargersFeedbackScreenInteractor$mapResponse$1.L$0 = null;
                    chargersFeedbackScreenInteractor$mapResponse$1.L$1 = null;
                    chargersFeedbackScreenInteractor$mapResponse$1.L$2 = chargersFinishedOrderDto4;
                    chargersFeedbackScreenInteractor$mapResponse$1.L$3 = str3;
                    chargersFeedbackScreenInteractor$mapResponse$1.L$4 = nvi0Var;
                    chargersFeedbackScreenInteractor$mapResponse$1.L$5 = ty9Var2;
                    chargersFeedbackScreenInteractor$mapResponse$1.L$6 = dz9Var2;
                    chargersFeedbackScreenInteractor$mapResponse$1.L$7 = v0aVar22;
                    chargersFeedbackScreenInteractor$mapResponse$1.I$0 = i72;
                    chargersFeedbackScreenInteractor$mapResponse$1.I$1 = i2;
                    chargersFeedbackScreenInteractor$mapResponse$1.label = 4;
                    c = c(chargersFeedbackItemsDto2, chargersFeedbackScreenInteractor$mapResponse$1);
                    if (c != coroutineSingletons) {
                        dz9Var3 = dz9Var2;
                        nvi0Var2 = nvi0Var;
                        v0aVar = v0aVar22;
                        obj2 = c;
                        i4 = i2;
                        zy9 zy9Var2 = (zy9) obj2;
                        i5 = nz9.a[chargersFinishedOrderDto4.g.ordinal()];
                        if (i5 != 1) {
                        }
                        return new az9(str3, nvi0Var2, i4 == 0, ty9Var2, dz9Var3, v0aVar, zy9Var2, chargersFeedbackCompletedOrder$FinishingStage);
                    }
                    return coroutineSingletons;
                }
                i2 = chargersFeedbackScreenInteractor$mapResponse$1.I$1;
                i3 = chargersFeedbackScreenInteractor$mapResponse$1.I$0;
                a = (nvi0) chargersFeedbackScreenInteractor$mapResponse$1.L$5;
                str2 = (String) chargersFeedbackScreenInteractor$mapResponse$1.L$4;
                chargersFinishedOrderDto = (ChargersFinishedOrderDto) chargersFeedbackScreenInteractor$mapResponse$1.L$2;
                chargersFeedbackResponseDto2 = (ChargersFeedbackResponseDto) chargersFeedbackScreenInteractor$mapResponse$1.L$0;
                kotlin.b.b(obj2);
                nvi0 nvi0Var4 = a;
                ty9Var = (ty9) obj2;
                chargersFinishedOrderDto2 = chargersFinishedOrderDto;
                str3 = str2;
                nvi0Var = nvi0Var4;
                chargersFeedbackScreenPromoPlateDto = chargersFeedbackResponseDto2.c;
                if (chargersFeedbackScreenPromoPlateDto == null) {
                }
            }
        }
        chargersFeedbackScreenInteractor$mapResponse$1 = new ChargersFeedbackScreenInteractor$mapResponse$1(this, continuationImpl);
        Object obj22 = chargersFeedbackScreenInteractor$mapResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersFeedbackScreenInteractor$mapResponse$1.label;
        if (i != 0) {
        }
        nvi0 nvi0Var42 = a;
        ty9Var = (ty9) obj22;
        chargersFinishedOrderDto2 = chargersFinishedOrderDto;
        str3 = str2;
        nvi0Var = nvi0Var42;
        chargersFeedbackScreenPromoPlateDto = chargersFeedbackResponseDto2.c;
        if (chargersFeedbackScreenPromoPlateDto == null) {
        }
    }
}
