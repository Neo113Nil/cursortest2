package xsna;

import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class gz50 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gz50(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                jz50 jz50Var = (jz50) this.c;
                StoryEntry storyEntry = (StoryEntry) this.d;
                jz50Var.getClass();
                StoryEntry Bb = ((StoriesContainer) ((ArrayList) obj).get(0)).Bb();
                if (Bb != null) {
                    storyEntry.A0 = Bb.A0;
                    storyEntry.p0 = Bb.p0;
                }
                jz50Var.b.P.a(storyEntry);
                break;
            default:
                nku0 nku0Var = (nku0) this.c;
                nku0Var.h.post(new vum0(nku0Var, (List) obj, (String) this.d));
                break;
        }
    }
}
