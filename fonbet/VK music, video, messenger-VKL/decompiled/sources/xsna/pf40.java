package xsna;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.ui.mvp.holder.stories.MusicClipsSelectorCatalogRootVh;
import com.vk.clips.design.view.camera.settings.ModalSettingsPrivacyOption;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.search.ModernSearchView;
import com.vk.dto.common.id.UserId;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.newsfeed.impl.posting.profilefriendslists.a;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.photos.root.selectalbum.presentation.SelectAlbumBottomSheet;
import com.vk.stickers.details.fragment.StickerDetailsFragment;
import com.vk.stickers.details.holders.PackStylesListHolder;
import com.vk.stories.design.view.HashtagHintsView;
import com.vk.stories.design.view.camera.StoryMediaPickerTabView;
import com.vk.stories.design.view.camera.StoryTabType;
import com.vk.stories.design.view.editor.SideControlPanelView;
import com.vk.stories.design.view.stickers.selection.SelectionStickerView;
import com.vk.storycamera.screen.StoryCameraActivity;
import com.vk.video.ui.smartcrop.impl.presentation.feature.entity.SmartCropState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import xsna.asl0;
import xsna.bh6;
import xsna.cqc0;
import xsna.dne0;
import xsna.f3l0;
import xsna.fji0;
import xsna.gmi0;
import xsna.ojm0;
import xsna.pn60;
import xsna.q8a0;
import xsna.qy40;
import xsna.ssf0;
import xsna.t8a0;
import xsna.tca0;
import xsna.tj50;
import xsna.ydk0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class pf40 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pf40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v52, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v65, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Drawable a;
        UserId userId;
        int i = this.b;
        int i2 = 20;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                MusicClipsSelectorCatalogRootVh musicClipsSelectorCatalogRootVh = (MusicClipsSelectorCatalogRootVh) obj2;
                bh6.c cVar = (bh6.c) obj;
                MusicClipsSelectorCatalogRootVh.a aVar = MusicClipsSelectorCatalogRootVh.J;
                if (cVar instanceof bh6.d) {
                    DialogInterface dialogInterface = ((bh6.d) cVar).a;
                    ppk ppkVar = dialogInterface instanceof ppk ? (ppk) dialogInterface : null;
                    if (ppkVar != null) {
                        musicClipsSelectorCatalogRootVh.I = ppkVar;
                    }
                }
                return s3q0.a;
            case 1:
                rw40 rw40Var = (rw40) obj2;
                f4z f4zVar = rw40Var.x;
                if (((Boolean) obj).booleanValue()) {
                    f4zVar.b(MusicHapticEvent.SUCCESS);
                } else {
                    rw40Var.w.b(qy40.a.b.b);
                    f4zVar.b(MusicHapticEvent.ERROR);
                }
                return s3q0.a;
            case 2:
                ((fp7) obj2).b = true;
                return s3q0.a;
            case 3:
                ((th70) obj2).f.b((vzi0) obj);
                return s3q0.a;
            case 4:
                AlbumsRepository.a aVar2 = (AlbumsRepository.a) obj2;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (Object[]) obj) {
                    if (obj3 instanceof q8a0.a) {
                        arrayList.add(obj3);
                    }
                }
                return new t8a0.a(arrayList, aVar2.b);
            case 5:
                CopyOnWriteArrayList<qba0> copyOnWriteArrayList = ((tca0) obj2).c;
                tca0.a.AbstractC3738a abstractC3738a = (tca0.a.AbstractC3738a) obj;
                if (abstractC3738a instanceof tca0.a.AbstractC3738a.b) {
                    copyOnWriteArrayList.removeAll(((tca0.a.AbstractC3738a.b) abstractC3738a).a);
                } else if (abstractC3738a instanceof tca0.a.AbstractC3738a.C3739a) {
                    copyOnWriteArrayList.removeAll(((tca0.a.AbstractC3738a.C3739a) abstractC3738a).a);
                } else {
                    if (!(abstractC3738a instanceof tca0.a.AbstractC3738a.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    g5g.D(copyOnWriteArrayList, true, new hxl(abstractC3738a, 25));
                }
                return j5g.O0(copyOnWriteArrayList);
            case 6:
                ((e2b0) obj2).S((String) obj);
                return s3q0.a;
            case 7:
                ikc0 ikc0Var = (ikc0) obj2;
                Throwable th = (Throwable) obj;
                ikc0Var.g.d(th);
                ikc0Var.t.a(th);
                return s3q0.a;
            case 8:
                cqc0 cqc0Var = (cqc0) obj2;
                cqc0.c cVar2 = (cqc0.c) obj;
                TextView textView = cVar2.o;
                LinearLayout linearLayout = cVar2.i;
                LinearLayout linearLayout2 = cVar2.h;
                int i3 = 0;
                while (i3 < linearLayout2.getChildCount()) {
                    int i4 = i3 + 1;
                    View l = awt0.l(linearLayout2.getChildAt(i3), new e750(7));
                    if (l != null) {
                        f4m.j(l);
                    }
                    i3 = i4;
                }
                int i5 = 0;
                while (i5 < linearLayout.getChildCount()) {
                    int i6 = i5 + 1;
                    View l2 = awt0.l(linearLayout.getChildAt(i5), new tcu(i2));
                    if (l2 != null) {
                        f4m.j(l2);
                    }
                    i5 = i6;
                }
                switch (cqc0.d.$EnumSwitchMapping$1[cqc0Var.f.ordinal()]) {
                    case 1:
                        cVar2.b().setCheckVisible(true);
                        s3q0 s3q0Var = s3q0.a;
                        bwt0.p0(cVar2.d, false);
                        bwt0.p0(textView, true);
                        bwt0.p0(cVar2.p, true);
                        bwt0.p0(cVar2.v, true);
                        bwt0.p0(linearLayout2, true);
                        bwt0.p0(linearLayout, true);
                        bwt0.p0(cVar2.a().findViewById(R.id.posting_visibility_counter_stack_dropdown_image), true);
                        bwt0.p0(cVar2.C, false);
                        bwt0.p0(cVar2.D, false);
                        f4m.t((int) cqc0Var.c.getResources().getDimension(R.dimen.clips_privacy_bottomsheet_unavailable_title), textView);
                        return s3q0.a;
                    case 2:
                        ((ModalSettingsPrivacyOption) cVar2.x.getValue()).setCheckVisible(true);
                        s3q0 s3q0Var2 = s3q0.a;
                        bwt0.p0(cVar2.d, false);
                        bwt0.p0(textView, true);
                        bwt0.p0(cVar2.p, true);
                        bwt0.p0(cVar2.v, true);
                        bwt0.p0(linearLayout2, true);
                        bwt0.p0(linearLayout, true);
                        bwt0.p0(cVar2.a().findViewById(R.id.posting_visibility_counter_stack_dropdown_image), true);
                        bwt0.p0(cVar2.C, false);
                        bwt0.p0(cVar2.D, false);
                        f4m.t((int) cqc0Var.c.getResources().getDimension(R.dimen.clips_privacy_bottomsheet_unavailable_title), textView);
                        return s3q0.a;
                    case 3:
                        ((ModalSettingsPrivacyOption) cVar2.A.getValue()).setCheckVisible(true);
                        s3q0 s3q0Var3 = s3q0.a;
                        bwt0.p0(cVar2.d, false);
                        bwt0.p0(textView, true);
                        bwt0.p0(cVar2.p, true);
                        bwt0.p0(cVar2.v, true);
                        bwt0.p0(linearLayout2, true);
                        bwt0.p0(linearLayout, true);
                        bwt0.p0(cVar2.a().findViewById(R.id.posting_visibility_counter_stack_dropdown_image), true);
                        bwt0.p0(cVar2.C, false);
                        bwt0.p0(cVar2.D, false);
                        f4m.t((int) cqc0Var.c.getResources().getDimension(R.dimen.clips_privacy_bottomsheet_unavailable_title), textView);
                        return s3q0.a;
                    case 4:
                        s3q0 s3q0Var4 = s3q0.a;
                        bwt0.p0(cVar2.d, false);
                        bwt0.p0(textView, true);
                        bwt0.p0(cVar2.p, true);
                        bwt0.p0(cVar2.v, true);
                        bwt0.p0(linearLayout2, true);
                        bwt0.p0(linearLayout, true);
                        bwt0.p0(cVar2.a().findViewById(R.id.posting_visibility_counter_stack_dropdown_image), true);
                        bwt0.p0(cVar2.C, false);
                        bwt0.p0(cVar2.D, false);
                        f4m.t((int) cqc0Var.c.getResources().getDimension(R.dimen.clips_privacy_bottomsheet_unavailable_title), textView);
                        return s3q0.a;
                    case 5:
                        ((ModalSettingsPrivacyOption) cVar2.y.getValue()).setCheckVisible(true);
                        s3q0 s3q0Var5 = s3q0.a;
                        bwt0.p0(cVar2.d, false);
                        bwt0.p0(textView, true);
                        bwt0.p0(cVar2.p, true);
                        bwt0.p0(cVar2.v, true);
                        bwt0.p0(linearLayout2, true);
                        bwt0.p0(linearLayout, true);
                        bwt0.p0(cVar2.a().findViewById(R.id.posting_visibility_counter_stack_dropdown_image), true);
                        bwt0.p0(cVar2.C, false);
                        bwt0.p0(cVar2.D, false);
                        f4m.t((int) cqc0Var.c.getResources().getDimension(R.dimen.clips_privacy_bottomsheet_unavailable_title), textView);
                        return s3q0.a;
                    case 6:
                        cVar2.e().setCheckVisible(true);
                        s3q0 s3q0Var6 = s3q0.a;
                        bwt0.p0(cVar2.d, false);
                        bwt0.p0(textView, true);
                        bwt0.p0(cVar2.p, true);
                        bwt0.p0(cVar2.v, true);
                        bwt0.p0(linearLayout2, true);
                        bwt0.p0(linearLayout, true);
                        bwt0.p0(cVar2.a().findViewById(R.id.posting_visibility_counter_stack_dropdown_image), true);
                        bwt0.p0(cVar2.C, false);
                        bwt0.p0(cVar2.D, false);
                        f4m.t((int) cqc0Var.c.getResources().getDimension(R.dimen.clips_privacy_bottomsheet_unavailable_title), textView);
                        return s3q0.a;
                    case 7:
                        cVar2.d().setCheckVisible(true);
                        s3q0 s3q0Var7 = s3q0.a;
                        bwt0.p0(cVar2.d, false);
                        bwt0.p0(textView, true);
                        bwt0.p0(cVar2.p, true);
                        bwt0.p0(cVar2.v, true);
                        bwt0.p0(linearLayout2, true);
                        bwt0.p0(linearLayout, true);
                        bwt0.p0(cVar2.a().findViewById(R.id.posting_visibility_counter_stack_dropdown_image), true);
                        bwt0.p0(cVar2.C, false);
                        bwt0.p0(cVar2.D, false);
                        f4m.t((int) cqc0Var.c.getResources().getDimension(R.dimen.clips_privacy_bottomsheet_unavailable_title), textView);
                        return s3q0.a;
                    case 8:
                        cVar2.f().setCheckVisible(true);
                        s3q0 s3q0Var42 = s3q0.a;
                        bwt0.p0(cVar2.d, false);
                        bwt0.p0(textView, true);
                        bwt0.p0(cVar2.p, true);
                        bwt0.p0(cVar2.v, true);
                        bwt0.p0(linearLayout2, true);
                        bwt0.p0(linearLayout, true);
                        bwt0.p0(cVar2.a().findViewById(R.id.posting_visibility_counter_stack_dropdown_image), true);
                        bwt0.p0(cVar2.C, false);
                        bwt0.p0(cVar2.D, false);
                        f4m.t((int) cqc0Var.c.getResources().getDimension(R.dimen.clips_privacy_bottomsheet_unavailable_title), textView);
                        return s3q0.a;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 9:
                return new rx6((ViewGroup) obj, (a.InterfaceC1385a) obj2);
            case 10:
                return new dne0.a((sjx0) obj, (dne0) obj2);
            case 11:
                ote0 ote0Var = (ote0) obj2;
                ((wh50) ((zak0) ote0Var.e).getValue()).setValue(Boolean.FALSE);
                ote0Var.a.invoke((sx40) obj);
                return s3q0.a;
            case 12:
                ReactionsFeedFragment reactionsFeedFragment = (ReactionsFeedFragment) obj2;
                qcy<Object>[] qcyVarArr = ReactionsFeedFragment.q0;
                eh60 eh60Var = new eh60(((NewsFeedBridgeComponent) reactionsFeedFragment.eo().b.getValue()).Ad().a().p());
                qn60 qn60Var = new qn60(new zyp0());
                reactionsFeedFragment.P = qn60Var;
                pn60 pn60Var = new pn60(new pn60.a((s1c0) reactionsFeedFragment.R.getValue(), reactionsFeedFragment.go().get(), reactionsFeedFragment.go().get()), reactionsFeedFragment.eo().b);
                reactionsFeedFragment.Q = pn60Var;
                rn60.a(qn60Var);
                ReactionsFeedFragment.f fVar = new ReactionsFeedFragment.f(reactionsFeedFragment.go());
                UiTracker uiTracker = UiTracker.a;
                com.vk.channels.impl.channel_screen.send_msg.c cVar3 = new com.vk.channels.impl.channel_screen.send_msg.c((bin0) fVar);
                return new r4f0(new h5f0(qn60Var, pn60Var, eh60Var, new s1v(), reactionsFeedFragment.eo().a, new AtomicReference(new wn60((byte) 0)), new xa4(new g5f0()), (l3f0) reactionsFeedFragment.N.getValue(), cVar3, new g4f0(new a5f0(), new m4f0(), new e4f0()), fs60.a(qn60Var, pn60Var, cVar3, reactionsFeedFragment.eo().a), (gzs) obj));
            case 13:
                nsf0 nsf0Var = (nsf0) obj2;
                if (((lsf0) obj) != null) {
                    nsf0Var.g.b(new ssf0.b(true));
                }
                return s3q0.a;
            case 14:
                slh0 slh0Var = (slh0) obj2;
                sfc sfcVar = (sfc) obj;
                sfc.a(sfcVar, "type", oqm0.b);
                sfc.a(sfcVar, "value", cmi0.b("kotlinx.serialization.Sealed<" + slh0Var.a.l() + '>', gmi0.a.a, new SerialDescriptor[0], new bl30(slh0Var, 16)));
                sfcVar.b = slh0Var.b;
                return s3q0.a;
            case 15:
                int i7 = SelectAlbumBottomSheet.p1;
                ((SelectAlbumBottomSheet) obj2).getFeature().C((com.vk.photos.root.selectalbum.domain.a) obj);
                return s3q0.a;
            case 16:
                s8i0 s8i0Var = (s8i0) obj2;
                Activity activity = s8i0Var.b;
                cmf0.d(activity, s8i0Var.c, j03.g(activity, (Throwable) obj, R.string.error), false, iah0.a(88), true);
                ba40 ba40Var = s8i0Var.q;
                if (ba40Var != null) {
                    ba40Var.invoke(Boolean.valueOf(s8i0Var.v.size() <= 1));
                }
                return s3q0.a;
            case 17:
                SelectionStickerView selectionStickerView = (SelectionStickerView) obj2;
                RecyclerView recyclerView = (RecyclerView) obj;
                if (recyclerView == null) {
                    r4 = false;
                } else {
                    recyclerView.setHasFixedSize(true);
                    recyclerView.setVerticalScrollBarEnabled(true);
                    recyclerView.setClipToPadding(false);
                    int i8 = selectionStickerView.D;
                    recyclerView.setPadding(i8, 0, i8, 0);
                    recyclerView.addOnScrollListener(selectionStickerView.j0);
                    if (Build.VERSION.SDK_INT >= 29 && (a = m33.a(R.drawable.search_scrollbar, selectionStickerView.getContext())) != null) {
                        a.setAlpha(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                        recyclerView.setVerticalScrollbarThumbDrawable(a);
                    }
                }
                return Boolean.valueOf(r4);
            case 18:
                return new fji0.a(((tj50.a) obj).a(new lp1((zii0) obj2, 11), ao8.d));
            case 19:
                u76 u76Var = ((SideControlPanelView) obj2).u;
                if (u76Var != null) {
                    u76Var.x2(false);
                }
                return s3q0.a;
            case 20:
                return SmartCropState.a((SmartCropState) obj, (sht0) obj2, null, null, null, 0L, false, null, false, false, null, 2046);
            case 21:
                odk0 odk0Var = (odk0) obj2;
                ydk0.a.AbstractC4091a abstractC4091a = (ydk0.a.AbstractC4091a) obj;
                View view = odk0Var.n;
                if (view == null) {
                    view = null;
                }
                boolean z = abstractC4091a instanceof ydk0.a.AbstractC4091a.b;
                bwt0.p0(view, z);
                View view2 = odk0Var.o;
                if (view2 == null) {
                    view2 = null;
                }
                boolean z2 = abstractC4091a instanceof ydk0.a.AbstractC4091a.d;
                bwt0.p0(view2, z2);
                RecyclerView recyclerView2 = odk0Var.k;
                if (recyclerView2 == null) {
                    recyclerView2 = null;
                }
                boolean z3 = abstractC4091a instanceof ydk0.a.AbstractC4091a.AbstractC4092a;
                bwt0.p0(recyclerView2, z3);
                ModernSearchView modernSearchView = odk0Var.q;
                if (modernSearchView == null) {
                    modernSearchView = null;
                }
                bwt0.p0(modernSearchView, z3 || (abstractC4091a instanceof ydk0.a.AbstractC4091a.e) || (abstractC4091a instanceof ydk0.a.AbstractC4091a.c));
                View view3 = odk0Var.p;
                if (view3 == null) {
                    view3 = null;
                }
                ModernSearchView modernSearchView2 = odk0Var.q;
                if (modernSearchView2 == null) {
                    modernSearchView2 = null;
                }
                bwt0.p0(view3, !bwt0.K(modernSearchView2));
                ProgressBar progressBar = odk0Var.r;
                if (progressBar == null) {
                    progressBar = null;
                }
                boolean z4 = abstractC4091a instanceof ydk0.a.AbstractC4091a.e;
                bwt0.p0(progressBar, z4);
                VkSimpleButton vkSimpleButton = odk0Var.m;
                if (vkSimpleButton == null) {
                    vkSimpleButton = null;
                }
                bwt0.p0(vkSimpleButton, !z2 && abstractC4091a.a());
                TextView textView2 = odk0Var.s;
                TextView textView3 = textView2 != null ? textView2 : null;
                boolean z5 = abstractC4091a instanceof ydk0.a.AbstractC4091a.c;
                bwt0.p0(textView3, z5);
                if (z4) {
                    odk0Var.tn().clear();
                } else if (abstractC4091a instanceof ydk0.a.AbstractC4091a.AbstractC4092a.C4093a) {
                    odk0Var.tn().setItems(((ydk0.a.AbstractC4091a.AbstractC4092a.C4093a) abstractC4091a).a);
                } else if (abstractC4091a instanceof ydk0.a.AbstractC4091a.AbstractC4092a.b) {
                    odk0Var.tn().setItems(((ydk0.a.AbstractC4091a.AbstractC4092a.b) abstractC4091a).a);
                } else if (!z5 && !z && !z2) {
                    throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            case 22:
                s3l0 s3l0Var = (s3l0) obj2;
                f3l0.a.C2847a c2847a = new f3l0.a.C2847a(0);
                s3l0Var.i = c2847a;
                StickerDetailsFragment stickerDetailsFragment = s3l0Var.b;
                d790 d790Var = s3l0Var.d;
                j3l0.pb(stickerDetailsFragment, d790Var != null ? d790Var : null, s3l0Var.e, s3l0Var.h, PackStylesListHolder.State.ERROR, c2847a);
                return s3q0.a;
            case 23:
                ny3 ny3Var = (ny3) obj;
                jjc.g(ny3Var, new bl30((com.vk.stickers.settings.g) obj2, i2));
                View findViewById = ny3Var.findViewById(R.id.disabled_bg_view);
                if (findViewById != null) {
                    bwt0.p0(findViewById, !ny3Var.isEnabled());
                }
                return s3q0.a;
            case 24:
                return new tfy((ViewGroup) obj, ((com.vk.stickers.keyboard.page.a) obj2).m);
            case 25:
                ((yvl0) obj2).b.a();
                return s3q0.a;
            case 26:
                StoryCameraActivity storyCameraActivity = (StoryCameraActivity) obj2;
                Bitmap bitmap = (Bitmap) obj;
                int i9 = StoryCameraActivity.G;
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() / 2, bitmap.getHeight() / 2, true);
                bitmap.recycle();
                Intent intent = storyCameraActivity.w;
                if (intent == null || (userId = (UserId) intent.getParcelableExtra("UPLOAD_USER_ID")) == null) {
                    userId = UserId.d;
                }
                ((ysg0) storyCameraActivity.F.getValue()).a(new asl0.a(createScaledBitmap, userId));
                storyCameraActivity.overridePendingTransition(0, 0);
                storyCameraActivity.finish();
                return s3q0.a;
            case 27:
                List<String> list = (List) obj;
                HashtagHintsView hashtagHintsView = ((s4m0) obj2).b.i;
                HashtagHintsView hashtagHintsView2 = hashtagHintsView != null ? hashtagHintsView : null;
                int i10 = HashtagHintsView.d;
                hashtagHintsView2.a(list, EmptyList.b);
                return s3q0.a;
            case 28:
                etv0 etv0Var = (etv0) obj;
                izs<? super StoryTabType, s3q0> izsVar = ((StoryMediaPickerTabView) obj2).h;
                if (izsVar != null) {
                    izsVar.invoke(StoryTabType.TEMPLATE);
                }
                etv0Var.b(false);
                return s3q0.a;
            default:
                ojm0.b bVar = (ojm0.b) obj;
                wim0 wim0Var = ((wjm0) obj2).h;
                if (bVar.b) {
                    wim0Var.submitList(bVar.c);
                } else {
                    wim0Var.submitList(EmptyList.b);
                }
                return s3q0.a;
        }
    }
}
