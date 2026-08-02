package com.yandex.messaging.ui.statuses;

import android.app.Activity;
import com.yandex.messaging.navigation.MessengerFragment;
import defpackage.noh;
import defpackage.ny61;
import defpackage.onn;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0094@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/messaging/ui/statuses/EditStatusFragment;", "Lcom/yandex/messaging/navigation/MessengerFragment;", "Lonn;", "Landroid/app/Activity;", "activity", "Lnoh;", "Lc020;", "activityComponentAsync", "<init>", "(Landroid/app/Activity;Lnoh;)V", "", "createBrick", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EditStatusFragment extends MessengerFragment<onn> {
    public static final int $stable = 0;

    public EditStatusFragment(Activity activity, noh nohVar) {
        super(activity, nohVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.messaging.navigation.MessengerFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createBrick(Continuation<Object> continuation) {
        EditStatusFragment$createBrick$1 editStatusFragment$createBrick$1;
        int i;
        if (continuation instanceof EditStatusFragment$createBrick$1) {
            editStatusFragment$createBrick$1 = (EditStatusFragment$createBrick$1) continuation;
            int i2 = editStatusFragment$createBrick$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                editStatusFragment$createBrick$1.label = i2 - Integer.MIN_VALUE;
                Object obj = editStatusFragment$createBrick$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = editStatusFragment$createBrick$1.label;
                if (i != 0) {
                    b.b(obj);
                    noh activityComponentAsync = getActivityComponentAsync();
                    editStatusFragment$createBrick$1.L$0 = this;
                    editStatusFragment$createBrick$1.label = 1;
                    obj = activityComponentAsync.k(editStatusFragment$createBrick$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                throw oyr.d(obj);
            }
        }
        editStatusFragment$createBrick$1 = new EditStatusFragment$createBrick$1(this, continuation);
        Object obj2 = editStatusFragment$createBrick$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = editStatusFragment$createBrick$1.label;
        if (i != 0) {
        }
        throw oyr.d(obj2);
    }
}
