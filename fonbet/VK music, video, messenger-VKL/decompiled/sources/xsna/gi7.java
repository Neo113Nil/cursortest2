package xsna;

import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.board.dto.BoardGetTopicsExtendedPreviewDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: BoardService.kt */
/* loaded from: classes2.dex */
public interface gi7 {
    default tfx a(UserId userId, String str, String str2) {
        tfx tfxVar = new tfx("board.addTopic", new sf3(4), new s11(4));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        tfx.o(tfxVar, "title", str, 0, 0, 12);
        tfx.o(tfxVar, "text", str2, 0, 0, 12);
        return tfxVar;
    }

    default tfx b(UserId userId, Integer num, Integer num2, BoardGetTopicsExtendedPreviewDto boardGetTopicsExtendedPreviewDto, List list) {
        ArrayList arrayList;
        tfx tfxVar = new tfx("board.getTopics", new rf3(4), new r11(5));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num.intValue(), 0, 0, 8);
        tfxVar.f(num2.intValue(), 0, 100, "count");
        tfxVar.j("extended", true);
        if (boardGetTopicsExtendedPreviewDto != null) {
            tfx.l(tfxVar, "preview", boardGetTopicsExtendedPreviewDto.i(), 0, 0, 12);
        }
        tfx.l(tfxVar, "preview_length", 150, 0, 0, 8);
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        return tfxVar;
    }

    default tfx c(int i, UserId userId) {
        tfx tfxVar = new tfx("board.fixTopic", new w11(7), new at(6));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        tfx.l(tfxVar, "topic_id", i, 0, 0, 8);
        return tfxVar;
    }

    default tfx d(int i, UserId userId) {
        tfx tfxVar = new tfx("board.unfixTopic", new u11(10), new v11(6));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        tfx.l(tfxVar, "topic_id", i, 0, 0, 8);
        return tfxVar;
    }

    default tfx e(int i, int i2, UserId userId, String str, List list) {
        tfx tfxVar = new tfx("board.editComment", new to(6), new t11(5));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        tfx.l(tfxVar, "topic_id", i, 0, 0, 8);
        tfx.l(tfxVar, "comment_id", i2, 0, 0, 8);
        if (str != null) {
            tfx.o(tfxVar, "message", str, 0, 0, 12);
        }
        if (list != null) {
            tfxVar.i("attachments", list);
        }
        return tfxVar;
    }
}
