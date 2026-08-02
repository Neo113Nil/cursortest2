package com.yandex.go.safety.center.safetycenter_web.ui.error;

import android.graphics.Color;
import com.yandex.go.safety.center.experiment.SafetyCenterWebConfig;
import defpackage.ful0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.qul0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lqul0;", "<anonymous>", "(Ltse;)Lqul0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.safetycenter_web.ui.error.SafetyCenterWebErrorViewUiStateFactory$createUiState$2", f = "SafetyCenterWebErrorViewUiStateFactory.kt", l = {37, 40}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterWebErrorViewUiStateFactory$createUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ ful0 $data;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterWebErrorViewUiStateFactory$createUiState$2(ful0 ful0Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$data = ful0Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SafetyCenterWebErrorViewUiStateFactory$createUiState$2 safetyCenterWebErrorViewUiStateFactory$createUiState$2 = new SafetyCenterWebErrorViewUiStateFactory$createUiState$2(this.$data, this.this$0, continuation);
        safetyCenterWebErrorViewUiStateFactory$createUiState$2.L$0 = obj;
        return safetyCenterWebErrorViewUiStateFactory$createUiState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyCenterWebErrorViewUiStateFactory$createUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01a2  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        Integer num;
        String str;
        CoroutineSingletons coroutineSingletons;
        List list;
        Collection collection;
        UiStateDrawableWrapper uiStateDrawableWrapper;
        String str2;
        String str3;
        Object s;
        Collection collection2;
        String str4;
        String str5;
        ?? r12;
        Object b;
        List list2;
        boolean z;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ful0 ful0Var = this.$data;
            SafetyCenterWebConfig safetyCenterWebConfig = ful0Var.a;
            Map map = ful0Var.b;
            boolean z2 = ful0Var.c != null;
            a aVar = this.this$0;
            List<String> list3 = safetyCenterWebConfig.b;
            aVar.getClass();
            if (list3.isEmpty()) {
                arrayList = EmptyList.a;
            } else {
                arrayList = new ArrayList();
                for (String str6 : list3) {
                    try {
                        num = Integer.valueOf(Color.parseColor(str6));
                    } catch (IllegalArgumentException unused) {
                        jst.e.d("SafetyCenterWebErrorViewUiStateFactory", "Could not parse gradient color: " + str6);
                        num = null;
                    }
                    if (num != null) {
                        arrayList.add(num);
                    }
                }
            }
            String str7 = (String) map.get(safetyCenterWebConfig.d);
            String str8 = (String) map.get(safetyCenterWebConfig.e);
            String str9 = (String) map.get(safetyCenterWebConfig.g);
            List list4 = safetyCenterWebConfig.f;
            a aVar2 = this.this$0;
            ArrayList arrayList2 = new ArrayList(tcc.n(list4, 10));
            for (Iterator it = list4.iterator(); it.hasNext(); it = it) {
                ArrayList arrayList3 = arrayList2;
                a aVar3 = aVar2;
                arrayList3.add(tje.h(tseVar, null, null, new SafetyCenterWebErrorViewUiStateFactory$createUiState$2$buttons$1$1(aVar3, (SafetyCenterWebConfig.Button) it.next(), map, z2, null), 3));
                str9 = str9;
                arrayList2 = arrayList3;
                aVar2 = aVar3;
                coroutineSingletons2 = coroutineSingletons2;
            }
            CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
            str = str9;
            Collection collection3 = arrayList2;
            String str10 = safetyCenterWebConfig.c;
            qoh h = str10 != null ? tje.h(tseVar, null, null, new SafetyCenterWebErrorViewUiStateFactory$createUiState$2$titleIcon$1$1(this.this$0, str10, null), 3) : null;
            if (h != null) {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = arrayList;
                this.L$4 = str7;
                this.L$5 = str8;
                this.L$6 = str;
                this.L$7 = collection3;
                this.L$8 = null;
                this.I$0 = z2 ? 1 : 0;
                this.label = 1;
                s = h.s(this);
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                coroutineSingletons = coroutineSingletons3;
                if (s != coroutineSingletons) {
                    list = arrayList;
                    collection2 = collection3;
                    str4 = str7;
                    str5 = str8;
                    z = z2;
                }
                return coroutineSingletons;
            }
            coroutineSingletons = coroutineSingletons3;
            list = arrayList;
            collection = collection3;
            uiStateDrawableWrapper = null;
            str2 = str7;
            str3 = str8;
            r12 = z2;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = list;
            this.L$4 = str2;
            this.L$5 = str3;
            this.L$6 = str;
            this.L$7 = null;
            this.L$8 = null;
            this.L$9 = uiStateDrawableWrapper;
            this.I$0 = r12;
            this.label = 2;
            b = kotlinx.coroutines.a.b(collection, this);
            if (b != coroutineSingletons) {
                list2 = list;
                return new qul0(str2, str3, uiStateDrawableWrapper, list2, kotlin.collections.a.M((Iterable) b), str);
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uiStateDrawableWrapper = (UiStateDrawableWrapper) this.L$9;
            str = (String) this.L$6;
            str3 = (String) this.L$5;
            str2 = (String) this.L$4;
            list2 = (List) this.L$3;
            b.b(obj);
            b = obj;
            return new qul0(str2, str3, uiStateDrawableWrapper, list2, kotlin.collections.a.M((Iterable) b), str);
        }
        ?? r1 = this.I$0;
        Collection collection4 = (List) this.L$7;
        String str11 = (String) this.L$6;
        str5 = (String) this.L$5;
        str4 = (String) this.L$4;
        list = (List) this.L$3;
        b.b(obj);
        coroutineSingletons = coroutineSingletons2;
        str = str11;
        z = r1;
        s = obj;
        collection2 = collection4;
        uiStateDrawableWrapper = (UiStateDrawableWrapper) s;
        collection = collection2;
        str3 = str5;
        str2 = str4;
        r12 = z;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = list;
        this.L$4 = str2;
        this.L$5 = str3;
        this.L$6 = str;
        this.L$7 = null;
        this.L$8 = null;
        this.L$9 = uiStateDrawableWrapper;
        this.I$0 = r12;
        this.label = 2;
        b = kotlinx.coroutines.a.b(collection, this);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
