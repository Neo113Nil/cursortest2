package com.yandex.go.profile.domain.flex;

import com.yandex.go.profile.data.ProfileItem;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class t implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ProfileItem.Id b;

    public t(vpr vprVar, ProfileItem.Id id) {
        this.a = vprVar;
        this.b = id;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ProfileSupportedItemsRepository$supportedItem$$inlined$map$1$2$1 profileSupportedItemsRepository$supportedItem$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ProfileSupportedItemsRepository$supportedItem$$inlined$map$1$2$1) {
            profileSupportedItemsRepository$supportedItem$$inlined$map$1$2$1 = (ProfileSupportedItemsRepository$supportedItem$$inlined$map$1$2$1) continuation;
            int i2 = profileSupportedItemsRepository$supportedItem$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                profileSupportedItemsRepository$supportedItem$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = profileSupportedItemsRepository$supportedItem$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = profileSupportedItemsRepository$supportedItem$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ProfileItem profileItem = ((Boolean) obj).booleanValue() ? new ProfileItem(this.b) : null;
                    profileSupportedItemsRepository$supportedItem$$inlined$map$1$2$1.L$0 = null;
                    profileSupportedItemsRepository$supportedItem$$inlined$map$1$2$1.L$1 = null;
                    profileSupportedItemsRepository$supportedItem$$inlined$map$1$2$1.L$2 = null;
                    profileSupportedItemsRepository$supportedItem$$inlined$map$1$2$1.L$3 = null;
                    profileSupportedItemsRepository$supportedItem$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(profileItem, profileSupportedItemsRepository$supportedItem$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        profileSupportedItemsRepository$supportedItem$$inlined$map$1$2$1 = new ProfileSupportedItemsRepository$supportedItem$$inlined$map$1$2$1(this, continuation);
        Object obj22 = profileSupportedItemsRepository$supportedItem$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = profileSupportedItemsRepository$supportedItem$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
