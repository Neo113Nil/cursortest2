package ru.rustore.sdk.pushclient.A;

import androidx.car.app.hardware.common.CarZone;
import com.vk.reefton.protocol.ReefProtocol$Event;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.cfy0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.push.storage.PushTokenDataSource", f = "PushTokenDataSource.kt", l = {CarZone.CAR_ZONE_COLUMN_DRIVER, ReefProtocol$Event.Type.IMAGES_IMAGE_LOADED_VALUE}, m = "saveLastDeliveredToClientToken")
/* loaded from: classes9.dex */
public final class b$h extends ContinuationImpl {
    public cfy0 a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ cfy0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b$h(cfy0 cfy0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = cfy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.h(null, this);
    }
}
