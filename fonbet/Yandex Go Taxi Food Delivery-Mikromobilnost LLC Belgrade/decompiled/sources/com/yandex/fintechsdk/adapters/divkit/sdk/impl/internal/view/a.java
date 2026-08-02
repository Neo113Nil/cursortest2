package com.yandex.fintechsdk.adapters.divkit.sdk.impl.internal.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.view2.Div2View;
import com.yandex.fintechsdk.flows.payment.kit.internal.widget.b;
import defpackage.eg90;
import defpackage.gkt;
import defpackage.gtk;
import defpackage.gtq0;
import defpackage.gzr;
import defpackage.kvo;
import defpackage.lml;
import defpackage.ny61;
import defpackage.omk;
import defpackage.tjk;
import defpackage.u2l;
import defpackage.ujk;
import defpackage.xrs;
import defpackage.z6k;
import defpackage.zmk;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class a {
    public final Context a;
    public final Map b;
    public final gtk c;
    public final lml d;
    public final xrs e;
    public final gkt f;
    public final com.yandex.div.core.expression.variables.a g;

    public a(Context context, Map map, gtk gtkVar, lml lmlVar, gzr gzrVar, xrs xrsVar, gkt gktVar, com.yandex.div.core.expression.variables.a aVar) {
        this.a = context;
        this.b = map;
        this.c = gtkVar;
        this.d = lmlVar;
        this.e = xrsVar;
        this.f = gktVar;
        this.g = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006a A[Catch: all -> 0x00b3, CancellationException -> 0x00bb, TryCatch #2 {CancellationException -> 0x00bb, all -> 0x00b3, blocks: (B:11:0x0029, B:13:0x004f, B:15:0x006a, B:16:0x006e, B:23:0x0041), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(b bVar, ContinuationImpl continuationImpl) {
        DivViewCreator$loadView$1 divViewCreator$loadView$1;
        int i;
        boolean z;
        Object a;
        try {
            if (continuationImpl instanceof DivViewCreator$loadView$1) {
                divViewCreator$loadView$1 = (DivViewCreator$loadView$1) continuationImpl;
                int i2 = divViewCreator$loadView$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    divViewCreator$loadView$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = divViewCreator$loadView$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = divViewCreator$loadView$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        divViewCreator$loadView$1.L$0 = this;
                        z = false;
                        divViewCreator$loadView$1.Z$0 = false;
                        divViewCreator$loadView$1.label = 1;
                        a = bVar.a(divViewCreator$loadView$1);
                        if (a == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z2 = divViewCreator$loadView$1.Z$0;
                        a aVar = (a) divViewCreator$loadView$1.L$0;
                        kotlin.b.b(obj);
                        Object value = ((Result) obj).getValue();
                        z = z2;
                        this = aVar;
                        a = value;
                    }
                    kotlin.b.b(a);
                    JSONObject jSONObject = (JSONObject) a;
                    Map map = this.b;
                    com.yandex.div.core.expression.variables.a aVar2 = this.g;
                    z6k z6kVar = new z6k(map, aVar2);
                    tjk tjkVar = new tjk(this.c);
                    tjkVar.b = z6kVar;
                    tjkVar.j = aVar2;
                    if (!z) {
                        tjkVar.h = this.d;
                    }
                    tjkVar.b(this.e);
                    tjkVar.b(this.f);
                    ujk a2 = tjkVar.a();
                    Context context = this.a;
                    AttributeSet attributeSet = null;
                    int i3 = 0;
                    Div2View div2View = new Div2View(new Div2Context(new ContextThemeWrapper(context, context.getTheme()), a2, 0, null, 12, null), attributeSet, i3, 6, null);
                    u2l u2lVar = new u2l(eg90.a);
                    kvo kvoVar = omk.i;
                    div2View.setData(gtq0.n(u2lVar, jSONObject), new zmk("payment_methods_widget"));
                    return div2View;
                }
            }
            if (i != 0) {
            }
            kotlin.b.b(a);
            JSONObject jSONObject2 = (JSONObject) a;
            Map map2 = this.b;
            com.yandex.div.core.expression.variables.a aVar22 = this.g;
            z6k z6kVar2 = new z6k(map2, aVar22);
            tjk tjkVar2 = new tjk(this.c);
            tjkVar2.b = z6kVar2;
            tjkVar2.j = aVar22;
            if (!z) {
            }
            tjkVar2.b(this.e);
            tjkVar2.b(this.f);
            ujk a22 = tjkVar2.a();
            Context context2 = this.a;
            AttributeSet attributeSet2 = null;
            int i32 = 0;
            Div2View div2View2 = new Div2View(new Div2Context(new ContextThemeWrapper(context2, context2.getTheme()), a22, 0, null, 12, null), attributeSet2, i32, 6, null);
            u2l u2lVar2 = new u2l(eg90.a);
            kvo kvoVar2 = omk.i;
            div2View2.setData(gtq0.n(u2lVar2, jSONObject2), new zmk("payment_methods_widget"));
            return div2View2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        divViewCreator$loadView$1 = new DivViewCreator$loadView$1(this, continuationImpl);
        Object obj3 = divViewCreator$loadView$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = divViewCreator$loadView$1.label;
    }
}
