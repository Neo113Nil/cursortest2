package xsna;

import android.app.Activity;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: ClipsFavoritesInteractorStub.kt */
/* loaded from: classes16.dex */
public final class i5e implements c5e {
    @Override // xsna.c5e
    public final void a(FavoriteFolderId favoriteFolderId, UserId userId, String str, List list) {
        rdi.E();
    }

    @Override // xsna.c5e
    public final void b(UserId userId, FavoriteFolderId favoriteFolderId, String str, List list, boolean z) {
        rdi.E();
    }

    @Override // xsna.c5e
    public final void c(UserId userId, FavoriteFolderId favoriteFolderId, FavoriteFolderId favoriteFolderId2, String str, List list) {
        rdi.E();
    }

    @Override // xsna.c5e
    public final void d(UserId userId, VideoFile videoFile, Activity activity) {
        rdi.E();
    }

    @Override // xsna.c5e
    public final void e(UserId userId, VideoFile videoFile, Activity activity) {
        rdi.E();
    }

    @Override // xsna.c5e
    public final void g(UserId userId, FavoriteFolderId.Id id, String str) {
        rdi.E();
    }

    @Override // xsna.c5e
    public final io.reactivex.rxjava3.core.x h(UserId userId, String str, boolean z) {
        io.reactivex.rxjava3.internal.operators.single.a0 a0Var = io.reactivex.rxjava3.internal.operators.single.a0.b;
        rdi.F(a0Var);
        return a0Var;
    }

    @Override // xsna.c5e
    public final io.reactivex.rxjava3.core.x i(UserId userId, FavoriteFolderId.Id id, String str) {
        io.reactivex.rxjava3.internal.operators.single.a0 a0Var = io.reactivex.rxjava3.internal.operators.single.a0.b;
        rdi.F(a0Var);
        return a0Var;
    }
}
