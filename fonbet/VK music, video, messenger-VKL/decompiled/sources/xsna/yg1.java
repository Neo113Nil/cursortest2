package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.fragment.MediaPickerFragmentImpl;
import com.vk.core.tips.Tooltip;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.right.VkCellRight;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.stickers.StickerStockItemWithStickerId;
import com.vk.feed.design.view.newsfeed.ads_mytarget.bls.MyTargetAdSurveyCellView;
import com.vk.im.engine.models.attaches.AttachWithVideo;
import com.vk.network.kbh.state.NetworkState;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragmentOld;
import com.vk.permission.PermissionHelper;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors;
import com.vk.stickers.ContextUser;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import xsna.as30;
import xsna.kcl0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class yg1 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yg1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                gzs<s3q0> gzsVar = ((zg1) this.c).c;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 1:
                hd60.a().r1(((rp4) this.c).t6());
                break;
            case 2:
                efm efmVar = ((cfm) this.c).e;
                if (efmVar != null) {
                    efmVar.onClose();
                    break;
                }
                break;
            case 3:
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
            case 4:
                LocalMediaPickerFragmentOld localMediaPickerFragmentOld = (LocalMediaPickerFragmentOld) this.c;
                int i = LocalMediaPickerFragmentOld.c0;
                if (gz80.a(34)) {
                    PermissionHelper permissionHelper = PermissionHelper.a;
                    Context mo2getContext = localMediaPickerFragmentOld.mo2getContext();
                    permissionHelper.getClass();
                    PermissionHelper.g(permissionHelper, mo2getContext, PermissionHelper.f, PermissionHelper.t, 0, 0, new obh(localMediaPickerFragmentOld, 17), null, null, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);
                    break;
                }
                break;
            case 5:
                MediaPickerFragmentImpl mediaPickerFragmentImpl = (MediaPickerFragmentImpl) this.c;
                int i2 = MediaPickerFragmentImpl.W0;
                mediaPickerFragmentImpl.oo();
                break;
            case 6:
                gzs<s3q0> onAddAlbumClick = ((ev20) this.c).getOnAddAlbumClick();
                if (onAddAlbumClick != null) {
                    onAddAlbumClick.invoke();
                    break;
                }
                break;
            case 7:
                MyTargetAdSurveyCellView myTargetAdSurveyCellView = (MyTargetAdSurveyCellView) this.c;
                int i3 = et50.q1;
                myTargetAdSurveyCellView.d.toggle();
                break;
            case 8:
                d1c0 d1c0Var = (d1c0) this.c;
                Post post = (Post) d1c0Var.q6();
                if (post != null) {
                    d1c0Var.b7(post, MobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors.EntryPoint.FROM_HEADER);
                    break;
                }
                break;
            case 9:
                q5n0 q5n0Var = (q5n0) this.c;
                Integer num = q5n0Var.h;
                if (num != null) {
                    int intValue = num.intValue();
                    Context context = q5n0Var.c.getContext();
                    kcl0 kcl0Var = q5n0Var.b;
                    kcl0.b bVar = q5n0Var.e;
                    ContextUser contextUser = q5n0Var.i;
                    View view2 = q5n0Var.j;
                    s5n0 s5n0Var = new s5n0(context, kcl0Var, bVar, intValue, contextUser, view2);
                    com.vk.lists.c cVar = s5n0Var.i;
                    List<StickerStockItemWithStickerId> a = bVar.a(intValue);
                    if (a == null) {
                        cVar.p(false);
                    } else {
                        cVar.s(bVar.c(intValue));
                        s5n0Var.a(a);
                        s5n0Var.h.notifyDataSetChanged();
                    }
                    s5n0Var.g.e(view2);
                    break;
                }
                break;
            case 10:
                b5p0 b5p0Var = (b5p0) this.c;
                b5p0Var.h6();
                Rect rect = new Rect();
                b5p0Var.n.getGlobalVisibleRect(rect);
                b5p0Var.l = new Tooltip(b5p0Var.itemView.getContext(), "", "Длинная такая строка, вот прям очень длинная!", null, new i1f(b5p0Var, 10), null, null, 0, 0, null, 0.99f, null, 0, false, null, 0, false, null, null, null, null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, 0, null, null, null, null, -1048, 15).j(b5p0Var.itemView.getContext(), new RectF(rect));
                break;
            case 11:
                VkCell.Right.a.b bVar2 = (VkCell.Right.a.b) this.c;
                int i4 = VkCellRight.z;
                bVar2.b.invoke();
                break;
            case 12:
                ((wbv0) this.c).p.invoke();
                break;
            default:
                l6z0 l6z0Var = (l6z0) this.c;
                b520 b520Var = l6z0Var.i;
                if (b520Var != null) {
                    l6z0Var.k.a(b520Var);
                    break;
                }
                break;
        }
    }
}
