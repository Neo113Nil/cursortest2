package xsna;

import com.vk.clips.viewer.impl.feed.wrapper.presentation.state.ClipsWrapperCreateButton;
import java.util.List;
import xsna.uuf;

/* compiled from: ClipsWrapperViewStateMapper.kt */
/* loaded from: classes17.dex */
public final class vuf {
    public static uuf.e a(isf isfVar) {
        ntf ntfVar = isfVar.d;
        upf upfVar = null;
        if (ntfVar.b == null || !ntfVar.c) {
            ntfVar = null;
        }
        hsf hsfVar = isfVar.k;
        if (hsfVar.b == null || !hsfVar.c) {
            hsfVar = null;
        }
        upf upfVar2 = isfVar.e;
        ClipsWrapperCreateButton clipsWrapperCreateButton = upfVar2.b;
        if (clipsWrapperCreateButton != null && clipsWrapperCreateButton.getType() != ClipsWrapperCreateButton.CreateButtonType.NONE && upfVar2.c) {
            upfVar = upfVar2;
        }
        List I = rl3.I(new uuf.d[]{ntfVar, hsfVar, upfVar});
        return new uuf.e((uuf.d) j5g.b0(0, I), (uuf.d) j5g.b0(1, I), (uuf.d) j5g.b0(2, I));
    }
}
