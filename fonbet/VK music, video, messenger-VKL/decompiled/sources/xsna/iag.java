package xsna;

import androidx.annotation.Nullable;
import com.vk.dto.badges.BadgeDonutInfo;
import com.vk.dto.badges.BadgeInfo;
import com.vk.dto.badges.BadgeItem;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.ImageStatus;
import java.util.ArrayList;

/* compiled from: Comment.java */
/* loaded from: classes18.dex */
public interface iag extends o2f0, grj0 {
    int C();

    boolean D4();

    @Nullable
    BadgeItem G6();

    int K4();

    boolean K8();

    @Nullable
    String N1();

    boolean Q6();

    @Nullable
    BadgeDonutInfo Q9();

    boolean Ta();

    boolean V8();

    CharSequence X3();

    @Nullable
    VerifyInfo Y();

    String Z4();

    boolean d5();

    int f4();

    boolean g6();

    int getId();

    String getText();

    UserId getUid();

    default boolean i3() {
        return false;
    }

    void i4(boolean z);

    boolean isReported();

    @Nullable
    ImageStatus l5();

    @Nullable
    BadgeInfo p6();

    boolean r3();

    ArrayList<Attachment> u();

    boolean u4();

    @Nullable
    String va();

    boolean wa();

    @Nullable
    String y1();

    int y4();

    boolean z1();

    boolean z3();
}
