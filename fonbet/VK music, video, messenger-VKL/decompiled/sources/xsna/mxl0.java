package xsna;

import com.vk.clips.design.view.sidecontrols.side.reactions.ReactionsLoading;
import com.vk.clips.sdk.shared.api.analytics.SdkClipViewerClick;
import com.vk.clips.tool.view.viewer.feed.list.clip.ClipFeedSideControlsView;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.stories.model.StoryOwner;
import java.util.ArrayList;
import java.util.Calendar;

/* compiled from: StoryArchiveItemBuilder.kt */
/* loaded from: classes6.dex */
public final class mxl0 implements hjc {
    public Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;

    public mxl0(StoryOwner storyOwner) {
        this.b = storyOwner;
        this.c = new ArrayList();
        this.d = Calendar.getInstance();
    }

    @Override // xsna.hjc
    public boolean a() {
        return false;
    }

    public void b() {
        g6o0 g6o0Var = (g6o0) this.d;
        y8e y8eVar = ((i7e) this.b).a;
        rwc rwcVar = (rwc) this.e;
        VideoFile videoFile = ((ClipFeedSideControlsView) ((com.vk.movika.sdk.base.logic.processor.h) this.f).c).q;
        if (videoFile == null) {
            return;
        }
        if ((videoFile instanceof ClipVideoFile) || ((q1t) this.c).h()) {
            e7z e7zVar = rwcVar.c.a.a;
            if (e7zVar.b.b && e7zVar.a.b.a) {
                pih0 pih0Var = y8eVar.d;
                if (pih0Var != null) {
                    pih0Var.o2(new SdkClipViewerClick.l(k15.B(videoFile), false));
                }
                rwcVar.a(ReactionsLoading.LOAD_REMOVE_LIKE);
                g6o0Var.g(videoFile);
                return;
            }
            pih0 pih0Var2 = y8eVar.d;
            if (pih0Var2 != null) {
                pih0Var2.o2(new SdkClipViewerClick.l(k15.B(videoFile), true));
            }
            rwcVar.a(ReactionsLoading.LOAD_ADD_LIKE);
            g6o0Var.g(videoFile);
        }
    }

    @Override // xsna.hjc
    public void onClick() {
        b();
    }

    public mxl0(i7e i7eVar, q1t q1tVar, g6o0 g6o0Var, rwc rwcVar, com.vk.movika.sdk.base.logic.processor.h hVar) {
        this.b = i7eVar;
        this.c = q1tVar;
        this.d = g6o0Var;
        this.e = rwcVar;
        this.f = hVar;
    }
}
