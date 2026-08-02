package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.group.Group;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.pg00;
import xsna.xg00;

/* compiled from: ManageCommunitiesNotificationsFeature.kt */
@b6l(c = "com.vk.settings.impl.presentation.base.mvi.communities.ManageCommunitiesNotificationsFeature$getGroups$1", f = "ManageCommunitiesNotificationsFeature.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class sg00 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ tg00 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg00(tg00 tg00Var, spj<? super sg00> spjVar) {
        super(2, spjVar);
        this.this$0 = tg00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new sg00(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((sg00) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Iterator it;
        j6h j6hVar;
        boolean z;
        CharSequence charSequence;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z2 = true;
        if (i == 0) {
            kotlin.a.a(obj);
            rqu rquVar = this.this$0.h;
            this.label = 1;
            Object b = rquVar.b(this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = b;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            obj2 = ((Result) obj).d();
        }
        qog qogVar = (qog) this.this$0.j.getValue();
        if (!(obj2 instanceof Result.Failure)) {
            List list = (List) obj2;
            qogVar.getClass();
            ArrayList arrayList = new ArrayList();
            arrayList.add(pg00.a.a);
            if (list.isEmpty()) {
                arrayList.add(pg00.c.a);
            } else {
                List list2 = list;
                j6h j6hVar2 = (j6h) qogVar.a.getValue();
                ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    Group group = (Group) it2.next();
                    j6hVar2.getClass();
                    Context context = j6hVar2.a;
                    long j = group.c.b;
                    String a = js5.a(480, group.f);
                    String str = group.x;
                    VerifyInfo verifyInfo = group.y;
                    if (verifyInfo.Cb()) {
                        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) group.b;
                        if (spannableStringBuilder == null) {
                            ucp ucpVar = ucp.a;
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ucp.i(group.d));
                            spannableStringBuilder2.append((char) 160);
                            spannableStringBuilder2.append((char) 160);
                            z = z2;
                            it = it2;
                            j6hVar = j6hVar2;
                            spannableStringBuilder2.setSpan(new dqa(VerifyInfoHelper.h(VerifyInfoHelper.a, verifyInfo, context, null, 28)), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 0);
                            group.b = spannableStringBuilder2;
                            charSequence = spannableStringBuilder2;
                        } else {
                            it = it2;
                            j6hVar = j6hVar2;
                            z = z2;
                            charSequence = spannableStringBuilder;
                        }
                    } else {
                        it = it2;
                        j6hVar = j6hVar2;
                        z = z2;
                        CharSequence charSequence2 = group.b;
                        charSequence = charSequence2;
                        if (charSequence2 == null) {
                            ucp ucpVar2 = ucp.a;
                            CharSequence i2 = ucp.i(group.d);
                            group.b = i2;
                            charSequence = i2;
                        }
                    }
                    String obj3 = charSequence.toString();
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(group.z);
                    if (group.G) {
                        ylw ylwVar = new ylw(R.drawable.vk_icon_badge_vk_pay_14);
                        ylwVar.f = iah0.a(2.0f);
                        ylwVar.g = iah0.a(8.0f);
                        ylwVar.h = R.attr.vk_ui_icon_secondary;
                        spannableStringBuilder3.append((CharSequence) ylwVar.b(context));
                    }
                    arrayList2.add(new pg00.b(a, str, obj3, spannableStringBuilder3.toString(), group.x, j));
                    it2 = it;
                    z2 = z;
                    j6hVar2 = j6hVar;
                }
                arrayList.addAll(arrayList2);
            }
            obj2 = arrayList;
        }
        tg00 tg00Var = this.this$0;
        if (!(obj2 instanceof Result.Failure)) {
            tg00Var.T(new xg00.a((List) obj2));
        }
        tg00 tg00Var2 = this.this$0;
        if (Result.a(obj2) != null) {
            tg00Var2.T(xg00.b.b);
        }
        return s3q0.a;
    }
}
