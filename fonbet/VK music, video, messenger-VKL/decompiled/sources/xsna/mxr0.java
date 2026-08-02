package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: VideoEvents.kt */
/* loaded from: classes14.dex */
public final class mxr0 extends bwr0 {
    public final VideoFile a;
    public final UserId b;
    public final List<Integer> c;
    public final List<Integer> d;

    public mxr0(VideoFile videoFile, UserId userId, List<Integer> list, List<Integer> list2) {
        this.a = videoFile;
        this.b = userId;
        this.c = list;
        this.d = list2;
    }

    public final List<Integer> a() {
        return this.c;
    }

    public final List<Integer> b() {
        return this.d;
    }

    public final VideoFile c() {
        return this.a;
    }
}
