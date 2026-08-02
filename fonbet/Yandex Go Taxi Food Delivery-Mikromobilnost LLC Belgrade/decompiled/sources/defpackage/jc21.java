package defpackage;

import com.squareup.moshi._MoshiKotlinTypesExtensionsKt;
import com.yandex.delivery.libs.imageupload.impl.data.UploadImageTypeDto;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class jc21 extends yme {
    @Override // defpackage.yme
    public final zme c(Type type) {
        if (jl40.l(_MoshiKotlinTypesExtensionsKt.getRawType(type), UploadImageTypeDto.class)) {
            return new s2u0(24);
        }
        return null;
    }
}
