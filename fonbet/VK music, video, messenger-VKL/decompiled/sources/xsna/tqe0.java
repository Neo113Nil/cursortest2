package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: QuestionsService.kt */
/* loaded from: classes2.dex */
public interface tqe0 {
    default tfx a(int i, UserId userId, String str) {
        tfx tfxVar = new tfx("questions.sendMessage", new bz60(7), new lr(29));
        tfx.n(tfxVar, "owner_id", userId, 1L, 0L, 8);
        tfx.l(tfxVar, "question_id", i, 0, 0, 8);
        tfx.o(tfxVar, "message", str, 0, 0, 12);
        return tfxVar;
    }
}
