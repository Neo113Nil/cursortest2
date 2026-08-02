package com.yandex.go.suggest.impl.view.divkit.custom_view.map_item;

import android.content.Context;
import android.graphics.Rect;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.SuperappSuggestMapItemViewProperties;
import defpackage.agw0;
import defpackage.bgw0;
import defpackage.eja1;
import defpackage.gw00;
import defpackage.k7x0;
import defpackage.l8x;
import defpackage.lbm;
import defpackage.nac;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pav;
import defpackage.pey;
import defpackage.pwy0;
import defpackage.qje;
import defpackage.scc;
import defpackage.seu;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vng;
import defpackage.wls;
import defpackage.xng0;
import defpackage.y6i0;
import defpackage.ym11;
import defpackage.zfw0;
import defpackage.zuj0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;

@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 N2\u00020\u0001:\u0003O\u0011KB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001f\u001a\u00020\u001e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J#\u0010'\u001a\u00020&2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010%\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b'\u0010(J5\u0010/\u001a\u0004\u0018\u00010.2\"\u0010-\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0+\u0012\u0006\u0012\u0004\u0018\u00010,0)H\u0002¢\u0006\u0004\b/\u00100J4\u00101\u001a\u00020\u001e2\"\u0010-\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0+\u0012\u0006\u0012\u0004\u0018\u00010,0)H\u0082@¢\u0006\u0004\b1\u00102JE\u0010=\u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u0002092\u0006\u0010\t\u001a\u00020\b2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\u00020\u001eH\u0000¢\u0006\u0004\b?\u0010\"R\u001e\u0010C\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010E\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010G\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010I\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010HR \u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020K0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006P"}, d2 = {"Lcom/yandex/go/suggest/impl/view/divkit/custom_view/map_item/SuperappSuggestMapItemView;", "Lru/yandex/taxi/widget/ShimmeringFrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/yandex/go/suggest/impl/view/divkit/custom_view/map_item/SuperappSuggestMapItemViewProperties;", Constants.KEY_DATA, "Lzuj0;", "resourceProxy", "Lcom/yandex/go/suggest/impl/view/divkit/custom_view/map_item/SuperappSuggestMapItemErrorView;", "addErrorView", "(Lcom/yandex/go/suggest/impl/view/divkit/custom_view/map_item/SuperappSuggestMapItemViewProperties;Lzuj0;)Lcom/yandex/go/suggest/impl/view/divkit/custom_view/map_item/SuperappSuggestMapItemErrorView;", "Lcom/yandex/go/suggest/impl/view/divkit/custom_view/map_item/SuperappSuggestMapItemViewProperties$SuggestMapLocation;", "pinLocation", "Lcom/yandex/go/suggest/impl/view/divkit/custom_view/map_item/SuperappSuggestMapItemViewProperties$SuggestMapItemBbox;", "bbox", "Lbgw0;", "pinOffsetPercent", "(Lcom/yandex/go/suggest/impl/view/divkit/custom_view/map_item/SuperappSuggestMapItemViewProperties$SuggestMapLocation;Lcom/yandex/go/suggest/impl/view/divkit/custom_view/map_item/SuperappSuggestMapItemViewProperties$SuggestMapItemBbox;)Lbgw0;", "", "offsetPercent", "", "mapSize", "pinSize", "pinOffsetPx", "(FII)F", "", "Lcom/yandex/go/suggest/impl/view/divkit/custom_view/map_item/SuperappSuggestMapItemPinView;", "allPins", "Lzy11;", "removeIntersections", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadMapImage", "()V", "Landroid/graphics/Rect;", "rect1", "rect2", "", "intersects", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z", "Lkotlin/Function2;", "Ltse;", "Lkotlin/coroutines/Continuation;", "", "block", "Ll8x;", "runAsync", "(Lwls;)Ll8x;", "runOnMainThreadIfActive", "(Lwls;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "imageUrlHost", "Lpav;", "imageLoader", "Lpwy0;", "themeSwitcherProvider", "Lk7x0;", "iconTagUrlFormatter", "Lru/yandex/taxi/map_common/image/a;", "staticMapImageInteractor", "bindData", "(Lcom/yandex/go/suggest/impl/view/divkit/custom_view/map_item/SuperappSuggestMapItemViewProperties;Ljava/lang/String;Lpav;Lpwy0;Lk7x0;Lzuj0;Lru/yandex/taxi/map_common/image/a;)V", "resetState$impl", "resetState", "Llbm;", "Landroid/widget/ImageView;", "drawableRequest", "Llbm;", "imageUrl", "Ljava/lang/String;", "preparationsJob", "Ll8x;", "intersectionsJob", "", "Lagw0;", "pinsOffsets", "Ljava/util/Map;", "Companion", "zfw0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperappSuggestMapItemView extends ShimmeringFrameLayout {
    public static final zfw0 Companion = new zfw0();
    private static final String MAP_URL = "get-map/v1";
    private lbm drawableRequest;
    private String imageUrl;
    private l8x intersectionsJob;
    private final Map<SuperappSuggestMapItemPinView, agw0> pinsOffsets;
    private l8x preparationsJob;

    public SuperappSuggestMapItemView(Context context) {
        super(context, null, 0, 6, null);
        this.pinsOffsets = new LinkedHashMap();
        setBackgroundColor(qje.t(xng0.bgMinor, getContext()));
        setClipChildren(false);
    }

    private final SuperappSuggestMapItemErrorView addErrorView(SuperappSuggestMapItemViewProperties data, zuj0 resourceProxy) {
        SuperappSuggestMapItemErrorView data2 = new SuperappSuggestMapItemErrorView(getContext()).setData(data.c < 1.0f, resourceProxy, new SuperappSuggestMapItemView$addErrorView$errorView$1(0, this, SuperappSuggestMapItemView.class, "loadMapImage", "loadMapImage()V", 0));
        addView(data2);
        return data2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.SuperappSuggestMapItemErrorView] */
    public static final void bindData$onImageLoaded(Ref$ObjectRef<SuperappSuggestMapItemErrorView> ref$ObjectRef, SuperappSuggestMapItemView superappSuggestMapItemView, SuperappSuggestMapItemViewProperties superappSuggestMapItemViewProperties, zuj0 zuj0Var, Ref$ObjectRef<GoImageView> ref$ObjectRef2, List<SuperappSuggestMapItemPinView> list, boolean z) {
        if (!z && ref$ObjectRef.element == null) {
            ref$ObjectRef.element = superappSuggestMapItemView.addErrorView(superappSuggestMapItemViewProperties, zuj0Var);
        }
        superappSuggestMapItemView.setShimmering(false);
        GoImageView goImageView = ref$ObjectRef2.element;
        (goImageView == null ? null : goImageView).setVisibility(z ? 0 : 8);
        SuperappSuggestMapItemErrorView superappSuggestMapItemErrorView = ref$ObjectRef.element;
        if (superappSuggestMapItemErrorView != null) {
            superappSuggestMapItemErrorView.setVisibility(z ? 8 : 0);
        }
        if (z) {
            superappSuggestMapItemView.intersectionsJob = superappSuggestMapItemView.runAsync(new SuperappSuggestMapItemView$bindData$onImageLoaded$1(superappSuggestMapItemView, list, null));
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((SuperappSuggestMapItemPinView) it.next()).setVisibility(8);
        }
    }

    private final boolean intersects(Rect rect1, Rect rect2) {
        return (rect1 == null || rect2 == null || !Rect.intersects(rect1, rect2)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadMapImage() {
        lbm lbmVar;
        setShimmering(true);
        String str = this.imageUrl;
        if (str == null || (lbmVar = this.drawableRequest) == null) {
            return;
        }
        ((nac) lbmVar).c(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bgw0 pinOffsetPercent(SuperappSuggestMapItemViewProperties.SuggestMapLocation pinLocation, SuperappSuggestMapItemViewProperties.SuggestMapItemBbox bbox) {
        if (pinLocation == null) {
            return new bgw0(0.0f, 0.0f);
        }
        SuperappSuggestMapItemViewProperties.SuggestMapLocation suggestMapLocation = bbox.b;
        SuperappSuggestMapItemViewProperties.SuggestMapLocation suggestMapLocation2 = bbox.b;
        SuperappSuggestMapItemViewProperties.SuggestMapLocation suggestMapLocation3 = bbox.a;
        return new bgw0((float) (Math.abs(pinLocation.b - suggestMapLocation3.b) / Math.abs(suggestMapLocation.b - suggestMapLocation3.b)), (float) (Math.abs(pinLocation.a - suggestMapLocation2.a) / Math.abs(suggestMapLocation2.a - suggestMapLocation3.a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float pinOffsetPx(float offsetPercent, int mapSize, int pinSize) {
        float f = mapSize;
        return y6i0.c((offsetPercent * f) - (pinSize / 2), 0.0f, f - pinSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0133  */
    /* JADX WARN: Type inference failed for: r18v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r18v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.SuperappSuggestMapItemView] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object removeIntersections(List<SuperappSuggestMapItemPinView> list, Continuation<? super zy11> continuation) {
        SuperappSuggestMapItemView$removeIntersections$1 superappSuggestMapItemView$removeIntersections$1;
        int i;
        Map linkedHashMap;
        List list2;
        Map map;
        List list3;
        List<SuperappSuggestMapItemPinView> list4;
        l8x l8xVar;
        int i2;
        if (continuation instanceof SuperappSuggestMapItemView$removeIntersections$1) {
            superappSuggestMapItemView$removeIntersections$1 = (SuperappSuggestMapItemView$removeIntersections$1) continuation;
            int i3 = superappSuggestMapItemView$removeIntersections$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                superappSuggestMapItemView$removeIntersections$1.label = i3 - Integer.MIN_VALUE;
                Object obj = superappSuggestMapItemView$removeIntersections$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappSuggestMapItemView$removeIntersections$1.label;
                Continuation continuation2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (((SuperappSuggestMapItemPinView) obj2).getForceSmall()) {
                            arrayList.add(obj2);
                        } else {
                            arrayList2.add(obj2);
                        }
                    }
                    Pair pair = new Pair(arrayList, arrayList2);
                    List list5 = (List) pair.getFirst();
                    List list6 = (List) pair.getSecond();
                    ArrayList arrayList3 = new ArrayList(list5);
                    List list7 = list6;
                    int d = gw00.d(tcc.n(list7, 10));
                    if (d < 16) {
                        d = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(d);
                    for (Object obj3 : list7) {
                        linkedHashMap2.put(obj3, new Rect());
                    }
                    int d2 = gw00.d(tcc.n(list7, 10));
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(d2 >= 16 ? d2 : 16);
                    for (Object obj4 : list7) {
                        linkedHashMap3.put(obj4, new ArrayList());
                    }
                    linkedHashMap = new LinkedHashMap(linkedHashMap3);
                    list2 = arrayList3;
                    map = linkedHashMap2;
                    list3 = list6;
                    list4 = list;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    linkedHashMap = (Map) superappSuggestMapItemView$removeIntersections$1.L$5;
                    map = (Map) superappSuggestMapItemView$removeIntersections$1.L$4;
                    list2 = (List) superappSuggestMapItemView$removeIntersections$1.L$3;
                    list3 = (List) superappSuggestMapItemView$removeIntersections$1.L$2;
                    List<SuperappSuggestMapItemPinView> list8 = (List) superappSuggestMapItemView$removeIntersections$1.L$0;
                    kotlin.b.b(obj);
                    list4 = list8;
                }
                while (true) {
                    l8xVar = (l8x) superappSuggestMapItemView$removeIntersections$1.get_context().get(seu.C);
                    if (l8xVar != null) {
                        kotlinx.coroutines.a.l(l8xVar);
                    }
                    if (!map.isEmpty()) {
                        for (Map.Entry entry : map.entrySet()) {
                            if (((SuperappSuggestMapItemPinView) entry.getKey()).getWidth() <= 0 || ((SuperappSuggestMapItemPinView) entry.getKey()).getHeight() <= 0) {
                                i2 = 0;
                                break;
                            }
                        }
                    }
                    i2 = 1;
                    if (i2 == 0) {
                        for (Map.Entry entry2 : map.entrySet()) {
                            int x = (int) ((SuperappSuggestMapItemPinView) entry2.getKey()).getX();
                            int y = (int) ((SuperappSuggestMapItemPinView) entry2.getKey()).getY();
                            ((Rect) entry2.getValue()).set(x, y, ((SuperappSuggestMapItemPinView) entry2.getKey()).getWidth() + x, ((SuperappSuggestMapItemPinView) entry2.getKey()).getHeight() + y);
                        }
                        List list9 = list3;
                        int i4 = 0;
                        for (Object obj5 : list9) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                ?? r18 = continuation2;
                                scc.m();
                                throw r18;
                            }
                            SuperappSuggestMapItemPinView superappSuggestMapItemPinView = (SuperappSuggestMapItemPinView) obj5;
                            Rect rect = (Rect) map.get(superappSuggestMapItemPinView);
                            int i6 = 0;
                            for (Object obj6 : list9) {
                                int i7 = i6 + 1;
                                ?? r182 = continuation2;
                                if (i6 < 0) {
                                    scc.m();
                                    throw r182;
                                }
                                SuperappSuggestMapItemPinView superappSuggestMapItemPinView2 = (SuperappSuggestMapItemPinView) obj6;
                                if (i6 > i4 && intersects(rect, (Rect) map.get(superappSuggestMapItemPinView2))) {
                                    List list10 = (List) linkedHashMap.get(superappSuggestMapItemPinView);
                                    if (list10 != null) {
                                        list10.add(superappSuggestMapItemPinView2);
                                    }
                                    List list11 = (List) linkedHashMap.get(superappSuggestMapItemPinView2);
                                    if (list11 != null) {
                                        list11.add(superappSuggestMapItemPinView);
                                    }
                                }
                                i6 = i7;
                                continuation2 = r182;
                            }
                            i4 = i5;
                        }
                        Continuation continuation3 = continuation2;
                        while (true) {
                            Object obj7 = continuation3;
                            int i8 = 0;
                            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                                int size = ((List) entry3.getValue()).size();
                                if (size > i8) {
                                    obj7 = entry3.getKey();
                                    i8 = size;
                                }
                            }
                            if (i8 == 0) {
                                break;
                            }
                            SuperappSuggestMapItemPinView superappSuggestMapItemPinView3 = (SuperappSuggestMapItemPinView) obj7;
                            if (superappSuggestMapItemPinView3 != null) {
                                list2.add(superappSuggestMapItemPinView3);
                            }
                            ym11.c(linkedHashMap).remove(obj7);
                            Iterator it = linkedHashMap.values().iterator();
                            while (it.hasNext()) {
                                ym11.a((List) it.next()).remove(obj7);
                            }
                            continuation3 = null;
                        }
                        Continuation continuation4 = continuation3;
                        SuperappSuggestMapItemView$removeIntersections$8 superappSuggestMapItemView$removeIntersections$8 = new SuperappSuggestMapItemView$removeIntersections$8(list4, list2, this, continuation4);
                        superappSuggestMapItemView$removeIntersections$1.L$0 = continuation4;
                        superappSuggestMapItemView$removeIntersections$1.L$1 = continuation4;
                        superappSuggestMapItemView$removeIntersections$1.L$2 = continuation4;
                        superappSuggestMapItemView$removeIntersections$1.L$3 = continuation4;
                        superappSuggestMapItemView$removeIntersections$1.L$4 = continuation4;
                        superappSuggestMapItemView$removeIntersections$1.L$5 = continuation4;
                        superappSuggestMapItemView$removeIntersections$1.label = 2;
                        Object runOnMainThreadIfActive = runOnMainThreadIfActive(superappSuggestMapItemView$removeIntersections$8, superappSuggestMapItemView$removeIntersections$1);
                        if (runOnMainThreadIfActive == coroutineSingletons) {
                            break;
                        }
                        return runOnMainThreadIfActive;
                    }
                    superappSuggestMapItemView$removeIntersections$1.L$0 = list4;
                    continuation2 = null;
                    superappSuggestMapItemView$removeIntersections$1.L$1 = null;
                    superappSuggestMapItemView$removeIntersections$1.L$2 = list3;
                    superappSuggestMapItemView$removeIntersections$1.L$3 = list2;
                    superappSuggestMapItemView$removeIntersections$1.L$4 = map;
                    superappSuggestMapItemView$removeIntersections$1.L$5 = linkedHashMap;
                    superappSuggestMapItemView$removeIntersections$1.I$0 = i2;
                    superappSuggestMapItemView$removeIntersections$1.label = 1;
                    if (kotlinx.coroutines.a.i(25L, superappSuggestMapItemView$removeIntersections$1) == coroutineSingletons) {
                        break;
                    }
                }
                return coroutineSingletons;
            }
        }
        superappSuggestMapItemView$removeIntersections$1 = new SuperappSuggestMapItemView$removeIntersections$1(this, continuation);
        Object obj8 = superappSuggestMapItemView$removeIntersections$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappSuggestMapItemView$removeIntersections$1.label;
        Continuation continuation22 = null;
        if (i != 0) {
        }
        while (true) {
            l8xVar = (l8x) superappSuggestMapItemView$removeIntersections$1.get_context().get(seu.C);
            if (l8xVar != null) {
            }
            if (!map.isEmpty()) {
            }
            i2 = 1;
            if (i2 == 0) {
            }
        }
        return coroutineSingletons2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l8x runAsync(wls block) {
        pey o = vng.o(this);
        if (o != null) {
            return tje.N(eja1.s(o), uyj.a, null, block, 2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runOnMainThreadIfActive(wls wlsVar, Continuation<? super zy11> continuation) {
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(o400.a, new SuperappSuggestMapItemView$runOnMainThreadIfActive$2(wlsVar, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.SuperappSuggestMapItemView$bindData$1] */
    public final void bindData(final SuperappSuggestMapItemViewProperties data, final String imageUrlHost, final pav imageLoader, final pwy0 themeSwitcherProvider, k7x0 iconTagUrlFormatter, final zuj0 resourceProxy, final ru.yandex.taxi.map_common.image.a staticMapImageInteractor) {
        resetState$impl();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        final ArrayList arrayList = new ArrayList();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final Context context = getContext();
        ref$ObjectRef.element = new GoImageView(context) { // from class: com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.SuperappSuggestMapItemView$bindData$1
            @Override // android.view.View
            public void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
                l8x runAsync;
                if (width == 0 || height == 0) {
                    return;
                }
                SuperappSuggestMapItemView superappSuggestMapItemView = SuperappSuggestMapItemView.this;
                List<SuperappSuggestMapItemPinView> list = arrayList;
                Map<SuperappSuggestMapItemPinView, SuperappSuggestMapItemViewProperties.SuggestMapLocation> map = linkedHashMap;
                SuperappSuggestMapItemViewProperties superappSuggestMapItemViewProperties = data;
                ru.yandex.taxi.map_common.image.a aVar = staticMapImageInteractor;
                String str = imageUrlHost;
                pwy0 pwy0Var = themeSwitcherProvider;
                runAsync = superappSuggestMapItemView.runAsync(new SuperappSuggestMapItemView$bindData$1$onSizeChanged$1(width, height, imageLoader, resourceProxy, pwy0Var, superappSuggestMapItemView, superappSuggestMapItemViewProperties, str, list, map, null, ref$ObjectRef, ref$ObjectRef2, aVar));
                superappSuggestMapItemView.preparationsJob = runAsync;
            }
        };
        for (SuperappSuggestMapItemViewProperties.SuggestMapPin suggestMapPin : data.b) {
            SuperappSuggestMapItemPinView data2 = new SuperappSuggestMapItemPinView(getContext()).setData(suggestMapPin, imageLoader, iconTagUrlFormatter);
            data2.setVisibility(4);
            linkedHashMap.put(data2, suggestMapPin.c);
            arrayList.add(data2);
        }
        T t = ref$ObjectRef.element;
        addView(t == 0 ? null : (GoImageView) t);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            addView((SuperappSuggestMapItemPinView) it.next());
        }
    }

    public final void resetState$impl() {
        l8x l8xVar = this.intersectionsJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.intersectionsJob = null;
        l8x l8xVar2 = this.preparationsJob;
        if (l8xVar2 != null) {
            l8xVar2.a(null);
        }
        this.preparationsJob = null;
        lbm lbmVar = this.drawableRequest;
        if (lbmVar != null) {
            nac nacVar = (nac) lbmVar;
            nacVar.a();
            nacVar.g = true;
        }
        removeAllViews();
        this.pinsOffsets.clear();
        setShimmering(true);
    }
}
