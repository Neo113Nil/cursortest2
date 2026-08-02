package xsna;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.models.comment.ReplyInfo;

/* compiled from: VideoMinimizableDialogsFactory.kt */
/* loaded from: classes2.dex */
public interface xts0 {
    default a a() {
        return null;
    }

    default a b(VideoFile videoFile, String str, ReplyInfo replyInfo) {
        return null;
    }

    default a c() {
        return null;
    }

    default a d(Bundle bundle) {
        return null;
    }

    default a e() {
        return null;
    }

    /* compiled from: VideoMinimizableDialogsFactory.kt */
    public static final class a {
        public final Class<? extends Fragment> a;
        public final Bundle b;

        public a(Class<? extends Fragment> cls, Bundle bundle) {
            this.a = cls;
            this.b = bundle;
        }

        public /* synthetic */ a(Class cls) {
            this(cls, new Bundle());
        }
    }
}
