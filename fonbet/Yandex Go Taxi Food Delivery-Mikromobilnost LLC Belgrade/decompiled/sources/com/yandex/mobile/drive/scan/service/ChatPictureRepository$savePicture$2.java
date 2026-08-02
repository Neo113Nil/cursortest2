package com.yandex.mobile.drive.scan.service;

import android.graphics.Bitmap;
import defpackage.g8e;
import defpackage.h2b1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qgn0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mobile.drive.scan.service.ChatPictureRepository$savePicture$2", f = "ChatPictureRepository.kt", l = {21}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChatPictureRepository$savePicture$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $dirname;
    final /* synthetic */ String $filename;
    final /* synthetic */ Bitmap $picture;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPictureRepository$savePicture$2(a aVar, String str, String str2, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$dirname = str;
        this.$filename = str2;
        this.$picture = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatPictureRepository$savePicture$2(this.this$0, this.$dirname, this.$filename, this.$picture, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatPictureRepository$savePicture$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        File file;
        qgn0 qgn0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            File file2 = new File(new File(this.this$0.a, this.$dirname), this.$filename);
            try {
                file2.delete();
                a aVar = this.this$0;
                Bitmap bitmap = this.$picture;
                this.L$0 = file2;
                this.label = 1;
                Object a = a.a(aVar, bitmap, file2, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = a;
                file = file2;
            } catch (IOException unused) {
                file = file2;
                Map z = g8e.z("file", file.getAbsolutePath());
                qgn0Var = h2b1.c;
                if (qgn0Var != null) {
                    qgn0Var.n("debug_video_save_error", z);
                }
                return null;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            file = (File) this.L$0;
            try {
                kotlin.b.b(obj);
            } catch (IOException unused2) {
                Map z2 = g8e.z("file", file.getAbsolutePath());
                qgn0Var = h2b1.c;
                if (qgn0Var != null) {
                }
                return null;
            }
        }
        return (String) obj;
    }
}
