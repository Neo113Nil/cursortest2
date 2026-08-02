package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vk.libvideo.videobottomsheet.api.a;
import java.util.Iterator;
import java.util.List;

/* compiled from: VideoBottomSheetSideEffectsHandlerFactoryDefault.kt */
/* loaded from: classes16.dex */
public final class z6s0 implements a.b {
    public final List<r6s0> a;

    /* compiled from: VideoBottomSheetSideEffectsHandlerFactoryDefault.kt */
    public static final class a implements y6s0 {
        public final /* synthetic */ Integer b;
        public final /* synthetic */ UserId c;

        /* compiled from: VideoBottomSheetSideEffectsHandlerFactoryDefault.kt */
        /* renamed from: xsna.z6s0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C4158a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VideoBottomSheetSideEffectOptions.values().length];
                try {
                    iArr[VideoBottomSheetSideEffectOptions.REMOVE_FROM_OWNER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[VideoBottomSheetSideEffectOptions.REMOVE_FROM_ALBUM.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a(Integer num, UserId userId) {
            this.b = num;
            this.c = userId;
        }

        @Override // xsna.y6s0
        public final void a(VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions, VideoFile videoFile) {
            Iterator<T> it = z6s0.this.a.iterator();
            while (it.hasNext()) {
                ((r6s0) it.next()).b(videoBottomSheetSideEffectOptions);
            }
        }

        @Override // xsna.y6s0
        public final void b(VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions, VideoFile videoFile) {
            String str;
            UserId userId;
            Iterator<T> it = z6s0.this.a.iterator();
            while (it.hasNext()) {
                ((r6s0) it.next()).b(videoBottomSheetSideEffectOptions);
            }
            int i = C4158a.$EnumSwitchMapping$0[videoBottomSheetSideEffectOptions.ordinal()];
            if (i == 1 || i == 2) {
                String str2 = null;
                Integer num = this.b;
                if (num == null || (userId = this.c) == null) {
                    str = null;
                } else {
                    int intValue = num.intValue();
                    Serializer.c<VideoAlbum> cVar = VideoAlbum.CREATOR;
                    str = VideoAlbum.a.a(intValue, userId);
                }
                if (str != null) {
                    str2 = str;
                } else if (num != null) {
                    str2 = num.toString();
                }
                wjs0.a(new wxr0(videoFile, "videos_remove", str2));
                wjs0.a(new fyr0(videoFile));
            }
        }

        @Override // xsna.y6s0
        public final int c2() {
            return -1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z6s0(List<? extends r6s0> list) {
        this.a = list;
    }

    @Override // com.vk.libvideo.videobottomsheet.api.a.b
    public final y6s0 a(UserId userId, Integer num) {
        return new a(num, userId);
    }
}
