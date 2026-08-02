package com.yandex.passport.internal.sloth.webauthn;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.yandex.passport.internal.flags.j;
import com.yandex.passport.internal.flags.q;
import defpackage.gyf0;
import defpackage.kgx;
import defpackage.me0;
import defpackage.mtb1;
import defpackage.ny61;
import defpackage.q5t;
import defpackage.qoi0;
import defpackage.s5t;
import defpackage.v7f;
import defpackage.w7f;
import defpackage.z941;
import defpackage.zbt;
import java.util.Collections;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class a implements c {
    public static final /* synthetic */ kgx[] c;
    public final j a;
    public final z941 b = new z941(0);

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("activity", 0, "getActivity()Landroidx/fragment/app/FragmentActivity;", a.class);
        qoi0.a.getClass();
        c = new kgx[]{mutablePropertyReference1Impl};
    }

    public a(j jVar) {
        this.a = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061 A[Catch: Exception -> 0x0073, TryCatch #0 {Exception -> 0x0073, blocks: (B:10:0x0025, B:11:0x0059, B:13:0x0061, B:16:0x0066, B:23:0x0050), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066 A[Catch: Exception -> 0x0073, TRY_LEAVE, TryCatch #0 {Exception -> 0x0073, blocks: (B:10:0x0025, B:11:0x0059, B:13:0x0061, B:16:0x0066, B:23:0x0050), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.yandex.passport.internal.sloth.webauthn.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Continuation continuation) {
        GoogleApiClientWebAuthN$signIn$1 googleApiClientWebAuthN$signIn$1;
        int i;
        try {
            if (continuation instanceof GoogleApiClientWebAuthN$signIn$1) {
                googleApiClientWebAuthN$signIn$1 = (GoogleApiClientWebAuthN$signIn$1) continuation;
                int i2 = googleApiClientWebAuthN$signIn$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    googleApiClientWebAuthN$signIn$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = googleApiClientWebAuthN$signIn$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = googleApiClientWebAuthN$signIn$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        FragmentActivity fragmentActivity = (FragmentActivity) this.b.getValue(this, c[0]);
                        if (fragmentActivity == null) {
                            return new Result.Failure(new IllegalStateException("Can't sign in without activity"));
                        }
                        q5t q5tVar = new q5t(Collections.singletonList(new zbt(str)));
                        googleApiClientWebAuthN$signIn$1.label = 1;
                        obj = androidx.credentials.a.a(fragmentActivity, q5tVar, googleApiClientWebAuthN$signIn$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    mtb1 mtb1Var = ((s5t) obj).a;
                    return !(mtb1Var instanceof gyf0) ? ((gyf0) mtb1Var).a : new Result.Failure(new IllegalStateException("Error trying to authenticate"));
                }
            }
            if (i != 0) {
            }
            mtb1 mtb1Var2 = ((s5t) obj).a;
            if (!(mtb1Var2 instanceof gyf0)) {
            }
        } catch (Exception e) {
            return new Result.Failure(e);
        }
        googleApiClientWebAuthN$signIn$1 = new GoogleApiClientWebAuthN$signIn$1(this, (ContinuationImpl) continuation);
        Object obj2 = googleApiClientWebAuthN$signIn$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googleApiClientWebAuthN$signIn$1.label;
    }

    @Override // com.yandex.passport.internal.sloth.webauthn.c
    public final Object b() {
        Boolean bool = (Boolean) this.a.b(q.R);
        bool.getClass();
        return bool;
    }

    @Override // com.yandex.passport.internal.sloth.webauthn.c
    public final void c(AppCompatActivity appCompatActivity) {
        this.b.setValue(this, c[0], appCompatActivity);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.yandex.passport.internal.sloth.webauthn.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, Continuation continuation) {
        GoogleApiClientWebAuthN$register$1 googleApiClientWebAuthN$register$1;
        int i;
        try {
            if (continuation instanceof GoogleApiClientWebAuthN$register$1) {
                googleApiClientWebAuthN$register$1 = (GoogleApiClientWebAuthN$register$1) continuation;
                int i2 = googleApiClientWebAuthN$register$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    googleApiClientWebAuthN$register$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = googleApiClientWebAuthN$register$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = googleApiClientWebAuthN$register$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        FragmentActivity fragmentActivity = (FragmentActivity) this.b.getValue(this, c[0]);
                        if (fragmentActivity == null) {
                            return new Result.Failure(new IllegalStateException("Can't sign in without activity"));
                        }
                        me0 me0Var = new me0((Context) fragmentActivity, (byte) 0);
                        v7f v7fVar = new v7f(str);
                        googleApiClientWebAuthN$register$1.label = 1;
                        obj = me0Var.b(fragmentActivity, v7fVar, googleApiClientWebAuthN$register$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return ((w7f) obj).a;
                }
            }
            if (i != 0) {
            }
            return ((w7f) obj).a;
        } catch (Exception e) {
            return new Result.Failure(e);
        }
        googleApiClientWebAuthN$register$1 = new GoogleApiClientWebAuthN$register$1(this, (ContinuationImpl) continuation);
        Object obj2 = googleApiClientWebAuthN$register$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googleApiClientWebAuthN$register$1.label;
    }
}
