package xsna;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.auth.validation.b;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.Source;
import com.vk.dto.common.VideoFile;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.im.engine.models.users.UserStorageModel;
import com.vk.libvideo.embedded_players.ui.fragments.VideoEmbedFragment;
import com.vk.libvideo.live.impl.fragment.VideoLiveFragment;
import com.vk.libvideo.live.impl.views.liveswipe.LiveSwipeView;
import com.vk.messagetemplates.impl.details.TemplateDetailsState;
import com.vk.messagetemplates.impl.details.a;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.mediapicker.videovk.presentation.VkVideoPickerFragment;
import com.vk.stories.design.view.editor.PipetteColorPicker;
import com.vk.stories.design.view.viewer.reactions.StoryReactionViewGroup;
import com.vk.storycamera.picker.template.ui.StoryTemplateFragment;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;
import com.vk.video.ui.discovery.minimizable.growth.VideoGrowthButtons;
import com.vk.video.ui.smartcrop.api.router.SmartCropArguments;
import com.vk.video.ui.smartcrop.impl.presentation.fragment.SmartCropFragment;
import com.vk.video.ui.smartcrop.impl.presentation.fragment.SmartCropFragmentInternalComponent;
import com.vkontakte.android.R;
import java.io.File;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import xsna.ajw0;
import xsna.b3t0;
import xsna.c9t0;
import xsna.equ0;
import xsna.fmq0;
import xsna.gm50;
import xsna.h1o0;
import xsna.i8w0;
import xsna.k7t0;
import xsna.njm0;
import xsna.p7w0;
import xsna.qtk0;
import xsna.wq10;
import xsna.x9m0;
import xsna.yyb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ksg0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ksg0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v156, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        LiveSwipeView liveSwipeView;
        int i = this.b;
        int i2 = 11;
        int i3 = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                lsg0 lsg0Var = (lsg0) obj2;
                Boolean bool = (Boolean) obj;
                lsg0Var.d.l("start rustore in app update checking:" + bool);
                return bool.booleanValue() ? new io.reactivex.rxjava3.internal.operators.single.b(new did0(lsg0Var, 2)).q(io.reactivex.rxjava3.schedulers.a.b()) : io.reactivex.rxjava3.core.x.k(wrw.g);
            case 1:
                View view = (View) obj;
                View.OnClickListener onClickListener = ((r8j0) obj2).w;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                return s3q0.a;
            case 2:
                ((com.vk.sharing.core.view.l) obj2).setToggleFaveActionIsEnabled(true);
                return s3q0.a;
            case 3:
                File file = (File) obj2;
                uk10 c = ((zk10) obj).a().c(1);
                if (c == null || (str = c.a) == null) {
                    str = "";
                }
                return "name=\"" + drm0.n0(file.getName(), ".") + "__" + str + '\"';
            case 4:
                qcy<Object>[] qcyVarArr = SmartCropFragment.Q;
                final SmartCropFragmentInternalComponent smartCropFragmentInternalComponent = (SmartCropFragmentInternalComponent) ((SmartCropFragment) obj2).O.getValue();
                smartCropFragmentInternalComponent.getClass();
                return new cn50(up2.d(new q5g(i3, (gzs) obj), new wb0() { // from class: xsna.h4k0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.izs
                    /* renamed from: j */
                    public final qj50 invoke(sj50 sj50Var) {
                        SmartCropFragmentInternalComponent smartCropFragmentInternalComponent2 = SmartCropFragmentInternalComponent.this;
                        SmartCropArguments smartCropArguments = smartCropFragmentInternalComponent2.a.a;
                        nwy nwyVar = smartCropFragmentInternalComponent2.b;
                        qcy<Object>[] qcyVarArr2 = SmartCropFragmentInternalComponent.h;
                        qcy<Object> qcyVar = qcyVarArr2[0];
                        z4k0 z4k0Var = (z4k0) nwyVar.c();
                        nwy nwyVar2 = smartCropFragmentInternalComponent2.c;
                        qcy<Object> qcyVar2 = qcyVarArr2[1];
                        o1b0 o1b0Var = (o1b0) nwyVar2.c();
                        nwy nwyVar3 = smartCropFragmentInternalComponent2.d;
                        qcy<Object> qcyVar3 = qcyVarArr2[2];
                        return new w4k0(smartCropArguments, z4k0Var, o1b0Var, (com.vk.core.utils.newtork.b) nwyVar3.c(), sj50Var);
                    }
                }, new cm20() { // from class: xsna.i4k0
                    @Override // xsna.izs
                    /* renamed from: i */
                    public final rl50 invoke(sl50 sl50Var) {
                        return new e4k0(SmartCropFragmentInternalComponent.this.a.a, sl50Var);
                    }
                }));
            case 5:
                ((zak0) ((a9k0) obj2).f).setValue((String) obj);
                return s3q0.a;
            case 6:
                ((p9m0) obj2).T(new x9m0.a((List) obj));
                return s3q0.a;
            case 7:
                ebm0 ebm0Var = (ebm0) obj2;
                List<y0f0> list = (List) obj;
                ebm0Var.j = true;
                ebm0Var.k = list;
                StoryReactionViewGroup storyReactionViewGroup = ebm0Var.h;
                storyReactionViewGroup.setReactions(list);
                StoryEntry storyEntry = ebm0Var.e;
                y0f0 a = ebm0Var.a(storyEntry.g0);
                if (storyEntry.c0 && a == null) {
                    a = (y0f0) j5g.Y(ebm0Var.k);
                }
                storyReactionViewGroup.g(a, false, false);
                storyReactionViewGroup.setOnReactionsShowed(new qbc0(ebm0Var, 19));
                storyReactionViewGroup.setOnReactionsClosed(new gqh0(ebm0Var, 5));
                storyReactionViewGroup.setOnReactionSelected(new n9m0(ebm0Var, i3));
                storyReactionViewGroup.setOnLikeClicked(new dd4(ebm0Var, i2));
                storyReactionViewGroup.setVisibility(0);
                storyReactionViewGroup.animate().alpha(1.0f).setDuration(150L).start();
                return s3q0.a;
            case 8:
                int intValue = ((Integer) obj).intValue();
                ViewPager2 viewPager2 = ((mfm0) obj2).g;
                if (intValue != viewPager2.getCurrentItem()) {
                    viewPager2.e(intValue, true);
                }
                return s3q0.a;
            case 9:
                StoryTemplateFragment storyTemplateFragment = (StoryTemplateFragment) obj2;
                njm0 njm0Var = (njm0) obj;
                int i4 = StoryTemplateFragment.U;
                if (njm0Var instanceof njm0.b) {
                    h03.b(((njm0.b) njm0Var).a);
                } else {
                    if (!njm0Var.equals(njm0.a.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (storyTemplateFragment.mo2getContext() != null) {
                        maz.c(((qdz) storyTemplateFragment.R.getValue()).e(), bwt0.u(storyTemplateFragment.requireContext()), f870.v(InternalVkMiniApps.MEMORIES.h()), new LaunchContext(false, false, false, "PICKER_BANNER".toLowerCase(Locale.ROOT), null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108855), null, null, 24);
                    }
                }
                return s3q0.a;
            case 10:
                com.vk.superapp.ui.a aVar = (com.vk.superapp.ui.a) obj2;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) obj;
                io.reactivex.rxjava3.disposables.c cVar2 = aVar.q;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                aVar.q = cVar;
                return s3q0.a;
            case 11:
                ((f1o0) obj2).T(new h1o0.c.a());
                return s3q0.a;
            case 12:
                return TemplateDetailsState.a((TemplateDetailsState) obj, ((a.b) ((com.vk.messagetemplates.impl.details.a) obj2)).b, null, false, 13);
            case 13:
                cmo0 cmo0Var = (cmo0) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Size L = cmo0Var.e.L();
                if (L != null) {
                    ImageView imageView = cmo0Var.q;
                    if (imageView == null) {
                        imageView = null;
                    }
                    bwt0.n0(imageView, L);
                    PipetteColorPicker pipetteColorPicker = cmo0Var.p;
                    if (pipetteColorPicker == null) {
                        pipetteColorPicker = null;
                    }
                    bwt0.n0(pipetteColorPicker, L);
                }
                ImageView imageView2 = cmo0Var.q;
                if (imageView2 == null) {
                    imageView2 = null;
                }
                imageView2.setImageBitmap(bitmap);
                ImageView imageView3 = cmo0Var.q;
                if (imageView3 == null) {
                    imageView3 = null;
                }
                bwt0.p0(imageView3, true);
                PipetteColorPicker pipetteColorPicker2 = cmo0Var.p;
                if (pipetteColorPicker2 == null) {
                    pipetteColorPicker2 = null;
                }
                t2l0 t2l0Var = cmo0Var.f.i;
                int i5 = PipetteColorPicker.s;
                pipetteColorPicker2.d(bitmap, t2l0Var, null);
                PipetteColorPicker pipetteColorPicker3 = cmo0Var.p;
                bwt0.p0(pipetteColorPicker3 != null ? pipetteColorPicker3 : null, true);
                return s3q0.a;
            case 14:
                xtw xtwVar = (xtw) obj;
                int i6 = xtwVar.a;
                Photo photo = (Photo) xtwVar.b;
                String str2 = photo.Fb(0, false).d.d;
                if (drm0.N(str2)) {
                    str2 = null;
                }
                if (str2 == null) {
                    return null;
                }
                return new fmq0.a(i6, photo, str2);
            case 15:
                return UserStorageModel.zb((UserStorageModel) obj, (Long) obj2, null, null, null, null, null, 0, -3);
            case 16:
                oor0 oor0Var = ((ror0) obj2).e;
                if (oor0Var != null) {
                    oor0Var.v1();
                }
                return s3q0.a;
            case 17:
                lqr0 lqr0Var = (lqr0) obj2;
                jj0 jj0Var = lqr0Var.l;
                yyb.a aVar2 = lqr0Var.w;
                jj0Var.u((aVar2 != null ? aVar2 : null).c());
                return s3q0.a;
            case 18:
                mcs0 mcs0Var = (mcs0) obj2;
                mcs0Var.f = 0;
                mcs0Var.i.r(true);
                return s3q0.a;
            case 19:
                int i7 = VideoEmbedFragment.q0;
                cvk.w(((VideoEmbedFragment) obj2).requireContext().getString(R.string.error), false);
                return s3q0.a;
            case 20:
                VideoGrowthButtons videoGrowthButtons = (VideoGrowthButtons) obj2;
                VideoGrowthButtons.a aVar3 = videoGrowthButtons.b;
                if (aVar3 != null) {
                    aVar3.onClose();
                }
                LinearLayout linearLayout = videoGrowthButtons.c;
                if (linearLayout != null) {
                    d3m.e(linearLayout, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                }
                return s3q0.a;
            case 21:
                VideoLiveFragment videoLiveFragment = (VideoLiveFragment) obj2;
                VideoLiveFragment.a aVar4 = videoLiveFragment.O;
                if (aVar4 != null && (liveSwipeView = aVar4.a) != null) {
                    VideoFile videoFile = videoLiveFragment.b0;
                    liveSwipeView.f(videoFile != null ? videoFile.r1() : null);
                }
                return s3q0.a;
            case 22:
                gzs gzsVar = (gzs) obj2;
                int i8 = VideoNewProfileHeaderViewV2.y;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 23:
                o9t0 o9t0Var = (o9t0) obj2;
                c9t0 c9t0Var = (c9t0) obj;
                if (c9t0Var instanceof c9t0.a) {
                    return k7t0.a.a;
                }
                if (!(c9t0Var instanceof c9t0.e)) {
                    return k7t0.b.a;
                }
                qtk0<u490> qtk0Var = ((c9t0.e) c9t0Var).e;
                return qtk0Var instanceof qtk0.a ? new k7t0.d(((u490) ((qtk0.a) qtk0Var).a).a.b, o9t0Var.c) : k7t0.c.a;
            case 24:
                equ0 equ0Var = (equ0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    gqu0 gqu0Var = equ0Var.n;
                    if (gqu0Var == null) {
                        gqu0Var = null;
                    }
                    s5o s5oVar = gqu0Var.h;
                    if (s5oVar != null) {
                        s5oVar.e = true;
                        s5oVar.invalidateSelf();
                    }
                    equ0.c cVar3 = new equ0.c(1, equ0Var, equ0.class, "showNewContactsHintIfNeeded", "showNewContactsHintIfNeeded(Ljava/util/Collection;)V", 0);
                    io.reactivex.rxjava3.internal.operators.single.c C = equ0Var.i.C(equ0Var, new com.vk.im.engine.commands.contacts.a(Source.CACHE, r3, 14));
                    asu0 asu0Var = asu0.a;
                    equ0Var.I0(io.reactivex.rxjava3.kotlin.c.e(C.q(asu0Var.c()).m(asu0Var.d()), new jvl0(i2), new n3b0(cVar3, 26)));
                } else {
                    equ0Var.i.D(equ0Var, new puu());
                    gqu0 gqu0Var2 = equ0Var.n;
                    s5o s5oVar2 = (gqu0Var2 != null ? gqu0Var2 : null).h;
                    if (s5oVar2 != null) {
                        s5oVar2.e = false;
                        s5oVar2.invalidateSelf();
                    }
                }
                return s3q0.a;
            case 25:
                ((b.a) obj2).dispose();
                return s3q0.a;
            case 26:
                VkVideoPickerFragment vkVideoPickerFragment = (VkVideoPickerFragment) obj2;
                b3t0 b3t0Var = (b3t0) obj;
                if (b3t0Var instanceof b3t0.c.a) {
                    f3t0 f3t0Var = vkVideoPickerFragment.R;
                    if (f3t0Var != null) {
                        ((b3t0.c.a) b3t0Var).a.a(f3t0Var.d, new gf90(30, 50));
                    }
                } else {
                    int i9 = VkVideoPickerFragment.V;
                    if (b3t0Var instanceof b3t0.a) {
                        efc0 efc0Var = ((q2t0) vkVideoPickerFragment.S.getValue()).c;
                        if (efc0Var != null) {
                            efc0Var.i.a(new wci0(new wq10.c(null), false));
                        }
                    } else {
                        if (!(b3t0Var instanceof b3t0.b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        b3t0.b.a aVar5 = (b3t0.b.a) b3t0Var;
                        efc0 fo = vkVideoPickerFragment.fo();
                        if (fo != null) {
                            fo.C(new PostingAction.Navigation.OpenVkVideoViewer(aVar5.a));
                        }
                    }
                }
                return s3q0.a;
            case 27:
                Throwable th = (Throwable) obj;
                ((m6w0) obj2).T(new p7w0.f.a(th));
                h03.b(th);
                return s3q0.a;
            case 28:
                e8w0 e8w0Var = (e8w0) obj2;
                bwt0.p0(e8w0Var.n, true);
                bwt0.p0(e8w0Var.o, false);
                gm50.a.a(e8w0Var, ((i8w0.c) obj).a, new n3b0(e8w0Var, 28));
                e8w0Var.t.a(false);
                f4m.v(0, e8w0Var.m);
                return s3q0.a;
            default:
                zhw0 zhw0Var = (zhw0) obj2;
                zhw0Var.T((iiw0) obj);
                zhw0Var.l.b(ajw0.c.a);
                return s3q0.a;
        }
    }
}
