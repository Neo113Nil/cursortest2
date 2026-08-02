package xsna;

import android.content.Context;
import android.text.ClipboardManager;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.stat.data.GraffityParamsEntity;
import com.vk.attachpicker.stat.data.PhotoParamsEntity;
import com.vk.attachpicker.stat.data.StickerParamsEntity;
import com.vk.attachpicker.stat.data.TextParamsEntity;
import com.vk.catalog.mvi.block.impl.pager.HorizontalPagerView;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListViewState;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetSideEffectOptions;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.notifications.NotificationItem;
import com.vk.dto.shortvideo.entries.ClipsGridHeaderEntry;
import com.vk.im.engine.internal.storage.delegates.channels.ChannelsHistoryMetaDb;
import com.vk.im.engine.internal.storage.delegates.channels.ChannelsRecommendationsDb;
import com.vk.im.engine.models.education.EduAchievement;
import com.vk.im.ui.components.common.LinkAction;
import com.vk.photo.editor.PhotoEditorView;
import com.vk.video.bugreport.api.dto.VideoTechBugreportData;
import com.vk.voip.ui.settings.CallParticipantsFragment;
import com.vk.voip.ui.settings.participants_view.j;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import xsna.c2r;
import xsna.c99;
import xsna.cwb0;
import xsna.f0r;
import xsna.gko;
import xsna.icp;
import xsna.ij20;
import xsna.nph0;
import xsna.nt5;
import xsna.ot5;
import xsna.pph0;
import xsna.qvq;
import xsna.s4r;
import xsna.tlo0;
import xsna.tra0;
import xsna.ubg;
import xsna.ubx;
import xsna.us2;
import xsna.wk50;
import xsna.wub;
import xsna.xn50;
import xsna.zrz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class az2 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ az2(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        SQLiteStatement compileStatement;
        String str;
        final int size;
        int size2;
        int i;
        oaa0 oaa0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        List<GraffityParamsEntity> arrayList5;
        List<TextParamsEntity> arrayList6;
        List<StickerParamsEntity> arrayList7;
        int i2 = this.b;
        int i3 = 4;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i2) {
            case 0:
                xy2 xy2Var = (xy2) obj3;
                l7r0 l7r0Var = (l7r0) obj;
                ij20.a o = bz2.o(xy2Var, l7r0Var.a.g);
                ((izs) obj2).invoke(o);
                return l7r0Var.d(new ij20(o), new cz2(xy2Var));
            case 1:
                rt5 rt5Var = (rt5) obj3;
                int i4 = rt5.r1;
                xn50.a.c(rt5Var, nt5.a.C3413a.b);
                rt5Var.hide();
                xn50.a.c(rt5Var, new nt5.b(((ot5.a) obj2).b));
                return s3q0.a;
            case 2:
                c99 c99Var = null;
                v19 v19Var = (v19) obj3;
                m99 m99Var = (m99) obj2;
                com.vk.voip.ui.settings.participants_view.j jVar = (com.vk.voip.ui.settings.participants_view.j) obj;
                int i5 = CallParticipantsFragment.W;
                if (jVar instanceof j.C2090j) {
                    com.vk.movika.sdk.base.model.e eVar = new com.vk.movika.sdk.base.model.e(m99Var, 9);
                    if (com.vk.contacts.d.a.H0()) {
                        eVar.invoke();
                    } else {
                        bzb0.d((bzb0) v19Var.d.getValue(), new cwb0.a1(R.string.voip_request_and_sync_contacts_dialog_title, null, R.string.voip_request_and_sync_contacts_dialog_description, null, R.string.voip_request_and_sync_contacts_dialog_enable, null, R.string.voip_request_and_sync_contacts_dialog_cancel, null, null, null, 938), new com.vk.movika.sdk.base.flow.binding.j(i3, v19Var, eVar), null, null, 28);
                    }
                } else {
                    if (jVar instanceof j.h) {
                        c99Var = c99.e0.a;
                    } else if (jVar instanceof j.d) {
                        j.d dVar = (j.d) jVar;
                        if (dVar instanceof j.d.c) {
                            c99Var = c99.e.c.a;
                        } else if (dVar instanceof j.d.e) {
                            c99Var = c99.e.C2650e.a;
                        } else if (dVar instanceof j.d.b) {
                            c99Var = c99.e.b.a;
                        } else if (dVar instanceof j.d.C2089d) {
                            c99Var = c99.e.d.a;
                        } else {
                            if (!(dVar instanceof j.d.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c99Var = c99.e.a.a;
                        }
                    } else if (jVar instanceof j.m) {
                        c99Var = c99.k0.a;
                    } else if (jVar instanceof j.n) {
                        c99Var = c99.l0.a;
                    } else if (jVar instanceof j.o) {
                        c99Var = c99.h0.a;
                    } else if (jVar instanceof j.b) {
                        c99Var = new c99.b(((j.b) jVar).a);
                    } else if (jVar instanceof j.a) {
                        c99Var = c99.a.a;
                    } else if (jVar instanceof j.l) {
                        c99Var = new c99.j0(((j.l) jVar).a);
                    } else if (jVar instanceof j.g) {
                        c99Var = new c99.d0(((j.g) jVar).a);
                    } else if (jVar instanceof j.k) {
                        c99Var = new c99.g0(((j.k) jVar).a);
                    } else if (jVar instanceof j.c) {
                        c99Var = new c99.d(((j.c) jVar).a);
                    } else if (jVar instanceof j.i) {
                        c99Var = new c99.f0(((j.i) jVar).a);
                    } else if (jVar instanceof j.e) {
                        c99Var = c99.y.a;
                    } else if (jVar instanceof j.f) {
                        c99Var = c99.z.a;
                    }
                    if (c99Var != null) {
                        m99Var.b(c99Var);
                    }
                }
                return s3q0.a;
            case 3:
                Collection<wfb> collection = (Collection) obj2;
                compileStatement = ((e0w) obj).compileStatement(((ChannelsHistoryMetaDb) obj3).a.e());
                try {
                    for (wfb wfbVar : collection) {
                        compileStatement.clearBindings();
                        ChannelsHistoryMetaDb.a(compileStatement, wfbVar);
                        compileStatement.executeInsert();
                    }
                    s3q0 s3q0Var = s3q0.a;
                    compileStatement.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                    }
                }
            case 4:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj2;
                compileStatement = ((e0w) obj).compileStatement(((ChannelsRecommendationsDb) obj3).a.e());
                try {
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        compileStatement.clearBindings();
                        ChannelsRecommendationsDb.a(compileStatement, (gbb) entry.getValue());
                        compileStatement.executeInsert();
                    }
                    s3q0 s3q0Var2 = s3q0.a;
                    compileStatement.close();
                    return s3q0.a;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } finally {
                    }
                }
            case 5:
                ((wub.a) obj3).q.e((EduAchievement) obj2);
                return s3q0.a;
            case 6:
                ClipsFavoriteFolderContentListViewState.e eVar2 = (ClipsFavoriteFolderContentListViewState.e) obj3;
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) obj2;
                ClipsFavoriteFolderContentListFragment.b bVar = (ClipsFavoriteFolderContentListFragment.b) obj;
                int i6 = ClipsFavoriteFolderContentListFragment.W;
                if (eVar2 instanceof ClipsFavoriteFolderContentListViewState.e.b) {
                    VkTopBar vkTopBar = bVar.b;
                    tlo0.f h = tq.h(tlo0.Companion, R.string.menu);
                    gko.b bVar2 = gko.Companion;
                    vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_more_vertical_28), h, new lb6(5, clipsFavoriteFolderContentListFragment, eVar2), null, null, com.vk.core.compose.component.semantics.b.a(null, new jt(13), 3), 24), null, 6));
                } else {
                    if (!(eVar2 instanceof ClipsFavoriteFolderContentListViewState.e.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.b.setAfter(null);
                }
                return s3q0.a;
            case 7:
                izs izsVar = (izs) obj2;
                ClipsGridHeaderEntry.Author author = (ClipsGridHeaderEntry.Author) obj3;
                if (((Boolean) obj).booleanValue()) {
                    izsVar.invoke(ClipsGridHeaderEntry.Author.a(author, !author.d));
                } else {
                    izsVar.invoke(author);
                }
                return s3q0.a;
            case 8:
                ubg.a aVar = (ubg.a) obj2;
                xbg xbgVar = ((ubg) obj3).r;
                if (xbgVar != null) {
                    aVar.a(xbgVar.b);
                }
                return s3q0.a;
            case 9:
                ((mdg) obj3).z7((Throwable) obj);
                if (fkq0.c((UserId) obj2)) {
                    npu.a().a = null;
                }
                return s3q0.a;
            case 10:
                ((hv10) obj).o((ur4) obj3, (Throwable) obj2);
                return s3q0.a;
            case 11:
                Context context = (Context) obj3;
                String str2 = ((icp) obj2).i;
                int i7 = icp.a.$EnumSwitchMapping$0[((LinkAction) obj).ordinal()];
                if (i7 == 1) {
                    g2v.c().k().a(context, str2);
                } else if (i7 == 2) {
                    ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
                    if (clipboardManager != null) {
                        clipboardManager.setText(str2);
                    }
                    cvk.u(R.string.link_copied, false);
                }
                return s3q0.a;
            case 12:
                izs izsVar2 = (izs) obj2;
                int intValue = ((Integer) obj).intValue();
                us2.d dVar2 = (us2.d) j5g.a0(((us2) obj3).b(intValue, intValue));
                if (dVar2 != null && (str = (String) dVar2.a) != null) {
                    izsVar2.invoke(str);
                }
                return s3q0.a;
            case 13:
                wk50.a aVar2 = (wk50.a) obj2;
                Pair pair = (Pair) obj;
                SdkVideoFile sdkVideoFile = (SdkVideoFile) pair.d();
                List singletonList = Collections.singletonList(myc.d(((f0r.r) obj3).e, sdkVideoFile, (wp50) pair.g(), 4));
                PaginationKey.LoadedFull loadedFull = PaginationKey.LoadedFull.b;
                aVar2.b(new c2r.d.c(singletonList, loadedFull, loadedFull, s4r.a.a, ubx.b.a, null, null));
                aVar2.a(new qvq.q(sdkVideoFile));
                return s3q0.a;
            case 14:
                t1r.g((wk50.a) obj3, (qvq.i) obj2, (qih0) obj, true);
                return s3q0.a;
            case 15:
                HorizontalPagerView.a aVar3 = (HorizontalPagerView.a) obj3;
                bwj bwjVar = (bwj) ((izs) obj2).invoke((dwj) obj);
                if (bwjVar == null) {
                    return null;
                }
                aVar3.c.add(bwjVar);
                return bwjVar;
            case 16:
                whz whzVar = (whz) obj3;
                whzVar.getView().postDelayed(new df6(0, whzVar, (VideoFile) obj2), 250L);
                return s3q0.a;
            case 17:
                zrz zrzVar = (zrz) obj3;
                String str3 = (String) obj2;
                zrz.a aVar4 = (zrz.a) obj;
                zrzVar.c();
                boolean z = aVar4.f;
                zrz.b bVar3 = aVar4.c;
                Data data = aVar4.a;
                zrz.b bVar4 = aVar4.b;
                if (z && (bVar4 instanceof zrz.b.C4195b)) {
                    size = ((zrz.b.C4195b) bVar4).a;
                } else {
                    if (bVar4 instanceof zrz.b.C4195b) {
                        size2 = ((frz) data).getSize();
                        i = ((zrz.b.C4195b) bVar4).a;
                    } else if (!(bVar3 instanceof zrz.b.C4195b) || aVar4.d) {
                        size = ((frz) data).getSize();
                    } else {
                        size2 = ((frz) data).getSize();
                        i = ((zrz.b.C4195b) bVar3).a;
                    }
                    size = size2 + i;
                }
                zrzVar.j.b(new gzs() { // from class: xsna.nrz
                    @Override // xsna.gzs
                    public final Object invoke() {
                        return lhg.a(size, "reset and load with limit ");
                    }
                });
                int i8 = zrzVar.i;
                if (size < i8) {
                    size = i8;
                }
                Object invoke = zrzVar.g.invoke();
                zrz.b.a aVar5 = zrz.b.a.a;
                return zrzVar.g(size, zrz.a.a(new zrz.a(invoke, aVar5, aVar5, true, false, false), (frz) data, null, null, aVar4.d, false, true, 22), str3 + " -> resetAndLoad");
            case 18:
                ((com.vk.search.params.impl.presentation.modal.location.mvi.model.b) obj).a.b(new w7u((io.reactivex.rxjava3.core.r) obj2, 8), (mnk) obj3);
                return s3q0.a;
            case 19:
                ((vb20) obj3).a.a1((kb20) obj2);
                return s3q0.a;
            case 20:
                ((kz20) obj3).i.bk(new rji0((VideoTechBugreportData) obj2, (String) obj));
                return s3q0.a;
            case 21:
                ((v340) obj3).w.c((com.vk.superapp.multiaccount.api.f) obj2);
                return s3q0.a;
            case 22:
                MusicTrack musicTrack = (MusicTrack) obj2;
                k230 k230Var = ((d650) obj3).h;
                if (k230Var != null) {
                    k230Var.a(musicTrack);
                }
                return s3q0.a;
            case 23:
                li70 li70Var = (li70) obj3;
                Context context2 = (Context) obj2;
                View view = (View) obj;
                c970 c970Var = li70Var.N;
                if (c970Var != null) {
                    NotificationItem notificationItem = li70Var.c;
                    c970Var.b(context2, notificationItem != null ? notificationItem.j : null, notificationItem, view);
                }
                li70Var.d("additional_item");
                return s3q0.a;
            case 24:
                o890 o890Var = (o890) obj3;
                tra0 tra0Var = (tra0) obj2;
                tra0.a aVar6 = (tra0.a) obj;
                if (o890Var.t) {
                    tra0.a.x(aVar6, tra0Var, aVar6.r0(o890Var.p), aVar6.r0(o890Var.q));
                } else {
                    aVar6.q(tra0Var, aVar6.r0(o890Var.p), aVar6.r0(o890Var.q), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                return s3q0.a;
            case 25:
                PhotoEditorView photoEditorView = (PhotoEditorView) obj3;
                int i9 = PhotoEditorView.c0;
                photoEditorView.A((f5p) obj2);
                photoEditorView.performHapticFeedback(1);
                return s3q0.a;
            case 26:
                String str4 = (String) obj3;
                com.vk.attachpicker.stat.data.b bVar5 = (com.vk.attachpicker.stat.data.b) obj2;
                hyg0 hyg0Var = (hyg0) obj;
                qyg0 V0 = hyg0Var.V0("SELECT * FROM photo_params WHERE media_key = ?");
                try {
                    V0.D3(1, str4);
                    int k = egi.k(V0, "id");
                    int k2 = egi.k(V0, "media_key");
                    int k3 = egi.k(V0, "create_entry_point");
                    int k4 = egi.k(V0, "isCropped");
                    int k5 = egi.k(V0, "isRotated");
                    int k6 = egi.k(V0, "isZoomed");
                    int k7 = egi.k(V0, "hasGraffity");
                    int k8 = egi.k(V0, "hasSticker");
                    int k9 = egi.k(V0, "hasText");
                    int k10 = egi.k(V0, "zoomValue");
                    int k11 = egi.k(V0, "rotation");
                    int k12 = egi.k(V0, "isAutocorrected");
                    int k13 = egi.k(V0, "autocorrectionValue");
                    int k14 = egi.k(V0, "hasFilter");
                    int k15 = egi.k(V0, "filter");
                    int k16 = egi.k(V0, "filterValue");
                    int k17 = egi.k(V0, "ratio");
                    int k18 = egi.k(V0, "height");
                    int k19 = egi.k(V0, "width");
                    int k20 = egi.k(V0, "collageGrid");
                    int k21 = egi.k(V0, "collageBorderWidth");
                    int k22 = egi.k(V0, "collageCornerRadius");
                    int k23 = egi.k(V0, "collageBorderColor");
                    int k24 = egi.k(V0, "colorGradingParams");
                    int k25 = egi.k(V0, "colorGradingValues");
                    int k26 = egi.k(V0, "isUpgraded");
                    x500<List<GraffityParamsEntity>> x500Var = new x500<>(0, 1, null);
                    x500<List<TextParamsEntity>> x500Var2 = new x500<>(0, 1, null);
                    x500<List<StickerParamsEntity>> x500Var3 = new x500<>(0, 1, null);
                    while (V0.step()) {
                        Long valueOf = V0.isNull(k) ? null : Long.valueOf(V0.getLong(k));
                        if (valueOf != null && !x500Var.containsKey(valueOf.longValue())) {
                            x500Var.put(valueOf.longValue(), new ArrayList());
                        }
                        Long valueOf2 = V0.isNull(k) ? null : Long.valueOf(V0.getLong(k));
                        if (valueOf2 != null && !x500Var2.containsKey(valueOf2.longValue())) {
                            x500Var2.put(valueOf2.longValue(), new ArrayList());
                        }
                        Long valueOf3 = V0.isNull(k) ? null : Long.valueOf(V0.getLong(k));
                        if (valueOf3 != null && !x500Var3.containsKey(valueOf3.longValue())) {
                            x500Var3.put(valueOf3.longValue(), new ArrayList());
                        }
                    }
                    V0.reset();
                    bVar5.h(hyg0Var, x500Var);
                    bVar5.j(hyg0Var, x500Var2);
                    bVar5.i(hyg0Var, x500Var3);
                    if (V0.step()) {
                        Integer valueOf4 = V0.isNull(k) ? null : Integer.valueOf((int) V0.getLong(k));
                        String l2 = V0.l2(k2);
                        String l22 = V0.l2(k3);
                        boolean z2 = ((int) V0.getLong(k4)) != 0;
                        boolean z3 = ((int) V0.getLong(k5)) != 0;
                        boolean z4 = ((int) V0.getLong(k6)) != 0;
                        boolean z5 = ((int) V0.getLong(k7)) != 0;
                        boolean z6 = ((int) V0.getLong(k8)) != 0;
                        boolean z7 = ((int) V0.getLong(k9)) != 0;
                        Integer valueOf5 = V0.isNull(k10) ? null : Integer.valueOf((int) V0.getLong(k10));
                        Integer valueOf6 = V0.isNull(k11) ? null : Integer.valueOf((int) V0.getLong(k11));
                        boolean z8 = ((int) V0.getLong(k12)) != 0;
                        Integer valueOf7 = V0.isNull(k13) ? null : Integer.valueOf((int) V0.getLong(k13));
                        boolean z9 = ((int) V0.getLong(k14)) != 0;
                        String l23 = V0.isNull(k15) ? null : V0.l2(k15);
                        Integer valueOf8 = V0.isNull(k16) ? null : Integer.valueOf((int) V0.getLong(k16));
                        PhotoParamsEntity.Ratio f = V0.isNull(k17) ? null : com.vk.attachpicker.stat.data.b.f(V0.l2(k17));
                        int i10 = (int) V0.getLong(k18);
                        int i11 = (int) V0.getLong(k19);
                        String l24 = V0.isNull(k20) ? null : V0.l2(k20);
                        Integer valueOf9 = V0.isNull(k21) ? null : Integer.valueOf((int) V0.getLong(k21));
                        Integer valueOf10 = V0.isNull(k22) ? null : Integer.valueOf((int) V0.getLong(k22));
                        String l25 = V0.isNull(k23) ? null : V0.l2(k23);
                        String l26 = V0.isNull(k24) ? null : V0.l2(k24);
                        if (l26 == null) {
                            arrayList2 = null;
                        } else {
                            try {
                                arrayList = f370.O(new JSONArray(l26));
                            } catch (JSONException unused) {
                                arrayList = null;
                            }
                            arrayList2 = arrayList;
                        }
                        String l27 = V0.isNull(k25) ? null : V0.l2(k25);
                        if (l27 == null) {
                            arrayList4 = null;
                        } else {
                            try {
                                JSONArray jSONArray = new JSONArray(l27);
                                arrayList3 = new ArrayList(jSONArray.length());
                                int length = jSONArray.length();
                                for (int i12 = 0; i12 < length; i12++) {
                                    arrayList3.add(Float.valueOf((float) jSONArray.getDouble(i12)));
                                }
                            } catch (JSONException unused2) {
                                arrayList3 = null;
                            }
                            arrayList4 = arrayList3;
                        }
                        PhotoParamsEntity photoParamsEntity = new PhotoParamsEntity(valueOf4, l2, l22, z2, z3, z4, z5, z6, z7, valueOf5, valueOf6, z8, valueOf7, z9, l23, valueOf8, f, i10, i11, l24, valueOf9, valueOf10, l25, arrayList2, arrayList4, ((int) V0.getLong(k26)) != 0);
                        Long valueOf11 = V0.isNull(k) ? null : Long.valueOf(V0.getLong(k));
                        if (valueOf11 != null) {
                            List<GraffityParamsEntity> list = x500Var.get(valueOf11.longValue());
                            if (list == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            arrayList5 = list;
                        } else {
                            arrayList5 = new ArrayList<>();
                        }
                        Long valueOf12 = V0.isNull(k) ? null : Long.valueOf(V0.getLong(k));
                        if (valueOf12 != null) {
                            List<TextParamsEntity> list2 = x500Var2.get(valueOf12.longValue());
                            if (list2 == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            arrayList6 = list2;
                        } else {
                            arrayList6 = new ArrayList<>();
                        }
                        Long valueOf13 = V0.isNull(k) ? null : Long.valueOf(V0.getLong(k));
                        if (valueOf13 != null) {
                            List<StickerParamsEntity> list3 = x500Var3.get(valueOf13.longValue());
                            if (list3 == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            arrayList7 = list3;
                        } else {
                            arrayList7 = new ArrayList<>();
                        }
                        oaa0Var = new oaa0(photoParamsEntity, arrayList5, arrayList6, arrayList7);
                    } else {
                        oaa0Var = null;
                    }
                    V0.close();
                    return oaa0Var;
                } finally {
                    V0.close();
                }
            case 27:
                ((inf0) obj3).d((String) obj2, tnf0.i);
                return s3q0.a;
            case 28:
                nkd nkdVar = (nkd) obj3;
                ikd ikdVar = (ikd) obj2;
                Throwable th3 = (Throwable) obj;
                if (nkdVar != null) {
                    ClipsBottomSheetSideEffectOptions clipsBottomSheetSideEffectOptions = ClipsBottomSheetSideEffectOptions.REMOVE_FROM_OWNER;
                    SdkVideoFile sdkVideoFile2 = ikdVar.a;
                    nkdVar.b(clipsBottomSheetSideEffectOptions, th3);
                }
                return s3q0.a;
            default:
                pph0.a aVar7 = (pph0.a) obj2;
                jwk jwkVar = (jwk) obj;
                ((pph0) obj3).getClass();
                String str5 = aVar7.a;
                ArrayList arrayList8 = jwkVar.b;
                return new nph0.d(str5, arrayList8, jwkVar.a <= arrayList8.size() + aVar7.b || jwkVar.b.isEmpty());
        }
    }

    public /* synthetic */ az2(int i, Object obj, izs izsVar) {
        this.b = i;
        this.d = izsVar;
        this.c = obj;
    }

    public /* synthetic */ az2(CallParticipantsFragment callParticipantsFragment, v19 v19Var, r89 r89Var, m99 m99Var) {
        this.b = 2;
        this.c = v19Var;
        this.d = m99Var;
    }

    public /* synthetic */ az2(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj2;
        this.d = obj3;
    }
}
