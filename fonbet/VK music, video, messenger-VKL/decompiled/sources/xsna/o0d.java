package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.shared.item.clip.viewstate.MainOverlayState;
import com.vk.clips.viewer.impl.feed.item.clip.activities.ClipsActivitiesTouchHandler$TouchEvent$Drag$Finished;
import com.vk.clips.viewer.impl.feed.item.clip.activities.a;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gje;
import xsna.mje;

/* compiled from: ClipItemCommentRenderDelegate.kt */
/* loaded from: classes17.dex */
public final class o0d {
    public final ViewGroup a;
    public final u6d b;
    public final Object c;
    public boolean d;
    public final Object e;
    public final Object f;
    public MainOverlayState.b.a g;
    public o3d h;

    /* compiled from: ClipItemCommentRenderDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<cje> {
        public static final a b = new a(0, cje.class, "<init>", "<init>()V", 0);

        @Override // xsna.gzs
        public final cje invoke() {
            return new cje();
        }
    }

    /* compiled from: ClipItemCommentRenderDelegate.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements wzs<View, a.b, s3q0> {
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.wzs
        public final s3q0 invoke(View view, a.b bVar) {
            View view2 = view;
            a.b bVar2 = bVar;
            o0d o0dVar = (o0d) this.receiver;
            o0dVar.getClass();
            ?? r1 = o0dVar.c;
            if (bVar2 instanceof a.b.C0707a) {
                MainOverlayState.b.a aVar = o0dVar.g;
                if (aVar != null) {
                    o0dVar.b.a(new n3d(aVar.a, aVar.b, aVar.c));
                }
            } else if (bVar2 instanceof a.b.C0708b) {
                view2.getParent().requestDisallowInterceptTouchEvent(true);
            } else if (bVar2 instanceof com.vk.clips.viewer.impl.feed.item.clip.activities.b) {
                ViewParent parent = o0dVar.a.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                }
            } else if (bVar2 instanceof com.vk.clips.viewer.impl.feed.item.clip.activities.c) {
                view2.performHapticFeedback(0);
            } else {
                if (!(bVar2 instanceof ClipsActivitiesTouchHandler$TouchEvent$Drag$Finished)) {
                    throw new NoWhenBranchMatchedException();
                }
                view2.getParent().requestDisallowInterceptTouchEvent(false);
                ClipsActivitiesTouchHandler$TouchEvent$Drag$Finished.DragResult dragResult = ((ClipsActivitiesTouchHandler$TouchEvent$Drag$Finished) bVar2).a;
                com.vk.movika.sdk.base.ui.t tVar = new com.vk.movika.sdk.base.ui.t(o0dVar, 21);
                Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (dragResult == ClipsActivitiesTouchHandler$TouchEvent$Drag$Finished.DragResult.DISMISSED) {
                    ((cje) r1.getValue()).b(view2, new gje.a(), tVar);
                } else {
                    ((cje) r1.getValue()).c(view2, new mje.a(new Pair(Float.valueOf(view2.getTranslationX()), Float.valueOf(view2.getTranslationY())), new Pair(valueOf, valueOf)), tVar);
                }
            }
            return s3q0.a;
        }
    }

    public o0d(ViewGroup viewGroup, u6d u6dVar) {
        this.a = viewGroup;
        this.b = u6dVar;
        a aVar = a.b;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, aVar);
        this.e = msy.a(lazyThreadSafetyMode, new ca(this, 20));
        this.f = msy.a(lazyThreadSafetyMode, new px0(this, 15));
    }
}
