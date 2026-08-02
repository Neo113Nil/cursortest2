package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.vk.attachpicker.impl.gifts.ProfileGiftsFragment;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.music.dto.ui.UIBlockAudioBookItem;
import com.vk.catalog2.feature.music.holders.audiobook.AudioBookCellVh;
import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;
import com.vk.core.view.components.cell.VkCell;
import com.vk.feed.design.view.newsfeed.digest.header.FeedDigestHeader;
import com.vk.im.channelcreation.impl.g;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.newsfeed.common.recycler.holders.donut.DonutPostClickSource;
import com.vk.photo.editor.markup.view.tools.BrushesPanel;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stories.StoriesFilterListFragment;
import com.vk.stories.StorySettingsActivity;
import kotlin.Pair;
import one.video.controls.views.VideoShortActions;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class vw0 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vw0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Activity h;
        UIBlock uIBlock;
        String str;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((cb) ((ww0) obj).c.a).invoke();
                break;
            case 1:
                ((b11) obj).b.a(AdsItemViewEvent.j.b);
                break;
            case 2:
                AudioBookCellVh audioBookCellVh = (AudioBookCellVh) obj;
                if (!jjc.c(400L)) {
                    VkCell vkCell = audioBookCellVh.d;
                    if (vkCell == null) {
                        vkCell = null;
                    }
                    Context context = vkCell.getContext();
                    if (context != null && (h = e3m.h(context)) != null && (uIBlock = audioBookCellVh.c) != null && (uIBlock instanceof UIBlockAudioBookItem)) {
                        audioBookCellVh.b.s(h, ((UIBlockAudioBookItem) uIBlock).y.b, MusicPlaybackLaunchContext.Fb(uIBlock.b).Cb(uIBlock.p.h()));
                        break;
                    }
                }
                break;
            case 3:
                int i2 = BrushesPanel.j;
                ((BrushesPanel) obj).b(BrushesPanel.BrushType.Marker);
                break;
            case 4:
                ((com.vk.im.channelcreation.impl.h) obj).O(g.c.b);
                break;
            case 5:
                ((izs) obj).invoke(view);
                break;
            case 6:
                h5o h5oVar = (h5o) obj;
                DonutPostClickSource donutPostClickSource = DonutPostClickSource.Background;
                j5o j5oVar = (j5o) h5oVar.C;
                if (j5oVar != null) {
                    j1o.a(h5oVar, h5oVar.itemView.getContext(), j5oVar.l, (p4r) h5oVar.F.getValue(), donutPostClickSource);
                    break;
                }
                break;
            case 7:
                u4q u4qVar = (u4q) obj;
                otu0 un = u4qVar.un();
                Context requireContext = u4qVar.requireContext();
                SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.REGISTRATION_EXISTENT_ACCOUNT;
                un.getClass();
                otu0.b(requireContext, schemeStatSak$EventScreen);
                break;
            case 8:
                int i3 = FeedDigestHeader.n;
                ((FeedDigestHeader.a.b) ((FeedDigestHeader.a) obj)).a.invoke();
                break;
            case 9:
                ogw ogwVar = (ogw) obj;
                ogwVar.c.a(ogwVar.d.getText().toString());
                break;
            case 10:
                ((kmy) obj).G6(view);
                break;
            case 11:
                ((qg20) obj).m.H();
                break;
            case 12:
                nw20 nw20Var = (nw20) obj;
                gzs<s3q0> gzsVar = nw20Var.Y0;
                if (gzsVar == null) {
                    nw20Var.cancel();
                    break;
                } else {
                    gzsVar.invoke();
                    break;
                }
            case 13:
                dw20 dw20Var = ((uq40) obj).a;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                    break;
                }
                break;
            case 14:
                g2v.d().a().h(((ProfileGiftsFragment) obj).requireContext());
                break;
            case 15:
                int i4 = StorySettingsActivity.P;
                new StoriesFilterListFragment.a().k((StorySettingsActivity) obj);
                break;
            case 16:
                r5q0 r5q0Var = (r5q0) obj;
                int i5 = r5q0.f1;
                Bundle arguments = r5q0Var.getArguments();
                if (arguments != null ? arguments.getBoolean("returnByResult") : false) {
                    r5q0Var.getParentFragmentManager().k0(yfb.b(new Pair("returnByResult", Boolean.TRUE)), "fragmentResult");
                } else {
                    b7u0 k = g2v.c().k();
                    Context requireContext2 = r5q0Var.requireContext();
                    Bundle arguments2 = r5q0Var.getArguments();
                    if (arguments2 == null || (str = arguments2.getString("url")) == null) {
                        str = "";
                    }
                    k.p(requireContext2, str, r5q0Var.Yn());
                }
                r5q0Var.hide();
                break;
            default:
                VideoShortActions videoShortActions = (VideoShortActions) obj;
                boolean isChecked = videoShortActions.v.isChecked();
                videoShortActions.P4(isChecked);
                VideoShortActions.a aVar = videoShortActions.t;
                if (aVar != null) {
                    aVar.o(isChecked);
                    break;
                }
                break;
        }
    }
}
