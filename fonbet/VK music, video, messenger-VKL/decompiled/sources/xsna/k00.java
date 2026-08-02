package xsna;

import android.graphics.Bitmap;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.likes.dto.LikesAddResponseDto;
import com.vk.api.generated.likes.dto.LikesItemReactionsDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.channels.impl.channel_screen.footer.b;
import com.vk.clips.models.SdkClipOrdData;
import com.vk.dto.stories.entities.OrdData;
import com.vk.feed.blacklist.impl.presentation.blacklist.BlacklistFragment;
import com.vk.log.L;
import com.vk.newsfeed.api.posting.viewpresenter.PreviewRatio;
import com.vk.newsfeed.common.recycler.holders.zhukov.CropableImageContainer;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.voip.ui.broadcast.fragments.scheduled.BroadcastScheduledFragment;
import com.vk.voip.ui.call_effects.beauty.ui.BeautySettingsFragment;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Set;
import kotlin.Triple;
import xsna.fh5;
import xsna.gm50;
import xsna.mwa;
import xsna.pt2;
import xsna.y6d;
import xsna.z7b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class k00 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k00(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        yg5 yg5Var;
        fh5.d dVar;
        lca lcaVar;
        switch (this.b) {
            case 0:
                o00 o00Var = (o00) this.c;
                ((Boolean) obj).booleanValue();
                o00Var.d.invoke();
                break;
            case 1:
                x60 x60Var = (x60) this.c;
                LikesAddResponseDto likesAddResponseDto = (LikesAddResponseDto) obj;
                LikesItemReactionsDto d = likesAddResponseDto.d();
                int l1 = likesAddResponseDto.l1();
                Boolean e = likesAddResponseDto.e();
                break;
            case 2:
                pt2.a aVar = ((st2) this.c).A;
                if (aVar != null) {
                    aVar.getClass();
                    a2 a2Var = new a2();
                    a2Var.z(MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_INVITE_ANONYMOUS);
                    pt2 pt2Var = pt2.this;
                    a2Var.y(pt2Var.l);
                    a2Var.k(pt2Var.i);
                }
                break;
            case 3:
                ((vd4) this.c).c.invoke((od4) obj);
                break;
            case 4:
                jr4 jr4Var = jr4.this;
                ur4 b = jr4Var.j.b();
                Integer valueOf = b != null ? Integer.valueOf(b.a) : null;
                if (valueOf != null) {
                    io.reactivex.rxjava3.disposables.c cVar = jr4Var.q;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    jr4Var.q = jr4Var.i.E(jr4Var, new dhr(valueOf.intValue())).m(asu0.a.d()).subscribe(new defpackage.z(new com.vk.movika.sdk.base.data.a(jr4Var, 6), 5), new bf2(new h5(jr4Var, 9), 2));
                }
                break;
            case 5:
                fh5 fh5Var = (fh5) this.c;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                if (booleanValue && (dVar = fh5Var.I0) != null) {
                    dVar.invoke();
                }
                fjz V = fh5Var.V();
                if (V != null) {
                    yg5 yg5Var2 = fh5Var.j;
                    if (yg5Var2 == null) {
                        yg5Var2 = null;
                    }
                    if (yg5Var2.p0()) {
                        if (booleanValue) {
                            V.resume();
                        } else {
                            V.pause();
                        }
                    }
                }
                if (fh5Var.L0 && (yg5Var = fh5Var.j) != null) {
                    if (booleanValue) {
                        (yg5Var != null ? yg5Var : null).f0(fh5Var);
                    } else {
                        (yg5Var != null ? yg5Var : null).T(fh5Var);
                    }
                }
                t3h t3hVar = fh5Var.y0;
                if (t3hVar != null) {
                    t3hVar.invoke(bool);
                }
                fh5Var.P0();
                break;
            case 6:
                int i = BeautySettingsFragment.Q;
                ((cw6) this.c).a((aw6) obj);
                break;
            case 7:
                ((n47) this.c).Bb();
                break;
            case 8:
                BlacklistFragment blacklistFragment = (BlacklistFragment) this.c;
                int i2 = BlacklistFragment.V;
                ((ae7) blacklistFragment.S.getValue()).submitList(rdi.x((List) obj));
                break;
            case 9:
                oh7 oh7Var = (oh7) this.c;
                oh7Var.e = true;
                oh7Var.c.U((Bitmap) obj, true);
                oh7Var.a.Y2(false);
                CropableImageContainer cropableImageContainer = oh7Var.b;
                cropableImageContainer.d = true;
                if (cropableImageContainer.e) {
                    PreviewRatio previewRatio = cropableImageContainer.f;
                    if (previewRatio != null) {
                        cropableImageContainer.c.a(previewRatio, cropableImageContainer.b.getHasMoreVerticalSpace());
                    }
                    cropableImageContainer.e = false;
                }
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                BroadcastScheduledFragment broadcastScheduledFragment = (BroadcastScheduledFragment) this.c;
                ii8 ii8Var = (ii8) obj;
                int i3 = BroadcastScheduledFragment.U;
                broadcastScheduledFragment.R.getClass();
                break;
            case 13:
                xzh0 xzh0Var = ((g3a) this.c).q;
                if (xzh0Var != null) {
                    xzh0Var.invoke();
                }
                break;
            case 14:
                ((CatalogRootViewHolder) this.c).S((cfp0) obj);
                break;
            case 15:
                break;
            case 16:
                ((mwa) this.c).d = (mwa.a) obj;
                break;
            case 17:
                ((com.vk.channels.impl.channel_screen.footer.i) this.c).O(b.d.b);
                break;
            case 18:
                ((s7b) this.c).j.b(z7b.a.a);
                L.i((Throwable) obj);
                break;
            case 19:
                ((ubb) this.c).k.d(R.string.vkim_channels_cannot_delete_message);
                break;
            case 20:
                ((ftb) this.c).e.x0();
                break;
            case 21:
                ((ttb) this.c).e.onAccept();
                break;
            case 22:
                UIBlock uIBlock = (UIBlock) obj;
                RecyclerView.Adapter adapter = ((RecyclerView) this.c).getAdapter();
                if (adapter instanceof lca) {
                    lcaVar = (lca) adapter;
                } else {
                    if (adapter instanceof pd90) {
                        T t = ((pd90) adapter).c;
                        if (t instanceof lca) {
                            lcaVar = (lca) t;
                        }
                    }
                    lcaVar = null;
                }
                if (lcaVar != null) {
                    break;
                }
                break;
            case 23:
                break;
            case 24:
                j03.j(((gwc) this.c).f, (Throwable) obj);
                break;
            case 25:
                o1d o1dVar = (o1d) this.c;
                gm50.a.a(o1dVar, ((y6d.b) obj).a, new l00(o1dVar, 18));
                break;
            case 26:
                ((x6d) this.c).e.a.a(m3d.b);
                break;
            case 27:
                OrdData ordData = (OrdData) obj;
                ((com.vk.im.ui.fragments.b) this.c).invoke(new SdkClipOrdData(ordData.b, ordData.c, ordData.d, null, 8, null));
                break;
            default:
                Triple triple = (Triple) obj;
                ((com.vk.clips.interests.impl.feature.a) this.c).T(new mhe((List) triple.d(), (Set) triple.h(), (List) triple.g()));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ k00(x60 x60Var, r40 r40Var) {
        this.b = 1;
        this.c = x60Var;
    }

    public /* synthetic */ k00(ogc ogcVar, RecyclerView recyclerView) {
        this.b = 22;
        this.c = recyclerView;
    }
}
