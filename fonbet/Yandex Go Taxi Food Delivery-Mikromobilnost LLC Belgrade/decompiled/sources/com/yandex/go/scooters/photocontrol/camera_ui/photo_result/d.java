package com.yandex.go.scooters.photocontrol.camera_ui.photo_result;

import android.text.SpannableStringBuilder;
import com.yandex.go.scooters.photocontrol.api.ScootersExamType;
import com.yandex.go.scooters.photocontrol.data.model.ScootersPhotocontrolExperiment;
import defpackage.ad5;
import defpackage.aio0;
import defpackage.e2e0;
import defpackage.f9s;
import defpackage.iio0;
import defpackage.ijo0;
import defpackage.krl0;
import defpackage.ny61;
import defpackage.tio0;
import defpackage.tt2;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.utils.URLSpanFix;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class d extends ad5 {
    public final krl0 A;
    public final aio0 B;
    public final ijo0 C;
    public final ScootersExamType D;
    public final Set E;
    public final iio0 F;
    public final tt2 x;
    public final e2e0 y;
    public final e z;

    public d(tt2 tt2Var, e2e0 e2e0Var, e eVar, krl0 krl0Var, aio0 aio0Var, ijo0 ijo0Var, ScootersExamType scootersExamType, Set set, iio0 iio0Var) {
        super(tio0.class);
        this.x = tt2Var;
        this.y = e2e0Var;
        this.z = eVar;
        this.A = krl0Var;
        this.B = aio0Var;
        this.C = ijo0Var;
        this.D = scootersExamType;
        this.E = set;
        this.F = iio0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(d dVar, ScootersPhotocontrolExperiment scootersPhotocontrolExperiment, ContinuationImpl continuationImpl) {
        ScootersPhotocontrolPhotoResultPresenter$makeLink$1 scootersPhotocontrolPhotoResultPresenter$makeLink$1;
        int i;
        FormattedText formattedText;
        String str;
        String str2;
        dVar.getClass();
        if (continuationImpl instanceof ScootersPhotocontrolPhotoResultPresenter$makeLink$1) {
            scootersPhotocontrolPhotoResultPresenter$makeLink$1 = (ScootersPhotocontrolPhotoResultPresenter$makeLink$1) continuationImpl;
            int i2 = scootersPhotocontrolPhotoResultPresenter$makeLink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPhotocontrolPhotoResultPresenter$makeLink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPhotocontrolPhotoResultPresenter$makeLink$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPhotocontrolPhotoResultPresenter$makeLink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ScootersPhotocontrolExperiment.PersonalDataScreen.Legal legal = scootersPhotocontrolExperiment.d.e;
                    if (legal == null || (formattedText = legal.a) == null || (str = legal.b) == null) {
                        return null;
                    }
                    scootersPhotocontrolPhotoResultPresenter$makeLink$1.L$0 = null;
                    scootersPhotocontrolPhotoResultPresenter$makeLink$1.L$1 = null;
                    scootersPhotocontrolPhotoResultPresenter$makeLink$1.L$2 = str;
                    scootersPhotocontrolPhotoResultPresenter$makeLink$1.label = 1;
                    Object Lg = dVar.Lg(scootersPhotocontrolExperiment, formattedText, scootersPhotocontrolPhotoResultPresenter$makeLink$1);
                    if (Lg == obj2) {
                        return obj2;
                    }
                    obj = Lg;
                    str2 = str;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) scootersPhotocontrolPhotoResultPresenter$makeLink$1.L$2;
                    kotlin.b.b(obj);
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence) obj);
                spannableStringBuilder.setSpan(new URLSpanFix(str2), 0, spannableStringBuilder.length(), 33);
                return spannableStringBuilder;
            }
        }
        scootersPhotocontrolPhotoResultPresenter$makeLink$1 = new ScootersPhotocontrolPhotoResultPresenter$makeLink$1(dVar, continuationImpl);
        Object obj3 = scootersPhotocontrolPhotoResultPresenter$makeLink$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPhotocontrolPhotoResultPresenter$makeLink$1.label;
        if (i != 0) {
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder((CharSequence) obj3);
        spannableStringBuilder2.setSpan(new URLSpanFix(str2), 0, spannableStringBuilder2.length(), 33);
        return spannableStringBuilder2;
    }

    public final Object Lg(ScootersPhotocontrolExperiment scootersPhotocontrolExperiment, FormattedText formattedText, ContinuationImpl continuationImpl) {
        return e.s(this.z, f9s.e(formattedText, scootersPhotocontrolExperiment), continuationImpl);
    }
}
