package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.music.LegalNotice;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.podcast.PodcastInfo;
import com.vk.dto.stickers.bonus.StickersBonusHistoryRecord;
import com.vk.dto.stickers.bonus.StickersBonusHistoryRecords;
import com.vk.lists.ListDataSet;
import com.vk.music.podcast.impl.ui.page.PodcastFragment;
import com.vk.toggle.features.MusicFeatures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.cl7;
import xsna.ykb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class al7 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ al7(com.vk.lists.c cVar, boolean z, cl7 cl7Var) {
        this.d = cVar;
        this.c = z;
        this.e = cl7Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Hint p;
        String str;
        MusicTrack musicTrack;
        switch (this.b) {
            case 0:
                com.vk.lists.c cVar = (com.vk.lists.c) this.d;
                cl7.a aVar = ((cl7) this.e).c;
                StickersBonusHistoryRecords stickersBonusHistoryRecords = (StickersBonusHistoryRecords) obj;
                String str2 = stickersBonusHistoryRecords.c;
                List<StickersBonusHistoryRecord> list = stickersBonusHistoryRecords.b;
                cVar.s(str2);
                if (this.c) {
                    aVar.J0(list);
                } else {
                    aVar.getClass();
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(aVar.h);
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new fl7((StickersBonusHistoryRecord) it.next()));
                    }
                    aVar.setItems(arrayList);
                }
                break;
            case 1:
                mtk0 mtk0Var = (mtk0) this.d;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.e;
                float intBitsToFloat = Float.intBitsToFloat((int) (fdi.E((xlb0) obj, false) >> 32));
                wzs wzsVar = (wzs) mtk0Var.getValue();
                Boolean valueOf = Boolean.valueOf(ref$BooleanRef.element);
                if (this.c) {
                    intBitsToFloat = -intBitsToFloat;
                }
                wzsVar.invoke(valueOf, Float.valueOf(intBitsToFloat));
                break;
            default:
                sib0 sib0Var = (sib0) this.e;
                com.vk.lists.c cVar2 = (com.vk.lists.c) this.d;
                ykb0.a aVar2 = (ykb0.a) obj;
                w950 w950Var = sib0Var.d;
                ListDataSet<zif0> listDataSet = sib0Var.n;
                PodcastFragment podcastFragment = sib0Var.b;
                w950.p(w950Var, null, null, null, 7);
                PodcastInfo podcastInfo = aVar2.a;
                VKList<MusicTrack> vKList = aVar2.b;
                VKList<MusicTrack> vKList2 = aVar2.c;
                if (podcastInfo != null) {
                    boolean z = podcastInfo.l;
                    sib0Var.g = !z;
                    sib0Var.i = z;
                    sib0Var.h = podcastInfo.m;
                    sib0Var.k = podcastInfo;
                    mzp0 mzp0Var = sib0Var.f;
                    if (mzp0Var != null) {
                        mzp0Var.c(false);
                    }
                    fib0 fib0Var = podcastFragment.g0;
                    if (fib0Var != null) {
                        fib0Var.a(podcastInfo);
                    }
                    mzp0 mzp0Var2 = podcastFragment.J;
                    if (mzp0Var2 != null) {
                        mzp0Var2.d(podcastFragment.getView());
                    }
                }
                ArrayList<MusicTrack> arrayList2 = sib0Var.m;
                boolean z2 = this.c;
                if (z2) {
                    arrayList2.clear();
                    if (podcastInfo != null && (musicTrack = podcastInfo.d) != null) {
                        arrayList2.add(musicTrack);
                    }
                    if (vKList != null) {
                        arrayList2.addAll(vKList);
                    }
                }
                arrayList2.addAll(vKList2);
                ArrayList arrayList3 = new ArrayList();
                if (z2) {
                    if (podcastInfo != null) {
                        MusicTrack musicTrack2 = podcastInfo.d;
                        ArrayList arrayList4 = new ArrayList(4);
                        if (podcastFragment.jo()) {
                            arrayList4.add(new eib0(podcastInfo, 6));
                        }
                        ej90 ej90Var = sib0Var.j;
                        if (ej90Var != null) {
                            arrayList4.add(new eib0(ej90Var, 0));
                        }
                        LegalNotice legalNotice = podcastInfo.o;
                        if (musicTrack2 != null) {
                            arrayList4.add(new eib0(podcastInfo, 1));
                        }
                        if (myc0.f(legalNotice != null ? legalNotice.b : null)) {
                            if (myc0.f(legalNotice != null ? legalNotice.c : null)) {
                                arrayList4.add(new eib0(legalNotice, 8));
                            }
                        }
                        arrayList3.addAll(arrayList4);
                        if ((musicTrack2 != null || ((str = podcastInfo.g) != null && str.length() != 0)) && ((!vKList2.isEmpty() || (vKList != null && !vKList.isEmpty())) && !pla.e().b().a(HintId.INFO_PODCASTS_CATALOG_HINT.getId()))) {
                            arrayList3.add(new eib0(s3q0.a, 7));
                        }
                        l7v b = pla.e().b();
                        HintId hintId = HintId.INFO_PODCASTS_CATALOG_HINT;
                        if (b.a(hintId.getId()) && (p = pla.e().b().p(hintId.getId())) != null) {
                            arrayList3.add(new eib0(p, 4));
                        }
                    }
                    if (vKList != null && !vKList.isEmpty()) {
                        arrayList3.add(new eib0(Boolean.valueOf(vKList.i() > vKList.size()), 2));
                        arrayList3.addAll(sib0.b(vKList));
                        if (!vKList2.isEmpty()) {
                            arrayList3.add(new eib0(s3q0.a, 7));
                        }
                    }
                }
                if (vKList2.isEmpty()) {
                    cVar2.r(false);
                } else {
                    if (z2) {
                        arrayList3.add(new eib0(s3q0.a, 3));
                    }
                    arrayList3.addAll(sib0.b(vKList2));
                    if (MusicFeatures.AUDIO_PODCAST_PAGINATION_FIX.h()) {
                        cVar2.q(vKList2.size() + cVar2.i());
                    } else {
                        cVar2.l(vKList2.i());
                    }
                }
                if (z2) {
                    listDataSet.setItems(arrayList3);
                } else {
                    listDataSet.n0(arrayList3);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ al7(sib0 sib0Var, boolean z, com.vk.lists.c cVar) {
        this.e = sib0Var;
        this.c = z;
        this.d = cVar;
    }

    public /* synthetic */ al7(mtk0 mtk0Var, Ref$BooleanRef ref$BooleanRef, boolean z) {
        this.d = mtk0Var;
        this.e = ref$BooleanRef;
        this.c = z;
    }
}
