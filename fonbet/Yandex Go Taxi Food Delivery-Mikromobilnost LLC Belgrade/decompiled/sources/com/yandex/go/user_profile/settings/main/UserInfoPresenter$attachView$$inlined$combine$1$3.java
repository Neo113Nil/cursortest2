package com.yandex.go.user_profile.settings.main;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.yandex.go.account.phonish_upgrade.o;
import defpackage.avj0;
import defpackage.bgb0;
import defpackage.bv11;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.hm;
import defpackage.kj;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.n150;
import defpackage.ny61;
import defpackage.on21;
import defpackage.oyr;
import defpackage.qje;
import defpackage.vng;
import defpackage.vpr;
import defpackage.wyg0;
import defpackage.xng0;
import defpackage.zls;
import defpackage.zn21;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.utils.CustomImageSpan;
import ru.yandex.taxi.utils.ForegroundColorSpanFix;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.user_profile.settings.main.UserInfoPresenter$attachView$$inlined$combine$1$3", f = "UserInfoPresenter.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class UserInfoPresenter$attachView$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ on21 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserInfoPresenter$attachView$$inlined$combine$1$3(on21 on21Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = on21Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UserInfoPresenter$attachView$$inlined$combine$1$3 userInfoPresenter$attachView$$inlined$combine$1$3 = new UserInfoPresenter$attachView$$inlined$combine$1$3(this.this$0, (Continuation) obj3);
        userInfoPresenter$attachView$$inlined$combine$1$3.L$0 = (vpr) obj;
        userInfoPresenter$attachView$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return userInfoPresenter$attachView$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        zn21 zn21Var;
        String i;
        String p;
        CharSequence charSequence;
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Object obj7 = objArr[5];
            bv11 bv11Var = (bv11) obj7;
            boolean booleanValue = ((Boolean) obj6).booleanValue();
            n150 n150Var = (n150) obj5;
            String str3 = (String) obj4;
            String str4 = (String) obj3;
            ((Boolean) obj2).getClass();
            on21 on21Var = this.this$0;
            ru.yandex.taxi.am.g gVar = on21Var.x;
            k kVar = gVar.a;
            hm hmVar = gVar.j;
            kj Ig = kVar.Ig();
            str = "";
            if (n150Var.a()) {
                zuj0 zuj0Var = on21Var.C;
                CharSequence charSequence2 = Ig != null ? Ig.e : null;
                if (charSequence2 == null) {
                    charSequence2 = "";
                }
                String str5 = n150Var.a;
                String str6 = n150Var.b;
                boolean z = str5 == null || evu0.J(str5);
                boolean J = evu0.J(charSequence2);
                boolean z2 = str6 == null || evu0.J(str6);
                if (z && J) {
                    CharSequence a = hmVar.a(Ig);
                    if (booleanValue) {
                        o oVar = (o) on21Var.D;
                        oVar.getClass();
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        Context context = oVar.a;
                        Drawable t = vng.t(wyg0.ic_phonish_error, context);
                        if (t != null) {
                            CustomImageSpan customImageSpan = new CustomImageSpan(t, 2, false, false, null, 28, null);
                            int length = spannableStringBuilder.length();
                            spannableStringBuilder.append((CharSequence) " ");
                            spannableStringBuilder.setSpan(customImageSpan, length, spannableStringBuilder.length(), 17);
                            spannableStringBuilder.append((CharSequence) " ");
                        }
                        ForegroundColorSpanFix foregroundColorSpanFix = new ForegroundColorSpanFix(qje.t(xng0.error, context));
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.append(a);
                        spannableStringBuilder.setSpan(foregroundColorSpanFix, length2, spannableStringBuilder.length(), 17);
                        a = new SpannedString(spannableStringBuilder);
                    }
                    avj0 avj0Var = (avj0) zuj0Var;
                    i = avj0Var.h(kyh0.user_rating_introduction_text);
                    charSequence = a;
                    p = avj0Var.h(kyh0.user_rating_introduction_text);
                } else {
                    if (!z) {
                        charSequence2 = str5.toString();
                    }
                    i = !z2 ? ((avj0) zuj0Var).i(kyh0.menu_header_rating_placeholder, str6) : "";
                    p = z2 ? "" : g8e.p(((avj0) zuj0Var).h(kyh0.user_profile_rating_title), " ", str6);
                    charSequence = charSequence2;
                }
                zn21Var = new zn21(charSequence, i, p, 2, false, bv11Var);
            } else {
                if (Ig != null) {
                    String a2 = hmVar.a(Ig);
                    if (!Ig.m) {
                        Pattern pattern = bgb0.a;
                        str3 = (str4 == null || evu0.J(str4)) ? "" : oyr.p("\u200e", bgb0.c(str4), "\u200e");
                    }
                    str = a2;
                    str2 = str3;
                } else {
                    str2 = "";
                }
                zn21Var = new zn21(str, str2, str2, 1, true, bv11Var);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(zn21Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
