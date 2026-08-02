package defpackage;

import com.yandex.go.scooters.ble.domain.model.ScootersBleCommandType;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public interface o1n0 {
    Object a(ScootersBleCommandType scootersBleCommandType, e1n0 e1n0Var, ContinuationImpl continuationImpl);

    Object b(String str, Continuation continuation);

    void disconnect();
}
