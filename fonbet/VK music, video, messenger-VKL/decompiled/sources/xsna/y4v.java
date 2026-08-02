package xsna;

import android.content.Intent;
import com.vk.dto.common.VideoFile;
import com.vk.dto.narratives.HighlightCover;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.stories.model.NarrativePublishEventType;
import com.vk.narratives.impl.highlights.HighlightEditFragment;
import java.util.ArrayList;
import java.util.Date;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class y4v implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y4v(com.vk.movika.sdk.base.ui.s sVar, VideoFile videoFile, boolean z) {
        this.d = sVar;
        this.e = videoFile;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                b5v b5vVar = (b5v) this.d;
                String str = (String) this.e;
                Narrative narrative = (Narrative) obj;
                ArrayList arrayList = b5vVar.m;
                HighlightEditFragment highlightEditFragment = b5vVar.c;
                boolean z = this.c;
                NarrativePublishEventType narrativePublishEventType = z ? arrayList.isEmpty() ? NarrativePublishEventType.CREATE_NARRATIVE_DRAFT : NarrativePublishEventType.PUBLISH_NARRATIVE : NarrativePublishEventType.EDIT_NARRATIVE;
                int i = z ? narrative.b : b5vVar.f;
                j6v j6vVar = b5vVar.j;
                String str2 = b5vVar.g;
                Integer valueOf = Integer.valueOf(i);
                Long valueOf2 = Long.valueOf(b5vVar.d.b);
                HighlightCover highlightCover = b5vVar.n;
                j6vVar.d(narrativePublishEventType, str2, j6vVar.e(valueOf, valueOf2, str, arrayList, highlightCover != null ? up2.o(highlightCover) : null));
                highlightEditFragment.jo(true);
                highlightEditFragment.Mf(-1, new Intent().putExtra("RESULT_EXTRA_HIGHLIGHT", narrative));
                break;
            default:
                com.vk.movika.sdk.base.ui.s sVar = (com.vk.movika.sdk.base.ui.s) this.d;
                VideoFile videoFile = (VideoFile) this.e;
                sVar.invoke();
                w1s0.d(videoFile, (int) (((Date) obj).getTime() / 1000), this.c, null);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ y4v(b5v b5vVar, boolean z, String str) {
        this.d = b5vVar;
        this.c = z;
        this.e = str;
    }
}
