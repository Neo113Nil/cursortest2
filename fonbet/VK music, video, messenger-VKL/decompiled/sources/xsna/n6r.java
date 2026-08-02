package xsna;

import com.vk.geo.impl.model.VisibleStyle;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FetchImageIconByCacheUseCase.kt */
@b6l(c = "com.vk.geo.impl.usecase.FetchImageIconByCacheUseCase$execute$2", f = "FetchImageIconByCacheUseCase.kt", l = {95, 41, Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, 53, 128}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class n6r extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ do00 $marker;
    final /* synthetic */ boolean $prefetchForSecondStyle;
    final /* synthetic */ CharSequence $subtitle;
    final /* synthetic */ Map<do00, List<Pair<String, VisibleStyle>>> $urls;
    final /* synthetic */ ui50 $urlsMutex;
    final /* synthetic */ int $visibleStyle;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ q6r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6r(int i, do00 do00Var, ui50 ui50Var, q6r q6rVar, CharSequence charSequence, boolean z, Map<do00, List<Pair<String, VisibleStyle>>> map, spj<? super n6r> spjVar) {
        super(2, spjVar);
        this.$visibleStyle = i;
        this.$marker = do00Var;
        this.$urlsMutex = ui50Var;
        this.this$0 = q6rVar;
        this.$subtitle = charSequence;
        this.$prefetchForSecondStyle = z;
        this.$urls = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new n6r(this.$visibleStyle, this.$marker, this.$urlsMutex, this.this$0, this.$subtitle, this.$prefetchForSecondStyle, this.$urls, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((n6r) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f5, code lost:
    
        if (r2 == r0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00bb, code lost:
    
        if (r7.b(r20) == r0) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0173 A[Catch: all -> 0x0176, TryCatch #1 {all -> 0x0176, blocks: (B:25:0x015b, B:27:0x0173, B:28:0x0179), top: B:24:0x015b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0137  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        String str;
        ui50 ui50Var;
        Map<do00, List<Pair<String, VisibleStyle>>> map;
        do00 do00Var;
        int i2;
        Object d;
        ui50 ui50Var2;
        Map<do00, List<Pair<String, VisibleStyle>>> map2;
        do00 do00Var2;
        int i3;
        String str2;
        int R;
        ui50 ui50Var3;
        Map<do00, List<Pair<String, VisibleStyle>>> map3;
        do00 do00Var3;
        int i4;
        List<Pair<String, VisibleStyle>> list;
        Object d2;
        int i5;
        int i6;
        ui50 ui50Var4;
        Map<do00, List<Pair<String, VisibleStyle>>> map4;
        do00 do00Var4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                kotlin.a.a(obj);
                i = this.$visibleStyle;
                str = this.$marker.l;
                if (str != null && str.length() != 0) {
                    ui50Var = this.$urlsMutex;
                    map = this.$urls;
                    do00Var = this.$marker;
                    this.L$0 = str;
                    this.L$1 = ui50Var;
                    this.L$2 = map;
                    this.L$3 = do00Var;
                    this.I$0 = i;
                    this.I$1 = 0;
                    this.label = 1;
                    break;
                } else {
                    return s3q0.a;
                }
            case 1:
                i = this.I$0;
                do00Var = (do00) this.L$3;
                map = (Map) this.L$2;
                ui50Var = (ui50) this.L$1;
                str = (String) this.L$0;
                kotlin.a.a(obj);
                i2 = i;
                try {
                    map.put(do00Var, Collections.singletonList(new Pair(str, new VisibleStyle(i2))));
                    s3q0 s3q0Var = s3q0.a;
                    ui50Var.c(null);
                    q6r q6rVar = this.this$0;
                    do00 do00Var5 = this.$marker;
                    CharSequence charSequence = this.$subtitle;
                    this.L$0 = str;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.I$0 = i2;
                    this.label = 2;
                    q6rVar.getClass();
                    d = zvj.d(new o6r(q6rVar, do00Var5, i2, charSequence, null), this);
                    break;
                } finally {
                }
            case 2:
                int i7 = this.I$0;
                String str3 = (String) this.L$0;
                kotlin.a.a(obj);
                i2 = i7;
                str = str3;
                d = obj;
                if (((Boolean) d).booleanValue()) {
                    ui50Var2 = this.$urlsMutex;
                    map2 = this.$urls;
                    do00Var2 = this.$marker;
                    this.L$0 = str;
                    this.L$1 = ui50Var2;
                    this.L$2 = map2;
                    this.L$3 = do00Var2;
                    this.I$0 = i2;
                    this.I$1 = 0;
                    this.label = 3;
                    if (ui50Var2.b(this) != coroutineSingletons) {
                        i3 = i2;
                        try {
                            map2.remove(do00Var2);
                            ui50Var.c(null);
                            i2 = i3;
                        } finally {
                        }
                    }
                    return coroutineSingletons;
                }
                str2 = str;
                if (this.$prefetchForSecondStyle) {
                    return s3q0.a;
                }
                R = VisibleStyle.R(i2);
                ui50Var3 = this.$urlsMutex;
                map3 = this.$urls;
                do00Var3 = this.$marker;
                this.L$0 = str2;
                this.L$1 = ui50Var3;
                this.L$2 = map3;
                this.L$3 = do00Var3;
                this.I$0 = i2;
                this.I$1 = R;
                this.I$2 = 0;
                this.label = 4;
                if (ui50Var3.b(this) != coroutineSingletons) {
                    i4 = i2;
                    try {
                        List singletonList = Collections.singletonList(new Pair(str2, new VisibleStyle(R)));
                        list = map3.get(do00Var3);
                        if (list == null) {
                            list = EmptyList.b;
                        }
                        map3.put(do00Var3, j5g.u0(list, singletonList));
                        s3q0 s3q0Var2 = s3q0.a;
                        ui50Var.c(null);
                        q6r q6rVar2 = this.this$0;
                        do00 do00Var6 = this.$marker;
                        CharSequence charSequence2 = this.$subtitle;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.I$0 = i4;
                        this.I$1 = R;
                        this.label = 5;
                        q6rVar2.getClass();
                        int i8 = R;
                        d2 = zvj.d(new o6r(q6rVar2, do00Var6, i8, charSequence2, null), this);
                        if (d2 != coroutineSingletons) {
                            i5 = i4;
                            i6 = i8;
                            if (((Boolean) d2).booleanValue()) {
                                ui50 ui50Var5 = this.$urlsMutex;
                                Map<do00, List<Pair<String, VisibleStyle>>> map5 = this.$urls;
                                do00 do00Var7 = this.$marker;
                                this.L$0 = null;
                                this.L$1 = ui50Var5;
                                this.L$2 = map5;
                                this.L$3 = do00Var7;
                                this.I$0 = i5;
                                this.I$1 = i6;
                                this.I$2 = 0;
                                this.label = 6;
                                if (ui50Var5.b(this) != coroutineSingletons) {
                                    ui50Var4 = ui50Var5;
                                    map4 = map5;
                                    do00Var4 = do00Var7;
                                    try {
                                        map4.remove(do00Var4);
                                        s3q0 s3q0Var3 = s3q0.a;
                                    } finally {
                                    }
                                }
                            }
                            return s3q0.a;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return coroutineSingletons;
            case 3:
                i3 = this.I$0;
                do00Var2 = (do00) this.L$3;
                map2 = (Map) this.L$2;
                ui50Var2 = (ui50) this.L$1;
                str = (String) this.L$0;
                kotlin.a.a(obj);
                map2.remove(do00Var2);
                ui50Var.c(null);
                i2 = i3;
                str2 = str;
                if (this.$prefetchForSecondStyle) {
                }
                break;
            case 4:
                R = this.I$1;
                i4 = this.I$0;
                do00Var3 = (do00) this.L$3;
                map3 = (Map) this.L$2;
                ui50Var3 = (ui50) this.L$1;
                str2 = (String) this.L$0;
                kotlin.a.a(obj);
                List singletonList2 = Collections.singletonList(new Pair(str2, new VisibleStyle(R)));
                list = map3.get(do00Var3);
                if (list == null) {
                }
                map3.put(do00Var3, j5g.u0(list, singletonList2));
                s3q0 s3q0Var22 = s3q0.a;
                ui50Var.c(null);
                q6r q6rVar22 = this.this$0;
                do00 do00Var62 = this.$marker;
                CharSequence charSequence22 = this.$subtitle;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.I$0 = i4;
                this.I$1 = R;
                this.label = 5;
                q6rVar22.getClass();
                int i82 = R;
                d2 = zvj.d(new o6r(q6rVar22, do00Var62, i82, charSequence22, null), this);
                if (d2 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 5:
                int i9 = this.I$1;
                int i10 = this.I$0;
                kotlin.a.a(obj);
                i5 = i10;
                i6 = i9;
                d2 = obj;
                if (((Boolean) d2).booleanValue()) {
                }
                return s3q0.a;
            case 6:
                do00Var4 = (do00) this.L$3;
                map4 = (Map) this.L$2;
                ui50Var4 = (ui50) this.L$1;
                kotlin.a.a(obj);
                map4.remove(do00Var4);
                s3q0 s3q0Var32 = s3q0.a;
                return s3q0.a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
