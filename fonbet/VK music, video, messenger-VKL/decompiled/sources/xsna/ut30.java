package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.api.generated.multiaccount.dto.MultiaccountCheckRelatedUserPinCodeResponseDto;
import com.vk.attachpicker.stickers.StickersRecyclerView;
import com.vk.attachpicker.stickers.post.attach.StoryAttachImageView;
import com.vk.bridges.ImageViewer;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.DialogBackground;
import com.vk.dto.common.data.VKFromList;
import com.vk.dto.common.data.VKList;
import com.vk.dto.group.GroupSuggestion;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.reviews.model.sort.ReviewsSort;
import com.vk.editor.analytics.StoryEditorEvents;
import com.vk.feed.settings.impl.presentation.filtered.c;
import com.vk.feed.settings.impl.presentation.filtered.e;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.im.ui.components.chat_profile.interactors.UserProfileAvatarsInteractor;
import com.vk.im.ui.components.theme_chooser.ThemeChooserState;
import com.vk.log.L;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixCategory;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixOption;
import com.vk.music.playerservice.api.a;
import com.vk.reefton.Reef;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.StoryStatisticsViewersViewState;
import com.vk.stories.design.view.stickers.selection.SelectionStickerView;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.voip.ui.broadcast.fragments.info.StreamInfoFragment;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import xsna.atb0;
import xsna.e890;
import xsna.f6e0;
import xsna.gm50;
import xsna.gpu;
import xsna.hh8;
import xsna.msf0;
import xsna.tj50;
import xsna.vos;
import xsna.wrc0;
import xsna.yo60;
import xsna.z6x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ut30 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ut30(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        pk30 pk30Var;
        AtomicLong atomicLong;
        AtomicLong atomicLong2;
        ReviewsSort reviewsSort;
        uvf<Bitmap> b;
        Bitmap createBitmap;
        tj8 tj8Var;
        hh8 b2;
        nt80<dfw0> nt80Var;
        boolean z = false;
        r3 = null;
        r3 = null;
        r3 = null;
        dfw0 dfw0Var = null;
        switch (this.b) {
            case 0:
                xt30 xt30Var = (xt30) this.c;
                yt30 yt30Var = xt30Var.D;
                Parcelable parcelable = yt30Var != null ? yt30Var.G : null;
                AttachStory attachStory = parcelable instanceof AttachStory ? (AttachStory) parcelable : null;
                if (attachStory != null && (pk30Var = xt30Var.E) != null) {
                    pk30Var.F(attachStory.b);
                }
                return s3q0.a;
            case 1:
                ((u76) this.c).o5().i((StoryEditorEvents) obj);
                return s3q0.a;
            case 2:
                p250 p250Var = (p250) this.c;
                int i = p250.j1;
                yzt0<c6e0> yzt0Var = ((f6e0.a) obj).a;
                y5e0 y5e0Var = p250Var.i1;
                gm50.a.a(p250Var, yzt0Var, new bee(1, y5e0Var == null ? null : y5e0Var, y5e0.class, "render", "render(Lcom/vk/music/bottomsheets/promo/presentation/PromoState;)V", 0, 3));
                return s3q0.a;
            case 3:
                e4v0 e4v0Var = (e4v0) this.c;
                int i2 = 0;
                for (Object obj2 : e4v0Var.f.entrySet()) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    MixCategory mixCategory = (MixCategory) ((Map.Entry) obj2).getValue();
                    if (!mixCategory.d().isEmpty()) {
                        Iterator it = mixCategory.e.iterator();
                        while (it.hasNext()) {
                            ((MixOption) it.next()).f = false;
                        }
                        e4v0Var.notifyItemChanged(i2, new a3j0("", false, true));
                    }
                    i2 = i3;
                }
                e4v0Var.x0();
                return s3q0.a;
            case 4:
                vos.b bVar = (vos.b) this.c;
                VKFromList vKFromList = new VKFromList(bVar.a.i());
                vKFromList.addAll((List) obj);
                return new ass(vKFromList, bVar.b);
            case 5:
                View view = (View) obj;
                cjx cjxVar = ((vq50) this.c).E;
                (cjxVar != null ? cjxVar : null).p(view, "DEFAULT");
                return s3q0.a;
            case 6:
                com.vk.feed.settings.impl.presentation.filtered.b bVar2 = (com.vk.feed.settings.impl.presentation.filtered.b) this.c;
                bVar2.T(c.a.b);
                bVar2.g.b(e.a.C1059a.a);
                return s3q0.a;
            case 7:
                ((e890.a) this.c).c = true;
                return s3q0.a;
            case 8:
                ((a.b) this.c).a((kza0) obj);
                return s3q0.a;
            case 9:
                atb0.a.C2570a c2570a = (atb0.a.C2570a) obj;
                zsb0 zsb0Var = ((msb0) this.c).i1;
                zsb0 zsb0Var2 = zsb0Var != null ? zsb0Var : null;
                int i4 = c2570a.a;
                VkButton.Appearance appearance = c2570a.c;
                VkButton.Mode mode = c2570a.b;
                boolean z2 = c2570a.d;
                VkButton vkButton = zsb0Var2.p;
                vkButton.setMode(mode);
                vkButton.setAppearance(appearance);
                vkButton.setText(i4);
                vkButton.setEnabled(z2);
                return s3q0.a;
            case 10:
                ((isc0) this.c).c(new wrc0.a(new yo60.g.a((Throwable) obj)));
                return s3q0.a;
            case 11:
                ((rzq0) obj).b(j5g.H0(((lkd0) this.c).d, 3), q7o.c);
                return s3q0.a;
            case 12:
                GroupSuggestion groupSuggestion = (GroupSuggestion) this.c;
                gpu gpuVar = (gpu) obj;
                if ((gpuVar instanceof gpu.a) && epx.f(((gpu.a) gpuVar).a.b.c, groupSuggestion.b.c)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                anf0 anf0Var = (anf0) this.c;
                vof0 vof0Var = (vof0) obj;
                int i5 = anf0Var.j.get();
                anf0Var.c.getClass();
                if (i5 >= 15) {
                    AtomicInteger atomicInteger = Reef.i;
                    com.vk.reefton.c cVar = Reef.j;
                    if (cVar != null && (atomicLong2 = cVar.c) != null) {
                        atomicLong2.incrementAndGet();
                    }
                } else {
                    anf0Var.j.incrementAndGet();
                    anf0Var.h.onNext(vof0Var);
                    AtomicInteger atomicInteger2 = Reef.i;
                    com.vk.reefton.c cVar2 = Reef.j;
                    if (cVar2 != null && (atomicLong = cVar2.b) != null) {
                        atomicLong.incrementAndGet();
                    }
                }
                return s3q0.a;
            case 14:
                nsf0 nsf0Var = (nsf0) this.c;
                if (((MultiaccountCheckRelatedUserPinCodeResponseDto) obj).d()) {
                    nsf0Var.C(msf0.d.b);
                } else {
                    nsf0Var.C(msf0.e.b);
                }
                return s3q0.a;
            case 15:
                ejg0 ejg0Var = (ejg0) this.c;
                efk0 efk0Var = ejg0Var.n;
                if (efk0Var != null && (reviewsSort = efk0Var.b) != null) {
                    ejg0Var.l.a(new dhg0(reviewsSort));
                }
                return s3q0.a;
            case 16:
                return ((SelectionStickerView) this.c).w0((StickersRecyclerView) obj);
            case 17:
                Throwable th = (Throwable) obj;
                if (((x9j0) this.c).f() != null) {
                    zk70.e(th);
                }
                return s3q0.a;
            case 18:
                s3l0 s3l0Var = (s3l0) this.c;
                L.i((Throwable) obj);
                s3l0Var.b.Ij();
                return s3q0.a;
            case 19:
                return new xfy((ViewGroup) obj, ((com.vk.stickers.keyboard.page.a) this.c).m);
            case 20:
                hwp0.e(((ncl0) this.c).s, null, (String) obj, 1);
                return s3q0.a;
            case 21:
                Context context = ((srl0) this.c).a;
                int a = iah0.a(54);
                if ((8 & 16) != 0) {
                    a = iah0.a(88);
                }
                cmf0.d(context, null, context.getString(R.string.error_hide_from_stories), false, a, (8 & 32) != 0);
                return s3q0.a;
            case 22:
                StoryAttachImageView storyAttachImageView = (StoryAttachImageView) this.c;
                Bitmap bitmap = (Bitmap) obj;
                int i6 = StoryAttachImageView.t;
                ktc0 highResPostPostprocessor = storyAttachImageView.getHighResPostPostprocessor();
                if (highResPostPostprocessor == null) {
                    highResPostPostprocessor = storyAttachImageView.getLowResPostPostprocessor();
                }
                if (highResPostPostprocessor == null || (b = highResPostPostprocessor.b(bitmap, wkw.f().g())) == null) {
                    return bitmap;
                }
                uvf<Bitmap> uvfVar = b.s() ? b : null;
                return (uvfVar == null || (createBitmap = Bitmap.createBitmap(uvfVar.r())) == null) ? bitmap : createBitmap;
            case 23:
                KeyEvent.Callback childAt = ((ViewGroup) this.c).getChildAt(((Integer) obj).intValue());
                if (childAt instanceof y8m0) {
                    return (y8m0) childAt;
                }
                return null;
            case 24:
                com.vk.stories.design.view.stats.tabs.viewers.mvi.h hVar = (com.vk.stories.design.view.stats.tabs.viewers.mvi.h) this.c;
                tj50.a aVar = (tj50.a) obj;
                jim0 jim0Var = jim0.b;
                ao8 ao8Var = ao8.d;
                return new StoryStatisticsViewersViewState.a(aVar.a(jim0Var, ao8Var), aVar.a(new com.vk.stories.design.view.stats.tabs.viewers.mvi.f(1, hVar, com.vk.stories.design.view.stats.tabs.viewers.mvi.h.class, "buildVisibilityState", "buildVisibilityState(Lcom/vk/stories/design/view/stats/tabs/viewers/mvi/StoryStatisticsViewersState;)Lcom/vk/stories/design/view/stats/tabs/viewers/mvi/StoryStatisticsViewersViewState$VisibilityState;", 0), ao8Var), aVar.a(new com.vk.stories.design.view.stats.tabs.viewers.mvi.g(1, hVar, com.vk.stories.design.view.stats.tabs.viewers.mvi.h.class, "buildListState", "buildListState(Lcom/vk/stories/design/view/stats/tabs/viewers/mvi/StoryStatisticsViewersState;)Lcom/vk/stories/design/view/stats/tabs/viewers/mvi/StoryStatisticsViewersViewState$ListState;", 0), ao8Var), aVar.a(new d220(19), ao8Var));
            case 25:
                StreamInfoFragment streamInfoFragment = (StreamInfoFragment) this.c;
                int i7 = StreamInfoFragment.S;
                eh8 fo = streamInfoFragment.fo();
                if (fo != null && (b2 = fo.b()) != null) {
                    hh8.a aVar2 = b2 instanceof hh8.a ? (hh8.a) b2 : null;
                    if (aVar2 != null && (nt80Var = aVar2.f) != null) {
                        dfw0Var = nt80Var.a();
                    }
                }
                if (dfw0Var != null && (tj8Var = streamInfoFragment.R) != null) {
                    tj8Var.c(dfw0Var);
                }
                return s3q0.a;
            case 26:
                xcn0 xcn0Var = (xcn0) this.c;
                Object obj3 = xcn0Var.l;
                Object obj4 = obj3;
                if (obj3 == null) {
                    obj4 = null;
                }
                WebAction webAction = ((ycn0) obj4).h.o.b;
                if (webAction != null) {
                    u7n0 u7n0Var = xcn0Var.p;
                    Context context2 = xcn0Var.itemView.getContext();
                    Object obj5 = xcn0Var.l;
                    Object obj6 = obj5;
                    if (obj5 == null) {
                        obj6 = null;
                    }
                    u7n0Var.b(context2, webAction, (f9n0) obj6, null);
                }
                return s3q0.a;
            case 27:
                Bundle bundle = (Bundle) this.c;
                ThemeChooserState themeChooserState = (ThemeChooserState) obj;
                ThemeChooserState.ListKind valueOf = ThemeChooserState.ListKind.valueOf(bundle.getString("active_list", themeChooserState.a.name()));
                String string = bundle.getString("selected_theme", themeChooserState.b);
                String string2 = bundle.getString("selected_color", themeChooserState.c);
                DialogBackground dialogBackground = (DialogBackground) bundle.getParcelable("selected_bg");
                if (dialogBackground == null) {
                    dialogBackground = DialogBackground.e;
                }
                return ThemeChooserState.a(themeChooserState, valueOf, string, string2, dialogBackground, false, null, null, null, PsExtractor.VIDEO_STREAM_MASK);
            case 28:
                com.vk.upload.impl.tasks.x xVar = (com.vk.upload.impl.tasks.x) this.c;
                rgl rglVar = z6x.a.a;
                ((y6x) (rglVar != null ? rglVar : null).c()).a(xVar);
                return s3q0.a;
            default:
                UserProfileAvatarsInteractor.a aVar3 = (UserProfileAvatarsInteractor.a) this.c;
                VKList vKList = (VKList) obj;
                aVar3.b = vKList.size() + aVar3.b;
                aVar3.c = vKList.i();
                ImageViewer.c<Photo> cVar3 = aVar3.d;
                if (cVar3 != null) {
                    cVar3.c(vKList);
                }
                return s3q0.a;
        }
    }
}
