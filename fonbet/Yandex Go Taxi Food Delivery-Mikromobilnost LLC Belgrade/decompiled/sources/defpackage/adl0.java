package defpackage;

import com.yandex.go.address.models.Address;
import java.util.function.IntConsumer;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Ladl0;", "Ll050;", "Lbdl0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface adl0 extends l050, bdl0 {
    void askAdd(Address address);

    void askUpdate(Address address, int i);

    void attachBackButton();

    void attachSlideableShadowView();

    void close();

    void setStops(ddl0 ddl0Var, IntConsumer intConsumer, String str, sls slsVar);

    void showRouteStopsShadow();
}
