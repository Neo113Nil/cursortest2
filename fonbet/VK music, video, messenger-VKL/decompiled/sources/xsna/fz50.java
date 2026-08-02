package xsna;

import com.vk.dto.narratives.Narrative;
import com.vk.dto.stories.model.NarrativePublishEventType;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.story.api.LoadContext;
import java.util.Collection;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class fz50 implements yzs {
    public final /* synthetic */ jz50 b;
    public final /* synthetic */ StoryEntry c;
    public final /* synthetic */ zzs d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ j6v f;

    public /* synthetic */ fz50(jz50 jz50Var, StoryEntry storyEntry, zzs zzsVar, boolean z, j6v j6vVar) {
        this.b = jz50Var;
        this.c = storyEntry;
        this.d = zzsVar;
        this.e = z;
        this.f = j6vVar;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Collection collection = (Collection) obj;
        Boolean bool = (Boolean) obj2;
        Collection collection2 = (Collection) obj3;
        boolean booleanValue = bool.booleanValue();
        final StoryEntry storyEntry = this.c;
        if (booleanValue) {
            int size = collection.size() + storyEntry.n0;
            storyEntry.n0 = size;
            storyEntry.n0 = size - collection2.size();
        } else {
            int size2 = collection2.size() + storyEntry.n0;
            storyEntry.n0 = size2;
            storyEntry.n0 = size2 - collection.size();
        }
        int i = storyEntry.n0;
        final jz50 jz50Var = this.b;
        if (i != 1 || bool.booleanValue()) {
            storyEntry.A0 = ((Narrative) j5g.X(collection)).b;
            storyEntry.p0 = ((Narrative) j5g.X(collection)).d;
            jz50Var.b.P.a(storyEntry);
        } else {
            jz50Var.b.i0.a(f1m0.a(storyEntry.Gb(), LoadContext.Story.b).subscribe(new gz50(0, jz50Var, storyEntry), new io.reactivex.rxjava3.functions.f() { // from class: xsna.hz50
                @Override // io.reactivex.rxjava3.functions.f
                public final void accept(Object obj4) {
                    jz50.this.b.P.a(storyEntry);
                }
            }));
        }
        this.d.invoke(storyEntry, bool, collection, collection2);
        this.f.a(this.e ? NarrativePublishEventType.ADD_STORY_TO_NARRATIVE_FROM_DOTS : NarrativePublishEventType.ADD_STORY_TO_NARRATIVE, MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER, storyEntry.c);
        return s3q0.a;
    }
}
