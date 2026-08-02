package com.yandex.go.ai_widget.router;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.adjust.sdk.Constants;
import com.yandex.go.ai_widget.analytics.AIWidgetAnalytics$TextsEvaluatorCardType;
import com.yandex.go.ai_widget.analytics.AIWidgetAnalytics$TextsEvaluatorErrorType;
import com.yandex.go.ai_widget.analytics.AIWidgetAnalytics$TextsEvaluatorEvaluationAction;
import com.yandex.go.ai_widget.analytics.AIWidgetAnalytics$TextsEvaluatorReaction;
import com.yandex.go.ai_widget.analytics.AIWidgetAnalytics$TextsEvaluatorTappedAction;
import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationSwipeDirection;
import com.yandex.go.analytics.realtime.event.CreativeType;
import com.yandex.go.analytics.realtime.event.RealtimeEventType;
import defpackage.agd;
import defpackage.b1;
import defpackage.b64;
import defpackage.bo1;
import defpackage.co1;
import defpackage.do1;
import defpackage.g191;
import defpackage.gci0;
import defpackage.iei0;
import defpackage.jl40;
import defpackage.lp1;
import defpackage.mp1;
import defpackage.mvg;
import defpackage.np1;
import defpackage.ny61;
import defpackage.oo31;
import defpackage.op1;
import defpackage.pp1;
import defpackage.pzt0;
import defpackage.qo1;
import defpackage.qp1;
import defpackage.qqa1;
import defpackage.qu;
import defpackage.rp1;
import defpackage.sp1;
import defpackage.tp1;
import defpackage.tse;
import defpackage.up1;
import defpackage.vp1;
import defpackage.w511;
import defpackage.wls;
import defpackage.wn1;
import defpackage.wp1;
import defpackage.x4e;
import defpackage.xn1;
import defpackage.xp1;
import defpackage.yfd;
import defpackage.yn1;
import defpackage.yp1;
import defpackage.zp1;
import defpackage.zy11;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ai_widget.router.AiWidgetEvaluationRouter$content$1$1$1", f = "AiWidgetEvaluationRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class AiWidgetEvaluationRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ sp1 $action;
    final /* synthetic */ yfd $this_buildContent;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiWidgetEvaluationRouter$content$1$1$1(b bVar, sp1 sp1Var, yfd yfdVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$action = sp1Var;
        this.$this_buildContent = yfdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AiWidgetEvaluationRouter$content$1$1$1(this.this$0, this.$action, this.$this_buildContent, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AiWidgetEvaluationRouter$content$1$1$1 aiWidgetEvaluationRouter$content$1$1$1 = (AiWidgetEvaluationRouter$content$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        aiWidgetEvaluationRouter$content$1$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0265, code lost:
    
        if (r11 < 0) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        AIWidgetAnalytics$TextsEvaluatorReaction aIWidgetAnalytics$TextsEvaluatorReaction;
        zp1 zp1Var;
        List list;
        up1 i2;
        List list2;
        iei0 iei0Var;
        int i3;
        up1 i4;
        int i5;
        List list3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        tp1 tp1Var = bVar.K;
        sp1 sp1Var = this.$action;
        qo1 qo1Var = (qo1) ((agd) this.$this_buildContent).a;
        g191 g191Var = bVar.N;
        zp1 zp1Var2 = bVar.L;
        xn1 xn1Var = tp1Var.a;
        if (!jl40.l(sp1Var, qp1.a)) {
            boolean l = jl40.l(sp1Var, lp1.a);
            String str = Constants.DEEPLINK;
            if (l) {
                xn1Var.getClass();
                String str2 = qo1Var.c;
                String str3 = str2 == null ? Constants.DEEPLINK : str2;
                xp1 xp1Var = (xp1) ((gci0) zp1Var2.w).a.getValue();
                if (xp1Var instanceof up1) {
                    if (((up1) xp1Var).i) {
                        b1.a(xn1Var.a, str3, AIWidgetAnalytics$TextsEvaluatorTappedAction.Back, qo1Var.a, null, null, null, null, null, null, null, null, null, null, 8184);
                    } else {
                        up1 i6 = zp1Var2.i();
                        do1 do1Var = (i6 == null || (list3 = i6.b) == null) ? null : (do1) kotlin.collections.a.S(zp1Var2.a, list3);
                        if (do1Var != null) {
                            b1 b1Var = xn1Var.a;
                            AIWidgetAnalytics$TextsEvaluatorTappedAction aIWidgetAnalytics$TextsEvaluatorTappedAction = AIWidgetAnalytics$TextsEvaluatorTappedAction.Back;
                            String str4 = qo1Var.a;
                            Integer valueOf = Integer.valueOf(zp1Var2.a + 1);
                            int j = zp1Var2.j();
                            up1 i7 = zp1Var2.i();
                            Integer valueOf2 = Integer.valueOf((i7 != null ? i7.g : 0) + j);
                            Integer valueOf3 = Integer.valueOf(zp1Var2.j());
                            up1 i8 = zp1Var2.i();
                            Integer valueOf4 = Integer.valueOf(i8 != null ? i8.g : 0);
                            String e = qqa1.e(do1Var);
                            String g = qqa1.g(do1Var);
                            String d = qqa1.d(do1Var);
                            AIWidgetAnalytics$TextsEvaluatorCardType f = qqa1.f(do1Var);
                            Long l2 = (Long) zp1Var2.x;
                            if (l2 != null) {
                                int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - l2.longValue());
                                if (elapsedRealtime >= 0) {
                                    i5 = elapsedRealtime;
                                    b1.a(b1Var, str3, aIWidgetAnalytics$TextsEvaluatorTappedAction, str4, valueOf, valueOf2, valueOf3, valueOf4, e, g, d, f, Integer.valueOf(i5), null, 4096);
                                }
                            }
                            i5 = 0;
                            b1.a(b1Var, str3, aIWidgetAnalytics$TextsEvaluatorTappedAction, str4, valueOf, valueOf2, valueOf3, valueOf4, e, g, d, f, Integer.valueOf(i5), null, 4096);
                        }
                    }
                } else if (xp1Var instanceof vp1) {
                    b1.a(xn1Var.a, str3, AIWidgetAnalytics$TextsEvaluatorTappedAction.Back, qo1Var.a, null, null, null, null, null, null, null, null, null, ((vp1) xp1Var).a ? AIWidgetAnalytics$TextsEvaluatorErrorType.NotFound : AIWidgetAnalytics$TextsEvaluatorErrorType.Other, 4088);
                } else {
                    if (!jl40.l(xp1Var, wp1.a)) {
                        w511.b();
                        return null;
                    }
                    b1.a(xn1Var.a, str3, AIWidgetAnalytics$TextsEvaluatorTappedAction.Back, qo1Var.a, null, null, null, null, null, null, null, null, null, null, 8184);
                }
                b bVar2 = (b) g191Var.a;
                pzt0 pzt0Var = bVar2.M;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                bVar2.r(new qu(9));
            } else if (jl40.l(sp1Var, pp1.a)) {
                tp1Var.a(qo1Var, zp1Var2, AIWidgetAnalytics$TextsEvaluatorTappedAction.Retry);
                ((b) g191Var.a).U();
            } else if (jl40.l(sp1Var, np1.a)) {
                tp1Var.a(qo1Var, zp1Var2, AIWidgetAnalytics$TextsEvaluatorTappedAction.Close);
                b bVar3 = (b) g191Var.a;
                pzt0 pzt0Var2 = bVar3.M;
                if (pzt0Var2 != null) {
                    pzt0Var2.a(null);
                }
                bVar3.r(new qu(9));
            } else if (jl40.l(sp1Var, op1.a)) {
                b1 b1Var2 = xn1Var.a;
                String str5 = qo1Var.c;
                b1.a(b1Var2, str5 == null ? Constants.DEEPLINK : str5, AIWidgetAnalytics$TextsEvaluatorTappedAction.Done, qo1Var.a, null, null, null, null, null, null, null, null, null, null, 8184);
                ((b) g191Var.a).G.a();
            } else {
                int i9 = 0;
                if (jl40.l(sp1Var, rp1.a)) {
                    Long l3 = (Long) zp1Var2.x;
                    if (l3 != null) {
                        int elapsedRealtime2 = (int) (SystemClock.elapsedRealtime() - l3.longValue());
                        if (elapsedRealtime2 >= 0) {
                            i3 = elapsedRealtime2;
                            xn1Var.b(qo1Var, zp1Var2, i3);
                            i4 = zp1Var2.i();
                            if (i4 != null) {
                                r0 r0Var = (r0) zp1Var2.c;
                                ((yp1) zp1Var2.b).getClass();
                                up1 up1Var = new up1(i4.a, i4.b, i4.c, i4.d, i4.e, i4.f, i4.g, 0, true);
                                r0Var.getClass();
                                r0Var.m(null, up1Var);
                            }
                        }
                    }
                    i3 = 0;
                    xn1Var.b(qo1Var, zp1Var2, i3);
                    i4 = zp1Var2.i();
                    if (i4 != null) {
                    }
                } else {
                    if (!(sp1Var instanceof mp1)) {
                        w511.b();
                        return null;
                    }
                    mp1 mp1Var = (mp1) sp1Var;
                    do1 do1Var2 = mp1Var.a;
                    AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection = mp1Var.b;
                    boolean z = mp1Var.c;
                    xn1Var.getClass();
                    Long l4 = (Long) zp1Var2.y;
                    if (l4 != null) {
                        i = (int) (SystemClock.elapsedRealtime() - l4.longValue());
                    }
                    i = 0;
                    b1 b1Var3 = xn1Var.a;
                    String str6 = qo1Var.c;
                    if (str6 != null) {
                        str = str6;
                    }
                    int i10 = zp1Var2.a + 1;
                    int j2 = zp1Var2.j();
                    up1 i11 = zp1Var2.i();
                    int i12 = (i11 != null ? i11.g : 0) + j2;
                    int j3 = zp1Var2.j();
                    up1 i13 = zp1Var2.i();
                    int i14 = i13 != null ? i13.g : 0;
                    String e2 = qqa1.e(do1Var2);
                    String g2 = qqa1.g(do1Var2);
                    String d2 = qqa1.d(do1Var2);
                    AIWidgetAnalytics$TextsEvaluatorCardType f2 = qqa1.f(do1Var2);
                    int i15 = yn1.a[aiWidgetEvaluationSwipeDirection.ordinal()];
                    if (i15 == 1) {
                        aIWidgetAnalytics$TextsEvaluatorReaction = AIWidgetAnalytics$TextsEvaluatorReaction.Like;
                    } else {
                        if (i15 != 2) {
                            w511.b();
                            return null;
                        }
                        aIWidgetAnalytics$TextsEvaluatorReaction = AIWidgetAnalytics$TextsEvaluatorReaction.Dislike;
                    }
                    AIWidgetAnalytics$TextsEvaluatorEvaluationAction aIWidgetAnalytics$TextsEvaluatorEvaluationAction = z ? AIWidgetAnalytics$TextsEvaluatorEvaluationAction.Tap : AIWidgetAnalytics$TextsEvaluatorEvaluationAction.Swipe;
                    String str7 = qo1Var.a;
                    b1Var3.getClass();
                    AIWidgetAnalytics$TextsEvaluatorReaction aIWidgetAnalytics$TextsEvaluatorReaction2 = aIWidgetAnalytics$TextsEvaluatorReaction;
                    HashMap hashMap = new HashMap();
                    AIWidgetAnalytics$TextsEvaluatorEvaluationAction aIWidgetAnalytics$TextsEvaluatorEvaluationAction2 = aIWidgetAnalytics$TextsEvaluatorEvaluationAction;
                    hashMap.put("open_reason", str);
                    if (str7 != null) {
                        hashMap.put("batch_id", str7);
                    }
                    b64.B(i10, hashMap, "card_num", i12, "cards_count");
                    b64.B(j3, hashMap, "onboarding_cards_count", i14, "evaluation_cards_count");
                    hashMap.put("card_text", e2);
                    hashMap.put("shortcut_text", g2);
                    hashMap.put("campaign_id", d2);
                    hashMap.put("card_type", f2.getEventValue());
                    hashMap.put("reaction", aIWidgetAnalytics$TextsEvaluatorReaction2.getEventValue());
                    hashMap.put("evaluation_action", aIWidgetAnalytics$TextsEvaluatorEvaluationAction2.getEventValue());
                    b1Var3.a.a("AIWidget.TextsEvaluatorCard.Evaluated", hashMap, 1, x4e.n(i, hashMap, "time_to_reaction_ms"));
                    boolean z2 = do1Var2 instanceof bo1;
                    if (z2) {
                        bo1 bo1Var = (bo1) do1Var2;
                        int j4 = zp1Var2.j();
                        MapBuilder mapBuilder = new MapBuilder();
                        mapBuilder.put("time_to_reaction_ms", Integer.valueOf(i));
                        int i16 = bo1Var.g;
                        Map map = bo1Var.f;
                        mapBuilder.put("position", Integer.valueOf(i16));
                        mapBuilder.put("onboarding_cards_count", Integer.valueOf(j4));
                        MapBuilder j5 = mapBuilder.j();
                        int i17 = wn1.a[aiWidgetEvaluationSwipeDirection.ordinal()];
                        if (i17 == 1) {
                            CreativeType creativeType = CreativeType.AiWidget;
                            String str8 = bo1Var.a;
                            if (map == null) {
                                map = kotlin.collections.b.f();
                            }
                            iei0Var = new iei0(RealtimeEventType.Like, creativeType, System.currentTimeMillis(), str8, map, j5, 64);
                        } else {
                            if (i17 != 2) {
                                w511.b();
                                return null;
                            }
                            CreativeType creativeType2 = CreativeType.AiWidget;
                            String str9 = bo1Var.a;
                            if (map == null) {
                                map = kotlin.collections.b.f();
                            }
                            iei0Var = new iei0(RealtimeEventType.Dislike, creativeType2, System.currentTimeMillis(), str9, map, j5, 64);
                        }
                        ((com.yandex.go.analytics.realtime.a) xn1Var.b).d(iei0Var);
                    }
                    if (do1Var2 instanceof co1) {
                        up1 i18 = zp1Var2.i();
                        if (i18 == null || (list2 = i18.b) == null) {
                            zp1Var = zp1Var2;
                        } else {
                            zp1Var = zp1Var2;
                            List J = kotlin.collections.a.J(list2, zp1Var.a + 1);
                            if (!(J instanceof Collection) || !J.isEmpty()) {
                                Iterator it = J.iterator();
                                while (it.hasNext()) {
                                    if (((do1) it.next()) instanceof co1) {
                                        break;
                                    }
                                }
                            }
                        }
                        oo31.n((SharedPreferences) tp1Var.b.b.getValue(), "onboarding_completed", true);
                    } else {
                        zp1Var = zp1Var2;
                    }
                    if (z2 && (i2 = zp1Var.i()) != null) {
                        r0 r0Var2 = (r0) zp1Var.c;
                        yp1 yp1Var = (yp1) zp1Var.b;
                        int i19 = i2.h - 1;
                        int i20 = i19 < 0 ? 0 : i19;
                        boolean z3 = i2.i;
                        yp1Var.getClass();
                        up1 up1Var2 = new up1(i2.a, i2.b, i2.c, i2.d, i2.e, i2.f, i2.g, i20, z3);
                        r0Var2.getClass();
                        r0Var2.m(null, up1Var2);
                    }
                    int i21 = zp1Var.a + 1;
                    zp1Var.a = i21;
                    up1 i22 = zp1Var.i();
                    if (i22 != null && (list = i22.b) != null) {
                        i9 = list.size();
                    }
                    if (i21 < i9) {
                        zp1Var.y = zp1Var.a == 0 ? (Long) zp1Var.x : Long.valueOf(SystemClock.elapsedRealtime());
                        xn1Var.a(qo1Var, zp1Var);
                    }
                }
            }
        }
        return zy11.a;
    }
}
