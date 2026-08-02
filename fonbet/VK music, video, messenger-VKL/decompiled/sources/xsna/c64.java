package xsna;

import com.vk.dto.common.ClipVideoFile;
import com.vk.video.ui.upload.impl.attachedclips.presentation.compose.clip.ClipSubtitleViewState;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.AttachedClipsState;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.ClipState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.idh0;

/* compiled from: AttachedClipsViewStateMapper.kt */
/* loaded from: classes7.dex */
public final class c64 implements izs<AttachedClipsState, idh0> {
    public static final c64 b = new c64();

    @Override // xsna.izs
    public final idh0 invoke(AttachedClipsState attachedClipsState) {
        AttachedClipsState attachedClipsState2 = attachedClipsState;
        List<ClipState> list = attachedClipsState2.c;
        if (list == null) {
            return idh0.b.b;
        }
        List<ClipState> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ClipState clipState = (ClipState) it.next();
            ClipVideoFile clipVideoFile = clipState.c;
            String a1 = clipVideoFile.a1();
            String h = ixj0.h(clipVideoFile.I0.b);
            String str = clipVideoFile.l;
            boolean z = clipState.d;
            boolean z2 = z || ((Boolean) attachedClipsState2.n.getValue()).booleanValue();
            b.getClass();
            arrayList.add(new kfd(a1, h, str, z, z2, ((Boolean) clipState.f.getValue()).booleanValue() ? ClipSubtitleViewState.HAS_COAUTHORS : ((Boolean) clipState.e.getValue()).booleanValue() ? ClipSubtitleViewState.ATTACHED_TO_ANOTHER_VIDEO : null));
        }
        return new idh0.a(arrayList, attachedClipsState2.d == null, attachedClipsState2.j().size(), ((Boolean) attachedClipsState2.m.getValue()).booleanValue() && !attachedClipsState2.j, attachedClipsState2.f, attachedClipsState2.g, attachedClipsState2.h, attachedClipsState2.j, attachedClipsState2.k);
    }
}
