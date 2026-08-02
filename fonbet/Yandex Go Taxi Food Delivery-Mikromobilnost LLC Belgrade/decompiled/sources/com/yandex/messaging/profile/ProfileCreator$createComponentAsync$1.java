package com.yandex.messaging.profile;

import defpackage.bdf0;
import defpackage.bkw0;
import defpackage.fff0;
import defpackage.lff0;
import defpackage.mvg;
import defpackage.n8g;
import defpackage.ny61;
import defpackage.p8g;
import defpackage.q5z;
import defpackage.tse;
import defpackage.wls;
import defpackage.z83;
import defpackage.zy11;
import java.io.File;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lv320;", "<anonymous>", "(Ltse;)Lv320;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.profile.ProfileCreator$createComponentAsync$1", f = "ProfileCreator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class ProfileCreator$createComponentAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $profileId;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileCreator$createComponentAsync$1(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$profileId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProfileCreator$createComponentAsync$1(this.this$0, this.$profileId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ProfileCreator$createComponentAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        n8g n8gVar = this.this$0.b;
        String str = this.$profileId;
        n8gVar.getClass();
        str.getClass();
        n8gVar.b = str;
        lff0 lff0Var = this.this$0.e;
        String str2 = this.$profileId;
        lff0Var.getClass();
        File file = new File(new File(lff0Var.a.getNoBackupFilesDir(), "messenger"), str2);
        file.mkdirs();
        file.exists();
        z83.i();
        n8gVar.c = file;
        q5z.f(String.class, n8gVar.b);
        q5z.f(File.class, n8gVar.c);
        p8g p8gVar = new p8g(n8gVar.a, new fff0(), new bkw0(), n8gVar.b, n8gVar.c);
        c cVar = this.this$0;
        String str3 = this.$profileId;
        lff0 lff0Var2 = cVar.e;
        lff0Var2.getClass();
        File file2 = new File(new File(lff0Var2.a.getNoBackupFilesDir(), "messenger"), str3);
        file2.mkdirs();
        file2.exists();
        z83.i();
        if (!file2.exists()) {
            ((bdf0) p8gVar.c0.get()).reportEvent("profile dir not created", kotlin.collections.b.l(new Pair("dir", file2.toString())));
        }
        return p8gVar;
    }
}
