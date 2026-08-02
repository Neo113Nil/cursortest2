package ru.rustore.sdk.pushclient.l;

import androidx.car.app.hardware.common.CarZone;
import com.vk.reefton.protocol.ReefProtocol$Event;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.niy0;

@b6l(c = "ru.rustore.sdk.pushclient.internal.data.source.ArbiterDataSource", f = "ArbiterDataSource.kt", l = {CarZone.CAR_ZONE_COLUMN_DRIVER, ReefProtocol$Event.Type.IMAGES_IMAGE_LOADED_VALUE}, m = "clear")
/* loaded from: classes9.dex */
public final class c$c extends ContinuationImpl {
    public niy0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ niy0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c$c(niy0 niy0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = niy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
