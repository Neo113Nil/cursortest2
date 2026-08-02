package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewStub;
import android.widget.ImageView;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.core.view.fresco.FrescoImageView.b;
import com.vk.debug.ui.dev.DebugDevImageFragment;
import com.vk.dto.common.id.UserId;
import com.vk.feed.settings.impl.presentation.filtered.tab.NewsfeedFilterListFragment2;
import com.vk.im.design.view.counter.ImVkCounter;
import com.vk.im.itemlist.impl.presentation.fragment.ImItemListFragment;
import com.vk.im.ui.views.ScrollToBottomView;
import com.vk.libvideo.design.view.overlay.LiveUpcomingView;
import com.vk.narratives.impl.highlights.HighlightChooseCoverFragment;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.drafts.DraftsFeedFragment;
import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import com.vk.newsfeed.posting.privacy_picker.presentation.donut_levels.DonutLevelsFragment;
import com.vk.settings.impl.presentation.base.fragment.setting.NotificationSettingFragment;
import com.vk.stickers.views.LongtapRecyclerView;
import com.vk.story.api.di.StoriesComponent;
import com.vkontakte.android.R;
import java.io.Serializable;
import xsna.egm;
import xsna.v740;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class t2l implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t2l(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v111, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = 6;
        switch (this.b) {
            case 0:
                y2l y2lVar = (y2l) this.c;
                int i2 = DebugDevImageFragment.U;
                y2lVar.invoke();
                return s3q0.a;
            case 1:
                return new o3n(((fhl) this.c).c);
            case 2:
                return new n0s(((pdm) this.c).b);
            case 3:
                egm egmVar = (egm) this.c;
                ImVkCounter imVkCounter = new ImVkCounter(egmVar.d, 0);
                imVkCounter.setId(R.id.dialog_item_unread_reactions_icon);
                imVkCounter.setRenderMode(ImVkCounter.DrawMode.IMAGE);
                imVkCounter.setSize(VkCounter.Size.Medium);
                imVkCounter.setImageScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imVkCounter.setContentDescription(null);
                egm.b bVar = egmVar.m;
                int i3 = (bVar != null ? bVar : null).g;
                int i4 = (bVar != null ? bVar : null).g;
                if (bVar == null) {
                    bVar = null;
                }
                imVkCounter.setLayoutParams(egm.W(egmVar, i3, i4, bVar.h, 0, 0, 0, 56));
                egm.b bVar2 = egmVar.m;
                imVkCounter.setImageInset((bVar2 != null ? bVar2 : null).g / 6);
                imVkCounter.setAppearance(VkCounter.CounterAppearance.Appearance.Accent);
                imVkCounter.setMode(VkCounter.Mode.Primary);
                imVkCounter.e(R.drawable.vk_icon_stars_16, R.attr.vk_ui_text_contrast_themed);
                bwt0.p0(imVkCounter, false);
                egmVar.b.addView(imVkCounter);
                return imVkCounter;
            case 4:
                DonutLevelsFragment donutLevelsFragment = (DonutLevelsFragment) this.c;
                r3h r3hVar = donutLevelsFragment.Q;
                wh50 wh50Var = donutLevelsFragment.N;
                r3hVar.invoke((DonutLevel) ((zak0) wh50Var).getValue());
                Intent intent = new Intent();
                intent.putExtra("selected_donut_level", (DonutLevel) ((zak0) wh50Var).getValue());
                s3q0 s3q0Var = s3q0.a;
                donutLevelsFragment.Mf(-1, intent);
                return s3q0.a;
            case 5:
                DraftsFeedFragment draftsFeedFragment = (DraftsFeedFragment) this.c;
                ?? r1 = draftsFeedFragment.X;
                int i5 = DraftsFeedFragment.o0;
                Bundle arguments = draftsFeedFragment.getArguments();
                Serializable serializable = arguments != null ? arguments.getSerializable("ref") : null;
                if ((serializable instanceof NewsfeedRouter.OpenFromRef ? (NewsfeedRouter.OpenFromRef) serializable : null) == NewsfeedRouter.OpenFromRef.REF_POSTING) {
                    draftsFeedFragment.ko().t0(draftsFeedFragment);
                } else {
                    Bundle arguments2 = draftsFeedFragment.getArguments();
                    UserId userId = arguments2 != null ? (UserId) arguments2.getParcelable("owner_id") : null;
                    Context mo2getContext = draftsFeedFragment.mo2getContext();
                    if (mo2getContext != null) {
                        if (userId == null || !fkq0.b(userId)) {
                            NewsfeedRouter.B(((NewsFeedComponent) r1.getValue()).l0(), mo2getContext, null, 2);
                        } else {
                            ((NewsFeedComponent) r1.getValue()).l0().X(mo2getContext, userId);
                        }
                    }
                }
                return s3q0.a;
            case 6:
                return ((w3p) this.c).g;
            case 7:
                FragmentImpl fragmentImpl = (FragmentImpl) this.c;
                ((pds) fragmentImpl).o1();
                if (fragmentImpl instanceof dw60) {
                    ((dw60) fragmentImpl).Nb(false);
                }
                return s3q0.a;
            case 8:
                fpr fprVar = (fpr) this.c;
                return new ipr(fprVar.b, fprVar.c, fprVar.e);
            case 9:
                FrescoImageView frescoImageView = (FrescoImageView) this.c;
                int i6 = FrescoImageView.R;
                return frescoImageView.new b();
            case 10:
                return Boolean.valueOf(((GalleryFragmentImpl) this.c).u0);
            case 11:
                HighlightChooseCoverFragment highlightChooseCoverFragment = (HighlightChooseCoverFragment) this.c;
                int i7 = HighlightChooseCoverFragment.R;
                ((sw50) highlightChooseCoverFragment.P.getValue()).g().e(new jbs(highlightChooseCoverFragment));
                return s3q0.a;
            case 12:
                return s200.y(((quv) this.c).getContext());
            case 13:
                return ((l4w) this.c).d().getString(R.string.video_live);
            case 14:
                p7w p7wVar = (p7w) this.c;
                Context context = p7wVar.e;
                r5w r5wVar = p7wVar.b;
                ImItemListFragment.b bVar3 = r5wVar.d;
                ImItemListFragment.c cVar = r5wVar.e;
                a1w a1wVar = q1w.a;
                return new asm(context, a1wVar != null ? a1wVar : null, bVar3, cVar);
            case 15:
                w9w w9wVar = (w9w) this.c;
                dhr0.a.getClass();
                Context E = dhr0.E();
                a1w a1wVar2 = w9wVar.a;
                return new yk70(new si70(E, new caw(a1wVar2), new daw(a1wVar2)));
            case 16:
                return new d6y((r6y) this.c);
            case 17:
                LiveUpcomingView liveUpcomingView = (LiveUpcomingView) this.c;
                bwt0.p0(liveUpcomingView.b, false);
                bwt0.p0(liveUpcomingView.d, false);
                liveUpcomingView.c.setText(R.string.live_upcoming_is_coming_soon);
                return s3q0.a;
            case 18:
                return Integer.valueOf(LongtapRecyclerView.a((LongtapRecyclerView) this.c));
            case 19:
                ?? r0 = ((iq00) this.c).a;
                return new az0(((dq00) r0.getValue()).c, ((dq00) r0.getValue()).d, null, ((dq00) r0.getValue()).e, null, null);
            case 20:
                ((zak0) ((az20) this.c).p).setValue(Boolean.FALSE);
                return s3q0.a;
            case 21:
                return (ScrollToBottomView) ((ViewStub) ((vm30) this.c).t.findViewById(R.id.scroll_to_reaction_view_stub)).inflate();
            case 22:
                return new fk30(((bt30) this.c).e);
            case 23:
                e40 e40Var = ((y740) this.c).f;
                v740.b.a aVar = v740.b.a.a;
                m740 m740Var = (m740) e40Var.c;
                int i8 = m740.l1;
                m740Var.getFeature().U(aVar);
                return s3q0.a;
            case 24:
                return (b25) ((com.vk.catalog2.feature.music.configuration.b) this.c).f0.getValue();
            case 25:
                return ((xp40) this.c).z0();
            case 26:
                return new w0q(new nt10((ty40) this.c, i));
            case 27:
                NewsfeedFilterListFragment2 newsfeedFilterListFragment2 = (NewsfeedFilterListFragment2) this.c;
                int i9 = NewsfeedFilterListFragment2.X;
                return ((BridgeComponent) ((k7m) m7m.f(newsfeedFilterListFragment2)).a(fpf0.a(BridgeComponent.class))).F();
            case 28:
                return (NewsFeedBridgeComponent) ((h7m) ((du60) this.c).a.getValue()).a(fpf0.a(NewsFeedBridgeComponent.class));
            default:
                NotificationSettingFragment notificationSettingFragment = (NotificationSettingFragment) this.c;
                qcy<Object>[] qcyVarArr = NotificationSettingFragment.W;
                return ((StoriesComponent) m7m.d(notificationSettingFragment).a(fpf0.a(StoriesComponent.class))).w();
        }
    }
}
