package xsna;

import android.hardware.SensorManager;
import android.view.View;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.clips.design.view.timeline.ClipsEditorVoiceOverRecordButton;
import com.vk.clips.editor.templates.api.di.ClipsTemplatesEditorComponent;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.clips.tool.view.newsfeed.overlay.ClipEndOverlayView;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDraftsListFragment;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.ecomm.onlinebooking.impl.edit.a;
import com.vk.ecomm.onlinebooking.impl.main.BookingStartScreenFragment;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.feed.blacklist.api.di.BlacklistComponent;
import com.vk.feed.blacklist.impl.presentation.blacklist.BlacklistFragment;
import com.vk.im.channelcreation.impl.g;
import com.vk.im.reporters.api.msg.OpenMessagesHistoryReporter;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.libvideo.bottomsheet.about.a.b;
import com.vk.lists.ListDataSet;
import com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment;
import com.vk.photos.root.archive.presentation.ArchiveFragment;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.AttachedClipsState;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.ClipState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.sdk.analytics.CallAnalyticsInitializer;
import xsna.id6;
import xsna.r2f.c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class s5 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Boolean init$lambda$9;
        int i = this.b;
        Object obj = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                vki0 b = g5z.b(((com.vk.libvideo.bottomsheet.about.a) obj2).new b(null));
                while (true) {
                    if (b.hasNext()) {
                        Object next = b.next();
                        View view = (View) next;
                        if (view != null && view.getId() == R.id.design_bottom_sheet) {
                            obj = next;
                        }
                    }
                }
                return (View) obj;
            case 1:
                return (SensorManager) ((ti) obj2).a.getSystemService("sensor");
            case 2:
                return new dym0(((ow0) obj2).b.F(), null);
            case 3:
                int i2 = ArchiveFragment.e0;
                return bwt0.F(((nj3) obj2).h.getRecyclerView());
            case 4:
                AttachedClipsState attachedClipsState = (AttachedClipsState) obj2;
                Iterable<ClipState> iterable = attachedClipsState.c;
                if (iterable == null) {
                    iterable = EmptyList.b;
                }
                ArrayList arrayList = new ArrayList();
                for (ClipState clipState : iterable) {
                    ClipVideoFile clipVideoFile = clipState.c;
                    if (!clipState.d) {
                        clipVideoFile = null;
                    }
                    if (clipVideoFile != null) {
                        arrayList.add(clipVideoFile);
                    }
                }
                List list = attachedClipsState.e;
                if (list == null) {
                    list = EmptyList.b;
                }
                return j5g.u0(tci.j(arrayList, list), arrayList);
            case 5:
                fh5 fh5Var = (fh5) obj2;
                fxc0.B().d(fh5Var.o);
                fh5Var.m0();
                return s3q0.a;
            case 6:
                mio.a((ov5) obj2);
                return s3q0.a;
            case 7:
                id6 id6Var = (id6) obj2;
                ?? r0 = id6Var.i;
                jd6 jd6Var = id6Var.a;
                ListDataSet<nqs> listDataSet = id6Var.e;
                UserId userId = jd6Var.b;
                if (userId == null) {
                    userId = (UserId) r0.getValue();
                }
                int i3 = id6.a.$EnumSwitchMapping$0[jd6Var.a.ordinal()];
                if (i3 == 1) {
                    return new ra90(userId, listDataSet);
                }
                if (i3 == 2) {
                    return new pa90((UserId) r0.getValue(), userId, listDataSet);
                }
                if (i3 == 3) {
                    return new la90(userId, jd6Var.c, listDataSet);
                }
                throw new NoWhenBranchMatchedException();
            case 8:
                int i4 = BasePhotoListFragment.l0;
                return new BasePhotoListFragment.b((BasePhotoListFragment) obj2);
            case 9:
                int i5 = BlacklistFragment.V;
                return ((BlacklistComponent) m7m.d((BlacklistFragment) obj2).a(fpf0.a(BlacklistComponent.class))).E3();
            case 10:
                ((izs) ((zak0) ((qo7) obj2).b).getValue()).invoke(a.e.b.b);
                return s3q0.a;
            case 11:
                BookingStartScreenFragment bookingStartScreenFragment = (BookingStartScreenFragment) obj2;
                qcy<Object>[] qcyVarArr = BookingStartScreenFragment.S;
                bp80 bp80Var = new bp80((BookingScreenParams) bookingStartScreenFragment.O.getValue());
                l7m d = m7m.d(bookingStartScreenFragment);
                OnlineBookingInternalComponent.n.getClass();
                return (OnlineBookingInternalComponent) d.d(OnlineBookingInternalComponent.a.a(bp80Var)).a(fpf0.a(OnlineBookingInternalComponent.class));
            case 12:
                init$lambda$9 = CallAnalyticsInitializer.init$lambda$9((i70) obj2);
                return init$lambda$9;
            case 13:
                return (ClipsConfigAuthorsComponent) ((nmg0) obj2).a(fpf0.a(ClipsConfigAuthorsComponent.class));
            case 14:
                ((gzs) obj2).invoke();
                return s3q0.a;
            case 15:
                return new v8a((ne6) ((qw0) obj2).a);
            case 16:
                return (CatalogBlockState) obj2;
            case 17:
                String str = ((z9a) obj2).e;
                return Boolean.valueOf(str != null && drm0.D(str, "kids_section", false));
            case 18:
                ((com.vk.im.channelcreation.impl.h) obj2).O(g.o.b);
                return s3q0.a;
            case 19:
                gza gzaVar = (gza) obj2;
                gzaVar.f = null;
                if (((Boolean) gzaVar.c.invoke()).booleanValue()) {
                    gzaVar.b().d();
                }
                return s3q0.a;
            case 20:
                return new m5b(((i5b) obj2).i);
            case 21:
                return ((ChatFragment) obj2).S.a(OpenMessagesHistoryReporter.Span.ON_CREATE);
            case 22:
                ((bmc) obj2).b.a(ClipItemViewEvent.OwnerClicked.AVATAR);
                return s3q0.a;
            case 23:
                return Boolean.valueOf(((ClipEndOverlayView) obj2).r);
            case 24:
                int i6 = ClipFeedListFragment.a2;
                return ((ClipsTemplatesEditorComponent) m7m.d((ClipFeedListFragment) obj2).a(fpf0.a(ClipsTemplatesEditorComponent.class))).l5();
            case 25:
                return ((ClipsConfigViewersComponent) ((k7m) m7m.f((cfd) obj2)).a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments();
            case 26:
                return ((ClipsConfigViewersComponent) ((k7m) m7m.f((ekd) obj2)).a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments();
            case 27:
                int i7 = ClipsEditorVoiceOverRecordButton.B;
                return ((ClipsEditorVoiceOverRecordButton) obj2).findViewById(R.id.clips_editor_voiceover_view_button_record_shape);
            case 28:
                int i8 = ClipsGridDraftsListFragment.l0;
                return (ClipsTemplatesEditorComponent) m7m.d((ClipsGridDraftsListFragment) obj2).a(fpf0.a(ClipsTemplatesEditorComponent.class));
            default:
                return ((r2f) obj2).new c();
        }
    }
}
