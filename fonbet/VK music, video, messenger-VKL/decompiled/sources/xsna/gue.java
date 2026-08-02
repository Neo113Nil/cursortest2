package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.vk.clips.playlists.ClipsPlaylistContentLaunchParams;
import com.vk.clips.playlists.ClipsPlaylistNamingLaunchParams;
import com.vk.clips.playlists.ClipsPlaylistPickerParams;
import com.vk.clips.playlists.ClipsPlaylistsFolderLaunchParams;
import com.vk.clips.playlists.a;
import com.vk.clips.playlists.folders.root.ClipsPlaylistsFoldersRootFragment;
import com.vk.clips.playlists.ui.modal.EmptyPlaylistBottomSheet;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerFragment;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerFragmentWrapperActivity;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.bre;
import xsna.h7u0;
import xsna.kse;
import xsna.tzp0;

/* compiled from: ClipsPlaylistsLauncherImpl.kt */
/* loaded from: classes16.dex */
public final class gue implements com.vk.clips.playlists.a, w8i {
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.logic.processor.actions.f(this, 24));

    @Override // com.vk.clips.playlists.a
    public final void a(Context context, ClipsPlaylistNamingLaunchParams clipsPlaylistNamingLaunchParams, FragmentManager fragmentManager, wte wteVar) {
        kse.a aVar = new kse.a(context, clipsPlaylistNamingLaunchParams);
        if (wteVar != null) {
            aVar.Z(wteVar);
        }
        aVar.H0(fragmentManager, "ClipsPlaylistsFolderNamingBottomSheet");
    }

    /* JADX WARN: Type inference failed for: r9v6, types: [T, xsna.dw20] */
    @Override // com.vk.clips.playlists.a
    public final void b(Context context, ClipsPlaylistContentLaunchParams clipsPlaylistContentLaunchParams, FragmentManager fragmentManager, final gzs<s3q0> gzsVar) {
        ClipsPlaylist clipsPlaylist = clipsPlaylistContentLaunchParams.b;
        int i = clipsPlaylist.e;
        if (i > 0) {
            bre.s1.getClass();
            new bre.a(context, clipsPlaylistContentLaunchParams, new tzp0.c.a(new cre(clipsPlaylist), false)).H0(fragmentManager, "ClipsPlaylistUiBottomSheet");
            return;
        }
        if (i == 0) {
            if (!xg5.a().e(clipsPlaylist.f)) {
                int i2 = h7u0.p;
                h7u0.a c = h7u0.b.c(context);
                c.h0(context.getString(R.string.clips_playlist_no_clips_bs_subtitle, clipsPlaylist.c));
                c.X(context.getString(R.string.clips_playlists_close), new o1c());
                c.a0(new DialogInterface.OnDismissListener() { // from class: xsna.fue
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        gzs.this.invoke();
                    }
                });
                c.m();
                return;
            }
            boolean z = clipsPlaylistContentLaunchParams.d;
            if (z) {
                context = bwt0.u(context);
            }
            Context context2 = context;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            EmptyPlaylistBottomSheet emptyPlaylistBottomSheet = new EmptyPlaylistBottomSheet(context2, clipsPlaylistContentLaunchParams, gzsVar, new m3g(ref$ObjectRef, 13), z);
            emptyPlaylistBottomSheet.d = new bfm(gzsVar, 5);
            ref$ObjectRef.element = emptyPlaylistBottomSheet.a(context2, EmptyPlaylistBottomSheet.class.getSimpleName());
        }
    }

    @Override // com.vk.clips.playlists.a
    public final a.InterfaceC0623a c(Context context, izs<? super ClipsPlaylist, s3q0> izsVar) {
        return new tpe(context, izsVar);
    }

    @Override // com.vk.clips.playlists.a
    public final void d(Context context, ClipsPlaylistPickerParams clipsPlaylistPickerParams) {
        int i = ClipsPlaylistPickerFragmentWrapperActivity.z;
        Bundle bundle = new Bundle();
        bundle.putParcelable("params", clipsPlaylistPickerParams);
        ClipsPlaylistPickerFragmentWrapperActivity.a aVar = new ClipsPlaylistPickerFragmentWrapperActivity.a(ClipsPlaylistPickerFragment.class, null, bundle);
        aVar.s(true);
        aVar.k(context);
    }

    @Override // com.vk.clips.playlists.a
    public final void e(ClipsPlaylistsFolderLaunchParams clipsPlaylistsFolderLaunchParams, FragmentManager fragmentManager) {
        ClipsPlaylistsFoldersRootFragment.S.getClass();
        ClipsPlaylistsFoldersRootFragment clipsPlaylistsFoldersRootFragment = new ClipsPlaylistsFoldersRootFragment();
        clipsPlaylistsFoldersRootFragment.setArguments(yfb.b(new Pair("folder_input_params", clipsPlaylistsFolderLaunchParams)));
        clipsPlaylistsFoldersRootFragment.Td(fragmentManager, ClipsPlaylistsFoldersRootFragment.U);
    }
}
