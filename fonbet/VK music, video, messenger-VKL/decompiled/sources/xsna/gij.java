package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;

/* compiled from: ContentOriginMetadata.kt */
/* loaded from: classes3.dex */
public abstract class gij {
    public final UserId a;
    public final PostingCreationEntryPoint b;

    /* compiled from: ContentOriginMetadata.kt */
    public static final class a extends gij {
        public final boolean c;

        public a(UserId userId, PostingCreationEntryPoint postingCreationEntryPoint, boolean z) {
            super(userId, postingCreationEntryPoint);
            this.c = z;
        }
    }

    /* compiled from: ContentOriginMetadata.kt */
    public static final class b extends gij {
    }

    /* compiled from: ContentOriginMetadata.kt */
    public static final class c extends gij {
    }

    /* compiled from: ContentOriginMetadata.kt */
    public static final class d extends gij {
        public final VideoFile c;
        public final boolean d;

        public d(VideoFile videoFile, boolean z, UserId userId, PostingCreationEntryPoint postingCreationEntryPoint) {
            super(userId, postingCreationEntryPoint);
            this.c = videoFile;
            this.d = z;
        }
    }

    public gij(UserId userId, PostingCreationEntryPoint postingCreationEntryPoint) {
        this.a = userId;
        this.b = postingCreationEntryPoint;
    }
}
