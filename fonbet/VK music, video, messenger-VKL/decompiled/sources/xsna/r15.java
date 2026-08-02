package xsna;

import com.vk.api.generated.auth.dto.AuthGetAuthCodeStatusUserSessionDto;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: AuthArgs.kt */
/* loaded from: classes6.dex */
public final class r15 {
    public final String a;
    public final String b;
    public final int c;
    public final UserId d;
    public final List<AuthGetAuthCodeStatusUserSessionDto> e;

    public r15(String str, String str2, UserId userId, int i, List list) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = userId;
        this.e = list;
    }
}
