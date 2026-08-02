package com.ybsdk.feature.kyc.internal.screens.photov3;

import android.net.Uri;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.ajb0;
import defpackage.c03;
import defpackage.ds31;
import defpackage.g8e;
import defpackage.gao;
import defpackage.j3m;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pnx;
import defpackage.pz40;
import defpackage.qib0;
import defpackage.sr7;
import defpackage.tje;
import defpackage.vib0;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", AuthSdkActivity.RESPONSE_TYPE_TOKEN, "Lkotlin/Result;", "Lj3m;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.kyc.internal.screens.photov3.PhotoViewModel$uploadPhoto$4", f = "PhotoViewModel.kt", l = {343, 363, 365}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PhotoViewModel$uploadPhoto$4 extends SuspendLambda implements wls {
    final /* synthetic */ sr7 $photo;
    final /* synthetic */ boolean $shouldRetry403;
    final /* synthetic */ l8x $statusUpdateJob;
    final /* synthetic */ Uri $uri;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoViewModel$uploadPhoto$4(b bVar, sr7 sr7Var, Uri uri, boolean z, l8x l8xVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$photo = sr7Var;
        this.$uri = uri;
        this.$shouldRetry403 = z;
        this.$statusUpdateJob = l8xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PhotoViewModel$uploadPhoto$4 photoViewModel$uploadPhoto$4 = new PhotoViewModel$uploadPhoto$4(this.this$0, this.$photo, this.$uri, this.$shouldRetry403, this.$statusUpdateJob, continuation);
        photoViewModel$uploadPhoto$4.L$0 = obj;
        return photoViewModel$uploadPhoto$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PhotoViewModel$uploadPhoto$4) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0077, code lost:
    
        if (r0 == r7) goto L45;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object k;
        Object obj2;
        b bVar;
        Uri uri;
        Throwable th;
        Object obj3;
        r0 r0Var;
        Object value;
        LinkedHashMap linkedHashMap;
        r0 r0Var2;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) this.L$0;
            b bVar2 = this.this$0;
            com.ybsdk.feature.kyc.internal.interactor.a aVar = bVar2.E;
            sr7 sr7Var = this.$photo;
            pnx pnxVar = sr7Var.a;
            File k0 = bVar2.k0(sr7Var);
            File l0 = this.this$0.l0(this.$photo);
            qib0 qib0Var = ((ajb0) this.this$0.X()).e;
            c03 c03Var = qib0Var != null ? qib0Var.b : null;
            this.label = 1;
            k = aVar.k(pnxVar, k0, l0, c03Var, str, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    obj3 = this.L$0;
                    kotlin.b.b(obj);
                    obj2 = obj3;
                    return new Result(obj2);
                }
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = (Throwable) this.L$3;
                uri = (Uri) this.L$2;
                bVar = (b) this.L$1;
                obj2 = this.L$0;
                kotlin.b.b(obj);
                b.b0(bVar, th, uri);
                return new Result(obj2);
            }
            kotlin.b.b(obj);
            k = ((Result) obj).getValue();
        }
        obj2 = k;
        b bVar3 = this.this$0;
        sr7 sr7Var2 = this.$photo;
        Uri uri2 = this.$uri;
        if (!(obj2 instanceof Result.Failure)) {
            j3m j3mVar = (j3m) obj2;
            bVar3.H.j.a.a("camera_flow.photo.ok", g8e.w(1, "document_type", sr7Var2.a.a));
            pz40 Y = bVar3.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
                linkedHashMap = new LinkedHashMap(((ajb0) bVar3.X()).f);
                linkedHashMap.put(sr7Var2.a.a, j3mVar.b);
            } while (!r0Var.k(value, ajb0.a((ajb0) value, false, null, null, null, linkedHashMap, false, null, 223)));
            pz40 Y2 = bVar3.Y();
            do {
                r0Var2 = (r0) Y2;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, ajb0.a((ajb0) value2, false, null, new vib0(uri2), null, null, false, null, 247)));
            tje.N(ds31.a(bVar3), null, null, new PhotoViewModel$onUploadSuccess$2(bVar3, uri2, null), 3);
        }
        bVar = this.this$0;
        sr7 sr7Var3 = this.$photo;
        boolean z = this.$shouldRetry403;
        l8x l8xVar = this.$statusUpdateJob;
        Uri uri3 = this.$uri;
        Throwable a = Result.a(obj2);
        if (a != null) {
            bVar.H.j.a.a("camera_flow.photo.load.error", g8e.w(1, "document_type", sr7Var3.a.a));
            Integer a2 = gao.a(a);
            if (a2 != null && a2.intValue() == 403 && z) {
                l8xVar.a(null);
                this.L$0 = obj2;
                this.label = 2;
                if (bVar.m0(uri3, false, this) != coroutineSingletons) {
                    obj3 = obj2;
                    obj2 = obj3;
                }
            } else {
                this.L$0 = obj2;
                this.L$1 = bVar;
                this.L$2 = uri3;
                this.L$3 = a;
                this.label = 3;
                if (kotlinx.coroutines.a.i(300L, this) != coroutineSingletons) {
                    uri = uri3;
                    th = a;
                    b.b0(bVar, th, uri);
                }
            }
            return coroutineSingletons;
        }
        return new Result(obj2);
    }
}
