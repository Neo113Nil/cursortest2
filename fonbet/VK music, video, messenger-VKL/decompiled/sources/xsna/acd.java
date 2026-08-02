package xsna;

import android.view.LayoutInflater;
import android.widget.TextView;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.core.view.components.picture.VkImage;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.tracker.VideoSimilarAnalytics;
import com.vk.lists.ListDataSet;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.stories.design.view.polls.VoteProgressButton;
import com.vkontakte.android.R;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ClipSearchRootVh.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class acd extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ acd(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [com.vk.core.fragments.FragmentImpl, xsna.d9c0] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ClipSearchRootVh clipSearchRootVh = (ClipSearchRootVh) this.receiver;
                clipSearchRootVh.getClass();
                vtk0.d().d(clipSearchRootVh.R(), new zbd(clipSearchRootVh));
                break;
            case 1:
                kbx kbxVar = (kbx) this.receiver;
                int i = kbx.j;
                kbxVar.setOrientation(1);
                LayoutInflater.from(kbxVar.getContext()).inflate(R.layout.interactive_opinion_view, kbxVar);
                kbxVar.f = (TextView) kbxVar.findViewById(R.id.title);
                kbxVar.g = (VoteProgressButton) kbxVar.findViewById(R.id.buttonSend);
                kbxVar.h = (VkInputSelect) kbxVar.findViewById(R.id.editText);
                kbxVar.i = (TextView) kbxVar.findViewById(R.id.privacyFooter);
                VoteProgressButton voteProgressButton = kbxVar.g;
                if (voteProgressButton != null) {
                    voteProgressButton.setText(kbxVar.getContext().getString(R.string.send));
                }
                VoteProgressButton voteProgressButton2 = kbxVar.g;
                if (voteProgressButton2 != null) {
                    bwt0.i0(voteProgressButton2, new eqd(kbxVar, 29));
                }
                TextView textView = kbxVar.i;
                if (textView != null) {
                    bwt0.i0(textView, new h6g(kbxVar, 25));
                }
                VkInputSelect vkInputSelect = kbxVar.h;
                if (vkInputSelect != null) {
                    vkInputSelect.b(new lbx(kbxVar));
                }
                break;
            case 2:
                ((PodcastEpisodeFragment) this.receiver).finish();
                break;
            case 3:
                zvd0 zvd0Var = (zvd0) this.receiver;
                int i2 = zvd0.r;
                new cdo(zvd0Var.itemView.getContext(), new jn2(zvd0Var, 3), new e07(zvd0Var, 5)).c();
                break;
            case 4:
                ((uzh0) this.receiver).s();
                break;
            case 5:
                VideoCatalogRootVh videoCatalogRootVh = (VideoCatalogRootVh) this.receiver;
                int i3 = VideoCatalogRootVh.M0;
                videoCatalogRootVh.q0(false);
                VkImage vkImage = videoCatalogRootVh.j0.f;
                if (vkImage != null) {
                    vkImage.setVisibility(8);
                }
                break;
            case 6:
                v5t0 v5t0Var = ((gcs0) this.receiver).o0;
                ListDataSet<u1c0> listDataSet = v5t0Var.G;
                ListDataSet.ArrayListImpl<u1c0> arrayListImpl = listDataSet.d;
                if (!arrayListImpl.isEmpty()) {
                    Iterator<u1c0> it = arrayListImpl.iterator();
                    while (it.hasNext()) {
                        if (it.next().c == 1120) {
                            v5t0Var.b.Ae();
                            break;
                        }
                    }
                }
                NewsEntry newsEntry = v5t0Var.l;
                if (newsEntry != null) {
                    listDataSet.s(new u1c0(newsEntry, newsEntry, 1120));
                    v5t0Var.b.Ae();
                }
            default:
                coj0 coj0Var = (coj0) this.receiver;
                coj0Var.getClass();
                coj0Var.d = VideoSimilarAnalytics.EventSource.BUTTON;
                coj0Var.e = false;
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acd(Object obj) {
        super(0, obj, PodcastEpisodeFragment.class, "finish", "finish()V", 0);
        this.b = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acd(coj0 coj0Var) {
        super(0, coj0Var, coj0.class, "onButtonOpenStarted", "onButtonOpenStarted()V", 0);
        this.b = 7;
    }
}
