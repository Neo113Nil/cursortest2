package xsna;

import android.os.Parcelable;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.ads.MyTargetAdStoriesContainer;
import com.vk.ecomm.reviews.api.model.createreview.CreateCommunityReviewData;
import xsna.gyh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class uyg implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Parcelable e;

    public /* synthetic */ uyg(int i, Parcelable parcelable, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = parcelable;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                yyg yygVar = (yyg) this.c;
                fzg fzgVar = (fzg) this.d;
                CreateCommunityReviewData createCommunityReviewData = (CreateCommunityReviewData) this.e;
                yygVar.g.d(new gyh.c(fzgVar.d.b, fzgVar.k, fzgVar.l, createCommunityReviewData.b != null ? Float.valueOf(r3.intValue()) : null, createCommunityReviewData.c, fzgVar.o));
                break;
            default:
                ep50.p1((ep50) this.c, (StoryEntry) this.d, (MyTargetAdStoriesContainer) this.e);
                break;
        }
    }
}
