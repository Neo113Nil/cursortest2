package xsna;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.c;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.newsfeed.posting.poll_editor.presentation.base.fragment.PollEditorModalBottomSheet;
import com.vk.posting.presentation.model.PickerRootParams;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.VoipSelectVideoPlaylistsFragment;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import xsna.lsh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class wx40 implements io.reactivex.rxjava3.functions.l, c.b, spb0, b680, io.reactivex.rxjava3.functions.m, i0u0, pcs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wx40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public void a(b520 b520Var) {
        ((kpy0) this.c).c(b520Var);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (io.reactivex.rxjava3.core.t) ((vx40) this.c).invoke(obj);
            case 1:
            case 2:
            case 4:
            case 6:
            case 11:
            case 14:
            case 15:
            default:
                return (WebApiApplication) ((q8) this.c).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.b0) ((yka0) this.c).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.o) ((yka0) this.c).invoke(obj);
            case 7:
                return (Narrative) ((ye40) this.c).invoke(obj);
            case 8:
                return (GetStoriesResponse) ((ye40) this.c).invoke(obj);
            case 9:
                return (u4m0) ((wfl0) this.c).invoke(obj);
            case 10:
                return (StoriesContainer) ((isb0) this.c).invoke(obj);
            case 12:
                return (SubscribeStatus) ((ye40) this.c).invoke(obj);
            case 13:
                return (Bitmap) ((isb0) this.c).invoke(obj);
            case 16:
                return (String) ((yka0) this.c).invoke(obj);
            case 17:
                return (io.reactivex.rxjava3.core.t) ((ye40) this.c).invoke(obj);
        }
    }

    @Override // com.google.android.material.tabs.c.b
    public void c(TabLayout.g gVar, int i) {
        PickerRootParams pickerRootParams = ((qia0) this.c).b;
        UserId userId = i != 0 ? i != 1 ? null : pickerRootParams.c : pickerRootParams.b;
        if (userId != null) {
            gVar.p(fkq0.b(userId) ? R.string.article_tab_community : R.string.article_tab_user);
        }
    }

    @Override // xsna.spb0
    public void f(qpb0 qpb0Var) {
        ((PollEditorModalBottomSheet) this.c).l1.b(qpb0Var);
    }

    @Override // xsna.i0u0
    public View get() {
        UserProfileHeaderView userProfileHeaderView = (UserProfileHeaderView) this.c;
        int i = UserProfileHeaderView.G;
        return (View) new WeakReference(userProfileHeaderView).get();
    }

    @Override // xsna.b680
    public void onFailure(Throwable th) {
        ((io.reactivex.rxjava3.core.r) this.c).onError(new IllegalStateException("Can't perform update flow", th));
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        VoipSelectVideoPlaylistsFragment voipSelectVideoPlaylistsFragment = (VoipSelectVideoPlaylistsFragment) this.c;
        int i = VoipSelectVideoPlaylistsFragment.S;
        if (str.hashCode() == 1732611084 && str.equals("PLAYLIST_VIDEO_SELECTED")) {
            voipSelectVideoPlaylistsFragment.getParentFragmentManager().k0(new Bundle(), "SELECTED");
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 6:
                return obj == ((lsh0.a) this.c) || obj == lsh0.a.ALL;
            default:
                return ((Boolean) ((ye40) this.c).invoke(obj)).booleanValue();
        }
    }
}
