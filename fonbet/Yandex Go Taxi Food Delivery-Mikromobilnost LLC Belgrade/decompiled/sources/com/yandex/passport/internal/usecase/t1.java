package com.yandex.passport.internal.usecase;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.data.network.ae;
import com.yandex.passport.internal.ModernAccount;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.tje;
import defpackage.zko;
import java.io.IOException;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class t1 extends com.yandex.passport.common.domain.a {
    public final Context b;
    public final com.yandex.passport.common.coroutine.a c;
    public final ae d;
    public final com.yandex.passport.internal.core.accounts.d e;
    public final com.yandex.passport.internal.core.accounts.a f;
    public final com.yandex.passport.internal.network.mappers.b g;

    public t1(Context context, com.yandex.passport.common.coroutine.a aVar, ae aeVar, com.yandex.passport.internal.core.accounts.d dVar, com.yandex.passport.internal.core.accounts.a aVar2, com.yandex.passport.internal.network.mappers.b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = context;
        this.c = aVar;
        this.d = aeVar;
        this.e = dVar;
        this.f = aVar2;
        this.g = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(t1 t1Var, byte[] bArr, ContinuationImpl continuationImpl) {
        UpdateAvatarUseCase$resizeImage$1 updateAvatarUseCase$resizeImage$1;
        int i;
        Bitmap bitmap;
        int i2;
        t1Var.getClass();
        if (continuationImpl instanceof UpdateAvatarUseCase$resizeImage$1) {
            updateAvatarUseCase$resizeImage$1 = (UpdateAvatarUseCase$resizeImage$1) continuationImpl;
            int i3 = updateAvatarUseCase$resizeImage$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                updateAvatarUseCase$resizeImage$1.label = i3 - Integer.MIN_VALUE;
                Object obj = updateAvatarUseCase$resizeImage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateAvatarUseCase$resizeImage$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    if (bArr.length > 7340032) {
                        int i4 = 1000;
                        if (decodeByteArray.getWidth() > decodeByteArray.getHeight()) {
                            i2 = (int) ((1000.0f / decodeByteArray.getWidth()) * decodeByteArray.getHeight());
                        } else {
                            i4 = (int) ((1000.0f / decodeByteArray.getHeight()) * decodeByteArray.getWidth());
                            i2 = 1000;
                        }
                        bitmap = Bitmap.createScaledBitmap(decodeByteArray, i4, i2, false);
                    } else {
                        bitmap = decodeByteArray;
                    }
                    zko zkoVar = ((com.yandex.passport.common.coroutine.b) t1Var.c).e;
                    UpdateAvatarUseCase$resizeImage$2 updateAvatarUseCase$resizeImage$2 = new UpdateAvatarUseCase$resizeImage$2(bitmap, decodeByteArray, null);
                    updateAvatarUseCase$resizeImage$1.label = 1;
                    obj = tje.k0(zkoVar, updateAvatarUseCase$resizeImage$2, updateAvatarUseCase$resizeImage$1);
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
                return obj;
            }
        }
        updateAvatarUseCase$resizeImage$1 = new UpdateAvatarUseCase$resizeImage$1(t1Var, continuationImpl);
        Object obj2 = updateAvatarUseCase$resizeImage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateAvatarUseCase$resizeImage$1.label;
        if (i != 0) {
        }
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[Catch: SecurityException -> 0x00a8, TRY_LEAVE, TryCatch #0 {SecurityException -> 0x00a8, blocks: (B:11:0x002b, B:13:0x007f, B:15:0x0083, B:19:0x0096, B:27:0x005f), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096 A[Catch: SecurityException -> 0x00a8, TRY_ENTER, TRY_LEAVE, TryCatch #0 {SecurityException -> 0x00a8, blocks: (B:11:0x002b, B:13:0x007f, B:15:0x0083, B:19:0x0096, B:27:0x005f), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // com.yandex.passport.common.domain.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(s1 s1Var, ContinuationImpl continuationImpl) {
        UpdateAvatarUseCase$run$1 updateAvatarUseCase$run$1;
        int i;
        ModernAccount e;
        t1 t1Var;
        Result result;
        try {
            if (continuationImpl instanceof UpdateAvatarUseCase$run$1) {
                updateAvatarUseCase$run$1 = (UpdateAvatarUseCase$run$1) continuationImpl;
                int i2 = updateAvatarUseCase$run$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    updateAvatarUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = updateAvatarUseCase$run$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = updateAvatarUseCase$run$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        e = this.e.a().e(s1Var.a());
                        if (e == null) {
                            return new Result(new Result.Failure(new PassportAccountNotFoundException(s1Var.a())));
                        }
                        String b = s1Var.b();
                        mdh mdhVar = ((com.yandex.passport.common.coroutine.b) this.c).d;
                        UpdateAvatarUseCase$rungIAlus$$inlined$openUrlEIfw9EY$1 updateAvatarUseCase$rungIAlus$$inlined$openUrlEIfw9EY$1 = new UpdateAvatarUseCase$rungIAlus$$inlined$openUrlEIfw9EY$1(this, b, null, this, e);
                        updateAvatarUseCase$run$1.L$0 = this;
                        updateAvatarUseCase$run$1.L$1 = e;
                        updateAvatarUseCase$run$1.label = 1;
                        obj = tje.k0(mdhVar, updateAvatarUseCase$rungIAlus$$inlined$openUrlEIfw9EY$1, updateAvatarUseCase$run$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        t1Var = this;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ModernAccount modernAccount = (ModernAccount) updateAvatarUseCase$run$1.L$1;
                        t1 t1Var2 = (t1) updateAvatarUseCase$run$1.L$0;
                        kotlin.b.b(obj);
                        e = modernAccount;
                        t1Var = t1Var2;
                    }
                    result = (Result) obj;
                    if (result != null) {
                        return new Result(new Result.Failure(new IOException("Illegal url")));
                    }
                    Object value = result.getValue();
                    t1Var.f.a(e.getAccount(), true);
                    return new Result(value);
                }
            }
            if (i != 0) {
            }
            result = (Result) obj;
            if (result != null) {
            }
        } catch (SecurityException e2) {
            return new Result(new Result.Failure(new IOException(e2)));
        }
        updateAvatarUseCase$run$1 = new UpdateAvatarUseCase$run$1(this, continuationImpl);
        Object obj2 = updateAvatarUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateAvatarUseCase$run$1.label;
    }
}
