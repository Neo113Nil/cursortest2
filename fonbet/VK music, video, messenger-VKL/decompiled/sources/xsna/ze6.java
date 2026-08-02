package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.sharing.core.view.IntentAction;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: BaseIntentHandler.java */
/* loaded from: classes5.dex */
public abstract class ze6<T extends MobileOfficialAppsCoreNavStat$EventScreen> {

    @NonNull
    public final T a;
    public boolean b = true;

    public ze6(@NonNull T t) {
        this.a = t;
    }

    @Nullable
    public abstract IntentAction[] a();

    public String b() {
        return null;
    }

    public abstract Object c();

    public abstract void d(IntentAction intentAction);

    public abstract void e(@NonNull PhotoAlbum photoAlbum);

    public abstract void f(@NonNull UserId userId, String str);
}
