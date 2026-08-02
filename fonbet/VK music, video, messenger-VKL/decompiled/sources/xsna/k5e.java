package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.vk.clips.favorites.api.params.ClipsFavoritesFolderRenamingParams;
import com.vk.clips.favorites.api.params.ClipsFavoritesFoldersPickerParams;
import com.vk.clips.favorites.impl.ui.folders.picker.ClipsFavoritesFoldersPickerFragment;
import com.vk.clips.favorites.impl.ui.folders.renaming.b;
import kotlin.Pair;

/* compiled from: ClipsFavoritesLauncherImpl.kt */
/* loaded from: classes16.dex */
public final class k5e implements j5e {
    @Override // xsna.j5e
    public final void a(ClipsFavoritesFoldersPickerParams clipsFavoritesFoldersPickerParams, FragmentManager fragmentManager) {
        ClipsFavoritesFoldersPickerFragment.V.getClass();
        ClipsFavoritesFoldersPickerFragment clipsFavoritesFoldersPickerFragment = new ClipsFavoritesFoldersPickerFragment();
        clipsFavoritesFoldersPickerFragment.setArguments(yfb.b(new Pair("params", clipsFavoritesFoldersPickerParams)));
        clipsFavoritesFoldersPickerFragment.Td(fragmentManager, "ClipsFavoritesFoldersPickerFragment");
    }

    @Override // xsna.j5e
    public final void b(ClipsFavoritesFolderRenamingParams clipsFavoritesFolderRenamingParams, Context context, FragmentManager fragmentManager) {
        String str = com.vk.clips.favorites.impl.ui.folders.renaming.b.m1;
        new b.a(context, clipsFavoritesFolderRenamingParams).H0(fragmentManager, com.vk.clips.favorites.impl.ui.folders.renaming.b.m1);
    }
}
