package xsna;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.section.api.CatalogSectionParams;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.catalog.mvi.section.ui.utils.ParcelableLazyGridState;
import com.vk.catalog.mvi.section.ui.utils.ParcelableLazyListState;
import com.vk.catalog2.feature.music.holders.OfflineHeaderRemoveAllVh;
import com.vk.clips.design.view.filter.FiltersView;
import com.vk.clips.favorites.impl.ui.folders.picker.ClipsFavoritesFoldersPickerFragment;
import com.vk.community.design.view.components.catalog.CommunityCardView;
import com.vk.dialogsscreen.impl.DialogsScreenFragment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.RecommendedProfile;
import com.vk.dto.hints.Hint;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;
import com.vk.newsfeed.posting.poll_editor.domain.model.PollEditorScreen;
import com.vk.photo.editor.features.collage.model.stat.CollageStatEvent;
import com.vk.photo.editor.views.ToolBottomView;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.superapp.api.dto.app.AppsGroupsContainer;
import com.vk.superapp.api.dto.group.WebGroup;
import com.vk.superapp.browser.internal.ui.communitypicker.VkCommunityPickerActivity;
import com.vkontakte.android.R;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.JsonException;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import xsna.a5e;
import xsna.gmi0;
import xsna.omt0;
import xsna.pnb0;
import xsna.r5;
import xsna.t5e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class i5 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i5(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // xsna.gzs
    public final Object invoke() {
        String[] names;
        io.reactivex.rxjava3.internal.operators.completable.p pVar;
        io.reactivex.rxjava3.core.a t;
        ImageSize Cb;
        int i = this.b;
        String str = null;
        int i2 = 1;
        boolean z = false;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return m6s0.a((Context) obj2, ((r5.a) obj).h);
            case 1:
                ((gg1) obj2).C(a.d.a((a.d) obj));
                return s3q0.a;
            case 2:
                yp80 yp80Var = (yp80) obj;
                Context context = (Context) obj2;
                if (yp80Var != null) {
                    yp80Var.onSuccess();
                }
                new FriendsImportFragment.b(R.string.import_from_contacts).k(context);
                return s3q0.a;
            case 3:
                return "removeSubtitlesListener() - count= " + ((BaseVideoPlayer) obj2).p.size() + " listener= " + ((OneVideoPlayer.e) obj);
            case 4:
                return ((m99) obj2).e.b((String) obj, false);
            case 5:
                CatalogSectionParams catalogSectionParams = (CatalogSectionParams) obj;
                CatalogSectionState catalogSectionState = (CatalogSectionState) ((gzs) obj2).invoke();
                if (catalogSectionState != null) {
                    return catalogSectionState;
                }
                return new CatalogSectionState(catalogSectionParams.d, catalogSectionParams.b, null, catalogSectionParams.f ? new ParcelableLazyGridState(new dsy(0, 0)) : new ParcelableLazyListState(ParcelableLazyListState.d()), false, false, null, null, catalogSectionParams.e, null, null, null, null, 7924, null);
            case 6:
                ClipsFavoritesFoldersPickerFragment clipsFavoritesFoldersPickerFragment = (ClipsFavoritesFoldersPickerFragment) obj2;
                ClipsFavoritesFoldersPickerFragment.a aVar = ClipsFavoritesFoldersPickerFragment.V;
                a5e.a aVar2 = (a5e.a) ((a5e) obj);
                clipsFavoritesFoldersPickerFragment.fo().Ff().d(new t5e.l(clipsFavoritesFoldersPickerFragment.go().q(), aVar2.a, aVar2.b, new defpackage.j(clipsFavoritesFoldersPickerFragment, 21)), null);
                return s3q0.a;
            case 7:
                r2g r2gVar = (r2g) obj2;
                ToolBottomView toolBottomView = (ToolBottomView) obj;
                n3g n3gVar = r2gVar.c;
                v3p v3pVar = r2gVar.e;
                com.vk.photo.editor.ivm.d dVar = n3gVar.b;
                if (dVar == null) {
                    dVar = null;
                }
                bc0 i3 = n3g.i(dVar);
                if (i3 != null) {
                    Iterator<n2k0> it = i3.b.a().keySet().iterator();
                    while (it.hasNext()) {
                        c2g c2gVar = i3.g.a.get(it.next());
                        if ((c2gVar != null ? c2gVar.i : null) == null) {
                        }
                    }
                    r2gVar.A.b(CollageStatEvent.o.a);
                    v3pVar.c(true);
                    return s3q0.a;
                }
                v3pVar.o(1300L, v3pVar.x().getString(R.string.editor_collage_fill_all_slots_error));
                CharSequence contentDescription = toolBottomView.getContentDescription();
                toolBottomView.setContentDescription(toolBottomView.getContext().getResources().getString(R.string.editor_collage_fill_all_slots_error));
                toolBottomView.sendAccessibilityEvent(8);
                toolBottomView.setContentDescription(contentDescription);
                return s3q0.a;
            case 8:
                j3i j3iVar = (j3i) obj2;
                bug bugVar = (bug) obj;
                CommunityCardView communityCardView = bugVar.o;
                if (j3iVar.b.j) {
                    communityCardView.P4(17);
                } else {
                    communityCardView.P4(16);
                }
                bugVar.n.invoke(j3iVar.b, j3iVar.c, communityCardView.getAnchorView());
                return s3q0.a;
            case 9:
                ((oh3) obj2).invoke(new wow(r6l.b((wh50) obj)));
                return s3q0.a;
            case 10:
                ((Toolbar) obj2).setTitleTextColor(((kkm) obj).f(R.attr.vk_ui_text_contrast));
                return s3q0.a;
            case 11:
                izs izsVar = (izs) obj2;
                izsVar.invoke(pnb0.c.f.b);
                izsVar.invoke(pnb0.c.b.b);
                if (((PollEditorScreen.ExitPollEditorAlert) ((PollEditorScreen) obj)).b) {
                    izsVar.invoke(pnb0.c.d.b);
                } else {
                    izsVar.invoke(pnb0.c.a.b);
                }
                return s3q0.a;
            case 12:
                int i4 = DialogsScreenFragment.p0;
                ((DialogsScreenFragment) obj2).mo((View) obj);
                return s3q0.a;
            case 13:
                ((FiltersView) obj2).t.i.H0(new qcl(((tcr) obj).a, 7), new egr(z));
                return s3q0.a;
            case 14:
                ((com.vk.core.fragments.b) obj2).e.c.Lb((ArrayList) obj);
                return s3q0.a;
            case 15:
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj2;
                j8y j8yVar = (j8y) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                q8y q8yVar = j8yVar.a;
                t9y.c(serialDescriptor, j8yVar);
                int c = serialDescriptor.c();
                for (int i5 = 0; i5 < c; i5++) {
                    List<Annotation> e = serialDescriptor.e(i5);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : e) {
                        if (obj3 instanceof s9y) {
                            arrayList.add(obj3);
                        }
                    }
                    s9y s9yVar = (s9y) j5g.A0(arrayList);
                    if (s9yVar != null && (names = s9yVar.names()) != null) {
                        for (String str2 : names) {
                            String str3 = epx.f(serialDescriptor.getKind(), gmi0.b.a) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str2)) {
                                throw new JsonException("The suggested name '" + str2 + "' for " + str3 + ' ' + serialDescriptor.d(i5) + " is already one of the names for " + str3 + ' ' + serialDescriptor.d(((Number) pn00.h(str2, linkedHashMap)).intValue()) + " in " + serialDescriptor);
                            }
                            linkedHashMap.put(str2, Integer.valueOf(i5));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? jgp.b : linkedHashMap;
            case 16:
                OfflineHeaderRemoveAllVh offlineHeaderRemoveAllVh = (OfflineHeaderRemoveAllVh) obj2;
                String str4 = (String) obj;
                x8c x8cVar = offlineHeaderRemoveAllVh.b;
                lq40 lq40Var = (lq40) x8cVar.b;
                int i6 = 11;
                int i7 = 6;
                switch (str4.hashCode()) {
                    case -1903268188:
                        if (str4.equals("synthetic_offline_music_playlist_all")) {
                            pVar = new io.reactivex.rxjava3.internal.operators.completable.p(lq40Var.l().l(new xb20(new waf0(x8cVar, i2), i6)));
                            t = pVar;
                            break;
                        }
                        pVar = new io.reactivex.rxjava3.internal.operators.completable.p(lq40Var.A().l(new qw80(new gda0(x8cVar, i6), i7)));
                        t = pVar;
                    case -330053986:
                        if (str4.equals("synthetic_offline_tracks")) {
                            pVar = new io.reactivex.rxjava3.internal.operators.completable.p(lq40Var.A().l(new qw80(new gda0(x8cVar, i6), i7)));
                            t = pVar;
                            break;
                        }
                        pVar = new io.reactivex.rxjava3.internal.operators.completable.p(lq40Var.A().l(new qw80(new gda0(x8cVar, i6), i7)));
                        t = pVar;
                    case 320065073:
                        if (str4.equals("synthetic_offline_music_audiobook_all")) {
                            t = lq40Var.t();
                            break;
                        }
                        pVar = new io.reactivex.rxjava3.internal.operators.completable.p(lq40Var.A().l(new qw80(new gda0(x8cVar, i6), i7)));
                        t = pVar;
                        break;
                    case 1238991073:
                        if (str4.equals("synthetic_offline_music_album_all")) {
                            pVar = new io.reactivex.rxjava3.internal.operators.completable.p(lq40Var.b().l(new gs00(new v4w(x8cVar, 24), i7)));
                            t = pVar;
                            break;
                        }
                        pVar = new io.reactivex.rxjava3.internal.operators.completable.p(lq40Var.A().l(new qw80(new gda0(x8cVar, i6), i7)));
                        t = pVar;
                    case 1389309686:
                        if (str4.equals("synthetic_offline_music_podcast_all")) {
                            t = lq40Var.B();
                            break;
                        }
                        pVar = new io.reactivex.rxjava3.internal.operators.completable.p(lq40Var.A().l(new qw80(new gda0(x8cVar, i6), i7)));
                        t = pVar;
                        break;
                    default:
                        pVar = new io.reactivex.rxjava3.internal.operators.completable.p(lq40Var.A().l(new qw80(new gda0(x8cVar, i6), i7)));
                        t = pVar;
                        break;
                }
                offlineHeaderRemoveAllVh.i.b(t.q(asu0.a.c()).o(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe());
                return s3q0.a;
            case 17:
                k1e0 k1e0Var = (k1e0) obj2;
                RecommendedProfile recommendedProfile = (RecommendedProfile) obj;
                nbf0 nbf0Var = k1e0Var.F;
                if (nbf0Var != null) {
                    nbf0Var.c = null;
                }
                k1e0Var.h7(recommendedProfile);
                return s3q0.a;
            case 18:
                rg50 rg50Var = (rg50) obj;
                Image image = ((com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.d) obj2).b;
                if (image != null && (Cb = image.Cb(rg50Var.getIntValue(), true, false)) != null) {
                    str = Cb.d.d;
                }
                return str == null ? "" : str;
            case 19:
                LinearLayout linearLayout = (LinearLayout) obj;
                ((tn20) obj2).invoke(Integer.valueOf(linearLayout.getWidth()), Integer.valueOf(linearLayout.getHeight()));
                return s3q0.a;
            case 20:
                ((gzs) obj2).invoke();
                ((wh50) obj).setValue(Boolean.TRUE);
                return s3q0.a;
            case 21:
                isq0 isq0Var = (isq0) obj2;
                isq0Var.v().b(((Hint) obj).b);
                isq0Var.v().detach();
                return s3q0.a;
            case 22:
                q1t0 q1t0Var = (q1t0) obj2;
                q1t0Var.d(true);
                q1t0Var.e(false);
                q1t0Var.c(false);
                q1t0Var.b(false);
                ((com.vk.repository.internal.repos.stickers.suggests.a) obj).invoke(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                return s3q0.a;
            case 23:
                ((izs) obj2).invoke(new omt0.f.a((BlockId) obj));
                return s3q0.a;
            default:
                VkCommunityPickerActivity vkCommunityPickerActivity = (VkCommunityPickerActivity) obj2;
                int i8 = VkCommunityPickerActivity.g;
                WebGroup webGroup = ((AppsGroupsContainer) obj).b;
                Intent intent = new Intent();
                intent.putExtra("picked_group_id", webGroup.b);
                intent.putExtra("should_send_push", false);
                vkCommunityPickerActivity.setResult(-1, intent);
                vkCommunityPickerActivity.finish();
                return s3q0.a;
        }
    }

    public /* synthetic */ i5(Context context, yp80 yp80Var) {
        this.b = 2;
        this.d = yp80Var;
        this.c = context;
    }
}
