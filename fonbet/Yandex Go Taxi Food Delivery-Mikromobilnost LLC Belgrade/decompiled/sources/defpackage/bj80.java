package defpackage;

import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationItemV2Dto$OrganizationPreviewItemV2Dto;
import com.yandex.go.places.impl.data.entities.network.organizations.h;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class bj80 extends xqt {
    public static final bj80 e = new bj80();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, h.INSTANCE.serializer(), qoi0.a(h.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("organization", OrganizationItemV2Dto$OrganizationPreviewItemV2Dto.Companion.serializer(), qoi0.a(OrganizationItemV2Dto$OrganizationPreviewItemV2Dto.class)));
    }
}
