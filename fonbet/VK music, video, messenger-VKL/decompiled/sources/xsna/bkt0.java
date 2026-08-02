package xsna;

import android.view.View;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.dto.common.id.UserId;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: VideoTime.kt */
/* loaded from: classes7.dex */
public final class bkt0 {
    public static final String a(long j) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long hours = timeUnit.toHours(j);
        long j2 = 60;
        long minutes = timeUnit.toMinutes(j) % j2;
        long j3 = j % j2;
        return hours > 0 ? String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(j3)}, 3)) : String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(minutes), Long.valueOf(j3)}, 2));
    }

    public static final l7m b(View view, mdx0 mdx0Var) {
        return mdx0Var.a(view);
    }

    public static final hik0 c(klv0 klv0Var, androidx.compose.runtime.a aVar) {
        hik0 hik0Var;
        VkColorToken vkColorToken = klv0Var.b;
        VkTypographyToken vkTypographyToken = klv0Var.a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(969848660, 0, -1, "com.vk.core.compose.annotated.toSpanStyle (VkSpanStyle.kt:14)");
        }
        if (vkTypographyToken == null) {
            aVar.K(516509415);
            aVar.j();
            hik0Var = null;
        } else {
            aVar.K(516509416);
            hik0Var = nmo0.a(vkTypographyToken.a(aVar).a, vkColorToken.a(0, aVar), 0L, null, null, 0L, 0L, null, null, 16777214).a;
            aVar.j();
        }
        if (hik0Var == null) {
            aVar.K(516675824);
            hik0 hik0Var2 = new hik0(vkColorToken.a(0, aVar), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534);
            aVar.j();
            hik0Var = hik0Var2;
        } else {
            aVar.K(16661196);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return hik0Var;
    }

    public tfx d(String str, String str2) {
        tfx tfxVar = new tfx("voicerooms.editRoomCover", new itj0(10), new d4r0(4));
        tfx.o(tfxVar, "room_id", str, 0, 0, 12);
        if (str2 != null) {
            tfx.o(tfxVar, "cover_json", str2, 0, 0, 12);
        }
        return tfxVar;
    }

    public tfx e(UserId userId) {
        tfx tfxVar = new tfx("voicerooms.getRoomCoverPhotoUploadServer", new pft0(1), new umq0(4));
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        return tfxVar;
    }
}
