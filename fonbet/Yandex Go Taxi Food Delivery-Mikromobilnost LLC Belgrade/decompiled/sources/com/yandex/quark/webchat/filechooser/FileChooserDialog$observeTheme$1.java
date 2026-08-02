package com.yandex.quark.webchat.filechooser;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import defpackage.dzq;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uui;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.webchat.filechooser.FileChooserDialog$observeTheme$1", f = "FileChooserDialog.kt", l = {MSException.ERROR_INVALID_PARAMETER}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FileChooserDialog$observeTheme$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ FileChooserDialog this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.quark.webchat.filechooser.FileChooserDialog$observeTheme$1$1", f = "FileChooserDialog.kt", l = {HProv.ALG_SID_KECCAK_224}, m = "invokeSuspend")
    /* renamed from: com.yandex.quark.webchat.filechooser.FileChooserDialog$observeTheme$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ FileChooserDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FileChooserDialog fileChooserDialog, Continuation continuation) {
            super(2, continuation);
            this.this$0 = fileChooserDialog;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            dzq dzqVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                dzqVar = this.this$0.colorTheme;
                dzqVar.getClass();
                tpr t = e.t(e.g(new FileChooserTheme$getTheme$1(dzqVar, null)));
                uui uuiVar = new uui(20, this.this$0);
                this.label = 1;
                if (t.collect(uuiVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileChooserDialog$observeTheme$1(FileChooserDialog fileChooserDialog, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fileChooserDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FileChooserDialog$observeTheme$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FileChooserDialog$observeTheme$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (b0.b(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
