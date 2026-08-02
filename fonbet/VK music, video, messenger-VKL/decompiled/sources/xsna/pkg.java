package xsna;

import android.view.View;
import androidx.room.RoomDatabase;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.story.viewer.api.StoryViewerRouter;
import java.util.Collections;
import java.util.IdentityHashMap;
import kotlin.Lazy;

/* compiled from: CommonImStoriesBridge.kt */
/* loaded from: classes11.dex */
public final class pkg implements mdw {
    public final Object b;
    public final Object c;

    public pkg(Lazy lazy, Lazy lazy2) {
        this.b = lazy;
        this.c = lazy2;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.mdw
    public void a(View view, qtd0 qtd0Var, boolean z, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, l9 l9Var) {
        ozv.a.getClass();
        StoryOwner.Owner c = ozv.c(qtd0Var, z);
        if (c == null) {
            return;
        }
        ((StoryViewerRouter) this.b.getValue()).l(view, c, mobileOfficialAppsConStoriesStat$ViewEntryPoint, mobileOfficialAppsCoreNavStat$EventScreen, new ywc(view, this, c, l9Var));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.mdw
    public io.reactivex.rxjava3.disposables.c e(t3h t3hVar) {
        return ((oul0) this.c.getValue()).a(t3hVar);
    }

    public pkg(RoomDatabase roomDatabase) {
        this.b = roomDatabase;
        this.c = Collections.newSetFromMap(new IdentityHashMap());
    }
}
