package xsna;

import com.vk.clips.sdk.shared.item.clip.overlay.default_impl.mappers.helpers.InlineNpsMappingHelper$RenderType;
import java.util.Collections;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.gvp;
import xsna.n0x;

/* compiled from: ClipItemOverlayVisibilityMapper.kt */
/* loaded from: classes17.dex */
public final class k2d {
    public m390 a;
    public Set<? extends a> b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipItemOverlayVisibilityMapper.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ErrorOverlay;
        public static final a MainOverlay;
        public static final a NpsOverlay;
        public static final a RestrictionOverlay;
        public static final a SeekBar;
        public static final a Subtitles;
        public static final a UnfocusedBlackout;

        static {
            a aVar = new a("MainOverlay", 0);
            MainOverlay = aVar;
            a aVar2 = new a("RestrictionOverlay", 1);
            RestrictionOverlay = aVar2;
            a aVar3 = new a("ErrorOverlay", 2);
            ErrorOverlay = aVar3;
            a aVar4 = new a("NpsOverlay", 3);
            NpsOverlay = aVar4;
            a aVar5 = new a("SeekBar", 4);
            SeekBar = aVar5;
            a aVar6 = new a("UnfocusedBlackout", 5);
            UnfocusedBlackout = aVar6;
            a aVar7 = new a("Subtitles", 6);
            Subtitles = aVar7;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public final boolean a(a aVar, m390 m390Var) {
        InlineNpsMappingHelper$RenderType inlineNpsMappingHelper$RenderType;
        ixp0 ixp0Var = m390Var.c;
        if (m390Var.equals(this.a)) {
            return this.b.contains(aVar);
        }
        this.a = m390Var;
        boolean z = ixp0Var.b;
        boolean z2 = ixp0Var.f;
        boolean z3 = ixp0Var.a;
        boolean c = dgd.c(m390Var.a.a);
        boolean z4 = ixp0Var.c;
        boolean z5 = ((z || z3) && !c) || z2;
        j4b0 j4b0Var = m390Var.b;
        boolean z6 = j4b0Var.e;
        boolean z7 = j4b0Var.f && (m390Var.e instanceof gvp.a);
        n0x n0xVar = m390Var.f;
        if (n0xVar instanceof n0x.b) {
            inlineNpsMappingHelper$RenderType = ((n0x.b) n0xVar).c ? InlineNpsMappingHelper$RenderType.View : InlineNpsMappingHelper$RenderType.Overlay;
        } else if (n0xVar instanceof n0x.c) {
            inlineNpsMappingHelper$RenderType = ((n0x.c) n0xVar).a ? InlineNpsMappingHelper$RenderType.View : InlineNpsMappingHelper$RenderType.Overlay;
        } else {
            if (!(n0xVar instanceof n0x.a)) {
                throw new NoWhenBranchMatchedException();
            }
            inlineNpsMappingHelper$RenderType = InlineNpsMappingHelper$RenderType.None;
        }
        Set<? extends a> y0 = (z6 && z4) ? rl3.y0(new a[]{a.RestrictionOverlay, a.UnfocusedBlackout}) : z6 ? Collections.singleton(a.RestrictionOverlay) : z4 ? Collections.singleton(a.UnfocusedBlackout) : m390Var.d ? rl3.y0(new a[]{a.SeekBar, a.Subtitles}) : inlineNpsMappingHelper$RenderType == InlineNpsMappingHelper$RenderType.Overlay ? Collections.singleton(a.NpsOverlay) : (z5 && z7) ? rl3.y0(new a[]{a.ErrorOverlay, a.SeekBar}) : z7 ? rl3.y0(new a[]{a.MainOverlay, a.ErrorOverlay, a.SeekBar}) : z5 ? rl3.y0(new a[]{a.SeekBar, a.Subtitles}) : rl3.y0(new a[]{a.MainOverlay, a.SeekBar});
        this.b = y0;
        return y0.contains(aVar);
    }
}
