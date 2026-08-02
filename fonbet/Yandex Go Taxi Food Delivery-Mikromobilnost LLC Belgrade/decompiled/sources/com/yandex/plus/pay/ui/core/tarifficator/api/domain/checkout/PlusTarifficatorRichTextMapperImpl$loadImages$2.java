package com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout;

import android.content.Context;
import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.ui.core.theme.PlusTheme;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tpd0;
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
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "", "", "Landroid/graphics/drawable/Drawable;", "<anonymous>", "(Ltse;)Ljava/util/Map;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.PlusTarifficatorRichTextMapperImpl$loadImages$2", f = "PlusTarifficatorRichTextMapperImpl.kt", l = {205}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlusTarifficatorRichTextMapperImpl$loadImages$2 extends SuspendLambda implements wls {
    final /* synthetic */ Map<String, PlusPayRichText.Item> $replacements;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "", "", "Landroid/graphics/drawable/Drawable;", "<anonymous>", "(Ltse;)Ljava/util/Map;"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.PlusTarifficatorRichTextMapperImpl$loadImages$2$1", f = "PlusTarifficatorRichTextMapperImpl.kt", l = {214}, m = "invokeSuspend")
    /* renamed from: com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.PlusTarifficatorRichTextMapperImpl$loadImages$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ List<String> $imageUrls;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List list, a aVar, Continuation continuation) {
            super(2, continuation);
            this.$imageUrls = list;
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$imageUrls, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                List<String> list = this.$imageUrls;
                a aVar = this.this$0;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(tje.h(tseVar, null, null, new PlusTarifficatorRichTextMapperImpl$loadImages$2$1$1$1((String) it.next(), aVar, null), 3));
                }
                this.L$0 = null;
                this.label = 1;
                obj = kotlinx.coroutines.a.b(arrayList, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            return kotlin.collections.b.s((Iterable) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusTarifficatorRichTextMapperImpl$loadImages$2(Map map, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$replacements = map;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlusTarifficatorRichTextMapperImpl$loadImages$2(this.$replacements, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusTarifficatorRichTextMapperImpl$loadImages$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            return obj;
        }
        b.b(obj);
        Collection<PlusPayRichText.Item> values = this.$replacements.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : values) {
            if (obj2 instanceof PlusPayRichText.Item.Icon) {
                arrayList.add(obj2);
            }
        }
        a aVar = this.this$0;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PlusPayRichText.Item.Icon icon = (PlusPayRichText.Item.Icon) it.next();
            PlusTheme plusTheme = (PlusTheme) aVar.b.getValue();
            Context context = aVar.a;
            PlusThemedImage image = icon.getImage();
            arrayList2.add((String) (tpd0.a(context, plusTheme) ? image.getDark() : image.getLight()));
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(kotlin.collections.a.I(arrayList2), this.this$0, null);
        this.L$0 = null;
        this.label = 1;
        Object O = jl40.O(anonymousClass1, this);
        return O == coroutineSingletons ? coroutineSingletons : O;
    }
}
