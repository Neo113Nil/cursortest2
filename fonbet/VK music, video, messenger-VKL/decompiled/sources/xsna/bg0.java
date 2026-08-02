package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.vk.attachpicker.fragment.MediaPickerFragmentImpl;
import com.vk.clips.sdk.shared.item.static_ads.events.StaticAdsItemViewEvent;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.right.VkCellRight;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.poll.fragments.PollViewerFragment;
import com.vk.posting.presentation.video.search.a;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors;
import java.util.ArrayList;
import xsna.xn50;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class bg0 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bg0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Post post;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                kbe kbeVar = ((dg0) obj).a().c;
                if (kbeVar != null) {
                    kbeVar.invoke();
                    break;
                }
                break;
            case 1:
                ib6 ib6Var = (ib6) obj;
                T t = ib6Var.m;
                ViewGroup viewGroup = ib6Var.z;
                TextView textView = ib6Var.A;
                NewsComment newsComment = t instanceof NewsComment ? (NewsComment) t : null;
                if (newsComment != null) {
                    int height = textView.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = height;
                    }
                    newsComment.Bb(newsComment.b, false);
                    textView.setText(ib6Var.o.mb(newsComment.i, newsComment.X3()));
                    textView.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                    ValueAnimator ofInt = ValueAnimator.ofInt(height, textView.getMeasuredHeight());
                    ofInt.addUpdateListener(new hb6(ib6Var, 0));
                    ofInt.setDuration(250L);
                    ofInt.start();
                    break;
                }
                break;
            case 2:
                ((eoa) obj).b.invoke();
                break;
            case 3:
                ((w9b) obj).s(zxd0.b.a);
                break;
            case 4:
                paj pajVar = (paj) obj;
                t8j t8jVar = pajVar.B;
                i8j i8jVar = pajVar.l;
                if (!(t8jVar == null ? null : t8jVar).g) {
                    if (!(t8jVar == null ? null : t8jVar).f) {
                        i8jVar.c(t8jVar != null ? t8jVar : null);
                        break;
                    } else {
                        i8jVar.h(t8jVar != null ? t8jVar : null);
                        break;
                    }
                }
                break;
            case 5:
                ((vz00) obj).c7();
                break;
            case 6:
                MediaPickerFragmentImpl mediaPickerFragmentImpl = (MediaPickerFragmentImpl) obj;
                int i2 = MediaPickerFragmentImpl.W0;
                FragmentActivity kn = mediaPickerFragmentImpl.kn();
                ArrayList b = mediaPickerFragmentImpl.Q.b();
                t4t t4tVar = mediaPickerFragmentImpl.R;
                if (r34.a(kn, b, t4tVar.d, t4tVar.e)) {
                    mediaPickerFragmentImpl.T0.b(mediaPickerFragmentImpl.Q.w());
                    mediaPickerFragmentImpl.oo();
                    break;
                }
                break;
            case 7:
                gzs<s3q0> gzsVar = ((ev20) obj).e;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 8:
                ((izs) obj).invoke(view);
                break;
            case 9:
                u340 u340Var = (u340) obj;
                u340Var.n.a();
                u340Var.o.a();
                break;
            case 10:
                ((li70) obj).d("cell");
                break;
            case 11:
                int i3 = PollViewerFragment.d0;
                FragmentActivity activity = ((PollViewerFragment) obj).getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                    break;
                }
                break;
            case 12:
                d1c0 d1c0Var = (d1c0) obj;
                if (!jjc.b() && (post = (Post) d1c0Var.q6()) != null) {
                    d1c0Var.b7(post, MobileOfficialAppsFeedStat$TypeFeedViewRepostedItemAuthors.EntryPoint.FROM_COMBO_AVATAR);
                    break;
                }
                break;
            case 13:
                xn50.a.c(((com.vk.posting.presentation.video.search.g) obj).c, a.AbstractC1542a.C1543a.b);
                break;
            case 14:
                ((zvk0) obj).b.a(StaticAdsItemViewEvent.g.b);
                break;
            case 15:
                int i4 = VkCellRight.z;
                gzs<s3q0> gzsVar2 = ((VkCell.Right.ExtraAction.d) obj).a;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                    break;
                }
                break;
            default:
                yads.rb.a((yads.rb) obj, view);
                break;
        }
    }
}
