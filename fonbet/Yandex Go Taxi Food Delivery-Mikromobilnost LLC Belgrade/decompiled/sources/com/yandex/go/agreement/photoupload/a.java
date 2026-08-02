package com.yandex.go.agreement.photoupload;

import com.yandex.go.agreement.api.trackable.network.TrackableAcceptanceActionParam;
import com.yandex.go.agreement.photoupload.experiments.PhotoUploadEulaExperiment;
import com.yandex.go.agreement.trackable.network.TrackableAcceptanceApi;
import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.repository.o;
import defpackage.ck;
import defpackage.cmt;
import defpackage.cne0;
import defpackage.d6z;
import defpackage.ejb0;
import defpackage.en11;
import defpackage.evu0;
import defpackage.fjb0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.i3y;
import defpackage.ijb0;
import defpackage.jst;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.on2;
import defpackage.rqo;
import defpackage.sjh;
import defpackage.tan;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zf2;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes.dex */
public final class a implements fjb0 {
    public final o a;
    public final ijb0 b;
    public final tan c;
    public final tt2 d;
    public final hit e;
    public final i3y f;
    public final i3y g;
    public final kotlinx.coroutines.sync.a h = gtq0.a();

    public a(on2 on2Var, rqo rqoVar, o oVar, ijb0 ijb0Var, tan tanVar, tt2 tt2Var, hit hitVar) {
        this.a = oVar;
        this.b = ijb0Var;
        this.c = tanVar;
        this.d = tt2Var;
        this.e = hitVar;
        this.f = kotlin.a.a(new ck(on2Var, 21));
        this.g = kotlin.a.a(new zf2(rqoVar, 10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x005d, code lost:
    
        if (r3 == r2) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c A[Catch: all -> 0x0077, TRY_ENTER, TryCatch #3 {all -> 0x0077, blocks: (B:27:0x0060, B:31:0x006c, B:33:0x0074, B:36:0x007e), top: B:26:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [g050] */
    /* JADX WARN: Type inference failed for: r3v5, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        PhotoUploadEulaInteractorImpl$savePendingIfZoneAvailable$1 photoUploadEulaInteractorImpl$savePendingIfZoneAvailable$1;
        int i;
        ?? r13;
        Throwable th;
        kotlinx.coroutines.sync.a aVar2;
        String l;
        g050 g050Var;
        cmt<zy11> a;
        ijb0 ijb0Var = aVar.b;
        try {
            try {
                if (continuationImpl instanceof PhotoUploadEulaInteractorImpl$savePendingIfZoneAvailable$1) {
                    photoUploadEulaInteractorImpl$savePendingIfZoneAvailable$1 = (PhotoUploadEulaInteractorImpl$savePendingIfZoneAvailable$1) continuationImpl;
                    int i2 = photoUploadEulaInteractorImpl$savePendingIfZoneAvailable$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        photoUploadEulaInteractorImpl$savePendingIfZoneAvailable$1.label = i2 - Integer.MIN_VALUE;
                        Object obj = photoUploadEulaInteractorImpl$savePendingIfZoneAvailable$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = photoUploadEulaInteractorImpl$savePendingIfZoneAvailable$1.label;
                        zy11 zy11Var = zy11.a;
                        if (i != 0) {
                            kotlin.b.b(obj);
                            kotlinx.coroutines.sync.a aVar3 = aVar.h;
                            photoUploadEulaInteractorImpl$savePendingIfZoneAvailable$1.L$0 = aVar3;
                            photoUploadEulaInteractorImpl$savePendingIfZoneAvailable$1.label = 1;
                            Object a2 = aVar3.a(photoUploadEulaInteractorImpl$savePendingIfZoneAvailable$1);
                            aVar2 = aVar3;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                g050Var = (g050) photoUploadEulaInteractorImpl$savePendingIfZoneAvailable$1.L$0;
                                try {
                                    kotlin.b.b(obj);
                                    ijb0Var.a.w("pending_eula_id");
                                } catch (CancellationException e) {
                                    throw e;
                                } catch (Throwable unused) {
                                    jst.e.getClass();
                                    g050Var.d(null);
                                    return zy11Var;
                                }
                                g050Var.d(null);
                                return zy11Var;
                            }
                            ?? r3 = (g050) photoUploadEulaInteractorImpl$savePendingIfZoneAvailable$1.L$0;
                            kotlin.b.b(obj);
                            aVar2 = r3;
                        }
                        l = ijb0Var.a.l("pending_eula_id", null);
                        if (l != null) {
                            aVar2.d(null);
                            return zy11Var;
                        }
                        Zone b = aVar.a.b();
                        String str = b != null ? b.a : null;
                        if (str == null) {
                            str = "";
                        }
                        if (str.length() == 0) {
                            aVar2.d(null);
                            return zy11Var;
                        }
                        try {
                            a = ((TrackableAcceptanceApi) aVar.f.getValue()).a(new TrackableAcceptanceActionParam(l, str, TrackableAcceptanceActionParam.Status.ACCEPTED, 2));
                            photoUploadEulaInteractorImpl$savePendingIfZoneAvailable$1.L$0 = aVar2;
                            photoUploadEulaInteractorImpl$savePendingIfZoneAvailable$1.L$1 = null;
                            photoUploadEulaInteractorImpl$savePendingIfZoneAvailable$1.L$2 = null;
                            photoUploadEulaInteractorImpl$savePendingIfZoneAvailable$1.label = 2;
                        } catch (CancellationException e2) {
                            throw e2;
                        } catch (Throwable unused2) {
                            g050Var = aVar2;
                            jst.e.getClass();
                            g050Var.d(null);
                            return zy11Var;
                        }
                        if (ru.yandex.taxi.network.api.a.a(a, null, photoUploadEulaInteractorImpl$savePendingIfZoneAvailable$1) != coroutineSingletons) {
                            g050Var = aVar2;
                            ijb0Var.a.w("pending_eula_id");
                            g050Var.d(null);
                            return zy11Var;
                        }
                        return coroutineSingletons;
                    }
                }
                l = ijb0Var.a.l("pending_eula_id", null);
                if (l != null) {
                }
            } catch (Throwable th2) {
                th = th2;
                r13 = aVar2;
                r13.d(null);
                throw th;
            }
            if (i != 0) {
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                r13 = aVar;
                th = th4;
                r13.d(null);
                throw th;
            }
        }
        photoUploadEulaInteractorImpl$savePendingIfZoneAvailable$1 = new PhotoUploadEulaInteractorImpl$savePendingIfZoneAvailable$1(aVar, continuationImpl);
        Object obj2 = photoUploadEulaInteractorImpl$savePendingIfZoneAvailable$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = photoUploadEulaInteractorImpl$savePendingIfZoneAvailable$1.label;
        zy11 zy11Var2 = zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00db, code lost:
    
        if (defpackage.evu0.J(r5) == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ejb0 b() {
        String str;
        PhotoUploadEulaExperiment photoUploadEulaExperiment = (PhotoUploadEulaExperiment) ((en11) this.g.getValue()).b();
        boolean z = photoUploadEulaExperiment.b;
        PhotoUploadEulaExperiment.Buttons buttons = photoUploadEulaExperiment.e;
        String str2 = photoUploadEulaExperiment.c;
        String str3 = null;
        if (z) {
            if (this.b.a.g("accepted_" + str2, false)) {
                return null;
            }
            List<Object> list = photoUploadEulaExperiment.d.a;
            ArrayList<ru.yandex.taxi.common_models.net.o> arrayList = new ArrayList(tcc.n(list, 10));
            for (Object obj : list) {
                if (obj instanceof FormattedText.h) {
                    FormattedText.h hVar = (FormattedText.h) obj;
                    obj = FormattedText.h.e(hVar, d6z.Y(photoUploadEulaExperiment, hVar.a), null, null, 2046);
                } else if (obj instanceof FormattedText.g) {
                    FormattedText.g gVar = (FormattedText.g) obj;
                    FormattedText.h hVar2 = gVar.b;
                    obj = FormattedText.g.e(gVar, FormattedText.h.e(hVar2, d6z.Y(photoUploadEulaExperiment, hVar2.a), null, null, 2046));
                }
                arrayList.add(obj);
            }
            FormattedText formattedText = new FormattedText(arrayList);
            if (!arrayList.isEmpty()) {
                for (ru.yandex.taxi.common_models.net.o oVar : arrayList) {
                    if (((oVar instanceof FormattedText.h) && !evu0.J(((FormattedText.h) oVar).a)) || ((oVar instanceof FormattedText.g) && !evu0.J(((FormattedText.g) oVar).b.a))) {
                        String a = buttons != null ? buttons.getA() : null;
                        if (a != null) {
                            if (evu0.J(a)) {
                                a = null;
                            }
                            if (a != null) {
                                str = d6z.Y(photoUploadEulaExperiment, a);
                            }
                        }
                        str = null;
                        String b = buttons != null ? buttons.getB() : null;
                        if (b != null) {
                            if (evu0.J(b)) {
                                b = null;
                            }
                            if (b != null) {
                                String Y = d6z.Y(photoUploadEulaExperiment, b);
                                if (!evu0.J(Y)) {
                                    str3 = Y;
                                }
                            }
                        }
                        return new ejb0(str2, str, str3, formattedText);
                    }
                }
            }
        }
        return null;
    }

    public final void c(String str) {
        cne0 cne0Var = this.b.a;
        cne0Var.u("accepted_" + str, true);
        cne0Var.r("pending_eula_id", str);
        hbp0 hbp0Var = this.e.a;
        this.d.getClass();
        sjh sjhVar = uyj.a;
        tje.N(hbp0Var, mdh.b, null, new PhotoUploadEulaInteractorImpl$replay$1(this, null), 2);
    }
}
