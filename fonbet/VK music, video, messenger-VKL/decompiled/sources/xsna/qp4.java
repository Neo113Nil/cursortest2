package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.ClipboardManager;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.core.tips.Tooltip;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.im.engine.models.attaches.AttachWithVideo;
import com.vk.im.ui.fragments.ImSelectDonutContactsFragment;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.log.L;
import com.vk.money.createtransfer.people.pin.VkPayPinFragment;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.network.kbh.state.NetworkState;
import com.vk.photo.editor.PhotoEditorView;
import com.vk.photos.legacy.EditAlbumFragment;
import com.vk.photos.legacy.PhotoAlbumListFragment;
import com.vkontakte.android.R;
import xsna.as30;
import xsna.e3m;
import xsna.pxw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class qp4 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qp4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                hd60.a().r1(((rp4) this.c).t6());
                break;
            case 1:
                com.vk.im.video.g gVar = (com.vk.im.video.g) this.c;
                fh5 fh5Var = gVar.w;
                if (fh5Var == null) {
                    fh5Var = null;
                }
                yg5 yg5Var = fh5Var.j;
                if (yg5Var == null) {
                    yg5Var = null;
                }
                if (!yg5Var.R0().h()) {
                    AttachWithVideo attachWithVideo = gVar.q;
                    if (attachWithVideo == null) {
                        attachWithVideo = null;
                    }
                    if (!attachWithVideo.M()) {
                        t4w t4wVar = gVar.t;
                        if (t4wVar == null) {
                            t4wVar = null;
                        }
                        if (!t4wVar.W0()) {
                            AttachWithVideo attachWithVideo2 = gVar.q;
                            if (attachWithVideo2 == null) {
                                attachWithVideo2 = null;
                            }
                            if (!attachWithVideo2.A().Ia()) {
                                Activity m = gVar.m();
                                if (m != null) {
                                    if (d6q0.t != NetworkState.UNSTABLE) {
                                        fh5 fh5Var2 = gVar.w;
                                        uc.o(fh5Var2 == null ? null : fh5Var2, m, false, null, null, null, 60);
                                        s3q0 s3q0Var = s3q0.a;
                                        break;
                                    } else {
                                        cvk.t();
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    as30.a aVar = gVar.s;
                    (aVar != null ? aVar : null).b();
                    break;
                }
                break;
            case 2:
                ImSelectDonutContactsFragment imSelectDonutContactsFragment = (ImSelectDonutContactsFragment) this.c;
                int i = ImSelectDonutContactsFragment.k0;
                imSelectDonutContactsFragment.Mf(0, null);
                break;
            case 3:
                x730 x730Var = (x730) this.c;
                izs<Integer, s3q0> izsVar = x730Var.m;
                Object obj = x730Var.l;
                izsVar.invoke(Integer.valueOf(((w730) (obj != null ? obj : null)).a.getItemId()));
                break;
            case 4:
                k230 k230Var = ((d650) this.c).h;
                if (k230Var != null) {
                    k230Var.c();
                    break;
                }
                break;
            case 5:
                ((gzs) this.c).invoke();
                break;
            case 6:
                final PhotoAlbumListFragment.e eVar = (PhotoAlbumListFragment.e) this.c;
                if (((PhotoAlbum) eVar.m).b >= 0) {
                    PopupMenu popupMenu = new PopupMenu(PhotoAlbumListFragment.this.getActivity(), view);
                    if (BuildInfo.s()) {
                        popupMenu.getMenu().add(0, 0, 0, eVar.b6().getString(R.string.edit));
                        popupMenu.getMenu().add(0, 1, 0, eVar.b6().getString(R.string.delete));
                    }
                    popupMenu.getMenu().add(0, 2, 0, eVar.b6().getString(R.string.copy_link));
                    popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: xsna.c5a0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // android.widget.PopupMenu.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            PhotoAlbumListFragment.e eVar2 = PhotoAlbumListFragment.e.this;
                            PhotoAlbumListFragment photoAlbumListFragment = PhotoAlbumListFragment.this;
                            int itemId = menuItem.getItemId();
                            if (itemId == 0) {
                                PhotoAlbum photoAlbum = (PhotoAlbum) eVar2.m;
                                int i2 = PhotoAlbumListFragment.O0;
                                EditAlbumFragment.b bVar = new EditAlbumFragment.b();
                                bVar.j.putParcelable("album", photoAlbum);
                                bVar.g(8295, photoAlbumListFragment);
                                return true;
                            }
                            if (itemId == 1) {
                                if (photoAlbumListFragment.J0 != null) {
                                    PhotoAlbumListFragment.Io(photoAlbumListFragment.getActivity(), (PhotoAlbum) eVar2.m, photoAlbumListFragment.J0, null);
                                    return true;
                                }
                                L.G("can't delete photo album on empty uid!");
                                return true;
                            }
                            if (itemId != 2) {
                                return true;
                            }
                            PhotoAlbum photoAlbum2 = (PhotoAlbum) eVar2.m;
                            int i3 = PhotoAlbumListFragment.O0;
                            ((ClipboardManager) photoAlbumListFragment.getActivity().getSystemService("clipboard")).setText(dz5.r(photoAlbum2));
                            cvk.u(R.string.link_copied, false);
                            return true;
                        }
                    });
                    popupMenu.show();
                    break;
                }
                break;
            case 7:
                m4p m4pVar = ((PhotoEditorView) this.c).G;
                if (m4pVar != null) {
                    m4pVar.c();
                    break;
                }
                break;
            case 8:
                RecyclerPaginatedView recyclerPaginatedView = ((PodcastEpisodeFragment) this.c).U;
                if (recyclerPaginatedView != null) {
                    recyclerPaginatedView.getRecyclerView().scrollToPosition(0);
                    break;
                }
                break;
            case 9:
                ((u3g0) this.c).Ic(false);
                break;
            case 10:
                ((zvk0) this.c).b.a(axk0.b);
                break;
            case 11:
                b5p0 b5p0Var = (b5p0) this.c;
                b5p0Var.h6();
                Rect rect = new Rect();
                b5p0Var.o.getGlobalVisibleRect(rect);
                SpannableString spannableString = new SpannableString("Ответить на историю с такой же маской");
                int K = drm0.K(0, 6, "Ответить на историю с такой же маской", "маской", false);
                spannableString.setSpan(new BackgroundColorSpan(b5p0Var.itemView.getContext().getColor(R.color.vk_yellow)), K, K + 6, 0);
                Context context = b5p0Var.itemView.getContext();
                sg0 sg0Var = new sg0(b5p0Var, 18);
                Context context2 = b5p0Var.itemView.getContext();
                e3m.a aVar2 = e3m.a;
                b5p0Var.l = new Tooltip(context, "", spannableString, null, sg0Var, null, null, 0, context2.getColor(R.color.vk_gray_800), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, false, null, 0, false, null, null, null, null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, 0, null, null, null, null, -280, 15).j(b5p0Var.itemView.getContext(), new RectF(rect));
                break;
            case 12:
                VkPayPinFragment vkPayPinFragment = (VkPayPinFragment) this.c;
                int i2 = VkPayPinFragment.c0;
                vkPayPinFragment.a0();
                break;
            case 13:
                ((oxw0) this.c).z.a(pxw0.c.a);
                break;
            default:
                ((ydz0) this.c).c.a(view, new akz0());
                break;
        }
    }
}
