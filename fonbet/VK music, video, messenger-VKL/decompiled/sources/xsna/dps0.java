package xsna;

import com.vk.api.generated.uxpolls.dto.UxpollsAnswerDto;
import com.vk.stat.scheme.CommonUxpollsStat$TypeUxpollsEvent;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: VideoHidePollStatDelegate.kt */
/* loaded from: classes16.dex */
public final class dps0 {
    public final b25 a;
    public final io.reactivex.rxjava3.disposables.b b = new io.reactivex.rxjava3.disposables.b();
    public final LinkedHashMap c = new LinkedHashMap();

    public dps0(b25 b25Var) {
        this.a = b25Var;
    }

    public final void a(CommonUxpollsStat$TypeUxpollsEvent.EventType eventType, Integer num, String str, String str2) {
        List list;
        xy2 d;
        CommonUxpollsStat$TypeUxpollsEvent.EventType eventType2 = CommonUxpollsStat$TypeUxpollsEvent.EventType.ANSWER;
        LinkedHashMap linkedHashMap = this.c;
        if (eventType == eventType2 && str != null && num != null && str2 != null) {
            linkedHashMap.put(str, new UxpollsAnswerDto(1868, Collections.singletonList(num), str2));
        }
        a6r0 a6r0Var = new a6r0();
        long j = this.a.c().b;
        String name = eventType.name();
        List singletonList = (num == null || str2 == null) ? null : Collections.singletonList(new UxpollsAnswerDto(1868, Collections.singletonList(Integer.valueOf(num.intValue())), str2));
        if (singletonList == null) {
            UxpollsAnswerDto uxpollsAnswerDto = (UxpollsAnswerDto) linkedHashMap.get(str);
            list = uxpollsAnswerDto != null ? Collections.singletonList(uxpollsAnswerDto) : null;
        } else {
            list = singletonList;
        }
        d = a6r0Var.d(j, "video_static", name, "video", (r29 & 16) != 0 ? null : null, 1381, (r29 & 64) != 0 ? null : null, null, null, null, null, (r29 & 2048) != 0 ? null : str, (r29 & 4096) != 0 ? null : list);
        this.b.b(yfb.x(d).p());
    }
}
