package com.yandex.messaging.internal.view.timeline;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.messaging.core.net.entities.GetUrlPreviewResponse;
import com.yandex.messaging.domain.user.b;
import com.yandex.messaging.internal.avatar.a;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.entities.MessageSpan;
import com.yandex.messaging.internal.urlpreview.UrlPreviewBackgroundStyle;
import com.yandex.messaging.internal.urlpreview.impl.c;
import com.yandex.messaging.internal.view.timeline.d;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.dx10;
import defpackage.e9e;
import defpackage.gl;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.mw10;
import defpackage.ny61;
import defpackage.o400;
import defpackage.qhw0;
import defpackage.sjh;
import defpackage.th21;
import defpackage.uds0;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "areLinksEnabled", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.timeline.BaseTextMessageViewHolder$bind$3$1", f = "BaseTextMessageViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class BaseTextMessageViewHolder$bind$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ MessageData $messageData;
    final /* synthetic */ int $statusPadding;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTextMessageViewHolder$bind$3$1(d dVar, MessageData messageData, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$messageData = messageData;
        this.$statusPadding = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BaseTextMessageViewHolder$bind$3$1 baseTextMessageViewHolder$bind$3$1 = new BaseTextMessageViewHolder$bind$3$1(this.this$0, this.$messageData, this.$statusPadding, continuation);
        baseTextMessageViewHolder$bind$3$1.Z$0 = ((Boolean) obj).booleanValue();
        return baseTextMessageViewHolder$bind$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        BaseTextMessageViewHolder$bind$3$1 baseTextMessageViewHolder$bind$3$1 = (BaseTextMessageViewHolder$bind$3$1) create(bool, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        baseTextMessageViewHolder$bind$3$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final String str;
        final String str2;
        final gl glVar;
        Object next;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str3 = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean z = this.Z$0;
        mw10 mw10Var = this.this$0.O0;
        if (mw10Var != null && mw10Var.y != z) {
            mw10Var.y = z;
            mw10Var.d();
        }
        d dVar = this.this$0;
        if (z) {
            final dx10 K0 = dVar.K0();
            final d dVar2 = K0.d;
            if (dVar2 != null && (str = K0.k) != null && (str2 = K0.i) != null && (glVar = K0.h) != null) {
                K0.p = true;
                List list = K0.l;
                if (list != null) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            int start = ((MessageSpan) next).getStart();
                            do {
                                Object next2 = it.next();
                                int start2 = ((MessageSpan) next2).getStart();
                                if (start < start2) {
                                    next = next2;
                                    start = start2;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    MessageSpan messageSpan = (MessageSpan) next;
                    if (messageSpan != null) {
                        str3 = messageSpan.getStrUri();
                    }
                }
                final String str4 = str3;
                uds0 uds0Var = K0.e;
                if (uds0Var != null) {
                    uds0Var.close();
                }
                com.yandex.messaging.internal.urlpreview.a aVar = K0.a;
                th21 th21Var = new th21(str, true, str4);
                e9e e9eVar = new e9e() { // from class: cx10
                    /* JADX WARN: Code restructure failed: missing block: B:16:0x011f, code lost:
                    
                        if ((r4 != null ? defpackage.evu0.y(r4, r5, false) : false) != false) goto L38;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:74:0x01ff  */
                    /* JADX WARN: Removed duplicated region for block: B:9:0x0106  */
                    @Override // defpackage.e9e
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void accept(Object obj2) {
                        dx10 dx10Var;
                        x3 x3Var;
                        boolean z2;
                        ViewGroup.LayoutParams layoutParams;
                        d dVar3;
                        mw10 mw10Var2;
                        d dVar4 = d.this;
                        View view = dVar4.a;
                        dx10 dx10Var2 = K0;
                        fn6 fn6Var = dx10Var2.b;
                        long j = dx10Var2.j;
                        int i = dx10Var2.m;
                        fn6Var.getClass();
                        ye0 a = er31.a((GetUrlPreviewResponse) obj2);
                        if (a instanceof lh21) {
                            lh21 lh21Var = (lh21) a;
                            boolean p = lh21Var.p();
                            xav xavVar = (xav) fn6Var.e;
                            jcz0 jcz0Var = (jcz0) fn6Var.c;
                            sh21 sh21Var = (sh21) fn6Var.i;
                            x3Var = p ? new enh(lh21Var, view, xavVar, jcz0Var, i, sh21Var) : new xws0(lh21Var, view, xavVar, jcz0Var, sh21Var);
                        } else {
                            boolean z3 = a instanceof qh21;
                            String str5 = str2;
                            if (!z3) {
                                view = view;
                                if (a instanceof jh21) {
                                    x3Var = new ldb((jh21) a, view, (jcz0) fn6Var.c, (a) fn6Var.d, (kse) fn6Var.h, (sh21) fn6Var.i);
                                    dx10Var = dx10Var2;
                                } else if (a instanceof nh21) {
                                    x3Var = new c((nh21) a, view, (com.yandex.messaging.internal.storage.contacts.a) fn6Var.a, (a) fn6Var.d, (kse) fn6Var.h, (noy0) fn6Var.f, (jcz0) fn6Var.c, i, (sh21) fn6Var.i, str5, (h3y) fn6Var.g, (z5z) fn6Var.l);
                                    dx10Var = dx10Var2;
                                } else {
                                    dx10Var = dx10Var2;
                                    if (a instanceof oh21) {
                                        x3Var = new com.yandex.messaging.internal.urlpreview.impl.d((oh21) a, str5, view, (com.yandex.messaging.internal.storage.contacts.a) fn6Var.a, (jcz0) fn6Var.c, (otx) fn6Var.b, (a) fn6Var.d, (sh21) fn6Var.i, (jft) fn6Var.j, (b) fn6Var.k);
                                        view = view;
                                    } else {
                                        if (ydz.a.a()) {
                                            ydz.d();
                                        }
                                        x3Var = null;
                                    }
                                }
                                dx10Var.f = x3Var;
                                if (x3Var != null) {
                                    mw10 mw10Var3 = dVar4.O0;
                                    if (mw10Var3 != null) {
                                        mw10Var3.a.setVisibility(0);
                                        return;
                                    }
                                    return;
                                }
                                dx10Var.f = x3Var;
                                List list2 = dx10Var.l;
                                if (list2 != null) {
                                    z2 = true;
                                    if (list2.size() == 1) {
                                        String str6 = str4;
                                    }
                                }
                                z2 = false;
                                if (z2) {
                                    mw10 mw10Var4 = dVar4.O0;
                                    if (mw10Var4 != null) {
                                        mw10Var4.a.setVisibility(8);
                                    }
                                } else {
                                    mw10 mw10Var5 = dVar4.O0;
                                    if (mw10Var5 != null) {
                                        mw10Var5.a.setVisibility(0);
                                    }
                                }
                                if (z2 && !dx10Var.n && !dx10Var.o) {
                                    x3Var.Sg(UrlPreviewBackgroundStyle.FullCornered);
                                }
                                View Ig = x3Var.Ig();
                                if (Ig != null && glVar.k(Ig) && (dVar3 = dx10Var.d) != null && (mw10Var2 = dVar3.O0) != null) {
                                    mw10Var2.e(dVar3.V1, 0);
                                }
                                View findViewById = view.findViewById(e9h0.timeline_message_container);
                                dx10Var.g = findViewById;
                                if (findViewById != null && (layoutParams = findViewById.getLayoutParams()) != null) {
                                    layoutParams.width = -1;
                                }
                                View view2 = dx10Var.g;
                                if (view2 != null) {
                                    zoy0 zoy0Var = com.yandex.messaging.internal.view.timeline.a.i;
                                    Object parent = view2.getParent();
                                    View view3 = parent instanceof View ? (View) parent : null;
                                    if (view3 != null) {
                                        if (view3.getId() != e9h0.ai_bot_interactions_wrap) {
                                            view3 = null;
                                        }
                                        if (view3 != null) {
                                            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                                            layoutParams2.width = -1;
                                            view3.setLayoutParams(layoutParams2);
                                        }
                                    }
                                }
                                x3Var.show();
                                sh21 sh21Var2 = dx10Var.c;
                                long j2 = dx10Var.j;
                                ye0 ye0Var = (ye0) x3Var.b;
                                lh21 lh21Var2 = ye0Var instanceof lh21 ? (lh21) ye0Var : null;
                                String str7 = lh21Var2 != null ? lh21Var2.w : null;
                                LinkedHashSet linkedHashSet = sh21Var2.b;
                                if (linkedHashSet.contains(Long.valueOf(j2))) {
                                    return;
                                }
                                LinkedHashMap l = kotlin.collections.b.l(new Pair("type", gp41.a(ye0Var)), new Pair("single_link", Boolean.valueOf(z2)));
                                if (str7 != null) {
                                    l.put("turbo_url", str7);
                                }
                                sh21Var2.a.reportEvent("url_preview_show", l);
                                linkedHashSet.add(Long.valueOf(j2));
                                return;
                            }
                            x3Var = new lo31((qh21) a, str5, j, view, (xav) fn6Var.e, (jcz0) fn6Var.c, i, (sh21) fn6Var.i);
                            view = view;
                        }
                        dx10Var = dx10Var2;
                        dx10Var.f = x3Var;
                        if (x3Var != null) {
                        }
                    }
                };
                aVar.getClass();
                qhw0 a = jl40.a();
                sjh sjhVar = uyj.a;
                K0.e = new uds0(bvf0.a(cvw.U(a, o400.a.x)), e9eVar, aVar, th21Var);
            }
        } else if (dVar.K0().p) {
            this.this$0.K0().a();
            d dVar3 = this.this$0;
            View view = dVar3.B1;
            if (view != null) {
                dVar3.L0.k(view);
            }
            mw10 mw10Var2 = this.this$0.O0;
            if (mw10Var2 != null) {
                mw10Var2.e(this.$messageData, this.$statusPadding);
            }
        }
        return zy11.a;
    }
}
