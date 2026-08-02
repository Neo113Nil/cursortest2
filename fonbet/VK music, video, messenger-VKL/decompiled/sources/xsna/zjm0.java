package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StorySharingInfo;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryEntryExtended;
import com.vk.dto.stories.model.StoryUploadParams;
import java.io.File;
import java.util.Objects;

/* compiled from: StoryUpload.java */
/* loaded from: classes6.dex */
public final class zjm0 {
    public static int l;
    public final int a;
    public final int b;
    public final long c;
    public final String d;
    public File e;
    public File f;
    public StoryEntry g;
    public float h;
    public boolean i;
    public CommonUploadParams j;
    public StoryUploadParams k;

    public zjm0(String str, int i) {
        int i2 = l;
        l = i2 + 1;
        this.a = i2;
        this.c = System.currentTimeMillis();
        this.b = i;
        this.d = str;
    }

    public final UserId a() {
        return this.j.e;
    }

    public final boolean b() {
        return this.j.c;
    }

    public final boolean c() {
        return this.j.Kb();
    }

    public final boolean d(int i, UserId userId) {
        return this.j.Mb() && this.j.f.b.d.equals(userId) && this.j.f.b.c == i;
    }

    public final StoryEntry e(UserId userId) {
        StoryEntry storyEntry = new StoryEntry();
        storyEntry.b = true;
        storyEntry.c = this.a;
        storyEntry.d = userId;
        storyEntry.e = this.d;
        storyEntry.f = this.c;
        storyEntry.m = null;
        storyEntry.n = null;
        storyEntry.x = this.e;
        StoryUploadParams storyUploadParams = this.k;
        storyEntry.X = storyUploadParams.j;
        storyEntry.a0 = Boolean.TRUE.equals(storyUploadParams.n);
        storyEntry.y = this.f;
        StoryEntryExtended storyEntryExtended = storyEntry.R;
        if (storyEntryExtended != null) {
            StoryEntry storyEntry2 = storyEntryExtended.b;
            storyEntry.P = storyEntry2.d;
            storyEntry.O = storyEntry2.c;
            storyEntry.Q = storyEntry2.o;
        } else {
            storyEntry.P = UserId.d;
            storyEntry.O = 0;
            storyEntry.Q = null;
        }
        storyEntry.q = true;
        storyEntry.r = true;
        storyEntry.C = true;
        storyEntry.t = null;
        storyEntry.u = null;
        CommonUploadParams commonUploadParams = this.j;
        StorySharingInfo storySharingInfo = commonUploadParams.g;
        if (storySharingInfo != null) {
            storyEntry.T = storySharingInfo.f;
        }
        StoryEntryExtended storyEntryExtended2 = commonUploadParams.f;
        if (storyEntryExtended2 != null && !storyEntryExtended2.d) {
            storyEntry.R = storyEntryExtended2;
        }
        if (!commonUploadParams.Kb() && Objects.equals(this.k.C, "best_friends")) {
            storyEntry.w0 = true;
        }
        storyEntry.x0 = this.k.C;
        return storyEntry;
    }

    public final void f() {
        this.i = true;
    }

    public final int g() {
        return this.b;
    }
}
