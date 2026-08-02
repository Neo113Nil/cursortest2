package com.yandex.go.beginners.safety.photo.main.ui;

import com.yandex.go.beginners.safety.experiments.SafetyNewbiesVerificationExperiment;
import defpackage.bvf0;
import defpackage.dxl0;
import defpackage.ejb0;
import defpackage.exl0;
import defpackage.f0w0;
import defpackage.fjb0;
import defpackage.fxl0;
import defpackage.jlh;
import defpackage.m2h0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yt11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class c implements yt11 {
    public final tt2 a;
    public final f0w0 b;
    public final fjb0 c;
    public final ru.yandex.taxi.widget.c d;
    public final r0 e = bvf0.c(new fxl0(0));

    public c(tt2 tt2Var, f0w0 f0w0Var, fjb0 fjb0Var, ru.yandex.taxi.widget.c cVar) {
        this.a = tt2Var;
        this.b = f0w0Var;
        this.c = fjb0Var;
        this.d = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(c cVar, fxl0 fxl0Var, ContinuationImpl continuationImpl) {
        SafetyPhotoMainUiStateInteractor$mapState$1 safetyPhotoMainUiStateInteractor$mapState$1;
        int i;
        ejb0 b;
        String str;
        String a;
        String a2;
        dxl0 dxl0Var;
        CharSequence charSequence;
        String str2;
        String str3;
        String str4;
        String str5;
        dxl0 dxl0Var2;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        f0w0 f0w0Var = cVar.b;
        if (continuationImpl instanceof SafetyPhotoMainUiStateInteractor$mapState$1) {
            safetyPhotoMainUiStateInteractor$mapState$1 = (SafetyPhotoMainUiStateInteractor$mapState$1) continuationImpl;
            int i2 = safetyPhotoMainUiStateInteractor$mapState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                safetyPhotoMainUiStateInteractor$mapState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = safetyPhotoMainUiStateInteractor$mapState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = safetyPhotoMainUiStateInteractor$mapState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SafetyNewbiesVerificationExperiment.PhotoStep.PhotoStepScreen photoStepScreen = fxl0Var.a.a;
                    b = ((com.yandex.go.agreement.photoupload.a) cVar.c).b();
                    String a3 = fxl0Var.a(photoStepScreen.a);
                    String a4 = fxl0Var.a(photoStepScreen.b);
                    String str11 = photoStepScreen.c;
                    if (str11 == null || (str = (String) fxl0Var.b.get(str11)) == null || str.length() <= 0) {
                        str = null;
                    }
                    if (b == null || (a = b.d) == null) {
                        a = fxl0Var.a(photoStepScreen.d);
                    }
                    a2 = (b == null || (str10 = b.c) == null) ? fxl0Var.a(photoStepScreen.e) : str10;
                    ((jlh) f0w0Var).getClass();
                    dxl0 dxl0Var3 = new dxl0(m2h0.ic_default_logo, m2h0.ic_default_logo_night);
                    if (b == null) {
                        dxl0Var = dxl0Var3;
                        charSequence = null;
                        str2 = str;
                        str3 = a;
                        str4 = a3;
                        str5 = a4;
                        return new exl0(str4, str5, str2, str3, a2, dxl0Var, charSequence, b != null ? b.a : null);
                    }
                    ru.yandex.taxi.widget.c cVar2 = cVar.d;
                    FormattedText formattedText = b.b;
                    safetyPhotoMainUiStateInteractor$mapState$1.L$0 = null;
                    safetyPhotoMainUiStateInteractor$mapState$1.L$1 = null;
                    safetyPhotoMainUiStateInteractor$mapState$1.L$2 = b;
                    safetyPhotoMainUiStateInteractor$mapState$1.L$3 = null;
                    safetyPhotoMainUiStateInteractor$mapState$1.L$4 = a3;
                    safetyPhotoMainUiStateInteractor$mapState$1.L$5 = a4;
                    safetyPhotoMainUiStateInteractor$mapState$1.L$6 = str;
                    safetyPhotoMainUiStateInteractor$mapState$1.L$7 = a;
                    safetyPhotoMainUiStateInteractor$mapState$1.L$8 = a2;
                    safetyPhotoMainUiStateInteractor$mapState$1.L$9 = dxl0Var3;
                    safetyPhotoMainUiStateInteractor$mapState$1.label = 1;
                    Object i3 = ru.yandex.taxi.widget.c.i(cVar2, formattedText, null, safetyPhotoMainUiStateInteractor$mapState$1, 30);
                    if (i3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = i3;
                    dxl0Var2 = dxl0Var3;
                    str6 = a3;
                    str7 = a4;
                    str8 = str;
                    str9 = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dxl0Var2 = (dxl0) safetyPhotoMainUiStateInteractor$mapState$1.L$9;
                    a2 = (String) safetyPhotoMainUiStateInteractor$mapState$1.L$8;
                    str9 = (String) safetyPhotoMainUiStateInteractor$mapState$1.L$7;
                    str8 = (String) safetyPhotoMainUiStateInteractor$mapState$1.L$6;
                    str7 = (String) safetyPhotoMainUiStateInteractor$mapState$1.L$5;
                    str6 = (String) safetyPhotoMainUiStateInteractor$mapState$1.L$4;
                    b = (ejb0) safetyPhotoMainUiStateInteractor$mapState$1.L$2;
                    kotlin.b.b(obj);
                }
                dxl0Var = dxl0Var2;
                charSequence = (CharSequence) obj;
                str3 = str9;
                str2 = str8;
                str5 = str7;
                str4 = str6;
                return new exl0(str4, str5, str2, str3, a2, dxl0Var, charSequence, b != null ? b.a : null);
            }
        }
        safetyPhotoMainUiStateInteractor$mapState$1 = new SafetyPhotoMainUiStateInteractor$mapState$1(cVar, continuationImpl);
        Object obj2 = safetyPhotoMainUiStateInteractor$mapState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = safetyPhotoMainUiStateInteractor$mapState$1.label;
        if (i != 0) {
        }
        dxl0Var = dxl0Var2;
        charSequence = (CharSequence) obj2;
        str3 = str9;
        str2 = str8;
        str5 = str7;
        str4 = str6;
        return new exl0(str4, str5, str2, str3, a2, dxl0Var, charSequence, b != null ? b.a : null);
    }

    @Override // defpackage.yt11
    public final tpr a() {
        tpr t = e.t(new b(this.e, this));
        this.a.getClass();
        return e.F(t, uyj.a);
    }
}
