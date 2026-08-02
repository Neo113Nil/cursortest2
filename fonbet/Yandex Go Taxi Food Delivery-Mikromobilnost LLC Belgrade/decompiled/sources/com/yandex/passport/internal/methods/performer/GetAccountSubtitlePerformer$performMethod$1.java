package com.yandex.passport.internal.methods.performer;

import android.content.Context;
import android.text.BidiFormatter;
import com.yandex.passport.R;
import com.yandex.passport.api.PassportSocialConfiguration;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.resources.StringResource;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.SocialConfiguration;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.GetAccountSubtitlePerformer$performMethod$1", f = "GetAccountSubtitlePerformer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class GetAccountSubtitlePerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.internal.methods.s0 $method;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAccountSubtitlePerformer$performMethod$1(com.yandex.passport.internal.methods.s0 s0Var, q qVar, Continuation continuation) {
        super(2, continuation);
        this.$method = s0Var;
        this.this$0 = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetAccountSubtitlePerformer$performMethod$1(this.$method, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetAccountSubtitlePerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Integer valueOf;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Uid B = com.yandex.passport.internal.util.p.B((PassportUidImpl) this.$method.b.c);
        ModernAccount e = this.this$0.b.b(false).e(B);
        if (e == null) {
            throw new PassportAccountNotFoundException(B);
        }
        Context context = this.this$0.a;
        BidiFormatter bidiFormatter = BidiFormatter.getInstance();
        new com.yandex.passport.internal.common.m();
        String nativeDefaultEmail = e.getNativeDefaultEmail();
        if (nativeDefaultEmail != null ? com.yandex.passport.internal.common.m.a.h(nativeDefaultEmail) : false) {
            return com.yandex.passport.internal.properties.u.k(null, e.getNativeDefaultEmail());
        }
        int i = com.yandex.passport.internal.common.i.a[e.getAccountType().ordinal()];
        if (i == 1) {
            if (e.isPortal()) {
                return com.yandex.passport.internal.properties.u.k(bidiFormatter.unicodeWrap(e.getPhoneNumber()), e.getDisplayLogin());
            }
            return com.yandex.passport.internal.properties.u.k(bidiFormatter.unicodeWrap(e.getPhoneNumber()), e.getNativeDefaultEmail());
        }
        if (i == 2 || i == 3) {
            return com.yandex.passport.internal.properties.u.k(bidiFormatter.unicodeWrap(e.getPhoneNumber()), e.getNativeDefaultEmail());
        }
        if (i != 4) {
            if (i != 5) {
                return com.yandex.passport.internal.properties.u.k(bidiFormatter.unicodeWrap(e.getPhoneNumber()), null);
            }
            int i2 = R.string.passport_child_label;
            if (context != null) {
                str = context.getString(i2);
            } else {
                try {
                    str = StringResource.m281getimpl(StringResource.m277constructorimpl(i2));
                } catch (Throwable unused) {
                }
            }
            return com.yandex.passport.internal.properties.u.k(str, e.getDisplayLogin());
        }
        String unicodeWrap = bidiFormatter.unicodeWrap(e.getPhoneNumber());
        String socialProviderCode = e.getSocialProviderCode();
        if (socialProviderCode != null) {
            SocialConfiguration.Companion.getClass();
            PassportSocialConfiguration b = com.yandex.passport.internal.y.b(socialProviderCode);
            if (b != null) {
                switch (com.yandex.passport.internal.common.i.b[b.ordinal()]) {
                    case 1:
                        valueOf = Integer.valueOf(R.string.passport_am_social_vk);
                        break;
                    case 2:
                        valueOf = Integer.valueOf(R.string.passport_am_social_fb);
                        break;
                    case 3:
                        valueOf = Integer.valueOf(R.string.passport_am_social_twitter);
                        break;
                    case 4:
                        valueOf = Integer.valueOf(R.string.passport_am_social_ok);
                        break;
                    case 5:
                        valueOf = Integer.valueOf(R.string.passport_am_social_mailru);
                        break;
                    case 6:
                        valueOf = Integer.valueOf(R.string.passport_am_social_google);
                        break;
                    case 7:
                        valueOf = Integer.valueOf(R.string.passport_am_social_esia);
                        break;
                    default:
                        valueOf = null;
                        break;
                }
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    if (context != null) {
                        str = context.getString(intValue);
                    } else {
                        try {
                            str = StringResource.m281getimpl(StringResource.m277constructorimpl(intValue));
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
        }
        return com.yandex.passport.internal.properties.u.k(unicodeWrap, str);
    }
}
