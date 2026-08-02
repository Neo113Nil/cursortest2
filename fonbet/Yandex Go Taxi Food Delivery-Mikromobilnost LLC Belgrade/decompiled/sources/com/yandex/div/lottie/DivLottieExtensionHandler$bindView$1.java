package com.yandex.div.lottie;

import android.view.View;
import com.airbnb.lottie.LottieDrawable;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.widget.LoadableImageView;
import com.yandex.div.json.expressions.Expression;
import defpackage.dtz;
import defpackage.duz;
import defpackage.egk;
import defpackage.euz;
import defpackage.g6u;
import defpackage.gtz;
import defpackage.kbs;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.o400;
import defpackage.q5z;
import defpackage.rvo;
import defpackage.seu;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.tms;
import defpackage.tse;
import defpackage.u2l;
import defpackage.uh6;
import defpackage.uyj;
import defpackage.vit;
import defpackage.wls;
import defpackage.wm11;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "com.yandex.div.lottie.DivLottieExtensionHandler$bindView$1", f = "DivLottieExtensionHandler.kt", l = {HProv.PP_NK_SYNC, 120}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DivLottieExtensionHandler$bindView$1 extends SuspendLambda implements wls {
    final /* synthetic */ egk $div;
    final /* synthetic */ Div2View $divView;
    final /* synthetic */ rvo $expressionResolver;
    final /* synthetic */ dtz $lottieController;
    final /* synthetic */ gtz $lottieData;
    final /* synthetic */ JSONObject $params;
    final /* synthetic */ View $view;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
    @mvg(c = "com.yandex.div.lottie.DivLottieExtensionHandler$bindView$1$1", f = "DivLottieExtensionHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.div.lottie.DivLottieExtensionHandler$bindView$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ egk $div;
        final /* synthetic */ Div2View $divView;
        final /* synthetic */ rvo $expressionResolver;
        final /* synthetic */ dtz $lottieController;
        final /* synthetic */ gtz $lottieData;
        final /* synthetic */ JSONObject $params;
        final /* synthetic */ euz $result;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, Div2View div2View, egk egkVar, dtz dtzVar, euz euzVar, JSONObject jSONObject, rvo rvoVar, gtz gtzVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$divView = div2View;
            this.$div = egkVar;
            this.$lottieController = dtzVar;
            this.$result = euzVar;
            this.$params = jSONObject;
            this.$expressionResolver = rvoVar;
            this.$lottieData = gtzVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$divView, this.$div, this.$lottieController, this.$result, this.$params, this.$expressionResolver, this.$lottieData, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v20, types: [T, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i;
            boolean z;
            Object obj2;
            LottieDrawable lottieDrawable;
            final ArrayList arrayList;
            rvo rvoVar;
            JSONObject jSONObject;
            LottieDrawable lottieDrawable2;
            LottieDrawable lottieDrawable3;
            kbs kbsVar = q5z.b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            Object obj3 = null;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a aVar = this.this$0;
            Div2View div2View = this.$divView;
            egk egkVar = this.$div;
            u2l u2lVar = a.y;
            aVar.getClass();
            String str = "tag: " + div2View.getDataTag() + " div: " + egkVar;
            LinkedHashMap linkedHashMap = aVar.w;
            Object obj4 = linkedHashMap.get(str);
            if (obj4 == null) {
                obj4 = new PlaybackStateController();
                linkedHashMap.put(str, obj4);
            }
            PlaybackStateController playbackStateController = (PlaybackStateController) obj4;
            this.$lottieController.l.a(playbackStateController.c);
            a aVar2 = this.this$0;
            final dtz dtzVar = this.$lottieController;
            euz euzVar = this.$result;
            JSONObject jSONObject2 = this.$params;
            rvo rvoVar2 = this.$expressionResolver;
            this.$lottieData.getClass();
            aVar2.getClass();
            u2l u2lVar2 = a.y;
            nsz nszVar = euzVar.a;
            seu seuVar = aVar2.b;
            zy11 zy11Var = zy11.a;
            if (nszVar == null) {
                seuVar.getClass();
                return zy11Var;
            }
            seuVar.getClass();
            LottieDrawable lottieDrawable4 = dtzVar.b;
            LottieDrawable lottieDrawable5 = dtzVar.b;
            LoadableImageView loadableImageView = dtzVar.a;
            lottieDrawable4.setCallback(loadableImageView);
            loadableImageView.setExternalImage(lottieDrawable4);
            loadableImageView.setImageTransformer(new vit(25, lottieDrawable4));
            dtzVar.c = nszVar;
            dtzVar.f = true;
            boolean composition = lottieDrawable4.setComposition(nszVar);
            int i2 = 0;
            dtzVar.f = false;
            dtzVar.a();
            if (loadableImageView.getDrawable() != lottieDrawable4 || composition) {
                if (!composition) {
                    boolean isAnimating = lottieDrawable4.isAnimating();
                    loadableImageView.setImageDrawable(null);
                    loadableImageView.setImageDrawable(lottieDrawable4);
                    loadableImageView.imageLoaded();
                    if (isAnimating) {
                        lottieDrawable4.resumeAnimation();
                    }
                }
                loadableImageView.getVisibility();
                dtzVar.b();
                loadableImageView.requestLayout();
            }
            JSONArray optJSONArray = jSONObject2.optJSONArray("repeats");
            String str2 = "repeat_count";
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                ArrayList arrayList2 = new ArrayList(length);
                while (i2 < length) {
                    Object obj5 = obj3;
                    Object obj6 = optJSONArray.get(i2);
                    u2l u2lVar3 = u2lVar2;
                    Object obj7 = obj6 instanceof JSONObject ? (JSONObject) obj6 : obj5;
                    if (obj7 != null) {
                        arrayList2.add(obj7);
                    }
                    i2++;
                    obj3 = obj5;
                    u2lVar2 = u2lVar3;
                }
                u2l u2lVar4 = u2lVar2;
                obj2 = obj3;
                ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                LottieDrawable lottieDrawable6 = lottieDrawable4;
                while (it.hasNext()) {
                    JSONObject jSONObject3 = (JSONObject) it.next();
                    u2l u2lVar5 = a.y;
                    tms tmsVar = wm11.b;
                    tls tlsVar = com.yandex.div.internal.parser.b.h;
                    Expression d = com.yandex.div.internal.parser.a.d(u2lVar5, jSONObject3, str2, tmsVar, tlsVar);
                    int R = d != null ? uh6.R(d, rvoVar2) : 1;
                    int B = uh6.B(jSONObject3, rvoVar2);
                    int i3 = R;
                    LottieDrawable lottieDrawable7 = lottieDrawable6;
                    LottieDrawable lottieDrawable8 = lottieDrawable5;
                    a aVar3 = aVar2;
                    String str3 = str2;
                    JSONObject jSONObject4 = jSONObject2;
                    u2l u2lVar6 = u2lVar4;
                    Expression e = com.yandex.div.internal.parser.a.e(u2lVar6, jSONObject3, "min_frame", tmsVar, tlsVar, kbsVar, null);
                    int R2 = e != null ? uh6.R(e, rvoVar2) : (int) nszVar.l;
                    PlaybackStateController playbackStateController2 = playbackStateController;
                    Expression e2 = com.yandex.div.internal.parser.a.e(u2lVar6, jSONObject3, "max_frame", tmsVar, tlsVar, kbsVar, null);
                    arrayList3.add(new duz(i3, B, R2, e2 != null ? uh6.R(e2, rvoVar2) : (int) nszVar.m));
                    u2lVar4 = u2lVar6;
                    str2 = str3;
                    jSONObject2 = jSONObject4;
                    lottieDrawable6 = lottieDrawable7;
                    lottieDrawable5 = lottieDrawable8;
                    playbackStateController = playbackStateController2;
                    aVar2 = aVar3;
                }
                lottieDrawable = lottieDrawable6;
                u2lVar2 = u2lVar4;
                i = 1;
                z = false;
                arrayList = arrayList3;
            } else {
                i = 1;
                z = false;
                obj2 = null;
                lottieDrawable = lottieDrawable4;
                arrayList = null;
            }
            PlaybackStateController playbackStateController3 = playbackStateController;
            final a aVar4 = aVar2;
            JSONObject jSONObject5 = jSONObject2;
            LottieDrawable lottieDrawable9 = lottieDrawable5;
            String str4 = str2;
            if (arrayList != null) {
                final Ref$IntRef ref$IntRef = new Ref$IntRef();
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ?? S = kotlin.collections.a.S(ref$IntRef.element, arrayList);
                ref$ObjectRef.element = S;
                final tls tlsVar2 = new tls() { // from class: com.yandex.div.lottie.DivLottieExtensionHandler$setupRepeatList$update$1
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj8) {
                        duz duzVar = (duz) obj8;
                        dtz dtzVar2 = dtz.this;
                        dtzVar2.b.setRepeatCount(duzVar.a);
                        dtz dtzVar3 = dtz.this;
                        dtzVar3.b.setRepeatMode(duzVar.b);
                        dtz dtzVar4 = dtz.this;
                        dtzVar4.b.setMinFrame(duzVar.c);
                        dtz dtzVar5 = dtz.this;
                        dtzVar5.b.setMaxFrame(duzVar.d);
                        return zy11.a;
                    }
                };
                duz duzVar = (duz) S;
                if (duzVar != null) {
                    tlsVar2.invoke(duzVar);
                }
                rvoVar = rvoVar2;
                jSONObject = jSONObject5;
                lottieDrawable2 = lottieDrawable;
                lottieDrawable3 = lottieDrawable9;
                dtzVar.l.a(new sls() { // from class: com.yandex.div.lottie.DivLottieExtensionHandler$setupRepeatList$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
                    @Override // defpackage.sls
                    public final Object invoke() {
                        Ref$IntRef ref$IntRef2 = Ref$IntRef.this;
                        int i4 = ref$IntRef2.element + 1;
                        ref$IntRef2.element = i4;
                        ref$ObjectRef.element = kotlin.collections.a.S(i4, arrayList);
                        duz duzVar2 = ref$ObjectRef.element;
                        if (duzVar2 != null) {
                            tlsVar2.invoke(duzVar2);
                        }
                        dtzVar.e();
                        return zy11.a;
                    }
                });
                obj2 = zy11Var;
            } else {
                rvoVar = rvoVar2;
                jSONObject = jSONObject5;
                lottieDrawable2 = lottieDrawable;
                lottieDrawable3 = lottieDrawable9;
            }
            if (obj2 == null) {
                Expression d2 = com.yandex.div.internal.parser.a.d(a.y, jSONObject, str4, wm11.b, com.yandex.div.internal.parser.b.h);
                lottieDrawable3.setRepeatCount(d2 != null ? uh6.R(d2, rvoVar) : i);
                lottieDrawable3.setRepeatMode(uh6.B(jSONObject, rvoVar));
            }
            playbackStateController3.b = lottieDrawable2.getRepeatCount() == -1 ? i : z;
            Expression e3 = com.yandex.div.internal.parser.a.e(u2lVar2, jSONObject, "is_playing", wm11.a, com.yandex.div.internal.parser.b.f, kbsVar, null);
            int booleanValue = e3 != null ? ((Boolean) e3.a(rvoVar)).booleanValue() : i;
            if ((playbackStateController3.b || !playbackStateController3.a) && booleanValue != 0) {
                dtzVar.d();
            } else {
                float f = lottieDrawable2.getRepeatMode() == 2 ? 0.0f : 1.0f;
                lottieDrawable2.pauseAnimation();
                lottieDrawable2.setProgress(f);
                dtzVar.a();
            }
            if (e3 != null) {
                aVar4.addSubscription(e3.c(rvoVar, new tls() { // from class: com.yandex.div.lottie.DivLottieExtensionHandler$bind$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj8) {
                        boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                        a aVar5 = a.this;
                        dtz dtzVar2 = dtzVar;
                        u2l u2lVar7 = a.y;
                        aVar5.getClass();
                        if (booleanValue2) {
                            LottieDrawable lottieDrawable10 = dtzVar2.b;
                            if (!lottieDrawable10.isAnimating() && (lottieDrawable10.getProgress() < 1.0f || lottieDrawable10.getRepeatCount() == -1)) {
                                dtzVar2.e();
                            }
                        } else if (dtzVar2.b.isAnimating()) {
                            dtzVar2.c();
                        }
                        return zy11.a;
                    }
                }));
            }
            return zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivLottieExtensionHandler$bindView$1(a aVar, gtz gtzVar, View view, Div2View div2View, egk egkVar, dtz dtzVar, JSONObject jSONObject, rvo rvoVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$lottieData = gtzVar;
        this.$view = view;
        this.$divView = div2View;
        this.$div = egkVar;
        this.$lottieController = dtzVar;
        this.$params = jSONObject;
        this.$expressionResolver = rvoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DivLottieExtensionHandler$bindView$1(this.this$0, this.$lottieData, this.$view, this.$divView, this.$div, this.$lottieController, this.$params, this.$expressionResolver, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DivLottieExtensionHandler$bindView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        if (defpackage.tje.k0(r15, r4, r14) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r15 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            DivLottieExtensionHandler$bindView$1$result$1 divLottieExtensionHandler$bindView$1$result$1 = new DivLottieExtensionHandler$bindView$1$result$1(this.this$0, this.$lottieData, this.$view, null);
            this.label = 1;
            obj = tje.k0(mdhVar, divLottieExtensionHandler$bindView$1$result$1, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        euz euzVar = (euz) obj;
        sjh sjhVar2 = uyj.a;
        g6u g6uVar = o400.a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$divView, this.$div, this.$lottieController, euzVar, this.$params, this.$expressionResolver, this.$lottieData, null);
        this.label = 2;
    }
}
