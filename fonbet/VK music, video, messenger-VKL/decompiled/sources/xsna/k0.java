package xsna;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.Aa;
import com.ironsource.Be;
import com.ironsource.C4498pe;
import com.ironsource.Ce;
import com.ironsource.InterfaceC4569te;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.filter.ImageQuality;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.embedded_players.youtube.PlayerConstants$PlayerState;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import xsna.a9q0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Aa.a((Aa) this.c, (LevelPlayBannerAdViewListener) this.d);
                return;
            case 1:
                Be.a((Be) this.c, (C4498pe) this.d);
                return;
            case 2:
                Ce.a((InterfaceC4569te) this.c, (IronSourceError) this.d);
                return;
            case 3:
                d3m.e((VkButton) this.c, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 1000L, (r15 & 4) != 0 ? null : new mf3((cys) this.d, 7), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
                return;
            case 4:
                ((FrameLayout) this.c).addView((View) this.d);
                return;
            case 5:
                ((androidx.recyclerview.widget.o0) this.c).attachToRecyclerView((RecyclerView) this.d);
                return;
            case 6:
                ((ar60) this.c).i((sq60) this.d);
                return;
            case 7:
                qi80 qi80Var = (qi80) this.c;
                String str = (String) this.d;
                synchronized (qi80Var.b) {
                    m9r m9rVar = qi80Var.a;
                    FileOutputStream fileOutputStream = qi80Var.f;
                    m9rVar.getClass();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.write(str.getBytes(Charset.forName(C.UTF8_NAME)));
                        } catch (Throwable unused) {
                        }
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.flush();
                    }
                    s3q0 s3q0Var = s3q0.a;
                }
                return;
            case 8:
                ((yn3) this.c).onClick((View) this.d);
                return;
            case 9:
                PostponedPostsFragment postponedPostsFragment = (PostponedPostsFragment) this.c;
                sq60 sq60Var = (sq60) this.d;
                qcy<Object>[] qcyVarArr = PostponedPostsFragment.q0;
                if (!postponedPostsFragment.eo().a().A0(sq60Var.a)) {
                    postponedPostsFragment.o0.d(sq60Var, (tc60) postponedPostsFragment.eo().a.U.getValue(), postponedPostsFragment.n0.get());
                }
                postponedPostsFragment.eo().b().l();
                return;
            case 10:
                ReactionsFeedFragment reactionsFeedFragment = (ReactionsFeedFragment) this.c;
                sq60 sq60Var2 = (sq60) this.d;
                qcy<Object>[] qcyVarArr2 = ReactionsFeedFragment.q0;
                a9q0 a9q0Var = sq60Var2.h;
                if ((a9q0Var instanceof a9q0.b) || (a9q0Var instanceof a9q0.a) || (a9q0Var instanceof a9q0.c) || (a9q0Var instanceof a9q0.d)) {
                    bs60.b(reactionsFeedFragment.eo().b());
                    reactionsFeedFragment.eo().b().c();
                }
                reactionsFeedFragment.o0.d(sq60Var2, (tc60) reactionsFeedFragment.eo().a.U.getValue(), reactionsFeedFragment.go().get());
                reactionsFeedFragment.eo().b().l();
                return;
            case 11:
                jxl0 jxl0Var = (jxl0) this.c;
                StoryEntry storyEntry = ((z2m0) this.d).a;
                VKImageView vKImageView = jxl0Var.o;
                vKImageView.load(storyEntry.Jb(vKImageView.getWidth(), ImageQuality.FIT, false));
                return;
            case 12:
                com.vk.attachpicker.screen.q qVar = (com.vk.attachpicker.screen.q) this.c;
                MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) this.d;
                com.vk.attachpicker.screen.p pVar = qVar.b;
                pVar.j.a(pVar.d());
                pVar.I(true);
                pVar.S.B(new ic3(pVar, 12));
                pVar.G.c(mediaStoreEntry);
                pVar.S.X(pVar.z);
                return;
            case 13:
                r5y0 r5y0Var = (r5y0) this.c;
                r5y0Var.a.b((PlayerConstants$PlayerState) this.d);
                return;
            default:
                yads.w12.a((yads.w12) this.c, (yads.w32) this.d);
                return;
        }
    }
}
