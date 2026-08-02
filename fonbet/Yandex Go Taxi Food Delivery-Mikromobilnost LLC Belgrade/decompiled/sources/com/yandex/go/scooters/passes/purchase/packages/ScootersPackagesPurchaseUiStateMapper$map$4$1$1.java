package com.yandex.go.scooters.passes.purchase.packages;

import defpackage.d8o0;
import defpackage.i8o0;
import defpackage.j8o0;
import defpackage.jl40;
import defpackage.k8o0;
import defpackage.l8o0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r8o0;
import defpackage.tse;
import defpackage.v8o0;
import defpackage.w511;
import defpackage.w8o0;
import defpackage.wls;
import defpackage.x8o0;
import defpackage.z8o0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll8o0;", "<anonymous>", "(Ltse;)Ll8o0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.purchase.packages.ScootersPackagesPurchaseUiStateMapper$map$4$1$1", f = "ScootersPackagesPurchaseUiStateMapper.kt", l = {114, HProv.PP_CACHE_SIZE, HProv.PP_INFO, 122, HProv.PP_DELETE_KEYSET}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPackagesPurchaseUiStateMapper$map$4$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ z8o0 $packageItem;
    final /* synthetic */ String $selectedId;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPackagesPurchaseUiStateMapper$map$4$1$1(z8o0 z8o0Var, i iVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$packageItem = z8o0Var;
        this.this$0 = iVar;
        this.$selectedId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPackagesPurchaseUiStateMapper$map$4$1$1(this.$packageItem, this.this$0, this.$selectedId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPackagesPurchaseUiStateMapper$map$4$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
    
        if (r0 == r6) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
    
        if (r0 == r6) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0135  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object e;
        CharSequence charSequence;
        Object e2;
        CharSequence charSequence2;
        Object a;
        String str2;
        CharSequence charSequence3;
        Object e3;
        k8o0 j8o0Var;
        Object e4;
        k8o0 k8o0Var;
        CharSequence charSequence4;
        String str3;
        CharSequence charSequence5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            z8o0 z8o0Var = this.$packageItem;
            str = z8o0Var.a;
            ru.yandex.taxi.widget.c cVar = this.this$0.d;
            FormattedText formattedText = z8o0Var.b;
            this.L$0 = str;
            this.label = 1;
            e = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, this, 30);
        } else {
            if (i != 1) {
                if (i == 2) {
                    CharSequence charSequence6 = (CharSequence) this.L$1;
                    String str4 = (String) this.L$0;
                    kotlin.b.b(obj);
                    charSequence = charSequence6;
                    str = str4;
                    e2 = obj;
                    charSequence2 = (CharSequence) e2;
                    x8o0 x8o0Var = this.$packageItem.d;
                    if (x8o0Var instanceof w8o0) {
                        ru.yandex.taxi.widget.c cVar2 = this.this$0.d;
                        FormattedText formattedText2 = ((w8o0) x8o0Var).a;
                        this.L$0 = null;
                        this.L$1 = str;
                        this.L$2 = charSequence;
                        this.L$3 = charSequence2;
                        this.label = 3;
                        e3 = ru.yandex.taxi.widget.c.e(cVar2, formattedText2, null, false, this, 30);
                        if (e3 != coroutineSingletons) {
                            str2 = str;
                            charSequence3 = charSequence;
                            j8o0Var = new j8o0((CharSequence) e3);
                            CharSequence charSequence7 = charSequence3;
                            String str5 = str2;
                            k8o0 k8o0Var2 = j8o0Var;
                            ru.yandex.taxi.widget.c cVar3 = this.this$0.d;
                            FormattedText formattedText3 = this.$packageItem.e;
                            this.L$0 = str5;
                            this.L$1 = charSequence7;
                            this.L$2 = charSequence2;
                            this.L$3 = k8o0Var2;
                            this.label = 5;
                            e4 = ru.yandex.taxi.widget.c.e(cVar3, formattedText3, null, false, this, 30);
                            if (e4 != coroutineSingletons) {
                            }
                        }
                    } else {
                        if (!(x8o0Var instanceof v8o0)) {
                            w511.b();
                            return null;
                        }
                        i iVar = this.this$0;
                        r8o0 r8o0Var = ((v8o0) x8o0Var).a;
                        this.L$0 = null;
                        this.L$1 = str;
                        this.L$2 = charSequence;
                        this.L$3 = charSequence2;
                        this.label = 4;
                        a = i.a(iVar, r8o0Var, this);
                        if (a != coroutineSingletons) {
                            str2 = str;
                            charSequence3 = charSequence;
                            j8o0Var = new i8o0((d8o0) a);
                            CharSequence charSequence72 = charSequence3;
                            String str52 = str2;
                            k8o0 k8o0Var22 = j8o0Var;
                            ru.yandex.taxi.widget.c cVar32 = this.this$0.d;
                            FormattedText formattedText32 = this.$packageItem.e;
                            this.L$0 = str52;
                            this.L$1 = charSequence72;
                            this.L$2 = charSequence2;
                            this.L$3 = k8o0Var22;
                            this.label = 5;
                            e4 = ru.yandex.taxi.widget.c.e(cVar32, formattedText32, null, false, this, 30);
                            if (e4 != coroutineSingletons) {
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                if (i == 3) {
                    CharSequence charSequence8 = (CharSequence) this.L$3;
                    charSequence3 = (CharSequence) this.L$2;
                    str2 = (String) this.L$1;
                    kotlin.b.b(obj);
                    charSequence2 = charSequence8;
                    e3 = obj;
                    j8o0Var = new j8o0((CharSequence) e3);
                    CharSequence charSequence722 = charSequence3;
                    String str522 = str2;
                    k8o0 k8o0Var222 = j8o0Var;
                    ru.yandex.taxi.widget.c cVar322 = this.this$0.d;
                    FormattedText formattedText322 = this.$packageItem.e;
                    this.L$0 = str522;
                    this.L$1 = charSequence722;
                    this.L$2 = charSequence2;
                    this.L$3 = k8o0Var222;
                    this.label = 5;
                    e4 = ru.yandex.taxi.widget.c.e(cVar322, formattedText322, null, false, this, 30);
                    if (e4 != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i != 4) {
                    if (i != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj2 = this.L$3;
                    charSequence5 = (CharSequence) this.L$2;
                    CharSequence charSequence9 = (CharSequence) this.L$1;
                    String str6 = (String) this.L$0;
                    kotlin.b.b(obj);
                    charSequence4 = charSequence9;
                    str3 = str6;
                    k8o0Var = obj2;
                    e4 = obj;
                    return new l8o0(str3, charSequence4, charSequence5, k8o0Var, (CharSequence) e4, jl40.l(this.$packageItem.a, this.$selectedId));
                }
                CharSequence charSequence10 = (CharSequence) this.L$3;
                charSequence3 = (CharSequence) this.L$2;
                str2 = (String) this.L$1;
                kotlin.b.b(obj);
                charSequence2 = charSequence10;
                a = obj;
                j8o0Var = new i8o0((d8o0) a);
                CharSequence charSequence7222 = charSequence3;
                String str5222 = str2;
                k8o0 k8o0Var2222 = j8o0Var;
                ru.yandex.taxi.widget.c cVar3222 = this.this$0.d;
                FormattedText formattedText3222 = this.$packageItem.e;
                this.L$0 = str5222;
                this.L$1 = charSequence7222;
                this.L$2 = charSequence2;
                this.L$3 = k8o0Var2222;
                this.label = 5;
                e4 = ru.yandex.taxi.widget.c.e(cVar3222, formattedText3222, null, false, this, 30);
                if (e4 != coroutineSingletons) {
                    k8o0Var = k8o0Var2222;
                    charSequence4 = charSequence7222;
                    str3 = str5222;
                    charSequence5 = charSequence2;
                    return new l8o0(str3, charSequence4, charSequence5, k8o0Var, (CharSequence) e4, jl40.l(this.$packageItem.a, this.$selectedId));
                }
                return coroutineSingletons;
            }
            String str7 = (String) this.L$0;
            kotlin.b.b(obj);
            str = str7;
            e = obj;
        }
        charSequence = (CharSequence) e;
        ru.yandex.taxi.widget.c cVar4 = this.this$0.d;
        FormattedText formattedText4 = this.$packageItem.c;
        this.L$0 = str;
        this.L$1 = charSequence;
        this.label = 2;
        e2 = ru.yandex.taxi.widget.c.e(cVar4, formattedText4, null, false, this, 30);
    }
}
