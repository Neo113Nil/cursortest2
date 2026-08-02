package xsna;

import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vk.dto.stories.entities.StoryEditorMode;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.StoryUploadParams;
import java.util.List;

/* compiled from: StoryEditorInitParams.kt */
/* loaded from: classes16.dex */
public final class m1m0 {
    public final Object a;
    public final CommonUploadParams b;
    public final StoryUploadParams c;
    public final StoryCameraMode d;
    public final StoryCameraTarget e;
    public final StoryEditorMode f;
    public final boolean g;

    public m1m0(List list, CommonUploadParams commonUploadParams, StoryUploadParams storyUploadParams, StoryCameraMode storyCameraMode, StoryCameraTarget storyCameraTarget, StoryEditorMode storyEditorMode, boolean z) {
        this.a = list;
        this.b = commonUploadParams;
        this.c = storyUploadParams;
        this.d = storyCameraMode;
        this.e = storyCameraTarget;
        this.f = storyEditorMode;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1m0)) {
            return false;
        }
        m1m0 m1m0Var = (m1m0) obj;
        return epx.f(this.a, m1m0Var.a) && epx.f(this.b, m1m0Var.b) && epx.f(this.c, m1m0Var.c) && this.d == m1m0Var.d && this.e == m1m0Var.e && this.f == m1m0Var.f && this.g == m1m0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryEditorInitParams(stories=");
        sb.append(this.a);
        sb.append(", commonUploadParams=");
        sb.append(this.b);
        sb.append(", baseStoryParams=");
        sb.append(this.c);
        sb.append(", state=");
        sb.append(this.d);
        sb.append(", target=");
        sb.append(this.e);
        sb.append(", editorMode=");
        sb.append(this.f);
        sb.append(", withTransitions=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
