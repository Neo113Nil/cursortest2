package defpackage;

import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalDto$Available;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalDto$Completed;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalDto$InProgress;
import com.yandex.go.sharing_personal_goals.data.model.g;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class irr0 extends xqt {
    public static final irr0 e = new irr0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, g.INSTANCE.serializer(), qoi0.a(g.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("available", SharingPersonalGoalDto$Available.Companion.serializer(), qoi0.a(SharingPersonalGoalDto$Available.class)), new f9("in_progress", SharingPersonalGoalDto$InProgress.Companion.serializer(), qoi0.a(SharingPersonalGoalDto$InProgress.class)), new f9("completed", SharingPersonalGoalDto$Completed.Companion.serializer(), qoi0.a(SharingPersonalGoalDto$Completed.class)));
    }
}
