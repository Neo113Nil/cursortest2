package xsna;

import com.vk.dto.stories.model.StoryEntry;
import com.vkontakte.android.R;

/* compiled from: StoryArchiveItem.kt */
/* loaded from: classes3.dex */
public final class lxl0 extends zif0 {
    public final StoryEntry a;
    public final String b;
    public final String c;
    public final String d;
    public boolean e;

    public lxl0(StoryEntry storyEntry, String str, String str2, String str3, boolean z) {
        this.a = storyEntry;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    @Override // xsna.zif0
    public final long a() {
        return this.a.c;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.item_story_archive;
    }
}
