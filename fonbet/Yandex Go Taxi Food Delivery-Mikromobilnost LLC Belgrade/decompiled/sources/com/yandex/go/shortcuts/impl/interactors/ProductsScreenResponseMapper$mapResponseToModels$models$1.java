package com.yandex.go.shortcuts.impl.interactors;

import com.yandex.go.shortcuts.dto.response.Layout;
import com.yandex.go.shortcuts.dto.response.ProductsCommon$Section;
import com.yandex.go.shortcuts.dto.response.Screen;
import defpackage.e6v;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.srq0;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsrq0;", "Le6v;", "Lzy11;", "<anonymous>", "(Lsrq0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.interactors.ProductsScreenResponseMapper$mapResponseToModels$models$1", f = "ProductsScreenResponseMapper.kt", l = {44, 46, 48, 52}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ProductsScreenResponseMapper$mapResponseToModels$models$1 extends RestrictedSuspendLambda implements wls {
    final /* synthetic */ Map<String, e6v> $headers;
    final /* synthetic */ Layout $layout;
    final /* synthetic */ Screen $screen;
    final /* synthetic */ Map<String, e6v> $shortcutModels;
    final /* synthetic */ Map<String, e6v> $stackItems;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductsScreenResponseMapper$mapResponseToModels$models$1(Screen screen, Map map, Map map2, x xVar, Layout layout, Map map3, Continuation continuation) {
        super(2, continuation);
        this.$screen = screen;
        this.$headers = map;
        this.$shortcutModels = map2;
        this.this$0 = xVar;
        this.$layout = layout;
        this.$stackItems = map3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ProductsScreenResponseMapper$mapResponseToModels$models$1 productsScreenResponseMapper$mapResponseToModels$models$1 = new ProductsScreenResponseMapper$mapResponseToModels$models$1(this.$screen, this.$headers, this.$shortcutModels, this.this$0, this.$layout, this.$stackItems, continuation);
        productsScreenResponseMapper$mapResponseToModels$models$1.L$0 = obj;
        return productsScreenResponseMapper$mapResponseToModels$models$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductsScreenResponseMapper$mapResponseToModels$models$1) create((srq0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        if (r2.c(r14, r13) != r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
    
        if (r2.a(defpackage.rbu.a, r13) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        if (r2.c(r14, r13) == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00b8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00df -> B:8:0x00e0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        ProductsCommon$Section productsCommon$Section;
        srq0 srq0Var = (srq0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List list = this.$screen.c;
            if (!list.isEmpty()) {
                it = list.iterator();
                productsCommon$Section = null;
                if (it.hasNext()) {
                }
                return zy11.a;
            }
            Collection<e6v> values = this.$headers.values();
            this.L$0 = srq0Var;
            this.L$1 = null;
            this.label = 1;
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ProductsCommon$Section productsCommon$Section2 = (ProductsCommon$Section) this.L$4;
                Iterator it2 = (Iterator) this.L$3;
                kotlin.b.b(obj);
                ProductsScreenResponseMapper$mapResponseToModels$models$1 productsScreenResponseMapper$mapResponseToModels$models$1 = this;
                it = it2;
                productsCommon$Section = productsCommon$Section2;
                this = productsScreenResponseMapper$mapResponseToModels$models$1;
                if (it.hasNext()) {
                    ProductsCommon$Section productsCommon$Section3 = (ProductsCommon$Section) it.next();
                    x xVar = this.this$0;
                    Map<String, e6v> map = this.$headers;
                    Map<String, e6v> map2 = this.$shortcutModels;
                    Layout layout = this.$layout;
                    Screen screen = this.$screen;
                    Map<String, e6v> map3 = this.$stackItems;
                    this.L$0 = srq0Var;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = it;
                    this.L$4 = productsCommon$Section3;
                    this.label = 4;
                    productsScreenResponseMapper$mapResponseToModels$models$1 = this;
                    if (x.a(xVar, srq0Var, productsCommon$Section, productsCommon$Section3, map, map2, layout, screen, map3, productsScreenResponseMapper$mapResponseToModels$models$1) != coroutineSingletons) {
                        productsCommon$Section = productsCommon$Section3;
                        this = productsScreenResponseMapper$mapResponseToModels$models$1;
                        if (it.hasNext()) {
                        }
                    }
                    return coroutineSingletons;
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
            Collection<e6v> values2 = this.$shortcutModels.values();
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        if (!this.$headers.values().isEmpty() || !this.$shortcutModels.values().isEmpty()) {
            this.L$0 = srq0Var;
            this.L$1 = null;
            this.label = 2;
        }
        Collection<e6v> values22 = this.$shortcutModels.values();
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
    }
}
