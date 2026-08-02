package com.yandex.go.user_profile.main_menu.profile.repository;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import defpackage.avj0;
import defpackage.evu0;
import defpackage.f1h0;
import defpackage.kj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.utils.CustomImageSpan;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.user_profile.main_menu.profile.repository.MainMenuUserProfileNameRepositoryImpl$getUserNameFlow$2", f = "MainMenuUserProfileNameRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MainMenuUserProfileNameRepositoryImpl$getUserNameFlow$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainMenuUserProfileNameRepositoryImpl$getUserNameFlow$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainMenuUserProfileNameRepositoryImpl$getUserNameFlow$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MainMenuUserProfileNameRepositoryImpl$getUserNameFlow$2) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar = this.this$0;
        String str2 = aVar.b.a().a;
        if (str2 == null) {
            str2 = "";
        }
        kj Ig = aVar.e.a.Ig();
        if (Ig == null || (str = Ig.e) == null) {
            str = "";
        }
        if (evu0.J(str2)) {
            str2 = evu0.J(str) ? aVar.c.a(Ig) : str;
        }
        if (evu0.J(str2)) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str2);
        Drawable t = vng.t(f1h0.ic_chevron_next_circle_16dp, ((avj0) aVar.f).a);
        if (t != null) {
            spannableStringBuilder.append(" ", new CustomImageSpan(t, 1, true, false, null, 24, null), 33);
        }
        return new SpannedString(spannableStringBuilder);
    }
}
