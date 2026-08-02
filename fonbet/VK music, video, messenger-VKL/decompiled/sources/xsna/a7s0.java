package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vk.libvideo.videobottomsheet.api.a;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: VideoBottomSheetSideEffectsHandlerFactoryDefault.kt */
/* loaded from: classes3.dex */
public final class a7s0 implements a.b {
    public final ArrayList a;

    /* compiled from: VideoBottomSheetSideEffectsHandlerFactoryDefault.kt */
    public static final class a implements y6s0 {

        /* compiled from: VideoBottomSheetSideEffectsHandlerFactoryDefault.kt */
        /* renamed from: xsna.a7s0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2529a {
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

        public a() {
        }

        @Override // xsna.y6s0
        public final void a(VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions, VideoFile videoFile) {
            Iterator it = a7s0.this.a.iterator();
            while (it.hasNext()) {
                ((r6s0) it.next()).b(videoBottomSheetSideEffectOptions);
            }
        }

        @Override // xsna.y6s0
        public final void b(VideoBottomSheetSideEffectOptions videoBottomSheetSideEffectOptions, VideoFile videoFile) {
            Iterator it = a7s0.this.a.iterator();
            while (it.hasNext()) {
                ((r6s0) it.next()).b(videoBottomSheetSideEffectOptions);
            }
            int i = C2529a.$EnumSwitchMapping$0[videoBottomSheetSideEffectOptions.ordinal()];
        }

        @Override // xsna.y6s0
        public final int c2() {
            return -1;
        }
    }

    public a7s0(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // com.vk.libvideo.videobottomsheet.api.a.b
    public final y6s0 a(UserId userId, Integer num) {
        return new a();
    }
}
