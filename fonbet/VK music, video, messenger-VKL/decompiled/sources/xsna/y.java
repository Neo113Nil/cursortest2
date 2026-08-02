package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.Aa;
import com.ironsource.C4637xa;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.movika.impl.view.full.tooltip.TooltipOverlay;
import com.vk.reefton.ReefEvent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import one.video.player.error.OneVideoPlaybackException;
import ru.ok.gleffects.impl.EffectNativeSink;
import xsna.ixm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                Aa.a((Aa) obj2, (C4637xa) obj);
                break;
            case 1:
                ((dz3) obj2).b.a.a(new ReefEvent.g((OneVideoPlaybackException) obj));
                break;
            case 2:
                ChannelFragment channelFragment = (ChannelFragment) obj2;
                StoryEntry storyEntry = (StoryEntry) obj;
                int i2 = ChannelFragment.a1;
                if (channelFragment.isAdded()) {
                    channelFragment.vo().a(R.string.vkim_channel_story_published, new d7k0(R.string.vkim_channel_open_story, new oh3(5, channelFragment, storyEntry)));
                    break;
                }
                break;
            case 3:
                com.vk.clips.upload.vk.impl.uploader.f fVar = (com.vk.clips.upload.vk.impl.uploader.f) obj2;
                fVar.i.set(null);
                fVar.d.onError((Throwable) obj);
                break;
            case 4:
                ((ixm.a) obj2).a((gzs) obj);
                break;
            case 5:
                ((EffectNativeSink) obj2).lambda$onNewMessage$7((String) obj);
                break;
            case 6:
                ArrayList arrayList = (ArrayList) obj2;
                l8n0 l8n0Var = (l8n0) obj;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    RecyclerView.e0 e0Var = (RecyclerView.e0) it.next();
                    boolean J = l8n0.J(e0Var);
                    ArrayList<RecyclerView.e0> arrayList2 = l8n0Var.o;
                    if (J) {
                        long j = l8n0Var.s / 2;
                        View view = e0Var.itemView;
                        ViewPropertyAnimator animate = view.animate();
                        arrayList2.add(e0Var);
                        animate.setDuration(j).setStartDelay(0L).alpha(1.0f).setListener(new n8n0(view, animate, e0Var, l8n0Var)).start();
                    } else if (l8n0.K(e0Var)) {
                        View view2 = e0Var.itemView;
                        ViewPropertyAnimator animate2 = view2.animate();
                        arrayList2.add(e0Var);
                        animate2.alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(l8n0Var.c).setStartDelay(0L).setListener(new u8n0(view2, animate2, e0Var, l8n0Var)).start();
                    } else {
                        View view3 = e0Var.itemView;
                        ViewPropertyAnimator animate3 = view3.animate();
                        arrayList2.add(e0Var);
                        animate3.alpha(1.0f).setDuration(l8n0Var.c).setListener(new m8n0(view3, animate3, e0Var, l8n0Var)).start();
                    }
                }
                arrayList.clear();
                l8n0Var.l.remove(arrayList);
                break;
            case 7:
                Toast.makeText((Context) obj, (CharSequence) obj2, 0).show();
                break;
            default:
                TooltipOverlay.a aVar = (TooltipOverlay.a) obj;
                int i3 = TooltipOverlay.f;
                ((TooltipOverlay) obj2).removeView(aVar.a);
                aVar.d.invoke();
                break;
        }
    }
}
