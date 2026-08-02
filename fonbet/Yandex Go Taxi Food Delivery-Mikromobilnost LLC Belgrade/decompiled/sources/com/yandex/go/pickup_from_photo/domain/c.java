package com.yandex.go.pickup_from_photo.domain;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import defpackage.anb0;
import defpackage.aob0;
import defpackage.bjb0;
import defpackage.bnb0;
import defpackage.cnb0;
import defpackage.epb0;
import defpackage.g8e;
import defpackage.g8o;
import defpackage.m950;
import defpackage.nmb0;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.sls;
import defpackage.smb0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tob0;
import defpackage.tse;
import defpackage.umb0;
import defpackage.w8v;
import defpackage.xob0;
import defpackage.y50;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class c {
    public final tse a;
    public final y50 b;
    public final epb0 c;
    public final com.yandex.go.pickup_from_photo.data.a d;
    public final i e;
    public final bjb0 f;
    public final umb0 g;
    public pzt0 h;
    public pzt0 i;

    public c(tse tseVar, y50 y50Var, epb0 epb0Var, com.yandex.go.pickup_from_photo.data.a aVar, i iVar, bjb0 bjb0Var, umb0 umb0Var) {
        this.a = tseVar;
        this.b = y50Var;
        this.c = epb0Var;
        this.d = aVar;
        this.e = iVar;
        this.f = bjb0Var;
        this.g = umb0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.yandex.go.pickup_from_photo.domain.a] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.yandex.go.pickup_from_photo.domain.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(final c cVar, final nmb0 nmb0Var, final aob0 aob0Var, ContinuationImpl continuationImpl) {
        CameraScreenActionsInteractor$onPhotoButtonClicked$1 cameraScreenActionsInteractor$onPhotoButtonClicked$1;
        int i;
        int i2;
        epb0 epb0Var = cVar.c;
        if (continuationImpl instanceof CameraScreenActionsInteractor$onPhotoButtonClicked$1) {
            cameraScreenActionsInteractor$onPhotoButtonClicked$1 = (CameraScreenActionsInteractor$onPhotoButtonClicked$1) continuationImpl;
            int i3 = cameraScreenActionsInteractor$onPhotoButtonClicked$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cameraScreenActionsInteractor$onPhotoButtonClicked$1.label = i3 - Integer.MIN_VALUE;
                Object obj = cameraScreenActionsInteractor$onPhotoButtonClicked$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cameraScreenActionsInteractor$onPhotoButtonClicked$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    epb0Var.a(c(cVar, null, 2));
                    final ?? r12 = epb0Var.d - epb0Var.c == 1 ? 1 : 0;
                    com.yandex.go.pickup_from_photo.data.a aVar = cVar.d;
                    w8v w8vVar = nmb0Var.a;
                    ?? r7 = new sls() { // from class: com.yandex.go.pickup_from_photo.domain.a
                        @Override // defpackage.sls
                        public final Object invoke() {
                            nmb0.this.b.invoke();
                            boolean z = r12;
                            c cVar2 = cVar;
                            if (z) {
                                bjb0 bjb0Var = cVar2.f;
                                epb0 epb0Var2 = cVar2.c;
                                int i4 = epb0Var2.c - 1;
                                Context context = bjb0Var.a;
                                epb0Var2.a(c.c(cVar2, FileProvider.getUriForFile(context, g8e.o("ru.yandex.taxi.utils.fileprovider.", context.getPackageName()), bjb0Var.a(i4)), 1));
                                cVar2.i = tje.N(cVar2.a, null, null, new CameraScreenActionsInteractor$onPhotoButtonClicked$2$1(cVar2, aob0Var, null), 3);
                            } else {
                                cVar2.c.a(c.c(cVar2, null, 3));
                            }
                            return zy11.a;
                        }
                    };
                    ?? r8 = new tls() { // from class: com.yandex.go.pickup_from_photo.domain.b
                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            nmb0.this.b.invoke();
                            c cVar2 = cVar;
                            tje.N(cVar2.a, null, null, new CameraScreenActionsInteractor$onPhotoButtonClicked$3$1(cVar2, (Exception) obj2, aob0Var, null), 3);
                            return zy11.a;
                        }
                    };
                    cameraScreenActionsInteractor$onPhotoButtonClicked$1.L$0 = null;
                    cameraScreenActionsInteractor$onPhotoButtonClicked$1.L$1 = null;
                    cameraScreenActionsInteractor$onPhotoButtonClicked$1.I$0 = r12;
                    cameraScreenActionsInteractor$onPhotoButtonClicked$1.label = 1;
                    if (aVar.a(w8vVar, r7, r8, cameraScreenActionsInteractor$onPhotoButtonClicked$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                i2 = epb0Var.c + 1;
                if (i2 <= epb0Var.d) {
                    epb0Var.c = i2;
                }
                return zy11.a;
            }
        }
        cameraScreenActionsInteractor$onPhotoButtonClicked$1 = new CameraScreenActionsInteractor$onPhotoButtonClicked$1(cVar, continuationImpl);
        Object obj2 = cameraScreenActionsInteractor$onPhotoButtonClicked$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cameraScreenActionsInteractor$onPhotoButtonClicked$1.label;
        if (i != 0) {
        }
        i2 = epb0Var.c + 1;
        if (i2 <= epb0Var.d) {
        }
        return zy11.a;
    }

    public static final void b(c cVar, Throwable th, aob0 aob0Var) {
        epb0 epb0Var = cVar.c;
        epb0Var.a(xob0.a);
        cnb0 cnb0Var = ((bnb0) aob0Var).a;
        cnb0Var.A((m950) cnb0Var.H.get(), new g8o(th), new anb0(cnb0Var));
        epb0Var.c = 0;
    }

    public static tob0 c(c cVar, Uri uri, int i) {
        boolean z = (i & 1) == 0;
        if ((i & 2) != 0) {
            uri = null;
        }
        epb0 epb0Var = cVar.c;
        int i2 = epb0Var.c;
        return new tob0(i2, i2 < epb0Var.d && !z, uri, uri != null);
    }

    public final void d(smb0 smb0Var, aob0 aob0Var) {
        this.h = tje.N(this.a, null, null, new CameraScreenActionsInteractor$handleAction$1(smb0Var, this, aob0Var, null), 3);
    }
}
