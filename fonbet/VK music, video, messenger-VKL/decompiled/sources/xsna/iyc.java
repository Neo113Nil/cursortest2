package xsna;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import java.util.List;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.snw;
import xsna.ugw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class iyc implements SwipeRefreshLayout.e, iy3, yads.ff0 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iyc(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // yads.ff0
    public List a(int i, yads.l83 l83Var, int[] iArr) {
        return yads.if0.a((yads.af0) this.b, (String) this.c, i, l83Var, iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1.a.e() == androidx.camera.core.impl.CameraCaptureMetaData$AeState.FLASH_REQUIRED) goto L12;
     */
    @Override // xsna.iy3
    /* renamed from: apply */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ugz mo416apply(Object obj) {
        ugw ugwVar = (ugw) this.b;
        ugw.i iVar = (ugw.i) this.c;
        iVar.a = (androidx.camera.core.impl.c) obj;
        int w = ugwVar.w();
        if (w != 0) {
            if (w != 1) {
                if (w != 2) {
                    throw new AssertionError(ugwVar.w());
                }
                return snw.c.c;
            }
            iVar.c = true;
            return ugwVar.b().a();
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.e
    public boolean a() {
        Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.b;
        ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) this.c;
        int i = ClipFeedListFragment.a2;
        return ref$BooleanRef.element || clipFeedListFragment.Bo().canScrollVertically(-1);
    }
}
