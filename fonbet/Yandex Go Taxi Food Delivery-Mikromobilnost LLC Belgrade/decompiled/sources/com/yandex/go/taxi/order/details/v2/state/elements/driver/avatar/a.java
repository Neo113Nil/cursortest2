package com.yandex.go.taxi.order.details.v2.state.elements.driver.avatar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import defpackage.avj0;
import defpackage.f1h0;
import defpackage.ggk0;
import defpackage.hgk0;
import defpackage.jgv;
import defpackage.mdh;
import defpackage.n7v;
import defpackage.ny61;
import defpackage.pkf;
import defpackage.pwy0;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vng;
import defpackage.vpr;
import defpackage.zuj0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;
import ru.yandex.taxi.widget.FormattedTextConverter$EmptyDrawable;

/* loaded from: classes14.dex */
public final class a {
    public final ggk0 a;
    public final zuj0 b;
    public final pwy0 c;
    public final jgv d;
    public final Context e;

    public a(ggk0 ggk0Var, zuj0 zuj0Var, pwy0 pwy0Var, jgv jgvVar, Context context) {
        this.a = ggk0Var;
        this.b = zuj0Var;
        this.c = pwy0Var;
        this.d = jgvVar;
        this.e = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (r8.emit(r10, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, vpr vprVar, String str, ContinuationImpl continuationImpl) {
        RideCardDriverAvatarDataSource$downloadAvatar$1 rideCardDriverAvatarDataSource$downloadAvatar$1;
        Object obj;
        Object obj2;
        int i;
        vpr vprVar2;
        aVar.getClass();
        if (continuationImpl instanceof RideCardDriverAvatarDataSource$downloadAvatar$1) {
            rideCardDriverAvatarDataSource$downloadAvatar$1 = (RideCardDriverAvatarDataSource$downloadAvatar$1) continuationImpl;
            int i2 = rideCardDriverAvatarDataSource$downloadAvatar$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardDriverAvatarDataSource$downloadAvatar$1.label = i2 - Integer.MIN_VALUE;
                obj = rideCardDriverAvatarDataSource$downloadAvatar$1.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardDriverAvatarDataSource$downloadAvatar$1.label;
                if (i != 0) {
                    b.b(obj);
                    hgk0 hgk0Var = new hgk0(true, aVar.c());
                    rideCardDriverAvatarDataSource$downloadAvatar$1.L$0 = vprVar;
                    rideCardDriverAvatarDataSource$downloadAvatar$1.L$1 = str;
                    rideCardDriverAvatarDataSource$downloadAvatar$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b.b(obj);
                            return obj;
                        }
                        vprVar2 = (vpr) rideCardDriverAvatarDataSource$downloadAvatar$1.L$2;
                        b.b(obj);
                        rideCardDriverAvatarDataSource$downloadAvatar$1.L$0 = null;
                        rideCardDriverAvatarDataSource$downloadAvatar$1.L$1 = null;
                        rideCardDriverAvatarDataSource$downloadAvatar$1.L$2 = null;
                        rideCardDriverAvatarDataSource$downloadAvatar$1.label = 3;
                        Object emit = vprVar2.emit(obj, rideCardDriverAvatarDataSource$downloadAvatar$1);
                        return emit != obj2 ? obj2 : emit;
                    }
                    str = (String) rideCardDriverAvatarDataSource$downloadAvatar$1.L$1;
                    vprVar = (vpr) rideCardDriverAvatarDataSource$downloadAvatar$1.L$0;
                    b.b(obj);
                }
                rideCardDriverAvatarDataSource$downloadAvatar$1.L$0 = null;
                rideCardDriverAvatarDataSource$downloadAvatar$1.L$1 = null;
                rideCardDriverAvatarDataSource$downloadAvatar$1.L$2 = vprVar;
                rideCardDriverAvatarDataSource$downloadAvatar$1.label = 2;
                obj = aVar.d(str, rideCardDriverAvatarDataSource$downloadAvatar$1);
                if (obj != obj2) {
                    vprVar2 = vprVar;
                    rideCardDriverAvatarDataSource$downloadAvatar$1.L$0 = null;
                    rideCardDriverAvatarDataSource$downloadAvatar$1.L$1 = null;
                    rideCardDriverAvatarDataSource$downloadAvatar$1.L$2 = null;
                    rideCardDriverAvatarDataSource$downloadAvatar$1.label = 3;
                    Object emit2 = vprVar2.emit(obj, rideCardDriverAvatarDataSource$downloadAvatar$1);
                    if (emit2 != obj2) {
                    }
                }
            }
        }
        rideCardDriverAvatarDataSource$downloadAvatar$1 = new RideCardDriverAvatarDataSource$downloadAvatar$1(aVar, continuationImpl);
        obj = rideCardDriverAvatarDataSource$downloadAvatar$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardDriverAvatarDataSource$downloadAvatar$1.label;
        if (i != 0) {
        }
        rideCardDriverAvatarDataSource$downloadAvatar$1.L$0 = null;
        rideCardDriverAvatarDataSource$downloadAvatar$1.L$1 = null;
        rideCardDriverAvatarDataSource$downloadAvatar$1.L$2 = vprVar;
        rideCardDriverAvatarDataSource$downloadAvatar$1.label = 2;
        obj = aVar.d(str, rideCardDriverAvatarDataSource$downloadAvatar$1);
        if (obj != obj2) {
        }
    }

    public final rol0 b(n7v n7vVar) {
        return new rol0(new RideCardDriverAvatarDataSource$collectAvatarState$1(n7vVar, this, null));
    }

    public final UiStateDrawableWrapper c() {
        Drawable t = vng.t(f1h0.driver_avatar_fallback, ((avj0) this.b).a);
        if (t == null) {
            t = new FormattedTextConverter$EmptyDrawable();
        }
        return pkf.g(t, "avatar_fallback", this.c.getThemeType());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        RideCardDriverAvatarDataSource$loadDriverAvatar$1 rideCardDriverAvatarDataSource$loadDriverAvatar$1;
        int i;
        if (continuationImpl instanceof RideCardDriverAvatarDataSource$loadDriverAvatar$1) {
            rideCardDriverAvatarDataSource$loadDriverAvatar$1 = (RideCardDriverAvatarDataSource$loadDriverAvatar$1) continuationImpl;
            int i2 = rideCardDriverAvatarDataSource$loadDriverAvatar$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardDriverAvatarDataSource$loadDriverAvatar$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardDriverAvatarDataSource$loadDriverAvatar$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardDriverAvatarDataSource$loadDriverAvatar$1.label;
                if (i != 0) {
                    b.b(obj);
                    rideCardDriverAvatarDataSource$loadDriverAvatar$1.L$0 = str;
                    rideCardDriverAvatarDataSource$loadDriverAvatar$1.label = 1;
                    ggk0 ggk0Var = this.a;
                    ggk0Var.a.getClass();
                    sjh sjhVar = uyj.a;
                    obj = tje.k0(mdh.b, new RideCardDriverAvatarRepository$loadAvatar$2(ggk0Var, str, null), rideCardDriverAvatarDataSource$loadDriverAvatar$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) rideCardDriverAvatarDataSource$loadDriverAvatar$1.L$0;
                    b.b(obj);
                }
                Bitmap bitmap = (Bitmap) obj;
                return new hgk0(false, pkf.g(bitmap == null ? new BitmapDrawable(this.e.getResources(), bitmap) : c(), str, null));
            }
        }
        rideCardDriverAvatarDataSource$loadDriverAvatar$1 = new RideCardDriverAvatarDataSource$loadDriverAvatar$1(this, continuationImpl);
        Object obj2 = rideCardDriverAvatarDataSource$loadDriverAvatar$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardDriverAvatarDataSource$loadDriverAvatar$1.label;
        if (i != 0) {
        }
        Bitmap bitmap2 = (Bitmap) obj2;
        return new hgk0(false, pkf.g(bitmap2 == null ? new BitmapDrawable(this.e.getResources(), bitmap2) : c(), str, null));
    }
}
