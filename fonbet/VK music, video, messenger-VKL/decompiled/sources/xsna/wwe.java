package xsna;

import com.vk.clips.edit.privacy.PrivacyViewer;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ClipsPrivacyInteractorImpl.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.data.ClipsPrivacyInteractorImpl$loadDisplayString$2", f = "ClipsPrivacyInteractorImpl.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class wwe extends SuspendLambda implements wzs<yvj, spj<? super String>, Object> {
    final /* synthetic */ List<Integer> $excludedFriendsListsIds;
    final /* synthetic */ List<UserId> $excludedUsersIds;
    final /* synthetic */ PrivacySetting $settings;
    final /* synthetic */ PrivacyViewer $viewer;
    int label;
    final /* synthetic */ xwe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwe(xwe xweVar, PrivacySetting privacySetting, List<UserId> list, List<Integer> list2, PrivacyViewer privacyViewer, spj<? super wwe> spjVar) {
        super(2, spjVar);
        this.this$0 = xweVar;
        this.$settings = privacySetting;
        this.$excludedUsersIds = list;
        this.$excludedFriendsListsIds = list2;
        this.$viewer = privacyViewer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new wwe(this.this$0, this.$settings, this.$excludedUsersIds, this.$excludedFriendsListsIds, this.$viewer, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super String> spjVar) {
        return ((wwe) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        xwe xweVar = this.this$0;
        io.reactivex.rxjava3.core.x<String> e = xweVar.a.e(xweVar.b, this.$settings, this.$excludedUsersIds, this.$excludedFriendsListsIds, this.$viewer);
        this.label = 1;
        Object f = sd9.f(e, this);
        return f == coroutineSingletons ? coroutineSingletons : f;
    }
}
