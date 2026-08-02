package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.user.RequestUserProfile;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class xp9 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializer.StreamParcelable d;

    public /* synthetic */ xp9(Object obj, Serializer.StreamParcelable streamParcelable, int i) {
        this.b = i;
        this.c = obj;
        this.d = streamParcelable;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        VideoFile videoFile;
        VideoUrlStorage w9;
        switch (this.b) {
            case 0:
                rfz.b(((yp9) this.c).b, ne7.s((RequestUserProfile) this.d), null, new vd1(4), 2);
                break;
            default:
                fql0 fql0Var = (fql0) this.c;
                StoryEntry storyEntry = (StoryEntry) this.d;
                if (storyEntry != null && storyEntry.Tb() && (videoFile = storyEntry.n) != null && (w9 = videoFile.w9()) != null) {
                    Iterator it = w9.Bb().iterator();
                    while (it.hasNext()) {
                        fql0Var.i.remove((String) it.next());
                    }
                }
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"preload done entry ".concat(storyEntry.Kb())});
                    break;
                }
                break;
        }
    }
}
