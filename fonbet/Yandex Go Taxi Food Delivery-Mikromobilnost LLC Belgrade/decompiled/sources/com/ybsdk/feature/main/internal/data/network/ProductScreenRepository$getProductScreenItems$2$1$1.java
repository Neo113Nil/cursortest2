package com.ybsdk.feature.main.internal.data.network;

import android.content.SharedPreferences;
import com.ybsdk.core.common.data.network.dto.ProductSkinV4Dto;
import com.ybsdk.feature.main.internal.data.network.dto.ScreenProductsV4ResponseDto;
import defpackage.at3;
import defpackage.b9f0;
import defpackage.dyt;
import defpackage.eh4;
import defpackage.evu0;
import defpackage.fxy0;
import defpackage.j6a1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.xvz;
import defpackage.yig;
import defpackage.zy11;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/ScreenProductsV4ResponseDto;", "dto", "Llaf0;", "<anonymous>", "(Lcom/ybsdk/feature/main/internal/data/network/dto/ScreenProductsV4ResponseDto;)Llaf0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.main.internal.data.network.ProductScreenRepository$getProductScreenItems$2$1$1", f = "ProductScreenRepository.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductScreenRepository$getProductScreenItems$2$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductScreenRepository$getProductScreenItems$2$1$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ProductScreenRepository$getProductScreenItems$2$1$1 productScreenRepository$getProductScreenItems$2$1$1 = new ProductScreenRepository$getProductScreenItems$2$1$1(this.this$0, continuation);
        productScreenRepository$getProductScreenItems$2$1$1.L$0 = obj;
        return productScreenRepository$getProductScreenItems$2$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductScreenRepository$getProductScreenItems$2$1$1) create((ScreenProductsV4ResponseDto) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str = null;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ScreenProductsV4ResponseDto screenProductsV4ResponseDto = (ScreenProductsV4ResponseDto) this.L$0;
        a aVar = this.this$0;
        aVar.getClass();
        Map<String, ProductSkinV4Dto> productsSkins = screenProductsV4ResponseDto.getProductsSkins();
        if (productsSkins != null) {
            for (Map.Entry<String, ProductSkinV4Dto> entry : productsSkins.entrySet()) {
                String key = entry.getKey();
                ProductSkinV4Dto value = entry.getValue();
                yig yigVar = aVar.k;
                String id = value.getId();
                b9f0 f = j6a1.f(value.getMini());
                eh4 d = j6a1.d(value.getBackground());
                SharedPreferences.Editor edit = yigVar.a.a.edit();
                String concat = "product_skin_for_".concat(key.toLowerCase(Locale.ROOT));
                fxy0 fxy0Var = f.e;
                String X = (fxy0Var == null || (list2 = (List) fxy0Var.a) == null) ? str : kotlin.collections.a.X(list2, ";", null, null, null, 62);
                if (X == null) {
                    X = "";
                }
                String X2 = (fxy0Var == null || (list = (List) fxy0Var.b) == null) ? str : kotlin.collections.a.X(list, ";", null, null, null, 62);
                String str2 = X2 != null ? X2 : "";
                fxy0 fxy0Var2 = (evu0.J(X) || evu0.J(str2)) ? str : new fxy0(X, str2);
                StringBuilder sb = new StringBuilder();
                sb.append("id:" + id);
                sb.append('\n');
                xvz.y(d.a, "background_color", sb, '\n');
                fxy0 fxy0Var3 = d.b;
                if (fxy0Var3 != null) {
                    xvz.y(fxy0Var3, "background_image", sb, '\n');
                }
                dyt dytVar = d.c;
                if (dytVar != null) {
                    String X3 = kotlin.collections.a.X(dytVar.a, ",", null, null, new at3(13), 30);
                    sb.append("background_gradient_angle:" + dytVar.b);
                    sb.append('\n');
                    sb.append("background_gradient_colors:".concat(X3));
                    sb.append('\n');
                }
                xvz.y(f.a, "mini_background_image", sb, '\n');
                xvz.y(f.b, "mini_background_color", sb, '\n');
                fxy0 fxy0Var4 = f.c;
                if (fxy0Var4 != null) {
                    xvz.y(fxy0Var4, "mini_title_color", sb, '\n');
                }
                fxy0 fxy0Var5 = f.d;
                if (fxy0Var5 != null) {
                    xvz.y(fxy0Var5, "mini_end_icon", sb, '\n');
                }
                fxy0 fxy0Var6 = f.f;
                if (fxy0Var6 != null) {
                    xvz.y(fxy0Var6, "mini_selection_color", sb, '\n');
                }
                fxy0 fxy0Var7 = f.g;
                if (fxy0Var7 != null) {
                    xvz.y(fxy0Var7, "mini_top_gradient_color", sb, '\n');
                }
                if (fxy0Var2 != 0) {
                    xvz.y(fxy0Var2, "mini_rays_gradient", sb, '\n');
                }
                fxy0 fxy0Var8 = f.h;
                if (fxy0Var8 != null) {
                    xvz.y(fxy0Var8, "mini_balance_shimmer", sb, '\n');
                }
                fxy0 fxy0Var9 = f.i;
                if (fxy0Var9 != null) {
                    xvz.y(fxy0Var9, "mini_balance_skeleton", sb, '\n');
                }
                edit.putString(concat, sb.toString());
                edit.apply();
                str = null;
            }
        }
        a aVar2 = this.this$0;
        this.label = 1;
        Object b = a.b(aVar2, screenProductsV4ResponseDto, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
