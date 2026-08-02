package xsna;

import com.vk.accountmanager.di.AccountManagerComponent;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.dzenarticle.api.DzenArticleComponent;
import com.vk.restriction.di.VideoRestrictionManagerComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class h25 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ h25(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (AccountManagerComponent) this.c.a(fpf0.a(AccountManagerComponent.class));
            case 1:
                return (VideoRestrictionManagerComponent) this.c.a(fpf0.a(VideoRestrictionManagerComponent.class));
            case 2:
                return (ClipsConfigAuthorsComponent) this.c.a(fpf0.a(ClipsConfigAuthorsComponent.class));
            default:
                return (DzenArticleComponent) this.c.a(fpf0.a(DzenArticleComponent.class));
        }
    }
}
