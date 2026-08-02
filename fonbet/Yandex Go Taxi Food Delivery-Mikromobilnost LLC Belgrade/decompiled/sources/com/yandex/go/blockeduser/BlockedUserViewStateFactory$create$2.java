package com.yandex.go.blockeduser;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.yandex.go.blockeduser.api.BlockedUserType;
import defpackage.avj0;
import defpackage.bgb0;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.g47;
import defpackage.k46;
import defpackage.kyh0;
import defpackage.l46;
import defpackage.me0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p36;
import defpackage.qeb1;
import defpackage.qje;
import defpackage.t7s;
import defpackage.tse;
import defpackage.wls;
import defpackage.xng0;
import defpackage.y37;
import defpackage.z37;
import defpackage.zy11;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lk46;", "<anonymous>", "(Ltse;)Lk46;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.blockeduser.BlockedUserViewStateFactory$create$2", f = "BlockedUserViewStateFactory.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class BlockedUserViewStateFactory$create$2 extends SuspendLambda implements wls {
    final /* synthetic */ p36 $blockedUser;
    final /* synthetic */ String $phone;
    int label;
    final /* synthetic */ l46 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockedUserViewStateFactory$create$2(p36 p36Var, l46 l46Var, String str, Continuation continuation) {
        super(2, continuation);
        this.$blockedUser = p36Var;
        this.this$0 = l46Var;
        this.$phone = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BlockedUserViewStateFactory$create$2(this.$blockedUser, this.this$0, this.$phone, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BlockedUserViewStateFactory$create$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        String str4 = this.$blockedUser.b;
        String str5 = "";
        g47 g47Var = y37.a;
        if (str4 != null && !evu0.J(str4) && (str2 = this.$blockedUser.c) != null && !evu0.J(str2)) {
            l46 l46Var = this.this$0;
            p36 p36Var = this.$blockedUser;
            l46Var.getClass();
            String str6 = p36Var.b;
            String str7 = p36Var.e;
            String str8 = p36Var.d;
            if (str6 == null) {
                str6 = "";
            }
            String str9 = p36Var.c;
            Calendar calendar = p36Var.f;
            if (str9 == null) {
                str9 = "";
            }
            me0 me0Var = l46Var.c;
            if (calendar == null || !l46Var.d.c(calendar)) {
                if (calendar == null) {
                    me0Var.getClass();
                } else {
                    str5 = t7s.c(me0Var.a, calendar, 17);
                }
                str3 = str5;
            } else {
                str3 = t7s.c(me0Var.a, calendar, 1);
            }
            Spanned c = qeb1.c(cvu0.v(str9, "$BLOCKED_UNTIL$", str3, false));
            g47 z37Var = (str8 == null || evu0.J(str8)) ? g47Var : new z37(str8);
            if (str7 != null && !evu0.J(str7)) {
                g47Var = new z37(str7);
            }
            return new k46(str6, c, z37Var, g47Var);
        }
        l46 l46Var2 = this.this$0;
        p36 p36Var2 = this.$blockedUser;
        String str10 = this.$phone;
        avj0 avj0Var = (avj0) l46Var2.a;
        String h = avj0Var.h(kyh0.blocked_caption);
        me0 me0Var2 = l46Var2.c;
        BlockedUserType blockedUserType = p36Var2.a;
        Calendar calendar2 = p36Var2.f;
        BlockedUserType blockedUserType2 = BlockedUserType.PHONE;
        if (blockedUserType != blockedUserType2 || str10 == null || evu0.J(str10)) {
            if (calendar2 == null) {
                me0Var2.getClass();
            } else {
                str5 = t7s.c(me0Var2.a, calendar2, 17);
            }
            str = avj0Var.i(kyh0.blocked_id_message, str5);
        } else {
            if (calendar2 == null) {
                me0Var2.getClass();
            } else {
                str5 = t7s.c(me0Var2.a, calendar2, 17);
            }
            String c2 = bgb0.c(str10);
            String i = avj0Var.i(kyh0.blocked_number_message, c2, str5);
            int H = evu0.H(i, c2, 0, false, 6);
            int length = c2.length() + H;
            SpannableString spannableString = new SpannableString(i);
            spannableString.setSpan(new StyleSpan(1), H, length, 0);
            spannableString.setSpan(new ForegroundColorSpan(qje.t(xng0.textMain, avj0Var.a)), H, length, 0);
            str = spannableString;
        }
        z37 z37Var2 = new z37(avj0Var.h(kyh0.blocked_appeal));
        if (p36Var2.a == blockedUserType2) {
            g47Var = new z37(avj0Var.h(kyh0.blocked_change_number));
        }
        return new k46(h, str, z37Var2, g47Var);
    }
}
