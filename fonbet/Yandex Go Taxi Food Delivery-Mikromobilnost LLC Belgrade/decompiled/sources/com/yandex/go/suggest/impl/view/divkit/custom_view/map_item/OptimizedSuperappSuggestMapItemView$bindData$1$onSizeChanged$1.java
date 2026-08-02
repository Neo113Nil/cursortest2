package com.yandex.go.suggest.impl.view.divkit.custom_view.map_item;

import com.yandex.go.design.view.GoImageView;
import com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.SuperappSuggestMapItemViewProperties;
import defpackage.at5;
import defpackage.b64;
import defpackage.gw00;
import defpackage.lbm;
import defpackage.mvg;
import defpackage.nac;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pwy0;
import defpackage.s6u0;
import defpackage.sd70;
import defpackage.tcc;
import defpackage.td70;
import defpackage.tse;
import defpackage.wls;
import defpackage.zoi;
import defpackage.zuj0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.map_common.image.StaticMapImageConfig$MapType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.OptimizedSuperappSuggestMapItemView$bindData$1$onSizeChanged$1", f = "OptimizedSuperappSuggestMapItemView.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class OptimizedSuperappSuggestMapItemView$bindData$1$onSizeChanged$1 extends SuspendLambda implements wls {
    final /* synthetic */ SuperappSuggestMapItemViewProperties $data;
    final /* synthetic */ Ref$ObjectRef<SuperappSuggestMapItemErrorView> $errorView;
    final /* synthetic */ int $height;
    final /* synthetic */ pav $imageLoader;
    final /* synthetic */ String $imageUrlHost;
    final /* synthetic */ Ref$ObjectRef<GoImageView> $imageView;
    final /* synthetic */ Map<SuperappSuggestMapItemPinView, SuperappSuggestMapItemViewProperties.SuggestMapLocation> $pinLocations;
    final /* synthetic */ List<SuperappSuggestMapItemPinView> $pinViews;
    final /* synthetic */ zuj0 $resourceProxy;
    final /* synthetic */ ru.yandex.taxi.map_common.image.a $staticMapImageInteractor;
    final /* synthetic */ pwy0 $themeSwitcherProvider;
    final /* synthetic */ int $width;
    Object L$0;
    int label;
    final /* synthetic */ OptimizedSuperappSuggestMapItemView this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.OptimizedSuperappSuggestMapItemView$bindData$1$onSizeChanged$1$1", f = "OptimizedSuperappSuggestMapItemView.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.suggest.impl.view.divkit.custom_view.map_item.OptimizedSuperappSuggestMapItemView$bindData$1$onSizeChanged$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ SuperappSuggestMapItemViewProperties $data;
        final /* synthetic */ Ref$ObjectRef<SuperappSuggestMapItemErrorView> $errorView;
        final /* synthetic */ int $height;
        final /* synthetic */ pav $imageLoader;
        final /* synthetic */ String $imageUrlHost;
        final /* synthetic */ Ref$ObjectRef<GoImageView> $imageView;
        final /* synthetic */ List<SuperappSuggestMapItemPinView> $pinViews;
        final /* synthetic */ Map<SuperappSuggestMapItemPinView, sd70> $preparedPinsOffsets;
        final /* synthetic */ zuj0 $resourceProxy;
        final /* synthetic */ ru.yandex.taxi.map_common.image.a $staticMapImageInteractor;
        final /* synthetic */ pwy0 $themeSwitcherProvider;
        final /* synthetic */ int $width;
        int label;
        final /* synthetic */ OptimizedSuperappSuggestMapItemView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, int i2, pav pavVar, zuj0 zuj0Var, pwy0 pwy0Var, OptimizedSuperappSuggestMapItemView optimizedSuperappSuggestMapItemView, SuperappSuggestMapItemViewProperties superappSuggestMapItemViewProperties, String str, List list, Map map, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, ru.yandex.taxi.map_common.image.a aVar) {
            super(2, continuation);
            this.this$0 = optimizedSuperappSuggestMapItemView;
            this.$preparedPinsOffsets = map;
            this.$staticMapImageInteractor = aVar;
            this.$imageUrlHost = str;
            this.$data = superappSuggestMapItemViewProperties;
            this.$themeSwitcherProvider = pwy0Var;
            this.$height = i;
            this.$width = i2;
            this.$imageLoader = pavVar;
            this.$imageView = ref$ObjectRef;
            this.$errorView = ref$ObjectRef2;
            this.$resourceProxy = zuj0Var;
            this.$pinViews = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            OptimizedSuperappSuggestMapItemView optimizedSuperappSuggestMapItemView = this.this$0;
            Map<SuperappSuggestMapItemPinView, sd70> map = this.$preparedPinsOffsets;
            ru.yandex.taxi.map_common.image.a aVar = this.$staticMapImageInteractor;
            String str = this.$imageUrlHost;
            SuperappSuggestMapItemViewProperties superappSuggestMapItemViewProperties = this.$data;
            pwy0 pwy0Var = this.$themeSwitcherProvider;
            return new AnonymousClass1(this.$height, this.$width, this.$imageLoader, this.$resourceProxy, pwy0Var, optimizedSuperappSuggestMapItemView, superappSuggestMapItemViewProperties, str, this.$pinViews, map, continuation, this.$imageView, this.$errorView, aVar);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Map map;
            Map map2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            map = this.this$0.pinsOffsets;
            map.putAll(this.$preparedPinsOffsets);
            map2 = this.this$0.pinsOffsets;
            for (Map.Entry entry : map2.entrySet()) {
                SuperappSuggestMapItemPinView superappSuggestMapItemPinView = (SuperappSuggestMapItemPinView) entry.getKey();
                sd70 sd70Var = (sd70) entry.getValue();
                superappSuggestMapItemPinView.setX(sd70Var.a);
                superappSuggestMapItemPinView.setY(sd70Var.b);
            }
            OptimizedSuperappSuggestMapItemView optimizedSuperappSuggestMapItemView = this.this$0;
            ru.yandex.taxi.map_common.image.a aVar = this.$staticMapImageInteractor;
            String j = b64.j(this.$imageUrlHost, "get-map/v1");
            SuperappSuggestMapItemViewProperties.SuggestMapLocation suggestMapLocation = this.$data.a.a;
            zzs zzsVar = new zzs(suggestMapLocation.a, suggestMapLocation.b, 0, null, null, 28);
            SuperappSuggestMapItemViewProperties.SuggestMapLocation suggestMapLocation2 = this.$data.a.b;
            optimizedSuperappSuggestMapItemView.imageUrl = aVar.d(j, zzsVar, new zzs(suggestMapLocation2.a, suggestMapLocation2.b, 0, null, null, 28), this.$data.d, this.$themeSwitcherProvider.getThemeType().c(), new s6u0(new Integer(this.$height), new Integer(this.$width), (Integer) null, (StaticMapImageConfig$MapType) null));
            OptimizedSuperappSuggestMapItemView optimizedSuperappSuggestMapItemView2 = this.this$0;
            pav pavVar = this.$imageLoader;
            GoImageView goImageView = this.$imageView.element;
            lbm a = pavVar.a(goImageView != null ? goImageView : null);
            Ref$ObjectRef<SuperappSuggestMapItemErrorView> ref$ObjectRef = this.$errorView;
            OptimizedSuperappSuggestMapItemView optimizedSuperappSuggestMapItemView3 = this.this$0;
            SuperappSuggestMapItemViewProperties superappSuggestMapItemViewProperties = this.$data;
            zuj0 zuj0Var = this.$resourceProxy;
            Ref$ObjectRef<GoImageView> ref$ObjectRef2 = this.$imageView;
            List<SuperappSuggestMapItemPinView> list = this.$pinViews;
            nac nacVar = (nac) a;
            nacVar.i = new zoi(ref$ObjectRef, optimizedSuperappSuggestMapItemView3, superappSuggestMapItemViewProperties, zuj0Var, ref$ObjectRef2, list, 3);
            nacVar.h = new at5(ref$ObjectRef, optimizedSuperappSuggestMapItemView3, superappSuggestMapItemViewProperties, zuj0Var, ref$ObjectRef2, list, 8);
            optimizedSuperappSuggestMapItemView2.drawableRequest = nacVar;
            this.this$0.loadMapImage();
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptimizedSuperappSuggestMapItemView$bindData$1$onSizeChanged$1(int i, int i2, pav pavVar, zuj0 zuj0Var, pwy0 pwy0Var, OptimizedSuperappSuggestMapItemView optimizedSuperappSuggestMapItemView, SuperappSuggestMapItemViewProperties superappSuggestMapItemViewProperties, String str, List list, Map map, Continuation continuation, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, ru.yandex.taxi.map_common.image.a aVar) {
        super(2, continuation);
        this.$pinViews = list;
        this.this$0 = optimizedSuperappSuggestMapItemView;
        this.$pinLocations = map;
        this.$data = superappSuggestMapItemViewProperties;
        this.$width = i;
        this.$height = i2;
        this.$staticMapImageInteractor = aVar;
        this.$imageUrlHost = str;
        this.$themeSwitcherProvider = pwy0Var;
        this.$imageLoader = pavVar;
        this.$imageView = ref$ObjectRef;
        this.$errorView = ref$ObjectRef2;
        this.$resourceProxy = zuj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        List<SuperappSuggestMapItemPinView> list = this.$pinViews;
        OptimizedSuperappSuggestMapItemView optimizedSuperappSuggestMapItemView = this.this$0;
        Map<SuperappSuggestMapItemPinView, SuperappSuggestMapItemViewProperties.SuggestMapLocation> map = this.$pinLocations;
        SuperappSuggestMapItemViewProperties superappSuggestMapItemViewProperties = this.$data;
        int i = this.$width;
        int i2 = this.$height;
        ru.yandex.taxi.map_common.image.a aVar = this.$staticMapImageInteractor;
        String str = this.$imageUrlHost;
        pwy0 pwy0Var = this.$themeSwitcherProvider;
        return new OptimizedSuperappSuggestMapItemView$bindData$1$onSizeChanged$1(i, i2, this.$imageLoader, this.$resourceProxy, pwy0Var, optimizedSuperappSuggestMapItemView, superappSuggestMapItemViewProperties, str, list, map, continuation, this.$imageView, this.$errorView, aVar);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OptimizedSuperappSuggestMapItemView$bindData$1$onSizeChanged$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object runOnMainThreadIfActive;
        td70 pinOffsetPercent;
        float pinOffsetPx;
        float pinOffsetPx2;
        float pinOffsetPx3;
        float pinOffsetPx4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List<SuperappSuggestMapItemPinView> list = this.$pinViews;
            OptimizedSuperappSuggestMapItemView optimizedSuperappSuggestMapItemView = this.this$0;
            Map<SuperappSuggestMapItemPinView, SuperappSuggestMapItemViewProperties.SuggestMapLocation> map = this.$pinLocations;
            SuperappSuggestMapItemViewProperties superappSuggestMapItemViewProperties = this.$data;
            int i2 = this.$width;
            int i3 = this.$height;
            int d = gw00.d(tcc.n(list, 10));
            if (d < 16) {
                d = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                SuperappSuggestMapItemPinView superappSuggestMapItemPinView = (SuperappSuggestMapItemPinView) next;
                pinOffsetPercent = optimizedSuperappSuggestMapItemView.pinOffsetPercent(map.get(superappSuggestMapItemPinView), superappSuggestMapItemViewProperties.a);
                float f = pinOffsetPercent.a;
                float f2 = pinOffsetPercent.b;
                pinOffsetPx = optimizedSuperappSuggestMapItemView.pinOffsetPx(f, i2, superappSuggestMapItemPinView.getMeasuredWidth());
                pinOffsetPx2 = optimizedSuperappSuggestMapItemView.pinOffsetPx(f2, i3, superappSuggestMapItemPinView.getPinHeight());
                Iterator it2 = it;
                pinOffsetPx3 = optimizedSuperappSuggestMapItemView.pinOffsetPx(pinOffsetPercent.a, i2, superappSuggestMapItemPinView.getSmallPinSize());
                pinOffsetPx4 = optimizedSuperappSuggestMapItemView.pinOffsetPx(f2, i3, superappSuggestMapItemPinView.getSmallPinSize());
                linkedHashMap.put(next, new sd70(pinOffsetPx, pinOffsetPx2, pinOffsetPx3, pinOffsetPx4));
                it = it2;
            }
            OptimizedSuperappSuggestMapItemView optimizedSuperappSuggestMapItemView2 = this.this$0;
            ru.yandex.taxi.map_common.image.a aVar = this.$staticMapImageInteractor;
            String str = this.$imageUrlHost;
            SuperappSuggestMapItemViewProperties superappSuggestMapItemViewProperties2 = this.$data;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$height, this.$width, this.$imageLoader, this.$resourceProxy, this.$themeSwitcherProvider, optimizedSuperappSuggestMapItemView2, superappSuggestMapItemViewProperties2, str, this.$pinViews, linkedHashMap, null, this.$imageView, this.$errorView, aVar);
            this.L$0 = null;
            this.label = 1;
            runOnMainThreadIfActive = optimizedSuperappSuggestMapItemView2.runOnMainThreadIfActive(anonymousClass1, this);
            if (runOnMainThreadIfActive == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
