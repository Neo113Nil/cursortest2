package xsna;

import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryViewItem;
import com.vk.story.viewer.api.StoryViewerRouter;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FieldsStoryViewDelegateExt.kt */
/* loaded from: classes6.dex */
public final class r7r {

    /* compiled from: FieldsStoryViewDelegateExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.values().length];
            try {
                iArr[MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_META_REPOST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_META_CLIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: FieldsStoryViewDelegateExt.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((uov) this.receiver).pause();
            return s3q0.a;
        }
    }

    /* compiled from: FieldsStoryViewDelegateExt.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((uov) this.receiver).play();
            return s3q0.a;
        }
    }

    public static final void a(q7r q7rVar, List<String> list) {
        StoryViewerRouter storyViewerRouter = q7rVar.i0.getDependencies().g;
        mkm0 mkm0Var = q7rVar.i0;
        mkm0 mkm0Var2 = q7rVar.j0;
        storyViewerRouter.j(mkm0Var, list, new b(0, mkm0Var2, uov.class, "pause", "pause()V", 0), new c(0, mkm0Var2, uov.class, "play", "play()V", 0), new iie(q7rVar, 15));
    }
}
