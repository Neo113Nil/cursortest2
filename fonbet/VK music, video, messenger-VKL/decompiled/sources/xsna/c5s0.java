package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import java.util.Collections;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.api.json.JsonToken;
import xsna.dzr0;

/* compiled from: VideoBannerTrapLoader.kt */
@b6l(c = "com.vk.video.ui.discovery.minimizable.banner_trap.VideoBannerTrapLoader$observeTrapBannerItemInternal$1$1", f = "VideoBannerTrapLoader.kt", l = {JsonToken.END_ARRAY}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class c5s0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ io.reactivex.rxjava3.core.r<List<hfz>> $emitter;
    int label;
    final /* synthetic */ d5s0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5s0(d5s0 d5s0Var, io.reactivex.rxjava3.core.r<List<hfz>> rVar, spj<? super c5s0> spjVar) {
        super(2, spjVar);
        this.this$0 = d5s0Var;
        this.$emitter = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new c5s0(this.this$0, this.$emitter, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((c5s0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        dzr0 dzr0Var;
        b5s0 b2;
        String a;
        List<hfz> list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                vyr0 vyr0Var = this.this$0.b;
                this.label = 1;
                b = vyr0Var.b(this);
                if (b == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                b = ((Result) obj).d();
            }
            if (b instanceof Result.Failure) {
                b = null;
            }
            dzr0Var = (dzr0) b;
            b2 = com.vk.toggle.d.J.b();
            a = dzr0Var != null ? ezr0.a(dzr0Var) : null;
            if (a == null) {
                a = "";
            }
        } catch (Exception unused) {
            this.$emitter.onNext(EmptyList.b);
            this.$emitter.onComplete();
        }
        if ((dzr0Var instanceof dzr0.b) && b2 != null) {
            String str = b2.a;
            if (str.length() > 0) {
                this.this$0.d.getClass();
                new bvt0(UiTracker.c(), SchemeStat$TypeView.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, null, null, null, null, null, 62, null), "", "", null, new MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow(MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi.BANNER_DISCOVER, null, 2, null), 8)).q();
                list = Collections.singletonList(new AboutVideoItem.a0(str, a));
                this.$emitter.onNext(list);
                this.$emitter.onComplete();
                return s3q0.a;
            }
        }
        list = EmptyList.b;
        this.$emitter.onNext(list);
        this.$emitter.onComplete();
        return s3q0.a;
    }
}
