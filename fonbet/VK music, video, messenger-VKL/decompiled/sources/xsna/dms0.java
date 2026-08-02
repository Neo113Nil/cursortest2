package xsna;

import com.vk.clips.editor.mapper.fragment.ClipsEditorFragment;
import com.vk.editor.timeline.entity.Edge;

/* compiled from: VideoFragmentActionsHandler.kt */
/* loaded from: classes16.dex */
public final class dms0 {
    public final r0e a;
    public final c9d b;
    public final hwd c;
    public final szd d;
    public final bwd e;
    public final e2e f;
    public final qzd g;
    public final lxd h;
    public final bpn0 i;

    /* compiled from: VideoFragmentActionsHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Edge.values().length];
            try {
                iArr[Edge.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Edge.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Edge.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public dms0(r0e r0eVar, c9d c9dVar, hwd hwdVar, szd szdVar, bwd bwdVar, e2e e2eVar, qzd qzdVar, ClipsEditorFragment.b bVar, lxd lxdVar) {
        this.a = r0eVar;
        this.b = c9dVar;
        this.c = hwdVar;
        this.d = szdVar;
        this.e = bwdVar;
        this.f = e2eVar;
        this.g = qzdVar;
        this.h = lxdVar;
        this.i = new bpn0(new com.vk.movika.sdk.base.ui.s(22, this, bVar));
    }
}
