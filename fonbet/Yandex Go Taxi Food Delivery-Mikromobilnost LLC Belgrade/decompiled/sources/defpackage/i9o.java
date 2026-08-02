package defpackage;

import com.squareup.moshi.Moshi;
import com.ybsdk.core.utils.dto.ErrorResponseDto;
import com.ybsdk.core.utils.dto.ErrorResponseDtoJsonAdapter;

/* loaded from: classes2.dex */
public final class i9o {
    public static ErrorResponseDto a(Moshi moshi, String str) {
        return new ErrorResponseDtoJsonAdapter(moshi).fromJson(str);
    }
}
