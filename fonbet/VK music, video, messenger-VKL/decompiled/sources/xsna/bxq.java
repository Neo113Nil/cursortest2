package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.RadioButton;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.facebook.soloader.MinElf;
import com.mbridge.msdk.config.dynamic.baseview.cusview.FeedBackLinerLayout;
import com.vk.dto.user.UserProfile;
import com.vk.poll.fragments.PollUserListFragment;
import com.vk.stories.design.view.viewer.reactions.StoryMainReactionButton;
import com.vk.stories.design.view.viewer.reactions.StoryReactionViewGroup;
import java.util.Iterator;
import java.util.List;
import one.video.controls20.SimpleControlsView;
import one.video.player.OneVideoPlayer;
import xsna.o0r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class bxq implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bxq(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                ((FeedBackLinerLayout) this.c).a((RadioButton) this.d, view);
                break;
            case 1:
                com.vk.newsfeed.common.recycler.holders.e eVar = (com.vk.newsfeed.common.recycler.holders.e) this.c;
                AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) this.d;
                Iterator it = eVar.t.a.iterator();
                while (it.hasNext()) {
                    AppCompatRadioButton appCompatRadioButton2 = (AppCompatRadioButton) it.next();
                    appCompatRadioButton2.setChecked(epx.f(appCompatRadioButton2, appCompatRadioButton));
                }
                break;
            case 2:
                xwk.e().m(((PollUserListFragment) this.c).kn(), ((UserProfile) this.d).c, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                break;
            case 3:
                SimpleControlsView simpleControlsView = (SimpleControlsView) this.c;
                Context context = (Context) this.d;
                OneVideoPlayer oneVideoPlayer = simpleControlsView.x;
                if (oneVideoPlayer != null) {
                    final srm srmVar = simpleControlsView.F;
                    final SimpleControlsView.i iVar = simpleControlsView.w;
                    boolean z = simpleControlsView.O;
                    SimpleControlsView.j jVar = simpleControlsView.P;
                    List<? extends p2j0> list = simpleControlsView.J;
                    if (srmVar.a == null) {
                        n1j0 n1j0Var = new n1j0(context, oneVideoPlayer, z, jVar, list);
                        n1j0Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xsna.qrm
                            @Override // android.content.DialogInterface.OnShowListener
                            public final void onShow(DialogInterface dialogInterface) {
                                ngm.this.a();
                            }
                        });
                        n1j0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: xsna.rrm
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                srm.this.a = null;
                                iVar.onDismiss();
                            }
                        });
                        n1j0Var.show();
                        srmVar.a = n1j0Var;
                        break;
                    }
                }
                break;
            case 4:
                pbl0 pbl0Var = (pbl0) this.c;
                val0 val0Var = ((wbl0) this.d).l;
                if (val0Var == null) {
                    val0Var = null;
                }
                pbl0Var.c(val0Var.b);
                break;
            default:
                StoryReactionViewGroup storyReactionViewGroup = (StoryReactionViewGroup) this.c;
                StoryMainReactionButton storyMainReactionButton = (StoryMainReactionButton) this.d;
                if (storyReactionViewGroup.h) {
                    storyReactionViewGroup.d();
                }
                wzs<? super y0f0, ? super Boolean, s3q0> wzsVar = storyReactionViewGroup.p;
                if (wzsVar != null) {
                    wzsVar.invoke(storyMainReactionButton.getCurrentReactionItem(), Boolean.FALSE);
                    break;
                }
                break;
        }
    }
}
