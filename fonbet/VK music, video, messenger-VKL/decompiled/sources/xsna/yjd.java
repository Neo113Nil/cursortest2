package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder;
import com.vkontakte.android.attachments.VideoAttachment;
import kotlin.NoWhenBranchMatchedException;
import xsna.toz;
import xsna.tps0;

/* compiled from: ClipsBlockItemHolderBase.kt */
/* loaded from: classes4.dex */
public class yjd extends BaseVideoAutoPlayHolder<z1c0, VideoAttachment> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yjd(ViewGroup viewGroup, tps0 tps0Var, sps0 sps0Var, s0t0 s0t0Var, boolean z, boolean z2, boolean z3) {
        super(r3, viewGroup, tps0Var, sps0Var, s0t0Var);
        View view;
        View zjdVar = new zjd(viewGroup.getContext(), z, z2, z3);
        if (tps0Var instanceof tps0.a) {
            view = zjdVar;
        } else {
            if (!(tps0Var instanceof tps0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            ViewGroup frameLayout = new FrameLayout(zjdVar.getContext());
            frameLayout.setId(View.generateViewId());
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            frameLayout.addView(zjdVar);
            view = frameLayout;
        }
    }

    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder
    public com.vk.libvideo.autoplay.a k7() {
        return com.vk.libvideo.autoplay.a.a(super.k7(), null, null, SubtitlesConfigurationMode.ALWAYS_DISABLED, new toz.a(), null, null, 511999);
    }
}
