package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.auth.ui.VkAuthPasswordView;
import com.vk.auth.ui.VkLoadingButton;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipGlobalSearchFeatureRootVh;
import com.vk.clips.clipsaudio.views.ClipsAudioFragment;
import com.vk.clips.editor.templates.impl.views.main.ClipsTemplateEditorFragment;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.Owner;
import com.vk.ecomm.onlinebooking.impl.records.ui.BookingRecordsScreenFragment;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.profile.community.details.impl.contacts.CommunityAddContactsState;
import com.vk.toggle.debug.BaseDebugTogglesFragment;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.voip.ui.asr.ui.start.AsrRecordStartFragment;
import java.util.Calendar;
import java.util.List;
import kotlin.Pair;
import xsna.bh7;
import xsna.bph0;
import xsna.cse;
import xsna.kq0;
import xsna.ngd;
import xsna.qvq;
import xsna.rw3;
import xsna.xf8;
import xsna.xn50;
import xsna.yv3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class w8 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x019a  */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        dw20 dw20Var;
        VkCell.Right.d dVar;
        int i = this.b;
        Object obj2 = null;
        VkCell.Right.d dVar2 = null;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                VideoFile videoFile = ((e9) obj3).b.e;
                videoFile.k3(bool.booleanValue());
                Owner s = videoFile.s();
                if (s != null) {
                    s.g(4, bool.booleanValue());
                }
                wjs0.a(new fyr0(videoFile));
                break;
            case 1:
                int intValue = ((Integer) obj).intValue();
                qcy<Object>[] qcyVarArr = ph.n1;
                ((ph) obj3).getFeature().C(new bph0.a(intValue));
                break;
            case 2:
                rd0 rd0Var = (rd0) obj3;
                View view = (View) obj;
                if (rd0Var.a && (dw20Var = rd0Var.d) != null) {
                    dw20Var.Sn(view.getContext());
                }
                break;
            case 3:
                gu80 gu80Var = (gu80) obj;
                ((jr0) obj3).C(new kq0.a(gu80Var.b, gu80Var.c, gu80Var.a));
                break;
            case 4:
                Integer num = ((gg1) obj3).t;
                break;
            case 5:
                yv3 yv3Var = (yv3) obj;
                int i2 = AsrRecordStartFragment.U;
                ((AsrRecordStartFragment) obj3).R.getClass();
                if (yv3Var instanceof yv3.c.C4139c) {
                    yv3.c cVar = (yv3.c) yv3Var;
                    obj2 = new rw3.b((String) cVar.a().a, (String) cVar.a().b);
                } else if (yv3Var instanceof yv3.c.b) {
                    yv3.c cVar2 = (yv3.c) yv3Var;
                    obj2 = new rw3.c((String) cVar2.a().a, (String) cVar2.a().b);
                } else if (yv3Var instanceof yv3.c.a) {
                    obj2 = new rw3.a(((yv3.c.a) yv3Var).c);
                }
                break;
            case 6:
                final boolean booleanValue = ((Boolean) obj).booleanValue();
                rdi.y((gce0) obj3, new izs() { // from class: xsna.v75
                    @Override // xsna.izs
                    public final Object invoke(Object obj4) {
                        return PublishState.a((PublishState) obj4, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, booleanValue, false, false, false, -1, 1983);
                    }
                });
                break;
            case 7:
                BaseDebugTogglesFragment baseDebugTogglesFragment = (BaseDebugTogglesFragment) obj3;
                Pair pair = (Pair) obj;
                String str = (String) pair.d();
                List<? extends hfz> list = (List) pair.g();
                baseDebugTogglesFragment.Q = str;
                h1p0 h1p0Var = baseDebugTogglesFragment.R;
                if (h1p0Var == null) {
                    h1p0Var = null;
                }
                h1p0Var.setItems(list);
                LinearLayoutManager linearLayoutManager = baseDebugTogglesFragment.P;
                (linearLayoutManager != null ? linearLayoutManager : null).K(0, 0);
                break;
            case 8:
                com.vk.auth.ui.checkaccess.a aVar = (com.vk.auth.ui.checkaccess.a) obj3;
                VkLoadingButton vkLoadingButton = aVar.n;
                if (vkLoadingButton == null) {
                    vkLoadingButton = null;
                }
                VkAuthPasswordView vkAuthPasswordView = aVar.l;
                vkLoadingButton.setEnabled((vkAuthPasswordView != null ? vkAuthPasswordView : null).getPassword().length() > 0);
                break;
            case 9:
                al6 al6Var = (al6) obj3;
                vgg vggVar = (vgg) obj;
                Throwable th = vggVar.a;
                par0.a.getClass();
                par0.d(th);
                if (vggVar.b() == ApiErrorViewType.CUSTOM) {
                    pud0 pud0Var = (pud0) al6Var.a;
                    if (pud0Var != null) {
                        pud0Var.vf(wbu0.a(al6Var.b, th, false));
                    }
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    vggVar.c();
                }
                break;
            case 10:
                bh7 bh7Var = (bh7) obj3;
                ((zak0) bh7Var.c).setValue((bh7.a) bh7Var.b.get((String) obj));
                break;
            case 11:
                break;
            case 12:
                qcy<Object>[] qcyVarArr2 = BookingRecordsScreenFragment.V;
                wr7.a((BookingRecordsScreenFragment) obj3, (as7) obj);
                break;
            case 13:
                BotButton.Location location = (BotButton.Location) obj3;
                w9y w9yVar = (w9y) obj;
                w9yVar.c(Integer.valueOf(location.g.h()), "type");
                w9yVar.e(location.h, "payload");
                w9yVar.c(Integer.valueOf(location.i), TtmlNode.TAG_SPAN);
                w9yVar.b(Boolean.valueOf(location.j), "inline");
                w9yVar.d(Long.valueOf(location.k.b), "author");
                break;
            case 14:
                ((wf8) obj3).d(xf8.e.a);
                break;
            case 15:
                bk8 bk8Var = (bk8) obj3;
                ?? r0 = bk8Var.g;
                ((Calendar) r0.getValue()).setTimeInMillis(((Long) obj).longValue());
                ak8 ak8Var = bk8Var.f;
                if (ak8Var != null) {
                    ak8Var.u3(((Calendar) r0.getValue()).get(6) - 1, ((Calendar) r0.getValue()).get(11), ((Calendar) r0.getValue()).get(12), ((Calendar) r0.getValue()).get(13));
                }
                break;
            case 16:
                break;
            case 17:
                noa noaVar = (noa) obj3;
                VkCell vkCell = (VkCell) obj;
                VkCell.Middle.a aVar2 = VkCell.Middle.Companion;
                VkCell.Middle.e eVar = (VkCell.Middle.e) noaVar.f.get(noaVar.j());
                VkCell.Middle.d dVar3 = (VkCell.Middle.d) noaVar.b.get(noaVar.i());
                VkCell.Middle.c cVar3 = (VkCell.Middle.c) noaVar.c.get((String) ((zak0) noaVar.m).getValue());
                VkCell.Middle.Size size = (VkCell.Middle.Size) noaVar.d.get((String) ((zak0) noaVar.q).getValue());
                if (size == null) {
                    size = VkCell.Middle.Size.Medium;
                }
                aVar2.getClass();
                vkCell.setMiddle(new VkCell.Middle.b(eVar, dVar3, cVar3, size));
                vkCell.setLeft((VkCell.Left.b) noaVar.g.get((String) ((zak0) noaVar.n).getValue()));
                String str2 = (String) ((zak0) noaVar.o).getValue();
                VkCell.Right right = (VkCell.Right) noaVar.j.get((String) ((zak0) noaVar.p).getValue());
                VkCell.Right.d dVar4 = (VkCell.Right.d) noaVar.i.get(str2);
                if (dVar4 == null) {
                    if (right == null) {
                        dVar = null;
                        if (dVar != null) {
                            dVar2 = VkCell.Right.d.a(dVar, null, null, null, right instanceof VkCell.Right.b ? (VkCell.Right.b) right : null, right instanceof VkCell.Right.f ? (VkCell.Right.f) right : null, 7);
                        }
                        vkCell.setRight(dVar2);
                        break;
                    } else {
                        dVar4 = VkCell.Right.c.a(VkCell.Right.Companion, null, null, null, null, 31);
                    }
                }
                dVar = dVar4;
                if (dVar != null) {
                }
                vkCell.setRight(dVar2);
            case 18:
                g2v.c().getClass();
                break;
            case 19:
                break;
            case 20:
                ((io.reactivex.rxjava3.core.y) obj3).onSuccess((ClipVideoFile) obj);
                break;
            case 21:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                int i3 = ClipFeedListFragment.a2;
                ((ClipFeedListFragment) obj3).Do().getFeature().a(new qvq.r(booleanValue2));
                break;
            case 22:
                ((kca) ((ClipGlobalSearchFeatureRootVh) obj3).u.getValue()).b();
                break;
            case 23:
                ClipsAudioFragment clipsAudioFragment = (ClipsAudioFragment) obj3;
                int i4 = ClipsAudioFragment.Y;
                ngd.b bVar = ngd.b.b;
                clipsAudioFragment.getClass();
                xn50.a.c(clipsAudioFragment, bVar);
                break;
            case 24:
                dpd dpdVar = (dpd) obj3;
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                ClipsPlaylist clipsPlaylist = ((cse.a.C2680a) obj).a;
                int i5 = clipsPlaylist.b;
                ClipsPlaylist clipsPlaylist2 = ((nre) obj3).f.b;
                break;
            case 28:
                int i6 = ClipsTemplateEditorFragment.h0;
                ((ClipsTemplateEditorFragment) obj3).eo().j();
                break;
            default:
                qgi0.r((tgi0) obj, "ContactsFieldCaption" + ((CommunityAddContactsState.ContactField) obj3).d.ordinal());
                break;
        }
        return s3q0.a;
    }
}
