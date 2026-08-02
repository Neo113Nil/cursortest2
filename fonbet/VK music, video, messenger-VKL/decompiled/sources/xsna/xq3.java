package xsna;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.adapters.bigo.banner.BigoBannerAdapter;
import com.vk.attachpicker.impl.DeprecatedAttachActivity;
import com.vk.catalog2.feature.music.holders.artist.ArtistInfoVhOld;
import com.vk.clips.design.view.timeline.FragmentActionsView;
import com.vk.log.L;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vk.voip.ui.watchmovie.player.VoipWatchMoviePlayerControlView;
import com.vk.webapp.fragments.CommunityManageFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import me.grishka.appkit.views.UsableRecyclerView;
import ru.ok.tracer.utils.TracerThreads;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class xq3 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xq3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dcn e;
        Dialog dialog;
        FragmentActivity activity;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ArtistInfoVhOld artistInfoVhOld = (ArtistInfoVhOld) obj;
                dcn dcnVar = artistInfoVhOld.n;
                if (dcnVar != null) {
                    dcnVar.dismiss();
                }
                ImageView imageView = artistInfoVhOld.h;
                if (imageView == null) {
                    imageView = null;
                }
                Activity h = e3m.h(imageView.getContext());
                if (h != null) {
                    Rect rect = new Rect();
                    ImageView imageView2 = artistInfoVhOld.h;
                    (imageView2 != null ? imageView2 : null).getGlobalVisibleRect(rect);
                    e = artistInfoVhOld.d.e(h, rect, "audio:artist_follow", new com.vk.movika.sdk.base.model.props.d(8));
                    artistInfoVhOld.n = e;
                    break;
                }
                break;
            case 1:
                t05 t05Var = (t05) obj;
                com.vk.core.utils.newtork.b.a.getClass();
                if (com.vk.core.utils.newtork.b.d()) {
                    p05 p05Var = t05Var.a;
                    List<o05> c = p05Var.c();
                    if (!c.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (o05 o05Var : c) {
                            String str = p05Var.b(o05Var).a().booleanValue() ? o05Var.a : null;
                            if (str != null) {
                                arrayList.add(str);
                            }
                        }
                        p05Var.a(arrayList);
                        break;
                    }
                }
                break;
            case 2:
                BigoBannerAdapter.destroyAd$lambda$0((BigoBannerAdapter) obj);
                break;
            case 3:
                com.vk.core.view.components.spinner.c cVar = ((CommunityManageFragment) obj).h0;
                if (cVar != null) {
                    qv20.b(cVar);
                    break;
                }
                break;
            case 4:
                ((CountDownLatch) obj).countDown();
                break;
            case 5:
                DeprecatedAttachActivity deprecatedAttachActivity = (DeprecatedAttachActivity) obj;
                deprecatedAttachActivity.d2(deprecatedAttachActivity.t0);
                deprecatedAttachActivity.e2();
                if (deprecatedAttachActivity.E.M != 5) {
                    DeprecatedAttachActivity.g gVar = deprecatedAttachActivity.N;
                    if (!gVar.k) {
                        gVar.k = true;
                        gVar.notifyDataSetChanged();
                        break;
                    }
                }
                break;
            case 6:
                com.vk.attachpicker.screen.filters.b bVar = (com.vk.attachpicker.screen.filters.b) obj;
                bVar.b.dispose();
                bVar.c.f();
                com.vk.attachpicker.screen.filters.a aVar = bVar.a;
                if (aVar != null) {
                    aVar.f.dispose();
                    break;
                }
                break;
            case 7:
                FragmentActionsView.c((FragmentActionsView) obj);
                break;
            case 8:
                h03.b((Throwable) obj);
                break;
            case 9:
                ((no00) obj).U();
                break;
            case 10:
                dw20 dw20Var = (dw20) obj;
                if (dw20Var.isAdded()) {
                    dw20Var.tn();
                    break;
                }
                break;
            case 11:
                dw20 dw20Var2 = ((ProfileMainPhotosFragment) obj).t0;
                if (dw20Var2 != null && (dialog = dw20Var2.s) != null) {
                    dialog.dismiss();
                    break;
                }
                break;
            case 12:
                rsf0 rsf0Var = (rsf0) obj;
                Context context = rsf0Var.c.getContext();
                HashSet hashSet = iah0.a;
                if (!fnj.d(context) && (activity = rsf0Var.b.getActivity()) != null) {
                    activity.setRequestedOrientation(1);
                }
                rsf0Var.a().post(new jk9(rsf0Var, 9));
                break;
            case 13:
                TracerThreads.runInBgAfterStartup$lambda$0((Runnable) obj);
                break;
            case 14:
                ((hmp0) obj).a();
                break;
            case 15:
                UsableRecyclerView usableRecyclerView = (UsableRecyclerView) obj;
                int i2 = UsableRecyclerView.J;
                usableRecyclerView.u = new GestureDetector(usableRecyclerView.getContext(), new UsableRecyclerView.w(usableRecyclerView.getContext()));
                break;
            case 16:
                try {
                    ((Dialog) obj).show();
                    break;
                } catch (Exception e2) {
                    L.i(e2);
                    return;
                }
            default:
                VoipWatchMoviePlayerControlView.P4((VoipWatchMoviePlayerControlView) obj);
                break;
        }
    }
}
